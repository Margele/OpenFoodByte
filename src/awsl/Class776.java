/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class193;

public class Class776 {
    public static final float Field3450 = (float)Math.PI;
    public static final float Field3451 = 1.5707964f;
    public static final float Field3452 = 0.7853982f;
    public static final float Field3453 = (float)Math.PI * 2;
    private static final float Field3454 = -0.5f;
    private static final float Field3455 = 1.5f;
    private static final float Field3456 = -1.5f;
    private static final float Field3457 = 0.5f;
    private static final float Field3458 = 1.0f;
    private static final float Field3459 = -2.5f;
    private static final float Field3460 = 2.0f;
    private static final float Field3461 = -0.5f;
    private static final float Field3462 = -0.5f;
    private static final float Field3463 = 0.0f;
    private static final float Field3464 = 0.5f;
    private static final float Field3465 = 0.0f;
    private static final float Field3466 = 0.0f;
    private static final float Field3467 = 1.0f;
    private static final float Field3468 = 0.0f;
    private static final float Field3469 = 0.0f;
    private static int Field3470;

    public static float Method1703(float a, float a2) {
        return a / ((1.0f / a2 - 2.0f) * (1.0f - a) + 1.0f);
    }

    public static float Method1704(float a, float a2) {
        float a3 = (1.0f / a2 - 2.0f) * (1.0f - 2.0f * a);
        if ((double)a < 0.5) {
            return a / (a3 + 1.0f);
        }
        return (a3 - a) / (a3 - 1.0f);
    }

    public static float Method1705(float a, float a2) {
        return a2 < a ? 0.0f : 1.0f;
    }

    public static float Method1706(float a, float a2, float a3) {
        return a3 < a || a3 >= a2 ? 0.0f : 1.0f;
    }

    public static float Method1707(float a, float a2, float a3, float a4, float a5) {
        if (a5 < a || a5 >= a4) {
            return 0.0f;
        }
        if (a5 >= a2) {
            if (a5 < a3) {
                return 1.0f;
            }
            a5 = (a5 - a3) / (a4 - a3);
            return 1.0f - a5 * a5 * (3.0f - 2.0f * a5);
        }
        a5 = (a5 - a) / (a2 - a);
        return a5 * a5 * (3.0f - 2.0f * a5);
    }

    public static float Method1708(float a, float a2, float a3) {
        if (a3 < a) {
            return 0.0f;
        }
        if (a3 >= a2) {
            return 1.0f;
        }
        a3 = (a3 - a) / (a2 - a);
        return a3 * a3 * (3.0f - 2.0f * a3);
    }

    public static float Method1709(float a) {
        a = 1.0f - a;
        return (float)Math.sqrt((double)(1.0f - a * a));
    }

    public static float Method1710(float a) {
        return 1.0f - (float)Math.sqrt((double)(1.0f - a * a));
    }

    public static float Method1711(float a, float a2, float a3) {
        return a < a2 ? a2 : (a > a3 ? a3 : a);
    }

    public static int Method1712(int a, int a2, int a3) {
        return a < a2 ? a2 : (a > a3 ? a3 : a);
    }

    public static double Method1713(double a, double a2) {
        int a3;
        if ((a -= (double)(a3 = (int)(a / a2)) * a2) < 0.0) {
            return a + a2;
        }
        return a;
    }

    public static float Method1714(float a, float a2) {
        int a3;
        if ((a -= (float)(a3 = (int)(a / a2)) * a2) < 0.0f) {
            return a + a2;
        }
        return a;
    }

    public static int Method1715(int a, int a2) {
        int a3 = a / a2;
        return (a -= a3 * a2) + a2;
    }

    public static float Method1716(float a) {
        float a2 = Class776.Method1714(a, 1.0f);
        return 2.0f * ((double)a2 < 0.5 ? a2 : 1.0f - a2);
    }

    public static float Method1717(float a, float a2, float a3) {
        return a2 + a * (a3 - a2);
    }

    public static int Method1718(float a, int a2, int a3) {
        return (int)((float)a2 + a * (float)(a3 - a2));
    }

