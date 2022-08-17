package trash.foodbyte.command.impl;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.command.Command;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;

public class BindCommand extends Command {
   public BindCommand() {
      super(new String[]{"bind"});
      this.setHelp(".bind <mod> <key>");
   }

   public void onCommand(String[] commands) {
      int var2 = GetDmgCommand.Method3598();
      if (commands.length < 3) {
         Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(this.getHelp()));
      }

      String var3 = commands[1];
      int var4 = Keyboard.getKeyIndex(commands[2].toUpperCase());
      ModuleManager var10000 = GlobalModule.INSTANCE.Field3172;
      Iterator var5 = ModuleManager.getAllModules().Method1383();

      Module var6;
      do {
         if (!var5.Method932()) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Cannot find Module : " + var3));
            return;
         }

         var6 = (Module)var5.Method933();
      } while(!var6.getName().equalsIgnoreCase(var3));

      var6.Method1021(var4);
      GlobalModule.INSTANCE.fileManager.saveKeys();
      Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(var6.getName() + " was bound to " + Keyboard.getKeyName(var4)));
   }
}
