package awsl;

import obfuscate.b;

public abstract class Class37 {
   private static boolean Field301;

   public String Method3372(String a) {
      Method3383();
      b var3 = b.Method3204(a);
      switch (var3.Method3217()) {
         case 9:
            String var4 = this.Method3372(var3.Method3219().Method3225());
            int var6 = 0;
            if (var6 < var3.Method3218()) {
               var4 = '[' + var4;
               ++var6;
            }

            return var4;
         case 10:
            String var5 = this.Method3183(var3.Method3221());
            return 'L' + var5 + ';';
         default:
            return a;
      }
   }

   private b Method3373(b a) {
      boolean var2 = Method3382();
      String var3;
      switch (a.Method3217()) {
         case 9:
            var3 = this.Method3372(a.Method3219().Method3225());
            int var4 = 0;
            if (var4 < a.Method3218()) {
               var3 = '[' + var3;
               ++var4;
            }

            return b.Method3204(var3);
         case 10:
            var3 = this.Method3183(a.Method3221());
            return b.Method3205(var3);
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
      String[] var2 = null;
      boolean var3 = false;

      for(int var4 = 0; var4 < a.length; ++var4) {
         String var5 = a[var4];
         String var6 = this.Method3183(var5);
         var2 = new String[a.length];
         System.arraycopy(a, 0, var2, 0, var4);
         var3 = true;
         var2[var4] = var5;
      }

      return var2;
   }

   public String Method3376(String a) {
      boolean var2 = Method3383();
      if ("()V".equals(a)) {
         return a;
      } else {
         b[] var3 = b.Method3211(a);
         StringBuilder var4 = new StringBuilder("(");
         int var5 = 0;
         if (var5 < var3.length) {
            var4.append(this.Method3372(var3[var5].Method3225()));
            ++var5;
         }

         b var6 = b.Method3213(a);
         if (var6 == b.Field572) {
            var4.append(")V");
            return var4.toString();
         } else {
            var4.append(')').append(this.Method3372(var6.Method3225()));
            return var4.toString();
         }
      }
   }

   public Object Method3377(Object a) {
      if (a instanceof b) {
         return this.Method3373((b)a);
      } else if (a instanceof Class279) {
         Class279 var2 = (Class279)a;
         return new Class279(var2.Method2820(), this.Method3374(var2.Method2821()), this.Method3184(var2.Method2821(), var2.Method2822(), var2.Method2823()), this.Method3376(var2.Method2823()));
      } else {
         return a;
      }
   }

   public String Method3378(String a, boolean a) {
      return null;
   }

   protected Class63 Method3379(Class63 a) {
      return new Class65(a, this);
   }

   public String Method3184(String a, String a, String a) {
      return a;
   }

   public String Method3380(String a, String a) {
      return a;
   }

   public String Method3185(String a, String a, String a) {
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
