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
      float a = 0.0F;
      float a;
      float a;
      float a;
      float a;
      float var10000;
      switch (this.Field3909) {
         case 0:
            a = 0.0F;
            if ((float)a >= this.Field3912) {
               if ((float)a > this.Field3913) {
                  a = 3.1415927F - (float)Math.atan((double)(((float)a - this.Field3912) / ((float)a - this.Field3913)));
                  a = (float)Math.sqrt((double)(this.Method29((float)a - this.Field3912) + this.Method29((float)a - this.Field3913)));
               }

               if ((float)a < this.Field3913) {
                  a = (float)Math.atan((double)(((float)a - this.Field3912) / (this.Field3913 - (float)a)));
                  a = (float)Math.sqrt((double)(this.Method29((float)a - this.Field3912) + this.Method29(this.Field3913 - (float)a)));
               }

               a = 1.5707964F;
               a = (float)a - this.Field3912;
            }

            if ((float)a < this.Field3912) {
               if ((float)a < this.Field3913) {
                  a = 6.2831855F - (float)Math.atan((double)((this.Field3912 - (float)a) / (this.Field3913 - (float)a)));
                  a = (float)Math.sqrt((double)(this.Method29(this.Field3912 - (float)a) + this.Method29(this.Field3913 - (float)a)));
               }

               if ((float)a > this.Field3913) {
                  a = 3.1415927F + (float)Math.atan((double)((this.Field3912 - (float)a) / ((float)a - this.Field3913)));
                  a = (float)Math.sqrt((double)(this.Method29(this.Field3912 - (float)a) + this.Method29((float)a - this.Field3913)));
               }

               a = 4.712389F;
               a = this.Field3912 - (float)a;
            }

            if ((float)a != this.Field3912) {
               a = Math.abs(((float)a - this.Field3913) / ((float)a - this.Field3912));
            }

            a = 0.0F;
            if (a <= this.Field3911 / this.Field3910) {
               if ((float)a == this.Field3912) {
                  a = 0.0F;
                  a = this.Field3913;
               }

               a = this.Field3912;
               var10000 = a * a;
            }

            a = this.Field3913;
            var10000 = a / a;
            a[0] = this.Field3910 - 1.0F - (this.Field3910 - 1.0F) / 6.2831855F * a;
            a[1] = this.Field3911 * a / this.Field3914;
         case 1:
            a = (float)a / this.Field3910 * 6.2831855F;
            float a;
            if (a >= 4.712389F) {
               a = 6.2831855F - a;
            }

            if (a >= 3.1415927F) {
               a = a - 3.1415927F;
            }

            if (a >= 1.5707964F) {
               a = 3.1415927F - a;
            }

            float a = (float)Math.tan((double)a);
            if (a != 0.0F) {
               a = 1.0F / a;
            }

            a = 0.0F;
            if (a <= this.Field3911 / this.Field3910) {
               if (a == 0.0F) {
                  a = 0.0F;
                  a = this.Field3913;
               }

               a = this.Field3912;
               var10000 = a * a;
            }

            a = this.Field3913;
            var10000 = a / a;
            a = this.Field3914 * ((float)a / this.Field3911);
            float a = -a * (float)Math.sin((double)a);
            float a = a * (float)Math.cos((double)a);
            if (a >= 4.712389F) {
               a[0] = this.Field3912 - a;
               a[1] = this.Field3913 - a;
            }

            if ((double)a >= Math.PI) {
               a[0] = this.Field3912 - a;
               a[1] = this.Field3913 + a;
            }

            if ((double)a >= 1.5707963267948966) {
               a[0] = this.Field3912 + a;
               a[1] = this.Field3913 + a;
            }

            a[0] = this.Field3912 + a;
            a[1] = this.Field3913 - a;
         case 2:
            float a = (float)a - this.Field3912;
            float a = (float)a - this.Field3913;
            float a = a * a + a * a;
            a[0] = this.Field3912 + this.Field3912 * this.Field3912 * a / a;
            a[1] = this.Field3913 + this.Field3913 * this.Field3913 * a / a;
         default:
      }
   }

   public String toString() {
      return "Distort/Polar Coordinates...";
   }
}