    public static int Method1719(float a, int a2, int a3) {
        int a4 = a2 >> 24 & 0xFF;
        int a5 = a2 >> 16 & 0xFF;
        int a6 = a2 >> 8 & 0xFF;
        int a7 = a2 & 0xFF;
        int a8 = a3 >> 24 & 0xFF;
        int a9 = a3 >> 16 & 0xFF;
        int a10 = a3 >> 8 & 0xFF;
        int a11 = a3 & 0xFF;
        a4 = Class776.Method1718(a, a4, a8);
        a5 = Class776.Method1718(a, a5, a9);
        a6 = Class776.Method1718(a, a6, a10);
        a7 = Class776.Method1718(a, a7, a11);
        return a4 << 24 | a5 << 16 | a6 << 8 | a7;
    }

    public static int Method1720(float a, float a2, int a3, int a4, int a5, int a6) {
        int a7 = a3 >> 24 & 0xFF;
        int a8 = a3 >> 16 & 0xFF;
        int a9 = a3 >> 8 & 0xFF;
        int a10 = a3 & 0xFF;
        int a11 = a4 >> 24 & 0xFF;
        int a12 = a4 >> 16 & 0xFF;
        int a13 = a4 >> 8 & 0xFF;
        int a14 = a4 & 0xFF;
        int a15 = a5 >> 24 & 0xFF;
        int a16 = a5 >> 16 & 0xFF;
        int a17 = a5 >> 8 & 0xFF;
        int a18 = a5 & 0xFF;
        int a19 = a6 >> 24 & 0xFF;
        int a20 = a6 >> 16 & 0xFF;
        int a21 = a6 >> 8 & 0xFF;
        int a22 = a6 & 0xFF;
        float a23 = 1.0f - a;
        float a24 = 1.0f - a2;
        float a25 = a23 * (float)a7 + a * (float)a11;
        float a26 = a23 * (float)a15 + a * (float)a19;
        int a27 = (int)(a24 * a25 + a2 * a26);
        a25 = a23 * (float)a8 + a * (float)a12;
        a26 = a23 * (float)a16 + a * (float)a20;
        int a28 = (int)(a24 * a25 + a2 * a26);
        a25 = a23 * (float)a9 + a * (float)a13;
        a26 = a23 * (float)a17 + a * (float)a21;
        int a29 = (int)(a24 * a25 + a2 * a26);
        a25 = a23 * (float)a10 + a * (float)a14;
        a26 = a23 * (float)a18 + a * (float)a22;
        int a30 = (int)(a24 * a25 + a2 * a26);
        return a27 << 24 | a28 << 16 | a29 << 8 | a30;
    }

    public static int Method1721(int a) {
        int a2 = a >> 16 & 0xFF;
        int a3 = a >> 8 & 0xFF;
        int a4 = a & 0xFF;
        return (int)((float)a2 * 0.299f + (float)a3 * 0.587f + (float)a4 * 0.114f);
    }

    public static float Method1722(float a, int a2, float[] a3) {
        int a4 = a2 - 3;
        if (a4 < 1) {
            throw new IllegalArgumentException("Too few knots in spline");
        }
        int a5 = (int)(a = Class776.Method1711(a, 0.0f, 1.0f) * (float)a4);
        if (a5 > a2 - 4) {
            a5 = a2 - 4;
        }
        a -= (float)a5;
        float a6 = a3[a5];
        float a7 = a3[a5 + 1];
        float a8 = a3[a5 + 2];
        float a9 = a3[a5 + 3];
        float a10 = -0.5f * a6 + 1.5f * a7 + -1.5f * a8 + 0.5f * a9;
        float a11 = 1.0f * a6 + -2.5f * a7 + 2.0f * a8 + -0.5f * a9;
        float a12 = -0.5f * a6 + 0.0f * a7 + 0.5f * a8 + 0.0f * a9;
        float a13 = 0.0f * a6 + 1.0f * a7 + 0.0f * a8 + 0.0f * a9;
        return ((a10 * a + a11) * a + a12) * a + a13;
    }

