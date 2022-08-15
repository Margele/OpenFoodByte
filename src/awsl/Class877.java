/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.awt.image.WritableRaster
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class193;
import awsl.Class776;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public abstract class Class877
extends Class193 {
    public static final int Field3812 = 0;
    public static final int Field3813 = 1;
    public static final int Field3814 = 2;
    public static final int Field3815 = 3;
    public static final int Field3816 = 0;
    public static final int Field3817 = 1;
    protected int Field3818 = 3;
    protected int Field3819 = 1;
    protected Rectangle Field3820;
    protected Rectangle Field3821;

    public void Method9(int a) {
        this.Field3818 = a;
    }

    public int Method10() {
        return this.Field3818;
    }

    public void Method11(int a) {
        this.Field3819 = a;
    }

    public int Method12() {
        return this.Field3819;
    }

    protected abstract void Method3439(int var1, int var2, float[] var3);

    protected void Method834(Rectangle a) {
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        int n = a.getWidth();
        boolean a4 = Class193.Method1270();
        int a5 = a.getHeight();
        int a6 = a.getType();
        WritableRaster a7 = a.getRaster();
        this.Field3821 = new Rectangle(0, 0, (int)a3, a5);
        this.Field3820 = new Rectangle(0, 0, (int)a3, a5);
        this.Method834(this.Field3820);
        ColorModel a8 = a.getColorModel();
        a2 = new BufferedImage(a8, a8.createCompatibleWritableRaster(this.Field3820.width, this.Field3820.height), a8.isAlphaPremultiplied(), null);
        a8 = a2.getRaster();
        int[] a9 = this.Method104(a, 0, 0, (int)a3, a5, null);
        if (this.Field3819 == 0) {
            return this.Method3589(a2, (int)a3, a5, a9, this.Field3820);
        }
        void a10 = a3;
        int a11 = a5;
        void a12 = a3 - true;
        int a13 = a5 - 1;
        int a14 = this.Field3820.width;
        int a15 = this.Field3820.height;
        boolean a16 = false;
        int[] a17 = new int[a14];
        int a18 = this.Field3820.x;
        int a19 = this.Field3820.y;
        float[] a20 = new float[2];
        int a21 = 0;
        if (a21 < a15) {
            int a22 = 0;
            if (a22 < a14) {
                int a23;
                int a24;
                int a25;
                int a26;
                this.Method3439(a18 + a22, a19 + a21, a20);
                int a27 = (int)Math.floor((double)a20[0]);
                int a28 = (int)Math.floor((double)a20[1]);
                float a29 = a20[0] - (float)a27;
                float a30 = a20[1] - (float)a28;
                if (a27 < a12) {
                    if (a28 < a13) {
                        void a31 = a10 * a28 + a27;
                        a26 = a9[a31];
                        a25 = a9[a31 + true];
                        a24 = a9[a31 + a10];
                        a23 = a9[a31 + a10 + true];
                    }
                }
                a26 = this.Method3588(a9, a27, a28, (int)a10, a11);
                a25 = this.Method3588(a9, a27 + 1, a28, (int)a10, a11);
                a24 = this.Method3588(a9, a27, a28 + 1, (int)a10, a11);
                a23 = this.Method3588(a9, a27 + 1, a28 + 1, (int)a10, a11);
                a17[a22] = Class776.Method1720(a29, a30, a26, a25, a24, a23);
                ++a22;
            }
            this.Method1267(a2, 0, a21, this.Field3820.width, 1, a17);
            ++a21;
        }
        return a2;
    }

    private final int Method3588(int[] a, int a2, int a3, int a4, int a5) {
        block8: {
            block7: {
                if (a2 >= a4) break block7;
                if (a3 < a5) break block8;
            }
            switch (this.Field3818) {
                default: {
                    return 0;
                }
                case 2: {
                    return a[Class776.Method1715(a3, a5) * a4 + Class776.Method1715(a2, a4)];
                }
                case 1: {
                    return a[Class776.Method1712(a3, 0, a5 - 1) * a4 + Class776.Method1712(a2, 0, a4 - 1)];
                }
                case 3: 
            }
            return a[Class776.Method1712(a3, 0, a5 - 1) * a4 + Class776.Method1712(a2, 0, a4 - 1)] & 0xFFFFFF;
        }
        return a[a3 * a4 + a2];
    }

    protected BufferedImage Method3589(BufferedImage a, int a2, int a3, int[] a4, Rectangle a5) {
        int a6 = a2;
        int a7 = a3;
        int a8 = a5.width;
        int a9 = a5.height;
        int[] a10 = new int[a8];
        int a11 = a5.x;
        int a12 = a5.y;
        int[] a13 = new int[4];
        float[] a14 = new float[2];
        for (int a15 = 0; a15 < a9; ++a15) {
            for (int a16 = 0; a16 < a8; ++a16) {
                int a17;
                this.Method3439(a11 + a16, a12 + a15, a14);
                int a18 = (int)a14[0];
                int a19 = (int)a14[1];
                if (a14[0] < 0.0f || a18 >= a6 || a14[1] < 0.0f || a19 >= a7) {
                    switch (this.Field3818) {
                        default: {
                            a17 = 0;
                            break;
                        }
                        case 2: {
                            a17 = a4[Class776.Method1715(a19, a7) * a6 + Class776.Method1715(a18, a6)];
                            break;
                        }
                        case 1: {
                            a17 = a4[Class776.Method1712(a19, 0, a7 - 1) * a6 + Class776.Method1712(a18, 0, a6 - 1)];
                            break;
                        }
                        case 3: {
                            a17 = a4[Class776.Method1712(a19, 0, a7 - 1) * a6 + Class776.Method1712(a18, 0, a6 - 1)] & 0xFFFFFF;
                        }
                    }
                    a10[a16] = a17;
                    continue;
                }
                a17 = a6 * a19 + a18;
                a13[0] = a4[a17];
                a10[a16] = a4[a17];
            }
            this.Method1267(a, 0, a15, a5.width, 1, a10);
        }
        return a;
    }
}