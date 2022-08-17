package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class80 extends Class193 {
   private void Method85(int[] a) {
      for(int var2 = 0; var2 < a.length; ++var2) {
         int var3 = a[var2];
         int var4 = var3 >> 16 & 255;
         int var5 = var3 >> 8 & 255;
         int var6 = var3 & 255;
         a[var2] = (var4 + var5 + var6) / 3;
      }

   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      Object var6 = null;
      Object var7 = null;
      int[] var8 = null;
      int[] var9 = new int[var4];
      int[] var21 = this.Method104(a, 0, 0, var4, 1, (int[])var6);
      int[] var22 = this.Method104(a, 0, 0, var4, 1, (int[])var7);
      this.Method85(var21);
      this.Method85(var22);
      int var10 = 0;
      int var11;
      int var12;
      if (var10 < var5) {
         if (var10 < var5 - 1) {
            var8 = this.Method104(a, 0, var10 + 1, var4, 1, var8);
            this.Method85(var8);
         }

         var9[0] = var9[var4 - 1] = -16777216;
         var11 = 1;
         if (var11 < var4 - 1) {
            var12 = var22[var11 - 1];
            int var13 = var21[var11];
            int var14 = var8[var11];
            int var15 = var22[var11 + 1];
            int var16 = var22[var11];
            int var17 = Math.max(Math.max(var12, var13), Math.max(var14, var15));
            int var18 = Math.min(Math.min(var12, var13), Math.min(var14, var15));
            int var19 = (int)(0.5F * (float)Math.max(var17 - var16, var16 - var18));
            int var20 = var21[var11 - 1] + var21[var11] + var21[var11 + 1] + var22[var11 - 1] - 8 * var22[var11] + var22[var11 + 1] + var8[var11 - 1] + var8[var11] + var8[var11 + 1] > 0 ? var19 : 128 + var19;
            var9[var11] = var20;
            ++var11;
         }

         this.Method1267(a, 0, var10, var4, 1, var9);
         int[] var24 = var21;
         var21 = var22;
         var22 = var8;
         var8 = var24;
         ++var10;
      }

      var21 = this.Method104(a, 0, 0, var4, 1, var21);
      var22 = this.Method104(a, 0, 0, var4, 1, var22);
      byte var23 = 0;
      if (var23 < var5) {
         if (var23 < var5 - 1) {
            var8 = this.Method104(a, 0, var23 + 1, var4, 1, var8);
         }

         var9[0] = var9[var4 - 1] = -16777216;
         byte var25 = 1;
         if (var25 < var4 - 1) {
            var12 = var22[var25];
            var12 = var12 > 128 || var21[var25 - 1] <= 128 && var21[var25] <= 128 && var21[var25 + 1] <= 128 && var22[var25 - 1] <= 128 && var22[var25 + 1] <= 128 && var8[var25 - 1] <= 128 && var8[var25] <= 128 && var8[var25 + 1] <= 128 ? 0 : (var12 >= 128 ? var12 - 128 : var12);
            var9[var25] = -16777216 | var12 << 16 | var12 << 8 | var12;
            var11 = var25 + 1;
         }

         this.Method1267(a, 0, var23, var4, 1, var9);
         var10 = var23 + 1;
      }

      return a;
   }

   public String toString() {
      return "Edges/Laplace...";
   }
}
