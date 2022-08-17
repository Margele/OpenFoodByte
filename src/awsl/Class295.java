package awsl;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class Class295 {
   public static Class298 Method2943(Properties a) throws Class666 {
      Class666.Method3438();
      Class298 a = new Class298();
      if (!a.isEmpty()) {
         Enumeration a = a.propertyNames();
         if (a.hasMoreElements()) {
            String a = (String)a.nextElement();
            a.Method3009(a, a.getProperty(a));
         }
      }

      return a;
   }

   public static Properties Method2944(Class298 a) throws Class666 {
      Class666.Method3438();
      Properties a = new Properties();
      Iterator var3 = a.Method2968().Method1383();
      if (var3.Method932()) {
         String a = (String)var3.Method933();
         Object a = a.Method2974(a);
         if (!Class298.Field1580.Method3429(a)) {
            a.put(a, a.Method3780());
         }
      }

      return a;
   }

   private static Class666 Method2945(Class666 class666) {
      return class666;
   }
}
