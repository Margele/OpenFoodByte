/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.AlphaComposite
 *  java.awt.Composite
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.RenderingHints
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
import awsl.Class776;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class Class85
extends Class193 {
    private float Field725 = 0.5f;
    private float Field726 = 0.5f;
    private float Field727;
    private float Field728;
    private float Field729;
    private float Field730;
    private float Field731 = 1.0f;
    private float Field732 = 1.0f;
    private int Field733;

    public Class85() {
    }

    public Class85(float a, float a2, float a3, float a4) {
        this.Field727 = a;
        this.Field728 = a2;
        this.Field729 = a3;
        this.Field730 = a4;
    }

    public void Method56(float a) {
        this.Field728 = a;
    }

    public float Method57() {
        return this.Field728;
    }

    public void Method58(float a) {
        this.Field727 = a;
    }

    public float Method59() {
        return this.Field727;
    }

    public void Method60(float a) {
        this.Field729 = a;
    }

    public float Method61() {
        return this.Field729;
    }

    public void Method164(float a) {
        this.Field730 = a;
    }

    public float Method165() {
        return this.Field730;
    }

    public void Method166(float a) {
        this.Field731 = a;
    }

    public float Method167() {
        return this.Field731;
    }

    public void Method168(float a) {
        this.Field732 = a;
    }

    public float Method169() {
        return this.Field732;
    }

    public void Method170(float a) {
        this.Field725 = a;
    }

    public float Method171() {
        return this.Field725;
    }

    public void Method172(float a) {
        this.Field726 = a;
    }

    public float Method173() {
        return this.Field726;
    }

    public void Method330(Point2D a) {
        this.Field725 = (float)a.getX();
        this.Field726 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field725, this.Field726);
    }

    public void Method9(int a) {
        this.Field733 = a;
    }

    public int Method10() {
        return this.Field733;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        boolean a3 = Class193.Method1269();
        a2 = this.Method1263(a, null);
        float a4 = (float)a.getWidth() * this.Field725;
        float a5 = (float)a.getHeight() * this.Field726;
        float a6 = (float)Math.sqrt((double)(a4 * a4 + a5 * a5));
        float a7 = (float)((double)this.Field727 * Math.cos((double)this.Field728));
        float a8 = (float)((double)this.Field727 * -Math.sin((double)this.Field728));
        float a9 = (float)Math.exp((double)this.Field730);
        float a10 = this.Field729;
        if (this.Field733 == 0) {
            Graphics2D a11 = a2.createGraphics();
            a11.drawRenderedImage((RenderedImage)a, null);
            a11.dispose();
            return a2;
        }
        Graphics2D a12 = a2.createGraphics();
        a12.drawImage((Image)a, null, null);
        int a13 = 0;
        if (a13 < this.Field733) {
            a12.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            a12.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            a12.setComposite((Composite)AlphaComposite.getInstance((int)3, (float)Class776.Method1717((float)a13 / (float)(this.Field733 - 1), this.Field731, this.Field732)));
            a12.translate((double)(a4 + a7), (double)(a5 + a8));
            a12.scale((double)a9, (double)a9);
            if (this.Field729 != 0.0f) {
                a12.rotate((double)a10);
            }
            a12.translate((double)(-a4), (double)(-a5));
            a12.drawImage((Image)a, null, null);
            ++a13;
        }
        a12.dispose();
        return a2;
    }

    public String toString() {
        return "Effects/Feedback...";
    }
}