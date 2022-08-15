/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;

public class Class99
extends Class119 {
    public Class99() {
        this.Field950 = true;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 & 0xFF000000;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        a3 = a5 * 77 + a6 * 151 + a7 * 28 >> 8;
        return a4 | a3 << 16 | a3 << 8 | a3;
    }

    public String toString() {
        return "Colors/Grayscale";
    }
}