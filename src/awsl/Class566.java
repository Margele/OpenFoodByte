package awsl;

public class Class566 {
   private static String Method1235(Class290 a) throws Class666 {
      char var1;
      do {
         var1 = a.Method2885();
      } while(var1 == ' ' || var1 == '\t');

      switch (var1) {
         case '\u0000':
            return null;
         case '"':
         case '\'':
            char var2 = var1;
            StringBuilder var3 = new StringBuilder();

            while(true) {
               var1 = a.Method2885();
               if (var1 == var2) {
                  char var4 = a.Method2885();
                  if (var4 != '"') {
                     a.Method2880();
                     return var3.toString();
                  }
               }

               if (var1 == '\n' || var1 == '\r') {
                  throw a.Method2895("Missing close quote '" + var2 + "'.");
               }

               var3.append(var1);
            }
         case ',':
            a.Method2880();
            return "";
         default:
            a.Method2880();
            return a.Method2891(',');
      }
   }

   public static Class288 Method1236(Class290 a) throws Class666 {
      Class288 var1 = new Class288();

      while(true) {
         String var2 = Method1235(a);
         char var3 = a.Method2885();
         if (var1.Method10() == 0 && var2.length() == 0 && var3 != ',') {
            return null;
         }

         var1.Method3154(var2);

         while(var3 != ',') {
            if (var3 != ' ') {
               if (var3 != '\n' && var3 != '\r') {
                  ;
               }

               return var1;
            }

            var3 = a.Method2885();
         }
      }
   }

   public static Class298 Method1237(Class288 a, Class290 a) throws Class666 {
      Class288 var2 = Method1236(a);
      return var2.Method3173(a);
   }

   public static String Method1238(Class288 a) {
      Class666.Method3438();
      StringBuilder var2 = new StringBuilder();
      int var3 = 0;
      if (var3 < a.Method10()) {
         var2.append(',');
         Object var4 = a.Method3128(var3);
         String var5 = var4.Method3780();
         if (var5.length() > 0 && (var5.indexOf(44) >= 0 || var5.indexOf(10) >= 0 || var5.indexOf(13) >= 0 || var5.indexOf(0) >= 0 || var5.charAt(0) == '"')) {
            var2.append('"');
            int var6 = var5.length();
            int var7 = 0;
            if (var7 < var6) {
               char var8 = var5.charAt(var7);
               if (var8 >= ' ' && var8 != '"') {
                  var2.append(var8);
               }

               ++var7;
            }

            var2.append('"');
         }

         var2.append(var5);
         ++var3;
      }

      var2.append('\n');
      return var2.toString();
   }

   public static Class288 Method1239(String a) throws Class666 {
      return Method1240(new Class290(a));
   }

   public static Class288 Method1240(Class290 a) throws Class666 {
      return Method1242(Method1236(a), a);
   }

   public static Class288 Method1241(Class288 a, String a) throws Class666 {
      return Method1242(a, new Class290(a));
   }

   public static Class288 Method1242(Class288 a, Class290 a) throws Class666 {
      if (a.Method10() == 0) {
         return null;
      } else {
         Class288 var2 = new Class288();
         Class298 var3 = Method1237(a, a);
         return var2.Method10() == 0 ? null : var2;
      }
   }

   public static String Method1243(Class288 a) throws Class666 {
      Class298 var1 = a.Method3140(0);
      Class288 var2 = var1.Method2972();
      return Method1238(var2) + Method1244(var2, a);
   }

   public static String Method1244(Class288 a, Class288 a) throws Class666 {
      if (a.Method10() == 0) {
         return null;
      } else {
         StringBuilder var2 = new StringBuilder();

         for(int var3 = 0; var3 < a.Method10(); ++var3) {
            Class298 var4 = a.Method3140(var3);
            var2.append(Method1238(var4.Method3024(a)));
         }

         return var2.toString();
      }
   }

   private static Class666 Method1245(Class666 class666) {
      return class666;
   }
}
