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

import awsl.Class91;
import java.awt.Color;

public class Class416 {
    private static int Field2011;

    public static Color Method2352() {
        return new Color(0, 153, 255);
    }

    /*
     * WARNING - void declaration
     */
    public static Color Method2353(int a, int a2, float a3, float a4, float a5) {
        void a6;
        void a7;
        int n = (int)((System.currentTimeMillis() / (long)a + (long)a2) % 360L);
        float f = (float)a7 / 360.0f;
        int a8 = Class416.Method2356();
        Color a9 = new Color(Color.HSBtoRGB((float)a6, (float)a3, (float)a4));
        Color color = new Color(a9.getRed(), a9.getGreen(), a9.getBlue(), Math.max((int)0, (int)Math.min((int)255, (int)((int)(a5 * 255.0f)))));
        Class91.Method3647(new String[2]);
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