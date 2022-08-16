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
import com.ibm.icu.text.NumberFormat;
import java.awt.Color;
import java.util.regex.Pattern;
import obfuscate.a;

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
    public static Color Method2787(Color a2, Color a3, double a4) {
        float a5;
        void a6;
        float a7 = (float)a4;
        float a8 = 1.0f - a7;
        float[] a9 = new float[3];
        float[] fArray = new float[3];
        boolean bl = Class668.Method1270();
        a2.getColorComponents(a9);
        a3.getColorComponents((float[])a6);
        float f = a9[0] * a7 + a6[0] * a8;
        boolean a10 = bl;
        float a11 = a9[1] * a7 + a6[1] * a8;
        float a12 = a9[2] * a7 + a6[2] * a8;
        if (a5 < 0.0f) {
            a5 = 0.0f;
        }
        if (a5 > 255.0f) {
            a5 = 255.0f;
        }
        if (a11 < 0.0f) {
            a11 = 0.0f;
        }
        if (a11 > 255.0f) {
            a11 = 255.0f;
        }
        if (a12 < 0.0f) {
            a12 = 0.0f;
        }
        if (a12 > 255.0f) {
            a12 = 255.0f;
        }
        Color a13 = null;
        try {
            a13 = new Color(a5, a11, a12);
        }
        catch (IllegalArgumentException a14) {
            NumberFormat a15 = NumberFormat.getNumberInstance();
            a14.printStackTrace();
        }
        if (a.trash() == null) {
            Class668.Method1268(false);
        }
        return a13;
    }

    public static String Method2788(int a2) {
        if (a2 != 1) {
            if (a2 == 2) {
                return "\u00a7a";
            }
            if (a2 == 3) {
                return "\u00a73";
            }
            if (a2 == 4) {
                return "\u00a74";
            }
            if (a2 >= 5) {
                return "\u00a7e";
            }
        }
        return "\u00a7f";
    }

    private static IllegalArgumentException Method2789(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}