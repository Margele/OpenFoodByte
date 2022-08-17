package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class179 extends Class187 {
   public Class179() {
      this.Field1150 = 10.0F;
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
      int var8 = 0;
      int var9 = 0;
      if (var9 < var5) {
         int var10 = 0;
         if (var10 < var4) {
            int var11 = var7[var8];
            int var12 = var11 >> 16 & 255;
            int var13 = var11 >> 8 & 255;
            int var14 = var11 & 255;
            int var15 = var6[var8];
            int var16 = var15 >> 16 & 255;
            int var17 = var15 >> 8 & 255;
            int var18 = var15 & 255;
            var12 = (var12 + 255 - var16) / 2;
            var13 = (var13 + 255 - var17) / 2;
            var14 = (var14 + 255 - var18) / 2;
            var6[var8] = var11 & -16777216 | var12 << 16 | var13 << 8 | var14;
            ++var8;
            ++var10;
         }

         ++var9;
      }

      a.setRGB(0, 0, var4, var5, var6, 0, var4);
      return a;
   }

   public String toString() {
      return "Blur/High Pass...";
   }
}
