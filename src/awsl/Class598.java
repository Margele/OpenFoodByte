package awsl;

import java.util.Random;
import obfuscate.a;

public class Class598 implements Class593, Class594, Class595 {
   private static Random Field2803 = new Random();
   private static final int Field2804 = 256;
   private static final int Field2805 = 255;
   private static final int Field2806 = 4096;
   static int[] Field2807 = new int[514];
   static float[][] Field2808;
   static float[][] Field2809;
   static float[] Field2810;
   static boolean Field2811;
   private static int[] Field2812;

   public float Method29(float a) {
      return Method156(a);
   }

   public float Method20(float a, float a) {
      return Method157(a, a);
   }

   public float Method67(float a, float a, float a) {
      return Method158(a, a, a);
   }

   public static float Method153(float a, float a, float a) {
      float var3 = 0.0F;

      for(float var4 = 1.0F; var4 <= a; var4 *= 2.0F) {
         var3 += Math.abs(Method157(var4 * a, var4 * a)) / var4;
      }

      return var3;
   }

   public static float Method154(float a, float a, float a, float a) {
      float var4 = 0.0F;

      for(float var5 = 1.0F; var5 <= a; var5 *= 2.0F) {
         var4 += Math.abs(Method158(var5 * a, var5 * a, var5 * a)) / var5;
      }

      return var4;
   }

   private static float Method155(float a) {
      return a * a * (3.0F - 2.0F * a);
   }

   public static float Method156(float a) {
      if (Field2811) {
         Field2811 = false;
         Method89();
      }

      float var6 = a + 4096.0F;
      int var1 = (int)var6 & 255;
      int var2 = var1 + 1 & 255;
      float var3 = var6 - (float)((int)var6);
      float var4 = var3 - 1.0F;
      float var5 = Method155(var3);
      float var7 = var3 * Field2810[Field2807[var1]];
      float var8 = var4 * Field2810[Field2807[var2]];
      return 2.3F * Method159(var5, var7, var8);
   }

   public static float Method157(float a, float a) {
      if (Field2811) {
         Field2811 = false;
         Method89();
      }

      float var19 = a + 4096.0F;
      int var2 = (int)var19 & 255;
      int var3 = var2 + 1 & 255;
      float var10 = var19 - (float)((int)var19);
      float var11 = var10 - 1.0F;
      var19 = a + 4096.0F;
      int var4 = (int)var19 & 255;
      int var5 = var4 + 1 & 255;
      float var12 = var19 - (float)((int)var19);
      float var13 = var12 - 1.0F;
      int var22 = Field2807[var2];
      int var23 = Field2807[var3];
      int var6 = Field2807[var22 + var4];
      int var7 = Field2807[var23 + var4];
      int var8 = Field2807[var22 + var5];
      int var9 = Field2807[var23 + var5];
      float var15 = Method155(var10);
      float var16 = Method155(var12);
      float[] var14 = Field2809[var6];
      float var20 = var10 * var14[0] + var12 * var14[1];
      var14 = Field2809[var7];
      float var21 = var11 * var14[0] + var12 * var14[1];
      float var17 = Method159(var15, var20, var21);
      var14 = Field2809[var8];
      var20 = var10 * var14[0] + var13 * var14[1];
      var14 = Field2809[var9];
      var21 = var11 * var14[0] + var13 * var14[1];
      float var18 = Method159(var15, var20, var21);
      return 1.5F * Method159(var16, var17, var18);
   }

