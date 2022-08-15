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
import awsl.Class767;
import awsl.Class776;
import java.awt.image.BufferedImage;

public class Class75
extends Class193 {
    private float Field693 = 0.1f;
    private boolean Field694;
    private boolean Field695;
    private BufferedImage Field696;

    public void Method56(float a) {
        this.Field693 = a;
    }

    public float Method57() {
        return this.Field693;
    }

    public void Method1271(BufferedImage a) {
        this.Field696 = a;
    }

    public BufferedImage Method1272() {
        return this.Field696;
    }

    public void Method87(boolean a) {
        this.Field694 = a;
    }

    public boolean Method88() {
        return this.Field694;
    }

    public void Method1282(boolean a) {
        this.Field695 = a;
    }

    public boolean Method1283() {
        return this.Field695;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        int n = a.getWidth();
        boolean a4 = Class193.Method1270();
        int a5 = a.getHeight();
        a2 = this.Method1263(a, null);
        if (this.Field696 == null) {
            return a2;
        }
        int a6 = this.Field696.getWidth();
        int a7 = this.Field696.getHeight();
        float a8 = 255.0f * this.Field693;
        int[] a9 = new int[a3];
        int[] a10 = new int[a6];
        int a11 = 0;
        if (a11 < a5) {
            this.Method104(a, 0, a11, (int)a3, 1, a9);
            this.Method104(this.Field696, 0, a11 % a7, a6, 1, a10);
            int a12 = 0;
            if (a12 < a3) {
                int a13;
                int a14;
                int a15;
                int a16 = a10[a12 % a6];
                int a17 = a9[a12];
                if (this.Field694) {
                    a16 ^= 0xFFFFFF;
                }
                if (this.Field695) {
                    a15 = Class767.Method1689(a16);
                    a14 = Class767.Method1689(a17);
                    float a18 = 1.0f - Class776.Method1708((float)a14 - a8, (float)a14 + a8, a15);
                    a13 = (int)(255.0f * a18);
                    a9[a12] = a17 & 0xFF000000 | a13 << 16 | a13 << 8 | a13;
                }
                a15 = a17 >> 16 & 0xFF;
                a14 = a17 >> 8 & 0xFF;
                int a19 = a17 & 0xFF;
                a13 = a16 >> 16 & 0xFF;
                int a20 = a16 >> 8 & 0xFF;
                int a21 = a16 & 0xFF;
                int a22 = (int)(255.0f * (1.0f - Class776.Method1708((float)a15 - a8, (float)a15 + a8, a13)));
                int a23 = (int)(255.0f * (1.0f - Class776.Method1708((float)a14 - a8, (float)a14 + a8, a20)));
                int a24 = (int)(255.0f * (1.0f - Class776.Method1708((float)a19 - a8, (float)a19 + a8, a21)));
                a9[a12] = a17 & 0xFF000000 | a22 << 16 | a23 << 8 | a24;
                ++a12;
            }
            this.Method1267(a2, 0, a11, (int)a3, 1, a9);
            ++a11;
        }
        return a2;
    }

    public String toString() {
        return "Stylize/Halftone...";
    }
}