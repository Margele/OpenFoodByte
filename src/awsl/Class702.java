/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class193;
import awsl.Class776;

public class Class702 {
    public float[] Field3028 = null;
    public float[] Field3029 = null;
    public int Field3030;
    public int Field3031;
    private static final float Field3032 = -0.5f;
    private static final float Field3033 = 1.5f;
    private static final float Field3034 = -1.5f;
    private static final float Field3035 = 0.5f;
    private static final float Field3036 = 1.0f;
    private static final float Field3037 = -2.5f;
    private static final float Field3038 = 2.0f;
    private static final float Field3039 = -0.5f;
    private static final float Field3040 = -0.5f;
    private static final float Field3041 = 0.5f;
    private static final float Field3042 = 1.0f;

    public Class702(int a, int a2, int a3, int a4) {
        this.Field3030 = a;
        this.Field3031 = a2;
        this.Field3028 = new float[a * a2];
        this.Field3029 = new float[a * a2];
        int a5 = 0;
        for (int a6 = 0; a6 < a; ++a6) {
            for (int a7 = 0; a7 < a2; ++a7) {
                this.Field3028[a5] = (float)a7 * (float)(a3 - 1) / (float)(a2 - 1);
                this.Field3029[a5] = (float)a6 * (float)(a4 - 1) / (float)(a - 1);
                ++a5;
            }
        }
    }

    public void Method1789(int a) {
        int a2 = (this.Field3030 + 1) * this.Field3031;
        float[] a3 = new float[a2];
        float[] a4 = new float[a2];
        ++this.Field3030;
        int a5 = 0;
        int a6 = 0;
        for (int a7 = 0; a7 < this.Field3030; ++a7) {
            for (int a8 = 0; a8 < this.Field3031; ++a8) {
                int a9 = a6 + a8;
                int a10 = a5 + a8;
                if (a7 == a) {
                    a3[a9] = (this.Field3028[a10] + this.Field3028[a9]) / 2.0f;
                    a4[a9] = (this.Field3029[a10] + this.Field3029[a9]) / 2.0f;
                    continue;
                }
                a3[a9] = this.Field3028[a10];
                a4[a9] = this.Field3029[a10];
            }
            if (a7 != a - 1) {
                a5 += this.Field3031;
            }
            a6 += this.Field3031;
        }
        this.Field3028 = a3;
        this.Field3029 = a4;
    }

    public void Method1790(int a) {
        int a2 = this.Field3030 * (this.Field3031 + 1);
        float[] a3 = new float[a2];
        float[] a4 = new float[a2];
        ++this.Field3031;
        int a5 = 0;
        int a6 = 0;
        for (int a7 = 0; a7 < this.Field3030; ++a7) {
            for (int a8 = 0; a8 < this.Field3031; ++a8) {
                if (a8 == a) {
                    a3[a6] = (this.Field3028[a5] + this.Field3028[a5 - 1]) / 2.0f;
                    a4[a6] = (this.Field3029[a5] + this.Field3029[a5 - 1]) / 2.0f;
                } else {
                    a3[a6] = this.Field3028[a5];
                    a4[a6] = this.Field3029[a5];
                    ++a5;
                }
                ++a6;
            }
        }
        this.Field3028 = a3;
        this.Field3029 = a4;
    }

    public void Method1791(int a) {
        int a2 = (this.Field3030 - 1) * this.Field3031;
        float[] a3 = new float[a2];
        float[] a4 = new float[a2];
        --this.Field3030;
        int a5 = 0;
        int a6 = 0;
        for (int a7 = 0; a7 < this.Field3030; ++a7) {
            for (int a8 = 0; a8 < this.Field3031; ++a8) {
                int a9 = a6 + a8;
                int a10 = a5 + a8;
                a3[a9] = this.Field3028[a10];
                a4[a9] = this.Field3029[a10];
            }
            if (a7 == a - 1) {
                a5 += this.Field3031;
            }
            a5 += this.Field3031;
            a6 += this.Field3031;
        }
        this.Field3028 = a3;
        this.Field3029 = a4;
    }

    public void Method1792(int a) {
        int a2 = this.Field3030 * (this.Field3031 + 1);
        float[] a3 = new float[a2];
        float[] a4 = new float[a2];
        --this.Field3031;
        for (int a5 = 0; a5 < this.Field3030; ++a5) {
            int a6 = a5 * (this.Field3031 + 1);
            int a7 = a5 * this.Field3031;
            for (int a8 = 0; a8 < this.Field3031; ++a8) {
                a3[a7] = this.Field3028[a6];
                a4[a7] = this.Field3029[a6];
                if (a8 == a - 1) {
                    ++a6;
                }
                ++a6;
                ++a7;
            }
        }
        this.Field3028 = a3;
        this.Field3029 = a4;
    }

    public void Method1793(float a, Class702 a2, Class702 a3) {
        if (this.Field3030 != a2.Field3030 || this.Field3031 != a2.Field3031) {
            throw new IllegalArgumentException("source and destination are different sizes");
        }
        if (this.Field3030 != a3.Field3030 || this.Field3031 != a3.Field3031) {
            throw new IllegalArgumentException("source and intermediate are different sizes");
        }
        int a4 = 0;
        for (int a5 = 0; a5 < this.Field3030; ++a5) {
            for (int a6 = 0; a6 < this.Field3031; ++a6) {
                a3.Field3028[a4] = Class776.Method1717(a, this.Field3028[a4], a2.Field3028[a4]);
                a3.Field3029[a4] = Class776.Method1717(a, this.Field3029[a4], a2.Field3029[a4]);
                ++a4;
            }
        }
    }

