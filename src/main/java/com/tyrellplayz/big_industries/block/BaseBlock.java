package com.tyrellplayz.big_industries.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * The base class for block.
 * @author TyrellPlayz
 * @since 0.1.0
 */
public abstract class BaseBlock extends Block {

    public BaseBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getComparatorInputOverride(BlockState blockState, World worldIn, BlockPos pos) {
        return Container.calcRedstone(worldIn.getTileEntity(pos));
    }

    @Override
    public boolean hasComparatorInputOverride(BlockState state) {
        return this.hasTileEntity(state);
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        // Checks if the block is a completely different block.
        if(state.getBlock() != newState.getBlock()) {
            TileEntity tile = worldIn.getTileEntity(pos);
            // If the tile has an Inventory, drop all contained items.
            if(tile instanceof IInventory) {
                InventoryHelper.dropInventoryItems(worldIn,pos,(IInventory)tile);
                worldIn.updateComparatorOutputLevel(pos,this);
            }
        }
        super.onReplaced(state,worldIn,pos,newState,isMoving);
    }

    @Override
    public boolean eventReceived(BlockState state, World worldIn, BlockPos pos, int id, int param) {
        super.eventReceived(state, worldIn, pos, id, param);
        TileEntity tile = worldIn.getTileEntity(pos);
        return tile != null && tile.receiveClientEvent(id,param);
    }
}
