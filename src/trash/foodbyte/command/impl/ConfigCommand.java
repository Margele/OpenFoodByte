package trash.foodbyte.command.impl;

import awsl.Class207;
import awsl.Class215;
import java.io.File;
import obfuscate.a;
import trash.foodbyte.command.Command;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.ChatUtils;

public class ConfigCommand extends Command {
   public ConfigCommand() {
      super(new String[]{"config", "c"});
      this.setHelp("Config");
   }

   public void onCommand(String[] commands) {
      int var2 = GetDmgCommand.Method3599();
      if (commands.length == 1) {
         ChatUtils.addChatMessage("§f-C list");
         ChatUtils.addChatMessage("§f-C §aConfigName §e[Load CFG]!");
         ChatUtils.addChatMessage("§f-C Save §aConfigName!");
         ChatUtils.addChatMessage("§f-C Load §aConfigName!");
         ChatUtils.addChatMessage("§f-C Remove §aConfigName!");
      }

      if (commands.length == 2 && commands[1].toLowerCase().equals("list")) {
         if (Class215.Method2649().Method1799() > 0) {
            Class215.Method2649().forEach(ConfigCommand::Method1640);
         }

         ChatUtils.addChatMessage("§c[Can't find]");
      } else {
         if (commands.length == 2) {
            File var3 = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName + "/conf-" + commands[1].trim() + ".cfg");

            try {
               if (!var3.exists()) {
                  ChatUtils.addChatMessage("Loaded §c" + commands[1] + " §fConfig §cError [Can't find]");
                  return;
               }
            } catch (Exception var5) {
               var5.printStackTrace();
            }

            GlobalModule.INSTANCE.fileManager.Method787(commands[1], false);
            ChatUtils.addChatMessage("Loaded §c" + commands[1] + " §fConfig §aSuccessfully");
         }

         if (commands.length == 3) {
            Class207 var6;
            if (commands[1].toLowerCase().equals("save")) {
               GlobalModule.INSTANCE.fileManager.Method786(commands[2]);
               if (Class215.Method2649().stream().noneMatch(ConfigCommand::Method1639)) {
                  var6 = new Class207(commands[2]);
                  Class215.Method2649().Method2530(var6);
                  ChatUtils.addChatMessage("Saved Config §a" + commands[2]);
               }

               ChatUtils.addChatMessage("Replace Config §a" + commands[2]);
            }

            if (commands[1].toLowerCase().equals("remove") || commands[1].toLowerCase().equals("del")) {
               GlobalModule.INSTANCE.fileManager.deleteConfig(commands[2]);
               var6 = new Class207(commands[2]);
               Class215.Method2649().remove(var6);
               ChatUtils.addChatMessage("removed Config §6" + commands[2]);
            }

            if (commands[1].toLowerCase().equals("load")) {
               GlobalModule.INSTANCE.fileManager.Method787(commands[2], false);
               ChatUtils.addChatMessage("Loaded §c" + commands[2] + " §fConfig §aSuccessfully");
            }
         }

         if (a.trash() == null) {
            ++var2;
            GetDmgCommand.Method3597(var2);
         }

      }
   }

   private static boolean Method1639(String[] a, Class207 a) {
      return a.Method2419().equalsIgnoreCase(a[2]);
   }

   private static void Method1640(Class207 a) {
      ChatUtils.addChatMessage("Config List Name - §b" + a.Method2419());
   }

   private static Exception Method1641(Exception exception) {
      return exception;
   }
}
