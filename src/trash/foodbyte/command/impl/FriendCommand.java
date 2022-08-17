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
      int var2 = GetDmgCommand.Method3598();
      if (commands.length < 3) {
         ChatUtils.addChatMessage(this.getHelp());
      } else {
         String var3 = commands[1];
         String var4 = commands[2];
         String var5 = commands.length > 3 ? commands[3] : var4;
         Class309 var6 = Class305.Method699(var4);
         if (var3.equalsIgnoreCase("a") || var3.equalsIgnoreCase("add")) {
            Class309 var7 = new Class309(var4, var5);
            ChatUtils.addChatMessage("Added friend " + var4 + " as " + var5);
            Class305.Method695().Method2530(var7);
            var6.Method750(var5);
            ChatUtils.addChatMessage("Changed alias to " + var5);
         }

         if (var3.equalsIgnoreCase("r") || var3.equalsIgnoreCase("remove")) {
            Class305.Method695().remove(var6);
            ChatUtils.addChatMessage("Removed friend");
         }

         ChatUtils.addChatMessage(this.getHelp());
         GlobalModule.INSTANCE.fileManager.saveFriends();
      }
   }
}
