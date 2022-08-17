package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

public class Class187 extends Class183 {
   protected float Field1150;
   protected Kernel Field1151;

   public Class187() {
      this(2.0F);
   }

   public Class187(float a) {
      this.Method56(a);
   }

   public void Method56(float a) {
      this.Field1150 = a;
      this.Field1151 = Method1294(a);
   }

   public float Method57() {
      return this.Field1150;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] var5 = new int[var3 * var4];
      int[] var6 = new int[var3 * var4];
      a.getRGB(0, 0, var3, var4, var5, 0, var3);
      if (this.Field1150 > 0.0F) {
         Method1293(this.Field1151, var5, var6, var3, var4, this.Field1139, this.Field1139 && this.Field1140, false, Field1136);
         Method1293(this.Field1151, var6, var5, var4, var3, this.Field1139, false, this.Field1139 && this.Field1140, Field1136);
      }

      a.setRGB(0, 0, var3, var4, var5, 0, var3);
      return a;
   }

   public static void Method1293(Kernel a, int[] a, int[] a, int a, int a, boolean a, boolean a, boolean a, int a) {
      Class193.Method1269();
      float[] var10 = a.getKernelData((float[])null);
      int var11 = a.getWidth();
      int var12 = var11 / 2;
      int var13 = 0;
      if (var13 < a) {
         int var15 = var13 * a;
         int var16 = 0;
         if (var16 < a) {
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;
            int var22 = -var12;
            int var24;
            int var25;
            if (var22 <= var12) {
               float var23 = var10[var12 + var22];
               if (var23 != 0.0F) {
                  var24 = var16 + var22;
                  if (a == Field1136) {
                     var24 = 0;
                  }

                  if (a == Field1137) {
                     var24 = (var16 + a) % a;
                     if (var24 >= a) {
                        if (a == Field1136) {
                           var24 = a - 1;
                        }

                        if (a == Field1137) {
                           var24 = (var16 + a) % a;
                        }
                     }
                  }

                  var25 = a[var15 + var24];
                  int var26 = var25 >> 24 & 255;
                  int var27 = var25 >> 16 & 255;
                  int var28 = var25 >> 8 & 255;
                  int var29 = var25 & 255;
                  float var30 = (float)var26 * 0.003921569F;
                  var27 = (int)((float)var27 * var30);
                  var28 = (int)((float)var28 * var30);
                  var29 = (int)((float)var29 * var30);
                  var20 += var23 * (float)var26;
                  var17 += var23 * (float)var27;
                  var18 += var23 * (float)var28;
                  var19 += var23 * (float)var29;
               }

               ++var22;
            }

            if (var20 != 0.0F && var20 != 255.0F) {
               float var31 = 255.0F / var20;
               var17 *= var31;
               var18 *= var31;
               var19 *= var31;
            }

            var22 = Class767.Method1687((int)((double)var20 + 0.5));
            int var32 = Class767.Method1687((int)((double)var17 + 0.5));
            var24 = Class767.Method1687((int)((double)var18 + 0.5));
            var25 = Class767.Method1687((int)((double)var19 + 0.5));
            a[var13] = var22 << 24 | var32 << 16 | var24 << 8 | var25;
            int var14 = var13 + a;
            ++var16;
         }

         ++var13;
      }

   }

   public static Kernel Method1294(float a) {
      int var1 = (int)Math.ceil((double)a);
      int var2 = var1 * 2 + 1;
      float[] var3 = new float[var2];
      float var4 = a / 3.0F;
      float var5 = 2.0F * var4 * var4;
      float var6 = 6.2831855F * var4;
      float var7 = (float)Math.sqrt((double)var6);
      float var8 = a * a;
      float var9 = 0.0F;
      int var10 = 0;

      int var11;
      for(var11 = -var1; var11 <= var1; ++var11) {
         float var12 = (float)(var11 * var11);
         if (var12 > var8) {
            var3[var10] = 0.0F;
         } else {
            var3[var10] = (float)Math.exp((double)(-var12 / var5)) / var7;
         }

         var9 += var3[var10];
         ++var10;
      }

      for(var11 = 0; var11 < var2; ++var11) {
         var3[var11] /= var9;
      }

      return new Kernel(var2, 1, var3);
   }

   public String toString() {
      return "Blur/Gaussian Blur...";
   }
}
