package awsl;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class87 extends Class193 {
   public static final int Field735 = 0;
   public static final int Field736 = 1;
   public static final int Field737 = 2;
   public static final int Field738 = 3;
   public static final int Field739 = 4;
   public static final int Field740 = 5;
   public static final int Field741 = 0;
   public static final int Field742 = 1;
   public static final int Field743 = 2;
   public static final int Field744 = 3;
   private float Field745 = 0.0F;
   private int Field746 = -16777216;
   private int Field747 = -1;
   private Point Field748 = new Point(0, 0);
   private Point Field749 = new Point(64, 64);
   private boolean Field750 = false;
   private float Field751;
   private float Field752;
   private float Field753;
   private float Field754;
   private Class755 Field755 = null;
   private int Field756;
   private int Field757 = 0;
   private int Field758 = 1;

   public Class87() {
   }

   public Class87(Point a, Point a, int a, int a, boolean a, int a, int a) {
      this.Field748 = a;
      this.Field749 = a;
      this.Field746 = a;
      this.Field747 = a;
      this.Field750 = a;
      this.Field756 = a;
      this.Field757 = a;
      this.Field755 = new Class771(a, a);
   }

   public void Method3678(Point a) {
      this.Field748 = a;
   }

   public Point Method3679() {
      return this.Field748;
   }

   public void Method3680(Point a) {
      this.Field749 = a;
   }

   public Point Method3681() {
      return this.Field749;
   }

   public void Method9(int a) {
      this.Field756 = a;
   }

   public int Method10() {
      return this.Field756;
   }

   public void Method11(int a) {
      this.Field757 = a;
   }

   public int Method12() {
      return this.Field757;
   }

   public void Method56(float a) {
      this.Field745 = a;
      this.Field749 = new Point((int)(64.0 * Math.cos((double)a)), (int)(64.0 * Math.sin((double)a)));
   }

   public float Method57() {
      return this.Field745;
   }

   public void Method176(Class755 a) {
      this.Field755 = a;
   }

   public Class755 Method177() {
      return this.Field755;
   }

   public void Method13(int a) {
      this.Field758 = a;
   }

   public int Method14() {
      return this.Field758;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      Class193.Method1269();
      int var5 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      float var8 = (float)this.Field748.x;
      float var10 = (float)this.Field749.x;
      int var6;
      int var7;
      float var9;
      float var11;
      if (var8 > var10 && this.Field756 != 2) {
         var9 = var8;
         var8 = var10;
         var10 = var9;
         var9 = (float)this.Field749.y;
         var11 = (float)this.Field748.y;
         var6 = this.Field747;
         var7 = this.Field746;
      }

      var9 = (float)this.Field748.y;
      var11 = (float)this.Field749.y;
      var6 = this.Field746;
      var7 = this.Field747;
      float var12 = var10 - var8;
      float var13 = var11 - var9;
      float var14 = var12 * var12 + var13 * var13;
      this.Field751 = var8;
      this.Field752 = var9;
      if (var14 >= Float.MIN_VALUE) {
         var12 /= var14;
         var13 /= var14;
         if (this.Field750) {
            var12 %= 1.0F;
            var13 %= 1.0F;
         }
      }

      this.Field753 = var12;
      this.Field754 = var13;
      int[] var15 = new int[var4];
      int var16 = 0;
      if (var16 < var5) {
         this.Method104(a, 0, var16, var4, 1, var15);
         switch (this.Field756) {
            case 0:
            case 1:
               this.Method3684(var15, var16, var4, 1);
            case 2:
               this.Method3685(var15, var16, var4, 1);
            case 3:
            case 4:
               this.Method3687(var15, var16, var4, 1);
            case 5:
               this.Method3686(var15, var16, var4, 1);
            default:
               this.Method1267(a, 0, var16, var4, 1, var15);
               ++var16;
         }
      }

      return a;
   }

   private void Method3682(int[] a, int a, int a, float a, float a, float a) {
      int var7 = 0;
      byte var8 = 0;
      if (var8 < a) {
         float var9 = a;
         int var10 = a;

         while(true) {
            --var10;
            int var11;
            if (this.Field756 == 1) {
               var11 = this.Field755.Method283(this.Method29(Class776.Method1716(var9)));
            } else {
               var11 = this.Field755.Method283(this.Method29(Class776.Method1714(var9, 1.0F)));
            }

            a[var7] = Class767.Method1691(var11, a[var7], this.Field758);
            ++var7;
            var9 += a;
         }
      }

   }

   private void Method3683(int[] a, int a, int a, float a, float a, float a) {
      int var7 = 0;

      for(int var8 = 0; var8 < a; ++var8) {
         float var9 = a;
         int var10 = a;
         int var11;
         if ((double)a <= 0.0) {
            var11 = this.Field755.Method283(0.0F);

            do {
               a[var7] = Class767.Method1691(var11, a[var7], this.Field758);
               ++var7;
               var9 += a;
               --var10;
            } while((double)var9 <= 0.0);
         }

         while((double)var9 < 1.0) {
            --var10;
            if (this.Field756 == 1) {
               var11 = this.Field755.Method283(this.Method29(Class776.Method1716(var9)));
            } else {
               var11 = this.Field755.Method283(this.Method29(var9));
            }

            a[var7] = Class767.Method1691(var11, a[var7], this.Field758);
            ++var7;
            var9 += a;
         }

         if (this.Field756 == 1) {
            var11 = this.Field755.Method283(0.0F);
         } else {
            var11 = this.Field755.Method283(1.0F);
         }

         a[var7] = Class767.Method1691(var11, a[var7], this.Field758);
         ++var7;
         --var10;
         a += a;
      }

   }

   private void Method3684(int[] a, int a, int a, int a) {
      byte var5 = 0;
      float var6 = ((float)var5 - this.Field751) * this.Field753 + ((float)a - this.Field752) * this.Field754;
      if (this.Field750) {
         this.Method3682(a, a, a, var6, this.Field753, this.Field754);
      } else {
         this.Method3683(a, a, a, var6, this.Field753, this.Field754);
      }

   }

   private void Method3685(int[] a, int a, int a, int a) {
      int var5 = 0;
      float var6 = this.Method20((float)(this.Field749.x - this.Field748.x), (float)(this.Field749.y - this.Field748.y));

      for(int var7 = 0; var7 < a; ++var7) {
         float var8 = this.Method20((float)(var7 - this.Field748.x), (float)(a - this.Field748.y));
         float var9 = var8 / var6;
         if (this.Field750) {
            var9 %= 2.0F;
         } else if ((double)var9 > 1.0) {
            var9 = 1.0F;
         }

         int var10 = this.Field755.Method283(this.Method29(var9));
         a[var5] = Class767.Method1691(var10, a[var5], this.Field758);
         ++var5;
      }

   }

   private void Method3686(int[] a, int a, int a, int a) {
      int var5 = 0;
      float var6 = (float)Math.max(Math.abs(this.Field749.x - this.Field748.x), Math.abs(this.Field749.y - this.Field748.y));

      for(int var7 = 0; var7 < a; ++var7) {
         float var8 = (float)Math.max(Math.abs(var7 - this.Field748.x), Math.abs(a - this.Field748.y));
         float var9 = var8 / var6;
         if (this.Field750) {
            var9 %= 2.0F;
         } else if ((double)var9 > 1.0) {
            var9 = 1.0F;
         }

         int var10 = this.Field755.Method283(this.Method29(var9));
         a[var5] = Class767.Method1691(var10, a[var5], this.Field758);
         ++var5;
      }

   }

   private void Method3687(int[] a, int a, int a, int a) {
      int var5 = 0;
      float var6 = (float)Math.atan2((double)(this.Field749.x - this.Field748.x), (double)(this.Field749.y - this.Field748.y));

      for(int var7 = 0; var7 < a; ++var7) {
         float var8 = (float)(Math.atan2((double)(var7 - this.Field748.x), (double)(a - this.Field748.y)) - (double)var6) / 6.2831855F;
         ++var8;
         var8 %= 1.0F;
         if (this.Field756 == 4) {
            var8 = Class776.Method1716(var8);
         }

         int var9 = this.Field755.Method283(this.Method29(var8));
         a[var5] = Class767.Method1691(var9, a[var5], this.Field758);
         ++var5;
      }

   }

   private float Method29(float a) {
      if (this.Field750) {
         a = (double)a > 1.0 ? 2.0F - a : a;
      }

      switch (this.Field757) {
         case 1:
            a = Class776.Method1709(Class776.Method1711(a, 0.0F, 1.0F));
            break;
         case 2:
            a = Class776.Method1710(Class776.Method1711(a, 0.0F, 1.0F));
            break;
         case 3:
            a = Class776.Method1708(0.0F, 1.0F, a);
      }

      return a;
   }

   private float Method20(float a, float a) {
      return (float)Math.sqrt((double)(a * a + a * a));
   }

   public String toString() {
      return "Other/Gradient Fill...";
   }
}
