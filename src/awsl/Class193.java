package awsl;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.util.Hashtable;

public abstract class Class193 implements BufferedImageOp, Cloneable {
   private static boolean Field1159;

   public BufferedImage Method1263(BufferedImage a, ColorModel a) {
      a = a.getColorModel();
      return new BufferedImage(a, a.createCompatibleWritableRaster(a.getWidth(), a.getHeight()), a.isAlphaPremultiplied(), (Hashtable)null);
   }

   public Rectangle2D Method1264(BufferedImage a) {
      return new Rectangle(0, 0, a.getWidth(), a.getHeight());
   }

   public Point2D Method1265(Point2D a, Point2D a1) {
      Point2D a = new Point2D.Double();
      a.setLocation(a.getX(), a.getY());
      return a;
   }

   public RenderingHints Method1266() {
      return null;
   }

   public int[] Method104(BufferedImage a, int a, int a, int a, int a, int[] a) {
      int a = a.getType();
      return a != 2 && a != 1 ? a.getRGB(a, a, a, a, a, 0, a) : (int[])((int[])a.getRaster().getDataElements(a, a, a, a, a));
   }

   public void Method1267(BufferedImage a, int a, int a, int a, int a, int[] a) {
      Method1270();
      int a = a.getType();
      if (a == 2 || a == 1) {
         a.getRaster().setDataElements(a, a, a, a, a);
      }

      a.setRGB(a, a, a, a, a, 0, a);
   }

   public Object Method878() {
      try {
         return super.Method1433();
      } catch (CloneNotSupportedException var2) {
         return null;
      }
   }

   public static void Method1268(boolean boolean1) {
      Field1159 = boolean1;
   }

   public static boolean Method1269() {
      return Field1159;
   }

   public static boolean Method1270() {
      boolean var0 = Method1269();
      return true;
   }

   static {
      if (!Method1269()) {
         Method1268(true);
      }

   }
}
