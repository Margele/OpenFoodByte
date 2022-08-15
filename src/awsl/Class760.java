/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class798;
import java.awt.Rectangle;

public class Class760
extends Class798 {
    private int Method1767(int[] a) {
        int a2 = 0;
        int a3 = 0;
        int a4 = Integer.MAX_VALUE;
        int a5 = Integer.MIN_VALUE;
        for (int a6 = 0; a6 < 9; ++a6) {
            if (a6 == 4) continue;
            if (a[a6] < a4) {
                a4 = a[a6];
                a2 = a6;
            }
            if (a[a6] <= a5) continue;
            a5 = a[a6];
            a3 = a6;
        }
        if (a[4] < a4) {
            return a[a2];
        }
        if (a[4] > a5) {
            return a[a3];
        }
        return a[4];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int a5 = 0;
        int[] a6 = new int[9];
        int[] nArray = new int[9];
        boolean a7 = Class193.Method1270();
        int[] a8 = new int[9];
        int[] a9 = new int[a * a2];
        int a10 = 0;
        if (a10 < a2) {
            int a11 = 0;
            if (a11 < a) {
                void a12;
                int a13 = 0;
                int a14 = a3[a5];
                int a15 = a14 >> 16 & 0xFF;
                int a16 = a14 >> 8 & 0xFF;
                int a17 = a14 & 0xFF;
                int a18 = -1;
                if (a18 <= 1) {
                    int a19;
                    int a20 = a10 + a18;
                    if (0 <= a20 && a20 < a2) {
                        a19 = a20 * a;
                        int a21 = -1;
                        if (a21 <= 1) {
                            int a22 = a11 + a21;
                            if (0 <= a22 && a22 < a) {
                                int a23 = a3[a19 + a22];
                                a6[a13] = a23 >> 16 & 0xFF;
                                a12[a13] = a23 >> 8 & 0xFF;
                                a8[a13] = a23 & 0xFF;
                            }
                            a6[a13] = a15;
                            a12[a13] = a16;
                            a8[a13] = a17;
                            ++a13;
                            ++a21;
                        }
                    }
                    if ((a19 = -1) <= 1) {
                        a6[a13] = a15;
                        a12[a13] = a16;
                        a8[a13] = a17;
                        ++a13;
                        ++a19;
                    }
                    ++a18;
                }
                a9[a5] = a3[a5] & 0xFF000000 | this.Method1767(a6) << 16 | this.Method1767((int[])a12) << 8 | this.Method1767(a8);
                ++a5;
                ++a11;
            }
            ++a10;
        }
        return a9;
    }

    public String toString() {
        return "Blur/Smooth";
    }
}