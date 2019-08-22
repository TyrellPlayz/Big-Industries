package com.tyrellplayz.big_industries.duct;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class DuctNetwork {

    protected static HashSet<Integer> usedIds = new HashSet<>();

     int networkId;

    CopyOnWriteArraySet<Map.Entry<TileEntity, Direction>> sources;

    CopyOnWriteArraySet<Map.Entry<TileEntity, Direction>> sinks;

    protected DuctNetwork() {
        sources = new CopyOnWriteArraySet<>();
        sinks = new CopyOnWriteArraySet<>();
    }

    public Set<Map.Entry<TileEntity, Direction>> getSources() {
        return sources;
    }

    public Set<Map.Entry<TileEntity, Direction>> getSinks() {
        return sinks;
    }

}
