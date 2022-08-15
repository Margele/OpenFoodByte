/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.awt.image.WritableRaster
 *  java.lang.Object
 */
package awsl;

import awsl.Class193;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public abstract class Class798
extends Class193 {
    protected Rectangle Field3568;
    protected Rectangle Field3569;

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        int a5 = a.getType();
        WritableRaster a6 = a.getRaster();
        this.Field3569 = new Rectangle(0, 0, a3, a4);
        this.Field3568 = new Rectangle(0, 0, a3, a4);
        this.Method834(this.Field3568);
        ColorModel a7 = a.getColorModel();
        a2 = new BufferedImage(a7, a7.createCompatibleWritableRaster(this.Field3568.width, this.Field3568.height), a7.isAlphaPremultiplied(), null);
        a7 = a2.getRaster();
        int[] a8 = this.Method104(a, 0, 0, a3, a4, null);
        a8 = this.Method714(a3, a4, a8, this.Field3568);
        this.Method1267(a2, 0, 0, this.Field3568.width, this.Field3568.height, a8);
        return a2;
    }

    protected void Method834(Rectangle a) {
    }

    protected abstract int[] Method714(int var1, int var2, int[] var3, Rectangle var4);
}