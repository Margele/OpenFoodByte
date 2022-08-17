package awsl;

public class Class31 {
   public static final int Field252 = 0;
   public static final int Field253 = 1;
   public static final int Field254 = 2;
   public static final int Field255 = 3;
   byte[] Field256;
   int Field257;

   Class31(byte[] a, int a) {
      this.Field256 = a;
      this.Field257 = a;
   }

   public int Method3432() {
      return this.Field256[this.Field257];
   }

   public int Method3433(int a) {
      return this.Field256[this.Field257 + 2 * a + 1];
   }

   public int Method3434(int a) {
      return this.Field256[this.Field257 + 2 * a + 2];
   }

   public static Class31 Method3435(String a) {
      String[] a = Class267.Method2862();
      if (a.length() == 0) {
         return null;
      } else {
         int a = a.length();
         Class138 a = new Class138(a);
         a.Method485(0);
         int a = 0;
         if (a < a) {
            char a = a.charAt(a++);
            if (a == '[') {
               a.Method486(0, 0);
            }

            if (a == '.') {
               a.Method486(1, 0);
            }

            if (a == '*') {
               a.Method486(2, 0);
            }

            if (a >= '0' && a <= '9') {
               int a = a - 48;
               if (a < a && (a = a.charAt(a)) >= '0' && a <= '9') {
                  a = a * 10 + a - 48;
                  ++a;
               }

               a.Method486(3, a);
            }
         }

         a.Field990[0] = (byte)(a.Field991 / 2);
         return new Class31(a.Field990, 0);
      }
   }

   public String Method3436() {
      int a = this.Method3432();
      StringBuilder a = new StringBuilder(a * 2);

      for(int a = 0; a < a; ++a) {
         switch (this.Method3433(a)) {
            case 0:
               a.append('[');
               break;
            case 1:
               a.append('.');
               break;
            case 2:
               a.append('*');
               break;
            case 3:
               a.append(this.Method3434(a));
               break;
            default:
               a.append('_');
         }
      }

      return a.toString();
   }
}
