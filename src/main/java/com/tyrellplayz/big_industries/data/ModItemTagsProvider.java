package com.tyrellplayz.big_industries.data;

import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.core.ModItems;
import com.tyrellplayz.big_industries.tags.ModBlockTags;
import com.tyrellplayz.big_industries.tags.ModItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import org.apache.logging.log4j.Logger;

public class ModItemTagsProvider extends ItemTagsProvider {
    private static final Logger LOGGER = BigIndustries.LOGGER;

    public ModItemTagsProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        // Copper
        this.getBuilder(ModItemTags.INGOT_COPPER).add(ModItems.COPPER_INGOT);
        this.getBuilder(ModItemTags.NUGGET_COPPER).add(ModItems.COPPER_NUGGET);
        this.getBuilder(ModItemTags.CRUSHED_COPPER).add(ModItems.COPPER_CRUSHED);

        // Lead
        this.getBuilder(ModItemTags.INGOT_LEAD).add(ModItems.LEAD_INGOT);
        this.getBuilder(ModItemTags.NUGGET_LEAD).add(ModItems.LEAD_NUGGET);
        this.getBuilder(ModItemTags.CRUSHED_COPPER).add(ModItems.LEAD_CRUSHED);

        // Tin
        this.getBuilder(ModItemTags.INGOT_TIN).add(ModItems.TIN_INGOT);
        this.getBuilder(ModItemTags.NUGGET_TIN).add(ModItems.TIN_NUGGET);
        this.getBuilder(ModItemTags.CRUSHED_COPPER).add(ModItems.TIN_CRUSHED);

        // Silver
        this.getBuilder(ModItemTags.INGOT_SILVER).add(ModItems.SILVER_INGOT);
        this.getBuilder(ModItemTags.NUGGET_SILVER).add(ModItems.SILVER_NUGGET);
        this.getBuilder(ModItemTags.CRUSHED_COPPER).add(ModItems.SILVER_CRUSHED);

        // Nickel
        this.getBuilder(ModItemTags.INGOT_NICKEL).add(ModItems.NICKEL_INGOT);
        this.getBuilder(ModItemTags.NUGGET_NICKEL).add(ModItems.NICKEL_NUGGET);
        this.getBuilder(ModItemTags.CRUSHED_COPPER).add(ModItems.NICKEL_CRUSHED);

        // Steel
        this.getBuilder(ModItemTags.INGOT_STEEL).add(ModItems.STEEL_INGOT);
        this.getBuilder(ModItemTags.NUGGET_STEEL).add(ModItems.STEEL_NUGGET);
        this.getBuilder(ModItemTags.CRUSHED_COPPER).add(ModItems.STEEL_CRUSHED);

        // Bronze
        this.getBuilder(ModItemTags.INGOT_BRONZE).add(ModItems.BRONZE_INGOT);
        this.getBuilder(ModItemTags.NUGGET_BRONZE).add(ModItems.BRONZE_NUGGET);
        this.getBuilder(ModItemTags.CRUSHED_COPPER).add(ModItems.BRONZE_CRUSHED);

        // Invar
        this.getBuilder(ModItemTags.INGOT_INVAR).add(ModItems.INVAR_INGOT);
        this.getBuilder(ModItemTags.NUGGET_INVAR).add(ModItems.INVAR_NUGGET);
        this.getBuilder(ModItemTags.CRUSHED_COPPER).add(ModItems.INVAR_CRUSHED);

        this.getBuilder(ModItemTags.CRUSHED_COAL).add(ModItems.COAL_CRUSHED);
        this.getBuilder(ModItemTags.CRUSHED_IRON).add(ModItems.IRON_CRUSHED);
        this.getBuilder(ModItemTags.CRUSHED_GOLD).add(ModItems.GOLD_CRUSHED);
        this.getBuilder(ModItemTags.CRUSHED_DIAMOND).add(ModItems.DIAMOND_CRUSHED);
        this.getBuilder(ModItemTags.CRUSHED_EMERALD).add(ModItems.EMERALD_CRUSHED);
        this.getBuilder(ModItemTags.CRUSHED_OBSIDIAN).add(ModItems.OBSIDIAN_CRUSHED);

        this.copy(ModBlockTags.COPPER,ModItemTags.BLOCK_COPPER);
        this.copy(ModBlockTags.LEAD,ModItemTags.BLOCK_LEAD);
        this.copy(ModBlockTags.TIN,ModItemTags.BLOCK_TIN);
        this.copy(ModBlockTags.SILVER,ModItemTags.BLOCK_SILVER);
        this.copy(ModBlockTags.NICKEL,ModItemTags.BLOCK_NICKEL);
        this.copy(ModBlockTags.STEEL,ModItemTags.BLOCK_STEEL);
        this.copy(ModBlockTags.BRONZE,ModItemTags.BLOCK_BRONZE);
        this.copy(ModBlockTags.INVAR,ModItemTags.BLOCK_INVAR);

        this.copy(ModBlockTags.ORE_COPPER,ModItemTags.ORE_COPPER);
        this.copy(ModBlockTags.ORE_LEAD,ModItemTags.ORE_LEAD);
        this.copy(ModBlockTags.ORE_TIN,ModItemTags.ORE_TIN);
        this.copy(ModBlockTags.ORE_SILVER,ModItemTags.ORE_SILVER);
        this.copy(ModBlockTags.ORE_NICKEL,ModItemTags.ORE_NICKEL);
    }

    @Override
    public String getName() {
        return BigIndustries.NAME+" Item Tags";
    }
}
