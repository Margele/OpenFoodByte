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

   protected int[] Method714(int a, int a1, int[] a2, Rectangle a) {
      Random a = new Random(0L);
      this.Field3530 = (float)Math.sin(0.1);
      this.Field3531 = (float)Math.cos(0.1);
      int a = this.Field3569.width;
      int var8 = this.Field3569.height;
      Class193.Method1269();
      int a = a.width;
      int a = a.height;
      int a = 0;
      int[] a = new int[a * a];
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            a[a++] = this.Field3529;
            ++a;
         }

         ++a;
      }

      a = this.Field3523 / this.Field3528;
      int a = 1;
      float a = 1.0F / this.Field3521;
      float a = 0.95F;
      int a = false;
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            int a = 0;
            if (a < this.Field3528) {
               float a = (float)a + a.nextFloat();
               float a = (float)a + a.nextFloat();
               float a = a * a;
               float a = a * a;
               float a = 0.1F + this.Field3524;
               float a = this.Method20(a - a, a) - this.Method20(a + a, a);
               float a = this.Method20(a, a + a) - this.Method20(a, a - a);
               float a;
               int a;
               int a;
               int a;
               if (this.Field3526 > 0.0F) {
                  int a = 0;
                  if (a < 3) {
                     a = 1.0F + (float)a * this.Field3526;
                     float a = a + this.Field3521 * a * a * a;
                     float a = a + this.Field3521 * a * a * a;
                     if (!(a < 0.0F) && !(a >= (float)(a - 1)) && !(a < 0.0F) && !(a >= (float)(a - 1))) {
                        a = (int)a * a + (int)a;
                        a = a[a];
                        a = a >> 16 & 255;
                        int a = a >> 8 & 255;
                        int a = a & 255;
                        if (a == 2) {
                           a += a;
                        }

                        if (a == 1) {
                           a += a;
                        }

                        a += a;
                        if (a > 255) {
                           a = 255;
                        }

                        if (a > 255) {
                           a = 255;
                        }

                        if (a > 255) {
                           a = 255;
                        }

                        a[a] = -16777216 | a << 16 | a << 8 | a;
                     }

                     ++a;
                  }
               }

               float a = a + this.Field3521 * a * a;
               a = a + this.Field3521 * a * a;
               if (!(a < 0.0F) && !(a >= (float)(a - 1)) && !(a < 0.0F) && !(a >= (float)(a - 1))) {
                  int a = (int)a * a + (int)a;
                  int a = a[a];
                  a = a >> 16 & 255;
                  a = a >> 8 & 255;
                  a = a & 255;
                  a += a;
                  a += a;
                  a += a;
                  if (a > 255) {
                     a = 255;
                  }

                  if (a > 255) {
                     a = 255;
                  }

                  if (a > 255) {
                     a = 255;
                  }

                  a[a] = -16777216 | a << 16 | a << 8 | a;
               }

               ++a;
            }

            ++a;
         }

         ++a;
      }

      return a;
   }

   private static int Method900(int a, float a) {
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a = (int)((float)a + a);
      a = (int)((float)a + a);
      a = (int)((float)a + a);
      if (a > 255) {
         a = 255;
      }

      if (a > 255) {
         a = 255;
      }

      if (a > 255) {
         a = 255;
      }

      return -16777216 | a << 16 | a << 8 | a;
   }

   private static int Method901(int a, float a, int a) {
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      if (a == 2) {
         a = (int)((float)a + a);
      } else if (a == 1) {
         a = (int)((float)a + a);
      } else {
         a = (int)((float)a + a);
      }

      if (a > 255) {
         a = 255;
      }

      if (a > 255) {
         a = 255;
      }

      if (a > 255) {
         a = 255;
      }

      return -16777216 | a << 16 | a << 8 | a;
   }

   private static float Method154(float a, float a, float a, float a) {
      float a = 0.0F;
      float a = 2.0F;
      float a = 1.0F;
      a += 371.0F;
      a += 529.0F;

      for(int a = 0; a < (int)a; ++a) {
         a += Class598.Method158(a, a, a) / a;
         a *= a;
         a *= a;
         a *= 2.0F;
      }

      float a = a - (float)((int)a);
      if (a != 0.0F) {
         a += a * Class598.Method158(a, a, a) / a;
      }

      return a;
   }

   private float Method20(float a, float a) {
      float a = this.Field3530 * a + this.Field3531 * this.Field3527;
      float a = this.Field3531 * a - this.Field3531 * this.Field3527;
      float a = (double)this.Field3525 == 0.0 ? Class598.Method158(a, a, a) : Method154(a, a, a, this.Field3525);
      return a;
   }

   public String toString() {
      return "Texture/Caustics...";
   }
}
