package awsl;

public abstract class Class253 {
   protected final int Field1389;
   protected Class253 Field1390;

   public Class253(int a) {
      this(a, (Class253)null);
   }

   public Class253(int a, Class253 a) {
      if (a != 262144 && a != 327680) {
         throw new IllegalArgumentException();
      } else {
         this.Field1389 = a;
         this.Field1390 = a;
      }
   }

   public Class148 Method2114(String a, boolean a) {
      return this.Field1390 != null ? this.Field1390.Method2114(a, a) : null;
   }

   public Class148 Method2115(int a, Class31 a, String a, boolean a) {
      if (this.Field1389 < 327680) {
         throw new RuntimeException();
      } else {
         return this.Field1390 != null ? this.Field1390.Method2115(a, a, a, a) : null;
      }
   }

   public void Method2120(Class136 a) {
      if (this.Field1390 != null) {
         this.Field1390.Method2120(a);
      }

   }

   public void Method2121() {
      if (this.Field1390 != null) {
         this.Field1390.Method2121();
      }

   }

   private static IllegalArgumentException Method2247(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
