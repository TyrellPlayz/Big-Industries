package com.tyrellplayz.big_industries.data;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.core.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BlockStateProvider extends AbstractDataProvider {

    public BlockStateProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void act(DirectoryCache cache) throws IOException {
        List<File> blockStateFiles = Lists.newArrayList(INPUT_PATH.resolve("assets/"+ BigIndustries.ID+"/blockstates").toFile().listFiles((dir, name) -> name.contains(".json")));
        for (Block block : ModBlocks.BLOCKS) {
            if(!block.getDefaultState().getProperties().isEmpty()) return;

            String fileName = block.getRegistryName().getPath()+".json";
            boolean hasFile = false;
            for (File blockStateFile : blockStateFiles) {
                if(blockStateFile.getName().equals(fileName)) hasFile = true;
            }

            if(hasFile)continue;

            JsonObject blockStateJson = createDefaultState(block);
            File file = new File(OUTPUT_PATH.resolve("assets/"+ BigIndustries.ID+"/blockstates").toFile(),block.getRegistryName().getPath()+".json");
            IDataProvider.save(GSON,cache,blockStateJson,file.toPath());
        }
    }

    public JsonObject createDefaultState(Block block) {
        JsonObject modelObject = new JsonObject();
        modelObject.addProperty("model",block.getRegistryName().getNamespace()+":block/"+block.getRegistryName().getPath());

        JsonObject normalObject = new JsonObject();
        normalObject.add("",modelObject);

        JsonObject variantsObject = new JsonObject();
        variantsObject.add("variants",normalObject);

        return variantsObject;
    }

    @Override
    public String getName() {
        return BigIndustries.NAME+" BlockState";
    }
}
