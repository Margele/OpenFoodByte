package trash.foodbyte.irc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PermissionManager {
   public static List permissions;
   private static int[] Field2837;

   public static boolean hasPermission(String permission) {
      int[] a = Method3697();
      if (permissions.contains("*.*")) {
         return true;
      } else {
         int a = 0;
         if (a < permissions.Method1799()) {
            String a = (String)permissions.get(a);
            if (a.equalsIgnoreCase(permission)) {
               return true;
            }

            ++a;
         }

         return false;
      }
   }

   public static boolean canUseModule(String name) {
      return !permissions.contains("*.*") && !permissions.contains("module.*") ? hasPermission("module." + name) : true;
   }

   public static boolean canUseFeature(String name) {
      return !permissions.contains("*.*") && !permissions.contains("client.*") ? hasPermission("client." + name) : true;
   }

   static {
      Method3696(new int[4]);
      permissions = new CopyOnWriteArrayList();
   }

   public static void Method3696(int[] arr) {
      Field2837 = arr;
   }

   public static int[] Method3697() {
      return Field2837;
   }
}
