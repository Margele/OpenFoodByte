/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Image
 *  java.awt.RenderingHints
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class191
extends Class193 {
    private int Field1155;
    private int Field1156;

    public Class191() {
        this(32, 32);
    }

    public Class191(int a, int a2) {
        this.Field1155 = a;
        this.Field1156 = a2;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        ColorModel a5 = a.getColorModel();
        a2 = new BufferedImage(a5, a5.createCompatibleWritableRaster(this.Field1155, this.Field1156), a5.isAlphaPremultiplied(), null);
        a5 = a2.createGraphics();
        a5.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        a5.drawImage((Image)a, 0, 0, this.Field1155, this.Field1156, null);
        a5.dispose();
        return a2;
    }

    public String toString() {
        return "Distort/Bicubic Scale";
    }
}