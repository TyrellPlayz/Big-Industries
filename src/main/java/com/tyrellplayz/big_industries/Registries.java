package com.tyrellplayz.big_industries;

import com.tyrellplayz.big_industries.world.ore.Ore;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.RegistryBuilder;

public class Registries {

    @SubscribeEvent
    public static void registerRegistries(RegistryEvent.NewRegistry event) {
        // Ore
        RegistryBuilder<Ore> builderOre = new RegistryBuilder<>();
        builderOre.setType(Ore.class);
        ResourceLocation keyOre = new ResourceLocation(BigIndustries.ID, "ore");
        builderOre.setName(keyOre);
        builderOre.setDefaultKey(keyOre);
        builderOre.create();
    }

}
