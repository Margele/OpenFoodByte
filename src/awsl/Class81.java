package awsl;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class81 extends Class193 {
   private float Field707 = 0.0F;
   private float Field708 = 0.0F;
   private float Field709 = 0.0F;
   private BufferedImage Field710;
   private BufferedImage Field711;

   public void Method56(float a) {
      this.Field707 = a;
   }

   public float Method57() {
      return this.Field707;
   }

   public void Method58(float a) {
      this.Field708 = a;
   }

   public float Method59() {
      return this.Field708;
   }

   public void Method60(float a) {
      this.Field709 = a;
   }

   public float Method61() {
      return this.Field709;
   }

   public void Method1271(BufferedImage a) {
      this.Field710 = a;
   }

   public BufferedImage Method1272() {
      return this.Field710;
   }

   public void Method1273(BufferedImage a) {
      this.Field711 = a;
   }

   public BufferedImage Method1274() {
      return this.Field711;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      Class193.Method1269();
      int var5 = a.getHeight();
      int var6 = a.getType();
      WritableRaster var7 = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster var8 = a.getRaster();
      if (this.Field710 != null && this.Field711 != null) {
         Object var9 = null;
         Object var10 = null;
         Object var11 = null;
         Object var12 = null;
         Object var13 = null;
         int var14 = 0;
         if (var14 < var5) {
            int[] var27 = this.Method104(a, 0, var14, var4, 1, (int[])var11);
            int[] var28 = this.Method104(this.Field710, 0, var14, var4, 1, (int[])var12);
            int[] var29 = this.Method104(this.Field711, 0, var14, var4, 1, (int[])var13);
            int var15 = 0;
            if (var15 < var4) {
               int var16 = var27[var15];
               int var17 = var28[var15];
               int var18 = var29[var15];
               int var19 = var16 >> 16 & 255;
               int var20 = var16 >> 8 & 255;
               int var21 = var16 & 255;
               int var22 = var18 >> 16 & 255;
               int var23 = var18 >> 8 & 255;
               int var24 = var18 & 255;
               float[] var25 = Color.RGBtoHSB(var19, var21, var20, (float[])var9);
               float[] var26 = Color.RGBtoHSB(var22, var24, var23, (float[])var10);
               if (Math.abs(var25[0] - var26[0]) < this.Field707 && Math.abs(var25[1] - var26[1]) < this.Field708 && Math.abs(var25[2] - var26[2]) < this.Field709) {
                  var27[var15] = var17;
               }

               var27[var15] = var16;
               ++var15;
            }

            this.Method1267(a, 0, var14, var4, 1, var27);
            ++var14;
         }
      }

      return a;
   }

   public String toString() {
      return "Keying/Key...";
   }
}
