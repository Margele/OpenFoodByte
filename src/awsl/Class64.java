package awsl;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class64 extends Class193 {
   private float Field639 = 0.0F;
   private float Field640 = 1.0F;
   private float Field641 = 1.0F;
   private float Field642 = 0.0F;
   private float Field643 = 0.0F;
   private boolean Field644 = false;
   private boolean Field645 = true;

   public Class64() {
   }

   public Class64(float a, float a, float a, float a) {
      this.Field641 = a;
      this.Field639 = a;
      this.Field643 = a;
      this.Field642 = a;
   }

   public void Method56(float a) {
      this.Field639 = a;
   }

   public float Method57() {
      return this.Field639;
   }

   public void Method58(float a) {
      this.Field641 = a;
   }

   public float Method59() {
      return this.Field641;
   }

   public void Method60(float a) {
      this.Field643 = a;
   }

   public float Method61() {
      return this.Field643;
   }

   public void Method164(float a) {
      this.Field642 = a;
   }

   public float Method165() {
      return this.Field642;
   }

   public void Method87(boolean a) {
      this.Field644 = a;
   }

   public boolean Method88() {
      return this.Field644;
   }

   public void Method1282(boolean a) {
      this.Field645 = a;
   }

   public boolean Method1283() {
      return this.Field645;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      this.Method104(a, 0, 0, var4, var5, var6);
      float var8 = (float)Math.sin((double)this.Field639);
      float var9 = (float)Math.cos((double)this.Field639);
      int var11 = var4 / 2;
      int var12 = var5 / 2;
      int var13 = 0;
      float var14 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12));
      float var15 = (float)((double)this.Field641 * Math.cos((double)this.Field639));
      float var16 = (float)((double)this.Field641 * -Math.sin((double)this.Field639));
      float var17 = this.Field641 + Math.abs(this.Field643 * var14) + this.Field642 * var14;
      int var18 = (int)var17;
      AffineTransform var19 = new AffineTransform();
      Point2D.Float var20 = new Point2D.Float();
      if (this.Field645) {
         Class776.Method1727(var6, 0, var6.length);
      }

      int var21 = 0;
      if (var21 < var5) {
         int var22 = 0;
         if (var22 < var4) {
            int var23 = 0;
            int var24 = 0;
            int var25 = 0;
            int var26 = 0;
            int var27 = 0;
            int var28 = 0;
            if (var28 < var18) {
               label49: {
                  float var31 = (float)var28 / (float)var18;
                  var20.x = (float)var22;
                  var20.y = (float)var21;
                  var19.setToIdentity();
                  var19.translate((double)((float)var11 + var31 * var15), (double)((float)var12 + var31 * var16));
                  float var32 = 1.0F - this.Field642 * var31;
                  var19.scale((double)var32, (double)var32);
                  if (this.Field643 != 0.0F) {
                     var19.rotate((double)(-this.Field643 * var31));
                  }

                  var19.translate((double)(-var11), (double)(-var12));
                  var19.transform(var20, var20);
                  int var29 = (int)var20.x;
                  int var30 = (int)var20.y;
                  if (var29 >= var4) {
                     if (!this.Field644) {
                        break label49;
                     }

                     var29 = Class776.Method1715(var29, var4);
                  }

                  if (var30 >= var5) {
                     if (!this.Field644) {
                        break label49;
                     }

                     var30 = Class776.Method1715(var30, var5);
                  }

                  ++var27;
                  int var33 = var6[var30 * var4 + var29];
                  var23 += var33 >> 24 & 255;
                  var24 += var33 >> 16 & 255;
                  var25 += var33 >> 8 & 255;
                  var26 += var33 & 255;
                  ++var28;
               }
            }

            var7[var13] = var6[var13];
            var23 = Class767.Method1687(var23 / var27);
            var24 = Class767.Method1687(var24 / var27);
            var25 = Class767.Method1687(var25 / var27);
            var26 = Class767.Method1687(var26 / var27);
            var7[var13] = var23 << 24 | var24 << 16 | var25 << 8 | var26;
            ++var13;
            ++var22;
         }

         ++var21;
      }

      if (this.Field645) {
         Class776.Method1728(var7, 0, var6.length);
      }

      this.Method1267(a, 0, 0, var4, var5, var7);
      return a;
   }

   public String toString() {
      return "Blur/Motion Blur...";
   }
}
