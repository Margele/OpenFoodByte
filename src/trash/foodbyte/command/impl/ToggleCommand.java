package trash.foodbyte.command.impl;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import trash.foodbyte.command.Command;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;

public class ToggleCommand extends Command {
   public ToggleCommand() {
      super(new String[]{"toggle", "t"});
      this.setHelp("toggle <mod>");
   }

   public void onCommand(String[] commands) {
      int var2 = GetDmgCommand.Method3598();
      if (commands.length != 2) {
         Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(this.getHelp()));
      }

      boolean var3 = false;
      Iterator var4 = ModuleManager.getAllModules().Method1383();

      while(var4.Method932()) {
         Module var5 = (Module)var4.Method933();
         if (commands[1].equalsIgnoreCase(var5.getName())) {
            try {
               var5.setState(!var5.getState());
            } catch (Exception var7) {
               var7.printStackTrace();
            }

            var3 = true;
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(var5.getName() + " was toggled"));
            break;
         }
      }

      Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Cannot find Module : " + commands[1]));
   }

   private static Exception Method1641(Exception exception) {
      return exception;
   }
}
