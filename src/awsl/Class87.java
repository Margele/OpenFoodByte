/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Point
 *  java.awt.image.BufferedImage
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class755;
import awsl.Class767;
import awsl.Class771;
import awsl.Class776;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class Class87
extends Class193 {
    public static final int Field735 = 0;
    public static final int Field736 = 1;
    public static final int Field737 = 2;
    public static final int Field738 = 3;
    public static final int Field739 = 4;
    public static final int Field740 = 5;
    public static final int Field741 = 0;
    public static final int Field742 = 1;
    public static final int Field743 = 2;
    public static final int Field744 = 3;
    private float Field745 = 0.0f;
    private int Field746 = -16777216;
    private int Field747 = -1;
    private Point Field748 = new Point(0, 0);
    private Point Field749 = new Point(64, 64);
    private boolean Field750 = false;
    private float Field751;
    private float Field752;
    private float Field753;
    private float Field754;
    private Class755 Field755 = null;
    private int Field756;
    private int Field757 = 0;
    private int Field758 = 1;

    public Class87() {
    }

    public Class87(Point a, Point a2, int a3, int a4, boolean a5, int a6, int a7) {
        this.Field748 = a;
        this.Field749 = a2;
        this.Field746 = a3;
        this.Field747 = a4;
        this.Field750 = a5;
        this.Field756 = a6;
        this.Field757 = a7;
        this.Field755 = new Class771(a3, a4);
    }

    public void Method3678(Point a) {
        this.Field748 = a;
    }

    public Point Method3679() {
        return this.Field748;
    }

    public void Method3680(Point a) {
        this.Field749 = a;
    }

    public Point Method3681() {
        return this.Field749;
    }

    public void Method9(int a) {
        this.Field756 = a;
    }

    public int Method10() {
        return this.Field756;
    }

    public void Method11(int a) {
        this.Field757 = a;
    }

    public int Method12() {
        return this.Field757;
    }

    public void Method56(float a) {
        this.Field745 = a;
        this.Field749 = new Point((int)(64.0 * Math.cos((double)a)), (int)(64.0 * Math.sin((double)a)));
    }

    public float Method57() {
        return this.Field745;
    }

    public void Method176(Class755 a) {
        this.Field755 = a;
    }

    public Class755 Method177() {
        return this.Field755;
    }

    public void Method13(int a) {
        this.Field758 = a;
    }

    public int Method14() {
        return this.Field758;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        void a4;
        int a5;
        int a6;
        float a7;
        float a8;
        int n = a.getWidth();
        int n2 = a.getHeight();
        boolean a9 = Class193.Method1269();
        a2 = this.Method1263(a, null);
        float a10 = this.Field748.x;
        float a11 = this.Field749.x;
        if (a10 > a11 && this.Field756 != 2) {
            a8 = a10;
            a10 = a11;
            a11 = a8;
            a8 = this.Field749.y;
            a7 = this.Field748.y;
            a6 = this.Field747;
            a5 = this.Field746;
        }
        a8 = this.Field748.y;
        a7 = this.Field749.y;
        a6 = this.Field746;
        a5 = this.Field747;
        float a12 = a11 - a10;
        float a13 = a7 - a8;
        float a14 = a12 * a12 + a13 * a13;
        this.Field751 = a10;
        this.Field752 = a8;
        if (a14 >= Float.MIN_VALUE) {
            a12 /= a14;
            a13 /= a14;
            if (this.Field750) {
                a12 %= 1.0f;
                a13 %= 1.0f;
            }
        }
        this.Field753 = a12;
        this.Field754 = a13;
        int[] a15 = new int[a4];
        int a16 = 0;
        if (a16 < a3) {
            this.Method104(a, 0, a16, (int)a4, 1, a15);
            switch (this.Field756) {
                case 0: 
                case 1: {
                    this.Method3684(a15, a16, (int)a4, 1);
                }
                case 2: {
                    this.Method3685(a15, a16, (int)a4, 1);
                }
                case 3: 
                case 4: {
                    this.Method3687(a15, a16, (int)a4, 1);
                }
                case 5: {
                    this.Method3686(a15, a16, (int)a4, 1);
                }
            }
            this.Method1267(a2, 0, a16, (int)a4, 1, a15);
            ++a16;
        }
        return a2;
    }

    private void Method3682(int[] a, int a2, int a3, float a4, float a5, float a6) {
        int a7 = 0;
        int a8 = 0;
        if (a8 < a3) {
            float a9 = a4;
            int a10 = a2;
            while (true) {
                --a10;
                int a11 = this.Field756 == 1 ? this.Field755.Method283(this.Method29(Class776.Method1716(a9))) : this.Field755.Method283(this.Method29(Class776.Method1714(a9, 1.0f)));
                a[a7] = Class767.Method1691(a11, a[a7], this.Field758);
                ++a7;
                a9 += a5;
            }
        }
    }

    private void Method3683(int[] a, int a2, int a3, float a4, float a5, float a6) {
        int a7 = 0;
        for (int a8 = 0; a8 < a3; ++a8) {
            int a9;
            float a10 = a4;
            int a11 = a2;
            if ((double)a10 <= 0.0) {
                a9 = this.Field755.Method283(0.0f);
                do {
                    a[a7] = Class767.Method1691(a9, a[a7], this.Field758);
                    ++a7;
                    --a11;
                } while ((double)(a10 += a5) <= 0.0);
            }
            while ((double)a10 < 1.0) {
                --a11;
                a9 = this.Field756 == 1 ? this.Field755.Method283(this.Method29(Class776.Method1716(a10))) : this.Field755.Method283(this.Method29(a10));
                a[a7] = Class767.Method1691(a9, a[a7], this.Field758);
                ++a7;
                a10 += a5;
            }
            a9 = this.Field756 == 1 ? this.Field755.Method283(0.0f) : this.Field755.Method283(1.0f);
            a[a7] = Class767.Method1691(a9, a[a7], this.Field758);
            ++a7;
            --a11;
            a4 += a6;
        }
    }

    private void Method3684(int[] a, int a2, int a3, int a4) {
        boolean a5 = false;
        float a6 = ((float)a5 - this.Field751) * this.Field753 + ((float)a2 - this.Field752) * this.Field754;
        if (this.Field750) {
            this.Method3682(a, a3, a4, a6, this.Field753, this.Field754);
        } else {
            this.Method3683(a, a3, a4, a6, this.Field753, this.Field754);
        }
    }

    private void Method3685(int[] a, int a2, int a3, int a4) {
        int a5 = 0;
        float a6 = this.Method20(this.Field749.x - this.Field748.x, this.Field749.y - this.Field748.y);
        for (int a7 = 0; a7 < a3; ++a7) {
            float a8 = this.Method20(a7 - this.Field748.x, a2 - this.Field748.y);
            float a9 = a8 / a6;
            if (this.Field750) {
                a9 %= 2.0f;
            } else if ((double)a9 > 1.0) {
                a9 = 1.0f;
            }
            int a10 = this.Field755.Method283(this.Method29(a9));
            a[a5] = Class767.Method1691(a10, a[a5], this.Field758);
            ++a5;
        }
    }

    private void Method3686(int[] a, int a2, int a3, int a4) {
        int a5 = 0;
        float a6 = Math.max((int)Math.abs((int)(this.Field749.x - this.Field748.x)), (int)Math.abs((int)(this.Field749.y - this.Field748.y)));
        for (int a7 = 0; a7 < a3; ++a7) {
            float a8 = Math.max((int)Math.abs((int)(a7 - this.Field748.x)), (int)Math.abs((int)(a2 - this.Field748.y)));
            float a9 = a8 / a6;
            if (this.Field750) {
                a9 %= 2.0f;
            } else if ((double)a9 > 1.0) {
                a9 = 1.0f;
            }
            int a10 = this.Field755.Method283(this.Method29(a9));
            a[a5] = Class767.Method1691(a10, a[a5], this.Field758);
            ++a5;
        }
    }

    private void Method3687(int[] a, int a2, int a3, int a4) {
        int a5 = 0;
        float a6 = (float)Math.atan2((double)(this.Field749.x - this.Field748.x), (double)(this.Field749.y - this.Field748.y));
        for (int a7 = 0; a7 < a3; ++a7) {
            float a8 = (float)(Math.atan2((double)(a7 - this.Field748.x), (double)(a2 - this.Field748.y)) - (double)a6) / ((float)Math.PI * 2);
            a8 += 1.0f;
            a8 %= 1.0f;
            if (this.Field756 == 4) {
                a8 = Class776.Method1716(a8);
            }
            int a9 = this.Field755.Method283(this.Method29(a8));
            a[a5] = Class767.Method1691(a9, a[a5], this.Field758);
            ++a5;
        }
    }

    private float Method29(float a) {
        if (this.Field750) {
            a = (double)a > 1.0 ? 2.0f - a : a;
        }
        switch (this.Field757) {
            case 1: {
                a = Class776.Method1709(Class776.Method1711(a, 0.0f, 1.0f));
                break;
            }
            case 2: {
                a = Class776.Method1710(Class776.Method1711(a, 0.0f, 1.0f));
                break;
            }
            case 3: {
                a = Class776.Method1708(0.0f, 1.0f, a);
            }
        }
        return a;
    }

    private float Method20(float a, float a2) {
        return (float)Math.sqrt((double)(a * a + a2 * a2));
    }

    public String toString() {
        return "Other/Gradient Fill...";
    }
}