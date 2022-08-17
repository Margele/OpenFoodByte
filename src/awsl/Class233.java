package awsl;

class Class233 extends Class167 {
   String Field1294;
   String Field1295;

   public Class233() {
      super(327680);
   }

   public void Method1447(int a, int a1, String a, String a3, String a4, String[] a5) {
      this.Field1294 = a;
   }

   public Class267 Method1451(int a, String a, String a, String a3, String[] a4) {
      this.Field1295 = a + a;
      return new Class27(this, 327680);
   }

   void Method2100(String a, String a) {
      String[] a = Class690.Method2342();
      if (a.startsWith("java/")) {
         if (Class54.Field602.contains(a + ' ' + a)) {
            return;
         }

         String a = (String)Class54.Field603.Method2665(a);
         System.out.println("WARNING: " + a + ' ' + a + " called in " + this.Field1294 + ' ' + this.Field1295 + " is not defined in JDK 1.3 API");
      }

   }
}
