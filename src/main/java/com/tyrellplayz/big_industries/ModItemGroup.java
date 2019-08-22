package com.tyrellplayz.big_industries;

import com.tyrellplayz.big_industries.core.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroup extends ItemGroup {

    public ModItemGroup(String name) {
        super(name);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack createIcon() {
        return new ItemStack(ModItems.COPPER_INGOT);
    }

}
