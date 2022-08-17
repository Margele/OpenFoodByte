package awsl;

public class Class702 {
   public float[] Field3028 = null;
   public float[] Field3029 = null;
   public int Field3030;
   public int Field3031;
   private static final float Field3032 = -0.5F;
   private static final float Field3033 = 1.5F;
   private static final float Field3034 = -1.5F;
   private static final float Field3035 = 0.5F;
   private static final float Field3036 = 1.0F;
   private static final float Field3037 = -2.5F;
   private static final float Field3038 = 2.0F;
   private static final float Field3039 = -0.5F;
   private static final float Field3040 = -0.5F;
   private static final float Field3041 = 0.5F;
   private static final float Field3042 = 1.0F;

   public Class702(int a, int a, int a, int a) {
      this.Field3030 = a;
      this.Field3031 = a;
      this.Field3028 = new float[a * a];
      this.Field3029 = new float[a * a];
      int var5 = 0;

      for(int var6 = 0; var6 < a; ++var6) {
         for(int var7 = 0; var7 < a; ++var7) {
            this.Field3028[var5] = (float)var7 * (float)(a - 1) / (float)(a - 1);
            this.Field3029[var5] = (float)var6 * (float)(a - 1) / (float)(a - 1);
            ++var5;
         }
      }

   }

   public void Method1789(int a) {
      int var2 = (this.Field3030 + 1) * this.Field3031;
      float[] var3 = new float[var2];
      float[] var4 = new float[var2];
      ++this.Field3030;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < this.Field3030; ++var7) {
         for(int var8 = 0; var8 < this.Field3031; ++var8) {
            int var9 = var6 + var8;
            int var10 = var5 + var8;
            if (var7 == a) {
               var3[var9] = (this.Field3028[var10] + this.Field3028[var9]) / 2.0F;
               var4[var9] = (this.Field3029[var10] + this.Field3029[var9]) / 2.0F;
            } else {
               var3[var9] = this.Field3028[var10];
               var4[var9] = this.Field3029[var10];
            }
         }

         if (var7 != a - 1) {
            var5 += this.Field3031;
         }

         var6 += this.Field3031;
      }

