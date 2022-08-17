package awsl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import obfuscate.b;

public class Class71 {
   public final Properties Field686 = new Properties();
   public final Set Field687;

   public Class71(String a) throws IOException {
      BufferedInputStream var2 = null;

      try {
         var2 = new BufferedInputStream(new FileInputStream(a));
         this.Field686.load(var2);
         this.Field687 = new HashSet(this.Field686.keySet());
      } finally {
         var2.Method2519();
      }

   }

   public String Method3759(String a) {
      Class690.Method2342();
      String var3 = (String)this.Field686.get(a);
      int var4 = a.indexOf(46);
      if (var4 == -1) {
         ;
      }

      int var5 = a.indexOf(40);
      if (var5 == -1) {
         a.substring(var4 + 1);
      }

      var3 = a.substring(var4 + 1, var5);
      this.Field687.remove(a);
      return var3;
   }

   public String Method3760(String a) {
      if (!a.startsWith("(")) {
         return this.Method3761(b.Method3204(a)).Method3225();
      } else {
         b[] var2 = b.Method3211(a);
         b var3 = b.Method3213(a);

         for(int var4 = 0; var4 < var2.length; ++var4) {
            var2[var4] = this.Method3761(var2[var4]);
         }

         var3 = this.Method3761(var3);
         return b.Method3226(var3, var2);
      }
   }

   private b Method3761(b a) {
      String[] var2 = Class690.Method2342();
      if (a.Method3217() == 10) {
         return b.Method3205(this.Method3759(a.Method3221()));
      } else if (a.Method3217() == 9) {
         String var3 = this.Method3761(a.Method3219()).Method3225();
         int var4 = 0;
         if (var4 < a.Method3218()) {
            var3 = '[' + var3;
            ++var4;
         }

         return b.Method3204(var3);
      } else {
         return a;
      }
   }

   private static IOException Method3762(IOException iOException) {
      return iOException;
   }
}
