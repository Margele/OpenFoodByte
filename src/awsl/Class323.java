/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class326;

public class Class323
extends Class326 {
    public static final double Method1010(double a, double a2, double a3, double a4) {
        return -a3 * Math.cos((double)(a / a4 * 1.5707963267948966)) + a3 + a2;
    }

    public static final double Method1012(double a, double a2, double a3, double a4) {
        return a3 * Math.sin((double)(a / a4 * 1.5707963267948966)) + a2;
    }

    public static final double Method1014(double a, double a2, double a3, double a4) {
        return -a3 / 2.0 * (Math.cos((double)(Math.PI * a / a4)) - 1.0) + a2;
    }
}