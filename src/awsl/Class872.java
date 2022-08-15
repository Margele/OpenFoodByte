/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class872
extends Class193 {
    private int Field3804;
    private int Field3805;
    private int Field3806;
    private int Field3807;

    public Class872() {
        this(32, 32);
    }

    public Class872(int a, int a2) {
        this.Field3804 = a;
        this.Field3805 = a2;
    }

    public void Method9(int a) {
        this.Field3804 = a;
    }

    public int Method10() {
        return this.Field3804;
    }

    public void Method11(int a) {
        this.Field3805 = a;
    }

    public int Method12() {
        return this.Field3805;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int n = a.getWidth();
        boolean a3 = Class193.Method1270();
        int a4 = a.getHeight();
        ColorModel a5 = a.getColorModel();
        a2 = new BufferedImage(a5, a5.createCompatibleWritableRaster(this.Field3804, this.Field3805), a5.isAlphaPremultiplied(), null);
        a5 = a2.createGraphics();
        int a6 = 0;
        if (a6 < this.Field3805) {
            int a7 = 0;
            if (a7 < this.Field3804) {
                void a8;
                a5.drawImage(a, null, a7, a6);
                a7 += a8;
            }
            a6 += a4;
        }
        a5.dispose();
        return a2;
    }

    public String toString() {
        return "Tile";
    }
}