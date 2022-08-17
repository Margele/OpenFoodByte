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
      int a = a * a + 128;
      return (a >> 8) + a >> 8;
   }

   static int Method1436(int a) {
      return 0;
   }

   public abstract void Method380(int[] arr1, int[] arr2, float float3);

   public void Method1437(Raster a, Raster a, WritableRaster a) {
      float a = this.Field996;
      int[] a = null;
      int[] a = null;
      int a = a.getMinX();
      int a = a.getWidth();
      Class236.Method2106();
      int a = a.getMinY();
      int a = a + a.getHeight();
      if (a < a) {
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         this.Method380(a, a, a);
         a.setPixels(a, a, a, 1, a);
         int var12 = a + 1;
      }

   }
}
