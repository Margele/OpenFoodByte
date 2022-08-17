package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class198 extends Class193 {
   private int Field1175 = 2;

   public Class198() {
   }

   public Class198(int a) {
      this.Field1175 = a;
   }

   public void Method9(int a) {
      this.Field1175 = a;
   }

   public int Method10() {
      return this.Field1175;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int var6 = a.getType();
      WritableRaster var7 = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      int[] var8 = new int[this.Field1175 * this.Field1175];
      byte var9 = 0;
      if (var9 < var5) {
         byte var10 = 0;
         int var10000;
         if (var10 < var4) {
            int var11 = Math.min(this.Field1175, var4 - var10);
            int var12 = Math.min(this.Field1175, var5 - var9);
            int var13 = var11 * var12;
            this.Method104(a, var10, var9, var11, var12, var8);
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            int var18 = 0;
            int var19 = 0;
            int var17;
            int var20;
            if (var19 < var12) {
               var20 = 0;
               if (var20 < var11) {
                  var17 = var8[var18];
                  var14 += var17 >> 16 & 255;
                  var15 += var17 >> 8 & 255;
                  var16 += var17 & 255;
                  ++var18;
                  ++var20;
               }

               ++var19;
            }

            var17 = var14 / var13 << 16 | var15 / var13 << 8 | var16 / var13;
            byte var21 = 0;
            byte var22 = 0;
            if (var22 < var12) {
               byte var23 = 0;
               if (var23 < var11) {
                  var8[var21] = var8[var21] & -16777216 | var17;
                  var18 = var21 + 1;
                  var20 = var23 + 1;
               }

               var19 = var22 + 1;
            }

            this.Method1267(a, var10, var9, var11, var12, var8);
            var10000 = var10 + this.Field1175;
         }

         var10000 = var9 + this.Field1175;
      }

      return a;
   }

   public String toString() {
      return "Pixellate/Mosaic...";
   }
}
