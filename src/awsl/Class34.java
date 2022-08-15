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

public class Class34
extends Class119 {
    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 >> 24 & 0xFF;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        if (a4 == 255) {
            return a3;
        }
        float a8 = 255.0f / (float)a4;
        a5 = (int)((float)a5 * a8);
        a6 = (int)((float)a6 * a8);
        a7 = (int)((float)a7 * a8);
        if (a5 > 255) {
            a5 = 255;
        }
        if (a6 > 255) {
            a6 = 255;
        }
        if (a7 > 255) {
            a7 = 255;
        }
        return a4 << 24 | a5 << 16 | a6 << 8 | a7;
    }

    public String toString() {
        return "Alpha/Unpremultiply";
    }
}