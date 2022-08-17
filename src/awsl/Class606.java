package awsl;

import com.google.gson.JsonObject;
import obfuscate.a;
import trash.foodbyte.irc.PermissionManager;

public class Class606 {
   public String Field2838 = "";
   public String Field2839 = "";
   public String Field2840 = "";
   public String Field2841 = "undefined";
   public String Field2842 = "undefined";
   public int Field2843 = 0;
   public long Field2844;
   public long Field2845;
   public long Field2846;
   public boolean Field2847 = false;
   public boolean Field2848 = false;
   public String Field2849 = "NONE";
   public String Field2850 = "NONE";
   public long Field2851 = System.currentTimeMillis();
   public int Field2852 = 0;

   public Class606() {
      this.Field2844 = System.currentTimeMillis();
      this.Field2845 = System.currentTimeMillis();
      this.Field2846 = System.currentTimeMillis();
   }

   public Class606(String a, String a, String a, String a) {
      this.Field2838 = a;
      this.Field2839 = a;
      this.Field2840 = a;
      this.Field2841 = a;
      this.Field2844 = System.currentTimeMillis();
      this.Field2845 = System.currentTimeMillis();
      this.Field2846 = System.currentTimeMillis();
   }

   public Class606(String a, String a, String a, String a, String a) {
      this.Field2838 = a;
      this.Field2839 = a;
      this.Field2840 = a;
      this.Field2841 = a;
      this.Field2842 = a;
      this.Field2844 = System.currentTimeMillis();
      this.Field2845 = System.currentTimeMillis();
      this.Field2846 = System.currentTimeMillis();
   }

   public Class606(String a, String a, String a, String a, String a, long a5, long a6, long a, boolean a, boolean a) {
      this.Field2838 = a;
      this.Field2839 = a;
      this.Field2840 = a;
      this.Field2841 = a;
      this.Field2842 = a;
      this.Field2844 = System.currentTimeMillis();
      this.Field2845 = System.currentTimeMillis();
      this.Field2846 = a;
      this.Field2847 = a;
      this.Field2848 = a;
   }

   public JsonObject Method3734() {
      JsonObject a = new JsonObject();
      a.addProperty("client", this.Field2838);
      a.addProperty("name", this.Field2840);
      a.addProperty("rank", this.Field2839);
      a.addProperty("ranklvl", 0);
      a.addProperty("muteTime", this.Field2845);
      a.addProperty("hide", this.Field2847);
      a.addProperty("MT", this.Field2848);
      return a;
   }

   public void Method3735(JsonObject a) {
      this.Field2838 = a.get("client").getAsString();
      this.Field2840 = a.get("name").getAsString();
      this.Field2839 = a.get("rank").getAsString();
      this.Field2845 = a.get("muteTime").getAsLong();
      this.Field2847 = a.get("hide").getAsBoolean();
      this.Field2848 = a.get("MT").getAsBoolean();
   }

   public String Method3736() {
      if (this.Field2838.equalsIgnoreCase("FoodByte")) {
         return "§e[FB]§r";
      } else if (this.Field2838.equalsIgnoreCase("PowerX")) {
         return "§d[PX]§r";
      } else {
         return this.Field2838.equalsIgnoreCase("Server") ? "§c[Server]§r" : "§2[" + this.Field2838 + "]§r";
      }
   }

   public String Method3737() {
      PermissionManager.Method3697();
      String var2 = this.Field2839;
      byte var3 = -1;
      switch (var2.hashCode()) {
         case 76612243:
            if (!var2.equals("Owner")) {
               break;
            }

            var3 = 0;
            a.trash(new String[1]);
         case 68597:
            if (!var2.equals("Dev")) {
               break;
            }

            var3 = 1;
         case 63116079:
            if (!var2.equals("Admin")) {
               break;
            }

            var3 = 2;
         case 77538:
            if (!var2.equals("Mod")) {
               break;
            }

            var3 = 3;
         case -2137064498:
            if (!var2.equals("Helper")) {
               break;
            }

            var3 = 4;
         case 2066960:
            if (!var2.equals("Beta")) {
               break;
            }

            var3 = 5;
         case 1982160884:
            if (!var2.equals("Backer")) {
               break;
            }

            var3 = 6;
         case 2645995:
            if (var2.equals("User")) {
               var3 = 7;
            }
      }

      switch (var3) {
         case 0:
            return "§3[Owner]§r";
         case 1:
            return "§3[Dev]§r";
         case 2:
            return "§c[Admin]§r";
         case 3:
            return "§2[Mod]§r";
         case 4:
            return "§9[Helper]§r";
         case 5:
            return "§5[Beta]§r";
         case 6:
            return "§5[Backer]§r";
         case 7:
            return "§a[User]§r";
         default:
            return this.Method3738(this.Field2839);
      }
   }

   public String Method3738(String a) {
      String a = "§b";
      switch (this.Field2843) {
         case 1:
            a = "§a";
            break;
         case 2:
            a = "§5";
            break;
         case 3:
            a = "§9";
            break;
         case 4:
            a = "§2";
            break;
         case 5:
            a = "§c";
            break;
         case 999:
            a = "§3";
      }

      return a + "[" + a + a + "]§r";
   }

   public String Method3739() {
      switch (this.Field2838) {
         case "FoodByte":
            return "§7(§d" + this.Field2840 + "§7)§r";
         case "PowerX":
            return "§7(§b" + this.Field2840 + "§7)§r";
         default:
            return "§7(§2" + this.Field2840 + "§7)§r";
      }
   }

   public int Method3740() {
      return this.Field2843;
   }

   public boolean Method3741() {
      return this.Field2838.equalsIgnoreCase("server");
   }

   public String Method3742(long a) {
      long a = 86400000L;
      long a = 3600000L;
      long a = 60000L;
      long a = 1000L;
      long a = a / a;
      long a = a % a / a;
      long a = a % a % a / a;
      long a = a % a % a % a / a;
      String a = a <= 0L ? "" : a + "d ";
      String a = a <= 0L ? "" : a + "h ";
      String a = a <= 0L ? "" : a + "m ";
      String a = a <= 0L ? "" : a + "s";
      return a + a + a + a;
   }
}
