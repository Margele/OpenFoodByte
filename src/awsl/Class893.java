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

public class Class893
extends Class877 {
    private float Field3916 = 0.0f;
    private float Field3917 = 0.5f;
    private float Field3918 = 0.5f;
    private float Field3919 = 100.0f;
    private float Field3920 = 0.5f;
    private float Field3921 = 0.0f;
    private float Field3922;
    private float Field3923;
    private float Field3924;
    private float Field3925;

    public void Method56(float a) {
        this.Field3916 = a;
    }

    public float Method57() {
        return this.Field3916;
    }

    public void Method58(float a) {
        this.Field3917 = a;
    }

    public float Method59() {
        return this.Field3917;
    }

    public void Method60(float a) {
        this.Field3918 = a;
    }

    public float Method61() {
        return this.Field3918;
    }

    public void Method330(Point2D a) {
        this.Field3917 = (float)a.getX();
        this.Field3918 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field3917, this.Field3918);
    }

    public void Method164(float a) {
        this.Field3919 = a;
    }

    public float Method165() {
        return this.Field3919;
    }

    public void Method166(float a) {
        this.Field3920 = a;
    }

    public float Method167() {
        return this.Field3920;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3924 = a.getWidth();
        this.Field3925 = a.getHeight();
        this.Field3922 = this.Field3924 * this.Field3917;
        this.Field3923 = this.Field3925 * this.Field3918;
        if (this.Field3919 == 0.0f) {
            this.Field3919 = Math.min((float)this.Field3922, (float)this.Field3923);
        }
        this.Field3921 = this.Field3919 * this.Field3919;
        return super.Method62(a, a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        void a4;
        void a5;
        float f = (float)a - this.Field3922;
        float f2 = (float)a2 - this.Field3923;
        boolean a6 = Class193.Method1269();
        void a7 = a5 * a5 + a4 * a4;
        if (a7 > this.Field3921 || a7 == 0.0f) {
            a3[0] = a;
            a3[1] = a2;
        }
        float a8 = (float)Math.sqrt((double)((double)(a7 / this.Field3921)));
        float a9 = (float)Math.pow((double)Math.sin((double)(1.5707963267948966 * (double)a8)), (double)(-this.Field3920));
        float a10 = 1.0f - a8;
        float a11 = this.Field3916 * a10 * a10;
        float a12 = (float)Math.sin((double)a11);
        float a13 = (float)Math.cos((double)a11);
        a3[0] = this.Field3922 + a13 * (a5 *= a9) - a12 * (a4 *= a9);
        a3[1] = this.Field3923 + a12 * a5 + a13 * a4;
    }

    public String toString() {
        return "Distort/Pinch...";
    }
}