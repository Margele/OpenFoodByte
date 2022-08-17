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
      boolean var1 = Method710();
      if (a instanceof EntityPlayer) {
         Iterator var2 = Field1584.Method1383();
         if (var2.Method932()) {
            Object var3 = var2.Method933();
            Class309 var4 = (Class309)var3;
            if (var4.Method748().equalsIgnoreCase(a.getName())) {
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
            Object var2 = var1.Method933();
            Class309 var3 = (Class309)var2;
            if (var3.Method748().equalsIgnoreCase(a)) {
               return true;
            }
         }
      }

      return false;
   }

   public static Class309 Method699(String a) {
      Iterator var1 = Field1584.Method1383();

      Class309 var3;
      do {
         if (!var1.Method932()) {
            return null;
         }

         Object var2 = var1.Method933();
         var3 = (Class309)var2;
      } while(!var3.Method748().equalsIgnoreCase(a));

      return var3;
   }

   public static boolean Method700(Entity a) {
      boolean var1 = Method711();
      if (a instanceof EntityPlayer) {
         Iterator var2 = Field1585.Method1383();
         if (var2.Method932()) {
            Object var3 = var2.Method933();
            Class307 var4 = (Class307)var3;
            if (var4.Method744().equalsIgnoreCase(a.getName())) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean Method701(String a) {
      Iterator var1 = Field1585.Method1383();

      Class307 var3;
      do {
         if (!var1.Method932()) {
            return false;
         }

         Object var2 = var1.Method933();
         var3 = (Class307)var2;
      } while(!var3.Method744().equalsIgnoreCase(a));

      return true;
   }

   public static Class307 Method702(String a) {
      Iterator var1 = Field1585.Method1383();

      Class307 var3;
      do {
         if (!var1.Method932()) {
            return null;
         }

         Object var2 = var1.Method933();
         var3 = (Class307)var2;
      } while(!var3.Method744().equalsIgnoreCase(a));

      return var3;
   }

   public static boolean Method703(EntityPlayer a) {
      return GlobalModule.Field3142.getValue() && (Minecraft.getMinecraft().thePlayer.getTeam().Method3429(a.getTeam()) || Minecraft.getMinecraft().thePlayer.getDisplayName().getFormattedText().startsWith("§") && a.getDisplayName().getFormattedText().startsWith("§") && Minecraft.getMinecraft().thePlayer.getDisplayName().getFormattedText().substring(0, 2).equals(a.getDisplayName().getFormattedText().substring(0, 2)));
   }

   public static boolean Method704(Entity a) {
      return a instanceof EntityPlayer ? Method706(a) : false;
   }

   public static boolean Method705(Entity a) {
      boolean var1 = Method711();
      if (GlobalModule.INSTANCE.balant.Field2827.Method3740() >= 5) {
         return false;
      } else {
         if (!GlobalModule.INSTANCE.balant.Field2823.isEmpty()) {
            Iterator var2 = GlobalModule.INSTANCE.balant.Field2823.Method1383();
            if (var2.Method932()) {
               Class606 var3 = (Class606)var2.Method933();
               if (a.getName().equals(var3.Field2841)) {
                  return var3.Field2848;
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
      int var3 = 16777215;
      String var1;
      ScorePlayerTeam var2;
      if (a instanceof EntityPlayer && (var2 = (ScorePlayerTeam)((EntityPlayer)a).getTeam()) != null && (var1 = FontRenderer.getFormatFromString(var2.getColorPrefix())).length() >= 2) {
         if (!"0123456789abcdef".contains(String.valueOf(var1.charAt(1)))) {
            return var3;
         }

         var3 = Minecraft.getMinecraft().fontRendererObj.getColorCode(var1.charAt(1));
      }

      return var3;
   }

   public static String Method708() {
      Method710();
      NetworkPlayerInfo var1 = Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().getSession().getProfile().getId());
      if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
         return var1.getDisplayName() != null ? var1.getDisplayName().getFormattedText() : ScorePlayerTeam.formatPlayerName(var1.getPlayerTeam(), var1.getGameProfile().getName());
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
