package awsl;

import java.awt.image.BufferedImage;

public class Class891 extends Class877 {
   public static final int Field3906 = 0;
   public static final int Field3907 = 1;
   public static final int Field3908 = 2;
   private int Field3909;
   private float Field3910;
   private float Field3911;
   private float Field3912;
   private float Field3913;
   private float Field3914;

   public Class891() {
      this(0);
   }

   public Class891(int a) {
      this.Field3909 = a;
      this.Method9(1);
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3910 = (float)a.getWidth();
      this.Field3911 = (float)a.getHeight();
      this.Field3912 = this.Field3910 / 2.0F;
      this.Field3913 = this.Field3911 / 2.0F;
      this.Field3914 = Math.max(this.Field3913, this.Field3912);
      return super.Method62(a, a);
   }

   public void Method13(int a) {
      this.Field3909 = a;
   }

   public int Method14() {
      return this.Field3909;
   }

   private float Method29(float a) {
      return a * a;
   }

   protected void Method3439(int a, int a, float[] a) {
      Class193.Method1270();
      float var10 = 0.0F;
      float var5;
      float var7;
      float var8;
      float var9;
      float var10000;
      switch (this.Field3909) {
         case 0:
            var5 = 0.0F;
            if ((float)a >= this.Field3912) {
               if ((float)a > this.Field3913) {
                  var5 = 3.1415927F - (float)Math.atan((double)(((float)a - this.Field3912) / ((float)a - this.Field3913)));
                  var10 = (float)Math.sqrt((double)(this.Method29((float)a - this.Field3912) + this.Method29((float)a - this.Field3913)));
               }

               if ((float)a < this.Field3913) {
                  var5 = (float)Math.atan((double)(((float)a - this.Field3912) / (this.Field3913 - (float)a)));
                  var10 = (float)Math.sqrt((double)(this.Method29((float)a - this.Field3912) + this.Method29(this.Field3913 - (float)a)));
               }

               var5 = 1.5707964F;
               var10 = (float)a - this.Field3912;
            }

            if ((float)a < this.Field3912) {
               if ((float)a < this.Field3913) {
                  var5 = 6.2831855F - (float)Math.atan((double)((this.Field3912 - (float)a) / (this.Field3913 - (float)a)));
                  var10 = (float)Math.sqrt((double)(this.Method29(this.Field3912 - (float)a) + this.Method29(this.Field3913 - (float)a)));
               }

               if ((float)a > this.Field3913) {
                  var5 = 3.1415927F + (float)Math.atan((double)((this.Field3912 - (float)a) / ((float)a - this.Field3913)));
                  var10 = (float)Math.sqrt((double)(this.Method29(this.Field3912 - (float)a) + this.Method29((float)a - this.Field3913)));
               }

               var5 = 4.712389F;
               var10 = this.Field3912 - (float)a;
            }

            if ((float)a != this.Field3912) {
               var7 = Math.abs(((float)a - this.Field3913) / ((float)a - this.Field3912));
            }

            var7 = 0.0F;
            if (var7 <= this.Field3911 / this.Field3910) {
               if ((float)a == this.Field3912) {
                  var8 = 0.0F;
                  var9 = this.Field3913;
               }

               var8 = this.Field3912;
               var10000 = var7 * var8;
            }

            var9 = this.Field3913;
            var10000 = var9 / var7;
            a[0] = this.Field3910 - 1.0F - (this.Field3910 - 1.0F) / 6.2831855F * var5;
            a[1] = this.Field3911 * var10 / this.Field3914;
         case 1:
            var5 = (float)a / this.Field3910 * 6.2831855F;
            float var11;
            if (var5 >= 4.712389F) {
               var11 = 6.2831855F - var5;
            }

            if (var5 >= 3.1415927F) {
               var11 = var5 - 3.1415927F;
            }

            if (var5 >= 1.5707964F) {
               var11 = 3.1415927F - var5;
            }

            float var6 = (float)Math.tan((double)var5);
            if (var6 != 0.0F) {
               var7 = 1.0F / var6;
            }

            var7 = 0.0F;
            if (var7 <= this.Field3911 / this.Field3910) {
               if (var5 == 0.0F) {
                  var8 = 0.0F;
                  var9 = this.Field3913;
               }

               var8 = this.Field3912;
               var10000 = var7 * var8;
            }

            var9 = this.Field3913;
            var10000 = var9 / var7;
            var10 = this.Field3914 * ((float)a / this.Field3911);
            float var12 = -var10 * (float)Math.sin((double)var5);
            float var13 = var10 * (float)Math.cos((double)var5);
            if (var5 >= 4.712389F) {
               a[0] = this.Field3912 - var12;
               a[1] = this.Field3913 - var13;
            }

            if ((double)var5 >= Math.PI) {
               a[0] = this.Field3912 - var12;
               a[1] = this.Field3913 + var13;
            }

            if ((double)var5 >= 1.5707963267948966) {
               a[0] = this.Field3912 + var12;
               a[1] = this.Field3913 + var13;
            }

            a[0] = this.Field3912 + var12;
            a[1] = this.Field3913 - var13;
         case 2:
            float var14 = (float)a - this.Field3912;
            float var15 = (float)a - this.Field3913;
            float var16 = var14 * var14 + var15 * var15;
            a[0] = this.Field3912 + this.Field3912 * this.Field3912 * var14 / var16;
            a[1] = this.Field3913 + this.Field3913 * this.Field3913 * var15 / var16;
         default:
      }
   }

   public String toString() {
      return "Distort/Polar Coordinates...";
   }
}
