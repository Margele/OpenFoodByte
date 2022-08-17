package awsl;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Util;
import net.minecraft.util.Util.EnumOS;
import obfuscate.a;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class375 extends Class390 {
   private int Field1777;
   private float Field1778;
   private Class391 Field1779 = new Class391();
   private Class391 Field1780 = new Class391();
   private Class391 Field1781 = new Class391();
   private Class391 Field1782 = new Class391();
   private Class391 Field1783;
   private Class391 Field1784 = new Class391();
   private boolean Field1785;
   private boolean Field1786;
   private boolean Field1787;
   private boolean Field1788;
   private boolean Field1789;
   private boolean Field1790;

   public Class375(Class381 a, int a, int a, String a) {
      super(a, a, a, "PresetList", a);
      this.Field1909 = this.Field1919.Field1874;
      this.Field1910 = 18;
      this.Field1920 = "PresetList";
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      if (this.Field1785) {
         GlobalModule.INSTANCE.Field3190.Method1808("重新加载配置文件夹列表");
      }

      if (this.Field1788) {
         GlobalModule.INSTANCE.Field3190.Method1808("打开保存配置的文件夹");
      }

      if (this.Field1786) {
         GlobalModule.INSTANCE.Field3190.Method1808("载入当前配置");
      }

      if (this.Field1787) {
         GlobalModule.INSTANCE.Field3190.Method1808("删除当前配置");
      }

      if (this.Field1789) {
         GlobalModule.INSTANCE.Field3190.Method1808("添加一个新配置");
      }

      if (this.Field1790) {
         GlobalModule.INSTANCE.Field3190.Method1808("替换当前配置");
      }

      this.Field1910 = (int)((float)Class215.Method2649().Method1799() * (Class565.Field2636.Field2625 + 2.0F) + 19.0F);
      this.Field1919.Method1384();
   }

   public void Method412(int a, int a) {
      Class390.Method1318();
      float a = (float)(this.Field1907 + 2);
      float a = (float)(this.Field1908 + 2);
      float a = 2.0F;
      RenderUtils.Method1103((float)this.Field1907 + a, a, (float)this.Field1909 - a * 2.0F, (float)(this.Field1910 - 18), (new Color(255, 255, 255, 40)).getRGB());
      int a = 0;
      if (a < Class215.Method2649().Method1799()) {
         Class207 a = (Class207)Class215.Method2649().get(a);
         if ((float)a >= a + 0.5F && (float)a <= (float)(this.Field1907 + this.Field1909) - a * 2.0F - 1.0F && (float)a >= a + 0.5F && (float)a < a + Class565.Field2636.Field2625 + 3.0F) {
            this.Field1777 = a;
            RenderUtils.Method1103(a + 0.5F, a + 0.5F, (float)this.Field1909 - a * 2.0F - 1.0F, Class565.Field2636.Method1227(a.Method2419()) + 2.0F, Class681.Method900(Class707.Method1828(), 0.5F));
            this.Field1784 = new Class391(a + 1.5F + (float)this.Method1310() - 39.0F, a + 1.5F, 10.0F, 9.0F);
            RenderUtils.Method1103(a + 1.5F + (float)this.Method1310() - 39.0F, a + 1.5F, 10.0F, 9.0F, this.Field1790 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
            Class565.Field2639.Method1217("z", (float)(this.Field1907 + this.Method1310() - 34), a + 2.0F, (new Color(16316664)).getRGB());
            this.Field1780 = new Class391(a + 1.5F + (float)this.Method1310() - 28.0F, a + 1.5F, 10.0F, 9.0F);
            RenderUtils.Method1103(a + 1.5F + (float)this.Method1310() - 28.0F, a + 1.5F, 10.0F, 9.0F, this.Field1786 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
            Class565.Field2639.Method1217("m", (float)(this.Field1907 + this.Method1310() - 23), a + 2.0F, (new Color(16316664)).getRGB());
            this.Field1781 = new Class391(a + 1.5F + (float)this.Method1310() - 17.0F, a + 1.5F, 10.0F, 9.0F);
            RenderUtils.Method1103(a + 1.5F + (float)this.Method1310() - 17.0F, a + 1.5F, 10.0F, 9.0F, this.Field1787 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
            Class565.Field2639.Method1217("q", (float)(this.Field1907 + this.Method1310() - 12), a + 2.0F, (new Color(16316664)).getRGB());
         }

         Class565.Field2636.Method1217(a.Method2419(), a + 2.0F, a + 2.0F + this.Field1778, (new Color(14013909)).getRGB());
         float var10000 = a + Class565.Field2636.Method1227(a.Method2419()) + 2.0F;
         ++a;
         a.trash(new String[3]);
      }

      a = (float)(this.Field1908 + this.Field1910 - 14);
      RenderUtils.Method1103(a, a, 12.0F, 12.0F, this.Field1785 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
      Class565.Field2640.Method1217("e", (float)(this.Field1907 + 4), a + 1.0F, (new Color(16316664)).getRGB());
      this.Field1779 = new Class391(a, a, 12.0F, 12.0F);
      RenderUtils.Method1103(a + 14.0F, a, 12.0F, 12.0F, this.Field1788 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
      Class565.Field2640.Method1217("l", (float)(this.Field1907 + 18), a + 1.0F, (new Color(16316664)).getRGB());
      this.Field1782 = new Class391(a + 14.0F, a, 12.0F, 12.0F);
      RenderUtils.Method1103(a + 14.0F, a, 12.0F, 12.0F, this.Field1788 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
      Class565.Field2640.Method1217("l", (float)(this.Field1907 + 18), a + 1.0F, (new Color(16316664)).getRGB());
      this.Field1782 = new Class391(a + 14.0F, a, 12.0F, 12.0F);
      RenderUtils.Method1103(a + (float)this.Method1310() - 16.0F, a, 12.0F, 12.0F, this.Field1789 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
      Class565.Field2640.Method1217("y", (float)(this.Field1907 + this.Method1310() - 12), a + 1.0F, this.Field1789 ? Class681.Method2699((new Color(16316664)).getRGB(), 15) : (new Color(16316664)).getRGB());
      this.Field1783 = new Class391(a + (float)this.Method1310() - 16.0F, a, 12.0F, 12.0F);
   }

   public void Method413(int a, int a, boolean a) {
      this.Field1915 = this.Method1311(a, a) && this.Field1919.Method1392(a, a);
      this.Field1788 = MathUtils.Method550((float)a, (float)a, this.Field1782) && this.Field1915;
      this.Field1785 = MathUtils.Method550((float)a, (float)a, this.Field1779) && this.Field1915;
      this.Field1786 = MathUtils.Method550((float)a, (float)a, this.Field1780) && this.Field1915;
      this.Field1787 = MathUtils.Method550((float)a, (float)a, this.Field1781) && this.Field1915;
      this.Field1789 = MathUtils.Method550((float)a, (float)a, this.Field1783) && this.Field1915;
      this.Field1790 = MathUtils.Method550((float)a, (float)a, this.Field1784) && this.Field1915;
      if (!this.Field1918 && Mouse.isButtonDown(0)) {
         this.Method415(a);
      }

      this.Field1918 = a;
   }

   public void Method414() {
      this.Field1915 = false;
      this.Field1788 = false;
      this.Field1785 = false;
      this.Field1786 = false;
      this.Field1787 = false;
      this.Field1789 = false;
      this.Field1790 = false;
   }

   private void Method415(int a) {
      int a = Class390.Method1318();
      if (this.Field1789) {
         Minecraft.getMinecraft().displayGuiScreen(new Class709(GlobalModule.INSTANCE.Field3190));
      }

      if (this.Field1785) {
         GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Reloaded Preset Config", Types.INFO));
         GlobalModule.INSTANCE.fileManager.loadConfigs();
      }

      Class207 a;
      if (this.Field1790) {
         a = (Class207)Class215.Method2649().get(this.Field1777);
         Minecraft.getMinecraft().displayGuiScreen(new GuiYesNo(Class375::Method417, "Config - " + EnumChatFormatting.RED + a.Method2419(), "Are you sure you want to replace the config? \n 您确定要替换当前配置吗？", 0));
      }

      if (this.Field1786) {
         a = (Class207)Class215.Method2649().get(this.Field1777);
         GlobalModule.INSTANCE.fileManager.Method787(a.Method2419(), Keyboard.isKeyDown(42));
         GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Loaded §c" + a.Method2419() + " §fConfig §aSuccessfully", Types.SUCCESS));
      }

      if (this.Field1787) {
         a = (Class207)Class215.Method2649().get(this.Field1777);
         Minecraft.getMinecraft().displayGuiScreen(new GuiYesNo(this::Method416, "Config - " + EnumChatFormatting.RED + a.Method2419(), "Are you sure you want to remove the config? \n 您确定要删除当前配置吗？", 0));
      }

      if (this.Field1788) {
         File a = new File(String.valueOf(System.getProperty("user.home") + File.separator + GlobalModule.clientName));
         if (!a.exists()) {
            a.mkdirs();
         }

         GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Configuration folder opened", Types.INFO));
         String a = a.getAbsolutePath();
         if (Util.getOSType() == EnumOS.OSX) {
            try {
               Runtime.getRuntime().exec(new String[]{"/usr/bin/open", a});
               return;
            } catch (IOException var10) {
            }
         }

         if (Util.getOSType() == EnumOS.WINDOWS) {
            String a = String.format("cmd.exe /C start \"Open file\" \"%s\"", a);

            try {
               Runtime.getRuntime().exec(a);
               return;
            } catch (IOException var9) {
            }
         }

         boolean a = false;

         try {
            Class a = Class.forName("java.awt.Desktop");
            Object a = a.getMethod("getDesktop").invoke((Object)null);
            a.getMethod("browse", URI.class).invoke(a, a.toURI());
         } catch (Throwable var8) {
            a = true;
         }

         Sys.openURL("file://" + a);
      }

   }

   private void Method416(Class207 a, boolean a1, int a2) {
      Class215.Method2649().remove(this.Field1777);
      GlobalModule.INSTANCE.fileManager.deleteConfig(a.Method2419());
      GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Remove Config §a" + a.Method2419(), Types.INFO));
      Minecraft.getMinecraft().displayGuiScreen(GlobalModule.INSTANCE.Field3190);
   }

   private static void Method417(Class207 a, boolean a1, int a2) {
      GlobalModule.INSTANCE.fileManager.Method786(a.Method2419());
      GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Replace Config §a" + a.Method2419(), Types.INFO));
      Minecraft.getMinecraft().displayGuiScreen(GlobalModule.INSTANCE.Field3190);
   }

   private static IOException Method418(IOException iOException) {
      return iOException;
   }
}
