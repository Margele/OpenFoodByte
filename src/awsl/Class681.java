/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Enum
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import java.awt.Color;

public final class Class681
extends Enum {
    public static final Class681 BLACK = new Class681("BLACK", 0, -16711423);
    public static final Class681 BLUE = new Class681("BLUE", 1, -12028161);
    public static final Class681 DARKBLUE = new Class681("DARKBLUE", 2, -12621684);
    public static final Class681 GREEN = new Class681("GREEN", 3, -9830551);
    public static final Class681 DARKGREEN = new Class681("DARKGREEN", 4, -9320847);
    public static final Class681 WHITE = new Class681("WHITE", 5, -65794);
    public static final Class681 AQUA = new Class681("AQUA", 6, -7820064);
    public static final Class681 DARKAQUA = new Class681("DARKAQUA", 7, -12621684);
    public static final Class681 GREY = new Class681("GREY", 8, -9868951);
    public static final Class681 DARKGREY = new Class681("DARKGREY", 9, -14342875);
    public static final Class681 RED = new Class681("RED", 10, -65536);
    public static final Class681 DARKRED = new Class681("DARKRED", 11, -8388608);
    public static final Class681 ORANGE = new Class681("ORANGE", 12, -29696);
    public static final Class681 DARKORANGE = new Class681("DARKORANGE", 13, -2263808);
    public static final Class681 YELLOW = new Class681("YELLOW", 14, -256);
    public static final Class681 DARKYELLOW = new Class681("DARKYELLOW", 15, -2702025);
    public static final Class681 MAGENTA = new Class681("MAGENTA", 16, -18751);
    public static final Class681 DARKMAGENTA = new Class681("DARKMAGENTA", 17, -2252579);
    public int Field2962;
    private static final /* synthetic */ Class681[] Field2963;

    public static Class681[] Method2693() {
        return (Class681[])Field2963.clone();
    }

    public static Class681 Method2694(String a) {
        return (Class681)Enum.valueOf(Class681.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class681() {
        void a;
        void var2_-1;
        void var1_-1;
        this.Field2962 = a;
    }

    public static int Method2695(Color a) {
        return Class681.Method2696(a.getRed(), a.getGreen(), a.getBlue(), a.getAlpha());
    }

    public static int Method1612(int a) {
        return Class681.Method2696(a, a, a, 255);
    }

    public static int Method1614(int a, int a2) {
        return Class681.Method2696(a, a, a, a2);
    }

    public static int Method3(int a, int a2, int a3) {
        return Class681.Method2696(a, a2, a3, 255);
    }

    public static int Method2696(int a, int a2, int a3, int a4) {
        int a5 = 0;
        a5 |= a4 << 24;
        a5 |= a << 16;
        a5 |= a2 << 8;
        return a5 |= a3;
    }

    public static Color Method2697(int a) {
        int a2 = a >> 16 & 0xFF;
        int a3 = a >> 8 & 0xFF;
        int a4 = a & 0xFF;
        int a5 = a >> 24 & 0xFF;
        return new Color(a2, a3, a4, a5);
    }

    public static Color Method2698(int a, int a2) {
        int a3 = a >> 16 & 0xFF;
        int a4 = a >> 8 & 0xFF;
        int a5 = a & 0xFF;
        int a6 = a2;
        return new Color(a3, a4, a5, a6);
    }

    public static int Method2699(int a, int a2) {
        float a3 = a >> 24 & 0xFF;
        float a4 = Math.max((float)((float)(a >> 16 & 0xFF) - (float)(a >> 16 & 0xFF) / (100.0f / (float)a2)), (float)0.0f);
        float a5 = Math.max((float)((float)(a >> 8 & 0xFF) - (float)(a >> 8 & 0xFF) / (100.0f / (float)a2)), (float)0.0f);
        float a6 = Math.max((float)((float)(a & 0xFF) - (float)(a & 0xFF) / (100.0f / (float)a2)), (float)0.0f);
        return (int)((float)(((int)a3 << 24) + ((int)a4 << 16) + ((int)a5 << 8)) + a6);
    }

    public static int Method900(int a, float a2) {
        Color a3 = new Color(a);
        float a4 = 0.003921569f * (float)a3.getRed();
        float a5 = 0.003921569f * (float)a3.getGreen();
        float a6 = 0.003921569f * (float)a3.getBlue();
        return new Color(a4, a5, a6, a2).getRGB();
    }

    static {
        Field2963 = new Class681[]{BLACK, BLUE, DARKBLUE, GREEN, DARKGREEN, WHITE, AQUA, DARKAQUA, GREY, DARKGREY, RED, DARKRED, ORANGE, DARKORANGE, YELLOW, DARKYELLOW, MAGENTA, DARKMAGENTA};
    }
}