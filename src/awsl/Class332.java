/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

import awsl.Class326;

public class Class332
extends Class326 {
    public static final double Method1010(double a, double a2, double a3, double a4) {
        return a3 - Class332.Method1012(a4 - a, 0.0, a3, a4) + a2;
    }

    public static final double Method1012(double a, double a2, double a3, double a4) {
        double d;
        a /= a4;
        if (d < 0.3636363744735718) {
            return a3 * (7.5625 * a * a) + a2;
        }
        if (a < 0.7272727489471436) {
            return a3 * (7.5625 * (a -= 0.5454545617103577) * a + 0.75) + a2;
        }
        if (a < 0.9090909090909091) {
            return a3 * (7.5625 * (a -= 0.8181818127632141) * a + 0.9375) + a2;
        }
        return a3 * (7.5625 * (a -= 0.9545454382896423) * a + 0.984375) + a2;
    }

    public static final double Method1014(double a, double a2, double a3, double a4) {
        if (a < a4 / 2.0) {
            return Class332.Method1010(a * 2.0, 0.0, a3, a4) * 0.5 + a2;
        }
        return Class332.Method1012(a * 2.0 - a4, 0.0, a3, a4) * 0.5 + a3 * 0.5 + a2;
    }
}