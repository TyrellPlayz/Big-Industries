package com.tyrellplayz.big_industries.world;

import com.tyrellplayz.big_industries.util.Ores;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

import java.util.ArrayList;
import java.util.List;

public class WorldGenerator {

    private static List<Biome> checkedBiomes = new ArrayList<>();

    public static void initFeatures() {
        for(Biome biome : Registry.BIOME) {
            addToBiome(biome);
        }
    }

    @SuppressWarnings("ConstantConditions")
    private static void addToBiome(Biome biome) {
        if(checkedBiomes.contains(biome)) return;
        checkedBiomes.add(biome);

        if(biome.getCategory() != Biome.Category.NETHER || biome.getCategory() != Biome.Category.THEEND) {
            addOre(biome,OreFeatureConfig.FillerBlockType.NATURAL_STONE, Ores.COPPER);
            addOre(biome,OreFeatureConfig.FillerBlockType.NATURAL_STONE, Ores.LEAD);
            addOre(biome,OreFeatureConfig.FillerBlockType.NATURAL_STONE, Ores.TIN);
            addOre(biome,OreFeatureConfig.FillerBlockType.NATURAL_STONE, Ores.SILVER);
            addOre(biome,OreFeatureConfig.FillerBlockType.NATURAL_STONE, Ores.NICKEL);
        }
    }

    private static void addOre(Biome biome, OreFeatureConfig.FillerBlockType canReplaceIn, Ores ore) {
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                new OreFeatureConfig(canReplaceIn, ore.block.getDefaultState(), ore.veinSize), Placement.COUNT_RANGE,
                new CountRangeConfig(ore.veinsPerChunk,ore.minY,ore.minY,ore.maxY)));
    }

}
