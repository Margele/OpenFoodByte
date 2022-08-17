package awsl;

import java.awt.image.BufferedImage;

public class Class78 extends Class193 {
   private float Field701 = 10.0F;
   private float Field702 = 2.0F;
   private float Field703 = 255.0F;
   private float Field704 = 0.0F;
   private int Field705 = 5;

   public void Method56(float a) {
      this.Field701 = a;
   }

   public float Method57() {
      return this.Field701;
   }

   public void Method9(int a) {
      this.Field705 = a;
   }

   public int Method10() {
      return this.Field705;
   }

   public void Method58(float a) {
      this.Field702 = a;
   }

   public float Method59() {
      return this.Field702;
   }

   public void Method60(float a) {
      this.Field703 = a;
   }

   public float Method61() {
      return this.Field703;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int a = a.getWidth();
      int a = a.getHeight();
      int a = 1;
      int a = 1;
      int a = 0;
      int a = 0;
      int a = (int)Math.ceil((double)this.Field701);
      int a = true;
      int var10000 = a + a * 2;
      var10000 = a + a * 2;
      int a = a < 32 ? Math.min(128, a + 2 * a) : Math.min(256, a + 2 * a);
      int a = a < 32 ? Math.min(128, a + 2 * a) : Math.min(256, a + 2 * a);
      a = new BufferedImage(a, a, 2);
      if (a < a) {
         a *= 2;
         ++a;
      }

      if (a < a) {
         a *= 2;
         ++a;
      }

      Class592 a = new Class592(Math.max(a, a));
      int[] a = new int[a * a];
      float[][] a = new float[2][a * a];
      float[][] a = new float[2][a * a];
      float[][] a = new float[2][a * a];
      double a = Math.PI / (double)this.Field705;
      double a = 1.0 / Math.cos(a);
      double a = (double)(this.Field701 * this.Field701);
      double a = Math.toRadians((double)this.Field704);
      float a = 0.0F;
      int a = 0;
      int a = 0;
      int a;
      if (a < a) {
         a = 0;
         if (a < a) {
            double a = (double)((float)a - (float)a / 2.0F);
            double a = (double)((float)a - (float)a / 2.0F);
            double a = a * a + a * a;
            double a = a < a ? 1.0 : 0.0;
            if (a != 0.0) {
               a = Math.sqrt(a);
               if (this.Field705 != 0) {
                  double a = Math.atan2(a, a) + a;
                  a = Class776.Method1713(a, a * 2.0) - a;
                  a = Math.cos(a) * a;
               }

               a = 1.0;
               a = a * a < (double)this.Field701 ? 1.0 : 0.0;
            }

            a += (float)a;
            a[0][a] = (float)a;
            a[1][a] = 0.0F;
            ++a;
            ++a;
         }

         ++a;
      }

      int a = 0;
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            a[0][a] /= a;
            a = a + 1;
            a = a + 1;
         }

         a = a + 1;
      }

      a.Method54(a[0], a[1], a, a, true);
      a = -a;
      if (a < a) {
         a = -a;
         if (a < a) {
            int a = 0;
            int a = 0;
            int a = a + a;
            a -= a;
            int a = 0;
            int a = a + a;
            a -= a;
            int a = 0;
            if (a + a > a) {
               a = a - a;
            }

            if (a + a > a) {
               a = a - a;
            }

            a.getRGB(a, a, a, a, a, a * a + a, a);
            a = 0;
            int a = 0;
            int a;
            int a;
            int a;
            int a;
            int a;
            if (a < a) {
               a = a + a;
               if (a > a) {
                  a = a + a - 1;
               }

               a = a * a;
               a = 0;
               if (a < a) {
                  a = a + a;
                  if (a > a) {
                     a = a + a - 1;
                  }

                  a = a + a;
                  a[0][a] = (float)(a[a] >> 24 & 255);
                  float a = (float)(a[a] >> 16 & 255);
                  float a = (float)(a[a] >> 8 & 255);
                  float a = (float)(a[a] & 255);
                  if (a > this.Field703) {
                     a *= this.Field702;
                  }

                  if (a > this.Field703) {
                     a *= this.Field702;
                  }

                  if (a > this.Field703) {
                     a *= this.Field702;
                  }

                  a[1][a] = a;
                  a[0][a] = a;
                  a[1][a] = a;
                  a = a + 1;
                  ++a;
                  ++a;
               }

               ++a;
            }

            a.Method54(a[0], a[1], a, a, true);
            a.Method54(a[0], a[1], a, a, true);
            a = 0;
            int a = 0;
            if (a < a) {
               int a = 0;
               if (a < a) {
                  float a = a[0][a];
                  float a = a[1][a];
                  float a = a[0][a];
                  float a = a[1][a];
                  a[0][a] = a * a - a * a;
                  a[1][a] = a * a + a * a;
                  a = a[0][a];
                  a = a[1][a];
                  a[0][a] = a * a - a * a;
                  a[1][a] = a * a + a * a;
                  a = a + 1;
                  a = a + 1;
               }

               a = a + 1;
            }

            a.Method54(a[0], a[1], a, a, false);
            a.Method54(a[0], a[1], a, a, false);
            a = a >> 1;
            a = a >> 1;
            int a = 0;
            int a = 0;
            if (a < a) {
               a = a ^ a;
               a = a * a;
               int a = 0;
               if (a < a) {
                  int a = a + (a ^ a);
                  int a = (int)a[0][a];
                  int a = (int)a[1][a];
                  int a = (int)a[0][a];
                  int a = (int)a[1][a];
                  if (a > 255) {
                     a = 255;
                  }

                  if (a > 255) {
                     a = 255;
                  }

                  if (a > 255) {
                     a = 255;
                  }

                  int a = a << 24 | a << 16 | a << 8 | a;
                  a = a + 1;
                  a[a] = a;
                  ++a;
               }

               a = a + 1;
            }

            a = a + a;
            a = a + a;
            a = a - 2 * a;
            a = a - 2 * a;
            if (a + a > a) {
               a = a - a;
            }

            if (a + a > a) {
               a = a - a;
            }

            a.setRGB(a, a, a, a, a, a * a + a, a);
            var10000 = a + (a - 2 * a);
         }

         var10000 = a + (a - 2 * a);
      }

      return a;
   }

   public String toString() {
      return "Blur/Lens Blur...";
   }
}
