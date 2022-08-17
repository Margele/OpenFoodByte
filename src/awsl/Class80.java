package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class80 extends Class193 {
   private void Method85(int[] a) {
      for(int a = 0; a < a.length; ++a) {
         int a = a[a];
         int a = a >> 16 & 255;
         int a = a >> 8 & 255;
         int a = a & 255;
         a[a] = (a + a + a) / 3;
      }

   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = null;
      int[] a = null;
      int[] a = null;
      int[] a = new int[a];
      int[] a = this.Method104(a, 0, 0, a, 1, (int[])a);
      int[] a = this.Method104(a, 0, 0, a, 1, (int[])a);
      this.Method85(a);
      this.Method85(a);
      int a = 0;
      int a;
      int a;
      if (a < a) {
         if (a < a - 1) {
            a = this.Method104(a, 0, a + 1, a, 1, a);
            this.Method85(a);
         }

         a[0] = a[a - 1] = -16777216;
         a = 1;
         if (a < a - 1) {
            a = a[a - 1];
            int a = a[a];
            int a = a[a];
            int a = a[a + 1];
            int a = a[a];
            int a = Math.max(Math.max(a, a), Math.max(a, a));
            int a = Math.min(Math.min(a, a), Math.min(a, a));
            int a = (int)(0.5F * (float)Math.max(a - a, a - a));
            int a = a[a - 1] + a[a] + a[a + 1] + a[a - 1] - 8 * a[a] + a[a + 1] + a[a - 1] + a[a] + a[a + 1] > 0 ? a : 128 + a;
            a[a] = a;
            ++a;
         }

         this.Method1267(a, 0, a, a, 1, a);
         int[] a = a;
         a = a;
         a = a;
         a = a;
         ++a;
      }

      a = this.Method104(a, 0, 0, a, 1, a);
      a = this.Method104(a, 0, 0, a, 1, a);
      int a = 0;
      if (a < a) {
         if (a < a - 1) {
            a = this.Method104(a, 0, a + 1, a, 1, a);
         }

         a[0] = a[a - 1] = -16777216;
         int a = 1;
         if (a < a - 1) {
            a = a[a];
            a = a > 128 || a[a - 1] <= 128 && a[a] <= 128 && a[a + 1] <= 128 && a[a - 1] <= 128 && a[a + 1] <= 128 && a[a - 1] <= 128 && a[a] <= 128 && a[a + 1] <= 128 ? 0 : (a >= 128 ? a - 128 : a);
            a[a] = -16777216 | a << 16 | a << 8 | a;
            a = a + 1;
         }

         this.Method1267(a, 0, a, a, 1, a);
         a = a + 1;
      }

      return a;
   }

   public String toString() {
      return "Edges/Laplace...";
   }
}
