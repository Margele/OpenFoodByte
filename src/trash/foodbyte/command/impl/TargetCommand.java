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
      int a = GetDmgCommand.Method3598();
      if (commands.length < 3) {
         ChatUtils.addChatMessage(this.getHelp());
      } else {
         String a = commands[1];
         String a = commands[2];
         String a = commands.length > 3 ? commands[3] : a;
         Class307 a = Class305.Method702(a);
         if (a.equalsIgnoreCase("a") || a.equalsIgnoreCase("add")) {
            Class307 a = new Class307(a, a);
            ChatUtils.addChatMessage("Added target " + a + " as " + a);
            Class305.Method696().Method2530(a);
            a.Method746(a);
            ChatUtils.addChatMessage("Changed alias to " + a);
         }

         if (a.equalsIgnoreCase("r") || a.equalsIgnoreCase("remove")) {
            Class305.Method696().remove(a);
            ChatUtils.addChatMessage("Removed target");
         }

         ChatUtils.addChatMessage(this.getHelp());
         GlobalModule.INSTANCE.fileManager.saveTargets();
      }
   }
}
