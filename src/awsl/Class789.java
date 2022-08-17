package awsl;

import java.awt.Rectangle;

public class Class789 extends Class808 {
   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1270();
      int var6 = 0;
      int[] var7 = new int[a * a];
      int var8 = 0;
      if (var8 < a) {
         int var9 = 0;
         if (var9 < a) {
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            int var13 = a[var8 * a + var9];
            int var14 = var13 & -16777216;
            int var15 = 0;
            int var16 = -1;
            if (var16 <= 1) {
               int var17 = var8 + var16;
               if (0 <= var17 && var17 < a) {
                  int var18 = var17 * a;
                  int var19 = -1;
                  if (var19 <= 1) {
                     int var20 = var9 + var19;
                     if (0 <= var20 && var20 < a) {
                        int var21 = a[var18 + var20];
                        if (this.Field3618.Method3494(var21)) {
                           ++var15;
                        }
                     }

                     ++var19;
                  }
               }

               ++var16;
            }

            if (this.Field3618.Method3494(var13)) {
               var7[var6++] = var15 != 2 && var15 != 3 ? -1 : var13;
            }

            var7[var6++] = var15 == 3 ? -16777216 : var13;
            ++var9;
         }

         ++var8;
      }

      return var7;
   }

   public String toString() {
      return "Binary/Life";
   }
}
