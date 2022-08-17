package awsl;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.util.Hashtable;
import java.util.Random;

public class Class751 implements BufferedImageOp {
   private int Field3283 = 10;
   private float Field3284 = 0.1F;
   private int Field3285 = -7829368;
   private float Field3286 = 0.1F;
   private boolean Field3287 = true;
   private Random Field3288;

   public Class751() {
   }

   public Class751(int a, int a, float a, boolean a, float a) {
      this.Field3285 = a;
      this.Field3283 = a;
      this.Field3284 = a;
      this.Field3287 = a;
      this.Field3286 = a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] var6 = new int[var4];
      int[] var7 = new int[var4];
      this.Field3288 = new Random(0L);
      int var8 = this.Field3285 & -16777216;
      int var9 = this.Field3285 >> 16 & 255;
      int var10 = this.Field3285 >> 8 & 255;
      int var11 = this.Field3285 & 255;
      int var12 = 0;
      if (var12 < var5) {
         int var13 = 0;
         if (var13 < var4) {
            int var14 = var9;
            int var15 = var10;
            int var16 = var11;
            int var17;
            if (this.Field3286 != 0.0F) {
               var17 = (int)((double)(255.0F * this.Field3286) * Math.sin((double)var13 / (double)var4 * Math.PI));
               var14 = var9 + var17;
               var15 = var10 + var17;
               var16 = var11 + var17;
            }

            if (this.Field3287) {
               var17 = (int)(255.0F * (2.0F * this.Field3288.nextFloat() - 1.0F) * this.Field3284);
               var6[var13] = var8 | Method1613(var14 + var17) << 16 | Method1613(var15 + var17) << 8 | Method1613(var16 + var17);
            }

            var6[var13] = var8 | this.Method1612(var14) << 16 | this.Method1612(var15) << 8 | this.Method1612(var16);
            ++var13;
         }

         if (this.Field3283 != 0) {
            this.Method1615(var6, var7, var4, this.Field3283);
            this.Method1267(a, 0, var12, var4, 1, var7);
         }

         this.Method1267(a, 0, var12, var4, 1, var6);
         ++var12;
      }

      return a;
   }

   private int Method1612(int a) {
      a += (int)(255.0F * (2.0F * this.Field3288.nextFloat() - 1.0F) * this.Field3284);
      byte var2 = 0;
      return var2;
   }

   private static int Method1613(int a) {
      return 0;
   }

   private static int Method1614(int a, int a) {
      int var2 = a / a;
      a -= var2 * a;
      return a + a;
   }

   public void Method1615(int[] a, int[] a, int a, int a) {
      int var5 = a - 1;
      int var6 = 2 * a + 1;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      int var10;
      int var11;
      for(var10 = -a; var10 <= a; ++var10) {
         var11 = a[Method1614(var10, a)];
         var7 += var11 >> 16 & 255;
         var8 += var11 >> 8 & 255;
         var9 += var11 & 255;
      }

      for(var10 = 0; var10 < a; ++var10) {
         a[var10] = -16777216 | var7 / var6 << 16 | var8 / var6 << 8 | var9 / var6;
         var11 = var10 + a + 1;
         if (var11 > var5) {
            var11 = Method1614(var11, a);
         }

         int var12 = var10 - a;
         var12 = Method1614(var12, a);
         int var13 = a[var11];
         int var14 = a[var12];
         var7 += (var13 & 16711680) - (var14 & 16711680) >> 16;
         var8 += (var13 & '\uff00') - (var14 & '\uff00') >> 8;
         var9 += (var13 & 255) - (var14 & 255);
      }

   }

   public void Method9(int a) {
      this.Field3283 = a;
   }

   public int Method10() {
      return this.Field3283;
   }

   public void Method56(float a) {
      this.Field3284 = a;
   }

   public float Method57() {
      return this.Field3284;
   }

   public void Method58(float a) {
      this.Field3286 = a;
   }

   public float Method59() {
      return this.Field3286;
   }

   public void Method11(int a) {
      this.Field3285 = a;
   }

   public int Method12() {
      return this.Field3285;
   }

   public void Method1268(boolean a) {
      this.Field3287 = a;
   }

   public boolean Method1269() {
      return this.Field3287;
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

   private void Method1267(BufferedImage a, int a, int a, int a, int a, int[] a) {
      int var7 = a.getType();
      if (var7 != 2 && var7 != 1) {
         a.setRGB(a, a, a, a, a, 0, a);
      } else {
         a.getRaster().setDataElements(a, a, a, a, a);
      }

   }

   public String toString() {
      return "Texture/Brushed Metal...";
   }
}
