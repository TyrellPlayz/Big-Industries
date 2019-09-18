package com.tyrellplayz.big_industries.core;

import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.util.BlockNames;
import com.tyrellplayz.big_industries.world.ore.Ore;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = BigIndustries.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOre {
    public static final List<Ore> ORES = new ArrayList<>();

    public static final Ore COPPER_ORE = register(BlockNames.COPPER_ORE,new Ore(ModBlocks.COPPER_ORE.getDefaultState(),new Ore.Properties(8,8,40,75)));
    public static final Ore LEAD_ORE = register(BlockNames.LEAD_ORE,new Ore(ModBlocks.LEAD_ORE.getDefaultState(),new Ore.Properties(8,4,10,35)));
    public static final Ore TIN_ORE = register(BlockNames.TIN_ORE,new Ore(ModBlocks.TIN_ORE.getDefaultState(),new Ore.Properties(8,7,20,55)));
    public static final Ore SILVER_ORE = register(BlockNames.SILVER_ORE,new Ore(ModBlocks.SILVER_ORE.getDefaultState(),new Ore.Properties(8,4,5,30)));
    public static final Ore NICKEL_ORE = register(BlockNames.NICKEL_ORE,new Ore(ModBlocks.NICKEL_ORE.getDefaultState(),new Ore.Properties(8,2,5,20)));

    private static Ore register(String id, Ore ore){
        return register(new ResourceLocation(id),ore);
    }

    private static Ore register(ResourceLocation id, Ore ore){
        ore.setRegistryName(id);
        ORES.add(ore);
        return ore;
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Ore> event) {
        ORES.forEach(ore -> event.getRegistry().register(ore));
    }

}
