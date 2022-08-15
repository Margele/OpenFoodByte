/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Enum
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.function.Supplier
 */
package awsl;

import java.awt.Color;
import java.util.function.Supplier;

public final class Class662
extends Enum {
    public static final Class662 GREEN = new Class662("GREEN", 0, Class662::Method2406);
    public static final Class662 WHITE = new Class662("WHITE", 1, Class662::Method2405);
    public static final Class662 PURPLE = new Class662("PURPLE", 2, Class662::Method2404);
    public static final Class662 DARK_PURPLE = new Class662("DARK_PURPLE", 3, Class662::Method2403);
    public static final Class662 BLUE = new Class662("BLUE", 4, Class662::Method2402);
    private final Supplier Field2932;
    private static final Class662[] Field2933 = new Class662[]{GREEN, WHITE, PURPLE, DARK_PURPLE, BLUE};

    public static Class662[] Method2397() {
        return (Class662[])Field2933.clone();
    }

    public static Class662 Method2398(String a) {
        return (Class662)Enum.valueOf(Class662.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class662() {
        void a;
        void var2_-1;
        void var1_-1;
        this.Field2932 = a;
    }

    public static Color Method2399(Color a) {
        return Class662.Method2400(a, 2, 100);
    }

    public static Color Method2400(Color a, int a2, int a3) {
        float[] a4 = new float[3];
        Color.RGBtoHSB((int)a.getRed(), (int)a.getGreen(), (int)a.getBlue(), (float[])a4);
        float a5 = Math.abs((float)(((float)(System.currentTimeMillis() % 2000L) / 1000.0f + (float)a2 / (float)a3 * 2.0f) % 2.0f - 1.0f));
        a5 = 0.5f + 0.5f * a5;
        a4[2] = a5 % 2.0f;
        return new Color(Color.HSBtoRGB((float)a4[0], (float)a4[1], (float)a4[2]));
    }

    public Color Method2401() {
        return (Color)this.Field2932.get();
    }

    private static Color Method2402() {
        return new Color(116, 202, 255);
    }

    private static Color Method2403() {
        return new Color(133, 46, 215);
    }

    private static Color Method2404() {
        return new Color(198, 139, 255);
    }

    private static Color Method2405() {
        return Color.WHITE;
    }

    private static Color Method2406() {
        return new Color(0, 255, 138);
    }
}