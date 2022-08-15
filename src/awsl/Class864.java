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
import awsl.Class767;
import awsl.Class798;
import java.awt.Rectangle;

public class Class864
extends Class798 {
    private static final int[] Field3771 = new int[]{0, 0, 0, 0, 0, 7, 3, 5, 1};
    private int[] Field3772;
    private int Field3773 = 16;
    private boolean Field3774 = true;
    private boolean Field3775 = true;
    private int Field3776 = 6;

    public Class864() {
        this.Method85(Field3771);
    }

    public void Method87(boolean a) {
        this.Field3774 = a;
    }

    public boolean Method88() {
        return this.Field3774;
    }

    public void Method1282(boolean a) {
        this.Field3775 = a;
    }

    public boolean Method1283() {
        return this.Field3775;
    }

    public void Method85(int[] a) {
        this.Field3772 = a;
        this.Field3773 = 0;
        for (int a2 = 0; a2 < a.length; ++a2) {
            this.Field3773 += a[a2];
        }
    }

    public int[] Method3438() {
        return this.Field3772;
    }

    public void Method9(int a) {
        this.Field3776 = a;
    }

    public int Method10() {
        return this.Field3776;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        void a5;
        int a6;
        int[] nArray = new int[a * a2];
        boolean bl = false;
        boolean a7 = Class193.Method1270();
        int[] a8 = new int[this.Field3776];
        int a9 = 0;
        if (a9 < this.Field3776) {
            a8[a9] = a6 = 255 * a9 / (this.Field3776 - 1);
            ++a9;
        }
        int[] a22 = new int[256];
        a6 = 0;
        if (a6 < 256) {
            a22[a6] = this.Field3776 * a6 / 256;
            ++a6;
        }
        if ((a6 = 0) < a2) {
            boolean a10 = this.Field3774 && (a6 & 1) == 1;
            int a11 = a6 * a + a - 1;
            int a12 = -1;
            a11 = a6 * a;
            a12 = 1;
            int a13 = 0;
            if (a13 < a) {
                int a14 = a3[a11];
                int a15 = a14 >> 16 & 0xFF;
                int a16 = a14 >> 8 & 0xFF;
                int a17 = a14 & 0xFF;
                if (!this.Field3775) {
                    a16 = a17 = (a15 + a16 + a17) / 3;
                    a15 = a17;
                }
                int a18 = a8[a22[a15]];
                int a19 = a8[a22[a16]];
                int a20 = a8[a22[a17]];
                a5[a11] = a14 & 0xFF000000 | a18 << 16 | a19 << 8 | a20;
                int a21 = a15 - a18;
                int a23 = a16 - a19;
                int a24 = a17 - a20;
                int a25 = -1;
                if (a25 <= 1) {
                    int a26;
                    int a27 = a25 + a6;
                    if (0 <= a27 && a27 < a2 && (a26 = -1) <= 1) {
                        int a28 = a26 + a13;
                        if (0 <= a28 && a28 < a) {
                            int a29 = this.Field3772[(a25 + 1) * 3 - a26 + 1];
                            a29 = this.Field3772[(a25 + 1) * 3 + a26 + 1];
                            int a30 = a11 - a26;
                            a14 = a3[a30];
                            a15 = a14 >> 16 & 0xFF;
                            a16 = a14 >> 8 & 0xFF;
                            a17 = a14 & 0xFF;
                            a3[a30] = a3[a30] & 0xFF000000 | Class767.Method1687(a15 += a21 * a29 / this.Field3773) << 16 | Class767.Method1687(a16 += a23 * a29 / this.Field3773) << 8 | Class767.Method1687(a17 += a24 * a29 / this.Field3773);
                        }
                        ++a26;
                    }
                    ++a25;
                }
                a11 += a12;
                ++a13;
            }
            ++a6;
        }
        return a5;
    }

    public String toString() {
        return "Colors/Diffusion Dither...";
    }
}