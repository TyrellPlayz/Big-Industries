package com.tyrellplayz.big_industries.tags;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ModBlockTags {

    public static final Tag<Block> COPPER = makeWrapperTag("forge:copper");
    public static final Tag<Block> LEAD = makeWrapperTag("forge:lead");
    public static final Tag<Block> TIN = makeWrapperTag("forge:tin");
    public static final Tag<Block> SILVER = makeWrapperTag("forge:silver");
    public static final Tag<Block> NICKEL = makeWrapperTag("forge:nickel");
    public static final Tag<Block> STEEL = makeWrapperTag("forge:steel");
    public static final Tag<Block> BRONZE = makeWrapperTag("forge:bronze");
    public static final Tag<Block> INVAR = makeWrapperTag("forge:invar");

    public static final Tag<Block> ORE_COPPER = makeWrapperTag("forge:ore/copper");
    public static final Tag<Block> ORE_LEAD = makeWrapperTag("forge:ore/lead");
    public static final Tag<Block> ORE_TIN = makeWrapperTag("forge:ore/tin");
    public static final Tag<Block> ORE_SILVER = makeWrapperTag("forge:ore/silver");
    public static final Tag<Block> ORE_NICKEL = makeWrapperTag("forge:ore/nickel");

    private static Tag<Block> makeWrapperTag(String id) {
        return new BlockTags.Wrapper(new ResourceLocation(id));
    }

}
