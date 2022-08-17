package trash.foodbyte.utils;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import trash.foodbyte.module.GlobalModule;

public class ChatUtils {
   public static List reported = new ArrayList();

   public static void addChatMessage(String msg) {
      if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
         Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("§8[§c" + GlobalModule.clientName + "§8]§r " + msg));
      }

   }

   public static void addChatMessageNoPrefix(String msg) {
      if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
         Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(new ChatComponentText(msg));
      }

   }

   public static void sendMessage(String msg) {
      Minecraft.getMinecraft().thePlayer.sendChatMessage(msg);
   }

   public static void report(String name) {
      if (!reported.contains(name) && !Minecraft.getMinecraft().thePlayer.getName().equals(name)) {
         reported.Method2530(name);
         Minecraft.getMinecraft().thePlayer.sendChatMessage("/wdr " + name + " ka speed reach fly antiknockback autoclicker dolphin");
      }
   }

   public static void debug(String msg) {
      if (GlobalModule.debug.getValue()) {
         if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("§c[DEBUG] §r" + EnumChatFormatting.GRAY + msg));
         }

      }
   }
}
