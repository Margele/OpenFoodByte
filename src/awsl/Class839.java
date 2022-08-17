package awsl;

import java.awt.Rectangle;

public class Class839 extends Class798 {
   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1270();
      int var6 = 0;
      int[] var7 = new int[a * a];
      int var8 = 0;
      if (var8 < a) {
         int var9 = 0;
         if (var9 < a) {
            int var10 = -16777216;
            int var11 = -1;
            if (var11 <= 1) {
               int var12 = var8 + var11;
               if (0 <= var12 && var12 < a) {
                  int var13 = var12 * a;
                  int var14 = -1;
                  if (var14 <= 1) {
                     int var15 = var9 + var14;
                     if (0 <= var15 && var15 < a) {
                        var10 = Class767.Method1691(var10, a[var13 + var15], 3);
                     }

                     ++var14;
                  }
               }

               ++var11;
            }

            var7[var6++] = var10;
            ++var9;
         }

         ++var8;
      }

      return var7;
   }

   public String toString() {
      return "Blur/Maximum";
   }
}
