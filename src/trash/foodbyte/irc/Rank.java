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

            String var3;
            do {
               if (!var1.Method932()) {
                  return "";
               }

               var3 = (String)var1.Method933();
            } while(!var3.contains(a));

            return var3.split(":")[1];
      }
   }

   public static String Method1198(String a) {
      String[] var1 = a.split(" ");
      StringBuilder var2 = new StringBuilder();

      for(int var3 = 1; var3 < var1.length; ++var3) {
         var2.append(var1[var3]).append(" ");
      }

      return var2.toString();
   }

   public static String Method1199(long a) {
      long var3 = 1471228928L;
      long var5 = 86400000L;
      long var7 = 3600000L;
      long var9 = 60000L;
      long var11 = 1000L;
      Method1202();
      long var13 = a - System.currentTimeMillis();
      long var15 = var13 / var3;
      long var17 = var13 / var5;
      long var19 = var13 % var5 / var7;
      long var21 = var13 % var5 % var7 / var9;
      long var23 = var13 % var5 % var7 % var9 / var11;
      String var25 = var15 <= 0L ? "" : var15 + "y ";
      String var26 = var17 <= 0L ? "" : var17 + "d ";
      String var27 = var19 <= 0L ? "" : var19 + "h ";
      String var28 = var21 <= 0L ? "" : var21 + "m ";
      String var29 = var23 <= 0L ? "" : var23 + "s";
      String var10000 = var25 + var26 + var27 + var28 + var29;
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
