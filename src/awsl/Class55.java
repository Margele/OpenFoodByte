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

import awsl.Class62;

public class Class55
extends Class62 {
    private float Field605 = 1.0f;

    @Override
    protected float Method29(float a) {
        return 1.0f - (float)Math.exp((double)(-a * this.Field605));
    }

    public void Method56(float a) {
        this.Field605 = a;
        this.Field633 = false;
    }

    public float Method57() {
        return this.Field605;
    }

    public String toString() {
        return "Colors/Exposure...";
    }
}