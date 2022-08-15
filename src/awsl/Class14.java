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
import awsl.Class193;
import awsl.Class767;

public class Class14
extends Class119 {
    public float Field191;
    public float Field192;
    public float Field193;

    public Class14() {
        this(0.0f, 0.0f, 0.0f);
    }

    public Class14(float a, float a2, float a3) {
        this.Field191 = 1.0f + a;
        this.Field192 = 1.0f + a2;
        this.Field193 = 1.0f + a3;
        this.Field950 = true;
    }

    public void Method56(float a) {
        this.Field191 = 1.0f + a;
    }

    public float Method57() {
        return this.Field191 - 1.0f;
    }

    public void Method58(float a) {
        this.Field192 = 1.0f + a;
    }

    public float Method59() {
        return this.Field192 - 1.0f;
    }

    public void Method60(float a) {
        this.Field193 = 1.0f + a;
    }

    public float Method61() {
        return this.Field193 - 1.0f;
    }

    public int[] Method86() {
        int[] a = new int[256];
        int a2 = 0;
        boolean a3 = Class193.Method1269();
        if (a2 < 256) {
            a[a2] = this.Method3(0, 0, a2 << 24 | a2 << 16 | a2 << 8 | a2);
            ++a2;
        }
        return a;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 & 0xFF000000;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        a5 = Class767.Method1687((int)((float)a5 * this.Field191));
        a6 = Class767.Method1687((int)((float)a6 * this.Field192));
        a7 = Class767.Method1687((int)((float)a7 * this.Field193));
        return a4 | a5 << 16 | a6 << 8 | a7;
    }

    public String toString() {
        return "Colors/Adjust RGB...";
    }
}