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
import java.awt.image.BufferedImage;

public class Class92
extends Class193 {
    public static final int Field803 = 0;
    public static final int Field804 = 1;
    public static final int Field805 = 2;
    private int Field806 = 0;

    public void Method9(int a) {
        this.Field806 = a;
    }

    public int Method10() {
        return this.Field806;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        void a4;
        int n = a.getWidth();
        int n2 = a.getHeight();
        boolean a5 = Class193.Method1269();
        a2 = this.Method1263(a, null);
        int[] a6 = null;
        if (this.Field806 == 0) {
            int a7 = 0;
            if (a7 < a4 - true) {
                a6 = this.Method104(a, 0, a7, (int)a3, 1, a6);
                if (a != a2) {
                    this.Method1267(a2, 0, a7, (int)a3, 1, a6);
                }
                this.Method1267(a2, 0, a7 + 1, (int)a3, 1, a6);
                a7 += 2;
            }
        } else if (this.Field806 == 1) {
            int a8 = 1;
            if (a8 < a4) {
                a6 = this.Method104(a, 0, a8, (int)a3, 1, a6);
                if (a != a2) {
                    this.Method1267(a2, 0, a8, (int)a3, 1, a6);
                }
                this.Method1267(a2, 0, a8 - 1, (int)a3, 1, a6);
                a8 += 2;
            }
        } else if (this.Field806 == 2) {
            int[] a9 = null;
            int a10 = 0;
            if (a10 < a4 - true) {
                a6 = this.Method104(a, 0, a10, (int)a3, 1, a6);
                a9 = this.Method104(a, 0, a10 + 1, (int)a3, 1, a9);
                int a11 = 0;
                if (a11 < a3) {
                    int a12 = a6[a11];
                    int a13 = a9[a11];
                    int a14 = a12 >> 24 & 0xFF;
                    int a15 = a12 >> 16 & 0xFF;
                    int a16 = a12 >> 8 & 0xFF;
                    int a17 = a12 & 0xFF;
                    int a18 = a13 >> 24 & 0xFF;
                    int a19 = a13 >> 16 & 0xFF;
                    int a20 = a13 >> 8 & 0xFF;
                    int a21 = a13 & 0xFF;
                    a14 = (a14 + a18) / 2;
                    a15 = (a15 + a19) / 2;
                    a16 = (a16 + a20) / 2;
                    a17 = (a17 + a21) / 2;
                    a6[a11] = a14 << 24 | a15 << 16 | a16 << 8 | a17;
                    ++a11;
                }
                this.Method1267(a2, 0, a10, (int)a3, 1, a6);
                this.Method1267(a2, 0, a10 + 1, (int)a3, 1, a6);
                a10 += 2;
            }
        }
        return a2;
    }

    public String toString() {
        return "Video/De-Interlace";
    }
}