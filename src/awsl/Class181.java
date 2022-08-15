/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.geom.AffineTransform
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.awt.image.RenderedImage
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.RenderedImage;

public class Class181
extends Class193 {
    private int Field1130;
    private int Field1131;
    private int Field1132;
    private int Field1133;

    public Class181() {
        this(0, 0, 32, 32);
    }

    public Class181(int a, int a2, int a3, int a4) {
        this.Field1130 = a;
        this.Field1131 = a2;
        this.Field1132 = a3;
        this.Field1133 = a4;
    }

    public void Method9(int a) {
        this.Field1130 = a;
    }

    public int Method10() {
        return this.Field1130;
    }

    public void Method11(int a) {
        this.Field1131 = a;
    }

    public int Method12() {
        return this.Field1131;
    }

    public void Method13(int a) {
        this.Field1132 = a;
    }

    public int Method14() {
        return this.Field1132;
    }

    public void Method15(int a) {
        this.Field1133 = a;
    }

    public int Method16() {
        return this.Field1133;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        ColorModel a5 = a.getColorModel();
        a2 = new BufferedImage(a5, a5.createCompatibleWritableRaster(this.Field1132, this.Field1133), a5.isAlphaPremultiplied(), null);
        a5 = a2.createGraphics();
        a5.drawRenderedImage((RenderedImage)a, AffineTransform.getTranslateInstance((double)(-this.Field1130), (double)(-this.Field1131)));
        a5.dispose();
        return a2;
    }

    public String toString() {
        return "Distort/Crop";
    }
}