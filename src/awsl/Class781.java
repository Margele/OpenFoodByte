/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Cloneable
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import awsl.Class594;
import awsl.Class598;
import awsl.Class748;
import awsl.Class755;
import awsl.Class758;
import awsl.Class767;
import awsl.Class776;
import awsl.Class798;
import java.awt.Rectangle;
import java.util.Random;

public class Class781
extends Class798
implements Class594,
Cloneable {
    protected float Field3484 = 32.0f;
    protected float Field3485 = 1.0f;
    protected float Field3486 = 0.0f;
    public float Field3487 = 1.0f;
    public float Field3488 = 1.0f;
    public float Field3489 = 0.5f;
    public float Field3490 = 0.5f;
    public float Field3491 = 2.0f;
    public boolean Field3492 = false;
    protected Class755 Field3493 = new Class758();
    protected float[] Field3494 = new float[]{1.0f, 0.0f, 0.0f, 0.0f};
    protected float Field3495;
    protected Random Field3496 = new Random();
    protected float Field3497 = 1.0f;
    protected float Field3498 = 0.0f;
    protected float Field3499 = 0.0f;
    protected float Field3500 = 1.0f;
    protected Class748[] Field3501 = new Class748[3];
    protected float Field3502 = 0.0f;
    protected int Field3503 = 2;
    private float Field3504;
    private float Field3505;
    private static byte[] Field3506;
    private float Field3507;
    public static final int Field3508 = 0;
    public static final int Field3509 = 1;
    public static final int Field3510 = 2;
    public static final int Field3511 = 3;
    public static final int Field3512 = 4;

    public Class781() {
        for (int a = 0; a < this.Field3501.length; ++a) {
            this.Field3501[a] = new Class748(this);
        }
        if (Field3506 == null) {
            Field3506 = new byte[8192];
            float a = 1.0f;
            float a2 = 0.0f;
            float a3 = 2.5f;
            for (int a4 = 0; a4 < 10; ++a4) {
                if (a4 > 1) {
                    a *= (float)a4;
                }
                float a5 = (float)Math.pow((double)a3, (double)a4) * (float)Math.exp((double)(-a3)) / a;
                int a6 = (int)(a2 * 8192.0f);
                int a7 = (int)((a2 += a5) * 8192.0f);
                for (int a8 = a6; a8 < a7; ++a8) {
                    Class781.Field3506[a8] = (byte)a4;
                }
            }
        }
    }

    public void Method56(float a) {
        this.Field3484 = a;
    }

    public float Method57() {
        return this.Field3484;
    }

    public void Method58(float a) {
        this.Field3485 = a;
    }

    public float Method59() {
        return this.Field3485;
    }

    public void Method60(float a) {
        this.Field3486 = a;
        float a2 = (float)Math.cos((double)a);
        float a3 = (float)Math.sin((double)a);
        this.Field3497 = a2;
        this.Field3498 = a3;
        this.Field3499 = -a3;
        this.Field3500 = a2;
    }

    public float Method61() {
        return this.Field3486;
    }

    public void Method866(int a, float a2) {
        this.Field3494[a] = a2;
    }

    public float Method867(int a) {
        return this.Field3494[a];
    }

    public void Method164(float a) {
        this.Field3495 = a;
    }

    public float Method165() {
        return this.Field3495;
    }

    public void Method166(float a) {
        this.Field3507 = a;
    }

    public float Method167() {
        return this.Field3507;
    }

    public void Method168(float a) {
        this.Field3494[0] = a;
    }

    public float Method169() {
        return this.Field3494[0];
    }

    public void Method170(float a) {
        this.Field3494[1] = a;
    }

    public float Method171() {
        return this.Field3494[1];
    }

    public void Method172(float a) {
        this.Field3494[2] = a;
    }

    public float Method173() {
        return this.Field3494[2];
    }

    public void Method174(float a) {
        this.Field3494[3] = a;
    }

    public float Method175() {
        return this.Field3494[3];
    }

    public void Method176(Class755 a) {
        this.Field3493 = a;
    }

    public Class755 Method177() {
        return this.Field3493;
    }

    public void Method868(float a) {
        this.Field3502 = a;
    }

    public float Method869() {
        return this.Field3502;
    }

    public void Method9(int a) {
        this.Field3503 = a;
    }

    public int Method10() {
        return this.Field3503;
    }

    public void Method870(float a) {
        this.Field3491 = a;
    }

    public float Method871() {
        return this.Field3491;
    }

    public void Method872(float a) {
        this.Field3488 = a;
    }

    public float Method873() {
        return this.Field3488;
    }

    public void Method874(float a) {
        this.Field3487 = a;
    }

    public float Method875() {
        return this.Field3487;
    }

    private float Method876(float a, float a2, int a3, int a4, Class748[] a5) {
        int a6;
        boolean bl = Class193.Method1269();
        this.Field3496.setSeed((long)(571 * a3 + 23 * a4));
        boolean a7 = bl;
        switch (this.Field3503) {
            default: {
                a6 = Field3506[this.Field3496.nextInt() & 0x1FFF];
            }
            case 1: {
                a6 = 1;
            }
            case 2: {
                a6 = 1;
            }
            case 3: {
                a6 = 2;
            }
            case 4: 
        }
        a6 = 2;
        int a8 = 0;
        if (a8 < a6) {
            Class748 a9;
            float a10;
            float a11 = 0.0f;
            float a12 = 0.0f;
            float a13 = 1.0f;
            switch (this.Field3503) {
                case 0: {
                    a11 = this.Field3496.nextFloat();
                    a12 = this.Field3496.nextFloat();
                }
                case 1: {
                    a12 = 0.5f;
                    a11 = 0.5f;
                    if (this.Field3502 == 0.0f) break;
                    a11 = (float)((double)a11 + (double)this.Field3502 * ((double)this.Field3496.nextFloat() - 0.5));
                    a12 = (float)((double)a12 + (double)this.Field3502 * ((double)this.Field3496.nextFloat() - 0.5));
                }
                case 2: {
                    if ((a3 & 1) == 0) {
                        a11 = 0.75f;
                        a12 = 0.0f;
                    }
                    a11 = 0.75f;
                    a12 = 0.5f;
                    if (this.Field3502 == 0.0f) break;
                    a11 += this.Field3502 * Class598.Method157(271.0f * ((float)a3 + a11), 271.0f * ((float)a4 + a12));
                    a12 += this.Field3502 * Class598.Method157(271.0f * ((float)a3 + a11) + 89.0f, 271.0f * ((float)a4 + a12) + 137.0f);
                }
                case 3: {
                    switch (a8) {
                        case 0: {
                            a11 = 0.207f;
                            a12 = 0.207f;
                        }
                        case 1: {
                            a11 = 0.707f;
                            a12 = 0.707f;
                            a13 = 1.6f;
                        }
                    }
                    if (this.Field3502 == 0.0f) break;
                    a11 += this.Field3502 * Class598.Method157(271.0f * ((float)a3 + a11), 271.0f * ((float)a4 + a12));
                    a12 += this.Field3502 * Class598.Method157(271.0f * ((float)a3 + a11) + 89.0f, 271.0f * ((float)a4 + a12) + 137.0f);
                }
                case 4: {
                    if ((a4 & 1) == 0) {
                        a11 = 0.25f;
                        a12 = 0.35f;
                        a11 = 0.75f;
                        a12 = 0.65f;
                    }
                    a11 = 0.75f;
                    a12 = 0.35f;
                    a11 = 0.25f;
                    a12 = 0.65f;
                    if (this.Field3502 == 0.0f) break;
                    a11 += this.Field3502 * Class598.Method157(271.0f * ((float)a3 + a11), 271.0f * ((float)a4 + a12));
                    a12 += this.Field3502 * Class598.Method157(271.0f * ((float)a3 + a11) + 89.0f, 271.0f * ((float)a4 + a12) + 137.0f);
                }
            }
            float a14 = Math.abs((float)(a - a11));
            float a15 = Math.abs((float)(a2 - a12));
            a14 *= a13;
            a15 *= a13;
            if (this.Field3491 == 1.0f) {
                a10 = a14 + a15;
            }
            if (this.Field3491 == 2.0f) {
                a10 = (float)Math.sqrt((double)(a14 * a14 + a15 * a15));
            }
            if ((a10 = (float)Math.pow((double)((float)Math.pow((double)a14, (double)this.Field3491) + (float)Math.pow((double)a15, (double)this.Field3491)), (double)(1.0f / this.Field3491))) < a5[0].Field3278) {
                a9 = a5[2];
                a5[2] = a5[1];
                a5[1] = a5[0];
                a5[0] = a9;
                a9.Field3278 = a10;
                a9.Field3274 = a14;
                a9.Field3275 = a15;
                a9.Field3272 = (float)a3 + a11;
                a9.Field3273 = (float)a4 + a12;
            }
            if (a10 < a5[1].Field3278) {
                a9 = a5[2];
                a5[2] = a5[1];
                a5[1] = a9;
                a9.Field3278 = a10;
                a9.Field3274 = a14;
                a9.Field3275 = a15;
                a9.Field3272 = (float)a3 + a11;
                a9.Field3273 = (float)a4 + a12;
            }
            if (a10 < a5[2].Field3278) {
                a9 = a5[2];
                a9.Field3278 = a10;
                a9.Field3274 = a14;
                a9.Field3275 = a15;
                a9.Field3272 = (float)a3 + a11;
                a9.Field3273 = (float)a4 + a12;
            }
            ++a8;
        }
        return a5[2].Field3278;
    }

    @Override
    public float Method20(float a, float a2) {
        int a3;
        for (a3 = 0; a3 < this.Field3501.length; ++a3) {
            this.Field3501[a3].Field3278 = Float.POSITIVE_INFINITY;
        }
        a3 = (int)a;
        float a4 = a - (float)a3;
        int a5 = (int)a2;
        float a6 = a2 - (float)a5;
        float a7 = this.Method876(a4, a6, a3, a5, this.Field3501);
        if (a7 > a6) {
            a7 = this.Method876(a4, a6 + 1.0f, a3, a5 - 1, this.Field3501);
        }
        if (a7 > 1.0f - a6) {
            a7 = this.Method876(a4, a6 - 1.0f, a3, a5 + 1, this.Field3501);
        }
        if (a7 > a4) {
            this.Method876(a4 + 1.0f, a6, a3 - 1, a5, this.Field3501);
            if (a7 > a6) {
                a7 = this.Method876(a4 + 1.0f, a6 + 1.0f, a3 - 1, a5 - 1, this.Field3501);
            }
            if (a7 > 1.0f - a6) {
                a7 = this.Method876(a4 + 1.0f, a6 - 1.0f, a3 - 1, a5 + 1, this.Field3501);
            }
        }
        if (a7 > 1.0f - a4) {
            a7 = this.Method876(a4 - 1.0f, a6, a3 + 1, a5, this.Field3501);
            if (a7 > a6) {
                a7 = this.Method876(a4 - 1.0f, a6 + 1.0f, a3 + 1, a5 - 1, this.Field3501);
            }
            if (a7 > 1.0f - a6) {
                a7 = this.Method876(a4 - 1.0f, a6 - 1.0f, a3 + 1, a5 + 1, this.Field3501);
            }
        }
        float a8 = 0.0f;
        for (int a9 = 0; a9 < 3; ++a9) {
            a8 += this.Field3494[a9] * this.Field3501[a9].Field3278;
        }
        if (this.Field3495 != 0.0f) {
            float a10 = (float)Math.atan2((double)(a2 - this.Field3501[0].Field3273), (double)(a - this.Field3501[0].Field3272));
            if (a10 < 0.0f) {
                a10 += (float)Math.PI * 2;
            }
            a8 += this.Field3495 * (a10 /= (float)Math.PI * 4);
        }
        if (this.Field3507 != 0.0f) {
            float a11 = 1.0f / (this.Field3501[0].Field3275 + this.Field3501[0].Field3274);
            a8 += this.Field3507 * a11;
        }
        return a8;
    }

    public float Method67(float a, float a2, float a3) {
        float a4 = 0.0f;
        for (float a5 = 1.0f; a5 <= a3; a5 *= 2.0f) {
            a4 += this.Method20(a5 * a, a5 * a2) / a5;
        }
        return a4;
    }

    public int Method877(int a, int a2, int[] a3, int a4, int a5) {
        float a6 = this.Field3497 * (float)a + this.Field3498 * (float)a2;
        float a7 = this.Field3499 * (float)a + this.Field3500 * (float)a2;
        a6 /= this.Field3484;
        a7 /= this.Field3484 * this.Field3485;
        float a8 = this.Field3488 == 1.0f ? this.Method20(a6, a7) : this.Method67(a6 += 1000.0f, a7 += 1000.0f, this.Field3488);
        a8 *= 2.0f;
        a8 *= this.Field3487;
        int a9 = -16777216;
        if (this.Field3493 != null) {
            int a10 = this.Field3493.Method283(a8);
            if (this.Field3492) {
                int a11 = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0f) * this.Field3484), 0, a4 - 1);
                int a12 = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0f) * this.Field3484), 0, a5 - 1);
                a10 = a3[a12 * a4 + a11];
                a8 = (this.Field3501[1].Field3278 - this.Field3501[0].Field3278) / (this.Field3501[1].Field3278 + this.Field3501[0].Field3278);
                a8 = Class776.Method1708(this.Field3494[1], this.Field3494[0], a8);
                a10 = Class776.Method1719(a8, -16777216, a10);
            }
            return a10;
        }
        int a13 = Class767.Method1687((int)(a8 * 255.0f));
        int a14 = a13 << 16;
        int a15 = a13 << 8;
        int a16 = a13;
        return a9 | a14 | a15 | a16;
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int a5 = 0;
        int[] a6 = new int[a * a2];
        for (int a7 = 0; a7 < a2; ++a7) {
            for (int a8 = 0; a8 < a; ++a8) {
                a6[a5++] = this.Method877(a8, a7, a3, a, a2);
            }
        }
        return a6;
    }

    @Override
    public Object Method878() {
        Class781 a = (Class781)super.Method878();
        a.Field3494 = (float[])this.Field3494.clone();
        a.Field3501 = (Class748[])this.Field3501.clone();
        a.Field3496 = new Random();
        return a;
    }

    public String toString() {
        return "Texture/Cellular...";
    }
}