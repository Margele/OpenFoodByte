package awsl;

import java.awt.image.ColorModel;

class Class153 extends Class143 {
   public Class153(float a, ColorModel a, ColorModel a) {
      super(a, a, a);
   }

   public void Method380(int[] a, int[] a, float a) {
      Class236.Method2106();
      int var5 = a.length;
      int var6 = 0;
      if (var6 < var5) {
         int var7 = a[var6];
         int var8 = a[var6];
         int var9 = a[var6 + 1];
         int var10 = a[var6 + 1];
         int var11 = a[var6 + 2];
         int var12 = a[var6 + 2];
         int var13 = a[var6 + 3];
         int var14 = a[var6 + 3];
         if (var8 != 255) {
            int var15 = Method1436(255 - (255 - var7 << 8) / (var8 + 1));
         }

         if (var10 != 255) {
            int var16 = Method1436(255 - (255 - var9 << 8) / (var10 + 1));
         }

         if (var12 != 255) {
            int var17 = Method1436(255 - (255 - var11 << 8) / (var12 + 1));
         }

         float var18 = a * (float)var13 / 255.0F;
         float var19 = 1.0F - var18;
         a[var6] = (int)(var18 * (float)var7 + var19 * (float)var8);
         a[var6 + 1] = (int)(var18 * (float)var9 + var19 * (float)var10);
         a[var6 + 2] = (int)(var18 * (float)var11 + var19 * (float)var12);
         a[var6 + 3] = (int)((float)var13 * a + (float)var14 * var19);
         var6 += 4;
      }

   }
}