   public static float Method158(float a, float a, float a) {
      int[] var3 = Method86();
      if (Field2811) {
         Field2811 = false;
         Method89();
      }

      float var27 = a + 4096.0F;
      int var4 = (int)var27 & 255;
      int var5 = var4 + 1 & 255;
      float var14 = var27 - (float)((int)var27);
      float var15 = var14 - 1.0F;
      var27 = a + 4096.0F;
      int var6 = (int)var27 & 255;
      int var7 = var6 + 1 & 255;
      float var16 = var27 - (float)((int)var27);
      float var17 = var16 - 1.0F;
      var27 = a + 4096.0F;
      int var8 = (int)var27 & 255;
      int var9 = var8 + 1 & 255;
      float var18 = var27 - (float)((int)var27);
      float var19 = var18 - 1.0F;
      int var30 = Field2807[var4];
      int var31 = Field2807[var5];
      int var10 = Field2807[var30 + var6];
      int var11 = Field2807[var31 + var6];
      int var12 = Field2807[var30 + var7];
      int var13 = Field2807[var31 + var7];
      var27 = Method155(var14);
      float var21 = Method155(var16);
      float var22 = Method155(var18);
      float[] var20 = Field2808[var10 + var8];
      float var28 = var14 * var20[0] + var16 * var20[1] + var18 * var20[2];
      var20 = Field2808[var11 + var8];
      float var29 = var15 * var20[0] + var16 * var20[1] + var18 * var20[2];
      float var23 = Method159(var27, var28, var29);
      var20 = Field2808[var12 + var8];
      var28 = var14 * var20[0] + var17 * var20[1] + var18 * var20[2];
      var20 = Field2808[var13 + var8];
      var29 = var15 * var20[0] + var17 * var20[1] + var18 * var20[2];
      float var24 = Method159(var27, var28, var29);
      float var25 = Method159(var21, var23, var24);
      var20 = Field2808[var10 + var9];
      var28 = var14 * var20[0] + var16 * var20[1] + var19 * var20[2];
      var20 = Field2808[var11 + var9];
      var29 = var15 * var20[0] + var16 * var20[1] + var19 * var20[2];
      var23 = Method159(var27, var28, var29);
      var20 = Field2808[var12 + var9];
      var28 = var14 * var20[0] + var17 * var20[1] + var19 * var20[2];
      var20 = Field2808[var13 + var9];
      var29 = var15 * var20[0] + var17 * var20[1] + var19 * var20[2];
      var24 = Method159(var27, var28, var29);
      float var26 = Method159(var21, var23, var24);
      float var10000 = 1.5F * Method159(var22, var25, var26);
      if (a.trash() == null) {
         Method85(new int[3]);
      }

      return var10000;
   }

   public static float Method159(float a, float a, float a) {
      return a + a * (a - a);
   }

   private static void Method160(float[] a) {
      float var1 = (float)Math.sqrt((double)(a[0] * a[0] + a[1] * a[1]));
      a[0] /= var1;
      a[1] /= var1;
   }

   static void Method161(float[] a) {
      float var1 = (float)Math.sqrt((double)(a[0] * a[0] + a[1] * a[1] + a[2] * a[2]));
      a[0] /= var1;
      a[1] /= var1;
      a[2] /= var1;
   }

   private static int Method10() {
      return Field2803.nextInt() & Integer.MAX_VALUE;
   }

   private static void Method89() {
      Method86();
      int var1 = 0;
      int var2;
      byte var6;
      if (var1 < 256) {
         Field2807[var1] = var1;
         Field2810[var1] = (float)(Method10() % 512 - 256) / 256.0F;
         var2 = 0;
         if (var2 < 2) {
            Field2809[var1][var2] = (float)(Method10() % 512 - 256) / 256.0F;
            ++var2;
         }

         Method160(Field2809[var1]);
         var6 = 0;
         if (var6 < 3) {
            Field2808[var1][var6] = (float)(Method10() % 512 - 256) / 256.0F;
            var2 = var6 + 1;
         }

         Method161(Field2808[var1]);
         ++var1;
      }

      short var4 = 255;
      int var3 = Field2807[var4];
      Field2807[var4] = Field2807[var2 = Method10() % 256];
      Field2807[var2] = var3;
      var1 = var4 - 1;
      byte var5 = 0;
      if (var5 < 258) {
         Field2807[256 + var5] = Field2807[var5];
         Field2810[256 + var5] = Field2810[var5];
         var6 = 0;
         if (var6 < 2) {
            Field2809[256 + var5][var6] = Field2809[var5][var6];
            var2 = var6 + 1;
         }

         var6 = 0;
         if (var6 < 3) {
            Field2808[256 + var5][var6] = Field2808[var5][var6];
            var2 = var6 + 1;
         }

         var1 = var5 + 1;
      }

   }

   public static float[] Method162(Class593 a, float[] a) {
      a = new float[2];
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(float var4 = -100.0F; var4 < 100.0F; var4 = (float)((double)var4 + 1.27139)) {
         float var5 = a.Method29(var4);
         var2 = Math.min(var2, var5);
         var3 = Math.max(var3, var5);
      }

      a[0] = var2;
      a[1] = var3;
      return a;
   }

   public static float[] Method163(Class594 a, float[] a) {
      a = new float[2];
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(float var4 = -100.0F; var4 < 100.0F; var4 = (float)((double)var4 + 10.35173)) {
         for(float var5 = -100.0F; var5 < 100.0F; var5 = (float)((double)var5 + 10.77139)) {
            float var6 = a.Method20(var5, var4);
            var2 = Math.min(var2, var6);
            var3 = Math.max(var3, var6);
         }
      }

      a[0] = var2;
      a[1] = var3;
      return a;
   }

   static {
      Method85((int[])null);
      Field2808 = new float[514][3];
      Field2809 = new float[514][2];
      Field2810 = new float[514];
      Field2811 = true;
   }

   public static void Method85(int[] arr) {
      Field2812 = arr;
   }

   public static int[] Method86() {
      return Field2812;
   }
}
