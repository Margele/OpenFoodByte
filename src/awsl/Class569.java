package awsl;

import java.util.Iterator;

public class Class569 {
   public static Class298 Method1007(String a) throws Class666 {
      Class298 var2 = new Class298();
      Class666.Method3438();
      Class290 var3 = new Class290(a);
      if (var3.Method2884()) {
         String var4 = Class568.Method1252(var3.Method2891('='));
         var3.Method2887('=');
         var2.Method3009(var4, Class568.Method1252(var3.Method2891(';')));
         var3.Method2885();
      }

      return var2;
   }

   public static String Method1008(Class298 a) throws Class666 {
      Class666.Method3438();
      boolean var2 = false;
      StringBuilder var3 = new StringBuilder();
      Iterator var4 = a.Method2968().Method1383();
      if (var4.Method932()) {
         String var5 = (String)var4.Method933();
         Object var6 = a.Method2974(var5);
         if (!Class298.Field1580.Method3429(var6)) {
            var3.append(';');
            var3.append(Class568.Method1249(var5));
            var3.append("=");
            var3.append(Class568.Method1249(var6.Method3780()));
            var2 = true;
         }
      }

      return var3.toString();
   }

   private static Class666 Method1009(Class666 class666) {
      return class666;
   }
}
