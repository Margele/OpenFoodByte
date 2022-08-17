package trash.foodbyte.gui;

import awsl.Class392;
import awsl.Class697;
import awsl.Class713;
import awsl.Class715;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import obfuscate.a;
import org.lwjgl.input.Keyboard;

public final class AltLogin extends GuiScreen {
   public static Runnable Field3047;
   private final GuiScreen Field3048;
   public static String Field3049;
   private Class697 Field3050;
   private Class713 Field3051;
   private Class713 Field3052;
   private static String Field3053;

   public AltLogin(GuiScreen a) {
      this.Field3048 = a;
   }

   public void Method1801() {
      Method1809();
      int a = this.height / 4 + 24;
      this.buttonList.Method2530(new Class715(0, this.width / 2 - 100, a + 72, "Login"));
      this.buttonList.Method2530(new Class715(2, this.width / 2 - 100, a + 72 + 24, "Import user:pass"));
      this.buttonList.Method2530(new Class715(1, this.width / 2 - 100, a + 72 + 48, "Back"));
      this.buttonList.Method2530(new Class715(9, this.width - 88, 7, 60, 20, "Microsoft"));
      this.Field3051 = new Class713(1, this.mc.fontRendererObj, this.width / 2 - 100, 60, 200, 20);
      this.Field3052 = new Class713(2, this.mc.fontRendererObj, this.width / 2 - 100, 100, 200, 20);
      this.Field3051.Method2042(128);
      this.Field3051.Method1808("");
      this.Field3052.Method2042(128);
      this.Field3052.Method1808("");
      this.Field3051.Method2046(true);
      Keyboard.enableRepeatEvents(true);
      Field3049 = "Idle...";
      a.trash(new String[1]);
   }

   protected void Method1802(GuiButton a) {
      String a = Method1809();
      switch (a.id) {
         case 0:
            this.Field3050 = new Class697(this.Field3051.Method1809(), this.Field3052.Method1809());
            this.Field3050.start();
         case 1:
            this.mc.displayGuiScreen(this.Field3048);
         case 2:
            String a = null;

            try {
               a = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
            } catch (Exception var5) {
            }

            if (!a.contains(":")) {
               break;
            }

            String[] a = a.split(":");
            this.Field3051.Method1808(a[0]);
            this.Field3052.Method1808(a[1]);
         case 9:
            Field3049 = "Logging in...";
            Thread a = new Thread(Field3047);
            a.start();
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
      }

   }

   public void Method1803(int a, int a, float a) {
      this.drawDefaultBackground();
      this.drawCenteredString(this.mc.fontRendererObj, "Alt Login", this.width / 2, 20, -1);
      this.drawCenteredString(this.mc.fontRendererObj, Field3049, this.width / 2, 29, -1);
      this.drawString(this.mc.fontRendererObj, "Username / E-Mail", this.width / 2 - 100, 50, -7829368);
      this.drawString(this.mc.fontRendererObj, "Password", this.width / 2 - 100, 90, -7829368);
      this.Field3051.Method2040();
      String a = this.Field3052.Method1809();
      this.Field3052.Method1808(a.replaceAll("(?s).", "*"));
      this.Field3052.Method2040();
      this.Field3052.Method1808(a);
      super.Method1803(a, a, a);
   }

   protected void Method1804(char a, int a) {
      try {
         super.Method1804(a, a);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      if (a == '\t') {
         if (!this.Field3051.Method2047() && !this.Field3052.Method2047()) {
            this.Field3051.Method2046(true);
         } else {
            this.Field3051.Method2046(this.Field3052.Method2047());
            this.Field3052.Method2046(!this.Field3051.Method2047());
         }
      }

      if (a == '\r') {
         this.Method1802((GuiButton)this.buttonList.get(0));
      }

      this.Field3051.Method2038(a, a);
      this.Field3052.Method2038(a, a);
   }

   protected void Method1805(int a, int a, int a) {
      try {
         super.Method1805(a, a, a);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      this.Field3051.Method2039(a, a, a);
      this.Field3052.Method2039(a, a, a);
   }

   public void Method1806() {
      Keyboard.enableRepeatEvents(false);
   }

   public void Method1807() {
      this.Field3051.Method1814();
      this.Field3052.Method1814();
   }

   static {
      Method1808((String)null);
      Field3047 = new Class392();
      Field3049 = "Idle...";
   }

   public static void Method1808(String string) {
      Field3053 = string;
   }

   public static String Method1809() {
      return Field3053;
   }

   private static Exception Method1810(Exception exception) {
      return exception;
   }
}
