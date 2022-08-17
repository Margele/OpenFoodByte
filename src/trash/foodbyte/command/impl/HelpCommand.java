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
      Iterator a = CommandManager.Method3592().Method1383();
      if (a.Method932()) {
         Command a = (Command)a.Method933();
         String a = a.getCommands()[0];
         int a = 1;
         if (a < a.getCommands().length) {
            a = a + (a != a.getCommands().length ? ", " : "") + a.getCommands()[a];
            ++a;
         }

         ChatUtils.addChatMessage("§e" + a + "§f > " + a.getHelp());
      }

   }
}
