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
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] var5 = new int[var3 * var4];
      int[] var6 = new int[var3 * var4];
      this.Method104(a, 0, 0, var3, var4, var5);
      if (this.Field1140) {
         Class776.Method1727(var5, 0, var5.length);
      }

      Method1285(this.Field1138, var5, var6, var3, var4, this.Field1139, this.Field1141);
      if (this.Field1140) {
         Class776.Method1728(var6, 0, var6.length);
      }

      this.Method1267(a, 0, 0, var3, var4, var6);
      return a;
   }

   public BufferedImage Method1263(BufferedImage a, ColorModel a) {
      a = a.getColorModel();
      return new BufferedImage(a, a.createCompatibleWritableRaster(a.getWidth(), a.getHeight()), a.isAlphaPremultiplied(), (Hashtable)null);
   }

   public Rectangle2D Method1264(BufferedImage a) {
      return new Rectangle(0, 0, a.getWidth(), a.getHeight());
   }

   public Point2D Method1265(Point2D a, Point2D a) {
      Point2D.Double var3 = new Point2D.Double();
      var3.setLocation(a.getX(), a.getY());
      return var3;
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

   public static void Method1286(Kernel a, int[] a, int[] a, int a, int a, boolean a, int a) {
      int var8 = 0;
      float[] var9 = a.getKernelData((float[])null);
      int var10 = a.getHeight();
      Class193.Method1269();
      int var11 = a.getWidth();
      int var12 = var10 / 2;
      int var13 = var11 / 2;
      int var14 = 0;
      if (var14 < a) {
         int var15 = 0;
         if (var15 < a) {
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            int var20 = -var12;
            int var21;
            int var22;
            int var23;
            if (var20 <= var12) {
               var21 = var14 + var20;
               int var10000;
               if (0 <= var21 && var21 < a) {
                  var10000 = var21 * a;
               }

               if (a == Field1136) {
                  var10000 = var14 * a;
               }

               if (a == Field1137) {
                  var22 = (var21 + a) % a * a;
                  var23 = var11 * (var20 + var12) + var13;
                  int var24 = -var13;
                  if (var24 <= var13) {
                     float var25 = var9[var23 + var24];
                     if (var25 != 0.0F) {
                        label70: {
                           int var26 = var15 + var24;
                           if (0 > var26 || var26 >= a) {
                              if (a == Field1136) {
                                 ;
                              }

                              if (a != Field1137) {
                                 break label70;
                              }

                              var26 = (var15 + a) % a;
                           }

                           int var27 = a[var22 + var26];
                           var19 += var25 * (float)(var27 >> 24 & 255);
                           var16 += var25 * (float)(var27 >> 16 & 255);
                           var17 += var25 * (float)(var27 >> 8 & 255);
                           var18 += var25 * (float)(var27 & 255);
                        }
                     }

                     ++var24;
                  }
               }

               ++var20;
            }

            var20 = Class767.Method1687((int)((double)var19 + 0.5));
            var21 = Class767.Method1687((int)((double)var16 + 0.5));
            var22 = Class767.Method1687((int)((double)var17 + 0.5));
            var23 = Class767.Method1687((int)((double)var18 + 0.5));
            a[var8++] = var20 << 24 | var21 << 16 | var22 << 8 | var23;
            ++var15;
         }

         ++var14;
      }

   }

   public static void Method1287(Kernel a, int[] a, int[] a, int a, int a, boolean a, int a) {
      int var7 = 0;
      float[] var8 = a.getKernelData((float[])null);
      int var9 = a.getWidth();
      int var10 = var9 / 2;

      for(int var11 = 0; var11 < a; ++var11) {
         int var12 = var11 * a;

         for(int var13 = 0; var13 < a; ++var13) {
            float var14 = 0.0F;
            float var15 = 0.0F;
            float var16 = 0.0F;
            float var17 = 0.0F;
            int var18 = var10;

            int var19;
            int var21;
            int var22;
            for(var19 = -var10; var19 <= var10; ++var19) {
               float var20 = var8[var18 + var19];
               if (var20 != 0.0F) {
                  var21 = var13 + var19;
                  if (a == Field1136) {
                     var21 = 0;
                  } else if (a == Field1137) {
                     var21 = (var13 + a) % a;
                  }

                  var22 = a[var12 + var21];
                  var17 += var20 * (float)(var22 >> 24 & 255);
                  var14 += var20 * (float)(var22 >> 16 & 255);
                  var15 += var20 * (float)(var22 >> 8 & 255);
                  var16 += var20 * (float)(var22 & 255);
               }
            }

            var19 = Class767.Method1687((int)((double)var17 + 0.5));
            int var23 = Class767.Method1687((int)((double)var14 + 0.5));
            var21 = Class767.Method1687((int)((double)var15 + 0.5));
            var22 = Class767.Method1687((int)((double)var16 + 0.5));
            a[var7++] = var19 << 24 | var23 << 16 | var21 << 8 | var22;
         }
      }

   }

   public static void Method1288(Kernel a, int[] a, int[] a, int a, int a, boolean a, int a) {
      int var7 = 0;
      float[] var8 = a.getKernelData((float[])null);
      int var9 = a.getHeight();
      int var10 = var9 / 2;

      for(int var11 = 0; var11 < a; ++var11) {
         for(int var12 = 0; var12 < a; ++var12) {
            float var13 = 0.0F;
            float var14 = 0.0F;
            float var15 = 0.0F;
            float var16 = 0.0F;

            int var17;
            int var18;
            int var19;
            for(var17 = -var10; var17 <= var10; ++var17) {
               var18 = var11 + var17;
               if (a == Field1136) {
                  var19 = 0;
               } else if (a == Field1137) {
                  var19 = (var11 + a) % a * a;
               } else {
                  var19 = var18 * a;
               }

               float var20 = var8[var17 + var10];
               if (var20 != 0.0F) {
                  int var21 = a[var19 + var12];
                  var16 += var20 * (float)(var21 >> 24 & 255);
                  var13 += var20 * (float)(var21 >> 16 & 255);
                  var14 += var20 * (float)(var21 >> 8 & 255);
                  var15 += var20 * (float)(var21 & 255);
               }
            }

            var17 = Class767.Method1687((int)((double)var16 + 0.5));
            var18 = Class767.Method1687((int)((double)var13 + 0.5));
            var19 = Class767.Method1687((int)((double)var14 + 0.5));
            int var22 = Class767.Method1687((int)((double)var15 + 0.5));
            a[var7++] = var17 << 24 | var18 << 16 | var19 << 8 | var22;
         }
      }

   }

   public String toString() {
      return "Blur/Convolve...";
   }
}
