package awsl;

import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import obfuscate.a;

class Class240 implements CompositeContext {
   private int Field1340;

   public Class240(int a, ColorModel a, ColorModel a) {
      this.Field1340 = a;
   }

   public void Method1434() {
   }

   public void Method1437(Raster a, Raster a, WritableRaster a) {
      Class236.Method2106();
      int var5 = a.getMinX();
      int var6 = a.getMinY();
      int var7 = a.getWidth();
      int var8 = a.getHeight();
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;
      int[] var12 = new int[var7 * 4];
      int var13 = 0;
      if (var13 < var8) {
         int[] var19 = a.getPixels(var5, var6, var7, 1, (int[])var9);
         int[] var20 = a.getPixels(var5, var6, var7, 1, (int[])var11);
         byte var14 = 0;
         int var15 = 0;
         int var16 = 0;
         if (var16 < var7) {
            int var17 = var19[var15 + 3];
            int var18 = (int)((Object[])var10)[var15 + 3];
            if (((var17 ^ var14) & 128) != 0 || ((var17 ^ var18) & 128) != 0) {
               if ((this.Field1340 + var13 + var16) % 10 > 4) {
                  var12[var15] = 0;
                  var12[var15 + 1] = 0;
                  var12[var15 + 2] = 0;
               }

               var12[var15] = 255;
               var12[var15 + 1] = 255;
               var12[var15 + 2] = 127;
               var12[var15 + 3] = 255;
            }

            var12[var15] = var20[var15];
            var12[var15 + 1] = var20[var15 + 1];
            var12[var15 + 2] = var20[var15 + 2];
            var12[var15] = 255;
            var12[var15 + 1] = 0;
            var12[var15 + 2] = 0;
            var12[var15 + 3] = 0;
            var15 += 4;
            ++var16;
         }

         a.setPixels(var5, var6, var7, 1, var12);
         ++var6;
         ++var13;
      }

      if (a.trash() == null) {
         Class236.Method2105(new String[1]);
      }

   }
}
