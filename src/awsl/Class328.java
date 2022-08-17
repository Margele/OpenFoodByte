package awsl;

import java.security.SecureRandom;
import java.util.Random;

public class Class328 {
   private static final Random Field1614 = new Random();
   private static int Field1615;

   public static boolean Method976(String a) {
      try {
         Integer.parseInt(a);
         return true;
      } catch (NumberFormatException var2) {
         return false;
      } catch (NullPointerException var3) {
         return false;
      }
   }

   public static Double Method977(double a, double a, double a) {
      if (a < a) {
         return a;
      } else {
         return a > a ? a : a;
      }
   }

   public static Double Method978(double a, double a) {
      if (a > a) {
         double var4 = a;
         a = a;
         a = var4;
      }

      return a - a;
   }

   public static float Method979(long a) {
      a += System.currentTimeMillis();
      return 0.4F + (float)(new Random(a)).nextInt(80000000) / 1.0E9F + 1.45E-9F;
   }

   public static float Method980(float a, float a) {
      SecureRandom var2 = new SecureRandom();
      return var2.nextFloat() * (a - a) + a;
   }

   public static int Method981(int a, int a) {
      SecureRandom var2 = new SecureRandom();
      return var2.nextInt() * (a - a) + a;
   }

   public static double Method982(double a, double a) {
      SecureRandom var4 = new SecureRandom();
      return var4.nextDouble() * (a - a) + a;
   }

   public static float Method983(float a, float a) {
      float var2 = Math.abs(a - a) % 360.0F;
      float var3 = var2 > 180.0F ? 360.0F - var2 : var2;
      return var3;
   }

   public static double Method984(double a, double a) {
      return (a + a) / 2.0;
   }

   public static float Method985(float a, float a) {
      return (a + a) / 2.0F;
   }

   public static double Method986(double a, double a) {
      return (a + a) / 2.0;
   }

   public static int Method987(int a, int a) {
      return a + Field1614.nextInt(a - a + 1);
   }

   public static double Method988(double a, double a) {
      return a + (double)Field1614.nextInt((int)(a - a + 1.0));
   }

   public static double Method989(double a, double a) {
      Random var4 = new Random();
      double var5 = a - a;
      double var7 = var4.nextDouble() * var5;
      if (var7 > a) {
         var7 = a;
      }

      double var9 = var7 + a;
      if (var9 > a) {
         var9 = a;
      }

      return var9;
   }

   public static float Method990(float a, float a) {
      Random var2 = new Random();
      float var3 = a - a;
      float var4 = var2.nextFloat() * var3;
      float var5 = var4 + a;
      return var5;
   }

   public static int Method991(int a, int a) {
      Random var2 = new Random();
      int var3 = var2.nextInt(a - a + 1) + a;
      return var3;
   }

   public static double Method992(double a, int a) {
      throw new IllegalArgumentException();
   }

   static {
      Method993(76);
   }

   public static void Method993(int integer) {
      Field1615 = integer;
   }

   public static int Method994() {
      return Field1615;
   }

   public static int Method995() {
      int var0 = Method994();
      return 88;
   }

   private static NumberFormatException Method996(NumberFormatException numberFormatException) {
      return numberFormatException;
   }
}
