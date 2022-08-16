/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.AlphaComposite
 *  java.awt.Composite
 *  java.awt.Graphics2D
 *  java.awt.Rectangle
 *  java.awt.geom.AffineTransform
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Double
 *  java.awt.geom.Rectangle2D
 *  java.awt.image.BandCombineOp
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.awt.image.Raster
 *  java.awt.image.RenderedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class187;
import awsl.Class193;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import obfuscate.a;

public class Class879
extends Class193 {
    private float Field3832 = 5.0f;
    private float Field3833 = 4.712389f;
    private float Field3834 = 5.0f;
    private float Field3835 = 0.5f;
    private boolean Field3836 = false;
    private boolean Field3837 = false;
    private int Field3838 = -16777216;

    public Class879() {
    }

    public Class879(float a, float a2, float a3, float a4) {
        this.Field3832 = a;
        this.Field3833 = (float)Math.atan2((double)a3, (double)a2);
        this.Field3834 = (float)Math.sqrt((double)(a2 * a2 + a3 * a3));
        this.Field3835 = a4;
    }

    public void Method56(float a) {
        this.Field3833 = a;
    }

    public float Method57() {
        return this.Field3833;
    }

    public void Method58(float a) {
        this.Field3834 = a;
    }

    public float Method59() {
        return this.Field3834;
    }

    public void Method60(float a) {
        this.Field3832 = a;
    }

    public float Method61() {
        return this.Field3832;
    }

    public void Method164(float a) {
        this.Field3835 = a;
    }

    public float Method165() {
        return this.Field3835;
    }

    public void Method9(int a) {
        this.Field3838 = a;
    }

    public int Method10() {
        return this.Field3838;
    }

    public void Method87(boolean a) {
        this.Field3836 = a;
    }

    public boolean Method88() {
        return this.Field3836;
    }

    public void Method1282(boolean a) {
        this.Field3837 = a;
    }

    public boolean Method1283() {
        return this.Field3837;
    }

    @Override
    public Rectangle2D Method1264(BufferedImage a) {
        Rectangle a2 = new Rectangle(0, 0, a.getWidth(), a.getHeight());
        if (this.Field3836) {
            float a3 = this.Field3834 * (float)Math.cos((double)this.Field3833);
            float a4 = -this.Field3834 * (float)Math.sin((double)this.Field3833);
            a2.width += (int)(Math.abs((float)a3) + 2.0f * this.Field3832);
            a2.height += (int)(Math.abs((float)a4) + 2.0f * this.Field3832);
        }
        return a2;
    }

    @Override
    public Point2D Method1265(Point2D a, Point2D a2) {
        boolean a3 = Class193.Method1270();
        a2 = new Point2D.Double();
        if (this.Field3836) {
            float a4 = this.Field3834 * (float)Math.cos((double)this.Field3833);
            float a5 = -this.Field3834 * (float)Math.sin((double)this.Field3833);
            float a6 = Math.max((float)0.0f, (float)(this.Field3832 - a5));
            float a7 = Math.max((float)0.0f, (float)(this.Field3832 - a4));
            a2.setLocation(a.getX() + (double)a7, a.getY() + (double)a6);
        }
        a2.setLocation(a.getX(), a.getY());
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a2, BufferedImage a3) {
        void a4;
        int a5 = a2.getWidth();
        int n = a2.getHeight();
        boolean a6 = Class193.Method1270();
        float a7 = this.Field3834 * (float)Math.cos((double)this.Field3833);
        float a8 = -this.Field3834 * (float)Math.sin((double)this.Field3833);
        if (this.Field3836) {
            ColorModel a9 = a2.getColorModel();
            a3 = new BufferedImage(a9, a9.createCompatibleWritableRaster(a2.getWidth() + (int)(Math.abs((float)a7) + this.Field3832), a2.getHeight() + (int)(Math.abs((float)a8) + this.Field3832)), a9.isAlphaPremultiplied(), null);
        }
        a3 = this.Method1263(a2, null);
        float a10 = (float)(this.Field3838 >> 16 & 0xFF) / 255.0f;
        float a11 = (float)(this.Field3838 >> 8 & 0xFF) / 255.0f;
        float a12 = (float)(this.Field3838 & 0xFF) / 255.0f;
        float[][] a13 = new float[][]{{0.0f, 0.0f, 0.0f, a10}, {0.0f, 0.0f, 0.0f, a11}, {0.0f, 0.0f, 0.0f, a12}, {0.0f, 0.0f, 0.0f, this.Field3835}};
        BufferedImage a14 = new BufferedImage(a5, (int)a4, 2);
        new BandCombineOp((float[][])a13, null).filter((Raster)a2.getRaster(), a14.getRaster());
        a14 = new Class187(this.Field3832).Method62(a14, null);
        Graphics2D a15 = a3.createGraphics();
        a15.setComposite((Composite)AlphaComposite.getInstance((int)3, (float)this.Field3835));
        if (this.Field3836) {
            float a16 = this.Field3832 / 2.0f;
            float a17 = Math.max((float)0.0f, (float)(this.Field3832 - a8));
            float a18 = Math.max((float)0.0f, (float)(this.Field3832 - a7));
            a15.translate((double)a18, (double)a17);
        }
        a15.drawRenderedImage((RenderedImage)a14, AffineTransform.getTranslateInstance((double)a7, (double)a8));
        if (!this.Field3837) {
            a15.setComposite((Composite)AlphaComposite.SrcOver);
            a15.drawRenderedImage((RenderedImage)a2, null);
        }
        a15.dispose();
        if (a.trash() == null) {
            Class193.Method1268(false);
        }
        return a3;
    }

    public String toString() {
        return "Stylize/Drop Shadow...";
    }
}