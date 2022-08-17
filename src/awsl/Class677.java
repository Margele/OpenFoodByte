package awsl;

public enum Class677 {
   public static final Class677 INSIDE = new Class677("INSIDE", 0);
   public static final Class677 OUTSIDE = new Class677("OUTSIDE", 1);
   public static final Class677 INVERTED = new Class677("INVERTED", 2);
   public static final Class677 FAIL = new Class677("FAIL", 3);
   private static final Class677[] Field2958 = new Class677[]{INSIDE, OUTSIDE, INVERTED, FAIL};

   public static Class677[] Method2350() {
      return (Class677[])Field2958.clone();
   }

   public static Class677 Method2351(String a) {
      return (Class677)Enum.valueOf(Class677.class, a);
   }
}
