/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

import awsl.Class326;

public class Class318
extends Class326 {
    public static final double Method1010(double a, double a2, double a3, double a4) {
        return a3 * (a /= a4) * a + a2;
    }

    public static final double Method1012(double a, double a2, double a3, double a4) {
        return -a3 * (a /= a4) * (a - 2.0) + a2;
    }

    public static final double Method1014(double a, double a2, double a3, double a4) {
        double d;
        a /= a4 / 2.0;
        if (d < 1.0) {
            return a3 / 2.0 * a * a + a2;
        }
        return -a3 / 2.0 * ((a -= 1.0) * (a - 2.0) - 1.0) + a2;
    }
}