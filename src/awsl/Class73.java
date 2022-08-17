package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class73 extends Class193 {
   private BufferedImage Field690;
   private float Field691;

   public void Method1271(BufferedImage a) {
      this.Field690 = a;
   }

   public BufferedImage Method1272() {
      return this.Field690;
   }

   public void Method56(float a) {
      this.Field691 = a;
   }

   public float Method57() {
      return this.Field691;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int var6 = a.getType();
      WritableRaster var7 = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster var8 = a.getRaster();
      if (this.Field690 != null) {
         var4 = Math.min(var4, this.Field690.getWidth());
         var5 = Math.min(var5, this.Field690.getWidth());
         Object var9 = null;
         Object var10 = null;
         int var11 = 0;
         if (var11 < var5) {
            int[] var23 = this.Method104(a, 0, var11, var4, 1, (int[])var9);
            int[] var24 = this.Method104(this.Field690, 0, var11, var4, 1, (int[])var10);
            int var12 = 0;
            if (var12 < var4) {
               int var13 = var23[var12];
               int var14 = var24[var12];
               int var15 = var13 >> 24 & 255;
               int var16 = var13 >> 16 & 255;
               int var17 = var13 >> 8 & 255;
               int var18 = var13 & 255;
               int var19 = var14 >> 24 & 255;
               int var20 = var14 >> 16 & 255;
               int var21 = var14 >> 8 & 255;
               int var22 = var14 & 255;
               var16 = Class767.Method1687(Class776.Method1718(this.Field691, var16, var20));
               var17 = Class767.Method1687(Class776.Method1718(this.Field691, var17, var21));
               var18 = Class767.Method1687(Class776.Method1718(this.Field691, var18, var22));
               var23[var12] = var15 << 24 | var16 << 16 | var17 << 8 | var18;
               ++var12;
            }

            this.Method1267(a, 0, var11, var4, 1, var23);
            ++var11;
         }
      }

      return a;
   }

   public String toString() {
      return "Effects/Interpolate...";
   }
}
