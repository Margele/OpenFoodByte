package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class75 extends Class193 {
   private float Field693 = 0.1F;
   private boolean Field694;
   private boolean Field695;
   private BufferedImage Field696;

   public void Method56(float a) {
      this.Field693 = a;
   }

   public float Method57() {
      return this.Field693;
   }

   public void Method1271(BufferedImage a) {
      this.Field696 = a;
   }

   public BufferedImage Method1272() {
      return this.Field696;
   }

   public void Method87(boolean a) {
      this.Field694 = a;
   }

   public boolean Method88() {
      return this.Field694;
   }

   public void Method1282(boolean a) {
      this.Field695 = a;
   }

   public boolean Method1283() {
      return this.Field695;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      if (this.Field696 == null) {
         return a;
      } else {
         int var6 = this.Field696.getWidth();
         int var7 = this.Field696.getHeight();
         float var8 = 255.0F * this.Field693;
         int[] var9 = new int[var4];
         int[] var10 = new int[var6];
         int var11 = 0;
         if (var11 < var5) {
            this.Method104(a, 0, var11, var4, 1, var9);
            this.Method104(this.Field696, 0, var11 % var7, var6, 1, var10);
            int var12 = 0;
            if (var12 < var4) {
               int var13 = var10[var12 % var6];
               int var14 = var9[var12];
               if (this.Field694) {
                  var13 ^= 16777215;
               }

               int var15;
               int var16;
               int var18;
               if (this.Field695) {
                  var15 = Class767.Method1689(var13);
                  var16 = Class767.Method1689(var14);
                  float var17 = 1.0F - Class776.Method1708((float)var16 - var8, (float)var16 + var8, (float)var15);
                  var18 = (int)(255.0F * var17);
                  var9[var12] = var14 & -16777216 | var18 << 16 | var18 << 8 | var18;
               }

               var15 = var14 >> 16 & 255;
               var16 = var14 >> 8 & 255;
               int var24 = var14 & 255;
               var18 = var13 >> 16 & 255;
               int var19 = var13 >> 8 & 255;
               int var20 = var13 & 255;
               int var21 = (int)(255.0F * (1.0F - Class776.Method1708((float)var15 - var8, (float)var15 + var8, (float)var18)));
               int var22 = (int)(255.0F * (1.0F - Class776.Method1708((float)var16 - var8, (float)var16 + var8, (float)var19)));
               int var23 = (int)(255.0F * (1.0F - Class776.Method1708((float)var24 - var8, (float)var24 + var8, (float)var20)));
               var9[var12] = var14 & -16777216 | var21 << 16 | var22 << 8 | var23;
               ++var12;
            }

            this.Method1267(a, 0, var11, var4, 1, var9);
            ++var11;
         }

         return a;
      }
   }

   public String toString() {
      return "Stylize/Halftone...";
   }
}
