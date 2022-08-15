/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class798;
import java.awt.Rectangle;

public class Class818
extends Class798 {
    private int Field3655 = 3;
    private int Field3656 = 256;

    public void Method9(int a) {
        this.Field3655 = a;
    }

    public int Method10() {
        return this.Field3655;
    }

    public void Method11(int a) {
        this.Field3656 = a;
    }

    public int Method12() {
        return this.Field3656;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        boolean bl = false;
        int[] a5 = new int[this.Field3656];
        int[] nArray = new int[this.Field3656];
        boolean a6 = Class193.Method1269();
        int[] a7 = new int[this.Field3656];
        int[] a8 = new int[this.Field3656];
        int[] a9 = new int[this.Field3656];
        int[] a10 = new int[this.Field3656];
        int[] a11 = new int[a * a2];
        int a12 = 0;
        if (a12 < a2) {
            int a13 = 0;
            if (a13 < a) {
                void a14;
                void a15;
                int a16;
                int a17;
                int a18;
                int a19 = 0;
                if (a19 < this.Field3656) {
                    a10[a19] = 0;
                    a9[a19] = 0;
                    a8[a19] = 0;
                    a7[a19] = 0;
                    a15[a19] = 0;
                    a5[a19] = 0;
                    ++a19;
                }
                if ((a19 = -this.Field3655) <= this.Field3655) {
                    a18 = a12 + a19;
                    if (0 <= a18 && a18 < a2) {
                        a17 = a18 * a;
                        a16 = -this.Field3655;
                        if (a16 <= this.Field3655) {
                            int a20 = a13 + a16;
                            if (0 <= a20 && a20 < a) {
                                int a21 = a3[a17 + a20];
                                int a22 = a21 >> 16 & 0xFF;
                                int a23 = a21 >> 8 & 0xFF;
                                int a24 = a21 & 0xFF;
                                int a25 = a22 * this.Field3656 / 256;
                                int a26 = a23 * this.Field3656 / 256;
                                int a27 = a24 * this.Field3656 / 256;
                                int n = a25;
                                a8[n] = a8[n] + a22;
                                int n2 = a26;
                                a9[n2] = a9[n2] + a23;
                                int n3 = a27;
                                a10[n3] = a10[n3] + a24;
                                int n4 = a25;
                                a5[n4] = a5[n4] + 1;
                                void v4 = a15;
                                int n5 = a26;
                                v4[n5] = v4[n5] + true;
                                int n6 = a27;
                                a7[n6] = a7[n6] + 1;
                            }
                            ++a16;
                        }
                    }
                    ++a19;
                }
                a19 = 0;
                a18 = 0;
                a17 = 0;
                a16 = 1;
                if (a16 < this.Field3656) {
                    if (a5[a16] > a5[a19]) {
                        a19 = a16;
                    }
                    if (a15[a16] > a15[a18]) {
                        a18 = a16;
                    }
                    if (a7[a16] > a7[a17]) {
                        a17 = a16;
                    }
                    ++a16;
                }
                a19 = a8[a19] / a5[a19];
                a18 = a9[a18] / a15[a18];
                a17 = a10[a17] / a7[a17];
                a11[a14] = a3[a14] & 0xFF000000 | a19 << 16 | a18 << 8 | a17;
                ++a14;
                ++a13;
            }
            ++a12;
        }
        return a11;
    }

    public String toString() {
        return "Stylize/Oil...";
    }
}