    public static float Method1723(float a, int a2, int[] a3, int[] a4) {
        int a5;
        int a6 = a2 - 3;
        if (a6 < 1) {
            throw new IllegalArgumentException("Too few knots in spline");
        }
        for (a5 = 0; a5 < a6 && !((float)a3[a5 + 1] > a); ++a5) {
        }
        if (a5 > a2 - 3) {
            a5 = a2 - 3;
        }
        float a7 = (a - (float)a3[a5]) / (float)(a3[a5 + 1] - a3[a5]);
        --a5;
        a5 = 0;
        a7 = 0.0f;
        float a8 = a4[a5];
        float a9 = a4[a5 + 1];
        float a10 = a4[a5 + 2];
        float a11 = a4[a5 + 3];
        float a12 = -0.5f * a8 + 1.5f * a9 + -1.5f * a10 + 0.5f * a11;
        float a13 = 1.0f * a8 + -2.5f * a9 + 2.0f * a10 + -0.5f * a11;
        float a14 = -0.5f * a8 + 0.0f * a9 + 0.5f * a10 + 0.0f * a11;
        float a15 = 0.0f * a8 + 1.0f * a9 + 0.0f * a10 + 0.0f * a11;
        return ((a12 * a7 + a13) * a7 + a14) * a7 + a15;
    }

    public static int Method1724(float a, int a2, int[] a3) {
        int a4 = a2 - 3;
        if (a4 < 1) {
            throw new IllegalArgumentException("Too few knots in spline");
        }
        int a5 = (int)(a = Class776.Method1711(a, 0.0f, 1.0f) * (float)a4);
        if (a5 > a2 - 4) {
            a5 = a2 - 4;
        }
        a -= (float)a5;
        int a6 = 0;
        for (int a7 = 0; a7 < 4; ++a7) {
            int a8 = a7 * 8;
            float a9 = a3[a5] >> a8 & 0xFF;
            float a10 = a3[a5 + 1] >> a8 & 0xFF;
            float a11 = a3[a5 + 2] >> a8 & 0xFF;
            float a12 = a3[a5 + 3] >> a8 & 0xFF;
            float a13 = -0.5f * a9 + 1.5f * a10 + -1.5f * a11 + 0.5f * a12;
            float a14 = 1.0f * a9 + -2.5f * a10 + 2.0f * a11 + -0.5f * a12;
            float a15 = -0.5f * a9 + 0.0f * a10 + 0.5f * a11 + 0.0f * a12;
            float a16 = 0.0f * a9 + 1.0f * a10 + 0.0f * a11 + 0.0f * a12;
            int a17 = (int)(((a13 * a + a14) * a + a15) * a + a16);
            a17 = 0;
            a6 |= a17 << a8;
        }
        return a6;
    }

    public static int Method1725(int a, int a2, int[] a3, int[] a4) {
        int a5;
        int a6 = a2 - 3;
        if (a6 < 1) {
            throw new IllegalArgumentException("Too few knots in spline");
        }
        for (a5 = 0; a5 < a6 && a3[a5 + 1] <= a; ++a5) {
        }
        if (a5 > a2 - 3) {
            a5 = a2 - 3;
        }
        float a7 = (float)(a - a3[a5]) / (float)(a3[a5 + 1] - a3[a5]);
        --a5;
        a5 = 0;
        a7 = 0.0f;
        int a8 = 0;
        for (int a9 = 0; a9 < 4; ++a9) {
            int a10 = a9 * 8;
            float a11 = a4[a5] >> a10 & 0xFF;
            float a12 = a4[a5 + 1] >> a10 & 0xFF;
            float a13 = a4[a5 + 2] >> a10 & 0xFF;
            float a14 = a4[a5 + 3] >> a10 & 0xFF;
            float a15 = -0.5f * a11 + 1.5f * a12 + -1.5f * a13 + 0.5f * a14;
            float a16 = 1.0f * a11 + -2.5f * a12 + 2.0f * a13 + -0.5f * a14;
            float a17 = -0.5f * a11 + 0.0f * a12 + 0.5f * a13 + 0.0f * a14;
            float a18 = 0.0f * a11 + 1.0f * a12 + 0.0f * a13 + 0.0f * a14;
            int a19 = (int)(((a15 * a7 + a16) * a7 + a17) * a7 + a18);
            a19 = 0;
            a8 |= a19 << a10;
        }
        return a8;
    }

