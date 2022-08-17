package awsl;

public class Class566 {
   private static String Method1235(Class290 a) throws Class666 {
      char a;
      do {
         a = a.Method2885();
      } while(a == ' ' || a == '\t');

      switch (a) {
         case '\u0000':
            return null;
         case '"':
         case '\'':
            char a = a;
            StringBuilder a = new StringBuilder();

            while(true) {
               a = a.Method2885();
               if (a == a) {
                  char a = a.Method2885();
                  if (a != '"') {
                     a.Method2880();
                     return a.toString();
                  }
               }

               if (a == '\n' || a == '\r') {
                  throw a.Method2895("Missing close quote '" + a + "'.");
               }

               a.append(a);
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
      Class288 a = new Class288();

      while(true) {
         String a = Method1235(a);
         char a = a.Method2885();
         if (a.Method10() == 0 && a.length() == 0 && a != ',') {
            return null;
         }

         a.Method3154(a);

         while(a != ',') {
            if (a != ' ') {
               if (a != '\n' && a != '\r') {
                  ;
               }

               return a;
            }

            a = a.Method2885();
         }
      }
   }

   public static Class298 Method1237(Class288 a, Class290 a) throws Class666 {
      Class288 a = Method1236(a);
      return a.Method3173(a);
   }

   public static String Method1238(Class288 a) {
      Class666.Method3438();
      StringBuilder a = new StringBuilder();
      int a = 0;
      if (a < a.Method10()) {
         a.append(',');
         Object a = a.Method3128(a);
         String a = a.Method3780();
         if (a.length() > 0 && (a.indexOf(44) >= 0 || a.indexOf(10) >= 0 || a.indexOf(13) >= 0 || a.indexOf(0) >= 0 || a.charAt(0) == '"')) {
            a.append('"');
            int a = a.length();
            int a = 0;
            if (a < a) {
               char a = a.charAt(a);
               if (a >= ' ' && a != '"') {
                  a.append(a);
               }

               ++a;
            }

            a.append('"');
         }

         a.append(a);
         ++a;
      }

      a.append('\n');
      return a.toString();
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
         Class288 a = new Class288();
         Class298 a = Method1237(a, a);
         return a.Method10() == 0 ? null : a;
      }
   }

   public static String Method1243(Class288 a) throws Class666 {
      Class298 a = a.Method3140(0);
      Class288 a = a.Method2972();
      return Method1238(a) + Method1244(a, a);
   }

   public static String Method1244(Class288 a, Class288 a) throws Class666 {
      if (a.Method10() == 0) {
         return null;
      } else {
         StringBuilder a = new StringBuilder();

         for(int a = 0; a < a.Method10(); ++a) {
            Class298 a = a.Method3140(a);
            a.append(Method1238(a.Method3024(a)));
         }

         return a.toString();
      }
   }

   private static Class666 Method1245(Class666 class666) {
      return class666;
   }
}
