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

import awsl.Class776;
import awsl.Class877;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class867
extends Class877 {
    private float Field3783 = 10.0f;
    private float Field3784 = 20.0f;
    private float Field3785 = 0.0f;
    private float Field3786 = (float)Math.PI;
    private float Field3787 = 0.5f;
    private float Field3788 = 0.5f;
    private float Field3789;
    private float Field3790;
    private float Field3791;
    private float Field3792;

    public Class867() {
        this.Method9(0);
    }

    public void Method56(float a) {
        this.Field3784 = a;
    }

    public float Method57() {
        return this.Field3784;
    }

    public void Method58(float a) {
        this.Field3785 = a;
    }

    public float Method59() {
        return this.Field3785;
    }

    public void Method60(float a) {
        this.Field3786 = a;
    }

    public float Method61() {
        return this.Field3786;
    }

    public void Method164(float a) {
        this.Field3783 = a;
    }

    public float Method165() {
        return this.Field3783;
    }

    public void Method166(float a) {
        this.Field3787 = a;
    }

    public float Method167() {
        return this.Field3787;
    }

    public void Method168(float a) {
        this.Field3788 = a;
    }

    public float Method169() {
        return this.Field3788;
    }

    public void Method330(Point2D a) {
        this.Field3787 = (float)a.getX();
        this.Field3788 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field3787, this.Field3788);
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3791 = a.getWidth();
        this.Field3792 = a.getHeight();
        this.Field3789 = this.Field3791 * this.Field3787;
        this.Field3790 = this.Field3792 * this.Field3788;
        this.Field3791 -= 1.0f;
        return super.Method62(a, a2);
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        float a4 = (float)a - this.Field3789;
        float a5 = (float)a2 - this.Field3790;
        float a6 = (float)Math.atan2((double)(-a5), (double)(-a4)) + this.Field3785;
        float a7 = (float)Math.sqrt((double)(a4 * a4 + a5 * a5));
        a6 = Class776.Method1714(a6, (float)Math.PI * 2);
        a3[0] = this.Field3791 * a6 / (this.Field3786 + 1.0E-5f);
        a3[1] = this.Field3792 * (1.0f - (a7 - this.Field3783) / (this.Field3784 + 1.0E-5f));
    }

    public String toString() {
        return "Distort/Circle...";
    }
}