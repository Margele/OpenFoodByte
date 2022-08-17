package awsl;

import obfuscate.a;

public class Class325 extends Class326 {
   public static double Method1010(double a, double a, double a, double a) {
      double var8 = 1.7015800476074219;
      return a * (a /= a) * a * (2.701580047607422 * a - 1.7015800476074219) + a;
   }

   public static final double Method1254(double a, double a, double a, double a, double a) {
      return a * (a /= a) * a * ((a + 1.0) * a - a) + a;
   }

   public static final double Method1012(double a, double a, double a, double a) {
      double var8 = 1.7015800476074219;
      return a * ((a = a / a - 1.0) * a * ((var8 + 1.0) * a + var8) + 1.0) + a;
   }

   public static final double Method1255(double a, double a, double a, double a, double a) {
      return a * ((a = a / a - 1.0) * a * ((a + 1.0) * a + a) + 1.0) + a;
   }

   public static final double Method1014(double a, double a, double a, double a) {
      Class330.Method1059();
      double var9 = 1.7015800476074219;
      if ((a /= a / 2.0) < 1.0) {
         return a / 2.0 * a * a * (((var9 *= 1.524999976158142) + 1.0) * a - var9) + a;
      } else {
         double var10000 = a / 2.0 * ((a -= 2.0) * a * (((var9 *= 1.524999976158142) + 1.0) * a + var9) + 2.0) + a;
         a.trash(new String[1]);
         return var10000;
      }
   }

   public static final double Method1256(double a, double a, double a, double a, double a) {
      boolean var10 = Class330.Method1059();
      if ((a /= a / 2.0) < 1.0) {
         return a / 2.0 * a * a * (((a *= 1.524999976158142) + 1.0) * a - a) + a;
      } else {
         double var10000 = a / 2.0 * ((a -= 2.0) * a * (((a *= 1.524999976158142) + 1.0) * a + a) + 2.0) + a;
         if (a.trash() == null) {
            Class330.Method1058(false);
         }

         return var10000;
      }
   }
}
