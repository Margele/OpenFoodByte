package awsl;

public class Class79 {
   private final String Field706;

   public Class79(String a) {
      this.Field706 = a;
   }

   public void Method3748(Class63 a) {
      String var2 = this.Field706;
      int var3 = var2.length();
      int var4;
      if (var2.charAt(0) == '<') {
         var4 = 2;

         char var5;
         do {
            int var6 = var2.indexOf(58, var4);
            a.Method3610(var2.substring(var4 - 1, var6));
            var4 = var6 + 1;
            var5 = var2.charAt(var4);
            if (var5 == 'L' || var5 == '[' || var5 == 'T') {
               var4 = Method3750(var2, var4, a.Method3611());
            }

            while((var5 = var2.charAt(var4++)) == ':') {
               var4 = Method3750(var2, var4, a.Method3612());
            }
         } while(var5 != '>');
      } else {
         var4 = 0;
      }

      if (var2.charAt(var4) == '(') {
         ++var4;

         while(var2.charAt(var4) != ')') {
            var4 = Method3750(var2, var4, a.Method3615());
         }

         for(var4 = Method3750(var2, var4 + 1, a.Method3616()); var4 < var3; var4 = Method3750(var2, var4 + 1, a.Method3617())) {
         }
      } else {
         for(var4 = Method3750(var2, var4, a.Method3613()); var4 < var3; var4 = Method3750(var2, var4, a.Method3614())) {
         }
      }

   }

   public void Method3749(Class63 a) {
      Method3750(this.Field706, 0, a);
   }

   private static int Method3750(String a, int a, Class63 a) {
      String var3 = Class63.Method3784();
      char var4;
      switch (var4 = a.charAt(a++)) {
         case 'B':
         case 'C':
         case 'D':
         case 'F':
         case 'I':
         case 'J':
         case 'S':
         case 'V':
         case 'Z':
            a.Method3618(var4);
            return a;
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'U':
         case 'W':
         case 'X':
         case 'Y':
         default:
            int var5 = a;
            boolean var7 = false;
            boolean var8 = false;

            while(true) {
               String var9;
               label28:
               while(true) {
                  switch (var4 = a.charAt(a++)) {
                     case '.':
                     case ';':
                        var9 = a.substring(var5, a - 1);
                        a.Method3622(var9);
                        a.Method3621(var9);
                        if (var4 == ';') {
                           a.Method3625();
                           return a;
                        }

                        var5 = a;
                        var7 = false;
                        var8 = true;
                     case '<':
                        break label28;
                  }
               }

               var9 = a.substring(var5, a - 1);
               a.Method3622(var9);
               a.Method3621(var9);
               var7 = true;
               switch (var4 = a.charAt(a)) {
                  case '>':
                  case '*':
                     ++a;
                     a.Method3623();
                  case '+':
                  case '-':
                     a = Method3750(a, a + 1, a.Method3624(var4));
                  default:
                     a = Method3750(a, a, a.Method3624('='));
               }
            }
         case 'T':
            int var6 = a.indexOf(59, a);
            a.Method3619(a.substring(a, var6));
            return var6 + 1;
         case '[':
            return Method3750(a, a, a.Method3620());
      }
   }
}
