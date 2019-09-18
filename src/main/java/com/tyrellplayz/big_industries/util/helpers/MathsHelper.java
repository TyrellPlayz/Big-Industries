package com.tyrellplayz.big_industries.util.helpers;

import net.minecraft.util.math.MathHelper;

public class MathsHelper {

    private MathsHelper(){}

    public static int round(double d) {
        return (int) (d + 0.5D);
    }

    public static int min(int value, int min){
        return MathHelper.clamp(value,min,Integer.MAX_VALUE);
    }

    public static int max(int value, int max){
        return MathHelper.clamp(value,0,max);
    }

}
