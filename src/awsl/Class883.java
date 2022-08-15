/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class883
extends Class193 {
    private int Field3857;
    private int Field3858;

    public Class883() {
        this(32, 32);
    }

    public Class883(int a, int a2) {
        this.Field3857 = a;
        this.Field3858 = a2;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        ColorModel a3 = a.getColorModel();
        a2 = new BufferedImage(a3, a3.createCompatibleWritableRaster(this.Field3857, this.Field3858), a3.isAlphaPremultiplied(), null);
        a3 = a.getScaledInstance(this.Field3857, this.Field3858, 16);
        Graphics2D a4 = a2.createGraphics();
        a4.drawImage((Image)a3, 0, 0, this.Field3857, this.Field3858, null);
        a4.dispose();
        return a2;
    }

    public String toString() {
        return "Distort/Scale";
    }
}