package awsl;

import java.util.Locale;
import obfuscate.a;

public class Class287 {
   public static final String Field1550 = "\r\n";

   public static Class298 Method3106(String a) throws Class666 {
      Class298 a = new Class298();
      Class291 a = new Class291(a);
      String a = a.Method2899();
      if (a.toUpperCase(Locale.ROOT).startsWith("HTTP")) {
         a.Method3009("HTTP-Version", a);
         a.Method3009("Status-Code", a.Method2899());
         a.Method3009("Reason-Phrase", a.Method2891('\u0000'));
         a.Method2885();
      } else {
         a.Method3009("Method", a);
         a.Method3009("Request-URI", a.Method2899());
         a.Method3009("HTTP-Version", a.Method2899());
      }

      while(a.Method2884()) {
         String a = a.Method2891(':');
         a.Method2887(':');
         a.Method3009(a, a.Method2891('\u0000'));
         a.Method2885();
      }

      return a;
   }

   public static String Method3107(Class298 a) throws Class666 {
      Class666.Method3438();
      StringBuilder a = new StringBuilder();
      if (a.Method2964("Status-Code") && a.Method2964("Reason-Phrase")) {
         a.append(a.Method2963("HTTP-Version"));
         a.append(' ');
         a.append(a.Method2963("Status-Code"));
         a.append(' ');
         a.append(a.Method2963("Reason-Phrase"));
         a.trash(new String[2]);
      }

      if (a.Method2964("Method") && a.Method2964("Request-URI")) {
         a.append(a.Method2963("Method"));
         a.append(' ');
         a.append('"');
         a.append(a.Method2963("Request-URI"));
         a.append('"');
         a.append(' ');
         a.append(a.Method2963("HTTP-Version"));
      }

      throw new Class666("Not enough material for an HTTP header.");
   }

   private static Class666 Method3108(Class666 class666) {
      return class666;
   }
}
