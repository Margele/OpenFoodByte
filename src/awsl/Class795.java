package awsl;

import java.awt.Rectangle;

public class Class795 extends Class808 {
   public Class795() {
      this.Field3617 = -1;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1269();
      int var6 = 0;
      int[] var7 = new int[a * a];
      int var8 = 0;
      if (var8 < a) {
         int var9 = 0;
         if (var9 < a) {
            int var10 = a[var8 * a + var9];
            if (this.Field3618.Method3494(var10)) {
               int var11 = 0;
               int var12 = -1;
               if (var12 <= 1) {
                  int var13 = var8 + var12;
                  if (0 <= var13 && var13 < a) {
                     int var14 = var13 * a;
                     int var15 = -1;
                     if (var15 <= 1) {
                        int var16 = var9 + var15;
                        if (0 <= var16 && var16 < a) {
                           int var17 = a[var14 + var16];
                           if (this.Field3618.Method3494(var17)) {
                              ++var11;
                           }
                        }

                        ++var11;
                        ++var15;
                     }
                  }

                  ++var12;
               }

               if (var11 == 9) {
                  var10 = this.Field3617;
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
      return "Binary/Outline...";
   }
}
