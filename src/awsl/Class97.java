/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;
import awsl.Class193;
import java.awt.Color;

public class Class97
extends Class119 {
    public float Field820;
    public float Field821;
    public float Field822;
    private float[] Field823 = new float[3];

    public Class97() {
        this(0.0f, 0.0f, 0.0f);
    }

    public Class97(float a, float a2, float a3) {
        this.Field820 = a;
        this.Field821 = a2;
        this.Field822 = a3;
        this.Field950 = true;
    }

    public void Method56(float a) {
        this.Field820 = a;
    }

    public float Method57() {
        return this.Field820;
    }

    public void Method58(float a) {
        this.Field821 = a;
    }

    public float Method59() {
        return this.Field821;
    }

    public void Method60(float a) {
        this.Field822 = a;
    }

    public float Method61() {
        return this.Field822;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int Method3(int a, int a2, int a3) {
        void a4;
        int a5 = a3 & 0xFF000000;
        int a6 = a3 >> 16 & 0xFF;
        int a7 = a3 >> 8 & 0xFF;
        int n = a3 & 0xFF;
        boolean bl = Class193.Method1270();
        Color.RGBtoHSB((int)a6, (int)a7, (int)a4, (float[])this.Field823);
        boolean a8 = bl;
        this.Field823[0] = this.Field823[0] + this.Field820;
        if (this.Field823[0] < 0.0f) {
            this.Field823[0] = (float)((double)this.Field823[0] + Math.PI * 2);
        }
        this.Field823[1] = this.Field823[1] + this.Field821;
        if (this.Field823[1] < 0.0f) {
            this.Field823[1] = 0.0f;
        }
        if ((double)this.Field823[1] > 1.0) {
            this.Field823[1] = 1.0f;
        }
        this.Field823[2] = this.Field823[2] + this.Field822;
        if (this.Field823[2] < 0.0f) {
            this.Field823[2] = 0.0f;
        }
        if ((double)this.Field823[2] > 1.0) {
            this.Field823[2] = 1.0f;
        }
        a3 = Color.HSBtoRGB((float)this.Field823[0], (float)this.Field823[1], (float)this.Field823[2]);
        return a5 | a3 & 0xFFFFFF;
    }

    public String toString() {
        return "Colors/Adjust HSB...";
    }
}