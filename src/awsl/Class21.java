package awsl;

import java.io.PrintWriter;
import java.io.StringWriter;

class Class21 extends Class15 {
   final Class267 Field232;

   Class21(int a, int a, String a, String a, String a, String[] a, Class267 class267) {
      super(a, a, a, a, a, a);
      this.Field232 = class267;
   }

   public void Method1653() {
      Class780 a = new Class780(new Class811());

      try {
         a.Method847("dummy", this);
      } catch (Exception var5) {
         if (var5 instanceof IndexOutOfBoundsException && this.Field211 == 0 && this.Field210 == 0) {
            throw new RuntimeException("Data flow checking option requires valid, non zero maxLocals and maxStack values.");
         }

         var5.printStackTrace();
         StringWriter a = new StringWriter();
         PrintWriter a = new PrintWriter(a, true);
         Class225.Method2194(this, a, a);
         a.close();
         throw new RuntimeException(var5.getMessage() + ' ' + a.toString());
      }

      this.Method3444(this.Field232);
   }

   private static Exception Method1642(Exception exception) {
      return exception;
   }
}
