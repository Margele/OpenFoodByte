package trash.foodbyte.command.impl;

import java.util.Iterator;
import trash.foodbyte.command.Command;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.utils.ChatUtils;

public class HideCommand extends Command {
   public HideCommand() {
      super(new String[]{"hide"});
      this.setHelp("Hide <module>");
   }

   public void onCommand(String[] commands) {
      int a = GetDmgCommand.Method3599();
      if (commands.length != 2) {
         ChatUtils.addChatMessage(this.getHelp());
      } else {
         boolean a = false;
         Iterator var4 = ModuleManager.getAllModules().Method1383();
         if (var4.Method932()) {
            Module a = (Module)var4.Method933();
            if (!commands[1].equalsIgnoreCase(a.getName())) {
               ;
            }

            a.hide = !a.hide;
            a = true;
            ChatUtils.addChatMessage(a.getName() + " Module hide toggled!");
            a.Method1038().Method1192(0.0);
            a.Method1039().Method1192(0.0);
            GlobalModule.INSTANCE.fileManager.saveHide();
         }

         ChatUtils.addChatMessage("Hide to Module : " + commands[1]);
      }
   }
}
