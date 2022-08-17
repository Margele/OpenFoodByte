package awsl;

import java.awt.Rectangle;

public class Class864 extends Class798 {
   private static final int[] Field3771 = new int[]{0, 0, 0, 0, 0, 7, 3, 5, 1};
   private int[] Field3772;
   private int Field3773 = 16;
   private boolean Field3774 = true;
   private boolean Field3775 = true;
   private int Field3776 = 6;

   public Class864() {
      this.Method85(Field3771);
   }

   public void Method87(boolean a) {
      this.Field3774 = a;
   }

   public boolean Method88() {
      return this.Field3774;
   }

   public void Method1282(boolean a) {
      this.Field3775 = a;
   }

   public boolean Method1283() {
      return this.Field3775;
   }

   public void Method85(int[] a) {
      this.Field3772 = a;
      this.Field3773 = 0;

      for(int var2 = 0; var2 < a.length; ++var2) {
         this.Field3773 += a[var2];
      }

   }

   public int[] Method3438() {
      return this.Field3772;
   }

   public void Method9(int a) {
      this.Field3776 = a;
   }

   public int Method10() {
      return this.Field3776;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int[] var6 = new int[a * a];
      Class193.Method1270();
      boolean var7 = false;
      int[] var8 = new int[this.Field3776];
      int var9 = 0;
      int var10;
      if (var9 < this.Field3776) {
         var10 = 255 * var9 / (this.Field3776 - 1);
         var8[var9] = var10;
         ++var9;
      }

      int[] var31 = new int[256];
      byte var32 = 0;
      if (var32 < 256) {
         var31[var32] = this.Field3776 * var32 / 256;
         var10 = var32 + 1;
      }

      var32 = 0;
      if (var32 < a) {
         boolean var10000;
         if (this.Field3774 && (var32 & 1) == 1) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         int var30 = var32 * a + a - 1;
         boolean var12 = true;
         var30 = var32 * a;
         byte var33 = 1;
         int var13 = 0;
         if (var13 < a) {
            int var14 = a[var30];
            int var15 = var14 >> 16 & 255;
            int var16 = var14 >> 8 & 255;
            int var17 = var14 & 255;
            if (!this.Field3775) {
               var15 = var16 = var17 = (var15 + var16 + var17) / 3;
            }

            int var18 = var8[var31[var15]];
            int var19 = var8[var31[var16]];
            int var20 = var8[var31[var17]];
            var6[var30] = var14 & -16777216 | var18 << 16 | var19 << 8 | var20;
            int var21 = var15 - var18;
            int var22 = var16 - var19;
            int var23 = var17 - var20;
            int var24 = -1;
            int var34;
            if (var24 <= 1) {
               int var25 = var24 + var32;
               if (0 <= var25 && var25 < a) {
                  int var26 = -1;
                  if (var26 <= 1) {
                     int var27 = var26 + var13;
                     if (0 <= var27 && var27 < a) {
                        var34 = this.Field3772[(var24 + 1) * 3 - var26 + 1];
                        int var28 = this.Field3772[(var24 + 1) * 3 + var26 + 1];
                        int var29 = var30 - var26;
                        var14 = a[var29];
                        var15 = var14 >> 16 & 255;
                        var16 = var14 >> 8 & 255;
                        var17 = var14 & 255;
                        var15 += var21 * var28 / this.Field3773;
                        var16 += var22 * var28 / this.Field3773;
                        var17 += var23 * var28 / this.Field3773;
                        a[var29] = a[var29] & -16777216 | Class767.Method1687(var15) << 16 | Class767.Method1687(var16) << 8 | Class767.Method1687(var17);
                     }

                     ++var26;
                  }
               }

               ++var24;
            }

            var34 = var30 + var33;
            ++var13;
         }

         var10 = var32 + 1;
      }

      return var6;
   }

   public String toString() {
      return "Colors/Diffusion Dither...";
   }
}
