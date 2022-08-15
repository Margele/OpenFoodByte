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

public class Class107
extends Class119 {
    public Class107() {
        this.Field950 = true;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 & 0xFF000000;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        a5 = (a5 + 255) / 2;
        a6 = (a6 + 255) / 2;
        a7 = (a7 + 255) / 2;
        return a4 | a5 << 16 | a6 << 8 | a7;
    }

    public String toString() {
        return "Colors/Gray Out";
    }
}