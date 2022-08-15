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
import java.awt.image.BufferedImage;

public class Class179
extends Class187 {
    public Class179() {
        this.Field1150 = 10.0f;
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
            Class179.Method1293(this.Field1151, a6, a7, a4, (int)a3, this.Field1139, this.Field1139 && this.Field1140, false, Field1136);
            Class179.Method1293(this.Field1151, a7, a6, (int)a3, a4, this.Field1139, false, this.Field1139 && this.Field1140, Field1136);
        }
        a.getRGB(0, 0, a4, (int)a3, a7, 0, a4);
        int a8 = 0;
        int a9 = 0;
        if (a9 < a3) {
            int a10 = 0;
            if (a10 < a4) {
                int a11 = a7[a8];
                int a12 = a11 >> 16 & 0xFF;
                int a13 = a11 >> 8 & 0xFF;
                int a14 = a11 & 0xFF;
                int a15 = a6[a8];
                int a16 = a15 >> 16 & 0xFF;
                int a17 = a15 >> 8 & 0xFF;
                int a18 = a15 & 0xFF;
                a12 = (a12 + 255 - a16) / 2;
                a13 = (a13 + 255 - a17) / 2;
                a14 = (a14 + 255 - a18) / 2;
                a6[a8] = a11 & 0xFF000000 | a12 << 16 | a13 << 8 | a14;
                ++a8;
                ++a10;
            }
            ++a9;
        }
        a2.setRGB(0, 0, a4, (int)a3, a6, 0, a4);
        return a2;
    }

    @Override
    public String toString() {
        return "Blur/High Pass...";
    }
}