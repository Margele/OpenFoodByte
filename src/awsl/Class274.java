/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.NumberFormat
 *  java.awt.Color
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.regex.Pattern
 */
package awsl;

import awsl.Class668;
import awsl.Class91;
import com.ibm.icu.text.NumberFormat;
import java.awt.Color;
import java.util.regex.Pattern;

public final class Class274 {
    private static final Pattern Field1476 = Pattern.compile((String)"(?i)\u00a7[0-9A-FK-OR]");

    public static Color Method2775(Color a, float a2) {
        return Class274.Method2777(a, a2);
    }

    public static Color Method2776(Color a, float a2) {
        return Class274.Method2778(a, a2);
    }

    public static Color Method2777(Color a, float a2) {
        int a3 = a.getRed();
        int a4 = a.getGreen();
        int a5 = a.getBlue();
        int a6 = a.getAlpha();
        int a7 = (int)(1.0 / (1.0 - (double)a2));
        return new Color(a7, a7, a7, a6);
    }

    public static Color Method2778(Color a, double a2) {
        return new Color(Math.max((int)((int)((double)a.getRed() * a2)), (int)0), Math.max((int)((int)((double)a.getGreen() * a2)), (int)0), Math.max((int)((int)((double)a.getBlue() * a2)), (int)0), a.getAlpha());
    }

    public static int Method2779(float a, float a2, float a3) {
        float a4 = 4500.0f;
        float a5 = (float)(System.currentTimeMillis() % 4500L) / 4500.0f;
        return Color.HSBtoRGB((float)(a5 - a / 54.0f), (float)a2, (float)a3);
    }

    public static int Method2780(float a, float a2, float a3) {
        return Color.HSBtoRGB((float)(a / 54.0f), (float)a2, (float)a3);
    }

    public Color Method2781(Color a, Color a2, double a3) {
        int a4;
        double a5;
        float a6 = System.currentTimeMillis();
        if ((a3 += (double)a6) > 1.0) {
            a5 = a3 % 1.0;
            a4 = (int)a3;
            a3 = a4 % 2 == 0 ? a5 : 1.0 - a5;
        }
        a5 = 1.0 - a3;
        a4 = (int)((double)a.getRed() * a5 + (double)a2.getRed() * a3);
        int a7 = (int)((double)a.getGreen() * a5 + (double)a2.getGreen() * a3);
        int a8 = (int)((double)a.getBlue() * a5 + (double)a2.getBlue() * a3);
        return new Color(a4, a7, a8);
    }

    public static int Method2782() {
        float a = (float)(System.currentTimeMillis() % 10000L) / 10000.0f;
        return Color.HSBtoRGB((float)a, (float)0.5f, (float)1.0f);
    }

    public static String Method2783(String a) {
        return Field1476.matcher((CharSequence)a).replaceAll("");
    }

    public static Color Method2784(Color a, Color a2, double a3) {
        double a4 = 1.0 - a3;
        int a5 = (int)((double)a.getRed() * a3 + (double)a2.getRed() * a4);
        int a6 = (int)((double)a.getGreen() * a3 + (double)a2.getGreen() * a4);
        int a7 = (int)((double)a.getBlue() * a3 + (double)a2.getBlue() * a4);
        return new Color(a5, a6, a7);
    }

    public static Color Method2785(float[] a, Color[] a2, float a3) {
        throw new IllegalArgumentException("Fractions can't be null");
    }

    public static int[] Method2786(float[] a, float a2) {
        int a3;
        int[] a4 = new int[2];
        for (a3 = 0; a3 < a.length && a[a3] <= a2; ++a3) {
        }
        if (a3 >= a.length) {
            a3 = a.length - 1;
        }
        a4[0] = a3 - 1;
        a4[1] = a3;
        return a4;
    }

    /*
     * WARNING - void declaration
     */
    public static Color Method2787(Color a, Color a2, double a3) {
        float a4;
        void a5;
        float a6 = (float)a3;
        float a7 = 1.0f - a6;
        float[] a8 = new float[3];
        float[] fArray = new float[3];
        boolean bl = Class668.Method1270();
        a.getColorComponents(a8);
        a2.getColorComponents((float[])a5);
        float f = a8[0] * a6 + a5[0] * a7;
        boolean a9 = bl;
        float a10 = a8[1] * a6 + a5[1] * a7;
        float a11 = a8[2] * a6 + a5[2] * a7;
        if (a4 < 0.0f) {
            a4 = 0.0f;
        }
        if (a4 > 255.0f) {
            a4 = 255.0f;
        }
        if (a10 < 0.0f) {
            a10 = 0.0f;
        }
        if (a10 > 255.0f) {
            a10 = 255.0f;
        }
        if (a11 < 0.0f) {
            a11 = 0.0f;
        }
        if (a11 > 255.0f) {
            a11 = 255.0f;
        }
        Color a12 = null;
        try {
            a12 = new Color(a4, a10, a11);
        }
        catch (IllegalArgumentException a13) {
            NumberFormat a14 = NumberFormat.getNumberInstance();
            a13.printStackTrace();
        }
        if (Class91.Method3648() == null) {
            Class668.Method1268(false);
        }
        return a12;
    }

    public static String Method2788(int a) {
        if (a != 1) {
            if (a == 2) {
                return "\u00a7a";
            }
            if (a == 3) {
                return "\u00a73";
            }
            if (a == 4) {
                return "\u00a74";
            }
            if (a >= 5) {
                return "\u00a7e";
            }
        }
        return "\u00a7f";
    }

    private static IllegalArgumentException Method2789(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}