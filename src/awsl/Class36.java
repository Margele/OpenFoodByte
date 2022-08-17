package awsl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import obfuscate.b;

public class Class36 {
   private final String Field298;
   private final String Field299;
   private static final Map Field300 = new HashMap();

   public Class36(String a, String a) {
      this.Field298 = a;
      this.Field299 = a;
   }

   public Class36(String a, b a, b[] a) {
      this(a, b.Method3226(a, a));
   }

   public static Class36 Method3419(Method a) {
      return new Class36(a.getName(), b.Method3231(a));
   }

   public static Class36 Method3420(Constructor a) {
      return new Class36("<init>", b.Method3230(a));
   }

   public static Class36 Method3421(String a) throws IllegalArgumentException {
      return Method3422(a, false);
   }

   public static Class36 Method3422(String a, boolean a) throws IllegalArgumentException {
      int a = a.indexOf(32);
      int a = a.indexOf(40, a) + 1;
      int a = a.indexOf(41, a);
      if (a != -1 && a != -1 && a != -1) {
         String a = a.substring(0, a);
         String a = a.substring(a + 1, a - 1).trim();
         StringBuilder a = new StringBuilder();
         a.append('(');

         int a;
         do {
            a = a.indexOf(44, a);
            String a;
            if (a == -1) {
               a = Method3423(a.substring(a, a).trim(), a);
            } else {
               a = Method3423(a.substring(a, a).trim(), a);
               a = a + 1;
            }

            a.append(a);
         } while(a != -1);

         a.append(')');
         a.append(Method3423(a, a));
         return new Class36(a, a.toString());
      } else {
         throw new IllegalArgumentException();
      }
   }

   private static String Method3423(String a, boolean a1) {
      if ("".equals(a)) {
         return a;
      } else {
         StringBuilder a = new StringBuilder();
         int a = 0;

         while((a = a.indexOf("[]", a) + 1) > 0) {
            a.append('[');
         }

         String a = a.substring(0, a.length() - a.length() * 2);
         String a = (String)Field300.Method2665(a);
         a.append(a);
         return a.toString();
      }
   }

   public String Method3424() {
      return this.Field298;
   }

   public String Method3425() {
      return this.Field299;
   }

   public b Method3426() {
      return b.Method3213(this.Field299);
   }

   public b[] Method3427() {
      return b.Method3211(this.Field299);
   }

   public String Method3428() {
      return this.Field298 + this.Field299;
   }

   public boolean Method3429(Object a) {
      if (!(a instanceof Class36)) {
         return false;
      } else {
         Class36 a = (Class36)a;
         return this.Field298.equals(a.Field298) && this.Field299.equals(a.Field299);
      }
   }

   public int Method3430() {
      return this.Field298.hashCode() ^ this.Field299.hashCode();
   }

   static {
      Field300.put("void", "V");
      Field300.put("byte", "B");
      Field300.put("char", "C");
      Field300.put("double", "D");
      Field300.put("float", "F");
      Field300.put("int", "I");
      Field300.put("long", "J");
      Field300.put("short", "S");
      Field300.put("boolean", "Z");
   }

   private static IllegalArgumentException Method3431(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
