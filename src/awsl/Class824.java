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
import awsl.Class765;
import awsl.Class767;
import awsl.Class798;
import java.awt.Rectangle;

public class Class824
extends Class798 {
    protected static final int[] Field3661 = new int[]{0, 0, 0, 0, 0, 7, 3, 5, 1};
    private int Field3662 = 16;
    private boolean Field3663;
    private int Field3664 = 256;
    private boolean Field3665 = true;

    public void Method9(int a) {
        this.Field3664 = Math.min((int)Math.max((int)a, (int)8), (int)256);
    }

    public int Method10() {
        return this.Field3664;
    }

    public void Method87(boolean a) {
        this.Field3663 = a;
    }

    public boolean Method88() {
        return this.Field3663;
    }

    public void Method1282(boolean a) {
        this.Field3665 = a;
    }

    public boolean Method1283() {
        return this.Field3665;
    }

    /*
     * WARNING - void declaration
     */
    public void Method3632(int[] a, int[] a2, int a3, int a4, int a5, boolean a6, boolean a7) {
        void a8;
        int a9 = a3 * a4;
        Class765 a10 = new Class765();
        a10.Method1781(a5);
        boolean bl = Class193.Method1269();
        a10.Method1782(a, 0, a9);
        int[] nArray = a10.Method1783();
        boolean a11 = bl;
        int a12 = 0;
        if (a12 < a9) {
            a2[a12] = a8[a10.Method1784(a[a12])];
            ++a12;
        }
        a12 = 0;
        int a13 = 0;
        if (a13 < a4) {
            boolean a14 = (a13 & 1) == 1;
            a12 = a13 * a3 + a3 - 1;
            int a15 = -1;
            a12 = a13 * a3;
            a15 = 1;
            int a16 = 0;
            if (a16 < a3) {
                int a17 = a[a12];
                void a18 = a8[a10.Method1784(a17)];
                a2[a12] = a18;
                int a19 = a17 >> 16 & 0xFF;
                int a20 = a17 >> 8 & 0xFF;
                int a21 = a17 & 0xFF;
                int a22 = a18 >> 16 & 0xFF;
                int a23 = a18 >> 8 & 0xFF;
                int a24 = a18 & 0xFF;
                int a25 = a19 - a22;
                int a26 = a20 - a23;
                int a27 = a21 - a24;
                int a28 = -1;
                if (a28 <= 1) {
                    int a29;
                    int a30 = a28 + a13;
                    if (0 <= a30 && a30 < a4 && (a29 = -1) <= 1) {
                        int a31 = a29 + a16;
                        if (0 <= a31 && a31 < a3) {
                            int a32 = Field3661[(a28 + 1) * 3 - a29 + 1];
                            a32 = Field3661[(a28 + 1) * 3 + a29 + 1];
                            int a33 = a12 - a29;
                            a17 = a[a33];
                            a19 = a17 >> 16 & 0xFF;
                            a20 = a17 >> 8 & 0xFF;
                            a21 = a17 & 0xFF;
                            a[a33] = Class767.Method1687(a19 += a25 * a32 / this.Field3662) << 16 | Class767.Method1687(a20 += a26 * a32 / this.Field3662) << 8 | Class767.Method1687(a21 += a27 * a32 / this.Field3662);
                        }
                        ++a29;
                    }
                    ++a28;
                }
                a12 += a15;
                ++a16;
            }
            ++a13;
        }
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int[] a5 = new int[a * a2];
        this.Method3632(a3, a5, a, a2, this.Field3664, this.Field3663, this.Field3665);
        return a5;
    }

    public String toString() {
        return "Colors/Quantize...";
    }
}