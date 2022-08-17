package awsl;

import java.awt.Color;
import java.awt.image.ColorModel;

class Class149 extends Class143 {
   private float[] Field1008 = new float[3];
   private float[] Field1009 = new float[3];

   public Class149(float a, ColorModel a, ColorModel a) {
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
         Color.RGBtoHSB(var7, var9, var11, this.Field1008);
         Color.RGBtoHSB(var8, var10, var12, this.Field1009);
         this.Field1009[0] = this.Field1008[0];
         this.Field1009[1] = this.Field1008[1];
         int var18 = Color.HSBtoRGB(this.Field1009[0], this.Field1009[1], this.Field1009[2]);
         int var15 = (var18 & 16711680) >> 16;
         int var16 = (var18 & '\uff00') >> 8;
         int var17 = var18 & 255;
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
