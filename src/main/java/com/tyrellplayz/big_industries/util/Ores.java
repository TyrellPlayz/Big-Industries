package com.tyrellplayz.big_industries.util;

import com.tyrellplayz.big_industries.core.ModBlocks;
import net.minecraft.block.Block;

public enum Ores {
    COPPER(ModBlocks.COPPER_ORE,8,8,40,75),
    LEAD(ModBlocks.LEAD_ORE,8,4,10,35),
    TIN(ModBlocks.TIN_ORE,8,7,20,55),
    SILVER(ModBlocks.SILVER_ORE,8,4,5,30),
    NICKEL(ModBlocks.NICKEL_ORE,8,2,5,20);

    public final Block block;
    public final int veinSize;
    public final int veinsPerChunk;
    public final int minY;
    public final int maxY;

    Ores(Block block, int veinSize, int veinsPerChunk, int minY, int maxY) {
        this.block = block;
        this.veinSize = veinSize;
        this.veinsPerChunk = veinsPerChunk;
        this.minY = minY;
        this.maxY = maxY;
    }

}
