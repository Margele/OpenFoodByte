package awsl;

import obfuscate.b;

public class Class130 extends Class148 {
   private final boolean Field980;
   private boolean Field981;

   public Class130(Class148 a) {
      this(a, true);
   }

   Class130(Class148 a, boolean a) {
      super(327680, a);
      this.Field980 = a;
   }

   public void Method397(String a, Object a) {
      this.Method402();
      this.Method403(a);
      if (!(a instanceof Byte) && !(a instanceof Boolean) && !(a instanceof Character) && !(a instanceof Short) && !(a instanceof Integer) && !(a instanceof Long) && !(a instanceof Float) && !(a instanceof Double) && !(a instanceof String) && !(a instanceof b) && !(a instanceof byte[]) && !(a instanceof boolean[]) && !(a instanceof char[]) && !(a instanceof short[]) && !(a instanceof int[]) && !(a instanceof long[]) && !(a instanceof float[]) && !(a instanceof double[])) {
         throw new IllegalArgumentException("Invalid annotation value");
      } else {
         if (a instanceof b) {
            int a = ((b)a).Method3217();
            if (a == 11) {
               throw new IllegalArgumentException("Invalid annotation value");
            }
         }

         if (this.Field1006 != null) {
            this.Field1006.Method397(a, a);
         }

      }
   }

   public void Method398(String a, String a, String a2) {
      this.Method402();
      this.Method403(a);
      Class39.Method3395(a, false);
      throw new IllegalArgumentException("Invalid enum value");
   }

   public Class148 Method399(String a, String a) {
      this.Method402();
      this.Method403(a);
      Class39.Method3395(a, false);
      return new Class130(this.Field1006 == null ? null : this.Field1006.Method399(a, a));
   }

   public Class148 Method400(String a) {
      this.Method402();
      this.Method403(a);
      return new Class130(this.Field1006 == null ? null : this.Field1006.Method400(a), false);
   }

   public void Method401() {
      this.Method402();
      this.Field981 = true;
      if (this.Field1006 != null) {
         this.Field1006.Method401();
      }

   }

   private void Method402() {
      if (this.Field981) {
         throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
      }
   }

   private void Method403(String a) {
      if (this.Field980) {
         throw new IllegalArgumentException("Annotation value name must not be null");
      }
   }

   private static IllegalArgumentException Method404(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
