package com.tyrellplayz.big_industries.data;

import com.google.gson.JsonObject;
import com.tyrellplayz.big_industries.BigIndustries;
import com.tyrellplayz.big_industries.core.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.util.ResourceLocation;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BlockModelProvider extends AbstractDataProvider {

    public BlockModelProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void act(DirectoryCache cache) throws IOException {
        final List<Block> BLOCKS = ModBlocks.BLOCKS;

        final File modelFolder = OUTPUT_PATH.resolve("assets/"+ BigIndustries.ID+"/models/block").toFile();
        final File modelFolderIn = INPUT_PATH.resolve("assets/"+BigIndustries.ID+"/models/block").toFile();

        for (Block block : BLOCKS) {
            File modelFileIn = new File(modelFolderIn,block.getRegistryName().getPath()+".json");
            if(modelFileIn.exists()) continue;

            File modelFile = new File(modelFolder,block.getRegistryName().getPath()+".json");
            IDataProvider.save(GSON,cache,getModel_CubeAll(block,new ResourceLocation(block.getRegistryName().getNamespace(),"block/"+block.getRegistryName().getPath())),modelFile.toPath());
        }

    }

    public JsonObject getModel_CubeAll(Block block, ResourceLocation textureLocation) {
        JsonObject object = new JsonObject();
        object.addProperty("parent","block/cube_all");

        JsonObject texturesObject = new JsonObject();
        texturesObject.addProperty("all",textureLocation.toString());
        object.add("textures",texturesObject);

        return object;
    }

    @Override
    public String getName() {
        return null;
    }
}
