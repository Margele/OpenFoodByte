package awsl;

import java.awt.image.BufferedImage;

public class Class78 extends Class193 {
   private float Field701 = 10.0F;
   private float Field702 = 2.0F;
   private float Field703 = 255.0F;
   private float Field704 = 0.0F;
   private int Field705 = 5;

   public void Method56(float a) {
      this.Field701 = a;
   }

   public float Method57() {
      return this.Field701;
   }

   public void Method9(int a) {
      this.Field705 = a;
   }

   public int Method10() {
      return this.Field705;
   }

   public void Method58(float a) {
      this.Field702 = a;
   }

   public float Method59() {
      return this.Field702;
   }

   public void Method60(float a) {
      this.Field703 = a;
   }

   public float Method61() {
      return this.Field703;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int var6 = 1;
      int var7 = 1;
      int var8 = 0;
      int var9 = 0;
      int var10 = (int)Math.ceil((double)this.Field701);
      boolean var11 = true;
      int var10000 = var4 + var10 * 2;
      var10000 = var5 + var10 * 2;
      int var53 = var10 < 32 ? Math.min(128, var4 + 2 * var10) : Math.min(256, var4 + 2 * var10);
      int var12 = var10 < 32 ? Math.min(128, var5 + 2 * var10) : Math.min(256, var5 + 2 * var10);
      a = new BufferedImage(var4, var5, 2);
      if (var6 < var12) {
         var6 *= 2;
         ++var8;
      }

      if (var7 < var53) {
         var7 *= 2;
         ++var9;
      }

      Class592 var17 = new Class592(Math.max(var8, var9));
      int[] var18 = new int[var7 * var6];
      float[][] var19 = new float[2][var7 * var6];
      float[][] var20 = new float[2][var7 * var6];
      float[][] var21 = new float[2][var7 * var6];
      double var22 = Math.PI / (double)this.Field705;
      double var24 = 1.0 / Math.cos(var22);
      double var26 = (double)(this.Field701 * this.Field701);
      double var28 = Math.toRadians((double)this.Field704);
      float var30 = 0.0F;
      int var31 = 0;
      int var32 = 0;
      int var33;
      if (var32 < var6) {
         var33 = 0;
         if (var33 < var7) {
            double var34 = (double)((float)var33 - (float)var7 / 2.0F);
            double var36 = (double)((float)var32 - (float)var6 / 2.0F);
            double var38 = var34 * var34 + var36 * var36;
            double var40 = var38 < var26 ? 1.0 : 0.0;
            if (var40 != 0.0) {
               var38 = Math.sqrt(var38);
               if (this.Field705 != 0) {
                  double var42 = Math.atan2(var36, var34) + var28;
                  var42 = Class776.Method1713(var42, var22 * 2.0) - var22;
                  var40 = Math.cos(var42) * var24;
               }

               var40 = 1.0;
               var40 = var40 * var38 < (double)this.Field701 ? 1.0 : 0.0;
            }

            var30 += (float)var40;
            var19[0][var31] = (float)var40;
            var19[1][var31] = 0.0F;
            ++var31;
            ++var33;
         }

         ++var32;
      }

      byte var54 = 0;
      byte var55 = 0;
      if (var55 < var6) {
         byte var56 = 0;
         if (var56 < var7) {
            var19[0][var54] /= var30;
            var31 = var54 + 1;
            var33 = var56 + 1;
         }

         var32 = var55 + 1;
      }

      var17.Method54(var19[0], var19[1], var7, var6, true);
      var32 = -var10;
      if (var32 < var5) {
         var33 = -var10;
         if (var33 < var4) {
            int var59 = 0;
            int var39 = 0;
            int var58 = var7 + var33;
            var59 -= var33;
            int var57 = 0;
            int var37 = var6 + var32;
            var39 -= var32;
            int var35 = 0;
            if (var57 + var58 > var4) {
               var58 = var4 - var57;
            }

            if (var35 + var37 > var5) {
               var37 = var5 - var35;
            }

            a.getRGB(var57, var35, var58, var37, var18, var39 * var7 + var59, var7);
            var54 = 0;
            int var61 = 0;
            int var41;
            int var43;
            int var44;
            int var45;
            int var63;
            if (var61 < var6) {
               var41 = var61 + var32;
               if (var41 > var5) {
                  var63 = var39 + var37 - 1;
               }

               var63 = var61 * var7;
               var43 = 0;
               if (var43 < var7) {
                  var44 = var43 + var33;
                  if (var44 > var4) {
                     var45 = var59 + var58 - 1;
                  }

                  var45 = var43 + var63;
                  var21[0][var54] = (float)(var18[var45] >> 24 & 255);
                  float var46 = (float)(var18[var45] >> 16 & 255);
                  float var47 = (float)(var18[var45] >> 8 & 255);
                  float var48 = (float)(var18[var45] & 255);
                  if (var46 > this.Field703) {
                     var46 *= this.Field702;
                  }

                  if (var47 > this.Field703) {
                     var47 *= this.Field702;
                  }

                  if (var48 > this.Field703) {
                     var48 *= this.Field702;
                  }

                  var21[1][var54] = var46;
                  var20[0][var54] = var47;
                  var20[1][var54] = var48;
                  var31 = var54 + 1;
                  ++var45;
                  ++var43;
               }

               ++var61;
            }

            var17.Method54(var21[0], var21[1], var7, var6, true);
            var17.Method54(var20[0], var20[1], var7, var6, true);
            var54 = 0;
            byte var62 = 0;
            if (var62 < var6) {
               byte var60 = 0;
               if (var60 < var7) {
                  float var64 = var21[0][var54];
                  float var65 = var21[1][var54];
                  float var68 = var19[0][var54];
                  float var69 = var19[1][var54];
                  var21[0][var54] = var64 * var68 - var65 * var69;
                  var21[1][var54] = var64 * var69 + var65 * var68;
                  var64 = var20[0][var54];
                  var65 = var20[1][var54];
                  var20[0][var54] = var64 * var68 - var65 * var69;
                  var20[1][var54] = var64 * var69 + var65 * var68;
                  var31 = var54 + 1;
                  var41 = var60 + 1;
               }

               var61 = var62 + 1;
            }

            var17.Method54(var21[0], var21[1], var7, var6, false);
            var17.Method54(var20[0], var20[1], var7, var6, false);
            var61 = var7 >> 1;
            var41 = var6 >> 1;
            byte var66 = 0;
            byte var67 = 0;
            if (var67 < var7) {
               var44 = var67 ^ var61;
               var45 = var44 * var7;
               int var70 = 0;
               if (var70 < var7) {
                  int var71 = var45 + (var70 ^ var41);
                  int var72 = (int)var21[0][var71];
                  int var49 = (int)var21[1][var71];
                  int var50 = (int)var20[0][var71];
                  int var51 = (int)var20[1][var71];
                  if (var49 > 255) {
                     var49 = 255;
                  }

                  if (var50 > 255) {
                     var50 = 255;
                  }

                  if (var51 > 255) {
                     var51 = 255;
                  }

                  int var52 = var72 << 24 | var49 << 16 | var50 << 8 | var51;
                  var63 = var66 + 1;
                  var18[var66] = var52;
                  ++var70;
               }

               var43 = var67 + 1;
            }

            var57 = var33 + var10;
            var35 = var32 + var10;
            var58 = var7 - 2 * var10;
            var37 = var6 - 2 * var10;
            if (var57 + var58 > var4) {
               var58 = var4 - var57;
            }

            if (var35 + var37 > var5) {
               var37 = var5 - var35;
            }

            a.setRGB(var57, var35, var58, var37, var18, var10 * var7 + var10, var7);
            var10000 = var33 + (var7 - 2 * var10);
         }

         var10000 = var32 + (var6 - 2 * var10);
      }

      return a;
   }

   public String toString() {
      return "Blur/Lens Blur...";
   }
}
