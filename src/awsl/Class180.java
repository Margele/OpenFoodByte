package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class180 extends Class187 {
   private float Field1129 = 0.5F;

   public Class180() {
      this.Field1150 = 2.0F;
   }

   public void Method58(float a) {
      this.Field1129 = a;
   }

   public float Method59() {
      return this.Field1129;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      a.getRGB(0, 0, var4, var5, var6, 0, var4);
      if (this.Field1150 > 0.0F) {
         Method1293(this.Field1151, var6, var7, var4, var5, this.Field1139, this.Field1139 && this.Field1140, false, Field1136);
         Method1293(this.Field1151, var7, var6, var5, var4, this.Field1139, false, this.Field1139 && this.Field1140, Field1136);
      }

      a.getRGB(0, 0, var4, var5, var7, 0, var4);
      float var8 = 4.0F * this.Field1129;
      int var9 = 0;
      int var10 = 0;
      if (var10 < var5) {
         int var11 = 0;
         if (var11 < var4) {
            int var12 = var7[var9];
            int var13 = var12 >> 16 & 255;
            int var14 = var12 >> 8 & 255;
            int var15 = var12 & 255;
            int var16 = var6[var9];
            int var17 = var16 >> 16 & 255;
            int var18 = var16 >> 8 & 255;
            int var19 = var16 & 255;
            var13 = Class767.Method1687((int)((float)var13 + var8 * (float)var17));
            var14 = Class767.Method1687((int)((float)var14 + var8 * (float)var18));
            var15 = Class767.Method1687((int)((float)var15 + var8 * (float)var19));
            var6[var9] = var12 & -16777216 | var13 << 16 | var14 << 8 | var15;
            ++var9;
            ++var11;
         }

         ++var10;
      }

      a.setRGB(0, 0, var4, var5, var6, 0, var4);
      return a;
   }

   public String toString() {
      return "Blur/Glow...";
   }
}
