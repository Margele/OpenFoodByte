package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class92 extends Class193 {
   public static final int Field803 = 0;
   public static final int Field804 = 1;
   public static final int Field805 = 2;
   private int Field806 = 0;

   public void Method9(int a) {
      this.Field806 = a;
   }

   public int Method10() {
      return this.Field806;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      Class193.Method1269();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = null;
      int a;
      int[] a;
      if (this.Field806 == 0) {
         a = 0;
         if (a < a - 1) {
            a = this.Method104(a, 0, a, a, 1, (int[])a);
            if (a != a) {
               this.Method1267(a, 0, a, a, 1, a);
            }

            this.Method1267(a, 0, a + 1, a, 1, a);
            a += 2;
         }
      } else if (this.Field806 == 1) {
         int a = 1;
         if (a < a) {
            a = this.Method104(a, 0, a, a, 1, (int[])a);
            if (a != a) {
               this.Method1267(a, 0, a, a, 1, a);
            }

            this.Method1267(a, 0, a - 1, a, 1, a);
            a = a + 2;
         }
      } else if (this.Field806 == 2) {
         int[] a = null;
         int a = 0;
         if (a < a - 1) {
            a = this.Method104(a, 0, a, a, 1, (int[])a);
            int[] a = this.Method104(a, 0, a + 1, a, 1, (int[])a);
            int a = 0;
            if (a < a) {
               int a = a[a];
               int a = a[a];
               int a = a >> 24 & 255;
               int a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               int a = a >> 24 & 255;
               int a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               a = (a + a) / 2;
               a = (a + a) / 2;
               a = (a + a) / 2;
               a = (a + a) / 2;
               a[a] = a << 24 | a << 16 | a << 8 | a;
               ++a;
            }

            this.Method1267(a, 0, a, a, 1, a);
            this.Method1267(a, 0, a + 1, a, 1, a);
            a += 2;
         }
      }

      return a;
   }

   public String toString() {
      return "Video/De-Interlace";
   }
}
