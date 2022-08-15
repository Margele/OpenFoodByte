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

public class Class76
extends Class193 {
    private float Field697 = 0.0f;
    private float Field698 = 0.0f;
    private boolean Field699;
    private BufferedImage Field700;

    public void Method56(float a) {
        this.Field697 = a;
    }

    public float Method57() {
        return this.Field697;
    }

    public void Method58(float a) {
        this.Field698 = a;
    }

    public float Method59() {
        return this.Field698;
    }

    public void Method1271(BufferedImage a) {
        this.Field700 = a;
    }

    public BufferedImage Method1272() {
        return this.Field700;
    }

    public void Method87(boolean a) {
        this.Field699 = a;
    }

    public boolean Method88() {
        return this.Field699;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        int a4 = a.getWidth();
        int n = a.getHeight();
        boolean a5 = Class193.Method1269();
        a2 = this.Method1263(a, null);
        if (this.Field700 == null) {
            return a2;
        }
        int a6 = this.Field700.getWidth();
        int a7 = this.Field700.getHeight();
        float a8 = this.Field697 * (1.0f + this.Field698);
        float a9 = 255.0f * (a8 - this.Field698);
        float a10 = 255.0f * a8;
        int[] a11 = new int[a4];
        int[] a12 = new int[a6];
        int a13 = 0;
        if (a13 < a3) {
            this.Method104(a, 0, a13, a4, 1, a11);
            this.Method104(this.Field700, 0, a13 % a7, a6, 1, a12);
            int a14 = 0;
            if (a14 < a4) {
                int a15 = a12[a14 % a6];
                int a16 = a11[a14];
                int a17 = Class767.Method1689(a15);
                float a18 = Class776.Method1708(a9, a10, a17);
                int a19 = (int)(255.0f * a18);
                if (this.Field699) {
                    a19 = 255 - a19;
                }
                a11[a14] = a19 << 24 | a16 & 0xFFFFFF;
                ++a14;
            }
            this.Method1267(a2, 0, a13, a4, 1, a11);
            ++a13;
        }
        return a2;
    }

    public String toString() {
        return "Transitions/Gradient Wipe...";
    }
}