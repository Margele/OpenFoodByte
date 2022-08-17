package awsl;

import java.awt.image.ColorModel;

class Class131 extends Class143 {
   public Class131(float a, ColorModel a, ColorModel a) {
      super(a, a, a);
   }

   public void Method380(int[] a, int[] a, float a) {
      Class236.Method2106();
      int a = a.length;
      int a = 0;
      if (a < a) {
         int a = a[a];
         int a = a[a];
         int a = a[a + 1];
         int a = a[a + 1];
         int a = a[a + 2];
         int a = a[a + 2];
         int a = a[a + 3];
         int a = a[a + 3];
         if (a != 255) {
            int a = Math.min((a << 8) / (255 - a), 255);
         }

         if (a != 255) {
            int a = Math.min((a << 8) / (255 - a), 255);
         }

         if (a != 255) {
            int a = Math.min((a << 8) / (255 - a), 255);
         }

         float a = a * (float)a / 255.0F;
         float a = 1.0F - a;
         a[a] = (int)(a * (float)a + a * (float)a);
         a[a + 1] = (int)(a * (float)a + a * (float)a);
         a[a + 2] = (int)(a * (float)a + a * (float)a);
         a[a + 3] = (int)((float)a * a + (float)a * a);
         a += 4;
      }

   }
}
