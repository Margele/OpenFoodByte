package awsl;

import java.util.Locale;
import obfuscate.a;

public class Class287 {
   public static final String Field1550 = "\r\n";

   public static Class298 Method3106(String a) throws Class666 {
      Class298 var1 = new Class298();
      Class291 var2 = new Class291(a);
      String var3 = var2.Method2899();
      if (var3.toUpperCase(Locale.ROOT).startsWith("HTTP")) {
         var1.Method3009("HTTP-Version", var3);
         var1.Method3009("Status-Code", var2.Method2899());
         var1.Method3009("Reason-Phrase", var2.Method2891('\u0000'));
         var2.Method2885();
      } else {
         var1.Method3009("Method", var3);
         var1.Method3009("Request-URI", var2.Method2899());
         var1.Method3009("HTTP-Version", var2.Method2899());
      }

      while(var2.Method2884()) {
         String var4 = var2.Method2891(':');
         var2.Method2887(':');
         var1.Method3009(var4, var2.Method2891('\u0000'));
         var2.Method2885();
      }

      return var1;
   }

   public static String Method3107(Class298 a) throws Class666 {
      Class666.Method3438();
      StringBuilder var2 = new StringBuilder();
      if (a.Method2964("Status-Code") && a.Method2964("Reason-Phrase")) {
         var2.append(a.Method2963("HTTP-Version"));
         var2.append(' ');
         var2.append(a.Method2963("Status-Code"));
         var2.append(' ');
         var2.append(a.Method2963("Reason-Phrase"));
         a.trash(new String[2]);
      }

      if (a.Method2964("Method") && a.Method2964("Request-URI")) {
         var2.append(a.Method2963("Method"));
         var2.append(' ');
         var2.append('"');
         var2.append(a.Method2963("Request-URI"));
         var2.append('"');
         var2.append(' ');
         var2.append(a.Method2963("HTTP-Version"));
      }

      throw new Class666("Not enough material for an HTTP header.");
   }

   private static Class666 Method3108(Class666 class666) {
      return class666;
   }
}
