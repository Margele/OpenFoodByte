package awsl;

public enum Class668 {
   public static final Class668 ARRAYLIST;
   public static final Class668 LOGO;
   public static final Class668 FLAT_COLOR;
   public static final Class668 GENERAL;
   private static boolean Field2943;

   public static Class668[] Method2316() {
      return (Class668[])Field2942.clone();
   }

   public static Class668 Method2317(String a) {
      return (Class668)Enum.valueOf(Class668.class, a);
   }

   static {
      Method1268(true);
      ARRAYLIST = new Class668("ARRAYLIST", 0);
      LOGO = new Class668("LOGO", 1);
      FLAT_COLOR = new Class668("FLAT_COLOR", 2);
      GENERAL = new Class668("GENERAL", 3);
   }

   public static void Method1268(boolean boolean1) {
      Field2943 = boolean1;
   }

   public static boolean Method1269() {
      return Field2943;
   }

   public static boolean Method1270() {
      boolean var0 = Method1269();
      return true;
   }
}
