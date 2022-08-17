package awsl;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import obfuscate.a;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.utils.ChatUtils;

public class Class607 implements Class611 {
   private static boolean Field2853;

   public void Method3714(Class552 a) {
      String var2 = a.Method692();
      ChatUtils.addChatMessageNoPrefix(var2);
   }

   public void Method3715(Class534 a) {
      ChatUtils.addChatMessageNoPrefix(a.Method692());
      GlobalModule.INSTANCE.balant.Method3701();
   }

   public void Method3716(Class521 a) {
      if (Minecraft.getMinecraft().theWorld != null && Minecraft.getMinecraft().thePlayer != null) {
         Minecraft.getMinecraft().thePlayer.sendChatMessage(a.Method692());
      }

   }

   public void Method3717(Class531 a) {
   }

   public void Method3718(Class562 a) {
      GlobalModule.INSTANCE.balant.Field2823 = (ArrayList)a.Method845();
   }

   public void Method3719(Class523 a) {
      Method3733();
      String var3 = a.Method692();
      byte var5 = -1;
      switch (var3.hashCode()) {
         case 1513939:
            if (!var3.equals("/set")) {
               break;
            }

            var5 = 0;
            a.trash(new String[2]);
         case 1496594:
            if (!var3.equals("/add")) {
               break;
            }

            var5 = 1;
         case 2123356531:
            if (!var3.equals("/remove")) {
               break;
            }

            var5 = 2;
         case 46481497:
            if (!var3.equals("/data")) {
               break;
            }

            var5 = 3;
         case 46607857:
            if (var3.equals("/hide")) {
               var5 = 4;
            }
      }

      switch (var5) {
         case 0:
            if (a.Method846().Field2840.equals(GlobalModule.INSTANCE.balant.Field2827.Field2840) && a.Method846().Field2846 == GlobalModule.INSTANCE.balant.Field2827.Field2846) {
               GlobalModule.INSTANCE.balant.Field2827.Field2838 = a.Method846().Field2838;
               GlobalModule.INSTANCE.balant.Field2827.Field2839 = a.Method846().Field2839;
               GlobalModule.INSTANCE.balant.Field2827.Field2843 = a.Method846().Field2843;
               GlobalModule.INSTANCE.balant.Field2827.Field2840 = a.Method846().Field2840;
               GlobalModule.INSTANCE.balant.Field2827.Field2841 = a.Method846().Field2841;
               GlobalModule.INSTANCE.balant.Field2827.Field2842 = a.Method846().Field2842;
               GlobalModule.INSTANCE.balant.Field2827.Field2847 = a.Method846().Field2847;
               GlobalModule.INSTANCE.balant.Field2827.Field2848 = a.Method846().Field2848;
            }

            int var6 = 0;
            if (var6 < GlobalModule.INSTANCE.balant.Field2823.Method1799()) {
               Class606 var7 = (Class606)GlobalModule.INSTANCE.balant.Field2823.get(var6);
               if (a.Method846().Field2840.equals(var7.Field2840) && a.Method846().Field2846 == var7.Field2846) {
                  var7.Field2838 = a.Method846().Field2838;
                  var7.Field2839 = a.Method846().Field2839;
                  var7.Field2843 = a.Method846().Field2843;
                  var7.Field2840 = a.Method846().Field2840;
                  var7.Field2841 = a.Method846().Field2841;
                  var7.Field2842 = a.Method846().Field2842;
                  var7.Field2847 = a.Method846().Field2847;
                  var7.Field2848 = a.Method846().Field2848;
               }

               ++var6;
            }
         case 1:
            GlobalModule.INSTANCE.balant.Field2823.Method2530(a.Method846());
         case 2:
            GlobalModule.INSTANCE.balant.Field2823.removeIf(Class607::Method3730);
         case 3:
            GlobalModule.INSTANCE.balant.Field2823.forEach(Class607::Method3729);
         case 4:
            GlobalModule.INSTANCE.balant.Field2823.forEach(Class607::Method3728);
         default:
            GlobalModule.INSTANCE.balant.Field2823.forEach(Class607::Method3727);
      }
   }

   public void Method3720(Class527 a) {
      if (a.Method692().equalsIgnoreCase("kick")) {
         Minecraft.getMinecraft().shutdown();
      } else if (Double.parseDouble("5.6") < Double.parseDouble(a.Method692())) {
         Minecraft.getMinecraft().shutdown();
      }

   }

   public void Method3721(Class525 a) {
      if (Minecraft.getMinecraft().getCurrentServerData() != null) {
         Minecraft.getMinecraft().getNetHandler().getNetworkManager().closeChannel(new ChatComponentText(a.Method692()));
      }

   }

   public void Method3722(Class529 a) {
      GlobalModule.INSTANCE.balant.Field2823.forEach(Class607::Method3726);
   }

   public void Method3723(Class536 a) {
      if (a.Method845() != null) {
         PermissionManager.permissions = a.Method845();
      }

      if (PermissionManager.canUseFeature("multi")) {
         ((KillAura)ModuleManager.getModule2(KillAura.class)).Field2504.Method2721("Multi");
      } else {
         ((KillAura)ModuleManager.getModule2(KillAura.class)).Field2504.Method2722("Multi");
      }

      if (PermissionManager.canUseFeature("irclist")) {
         GlobalModule.INSTANCE.Field3190.Field3056.forEach(Class607::Method3725);
      } else {
         GlobalModule.INSTANCE.Field3190.Field3056.forEach(Class607::Method3724);
      }

      Iterator var2 = ModuleManager.getAllModules().Method1383();

      while(var2.Method932()) {
         Module var3 = (Module)var2.Method933();
         if (var3.canUse() && var3.getState()) {
            var3.setState(!var3.getState());
         }
      }

   }

   private static void Method3724(Class381 a) {
      if (a.Method1395().equalsIgnoreCase("IRC")) {
         a.Method1407(false);
      }

   }

   private static void Method3725(Class381 a) {
      if (a.Method1395().equalsIgnoreCase("IRC")) {
         a.Method1407(true);
      }

   }

   private static void Method3726(Class529 a, Class606 a) {
      if (a.Method883().equals(a.Field2840) && a.Method691() == a.Field2846) {
         a.Field2849 = a.Method692();
         a.Field2850 = a.Method860();
         a.Field2851 = System.currentTimeMillis();
      }

   }

   private static void Method3727(Class523 a, String a, Class606 a) {
      if (a.Method846().Field2840.equals(a.Field2840) && a.Method846().Field2846 == a.Field2846) {
         a.Field2841 = a;
      }

   }

   private static void Method3728(Class523 a, Class606 a) {
      if (a.Method846().Field2840.equals(a.Field2840) && a.Method846().Field2846 == a.Field2846) {
         a.Field2847 = a.Method846().Field2847;
      }

   }

   private static void Method3729(Class523 a, Class606 a) {
      if (a.Method846().Field2840.equals(a.Field2840) && a.Method846().Field2846 == a.Field2846) {
         GlobalModule.INSTANCE.balant.Field2827 = a.Method846();
      }

   }

   private static boolean Method3730(Class523 a, Class606 a) {
      return a.Method846().Field2840.equals(a.Field2840) && a.Method846().Field2846 == a.Field2846;
   }

   public static void Method3731(boolean boolean1) {
      Field2853 = boolean1;
   }

   public static boolean Method3732() {
      return Field2853;
   }

   public static boolean Method3733() {
      boolean var0 = Method3732();
      return true;
   }

   static {
      Method3731(false);
   }
}
