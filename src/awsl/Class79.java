package awsl;

public class Class79 {
   private final String Field706;

   public Class79(String a) {
      this.Field706 = a;
   }

   public void Method3748(Class63 a) {
      String a = this.Field706;
      int a = a.length();
      int a;
      if (a.charAt(0) == '<') {
         a = 2;

         char a;
         do {
            int a = a.indexOf(58, a);
            a.Method3610(a.substring(a - 1, a));
            a = a + 1;
            a = a.charAt(a);
            if (a == 'L' || a == '[' || a == 'T') {
               a = Method3750(a, a, a.Method3611());
            }

            while((a = a.charAt(a++)) == ':') {
               a = Method3750(a, a, a.Method3612());
            }
         } while(a != '>');
      } else {
         a = 0;
      }

      if (a.charAt(a) == '(') {
         ++a;

         while(a.charAt(a) != ')') {
            a = Method3750(a, a, a.Method3615());
         }

         for(a = Method3750(a, a + 1, a.Method3616()); a < a; a = Method3750(a, a + 1, a.Method3617())) {
         }
      } else {
         for(a = Method3750(a, a, a.Method3613()); a < a; a = Method3750(a, a, a.Method3614())) {
         }
      }

   }

   public void Method3749(Class63 a) {
      Method3750(this.Field706, 0, a);
   }

   private static int Method3750(String a, int a, Class63 a) {
      String a = Class63.Method3784();
      char a;
      switch (a = a.charAt(a++)) {
         case 'B':
         case 'C':
         case 'D':
         case 'F':
         case 'I':
         case 'J':
         case 'S':
         case 'V':
         case 'Z':
            a.Method3618(a);
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
            int a = a;
            boolean a = false;
            boolean a = false;

            while(true) {
               String a;
               label28:
               while(true) {
                  switch (a = a.charAt(a++)) {
                     case '.':
                     case ';':
                        a = a.substring(a, a - 1);
                        a.Method3622(a);
                        a.Method3621(a);
                        if (a == ';') {
                           a.Method3625();
                           return a;
                        }

                        a = a;
                        a = false;
                        a = true;
                     case '<':
                        break label28;
                  }
               }

               a = a.substring(a, a - 1);
               a.Method3622(a);
               a.Method3621(a);
               a = true;
               switch (a = a.charAt(a)) {
                  case '>':
                  case '*':
                     ++a;
                     a.Method3623();
                  case '+':
                  case '-':
                     a = Method3750(a, a + 1, a.Method3624(a));
                  default:
                     a = Method3750(a, a, a.Method3624('='));
               }
            }
         case 'T':
            int a = a.indexOf(59, a);
            a.Method3619(a.substring(a, a));
            return a + 1;
         case '[':
            return Method3750(a, a, a.Method3620());
      }
   }
}
