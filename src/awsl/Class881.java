package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

public class Class881 extends Class193 {
   private int Field3846 = 5;
   private int Field3847 = 5;
   private int Field3848 = 10;

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = new int[a * a];
      int[] a = new int[a * a];
      this.Method104(a, 0, 0, a, a, a);
      Kernel a = Class187.Method1294((float)this.Field3846);
      this.Method3600(a, a, a, a, a, true);
      this.Method3600(a, a, a, a, a, true);
      this.Method1267(a, 0, 0, a, a, a);
      return a;
   }

   private void Method3600(Kernel a, int[] a, int[] a, int a, int a, boolean a5) {
      boolean var8 = false;
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
            int a = a[a + a];
            int a = a >> 24 & 255;
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
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
                  if (0 > a || a >= a) {
                     a = a;
                  }

                  a = a[a + a];
                  int a = a >> 24 & 255;
                  int a = a >> 16 & 255;
                  int a = a >> 8 & 255;
                  int a = a & 255;
                  int a = a - a;
                  if (a >= -this.Field3848 && a <= this.Field3848) {
                     a += a * (float)a;
                     a += a;
                  }

                  a = a - a;
                  if (a >= -this.Field3848 && a <= this.Field3848) {
                     a += a * (float)a;
                     a += a;
                  }

                  a = a - a;
                  if (a >= -this.Field3848 && a <= this.Field3848) {
                     a += a * (float)a;
                     a += a;
                  }

                  a = a - a;
                  if (a >= -this.Field3848 && a <= this.Field3848) {
                     a += a * (float)a;
                     a += a;
                  }
               }

               ++a;
            }

            a = a == 0.0F ? (float)a : a / a;
            a = a == 0.0F ? (float)a : a / a;
            a = a == 0.0F ? (float)a : a / a;
            a = a == 0.0F ? (float)a : a / a;
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
