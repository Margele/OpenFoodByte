package awsl;

public class Class326 {
   private static boolean Field1611;

   public static void Method1246(boolean boolean1) {
      Field1611 = boolean1;
   }

   public static boolean Method1247() {
      return Field1611;
   }

   public static boolean Method1248() {
      boolean var0 = Method1247();
      return true;
   }

   static {
      if (Method1247()) {
         Method1246(true);
      }

   }
}
