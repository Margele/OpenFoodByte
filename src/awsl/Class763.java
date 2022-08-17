package awsl;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class Class763 extends Class798 {
   public static final int Field3355 = 0;
   public static final int Field3356 = 1;
   public static final int Field3357 = 0;
   public static final int Field3358 = 1;
   public static final int Field3359 = 2;
   public static final int Field3360 = 3;
   private float Field3361 = 1.0F;
   private float Field3362 = 5.0F;
   private float Field3363 = 10000.0F;
   private int Field3364 = 0;
   private int Field3365 = 0;
   private Class594 Field3366;
   private BufferedImage Field3367;
   private int[] Field3368;
   private int Field3369 = 1;
   private int Field3370 = 1;
   private Class590 Field3371 = new Class590();
   private Class590 Field3372 = new Class590();
   private Class590 Field3373 = new Class590();
   private Class600 Field3374 = new Class600();
   private Class600 Field3375 = new Class600();
   private Class600 Field3376 = new Class600();
   private Class590 Field3377 = new Class590();
   private Class590 Field3378 = new Class590();
   protected static final float Field3379 = 0.003921569F;

   public void Method18(Class594 a) {
      this.Field3366 = a;
   }

   public Class594 Method19() {
      return this.Field3366;
   }

   public void Method56(float a) {
      this.Field3361 = a;
   }

   public float Method57() {
      return this.Field3361;
   }

   public void Method58(float a) {
      this.Field3362 = a;
   }

   public float Method59() {
      return this.Field3362;
   }

   public void Method1271(BufferedImage a) {
      this.Field3367 = a;
      this.Field3369 = a.getWidth();
      this.Field3370 = a.getHeight();
      this.Field3368 = this.Method104(a, 0, 0, this.Field3369, this.Field3370, (int[])null);
   }

   public BufferedImage Method1272() {
      return this.Field3367;
   }

   public void Method9(int a) {
      this.Field3365 = a;
   }

   public int Method10() {
      return this.Field3365;
   }

   protected void Method1777(Class600 a, int a) {
      a.Method113((float)(a >> 16 & 255) * 0.003921569F, (float)(a >> 8 & 255) * 0.003921569F, (float)(a & 255) * 0.003921569F, (float)(a >> 24 & 255) * 0.003921569F);
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int var6 = 0;
      Class193.Method1270();
      int[] var7 = new int[a * a];
      float var8 = Math.abs(6.0F * this.Field3361);
      boolean var9 = this.Field3361 < 0.0F;
      Class590 var10 = new Class590(0.0F, 0.0F, 0.0F);
      Class590 var11 = new Class590((float)a / 2.0F, (float)a / 2.0F, this.Field3363);
      Class590 var12 = new Class590();
      Class600 var13 = new Class600();
      Class594 var14 = this.Field3366;
      if (this.Field3365 != 0 && this.Field3365 != 1 && this.Field3365 != 2) {
         ;
      }

      if (this.Field3362 != 0.0F) {
         int var15 = a;
         int var16 = a;
         int[] var17 = a;
         if (this.Field3365 == 2 && this.Field3366 instanceof Class596) {
            Class596 var18 = (Class596)this.Field3366;
            var15 = var18.Method12();
            var16 = var18.Method14();
            var17 = var18.Method86();
         }

         Kernel var32 = Class187.Method1294(this.Field3362);
         int[] var19 = new int[var15 * var16];
         int[] var20 = new int[var15 * var16];
         Class187.Method1293(var32, var17, var19, var15, var16, true, false, false, Class183.Field1136);
         Class187.Method1293(var32, var19, var20, var16, var15, true, false, false, Class183.Field1136);
         new Class596(var20, var15, var16, 1, this.Field3365 == 1);
      }

      Class596 var28 = new Class596(a, a, a, 1, this.Field3365 == 1);
      Class590 var29 = new Class590();
      Class590 var30 = new Class590();
      Class590 var31 = new Class590();
      int var33 = 0;
      if (var33 < a) {
         float var34 = (float)var33;
         var10.Field2776 = (float)var33;
         int var35 = 0;
         if (var35 < a) {
            float var21 = (float)var35;
            int var22;
            if (this.Field3365 != 3) {
               var22 = 0;
               var12.Field2775 = var12.Field2776 = var12.Field2777 = 0.0F;
               float var23 = var8 * var28.Method20(var21, var34);
               float var24 = var8 * var28.Method20(var21 - 1.0F, var34) - var23;
               float var25 = var8 * var28.Method20(var21, var34 - 1.0F) - var23;
               float var26 = var35 < a - 1 ? var8 * var28.Method20(var21 + 1.0F, var34) - var23 : -2.0F;
               float var27 = var33 < a - 1 ? var8 * var28.Method20(var21, var34 + 1.0F) - var23 : -2.0F;
               if (var24 != -2.0F && var27 != -2.0F) {
                  var29.Field2775 = -1.0F;
                  var29.Field2776 = 0.0F;
                  var29.Field2777 = var24;
                  var30.Field2775 = 0.0F;
                  var30.Field2776 = 1.0F;
                  var30.Field2777 = var27;
                  var31.Method23(var29, var30);
                  var31.Method25();
                  if ((double)var31.Field2777 < 0.0) {
                     var31.Field2777 = -var31.Field2777;
                  }

                  var12.Method323(var31);
                  ++var22;
               }

               if (var24 != -2.0F && var25 != -2.0F) {
                  var29.Field2775 = -1.0F;
                  var29.Field2776 = 0.0F;
                  var29.Field2777 = var24;
                  var30.Field2775 = 0.0F;
                  var30.Field2776 = -1.0F;
                  var30.Field2777 = var25;
                  var31.Method23(var29, var30);
                  var31.Method25();
                  if ((double)var31.Field2777 < 0.0) {
                     var31.Field2777 = -var31.Field2777;
                  }

                  var12.Method323(var31);
                  ++var22;
               }

               if (var25 != -2.0F && var26 != -2.0F) {
                  var29.Field2775 = 0.0F;
                  var29.Field2776 = -1.0F;
                  var29.Field2777 = var25;
                  var30.Field2775 = 1.0F;
                  var30.Field2776 = 0.0F;
                  var30.Field2777 = var26;
                  var31.Method23(var29, var30);
                  var31.Method25();
                  if ((double)var31.Field2777 < 0.0) {
                     var31.Field2777 = -var31.Field2777;
                  }

                  var12.Method323(var31);
                  ++var22;
               }

               if (var26 != -2.0F && var27 != -2.0F) {
                  var29.Field2775 = 1.0F;
                  var29.Field2776 = 0.0F;
                  var29.Field2777 = var26;
                  var30.Field2775 = 0.0F;
                  var30.Field2776 = 1.0F;
                  var30.Field2777 = var27;
                  var31.Method23(var29, var30);
                  var31.Method25();
                  if ((double)var31.Field2777 < 0.0) {
                     var31.Field2777 = -var31.Field2777;
                  }

                  var12.Method323(var31);
                  ++var22;
               }

               var12.Field2775 /= (float)var22;
               var12.Field2776 /= (float)var22;
               var12.Field2777 /= (float)var22;
            }

            var12.Field2775 = -var12.Field2775;
            var12.Field2776 = -var12.Field2776;
            var10.Field2775 = (float)var35;
            if (var12.Field2777 >= 0.0F) {
               if (this.Field3367 != null) {
                  this.Field3378.Method316(var11);
                  this.Field3378.Method325(var10);
                  this.Field3378.Method25();
                  this.Field3377.Method316(var12);
                  this.Field3377.Method25();
                  this.Field3377.Method322(2.0F * this.Field3377.Method22(this.Field3378));
                  this.Field3377.Method325(this.Field3372);
                  this.Field3377.Method25();
                  this.Method1777(var13, this.Method1778(var12, a, a, a));
                  var22 = a[var6] & -16777216;
                  int var36 = (int)(var13.Field2813 * 255.0F) << 16 | (int)(var13.Field2814 * 255.0F) << 8 | (int)(var13.Field2815 * 255.0F);
                  var7[var6++] = var22 | var36;
               }

               var7[var6++] = 0;
            }

            var7[var6++] = 0;
            ++var35;
         }

         ++var33;
      }

      return var7;
   }

   private int Method1778(Class590 a, int[] a, int a, int a) {
      if (this.Field3367 != null) {
         float var5 = 0.5F * (1.0F + a.Field2775);
         float var6 = 0.5F * (1.0F + a.Field2776);
         var5 = Class776.Method1711(var5 * (float)this.Field3369, 0.0F, (float)(this.Field3369 - 1));
         var6 = Class776.Method1711(var6 * (float)this.Field3370, 0.0F, (float)(this.Field3370 - 1));
         int var7 = (int)var5;
         int var8 = (int)var6;
         float var9 = var5 - (float)var7;
         float var10 = var6 - (float)var8;
         int var11 = this.Field3369 * var8 + var7;
         int var12 = var7 == this.Field3369 - 1 ? 0 : 1;
         int var13 = var8 == this.Field3370 - 1 ? 0 : this.Field3369;
         return Class776.Method1720(var9, var10, this.Field3368[var11], this.Field3368[var11 + var12], this.Field3368[var11 + var13], this.Field3368[var11 + var12 + var13]);
      } else {
         return 0;
      }
   }

   public String toString() {
      return "Stylize/Shade...";
   }
}
