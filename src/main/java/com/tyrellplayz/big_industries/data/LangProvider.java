package com.tyrellplayz.big_industries.data;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tyrellplayz.big_industries.BigIndustries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;

public class LangProvider extends AbstractDataProvider {

    public LangProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void act(DirectoryCache cache) throws IOException {
        final Path inputPath = GENERATOR.getInputFolders().stream().findFirst().orElse(null);
        if(inputPath == null) return;

        final File langFile = inputPath.resolve("assets/"+BigIndustries.ID+"/lang/en_us.json").toFile();
        final Reader reader = new FileReader(langFile);

        final JsonObject langJson = new JsonParser().parse(reader).getAsJsonObject();



        IDataProvider.save(new GsonBuilder().setPrettyPrinting().create(), cache, langJson, langFile.toPath());
    }

    @Override
    public String getName() {
        return BigIndustries.NAME+" Lang";
    }
}