      this.Field3028 = var3;
      this.Field3029 = var4;
   }

   public void Method1790(int a) {
      int var2 = this.Field3030 * (this.Field3031 + 1);
      float[] var3 = new float[var2];
      float[] var4 = new float[var2];
      ++this.Field3031;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < this.Field3030; ++var7) {
         for(int var8 = 0; var8 < this.Field3031; ++var8) {
            if (var8 == a) {
               var3[var6] = (this.Field3028[var5] + this.Field3028[var5 - 1]) / 2.0F;
               var4[var6] = (this.Field3029[var5] + this.Field3029[var5 - 1]) / 2.0F;
            } else {
               var3[var6] = this.Field3028[var5];
               var4[var6] = this.Field3029[var5];
               ++var5;
            }

            ++var6;
         }
      }

      this.Field3028 = var3;
      this.Field3029 = var4;
   }

   public void Method1791(int a) {
      int var2 = (this.Field3030 - 1) * this.Field3031;
      float[] var3 = new float[var2];
      float[] var4 = new float[var2];
      --this.Field3030;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < this.Field3030; ++var7) {
         for(int var8 = 0; var8 < this.Field3031; ++var8) {
            int var9 = var6 + var8;
            int var10 = var5 + var8;
            var3[var9] = this.Field3028[var10];
            var4[var9] = this.Field3029[var10];
         }

         if (var7 == a - 1) {
            var5 += this.Field3031;
         }

         var5 += this.Field3031;
         var6 += this.Field3031;
      }

      this.Field3028 = var3;
      this.Field3029 = var4;
   }

   public void Method1792(int a) {
      int var2 = this.Field3030 * (this.Field3031 + 1);
      float[] var3 = new float[var2];
      float[] var4 = new float[var2];
      --this.Field3031;

      for(int var5 = 0; var5 < this.Field3030; ++var5) {
         int var6 = var5 * (this.Field3031 + 1);
         int var7 = var5 * this.Field3031;

         for(int var8 = 0; var8 < this.Field3031; ++var8) {
            var3[var7] = this.Field3028[var6];
            var4[var7] = this.Field3029[var6];
            if (var8 == a - 1) {
               ++var6;
            }

            ++var6;
            ++var7;
         }
      }

      this.Field3028 = var3;
      this.Field3029 = var4;
   }

   public void Method1793(float a, Class702 a, Class702 a) {
      if (this.Field3030 == a.Field3030 && this.Field3031 == a.Field3031) {
         if (this.Field3030 == a.Field3030 && this.Field3031 == a.Field3031) {
            int var4 = 0;

            for(int var5 = 0; var5 < this.Field3030; ++var5) {
               for(int var6 = 0; var6 < this.Field3031; ++var6) {
                  a.Field3028[var4] = Class776.Method1717(a, this.Field3028[var4], a.Field3028[var4]);
                  a.Field3029[var4] = Class776.Method1717(a, this.Field3029[var4], a.Field3029[var4]);
                  ++var4;
               }
            }

         } else {
            throw new IllegalArgumentException("source and intermediate are different sizes");
         }
      } else {
         throw new IllegalArgumentException("source and destination are different sizes");
      }
   }

   public void Method1794(int[] a, int a, int a, Class702 a, Class702 a, int[] a) {
      boolean var7 = Class193.Method1269();

      try {
         if (a.Field3030 != a.Field3030 || a.Field3031 != a.Field3031) {
            throw new IllegalArgumentException("source and destination grids are different sizes");
         }

         int var14 = Math.max(a, a);
         float[] var15 = new float[var14];
         float[] var16 = new float[var14];
         float[] var17 = new float[var14 + 1];
         float[] var18 = new float[var14 + 1];
         int var19 = a.Field3031;
         int var20 = a.Field3030;
         Class702 var13 = new Class702(a, var19, 1, 1);
         int var10 = 0;
         int var9;
         int var11;
         int var21;
         if (var10 < var19) {
            var11 = 0;
            if (var11 < var20) {
               var15[var11] = a.Field3028[var10];
               var16[var11] = a.Field3029[var10];
               var21 = var10 + var19;
               ++var11;
            }

            this.Method1795(var16, var15, 0, var20, var18, 0, a);
            var9 = 0;
            if (var9 < a) {
               var13.Field3028[var10] = var18[var9];
               var21 = var10 + var19;
               ++var9;
            }

            ++var10;
         }

         byte var26 = 0;
         byte var25;
         byte var27;
         if (var26 < var19) {
            var27 = 0;
            if (var27 < var20) {
               var15[var27] = a.Field3028[var26];
               var16[var27] = a.Field3029[var26];
               var21 = var26 + var19;
               var11 = var27 + 1;
            }

            this.Method1795(var16, var15, 0, var20, var18, 0, a);
            var25 = 0;
            if (var25 < a) {
               var13.Field3029[var26] = var18[var25];
               var21 = var26 + var19;
               var9 = var25 + 1;
            }

            var10 = var26 + 1;
         }

         int[] var12 = new int[a * a];
         byte var28 = 0;
         var25 = 0;
         int var10000;
         if (var25 < a) {
            this.Method1795(var13.Field3028, var13.Field3029, var28, var19, var17, 0, a);
            var17[a] = (float)a;
            Class776.Method1726(a, var12, a, var25 * a, 1, var17);
            var10000 = var28 + var19;
            var9 = var25 + 1;
         }

         var13 = new Class702(var20, a, 1, 1);
         var28 = 0;
         byte var22 = 0;
         var27 = 0;
         if (var27 < var20) {
            this.Method1795(a.Field3028, a.Field3029, var28, var19, var13.Field3028, var22, a);
            var10000 = var28 + var19;
            var10000 = var22 + a;
            var11 = var27 + 1;
         }

         var28 = 0;
         var22 = 0;
         var27 = 0;
         if (var27 < var20) {
            this.Method1795(a.Field3028, a.Field3029, var28, var19, var13.Field3029, var22, a);
            var10000 = var28 + var19;
            var10000 = var22 + a;
            var11 = var27 + 1;
         }

         int var8 = 0;
         if (var8 < a) {
            var27 = 0;
            if (var27 < var20) {
               var15[var27] = var13.Field3028[var8];
               var16[var27] = var13.Field3029[var8];
               int var23 = var8 + a;
               var11 = var27 + 1;
            }

            this.Method1795(var15, var16, 0, var20, var17, 0, a);
            var17[a] = (float)a;
            Class776.Method1726(var12, a, a, var8, a, var17);
            ++var8;
         }
      } catch (Exception var24) {
         var24.printStackTrace();
      }

   }

   protected void Method1795(float[] a, float[] a, int a, int a, float[] a, int a, int a) {
      int var8 = a;
      int var9 = a + a - 1;
      float var10 = a[a];
      float var13;
      float var14;
      float var12 = var13 = var14 = a[a];
      float var11 = a[a + 1];
      float var15 = a[a + 1];

      for(int var20 = 0; var20 < a; ++var20) {
         if (var8 <= var9 && (float)var20 > a[var8]) {
            var12 = var13;
            var13 = var14;
            var14 = var15;
            var10 = a[var8];
            ++var8;
            if (var8 <= var9) {
               var11 = a[var8];
            }

            if (var8 < var9) {
               var15 = a[var8 + 1];
            } else {
               var15 = var15;
            }
         }

         float var21 = ((float)var20 - var10) / (var11 - var10);
         float var19 = -0.5F * var12 + 1.5F * var13 + -1.5F * var14 + 0.5F * var15;
         float var18 = 1.0F * var12 + -2.5F * var13 + 2.0F * var14 + -0.5F * var15;
         float var17 = -0.5F * var12 + 0.5F * var14;
         float var16 = 1.0F * var13;
         a[a + var20] = ((var19 * var21 + var18) * var21 + var17) * var21 + var16;
      }

   }

   protected void Method1796(float[] a, float[] a, int a, float[] a, int a, int a) {
      int var7 = a;
      float var8 = a[a];
      float var10 = a[a];
      float var9 = a[a + 1];
      float var11 = a[a + 1];

      for(int var12 = 0; var12 < a; ++var12) {
         if ((float)var12 > a[var7]) {
            var8 = a[var7];
            var10 = a[var7];
            ++var7;
            var9 = a[var7];
            var11 = a[var7];
         }

         float var13 = ((float)var12 - var8) / (var9 - var8);
         a[a + var12] = var10 + var13 * (var11 - var10);
      }

   }

   private static Exception Method1797(Exception exception) {
      return exception;
   }
}
