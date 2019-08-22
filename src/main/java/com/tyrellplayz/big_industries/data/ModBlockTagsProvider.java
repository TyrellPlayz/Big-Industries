package com.tyrellplayz.big_industries.data;

import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.core.ModBlocks;
import com.tyrellplayz.big_industries.tags.ModBlockTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        this.getBuilder(ModBlockTags.COPPER).add(ModBlocks.COPPER_BLOCK);
        this.getBuilder(ModBlockTags.LEAD).add(ModBlocks.LEAD_BLOCK);
        this.getBuilder(ModBlockTags.TIN).add(ModBlocks.TIN_BLOCK);
        this.getBuilder(ModBlockTags.SILVER).add(ModBlocks.SILVER_BLOCK);
        this.getBuilder(ModBlockTags.NICKEL).add(ModBlocks.NICKEL_BLOCK);
        this.getBuilder(ModBlockTags.STEEL).add(ModBlocks.STEEL_BLOCK);
        this.getBuilder(ModBlockTags.BRONZE).add(ModBlocks.BRONZE_BLOCK);
        this.getBuilder(ModBlockTags.INVAR).add(ModBlocks.INVAR_BLOCK);

        this.getBuilder(ModBlockTags.ORE_COPPER).add(ModBlocks.COPPER_ORE);
        this.getBuilder(ModBlockTags.ORE_LEAD).add(ModBlocks.LEAD_ORE);
        this.getBuilder(ModBlockTags.ORE_TIN).add(ModBlocks.TIN_ORE);
        this.getBuilder(ModBlockTags.ORE_SILVER).add(ModBlocks.SILVER_ORE);
        this.getBuilder(ModBlockTags.ORE_NICKEL).add(ModBlocks.NICKEL_ORE);
    }

    @Override
    public String getName() {
        return BigIndustries.NAME+" Block Tags";
    }
}
