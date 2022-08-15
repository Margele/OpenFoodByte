/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Float
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class877;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class815
extends Class877 {
    private float Field3643 = 16.0f;
    private float Field3644 = 10.0f;
    private float Field3645 = 0.0f;
    private float Field3646 = 0.5f;
    private float Field3647 = 0.5f;
    private float Field3648 = 50.0f;
    private float Field3649 = 0.0f;
    private float Field3650;
    private float Field3651;

    public Class815() {
        this.Method9(1);
    }

    public void Method56(float a) {
        this.Field3643 = a;
    }

    public float Method57() {
        return this.Field3643;
    }

    public void Method58(float a) {
        this.Field3644 = a;
    }

    public float Method59() {
        return this.Field3644;
    }

    public void Method60(float a) {
        this.Field3645 = a;
    }

    public float Method61() {
        return this.Field3645;
    }

    public void Method164(float a) {
        this.Field3646 = a;
    }

    public float Method165() {
        return this.Field3646;
    }

    public void Method166(float a) {
        this.Field3647 = a;
    }

    public float Method167() {
        return this.Field3647;
    }

    public void Method330(Point2D a) {
        this.Field3646 = (float)a.getX();
        this.Field3647 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field3646, this.Field3647);
    }

    public void Method168(float a) {
        this.Field3648 = a;
    }

    public float Method169() {
        return this.Field3648;
    }

    private boolean Method3676(int a, int a2, int a3) {
        return a2 <= a && a <= a3;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3650 = (float)a.getWidth() * this.Field3646;
        this.Field3651 = (float)a.getHeight() * this.Field3647;
        if (this.Field3648 == 0.0f) {
            this.Field3648 = Math.min((float)this.Field3650, (float)this.Field3651);
        }
        this.Field3649 = this.Field3648 * this.Field3648;
        return super.Method62(a, a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        void a4;
        float a5 = (float)a - this.Field3650;
        float f = (float)a2 - this.Field3651;
        boolean a6 = Class193.Method1270();
        float a7 = a5 * a5 + a4 * a4;
        if (a7 > this.Field3649) {
            a3[0] = a;
            a3[1] = a2;
        }
        float a8 = (float)Math.sqrt((double)a7);
        float a9 = this.Field3644 * (float)Math.sin((double)(a8 / this.Field3643 * ((float)Math.PI * 2) - this.Field3645));
        a9 *= (this.Field3648 - a8) / this.Field3648;
        if (a8 != 0.0f) {
            a9 *= this.Field3643 / a8;
        }
        a3[0] = (float)a + a5 * a9;
        a3[1] = (float)a2 + a4 * a9;
    }

    public String toString() {
        return "Distort/Water Ripples...";
    }
}