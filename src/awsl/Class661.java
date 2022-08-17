package awsl;

public enum Class661 {
   public static final Class661 FORWARDS = new Class661("FORWARDS", 0);
   public static final Class661 BACKWARDS = new Class661("BACKWARDS", 1);

   public static Class661[] Method2382() {
      return (Class661[])Field2931.clone();
   }

   public static Class661 Method2383(String a) {
      return (Class661)Enum.valueOf(Class661.class, a);
   }

   public Class661 Method2384() {
      return this == FORWARDS ? BACKWARDS : FORWARDS;
   }
}
