package awsl;

public class Class776 {
   public static final float Field3450 = 3.1415927F;
   public static final float Field3451 = 1.5707964F;
   public static final float Field3452 = 0.7853982F;
   public static final float Field3453 = 6.2831855F;
   private static final float Field3454 = -0.5F;
   private static final float Field3455 = 1.5F;
   private static final float Field3456 = -1.5F;
   private static final float Field3457 = 0.5F;
   private static final float Field3458 = 1.0F;
   private static final float Field3459 = -2.5F;
   private static final float Field3460 = 2.0F;
   private static final float Field3461 = -0.5F;
   private static final float Field3462 = -0.5F;
   private static final float Field3463 = 0.0F;
   private static final float Field3464 = 0.5F;
   private static final float Field3465 = 0.0F;
   private static final float Field3466 = 0.0F;
   private static final float Field3467 = 1.0F;
   private static final float Field3468 = 0.0F;
   private static final float Field3469 = 0.0F;
   private static int Field3470;

   public static float Method1703(float a, float a) {
      return a / ((1.0F / a - 2.0F) * (1.0F - a) + 1.0F);
   }

   public static float Method1704(float a, float a) {
      float var2 = (1.0F / a - 2.0F) * (1.0F - 2.0F * a);
      return (double)a < 0.5 ? a / (var2 + 1.0F) : (var2 - a) / (var2 - 1.0F);
   }

   public static float Method1705(float a, float a) {
      return a < a ? 0.0F : 1.0F;
   }

   public static float Method1706(float a, float a, float a) {
      return !(a < a) && !(a >= a) ? 1.0F : 0.0F;
   }

   public static float Method1707(float a, float a, float a, float a, float a) {
      if (!(a < a) && !(a >= a)) {
         if (a >= a) {
            if (a < a) {
               return 1.0F;
            } else {
               a = (a - a) / (a - a);
               return 1.0F - a * a * (3.0F - 2.0F * a);
            }
         } else {
            a = (a - a) / (a - a);
            return a * a * (3.0F - 2.0F * a);
         }
      } else {
         return 0.0F;
      }
   }

   public static float Method1708(float a, float a, float a) {
      if (a < a) {
         return 0.0F;
      } else if (a >= a) {
         return 1.0F;
      } else {
         a = (a - a) / (a - a);
         return a * a * (3.0F - 2.0F * a);
      }
   }

   public static float Method1709(float a) {
      a = 1.0F - a;
      return (float)Math.sqrt((double)(1.0F - a * a));
   }

   public static float Method1710(float a) {
      return 1.0F - (float)Math.sqrt((double)(1.0F - a * a));
   }

   public static float Method1711(float a, float a, float a) {
      return a < a ? a : (a > a ? a : a);
   }

   public static int Method1712(int a, int a, int a) {
      return a < a ? a : (a > a ? a : a);
   }

   public static double Method1713(double a, double a) {
      int var4 = (int)(a / a);
      a -= (double)var4 * a;
      return a < 0.0 ? a + a : a;
   }

   public static float Method1714(float a, float a) {
      int var2 = (int)(a / a);
      a -= (float)var2 * a;
      return a < 0.0F ? a + a : a;
   }

   public static int Method1715(int a, int a) {
      int var2 = a / a;
      a -= var2 * a;
      return a + a;
   }

   public static float Method1716(float a) {
      float var1 = Method1714(a, 1.0F);
      return 2.0F * ((double)var1 < 0.5 ? var1 : 1.0F - var1);
   }

   public static float Method1717(float a, float a, float a) {
      return a + a * (a - a);
   }

   public static int Method1718(float a, int a, int a) {
      return (int)((float)a + a * (float)(a - a));
   }

