/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class877;
import java.awt.image.BufferedImage;

public class Class891
extends Class877 {
    public static final int Field3906 = 0;
    public static final int Field3907 = 1;
    public static final int Field3908 = 2;
    private int Field3909;
    private float Field3910;
    private float Field3911;
    private float Field3912;
    private float Field3913;
    private float Field3914;

    public Class891() {
        this(0);
    }

    public Class891(int a) {
        this.Field3909 = a;
        this.Method9(1);
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3910 = a.getWidth();
        this.Field3911 = a.getHeight();
        this.Field3912 = this.Field3910 / 2.0f;
        this.Field3913 = this.Field3911 / 2.0f;
        this.Field3914 = Math.max((float)this.Field3913, (float)this.Field3912);
        return super.Method62(a, a2);
    }

    public void Method13(int a) {
        this.Field3909 = a;
    }

    public int Method14() {
        return this.Field3909;
    }

    private float Method29(float a) {
        return a * a;
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        float f = 0.0f;
        boolean a4 = Class193.Method1270();
        switch (this.Field3909) {
            case 0: {
                float a5;
                float a6;
                float a7;
                float a8;
                float a9 = 0.0f;
                if ((float)a >= this.Field3912) {
                    if ((float)a2 > this.Field3913) {
                        a9 = (float)Math.PI - (float)Math.atan((double)(((float)a - this.Field3912) / ((float)a2 - this.Field3913)));
                        a8 = (float)Math.sqrt((double)(this.Method29((float)a - this.Field3912) + this.Method29((float)a2 - this.Field3913)));
                    }
                    if ((float)a2 < this.Field3913) {
                        a9 = (float)Math.atan((double)(((float)a - this.Field3912) / (this.Field3913 - (float)a2)));
                        a8 = (float)Math.sqrt((double)(this.Method29((float)a - this.Field3912) + this.Method29(this.Field3913 - (float)a2)));
                    }
                    a9 = 1.5707964f;
                    a8 = (float)a - this.Field3912;
                }
                if ((float)a < this.Field3912) {
                    if ((float)a2 < this.Field3913) {
                        a9 = (float)Math.PI * 2 - (float)Math.atan((double)((this.Field3912 - (float)a) / (this.Field3913 - (float)a2)));
                        a8 = (float)Math.sqrt((double)(this.Method29(this.Field3912 - (float)a) + this.Method29(this.Field3913 - (float)a2)));
                    }
                    if ((float)a2 > this.Field3913) {
                        a9 = (float)Math.PI + (float)Math.atan((double)((this.Field3912 - (float)a) / ((float)a2 - this.Field3913)));
                        a8 = (float)Math.sqrt((double)(this.Method29(this.Field3912 - (float)a) + this.Method29((float)a2 - this.Field3913)));
                    }
                    a9 = 4.712389f;
                    a8 = this.Field3912 - (float)a;
                }
                if ((float)a != this.Field3912) {
                    a7 = Math.abs((float)(((float)a2 - this.Field3913) / ((float)a - this.Field3912)));
                }
                if ((a7 = 0.0f) <= this.Field3911 / this.Field3910) {
                    if ((float)a == this.Field3912) {
                        a6 = 0.0f;
                        a5 = this.Field3913;
                    }
                    a6 = this.Field3912;
                    a5 = a7 * a6;
                }
                a5 = this.Field3913;
                a6 = a5 / a7;
                a3[0] = this.Field3910 - 1.0f - (this.Field3910 - 1.0f) / ((float)Math.PI * 2) * a9;
                a3[1] = this.Field3911 * a8 / this.Field3914;
            }
            case 1: {
                float a10;
                float a11;
                float a5;
                float a6;
                float a7;
                float a9 = (float)a / this.Field3910 * ((float)Math.PI * 2);
                if (a9 >= 4.712389f) {
                    a11 = (float)Math.PI * 2 - a9;
                }
                if (a9 >= (float)Math.PI) {
                    a11 = a9 - (float)Math.PI;
                }
                if (a9 >= 1.5707964f) {
                    a11 = (float)Math.PI - a9;
                }
                if ((a10 = (float)Math.tan((double)(a11 = a9))) != 0.0f) {
                    a7 = 1.0f / a10;
                }
                if ((a7 = 0.0f) <= this.Field3911 / this.Field3910) {
                    if (a11 == 0.0f) {
                        a6 = 0.0f;
                        a5 = this.Field3913;
                    }
                    a6 = this.Field3912;
                    a5 = a7 * a6;
                }
                a5 = this.Field3913;
                a6 = a5 / a7;
                float a8 = this.Field3914 * ((float)a2 / this.Field3911);
                float a12 = -a8 * (float)Math.sin((double)a11);
                float a13 = a8 * (float)Math.cos((double)a11);
                if (a9 >= 4.712389f) {
                    a3[0] = this.Field3912 - a12;
                    a3[1] = this.Field3913 - a13;
                }
                if ((double)a9 >= Math.PI) {
                    a3[0] = this.Field3912 - a12;
                    a3[1] = this.Field3913 + a13;
                }
                if ((double)a9 >= 1.5707963267948966) {
                    a3[0] = this.Field3912 + a12;
                    a3[1] = this.Field3913 + a13;
                }
                a3[0] = this.Field3912 + a12;
                a3[1] = this.Field3913 - a13;
            }
            case 2: {
                float a14 = (float)a - this.Field3912;
                float a15 = (float)a2 - this.Field3913;
                float a16 = a14 * a14 + a15 * a15;
                a3[0] = this.Field3912 + this.Field3912 * this.Field3912 * a14 / a16;
                a3[1] = this.Field3913 + this.Field3913 * this.Field3913 * a15 / a16;
            }
        }
    }

    public String toString() {
        return "Distort/Polar Coordinates...";
    }
}