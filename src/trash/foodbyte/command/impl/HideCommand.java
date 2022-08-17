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
      int var2 = GetDmgCommand.Method3599();
      if (commands.length != 2) {
         ChatUtils.addChatMessage(this.getHelp());
      } else {
         boolean var3 = false;
         Iterator var4 = ModuleManager.getAllModules().Method1383();
         if (var4.Method932()) {
            Module var5 = (Module)var4.Method933();
            if (!commands[1].equalsIgnoreCase(var5.getName())) {
               ;
            }

            var5.hide = !var5.hide;
            var3 = true;
            ChatUtils.addChatMessage(var5.getName() + " Module hide toggled!");
            var5.Method1038().Method1192(0.0);
            var5.Method1039().Method1192(0.0);
            GlobalModule.INSTANCE.fileManager.saveHide();
         }

         ChatUtils.addChatMessage("Hide to Module : " + commands[1]);
      }
   }
}
