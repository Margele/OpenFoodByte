package awsl;

import java.awt.Rectangle;

public class Class843 extends Class798 {
   private int[][] Field3731;

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1269();
      Class745 var6 = new Class745(a, a, a, 0, a);
      int var7;
      if (var6.Method1545() > 0) {
         float var9 = 255.0F / (float)var6.Method1545();
         this.Field3731 = new int[3][256];
         var7 = 0;
         if (var7 < 3) {
            this.Field3731[var7][0] = var6.Method1547(var7, 0);
            int var8 = 1;
            if (var8 < 256) {
               this.Field3731[var7][var8] = this.Field3731[var7][var8 - 1] + var6.Method1547(var7, var8);
               ++var8;
            }

            byte var12 = 0;
            if (var12 < 256) {
               this.Field3731[var7][var12] = Math.round((float)this.Field3731[var7][var12] * var9);
               var8 = var12 + 1;
            }

            ++var7;
         }
      }

      this.Field3731 = (int[][])null;
      byte var11 = 0;
      int var13 = 0;
      if (var13 < a) {
         int var10 = 0;
         if (var10 < a) {
            a[var11] = this.Method3(var10, var13, a[var11]);
            var7 = var11 + 1;
            ++var10;
         }

         ++var13;
      }

      this.Field3731 = (int[][])null;
      return a;
   }

   private int Method3(int a, int a, int a) {
      if (this.Field3731 != null) {
         int var4 = a & -16777216;
         int var5 = this.Field3731[0][a >> 16 & 255];
         int var6 = this.Field3731[1][a >> 8 & 255];
         int var7 = this.Field3731[2][a & 255];
         return var4 | var5 << 16 | var6 << 8 | var7;
      } else {
         return a;
      }
   }

   public String toString() {
      return "Colors/Equalize";
   }
}
