/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class798;
import java.awt.Rectangle;

public class Class836
extends Class798 {
    private int Method1767(int[] a) {
        int a2;
        int a3;
        for (a3 = 0; a3 < 4; ++a3) {
            a2 = 0;
            int a4 = 0;
            for (int a5 = 0; a5 < 9; ++a5) {
                if (a[a5] <= a2) continue;
                a2 = a[a5];
                a4 = a5;
            }
            a[a4] = 0;
        }
        a2 = 0;
        for (a3 = 0; a3 < 9; ++a3) {
            if (a[a3] <= a2) continue;
            a2 = a[a3];
        }
        return a2;
    }

    private int Method3779(int[] a, int[] a2, int[] a3) {
        int a4 = 0;
        int a5 = Integer.MAX_VALUE;
        for (int a6 = 0; a6 < 9; ++a6) {
            int a7 = 0;
            for (int a8 = 0; a8 < 9; ++a8) {
                a7 += Math.abs((int)(a[a6] - a[a8]));
                a7 += Math.abs((int)(a2[a6] - a2[a8]));
                a7 += Math.abs((int)(a3[a6] - a3[a8]));
            }
            if (a7 >= a5) continue;
            a5 = a7;
            a4 = a6;
        }
        return a4;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int a5 = 0;
        int[] a6 = new int[9];
        int[] nArray = new int[9];
        int[] nArray2 = new int[9];
        boolean a7 = Class193.Method1269();
        int[] a8 = new int[9];
        int[] a9 = new int[a * a2];
        int a10 = 0;
        if (a10 < a2) {
            int a11 = 0;
            if (a11 < a) {
                void a12;
                void a13;
                int a14 = 0;
                int a15 = -1;
                if (a15 <= 1) {
                    int a16 = a10 + a15;
                    if (0 <= a16 && a16 < a2) {
                        int a17 = a16 * a;
                        int a18 = -1;
                        if (a18 <= 1) {
                            int a19 = a11 + a18;
                            if (0 <= a19 && a19 < a) {
                                int a20;
                                a6[a14] = a20 = a3[a17 + a19];
                                a13[a14] = a20 >> 16 & 0xFF;
                                a12[a14] = a20 >> 8 & 0xFF;
                                a8[a14] = a20 & 0xFF;
                                ++a14;
                            }
                            ++a18;
                        }
                    }
                    ++a15;
                }
                if (a14 < 9) {
                    a6[a14] = -16777216;
                    a8[a14] = 0;
                    a12[a14] = 0;
                    a13[a14] = 0;
                    ++a14;
                }
                a9[a5++] = a6[this.Method3779((int[])a13, (int[])a12, a8)];
                ++a11;
            }
            ++a10;
        }
        return a9;
    }

    public String toString() {
        return "Blur/Median";
    }
}