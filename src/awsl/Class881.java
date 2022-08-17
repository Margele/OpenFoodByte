package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

public class Class881 extends Class193 {
   private int Field3846 = 5;
   private int Field3847 = 5;
   private int Field3848 = 10;

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] var5 = new int[var3 * var4];
      int[] var6 = new int[var3 * var4];
      this.Method104(a, 0, 0, var3, var4, var5);
      Kernel var7 = Class187.Method1294((float)this.Field3846);
      this.Method3600(var7, var5, var6, var3, var4, true);
      this.Method3600(var7, var6, var5, var4, var3, true);
      this.Method1267(a, 0, 0, var3, var4, var5);
      return a;
   }

   private void Method3600(Kernel a, int[] a, int[] a, int a, int a, boolean a) {
      boolean var8 = false;
      Class193.Method1269();
      float[] var9 = a.getKernelData((float[])null);
      int var10 = a.getWidth();
      int var11 = var10 / 2;
      int var12 = 0;
      if (var12 < a) {
         int var13 = var12 * a;
         int var15 = 0;
         if (var15 < a) {
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            int var21 = a[var13 + var15];
            int var22 = var21 >> 24 & 255;
            int var23 = var21 >> 16 & 255;
            int var24 = var21 >> 8 & 255;
            int var25 = var21 & 255;
            float var26 = 0.0F;
            float var27 = 0.0F;
            float var28 = 0.0F;
            float var29 = 0.0F;
            int var30 = -var11;
            int var32;
            int var33;
            if (var30 <= var11) {
               float var31 = var9[var11 + var30];
               if (var31 != 0.0F) {
                  var32 = var15 + var30;
                  if (0 > var32 || var32 >= a) {
                     var32 = var15;
                  }

                  var33 = a[var13 + var32];
                  int var34 = var33 >> 24 & 255;
                  int var35 = var33 >> 16 & 255;
                  int var36 = var33 >> 8 & 255;
                  int var37 = var33 & 255;
                  int var38 = var22 - var34;
                  if (var38 >= -this.Field3848 && var38 <= this.Field3848) {
                     var19 += var31 * (float)var34;
                     var26 += var31;
                  }

                  var38 = var23 - var35;
                  if (var38 >= -this.Field3848 && var38 <= this.Field3848) {
                     var16 += var31 * (float)var35;
                     var27 += var31;
                  }

                  var38 = var24 - var36;
                  if (var38 >= -this.Field3848 && var38 <= this.Field3848) {
                     var17 += var31 * (float)var36;
                     var28 += var31;
                  }

                  var38 = var25 - var37;
                  if (var38 >= -this.Field3848 && var38 <= this.Field3848) {
                     var18 += var31 * (float)var37;
                     var29 += var31;
                  }
               }

               ++var30;
            }

            var19 = var26 == 0.0F ? (float)var22 : var19 / var26;
            var16 = var27 == 0.0F ? (float)var23 : var16 / var27;
            var17 = var28 == 0.0F ? (float)var24 : var17 / var28;
            var18 = var29 == 0.0F ? (float)var25 : var18 / var29;
            var30 = Class767.Method1687((int)((double)var19 + 0.5));
            int var39 = Class767.Method1687((int)((double)var16 + 0.5));
            var32 = Class767.Method1687((int)((double)var17 + 0.5));
            var33 = Class767.Method1687((int)((double)var18 + 0.5));
            a[var12] = var30 << 24 | var39 << 16 | var32 << 8 | var33;
            int var14 = var12 + a;
            ++var15;
         }

         ++var12;
      }

   }

   public void Method9(int a) {
      this.Field3846 = a;
   }

   public int Method10() {
      return this.Field3846;
   }

   public void Method11(int a) {
      this.Field3847 = a;
   }

   public int Method12() {
      return this.Field3847;
   }

   public void Method13(int a) {
      this.Field3846 = this.Field3847 = a;
   }

   public int Method14() {
      return this.Field3846;
   }

   public void Method15(int a) {
      this.Field3848 = a;
   }

   public int Method16() {
      return this.Field3848;
   }

   public String toString() {
      return "Blur/Smart Blur...";
   }
}
