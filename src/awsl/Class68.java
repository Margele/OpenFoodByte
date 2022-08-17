package awsl;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class68 extends Class70 {
   private float Field659 = 1.0F;
   private float Field660 = 0.0F;
   private float Field661 = 0.5F;
   private boolean Field662 = false;
   private Class755 Field663;

   public void Method170(float a) {
      this.Field659 = a;
   }

   public float Method171() {
      return this.Field659;
   }

   public void Method172(float a) {
      this.Field660 = a;
   }

   public float Method173() {
      return this.Field660;
   }

   public void Method174(float a) {
      this.Field661 = a;
   }

   public float Method175() {
      return this.Field661;
   }

   public void Method87(boolean a) {
      this.Field662 = a;
   }

   public boolean Method88() {
      return this.Field662;
   }

   public void Method176(Class755 a) {
      this.Field663 = a;
   }

   public Class755 Method177() {
      return this.Field663;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int[] var6 = new int[var4];
      int[] var7 = new int[var4];
      BufferedImage var8 = new BufferedImage(var4, var5, 2);
      int var9 = (int)(this.Field660 * 3.0F * 255.0F);
      int var10 = 0;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      if (var10 < var5) {
         this.Method104(a, 0, var10, var4, 1, var6);
         var11 = 0;
         if (var11 < var4) {
            var12 = var6[var11];
            var13 = var12 & -16777216;
            var14 = var12 >> 16 & 255;
            var15 = var12 >> 8 & 255;
            var16 = var12 & 255;
            var17 = var14 + var15 + var16;
            if (var17 < var9) {
               var6[var11] = -16777216;
            }

            var17 /= 3;
            var6[var11] = var13 | var17 << 16 | var17 << 8 | var17;
            ++var11;
         }

         this.Method1267(var8, 0, var10, var4, 1, var6);
         ++var10;
      }

      var8 = super.Method62(var8, (BufferedImage)null);
      byte var18 = 0;
      if (var18 < var5) {
         this.Method104(var8, 0, var18, var4, 1, var6);
         this.Method104(a, 0, var18, var4, 1, var7);
         byte var20 = 0;
         if (var20 < var4) {
            var12 = var6[var20];
            var13 = var12 & -16777216;
            var14 = var12 >> 16 & 255;
            var15 = var12 >> 8 & 255;
            var16 = var12 & 255;
            if (this.Field663 != null) {
               var17 = var14 + var15 + var16;
               this.Field663.Method283((float)var17 * this.Field661 * 0.33333334F);
            }

            var14 = Class767.Method1687((int)((float)var14 * this.Field661));
            var15 = Class767.Method1687((int)((float)var15 * this.Field661));
            var16 = Class767.Method1687((int)((float)var16 * this.Field661));
            var12 = var13 | var14 << 16 | var15 << 8 | var16;
            var6[var20] = var12;
            var11 = var20 + 1;
         }

         this.Method1267(var8, 0, var18, var4, 1, var6);
         var10 = var18 + 1;
      }

      a = this.Method1263(a, (ColorModel)null);
      Graphics2D var19 = a.createGraphics();
      if (!this.Field662) {
         var19.setComposite(AlphaComposite.SrcOver);
         var19.drawRenderedImage(a, (AffineTransform)null);
      }

      var19.setComposite(Class239.Method2275(1, this.Field659));
      var19.drawRenderedImage(var8, (AffineTransform)null);
      var19.dispose();
      return a;
   }

   public String toString() {
      return "Stylize/Rays...";
   }
}
