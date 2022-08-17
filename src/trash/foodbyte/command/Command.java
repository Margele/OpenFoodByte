package trash.foodbyte.command;

import net.minecraft.client.Minecraft;
import obfuscate.a;

public class Command {
   public Minecraft mc = Minecraft.getMinecraft();
   private String[] commands;
   private String help;
   private static int Field3239;

   public Command(String[] a) {
      this.commands = a;
   }

   public String[] getCommands() {
      return this.commands;
   }

   public String getName() {
      return this.commands[0];
   }

   public void onCommand(String[] commands) {
   }

   public void setHelp(String a) {
      this.help = a;
   }

   public String getHelp() {
      return this.help;
   }

   public static String Method1663(String[] a, String a, int a, int a) {
      int var4 = Method1665();
      byte var7 = 0;
      if (a > a.length) {
         a = a.length;
      }

      StringBuilder var5 = new StringBuilder();
      if (var7 < a) {
         var5.append(a[var7]).append(a);
         int var6 = var7 + 1;
      }

      String var10000 = var5.substring(0, var5.toString().length() - 1);
      if (a.trash() == null) {
         ++var4;
         Method1664(var4);
      }

      return var10000;
   }

   public static void Method1664(int integer) {
      Field3239 = integer;
   }

   public static int Method1665() {
      return Field3239;
   }

   public static int Method1666() {
      int var0 = Method1665();
      return 117;
   }

   static {
      if (Method1665() != 0) {
         Method1664(9);
      }

   }
}
