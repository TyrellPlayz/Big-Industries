package com.tyrellplayz.big_industries;

import com.tyrellplayz.big_industries.core.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModBlockGroup extends ItemGroup {

    public ModBlockGroup(String name) {
        super(name);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.COPPER_BLOCK);
    }

}
