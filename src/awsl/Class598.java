/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
package awsl;

import awsl.Class593;
import awsl.Class594;
import awsl.Class595;
import java.util.Random;
import obfuscate.a;

public class Class598
implements Class593,
Class594,
Class595 {
    private static Random Field2803 = new Random();
    private static final int Field2804 = 256;
    private static final int Field2805 = 255;
    private static final int Field2806 = 4096;
    static int[] Field2807 = new int[514];
    static float[][] Field2808;
    static float[][] Field2809;
    static float[] Field2810;
    static boolean Field2811;
    private static int[] Field2812;

    @Override
    public float Method29(float a) {
        return Class598.Method156(a);
    }

    @Override
    public float Method20(float a, float a2) {
        return Class598.Method157(a, a2);
    }

    @Override
    public float Method67(float a, float a2, float a3) {
        return Class598.Method158(a, a2, a3);
    }

    public static float Method153(float a, float a2, float a3) {
        float a4 = 0.0f;
        for (float a5 = 1.0f; a5 <= a3; a5 *= 2.0f) {
            a4 += Math.abs((float)Class598.Method157(a5 * a, a5 * a2)) / a5;
        }
        return a4;
    }

    public static float Method154(float a, float a2, float a3, float a4) {
        float a5 = 0.0f;
        for (float a6 = 1.0f; a6 <= a4; a6 *= 2.0f) {
            a5 += Math.abs((float)Class598.Method158(a6 * a, a6 * a2, a6 * a3)) / a6;
        }
        return a5;
    }

    private static float Method155(float a) {
        return a * a * (3.0f - 2.0f * a);
    }

    public static float Method156(float a) {
        if (Field2811) {
            Field2811 = false;
            Class598.Method89();
        }
        float a2 = a + 4096.0f;
        int a3 = (int)a2 & 0xFF;
        int a4 = a3 + 1 & 0xFF;
        float a5 = a2 - (float)((int)a2);
        float a6 = a5 - 1.0f;
        float a7 = Class598.Method155(a5);
        float a8 = a5 * Field2810[Field2807[a3]];
        float a9 = a6 * Field2810[Field2807[a4]];
        return 2.3f * Class598.Method159(a7, a8, a9);
    }

    public static float Method157(float a, float a2) {
        if (Field2811) {
            Field2811 = false;
            Class598.Method89();
        }
        float a3 = a + 4096.0f;
        int a4 = (int)a3 & 0xFF;
        int a5 = a4 + 1 & 0xFF;
        float a6 = a3 - (float)((int)a3);
        float a7 = a6 - 1.0f;
        a3 = a2 + 4096.0f;
        int a8 = (int)a3 & 0xFF;
        int a9 = a8 + 1 & 0xFF;
        float a10 = a3 - (float)((int)a3);
        float a11 = a10 - 1.0f;
        int a12 = Field2807[a4];
        int a13 = Field2807[a5];
        int a14 = Field2807[a12 + a8];
        int a15 = Field2807[a13 + a8];
        int a16 = Field2807[a12 + a9];
        int a17 = Field2807[a13 + a9];
        float a18 = Class598.Method155(a6);
        float a19 = Class598.Method155(a10);
        float[] a20 = Field2809[a14];
        float a21 = a6 * a20[0] + a10 * a20[1];
        a20 = Field2809[a15];
        float a22 = a7 * a20[0] + a10 * a20[1];
        float a23 = Class598.Method159(a18, a21, a22);
        a20 = Field2809[a16];
        a21 = a6 * a20[0] + a11 * a20[1];
        a20 = Field2809[a17];
        a22 = a7 * a20[0] + a11 * a20[1];
        float a24 = Class598.Method159(a18, a21, a22);
        return 1.5f * Class598.Method159(a19, a23, a24);
    }

    public static float Method158(float a2, float a3, float a4) {
        int[] a5 = Class598.Method86();
        if (Field2811) {
            Field2811 = false;
            Class598.Method89();
        }
        float a6 = a2 + 4096.0f;
        int a7 = (int)a6 & 0xFF;
        int a8 = a7 + 1 & 0xFF;
        float a9 = a6 - (float)((int)a6);
        float a10 = a9 - 1.0f;
        a6 = a3 + 4096.0f;
        int a11 = (int)a6 & 0xFF;
        int a12 = a11 + 1 & 0xFF;
        float a13 = a6 - (float)((int)a6);
        float a14 = a13 - 1.0f;
        a6 = a4 + 4096.0f;
        int a15 = (int)a6 & 0xFF;
        int a16 = a15 + 1 & 0xFF;
        float a17 = a6 - (float)((int)a6);
        float a18 = a17 - 1.0f;
        int a19 = Field2807[a7];
        int a20 = Field2807[a8];
        int a21 = Field2807[a19 + a11];
        int a22 = Field2807[a20 + a11];
        int a23 = Field2807[a19 + a12];
        int a24 = Field2807[a20 + a12];
        a6 = Class598.Method155(a9);
        float a25 = Class598.Method155(a13);
        float a26 = Class598.Method155(a17);
        float[] a27 = Field2808[a21 + a15];
        float a28 = a9 * a27[0] + a13 * a27[1] + a17 * a27[2];
        a27 = Field2808[a22 + a15];
        float a29 = a10 * a27[0] + a13 * a27[1] + a17 * a27[2];
        float a30 = Class598.Method159(a6, a28, a29);
        a27 = Field2808[a23 + a15];
        a28 = a9 * a27[0] + a14 * a27[1] + a17 * a27[2];
        a27 = Field2808[a24 + a15];
        a29 = a10 * a27[0] + a14 * a27[1] + a17 * a27[2];
        float a31 = Class598.Method159(a6, a28, a29);
        float a32 = Class598.Method159(a25, a30, a31);
        a27 = Field2808[a21 + a16];
        a28 = a9 * a27[0] + a13 * a27[1] + a18 * a27[2];
        a27 = Field2808[a22 + a16];
        a29 = a10 * a27[0] + a13 * a27[1] + a18 * a27[2];
        a30 = Class598.Method159(a6, a28, a29);
        a27 = Field2808[a23 + a16];
        a28 = a9 * a27[0] + a14 * a27[1] + a18 * a27[2];
        a27 = Field2808[a24 + a16];
        a29 = a10 * a27[0] + a14 * a27[1] + a18 * a27[2];
        a31 = Class598.Method159(a6, a28, a29);
        float a33 = Class598.Method159(a25, a30, a31);
        float f = 1.5f * Class598.Method159(a26, a32, a33);
        if (a.trash() == null) {
            Class598.Method85(new int[3]);
        }
        return f;
    }

    public static float Method159(float a2, float a3, float a4) {
        return a3 + a2 * (a4 - a3);
    }

    private static void Method160(float[] a2) {
        float a3 = (float)Math.sqrt((double)(a2[0] * a2[0] + a2[1] * a2[1]));
        a2[0] = a2[0] / a3;
        a2[1] = a2[1] / a3;
    }

    static void Method161(float[] a2) {
        float a3 = (float)Math.sqrt((double)(a2[0] * a2[0] + a2[1] * a2[1] + a2[2] * a2[2]));
        a2[0] = a2[0] / a3;
        a2[1] = a2[1] / a3;
        a2[2] = a2[2] / a3;
    }

    private static int Method10() {
        return Field2803.nextInt() & Integer.MAX_VALUE;
    }

    private static void Method89() {
        int a2;
        int a3 = 0;
        int[] a4 = Class598.Method86();
        if (a3 < 256) {
            Class598.Field2807[a3] = a3;
            Class598.Field2810[a3] = (float)(Class598.Method10() % 512 - 256) / 256.0f;
            a2 = 0;
            if (a2 < 2) {
                Class598.Field2809[a3][a2] = (float)(Class598.Method10() % 512 - 256) / 256.0f;
                ++a2;
            }
            Class598.Method160(Field2809[a3]);
            a2 = 0;
            if (a2 < 3) {
                Class598.Field2808[a3][a2] = (float)(Class598.Method10() % 512 - 256) / 256.0f;
                ++a2;
            }
            Class598.Method161(Field2808[a3]);
            ++a3;
        }
        a3 = 255;
        int a5 = Field2807[a3];
        a2 = Class598.Method10() % 256;
        Class598.Field2807[a3] = Field2807[a2];
        Class598.Field2807[a2] = a5;
        --a3;
        a3 = 0;
        if (a3 < 258) {
            Class598.Field2807[256 + a3] = Field2807[a3];
            Class598.Field2810[256 + a3] = Field2810[a3];
            a2 = 0;
            if (a2 < 2) {
                Class598.Field2809[256 + a3][a2] = Field2809[a3][a2];
                ++a2;
            }
            if ((a2 = 0) < 3) {
                Class598.Field2808[256 + a3][a2] = Field2808[a3][a2];
                ++a2;
            }
            ++a3;
        }
    }

    public static float[] Method162(Class593 a2, float[] a3) {
        a3 = new float[2];
        float a4 = 0.0f;
        float a5 = 0.0f;
        float a6 = -100.0f;
        while (a6 < 100.0f) {
            float a7 = a2.Method29(a6);
            a4 = Math.min((float)a4, (float)a7);
            a5 = Math.max((float)a5, (float)a7);
            a6 = (float)((double)a6 + 1.27139);
        }
        a3[0] = a4;
        a3[1] = a5;
        return a3;
    }

    public static float[] Method163(Class594 a2, float[] a3) {
        a3 = new float[2];
        float a4 = 0.0f;
        float a5 = 0.0f;
        float a6 = -100.0f;
        while (a6 < 100.0f) {
            float a7 = -100.0f;
            while (a7 < 100.0f) {
                float a8 = a2.Method20(a7, a6);
                a4 = Math.min((float)a4, (float)a8);
                a5 = Math.max((float)a5, (float)a8);
                a7 = (float)((double)a7 + 10.77139);
            }
            a6 = (float)((double)a6 + 10.35173);
        }
        a3[0] = a4;
        a3[1] = a5;
        return a3;
    }

    static {
        Class598.Method85(null);
        Field2808 = new float[514][3];
        Field2809 = new float[514][2];
        Field2810 = new float[514];
        Field2811 = true;
    }

    public static void Method85(int[] nArray) {
        Field2812 = nArray;
    }

    public static int[] Method86() {
        return Field2812;
    }
}