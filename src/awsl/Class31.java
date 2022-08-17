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
      String[] var1 = Class267.Method2862();
      if (a.length() == 0) {
         return null;
      } else {
         int var2 = a.length();
         Class138 var3 = new Class138(var2);
         var3.Method485(0);
         int var4 = 0;
         if (var4 < var2) {
            char var5 = a.charAt(var4++);
            if (var5 == '[') {
               var3.Method486(0, 0);
            }

            if (var5 == '.') {
               var3.Method486(1, 0);
            }

            if (var5 == '*') {
               var3.Method486(2, 0);
            }

            if (var5 >= '0' && var5 <= '9') {
               int var6 = var5 - 48;
               if (var4 < var2 && (var5 = a.charAt(var4)) >= '0' && var5 <= '9') {
                  var6 = var6 * 10 + var5 - 48;
                  ++var4;
               }

               var3.Method486(3, var6);
            }
         }

         var3.Field990[0] = (byte)(var3.Field991 / 2);
         return new Class31(var3.Field990, 0);
      }
   }

   public String Method3436() {
      int var1 = this.Method3432();
      StringBuilder var2 = new StringBuilder(var1 * 2);

      for(int var3 = 0; var3 < var1; ++var3) {
         switch (this.Method3433(var3)) {
            case 0:
               var2.append('[');
               break;
            case 1:
               var2.append('.');
               break;
            case 2:
               var2.append('*');
               break;
            case 3:
               var2.append(this.Method3434(var3));
               break;
            default:
               var2.append('_');
         }
      }

      return var2.toString();
   }
}
