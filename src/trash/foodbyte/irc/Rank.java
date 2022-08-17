package trash.foodbyte.irc;

import java.util.ArrayList;
import java.util.Iterator;
import obfuscate.a;

public class Rank {
   public static ArrayList Field2632;
   private static a[] Field2633;

   public static String Method1197(String a) {
      switch (a) {
         case "Dev":
            return "§3[Dev]§r";
         case "Admin":
            return "§4[Admin]§r";
         case "Mod":
            return "§2[Mod]§r";
         case "Help":
            return "§9[Help]§r";
         case "Contributor":
            return "§5[Contributor]§r";
         case "User":
            return "§a[User]§r";
         default:
            Iterator var1 = Field2632.Method1383();

            String a;
            do {
               if (!var1.Method932()) {
                  return "";
               }

               a = (String)var1.Method933();
            } while(!a.contains(a));

            return a.split(":")[1];
      }
   }

   public static String Method1198(String a) {
      String[] a = a.split(" ");
      StringBuilder a = new StringBuilder();

      for(int a = 1; a < a.length; ++a) {
         a.append(a[a]).append(" ");
      }

      return a.toString();
   }

   public static String Method1199(long a) {
      long a = 1471228928L;
      long a = 86400000L;
      long a = 3600000L;
      long a = 60000L;
      long a = 1000L;
      Method1202();
      long a = a - System.currentTimeMillis();
      long a = a / a;
      long a = a / a;
      long a = a % a / a;
      long a = a % a % a / a;
      long a = a % a % a % a / a;
      String a = a <= 0L ? "" : a + "y ";
      String a = a <= 0L ? "" : a + "d ";
      String a = a <= 0L ? "" : a + "h ";
      String a = a <= 0L ? "" : a + "m ";
      String a = a <= 0L ? "" : a + "s";
      String var10000 = a + a + a + a + a;
      a.trash(new String[2]);
      return var10000;
   }

   public static int Method1200(String a) {
      Method1202();
      String var2 = a.toLowerCase();
      byte var3 = -1;
      switch (var2.hashCode()) {
         case 106164915:
            if (!var2.equals("owner")) {
               break;
            }

            var3 = 0;
         case 99349:
            if (!var2.equals("dev")) {
               break;
            }

            var3 = 1;
         case 92668751:
            if (!var2.equals("admin")) {
               break;
            }

            var3 = 2;
         case 108290:
            if (!var2.equals("mod")) {
               break;
            }

            var3 = 3;
         case 3198785:
            if (!var2.equals("help")) {
               break;
            }

            var3 = 4;
         case 3020272:
            if (!var2.equals("beta")) {
               break;
            }

            var3 = 5;
         case -1396673580:
            if (!var2.equals("backer")) {
               break;
            }

            var3 = 6;
         case 3599307:
            if (var2.equals("user")) {
               var3 = 7;
            }
      }

      switch (var3) {
         case 0:
            return 999;
         case 1:
            return 998;
         case 2:
            return 5;
         case 3:
            return 4;
         case 4:
            return 3;
         case 5:
         case 6:
            return 2;
         case 7:
            return 1;
         default:
            if (a.trash() == null) {
               Method1201(new a[3]);
            }

            return 0;
      }
   }

   static {
      Method1201(new a[4]);
      Field2632 = new ArrayList();
   }

   public static void Method1201(a[] arr) {
      Field2633 = arr;
   }

   public static a[] Method1202() {
      return Field2633;
   }
}
