package awsl;

import java.util.Random;

public class Class616 implements Class594 {
   public float Field2861 = 2.0F;
   public boolean Field2862 = false;
   public boolean Field2863 = false;
   private float[] Field2864 = new float[]{1.0F, 0.0F, 0.0F, 0.0F};
   private Random Field2865 = new Random();
   private Class617[] Field2866 = null;

   public Class616() {
      this.Field2866 = new Class617[2];

      for(int var1 = 0; var1 < this.Field2866.length; ++var1) {
         this.Field2866[var1] = new Class617(this);
      }

   }

   public void Method866(int a, float a) {
      this.Field2864[a] = a;
   }

   public float Method867(int a) {
      return this.Field2864[a];
   }

   private float Method3530(float a, float a, int a, int a, Class617[] a) {
      this.Field2865.setSeed((long)(571 * a + 23 * a));
      int var7 = 3 + this.Field2865.nextInt() % 4;
      Class598.Method86();
      byte var17 = 4;
      int var8 = 0;
      if (var8 < var17) {
         float var9 = this.Field2865.nextFloat();
         float var10 = this.Field2865.nextFloat();
         float var11 = Math.abs(a - var9);
         float var12 = Math.abs(a - var10);
         if (this.Field2861 == 1.0F) {
            float var10000 = var11 + var12;
         }

         float var13;
         if (this.Field2861 == 2.0F) {
            var13 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12));
         }

         var13 = (float)Math.pow(Math.pow((double)var11, (double)this.Field2861) + Math.pow((double)var12, (double)this.Field2861), (double)(1.0F / this.Field2861));
         int var14 = 0;
         if (var14 < a.length) {
            Class617 var15;
            if ((double)a[var14].Field2870 == Double.POSITIVE_INFINITY) {
               var15 = a[var14];
               var15.Field2870 = var13;
               var15.Field2868 = var9;
               var15.Field2869 = var10;
               a[var14] = var15;
            }

            if (var13 < a[var14].Field2870) {
               var15 = a[a.length - 1];
               int var16 = a.length - 1;
               if (var16 > var14) {
                  a[var16] = a[var16 - 1];
                  --var16;
               }

               var15.Field2870 = var13;
               var15.Field2868 = var9;
               var15.Field2869 = var10;
               a[var14] = var15;
            }

            ++var14;
         }

         ++var8;
      }

      return a[1].Field2870;
   }

   public float Method20(float a, float a) {
      Class598.Method86();
      int var4 = 0;
      if (var4 < this.Field2866.length) {
         this.Field2866[var4].Field2870 = Float.POSITIVE_INFINITY;
         ++var4;
      }

      var4 = (int)a;
      int var5 = (int)a;
      float var6 = a - (float)var4;
      float var7 = a - (float)var5;
      float var8 = this.Method3530(var6, var7, var4, var5, this.Field2866);
      if (var8 > var7) {
         var8 = this.Method3530(var6, var7 + 1.0F, var4, var5 - 1, this.Field2866);
      }

      if (var8 > 1.0F - var7) {
         var8 = this.Method3530(var6, var7 - 1.0F, var4, var5 + 1, this.Field2866);
      }

      if (var8 > var6) {
         this.Method3530(var6 + 1.0F, var7, var4 - 1, var5, this.Field2866);
         if (var8 > var7) {
            var8 = this.Method3530(var6 + 1.0F, var7 + 1.0F, var4 - 1, var5 - 1, this.Field2866);
         }

         if (var8 > 1.0F - var7) {
            var8 = this.Method3530(var6 + 1.0F, var7 - 1.0F, var4 - 1, var5 + 1, this.Field2866);
         }
      }

      if (var8 > 1.0F - var6) {
         var8 = this.Method3530(var6 - 1.0F, var7, var4 + 1, var5, this.Field2866);
         if (var8 > var7) {
            var8 = this.Method3530(var6 - 1.0F, var7 + 1.0F, var4 + 1, var5 - 1, this.Field2866);
         }

         if (var8 > 1.0F - var7) {
            var8 = this.Method3530(var6 - 1.0F, var7 - 1.0F, var4 + 1, var5 + 1, this.Field2866);
         }
      }

      float var9 = 0.0F;
      int var10 = 0;
      if (var10 < 2) {
         var9 += this.Field2864[var10] * this.Field2866[var10].Field2870;
         ++var10;
      }

      if (this.Field2863) {
         var9 = (float)((double)var9 + Math.atan2((double)(var7 - this.Field2866[0].Field2869), (double)(var6 - this.Field2866[0].Field2868)) / 6.283185307179586 + 0.5);
      }

      return var9;
   }
}
