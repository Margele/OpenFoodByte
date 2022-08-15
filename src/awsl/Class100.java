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

public class Class100
extends Class119 {
    public Class100() {
        this.Field950 = true;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 & 0xFF000000;
        return a4 | ~a3 & 0xFFFFFF;
    }

    public String toString() {
        return "Colors/Invert";
    }
}