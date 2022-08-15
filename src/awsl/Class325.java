/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class326;
import awsl.Class330;
import awsl.Class91;

public class Class325
extends Class326 {
    public static double Method1010(double a, double a2, double a3, double a4) {
        double a5 = 1.70158f;
        return a3 * (a /= a4) * a * ((double)2.70158f * a - (double)1.70158f) + a2;
    }

    public static final double Method1254(double a, double a2, double a3, double a4, double a5) {
        return a3 * (a /= a4) * a * ((a5 + 1.0) * a - a5) + a2;
    }

    public static final double Method1012(double a, double a2, double a3, double a4) {
        double a5 = 1.70158f;
        a = a / a4 - 1.0;
        return a3 * (a * a * ((a5 + 1.0) * a + a5) + 1.0) + a2;
    }

    public static final double Method1255(double a, double a2, double a3, double a4, double a5) {
        a = a / a4 - 1.0;
        return a3 * (a * a * ((a5 + 1.0) * a + a5) + 1.0) + a2;
    }

    /*
     * WARNING - void declaration
     */
    public static final double Method1014(double a, double a2, double a3, double a4) {
        void a5;
        double d;
        double d2 = 1.70158f;
        boolean a6 = Class330.Method1059();
        a /= a4 / 2.0;
        if (d < 1.0) {
            return a3 / 2.0 * (a * a * (((a5 *= (double)1.525f) + 1.0) * a - a5)) + a2;
        }
        double d3 = a3 / 2.0 * ((a -= 2.0) * a * (((a5 *= (double)1.525f) + 1.0) * a + a5) + 2.0) + a2;
        Class91.Method3647(new String[1]);
        return d3;
    }

    public static final double Method1256(double a, double a2, double a3, double a4, double a5) {
        double d;
        boolean bl = Class330.Method1059();
        a /= a4 / 2.0;
        if (d < 1.0) {
            return a3 / 2.0 * (a * a * (((a5 *= (double)1.525f) + 1.0) * a - a5)) + a2;
        }
        double d2 = a3 / 2.0 * ((a -= 2.0) * a * (((a5 *= (double)1.525f) + 1.0) * a + a5) + 2.0) + a2;
        if (Class91.Method3648() == null) {
            Class330.Method1058(false);
        }
        return d2;
    }
}