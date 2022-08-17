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
      int a = GetDmgCommand.Method3598();
      if (commands.length < 3) {
         Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(this.getHelp()));
      }

      String a = commands[1];
      int a = Keyboard.getKeyIndex(commands[2].toUpperCase());
      ModuleManager var10000 = GlobalModule.INSTANCE.Field3172;
      Iterator var5 = ModuleManager.getAllModules().Method1383();

      Module a;
      do {
         if (!var5.Method932()) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Cannot find Module : " + a));
            return;
         }

         a = (Module)var5.Method933();
      } while(!a.getName().equalsIgnoreCase(a));

      a.Method1021(a);
      GlobalModule.INSTANCE.fileManager.saveKeys();
      Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(a.getName() + " was bound to " + Keyboard.getKeyName(a)));
   }
}
