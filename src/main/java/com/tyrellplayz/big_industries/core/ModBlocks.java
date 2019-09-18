package com.tyrellplayz.big_industries.core;

import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.block.EnergyConduitBlock;
import com.tyrellplayz.big_industries.util.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = BigIndustries.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();

    // Copper
    public static final Block COPPER_BLOCK = register(BlockNames.COPPER_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)),BigIndustries.BLOCKS_GROUP);
    public static final Block COPPER_ORE = register(BlockNames.COPPER_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)),BigIndustries.BLOCKS_GROUP);
    // Lead
     public static final Block LEAD_BLOCK = register(BlockNames.LEAD_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)),BigIndustries.BLOCKS_GROUP);
    public static final Block LEAD_ORE = register(BlockNames.LEAD_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)),BigIndustries.BLOCKS_GROUP);
    // Tin
    public static final Block TIN_BLOCK = register(BlockNames.TIN_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)),BigIndustries.BLOCKS_GROUP);
    public static final Block TIN_ORE = register(BlockNames.TIN_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)),BigIndustries.BLOCKS_GROUP);
    // Silver
    public static final Block SILVER_BLOCK = register(BlockNames.SILVER_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));
    public static final Block SILVER_ORE = register(BlockNames.SILVER_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)),BigIndustries.BLOCKS_GROUP);
    // Nickel
    public static final Block NICKEL_BLOCK = register(BlockNames.NICKEL_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)),BigIndustries.BLOCKS_GROUP);
    public static final Block NICKEL_ORE = register(BlockNames.NICKEL_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)),BigIndustries.BLOCKS_GROUP);
    // Steel
    public static final Block STEEL_BLOCK = register(BlockNames.STEEL_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)),BigIndustries.BLOCKS_GROUP);
    // Bronze
    public static final Block BRONZE_BLOCK = register(BlockNames.BRONZE_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)),BigIndustries.BLOCKS_GROUP);
    // Invar
    public static final Block INVAR_BLOCK = register(BlockNames.INVAR_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)),BigIndustries.BLOCKS_GROUP);

    public static final Block ENERGY_CONDUIT = register(BlockNames.ENERGY_CONDUIT, new EnergyConduitBlock(Block.Properties.create(Material.IRON).sound(SoundType.METAL)),BigIndustries.BLOCKS_GROUP);

    private static Block register(String id, Block block){
        return register(id,block,new Item.Properties());
    }

    private static Block register(String id, Block block, ItemGroup group){
        return register(id,block,new Item.Properties().group(group));
    }

    private static Block register(String id, Block block, Item.Properties properties){
        return register(id,block,new BlockItem(block, properties));
    }

    private static Block register(String id, Block block, BlockItem itemBlock){
        block.setRegistryName(id);
        BLOCKS.add(block);
        if(block.getRegistryName() != null){
            itemBlock.setRegistryName(id);
            ITEMS.add(itemBlock);
        }
        return block;
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        BLOCKS.forEach(block -> event.getRegistry().register(block));
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        ITEMS.forEach(item -> event.getRegistry().register(item));
    }

}
