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
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      a = new BufferedImage(var3, var4, 2);
      int[] var5 = new int[var3 * var4];
      int[] var6 = new int[var3 * var4];
      this.Method104(a, 0, 0, var3, var4, var5);
      if (this.Field3574) {
         Class776.Method1727(var5, 0, var5.length);
      }

      for(int var7 = 0; var7 < this.Field3572; ++var7) {
         this.Method3303(var5, var6, var3, var4, this.Field3570, 1);
         this.Method3303(var6, var5, var4, var3, this.Field3571, 2);
      }

      if (this.Field3574) {
         Class776.Method1728(var5, 0, var5.length);
      }

      this.Method1267(a, 0, 0, var3, var4, var5);
      return a;
   }

   public BufferedImage Method1263(BufferedImage a, ColorModel a) {
      a = a.getColorModel();
      return new BufferedImage(a, a.createCompatibleWritableRaster(a.getWidth(), a.getHeight()), a.isAlphaPremultiplied(), (Hashtable)null);
   }

   public Rectangle2D Method1264(BufferedImage a) {
      return new Rectangle(0, 0, a.getWidth(), a.getHeight());
   }

   public Point2D Method1265(Point2D a, Point2D a) {
      Point2D.Double var3 = new Point2D.Double();
      var3.setLocation(a.getX(), a.getY());
      return var3;
   }

   public RenderingHints Method1266() {
      return null;
   }

   public void Method3303(int[] a, int[] a, int a, int a, int a, int a) {
      int var8 = a - 1;
      int[] var9 = new int[a];
      int[] var10 = new int[a];
      int[] var11 = new int[a];
      Class193.Method1269();
      int[] var12 = new int[a];
      int[] var13 = new int[a];
      byte var14 = 0;
      int var15 = 0;
      if (var15 < a) {
         if (this.Field3573 != null) {
            if (a == 1) {
               this.Method104(this.Field3573, 0, var15, a, 1, var13);
            }

            this.Method104(this.Field3573, var15, 0, 1, a, var13);
         }

         int var17 = 0;
         int var18;
         if (var17 < a) {
            var18 = a[var14 + var17];
            var12[var17] = var18 >> 24 & 255;
            var9[var17] = var18 >> 16 & 255;
            var10[var17] = var18 >> 8 & 255;
            var11[var17] = var18 & 255;
            var12[var17] += var12[var17 - 1];
            var9[var17] += var9[var17 - 1];
            var10[var17] += var10[var17 - 1];
            var11[var17] += var11[var17 - 1];
            ++var17;
         }

         byte var27 = 0;
         int var10000;
         if (var27 < a) {
            if (this.Field3573 != null) {
               if (a == 1) {
                  var18 = (int)((float)((var13[var27] & 255) * this.Field3570) / 255.0F);
               }

               var18 = (int)((float)((var13[var27] & 255) * this.Field3571) / 255.0F);
            }

            if (a == 1) {
               var10000 = (int)(this.Method3304(var27, var15, a, a) * (float)this.Field3570);
            }

            var18 = (int)(this.Method3304(var15, var27, a, a) * (float)this.Field3571);
            int var19 = 2 * var18 + 1;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            int var24 = var27 + var18;
            int var25;
            if (var24 > var8) {
               var25 = var24 - var8;
               var20 += (var12[var8] - var12[var8 - 1]) * var25;
               var21 += (var9[var8] - var9[var8 - 1]) * var25;
               var22 += (var10[var8] - var10[var8 - 1]) * var25;
               var23 += (var11[var8] - var11[var8 - 1]) * var25;
               var24 = var8;
            }

            var25 = var27 - var18 - 1;
            var20 -= var12[0] * var25;
            var21 -= var9[0] * var25;
            var22 -= var10[0] * var25;
            var23 -= var11[0] * var25;
            byte var28 = 0;
            var20 += var12[var24] - var12[var28];
            var21 += var9[var24] - var9[var28];
            var22 += var10[var24] - var10[var28];
            var23 += var11[var24] - var11[var28];
            a[var15] = var20 / var19 << 24 | var21 / var19 << 16 | var22 / var19 << 8 | var23 / var19;
            int var16 = var15 + a;
            var17 = var27 + 1;
         }

         var10000 = var14 + a;
         ++var15;
      }

   }

   protected float Method3304(int a, int a, int a, int a) {
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
