package com.tyrellplayz.big_industries.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tyrellplayz.big_industries.BigIndustries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IDataProvider;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;

public abstract class AbstractDataProvider implements IDataProvider {
    protected final Logger LOGGER = BigIndustries.LOGGER;
    protected final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();

    protected final DataGenerator GENERATOR;
    protected final Path OUTPUT_PATH;
    protected final Path INPUT_PATH;

    public AbstractDataProvider(DataGenerator generator) {
        this.GENERATOR = generator;
        this.OUTPUT_PATH = generator.getOutputFolder();
        this.INPUT_PATH = generator.getInputFolders().stream().findFirst().orElse(null);
    }



}
