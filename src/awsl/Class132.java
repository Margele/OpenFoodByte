package awsl;

public final class Class132 extends Class148 {
   private final Class801 Field982;

   public Class132(Class801 a) {
      this((Class148)null, a);
   }

   public Class132(Class148 a, Class801 a) {
      super(327680, a);
      this.Field982 = a;
   }

   public void Method397(String a, Object a) {
      this.Field982.Method3255(a, a);
      super.Method397(a, a);
   }

   public void Method398(String a, String a, String a) {
      this.Field982.Method3256(a, a, a);
      super.Method398(a, a, a);
   }

   public Class148 Method399(String a, String a) {
      Class801 a = this.Field982.Method3257(a, a);
      Class148 a = this.Field1006 == null ? null : this.Field1006.Method399(a, a);
      return new Class132(a, a);
   }

   public Class148 Method400(String a) {
      Class801 a = this.Field982.Method3258(a);
      Class148 a = this.Field1006 == null ? null : this.Field1006.Method400(a);
      return new Class132(a, a);
   }

   public void Method401() {
      this.Field982.Method3259();
      super.Method401();
   }
}
