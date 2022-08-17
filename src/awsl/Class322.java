package awsl;

import obfuscate.a;

public class Class322 {
   double Field1609;
   private static boolean Field1610;

   public Class322() {
      Method1196();
      super();
      this.Field1609 = 0.0;
      if (a.trash() == null) {
         Method1194(false);
      }

   }

   public Class322(double a) {
      Method1196();
      super();
      this.Field1609 = a;
      a.trash(new String[3]);
   }

   public final double Method1191() {
      return this.Field1609;
   }

   public final void Method1192(double a) {
      this.Field1609 = a;
   }

   public final void Method1193() {
      this.Field1609 = 0.0;
   }

   public static void Method1194(boolean boolean1) {
      Field1610 = boolean1;
   }

   public static boolean Method1195() {
      return Field1610;
   }

   public static boolean Method1196() {
      boolean var0 = Method1195();
      return true;
   }

   static {
      if (!Method1196()) {
         Method1194(true);
      }

   }
}
