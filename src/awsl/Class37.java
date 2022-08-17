package awsl;

import obfuscate.b;

public abstract class Class37 {
   private static boolean Field301;

   public String Method3372(String a) {
      Method3383();
      b a = b.Method3204(a);
      switch (a.Method3217()) {
         case 9:
            String a = this.Method3372(a.Method3219().Method3225());
            int a = 0;
            if (a < a.Method3218()) {
               a = '[' + a;
               ++a;
            }

            return a;
         case 10:
            String a = this.Method3183(a.Method3221());
            return 'L' + a + ';';
         default:
            return a;
      }
   }

   private b Method3373(b a) {
      int a = Method3382();
      String a;
      switch (a.Method3217()) {
         case 9:
            a = this.Method3372(a.Method3219().Method3225());
            int a = 0;
            if (a < a.Method3218()) {
               a = '[' + a;
               ++a;
            }

            return b.Method3204(a);
         case 10:
            a = this.Method3183(a.Method3221());
            return b.Method3205(a);
         case 11:
            return b.Method3206(this.Method3376(a.Method3225()));
         default:
            return a;
      }
   }

   public String Method3374(String a) {
      return null;
   }

   public String[] Method3375(String[] a) {
      String[] a = null;
      boolean a = false;

      for(int a = 0; a < a.length; ++a) {
         String a = a[a];
         String a = this.Method3183(a);
         a = new String[a.length];
         System.arraycopy(a, 0, a, 0, a);
         a = true;
         a[a] = a;
      }

      return a;
   }

   public String Method3376(String a) {
      int a = Method3383();
      if ("()V".equals(a)) {
         return a;
      } else {
         b[] a = b.Method3211(a);
         StringBuilder a = new StringBuilder("(");
         int a = 0;
         if (a < a.length) {
            a.append(this.Method3372(a[a].Method3225()));
            ++a;
         }

         b a = b.Method3213(a);
         if (a == b.Field572) {
            a.append(")V");
            return a.toString();
         } else {
            a.append(')').append(this.Method3372(a.Method3225()));
            return a.toString();
         }
      }
   }

   public Object Method3377(Object a) {
      if (a instanceof b) {
         return this.Method3373((b)a);
      } else if (a instanceof Class279) {
         Class279 a = (Class279)a;
         return new Class279(a.Method2820(), this.Method3374(a.Method2821()), this.Method3184(a.Method2821(), a.Method2822(), a.Method2823()), this.Method3376(a.Method2823()));
      } else {
         return a;
      }
   }

   public String Method3378(String a, boolean a1) {
      return null;
   }

   protected Class63 Method3379(Class63 a) {
      return new Class65(a, this);
   }

   public String Method3184(String a, String a, String a2) {
      return a;
   }

   public String Method3380(String a, String a1) {
      return a;
   }

   public String Method3185(String a, String a, String a2) {
      return a;
   }

   public String Method3183(String a) {
      return a;
   }

   public static void Method3381(boolean boolean1) {
      Field301 = boolean1;
   }

   public static boolean Method3382() {
      return Field301;
   }

   public static boolean Method3383() {
      boolean var0 = Method3382();
      return true;
   }

   static {
      Method3381(false);
   }
}
