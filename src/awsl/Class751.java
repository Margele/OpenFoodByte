package awsl;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.util.Hashtable;
import java.util.Random;

public class Class751 implements BufferedImageOp {
   private int Field3283 = 10;
   private float Field3284 = 0.1F;
   private int Field3285 = -7829368;
   private float Field3286 = 0.1F;
   private boolean Field3287 = true;
   private Random Field3288;

   public Class751() {
   }

   public Class751(int a, int a, float a, boolean a, float a) {
      this.Field3285 = a;
      this.Field3283 = a;
      this.Field3284 = a;
      this.Field3287 = a;
      this.Field3286 = a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = new int[a];
      int[] a = new int[a];
      this.Field3288 = new Random(0L);
      int a = this.Field3285 & -16777216;
      int a = this.Field3285 >> 16 & 255;
      int a = this.Field3285 >> 8 & 255;
      int a = this.Field3285 & 255;
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            int a = a;
            int a = a;
            int a = a;
            int a;
            if (this.Field3286 != 0.0F) {
               a = (int)((double)(255.0F * this.Field3286) * Math.sin((double)a / (double)a * Math.PI));
               a = a + a;
               a = a + a;
               a = a + a;
            }

            if (this.Field3287) {
               a = (int)(255.0F * (2.0F * this.Field3288.nextFloat() - 1.0F) * this.Field3284);
               a[a] = a | Method1613(a + a) << 16 | Method1613(a + a) << 8 | Method1613(a + a);
            }

            a[a] = a | this.Method1612(a) << 16 | this.Method1612(a) << 8 | this.Method1612(a);
            ++a;
         }

         if (this.Field3283 != 0) {
            this.Method1615(a, a, a, this.Field3283);
            this.Method1267(a, 0, a, a, 1, a);
         }

         this.Method1267(a, 0, a, a, 1, a);
         ++a;
      }

      return a;
   }

   private int Method1612(int a) {
      a += (int)(255.0F * (2.0F * this.Field3288.nextFloat() - 1.0F) * this.Field3284);
      int a = 0;
      return a;
   }

   private static int Method1613(int a) {
      return 0;
   }

   private static int Method1614(int a, int a) {
      int a = a / a;
      a -= a * a;
      return a + a;
   }

   public void Method1615(int[] a, int[] a, int a, int a) {
      int a = a - 1;
      int a = 2 * a + 1;
      int a = 0;
      int a = 0;
      int a = 0;

      int a;
      int a;
      for(a = -a; a <= a; ++a) {
         a = a[Method1614(a, a)];
         a += a >> 16 & 255;
         a += a >> 8 & 255;
         a += a & 255;
      }

      for(a = 0; a < a; ++a) {
         a[a] = -16777216 | a / a << 16 | a / a << 8 | a / a;
         a = a + a + 1;
         if (a > a) {
            a = Method1614(a, a);
         }

         int a = a - a;
         a = Method1614(a, a);
         int a = a[a];
         int a = a[a];
         a += (a & 16711680) - (a & 16711680) >> 16;
         a += (a & '\uff00') - (a & '\uff00') >> 8;
         a += (a & 255) - (a & 255);
      }

   }

   public void Method9(int a) {
      this.Field3283 = a;
   }

   public int Method10() {
      return this.Field3283;
   }

   public void Method56(float a) {
      this.Field3284 = a;
   }

   public float Method57() {
      return this.Field3284;
   }

   public void Method58(float a) {
      this.Field3286 = a;
   }

   public float Method59() {
      return this.Field3286;
   }

   public void Method11(int a) {
      this.Field3285 = a;
   }

   public int Method12() {
      return this.Field3285;
   }

   public void Method1268(boolean a) {
      this.Field3287 = a;
   }

   public boolean Method1269() {
      return this.Field3287;
   }

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

   private void Method1267(BufferedImage a, int a, int a, int a, int a, int[] a) {
      int a = a.getType();
      if (a != 2 && a != 1) {
         a.setRGB(a, a, a, a, a, 0, a);
      } else {
         a.getRaster().setDataElements(a, a, a, a, a);
      }

   }

   public String toString() {
      return "Texture/Brushed Metal...";
   }
}
