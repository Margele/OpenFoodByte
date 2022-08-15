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
import awsl.Class776;

public class Class53
extends Class62 {
    private float Field600 = 0.5f;
    private float Field601 = 0.5f;

    @Override
    protected float Method29(float a) {
        a = Class776.Method1704(a, this.Field600);
        a = Class776.Method1703(a, this.Field601);
        return a;
    }

    public void Method56(float a) {
        this.Field600 = a;
        this.Field633 = false;
    }

    public float Method57() {
        return this.Field600;
    }

    public void Method58(float a) {
        this.Field601 = a;
        this.Field633 = false;
    }

    public float Method59() {
        return this.Field601;
    }

    public String toString() {
        return "Colors/Gain...";
    }
}