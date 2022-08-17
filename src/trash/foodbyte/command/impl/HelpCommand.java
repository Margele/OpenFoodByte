package trash.foodbyte.command.impl;

import java.util.Iterator;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.CommandManager;
import trash.foodbyte.utils.ChatUtils;

public class HelpCommand extends Command {
   public HelpCommand() {
      super(new String[]{"help"});
      this.setHelp("Shows all commands");
   }

   public void onCommand(String[] commands) {
      GetDmgCommand.Method3599();
      Iterator var3 = CommandManager.Method3592().Method1383();
      if (var3.Method932()) {
         Command var4 = (Command)var3.Method933();
         String var5 = var4.getCommands()[0];
         int var6 = 1;
         if (var6 < var4.getCommands().length) {
            var5 = var5 + (var6 != var4.getCommands().length ? ", " : "") + var4.getCommands()[var6];
            ++var6;
         }

         ChatUtils.addChatMessage("§e" + var5 + "§f > " + var4.getHelp());
      }

   }
}
