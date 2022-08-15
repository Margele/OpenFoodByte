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

public class Class10
extends Class119 {
    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 >> 24 & 0xFF;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        float a8 = (float)a4 * 0.003921569f;
        a5 = (int)((float)a5 * a8);
        a6 = (int)((float)a6 * a8);
        a7 = (int)((float)a7 * a8);
        return a4 << 24 | a5 << 16 | a6 << 8 | a7;
    }

    public String toString() {
        return "Alpha/Premultiply";
    }
}