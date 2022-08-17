package awsl;

import java.awt.Rectangle;

public class Class836 extends Class798 {
   private int Method1767(int[] a) {
      int var2;
      int var4;
      for(var4 = 0; var4 < 4; ++var4) {
         var2 = 0;
         int var3 = 0;

         for(int var5 = 0; var5 < 9; ++var5) {
            if (a[var5] > var2) {
               var2 = a[var5];
               var3 = var5;
            }
         }

         a[var3] = 0;
      }

      var2 = 0;

      for(var4 = 0; var4 < 9; ++var4) {
         if (a[var4] > var2) {
            var2 = a[var4];
         }
      }

      return var2;
   }

   private int Method3779(int[] a, int[] a, int[] a) {
      int var5 = 0;
      int var6 = Integer.MAX_VALUE;

      for(int var7 = 0; var7 < 9; ++var7) {
         int var4 = 0;

         for(int var8 = 0; var8 < 9; ++var8) {
            var4 += Math.abs(a[var7] - a[var8]);
            var4 += Math.abs(a[var7] - a[var8]);
            var4 += Math.abs(a[var7] - a[var8]);
         }

         if (var4 < var6) {
            var6 = var4;
            var5 = var7;
         }
      }

      return var5;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int var6 = 0;
      int[] var7 = new int[9];
      int[] var8 = new int[9];
      Class193.Method1269();
      int[] var9 = new int[9];
      int[] var10 = new int[9];
      int[] var11 = new int[a * a];
      int var12 = 0;
      if (var12 < a) {
         int var13 = 0;
         if (var13 < a) {
            int var14 = 0;
            int var15 = -1;
            if (var15 <= 1) {
               int var16 = var12 + var15;
               if (0 <= var16 && var16 < a) {
                  int var17 = var16 * a;
                  int var18 = -1;
                  if (var18 <= 1) {
                     int var19 = var13 + var18;
                     if (0 <= var19 && var19 < a) {
                        int var20 = a[var17 + var19];
                        var7[var14] = var20;
                        var8[var14] = var20 >> 16 & 255;
                        var9[var14] = var20 >> 8 & 255;
                        var10[var14] = var20 & 255;
                        ++var14;
                     }

                     ++var18;
                  }
               }

               ++var15;
            }

            if (var14 < 9) {
               var7[var14] = -16777216;
               var8[var14] = var9[var14] = var10[var14] = 0;
               ++var14;
            }

            var11[var6++] = var7[this.Method3779(var8, var9, var10)];
            ++var13;
         }

         ++var12;
      }

      return var11;
   }

   public String toString() {
      return "Blur/Median";
   }
}
