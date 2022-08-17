package awsl;

import java.awt.Rectangle;

public class Class760 extends Class798 {
   private int Method1767(int[] a) {
      int var2 = 0;
      int var3 = 0;
      int var4 = Integer.MAX_VALUE;
      int var5 = Integer.MIN_VALUE;

      for(int var6 = 0; var6 < 9; ++var6) {
         if (var6 != 4) {
            if (a[var6] < var4) {
               var4 = a[var6];
               var2 = var6;
            }

            if (a[var6] > var5) {
               var5 = a[var6];
               var3 = var6;
            }
         }
      }

      if (a[4] < var4) {
         return a[var2];
      } else if (a[4] > var5) {
         return a[var3];
      } else {
         return a[4];
      }
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1270();
      int var6 = 0;
      int[] var7 = new int[9];
      int[] var8 = new int[9];
      int[] var9 = new int[9];
      int[] var10 = new int[a * a];
      int var11 = 0;
      if (var11 < a) {
         int var12 = 0;
         if (var12 < a) {
            int var13 = 0;
            int var14 = a[var6];
            int var15 = var14 >> 16 & 255;
            int var16 = var14 >> 8 & 255;
            int var17 = var14 & 255;
            int var18 = -1;
            if (var18 <= 1) {
               int var19 = var11 + var18;
               int var20;
               if (0 <= var19 && var19 < a) {
                  var20 = var19 * a;
                  int var21 = -1;
                  if (var21 <= 1) {
                     int var22 = var12 + var21;
                     if (0 <= var22 && var22 < a) {
                        int var23 = a[var20 + var22];
                        var7[var13] = var23 >> 16 & 255;
                        var8[var13] = var23 >> 8 & 255;
                        var9[var13] = var23 & 255;
                     }

                     var7[var13] = var15;
                     var8[var13] = var16;
                     var9[var13] = var17;
                     ++var13;
                     ++var21;
                  }
               }

               byte var24 = -1;
               if (var24 <= 1) {
                  var7[var13] = var15;
                  var8[var13] = var16;
                  var9[var13] = var17;
                  ++var13;
                  var20 = var24 + 1;
               }

               ++var18;
            }

            var10[var6] = a[var6] & -16777216 | this.Method1767(var7) << 16 | this.Method1767(var8) << 8 | this.Method1767(var9);
            ++var6;
            ++var12;
         }

         ++var11;
      }

      return var10;
   }

   public String toString() {
      return "Blur/Smooth";
   }
}
