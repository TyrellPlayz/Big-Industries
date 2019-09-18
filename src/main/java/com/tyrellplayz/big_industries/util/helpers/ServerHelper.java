package com.tyrellplayz.big_industries.util.helpers;

import net.minecraft.world.IWorld;

public class ServerHelper {

    private ServerHelper(){}

    public static boolean isClientWorld(IWorld world) {
        return world.isRemote();
    }

    public static boolean isServerWorld(IWorld world) {
        return !world.isRemote();
    }

}
