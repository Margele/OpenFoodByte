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

public class Class895
extends Class877 {
    private float Field3960 = 0.0f;
    private float Field3961 = 0.0f;
    private float Field3962 = 0.5f;
    private float Field3963 = 0.5f;
    private int Field3964 = 3;
    private float Field3965 = 0.0f;
    private float Field3966;
    private float Field3967;

    public Class895() {
        this.Method9(1);
    }

    public void Method13(int a) {
        this.Field3964 = a;
    }

    public int Method14() {
        return this.Field3964;
    }

    public void Method56(float a) {
        this.Field3960 = a;
    }

    public float Method57() {
        return this.Field3960;
    }

    public void Method58(float a) {
        this.Field3961 = a;
    }

    public float Method59() {
        return this.Field3961;
    }

    public void Method60(float a) {
        this.Field3962 = a;
    }

    public float Method61() {
        return this.Field3962;
    }

    public void Method164(float a) {
        this.Field3963 = a;
    }

    public float Method165() {
        return this.Field3963;
    }

    public void Method330(Point2D a) {
        this.Field3962 = (float)a.getX();
        this.Field3963 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field3962, this.Field3963);
    }

    public void Method166(float a) {
        this.Field3965 = a;
    }

    public float Method167() {
        return this.Field3965;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3966 = (float)a.getWidth() * this.Field3962;
        this.Field3967 = (float)a.getHeight() * this.Field3963;
        return super.Method62(a, a2);
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        double a4 = (float)a - this.Field3966;
        double a5 = (float)a2 - this.Field3967;
        double a6 = Math.sqrt((double)(a4 * a4 + a5 * a5));
        double a7 = Math.atan2((double)a5, (double)a4) - (double)this.Field3960 - (double)this.Field3961;
        a7 = Class776.Method1716((float)(a7 / Math.PI * (double)this.Field3964 * 0.5));
        if (this.Field3965 != 0.0f) {
            double a8 = Math.cos((double)a7);
            double a9 = (double)this.Field3965 / a8;
            a6 = a9 * (double)Class776.Method1716((float)(a6 / a9));
        }
        a3[0] = (float)((double)this.Field3966 + a6 * Math.cos((double)(a7 += (double)this.Field3960)));
        a3[1] = (float)((double)this.Field3967 + a6 * Math.sin((double)a7));
    }

    public String toString() {
        return "Distort/Kaleidoscope...";
    }
}