package awsl;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;

public class Class709 extends GuiScreen {
   private GuiScreen Field3066;
   private GuiTextField Field3067;
   private String Field3068 = "";
   private static int Field3069;

   public Class709(GuiScreen a) {
      this.Field3066 = a;
   }

   protected void Method1804(char a, int a) throws IOException {
      super.Method1804(a, a);
      this.Field3067.textboxKeyTyped(a, a);
      if (a == 1) {
         this.mc.displayGuiScreen(this.Field3066);
      }

      this.Field3067.setText(this.Field3067.getText().replace(" ", "").replace("#", ""));
   }

   public void Method1801() {
      int var10000 = Method1829();
      int var10006 = this.width / 2 - 100;
      this.Field3067 = new GuiTextField(0, Minecraft.getMinecraft().fontRendererObj, var10006, this.height / 6 + 20, 200, 20);
      int var1 = var10000;
      this.buttonList.Method2530(new GuiButton(3, this.width / 2 - 100, this.height / 6 + 62, "Add"));
      this.buttonList.Method2530(new GuiButton(4, this.width / 2 - 100, this.height / 6 + 82, "Cancel"));
      if (a.trash() == null) {
         ++var1;
         Method1836(var1);
      }

   }

   protected void Method1802(GuiButton a) throws IOException {
      int a = Method1828();
      if (a.id == 3) {
         if (!this.Field3067.getText().equalsIgnoreCase("")) {
            GlobalModule.INSTANCE.fileManager.Method786(this.Field3067.getText());
            if (Class215.Method2649().stream().noneMatch(this::Method1839)) {
               Class207 a = new Class207(this.Field3067.getText());
               Class215.Method2649().Method2530(a);
               GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Saved Config §a" + this.Field3067.getText(), Types.INFO));
            }

            GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Replace Config §a" + this.Field3067.getText(), Types.INFO));
            this.mc.displayGuiScreen(this.Field3066);
         }

         this.Field3068 = new String("§cPlease enter the config name");
      }

      if (a.id == 4) {
         this.mc.displayGuiScreen(this.Field3066);
      }

   }

   protected void Method1805(int a, int a, int a) throws IOException {
      this.Field3067.mouseClicked(a, a, a);
      super.Method1805(a, a, a);
   }

   public void Method1807() {
      this.Field3067.updateCursorCounter();
      super.Method1807();
   }

   public void Method1803(int a, int a, float a) {
      this.drawDefaultBackground();
      this.drawCenteredString(this.fontRendererObj, "Name", this.width / 2 - 89, this.height / 6 + 10, 16777215);
      this.Field3067.drawTextBox();
      this.drawCenteredString(this.fontRendererObj, "Adding Conifg", this.width / 2, 30, 16777215);
      this.drawCenteredString(this.fontRendererObj, this.Field3068, this.width / 2, this.height / 6 + 48, 16777215);
      super.Method1803(a, a, a);
   }

   private boolean Method1839(Class207 a) {
      return a.Method2419().equalsIgnoreCase(this.Field3067.getText());
   }

   public static void Method1836(int integer) {
      Field3069 = integer;
   }

   public static int Method1828() {
      return Field3069;
   }

   public static int Method1829() {
      int var0 = Method1828();
      return 82;
   }

   private static IOException Method1815(IOException iOException) {
      return iOException;
   }

   static {
      Method1836(0);
   }
}
