package awsl;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.util.Hashtable;

public class Class800 extends Class193 {
   private int Field3570 = 1;
   private int Field3571 = 1;
   private int Field3572 = 1;
   private BufferedImage Field3573;
   private boolean Field3574 = true;

   public void Method87(boolean a) {
      this.Field3574 = a;
   }

   public boolean Method88() {
      return this.Field3574;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      a = new BufferedImage(a, a, 2);
      int[] a = new int[a * a];
      int[] a = new int[a * a];
      this.Method104(a, 0, 0, a, a, a);
      if (this.Field3574) {
         Class776.Method1727(a, 0, a.length);
      }

      for(int a = 0; a < this.Field3572; ++a) {
         this.Method3303(a, a, a, a, this.Field3570, 1);
         this.Method3303(a, a, a, a, this.Field3571, 2);
      }

      if (this.Field3574) {
         Class776.Method1728(a, 0, a.length);
      }

      this.Method1267(a, 0, 0, a, a, a);
      return a;
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

   public void Method3303(int[] a, int[] a, int a, int a, int a4, int a) {
      int a = a - 1;
      int[] a = new int[a];
      int[] a = new int[a];
      int[] a = new int[a];
      Class193.Method1269();
      int[] a = new int[a];
      int[] a = new int[a];
      int a = 0;
      int a = 0;
      if (a < a) {
         if (this.Field3573 != null) {
            if (a == 1) {
               this.Method104(this.Field3573, 0, a, a, 1, a);
            }

            this.Method104(this.Field3573, a, 0, 1, a, a);
         }

         int a = 0;
         int a;
         if (a < a) {
            a = a[a + a];
            a[a] = a >> 24 & 255;
            a[a] = a >> 16 & 255;
            a[a] = a >> 8 & 255;
            a[a] = a & 255;
            a[a] += a[a - 1];
            a[a] += a[a - 1];
            a[a] += a[a - 1];
            a[a] += a[a - 1];
            ++a;
         }

         int a = 0;
         int var10000;
         if (a < a) {
            if (this.Field3573 != null) {
               if (a == 1) {
                  a = (int)((float)((a[a] & 255) * this.Field3570) / 255.0F);
               }

               a = (int)((float)((a[a] & 255) * this.Field3571) / 255.0F);
            }

            if (a == 1) {
               var10000 = (int)(this.Method3304(a, a, a, a) * (float)this.Field3570);
            }

            a = (int)(this.Method3304(a, a, a, a) * (float)this.Field3571);
            int a = 2 * a + 1;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = a + a;
            int a;
            if (a > a) {
               a = a - a;
               a += (a[a] - a[a - 1]) * a;
               a += (a[a] - a[a - 1]) * a;
               a += (a[a] - a[a - 1]) * a;
               a += (a[a] - a[a - 1]) * a;
               a = a;
            }

            a = a - a - 1;
            a -= a[0] * a;
            a -= a[0] * a;
            a -= a[0] * a;
            a -= a[0] * a;
            int a = 0;
            a += a[a] - a[a];
            a += a[a] - a[a];
            a += a[a] - a[a];
            a += a[a] - a[a];
            a[a] = a / a << 24 | a / a << 16 | a / a << 8 | a / a;
            int a = a + a;
            a = a + 1;
         }

         var10000 = a + a;
         ++a;
      }

   }

   protected float Method3304(int a, int a1, int a, int a3) {
      return (float)a / (float)a;
   }

   public void Method9(int a) {
      this.Field3570 = a;
   }

   public int Method10() {
      return this.Field3570;
   }

   public void Method11(int a) {
      this.Field3571 = a;
   }

   public int Method12() {
      return this.Field3571;
   }

   public void Method13(int a) {
      this.Field3570 = this.Field3571 = a;
   }

   public int Method14() {
      return this.Field3570;
   }

   public void Method15(int a) {
      this.Field3572 = a;
   }

   public int Method16() {
      return this.Field3572;
   }

   public void Method1271(BufferedImage a) {
      this.Field3573 = a;
   }

   public BufferedImage Method1272() {
      return this.Field3573;
   }

   public String toString() {
      return "Blur/Variable Blur...";
   }
}
