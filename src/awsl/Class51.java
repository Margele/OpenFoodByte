/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class62;

public class Class51
extends Class62 {
    private float Field588 = 1.0f;
    private float Field589 = 1.0f;

    @Override
    protected float Method29(float a) {
        a *= this.Field588;
        a = (a - 0.5f) * this.Field589 + 0.5f;
        return a;
    }

    public void Method56(float a) {
        this.Field588 = a;
        this.Field633 = false;
    }

    public float Method57() {
        return this.Field588;
    }

    public void Method58(float a) {
        this.Field589 = a;
        this.Field633 = false;
    }

    public float Method59() {
        return this.Field589;
    }

    public String toString() {
        return "Colors/Contrast...";
    }
}