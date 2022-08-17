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

   public static String Method1663(String[] a, String a, int a2, int a) {
      int a = Method1665();
      int a = 0;
      if (a > a.length) {
         a = a.length;
      }

      StringBuilder a = new StringBuilder();
      if (a < a) {
         a.append(a[a]).append(a);
         int var6 = a + 1;
      }

      String var10000 = a.substring(0, a.toString().length() - 1);
      if (a.trash() == null) {
         ++a;
         Method1664(a);
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
