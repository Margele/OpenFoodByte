/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Graphics2D
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Float
 *  java.awt.image.BufferedImage
 *  java.awt.image.RenderedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class Class70
extends Class193 {
    private float Field680 = 0.5f;
    private float Field681 = 0.5f;
    private float Field682;
    private float Field683;
    private float Field684;
    private float Field685;

    public Class70() {
    }

    public Class70(float a, float a2, float a3, float a4) {
        this.Field682 = a;
        this.Field683 = a2;
        this.Field684 = a3;
        this.Field685 = a4;
    }

    public void Method56(float a) {
        this.Field683 = a;
    }

    public float Method57() {
        return this.Field683;
    }

    public void Method58(float a) {
        this.Field682 = a;
    }

    public float Method59() {
        return this.Field682;
    }

    public void Method60(float a) {
        this.Field684 = a;
    }

    public float Method61() {
        return this.Field684;
    }

    public void Method164(float a) {
        this.Field685 = a;
    }

    public float Method165() {
        return this.Field685;
    }

    public void Method166(float a) {
        this.Field680 = a;
    }

    public float Method167() {
        return this.Field680;
    }

    public void Method168(float a) {
        this.Field681 = a;
    }

    public float Method169() {
        return this.Field681;
    }

    public void Method330(Point2D a) {
        this.Field680 = (float)a.getX();
        this.Field681 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field680, this.Field681);
    }

    /*
     * WARNING - void declaration
     */
    private int Method1612(int a) {
        void a2;
        void a3;
        boolean bl = true;
        boolean bl2 = false;
        boolean a4 = Class193.Method1269();
        if (a3 < a) {
            a3 *= 2;
            ++a2;
        }
        return (int)a2;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        boolean a3 = Class193.Method1270();
        a2 = this.Method1263(a, null);
        BufferedImage a4 = a;
        float a5 = (float)a.getWidth() * this.Field680;
        float a6 = (float)a.getHeight() * this.Field681;
        float a7 = (float)Math.sqrt((double)(a5 * a5 + a6 * a6));
        float a8 = (float)((double)this.Field682 * Math.cos((double)this.Field683));
        float a9 = (float)((double)this.Field682 * -Math.sin((double)this.Field683));
        float a10 = this.Field685;
        float a11 = this.Field684;
        float a12 = this.Field682 + Math.abs((float)(this.Field684 * a7)) + this.Field685 * a7;
        int a13 = this.Method1612((int)a12);
        a8 /= a12;
        a9 /= a12;
        a10 /= a12;
        a11 /= a12;
        Graphics2D a14 = a2.createGraphics();
        a14.drawRenderedImage((RenderedImage)a, null);
        a14.dispose();
        return a2;
    }

    public String toString() {
        return "Blur/Faster Motion Blur...";
    }
}