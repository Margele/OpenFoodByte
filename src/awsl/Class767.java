/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import java.util.Random;

public class Class767 {
    public static final int Field3398 = 0;
    public static final int Field3399 = 1;
    public static final int Field3400 = 2;
    public static final int Field3401 = 3;
    public static final int Field3402 = 4;
    public static final int Field3403 = 5;
    public static final int Field3404 = 6;
    public static final int Field3405 = 7;
    public static final int Field3406 = 8;
    public static final int Field3407 = 9;
    public static final int Field3408 = 10;
    public static final int Field3409 = 11;
    public static final int Field3410 = 12;
    public static final int Field3411 = 13;
    public static final int Field3412 = 14;
    public static final int Field3413 = 15;
    public static final int Field3414 = 16;
    public static final int Field3415 = 17;
    public static final int Field3416 = 18;
    public static final int Field3417 = 19;
    public static final int Field3418 = 20;
    private static Random Field3419 = new Random();
    private static final float[] Field3420 = new float[3];
    private static final float[] Field3421 = new float[3];

    public static int Method1687(int a) {
        return 0;
    }

    public static int Method1688(int a, int a2, float a3) {
        return Class767.Method1687((int)((float)a + a3 * (float)(a2 - a)));
    }

    public static int Method1689(int a) {
        int a2 = a >> 16 & 0xFF;
        int a3 = a >> 8 & 0xFF;
        int a4 = a & 0xFF;
        return (a2 + a3 + a4) / 3;
    }

    public static boolean Method1690(int a, int a2, int a3) {
        int a4 = a >> 16 & 0xFF;
        int a5 = a >> 8 & 0xFF;
        int a6 = a & 0xFF;
        int a7 = a2 >> 16 & 0xFF;
        int a8 = a2 >> 8 & 0xFF;
        int a9 = a2 & 0xFF;
        return Math.abs((int)(a4 - a7)) <= a3 && Math.abs((int)(a5 - a8)) <= a3 && Math.abs((int)(a6 - a9)) <= a3;
    }

    public static int Method1691(int a, int a2, int a3) {
        return Class767.Method1693(a, a2, a3, 255);
    }

    public static int Method1692(int a, int a2, int a3, int a4, int a5) {
        return a2 & ~a5 | Class767.Method1693(a & a5, a2, a3, a4);
    }

    public static int Method1693(int a, int a2, int a3, int a4) {
        boolean a5 = Class193.Method1270();
        return a;
    }
}