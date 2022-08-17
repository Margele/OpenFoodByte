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
      PixelGrabber a = new PixelGrabber(a, 0, 0, -1, -1, (int[])null, 0, 0);

      try {
         a.grabPixels();
      } catch (InterruptedException var3) {
         throw new RuntimeException("Image fetch interrupted");
      }

      if ((a.status() & 128) != 0) {
         throw new RuntimeException("Image fetch aborted");
      } else if ((a.status() & 64) != 0) {
         throw new RuntimeException("Image fetch error");
      } else {
         BufferedImage a = new BufferedImage(a.getWidth(), a.getHeight(), 2);
         a.setRGB(0, 0, a.getWidth(), a.getHeight(), (int[])((int[])a.getPixels()), 0, a.getWidth());
         return a;
      }
   }

   public static BufferedImage Method836(Image a) {
      if (a instanceof BufferedImage && ((BufferedImage)a).getType() == 2) {
         return (BufferedImage)a;
      } else {
         BufferedImage a = new BufferedImage(a.getWidth((ImageObserver)null), a.getHeight((ImageObserver)null), 2);
         Graphics2D a = a.createGraphics();
         a.drawImage(a, 0, 0, (ImageObserver)null);
         a.dispose();
         return a;
      }
   }

   public static BufferedImage Method837(BufferedImage a, int a, int a, int a, int a) {
      BufferedImage a = new BufferedImage(a, a, 2);
      Graphics2D a = a.createGraphics();
      a.drawRenderedImage(a, AffineTransform.getTranslateInstance((double)(-a), (double)(-a)));
      a.dispose();
      return a;
   }

   public static BufferedImage Method838(BufferedImage a) {
      BufferedImage a = new BufferedImage(a.getWidth(), a.getHeight(), 2);
      Graphics2D a = a.createGraphics();
      a.drawRenderedImage(a, (AffineTransform)null);
      a.dispose();
      return a;
   }

   public static void Method839(Component a, Graphics a, int a, int a, int a, int a) {
      int a = Class193.Method1270();
      int a;
      if (Field3474 == null) {
         Field3474 = new BufferedImage(64, 64, 2);
         Graphics a = Field3474.createGraphics();
         int a = 0;
         if (a < 64) {
            a = 0;
            if (a < 64) {
               a.setColor(((a ^ a) & 8) != 0 ? Color.lightGray : Color.white);
               a.fillRect(a, a, 8, 8);
               a += 8;
            }

            a += 8;
         }

         a.dispose();
      }

      if (Field3474 != null) {
         Shape a = a.getClip();
         Rectangle a = a.getClipBounds();
         a = new Rectangle(a.getSize());
         a = a.intersection(new Rectangle(a, a, a, a));
         a.setClip(a);
         a = Field3474.getWidth();
         int a = Field3474.getHeight();
         if (a != -1 && a != -1) {
            int a = a.x / a * a;
            int a = a.y / a * a;
            int a = (a.x + a.width + a - 1) / a * a;
            int a = (a.y + a.height + a - 1) / a * a;
            if (a < a) {
               if (a < a) {
                  a.drawImage(Field3474, a, a, a);
                  a = a + a;
               }

               int var10000 = a + a;
            }
         }

         a.setClip(a);
      }

   }

   public static Rectangle Method840(BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      int a = 0;
      int a = 0;
      int a = a;
      int a = a;
      boolean a = false;
      int[] a = null;
      int a = a - 1;
      int[] a = Method842(a, 0, a, a, 1, (int[])a);

      int a;
      for(a = 0; a < a; ++a) {
         if ((a[a] & -16777216) != 0) {
            a = a;
            a = a;
            a = true;
            break;
         }
      }

      for(a = a - 1; a >= a; --a) {
         if ((a[a] & -16777216) != 0) {
            a = a;
            a = a;
            a = true;
            break;
         }
      }

      a = null;

      for(a = 0; a < a; ++a) {
         a = Method842(a, 0, a, a, 1, a);

         int a;
         for(a = 0; a < a; ++a) {
            if ((a[a] & -16777216) != 0) {
               a = a;
               if (a < a) {
                  a = a;
               }

               a = true;
               break;
            }
         }

         for(a = a - 1; a >= a; --a) {
            if ((a[a] & -16777216) != 0) {
               a = a;
               if (a < a) {
                  a = a;
               }

               a = true;
               break;
            }
         }
      }

      return new Rectangle(a, a, a - a + 1, a - a + 1);
   }

   public static void Method841(Raster a, WritableRaster a, Raster a) {
      int a = a.getMinX();
      int a = a.getMinY();
      int a = a.getWidth();
      int a = a.getHeight();
      int[] a = null;
      int[] a = null;
      int[] a = null;

      for(int a = 0; a < a; ++a) {
         a = a.getPixels(a, a, a, 1, a);
         a = a.getPixels(a, a, a, 1, a);
         a = a.getPixels(a, a, a, 1, a);
         int a = a;

         for(int a = 0; a < a; ++a) {
            int a = a[a];
            int a = a[a];
            int a = a[a + 1];
            int a = a[a + 1];
            int a = a[a + 2];
            int a = a[a + 2];
            int a = a[a + 3];
            int a = a[a + 3];
            float a = (float)a[a + 3] / 255.0F;
            float a = 1.0F - a;
            a[a] = (int)(a * (float)a + a * (float)a);
            a[a + 1] = (int)(a * (float)a + a * (float)a);
            a[a + 2] = (int)(a * (float)a + a * (float)a);
            a[a + 3] = (int)(a * (float)a + a * (float)a);
            a += 4;
         }

         a.setPixels(a, a, a, 1, a);
         ++a;
      }

   }

   public static int[] Method842(BufferedImage a, int a, int a, int a, int a, int[] a) {
      int a = a.getType();
      return a != 2 && a != 1 ? a.getRGB(a, a, a, a, a, 0, a) : (int[])((int[])a.getRaster().getDataElements(a, a, a, a, a));
   }

   public static void Method843(BufferedImage a, int a, int a, int a, int a, int[] a) {
      int a = a.getType();
      if (a != 2 && a != 1) {
         a.setRGB(a, a, a, a, a, 0, a);
      } else {
         a.getRaster().setDataElements(a, a, a, a, a);
      }

   }

   private static Exception Method844(Exception exception) {
      return exception;
   }
}
