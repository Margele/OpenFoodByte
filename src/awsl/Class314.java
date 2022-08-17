package awsl;

import obfuscate.a;

public class Class314 extends Class321 {
   private final float Field1602;
   private static String[] Field1603;

   public Class314(int a, double a, float a) {
      super(a, a);
      this.Field1602 = a;
   }

   public Class314(int a, double a, float a, Class661 a) {
      super(a, a, a);
      this.Field1602 = a;
   }

   protected boolean Method831() {
      return true;
   }

   protected double Method797(double a) {
      double var4 = a / (double)this.Field1605;
      Method833();
      float var6 = this.Field1602 + 1.0F;
      double var10000 = Math.max(0.0, 1.0 + (double)var6 * Math.pow(var4 - 1.0, 3.0) + (double)this.Field1602 * Math.pow(var4 - 1.0, 2.0));
      if (a.trash() == null) {
         Method832(new String[1]);
      }

      return var10000;
   }

   public static void Method832(String[] arr) {
      Field1603 = arr;
   }

   public static String[] Method833() {
      return Field1603;
   }

   static {
      if (Method833() == null) {
         Method832(new String[5]);
      }

   }
}
