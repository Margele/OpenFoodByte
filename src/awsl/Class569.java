package awsl;

import java.util.Iterator;

public class Class569 {
   public static Class298 Method1007(String a) throws Class666 {
      Class298 a = new Class298();
      Class666.Method3438();
      Class290 a = new Class290(a);
      if (a.Method2884()) {
         String a = Class568.Method1252(a.Method2891('='));
         a.Method2887('=');
         a.Method3009(a, Class568.Method1252(a.Method2891(';')));
         a.Method2885();
      }

      return a;
   }

   public static String Method1008(Class298 a) throws Class666 {
      Class666.Method3438();
      boolean a = false;
      StringBuilder a = new StringBuilder();
      Iterator var4 = a.Method2968().Method1383();
      if (var4.Method932()) {
         String a = (String)var4.Method933();
         Object a = a.Method2974(a);
         if (!Class298.Field1580.Method3429(a)) {
            a.append(';');
            a.append(Class568.Method1249(a));
            a.append("=");
            a.append(Class568.Method1249(a.Method3780()));
            a = true;
         }
      }

      return a.toString();
   }

   private static Class666 Method1009(Class666 class666) {
      return class666;
   }
}
