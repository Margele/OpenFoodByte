/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class326;

public class Class320
extends Class326 {
    public static final double Method1010(double a, double a2, double a3, double a4) {
        return a == 0.0 ? a2 : a3 * Math.pow((double)2.0, (double)(10.0 * (a / a4 - 1.0))) + a2;
    }

    public static final double Method1012(double a, double a2, double a3, double a4) {
        return a == a4 ? a2 + a3 : a3 * (-Math.pow((double)2.0, (double)(-10.0 * a / a4)) + 1.0) + a2;
    }

    public static final double Method1014(double a, double a2, double a3, double a4) {
        double d;
        if (a == 0.0) {
            return a2;
        }
        if (a == a4) {
            return a2 + a3;
        }
        a /= a4 / 2.0;
        if (d < 1.0) {
            return a3 / 2.0 * Math.pow((double)2.0, (double)(10.0 * (a - 1.0))) + a2;
        }
        return a3 / 2.0 * (-Math.pow((double)2.0, (double)(-10.0 * (a -= 1.0))) + 2.0) + a2;
    }
}