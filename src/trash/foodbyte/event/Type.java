package trash.foodbyte.event;

public enum Type {
   public static final Type PRE;
   public static final Type ON;
   public static final Type POST;
   public static final Type SEND;
   public static final Type RECIEVE;
   private static int Field2938;

   public static Type[] getTypes() {
      return (Type[])TYPES.clone();
   }

   public static Type getTypeByString(String type) {
      return (Type)Enum.valueOf(Type.class, type);
   }

   static {
      Method9(95);
      PRE = new Type("PRE", 0);
      ON = new Type("ON", 1);
      POST = new Type("POST", 2);
      SEND = new Type("SEND", 3);
      RECIEVE = new Type("RECIEVE", 4);
   }

   public static void Method9(int integer) {
      Field2938 = integer;
   }

   public static int Method10() {
      return Field2938;
   }

   public static int Method12() {
      int var0 = Method10();
      return 21;
   }
}
