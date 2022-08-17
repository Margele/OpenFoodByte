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
      ColorModel var5 = ColorModel.getRGBdefault();
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

   public void Method1437(Raster a, Raster a, WritableRaster a) {
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = this.Field1302;
      float[] var9 = null;
      Class236.Method2106();
      float[] var10 = null;
      float[] var11 = null;
      switch (this.Field1301) {
         case 12:
         case 13:
         case 14:
         case 15:
            var9 = new float[3];
            var10 = new float[3];
            var11 = new float[3];
      }

      Object var12 = null;
      Object var13 = null;
      int var14 = a.getMinX();
      int var15 = a.getWidth();
      int var16 = a.getMinY();
      int var17 = var16 + a.getHeight();
      if (var16 < var17) {
         int[] var35 = a.getPixels(var14, var16, var15, 1, (int[])var12);
         int[] var36 = a.getPixels(var14, var16, var15, 1, (int[])var13);
         int var19 = 0;
         int var20 = var15 * 4;
         if (var19 < var20) {
            int var21 = var35[var19];
            int var22 = var36[var19];
            int var23 = var35[var19 + 1];
            int var24 = var36[var19 + 1];
            int var25 = var35[var19 + 2];
            int var26 = var36[var19 + 2];
            int var27 = var35[var19 + 3];
            int var28 = var36[var19 + 3];
            int var8;
            int var10000;
            int var29;
            int var30;
            int var31;
            boolean var39;
            switch (this.Field1301) {
               case 1:
               default:
                  var29 = var22 + var21;
                  if (var29 > 255) {
                     var29 = 255;
                  }

                  var30 = var24 + var23;
                  if (var30 > 255) {
                     var30 = 255;
                  }

                  var31 = var26 + var25;
                  if (var31 <= 255) {
                     break;
                  }

                  var39 = true;
                  a.trash(new String[2]);
               case 2:
                  var29 = var22 - var21;
                  boolean var37 = false;
                  var30 = var24 - var23;
                  boolean var38 = false;
                  var31 = var26 - var25;
                  var39 = false;
               case 3:
                  var29 = var22 - var21;
                  var29 = -var29;
                  var30 = var24 - var23;
                  var30 = -var30;
                  var31 = var26 - var25;
                  var31 = -var31;
               case 4:
                  var8 = var22 * var21 + 128;
                  var29 = (var8 >> 8) + var8 >> 8;
                  var8 = var24 * var23 + 128;
                  var30 = (var8 >> 8) + var8 >> 8;
                  var8 = var26 * var25 + 128;
                  var31 = (var8 >> 8) + var8 >> 8;
               case 8:
                  var8 = (255 - var22) * (255 - var21) + 128;
                  var29 = 255 - ((var8 >> 8) + var8 >> 8);
                  var8 = (255 - var24) * (255 - var23) + 128;
                  var30 = 255 - ((var8 >> 8) + var8 >> 8);
                  var8 = (255 - var26) * (255 - var25) + 128;
                  var31 = 255 - ((var8 >> 8) + var8 >> 8);
               case 16:
                  if (var22 < 128) {
                     var8 = var22 * var21 + 128;
                     var29 = 2 * ((var8 >> 8) + var8 >> 8);
                  }

                  var8 = (255 - var22) * (255 - var21) + 128;
                  var29 = 2 * (255 - ((var8 >> 8) + var8 >> 8));
                  if (var24 < 128) {
                     var8 = var24 * var23 + 128;
                     var30 = 2 * ((var8 >> 8) + var8 >> 8);
                  }

                  var8 = (255 - var24) * (255 - var23) + 128;
                  var30 = 2 * (255 - ((var8 >> 8) + var8 >> 8));
                  if (var26 < 128) {
                     var8 = var26 * var25 + 128;
                     var31 = 2 * ((var8 >> 8) + var8 >> 8);
                  }

                  var8 = (255 - var26) * (255 - var25) + 128;
                  var31 = 2 * (255 - ((var8 >> 8) + var8 >> 8));
               case 5:
                  var29 = var22 < var21 ? var22 : var21;
                  var30 = var24 < var23 ? var24 : var23;
                  var31 = var26 < var25 ? var26 : var25;
               case 9:
                  var29 = var22 > var21 ? var22 : var21;
                  var30 = var24 > var23 ? var24 : var23;
                  var31 = var26 > var25 ? var26 : var25;
               case 22:
                  var29 = (var22 + var21) / 2;
                  var30 = (var24 + var23) / 2;
                  var31 = (var26 + var25) / 2;
               case 12:
               case 13:
               case 14:
               case 15:
                  Color.RGBtoHSB(var21, var23, var25, var9);
                  Color.RGBtoHSB(var22, var24, var26, var10);
                  switch (this.Field1301) {
                     case 12:
                        var11[0] = var9[0];
                        var11[1] = var10[1];
                        var11[2] = var10[2];
                     case 13:
                        var11[0] = var10[0];
                        var11[1] = var9[1];
                        var11[2] = var10[2];
                     case 14:
                        var11[0] = var10[0];
                        var11[1] = var10[1];
                        var11[2] = var9[2];
                     case 15:
                        var11[0] = var9[0];
                        var11[1] = var9[1];
                        var11[2] = var10[2];
                     default:
                        int var33 = Color.HSBtoRGB(var11[0], var11[1], var11[2]);
                        var29 = (var33 & 16711680) >> 16;
                        var30 = (var33 & '\uff00') >> 8;
                        var31 = var33 & 255;
                  }
               case 6:
                  if (var22 != 255) {
                     var29 = Method1436(255 - (255 - var21 << 8) / (var22 + 1));
                  }

                  if (var24 != 255) {
                     var30 = Method1436(255 - (255 - var23 << 8) / (var24 + 1));
                  }

                  if (var26 != 255) {
                     var31 = Method1436(255 - (255 - var25 << 8) / (var26 + 1));
                  }
               case 7:
                  var29 = Math.max(255 - (255 - var22 << 8) / var21, 0);
                  var30 = Math.max(255 - (255 - var24 << 8) / var23, 0);
                  var31 = Math.max(255 - (255 - var26 << 8) / var25, 0);
               case 10:
                  Method1436((var21 << 8) / (256 - var22));
                  Method1436((var23 << 8) / (256 - var24));
                  Method1436((var25 << 8) / (256 - var26));
               case 11:
                  if (var21 != 255) {
                     var29 = Math.min((var22 << 8) / (255 - var21), 255);
                  }

                  if (var23 != 255) {
                     var30 = Math.min((var24 << 8) / (255 - var23), 255);
                  }

                  if (var25 != 255) {
                     var31 = Math.min((var26 << 8) / (255 - var25), 255);
                  }
               case 17:
                  int var34 = Method1435(var21, var22);
                  var10000 = var34 + Method1435(var22, 255 - Method1435(255 - var22, 255 - var21) - var34);
                  var34 = Method1435(var23, var24);
                  var10000 = var34 + Method1435(var24, 255 - Method1435(255 - var24, 255 - var23) - var34);
                  var34 = Method1435(var25, var26);
                  var10000 = var34 + Method1435(var26, 255 - Method1435(255 - var26, 255 - var25) - var34);
               case 18:
                  if (var21 > 127) {
                     var29 = 255 - 2 * Method1435(255 - var21, 255 - var22);
                  }

                  var29 = 2 * Method1435(var21, var22);
                  if (var23 > 127) {
                     var30 = 255 - 2 * Method1435(255 - var23, 255 - var24);
                  }

                  var30 = 2 * Method1435(var23, var24);
                  if (var25 > 127) {
                     var31 = 255 - 2 * Method1435(255 - var25, 255 - var26);
                  }

                  var31 = 2 * Method1435(var25, var26);
               case 19:
                  if (var21 > 127) {
                     Math.max(var21, var22);
                  } else {
                     Math.min(var21, var22);
                  }

                  if (var23 > 127) {
                     Math.max(var23, var24);
                  } else {
                     Math.min(var23, var24);
                  }

                  if (var25 > 127) {
                     Math.max(var25, var26);
                  } else {
                     Math.min(var25, var26);
                  }
               case 20:
                  var10000 = var22 + Method1435(var21, 255 - var22 - var22);
                  var10000 = var24 + Method1435(var23, 255 - var24 - var24);
                  var10000 = var26 + Method1435(var25, 255 - var26 - var26);
               case 21:
                  var29 = 255 - Math.abs(255 - var21 - var22);
                  var30 = 255 - Math.abs(255 - var23 - var24);
                  var31 = 255 - Math.abs(255 - var25 - var26);
            }

            var5 = var7 * (float)var27 / 255.0F;
            var6 = 1.0F - var5;
            var36[var19] = (int)(var5 * (float)var29 + var6 * (float)var22);
            var36[var19 + 1] = (int)(var5 * (float)var30 + var6 * (float)var24);
            var36[var19 + 2] = (int)(var5 * (float)var31 + var6 * (float)var26);
            var36[var19 + 3] = (int)((float)var27 * var7 + (float)var28 * var6);
            var19 += 4;
         }

         a.setPixels(var14, var16, var15, 1, var36);
         int var18 = var16 + 1;
      }

   }
}
