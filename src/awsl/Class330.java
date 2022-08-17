package awsl;

public class Class330 extends Class326 {
   private static boolean Field1616;

   public static final double Method1010(double a, double a, double a, double a) {
      return a * (a /= a) * a * a + a;
   }

   public static final double Method1012(double a, double a, double a, double a) {
      return a * ((a = a / a - 1.0) * a * a + 1.0) + a;
   }

   public static final double Method1014(double a, double a, double a, double a) {
      return (a /= a / 2.0) < 1.0 ? a / 2.0 * a * a * a + a : a / 2.0 * ((a -= 2.0) * a * a + 2.0) + a;
   }

   public static void Method1058(boolean boolean1) {
      Field1616 = boolean1;
   }

   public static boolean Method1059() {
      return Field1616;
   }

   public static boolean Method1060() {
      boolean var0 = Method1059();
      return true;
   }

   static {
      if (Method1060()) {
         Method1058(true);
      }

   }
}
