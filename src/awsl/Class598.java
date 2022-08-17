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
      float a = 0.0F;

      for(float a = 1.0F; a <= a; a *= 2.0F) {
         a += Math.abs(Method157(a * a, a * a)) / a;
      }

      return a;
   }

   public static float Method154(float a, float a, float a, float a) {
      float a = 0.0F;

      for(float a = 1.0F; a <= a; a *= 2.0F) {
         a += Math.abs(Method158(a * a, a * a, a * a)) / a;
      }

      return a;
   }

   private static float Method155(float a) {
      return a * a * (3.0F - 2.0F * a);
   }

   public static float Method156(float a) {
      if (Field2811) {
         Field2811 = false;
         Method89();
      }

      float a = a + 4096.0F;
      int a = (int)a & 255;
      int a = a + 1 & 255;
      float a = a - (float)((int)a);
      float a = a - 1.0F;
      float a = Method155(a);
      float a = a * Field2810[Field2807[a]];
      float a = a * Field2810[Field2807[a]];
      return 2.3F * Method159(a, a, a);
   }

   public static float Method157(float a, float a) {
      if (Field2811) {
         Field2811 = false;
         Method89();
      }

      float a = a + 4096.0F;
      int a = (int)a & 255;
      int a = a + 1 & 255;
      float a = a - (float)((int)a);
      float a = a - 1.0F;
      a = a + 4096.0F;
      int a = (int)a & 255;
      int a = a + 1 & 255;
      float a = a - (float)((int)a);
      float a = a - 1.0F;
      int a = Field2807[a];
      int a = Field2807[a];
      int a = Field2807[a + a];
      int a = Field2807[a + a];
      int a = Field2807[a + a];
      int a = Field2807[a + a];
      float a = Method155(a);
      float a = Method155(a);
      float[] a = Field2809[a];
      float a = a * a[0] + a * a[1];
      a = Field2809[a];
      float a = a * a[0] + a * a[1];
      float a = Method159(a, a, a);
      a = Field2809[a];
      a = a * a[0] + a * a[1];
      a = Field2809[a];
      a = a * a[0] + a * a[1];
      float a = Method159(a, a, a);
      return 1.5F * Method159(a, a, a);
   }

   public static float Method158(float a, float a, float a) {
      int[] a = Method86();
      if (Field2811) {
         Field2811 = false;
         Method89();
      }

      float a = a + 4096.0F;
      int a = (int)a & 255;
      int a = a + 1 & 255;
      float a = a - (float)((int)a);
      float a = a - 1.0F;
      a = a + 4096.0F;
      int a = (int)a & 255;
      int a = a + 1 & 255;
      float a = a - (float)((int)a);
      float a = a - 1.0F;
      a = a + 4096.0F;
      int a = (int)a & 255;
      int a = a + 1 & 255;
      float a = a - (float)((int)a);
      float a = a - 1.0F;
      int a = Field2807[a];
      int a = Field2807[a];
      int a = Field2807[a + a];
      int a = Field2807[a + a];
      int a = Field2807[a + a];
      int a = Field2807[a + a];
      a = Method155(a);
      float a = Method155(a);
      float a = Method155(a);
      float[] a = Field2808[a + a];
      float a = a * a[0] + a * a[1] + a * a[2];
      a = Field2808[a + a];
      float a = a * a[0] + a * a[1] + a * a[2];
      float a = Method159(a, a, a);
      a = Field2808[a + a];
      a = a * a[0] + a * a[1] + a * a[2];
      a = Field2808[a + a];
      a = a * a[0] + a * a[1] + a * a[2];
      float a = Method159(a, a, a);
      float a = Method159(a, a, a);
      a = Field2808[a + a];
      a = a * a[0] + a * a[1] + a * a[2];
      a = Field2808[a + a];
      a = a * a[0] + a * a[1] + a * a[2];
      a = Method159(a, a, a);
      a = Field2808[a + a];
      a = a * a[0] + a * a[1] + a * a[2];
      a = Field2808[a + a];
      a = a * a[0] + a * a[1] + a * a[2];
      a = Method159(a, a, a);
      float a = Method159(a, a, a);
      float var10000 = 1.5F * Method159(a, a, a);
      if (a.trash() == null) {
         Method85(new int[3]);
      }

      return var10000;
   }

   public static float Method159(float a, float a, float a) {
      return a + a * (a - a);
   }

   private static void Method160(float[] a) {
      float a = (float)Math.sqrt((double)(a[0] * a[0] + a[1] * a[1]));
      a[0] /= a;
      a[1] /= a;
   }

   static void Method161(float[] a) {
      float a = (float)Math.sqrt((double)(a[0] * a[0] + a[1] * a[1] + a[2] * a[2]));
      a[0] /= a;
      a[1] /= a;
      a[2] /= a;
   }

   private static int Method10() {
      return Field2803.nextInt() & Integer.MAX_VALUE;
   }

   private static void Method89() {
      Method86();
      int a = 0;
      int a;
      byte a;
      if (a < 256) {
         Field2807[a] = a;
         Field2810[a] = (float)(Method10() % 512 - 256) / 256.0F;
         a = 0;
         if (a < 2) {
            Field2809[a][a] = (float)(Method10() % 512 - 256) / 256.0F;
            ++a;
         }

         Method160(Field2809[a]);
         a = 0;
         if (a < 3) {
            Field2808[a][a] = (float)(Method10() % 512 - 256) / 256.0F;
            a = a + 1;
         }

         Method161(Field2808[a]);
         ++a;
      }

      int a = 255;
      int a = Field2807[a];
      Field2807[a] = Field2807[a = Method10() % 256];
      Field2807[a] = a;
      a = a - 1;
      int a = 0;
      if (a < 258) {
         Field2807[256 + a] = Field2807[a];
         Field2810[256 + a] = Field2810[a];
         a = 0;
         if (a < 2) {
            Field2809[256 + a][a] = Field2809[a][a];
            a = a + 1;
         }

         a = 0;
         if (a < 3) {
            Field2808[256 + a][a] = Field2808[a][a];
            a = a + 1;
         }

         a = a + 1;
      }

   }

   public static float[] Method162(Class593 a, float[] a) {
      a = new float[2];
      float a = 0.0F;
      float a = 0.0F;

      for(float a = -100.0F; a < 100.0F; a = (float)((double)a + 1.27139)) {
         float a = a.Method29(a);
         a = Math.min(a, a);
         a = Math.max(a, a);
      }

      a[0] = a;
      a[1] = a;
      return a;
   }

   public static float[] Method163(Class594 a, float[] a) {
      a = new float[2];
      float a = 0.0F;
      float a = 0.0F;

      for(float a = -100.0F; a < 100.0F; a = (float)((double)a + 10.35173)) {
         for(float a = -100.0F; a < 100.0F; a = (float)((double)a + 10.77139)) {
            float a = a.Method20(a, a);
            a = Math.min(a, a);
            a = Math.max(a, a);
         }
      }

      a[0] = a;
      a[1] = a;
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
