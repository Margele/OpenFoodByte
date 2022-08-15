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

public class Class885
extends Class877 {
    private float Field3866 = 0.0f;
    private float Field3867 = 0.0f;
    private float Field3868 = 0.0f;
    private float Field3869 = 0.0f;
    private float Field3870 = 0.5f;
    private float Field3871 = 0.5f;
    private float Field3872 = 1.5f;
    private float Field3873;
    private float Field3874;

    public Class885() {
        this.Method9(1);
        this.Method58(100.0f);
    }

    public void Method56(float a) {
        this.Field3872 = a;
    }

    public float Method57() {
        return this.Field3872;
    }

    public void Method58(float a) {
        this.Field3866 = a;
        this.Field3867 = a;
    }

    public float Method59() {
        return this.Field3866;
    }

    public void Method60(float a) {
        this.Field3870 = a;
    }

    public float Method61() {
        return this.Field3870;
    }

    public void Method164(float a) {
        this.Field3871 = a;
    }

    public float Method165() {
        return this.Field3871;
    }

    public void Method330(Point2D a) {
        this.Field3870 = (float)a.getX();
        this.Field3871 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field3870, this.Field3871);
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        this.Field3873 = (float)a3 * this.Field3870;
        this.Field3874 = (float)a4 * this.Field3871;
        if (this.Field3866 == 0.0f) {
            this.Field3866 = a3 / 2;
        }
        if (this.Field3867 == 0.0f) {
            this.Field3867 = a4 / 2;
        }
        this.Field3868 = this.Field3866 * this.Field3866;
        this.Field3869 = this.Field3867 * this.Field3867;
        return super.Method62(a, a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        void a4;
        void a5;
        float f = (float)a - this.Field3873;
        float a6 = (float)a2 - this.Field3874;
        void var7_6 = a5 * a5;
        boolean a7 = Class193.Method1270();
        float a8 = a6 * a6;
        if (a8 >= this.Field3869 - this.Field3869 * a4 / this.Field3868) {
            a3[0] = a;
            a3[1] = a2;
        }
        float a9 = 1.0f / this.Field3872;
        float a10 = (float)Math.sqrt((double)((1.0f - a4 / this.Field3868 - a8 / this.Field3869) * (this.Field3866 * this.Field3867)));
        float a11 = a10 * a10;
        float a12 = (float)Math.acos((double)((double)a5 / Math.sqrt((double)((double)(a4 + a11)))));
        float a13 = 1.5707964f - a12;
        float a14 = (float)Math.asin((double)(Math.sin((double)a13) * (double)a9));
        a14 = 1.5707964f - a12 - a14;
        a3[0] = (float)a - (float)Math.tan((double)a14) * a10;
        float a15 = (float)Math.acos((double)((double)a6 / Math.sqrt((double)(a8 + a11))));
        a13 = 1.5707964f - a15;
        a14 = (float)Math.asin((double)(Math.sin((double)a13) * (double)a9));
        a14 = 1.5707964f - a15 - a14;
        a3[1] = (float)a2 - (float)Math.tan((double)a14) * a10;
    }

    public String toString() {
        return "Distort/Sphere...";
    }
}