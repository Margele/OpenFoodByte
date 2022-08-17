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
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = new int[a * a];
      int[] a = new int[a * a];
      a.getRGB(0, 0, a, a, a, 0, a);
      if (this.Field1150 > 0.0F) {
         Method1293(this.Field1151, a, a, a, a, this.Field1139, this.Field1139 && this.Field1140, false, Field1136);
         Method1293(this.Field1151, a, a, a, a, this.Field1139, false, this.Field1139 && this.Field1140, Field1136);
      }

      a.setRGB(0, 0, a, a, a, 0, a);
      return a;
   }

   public static void Method1293(Kernel a, int[] a, int[] a, int a, int a, boolean a5, boolean a6, boolean a7, int a) {
      Class193.Method1269();
      float[] a = a.getKernelData((float[])null);
      int a = a.getWidth();
      int a = a / 2;
      int a = 0;
      if (a < a) {
         int a = a * a;
         int a = 0;
         if (a < a) {
            float a = 0.0F;
            float a = 0.0F;
            float a = 0.0F;
            float a = 0.0F;
            int a = -a;
            int a;
            int a;
            if (a <= a) {
               float a = a[a + a];
               if (a != 0.0F) {
                  a = a + a;
                  if (a == Field1136) {
                     a = 0;
                  }

                  if (a == Field1137) {
                     a = (a + a) % a;
                     if (a >= a) {
                        if (a == Field1136) {
                           a = a - 1;
                        }

                        if (a == Field1137) {
                           a = (a + a) % a;
                        }
                     }
                  }

                  a = a[a + a];
                  int a = a >> 24 & 255;
                  int a = a >> 16 & 255;
                  int a = a >> 8 & 255;
                  int a = a & 255;
                  float a = (float)a * 0.003921569F;
                  a = (int)((float)a * a);
                  a = (int)((float)a * a);
                  a = (int)((float)a * a);
                  a += a * (float)a;
                  a += a * (float)a;
                  a += a * (float)a;
                  a += a * (float)a;
               }

               ++a;
            }

            if (a != 0.0F && a != 255.0F) {
               float a = 255.0F / a;
               a *= a;
               a *= a;
               a *= a;
            }

            a = Class767.Method1687((int)((double)a + 0.5));
            int a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            a[a] = a << 24 | a << 16 | a << 8 | a;
            int a = a + a;
            ++a;
         }

         ++a;
      }

   }

   public static Kernel Method1294(float a) {
      int a = (int)Math.ceil((double)a);
      int a = a * 2 + 1;
      float[] a = new float[a];
      float a = a / 3.0F;
      float a = 2.0F * a * a;
      float a = 6.2831855F * a;
      float a = (float)Math.sqrt((double)a);
      float a = a * a;
      float a = 0.0F;
      int a = 0;

      int a;
      for(a = -a; a <= a; ++a) {
         float a = (float)(a * a);
         if (a > a) {
            a[a] = 0.0F;
         } else {
            a[a] = (float)Math.exp((double)(-a / a)) / a;
         }

         a += a[a];
         ++a;
      }

      for(a = 0; a < a; ++a) {
         a[a] /= a;
      }

      return new Kernel(a, 1, a);
   }

   public String toString() {
      return "Blur/Gaussian Blur...";
   }
}
