package awsl;

public enum Class733 {
   public static final Class733 HELLO = new Class733("HELLO", 0, -1, "d");
   public static final Class733 LOGIN = new Class733("LOGIN", 1, 0, "b");
   public static final Class733 PLAY = new Class733("PLAY", 2, 1, "a");
   public static final Class733 ALL = new Class733("ALL", 3, 2, "f", "ALL");
   public static final Class733 OFFLINE = new Class733("OFFLINE", 4, 3, "c");
   private int Field3213;
   private String Field3214;
   private String Field3215;

   public static Class733[] Method2025() {
      return (Class733[])Field3216.clone();
   }

   public static Class733 Method2026(String a) {
      return (Class733)Enum.valueOf(Class733.class, a);
   }

   private Class733(int a, String a) {
      this.Field3213 = a;
      this.Field3214 = a;
   }

   private Class733(int a, String a, String a) {
      this.Field3213 = a;
      this.Field3214 = a;
      this.Field3215 = a;
   }

   public int Method10() {
      return this.Field3213;
   }

   public String Method497() {
      return this.Field3214;
   }

   public String Method2027() {
      return this.Field3215;
   }
}
