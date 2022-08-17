package awsl;

import obfuscate.b;

public class Class23 extends Class7 implements Class45 {
   private final Class173 Field235;

   public Class23(Class173 a, int a, String a, Class267 a, Class37 a) {
      super(327680, a, a, a, a);
      this.Field235 = a;
   }

   public void Method1979(String a, int a1) {
   }

   public Class148 Method1968() {
      return null;
   }

   public Class148 Method1969(String a, boolean a1) {
      return null;
   }

   public Class148 Method1970(int a, Class31 a1, String a2, boolean a3) {
      return null;
   }

   public Class148 Method1971(int a, String a1, boolean a2) {
      return null;
   }

   public void Method1843(String a, String a1, String a2, Class264 a3, Class264 a4, int a5) {
   }

   public void Method1981(int a, Class264 a1) {
   }

   public void Method1845(int a, int a1, Object[] a2, int a3, Object[] a4) {
   }

   public void Method1980(Class136 a) {
   }

   public void Method1950(Object a) {
      if (!(a instanceof b)) {
         super.Method1950(a);
      } else {
         String a = ((b)a).Method3221();
         String a = "class$" + a.replace('/', '$');
         if (!this.Field235.Field1126.contains(a)) {
            this.Field235.Field1126.Method2530(a);
            Class253 a = this.Field235.Method1457(4104, a, "Ljava/lang/Class;");
            a.Method2121();
         }

         String a = this.Field235.Field1123;
         this.Field1460.Method1949(178, a, a, "Ljava/lang/Class;");
      }
   }
}
