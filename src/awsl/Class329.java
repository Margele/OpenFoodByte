/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class326;
import awsl.Class330;

public class Class329
extends Class326 {
    public static final double Method1010(double a, double a2, double a3, double a4) {
        if (a == 0.0) {
            return a2;
        }
        if ((a /= a4) == 1.0) {
            return a2 + a3;
        }
        double a5 = a4 * (double)0.3f;
        double a6 = a3;
        double a7 = a5 / 4.0;
        return -(a6 * Math.pow((double)2.0, (double)(10.0 * (a -= 1.0))) * Math.sin((double)((a * a4 - a7) * (Math.PI * 2) / a5))) + a2;
    }

    public static final double Method1011(double a, double a2, double a3, double a4, double a5, double a6) {
        double a7;
        boolean a8 = Class330.Method1060();
        if (a == 0.0) {
            return a2;
        }
        if ((a /= a4) == 1.0) {
            return a2 + a3;
        }
        if (a5 < Math.abs((double)a3)) {
            a5 = a3;
            a7 = a6 / 4.0;
        }
        a7 = a6 / (Math.PI * 2) * Math.asin((double)(a3 / a5));
        return -(a5 * Math.pow((double)2.0, (double)(10.0 * (a -= 1.0))) * Math.sin((double)((a * a4 - a7) * (Math.PI * 2) / a6))) + a2;
    }

    public static final double Method1012(double a, double a2, double a3, double a4) {
        if (a == 0.0) {
            return a2;
        }
        if ((a /= a4) == 1.0) {
            return a2 + a3;
        }
        double a5 = a4 * (double)0.3f;
        double a6 = a3;
        double a7 = a5 / 4.0;
        return a6 * Math.pow((double)2.0, (double)(-10.0 * a)) * Math.sin((double)((a * a4 - a7) * (Math.PI * 2) / a5)) + a3 + a2;
    }

    public static final double Method1013(double a, double a2, double a3, double a4, double a5, double a6) {
        double a7;
        boolean a8 = Class330.Method1059();
        if (a == 0.0) {
            return a2;
        }
        if ((a /= a4) == 1.0) {
            return a2 + a3;
        }
        if (a5 < Math.abs((double)a3)) {
            a5 = a3;
            a7 = a6 / 4.0;
        }
        a7 = a6 / (Math.PI * 2) * Math.asin((double)(a3 / a5));
        return a5 * Math.pow((double)2.0, (double)(-10.0 * a)) * Math.sin((double)((a * a4 - a7) * (Math.PI * 2) / a6)) + a3 + a2;
    }

    public static final double Method1014(double a, double a2, double a3, double a4) {
        if (a == 0.0) {
            return a2;
        }
        if ((a /= a4 / 2.0) == 2.0) {
            return a2 + a3;
        }
        double a5 = a4 * 0.45000001788139343;
        double a6 = a3;
        double a7 = a5 / 4.0;
        if (a < 1.0) {
            return -0.5 * (a6 * Math.pow((double)2.0, (double)(10.0 * (a -= 1.0))) * Math.sin((double)((a * a4 - a7) * (Math.PI * 2) / a5))) + a2;
        }
        return a6 * Math.pow((double)2.0, (double)(-10.0 * (a -= 1.0))) * Math.sin((double)((a * a4 - a7) * (Math.PI * 2) / a5)) * 0.5 + a3 + a2;
    }

    public static final double Method1015(double a, double a2, double a3, double a4, double a5, double a6) {
        double a7;
        boolean a8 = Class330.Method1059();
        if (a == 0.0) {
            return a2;
        }
        if ((a /= a4 / 2.0) == 2.0) {
            return a2 + a3;
        }
        if (a5 < Math.abs((double)a3)) {
            a5 = a3;
            a7 = a6 / 4.0;
        }
        a7 = a6 / (Math.PI * 2) * Math.asin((double)(a3 / a5));
        if (a < 1.0) {
            return -0.5 * (a5 * Math.pow((double)2.0, (double)(10.0 * (a -= 1.0))) * Math.sin((double)((a * a4 - a7) * (Math.PI * 2) / a6))) + a2;
        }
        return a5 * Math.pow((double)2.0, (double)(-10.0 * (a -= 1.0))) * Math.sin((double)((a * a4 - a7) * (Math.PI * 2) / a6)) * 0.5 + a3 + a2;
    }
}