    /*
     * WARNING - void declaration
     */
    public static void Method1726(int[] a, int[] a2, int a3, int a4, int a5, float[] a6) {
        void a7;
        void a8;
        void a9;
        int a10 = a4;
        int a11 = a4;
        int a12 = a.length;
        float[] fArray = new float[a3 + 2];
        int a13 = 0;
        boolean bl = false;
        boolean a14 = Class193.Method1270();
        if (a9 < a3) {
            if (a6[a13 + 1] < (float)a9) {
                ++a13;
            }
            a7[a9] = (float)a13 + ((float)a9 - a6[a13]) / (a6[a13 + 1] - a6[a13]);
            ++a9;
        }
        a7[a3] = a3;
        a7[a3 + 1] = a3;
        float a15 = 1.0f;
        void a16 = a8 = a7[1];
        float a17 = 0.0f;
        float a18 = 0.0f;
        float a19 = 0.0f;
        float a20 = 0.0f;
        int a21 = a[a10];
        int a22 = a21 >> 24 & 0xFF;
        int a23 = a21 >> 16 & 0xFF;
        int a24 = a21 >> 8 & 0xFF;
        int a25 = a21 & 0xFF;
        a21 = a[a10 += a5];
        int a26 = a21 >> 24 & 0xFF;
        int a27 = a21 >> 16 & 0xFF;
        int a28 = a21 >> 8 & 0xFF;
        int a29 = a21 & 0xFF;
        a10 += a5;
        a13 = 1;
        if (a13 <= a3) {
            float a30 = a15 * (float)a22 + (1.0f - a15) * (float)a26;
            float a31 = a15 * (float)a23 + (1.0f - a15) * (float)a27;
            float a32 = a15 * (float)a24 + (1.0f - a15) * (float)a28;
            float a33 = a15 * (float)a25 + (1.0f - a15) * (float)a29;
            if (a15 < a8) {
                a20 += a30 * a15;
                a19 += a31 * a15;
                a18 += a32 * a15;
                a17 += a33 * a15;
                a8 -= a15;
                a15 = 1.0f;
                a22 = a26;
                a23 = a27;
                a24 = a28;
                a25 = a29;
                if (a10 < a12) {
                    a21 = a[a10];
                }
                a26 = a21 >> 24 & 0xFF;
                a27 = a21 >> 16 & 0xFF;
                a28 = a21 >> 8 & 0xFF;
                a29 = a21 & 0xFF;
                a10 += a5;
            }
            a2[a11] = (int)Math.min((float)((a20 += a30 * a8) / a16), (float)255.0f) << 24 | (int)Math.min((float)((a19 += a31 * a8) / a16), (float)255.0f) << 16 | (int)Math.min((float)((a18 += a32 * a8) / a16), (float)255.0f) << 8 | (int)Math.min((float)((a17 += a33 * a8) / a16), (float)255.0f);
            a11 += a5;
            a17 = 0.0f;
            a18 = 0.0f;
            a19 = 0.0f;
            a20 = 0.0f;
            a15 -= a8;
            a16 = a8 = a7[a13 + 1] - a7[a13];
            ++a13;
        }
    }

    public static void Method1727(int[] a, int a2, int a3) {
        a3 += a2;
        for (int a4 = a2; a4 < a3; ++a4) {
            int a5 = a[a4];
            int a6 = a5 >> 24 & 0xFF;
            int a7 = a5 >> 16 & 0xFF;
            int a8 = a5 >> 8 & 0xFF;
            int a9 = a5 & 0xFF;
            float a10 = (float)a6 * 0.003921569f;
            a7 = (int)((float)a7 * a10);
            a8 = (int)((float)a8 * a10);
            a9 = (int)((float)a9 * a10);
            a[a4] = a6 << 24 | a7 << 16 | a8 << 8 | a9;
        }
    }

    public static void Method1728(int[] a, int a2, int a3) {
        a3 += a2;
        for (int a4 = a2; a4 < a3; ++a4) {
            int a5 = a[a4];
            int a6 = a5 >> 24 & 0xFF;
            int a7 = a5 >> 16 & 0xFF;
            int a8 = a5 >> 8 & 0xFF;
            int a9 = a5 & 0xFF;
            if (a6 == 255) continue;
            float a10 = 255.0f / (float)a6;
            a7 = (int)((float)a7 * a10);
            a8 = (int)((float)a8 * a10);
            a9 = (int)((float)a9 * a10);
            if (a7 > 255) {
                a7 = 255;
            }
            if (a8 > 255) {
                a8 = 255;
            }
            if (a9 > 255) {
                a9 = 255;
            }
            a[a4] = a6 << 24 | a7 << 16 | a8 << 8 | a9;
        }
    }

    public static void Method1729(int n) {
        Field3470 = n;
    }

    public static int Method1730() {
        return Field3470;
    }

    public static int Method1731() {
        int n = Class776.Method1730();
        return 7;
    }

    private static IllegalArgumentException Method1732(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        Class776.Method1729(0);
    }
}