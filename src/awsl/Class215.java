package awsl;

import java.util.ArrayList;
import java.util.List;
import obfuscate.a;

public class Class215 {
   private static List Field1206 = new ArrayList();

   public static List Method2649() {
      return Field1206;
   }

   public static boolean Method2650(String a) {
      String[] a = Class207.Method2434();
      if (Field1206.stream().filter(Class215::Method2655).count() <= 0L) {
         return false;
      } else {
         Class207 a = (Class207)Field1206.stream().filter(Class215::Method2654).findFirst().get();
         a.trash(new String[1]);
         return true;
      }
   }

   public static Class207 Method2651(String a) {
      String[] var1 = Class207.Method2434();
      Class207 var10000 = Field1206.stream().noneMatch(Class215::Method2653) ? null : (Class207)Field1206.stream().filter(Class215::Method2652).findFirst().get();
      if (a.trash() == null) {
         Class207.Method2433(new String[3]);
      }

      return var10000;
   }

   private static boolean Method2652(String a, Class207 a) {
      return a.Method2419().equalsIgnoreCase(a);
   }

   private static boolean Method2653(String a, Class207 a) {
      return a.Method2419().equalsIgnoreCase(a);
   }

   private static boolean Method2654(String a, Class207 a) {
      return a.Method2419().equalsIgnoreCase(a);
   }

   private static boolean Method2655(String a, Class207 a) {
      return a.Method2419().equalsIgnoreCase(a);
   }
}
