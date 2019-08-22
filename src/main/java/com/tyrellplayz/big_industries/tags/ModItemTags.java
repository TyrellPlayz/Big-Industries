package com.tyrellplayz.big_industries.tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ModItemTags {

    public static final Tag<Item> BLOCK_COPPER = makeWrapperTag("forge:block/copper");
    public static final Tag<Item> BLOCK_LEAD = makeWrapperTag("forge:block/lead");
    public static final Tag<Item> BLOCK_TIN = makeWrapperTag("forge:block/tin");
    public static final Tag<Item> BLOCK_SILVER = makeWrapperTag("forge:block/silver");
    public static final Tag<Item> BLOCK_NICKEL = makeWrapperTag("forge:block/nickel");
    public static final Tag<Item> BLOCK_STEEL = makeWrapperTag("forge:block/steel");
    public static final Tag<Item> BLOCK_BRONZE = makeWrapperTag("forge:block/bronze");
    public static final Tag<Item> BLOCK_INVAR = makeWrapperTag("forge:block/invar");

    public static final Tag<Item> ORE_COPPER = makeWrapperTag("forge:ore/copper");
    public static final Tag<Item> ORE_LEAD = makeWrapperTag("forge:ore/lead");
    public static final Tag<Item> ORE_TIN = makeWrapperTag("forge:ore/tin");
    public static final Tag<Item> ORE_SILVER = makeWrapperTag("forge:ore/silver");
    public static final Tag<Item> ORE_NICKEL = makeWrapperTag("forge:ore/nickel");

    public static final Tag<Item> INGOT_COPPER = makeWrapperTag("forge:ingot/copper");
    public static final Tag<Item> INGOT_LEAD = makeWrapperTag("forge:ingot/lead");
    public static final Tag<Item> INGOT_TIN = makeWrapperTag("forge:ingot/tin");
    public static final Tag<Item> INGOT_SILVER = makeWrapperTag("forge:ingot/silver");
    public static final Tag<Item> INGOT_NICKEL = makeWrapperTag("forge:ingot/nickel");
    public static final Tag<Item> INGOT_STEEL = makeWrapperTag("forge:ingot/steel");
    public static final Tag<Item> INGOT_BRONZE = makeWrapperTag("forge:ingot/bronze");
    public static final Tag<Item> INGOT_INVAR = makeWrapperTag("forge:ingot/invar");

    public static final Tag<Item> NUGGET_COPPER = makeWrapperTag("forge:nugget/copper");
    public static final Tag<Item> NUGGET_LEAD = makeWrapperTag("forge:nugget/lead");
    public static final Tag<Item> NUGGET_TIN = makeWrapperTag("forge:nugget/tin");
    public static final Tag<Item> NUGGET_SILVER = makeWrapperTag("forge:nugget/silver");
    public static final Tag<Item> NUGGET_NICKEL = makeWrapperTag("forge:nugget/nickel");
    public static final Tag<Item> NUGGET_STEEL = makeWrapperTag("forge:nugget/steel");
    public static final Tag<Item> NUGGET_BRONZE = makeWrapperTag("forge:nugget/bronze");
    public static final Tag<Item> NUGGET_INVAR = makeWrapperTag("forge:nugget/invar");

    public static final Tag<Item> CRUSHED_COPPER = makeWrapperTag("forge:crushed/copper");
    public static final Tag<Item> CRUSHED_LEAD = makeWrapperTag("forge:crushed/lead");
    public static final Tag<Item> CRUSHED_TIN = makeWrapperTag("forge:crushed/tin");
    public static final Tag<Item> CRUSHED_SILVER = makeWrapperTag("forge:crushed/silver");
    public static final Tag<Item> CRUSHED_NICKEL = makeWrapperTag("forge:crushed/nickel");
    public static final Tag<Item> CRUSHED_STEEL = makeWrapperTag("forge:crushed/steel");
    public static final Tag<Item> CRUSHED_BRONZE = makeWrapperTag("forge:crushed/bronze");
    public static final Tag<Item> CRUSHED_INVAR = makeWrapperTag("forge:crushed/invar");

    public static final Tag<Item> CRUSHED_COAL = makeWrapperTag("forge:crushed/coal");
    public static final Tag<Item> CRUSHED_IRON = makeWrapperTag("forge:crushed/iron");
    public static final Tag<Item> CRUSHED_GOLD = makeWrapperTag("forge:crushed/gold");
    public static final Tag<Item> CRUSHED_DIAMOND = makeWrapperTag("forge:crushed/diamond");
    public static final Tag<Item> CRUSHED_EMERALD = makeWrapperTag("forge:crushed/emerald");
    public static final Tag<Item> CRUSHED_OBSIDIAN = makeWrapperTag("forge:crushed/obsidian");

    private static Tag<Item> makeWrapperTag(String location) {
        return new ItemTags.Wrapper(new ResourceLocation(location));
    }

}
