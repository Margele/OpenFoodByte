package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class92 extends Class193 {
   public static final int Field803 = 0;
   public static final int Field804 = 1;
   public static final int Field805 = 2;
   private int Field806 = 0;

   public void Method9(int a) {
      this.Field806 = a;
   }

   public int Method10() {
      return this.Field806;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      Class193.Method1269();
      int var5 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      Object var6 = null;
      int var7;
      int[] var20;
      if (this.Field806 == 0) {
         var7 = 0;
         if (var7 < var5 - 1) {
            var20 = this.Method104(a, 0, var7, var4, 1, (int[])var6);
            if (a != a) {
               this.Method1267(a, 0, var7, var4, 1, var20);
            }

            this.Method1267(a, 0, var7 + 1, var4, 1, var20);
            var7 += 2;
         }
      } else if (this.Field806 == 1) {
         byte var21 = 1;
         if (var21 < var5) {
            var20 = this.Method104(a, 0, var21, var4, 1, (int[])var6);
            if (a != a) {
               this.Method1267(a, 0, var21, var4, 1, var20);
            }

            this.Method1267(a, 0, var21 - 1, var4, 1, var20);
            var7 = var21 + 2;
         }
      } else if (this.Field806 == 2) {
         Object var22 = null;
         int var8 = 0;
         if (var8 < var5 - 1) {
            var20 = this.Method104(a, 0, var8, var4, 1, (int[])var6);
            int[] var23 = this.Method104(a, 0, var8 + 1, var4, 1, (int[])var22);
            int var9 = 0;
            if (var9 < var4) {
               int var10 = var20[var9];
               int var11 = var23[var9];
               int var12 = var10 >> 24 & 255;
               int var13 = var10 >> 16 & 255;
               int var14 = var10 >> 8 & 255;
               int var15 = var10 & 255;
               int var16 = var11 >> 24 & 255;
               int var17 = var11 >> 16 & 255;
               int var18 = var11 >> 8 & 255;
               int var19 = var11 & 255;
               var12 = (var12 + var16) / 2;
               var13 = (var13 + var17) / 2;
               var14 = (var14 + var18) / 2;
               var15 = (var15 + var19) / 2;
               var20[var9] = var12 << 24 | var13 << 16 | var14 << 8 | var15;
               ++var9;
            }

            this.Method1267(a, 0, var8, var4, 1, var20);
            this.Method1267(a, 0, var8 + 1, var4, 1, var20);
            var8 += 2;
         }
      }

      return a;
   }

   public String toString() {
      return "Video/De-Interlace";
   }
}
