package trash.foodbyte.command.impl;

import awsl.Class305;
import awsl.Class307;
import trash.foodbyte.command.Command;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.ChatUtils;

public class TargetCommand extends Command {
   public TargetCommand() {
      super(new String[]{"target", "tg"});
      this.setHelp("Target: <add/a/remove/r> <name> <alias>");
   }

   public void onCommand(String[] commands) {
      int var2 = GetDmgCommand.Method3598();
      if (commands.length < 3) {
         ChatUtils.addChatMessage(this.getHelp());
      } else {
         String var3 = commands[1];
         String var4 = commands[2];
         String var5 = commands.length > 3 ? commands[3] : var4;
         Class307 var6 = Class305.Method702(var4);
         if (var3.equalsIgnoreCase("a") || var3.equalsIgnoreCase("add")) {
            Class307 var7 = new Class307(var4, var5);
            ChatUtils.addChatMessage("Added target " + var4 + " as " + var5);
            Class305.Method696().Method2530(var7);
            var6.Method746(var5);
            ChatUtils.addChatMessage("Changed alias to " + var5);
         }

         if (var3.equalsIgnoreCase("r") || var3.equalsIgnoreCase("remove")) {
            Class305.Method696().remove(var6);
            ChatUtils.addChatMessage("Removed target");
         }

         ChatUtils.addChatMessage(this.getHelp());
         GlobalModule.INSTANCE.fileManager.saveTargets();
      }
   }
}
