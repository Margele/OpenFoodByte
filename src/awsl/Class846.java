/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class767;
import awsl.Class798;
import java.awt.Rectangle;

public class Class846
extends Class798 {
    private static final float Field3734 = 255.9f;
    private float Field3735 = 2.3561945f;
    private float Field3736 = 0.5235988f;
    private boolean Field3737 = false;
    private float Field3738 = 3.0f;

    public void Method56(float a) {
        this.Field3735 = a;
    }

    public float Method57() {
        return this.Field3735;
    }

    public void Method58(float a) {
        this.Field3736 = a;
    }

    public float Method59() {
        return this.Field3736;
    }

    public void Method60(float a) {
        this.Field3738 = 3.0f * a;
    }

    public float Method61() {
        return this.Field3738 / 3.0f;
    }

    public void Method87(boolean a) {
        this.Field3737 = a;
    }

    public boolean Method88() {
        return this.Field3737;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int a5;
        void a6;
        int a7 = 0;
        int[] a8 = new int[a * a2];
        int a9 = a;
        int n = a2;
        int[] a10 = new int[a9 * a6];
        boolean bl = false;
        boolean a11 = Class193.Method1269();
        if (a5 < a3.length) {
            a10[a5] = Class767.Method1689(a3[a5]);
            ++a5;
        }
        int a12 = (int)(Math.cos((double)this.Field3735) * Math.cos((double)this.Field3736) * (double)255.9f);
        int a13 = (int)(Math.sin((double)this.Field3735) * Math.cos((double)this.Field3736) * (double)255.9f);
        int a14 = (int)(Math.sin((double)this.Field3736) * (double)255.9f);
        int a15 = (int)(1530.0f / this.Field3738);
        int a16 = a15 * a15;
        int a17 = a15 * a14;
        int a18 = a14;
        int a19 = 0;
        int a20 = 0;
        if (a20 < a2) {
            int a21 = a19;
            int a22 = a21 + a9;
            int a23 = a22 + a9;
            int a24 = 0;
            if (a24 < a) {
                int a25;
                if (a20 < a2 - 2) {
                    if (a24 < a - 2) {
                        a5 = a10[a21 - 1] + a10[a22 - 1] + a10[a23 - 1] - a10[a21 + 1] - a10[a22 + 1] - a10[a23 + 1];
                        int a26 = a10[a23 - 1] + a10[a23] + a10[a23 + 1] - a10[a21 - 1] - a10[a21] - a10[a21 + 1];
                        a25 = a18;
                        int a27 = a5 * a12 + a26 * a13 + a17;
                        if (a27 < 0) {
                            a25 = 0;
                        }
                        a25 = (int)((double)a27 / Math.sqrt((double)(a5 * a5 + a26 * a26 + a16)));
                    }
                }
                a25 = a18;
                if (this.Field3737) {
                    int a28 = a3[a7];
                    int a29 = a28 & 0xFF000000;
                    int a30 = a28 >> 16 & 0xFF;
                    int a31 = a28 >> 8 & 0xFF;
                    int a32 = a28 & 0xFF;
                    a30 = a30 * a25 >> 8;
                    a31 = a31 * a25 >> 8;
                    a32 = a32 * a25 >> 8;
                    a8[a7++] = a29 | a30 << 16 | a31 << 8 | a32;
                }
                a8[a7++] = 0xFF000000 | a25 << 16 | a25 << 8 | a25;
                ++a24;
                ++a21;
                ++a22;
                ++a23;
            }
            ++a20;
            a19 += a9;
        }
        return a8;
    }

    public String toString() {
        return "Stylize/Emboss...";
    }
}