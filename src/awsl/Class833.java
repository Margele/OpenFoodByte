/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Image
 *  java.awt.Rectangle
 *  java.awt.image.BufferedImage
 *  java.awt.image.Kernel
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Vector
 */
package awsl;

import awsl.Class187;
import awsl.Class193;
import awsl.Class588;
import awsl.Class590;
import awsl.Class594;
import awsl.Class596;
import awsl.Class600;
import awsl.Class768;
import awsl.Class773;
import awsl.Class775;
import awsl.Class776;
import awsl.Class778;
import awsl.Class798;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;
import java.util.Vector;

public class Class833
extends Class798 {
    public static final int Field3691 = 0;
    public static final int Field3692 = 1;
    public static final int Field3693 = 0;
    public static final int Field3694 = 1;
    public static final int Field3695 = 2;
    public static final int Field3696 = 3;
    private float Field3697;
    private float Field3698;
    private int Field3699;
    private float Field3700 = 10000.0f;
    Class768 Field3701;
    private Vector Field3702 = new Vector();
    private int Field3703 = 0;
    private int Field3704 = 0;
    private Class594 Field3705;
    private Image Field3706;
    private int[] Field3707;
    private int Field3708 = 1;
    private int Field3709 = 1;
    private Class590 Field3710;
    private Class590 Field3711;
    private Class590 Field3712;
    private Class600 Field3713;
    private Class600 Field3714;
    private Class600 Field3715;
    private Class590 Field3716;
    private Class590 Field3717;
    protected static final float Field3718 = 0.003921569f;
    public static final int Field3719 = 0;
    public static final int Field3720 = 1;
    public static final int Field3721 = 2;
    public static final int Field3722 = 3;

    public Class833() {
        this.Method3774(new Class775(this));
        this.Field3697 = 1.0f;
        this.Field3698 = 5.0f;
        this.Field3699 = 0;
        this.Field3701 = new Class768();
        this.Field3710 = new Class590();
        this.Field3711 = new Class590();
        this.Field3712 = new Class590();
        this.Field3713 = new Class600();
        this.Field3714 = new Class600();
        this.Field3715 = new Class600();
        this.Field3716 = new Class590();
        this.Field3717 = new Class590();
    }

    public void Method3771(Class768 a) {
        this.Field3701 = a;
    }

    public Class768 Method3772() {
        return this.Field3701;
    }

    public void Method18(Class594 a) {
        this.Field3705 = a;
    }

    public Class594 Method19() {
        return this.Field3705;
    }

    public void Method56(float a) {
        this.Field3697 = a;
    }

    public float Method57() {
        return this.Field3697;
    }

    public void Method58(float a) {
        this.Field3698 = a;
    }

    public float Method59() {
        return this.Field3698;
    }

    public void Method9(int a) {
        this.Field3699 = a;
    }

    public int Method10() {
        return this.Field3699;
    }

    public void Method60(float a) {
        this.Field3700 = a;
    }

    public float Method61() {
        return this.Field3700;
    }

    public void Method1271(BufferedImage a) {
        this.Field3706 = a;
        this.Field3708 = a.getWidth();
        this.Field3709 = a.getHeight();
        this.Field3707 = this.Method104(a, 0, 0, this.Field3708, this.Field3709, null);
    }

    public Image Method3773() {
        return this.Field3706;
    }

    public void Method11(int a) {
        this.Field3703 = a;
    }

    public int Method12() {
        return this.Field3703;
    }

    public void Method13(int a) {
        this.Field3704 = a;
    }

    public int Method14() {
        return this.Field3704;
    }

    public void Method15(int a) {
        this.Field3701.Field3422 = a;
    }

    public int Method16() {
        return this.Field3701.Field3422;
    }

    public void Method3774(Class773 a) {
        this.Field3702.addElement((Object)a);
    }

    public void Method3775(Class773 a) {
        this.Field3702.removeElement((Object)a);
    }

    public Vector Method3776() {
        return this.Field3702;
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
        Object[] a6;
        Object a7;
        Object a8;
        Object a9;
        boolean bl = false;
        int[] a10 = new int[a * a2];
        float f = Math.abs((float)(6.0f * this.Field3697));
        boolean a11 = Class193.Method1270();
        boolean a12 = this.Field3697 < 0.0f;
        Class590 a13 = new Class590(0.0f, 0.0f, 0.0f);
        Class590 a14 = new Class590((float)a / 2.0f, (float)a2 / 2.0f, this.Field3700);
        Class590 a15 = new Class590();
        Class600 a16 = new Class600();
        Class600 a17 = new Class600(new Color(this.Field3701.Field3422));
        Class600 a18 = new Class600(new Color(this.Field3701.Field3423));
        Class594 a19 = this.Field3705;
        if (this.Field3704 != 0 && this.Field3704 != 1 && this.Field3704 != 2) {
        }
        if (this.Field3698 != 0.0f) {
            int a20 = a;
            int a21 = a2;
            a9 = a3;
            if (this.Field3704 == 2 && this.Field3705 instanceof Class596) {
                a8 = (Class596)this.Field3705;
                a20 = ((Class596)a8).Method12();
                a21 = ((Class596)a8).Method14();
                a9 = ((Class596)a8).Method86();
            }
            a8 = new int[a20 * a21];
            a7 = new int[a20 * a21];
            a6 = Class187.Method1294(this.Field3698);
            Class187.Method1293((Kernel)a6, a9, (int[])a8, a20, a21, true, false, false, Class187.Field1137);
            Class187.Method1293((Kernel)a6, (int[])a8, (int[])a7, a21, a20, true, false, false, Class187.Field1137);
            Class594 a22 = a19 = new Class596((int[])a7, a20, a21, 1, this.Field3704 == 1);
            if (this.Field3699 != 0) {
                a19 = new Class778(this, a22);
            }
        }
        if (this.Field3704 != 2) {
            a19 = new Class596(a3, a, a2, 1, this.Field3704 == 1);
        }
        float a23 = this.Field3701.Field3428;
        float a24 = 1.0f - a23;
        a9 = new Class590();
        a8 = new Class590();
        a7 = new Class590();
        a6 = new Class773[this.Field3702.size()];
        this.Field3702.copyInto(a6);
        int a25 = 0;
        if (a25 < a6.length) {
            ((Class773)a6[a25]).Method17(a, a2);
            ++a25;
        }
        float[][] a22 = new float[3][a];
        int a26 = 0;
        if (a26 < a) {
            a22[1][a26] = a5 * a19.Method20(a26, 0.0f);
            ++a26;
        }
        if ((a26 = 0) < a2) {
            boolean a27 = true;
            boolean a28 = a26 < a2 - 1;
            a13.Field2776 = a26;
            int a29 = 0;
            if (a29 < a) {
                a22[2][a29] = a5 * a19.Method20(a29, a26 + 1);
                ++a29;
            }
            if ((a29 = 0) < a) {
                boolean a30;
                boolean a31 = true;
                boolean bl2 = a30 = a29 < a - 1;
                if (this.Field3704 != 3) {
                    int a32 = 0;
                    a15.Field2777 = 0.0f;
                    a15.Field2776 = 0.0f;
                    a15.Field2775 = 0.0f;
                    float a33 = a22[1][a29];
                    float a34 = a22[1][a29 - 1] - a33;
                    float a35 = a22[0][a29] - a33;
                    float a36 = a22[1][a29 + 1] - a33;
                    float a37 = a22[2][a29] - a33;
                    a9.Field2775 = -1.0f;
                    a9.Field2776 = 0.0f;
                    a9.Field2777 = a34;
                    ((Class590)a8).Field2775 = 0.0f;
                    ((Class590)a8).Field2776 = 1.0f;
                    ((Class590)a8).Field2777 = a37;
                    ((Class590)a7).Method23((Class590)a9, (Class590)a8);
                    ((Class590)a7).Method25();
                    if ((double)((Class590)a7).Field2777 < 0.0) {
                        ((Class590)a7).Field2777 = -((Class590)a7).Field2777;
                    }
                    a15.Method323((Class588)a7);
                    ++a32;
                    a9.Field2775 = -1.0f;
                    a9.Field2776 = 0.0f;
                    a9.Field2777 = a34;
                    ((Class590)a8).Field2775 = 0.0f;
                    ((Class590)a8).Field2776 = -1.0f;
                    ((Class590)a8).Field2777 = a35;
                    ((Class590)a7).Method23((Class590)a9, (Class590)a8);
                    ((Class590)a7).Method25();
                    if ((double)((Class590)a7).Field2777 < 0.0) {
                        ((Class590)a7).Field2777 = -((Class590)a7).Field2777;
                    }
                    a15.Method323((Class588)a7);
                    ++a32;
                    a9.Field2775 = 0.0f;
                    a9.Field2776 = -1.0f;
                    a9.Field2777 = a35;
                    ((Class590)a8).Field2775 = 1.0f;
                    ((Class590)a8).Field2776 = 0.0f;
                    ((Class590)a8).Field2777 = a36;
                    ((Class590)a7).Method23((Class590)a9, (Class590)a8);
                    ((Class590)a7).Method25();
                    if ((double)((Class590)a7).Field2777 < 0.0) {
                        ((Class590)a7).Field2777 = -((Class590)a7).Field2777;
                    }
                    a15.Method323((Class588)a7);
                    ++a32;
                    a9.Field2775 = 1.0f;
                    a9.Field2776 = 0.0f;
                    a9.Field2777 = a36;
                    ((Class590)a8).Field2775 = 0.0f;
                    ((Class590)a8).Field2776 = 1.0f;
                    ((Class590)a8).Field2777 = a37;
                    ((Class590)a7).Method23((Class590)a9, (Class590)a8);
                    ((Class590)a7).Method25();
                    if ((double)((Class590)a7).Field2777 < 0.0) {
                        ((Class590)a7).Field2777 = -((Class590)a7).Field2777;
                    }
                    a15.Method323((Class588)a7);
                    a15.Field2775 /= (float)(++a32);
                    a15.Field2776 /= (float)a32;
                    a15.Field2777 /= (float)a32;
                }
                a15.Field2775 = -a15.Field2775;
                a15.Field2776 = -a15.Field2776;
                a13.Field2775 = a29;
                if (a15.Field2777 >= 0.0f) {
                    void a38;
                    if (this.Field3703 == 0) {
                        this.Method1777(a17, a3[a38]);
                    }
                    this.Method1777(a17, this.Field3701.Field3422);
                    if (a23 != 0.0f && this.Field3706 != null) {
                        this.Field3717.Method316(a14);
                        this.Field3717.Method325(a13);
                        this.Field3717.Method25();
                        this.Field3716.Method316(a15);
                        this.Field3716.Method25();
                        this.Field3716.Method322(2.0f * this.Field3716.Method22(this.Field3717));
                        this.Field3716.Method325(this.Field3711);
                        this.Field3716.Method25();
                        this.Method1777(a16, this.Method1778(this.Field3716, a3, a, a2));
                        a17.Field2813 = a23 * a16.Field2813 + a24 * a17.Field2813;
                        a17.Field2814 = a23 * a16.Field2814 + a24 * a17.Field2814;
                        a17.Field2815 = a23 * a16.Field2815 + a24 * a17.Field2815;
                    }
                    Class600 a39 = this.Method3777(a13, a14, a15, a17, a18, this.Field3701, (Class773[])a6);
                    int a40 = a3[a38] & 0xFF000000;
                    int a41 = (int)(a39.Field2813 * 255.0f) << 16 | (int)(a39.Field2814 * 255.0f) << 8 | (int)(a39.Field2815 * 255.0f);
                    a10[a38++] = a40 | a41;
                }
                a10[a38++] = 0;
                ++a29;
            }
            float[] a32 = a22[0];
            a22[0] = a22[1];
            a22[1] = a22[2];
            a22[2] = a32;
            ++a26;
        }
        return a10;
    }

    protected Class600 Method3777(Class590 a, Class590 a2, Class590 a3, Class600 a4, Class600 a5, Class768 a6, Class773[] a7) {
        this.Field3713.Method115(a4);
        this.Field3713.Method121(a6.Field3424);
        for (int a8 = 0; a8 < a7.length; ++a8) {
            Class773 a9 = a7[a8];
            this.Field3712.Method316(a3);
            this.Field3710.Method316(a9.Field3435);
            if (a9.Field3434 != 1) {
                this.Field3710.Method325(a);
            }
            this.Field3710.Method25();
            float a10 = this.Field3712.Method22(this.Field3710);
            if (!((double)a10 >= 0.0)) continue;
            float a11 = 0.0f;
            this.Field3711.Method316(a2);
            this.Field3711.Method325(a);
            this.Field3711.Method25();
            if (a9.Field3434 == 3 && (a11 = a9.Field3436.Method22(this.Field3710)) < a9.Field3446) continue;
            this.Field3712.Method322(2.0f * a10);
            this.Field3712.Method325(this.Field3710);
            float a12 = this.Field3712.Method22(this.Field3711);
            float a13 = (double)a12 < 0.0 ? 0.0f : a12 / (a6.Field3427 - a6.Field3427 * a12 + a12);
            if (a9.Field3434 == 3) {
                float a14 = a11 = a9.Field3446 / a11;
                a14 *= a14;
                a14 *= a14;
                a14 *= a14;
                a14 = (float)Math.pow((double)a11, (double)(a9.Field3442 * 10.0f)) * (1.0f - a14);
                a13 *= a14;
                a10 *= a14;
            }
            this.Field3714.Method115(a4);
            this.Field3714.Method121(a6.Field3425);
            this.Field3714.Field2813 *= a9.Field3437.Field2813 * a10;
            this.Field3714.Field2814 *= a9.Field3437.Field2814 * a10;
            this.Field3714.Field2815 *= a9.Field3437.Field2815 * a10;
            this.Field3715.Method115(a5);
            this.Field3715.Method121(a6.Field3426);
            this.Field3715.Field2813 *= a9.Field3437.Field2813 * a13;
            this.Field3715.Field2814 *= a9.Field3437.Field2814 * a13;
            this.Field3715.Field2815 *= a9.Field3437.Field2815 * a13;
            this.Field3714.Method122(this.Field3715);
            this.Field3714.Method112(0.0f, 1.0f);
            this.Field3713.Method122(this.Field3714);
        }
        this.Field3713.Method112(0.0f, 1.0f);
        return this.Field3713;
    }

    private int Method1778(Class590 a, int[] a2, int a3, int a4) {
        if (this.Field3706 != null) {
            float a5;
            float a6 = (float)Math.acos((double)(-a.Field2776));
            float a7 = a6 / (float)Math.PI;
            if (a7 == 0.0f || a7 == 1.0f) {
                a5 = 0.0f;
            } else {
                float a8 = a.Field2775 / (float)Math.sin((double)a6);
                if (a8 > 1.0f) {
                    a8 = 1.0f;
                } else if (a8 < -1.0f) {
                    a8 = -1.0f;
                }
                a5 = (float)Math.acos((double)a8) / (float)Math.PI;
            }
            a5 = Class776.Method1711(a5 * (float)this.Field3708, 0.0f, this.Field3708 - 1);
            a7 = Class776.Method1711(a7 * (float)this.Field3709, 0.0f, this.Field3709 - 1);
            int a9 = (int)a5;
            int a10 = (int)a7;
            float a11 = a5 - (float)a9;
            float a12 = a7 - (float)a10;
            int a13 = this.Field3708 * a10 + a9;
            int a14 = a9 == this.Field3708 - 1 ? 0 : 1;
            int a15 = a10 == this.Field3709 - 1 ? 0 : this.Field3708;
            return Class776.Method1720(a11, a12, this.Field3707[a13], this.Field3707[a13 + a14], this.Field3707[a13 + a15], this.Field3707[a13 + a14 + a15]);
        }
        return 0;
    }

    public String toString() {
        return "Stylize/Light Effects...";
    }

    static int Method3778(Class833 a) {
        return a.Field3699;
    }
}