package awsl;

import java.awt.Rectangle;

public class Class843 extends Class798 {
   private int[][] Field3731;

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      Class193.Method1269();
      Class745 a = new Class745(a, a, a, 0, a);
      int a;
      if (a.Method1545() > 0) {
         float a = 255.0F / (float)a.Method1545();
         this.Field3731 = new int[3][256];
         a = 0;
         if (a < 3) {
            this.Field3731[a][0] = a.Method1547(a, 0);
            int a = 1;
            if (a < 256) {
               this.Field3731[a][a] = this.Field3731[a][a - 1] + a.Method1547(a, a);
               ++a;
            }

            int a = 0;
            if (a < 256) {
               this.Field3731[a][a] = Math.round((float)this.Field3731[a][a] * a);
               a = a + 1;
            }

            ++a;
         }
      }

      this.Field3731 = (int[][])null;
      int a = 0;
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            a[a] = this.Method3(a, a, a[a]);
            a = a + 1;
            ++a;
         }

         ++a;
      }

      this.Field3731 = (int[][])null;
      return a;
   }

   private int Method3(int a, int a1, int a) {
      if (this.Field3731 != null) {
         int a = a & -16777216;
         int a = this.Field3731[0][a >> 16 & 255];
         int a = this.Field3731[1][a >> 8 & 255];
         int a = this.Field3731[2][a & 255];
         return a | a << 16 | a << 8 | a;
      } else {
         return a;
      }
   }

   public String toString() {
      return "Colors/Equalize";
   }
}
