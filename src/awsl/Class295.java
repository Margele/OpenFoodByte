package awsl;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class Class295 {
   public static Class298 Method2943(Properties a) throws Class666 {
      Class666.Method3438();
      Class298 var2 = new Class298();
      if (!a.isEmpty()) {
         Enumeration var3 = a.propertyNames();
         if (var3.hasMoreElements()) {
            String var4 = (String)var3.nextElement();
            var2.Method3009(var4, a.getProperty(var4));
         }
      }

      return var2;
   }

   public static Properties Method2944(Class298 a) throws Class666 {
      Class666.Method3438();
      Properties var2 = new Properties();
      Iterator var3 = a.Method2968().Method1383();
      if (var3.Method932()) {
         String var4 = (String)var3.Method933();
         Object var5 = a.Method2974(var4);
         if (!Class298.Field1580.Method3429(var5)) {
            var2.put(var4, var5.Method3780());
         }
      }

      return var2;
   }

   private static Class666 Method2945(Class666 class666) {
      return class666;
   }
}
