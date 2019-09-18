package com.tyrellplayz.big_industries.util.helpers;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.Collection;

public class VoxelShapeHelper {

    private VoxelShapeHelper(){}

    /**
     * Creates a new {@link VoxelShape} for a block.
     * @param pixelsFromNorth Amount of pixels from the North.
     * @param pixelsFromEast Amount of pixels from the East.
     * @param pixelsFromSouth Amount of pixels from the South.
     * @param pixelsFromWest Amount of pixels from the West.
     * @param pixelsFromUp Amount of pixels from the Up.
     * @param pixelsFromDown Amount of pixels from the Down.
     * @return The VoxelShape.
     */
    public static VoxelShape create(double pixelsFromNorth, double pixelsFromEast, double pixelsFromSouth, double pixelsFromWest, double pixelsFromUp, double pixelsFromDown){
        return Block.makeCuboidShape(pixelsFromWest,pixelsFromDown,pixelsFromNorth,16.0-pixelsFromEast,16.0-pixelsFromUp,16.0-pixelsFromSouth);
    }

    public static VoxelShape create(double pixelsFromNorth, double pixelsFromEast, double pixelsFromSouth, double pixelsFromWest, double pixelsFromUp, double pixelsFromDown, Direction direction){
        return rotate(create(pixelsFromNorth,pixelsFromEast,pixelsFromSouth,pixelsFromWest,pixelsFromUp,pixelsFromDown),direction);
    }

    /**
     * Combines all VoxelShapes into one {@link VoxelShape}.
     * @param shapes List of the VoxelHapes to combine.
     * @return The VoxelShape.
     */
    public static VoxelShape combineAll(Collection<VoxelShape> shapes) {
        VoxelShape result = VoxelShapes.empty();
        for(VoxelShape shape : shapes) result = VoxelShapes.combine(result, shape, IBooleanFunction.OR);
        return result.simplify();
    }

    public static VoxelShape combineAll(VoxelShape... shapes) {
        VoxelShape result = VoxelShapes.empty();
        for(VoxelShape shape : shapes) result = VoxelShapes.combine(result, shape, IBooleanFunction.OR);
        return result.simplify();
    }

    public static VoxelShape[] getRotatedVoxelShapes(VoxelShape source) {
        VoxelShape shapeNorth = rotate(source, Direction.NORTH);
        VoxelShape shapeEast = rotate(source, Direction.EAST);
        VoxelShape shapeSouth = rotate(source, Direction.SOUTH);
        VoxelShape shapeWest = rotate(source, Direction.WEST);
        return new VoxelShape[] { shapeSouth, shapeWest, shapeNorth, shapeEast };
    }

    /**
     * Rotates a VoxelShape based on Direction.NORTH.
     * @param source VoxelShape to be rotated.
     * @param direction Direction to rotate the VoxelShape.
     * @return The rotated VoxelShape.
     */
    public static VoxelShape rotate(VoxelShape source, Direction direction) {
        double[] adjustedValues = adjustValues(direction, source.getStart(Direction.Axis.X), source.getStart(Direction.Axis.Z), source.getEnd(Direction.Axis.X), source.getEnd(Direction.Axis.Z));
        return VoxelShapes.create(adjustedValues[0], source.getStart(Direction.Axis.Y), adjustedValues[1], adjustedValues[2], source.getEnd(Direction.Axis.Y), adjustedValues[3]);
    }

    // x1 = west
    // z1 = north
    // x2 = east
    // z2 = south
    private static double[] adjustValues(Direction direction, double west, double north, double east, double south){
        switch(direction) {
            case EAST:
                double temp_north_1 = north;
                double temp_south_1 = south;
                // West to North
                north = west;
                // North to West
                west = 1D-temp_north_1;
                // East to South
                south = east;
                // South to East
                east = 1D-temp_south_1;
                break;
            case SOUTH:
                double temp_south_2 = south;
                double temp_west_2 = west;
                // North to South
                    south = 1D-north;
                // South to North
                    north = 1D-temp_south_2;
                // East to West
                    west = 1D-east;
                // West to East
                    east = 1D-temp_west_2;
                break;
            case WEST:
                double temp_north_3 = north;
                double temp_south_3 = south;
                // North to West
                north = 1D-west;
                // West to North
                west = temp_north_3;
                // East to South
                south = 1D-east;
                // South to East
                east = temp_south_3;
                break;
            default:
                break;
        }
        return new double[]{west, north, east, south};
    }

}
