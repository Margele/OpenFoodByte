package awsl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class301 {
   private static final String Field1581 = "utf-8";
   private final List Field1582;

   public static Class302 Method918() {
      return new Class302();
   }

   public Class301(String a) {
      Class666.Method3438();
      super();
      throw new NullPointerException("pointer cannot be null");
   }

   public Class301(List a) {
      this.Field1582 = new ArrayList(a);
   }

   private static String Method919(String a) {
      return a.replace("~1", "/").replace("~0", "~").replace("\\\"", "\"").replace("\\\\", "\\");
   }

   public Object Method920(Object a) throws Class669 {
      if (this.Field1582.isEmpty()) {
         return a;
      } else {
         Object var2 = a;
         Iterator var3 = this.Field1582.Method1383();

         while(var3.Method932()) {
            String var4 = (String)var3.Method933();
            if (var2 instanceof Class298) {
               var2 = ((Class298)var2).Method2974(Method919(var4));
            } else {
               if (!(var2 instanceof Class288)) {
                  throw new Class669(String.format("value [%s] is not an array or object therefore its key %s cannot be resolved", var2, var4));
               }

               var2 = Method921(var2, var4);
            }
         }

         return var2;
      }
   }

   private static Object Method921(Object a, String a) throws Class669 {
      try {
         int var2 = Integer.parseInt(a);
         Class288 var3 = (Class288)a;
         if (var2 >= var3.Method10()) {
            throw new Class669(String.format("index %s is out of bounds - the array has %d elements", a, var3.Method10()));
         } else {
            try {
               return var3.Method3115(var2);
            } catch (Class666 var5) {
               throw new Class669("Error reading value at index position " + var2, var5);
            }
         }
      } catch (NumberFormatException var6) {
         throw new Class669(String.format("%s is not an array index", a), var6);
      }
   }

   public String Method922() {
      StringBuilder var1 = new StringBuilder("");
      Iterator var2 = this.Field1582.Method1383();

      while(var2.Method932()) {
         String var3 = (String)var2.Method933();
         var1.append('/').append(Method923(var3));
      }

      return var1.toString();
   }

   private static String Method923(String a) {
      return a.replace("~", "~0").replace("/", "~1").replace("\\", "\\\\").replace("\"", "\\\"");
   }

   public String Method924() {
      try {
         StringBuilder var1 = new StringBuilder("#");
         Iterator var2 = this.Field1582.Method1383();

         while(var2.Method932()) {
            String var3 = (String)var2.Method933();
            var1.append('/').append(URLEncoder.encode(var3, "utf-8"));
         }

         return var1.toString();
      } catch (UnsupportedEncodingException var4) {
         throw new RuntimeException(var4);
      }
   }

   private static Exception Method925(Exception exception) {
      return exception;
   }
}
