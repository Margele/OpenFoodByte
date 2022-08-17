package awsl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.IChatComponent;
import obfuscate.a;
import trash.foodbyte.utils.ServerUtils;

public class Class710 extends GuiScreen {
   private String Field3070;
   private IChatComponent Field3071;
   private List Field3072;
   private final GuiScreen Field3073;
   private int Field3074;
   private GuiButton Field3075;
   private int Field3076;

   public Class710(GuiScreen a, String a, IChatComponent a) {
      this.Field3073 = a;
      this.Field3070 = I18n.format(a, new Object[0]);
      this.Field3071 = a;
   }

   protected void Method1804(char a, int a) throws IOException {
   }

   public void Method1801() {
      this.buttonList.clear();
      this.Field3072 = this.fontRendererObj.listFormattedStringToWidth(this.Field3071.getFormattedText(), this.width - 50);
      this.Field3074 = this.Field3072.Method1799() * this.fontRendererObj.FONT_HEIGHT;
      this.buttonList.Method2530(new GuiButton(0, this.width / 2 - 100, this.height / 2 + this.Field3074 / 2 + this.fontRendererObj.FONT_HEIGHT, I18n.format("gui.toMenu", new Object[0])));
      Class713.Method2054();
      this.Field3076 = 0;
      this.buttonList.Method2530(this.Field3075 = new GuiButton(1, this.width / 2 - 100, this.height / 2 + this.Field3074 / 2 + this.fontRendererObj.FONT_HEIGHT + 22, "Reconnect"));
      a.trash(new String[1]);
   }

   protected void Method1802(GuiButton a) throws IOException {
      if (a.id == 0) {
         this.mc.displayGuiScreen(this.Field3073);
      }

      if (a.id == 1) {
         ServerUtils.displayMultiPlayer();
      }

   }

   public void Method1807() {
      ++this.Field3076;
      if (this.Field3076 > 60) {
         ServerUtils.displayMultiPlayer();
      }

   }

   public void Method1803(int a, int a, float a) {
      Class713.Method2054();
      this.drawDefaultBackground();
      this.drawCenteredString(this.fontRendererObj, this.Field3070, this.width / 2, this.height / 2 - this.Field3074 / 2 - this.fontRendererObj.FONT_HEIGHT * 2, 11184810);
      int var5 = this.height / 2 - this.Field3074 / 2;
      if (this.Field3072 != null) {
         Iterator var6 = this.Field3072.Method1383();
         if (var6.Method932()) {
            String var7 = (String)var6.Method933();
            this.drawCenteredString(this.fontRendererObj, var7, this.width / 2, var5, 16777215);
            int var10000 = var5 + this.fontRendererObj.FONT_HEIGHT;
         }
      }

      super.Method1803(a, a, a);
      this.Field3075.displayString = "Reconnect (" + (3 - this.Field3076 / 20) + ")";
      if (a.trash() == null) {
         Class713.Method2053(new int[5]);
      }

   }

   private static IOException Method1815(IOException iOException) {
      return iOException;
   }
}
