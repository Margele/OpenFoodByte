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
         double a = a;
         a = a;
         a = a;
      }

      return a - a;
   }

   public static float Method979(long a) {
      a += System.currentTimeMillis();
      return 0.4F + (float)(new Random(a)).nextInt(80000000) / 1.0E9F + 1.45E-9F;
   }

   public static float Method980(float a, float a) {
      SecureRandom a = new SecureRandom();
      return a.nextFloat() * (a - a) + a;
   }

   public static int Method981(int a, int a) {
      SecureRandom a = new SecureRandom();
      return a.nextInt() * (a - a) + a;
   }

   public static double Method982(double a, double a) {
      SecureRandom a = new SecureRandom();
      return a.nextDouble() * (a - a) + a;
   }

   public static float Method983(float a, float a) {
      float a = Math.abs(a - a) % 360.0F;
      float a = a > 180.0F ? 360.0F - a : a;
      return a;
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
      Random a = new Random();
      double a = a - a;
      double a = a.nextDouble() * a;
      if (a > a) {
         a = a;
      }

      double a = a + a;
      if (a > a) {
         a = a;
      }

      return a;
   }

   public static float Method990(float a, float a) {
      Random a = new Random();
      float a = a - a;
      float a = a.nextFloat() * a;
      float a = a + a;
      return a;
   }

   public static int Method991(int a, int a) {
      Random a = new Random();
      int a = a.nextInt(a - a + 1) + a;
      return a;
   }

   public static double Method992(double a, int a1) {
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
