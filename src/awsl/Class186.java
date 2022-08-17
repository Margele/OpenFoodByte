package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class186 extends Class193 {
   private float Field1146 = 2.0F;
   private float Field1147 = (float)Math.toRadians(108.0);
   private float Field1148 = (float)Math.toRadians(162.0);
   private float Field1149 = (float)Math.toRadians(90.0);

   public void Method56(float a) {
      this.Field1146 = a;
   }

   public float Method57() {
      return this.Field1146;
   }

   public float Method59() {
      return this.Field1147;
   }

   public void Method58(float a) {
      this.Field1147 = a;
   }

   public float Method61() {
      return this.Field1148;
   }

   public void Method60(float a) {
      this.Field1148 = a;
   }

   public float Method165() {
      return this.Field1149;
   }

   public void Method164(float a) {
      this.Field1149 = a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      Class193.Method1269();
      int var5 = a.getHeight();
      int var6 = a.getType();
      WritableRaster var7 = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      float var8 = 2.0F * this.Field1146 * 1.414F;
      float[] var9 = new float[]{this.Field1147, this.Field1148, this.Field1149};
      float[] var10 = new float[]{0.0F, -1.0F, 1.0F, 0.0F, 0.0F};
      float[] var11 = new float[]{0.0F, 0.0F, 0.0F, -1.0F, 1.0F};
      float var12 = var8 / 2.0F;
      int[] var13 = new int[var4];
      int[] var14 = this.Method104(a, 0, 0, var4, var5, (int[])null);
      int var15 = 0;
      if (var15 < var5) {
         int var16 = 0;
         int var17 = var15 * var4;
         if (var16 < var4) {
            var13[var16] = var14[var17] & -16777216 | 16777215;
            ++var16;
            ++var17;
         }

         byte var42 = 0;
         if (var42 < 3) {
            var17 = 16 - 8 * var42;
            int var18 = 255 << var17;
            float var19 = var9[var42];
            float var20 = (float)Math.sin((double)var19);
            float var21 = (float)Math.cos((double)var19);
            int var22 = 0;
            if (var22 < var4) {
               float var23 = (float)var22 * var21 + (float)var15 * var20;
               float var24 = (float)(-var22) * var20 + (float)var15 * var21;
               var23 = var23 - Class776.Method1714(var23 - var12, var8) + var12;
               var24 = var24 - Class776.Method1714(var24 - var12, var8) + var12;
               float var25 = 1.0F;
               int var26 = 0;
               if (var26 < 5) {
                  float var27 = var23 + var10[var26] * var8;
                  float var28 = var24 + var11[var26] * var8;
                  float var29 = var27 * var21 - var28 * var20;
                  float var30 = var27 * var20 + var28 * var21;
                  int var31 = Class776.Method1712((int)var29, 0, var4 - 1);
                  int var32 = Class776.Method1712((int)var30, 0, var5 - 1);
                  int var33 = var14[var32 * var4 + var31];
                  int var34 = var33 >> var17 & 255;
                  float var35 = (float)var34 / 255.0F;
                  var35 = 1.0F - var35 * var35;
                  var35 = (float)((double)var35 * (double)var12 * 1.414);
                  float var36 = (float)var22 - var29;
                  float var37 = (float)var15 - var30;
                  float var38 = var36 * var36;
                  float var39 = var37 * var37;
                  float var40 = (float)Math.sqrt((double)(var38 + var39));
                  float var41 = 1.0F - Class776.Method1708(var40, var40 + 1.0F, var35);
                  var25 = Math.min(var25, var41);
                  ++var26;
               }

               var26 = (int)(255.0F * var25);
               var26 <<= var17;
               var26 ^= ~var18;
               var26 |= -16777216;
               var13[var22] &= var26;
               ++var22;
            }

            var16 = var42 + 1;
         }

         this.Method1267(a, 0, var15, var4, 1, var13);
         ++var15;
      }

      return a;
   }

   public String toString() {
      return "Pixellate/Color Halftone...";
   }
}
