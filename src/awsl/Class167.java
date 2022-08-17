package awsl;

public abstract class Class167 {
   protected final int Field1034;
   protected Class167 Field1035;
   private static boolean Field1036;

   public Class167(int a) {
      this(a, (Class167)null);
   }

   public Class167(int a, Class167 a) {
      if (a != 262144 && a != 327680) {
         throw new IllegalArgumentException();
      } else {
         this.Field1034 = a;
         this.Field1035 = a;
      }
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      if (this.Field1035 != null) {
         this.Field1035.Method1447(a, a, a, a, a, a);
      }

   }

   public void Method1458(String a, String a) {
      if (this.Field1035 != null) {
         this.Field1035.Method1458(a, a);
      }

   }

   public void Method1453(String a, String a, String a) {
      if (this.Field1035 != null) {
         this.Field1035.Method1453(a, a, a);
      }

   }

   public Class148 Method1448(String a, boolean a) {
      return this.Field1035 != null ? this.Field1035.Method1448(a, a) : null;
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a) {
      if (this.Field1034 < 327680) {
         throw new RuntimeException();
      } else {
         return this.Field1035 != null ? this.Field1035.Method1449(a, a, a, a) : null;
      }
   }

   public void Method1459(Class136 a) {
      if (this.Field1035 != null) {
         this.Field1035.Method1459(a);
      }

   }

   public void Method1452(String a, String a, String a, int a) {
      if (this.Field1035 != null) {
         this.Field1035.Method1452(a, a, a, a);
      }

   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      return this.Field1035 != null ? this.Field1035.Method1450(a, a, a, a, a) : null;
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      return this.Field1035 != null ? this.Field1035.Method1451(a, a, a, a, a) : null;
   }

   public void Method1460() {
      if (this.Field1035 != null) {
         this.Field1035.Method1460();
      }

   }

   public static void Method1499(boolean boolean1) {
      Field1036 = boolean1;
   }

   public static boolean Method1500() {
      return Field1036;
   }

   public static boolean Method1501() {
      boolean var0 = Method1500();
      return true;
   }

   private static IllegalArgumentException Method1502(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }

   static {
      if (Method1500()) {
         Method1499(true);
      }

   }
}
