/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Composite
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class100;
import awsl.Class147;
import awsl.Class193;
import awsl.Class196;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Class94
extends Class193 {
    private float Field810 = 1.0f;
    private float Field811 = 2.0f;
    private boolean Field812 = true;
    private boolean Field813;

    public void Method56(float a) {
        this.Field810 = a;
    }

    public float Method57() {
        return this.Field810;
    }

    public void Method58(float a) {
        this.Field811 = a;
    }

    public float Method59() {
        return this.Field811;
    }

    public void Method87(boolean a) {
        this.Field812 = a;
    }

    public boolean Method88() {
        return this.Field812;
    }

    public void Method1282(boolean a) {
        this.Field813 = a;
    }

    public boolean Method1283() {
        return this.Field813;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        BufferedImage a4;
        int a5 = a.getWidth();
        int a6 = a.getHeight();
        BufferedImage a7 = new Class196(this.Field810, this.Field810, 3).Method62(a, null);
        BufferedImage bufferedImage = new Class196(this.Field811, this.Field811, 3).Method62(a, null);
        Graphics2D graphics2D = a4.createGraphics();
        boolean a8 = Class193.Method1270();
        a3.setComposite((Composite)new Class147(1.0f));
        a3.drawImage((Image)a7, 0, 0, null);
        a3.dispose();
        if (this.Field812 && this.Field810 != this.Field811) {
            int a9;
            int a10;
            int a11;
            int a12;
            int a13;
            int[] a14 = null;
            int a15 = 0;
            int a16 = 0;
            if (a16 < a6) {
                a14 = this.Method104(a4, 0, a16, a5, 1, a14);
                a13 = 0;
                if (a13 < a5) {
                    a12 = a14[a13];
                    a11 = a12 >> 16 & 0xFF;
                    a10 = a12 >> 8 & 0xFF;
                    a9 = a12 & 0xFF;
                    if (a11 > a15) {
                        a15 = a11;
                    }
                    if (a10 > a15) {
                        a15 = a10;
                    }
                    if (a9 > a15) {
                        a15 = a9;
                    }
                    ++a13;
                }
                ++a16;
            }
            if ((a16 = 0) < a6) {
                a14 = this.Method104(a4, 0, a16, a5, 1, a14);
                a13 = 0;
                if (a13 < a5) {
                    a12 = a14[a13];
                    a11 = a12 >> 16 & 0xFF;
                    a10 = a12 >> 8 & 0xFF;
                    a9 = a12 & 0xFF;
                    a11 = a11 * 255 / a15;
                    a10 = a10 * 255 / a15;
                    a9 = a9 * 255 / a15;
                    a14[a13] = a12 & 0xFF000000 | a11 << 16 | a10 << 8 | a9;
                    ++a13;
                }
                this.Method1267(a4, 0, a16, a5, 1, a14);
                ++a16;
            }
        }
        if (this.Field813) {
            a4 = new Class100().Method62(a4, a4);
        }
        return a4;
    }

    public String toString() {
        return "Edges/Difference of Gaussians...";
    }
}