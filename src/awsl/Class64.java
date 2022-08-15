/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.geom.AffineTransform
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Float
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class767;
import awsl.Class776;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class64
extends Class193 {
    private float Field639 = 0.0f;
    private float Field640 = 1.0f;
    private float Field641 = 1.0f;
    private float Field642 = 0.0f;
    private float Field643 = 0.0f;
    private boolean Field644 = false;
    private boolean Field645 = true;

    public Class64() {
    }

    public Class64(float a, float a2, float a3, float a4) {
        this.Field641 = a;
        this.Field639 = a2;
        this.Field643 = a3;
        this.Field642 = a4;
    }

    public void Method56(float a) {
        this.Field639 = a;
    }

    public float Method57() {
        return this.Field639;
    }

    public void Method58(float a) {
        this.Field641 = a;
    }

    public float Method59() {
        return this.Field641;
    }

    public void Method60(float a) {
        this.Field643 = a;
    }

    public float Method61() {
        return this.Field643;
    }

    public void Method164(float a) {
        this.Field642 = a;
    }

    public float Method165() {
        return this.Field642;
    }

    public void Method87(boolean a) {
        this.Field644 = a;
    }

    public boolean Method88() {
        return this.Field644;
    }

    public void Method1282(boolean a) {
        this.Field645 = a;
    }

    public boolean Method1283() {
        return this.Field645;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int[] a3;
        int[] a4;
        void a5;
        int a6;
        block6: {
            int a7;
            block7: {
                int a8;
                int a9;
                int a10;
                int a11;
                int a12;
                int a13;
                int a14;
                block8: {
                    int a15;
                    int a16;
                    int a17;
                    block10: {
                        block9: {
                            a6 = a.getWidth();
                            int n = a.getHeight();
                            boolean a18 = Class193.Method1269();
                            a2 = this.Method1263(a, null);
                            a4 = new int[a6 * a5];
                            a3 = new int[a6 * a5];
                            this.Method104(a, 0, 0, a6, (int)a5, a4);
                            float a19 = (float)Math.sin((double)this.Field639);
                            float a20 = (float)Math.cos((double)this.Field639);
                            int a21 = a6 / 2;
                            void a22 = a5 / 2;
                            a14 = 0;
                            float a23 = (float)Math.sqrt((double)(a21 * a21 + a22 * a22));
                            float a24 = (float)((double)this.Field641 * Math.cos((double)this.Field639));
                            float a25 = (float)((double)this.Field641 * -Math.sin((double)this.Field639));
                            float a26 = this.Field641 + Math.abs((float)(this.Field643 * a23)) + this.Field642 * a23;
                            int a27 = (int)a26;
                            AffineTransform a28 = new AffineTransform();
                            Point2D.Float a29 = new Point2D.Float();
                            if (this.Field645) {
                                Class776.Method1727(a4, 0, a4.length);
                            }
                            if ((a7 = 0) >= a5) break block6;
                            a13 = 0;
                            if (a13 >= a6) break block7;
                            a12 = 0;
                            a11 = 0;
                            a10 = 0;
                            a9 = 0;
                            a8 = 0;
                            a17 = 0;
                            if (a17 >= a27) break block8;
                            a16 = a13;
                            a15 = a7;
                            float a30 = (float)a17 / (float)a27;
                            a29.x = a13;
                            a29.y = a7;
                            a28.setToIdentity();
                            a28.translate((double)((float)a21 + a30 * a24), (double)((float)a22 + a30 * a25));
                            float a31 = 1.0f - this.Field642 * a30;
                            a28.scale((double)a31, (double)a31);
                            if (this.Field643 != 0.0f) {
                                a28.rotate((double)(-this.Field643 * a30));
                            }
                            a28.translate((double)(-a21), (double)(-a22));
                            a28.transform((Point2D)a29, (Point2D)a29);
                            a16 = (int)a29.x;
                            a15 = (int)a29.y;
                            if (a16 < a6) break block9;
                            if (!this.Field644) break block8;
                            a16 = Class776.Method1715(a16, a6);
                        }
                        if (a15 < a5) break block10;
                        if (!this.Field644) break block8;
                        a15 = Class776.Method1715(a15, (int)a5);
                    }
                    ++a8;
                    int a32 = a4[a15 * a6 + a16];
                    a12 += a32 >> 24 & 0xFF;
                    a11 += a32 >> 16 & 0xFF;
                    a10 += a32 >> 8 & 0xFF;
                    a9 += a32 & 0xFF;
                    ++a17;
                }
                a3[a14] = a4[a14];
                a12 = Class767.Method1687(a12 / a8);
                a11 = Class767.Method1687(a11 / a8);
                a10 = Class767.Method1687(a10 / a8);
                a9 = Class767.Method1687(a9 / a8);
                a3[a14] = a12 << 24 | a11 << 16 | a10 << 8 | a9;
                ++a14;
                ++a13;
            }
            ++a7;
        }
        if (this.Field645) {
            Class776.Method1728(a3, 0, a4.length);
        }
        this.Method1267(a2, 0, 0, a6, (int)a5, a3);
        return a2;
    }

    public String toString() {
        return "Blur/Motion Blur...";
    }
}