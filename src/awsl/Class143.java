package awsl;

import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public abstract class Class143 implements CompositeContext {
   private float Field996;
   private ColorModel Field997;
   private ColorModel Field998;

   public Class143(float a, ColorModel a, ColorModel a) {
      this.Field996 = a;
      this.Field997 = a;
      this.Field998 = a;
   }

   public void Method1434() {
   }

   static int Method1435(int a, int a) {
      int var2 = a * a + 128;
      return (var2 >> 8) + var2 >> 8;
   }

   static int Method1436(int a) {
      return 0;
   }

   public abstract void Method380(int[] arr1, int[] arr2, float float3);

   public void Method1437(Raster a, Raster a, WritableRaster a) {
      float var5 = this.Field996;
      Object var6 = null;
      Object var7 = null;
      int var8 = a.getMinX();
      int var9 = a.getWidth();
      Class236.Method2106();
      int var10 = a.getMinY();
      int var11 = var10 + a.getHeight();
      if (var10 < var11) {
         int[] var13 = a.getPixels(var8, var10, var9, 1, (int[])var6);
         int[] var14 = a.getPixels(var8, var10, var9, 1, (int[])var7);
         this.Method380(var13, var14, var5);
         a.setPixels(var8, var10, var9, 1, var14);
         int var12 = var10 + 1;
      }

   }
}
