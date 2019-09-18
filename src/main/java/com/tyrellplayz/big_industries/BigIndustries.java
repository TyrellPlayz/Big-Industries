package com.tyrellplayz.big_industries;

import com.tyrellplayz.big_industries.data.*;
import com.tyrellplayz.big_industries.proxy.ClientProxy;
import com.tyrellplayz.big_industries.proxy.CommonProxy;
import com.tyrellplayz.big_industries.proxy.ServerProxy;
import com.tyrellplayz.big_industries.tags.ModBlockTags;
import com.tyrellplayz.big_industries.world.WorldGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IDataProvider;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Mod(BigIndustries.ID)
public class BigIndustries {

    public static final String ID = "big_industries";
    public static final String NAME = "Big Industries";
    public static final String VERSION = "0.1.0";
    public static final int DATA_FIXER_VERSION = 0;

    public static final Logger LOGGER = LogManager.getLogger(NAME);
    public static final ItemGroup BLOCKS_GROUP = new ModBlockGroup(ID+".blocks");
    public static final ItemGroup ITEMS_GROUP = new ModItemGroup(ID+".items");
    public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    private List<Function<DataGenerator, IDataProvider>> dataProviders = new ArrayList<>();

    public BigIndustries() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::dataGeneratorSetup);

        FMLJavaModLoadingContext.get().getModEventBus().register(Registries.class);

        addDataProvider(ModBlockTagsProvider::new);
        addDataProvider(ModItemTagsProvider::new);
        addDataProvider(ModRecipeProvider::new);
        addDataProvider(ItemModelProvider::new);
        addDataProvider(BlockStateProvider::new);
        addDataProvider(BlockModelProvider::new);
    }

    public void onCommonSetup(FMLCommonSetupEvent event) {
        WorldGenerator.initFeatures();
        proxy.onCommonSetup(event);
    }

    public void loadComplete(final FMLLoadCompleteEvent event) {

    }

    public void onClientSetup(FMLClientSetupEvent event) {

    }

    protected final void addDataProvider(Function<DataGenerator, IDataProvider> dataProvider) {
        dataProviders.add(dataProvider);
    }

    public final void dataGeneratorSetup(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        dataProviders.forEach(dataProvider -> {
            IDataProvider provider = dataProvider.apply(generator);
            event.getGenerator().addProvider(provider);
        });
    }

}
