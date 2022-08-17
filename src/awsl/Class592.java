package awsl;

public class Class592 {
   protected float[] Field2783;
   protected float[] Field2784;
   protected float[] Field2785;

   public Class592(int a) {
      this.Field2783 = new float[a];
      this.Field2784 = new float[a];
      this.Field2785 = new float[a];
      int var2 = 1;

      for(int var3 = 0; var3 < a; ++var3) {
         var2 <<= 1;
         double var4 = -6.283185307179586 / (double)var2;
         this.Field2783[var3] = (float)Math.sin(0.5 * var4);
         this.Field2784[var3] = -2.0F * this.Field2783[var3] * this.Field2783[var3];
         this.Field2785[var3] = (float)Math.sin(var4);
      }

   }

   private void Method51(int a, float[] a, float[] a) {
      int var4 = 0;

      for(int var5 = 0; var5 < a; ++var5) {
         if (var5 > var4) {
            float var6 = a[var4];
            a[var4] = a[var5];
            a[var5] = var6;
            var6 = a[var4];
            a[var4] = a[var5];
            a[var5] = var6;
         }

         int var7;
         for(var7 = a >> 1; var4 >= var7 && var7 >= 2; var7 >>= 1) {
            var4 -= var7;
         }

         var4 += var7;
      }

   }

   private void Method52(int a, int a, int a, float[] a, float[] a) {
      Class598.Method86();
      int var7 = 1;
      int var8 = 0;
      if (var8 < a) {
         byte var16 = (byte)var7;
         var7 <<= 1;
         float var15 = (float)a * this.Field2783[var8];
         float var11 = this.Field2784[var8];
         float var12 = (float)a * this.Field2785[var8];
         float var9 = 1.0F;
         float var10 = 0.0F;
         int var17 = 0;
         if (var17 < var16) {
            if (var17 < a) {
               int var19 = var17 + var16;
               float var20 = a[var19];
               float var21 = a[var19];
               float var13 = var9 * var20 - var10 * var21;
               float var14 = var10 * var20 + var9 * var21;
               a[var19] = a[var17] - var13;
               a[var17] += var13;
               a[var19] = a[var17] - var14;
               a[var17] += var14;
               int var18 = var17 + var7;
            }

            var15 = var9;
            var9 += var9 * var11 - var10 * var12;
            var10 += var10 * var11 + var15 * var12;
            ++var17;
         }

         ++var8;
      }

      if (a == -1) {
         float var22 = 1.0F / (float)a;
         int var23 = 0;
         if (var23 < a) {
            a[var23] *= var22;
            a[var23] *= var22;
            ++var23;
         }
      }

   }

   public void Method53(float[] a, float[] a, int a, int a, boolean a) {
      this.Method51(a, a, a);
      this.Method52(a, a, 1, a, a);
   }

   public void Method54(float[] a, float[] a, int a, int a, boolean a) {
      int var6 = this.Method55(a);
      int var7 = this.Method55(a);
      int var8 = Math.max(a, a);
      float[] var9 = new float[var8];
      float[] var10 = new float[var8];

      int var11;
      int var12;
      for(var11 = 0; var11 < a; ++var11) {
         var12 = var11 * a;
         System.arraycopy(a, var12, var9, 0, a);
         System.arraycopy(a, var12, var10, 0, a);
         this.Method53(var9, var10, var6, a, a);
         System.arraycopy(var9, 0, a, var12, a);
         System.arraycopy(var10, 0, a, var12, a);
      }

      for(var11 = 0; var11 < a; ++var11) {
         var12 = var11;

         int var13;
         for(var13 = 0; var13 < a; ++var13) {
            var9[var13] = a[var12];
            var10[var13] = a[var12];
            var12 += a;
         }

         this.Method53(var9, var10, var7, a, a);
         var12 = var11;

         for(var13 = 0; var13 < a; ++var13) {
            a[var12] = var9[var13];
            a[var12] = var10[var13];
            var12 += a;
         }
      }

   }

   private int Method55(int a) {
      int var2 = 1;

      int var3;
      for(var3 = 0; var2 < a; ++var3) {
         var2 *= 2;
      }

      return var2 == a ? var3 : -1;
   }
}
