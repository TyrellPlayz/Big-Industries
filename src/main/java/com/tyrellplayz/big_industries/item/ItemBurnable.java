package com.tyrellplayz.big_industries.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBurnable extends Item {

    private int burnTime;

    /**
     *
     * @param burnTimeIn - The item burn time in ticks.
     * @param propertiesIn - The {@link Properties} of the item.
     */
    public ItemBurnable(int burnTimeIn, Properties propertiesIn) {
        super(propertiesIn);
        this.burnTime = burnTimeIn;
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return burnTime;
    }
}
