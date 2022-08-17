package awsl;

import java.awt.Rectangle;

public class Class818 extends Class798 {
   private int Field3655 = 3;
   private int Field3656 = 256;

   public void Method9(int a) {
      this.Field3655 = a;
   }

   public int Method10() {
      return this.Field3655;
   }

   public void Method11(int a) {
      this.Field3656 = a;
   }

   public int Method12() {
      return this.Field3656;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int var6 = 0;
      Class193.Method1269();
      int[] var7 = new int[this.Field3656];
      int[] var8 = new int[this.Field3656];
      int[] var9 = new int[this.Field3656];
      int[] var10 = new int[this.Field3656];
      int[] var11 = new int[this.Field3656];
      int[] var12 = new int[this.Field3656];
      int[] var13 = new int[a * a];
      int var14 = 0;
      if (var14 < a) {
         int var15 = 0;
         if (var15 < a) {
            int var16 = 0;
            if (var16 < this.Field3656) {
               var7[var16] = var8[var16] = var9[var16] = var10[var16] = var11[var16] = var12[var16] = 0;
               ++var16;
            }

            var16 = -this.Field3655;
            int var17;
            int var18;
            int var19;
            if (var16 <= this.Field3655) {
               var17 = var14 + var16;
               if (0 <= var17 && var17 < a) {
                  var18 = var17 * a;
                  var19 = -this.Field3655;
                  if (var19 <= this.Field3655) {
                     int var20 = var15 + var19;
                     if (0 <= var20 && var20 < a) {
                        int var21 = a[var18 + var20];
                        int var22 = var21 >> 16 & 255;
                        int var23 = var21 >> 8 & 255;
                        int var24 = var21 & 255;
                        int var25 = var22 * this.Field3656 / 256;
                        int var26 = var23 * this.Field3656 / 256;
                        int var27 = var24 * this.Field3656 / 256;
                        var10[var25] += var22;
                        var11[var26] += var23;
                        var12[var27] += var24;
                        int var10002 = var7[var25]++;
                        var10002 = var8[var26]++;
                        var10002 = var9[var27]++;
                     }

                     ++var19;
                  }
               }

               ++var16;
            }

            byte var28 = 0;
            byte var29 = 0;
            byte var30 = 0;
            byte var31 = 1;
            if (var31 < this.Field3656) {
               if (var7[var31] > var7[var28]) {
                  var28 = var31;
               }

               if (var8[var31] > var8[var29]) {
                  var29 = var31;
               }

               if (var9[var31] > var9[var30]) {
                  var30 = var31;
               }

               var19 = var31 + 1;
            }

            var16 = var10[var28] / var7[var28];
            var17 = var11[var29] / var8[var29];
            var18 = var12[var30] / var9[var30];
            var13[var6] = a[var6] & -16777216 | var16 << 16 | var17 << 8 | var18;
            ++var6;
            ++var15;
         }

         ++var14;
      }

      return var13;
   }

   public String toString() {
      return "Stylize/Oil...";
   }
}
