package awsl;

import java.awt.Color;
import java.awt.image.ColorModel;

class Class135 extends Class143 {
   private float[] Field985 = new float[3];
   private float[] Field986 = new float[3];

   public Class135(float a, ColorModel a, ColorModel a) {
      super(a, a, a);
   }

   public void Method380(int[] a, int[] a, float a) {
      int a = a.length;
      Class236.Method2106();
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
         Color.RGBtoHSB(a, a, a, this.Field985);
         Color.RGBtoHSB(a, a, a, this.Field986);
         this.Field986[0] = this.Field985[0];
         int a = Color.HSBtoRGB(this.Field986[0], this.Field986[1], this.Field986[2]);
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
