/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.awt.RenderingHints
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Double
 *  java.awt.geom.Rectangle2D
 *  java.awt.image.BufferedImage
 *  java.awt.image.BufferedImageOp
 *  java.awt.image.ColorModel
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 */
package awsl;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;

public abstract class Class193
implements BufferedImageOp,
Cloneable {
    private static boolean Field1159;

    public BufferedImage Method1263(BufferedImage a, ColorModel a2) {
        a2 = a.getColorModel();
        return new BufferedImage(a2, a2.createCompatibleWritableRaster(a.getWidth(), a.getHeight()), a2.isAlphaPremultiplied(), null);
    }

    public Rectangle2D Method1264(BufferedImage a) {
        return new Rectangle(0, 0, a.getWidth(), a.getHeight());
    }

    public Point2D Method1265(Point2D a, Point2D a2) {
        a2 = new Point2D.Double();
        a2.setLocation(a.getX(), a.getY());
        return a2;
    }

    public RenderingHints Method1266() {
        return null;
    }

    public int[] Method104(BufferedImage a, int a2, int a3, int a4, int a5, int[] a6) {
        int a7 = a.getType();
        if (a7 == 2 || a7 == 1) {
            return (int[])a.getRaster().getDataElements(a2, a3, a4, a5, (Object)a6);
        }
        return a.getRGB(a2, a3, a4, a5, a6, 0, a4);
    }

    /*
     * WARNING - void declaration
     */
    public void Method1267(BufferedImage a, int a2, int a3, int a4, int a5, int[] a6) {
        void a7;
        int n = a.getType();
        boolean a8 = Class193.Method1270();
        if (a7 == 2 || a7 == true) {
            a.getRaster().setDataElements(a2, a3, a4, a5, (Object)a6);
        }
        a.setRGB(a2, a3, a4, a5, a6, 0, a4);
    }

    public Object Method878() {
        try {
            return super.Method1433();
        }
        catch (CloneNotSupportedException a) {
            return null;
        }
    }

    public static void Method1268(boolean bl) {
        Field1159 = bl;
    }

    public static boolean Method1269() {
        return Field1159;
    }

    public static boolean Method1270() {
        boolean bl = Class193.Method1269();
        return true;
    }

    static {
        if (!Class193.Method1269()) {
            Class193.Method1268(true);
        }
    }
}