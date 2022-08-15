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

public class Class47
extends Class62 {
    @Override
    protected float Method29(float a) {
        return a > 0.5f ? 2.0f * (a - 0.5f) : 2.0f * (0.5f - a);
    }

    public String toString() {
        return "Colors/Solarize";
    }
}