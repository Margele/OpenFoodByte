package trash.foodbyte.command.impl;

import trash.foodbyte.command.Command;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;
import trash.foodbyte.utils.ChatUtils;

public class NameProtectCommand extends Command {
   public NameProtectCommand() {
      super(new String[]{"nameprotect", "np"});
      this.setHelp("NameProtect <text>");
   }

   public void onCommand(String[] commands) {
      GetDmgCommand.Method3599();
      String a = "";
      if (commands.length <= 1) {
         ChatUtils.addChatMessage(this.getHelp());
      } else {
         int a = 1;
         if (a < commands.length) {
            a = String.valueOf(a) + commands[a] + " ";
            ++a;
         }

         GlobalModule.fakeName = a.substring(0, a.length() - 1).replace("&", "§");
         GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("NameProtect", "Updated You New NameProtect - " + GlobalModule.fakeName, Types.WARNING));
         GlobalModule.INSTANCE.fileManager.saveNameProtect();
         super.onCommand(commands);
      }
   }
}
