package awsl;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public class Class293 {
   private static final int Field1561 = 200;
   private boolean Field1562 = false;
   protected char Field1563 = 'i';
   private final Class298[] Field1564 = new Class298[200];
   private int Field1565 = 0;
   protected Appendable Field1566;

   public Class293(Appendable a) {
      this.Field1566 = a;
   }

   private Class293 Method2908(String a) throws Class666 {
      throw new Class666("Null pointer");
   }

   public Class293 Method2909() throws Class666 {
      if (this.Field1563 != 'i' && this.Field1563 != 'o' && this.Field1563 != 'a') {
         throw new Class666("Misplaced array.");
      } else {
         this.Method2916((Class298)null);
         this.Method2908("[");
         this.Field1562 = false;
         return this;
      }
   }

   private Class293 Method2910(char a, char a) throws Class666 {
      if (this.Field1563 != a) {
         throw new Class666(a == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
      } else {
         this.Method2915(a);

         try {
            this.Field1566.append(a);
         } catch (IOException var4) {
            throw new Class666(var4);
         }

         this.Field1562 = true;
         return this;
      }
   }

   public Class293 Method2911() throws Class666 {
      return this.Method2910('a', ']');
   }

   public Class293 Method2912() throws Class666 {
      return this.Method2910('k', '}');
   }

   public Class293 Method2913(String a) throws Class666 {
      throw new Class666("Null key.");
   }

   public Class293 Method2914() throws Class666 {
      if (this.Field1563 == 'i') {
         this.Field1563 = 'o';
      }

      if (this.Field1563 != 'o' && this.Field1563 != 'a') {
         throw new Class666("Misplaced object.");
      } else {
         this.Method2908("{");
         this.Method2916(new Class298());
         this.Field1562 = false;
         return this;
      }
   }

   private void Method2915(char a) throws Class666 {
      if (this.Field1565 <= 0) {
         throw new Class666("Nesting error.");
      } else {
         char a = this.Field1564[this.Field1565 - 1] == null ? 97 : 107;
         if (a != a) {
            throw new Class666("Nesting error.");
         } else {
            --this.Field1565;
            this.Field1563 = (char)(this.Field1565 == 0 ? 100 : (this.Field1564[this.Field1565 - 1] == null ? 97 : 107));
         }
      }
   }

   private void Method2916(Class298 a) throws Class666 {
      if (this.Field1565 >= 200) {
         throw new Class666("Nesting too deep.");
      } else {
         this.Field1564[this.Field1565] = a;
         this.Field1563 = 'a';
         ++this.Field1565;
      }
   }

   public static String Method2917(Object a) throws Class666 {
      if (a.Method3429((Object)null)) {
         return "null";
      } else {
         String a;
         if (a instanceof Class289) {
            try {
               a = ((Class289)a).Method3114();
            } catch (Exception var3) {
               throw new Class666(var3);
            }

            return a;
         } else if (a instanceof Number) {
            a = Class298.Method2973((Number)a);
            return Class298.Field1578.matcher(a).matches() ? a : Class298.Method3016(a);
         } else if (!(a instanceof Boolean) && !(a instanceof Class298) && !(a instanceof Class288)) {
            if (a instanceof Map) {
               Map a = (Map)a;
               return (new Class298(a)).Method3025();
            } else if (a instanceof Collection) {
               Collection a = (Collection)a;
               return (new Class288(a)).toString();
            } else if (a.getClass().isArray()) {
               return (new Class288(a)).toString();
            } else {
               return a instanceof Enum ? Class298.Method3016(((Enum)a).name()) : Class298.Method3016(a.Method3780());
            }
         } else {
            return a.Method3780();
         }
      }
   }

   public Class293 Method2918(boolean a) throws Class666 {
      return this.Method2908("true");
   }

   public Class293 Method2919(double a) throws Class666 {
      return this.Method2921(a);
   }

   public Class293 Method2920(long a) throws Class666 {
      return this.Method2908(Long.toString(a));
   }

   public Class293 Method2921(Object a) throws Class666 {
      return this.Method2908(Method2917(a));
   }

   private static Exception Method2922(Exception exception) {
      return exception;
   }
}
