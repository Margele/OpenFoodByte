package awsl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.PixelGrabber;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public abstract class Class779 {
   private static BufferedImage Field3474 = null;

   public static BufferedImage Method835(ImageProducer a) {
      PixelGrabber var1 = new PixelGrabber(a, 0, 0, -1, -1, (int[])null, 0, 0);

      try {
         var1.grabPixels();
      } catch (InterruptedException var3) {
         throw new RuntimeException("Image fetch interrupted");
      }

      if ((var1.status() & 128) != 0) {
         throw new RuntimeException("Image fetch aborted");
      } else if ((var1.status() & 64) != 0) {
         throw new RuntimeException("Image fetch error");
      } else {
         BufferedImage var2 = new BufferedImage(var1.getWidth(), var1.getHeight(), 2);
         var2.setRGB(0, 0, var1.getWidth(), var1.getHeight(), (int[])((int[])var1.getPixels()), 0, var1.getWidth());
         return var2;
      }
   }

   public static BufferedImage Method836(Image a) {
      if (a instanceof BufferedImage && ((BufferedImage)a).getType() == 2) {
         return (BufferedImage)a;
      } else {
         BufferedImage var1 = new BufferedImage(a.getWidth((ImageObserver)null), a.getHeight((ImageObserver)null), 2);
         Graphics2D var2 = var1.createGraphics();
         var2.drawImage(a, 0, 0, (ImageObserver)null);
         var2.dispose();
         return var1;
      }
   }

   public static BufferedImage Method837(BufferedImage a, int a, int a, int a, int a) {
      BufferedImage var5 = new BufferedImage(a, a, 2);
      Graphics2D var6 = var5.createGraphics();
      var6.drawRenderedImage(a, AffineTransform.getTranslateInstance((double)(-a), (double)(-a)));
      var6.dispose();
      return var5;
   }

   public static BufferedImage Method838(BufferedImage a) {
      BufferedImage var1 = new BufferedImage(a.getWidth(), a.getHeight(), 2);
      Graphics2D var2 = var1.createGraphics();
      var2.drawRenderedImage(a, (AffineTransform)null);
      var2.dispose();
      return var1;
   }

   public static void Method839(Component a, Graphics a, int a, int a, int a, int a) {
      boolean var6 = Class193.Method1270();
      int var9;
      if (Field3474 == null) {
         Field3474 = new BufferedImage(64, 64, 2);
         Graphics2D var7 = Field3474.createGraphics();
         int var8 = 0;
         if (var8 < 64) {
            var9 = 0;
            if (var9 < 64) {
               var7.setColor(((var9 ^ var8) & 8) != 0 ? Color.lightGray : Color.white);
               var7.fillRect(var9, var8, 8, 8);
               var9 += 8;
            }

            var8 += 8;
         }

         var7.dispose();
      }

      if (Field3474 != null) {
         Shape var15 = a.getClip();
         Rectangle var16 = a.getClipBounds();
         var16 = new Rectangle(a.getSize());
         var16 = var16.intersection(new Rectangle(a, a, a, a));
         a.setClip(var16);
         var9 = Field3474.getWidth();
         int var10 = Field3474.getHeight();
         if (var9 != -1 && var10 != -1) {
            int var11 = var16.x / var9 * var9;
            int var12 = var16.y / var10 * var10;
            int var13 = (var16.x + var16.width + var9 - 1) / var9 * var9;
            int var14 = (var16.y + var16.height + var10 - 1) / var10 * var10;
            if (var12 < var14) {
               if (var11 < var13) {
                  a.drawImage(Field3474, var11, var12, a);
                  a = var11 + var9;
               }

               int var10000 = var12 + var10;
            }
         }

         a.setClip(var15);
      }

   }

   public static Rectangle Method840(BufferedImage a) {
      int var1 = a.getWidth();
      int var2 = a.getHeight();
      int var3 = 0;
      int var4 = 0;
      int var5 = var1;
      int var6 = var2;
      boolean var7 = false;
      Object var9 = null;
      int var8 = var2 - 1;
      int[] var12 = Method842(a, 0, var8, var1, 1, (int[])var9);

      int var10;
      for(var10 = 0; var10 < var5; ++var10) {
         if ((var12[var10] & -16777216) != 0) {
            var5 = var10;
            var4 = var8;
            var7 = true;
            break;
         }
      }

      for(var10 = var1 - 1; var10 >= var3; --var10) {
         if ((var12[var10] & -16777216) != 0) {
            var3 = var10;
            var4 = var8;
            var7 = true;
            break;
         }
      }

      var12 = null;

      for(var10 = 0; var10 < var8; ++var10) {
         var12 = Method842(a, 0, var10, var1, 1, var12);

         int var11;
         for(var11 = 0; var11 < var5; ++var11) {
            if ((var12[var11] & -16777216) != 0) {
               var5 = var11;
               if (var10 < var6) {
                  var6 = var10;
               }

               var7 = true;
               break;
            }
         }

         for(var11 = var1 - 1; var11 >= var3; --var11) {
            if ((var12[var11] & -16777216) != 0) {
               var3 = var11;
               if (var10 < var6) {
                  var6 = var10;
               }

               var7 = true;
               break;
            }
         }
      }

      return new Rectangle(var5, var6, var3 - var5 + 1, var4 - var6 + 1);
   }

   public static void Method841(Raster a, WritableRaster a, Raster a) {
      int var3 = a.getMinX();
      int var4 = a.getMinY();
      int var5 = a.getWidth();
      int var6 = a.getHeight();
      int[] var7 = null;
      int[] var8 = null;
      int[] var9 = null;

      for(int var10 = 0; var10 < var6; ++var10) {
         var7 = a.getPixels(var3, var4, var5, 1, var7);
         var8 = a.getPixels(var3, var4, var5, 1, var8);
         var9 = a.getPixels(var3, var4, var5, 1, var9);
         int var11 = var3;

         for(int var12 = 0; var12 < var5; ++var12) {
            int var13 = var7[var11];
            int var14 = var9[var11];
            int var15 = var7[var11 + 1];
            int var16 = var9[var11 + 1];
            int var17 = var7[var11 + 2];
            int var18 = var9[var11 + 2];
            int var19 = var7[var11 + 3];
            int var20 = var9[var11 + 3];
            float var21 = (float)var8[var11 + 3] / 255.0F;
            float var22 = 1.0F - var21;
            var9[var11] = (int)(var21 * (float)var13 + var22 * (float)var14);
            var9[var11 + 1] = (int)(var21 * (float)var15 + var22 * (float)var16);
            var9[var11 + 2] = (int)(var21 * (float)var17 + var22 * (float)var18);
            var9[var11 + 3] = (int)(var21 * (float)var19 + var22 * (float)var20);
            var11 += 4;
         }

         a.setPixels(var3, var4, var5, 1, var9);
         ++var4;
      }

   }

   public static int[] Method842(BufferedImage a, int a, int a, int a, int a, int[] a) {
      int var6 = a.getType();
      return var6 != 2 && var6 != 1 ? a.getRGB(a, a, a, a, a, 0, a) : (int[])((int[])a.getRaster().getDataElements(a, a, a, a, a));
   }

   public static void Method843(BufferedImage a, int a, int a, int a, int a, int[] a) {
      int var6 = a.getType();
      if (var6 != 2 && var6 != 1) {
         a.setRGB(a, a, a, a, a, 0, a);
      } else {
         a.getRaster().setDataElements(a, a, a, a, a);
      }

   }

   private static Exception Method844(Exception exception) {
      return exception;
   }
}
