package awsl;

import java.awt.Rectangle;

public class Class864 extends Class798 {
   private static final int[] Field3771 = new int[]{0, 0, 0, 0, 0, 7, 3, 5, 1};
   private int[] Field3772;
   private int Field3773 = 16;
   private boolean Field3774 = true;
   private boolean Field3775 = true;
   private int Field3776 = 6;

   public Class864() {
      this.Method85(Field3771);
   }

   public void Method87(boolean a) {
      this.Field3774 = a;
   }

   public boolean Method88() {
      return this.Field3774;
   }

   public void Method1282(boolean a) {
      this.Field3775 = a;
   }

   public boolean Method1283() {
      return this.Field3775;
   }

   public void Method85(int[] a) {
      this.Field3772 = a;
      this.Field3773 = 0;

      for(int a = 0; a < a.length; ++a) {
         this.Field3773 += a[a];
      }

   }

   public int[] Method3438() {
      return this.Field3772;
   }

   public void Method9(int a) {
      this.Field3776 = a;
   }

   public int Method10() {
      return this.Field3776;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      int[] a = new int[a * a];
      Class193.Method1270();
      int a = false;
      int[] a = new int[this.Field3776];
      int a = 0;
      int a;
      if (a < this.Field3776) {
         a = 255 * a / (this.Field3776 - 1);
         a[a] = a;
         ++a;
      }

      int[] a = new int[256];
      int a = 0;
      if (a < 256) {
         a[a] = this.Field3776 * a / 256;
         a = a + 1;
      }

      a = 0;
      if (a < a) {
         boolean var10000;
         if (this.Field3774 && (a & 1) == 1) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         int a = a * a + a - 1;
         int a = true;
         a = a * a;
         int a = 1;
         int a = 0;
         if (a < a) {
            int a = a[a];
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            if (!this.Field3775) {
               a = a = a = (a + a + a) / 3;
            }

            int a = a[a[a]];
            int a = a[a[a]];
            int a = a[a[a]];
            a[a] = a & -16777216 | a << 16 | a << 8 | a;
            int a = a - a;
            int a = a - a;
            int a = a - a;
            int a = -1;
            int var34;
            if (a <= 1) {
               int a = a + a;
               if (0 <= a && a < a) {
                  int a = -1;
                  if (a <= 1) {
                     int a = a + a;
                     if (0 <= a && a < a) {
                        var34 = this.Field3772[(a + 1) * 3 - a + 1];
                        int a = this.Field3772[(a + 1) * 3 + a + 1];
                        int a = a - a;
                        a = a[a];
                        a = a >> 16 & 255;
                        a = a >> 8 & 255;
                        a = a & 255;
                        a += a * a / this.Field3773;
                        a += a * a / this.Field3773;
                        a += a * a / this.Field3773;
                        a[a] = a[a] & -16777216 | Class767.Method1687(a) << 16 | Class767.Method1687(a) << 8 | Class767.Method1687(a);
                     }

                     ++a;
                  }
               }

               ++a;
            }

            var34 = a + a;
            ++a;
         }

         a = a + 1;
      }

      return a;
   }

   public String toString() {
      return "Colors/Diffusion Dither...";
   }
}
