package awsl;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.ScorePlayerTeam;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;

public class Class305 {
   private static ArrayList Field1584;
   private static ArrayList Field1585;
   private static boolean Field1586;

   public static ArrayList Method695() {
      return Field1584;
   }

   public static ArrayList Method696() {
      return Field1585;
   }

   public static boolean Method697(Entity a) {
      int a = Method710();
      if (a instanceof EntityPlayer) {
         Iterator var2 = Field1584.Method1383();
         if (var2.Method932()) {
            Object a = var2.Method933();
            Class309 a = (Class309)a;
            if (a.Method748().equalsIgnoreCase(a.getName())) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean Method698(String a) {
      if (GlobalModule.Field3177.getValue()) {
         Iterator var1 = Field1584.Method1383();

         while(var1.Method932()) {
            Object a = var1.Method933();
            Class309 a = (Class309)a;
            if (a.Method748().equalsIgnoreCase(a)) {
               return true;
            }
         }
      }

      return false;
   }

   public static Class309 Method699(String a) {
      Iterator var1 = Field1584.Method1383();

      Class309 a;
      do {
         if (!var1.Method932()) {
            return null;
         }

         Object a = var1.Method933();
         a = (Class309)a;
      } while(!a.Method748().equalsIgnoreCase(a));

      return a;
   }

   public static boolean Method700(Entity a) {
      int a = Method711();
      if (a instanceof EntityPlayer) {
         Iterator var2 = Field1585.Method1383();
         if (var2.Method932()) {
            Object a = var2.Method933();
            Class307 a = (Class307)a;
            if (a.Method744().equalsIgnoreCase(a.getName())) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean Method701(String a) {
      Iterator var1 = Field1585.Method1383();

      Class307 a;
      do {
         if (!var1.Method932()) {
            return false;
         }

         Object a = var1.Method933();
         a = (Class307)a;
      } while(!a.Method744().equalsIgnoreCase(a));

      return true;
   }

   public static Class307 Method702(String a) {
      Iterator var1 = Field1585.Method1383();

      Class307 a;
      do {
         if (!var1.Method932()) {
            return null;
         }

         Object a = var1.Method933();
         a = (Class307)a;
      } while(!a.Method744().equalsIgnoreCase(a));

      return a;
   }

   public static boolean Method703(EntityPlayer a) {
      return GlobalModule.Field3142.getValue() && (Minecraft.getMinecraft().thePlayer.getTeam().Method3429(a.getTeam()) || Minecraft.getMinecraft().thePlayer.getDisplayName().getFormattedText().startsWith("§") && a.getDisplayName().getFormattedText().startsWith("§") && Minecraft.getMinecraft().thePlayer.getDisplayName().getFormattedText().substring(0, 2).equals(a.getDisplayName().getFormattedText().substring(0, 2)));
   }

   public static boolean Method704(Entity a) {
      return a instanceof EntityPlayer ? Method706(a) : false;
   }

   public static boolean Method705(Entity a) {
      int a = Method711();
      if (GlobalModule.INSTANCE.balant.Field2827.Method3740() >= 5) {
         return false;
      } else {
         if (!GlobalModule.INSTANCE.balant.Field2823.isEmpty()) {
            Iterator var2 = GlobalModule.INSTANCE.balant.Field2823.Method1383();
            if (var2.Method932()) {
               Class606 a = (Class606)var2.Method933();
               if (a.getName().equals(a.Field2841)) {
                  return a.Field2848;
               }
            }
         }

         return false;
      }
   }

   public static boolean Method706(Entity a) {
      if (GlobalModule.Field3142.getValue() && ((EntityPlayer)a).getTeam() != null) {
         if (Minecraft.getMinecraft().thePlayer.getDisplayName().getUnformattedText().startsWith("§")) {
            if (Minecraft.getMinecraft().thePlayer.getDisplayName().getUnformattedText().length() > 2 && a.getDisplayName().getUnformattedText().length() > 2) {
               return Minecraft.getMinecraft().thePlayer.getDisplayName().getUnformattedText().substring(0, 2).equals(a.getDisplayName().getUnformattedText().substring(0, 2));
            }

            return false;
         }

         if (!Method708().equals("NULL")) {
            if (Method708().length() > 2 && a.getDisplayName().getUnformattedText().length() > 2) {
               return Method708().substring(0, 2).equals(a.getDisplayName().getUnformattedText().substring(0, 2));
            }

            return false;
         }
      }

      return false;
   }

   public static int Method707(Entity a) {
      int a = 16777215;
      String a;
      ScorePlayerTeam a;
      if (a instanceof EntityPlayer && (a = (ScorePlayerTeam)((EntityPlayer)a).getTeam()) != null && (a = FontRenderer.getFormatFromString(a.getColorPrefix())).length() >= 2) {
         if (!"0123456789abcdef".contains(String.valueOf(a.charAt(1)))) {
            return a;
         }

         a = Minecraft.getMinecraft().fontRendererObj.getColorCode(a.charAt(1));
      }

      return a;
   }

   public static String Method708() {
      Method710();
      NetworkPlayerInfo a = Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().getSession().getProfile().getId());
      if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
         return a.getDisplayName() != null ? a.getDisplayName().getFormattedText() : ScorePlayerTeam.formatPlayerName(a.getPlayerTeam(), a.getGameProfile().getName());
      } else {
         a.trash(new String[5]);
         return "NULL";
      }
   }

   static {
      Method709(false);
      Field1584 = new ArrayList();
      Field1585 = new ArrayList();
   }

   public static void Method709(boolean boolean1) {
      Field1586 = boolean1;
   }

   public static boolean Method710() {
      return Field1586;
   }

   public static boolean Method711() {
      boolean var0 = Method710();
      return true;
   }
}
