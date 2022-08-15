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
import awsl.Class91;
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
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        int a4 = a.getWidth();
        int n = a.getHeight();
        boolean a5 = Class193.Method1270();
        float a6 = this.Field3834 * (float)Math.cos((double)this.Field3833);
        float a7 = -this.Field3834 * (float)Math.sin((double)this.Field3833);
        if (this.Field3836) {
            ColorModel a8 = a.getColorModel();
            a2 = new BufferedImage(a8, a8.createCompatibleWritableRaster(a.getWidth() + (int)(Math.abs((float)a6) + this.Field3832), a.getHeight() + (int)(Math.abs((float)a7) + this.Field3832)), a8.isAlphaPremultiplied(), null);
        }
        a2 = this.Method1263(a, null);
        float a9 = (float)(this.Field3838 >> 16 & 0xFF) / 255.0f;
        float a10 = (float)(this.Field3838 >> 8 & 0xFF) / 255.0f;
        float a11 = (float)(this.Field3838 & 0xFF) / 255.0f;
        float[][] a12 = new float[][]{{0.0f, 0.0f, 0.0f, a9}, {0.0f, 0.0f, 0.0f, a10}, {0.0f, 0.0f, 0.0f, a11}, {0.0f, 0.0f, 0.0f, this.Field3835}};
        BufferedImage a13 = new BufferedImage(a4, (int)a3, 2);
        new BandCombineOp((float[][])a12, null).filter((Raster)a.getRaster(), a13.getRaster());
        a13 = new Class187(this.Field3832).Method62(a13, null);
        Graphics2D a14 = a2.createGraphics();
        a14.setComposite((Composite)AlphaComposite.getInstance((int)3, (float)this.Field3835));
        if (this.Field3836) {
            float a15 = this.Field3832 / 2.0f;
            float a16 = Math.max((float)0.0f, (float)(this.Field3832 - a7));
            float a17 = Math.max((float)0.0f, (float)(this.Field3832 - a6));
            a14.translate((double)a17, (double)a16);
        }
        a14.drawRenderedImage((RenderedImage)a13, AffineTransform.getTranslateInstance((double)a6, (double)a7));
        if (!this.Field3837) {
            a14.setComposite((Composite)AlphaComposite.SrcOver);
            a14.drawRenderedImage((RenderedImage)a, null);
        }
        a14.dispose();
        if (Class91.Method3648() == null) {
            Class193.Method1268(false);
        }
        return a2;
    }

    public String toString() {
        return "Stylize/Drop Shadow...";
    }
}