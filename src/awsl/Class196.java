package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class196 extends Class193 {
   private float Field1166;
   private float Field1167;
   private int Field1168 = 1;
   private boolean Field1169 = true;

   public Class196() {
   }

   public Class196(float a, float a, int a) {
      this.Field1166 = a;
      this.Field1167 = a;
      this.Field1168 = a;
   }

   public void Method87(boolean a) {
      this.Field1169 = a;
   }

   public boolean Method88() {
      return this.Field1169;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] var5 = new int[var3 * var4];
      int[] var6 = new int[var3 * var4];
      this.Method104(a, 0, 0, var3, var4, var5);
      if (this.Field1169) {
         Class776.Method1727(var5, 0, var5.length);
      }

      for(int var7 = 0; var7 < this.Field1168; ++var7) {
         Method1278(var5, var6, var3, var4, this.Field1166);
         Method1278(var6, var5, var4, var3, this.Field1167);
      }

      Method1279(var5, var6, var3, var4, this.Field1166);
      Method1279(var6, var5, var4, var3, this.Field1167);
      if (this.Field1169) {
         Class776.Method1728(var5, 0, var5.length);
      }

      this.Method1267(a, 0, 0, var3, var4, var5);
      return a;
   }

   public static void Method1278(int[] a, int[] a, int a, int a, float a) {
      int var6 = a - 1;
      Class193.Method1269();
      int var7 = (int)a;
      int var8 = 2 * var7 + 1;
      int[] var9 = new int[256 * var8];
      int var10 = 0;
      if (var10 < 256 * var8) {
         var9[var10] = var10 / var8;
         ++var10;
      }

      byte var22 = 0;
      int var11 = 0;
      if (var11 < a) {
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = -var7;
         int var18;
         if (var17 <= var7) {
            var18 = a[var22 + Class776.Method1712(var17, 0, a - 1)];
            var13 += var18 >> 24 & 255;
            var14 += var18 >> 16 & 255;
            var15 += var18 >> 8 & 255;
            var16 += var18 & 255;
            ++var17;
         }

         byte var23 = 0;
         int var10000;
         if (var23 < a) {
            a[var11] = var9[var13] << 24 | var9[var14] << 16 | var9[var15] << 8 | var9[var16];
            var18 = var23 + var7 + 1;
            if (var18 > var6) {
               var18 = var6;
            }

            int var19 = var23 - var7;
            byte var24 = 0;
            int var20 = a[var22 + var18];
            int var21 = a[var22 + var24];
            var10000 = var13 + ((var20 >> 24 & 255) - (var21 >> 24 & 255));
            var10000 = var14 + ((var20 & 16711680) - (var21 & 16711680) >> 16);
            var10000 = var15 + ((var20 & '\uff00') - (var21 & '\uff00') >> 8);
            var10000 = var16 + ((var20 & 255) - (var21 & 255));
            int var12 = var11 + a;
            var17 = var23 + 1;
         }

         var10000 = var22 + a;
         ++var11;
      }

   }

   public static void Method1279(int[] a, int[] a, int a, int a, float a) {
      a -= (float)((int)a);
      float var5 = 1.0F / (1.0F + 2.0F * a);
      int var6 = 0;

      for(int var7 = 0; var7 < a; ++var7) {
         a[var7] = a[0];
         int var8 = var7 + a;

         for(int var9 = 1; var9 < a - 1; ++var9) {
            int var10 = var6 + var9;
            int var11 = a[var10 - 1];
            int var12 = a[var10];
            int var13 = a[var10 + 1];
            int var14 = var11 >> 24 & 255;
            int var15 = var11 >> 16 & 255;
            int var16 = var11 >> 8 & 255;
            int var17 = var11 & 255;
            int var18 = var12 >> 24 & 255;
            int var19 = var12 >> 16 & 255;
            int var20 = var12 >> 8 & 255;
            int var21 = var12 & 255;
            int var22 = var13 >> 24 & 255;
            int var23 = var13 >> 16 & 255;
            int var24 = var13 >> 8 & 255;
            int var25 = var13 & 255;
            var14 = var18 + (int)((float)(var14 + var22) * a);
            var15 = var19 + (int)((float)(var15 + var23) * a);
            var16 = var20 + (int)((float)(var16 + var24) * a);
            var17 = var21 + (int)((float)(var17 + var25) * a);
            var14 = (int)((float)var14 * var5);
            var15 = (int)((float)var15 * var5);
            var16 = (int)((float)var16 * var5);
            var17 = (int)((float)var17 * var5);
            a[var8] = var14 << 24 | var15 << 16 | var16 << 8 | var17;
            var8 += a;
         }

         a[var8] = a[a - 1];
         var6 += a;
      }

   }

   public void Method56(float a) {
      this.Field1166 = a;
   }

   public float Method57() {
      return this.Field1166;
   }

   public void Method58(float a) {
      this.Field1167 = a;
   }

   public float Method59() {
      return this.Field1167;
   }

   public void Method60(float a) {
      this.Field1166 = this.Field1167 = a;
   }

   public float Method61() {
      return this.Field1166;
   }

   public void Method9(int a) {
      this.Field1168 = a;
   }

   public int Method10() {
      return this.Field1168;
   }

   public String toString() {
      return "Blur/Box Blur...";
   }
}
