package com.tyrellplayz.big_industries;

import com.tyrellplayz.big_industries.proxy.ClientProxy;
import com.tyrellplayz.big_industries.proxy.CommonProxy;
import com.tyrellplayz.big_industries.world.WorldGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BigIndustries.ID)
public class BigIndustries {

    public static final String ID = "big_industries";
    public static final String NAME = "Big Industries";
    public static final String VERSION = "0.1.0";
    public static final int DATAFIXER_VERSION = 0;

    public static final Logger LOGGER = LogManager.getLogger(NAME);
    public static final ItemGroup BLOCKS_GROUP = new ModBlockGroup(ID+".blocks");
    public static final ItemGroup ITEMS_GROUP = new ModItemGroup(ID+".items");
    public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public BigIndustries() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupEvent);
    }

    private void setupEvent(FMLCommonSetupEvent event) {
        WorldGenerator.initFeatures();
        proxy.setup();
    }

}
