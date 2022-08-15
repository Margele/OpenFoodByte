/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  net.minecraft.util.ResourceLocation
 */
package awsl;

import awsl.Class91;
import net.minecraft.util.ResourceLocation;

public class Class393 {
    public static ResourceLocation Field1937;
    public static ResourceLocation Field1938;
    public static ResourceLocation Field1939;
    public static ResourceLocation Field1940;
    public static ResourceLocation Field1941;
    public static ResourceLocation Field1942;
    public static ResourceLocation Field1943;
    public static ResourceLocation Field1944;
    public static ResourceLocation Field1945;
    public static ResourceLocation Field1946;
    public static ResourceLocation Field1947;
    private static Class91[] Field1948;

    static {
        Class393.Method1319(null);
        Field1937 = new ResourceLocation("FoodByte/cape.png");
        Field1938 = new ResourceLocation("FoodByte/skin.png");
        Field1939 = new ResourceLocation("FoodByte/transperent.png");
        Field1940 = new ResourceLocation("FoodByte/wings.png");
        Field1941 = new ResourceLocation("FoodByte/icon/icon_16x16.png");
        Field1942 = new ResourceLocation("FoodByte/icon/icon_32x32.png");
        Field1943 = new ResourceLocation("FoodByte/sound/enable.mp3");
        Field1944 = new ResourceLocation("FoodByte/sound/disable.mp3");
        Field1945 = new ResourceLocation("FoodByte/sound/off.wav");
        Field1946 = new ResourceLocation("FoodByte/sound/on.wav");
        Field1947 = new ResourceLocation("textures/gui/container/inventory.png");
    }

    public static void Method1319(Class91[] class91Array) {
        Field1948 = class91Array;
    }

    public static Class91[] Method1320() {
        return Field1948;
    }
}