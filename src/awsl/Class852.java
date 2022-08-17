package awsl;

import java.awt.Rectangle;

public class Class852 extends Class798 {
   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int var6 = 0;
      Class193.Method1269();
      int[] var7 = new int[a * a];
      int var8 = 0;
      if (var8 < a) {
         int var9 = 0;
         if (var9 < a) {
            int var10 = a[var8 * a + var9];
            if (var10 != -16777216) {
               int var11 = 0;
               if (a[var8 * a + var9 - 1] == -16777216) {
                  ++var11;
               }

               if (a[(var8 - 1) * a + var9] == -16777216) {
                  ++var11;
               }

               if (a[(var8 - 1) * a + var9 - 1] == -16777216) {
                  ++var11;
               }

               if (var11 >= 2) {
                  var10 = -1;
               }
            }

            var7[var6++] = var10;
            ++var9;
         }

         ++var8;
      }

      return var7;
   }

   public String toString() {
      return "Stylize/Flush 3D...";
   }
}
