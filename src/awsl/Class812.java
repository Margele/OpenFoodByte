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

import awsl.Class193;
import awsl.Class598;
import awsl.Class877;

public class Class812
extends Class877 {
    private float Field3628 = 32.0f;
    private float Field3629 = 1.0f;
    private float Field3630 = 0.0f;
    private float Field3631 = 1.0f;
    private float Field3632 = 1.0f;
    private float Field3633 = 0.0f;
    private float Field3634 = 1.0f;
    private float Field3635 = 0.0f;
    private float Field3636 = 0.0f;
    private float Field3637 = 1.0f;

    public void Method56(float a) {
        this.Field3631 = a;
    }

    public float Method57() {
        return this.Field3631;
    }

    public void Method58(float a) {
        this.Field3628 = a;
    }

    public float Method59() {
        return this.Field3628;
    }

    public void Method60(float a) {
        this.Field3629 = a;
    }

    public float Method61() {
        return this.Field3629;
    }

    public void Method164(float a) {
        this.Field3630 = a;
        float a2 = (float)Math.cos((double)a);
        float a3 = (float)Math.sin((double)a);
        this.Field3634 = a2;
        this.Field3635 = a3;
        this.Field3636 = -a3;
        this.Field3637 = a2;
    }

    public float Method165() {
        return this.Field3630;
    }

    public void Method166(float a) {
        this.Field3632 = a;
    }

    public float Method167() {
        return this.Field3632;
    }

    public void Method168(float a) {
        this.Field3633 = a;
    }

    public float Method169() {
        return this.Field3633;
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        float a4 = this.Field3634 * (float)a + this.Field3635 * (float)a2;
        float a5 = this.Field3636 * (float)a + this.Field3637 * (float)a2;
        a4 /= this.Field3628;
        a5 /= this.Field3628 * this.Field3629;
        boolean a6 = Class193.Method1269();
        if (this.Field3632 == 1.0f) {
            a3[0] = (float)a + this.Field3631 * Class598.Method158(a4 + 0.5f, a5, this.Field3633);
            a3[1] = (float)a2 + this.Field3631 * Class598.Method158(a4, a5 + 0.5f, this.Field3633);
        }
        a3[0] = (float)a + this.Field3631 * Class598.Method154(a4 + 0.5f, a5, this.Field3632, this.Field3633);
        a3[1] = (float)a2 + this.Field3631 * Class598.Method154(a4, a5 + 0.5f, this.Field3632, this.Field3633);
    }

    public String toString() {
        return "Distort/Swim...";
    }
}