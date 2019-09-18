package com.tyrellplayz.big_industries.core;

import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.item.ItemBurnable;
import com.tyrellplayz.big_industries.util.ItemNames;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = BigIndustries.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    // Copper
    public static final Item COPPER_CRUSHED = register(ItemNames.COPPER_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item COPPER_INGOT = register(ItemNames.COPPER_INGOT,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item COPPER_NUGGET = register(ItemNames.COPPER_NUGGET,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item COPPER_GEAR = register(ItemNames.COPPER_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    // Lead
    public static final Item LEAD_CRUSHED = register(ItemNames.LEAD_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item LEAD_INGOT = register(ItemNames.LEAD_INGOT,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item LEAD_NUGGET = register(ItemNames.LEAD_NUGGET,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item LEAD_GEAR = register(ItemNames.LEAD_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    // Tin
    public static final Item TIN_CRUSHED = register(ItemNames.TIN_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item TIN_INGOT = register(ItemNames.TIN_INGOT,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item TIN_NUGGET = register(ItemNames.TIN_NUGGET,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item TIN_GEAR = register(ItemNames.TIN_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    // Silver
    public static final Item SILVER_CRUSHED = register(ItemNames.SILVER_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item SILVER_INGOT = register(ItemNames.SILVER_INGOT,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item SILVER_NUGGET = register(ItemNames.SILVER_NUGGET,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item SILVER_GEAR = register(ItemNames.SILVER_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    // Nickel
    public static final Item NICKEL_CRUSHED = register(ItemNames.NICKEL_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item NICKEL_INGOT = register(ItemNames.NICKEL_INGOT,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item NICKEL_NUGGET = register(ItemNames.NICKEL_NUGGET,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item NICKEL_GEAR = register(ItemNames.NICKEL_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    // Steel
    public static final Item STEEL_CRUSHED = register(ItemNames.STEEL_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item STEEL_INGOT = register(ItemNames.STEEL_INGOT,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item STEEL_NUGGET = register(ItemNames.STEEL_NUGGET,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item STEEL_GEAR = register(ItemNames.STEEL_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    // Bronze
    public static final Item BRONZE_CRUSHED = register(ItemNames.BRONZE_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item BRONZE_INGOT = register(ItemNames.BRONZE_INGOT,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item BRONZE_NUGGET = register(ItemNames.BRONZE_NUGGET,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item BRONZE_GEAR = register(ItemNames.BRONZE_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    // Invar
    public static final Item INVAR_CRUSHED = register(ItemNames.INVAR_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item INVAR_INGOT = register(ItemNames.INVAR_INGOT,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item INVAR_NUGGET = register(ItemNames.INVAR_NUGGET,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item INVAR_GEAR = register(ItemNames.INVAR_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    // Modded Vanilla Items
    public static final Item WOOD_GEAR = register(ItemNames.WOOD_GEAR,new ItemBurnable(100,new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item STONE_GEAR = register(ItemNames.STONE_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item COAL_CRUSHED = register(ItemNames.COAL_CRUSHED,new ItemBurnable(1600,new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item IRON_CRUSHED = register(ItemNames.IRON_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item IRON_GEAR = register(ItemNames.IRON_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item GOLD_CRUSHED = register(ItemNames.GOLD_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item GOLD_GEAR = register(ItemNames.GOLD_GEAR,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item DIAMOND_CRUSHED = register(ItemNames.DIAMOND_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item EMERALD_CRUSHED = register(ItemNames.EMERALD_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));
    public static final Item OBSIDIAN_CRUSHED = register(ItemNames.OBSIDIAN_CRUSHED,new Item(new Item.Properties().group(BigIndustries.ITEMS_GROUP)));

    /**
     * Registers a new {@link Item}.
     * @param id The id of the {@link Item}.
     * @param item The {@link Item}.
     * @return The {@link Item}.
     */
    protected static Item register(String id, Item item){
        item.setRegistryName(id);
        ITEMS.add(item);
        return item;
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        ITEMS.forEach(item -> event.getRegistry().register(item));
    }

}
