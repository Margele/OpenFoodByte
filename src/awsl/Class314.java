/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class321;
import awsl.Class661;
import obfuscate.a;

public class Class314
extends Class321 {
    private final float Field1602;
    private static String[] Field1603;

    public Class314(int a, double a2, float a3) {
        super(a, a2);
        this.Field1602 = a3;
    }

    public Class314(int a, double a2, float a3, Class661 a4) {
        super(a, a2, a4);
        this.Field1602 = a3;
    }

    @Override
    protected boolean Method831() {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected double Method797(double a2) {
        void a3;
        void a4;
        double d = a2 / (double)this.Field1605;
        float f = this.Field1602 + 1.0f;
        String[] a5 = Class314.Method833();
        double d2 = Math.max((double)0.0, (double)(1.0 + (double)a4 * Math.pow((double)(a3 - 1.0), (double)3.0) + (double)this.Field1602 * Math.pow((double)(a3 - 1.0), (double)2.0)));
        if (a.trash() == null) {
            Class314.Method832(new String[1]);
        }
        return d2;
    }

    public static void Method832(String[] stringArray) {
        Field1603 = stringArray;
    }

    public static String[] Method833() {
        return Field1603;
    }

    static {
        if (Class314.Method833() == null) {
            Class314.Method832(new String[5]);
        }
    }
}