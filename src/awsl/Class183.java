package awsl;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;
import java.util.Hashtable;

public class Class183 extends Class193 {
   public static int Field1135 = 0;
   public static int Field1136 = 1;
   public static int Field1137 = 2;
   protected Kernel Field1138;
   protected boolean Field1139;
   protected boolean Field1140;
   private int Field1141;

   public Class183() {
      this(new float[9]);
   }

   public Class183(float[] a) {
      this(new Kernel(3, 3, a));
   }

   public Class183(int a, int a, float[] a) {
      this(new Kernel(a, a, a));
   }

   public Class183(Kernel a) {
      this.Field1138 = null;
      this.Field1139 = true;
      this.Field1140 = true;
      this.Field1141 = Field1136;
      this.Field1138 = a;
   }

   public void Method1280(Kernel a) {
      this.Field1138 = a;
   }

   public Kernel Method1281() {
      return this.Field1138;
   }

   public void Method9(int a) {
      this.Field1141 = a;
   }

   public int Method10() {
      return this.Field1141;
   }

   public void Method87(boolean a) {
      this.Field1139 = a;
   }

   public boolean Method88() {
      return this.Field1139;
   }

   public void Method1282(boolean a) {
      this.Field1140 = a;
   }

   public boolean Method1283() {
      return this.Field1140;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = new int[a * a];
      int[] a = new int[a * a];
      this.Method104(a, 0, 0, a, a, a);
      if (this.Field1140) {
         Class776.Method1727(a, 0, a.length);
      }

      Method1285(this.Field1138, a, a, a, a, this.Field1139, this.Field1141);
      if (this.Field1140) {
         Class776.Method1728(a, 0, a.length);
      }

      this.Method1267(a, 0, 0, a, a, a);
      return a;
   }

   public BufferedImage Method1263(BufferedImage a, ColorModel a) {
      a = a.getColorModel();
      return new BufferedImage(a, a.createCompatibleWritableRaster(a.getWidth(), a.getHeight()), a.isAlphaPremultiplied(), (Hashtable)null);
   }

   public Rectangle2D Method1264(BufferedImage a) {
      return new Rectangle(0, 0, a.getWidth(), a.getHeight());
   }

   public Point2D Method1265(Point2D a, Point2D a1) {
      Point2D a = new Point2D.Double();
      a.setLocation(a.getX(), a.getY());
      return a;
   }

   public RenderingHints Method1266() {
      return null;
   }

   public static void Method1284(Kernel a, int[] a, int[] a, int a, int a, int a) {
      Method1285(a, a, a, a, a, true, a);
   }

   public static void Method1285(Kernel a, int[] a, int[] a, int a, int a, boolean a, int a) {
      if (a.getHeight() == 1) {
         Method1287(a, a, a, a, a, a, a);
      } else if (a.getWidth() == 1) {
         Method1288(a, a, a, a, a, a, a);
      } else {
         Method1286(a, a, a, a, a, a, a);
      }

   }

   public static void Method1286(Kernel a, int[] a, int[] a, int a, int a, boolean a5, int a) {
      int a = 0;
      float[] a = a.getKernelData((float[])null);
      int a = a.getHeight();
      Class193.Method1269();
      int a = a.getWidth();
      int a = a / 2;
      int a = a / 2;
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            float a = 0.0F;
            float a = 0.0F;
            float a = 0.0F;
            float a = 0.0F;
            int a = -a;
            int a;
            int a;
            int a;
            if (a <= a) {
               a = a + a;
               int var10000;
               if (0 <= a && a < a) {
                  var10000 = a * a;
               }

               if (a == Field1136) {
                  var10000 = a * a;
               }

               if (a == Field1137) {
                  a = (a + a) % a * a;
                  a = a * (a + a) + a;
                  int a = -a;
                  if (a <= a) {
                     float a = a[a + a];
                     if (a != 0.0F) {
                        label70: {
                           int a = a + a;
                           if (0 > a || a >= a) {
                              if (a == Field1136) {
                                 ;
                              }

                              if (a != Field1137) {
                                 break label70;
                              }

                              a = (a + a) % a;
                           }

                           int a = a[a + a];
                           a += a * (float)(a >> 24 & 255);
                           a += a * (float)(a >> 16 & 255);
                           a += a * (float)(a >> 8 & 255);
                           a += a * (float)(a & 255);
                        }
                     }

                     ++a;
                  }
               }

               ++a;
            }

            a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            a[a++] = a << 24 | a << 16 | a << 8 | a;
            ++a;
         }

         ++a;
      }

   }

   public static void Method1287(Kernel a, int[] a, int[] a, int a, int a, boolean a5, int a) {
      int a = 0;
      float[] a = a.getKernelData((float[])null);
      int a = a.getWidth();
      int a = a / 2;

      for(int a = 0; a < a; ++a) {
         int a = a * a;

         for(int a = 0; a < a; ++a) {
            float a = 0.0F;
            float a = 0.0F;
            float a = 0.0F;
            float a = 0.0F;
            int a = a;

            int a;
            int a;
            int a;
            for(a = -a; a <= a; ++a) {
               float a = a[a + a];
               if (a != 0.0F) {
                  a = a + a;
                  if (a == Field1136) {
                     a = 0;
                  } else if (a == Field1137) {
                     a = (a + a) % a;
                  }

                  a = a[a + a];
                  a += a * (float)(a >> 24 & 255);
                  a += a * (float)(a >> 16 & 255);
                  a += a * (float)(a >> 8 & 255);
                  a += a * (float)(a & 255);
               }
            }

            a = Class767.Method1687((int)((double)a + 0.5));
            int a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            a[a++] = a << 24 | a << 16 | a << 8 | a;
         }
      }

   }

   public static void Method1288(Kernel a, int[] a, int[] a, int a, int a, boolean a5, int a) {
      int a = 0;
      float[] a = a.getKernelData((float[])null);
      int a = a.getHeight();
      int a = a / 2;

      for(int a = 0; a < a; ++a) {
         for(int a = 0; a < a; ++a) {
            float a = 0.0F;
            float a = 0.0F;
            float a = 0.0F;
            float a = 0.0F;

            int a;
            int a;
            int a;
            for(a = -a; a <= a; ++a) {
               a = a + a;
               if (a == Field1136) {
                  a = 0;
               } else if (a == Field1137) {
                  a = (a + a) % a * a;
               } else {
                  a = a * a;
               }

               float a = a[a + a];
               if (a != 0.0F) {
                  int a = a[a + a];
                  a += a * (float)(a >> 24 & 255);
                  a += a * (float)(a >> 16 & 255);
                  a += a * (float)(a >> 8 & 255);
                  a += a * (float)(a & 255);
               }
            }

            a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            a = Class767.Method1687((int)((double)a + 0.5));
            int a = Class767.Method1687((int)((double)a + 0.5));
            a[a++] = a << 24 | a << 16 | a << 8 | a;
         }
      }

   }

   public String toString() {
      return "Blur/Convolve...";
   }
}
