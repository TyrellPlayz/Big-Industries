package com.tyrellplayz.big_industries.world.ore;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraftforge.registries.ForgeRegistryEntry;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ore extends ForgeRegistryEntry<Ore> {

    private final BlockState blockState;
    private final SpawnWorld spawnWorld;

    private final int veinSize;
    private final int veinsPerChunk;
    private final int minY;
    private final int maxY;

    public Ore(BlockState blockState, Ore.Properties properties) {
        this.blockState = blockState;
        this.spawnWorld = properties.spawnWorld;
        this.veinSize = properties.veinSize;
        this.veinsPerChunk = properties.veinsPerChunk;
        this.minY = properties.minY;
        this.maxY = properties.maxY;
    }

    @Deprecated
    public Ore(Block block, Ore.Properties properties) {
        this.blockState = block.getDefaultState();
        this.spawnWorld = properties.spawnWorld;
        this.veinSize = properties.veinSize;
        this.veinsPerChunk = properties.veinsPerChunk;
        this.minY = properties.minY;
        this.maxY = properties.maxY;
    }

    public BlockState getBlockState() {
        return blockState;
    }

    public SpawnWorld getSpawnWorld() {
        return spawnWorld;
    }

    public int getVeinSize() {
        return veinSize;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public static class Properties {

        private SpawnWorld spawnWorld;
        private int veinSize;
        private int veinsPerChunk;
        private int minY;
        private int maxY;

        public Properties(int veinSize, int veinsPerChunk, int minY, int maxY) {
            this.spawnWorld = SpawnWorld.OVERWORLD;
            this.veinSize = veinSize;
            this.veinsPerChunk = veinsPerChunk;
            this.minY = minY;
            this.maxY = maxY;
        }

        public Properties spawnWorld(SpawnWorld spawnWorld) {
            this.spawnWorld = spawnWorld;
            return this;
        }

    }

    public enum SpawnWorld {
        OVERWORLD("overworld"),
        //THEEND("the_end"),
        NETHER("nether");

        private static final Map<String, SpawnWorld> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(Ore.SpawnWorld::getName, (category) -> category));
        private final String name;

        SpawnWorld(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

}
