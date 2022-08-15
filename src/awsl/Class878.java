/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.Rectangle
 *  java.awt.Shape
 *  java.awt.geom.AffineTransform
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Float
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import awsl.Class700;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Class878
extends Class193 {
    private float Field3822 = 0.5f;
    private float Field3823 = 0.5f;
    private float Field3824;
    private float Field3825;
    private float Field3826;
    private float Field3827;
    private float Field3828 = 1.0f;
    private float Field3829 = 1.0f;
    private int Field3830 = 5;
    private int Field3831;

    public void Method56(float a) {
        this.Field3825 = a;
    }

    public float Method57() {
        return this.Field3825;
    }

    public void Method58(float a) {
        this.Field3824 = a;
    }

    public float Method59() {
        return this.Field3824;
    }

    public void Method60(float a) {
        this.Field3826 = a;
    }

    public float Method61() {
        return this.Field3826;
    }

    public void Method164(float a) {
        this.Field3827 = a;
    }

    public float Method165() {
        return this.Field3827;
    }

    public void Method166(float a) {
        this.Field3828 = a;
    }

    public float Method167() {
        return this.Field3828;
    }

    public void Method168(float a) {
        this.Field3829 = a;
    }

    public float Method169() {
        return this.Field3829;
    }

    public void Method170(float a) {
        this.Field3822 = a;
    }

    public float Method171() {
        return this.Field3822;
    }

    public void Method172(float a) {
        this.Field3823 = a;
    }

    public float Method173() {
        return this.Field3823;
    }

    public void Method330(Point2D a) {
        this.Field3822 = (float)a.getX();
        this.Field3823 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field3822, this.Field3823);
    }

    public void Method9(int a) {
        this.Field3830 = a;
    }

    public int Method10() {
        return this.Field3830;
    }

    public void Method11(int a) {
        this.Field3831 = a;
    }

    public int Method12() {
        return this.Field3831;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        Rectangle a3;
        boolean a4 = Class193.Method1269();
        a2 = this.Method1263(a, null);
        float a5 = a.getWidth();
        float a6 = a.getHeight();
        float a7 = (float)a.getWidth() * this.Field3822;
        float a8 = (float)a.getHeight() * this.Field3823;
        float a9 = (float)Math.sqrt((double)(a7 * a7 + a8 * a8));
        int a10 = this.Field3830 * this.Field3830;
        Class700[] a11 = new Class700[a10];
        float[] a12 = new float[a10];
        float[] a13 = new float[a10];
        float[] a14 = new float[a10];
        Graphics2D a15 = a2.createGraphics();
        Random a16 = new Random(0L);
        float a17 = 0.0f;
        float a18 = 0.0f;
        int a19 = 0;
        if (a19 < this.Field3830) {
            int a20 = (int)a6 * a19 / this.Field3830;
            int a21 = (int)a6 * (a19 + 1) / this.Field3830;
            int a22 = 0;
            if (a22 < this.Field3830) {
                int a23 = a19 * this.Field3830 + a22;
                int a24 = (int)a5 * a22 / this.Field3830;
                int a25 = (int)a5 * (a22 + 1) / this.Field3830;
                a12[a23] = (float)this.Field3831 * a16.nextFloat();
                a13[a23] = (float)this.Field3831 * a16.nextFloat();
                a12[a23] = 0.0f;
                a13[a23] = 0.0f;
                a14[a23] = (float)this.Field3831 * (2.0f * a16.nextFloat() - 1.0f);
                a3 = new Rectangle(a24, a20, a25 - a24, a21 - a20);
                a11[a23] = new Class700();
                a11[a23].Field3025 = a3;
                a11[a23].Field3018 = (float)(a24 + a25) * 0.5f;
                a11[a23].Field3019 = (float)(a20 + a21) * 0.5f;
                a11[a23].Field3020 = a5 - (a7 - (float)a22);
                a11[a23].Field3021 = a6 - (a8 - (float)a19);
                a11[a23].Field3022 = a25 - a24;
                a11[a23].Field3023 = a21 - a20;
                ++a22;
            }
            ++a19;
        }
        if ((a19 = 0) < a10) {
            float a26 = (float)a19 / (float)a10;
            double a27 = (double)(a26 * 2.0f) * Math.PI;
            float a28 = this.Field3825 * a5 * (float)Math.cos((double)a27);
            float a29 = this.Field3825 * a6 * (float)Math.sin((double)a27);
            Class700 a30 = a11[a19];
            a3 = a30.Field3025.getBounds();
            AffineTransform a31 = a15.getTransform();
            a28 = a30.Field3018 + this.Field3825 * a30.Field3020;
            a29 = a30.Field3019 + this.Field3825 * a30.Field3021;
            a15.translate((double)a28, (double)a29);
            a15.rotate((double)(this.Field3825 * a14[a19]));
            a15.setColor(Color.getHSBColor((float)a26, (float)1.0f, (float)1.0f));
            Shape a32 = a15.getClip();
            a15.clip(a30.Field3025);
            a15.drawImage((Image)a, 0, 0, null);
            a15.setClip(a32);
            a15.setTransform(a31);
            ++a19;
        }
        a15.dispose();
        return a2;
    }

    public String toString() {
        return "Transition/Shatter...";
    }
}