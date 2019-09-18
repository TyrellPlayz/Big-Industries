package com.tyrellplayz.big_industries.block;

import com.tyrellplayz.big_industries.util.helpers.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class EnergyConduitBlock extends BaseWaterloggedBlock {

    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final BooleanProperty DOWN = BlockStateProperties.DOWN;

    public EnergyConduitBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState()
                .with(NORTH,false)
                .with(EAST,false)
                .with(SOUTH,false)
                .with(WEST,false)
                .with(UP,false)
                .with(DOWN,false)
                .with(WATERLOGGED,false));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        List<VoxelShape> shapes = new ArrayList<>();
        shapes.add(VoxelShapeHelper.create(5,5,5,5,5,5));

        VoxelShape side = VoxelShapeHelper.create(0,6,6,6,6,6);

        if(state.get(NORTH)) {
            shapes.add(side);
        }
        if(state.get(EAST)) {
            shapes.add(VoxelShapeHelper.rotate(side,Direction.EAST));
        }
        if(state.get(SOUTH)) {
            shapes.add(VoxelShapeHelper.rotate(side,Direction.SOUTH));
        }
        if(state.get(WEST)) {
            shapes.add(VoxelShapeHelper.rotate(side,Direction.WEST));
        }
        if(state.get(UP)) {
            shapes.add(VoxelShapeHelper.create(6,6,6,6,0,6));
        }
        if(state.get(DOWN)) {
            shapes.add(VoxelShapeHelper.create(6,6,6,6,6,0));
        }

        return VoxelShapeHelper.combineAll(shapes);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        IFluidState fluidState = context.getWorld().getFluidState(context.getPos());

        boolean north = world.getBlockState(blockpos.north()).getBlock() == this;
        boolean east = world.getBlockState(blockpos.east()).getBlock() == this;
        boolean south = world.getBlockState(blockpos.south()).getBlock() == this;
        boolean west = world.getBlockState(blockpos.west()).getBlock() == this;
        boolean up = world.getBlockState(blockpos.up()).getBlock() == this;
        boolean down = world.getBlockState(blockpos.down()).getBlock() == this;

        return super.getStateForPlacement(context).with(NORTH,north).with(EAST,east).with(SOUTH,south).with(WEST,west).with(UP,up).with(DOWN,down).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        boolean north = worldIn.getBlockState(currentPos.north()).getBlock() == this;
        boolean east = worldIn.getBlockState(currentPos.east()).getBlock() == this;
        boolean south = worldIn.getBlockState(currentPos.south()).getBlock() == this;
        boolean west = worldIn.getBlockState(currentPos.west()).getBlock() == this;
        boolean up = worldIn.getBlockState(currentPos.up()).getBlock() == this;
        boolean down = worldIn.getBlockState(currentPos.down()).getBlock() == this;

        return stateIn.with(NORTH,north).with(EAST,east).with(SOUTH,south).with(WEST,west).with(UP,up).with(DOWN,down);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(NORTH,EAST,SOUTH,WEST,UP,DOWN);
    }
}
