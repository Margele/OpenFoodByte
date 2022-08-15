/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class590;

public class Class586 {
    public float Field2755;
    public float Field2756;
    public float Field2757;
    public float Field2758;

    public Class586() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class586(float[] a) {
        this.Field2755 = a[0];
        this.Field2756 = a[1];
        this.Field2757 = a[2];
        this.Field2758 = a[2];
    }

    public Class586(float a, float a2, float a3, float a4) {
        this.Field2755 = a;
        this.Field2756 = a2;
        this.Field2757 = a3;
        this.Field2758 = a4;
    }

    public Class586(Class586 a) {
        this.Field2755 = a.Field2755;
        this.Field2756 = a.Field2756;
        this.Field2757 = a.Field2757;
        this.Field2758 = a.Field2758;
    }

    public Class586(Class590 a, float a2) {
        this.Field2755 = a.Field2775;
        this.Field2756 = a.Field2776;
        this.Field2757 = a.Field2777;
        this.Field2758 = a2;
    }

    public void Method293(float a, float a2, float a3, float a4) {
        this.Field2755 = a;
        this.Field2756 = a2;
        this.Field2757 = a3;
        this.Field2758 = a4;
    }

    public void Method294(Class586 a) {
        this.Field2755 = a.Field2755;
        this.Field2756 = a.Field2756;
        this.Field2757 = a.Field2757;
        this.Field2758 = a.Field2758;
    }

    public void Method295(Class586 a) {
        a.Field2755 = this.Field2755;
        a.Field2756 = this.Field2756;
        a.Field2757 = this.Field2757;
        a.Field2758 = this.Field2758;
    }

    public void Method296(float[] a) {
        a[0] = this.Field2755;
        a[1] = this.Field2756;
        a[2] = this.Field2757;
        a[3] = this.Field2758;
    }

    public String Method297() {
        return "[" + this.Field2755 + ", " + this.Field2756 + ", " + this.Field2757 + ", " + this.Field2758 + "]";
    }
}