/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;
import awsl.Class598;
import awsl.Class755;
import awsl.Class767;

public class Class28
extends Class119 {
    private float Field239 = 32.0f;
    private float Field240 = 1.0f;
    private float Field241 = 0.0f;
    private float Field242 = 1.0f;
    private float Field243 = 0.5f;
    private Class755 Field244;
    private float Field245 = 1.0f;
    private float Field246 = 0.0f;
    private float Field247 = 0.0f;
    private float Field248 = 1.0f;

    public void Method56(float a) {
        this.Field239 = a;
    }

    public float Method57() {
        return this.Field239;
    }

    public void Method58(float a) {
        this.Field240 = a;
    }

    public float Method59() {
        return this.Field240;
    }

    public void Method60(float a) {
        this.Field241 = a;
        float a2 = (float)Math.cos((double)a);
        float a3 = (float)Math.sin((double)a);
        this.Field245 = a2;
        this.Field246 = a3;
        this.Field247 = -a3;
        this.Field248 = a2;
    }

    public float Method61() {
        return this.Field241;
    }

    public void Method164(float a) {
        this.Field242 = a;
    }

    public float Method165() {
        return this.Field242;
    }

    public void Method166(float a) {
        this.Field243 = a;
    }

    public float Method167() {
        return this.Field243;
    }

    public void Method176(Class755 a) {
        this.Field244 = a;
    }

    public Class755 Method177() {
        return this.Field244;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        float a4;
        float a5 = this.Field245 * (float)a + this.Field246 * (float)a2;
        float a6 = this.Field247 * (float)a + this.Field248 * (float)a2;
        a5 /= this.Field239 * this.Field240;
        a6 /= this.Field239;
        int a7 = a3 & 0xFF000000;
        if (this.Field244 != null) {
            float a8 = this.Field243 * Class598.Method153(a5, a6, this.Field242);
            float a9 = 3.0f * this.Field243 * a8 + a6;
            a9 = (float)Math.sin((double)((double)a9 * Math.PI));
            float a10 = (float)Math.sin((double)(40.0 * (double)a8));
            a9 = (float)((double)a9 + 0.2 * (double)a10);
            return this.Field244.Method283(a9);
        }
        float a11 = this.Field243 * Class598.Method153(a5, a6, this.Field242);
        float a12 = (float)Math.sin((double)Math.sin((double)(8.0 * (double)a11 + (double)(7.0f * a5) + 3.0 * (double)a6)));
        float a13 = a4 = Math.abs((float)a12);
        float a14 = (float)Math.sin((double)(40.0 * (double)a11));
        a14 = Math.abs((float)a14);
        float a15 = 0.6f * a14 + 0.3f;
        float a16 = 0.2f * a14 + 0.8f;
        float a17 = 0.15f * a14 + 0.85f;
        float a18 = 0.5f * (float)Math.pow((double)Math.abs((float)a4), (double)0.3);
        a4 = (float)Math.pow((double)(0.5 * ((double)a4 + 1.0)), (double)0.6) * a15;
        a13 = (float)Math.pow((double)(0.5 * ((double)a13 + 1.0)), (double)0.6) * a16;
        float a19 = (0.5f * a4 + 0.35f * a13) * 2.0f * a18;
        float a20 = (0.25f * a4 + 0.35f * a13) * 2.0f * a18;
        int a21 = a3 >> 16 & 0xFF;
        int a22 = a3 >> 8 & 0xFF;
        int a23 = a3 & 0xFF;
        a21 = Class767.Method1687((int)((float)a21 * a19));
        a22 = Class767.Method1687((int)((float)a22 * (a18 *= Math.max((float)a4, (float)a13) * a17)));
        a23 = Class767.Method1687((int)((float)a23 * a20));
        return a3 & 0xFF000000 | a21 << 16 | a22 << 8 | a23;
    }

    public String toString() {
        return "Texture/Marble Texture...";
    }
}