/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

import awsl.Class326;

public class Class330
extends Class326 {
    private static boolean Field1616;

    public static final double Method1010(double a, double a2, double a3, double a4) {
        return a3 * (a /= a4) * a * a + a2;
    }

    public static final double Method1012(double a, double a2, double a3, double a4) {
        a = a / a4 - 1.0;
        return a3 * (a * a * a + 1.0) + a2;
    }

    public static final double Method1014(double a, double a2, double a3, double a4) {
        double d;
        a /= a4 / 2.0;
        if (d < 1.0) {
            return a3 / 2.0 * a * a * a + a2;
        }
        return a3 / 2.0 * ((a -= 2.0) * a * a + 2.0) + a2;
    }

    public static void Method1058(boolean bl) {
        Field1616 = bl;
    }

    public static boolean Method1059() {
        return Field1616;
    }

    public static boolean Method1060() {
        boolean bl = Class330.Method1059();
        return true;
    }

    static {
        if (Class330.Method1060()) {
            Class330.Method1058(true);
        }
    }
}