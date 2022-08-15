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
import awsl.Class767;

public class Class4
extends Class119 {
    public float Field100 = 1.0f;

    public Class4() {
    }

    public Class4(float a) {
        this.Field100 = a;
        this.Field950 = true;
    }

    public void Method56(float a) {
        this.Field100 = a;
    }

    public float Method57() {
        return this.Field100;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        if (this.Field100 != 1.0f) {
            int a4 = a3 & 0xFF000000;
            int a5 = a3 >> 16 & 0xFF;
            int a6 = a3 >> 8 & 0xFF;
            int a7 = a3 & 0xFF;
            int a8 = (a5 + a6 + a7) / 3;
            a5 = Class767.Method1687((int)((float)a8 + this.Field100 * (float)(a5 - a8)));
            a6 = Class767.Method1687((int)((float)a8 + this.Field100 * (float)(a6 - a8)));
            a7 = Class767.Method1687((int)((float)a8 + this.Field100 * (float)(a7 - a8)));
            return a4 | a5 << 16 | a6 << 8 | a7;
        }
        return a3;
    }

    public String toString() {
        return "Colors/Saturation...";
    }
}