   public static int Method1719(float a, int a, int a) {
      int var3 = a >> 24 & 255;
      int var4 = a >> 16 & 255;
      int var5 = a >> 8 & 255;
      int var6 = a & 255;
      int var7 = a >> 24 & 255;
      int var8 = a >> 16 & 255;
      int var9 = a >> 8 & 255;
      int var10 = a & 255;
      var3 = Method1718(a, var3, var7);
      var4 = Method1718(a, var4, var8);
      var5 = Method1718(a, var5, var9);
      var6 = Method1718(a, var6, var10);
      return var3 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   public static int Method1720(float a, float a, int a, int a, int a, int a) {
      int var8 = a >> 24 & 255;
      int var9 = a >> 16 & 255;
      int var10 = a >> 8 & 255;
      int var11 = a & 255;
      int var12 = a >> 24 & 255;
      int var13 = a >> 16 & 255;
      int var14 = a >> 8 & 255;
      int var15 = a & 255;
      int var16 = a >> 24 & 255;
      int var17 = a >> 16 & 255;
      int var18 = a >> 8 & 255;
      int var19 = a & 255;
      int var20 = a >> 24 & 255;
      int var21 = a >> 16 & 255;
      int var22 = a >> 8 & 255;
      int var23 = a & 255;
      float var24 = 1.0F - a;
      float var25 = 1.0F - a;
      float var6 = var24 * (float)var8 + a * (float)var12;
      float var7 = var24 * (float)var16 + a * (float)var20;
      int var26 = (int)(var25 * var6 + a * var7);
      var6 = var24 * (float)var9 + a * (float)var13;
      var7 = var24 * (float)var17 + a * (float)var21;
      int var27 = (int)(var25 * var6 + a * var7);
      var6 = var24 * (float)var10 + a * (float)var14;
      var7 = var24 * (float)var18 + a * (float)var22;
      int var28 = (int)(var25 * var6 + a * var7);
      var6 = var24 * (float)var11 + a * (float)var15;
      var7 = var24 * (float)var19 + a * (float)var23;
      int var29 = (int)(var25 * var6 + a * var7);
      return var26 << 24 | var27 << 16 | var28 << 8 | var29;
   }

   public static int Method1721(int a) {
      int var1 = a >> 16 & 255;
      int var2 = a >> 8 & 255;
      int var3 = a & 255;
      return (int)((float)var1 * 0.299F + (float)var2 * 0.587F + (float)var3 * 0.114F);
   }

   public static float Method1722(float a, int a, float[] a) {
      int var4 = a - 3;
      if (var4 < 1) {
         throw new IllegalArgumentException("Too few knots in spline");
      } else {
         a = Method1711(a, 0.0F, 1.0F) * (float)var4;
         int var3 = (int)a;
         if (var3 > a - 4) {
            var3 = a - 4;
         }

         a -= (float)var3;
         float var5 = a[var3];
         float var6 = a[var3 + 1];
         float var7 = a[var3 + 2];
         float var8 = a[var3 + 3];
         float var12 = -0.5F * var5 + 1.5F * var6 + -1.5F * var7 + 0.5F * var8;
         float var11 = 1.0F * var5 + -2.5F * var6 + 2.0F * var7 + -0.5F * var8;
         float var10 = -0.5F * var5 + 0.0F * var6 + 0.5F * var7 + 0.0F * var8;
         float var9 = 0.0F * var5 + 1.0F * var6 + 0.0F * var7 + 0.0F * var8;
         return ((var12 * a + var11) * a + var10) * a + var9;
      }
   }

   public static float Method1723(float a, int a, int[] a, int[] a) {
      int var5 = a - 3;
      if (var5 < 1) {
         throw new IllegalArgumentException("Too few knots in spline");
      } else {
         int var4;
         for(var4 = 0; var4 < var5 && !((float)a[var4 + 1] > a); ++var4) {
         }

         if (var4 > a - 3) {
            var4 = a - 3;
         }

         float var14 = (a - (float)a[var4]) / (float)(a[var4 + 1] - a[var4]);
         --var4;
         byte var15 = 0;
         var14 = 0.0F;
         float var6 = (float)a[var15];
         float var7 = (float)a[var15 + 1];
         float var8 = (float)a[var15 + 2];
         float var9 = (float)a[var15 + 3];
         float var13 = -0.5F * var6 + 1.5F * var7 + -1.5F * var8 + 0.5F * var9;
         float var12 = 1.0F * var6 + -2.5F * var7 + 2.0F * var8 + -0.5F * var9;
         float var11 = -0.5F * var6 + 0.0F * var7 + 0.5F * var8 + 0.0F * var9;
         float var10 = 0.0F * var6 + 1.0F * var7 + 0.0F * var8 + 0.0F * var9;
         return ((var13 * var14 + var12) * var14 + var11) * var14 + var10;
      }
   }

   public static int Method1724(float a, int a, int[] a) {
      int var4 = a - 3;
      if (var4 < 1) {
         throw new IllegalArgumentException("Too few knots in spline");
      } else {
         a = Method1711(a, 0.0F, 1.0F) * (float)var4;
         int var3 = (int)a;
         if (var3 > a - 4) {
            var3 = a - 4;
         }

         a -= (float)var3;
         int var13 = 0;

         for(int var14 = 0; var14 < 4; ++var14) {
            int var15 = var14 * 8;
            float var5 = (float)(a[var3] >> var15 & 255);
            float var6 = (float)(a[var3 + 1] >> var15 & 255);
            float var7 = (float)(a[var3 + 2] >> var15 & 255);
            float var8 = (float)(a[var3 + 3] >> var15 & 255);
            float var12 = -0.5F * var5 + 1.5F * var6 + -1.5F * var7 + 0.5F * var8;
            float var11 = 1.0F * var5 + -2.5F * var6 + 2.0F * var7 + -0.5F * var8;
            float var10 = -0.5F * var5 + 0.0F * var6 + 0.5F * var7 + 0.0F * var8;
            float var9 = 0.0F * var5 + 1.0F * var6 + 0.0F * var7 + 0.0F * var8;
            int var16 = (int)(((var12 * a + var11) * a + var10) * a + var9);
            byte var17 = 0;
            var13 |= var17 << var15;
         }

         return var13;
      }
   }

   public static int Method1725(int a, int a, int[] a, int[] a) {
      int var5 = a - 3;
      if (var5 < 1) {
         throw new IllegalArgumentException("Too few knots in spline");
      } else {
         int var4;
         for(var4 = 0; var4 < var5 && a[var4 + 1] <= a; ++var4) {
         }

         if (var4 > a - 3) {
            var4 = a - 3;
         }

         float var14 = (float)(a - a[var4]) / (float)(a[var4 + 1] - a[var4]);
         --var4;
         byte var19 = 0;
         var14 = 0.0F;
         int var15 = 0;

         for(int var16 = 0; var16 < 4; ++var16) {
            int var17 = var16 * 8;
            float var6 = (float)(a[var19] >> var17 & 255);
            float var7 = (float)(a[var19 + 1] >> var17 & 255);
            float var8 = (float)(a[var19 + 2] >> var17 & 255);
            float var9 = (float)(a[var19 + 3] >> var17 & 255);
            float var13 = -0.5F * var6 + 1.5F * var7 + -1.5F * var8 + 0.5F * var9;
            float var12 = 1.0F * var6 + -2.5F * var7 + 2.0F * var8 + -0.5F * var9;
            float var11 = -0.5F * var6 + 0.0F * var7 + 0.5F * var8 + 0.0F * var9;
            float var10 = 0.0F * var6 + 1.0F * var7 + 0.0F * var8 + 0.0F * var9;
            int var18 = (int)(((var13 * var14 + var12) * var14 + var11) * var14 + var10);
            byte var20 = 0;
            var15 |= var20 << var17;
         }

         return var15;
      }
   }

   public static void Method1726(int[] a, int[] a, int a, int a, int a, float[] a) {
      int var27 = a.length;
      float[] var24 = new float[a + 2];
      Class193.Method1270();
      int var7 = 0;
      int var8 = 0;
      if (var8 < a) {
         if (a[var7 + 1] < (float)var8) {
            ++var7;
         }

         var24[var8] = (float)var7 + ((float)var8 - a[var7]) / (a[var7 + 1] - a[var7]);
         ++var8;
      }

      var24[a] = (float)a;
      var24[a + 1] = (float)a;
      float var10 = 1.0F;
      float var11 = var24[1];
      float var9 = var11;
      float var23 = 0.0F;
      float var22 = 0.0F;
      float var21 = 0.0F;
      float var20 = 0.0F;
      int var28 = a[a];
      int var12 = var28 >> 24 & 255;
      int var13 = var28 >> 16 & 255;
      int var14 = var28 >> 8 & 255;
      int var15 = var28 & 255;
      int var25 = a + a;
      var28 = a[var25];
      int var16 = var28 >> 24 & 255;
      int var17 = var28 >> 16 & 255;
      int var18 = var28 >> 8 & 255;
      int var19 = var28 & 255;
      var25 += a;
      byte var33 = 1;
      if (var33 <= a) {
         float var29 = var10 * (float)var12 + (1.0F - var10) * (float)var16;
         float var30 = var10 * (float)var13 + (1.0F - var10) * (float)var17;
         float var31 = var10 * (float)var14 + (1.0F - var10) * (float)var18;
         float var32 = var10 * (float)var15 + (1.0F - var10) * (float)var19;
         if (var10 < var11) {
            var20 += var29 * var10;
            var21 += var30 * var10;
            var22 += var31 * var10;
            var23 += var32 * var10;
            var11 -= var10;
            var10 = 1.0F;
            if (var25 < var27) {
               var28 = a[var25];
            }

            var16 = var28 >> 24 & 255;
            var17 = var28 >> 16 & 255;
            var18 = var28 >> 8 & 255;
            var19 = var28 & 255;
            int var10000 = var25 + a;
         }

         var20 += var29 * var11;
         var21 += var30 * var11;
         var22 += var31 * var11;
         var23 += var32 * var11;
         a[a] = (int)Math.min(var20 / var9, 255.0F) << 24 | (int)Math.min(var21 / var9, 255.0F) << 16 | (int)Math.min(var22 / var9, 255.0F) << 8 | (int)Math.min(var23 / var9, 255.0F);
         int var26 = a + a;
         var23 = 0.0F;
         var22 = 0.0F;
         var21 = 0.0F;
         var20 = 0.0F;
         float var34 = var10 - var11;
         var11 = var24[var33 + 1] - var24[var33];
         var7 = var33 + 1;
      }

   }

   public static void Method1727(int[] a, int a, int a) {
      a += a;

      for(int var3 = a; var3 < a; ++var3) {
         int var4 = a[var3];
         int var5 = var4 >> 24 & 255;
         int var6 = var4 >> 16 & 255;
         int var7 = var4 >> 8 & 255;
         int var8 = var4 & 255;
         float var9 = (float)var5 * 0.003921569F;
         var6 = (int)((float)var6 * var9);
         var7 = (int)((float)var7 * var9);
         var8 = (int)((float)var8 * var9);
         a[var3] = var5 << 24 | var6 << 16 | var7 << 8 | var8;
      }

   }

   public static void Method1728(int[] a, int a, int a) {
      a += a;

      for(int var3 = a; var3 < a; ++var3) {
         int var4 = a[var3];
         int var5 = var4 >> 24 & 255;
         int var6 = var4 >> 16 & 255;
         int var7 = var4 >> 8 & 255;
         int var8 = var4 & 255;
         if (var5 != 255) {
            float var9 = 255.0F / (float)var5;
            var6 = (int)((float)var6 * var9);
            var7 = (int)((float)var7 * var9);
            var8 = (int)((float)var8 * var9);
            if (var6 > 255) {
               var6 = 255;
            }

            if (var7 > 255) {
               var7 = 255;
            }

            if (var8 > 255) {
               var8 = 255;
            }

            a[var3] = var5 << 24 | var6 << 16 | var7 << 8 | var8;
         }
      }

   }

   public static void Method1729(int integer) {
      Field3470 = integer;
   }

   public static int Method1730() {
      return Field3470;
   }

   public static int Method1731() {
      int var0 = Method1730();
      return 7;
   }

   private static IllegalArgumentException Method1732(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }

   static {
      Method1729(0);
   }
}
