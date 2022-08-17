package awsl;

import obfuscate.b;

public class Class23 extends Class7 implements Class45 {
   private final Class173 Field235;

   public Class23(Class173 a, int a, String a, Class267 a, Class37 a) {
      super(327680, a, a, a, a);
      this.Field235 = a;
   }

   public void Method1979(String a, int a) {
   }

   public Class148 Method1968() {
      return null;
   }

   public Class148 Method1969(String a, boolean a) {
      return null;
   }

   public Class148 Method1970(int a, Class31 a, String a, boolean a) {
      return null;
   }

   public Class148 Method1971(int a, String a, boolean a) {
      return null;
   }

   public void Method1843(String a, String a, String a, Class264 a, Class264 a, int a) {
   }

   public void Method1981(int a, Class264 a) {
   }

   public void Method1845(int a, int a, Object[] a, int a, Object[] a) {
   }

   public void Method1980(Class136 a) {
   }

   public void Method1950(Object a) {
      if (!(a instanceof b)) {
         super.Method1950(a);
      } else {
         String var2 = ((b)a).Method3221();
         String var3 = "class$" + var2.replace('/', '$');
         if (!this.Field235.Field1126.contains(var2)) {
            this.Field235.Field1126.Method2530(var2);
            Class253 var4 = this.Field235.Method1457(4104, var3, "Ljava/lang/Class;");
            var4.Method2121();
         }

         String var5 = this.Field235.Field1123;
         this.Field1460.Method1949(178, var5, var3, "Ljava/lang/Class;");
      }
   }
}
