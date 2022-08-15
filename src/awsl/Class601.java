/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class599;

public class Class601
extends Class599 {
    public Class601() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class601(float[] a) {
        this.Field2813 = a[0];
        this.Field2814 = a[1];
        this.Field2815 = a[2];
        this.Field2816 = a[3];
    }

    public Class601(float a, float a2, float a3, float a4) {
        this.Field2813 = a;
        this.Field2814 = a2;
        this.Field2815 = a3;
        this.Field2816 = a4;
    }

    public Class601(Class601 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public Class601(Class599 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public float Method3786(Class601 a) {
        return Math.abs((float)(this.Field2813 - a.Field2813)) + Math.abs((float)(this.Field2814 - a.Field2814)) + Math.abs((float)(this.Field2815 - a.Field2815)) + Math.abs((float)(this.Field2816 - a.Field2816));
    }

    public float Method3787(Class601 a) {
        float a2 = this.Field2813 - a.Field2813;
        float a3 = this.Field2814 - a.Field2814;
        float a4 = this.Field2815 - a.Field2815;
        float a5 = this.Field2816 - a.Field2816;
        return a2 * a2 + a3 * a3 + a4 * a4 + a5 * a5;
    }

    public float Method3788(Class601 a) {
        float a2 = this.Field2813 - a.Field2813;
        float a3 = this.Field2814 - a.Field2814;
        float a4 = this.Field2815 - a.Field2815;
        float a5 = this.Field2816 - a.Field2816;
        return (float)Math.sqrt((double)(a2 * a2 + a3 * a3 + a4 * a4 + a5 * a5));
    }
}