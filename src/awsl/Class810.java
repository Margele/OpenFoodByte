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

public class Class810
extends Class877 {
    private float Field3621 = 0.0f;
    private float Field3622 = 0.5f;
    private float Field3623 = 0.5f;
    private float Field3624 = 100.0f;
    private float Field3625 = 0.0f;
    private float Field3626;
    private float Field3627;

    public Class810() {
        this.Method9(1);
    }

    public void Method56(float a) {
        this.Field3621 = a;
    }

    public float Method57() {
        return this.Field3621;
    }

    public void Method58(float a) {
        this.Field3622 = a;
    }

    public float Method59() {
        return this.Field3622;
    }

    public void Method60(float a) {
        this.Field3623 = a;
    }

    public float Method61() {
        return this.Field3623;
    }

    public void Method330(Point2D a) {
        this.Field3622 = (float)a.getX();
        this.Field3623 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field3622, this.Field3623);
    }

    public void Method164(float a) {
        this.Field3624 = a;
    }

    public float Method165() {
        return this.Field3624;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3626 = (float)a.getWidth() * this.Field3622;
        this.Field3627 = (float)a.getHeight() * this.Field3623;
        if (this.Field3624 == 0.0f) {
            this.Field3624 = Math.min((float)this.Field3626, (float)this.Field3627);
        }
        this.Field3625 = this.Field3624 * this.Field3624;
        return super.Method62(a, a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        void a4;
        float f = (float)a - this.Field3626;
        boolean a5 = Class193.Method1269();
        float a6 = (float)a2 - this.Field3627;
        float a7 = a4 * a4 + a6 * a6;
        if (a7 > this.Field3625) {
            a3[0] = a;
            a3[1] = a2;
        }
        a7 = (float)Math.sqrt((double)a7);
        float a8 = (float)Math.atan2((double)a6, (double)((double)a4)) + this.Field3621 * (this.Field3624 - a7) / this.Field3624;
        a3[0] = this.Field3626 + a7 * (float)Math.cos((double)a8);
        a3[1] = this.Field3627 + a7 * (float)Math.sin((double)a8);
    }

    public String toString() {
        return "Distort/Twirl...";
    }
}