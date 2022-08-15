/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.security.SecureRandom
 *  java.util.Random
 */
package awsl;

import java.security.SecureRandom;
import java.util.Random;

public class Class328 {
    private static final Random Field1614 = new Random();
    private static int Field1615;

    public static boolean Method976(String a) {
        try {
            Integer.parseInt((String)a);
        }
        catch (NumberFormatException a2) {
            return false;
        }
        catch (NullPointerException a3) {
            return false;
        }
        return true;
    }

    public static Double Method977(double a, double a2, double a3) {
        if (a < a2) {
            return a2;
        }
        if (a > a3) {
            return a3;
        }
        return a;
    }

    public static Double Method978(double a, double a2) {
        if (a > a2) {
            double a3 = a;
            a = a2;
            a2 = a3;
        }
        return a2 - a;
    }

    public static float Method979(long a) {
        a = System.currentTimeMillis() + a;
        return 0.4f + (float)new Random(a).nextInt(80000000) / 1.0E9f + 1.45E-9f;
    }

    public static float Method980(float a, float a2) {
        SecureRandom a3 = new SecureRandom();
        return a3.nextFloat() * (a2 - a) + a;
    }

    public static int Method981(int a, int a2) {
        SecureRandom a3 = new SecureRandom();
        return a3.nextInt() * (a2 - a) + a;
    }

    public static double Method982(double a, double a2) {
        SecureRandom a3 = new SecureRandom();
        return a3.nextDouble() * (a2 - a) + a;
    }

    public static float Method983(float a, float a2) {
        float a3 = Math.abs((float)(a2 - a)) % 360.0f;
        float a4 = a3 > 180.0f ? 360.0f - a3 : a3;
        return a4;
    }

    public static double Method984(double a, double a2) {
        return (a + a2) / 2.0;
    }

    public static float Method985(float a, float a2) {
        return (a + a2) / 2.0f;
    }

    public static double Method986(double a, double a2) {
        return (a + a2) / 2.0;
    }

    public static int Method987(int a, int a2) {
        return a + Field1614.nextInt(a2 - a + 1);
    }

    public static double Method988(double a, double a2) {
        return a + (double)Field1614.nextInt((int)(a2 - a + 1.0));
    }

    public static double Method989(double a, double a2) {
        double a3;
        Random a4 = new Random();
        double a5 = a2 - a;
        double a6 = a4.nextDouble() * a5;
        if (a6 > a2) {
            a6 = a2;
        }
        if ((a3 = a6 + a) > a2) {
            a3 = a2;
        }
        return a3;
    }

    public static float Method990(float a, float a2) {
        Random a3 = new Random();
        float a4 = a2 - a;
        float a5 = a3.nextFloat() * a4;
        float a6 = a5 + a;
        return a6;
    }

    public static int Method991(int a, int a2) {
        Random a3 = new Random();
        int a4 = a3.nextInt(a2 - a + 1) + a;
        return a4;
    }

    public static double Method992(double a, int a2) {
        throw new IllegalArgumentException();
    }

    static {
        Class328.Method993(76);
    }

    public static void Method993(int n) {
        Field1615 = n;
    }

    public static int Method994() {
        return Field1615;
    }

    public static int Method995() {
        int n = Class328.Method994();
        return 88;
    }

    private static NumberFormatException Method996(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}