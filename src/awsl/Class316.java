/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class321;
import awsl.Class661;

public class Class316
extends Class321 {
    public Class316(int a, double a2) {
        super(a, a2);
    }

    public Class316(int a, double a2, Class661 a3) {
        super(a, a2, a3);
    }

    @Override
    protected double Method797(double a) {
        double a2 = a / (double)this.Field1605;
        return -2.0 * Math.pow((double)a2, (double)3.0) + 3.0 * Math.pow((double)a2, (double)2.0);
    }
}