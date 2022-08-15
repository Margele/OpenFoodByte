/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.image.BufferedImage;

public class Class80
extends Class193 {
    private void Method85(int[] a) {
        for (int a2 = 0; a2 < a.length; ++a2) {
            int a3 = a[a2];
            int a4 = a3 >> 16 & 0xFF;
            int a5 = a3 >> 8 & 0xFF;
            int a6 = a3 & 0xFF;
            a[a2] = (a4 + a5 + a6) / 3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3;
        void a4;
        int n = a.getWidth();
        boolean a5 = Class193.Method1269();
        int a6 = a.getHeight();
        a2 = this.Method1263(a, null);
        int[] a7 = null;
        int[] a8 = null;
        int[] a9 = null;
        int[] a10 = new int[a4];
        a7 = this.Method104(a, 0, 0, (int)a4, 1, a7);
        a8 = this.Method104(a, 0, 0, (int)a4, 1, a8);
        this.Method85(a7);
        this.Method85(a8);
        int a11 = 0;
        if (a11 < a6) {
            if (a11 < a6 - 1) {
                a9 = this.Method104(a, 0, a11 + 1, (int)a4, 1, a9);
                this.Method85(a9);
            }
            a10[a4 - true] = -16777216;
            a10[0] = -16777216;
            int a12 = 1;
            if (a12 < a4 - true) {
                int a13;
                a3 = a8[a12 - 1];
                int a14 = a7[a12];
                int a15 = a9[a12];
                int a16 = a8[a12 + 1];
                int a17 = a8[a12];
                int a18 = Math.max((int)Math.max((int)a3, (int)a14), (int)Math.max((int)a15, (int)a16));
                int a19 = Math.min((int)Math.min((int)a3, (int)a14), (int)Math.min((int)a15, (int)a16));
                int a20 = (int)(0.5f * (float)Math.max((int)(a18 - a17), (int)(a17 - a19)));
                a10[a12] = a13 = a7[a12 - 1] + a7[a12] + a7[a12 + 1] + a8[a12 - 1] - 8 * a8[a12] + a8[a12 + 1] + a9[a12 - 1] + a9[a12] + a9[a12 + 1] > 0 ? a20 : 128 + a20;
                ++a12;
            }
            this.Method1267(a2, 0, a11, (int)a4, 1, a10);
            int[] a22 = a7;
            a7 = a8;
            a8 = a9;
            a9 = a22;
            ++a11;
        }
        a7 = this.Method104(a2, 0, 0, (int)a4, 1, a7);
        a8 = this.Method104(a2, 0, 0, (int)a4, 1, a8);
        a11 = 0;
        if (a11 < a6) {
            if (a11 < a6 - 1) {
                a9 = this.Method104(a2, 0, a11 + 1, (int)a4, 1, a9);
            }
            a10[a4 - true] = -16777216;
            a10[0] = -16777216;
            a = 1;
            if (a < a4 - true) {
                a3 = a8[a];
                a3 = a3 <= 128 && (a7[a - 1] > 128 || a7[a] > 128 || a7[a + 1] > 128 || a8[a - 1] > 128 || a8[a + 1] > 128 || a9[a - 1] > 128 || a9[a] > 128 || a9[a + 1] > 128) ? (a3 >= 128 ? a3 - 128 : a3) : 0;
                a10[a] = 0xFF000000 | a3 << 16 | a3 << 8 | a3;
                ++a;
            }
            this.Method1267(a2, 0, a11, (int)a4, 1, a10);
            int[] a32 = a7;
            a7 = a8;
            a8 = a9;
            a9 = a32;
            ++a11;
        }
        return a2;
    }

    public String toString() {
        return "Edges/Laplace...";
    }
}