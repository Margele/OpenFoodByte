package awsl;

import java.awt.Rectangle;

public class Class824 extends Class798 {
   protected static final int[] Field3661 = new int[]{0, 0, 0, 0, 0, 7, 3, 5, 1};
   private int Field3662 = 16;
   private boolean Field3663;
   private int Field3664 = 256;
   private boolean Field3665 = true;

   public void Method9(int a) {
      this.Field3664 = Math.min(Math.max(a, 8), 256);
   }

   public int Method10() {
      return this.Field3664;
   }

   public void Method87(boolean a) {
      this.Field3663 = a;
   }

   public boolean Method88() {
      return this.Field3663;
   }

   public void Method1282(boolean a) {
      this.Field3665 = a;
   }

   public boolean Method1283() {
      return this.Field3665;
   }

   public void Method3632(int[] a, int[] a, int a, int a, int a, boolean a5, boolean a6) {
      int a = a * a;
      Class766 a = new Class765();
      a.Method1781(a);
      Class193.Method1269();
      a.Method1782(a, 0, a);
      int[] a = a.Method1783();
      int a = 0;
      if (a < a) {
         a[a] = a[a.Method1784(a[a])];
         ++a;
      }

      int a = false;
      int a = 0;
      if (a < a) {
         boolean a = (a & 1) == 1;
         a = a * a + a - 1;
         int a = true;
         a = a * a;
         int a = 1;
         int a = 0;
         if (a < a) {
            int a = a[a];
            int a = a[a.Method1784(a)];
            a[a] = a;
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            int a = a - a;
            int a = a - a;
            int a = a - a;
            int a = -1;
            int var10000;
            if (a <= 1) {
               int a = a + a;
               if (0 <= a && a < a) {
                  int a = -1;
                  if (a <= 1) {
                     int a = a + a;
                     if (0 <= a && a < a) {
                        var10000 = Field3661[(a + 1) * 3 - a + 1];
                        int a = Field3661[(a + 1) * 3 + a + 1];
                        int a = a - a;
                        a = a[a];
                        a = a >> 16 & 255;
                        a = a >> 8 & 255;
                        a = a & 255;
                        a += a * a / this.Field3662;
                        a += a * a / this.Field3662;
                        a += a * a / this.Field3662;
                        a[a] = Class767.Method1687(a) << 16 | Class767.Method1687(a) << 8 | Class767.Method1687(a);
                     }

                     ++a;
                  }
               }

               ++a;
            }

            var10000 = a + a;
            ++a;
         }

         ++a;
      }

   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      int[] a = new int[a * a];
      this.Method3632(a, a, a, a, this.Field3664, this.Field3663, this.Field3665);
      return a;
   }

   public String toString() {
      return "Colors/Quantize...";
   }
}
