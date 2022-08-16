/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import java.awt.Color;
import obfuscate.a;

public class Class416 {
    private static int Field2011;

    public static Color Method2352() {
        return new Color(0, 153, 255);
    }

    /*
     * WARNING - void declaration
     */
    public static Color Method2353(int a2, int a3, float a4, float a5, float a6) {
        void a7;
        void a8;
        int n = (int)((System.currentTimeMillis() / (long)a2 + (long)a3) % 360L);
        float f = (float)a8 / 360.0f;
        int a9 = Class416.Method2356();
        Color a10 = new Color(Color.HSBtoRGB((float)a7, (float)a4, (float)a5));
        Color color = new Color(a10.getRed(), a10.getGreen(), a10.getBlue(), Math.max((int)0, (int)Math.min((int)255, (int)((int)(a6 * 255.0f)))));
        a.trash(new String[2]);
        return color;
    }

    public static void Method2354(int n) {
        Field2011 = n;
    }

    public static int Method2355() {
        return Field2011;
    }

    public static int Method2356() {
        int n = Class416.Method2355();
        return 122;
    }

    static {
        if (Class416.Method2356() != 0) {
            Class416.Method2354(13);
        }
    }
}