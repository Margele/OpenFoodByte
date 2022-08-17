package awsl;

import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import obfuscate.a;

class Class240 implements CompositeContext {
   private int Field1340;

   public Class240(int a, ColorModel a1, ColorModel a2) {
      this.Field1340 = a;
   }

   public void Method1434() {
   }

   public void Method1437(Raster a, Raster a, WritableRaster a) {
      Class236.Method2106();
      int a = a.getMinX();
      int a = a.getMinY();
      int a = a.getWidth();
      int a = a.getHeight();
      int[] a = null;
      int[] a = null;
      int[] a = null;
      int[] a = new int[a * 4];
      int a = 0;
      if (a < a) {
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         int a = 0;
         int a = 0;
         int a = 0;
         if (a < a) {
            int a = a[a + 3];
            int a = (int)((Object[])a)[a + 3];
            if (((a ^ a) & 128) != 0 || ((a ^ a) & 128) != 0) {
               if ((this.Field1340 + a + a) % 10 > 4) {
                  a[a] = 0;
                  a[a + 1] = 0;
                  a[a + 2] = 0;
               }

               a[a] = 255;
               a[a + 1] = 255;
               a[a + 2] = 127;
               a[a + 3] = 255;
            }

            a[a] = a[a];
            a[a + 1] = a[a + 1];
            a[a + 2] = a[a + 2];
            a[a] = 255;
            a[a + 1] = 0;
            a[a + 2] = 0;
            a[a + 3] = 0;
            a += 4;
            ++a;
         }

         a.setPixels(a, a, a, 1, a);
         ++a;
         ++a;
      }

      if (a.trash() == null) {
         Class236.Method2105(new String[1]);
      }

   }
}
