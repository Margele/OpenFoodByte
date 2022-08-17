package trash.foodbyte.command.impl;

import awsl.Class305;
import awsl.Class309;
import trash.foodbyte.command.Command;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.ChatUtils;

public class FriendCommand extends Command {
   public FriendCommand() {
      super(new String[]{"friend", "f"});
      this.setHelp("Firend: <add/a/remove/r> <name> <alias>");
   }

   public void onCommand(String[] commands) {
      int a = GetDmgCommand.Method3598();
      if (commands.length < 3) {
         ChatUtils.addChatMessage(this.getHelp());
      } else {
         String a = commands[1];
         String a = commands[2];
         String a = commands.length > 3 ? commands[3] : a;
         Class309 a = Class305.Method699(a);
         if (a.equalsIgnoreCase("a") || a.equalsIgnoreCase("add")) {
            Class309 a = new Class309(a, a);
            ChatUtils.addChatMessage("Added friend " + a + " as " + a);
            Class305.Method695().Method2530(a);
            a.Method750(a);
            ChatUtils.addChatMessage("Changed alias to " + a);
         }

         if (a.equalsIgnoreCase("r") || a.equalsIgnoreCase("remove")) {
            Class305.Method695().remove(a);
            ChatUtils.addChatMessage("Removed friend");
         }

         ChatUtils.addChatMessage(this.getHelp());
         GlobalModule.INSTANCE.fileManager.saveFriends();
      }
   }
}
