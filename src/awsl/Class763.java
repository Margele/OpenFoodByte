/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.awt.image.BufferedImage
 *  java.awt.image.Kernel
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class183;
import awsl.Class187;
import awsl.Class193;
import awsl.Class588;
import awsl.Class590;
import awsl.Class594;
import awsl.Class596;
import awsl.Class600;
import awsl.Class776;
import awsl.Class798;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class Class763
extends Class798 {
    public static final int Field3355 = 0;
    public static final int Field3356 = 1;
    public static final int Field3357 = 0;
    public static final int Field3358 = 1;
    public static final int Field3359 = 2;
    public static final int Field3360 = 3;
    private float Field3361 = 1.0f;
    private float Field3362 = 5.0f;
    private float Field3363 = 10000.0f;
    private int Field3364 = 0;
    private int Field3365 = 0;
    private Class594 Field3366;
    private BufferedImage Field3367;
    private int[] Field3368;
    private int Field3369 = 1;
    private int Field3370 = 1;
    private Class590 Field3371 = new Class590();
    private Class590 Field3372 = new Class590();
    private Class590 Field3373 = new Class590();
    private Class600 Field3374 = new Class600();
    private Class600 Field3375 = new Class600();
    private Class600 Field3376 = new Class600();
    private Class590 Field3377 = new Class590();
    private Class590 Field3378 = new Class590();
    protected static final float Field3379 = 0.003921569f;

    public void Method18(Class594 a) {
        this.Field3366 = a;
    }

    public Class594 Method19() {
        return this.Field3366;
    }

    public void Method56(float a) {
        this.Field3361 = a;
    }

    public float Method57() {
        return this.Field3361;
    }

    public void Method58(float a) {
        this.Field3362 = a;
    }

    public float Method59() {
        return this.Field3362;
    }

    public void Method1271(BufferedImage a) {
        this.Field3367 = a;
        this.Field3369 = a.getWidth();
        this.Field3370 = a.getHeight();
        this.Field3368 = this.Method104(a, 0, 0, this.Field3369, this.Field3370, null);
    }

    public BufferedImage Method1272() {
        return this.Field3367;
    }

    public void Method9(int a) {
        this.Field3365 = a;
    }

    public int Method10() {
        return this.Field3365;
    }

    protected void Method1777(Class600 a, int a2) {
        a.Method113((float)(a2 >> 16 & 0xFF) * 0.003921569f, (float)(a2 >> 8 & 0xFF) * 0.003921569f, (float)(a2 & 0xFF) * 0.003921569f, (float)(a2 >> 24 & 0xFF) * 0.003921569f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        void a5;
        Object a6;
        boolean bl = false;
        int[] nArray = new int[a * a2];
        boolean a7 = Class193.Method1270();
        float a8 = Math.abs((float)(6.0f * this.Field3361));
        boolean a9 = this.Field3361 < 0.0f;
        Class590 a10 = new Class590(0.0f, 0.0f, 0.0f);
        Class590 a11 = new Class590((float)a / 2.0f, (float)a2 / 2.0f, this.Field3363);
        Class590 a12 = new Class590();
        Class600 a13 = new Class600();
        Class594 a14 = this.Field3366;
        if (this.Field3365 != 0 && this.Field3365 != 1 && this.Field3365 != 2) {
        }
        if (this.Field3362 != 0.0f) {
            Object a15;
            int a16 = a;
            int a17 = a2;
            a6 = a3;
            if (this.Field3365 == 2 && this.Field3366 instanceof Class596) {
                a15 = (Class596)this.Field3366;
                a16 = ((Class596)a15).Method12();
                a17 = ((Class596)a15).Method14();
                a6 = ((Class596)a15).Method86();
            }
            a15 = Class187.Method1294(this.Field3362);
            int[] a18 = new int[a16 * a17];
            int[] a19 = new int[a16 * a17];
            Class187.Method1293((Kernel)a15, (int[])a6, a18, a16, a17, true, false, false, Class183.Field1136);
            Class187.Method1293((Kernel)a15, a18, a19, a17, a16, true, false, false, Class183.Field1136);
            a14 = new Class596(a19, a16, a17, 1, this.Field3365 == 1);
        }
        a14 = new Class596(a3, a, a2, 1, this.Field3365 == 1);
        Class590 a20 = new Class590();
        Class590 a21 = new Class590();
        a6 = new Class590();
        int a22 = 0;
        if (a22 < a2) {
            float a23 = a22;
            a10.Field2776 = a22;
            int a24 = 0;
            if (a24 < a) {
                int a25;
                float a26 = a24;
                if (this.Field3365 != 3) {
                    float a27;
                    a25 = 0;
                    a12.Field2777 = 0.0f;
                    a12.Field2776 = 0.0f;
                    a12.Field2775 = 0.0f;
                    float a28 = a8 * a14.Method20(a26, a23);
                    float a29 = a8 * a14.Method20(a26 - 1.0f, a23) - a28;
                    float a30 = a8 * a14.Method20(a26, a23 - 1.0f) - a28;
                    float a31 = a24 < a - 1 ? a8 * a14.Method20(a26 + 1.0f, a23) - a28 : -2.0f;
                    float f = a27 = a22 < a2 - 1 ? a8 * a14.Method20(a26, a23 + 1.0f) - a28 : -2.0f;
                    if (a29 != -2.0f && a27 != -2.0f) {
                        a20.Field2775 = -1.0f;
                        a20.Field2776 = 0.0f;
                        a20.Field2777 = a29;
                        a21.Field2775 = 0.0f;
                        a21.Field2776 = 1.0f;
                        a21.Field2777 = a27;
                        ((Class590)a6).Method23(a20, a21);
                        ((Class590)a6).Method25();
                        if ((double)((Class590)a6).Field2777 < 0.0) {
                            ((Class590)a6).Field2777 = -((Class590)a6).Field2777;
                        }
                        a12.Method323((Class588)a6);
                        ++a25;
                    }
                    if (a29 != -2.0f && a30 != -2.0f) {
                        a20.Field2775 = -1.0f;
                        a20.Field2776 = 0.0f;
                        a20.Field2777 = a29;
                        a21.Field2775 = 0.0f;
                        a21.Field2776 = -1.0f;
                        a21.Field2777 = a30;
                        ((Class590)a6).Method23(a20, a21);
                        ((Class590)a6).Method25();
                        if ((double)((Class590)a6).Field2777 < 0.0) {
                            ((Class590)a6).Field2777 = -((Class590)a6).Field2777;
                        }
                        a12.Method323((Class588)a6);
                        ++a25;
                    }
                    if (a30 != -2.0f && a31 != -2.0f) {
                        a20.Field2775 = 0.0f;
                        a20.Field2776 = -1.0f;
                        a20.Field2777 = a30;
                        a21.Field2775 = 1.0f;
                        a21.Field2776 = 0.0f;
                        a21.Field2777 = a31;
                        ((Class590)a6).Method23(a20, a21);
                        ((Class590)a6).Method25();
                        if ((double)((Class590)a6).Field2777 < 0.0) {
                            ((Class590)a6).Field2777 = -((Class590)a6).Field2777;
                        }
                        a12.Method323((Class588)a6);
                        ++a25;
                    }
                    if (a31 != -2.0f && a27 != -2.0f) {
                        a20.Field2775 = 1.0f;
                        a20.Field2776 = 0.0f;
                        a20.Field2777 = a31;
                        a21.Field2775 = 0.0f;
                        a21.Field2776 = 1.0f;
                        a21.Field2777 = a27;
                        ((Class590)a6).Method23(a20, a21);
                        ((Class590)a6).Method25();
                        if ((double)((Class590)a6).Field2777 < 0.0) {
                            ((Class590)a6).Field2777 = -((Class590)a6).Field2777;
                        }
                        a12.Method323((Class588)a6);
                        ++a25;
                    }
                    a12.Field2775 /= (float)a25;
                    a12.Field2776 /= (float)a25;
                    a12.Field2777 /= (float)a25;
                }
                a12.Field2775 = -a12.Field2775;
                a12.Field2776 = -a12.Field2776;
                a10.Field2775 = a24;
                if (a12.Field2777 >= 0.0f) {
                    if (this.Field3367 != null) {
                        void a32;
                        this.Field3378.Method316(a11);
                        this.Field3378.Method325(a10);
                        this.Field3378.Method25();
                        this.Field3377.Method316(a12);
                        this.Field3377.Method25();
                        this.Field3377.Method322(2.0f * this.Field3377.Method22(this.Field3378));
                        this.Field3377.Method325(this.Field3372);
                        this.Field3377.Method25();
                        this.Method1777(a13, this.Method1778(a12, a3, a, a2));
                        a25 = a3[a32] & 0xFF000000;
                        int a33 = (int)(a13.Field2813 * 255.0f) << 16 | (int)(a13.Field2814 * 255.0f) << 8 | (int)(a13.Field2815 * 255.0f);
                        a5[a32++] = a25 | a33;
                    }
                    a5[a32++] = false;
                }
                a5[a32++] = false;
                ++a24;
            }
            ++a22;
        }
        return a5;
    }

    private int Method1778(Class590 a, int[] a2, int a3, int a4) {
        if (this.Field3367 != null) {
            float a5 = 0.5f * (1.0f + a.Field2775);
            float a6 = 0.5f * (1.0f + a.Field2776);
            a5 = Class776.Method1711(a5 * (float)this.Field3369, 0.0f, this.Field3369 - 1);
            a6 = Class776.Method1711(a6 * (float)this.Field3370, 0.0f, this.Field3370 - 1);
            int a7 = (int)a5;
            int a8 = (int)a6;
            float a9 = a5 - (float)a7;
            float a10 = a6 - (float)a8;
            int a11 = this.Field3369 * a8 + a7;
            int a12 = a7 == this.Field3369 - 1 ? 0 : 1;
            int a13 = a8 == this.Field3370 - 1 ? 0 : this.Field3369;
            return Class776.Method1720(a9, a10, this.Field3368[a11], this.Field3368[a11 + a12], this.Field3368[a11 + a13], this.Field3368[a11 + a12 + a13]);
        }
        return 0;
    }

    public String toString() {
        return "Stylize/Shade...";
    }
}