/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class187;
import awsl.Class193;
import awsl.Class767;
import java.awt.image.BufferedImage;

public class Class180
extends Class187 {
    private float Field1129 = 0.5f;

    public Class180() {
        this.Field1150 = 2.0f;
    }

    public void Method58(float a) {
        this.Field1129 = a;
    }

    public float Method59() {
        return this.Field1129;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        int a4 = a.getWidth();
        int n = a.getHeight();
        boolean a5 = Class193.Method1270();
        a2 = this.Method1263(a, null);
        int[] a6 = new int[a4 * a3];
        int[] a7 = new int[a4 * a3];
        a.getRGB(0, 0, a4, (int)a3, a6, 0, a4);
        if (this.Field1150 > 0.0f) {
            Class180.Method1293(this.Field1151, a6, a7, a4, (int)a3, this.Field1139, this.Field1139 && this.Field1140, false, Field1136);
            Class180.Method1293(this.Field1151, a7, a6, (int)a3, a4, this.Field1139, false, this.Field1139 && this.Field1140, Field1136);
        }
        a.getRGB(0, 0, a4, (int)a3, a7, 0, a4);
        float a8 = 4.0f * this.Field1129;
        int a9 = 0;
        int a10 = 0;
        if (a10 < a3) {
            int a11 = 0;
            if (a11 < a4) {
                int a12 = a7[a9];
                int a13 = a12 >> 16 & 0xFF;
                int a14 = a12 >> 8 & 0xFF;
                int a15 = a12 & 0xFF;
                int a16 = a6[a9];
                int a17 = a16 >> 16 & 0xFF;
                int a18 = a16 >> 8 & 0xFF;
                int a19 = a16 & 0xFF;
                a13 = Class767.Method1687((int)((float)a13 + a8 * (float)a17));
                a14 = Class767.Method1687((int)((float)a14 + a8 * (float)a18));
                a15 = Class767.Method1687((int)((float)a15 + a8 * (float)a19));
                a6[a9] = a12 & 0xFF000000 | a13 << 16 | a14 << 8 | a15;
                ++a9;
                ++a11;
            }
            ++a10;
        }
        a2.setRGB(0, 0, a4, (int)a3, a6, 0, a4);
        return a2;
    }

    @Override
    public String toString() {
        return "Blur/Glow...";
    }
}