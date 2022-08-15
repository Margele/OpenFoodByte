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

public class Class40
extends Class62 {
    private float Field330 = 1.0f;

    public Class40() {
    }

    public Class40(float a) {
        this.Field330 = a;
    }

    @Override
    protected float Method29(float a) {
        return a * this.Field330;
    }

    public void Method56(float a) {
        this.Field330 = a;
        this.Field633 = false;
    }

    public float Method57() {
        return this.Field330;
    }

    public String toString() {
        return "Colors/Rescale...";
    }
}