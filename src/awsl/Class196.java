/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class776;
import java.awt.image.BufferedImage;

public class Class196
extends Class193 {
    private float Field1166;
    private float Field1167;
    private int Field1168 = 1;
    private boolean Field1169 = true;

    public Class196() {
    }

    public Class196(float a, float a2, int a3) {
        this.Field1166 = a;
        this.Field1167 = a2;
        this.Field1168 = a3;
    }

    public void Method87(boolean a) {
        this.Field1169 = a;
    }

    public boolean Method88() {
        return this.Field1169;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        a2 = this.Method1263(a, null);
        int[] a5 = new int[a3 * a4];
        int[] a6 = new int[a3 * a4];
        this.Method104(a, 0, 0, a3, a4, a5);
        if (this.Field1169) {
            Class776.Method1727(a5, 0, a5.length);
        }
        for (int a7 = 0; a7 < this.Field1168; ++a7) {
            Class196.Method1278(a5, a6, a3, a4, this.Field1166);
            Class196.Method1278(a6, a5, a4, a3, this.Field1167);
        }
        Class196.Method1279(a5, a6, a3, a4, this.Field1166);
        Class196.Method1279(a6, a5, a4, a3, this.Field1167);
        if (this.Field1169) {
            Class776.Method1728(a5, 0, a5.length);
        }
        this.Method1267(a2, 0, 0, a3, a4, a5);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void Method1278(int[] a, int[] a2, int a3, int a4, float a5) {
        void a6;
        int n = a3 - 1;
        int n2 = (int)a5;
        boolean a7 = Class193.Method1269();
        int a8 = 2 * a6 + 1;
        int[] a9 = new int[256 * a8];
        int a10 = 0;
        if (a10 < 256 * a8) {
            a9[a10] = a10 / a8;
            ++a10;
        }
        a10 = 0;
        int a11 = 0;
        if (a11 < a4) {
            int a12;
            int a13 = a11;
            int a14 = 0;
            int a15 = 0;
            int a16 = 0;
            int a17 = 0;
            int a18 = -a6;
            if (a18 <= a6) {
                a12 = a[a10 + Class776.Method1712(a18, 0, a3 - 1)];
                a14 += a12 >> 24 & 0xFF;
                a15 += a12 >> 16 & 0xFF;
                a16 += a12 >> 8 & 0xFF;
                a17 += a12 & 0xFF;
                ++a18;
            }
            if ((a18 = 0) < a3) {
                void a19;
                a2[a13] = a9[a14] << 24 | a9[a15] << 16 | a9[a16] << 8 | a9[a17];
                a12 = a18 + a6 + 1;
                if (a12 > a19) {
                    a12 = a19;
                }
                int a20 = a18 - a6;
                a20 = 0;
                int a21 = a[a10 + a12];
                int a22 = a[a10 + a20];
                a14 += (a21 >> 24 & 0xFF) - (a22 >> 24 & 0xFF);
                a15 += (a21 & 0xFF0000) - (a22 & 0xFF0000) >> 16;
                a16 += (a21 & 0xFF00) - (a22 & 0xFF00) >> 8;
                a17 += (a21 & 0xFF) - (a22 & 0xFF);
                a13 += a4;
                ++a18;
            }
            a10 += a3;
            ++a11;
        }
    }

    public static void Method1279(int[] a, int[] a2, int a3, int a4, float a5) {
        a5 -= (float)((int)a5);
        float a6 = 1.0f / (1.0f + 2.0f * a5);
        int a7 = 0;
        for (int a8 = 0; a8 < a4; ++a8) {
            int a9 = a8;
            a2[a9] = a[0];
            a9 += a4;
            for (int a10 = 1; a10 < a3 - 1; ++a10) {
                int a11 = a7 + a10;
                int a12 = a[a11 - 1];
                int a13 = a[a11];
                int a14 = a[a11 + 1];
                int a15 = a12 >> 24 & 0xFF;
                int a16 = a12 >> 16 & 0xFF;
                int a17 = a12 >> 8 & 0xFF;
                int a18 = a12 & 0xFF;
                int a19 = a13 >> 24 & 0xFF;
                int a20 = a13 >> 16 & 0xFF;
                int a21 = a13 >> 8 & 0xFF;
                int a22 = a13 & 0xFF;
                int a23 = a14 >> 24 & 0xFF;
                int a24 = a14 >> 16 & 0xFF;
                int a25 = a14 >> 8 & 0xFF;
                int a26 = a14 & 0xFF;
                a15 = a19 + (int)((float)(a15 + a23) * a5);
                a16 = a20 + (int)((float)(a16 + a24) * a5);
                a17 = a21 + (int)((float)(a17 + a25) * a5);
                a18 = a22 + (int)((float)(a18 + a26) * a5);
                a15 = (int)((float)a15 * a6);
                a16 = (int)((float)a16 * a6);
                a17 = (int)((float)a17 * a6);
                a18 = (int)((float)a18 * a6);
                a2[a9] = a15 << 24 | a16 << 16 | a17 << 8 | a18;
                a9 += a4;
            }
            a2[a9] = a[a3 - 1];
            a7 += a3;
        }
    }

    public void Method56(float a) {
        this.Field1166 = a;
    }

    public float Method57() {
        return this.Field1166;
    }

    public void Method58(float a) {
        this.Field1167 = a;
    }

    public float Method59() {
        return this.Field1167;
    }

    public void Method60(float a) {
        this.Field1166 = this.Field1167 = a;
    }

    public float Method61() {
        return this.Field1166;
    }

    public void Method9(int a) {
        this.Field1168 = a;
    }

    public int Method10() {
        return this.Field1168;
    }

    public String toString() {
        return "Blur/Box Blur...";
    }
}