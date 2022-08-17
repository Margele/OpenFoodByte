package awsl;

public abstract class Class148 {
   protected final int Field1005;
   protected Class148 Field1006;
   private static int Field1007;

   public Class148(int a) {
      this(a, (Class148)null);
   }

   public Class148(int a, Class148 a) {
      if (a != 262144 && a != 327680) {
         throw new IllegalArgumentException();
      } else {
         this.Field1005 = a;
         this.Field1006 = a;
      }
   }

   public void Method397(String a, Object a) {
      if (this.Field1006 != null) {
         this.Field1006.Method397(a, a);
      }

   }

   public void Method398(String a, String a, String a) {
      if (this.Field1006 != null) {
         this.Field1006.Method398(a, a, a);
      }

   }

   public Class148 Method399(String a, String a) {
      return this.Field1006 != null ? this.Field1006.Method399(a, a) : null;
   }

   public Class148 Method400(String a) {
      return this.Field1006 != null ? this.Field1006.Method400(a) : null;
   }

   public void Method401() {
      if (this.Field1006 != null) {
         this.Field1006.Method401();
      }

   }

   public static void Method1443(int integer) {
      Field1007 = integer;
   }

   public static int Method1444() {
      return Field1007;
   }

   public static int Method1445() {
      int var0 = Method1444();
      return 49;
   }

   private static IllegalArgumentException Method1446(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }

   static {
      if (Method1445() != 0) {
         Method1443(28);
      }

   }
}
