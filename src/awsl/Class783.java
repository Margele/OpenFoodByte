package awsl;

import java.awt.Rectangle;
import java.util.Random;

public class Class783 extends Class798 {
   private float Field3521 = 32.0F;
   private float Field3522 = 0.0F;
   private int Field3523 = 10;
   private float Field3524 = 1.0F;
   private float Field3525 = 1.0F;
   private float Field3526 = 0.0F;
   private float Field3527 = 0.0F;
   private int Field3528 = 2;
   private int Field3529 = -8806401;
   private float Field3530;
   private float Field3531;

   public void Method56(float a) {
      this.Field3521 = a;
   }

   public float Method57() {
      return this.Field3521;
   }

   public void Method9(int a) {
      this.Field3523 = a;
   }

   public int Method10() {
      return this.Field3523;
   }

   public void Method58(float a) {
      this.Field3525 = a;
   }

   public float Method59() {
      return this.Field3525;
   }

   public void Method60(float a) {
      this.Field3524 = a;
   }

   public float Method61() {
      return this.Field3524;
   }

   public void Method164(float a) {
      this.Field3526 = a;
   }

   public float Method165() {
      return this.Field3526;
   }

   public void Method166(float a) {
      this.Field3527 = a;
   }

   public float Method167() {
      return this.Field3527;
   }

   public void Method11(int a) {
      this.Field3528 = a;
   }

   public int Method12() {
      return this.Field3528;
   }

   public void Method13(int a) {
      this.Field3529 = a;
   }

   public int Method14() {
      return this.Field3529;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Random var6 = new Random(0L);
      this.Field3530 = (float)Math.sin(0.1);
      this.Field3531 = (float)Math.cos(0.1);
      int var7 = this.Field3569.width;
      int var8 = this.Field3569.height;
      Class193.Method1269();
      int var9 = a.width;
      int var10 = a.height;
      int var11 = 0;
      int[] var12 = new int[var9 * var10];
      int var13 = 0;
      if (var13 < var10) {
         int var14 = 0;
         if (var14 < var9) {
            var12[var11++] = this.Field3529;
            ++var14;
         }

         ++var13;
      }

      var13 = this.Field3523 / this.Field3528;
      byte var36 = 1;
      float var37 = 1.0F / this.Field3521;
      float var15 = 0.95F;
      boolean var35 = false;
      int var16 = 0;
      if (var16 < var10) {
         int var17 = 0;
         if (var17 < var9) {
            int var18 = 0;
            if (var18 < this.Field3528) {
               float var19 = (float)var17 + var6.nextFloat();
               float var20 = (float)var16 + var6.nextFloat();
               float var21 = var19 * var37;
               float var22 = var20 * var37;
               float var25 = 0.1F + this.Field3524;
               float var23 = this.Method20(var21 - var15, var22) - this.Method20(var21 + var15, var22);
               float var24 = this.Method20(var21, var22 + var15) - this.Method20(var21, var22 - var15);
               float var27;
               int var30;
               int var31;
               int var32;
               if (this.Field3526 > 0.0F) {
                  int var26 = 0;
                  if (var26 < 3) {
                     var27 = 1.0F + (float)var26 * this.Field3526;
                     float var28 = var19 + this.Field3521 * var25 * var23 * var27;
                     float var29 = var20 + this.Field3521 * var25 * var24 * var27;
                     if (!(var28 < 0.0F) && !(var28 >= (float)(var9 - 1)) && !(var29 < 0.0F) && !(var29 >= (float)(var10 - 1))) {
                        var30 = (int)var29 * var9 + (int)var28;
                        var31 = var12[var30];
                        var32 = var31 >> 16 & 255;
                        int var33 = var31 >> 8 & 255;
                        int var34 = var31 & 255;
                        if (var26 == 2) {
                           var32 += var36;
                        }

                        if (var26 == 1) {
                           var33 += var36;
                        }

                        var34 += var36;
                        if (var32 > 255) {
                           var32 = 255;
                        }

                        if (var33 > 255) {
                           var33 = 255;
                        }

                        if (var34 > 255) {
                           var34 = 255;
                        }

                        var12[var30] = -16777216 | var32 << 16 | var33 << 8 | var34;
                     }

                     ++var26;
                  }
               }

               float var38 = var19 + this.Field3521 * var25 * var23;
               var27 = var20 + this.Field3521 * var25 * var24;
               if (!(var38 < 0.0F) && !(var38 >= (float)(var9 - 1)) && !(var27 < 0.0F) && !(var27 >= (float)(var10 - 1))) {
                  int var39 = (int)var27 * var9 + (int)var38;
                  int var40 = var12[var39];
                  var30 = var40 >> 16 & 255;
                  var31 = var40 >> 8 & 255;
                  var32 = var40 & 255;
                  var30 += var36;
                  var31 += var36;
                  var32 += var36;
                  if (var30 > 255) {
                     var30 = 255;
                  }

                  if (var31 > 255) {
                     var31 = 255;
                  }

                  if (var32 > 255) {
                     var32 = 255;
                  }

                  var12[var39] = -16777216 | var30 << 16 | var31 << 8 | var32;
               }

               ++var18;
            }

            ++var17;
         }

         ++var16;
      }

      return var12;
   }

   private static int Method900(int a, float a) {
      int var2 = a >> 16 & 255;
      int var3 = a >> 8 & 255;
      int var4 = a & 255;
      var2 = (int)((float)var2 + a);
      var3 = (int)((float)var3 + a);
      var4 = (int)((float)var4 + a);
      if (var2 > 255) {
         var2 = 255;
      }

      if (var3 > 255) {
         var3 = 255;
      }

      if (var4 > 255) {
         var4 = 255;
      }

      return -16777216 | var2 << 16 | var3 << 8 | var4;
   }

   private static int Method901(int a, float a, int a) {
      int var3 = a >> 16 & 255;
      int var4 = a >> 8 & 255;
      int var5 = a & 255;
      if (a == 2) {
         var3 = (int)((float)var3 + a);
      } else if (a == 1) {
         var4 = (int)((float)var4 + a);
      } else {
         var5 = (int)((float)var5 + a);
      }

      if (var3 > 255) {
         var3 = 255;
      }

      if (var4 > 255) {
         var4 = 255;
      }

      if (var5 > 255) {
         var5 = 255;
      }

      return -16777216 | var3 << 16 | var4 << 8 | var5;
   }

   private static float Method154(float a, float a, float a, float a) {
      float var4 = 0.0F;
      float var6 = 2.0F;
      float var7 = 1.0F;
      a += 371.0F;
      a += 529.0F;

      for(int var8 = 0; var8 < (int)a; ++var8) {
         var4 += Class598.Method158(a, a, a) / var7;
         a *= var6;
         a *= var6;
         var7 *= 2.0F;
      }

      float var5 = a - (float)((int)a);
      if (var5 != 0.0F) {
         var4 += var5 * Class598.Method158(a, a, a) / var7;
      }

      return var4;
   }

   private float Method20(float a, float a) {
      float var3 = this.Field3530 * a + this.Field3531 * this.Field3527;
      float var4 = this.Field3531 * a - this.Field3531 * this.Field3527;
      float var5 = (double)this.Field3525 == 0.0 ? Class598.Method158(var3, a, var4) : Method154(var3, a, var4, this.Field3525);
      return var5;
   }

   public String toString() {
      return "Texture/Caustics...";
   }
}
