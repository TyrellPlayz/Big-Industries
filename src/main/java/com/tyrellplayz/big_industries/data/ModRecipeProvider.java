package com.tyrellplayz.big_industries.data;

import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.core.ModBlocks;
import com.tyrellplayz.big_industries.core.ModItems;
import com.tyrellplayz.big_industries.tags.ModItemTags;
import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.criterion.EnterBlockTrigger;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.Tag;
import net.minecraft.util.IItemProvider;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        // Copper
        registerBlockIngotNuggetRecipe(ModBlocks.COPPER_BLOCK,ModItems.COPPER_INGOT,ModItems.COPPER_NUGGET,ModItemTags.BLOCK_COPPER,ModItemTags.INGOT_COPPER,ModItemTags.NUGGET_COPPER,consumer,"has_copper",this.hasItem(ModItemTags.ORE_COPPER));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.ORE_COPPER),ModItems.COPPER_INGOT,0.0f, 200).addCriterion("has_copper",this.hasItem(ModItemTags.ORE_COPPER)).build(consumer, ModItems.COPPER_INGOT.getRegistryName()+"_from_ore");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_COPPER),ModItems.COPPER_INGOT,0.0f, 200).addCriterion("has_copper",this.hasItem(ModItemTags.ORE_COPPER)).build(consumer,ModItems.COPPER_INGOT.getRegistryName()+"_from_crushed");
        // Lead
        registerBlockIngotNuggetRecipe(ModBlocks.LEAD_BLOCK,ModItems.LEAD_INGOT,ModItems.LEAD_NUGGET,ModItemTags.BLOCK_LEAD,ModItemTags.INGOT_LEAD,ModItemTags.NUGGET_LEAD,consumer,"has_lead",this.hasItem(ModItemTags.ORE_LEAD));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.ORE_LEAD),ModItems.LEAD_INGOT,0.0f, 200).addCriterion("has_lead",this.hasItem(ModItemTags.ORE_LEAD)).build(consumer, ModItems.LEAD_INGOT.getRegistryName()+"_from_ore");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_LEAD),ModItems.LEAD_INGOT,0.0f, 200).addCriterion("has_lead",this.hasItem(ModItemTags.ORE_LEAD)).build(consumer,ModItems.LEAD_INGOT.getRegistryName()+"_from_crushed");
        // Tin
        registerBlockIngotNuggetRecipe(ModBlocks.TIN_BLOCK,ModItems.TIN_INGOT,ModItems.TIN_NUGGET,ModItemTags.BLOCK_TIN,ModItemTags.INGOT_TIN,ModItemTags.NUGGET_TIN,consumer,"has_tin",this.hasItem(ModItemTags.ORE_TIN));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.ORE_TIN),ModItems.TIN_INGOT,0.0f, 200).addCriterion("has_tin",this.hasItem(ModItemTags.ORE_TIN)).build(consumer, ModItems.TIN_INGOT.getRegistryName()+"_from_ore");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_TIN),ModItems.TIN_INGOT,0.0f, 200).addCriterion("has_tin",this.hasItem(ModItemTags.ORE_TIN)).build(consumer,ModItems.TIN_INGOT.getRegistryName()+"_from_crushed");
        // Silver
        registerBlockIngotNuggetRecipe(ModBlocks.SILVER_BLOCK,ModItems.SILVER_INGOT,ModItems.SILVER_NUGGET,ModItemTags.BLOCK_SILVER,ModItemTags.INGOT_SILVER,ModItemTags.NUGGET_SILVER ,consumer,"has_silver",this.hasItem(ModItemTags.ORE_SILVER));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.ORE_SILVER),ModItems.SILVER_INGOT,0.0f, 200).addCriterion("has_silver",this.hasItem(ModItemTags.ORE_SILVER)).build(consumer, ModItems.SILVER_INGOT.getRegistryName()+"_from_ore");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_SILVER),ModItems.SILVER_INGOT,0.0f, 200).addCriterion("has_silver",this.hasItem(ModItemTags.ORE_SILVER)).build(consumer,ModItems.SILVER_INGOT.getRegistryName()+"_from_crushed");
        // Nickel
        registerBlockIngotNuggetRecipe(ModBlocks.NICKEL_BLOCK,ModItems.NICKEL_INGOT,ModItems.NICKEL_NUGGET,ModItemTags.BLOCK_NICKEL,ModItemTags.INGOT_NICKEL,ModItemTags.NUGGET_NICKEL,consumer,"has_nickel",this.hasItem(ModItemTags.ORE_NICKEL));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.ORE_NICKEL),ModItems.NICKEL_INGOT,0.0f, 200).addCriterion("has_nickel",this.hasItem(ModItemTags.ORE_NICKEL)).build(consumer, ModItems.NICKEL_INGOT.getRegistryName()+"_from_ore");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_NICKEL),ModItems.NICKEL_INGOT,0.0f, 200).addCriterion("has_nickel",this.hasItem(ModItemTags.ORE_NICKEL)).build(consumer,ModItems.NICKEL_INGOT.getRegistryName()+"_from_crushed");
        // Steel
        registerBlockIngotNuggetRecipe(ModBlocks.STEEL_BLOCK,ModItems.STEEL_INGOT,ModItems.STEEL_NUGGET,ModItemTags.BLOCK_STEEL,ModItemTags.INGOT_STEEL,ModItemTags.NUGGET_STEEL,consumer,"has_steel",this.hasItem(ModItemTags.INGOT_STEEL));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_STEEL),ModItems.STEEL_INGOT,0.0f, 200).addCriterion("has_steel",this.hasItem(ModItemTags.INGOT_STEEL)).build(consumer,ModItems.STEEL_INGOT.getRegistryName()+"_from_crushed");
        // Bronze
        registerBlockIngotNuggetRecipe(ModBlocks.BRONZE_BLOCK,ModItems.BRONZE_INGOT,ModItems.BRONZE_NUGGET,ModItemTags.BLOCK_BRONZE,ModItemTags.INGOT_BRONZE ,ModItemTags.NUGGET_BRONZE,consumer,"has_bronze",this.hasItem(ModItemTags.INGOT_BRONZE));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_BRONZE),ModItems.BRONZE_INGOT,0.0f, 200).addCriterion("has_bronze",this.hasItem(ModItemTags.INGOT_BRONZE)).build(consumer,ModItems.BRONZE_INGOT.getRegistryName()+"_from_crushed");
        // Invar
        registerBlockIngotNuggetRecipe(ModBlocks.INVAR_BLOCK,ModItems.INVAR_INGOT,ModItems.INVAR_NUGGET,ModItemTags.BLOCK_INVAR,ModItemTags.INGOT_INVAR,ModItemTags.NUGGET_INVAR,consumer,"has_invar",this.hasItem(ModItemTags.INGOT_INVAR));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_INVAR),ModItems.INVAR_INGOT,0.0f, 200).addCriterion("has_invar",this.hasItem(ModItemTags.INGOT_INVAR)).build(consumer,ModItems.INVAR_INGOT.getRegistryName()+"_from_crushed");

        // Other
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_IRON),Items.IRON_INGOT,0.0f, 200).addCriterion("has_iron_ore",this.hasItem(Blocks.IRON_ORE)).build(consumer,Items.IRON_INGOT.getRegistryName()+"_from_crushed");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_GOLD),Items.GOLD_INGOT,0.0f, 200).addCriterion("has_gold_ore",this.hasItem(Blocks.GOLD_ORE)).build(consumer,Items.GOLD_INGOT.getRegistryName()+"_from_crushed");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_DIAMOND),Items.DIAMOND,0.0f, 200).addCriterion("has_diamond_ore",this.hasItem(Blocks.DIAMOND_ORE)).build(consumer,Items.DIAMOND.getRegistryName()+"_from_crushed");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModItemTags.CRUSHED_EMERALD),Items.EMERALD,0.0f, 200).addCriterion("has_emerald_ore",this.hasItem(Blocks.EMERALD_ORE)).build(consumer,Items.EMERALD.getRegistryName()+"_from_crushed");

    }

    private void registerBlockIngotNuggetRecipe(Block block, Item ingot, Item nugget, Tag<Item> blockTag, Tag<Item> ingotTag, Tag<Item> nuggetTag, Consumer<IFinishedRecipe> consumer, String name, ICriterionInstance criterionIn) {
        ShapedRecipeBuilder.shapedRecipe(block,1).patternLine("###").patternLine("###").patternLine("###").key('#',ingotTag).addCriterion(name, criterionIn).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ingot,1).patternLine("###").patternLine("###").patternLine("###").key('#',nuggetTag).setGroup(ingot.getRegistryName().toString()).addCriterion(name, criterionIn).build(consumer,ingot.getRegistryName()+"_from_nugget");

        ShapelessRecipeBuilder.shapelessRecipe(ingot,9).addIngredient(blockTag).setGroup(ingot.getRegistryName().toString()).addCriterion(name, criterionIn).build(consumer,ingot.getRegistryName()+"_from_block");
        ShapelessRecipeBuilder.shapelessRecipe(nugget,9).addIngredient(ingotTag).addCriterion(name, criterionIn).build(consumer);
    }

    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return BigIndustries.NAME+" Recipes";
    }

}
