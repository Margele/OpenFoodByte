package awsl;

import java.io.IOException;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;

public class Class708 extends GuiScreen {
   private Module Field3064;
   private GuiScreen Field3065;

   public Class708(Module a, GuiScreen a) {
      this.Field3064 = a;
      this.Field3065 = a;
   }

   protected void Method1804(char a, int a) throws IOException {
      if (a == 1 || a == 211) {
         this.Field3064.Method1021(0);
         ChatUtils.addChatMessage("Unbound '" + this.Field3064.getName() + "'");
         GlobalModule.INSTANCE.fileManager.saveKeys();
         this.mc.displayGuiScreen(this.Field3065);
      }

      if (a != 1 && a != 211) {
         this.Field3064.Method1021(a);
         ChatUtils.addChatMessage("Bound '" + this.Field3064.getName() + "' to '" + Keyboard.getKeyName(a) + "'");
         GlobalModule.INSTANCE.fileManager.saveKeys();
         this.mc.displayGuiScreen(this.Field3065);
      }

   }

   public void Method1803(int a, int a, float a) {
      Class709.Method1828();
      drawRect(0, 0, this.width, this.height, -2012213232);
      this.drawCenteredString(this.fontRendererObj, EnumChatFormatting.DARK_GREEN + this.Field3064.getName() + (this.Field3064.Method1020() > -1 ? EnumChatFormatting.DARK_PURPLE + " (" + Keyboard.getKeyName(this.Field3064.Method1020()) + ")" : ""), this.width / 2, 130, 16777215);
      this.drawCenteredString(this.fontRendererObj, "Press any key to bind " + EnumChatFormatting.AQUA + this.Field3064.getName(), this.width / 2, 150, 16777215);
      this.drawCenteredString(this.fontRendererObj, "Press 'DEL' or 'ESCAPE' to unbind " + EnumChatFormatting.AQUA + this.Field3064.getName(), this.width / 2, 170, 16777215);
      super.Method1803(a, a, a);
      a.trash(new String[2]);
   }

   public boolean Method1812() {
      return false;
   }

   private static IOException Method1815(IOException iOException) {
      return iOException;
   }
}
