package awsl;

import java.awt.Color;
import java.awt.CompositeContext;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import obfuscate.a;

public class Class237 implements CompositeContext {
   private int Field1301;
   private float Field1302;
   private ColorModel Field1303;
   private ColorModel Field1304;
   private ColorSpace Field1305;
   private ColorSpace Field1306;
   private boolean Field1307;
   private boolean Field1308;

   public Class237(int a, float a, ColorModel a, ColorModel a) {
      this.Field1301 = a;
      this.Field1302 = a;
      this.Field1303 = a;
      this.Field1304 = a;
      this.Field1305 = a.getColorSpace();
      this.Field1306 = a.getColorSpace();
      ColorModel a = ColorModel.getRGBdefault();
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

   public void Method1437(Raster a, Raster a, WritableRaster a) {
      float a = 0.0F;
      float a = 0.0F;
      float a = this.Field1302;
      float[] a = null;
      Class236.Method2106();
      float[] a = null;
      float[] a = null;
      switch (this.Field1301) {
         case 12:
         case 13:
         case 14:
         case 15:
            a = new float[3];
            a = new float[3];
            a = new float[3];
      }

      int[] a = null;
      int[] a = null;
      int a = a.getMinX();
      int a = a.getWidth();
      int a = a.getMinY();
      int a = a + a.getHeight();
      if (a < a) {
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         int a = 0;
         int a = a * 4;
         if (a < a) {
            int a = a[a];
            int a = a[a];
            int a = a[a + 1];
            int a = a[a + 1];
            int a = a[a + 2];
            int a = a[a + 2];
            int a = a[a + 3];
            int a = a[a + 3];
            int a;
            int var10000;
            int a;
            int a;
            int a;
            boolean a;
            switch (this.Field1301) {
               case 1:
               default:
                  a = a + a;
                  if (a > 255) {
                     a = 255;
                  }

                  a = a + a;
                  if (a > 255) {
                     a = 255;
                  }

                  a = a + a;
                  if (a <= 255) {
                     break;
                  }

                  a = true;
                  a.trash(new String[2]);
               case 2:
                  a = a - a;
                  int a = false;
                  a = a - a;
                  int a = false;
                  a = a - a;
                  a = false;
               case 3:
                  a = a - a;
                  a = -a;
                  a = a - a;
                  a = -a;
                  a = a - a;
                  a = -a;
               case 4:
                  a = a * a + 128;
                  a = (a >> 8) + a >> 8;
                  a = a * a + 128;
                  a = (a >> 8) + a >> 8;
                  a = a * a + 128;
                  a = (a >> 8) + a >> 8;
               case 8:
                  a = (255 - a) * (255 - a) + 128;
                  a = 255 - ((a >> 8) + a >> 8);
                  a = (255 - a) * (255 - a) + 128;
                  a = 255 - ((a >> 8) + a >> 8);
                  a = (255 - a) * (255 - a) + 128;
                  a = 255 - ((a >> 8) + a >> 8);
               case 16:
                  if (a < 128) {
                     a = a * a + 128;
                     a = 2 * ((a >> 8) + a >> 8);
                  }

                  a = (255 - a) * (255 - a) + 128;
                  a = 2 * (255 - ((a >> 8) + a >> 8));
                  if (a < 128) {
                     a = a * a + 128;
                     a = 2 * ((a >> 8) + a >> 8);
                  }

                  a = (255 - a) * (255 - a) + 128;
                  a = 2 * (255 - ((a >> 8) + a >> 8));
                  if (a < 128) {
                     a = a * a + 128;
                     a = 2 * ((a >> 8) + a >> 8);
                  }

                  a = (255 - a) * (255 - a) + 128;
                  a = 2 * (255 - ((a >> 8) + a >> 8));
               case 5:
                  a = a < a ? a : a;
                  a = a < a ? a : a;
                  a = a < a ? a : a;
               case 9:
                  a = a > a ? a : a;
                  a = a > a ? a : a;
                  a = a > a ? a : a;
               case 22:
                  a = (a + a) / 2;
                  a = (a + a) / 2;
                  a = (a + a) / 2;
               case 12:
               case 13:
               case 14:
               case 15:
                  Color.RGBtoHSB(a, a, a, a);
                  Color.RGBtoHSB(a, a, a, a);
                  switch (this.Field1301) {
                     case 12:
                        a[0] = a[0];
                        a[1] = a[1];
                        a[2] = a[2];
                     case 13:
                        a[0] = a[0];
                        a[1] = a[1];
                        a[2] = a[2];
                     case 14:
                        a[0] = a[0];
                        a[1] = a[1];
                        a[2] = a[2];
                     case 15:
                        a[0] = a[0];
                        a[1] = a[1];
                        a[2] = a[2];
                     default:
                        int a = Color.HSBtoRGB(a[0], a[1], a[2]);
                        a = (a & 16711680) >> 16;
                        a = (a & '\uff00') >> 8;
                        a = a & 255;
                  }
               case 6:
                  if (a != 255) {
                     a = Method1436(255 - (255 - a << 8) / (a + 1));
                  }

                  if (a != 255) {
                     a = Method1436(255 - (255 - a << 8) / (a + 1));
                  }

                  if (a != 255) {
                     a = Method1436(255 - (255 - a << 8) / (a + 1));
                  }
               case 7:
                  a = Math.max(255 - (255 - a << 8) / a, 0);
                  a = Math.max(255 - (255 - a << 8) / a, 0);
                  a = Math.max(255 - (255 - a << 8) / a, 0);
               case 10:
                  Method1436((a << 8) / (256 - a));
                  Method1436((a << 8) / (256 - a));
                  Method1436((a << 8) / (256 - a));
               case 11:
                  if (a != 255) {
                     a = Math.min((a << 8) / (255 - a), 255);
                  }

                  if (a != 255) {
                     a = Math.min((a << 8) / (255 - a), 255);
                  }

                  if (a != 255) {
                     a = Math.min((a << 8) / (255 - a), 255);
                  }
               case 17:
                  int a = Method1435(a, a);
                  var10000 = a + Method1435(a, 255 - Method1435(255 - a, 255 - a) - a);
                  a = Method1435(a, a);
                  var10000 = a + Method1435(a, 255 - Method1435(255 - a, 255 - a) - a);
                  a = Method1435(a, a);
                  var10000 = a + Method1435(a, 255 - Method1435(255 - a, 255 - a) - a);
               case 18:
                  if (a > 127) {
                     a = 255 - 2 * Method1435(255 - a, 255 - a);
                  }

                  a = 2 * Method1435(a, a);
                  if (a > 127) {
                     a = 255 - 2 * Method1435(255 - a, 255 - a);
                  }

                  a = 2 * Method1435(a, a);
                  if (a > 127) {
                     a = 255 - 2 * Method1435(255 - a, 255 - a);
                  }

                  a = 2 * Method1435(a, a);
               case 19:
                  if (a > 127) {
                     Math.max(a, a);
                  } else {
                     Math.min(a, a);
                  }

                  if (a > 127) {
                     Math.max(a, a);
                  } else {
                     Math.min(a, a);
                  }

                  if (a > 127) {
                     Math.max(a, a);
                  } else {
                     Math.min(a, a);
                  }
               case 20:
                  var10000 = a + Method1435(a, 255 - a - a);
                  var10000 = a + Method1435(a, 255 - a - a);
                  var10000 = a + Method1435(a, 255 - a - a);
               case 21:
                  a = 255 - Math.abs(255 - a - a);
                  a = 255 - Math.abs(255 - a - a);
                  a = 255 - Math.abs(255 - a - a);
            }

            a = a * (float)a / 255.0F;
            a = 1.0F - a;
            a[a] = (int)(a * (float)a + a * (float)a);
            a[a + 1] = (int)(a * (float)a + a * (float)a);
            a[a + 2] = (int)(a * (float)a + a * (float)a);
            a[a + 3] = (int)((float)a * a + (float)a * a);
            a += 4;
         }

         a.setPixels(a, a, a, 1, a);
         int var18 = a + 1;
      }

   }
}
