/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Float
 *  java.awt.geom.Rectangle2D
 *  java.awt.geom.Rectangle2D$Float
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class877;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Class894
extends Class877 {
    private float Field3926;
    private float Field3927;
    private float Field3928;
    private float Field3929;
    private float Field3930;
    private float Field3931;
    private float Field3932;
    private float Field3933;
    private float Field3934;
    private float Field3935;
    private float Field3936;
    private float Field3937;
    private float Field3938;
    private float Field3939;
    private float Field3940;
    private float Field3941;
    private float Field3942;
    private float Field3943;
    private float Field3944;
    private float Field3945;
    private float Field3946;
    private float Field3947;
    private float Field3948;
    private float Field3949;
    private float Field3950;
    private float Field3951;
    private float Field3952;
    private float Field3953;
    private float Field3954;
    private float Field3955;
    private float Field3956;
    private float Field3957;
    private boolean Field3958;
    private boolean Field3959 = false;

    public Class894() {
        this(0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
    }

    public Class894(float a, float a2, float a3, float a4, float a5, float a6, float a7, float a8) {
        this.Method3561(a, a2, a3, a4, a5, a6, a7, a8);
    }

    public void Method87(boolean a) {
        this.Field3959 = a;
    }

    public boolean Method88() {
        return this.Field3959;
    }

    public void Method3560(float a, float a2, float a3, float a4, float a5, float a6, float a7, float a8) {
        this.Method3561(a, a2, a3, a4, a5, a6, a7, a8);
        this.Field3958 = true;
    }

    public void Method3561(float a, float a2, float a3, float a4, float a5, float a6, float a7, float a8) {
        this.Field3926 = a;
        this.Field3927 = a2;
        this.Field3928 = a3;
        this.Field3929 = a4;
        this.Field3930 = a5;
        this.Field3931 = a6;
        this.Field3932 = a7;
        boolean bl = Class193.Method1269();
        this.Field3933 = a8;
        this.Field3934 = a3 - a5;
        this.Field3935 = a4 - a6;
        this.Field3936 = a7 - a5;
        this.Field3937 = a8 - a6;
        this.Field3938 = a - a3 + a5 - a7;
        this.Field3939 = a2 - a4 + a6 - a8;
        if (this.Field3938 == 0.0f && this.Field3939 == 0.0f) {
            this.Field3949 = a3 - a;
            this.Field3952 = a5 - a3;
            this.Field3955 = a;
            this.Field3950 = a4 - a2;
            this.Field3953 = a6 - a4;
            this.Field3956 = a2;
            this.Field3954 = 0.0f;
            this.Field3951 = 0.0f;
        }
        this.Field3951 = (this.Field3938 * this.Field3937 - this.Field3936 * this.Field3939) / (this.Field3934 * this.Field3937 - this.Field3935 * this.Field3936);
        this.Field3954 = (this.Field3934 * this.Field3939 - this.Field3935 * this.Field3938) / (this.Field3934 * this.Field3937 - this.Field3935 * this.Field3936);
        this.Field3949 = a3 - a + this.Field3951 * a3;
        this.Field3952 = a7 - a + this.Field3954 * a7;
        this.Field3955 = a;
        this.Field3950 = a4 - a2 + this.Field3951 * a4;
        this.Field3953 = a8 - a2 + this.Field3954 * a8;
        this.Field3956 = a2;
        this.Field3957 = 1.0f;
        this.Field3958 = false;
    }

    public void Method3562(float a, float a2, float a3, float a4, float a5, float a6, float a7, float a8) {
        this.Method3561(a, a2, a3, a4, a5, a6, a7, a8);
        float a9 = this.Field3953 * this.Field3957 - this.Field3956 * this.Field3954;
        float a10 = this.Field3956 * this.Field3951 - this.Field3950 * this.Field3957;
        float a11 = this.Field3950 * this.Field3954 - this.Field3953 * this.Field3951;
        float a12 = this.Field3955 * this.Field3954 - this.Field3952 * this.Field3957;
        float a13 = this.Field3949 * this.Field3957 - this.Field3955 * this.Field3951;
        float a14 = this.Field3952 * this.Field3951 - this.Field3949 * this.Field3954;
        float a15 = this.Field3952 * this.Field3956 - this.Field3955 * this.Field3953;
        float a16 = this.Field3955 * this.Field3950 - this.Field3949 * this.Field3956;
        float a17 = this.Field3949 * this.Field3953 - this.Field3952 * this.Field3950;
        float a18 = 1.0f / a17;
        this.Field3949 = a9 * a18;
        this.Field3952 = a12 * a18;
        this.Field3955 = a15 * a18;
        this.Field3950 = a10 * a18;
        this.Field3953 = a13 * a18;
        this.Field3956 = a16 * a18;
        this.Field3951 = a11 * a18;
        this.Field3954 = a14 * a18;
        this.Field3957 = 1.0f;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3940 = this.Field3953 * this.Field3957 - this.Field3956 * this.Field3954;
        this.Field3941 = this.Field3955 * this.Field3954 - this.Field3952 * this.Field3957;
        this.Field3942 = this.Field3952 * this.Field3956 - this.Field3955 * this.Field3953;
        this.Field3943 = this.Field3956 * this.Field3951 - this.Field3950 * this.Field3957;
        this.Field3944 = this.Field3949 * this.Field3957 - this.Field3955 * this.Field3951;
        this.Field3945 = this.Field3955 * this.Field3950 - this.Field3949 * this.Field3956;
        this.Field3946 = this.Field3950 * this.Field3954 - this.Field3953 * this.Field3951;
        this.Field3947 = this.Field3952 * this.Field3951 - this.Field3949 * this.Field3954;
        this.Field3948 = this.Field3949 * this.Field3953 - this.Field3952 * this.Field3950;
        if (!this.Field3958) {
            int a3 = a.getWidth();
            int a4 = a.getHeight();
            float a5 = 1.0f / (float)a3;
            float a6 = 1.0f / (float)a4;
            this.Field3940 *= a5;
            this.Field3943 *= a5;
            this.Field3946 *= a5;
            this.Field3941 *= a6;
            this.Field3944 *= a6;
            this.Field3947 *= a6;
        }
        return super.Method62(a, a2);
    }

    @Override
    protected void Method834(Rectangle a) {
        if (this.Field3958) {
            a.x = (int)Math.min((float)Math.min((float)this.Field3926, (float)this.Field3928), (float)Math.min((float)this.Field3930, (float)this.Field3932));
            a.y = (int)Math.min((float)Math.min((float)this.Field3927, (float)this.Field3929), (float)Math.min((float)this.Field3931, (float)this.Field3933));
            a.width = (int)Math.max((float)Math.max((float)this.Field3926, (float)this.Field3928), (float)Math.max((float)this.Field3930, (float)this.Field3932)) - a.x;
            a.height = (int)Math.max((float)Math.max((float)this.Field3927, (float)this.Field3929), (float)Math.max((float)this.Field3931, (float)this.Field3933)) - a.y;
            return;
        }
        if (!this.Field3959) {
            float a2 = (float)a.getWidth();
            float a3 = (float)a.getHeight();
            Rectangle a4 = new Rectangle();
            a4.add(this.Method1265((Point2D)new Point2D.Float(0.0f, 0.0f), null));
            a4.add(this.Method1265((Point2D)new Point2D.Float(a2, 0.0f), null));
            a4.add(this.Method1265((Point2D)new Point2D.Float(0.0f, a3), null));
            a4.add(this.Method1265((Point2D)new Point2D.Float(a2, a3), null));
            a.setRect((Rectangle2D)a4);
        }
    }

    public float Method57() {
        return this.Field3926 - (float)((int)Math.min((float)Math.min((float)this.Field3926, (float)this.Field3928), (float)Math.min((float)this.Field3930, (float)this.Field3932)));
    }

    public float Method59() {
        return this.Field3927 - (float)((int)Math.min((float)Math.min((float)this.Field3927, (float)this.Field3929), (float)Math.min((float)this.Field3931, (float)this.Field3933)));
    }

    @Override
    public Rectangle2D Method1264(BufferedImage a) {
        if (this.Field3959) {
            return new Rectangle(0, 0, a.getWidth(), a.getHeight());
        }
        float a2 = a.getWidth();
        float a3 = a.getHeight();
        Rectangle2D.Float a4 = new Rectangle2D.Float();
        a4.add(this.Method1265((Point2D)new Point2D.Float(0.0f, 0.0f), null));
        a4.add(this.Method1265((Point2D)new Point2D.Float(a2, 0.0f), null));
        a4.add(this.Method1265((Point2D)new Point2D.Float(0.0f, a3), null));
        a4.add(this.Method1265((Point2D)new Point2D.Float(a2, a3), null));
        return a4;
    }

    @Override
    public Point2D Method1265(Point2D a, Point2D a2) {
        a2 = new Point2D.Float();
        float a3 = (float)a.getX();
        float a4 = (float)a.getY();
        float a5 = 1.0f / (a3 * this.Field3951 + a4 * this.Field3954 + this.Field3957);
        a2.setLocation((double)((a3 * this.Field3949 + a4 * this.Field3952 + this.Field3955) * a5), (double)((a3 * this.Field3950 + a4 * this.Field3953 + this.Field3956) * a5));
        return a2;
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        a3[0] = (float)this.Field3821.width * (this.Field3940 * (float)a + this.Field3941 * (float)a2 + this.Field3942) / (this.Field3946 * (float)a + this.Field3947 * (float)a2 + this.Field3948);
        a3[1] = (float)this.Field3821.height * (this.Field3943 * (float)a + this.Field3944 * (float)a2 + this.Field3945) / (this.Field3946 * (float)a + this.Field3947 * (float)a2 + this.Field3948);
    }

    public String toString() {
        return "Distort/Perspective...";
    }
}