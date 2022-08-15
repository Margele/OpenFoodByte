/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class193;

public class Class698 {
    private static int Method2615(float a, float a2, float a3) {
        if ((double)a == 0.0) {
            return 0;
        }
        return (int)Math.round((double)(255.0 * Math.pow((double)(a * a2), (double)a3)));
    }

    /*
     * WARNING - void declaration
     */
    public static int Method2616(float a) {
        float a2;
        float a3;
        float a4;
        float a5;
        void a6;
        float a7 = 0.8f;
        int n = (int)a;
        boolean a8 = Class193.Method1269();
        if (a6 < 380) {
            a5 = 0.0f;
            a4 = 0.0f;
            a3 = 0.0f;
        }
        if (a6 < 440) {
            a5 = -(a - 440.0f) / 60.0f;
            a4 = 0.0f;
            a3 = 1.0f;
        }
        if (a6 < 490) {
            a5 = 0.0f;
            a4 = (a - 440.0f) / 50.0f;
            a3 = 1.0f;
        }
        if (a6 < 510) {
            a5 = 0.0f;
            a4 = 1.0f;
            a3 = -(a - 510.0f) / 20.0f;
        }
        if (a6 < 580) {
            a5 = (a - 510.0f) / 70.0f;
            a4 = 1.0f;
            a3 = 0.0f;
        }
        if (a6 < 645) {
            a5 = 1.0f;
            a4 = -(a - 645.0f) / 65.0f;
            a3 = 0.0f;
        }
        if (a6 <= 780) {
            a5 = 1.0f;
            a4 = 0.0f;
            a3 = 0.0f;
        }
        a5 = 0.0f;
        a4 = 0.0f;
        a3 = 0.0f;
        if (380 <= a6 && a6 <= 419) {
            a2 = 0.3f + 0.7f * (a - 380.0f) / 40.0f;
        }
        if (420 <= a6 && a6 <= 700) {
            a2 = 1.0f;
        }
        if (701 <= a6 && a6 <= 780) {
            a2 = 0.3f + 0.7f * (780.0f - a) / 80.0f;
        }
        a2 = 0.0f;
        int a9 = Class698.Method2615(a5, a2, a7);
        int a10 = Class698.Method2615(a4, a2, a7);
        int a11 = Class698.Method2615(a3, a2, a7);
        return 0xFF000000 | a9 << 16 | a10 << 8 | a11;
    }
}