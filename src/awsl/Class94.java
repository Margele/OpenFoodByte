package awsl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Class94 extends Class193 {
   private float Field810 = 1.0F;
   private float Field811 = 2.0F;
   private boolean Field812 = true;
   private boolean Field813;

   public void Method56(float a) {
      this.Field810 = a;
   }

   public float Method57() {
      return this.Field810;
   }

   public void Method58(float a) {
      this.Field811 = a;
   }

   public float Method59() {
      return this.Field811;
   }

   public void Method87(boolean a) {
      this.Field812 = a;
   }

   public boolean Method88() {
      return this.Field812;
   }

   public void Method1282(boolean a) {
      this.Field813 = a;
   }

   public boolean Method1283() {
      return this.Field813;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      BufferedImage var6 = (new Class196(this.Field810, this.Field810, 3)).Method62(a, (BufferedImage)null);
      BufferedImage var7 = (new Class196(this.Field811, this.Field811, 3)).Method62(a, (BufferedImage)null);
      Class193.Method1270();
      Graphics2D var8 = var7.createGraphics();
      var8.setComposite(new Class147(1.0F));
      var8.drawImage(var6, 0, 0, (ImageObserver)null);
      var8.dispose();
      if (this.Field812 && this.Field810 != this.Field811) {
         int[] var9 = null;
         int var10 = 0;
         int var11 = 0;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if (var11 < var5) {
            var9 = this.Method104(var7, 0, var11, var4, 1, var9);
            var12 = 0;
            if (var12 < var4) {
               var13 = var9[var12];
               var14 = var13 >> 16 & 255;
               var15 = var13 >> 8 & 255;
               var16 = var13 & 255;
               if (var14 > var10) {
                  var10 = var14;
               }

               if (var15 > var10) {
                  var10 = var15;
               }

               if (var16 > var10) {
                  var10 = var16;
               }

               ++var12;
            }

            ++var11;
         }

         byte var17 = 0;
         if (var17 < var5) {
            var9 = this.Method104(var7, 0, var17, var4, 1, var9);
            byte var18 = 0;
            if (var18 < var4) {
               var13 = var9[var18];
               var14 = var13 >> 16 & 255;
               var15 = var13 >> 8 & 255;
               var16 = var13 & 255;
               var14 = var14 * 255 / var10;
               var15 = var15 * 255 / var10;
               var16 = var16 * 255 / var10;
               var9[var18] = var13 & -16777216 | var14 << 16 | var15 << 8 | var16;
               var12 = var18 + 1;
            }

            this.Method1267(var7, 0, var17, var4, 1, var9);
            var11 = var17 + 1;
         }
      }

      if (this.Field813) {
         var7 = (new Class100()).Method62(var7, var7);
      }

      return var7;
   }

   public String toString() {
      return "Edges/Difference of Gaussians...";
   }
}
