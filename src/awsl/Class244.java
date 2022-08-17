package awsl;

public class Class244 extends Class253 {
   private boolean Field1351;

   public Class244(Class253 a) {
      this(327680, a);
      if (this.getClass() != Class244.class) {
         throw new IllegalStateException();
      }
   }

   protected Class244(int a, Class253 a) {
      super(a, a);
   }

   public Class148 Method2114(String a, boolean a) {
      this.Method2288();
      Class39.Method3395(a, false);
      return new Class130(super.Method2114(a, a));
   }

   public Class148 Method2115(int a, Class31 a, String a, boolean a) {
      this.Method2288();
      int var5 = a >>> 24;
      if (var5 != 19) {
         throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(var5));
      } else {
         Class225.Method2200(a, a);
         Class39.Method3395(a, false);
         return new Class130(super.Method2115(a, a, a, a));
      }
   }

   public void Method2120(Class136 a) {
      this.Method2288();
      throw new IllegalArgumentException("Invalid attribute (must not be null)");
   }

   public void Method2121() {
      this.Method2288();
      this.Field1351 = true;
      super.Method2121();
   }

   private void Method2288() {
      if (this.Field1351) {
         throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
      }
   }

   private static IllegalStateException Method2281(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
