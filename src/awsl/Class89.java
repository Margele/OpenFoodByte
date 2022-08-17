package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class89 extends Class193 {
   private float Field763 = 1.0F;
   private int Field764 = 5;
   private float Field765 = 0.0F;
   private float Field766 = 0.1F;
   private boolean Field767 = false;
   private Class755 Field768 = new Class771(-1, -16777216);

   public void Method56(float a) {
      this.Field763 = a;
   }

   public float Method57() {
      return this.Field763;
   }

   public void Method58(float a) {
      this.Field766 = a;
   }

   public float Method59() {
      return this.Field766;
   }

   public void Method9(int a) {
      this.Field764 = a;
   }

   public int Method10() {
      return this.Field764;
   }

   public void Method60(float a) {
      this.Field765 = a;
   }

   public float Method61() {
      return this.Field765;
   }

   public void Method87(boolean a) {
      this.Field767 = a;
   }

   public boolean Method88() {
      return this.Field767;
   }

   public void Method176(Class755 a) {
      this.Field768 = a;
   }

   public Class755 Method177() {
      return this.Field768;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      Class193.Method1270();
      int var5 = a.getHeight();
      int[] var6 = new int[var4];
      int var7 = (int)((float)this.Field764 / 1.414F);
      int[] var8 = new int[this.Field764 + 1];
      int[] var9 = new int[var7 + 1];
      int var11;
      int var12;
      int var13;
      int var14;
      if (this.Field768 != null) {
         int var10 = 0;
         if (var10 <= this.Field764) {
            var11 = this.Field768.Method283((float)var10 / (float)this.Field764);
            var12 = var11 >> 16 & 255;
            var13 = var11 >> 8 & 255;
            var14 = var11 & 255;
            var11 = var11 & -16777216 | (int)(this.Field766 * (float)var12) << 16 | (int)(this.Field766 * (float)var13) << 8 | (int)(this.Field766 * (float)var14);
            var8[var10] = var11;
            ++var10;
         }

         byte var30 = 0;
         if (var30 <= var7) {
            var11 = this.Field768.Method283((float)var30 / (float)var7);
            var12 = var11 >> 16 & 255;
            var13 = var11 >> 8 & 255;
            var14 = var11 & 255;
            var11 = var11 & -16777216 | (int)(this.Field766 * (float)var12) << 16 | (int)(this.Field766 * (float)var13) << 8 | (int)(this.Field766 * (float)var14);
            var9[var30] = var11;
            var10 = var30 + 1;
         }
      }

      BufferedImage var31 = new BufferedImage(var4, var5, 2);
      var11 = (int)(this.Field763 * 3.0F * 255.0F);
      byte var32 = 0;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      byte var34;
      if (var32 < var5) {
         this.Method104(a, 0, var32, var4, 1, var6);
         var34 = 0;
         if (var34 < var4) {
            var14 = var6[var34];
            var15 = var14 & -16777216;
            var16 = var14 >> 16 & 255;
            var17 = var14 >> 8 & 255;
            var18 = var14 & 255;
            var19 = var16 + var17 + var18;
            if (var19 < var11) {
               var6[var34] = -16777216;
            }

            var19 /= 3;
            var6[var34] = var15 | var19 << 16 | var19 << 8 | var19;
            var13 = var34 + 1;
         }

         this.Method1267(var31, 0, var32, var4, 1, var6);
         var12 = var32 + 1;
      }

      if (this.Field765 != 0.0F) {
         var31 = (new Class187(this.Field765)).Method62(var31, (BufferedImage)null);
      }

      a = this.Method1263(a, (ColorModel)null);
      int[] var33;
      if (this.Field767) {
         var33 = new int[var4 * var5];
      } else {
         var33 = this.Method104(a, 0, 0, var4, var5, (int[])null);
      }

      var34 = 0;
      if (var34 < var5) {
         var14 = var34 * var4;
         this.Method104(var31, 0, var34, var4, 1, var6);
         var15 = Math.max(var34 - this.Field764, 0) - var34;
         var16 = Math.min(var34 + this.Field764, var5 - 1) - var34;
         var17 = Math.max(var34 - var7, 0) - var34;
         var18 = Math.min(var34 + var7, var5 - 1) - var34;
         byte var35 = 0;
         if (var35 < var4) {
            if ((float)(var6[var35] & 255) > this.Field763 * 255.0F) {
               int var20 = Math.max(var35 - this.Field764, 0) - var35;
               int var21 = Math.min(var35 + this.Field764, var4 - 1) - var35;
               int var22 = Math.max(var35 - var7, 0) - var35;
               int var23 = Math.min(var35 + var7, var4 - 1) - var35;
               int var24 = 0;
               int var25 = 0;
               if (var24 <= var21) {
                  var33[var14 + var24] = Class767.Method1691(var33[var14 + var24], var8[var25], 4);
                  ++var24;
                  ++var25;
               }

               byte var36 = -1;
               byte var37 = 1;
               if (var36 >= var20) {
                  var33[var14 + var36] = Class767.Method1691(var33[var14 + var36], var8[var37], 4);
                  var24 = var36 - 1;
                  var25 = var37 + 1;
               }

               var36 = 1;
               var25 = var14 + var4;
               int var26 = 0;
               int var10000;
               if (var36 <= var16) {
                  var33[var25] = Class767.Method1691(var33[var25], var8[var26], 4);
                  var24 = var36 + 1;
                  var10000 = var25 + var4;
                  ++var26;
               }

               byte var38 = -1;
               var25 = var14 - var4;
               byte var39 = 0;
               if (var38 >= var15) {
                  var33[var25] = Class767.Method1691(var33[var25], var8[var39], 4);
                  var24 = var38 - 1;
                  var10000 = var25 - var4;
                  var26 = var39 + 1;
               }

               Math.max(var22, var17);
               Math.min(var23, var18);
               var26 = Math.min(var23, var18);
               int var27 = 1;
               int var28 = var14 + var4 + 1;
               int var29 = 0;
               if (var27 <= var26) {
                  var33[var28] = Class767.Method1691(var33[var28], var9[var29], 4);
                  ++var27;
                  var10000 = var28 + var4 + 1;
                  ++var29;
               }

               var26 = Math.min(-var22, -var17);
               byte var40 = 1;
               var28 = var14 - var4 - 1;
               byte var41 = 0;
               if (var40 <= var26) {
                  var33[var28] = Class767.Method1691(var33[var28], var9[var41], 4);
                  var27 = var40 + 1;
                  var10000 = var28 - (var4 + 1);
                  var29 = var41 + 1;
               }

               var26 = Math.min(var23, -var17);
               var40 = 1;
               var28 = var14 - var4 + 1;
               var41 = 0;
               if (var40 <= var26) {
                  var33[var28] = Class767.Method1691(var33[var28], var9[var41], 4);
                  var27 = var40 + 1;
                  var10000 = var28 + -var4 + 1;
                  var29 = var41 + 1;
               }

               var26 = Math.min(-var22, var18);
               var40 = 1;
               var28 = var14 + var4 - 1;
               var41 = 0;
               if (var40 <= var26) {
                  var33[var28] = Class767.Method1691(var33[var28], var9[var41], 4);
                  var27 = var40 + 1;
                  var10000 = var28 + (var4 - 1);
                  var29 = var41 + 1;
               }
            }

            ++var14;
            var19 = var35 + 1;
         }

         var13 = var34 + 1;
      }

      this.Method1267(a, 0, 0, var4, var5, var33);
      return a;
   }

   public String toString() {
      return "Effects/Glint...";
   }
}
