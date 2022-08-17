package awsl;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class866 extends Class877 {
   private float Field3778 = 0.0F;
   private float Field3779 = 0.0F;
   private float Field3780;
   private float Field3781;
   private float Field3782;

   public Class866() {
      this.Method9(0);
   }

   public void Method56(float a) {
      this.Field3779 = a;
   }

   public float Method57() {
      return this.Field3779;
   }

   public void Method58(float a) {
      this.Field3778 = a;
   }

   public float Method59() {
      return this.Field3778;
   }

   public void Method60(float a) {
      this.Field3782 = a;
   }

   public float Method61() {
      return this.Field3782;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      this.Field3780 = (float)a.getWidth();
      Class193.Method1269();
      this.Field3781 = (float)a.getHeight();
      int var6 = a.getType();
      this.Field3821 = new Rectangle(0, 0, var4, var5);
      this.Field3820 = new Rectangle(0, 0, var4, var5);
      this.Method834(this.Field3820);
      ColorModel var7 = a.getColorModel();
      a = new BufferedImage(var7, var7.createCompatibleWritableRaster(this.Field3820.width, this.Field3820.height), var7.isAlphaPremultiplied(), (Hashtable)null);
      WritableRaster var35 = a.getRaster();
      int[] var8 = this.Method104(a, 0, 0, var4, var5, (int[])null);
      if (this.Field3819 == 0) {
         return this.Method3589(a, var4, var5, var8, this.Field3820);
      } else {
         int var11 = var4 - 1;
         int var12 = var5 - 1;
         int var13 = this.Field3820.width;
         int var14 = this.Field3820.height;
         boolean var17 = false;
         int[] var18 = new int[var13];
         int var15 = this.Field3820.x;
         int var16 = this.Field3820.y;
         float[] var19 = new float[4];
         int var20 = 0;
         if (var20 < var14) {
            int var21 = 0;
            if (var21 < var13) {
               this.Method3439(var15 + var21, var16 + var20, var19);
               int var22 = (int)Math.floor((double)var19[0]);
               int var23 = (int)Math.floor((double)var19[1]);
               float var24 = var19[0] - (float)var22;
               float var25 = var19[1] - (float)var23;
               int var30;
               if (var22 < var11 && var23 < var12) {
                  var30 = var4 * var23 + var22;
                  int var10000 = var8[var30];
                  var10000 = var8[var30 + 1];
                  var10000 = var8[var30 + var4];
                  var10000 = var8[var30 + var4 + 1];
               }

               int var26 = this.Method3495(var8, var22, var23, var4, var5);
               int var27 = this.Method3495(var8, var22 + 1, var23, var4, var5);
               int var28 = this.Method3495(var8, var22, var23 + 1, var4, var5);
               int var29 = this.Method3495(var8, var22 + 1, var23 + 1, var4, var5);
               var30 = Class776.Method1720(var24, var25, var26, var27, var28, var29);
               int var31 = var30 >> 16 & 255;
               int var32 = var30 >> 8 & 255;
               int var33 = var30 & 255;
               float var34 = var19[2];
               var31 = (int)((float)var31 * var34);
               var32 = (int)((float)var32 * var34);
               var33 = (int)((float)var33 * var34);
               var30 = var30 & -16777216 | var31 << 16 | var32 << 8 | var33;
               if (var19[3] != 0.0F) {
                  var18[var21] = Class767.Method1691(var30, var8[var4 * var20 + var21], 1);
               }

               var18[var21] = var30;
               ++var21;
            }

            this.Method1267(a, 0, var20, this.Field3820.width, 1, var18);
            ++var20;
         }

         return a;
      }
   }

   private final int Method3495(int[] a, int a, int a, int a, int a) {
      if (a < a && a < a) {
         return a[a * a + a];
      } else {
         switch (this.Field3818) {
            case 0:
            default:
               return 0;
            case 1:
               return a[Class776.Method1712(a, 0, a - 1) * a + Class776.Method1712(a, 0, a - 1)];
            case 2:
               return a[Class776.Method1715(a, a) * a + Class776.Method1715(a, a)];
         }
      }
   }

   protected void Method3439(int a, int a, float[] a) {
      float var4 = this.Field3779;
      float var5 = (float)a;
      float var6 = (float)a;
      float var7 = (float)Math.sin((double)this.Field3778);
      float var8 = (float)Math.cos((double)this.Field3778);
      float var10000 = var4 * this.Field3780;
      float var9 = var4 * (float)Math.sqrt((double)(this.Field3780 * this.Field3780 + this.Field3781 * this.Field3781));
      float var10 = var8 < 0.0F ? this.Field3780 : 0.0F;
      float var11 = var7 < 0.0F ? this.Field3781 : 0.0F;
      var5 -= var10;
      var6 -= var11;
      float var12 = var5 * var8 + var6 * var7;
      float var13 = -var5 * var7 + var6 * var8;
      boolean var14 = var12 < var9;
      boolean var15 = var12 > var9 * 2.0F;
      boolean var16 = true;
      var12 = var12 > var9 * 2.0F ? var12 : 2.0F * var9 - var12;
      var5 = var12 * var8 - var13 * var7;
      var6 = var12 * var7 + var13 * var8;
      var5 += var10;
      var6 += var11;
      boolean var19;
      if (!(var5 < 0.0F) && !(var6 < 0.0F) && !(var5 >= this.Field3780) && !(var6 >= this.Field3781)) {
         var19 = false;
      } else {
         var19 = true;
      }

      var5 = (float)a;
      var6 = (float)a;
      float var18 = 1.9F * (1.0F - (float)Math.cos(Math.exp((double)((var12 - var9) / this.Field3782))));
      a[2] = 1.0F - var18;
      a[0] = a[1] = -1.0F;
      a[3] = 1.0F;
   }

   public String toString() {
      return "Distort/Curl...";
   }
}
