/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Point
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class743;
import awsl.Class776;
import awsl.Class877;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class Class896
extends Class877 {
    private float Field3968 = 1.0f;
    private float Field3969 = 1.0f;
    private float Field3970 = 2.0f;
    private Class743[] Field3971;
    private Class743[] Field3972;
    private Class743[] Field3973;
    private float Field3974;
    private float Field3975;

    public void Method56(float a) {
        this.Field3968 = a;
    }

    public float Method57() {
        return this.Field3968;
    }

    public void Method58(float a) {
        this.Field3969 = a;
    }

    public float Method59() {
        return this.Field3969;
    }

    public void Method60(float a) {
        this.Field3970 = a;
    }

    public float Method61() {
        return this.Field3970;
    }

    public void Method3563(Class743[] a) {
        this.Field3971 = a;
    }

    public Class743[] Method3564() {
        return this.Field3971;
    }

    public void Method3565(Class743[] a) {
        this.Field3972 = a;
    }

    public Class743[] Method3566() {
        return this.Field3972;
    }

    protected void Method3567(int a, int a2, Point a3) {
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        float a4 = 0.0f;
        float f = 0.0f;
        boolean a5 = Class193.Method1270();
        float a6 = 0.0f;
        float a7 = 0.001f;
        float a8 = 1.5f * this.Field3970 + 0.5f;
        float a9 = this.Field3969;
        float a10 = 0.0f;
        float a11 = 0.0f;
        float a12 = 0.0f;
        int a13 = 0;
        if (a13 < this.Field3971.length) {
            float a14;
            Class743 a15 = this.Field3971[a13];
            Class743 a16 = this.Field3973[a13];
            float a17 = a - a16.Field3248;
            float a18 = a2 - a16.Field3249;
            a6 = (a17 * (float)a16.Field3252 + a18 * (float)a16.Field3253) / a16.Field3255;
            float a19 = (a18 * (float)a16.Field3252 - a17 * (float)a16.Field3253) / a16.Field3254;
            if (a6 <= 0.0f) {
                a14 = (float)Math.sqrt((double)(a17 * a17 + a18 * a18));
            }
            if (a6 >= 1.0f) {
                a17 = a - a16.Field3250;
                a18 = a2 - a16.Field3251;
                a14 = (float)Math.sqrt((double)(a17 * a17 + a18 * a18));
            }
            if (a19 >= 0.0f) {
                a14 = a19;
            }
            a14 = -a19;
            a4 = (float)a15.Field3248 + a6 * (float)a15.Field3252 - a19 * (float)a15.Field3253 / a15.Field3254;
            float a20 = (float)a15.Field3249 + a6 * (float)a15.Field3253 + a19 * (float)a15.Field3252 / a15.Field3254;
            float a21 = (float)Math.pow((double)(Math.pow((double)a16.Field3254, (double)a9) / (double)(a7 + a14)), (double)a8);
            a11 += (a4 - (float)a) * a21;
            a12 += (a20 - (float)a2) * a21;
            a10 += a21;
            ++a13;
        }
        a3[0] = (float)a + a11 / a10 + 0.5f;
        a3[1] = (float)a2 + a12 / a10 + 0.5f;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3974 = this.Field3974;
        this.Field3975 = this.Field3975;
        if (this.Field3971 != null && this.Field3972 != null) {
            this.Field3973 = new Class743[this.Field3971.length];
            for (int a3 = 0; a3 < this.Field3971.length; ++a3) {
                Class743 a4 = this.Field3973[a3] = new Class743(Class776.Method1718(this.Field3968, this.Field3971[a3].Field3248, this.Field3972[a3].Field3248), Class776.Method1718(this.Field3968, this.Field3971[a3].Field3249, this.Field3972[a3].Field3249), Class776.Method1718(this.Field3968, this.Field3971[a3].Field3250, this.Field3972[a3].Field3250), Class776.Method1718(this.Field3968, this.Field3971[a3].Field3251, this.Field3972[a3].Field3251));
                a4.Method1676();
                this.Field3971[a3].Method1676();
            }
            a2 = super.Method62(a, a2);
            this.Field3973 = null;
            return a2;
        }
        return a;
    }

    public String toString() {
        return "Distort/Field Warp...";
    }
}