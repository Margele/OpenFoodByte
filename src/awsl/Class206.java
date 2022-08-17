package awsl;

import java.awt.Color;
import java.awt.image.ColorModel;

class Class206 extends Class143 {
   private float[] Field1176 = new float[3];
   private float[] Field1177 = new float[3];

   public Class206(float a, ColorModel a, ColorModel a) {
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
         Color.RGBtoHSB(a, a, a, this.Field1176);
         Color.RGBtoHSB(a, a, a, this.Field1177);
         this.Field1177[1] = this.Field1176[1];
         int a = Color.HSBtoRGB(this.Field1177[0], this.Field1177[1], this.Field1177[2]);
         int a = (a & 16711680) >> 16;
         int a = (a & '\uff00') >> 8;
         int a = a & 255;
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
