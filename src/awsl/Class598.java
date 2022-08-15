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
import awsl.Class91;
import java.util.Random;

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

    public static float Method158(float a, float a2, float a3) {
        int[] a4 = Class598.Method86();
        if (Field2811) {
            Field2811 = false;
            Class598.Method89();
        }
        float a5 = a + 4096.0f;
        int a6 = (int)a5 & 0xFF;
        int a7 = a6 + 1 & 0xFF;
        float a8 = a5 - (float)((int)a5);
        float a9 = a8 - 1.0f;
        a5 = a2 + 4096.0f;
        int a10 = (int)a5 & 0xFF;
        int a11 = a10 + 1 & 0xFF;
        float a12 = a5 - (float)((int)a5);
        float a13 = a12 - 1.0f;
        a5 = a3 + 4096.0f;
        int a14 = (int)a5 & 0xFF;
        int a15 = a14 + 1 & 0xFF;
        float a16 = a5 - (float)((int)a5);
        float a17 = a16 - 1.0f;
        int a18 = Field2807[a6];
        int a19 = Field2807[a7];
        int a20 = Field2807[a18 + a10];
        int a21 = Field2807[a19 + a10];
        int a22 = Field2807[a18 + a11];
        int a23 = Field2807[a19 + a11];
        a5 = Class598.Method155(a8);
        float a24 = Class598.Method155(a12);
        float a25 = Class598.Method155(a16);
        float[] a26 = Field2808[a20 + a14];
        float a27 = a8 * a26[0] + a12 * a26[1] + a16 * a26[2];
        a26 = Field2808[a21 + a14];
        float a28 = a9 * a26[0] + a12 * a26[1] + a16 * a26[2];
        float a29 = Class598.Method159(a5, a27, a28);
        a26 = Field2808[a22 + a14];
        a27 = a8 * a26[0] + a13 * a26[1] + a16 * a26[2];
        a26 = Field2808[a23 + a14];
        a28 = a9 * a26[0] + a13 * a26[1] + a16 * a26[2];
        float a30 = Class598.Method159(a5, a27, a28);
        float a31 = Class598.Method159(a24, a29, a30);
        a26 = Field2808[a20 + a15];
        a27 = a8 * a26[0] + a12 * a26[1] + a17 * a26[2];
        a26 = Field2808[a21 + a15];
        a28 = a9 * a26[0] + a12 * a26[1] + a17 * a26[2];
        a29 = Class598.Method159(a5, a27, a28);
        a26 = Field2808[a22 + a15];
        a27 = a8 * a26[0] + a13 * a26[1] + a17 * a26[2];
        a26 = Field2808[a23 + a15];
        a28 = a9 * a26[0] + a13 * a26[1] + a17 * a26[2];
        a30 = Class598.Method159(a5, a27, a28);
        float a32 = Class598.Method159(a24, a29, a30);
        float f = 1.5f * Class598.Method159(a25, a31, a32);
        if (Class91.Method3648() == null) {
            Class598.Method85(new int[3]);
        }
        return f;
    }

    public static float Method159(float a, float a2, float a3) {
        return a2 + a * (a3 - a2);
    }

    private static void Method160(float[] a) {
        float a2 = (float)Math.sqrt((double)(a[0] * a[0] + a[1] * a[1]));
        a[0] = a[0] / a2;
        a[1] = a[1] / a2;
    }

    static void Method161(float[] a) {
        float a2 = (float)Math.sqrt((double)(a[0] * a[0] + a[1] * a[1] + a[2] * a[2]));
        a[0] = a[0] / a2;
        a[1] = a[1] / a2;
        a[2] = a[2] / a2;
    }

    private static int Method10() {
        return Field2803.nextInt() & Integer.MAX_VALUE;
    }

    private static void Method89() {
        int a;
        int a2 = 0;
        int[] a3 = Class598.Method86();
        if (a2 < 256) {
            Class598.Field2807[a2] = a2;
            Class598.Field2810[a2] = (float)(Class598.Method10() % 512 - 256) / 256.0f;
            a = 0;
            if (a < 2) {
                Class598.Field2809[a2][a] = (float)(Class598.Method10() % 512 - 256) / 256.0f;
                ++a;
            }
            Class598.Method160(Field2809[a2]);
            a = 0;
            if (a < 3) {
                Class598.Field2808[a2][a] = (float)(Class598.Method10() % 512 - 256) / 256.0f;
                ++a;
            }
            Class598.Method161(Field2808[a2]);
            ++a2;
        }
        a2 = 255;
        int a4 = Field2807[a2];
        a = Class598.Method10() % 256;
        Class598.Field2807[a2] = Field2807[a];
        Class598.Field2807[a] = a4;
        --a2;
        a2 = 0;
        if (a2 < 258) {
            Class598.Field2807[256 + a2] = Field2807[a2];
            Class598.Field2810[256 + a2] = Field2810[a2];
            a = 0;
            if (a < 2) {
                Class598.Field2809[256 + a2][a] = Field2809[a2][a];
                ++a;
            }
            if ((a = 0) < 3) {
                Class598.Field2808[256 + a2][a] = Field2808[a2][a];
                ++a;
            }
            ++a2;
        }
    }

    public static float[] Method162(Class593 a, float[] a2) {
        a2 = new float[2];
        float a3 = 0.0f;
        float a4 = 0.0f;
        float a5 = -100.0f;
        while (a5 < 100.0f) {
            float a6 = a.Method29(a5);
            a3 = Math.min((float)a3, (float)a6);
            a4 = Math.max((float)a4, (float)a6);
            a5 = (float)((double)a5 + 1.27139);
        }
        a2[0] = a3;
        a2[1] = a4;
        return a2;
    }

    public static float[] Method163(Class594 a, float[] a2) {
        a2 = new float[2];
        float a3 = 0.0f;
        float a4 = 0.0f;
        float a5 = -100.0f;
        while (a5 < 100.0f) {
            float a6 = -100.0f;
            while (a6 < 100.0f) {
                float a7 = a.Method20(a6, a5);
                a3 = Math.min((float)a3, (float)a7);
                a4 = Math.max((float)a4, (float)a7);
                a6 = (float)((double)a6 + 10.77139);
            }
            a5 = (float)((double)a5 + 10.35173);
        }
        a2[0] = a3;
        a2[1] = a4;
        return a2;
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