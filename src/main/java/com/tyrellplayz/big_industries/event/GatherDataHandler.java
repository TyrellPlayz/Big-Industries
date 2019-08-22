package com.tyrellplayz.big_industries.event;

import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.data.*;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;


@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = BigIndustries.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GatherDataHandler {

    @SubscribeEvent
    public static void dataGeneratorSetup(final GatherDataEvent event) {
        event.getGenerator().addProvider(new ModBlockTagsProvider(event.getGenerator()));
        event.getGenerator().addProvider(new ModItemTagsProvider(event.getGenerator()));

        event.getGenerator().addProvider(new BlockModelProvider(event.getGenerator()));
        event.getGenerator().addProvider(new BlockStateProvider(event.getGenerator()));
        event.getGenerator().addProvider(new ItemModelProvider(event.getGenerator()));
        event.getGenerator().addProvider(new LangProvider(event.getGenerator()));
        event.getGenerator().addProvider(new ModRecipeProvider(event.getGenerator()));
    }

}
