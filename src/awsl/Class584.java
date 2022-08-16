/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class593;
import awsl.Class594;
import awsl.Class595;
import awsl.Class598;
import java.util.Random;
import obfuscate.a;

public class Class584
implements Class593,
Class594,
Class595 {
    private static Random Field2745 = new Random();
    public short[] Field2746;
    private static final int Field2747 = 256;
    private static final int Field2748 = 255;
    private static final int Field2749 = 3;
    private static float[] Field2750;
    private static final int Field2751 = 100;
    private static final int Field2752 = 401;
    private static float[] Field2753;

    public Class584() {
        int[] nArray = Class598.Method86();
        int[] nArray2 = nArray;
        this.Field2746 = new short[]{225, 155, 210, 108, 175, 199, 221, 144, 203, 116, 70, 213, 69, 158, 33, 252, 5, 82, 173, 133, 222, 139, 174, 27, 9, 71, 90, 246, 75, 130, 91, 191, 169, 138, 2, 151, 194, 235, 81, 7, 25, 113, 228, 159, 205, 253, 134, 142, 248, 65, 224, 217, 22, 121, 229, 63, 89, 103, 96, 104, 156, 17, 201, 129, 36, 8, 165, 110, 237, 117, 231, 56, 132, 211, 152, 20, 181, 111, 239, 218, 170, 163, 51, 172, 157, 47, 80, 212, 176, 250, 87, 49, 99, 242, 136, 189, 162, 115, 44, 43, 124, 94, 150, 16, 141, 247, 32, 10, 198, 223, 255, 72, 53, 131, 84, 57, 220, 197, 58, 50, 208, 11, 241, 28, 3, 192, 62, 202, 18, 215, 153, 24, 76, 41, 15, 179, 39, 46, 55, 6, 128, 167, 23, 188, 106, 34, 187, 140, 164, 73, 112, 182, 244, 195, 227, 13, 35, 77, 196, 185, 26, 200, 226, 119, 31, 123, 168, 125, 249, 68, 183, 230, 177, 135, 160, 180, 12, 1, 243, 148, 102, 166, 38, 238, 251, 37, 240, 126, 64, 74, 161, 40, 184, 149, 171, 178, 101, 66, 29, 59, 146, 61, 254, 107, 42, 86, 154, 4, 236, 232, 120, 21, 233, 209, 45, 98, 193, 114, 78, 19, 206, 14, 118, 127, 48, 79, 147, 85, 30, 207, 219, 54, 88, 234, 190, 122, 95, 67, 143, 109, 137, 214, 145, 93, 92, 100, 245, 0, 216, 186, 60, 83, 105, 97, 204, 52};
        a.trash(new String[4]);
    }

    @Override
    public float Method29(float a2) {
        return this.Method20(a2, 0.1f);
    }

    @Override
    public float Method20(float a2, float a3) {
        float a4 = 0.0f;
        if (Field2750 == null) {
            Field2750 = Class584.Method284(665);
        }
        int a5 = Class584.Method283(a2);
        float a6 = a2 - (float)a5;
        int a7 = Class584.Method283(a3);
        float a8 = a3 - (float)a7;
        int a9 = 2;
        for (int a10 = -a9; a10 <= a9; ++a10) {
            int a11 = -a9;
            if (a11 > a9) continue;
            int a12 = this.Field2746[a5 + a10 + this.Field2746[a7 + a11 & 0xFF] & 0xFF];
            int a13 = 3;
            while (true) {
                int a14 = a12 * 4;
                float a15 = a6 - ((float)a10 + Field2750[a14++]);
                float a16 = a8 - ((float)a11 + Field2750[a14++]);
                float a17 = a15 * a15 + a16 * a16;
                a4 += this.Method155(a17) * Field2750[a14];
                --a13;
                a12 = a12 + 1 & 0xFF;
            }
        }
        return a4 / 3.0f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public float Method67(float a2, float a3, float a4) {
        void a5;
        float f = 0.0f;
        int[] a6 = Class598.Method86();
        if (Field2750 == null) {
            Field2750 = Class584.Method284(665);
        }
        int a7 = Class584.Method283(a2);
        float a8 = a2 - (float)a7;
        int a9 = Class584.Method283(a3);
        float a10 = a3 - (float)a9;
        int a11 = Class584.Method283(a4);
        float a12 = a4 - (float)a11;
        int a13 = 2;
        int a14 = -a13;
        if (a14 <= a13) {
            int a15 = -a13;
            if (a15 <= a13) {
                int a16 = -a13;
                if (a16 <= a13) {
                    int a17 = this.Field2746[a7 + a14 + this.Field2746[a9 + a15 + this.Field2746[a11 + a16 & 0xFF] & 0xFF] & 0xFF];
                    int a18 = 3;
                    int a19 = a17 * 4;
                    float a20 = a8 - ((float)a14 + Field2750[a19++]);
                    float a21 = a10 - ((float)a15 + Field2750[a19++]);
                    float a22 = a12 - ((float)a16 + Field2750[a19++]);
                    float a23 = a20 * a20 + a21 * a21 + a22 * a22;
                    a5 += this.Method155(a23) * Field2750[a19];
                    --a18;
                    a17 = a17 + 1 & 0xFF;
                    ++a16;
                }
                ++a15;
            }
            ++a14;
        }
        return (float)(a5 / 3.0f);
    }

    public static int Method283(float a2) {
        int a3 = (int)a2;
        if (a2 < 0.0f && a2 != (float)a3) {
            return a3 - 1;
        }
        return a3;
    }

    public float Method155(float a2) {
        int a3;
        if (a2 >= 4.0f) {
            return 0.0f;
        }
        if (Field2753 == null) {
            Field2753 = new float[401];
            for (a3 = 0; a3 < 401; ++a3) {
                float a4 = (float)a3 / 100.0f;
                Class584.Field2753[a3] = (a4 = (float)Math.sqrt((double)a4)) < 1.0f ? 0.5f * (2.0f + a4 * a4 * (-5.0f + a4 * 3.0f)) : 0.5f * (4.0f + a4 * (-8.0f + a4 * (5.0f - a4)));
            }
        }
        if ((a3 = Class584.Method283(a2 = a2 * 100.0f + 0.5f)) >= 401) {
            return 0.0f;
        }
        return Field2753[a3];
    }

    static float[] Method284(int a2) {
        float[] a3 = new float[1024];
        Field2745 = new Random((long)a2);
        for (int a4 = 0; a4 < 256; ++a4) {
            a3[a4++] = Field2745.nextFloat();
            a3[a4++] = Field2745.nextFloat();
            a3[a4++] = Field2745.nextFloat();
            a3[a4++] = 1.0f - 2.0f * Field2745.nextFloat();
        }
        return a3;
    }
}