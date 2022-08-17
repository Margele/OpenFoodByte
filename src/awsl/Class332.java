package awsl;

public class Class332 extends Class326 {
   public static final double Method1010(double a, double a, double a, double a) {
      return a - Method1012(a - a, 0.0, a, a) + a;
   }

   public static final double Method1012(double a, double a, double a, double a) {
      if ((a /= a) < 0.3636363744735718) {
         return a * 7.5625 * a * a + a;
      } else if (a < 0.7272727489471436) {
         return a * (7.5625 * (a -= 0.5454545617103577) * a + 0.75) + a;
      } else {
         return a < 0.9090909090909091 ? a * (7.5625 * (a -= 0.8181818127632141) * a + 0.9375) + a : a * (7.5625 * (a -= 0.9545454382896423) * a + 0.984375) + a;
      }
   }

   public static final double Method1014(double a, double a, double a, double a) {
      return a < a / 2.0 ? Method1010(a * 2.0, 0.0, a, a) * 0.5 + a : Method1012(a * 2.0 - a, 0.0, a, a) * 0.5 + a * 0.5 + a;
   }
}
