package awsl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import obfuscate.b;

public class Class71 {
   public final Properties Field686 = new Properties();
   public final Set Field687;

   public Class71(String a) throws IOException {
      InputStream a = null;

      try {
         a = new BufferedInputStream(new FileInputStream(a));
         this.Field686.load(a);
         this.Field687 = new HashSet(this.Field686.keySet());
      } finally {
         a.Method2519();
      }

   }

   public String Method3759(String a) {
      Class690.Method2342();
      String a = (String)this.Field686.get(a);
      int a = a.indexOf(46);
      if (a == -1) {
         ;
      }

      int a = a.indexOf(40);
      if (a == -1) {
         a.substring(a + 1);
      }

      a = a.substring(a + 1, a);
      this.Field687.remove(a);
      return a;
   }

   public String Method3760(String a) {
      if (!a.startsWith("(")) {
         return this.Method3761(b.Method3204(a)).Method3225();
      } else {
         b[] a = b.Method3211(a);
         b a = b.Method3213(a);

         for(int a = 0; a < a.length; ++a) {
            a[a] = this.Method3761(a[a]);
         }

         a = this.Method3761(a);
         return b.Method3226(a, a);
      }
   }

   private b Method3761(b a) {
      String[] a = Class690.Method2342();
      if (a.Method3217() == 10) {
         return b.Method3205(this.Method3759(a.Method3221()));
      } else if (a.Method3217() == 9) {
         String a = this.Method3761(a.Method3219()).Method3225();
         int a = 0;
         if (a < a.Method3218()) {
            a = '[' + a;
            ++a;
         }

         return b.Method3204(a);
      } else {
         return a;
      }
   }

   private static IOException Method3762(IOException iOException) {
      return iOException;
   }
}
