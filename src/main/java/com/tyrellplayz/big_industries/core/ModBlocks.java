package com.tyrellplayz.big_industries.core;

import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
    public static final Block COPPER_BLOCK = register(BlockNames.COPPER_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));
    public static final Block COPPER_ORE = register(BlockNames.COPPER_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)));
    // Lead
     public static final Block LEAD_BLOCK = register(BlockNames.LEAD_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));
    public static final Block LEAD_ORE = register(BlockNames.LEAD_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)));
    // Tin
    public static final Block TIN_BLOCK = register(BlockNames.TIN_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));
    public static final Block TIN_ORE = register(BlockNames.TIN_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)));
    // Silver
    public static final Block SILVER_BLOCK = register(BlockNames.SILVER_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));
    public static final Block SILVER_ORE = register(BlockNames.SILVER_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)));
    // Nickel
    public static final Block NICKEL_BLOCK = register(BlockNames.NICKEL_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));
    public static final Block NICKEL_ORE = register(BlockNames.NICKEL_ORE, new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance(3.0F)));
    // Steel
    public static final Block STEEL_BLOCK = register(BlockNames.STEEL_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));
    // Bronze
    public static final Block BRONZE_BLOCK = register(BlockNames.BRONZE_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));
    // Invar
    public static final Block INVAR_BLOCK = register(BlockNames.INVAR_BLOCK, new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL)));

    private static Block register(String name, Block block){
        return register(name,block,new Item.Properties());
    }

    private static Block register(String name, Block block, Item.Properties properties){
        return register(name,block,new BlockItem(block, properties.group(BigIndustries.BLOCKS_GROUP)));
    }

    private static Block register(String name, Block block, BlockItem itemBlock){
        block.setRegistryName(name);
        BLOCKS.add(block);
        if(block.getRegistryName() != null){
            itemBlock.setRegistryName(name);
            ITEMS.add(itemBlock);
        }
        return block;
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        System.out.println("Registering blocks");
        BLOCKS.forEach(block -> event.getRegistry().register(block));
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        ITEMS.forEach(item -> event.getRegistry().register(item));
    }

}
