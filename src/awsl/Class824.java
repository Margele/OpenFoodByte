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

   public void Method3632(int[] a, int[] a, int a, int a, int a, boolean a, boolean a) {
      int var9 = a * a;
      Class765 var10 = new Class765();
      var10.Method1781(a);
      Class193.Method1269();
      var10.Method1782(a, 0, var9);
      int[] var11 = var10.Method1783();
      int var12 = 0;
      if (var12 < var9) {
         a[var12] = var11[var10.Method1784(a[var12])];
         ++var12;
      }

      boolean var34 = false;
      int var13 = 0;
      if (var13 < a) {
         boolean var14 = (var13 & 1) == 1;
         var12 = var13 * a + a - 1;
         boolean var15 = true;
         var12 = var13 * a;
         byte var35 = 1;
         int var16 = 0;
         if (var16 < a) {
            int var17 = a[var12];
            int var18 = var11[var10.Method1784(var17)];
            a[var12] = var18;
            int var19 = var17 >> 16 & 255;
            int var20 = var17 >> 8 & 255;
            int var21 = var17 & 255;
            int var22 = var18 >> 16 & 255;
            int var23 = var18 >> 8 & 255;
            int var24 = var18 & 255;
            int var25 = var19 - var22;
            int var26 = var20 - var23;
            int var27 = var21 - var24;
            int var28 = -1;
            int var10000;
            if (var28 <= 1) {
               int var29 = var28 + var13;
               if (0 <= var29 && var29 < a) {
                  int var30 = -1;
                  if (var30 <= 1) {
                     int var31 = var30 + var16;
                     if (0 <= var31 && var31 < a) {
                        var10000 = Field3661[(var28 + 1) * 3 - var30 + 1];
                        int var32 = Field3661[(var28 + 1) * 3 + var30 + 1];
                        int var33 = var12 - var30;
                        var17 = a[var33];
                        var19 = var17 >> 16 & 255;
                        var20 = var17 >> 8 & 255;
                        var21 = var17 & 255;
                        var19 += var25 * var32 / this.Field3662;
                        var20 += var26 * var32 / this.Field3662;
                        var21 += var27 * var32 / this.Field3662;
                        a[var33] = Class767.Method1687(var19) << 16 | Class767.Method1687(var20) << 8 | Class767.Method1687(var21);
                     }

                     ++var30;
                  }
               }

               ++var28;
            }

            var10000 = var12 + var35;
            ++var16;
         }

         ++var13;
      }

   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int[] var5 = new int[a * a];
      this.Method3632(a, var5, a, a, this.Field3664, this.Field3663, this.Field3665);
      return var5;
   }

   public String toString() {
      return "Colors/Quantize...";
   }
}