    public void Method1794(int[] a, int a2, int a3, Class702 a4, Class702 a5, int[] a6) {
        block15: {
            boolean a7 = Class193.Method1269();
            if (a4.Field3030 == a5.Field3030 && a4.Field3031 == a5.Field3031) break block15;
            throw new IllegalArgumentException("source and destination grids are different sizes");
        }
        try {
            int a8;
            int a9;
            int a10;
            int a11;
            int a12 = Math.max((int)a2, (int)a3);
            float[] a13 = new float[a12];
            float[] a14 = new float[a12];
            float[] a15 = new float[a12 + 1];
            float[] a16 = new float[a12 + 1];
            int a17 = a4.Field3031;
            int a18 = a4.Field3030;
            Class702 a19 = new Class702(a3, a17, 1, 1);
            int a20 = 0;
            if (a20 < a17) {
                a11 = a20;
                a10 = 0;
                if (a10 < a18) {
                    a13[a10] = a4.Field3028[a11];
                    a14[a10] = a4.Field3029[a11];
                    a11 += a17;
                    ++a10;
                }
                this.Method1795(a14, a13, 0, a18, a16, 0, a3);
                a11 = a20;
                a9 = 0;
                if (a9 < a3) {
                    a19.Field3028[a11] = a16[a9];
                    a11 += a17;
                    ++a9;
                }
                ++a20;
            }
            if ((a20 = 0) < a17) {
                a11 = a20;
                a10 = 0;
                if (a10 < a18) {
                    a13[a10] = a5.Field3028[a11];
                    a14[a10] = a5.Field3029[a11];
                    a11 += a17;
                    ++a10;
                }
                this.Method1795(a14, a13, 0, a18, a16, 0, a3);
                a11 = a20;
                a9 = 0;
                if (a9 < a3) {
                    a19.Field3029[a11] = a16[a9];
                    a11 += a17;
                    ++a9;
                }
                ++a20;
            }
            int[] a21 = new int[a3 * a2];
            a11 = 0;
            a9 = 0;
            if (a9 < a3) {
                this.Method1795(a19.Field3028, a19.Field3029, a11, a17, a15, 0, a2);
                a15[a2] = a2;
                Class776.Method1726(a, a21, a2, a9 * a2, 1, a15);
                a11 += a17;
                ++a9;
            }
            a19 = new Class702(a18, a2, 1, 1);
            a11 = 0;
            int a22 = 0;
            a10 = 0;
            if (a10 < a18) {
                this.Method1795(a4.Field3028, a4.Field3029, a11, a17, a19.Field3028, a22, a2);
                a11 += a17;
                a22 += a2;
                ++a10;
            }
            a11 = 0;
            a22 = 0;
            a10 = 0;
            if (a10 < a18) {
                this.Method1795(a5.Field3028, a5.Field3029, a11, a17, a19.Field3029, a22, a2);
                a11 += a17;
                a22 += a2;
                ++a10;
            }
            if ((a8 = 0) < a2) {
                int a23 = a8;
                a10 = 0;
                if (a10 < a18) {
                    a13[a10] = a19.Field3028[a23];
                    a14[a10] = a19.Field3029[a23];
                    a23 += a2;
                    ++a10;
                }
                this.Method1795(a13, a14, 0, a18, a15, 0, a3);
                a15[a3] = a3;
                Class776.Method1726(a21, a6, a3, a8, a2, a15);
                ++a8;
            }
        }
        catch (Exception a24) {
            a24.printStackTrace();
        }
    }

    protected void Method1795(float[] a, float[] a2, int a3, int a4, float[] a5, int a6, int a7) {
        float a8;
        int a9 = a3;
        int a10 = a3 + a4 - 1;
        float a11 = a[a9];
        float a12 = a8 = a2[a9];
        float a13 = a8;
        float a14 = a[a9 + 1];
        float a15 = a2[a9 + 1];
        for (int a16 = 0; a16 < a7; ++a16) {
            if (a9 <= a10 && (float)a16 > a[a9]) {
                a13 = a12;
                a12 = a8;
                a8 = a15;
                a11 = a[a9];
                if (++a9 <= a10) {
                    a14 = a[a9];
                }
                a15 = a9 < a10 ? a2[a9 + 1] : a8;
            }
            float a17 = ((float)a16 - a11) / (a14 - a11);
            float a18 = -0.5f * a13 + 1.5f * a12 + -1.5f * a8 + 0.5f * a15;
            float a19 = 1.0f * a13 + -2.5f * a12 + 2.0f * a8 + -0.5f * a15;
            float a20 = -0.5f * a13 + 0.5f * a8;
            float a21 = 1.0f * a12;
            a5[a6 + a16] = ((a18 * a17 + a19) * a17 + a20) * a17 + a21;
        }
    }

    protected void Method1796(float[] a, float[] a2, int a3, float[] a4, int a5, int a6) {
        int a7 = a3;
        float a8 = a[a7];
        float a9 = a2[a7];
        float a10 = a[a7 + 1];
        float a11 = a2[a7 + 1];
        for (int a12 = 0; a12 < a6; ++a12) {
            if ((float)a12 > a[a7]) {
                a8 = a[a7];
                a9 = a2[a7];
                a10 = a[++a7];
                a11 = a2[a7];
            }
            float a13 = ((float)a12 - a8) / (a10 - a8);
            a4[a5 + a12] = a9 + a13 * (a11 - a9);
        }
    }

    private static Exception Method1797(Exception exception) {
        return exception;
    }
}