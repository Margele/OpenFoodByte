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
      int var2 = a.indexOf(32);
      int var3 = a.indexOf(40, var2) + 1;
      int var4 = a.indexOf(41, var3);
      if (var2 != -1 && var3 != -1 && var4 != -1) {
         String var5 = a.substring(0, var2);
         String var6 = a.substring(var2 + 1, var3 - 1).trim();
         StringBuilder var7 = new StringBuilder();
         var7.append('(');

         int var8;
         do {
            var8 = a.indexOf(44, var3);
            String var9;
            if (var8 == -1) {
               var9 = Method3423(a.substring(var3, var4).trim(), a);
            } else {
               var9 = Method3423(a.substring(var3, var8).trim(), a);
               var3 = var8 + 1;
            }

            var7.append(var9);
         } while(var8 != -1);

         var7.append(')');
         var7.append(Method3423(var5, a));
         return new Class36(var6, var7.toString());
      } else {
         throw new IllegalArgumentException();
      }
   }

   private static String Method3423(String a, boolean a) {
      if ("".equals(a)) {
         return a;
      } else {
         StringBuilder var2 = new StringBuilder();
         int var3 = 0;

         while((var3 = a.indexOf("[]", var3) + 1) > 0) {
            var2.append('[');
         }

         String var4 = a.substring(0, a.length() - var2.length() * 2);
         String var5 = (String)Field300.Method2665(var4);
         var2.append(var5);
         return var2.toString();
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
         Class36 var2 = (Class36)a;
         return this.Field298.equals(var2.Field298) && this.Field299.equals(var2.Field299);
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
