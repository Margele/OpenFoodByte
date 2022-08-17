package awsl;

import java.awt.image.ColorModel;

class Class200 extends Class143 {
   public Class200(float a, ColorModel a, ColorModel a) {
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
         int var15;
         int var18;
         if (var8 < 128) {
            var18 = var8 * var7 + 128;
            var15 = 2 * ((var18 >> 8) + var18 >> 8);
         }

         var18 = (255 - var8) * (255 - var7) + 128;
         var15 = 2 * (255 - ((var18 >> 8) + var18 >> 8));
         int var16;
         if (var10 < 128) {
            var18 = var10 * var9 + 128;
            var16 = 2 * ((var18 >> 8) + var18 >> 8);
         }

         var18 = (255 - var10) * (255 - var9) + 128;
         var16 = 2 * (255 - ((var18 >> 8) + var18 >> 8));
         int var17;
         if (var12 < 128) {
            var18 = var12 * var11 + 128;
            var17 = 2 * ((var18 >> 8) + var18 >> 8);
         }

         var18 = (255 - var12) * (255 - var11) + 128;
         var17 = 2 * (255 - ((var18 >> 8) + var18 >> 8));
         float var19 = a * (float)var13 / 255.0F;
         float var20 = 1.0F - var19;
         a[var6] = (int)(var19 * (float)var15 + var20 * (float)var8);
         a[var6 + 1] = (int)(var19 * (float)var16 + var20 * (float)var10);
         a[var6 + 2] = (int)(var19 * (float)var17 + var20 * (float)var12);
         a[var6 + 3] = (int)((float)var13 * a + (float)var14 * var20);
         var6 += 4;
      }

   }
}
