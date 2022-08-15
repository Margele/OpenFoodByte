/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.AlphaComposite
 *  java.awt.Composite
 *  java.awt.Graphics2D
 *  java.awt.image.BufferedImage
 *  java.awt.image.RenderedImage
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class239;
import awsl.Class70;
import awsl.Class755;
import awsl.Class767;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class Class68
extends Class70 {
    private float Field659 = 1.0f;
    private float Field660 = 0.0f;
    private float Field661 = 0.5f;
    private boolean Field662 = false;
    private Class755 Field663;

    public void Method170(float a) {
        this.Field659 = a;
    }

    public float Method171() {
        return this.Field659;
    }

    public void Method172(float a) {
        this.Field660 = a;
    }

    public float Method173() {
        return this.Field660;
    }

    public void Method174(float a) {
        this.Field661 = a;
    }

    public float Method175() {
        return this.Field661;
    }

    public void Method87(boolean a) {
        this.Field662 = a;
    }

    public boolean Method88() {
        return this.Field662;
    }

    public void Method176(Class755 a) {
        this.Field663 = a;
    }

    public Class755 Method177() {
        return this.Field663;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        void a10;
        int a11 = a.getWidth();
        int n = a.getHeight();
        boolean a12 = Class193.Method1269();
        int[] a13 = new int[a11];
        int[] a14 = new int[a11];
        BufferedImage a15 = new BufferedImage(a11, (int)a10, 2);
        int a16 = (int)(this.Field660 * 3.0f * 255.0f);
        int a17 = 0;
        if (a17 < a10) {
            this.Method104(a, 0, a17, a11, 1, a13);
            a9 = 0;
            if (a9 < a11) {
                a8 = a13[a9];
                a7 = a8 & 0xFF000000;
                a6 = a8 >> 16 & 0xFF;
                a5 = a8 >> 8 & 0xFF;
                a4 = a8 & 0xFF;
                a3 = a6 + a5 + a4;
                if (a3 < a16) {
                    a13[a9] = -16777216;
                }
                a13[a9] = a7 | (a3 /= 3) << 16 | a3 << 8 | a3;
                ++a9;
            }
            this.Method1267(a15, 0, a17, a11, 1, a13);
            ++a17;
        }
        a15 = super.Method62(a15, null);
        a17 = 0;
        if (a17 < a10) {
            this.Method104(a15, 0, a17, a11, 1, a13);
            this.Method104(a, 0, a17, a11, 1, a14);
            a9 = 0;
            if (a9 < a11) {
                a8 = a13[a9];
                a7 = a8 & 0xFF000000;
                a6 = a8 >> 16 & 0xFF;
                a5 = a8 >> 8 & 0xFF;
                a4 = a8 & 0xFF;
                if (this.Field663 != null) {
                    a3 = a6 + a5 + a4;
                    a8 = this.Field663.Method283((float)a3 * this.Field661 * 0.33333334f);
                }
                a6 = Class767.Method1687((int)((float)a6 * this.Field661));
                a5 = Class767.Method1687((int)((float)a5 * this.Field661));
                a4 = Class767.Method1687((int)((float)a4 * this.Field661));
                a13[a9] = a8 = a7 | a6 << 16 | a5 << 8 | a4;
                ++a9;
            }
            this.Method1267(a15, 0, a17, a11, 1, a13);
            ++a17;
        }
        a2 = this.Method1263(a, null);
        Graphics2D a22 = a2.createGraphics();
        if (!this.Field662) {
            a22.setComposite((Composite)AlphaComposite.SrcOver);
            a22.drawRenderedImage((RenderedImage)a, null);
        }
        a22.setComposite(Class239.Method2275(1, this.Field659));
        a22.drawRenderedImage((RenderedImage)a15, null);
        a22.dispose();
        return a2;
    }

    @Override
    public String toString() {
        return "Stylize/Rays...";
    }
}