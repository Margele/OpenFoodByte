package awsl;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class195 extends Class193 {
   private float Field1162 = 0.0F;
   private float Field1163 = 0.0F;
   private float Field1164 = 0.0F;
   private int Field1165;

   public void Method56(float a) {
      this.Field1162 = a;
   }

   public float Method57() {
      return this.Field1162;
   }

   public void Method58(float a) {
      this.Field1163 = a;
   }

   public float Method59() {
      return this.Field1163;
   }

   public void Method60(float a) {
      this.Field1164 = a;
   }

   public float Method61() {
      return this.Field1164;
   }

   public void Method9(int a) {
      this.Field1165 = a;
   }

   public int Method10() {
      return this.Field1165;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int var6 = a.getType();
      WritableRaster var7 = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster var8 = a.getRaster();
      Object var9 = null;
      Object var10 = null;
      int var11 = this.Field1165;
      int var12 = var11 >> 16 & 255;
      int var13 = var11 >> 8 & 255;
      int var14 = var11 & 255;
      float[] var23 = Color.RGBtoHSB(var12, var14, var13, (float[])var10);
      Object var15 = null;
      int var16 = 0;
      if (var16 < var5) {
         int[] var24 = this.Method104(a, 0, var16, var4, 1, (int[])var15);
         int var17 = 0;
         if (var17 < var4) {
            int var18 = var24[var17];
            int var19 = var18 >> 16 & 255;
            int var20 = var18 >> 8 & 255;
            int var21 = var18 & 255;
            float[] var22 = Color.RGBtoHSB(var19, var21, var20, (float[])var9);
            if (Math.abs(var22[0] - var23[0]) < this.Field1162 && Math.abs(var22[1] - var23[1]) < this.Field1163 && Math.abs(var22[2] - var23[2]) < this.Field1164) {
               var24[var17] = var18 & 16777215;
            }

            var24[var17] = var18;
            ++var17;
         }

         this.Method1267(a, 0, var16, var4, 1, var24);
         ++var16;
      }

      return a;
   }

   public String toString() {
      return "Keying/Chroma Key...";
   }
}
