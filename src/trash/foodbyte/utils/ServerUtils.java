package trash.foodbyte.utils;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import obfuscate.a;
import trash.foodbyte.reflections.Wrapper;

@SideOnly(Side.CLIENT)
public class ServerUtils {
   private static Minecraft mc;
   public static ServerData serverData;
   private static Pattern pattern;
   private static a[] trash;

   public static boolean isSinglePlayer(Servers server) {
      return !mc.isSingleplayer() && ServerPacketHandler.currentServer != null ? ServerPacketHandler.currentServer.equals(server) : false;
   }

   public static boolean isPlayingSkyblock() {
      Scoreboard var0 = mc.theWorld.getScoreboard();
      ScoreObjective var1 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String var2 = format(var1.getDisplayName());
      String[] var3 = new String[]{"SKYBLOCK", "空岛生存"};
      String[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if (var2.contains(var7)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isPlayingSkywars() {
      Scoreboard var0 = mc.theWorld.getScoreboard();
      ScoreObjective var1 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String var2 = format(var1.getDisplayName());
      String[] var3 = new String[]{"SKYWARS", "空岛战争"};
      String[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if (var2.contains(var7)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isPlayerBlitzSg() {
      Scoreboard var0 = mc.theWorld.getScoreboard();
      ScoreObjective var1 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String var2 = format(var1.getDisplayName());
      String[] var3 = new String[]{"BLITZ SG", "闪电饥饿游戏"};
      String[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if (var2.contains(var7)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isPlayingPit() {
      Scoreboard var0 = mc.theWorld.getScoreboard();
      ScoreObjective var1 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String var2 = format(var1.getDisplayName());
      String[] var3 = new String[]{"Pit"};
      String[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if (var2.contains(var7)) {
            return true;
         }
      }

      return false;
   }

   public static boolean inOnYourOwnSkyblock() {
      Scoreboard var0 = mc.theWorld.getScoreboard();
      ScoreObjective var1 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Object var2 = var0.getSortedScores(var1);
      if (((Collection)var2).Method1799() > 15) {
         var2 = Lists.newArrayList(Iterables.skip((Iterable)var2, ((Collection)var2).Method1799() - 15));
      }

      Iterator var3 = ((Collection)var2).Method1383();

      String var6;
      do {
         if (!var3.Method932()) {
            return false;
         }

         Score var4 = (Score)var3.Method933();
         ScorePlayerTeam var5 = var0.getPlayersTeam(var4.getPlayerName());
         var6 = format(ScorePlayerTeam.formatPlayerName(var5, var4.getPlayerName()));
      } while(!var6.contains("Your Isla") || !var6.contains("nd"));

      return true;
   }

   public static boolean isPlayingUHC() {
      Scoreboard var0 = mc.theWorld.getScoreboard();
      ScoreObjective var1 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String var2 = format(var1.getDisplayName());
      String[] var3 = new String[]{"UHC", "极限生存冠军", "极限生存", "闪电饥饿游戏", "BLITZ SG", "MEGA WALLS", "超级战墙", "丢锅大战"};
      String[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if (var2.contains(var7)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isInDeadMatch() {
      trash();
      Scoreboard var1 = mc.theWorld.getScoreboard();
      ScoreObjective var2 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Object var3 = var1.getSortedScores(var2);
      if (((Collection)var3).Method1799() > 15) {
         var3 = Lists.newArrayList(Iterables.skip((Iterable)var3, ((Collection)var3).Method1799() - 15));
      }

      Iterator var4 = ((Collection)var3).Method1383();
      if (var4.Method932()) {
         Score var5 = (Score)var4.Method933();
         ScorePlayerTeam var6 = var1.getPlayersTeam(var5.getPlayerName());
         String var7 = format(ScorePlayerTeam.formatPlayerName(var6, var5.getPlayerName()));
         if ((var7.contains("Game ends in") || var7.contains("游戏结束倒计时")) && isOnUHC()) {
            return true;
         }
      }

      return false;
   }

   public static boolean isNotInDeadMatch() {
      trash();
      Scoreboard var1 = mc.theWorld.getScoreboard();
      ScoreObjective var2 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Object var3 = var1.getSortedScores(var2);
      if (((Collection)var3).Method1799() > 15) {
         var3 = Lists.newArrayList(Iterables.skip((Iterable)var3, ((Collection)var3).Method1799() - 15));
      }

      Iterator var4 = ((Collection)var3).Method1383();
      if (var4.Method932()) {
         Score var5 = (Score)var4.Method933();
         ScorePlayerTeam var6 = var1.getPlayersTeam(var5.getPlayerName());
         String var7 = format(ScorePlayerTeam.formatPlayerName(var6, var5.getPlayerName()));
         if ((var7.contains("Deathmatch in") || var7.contains("死亡竞赛倒计时")) && isOnUHC()) {
            return true;
         }
      }

      if (a.trash() == null) {
         trash(new a[3]);
      }

      return false;
   }

   public static boolean isPlayingMegaWalls() {
      Scoreboard var0 = mc.theWorld.getScoreboard();
      ScoreObjective var1 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String var2 = format(var1.getDisplayName());
      String[] var3 = new String[]{"MEGA WALLS", "超级战墙"};
      String[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if (var2.contains(var7)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isOnUHC() {
      ScoreObjective var0 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String var1 = format(var0.getDisplayName());
      String[] var2 = new String[]{"HYPIXEL UHC", "UHC", "UHC CHAMPIONS", "极限生存冠军", "极限生存"};
      String[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         if (var1.contains(var6)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isStartingGame() {
      trash();
      Scoreboard var1 = mc.theWorld.getScoreboard();
      ScoreObjective var2 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Object var3 = var1.getSortedScores(var2);
      if (((Collection)var3).Method1799() > 15) {
         var3 = Lists.newArrayList(Iterables.skip((Iterable)var3, ((Collection)var3).Method1799() - 15));
      }

      Iterator var4 = ((Collection)var3).Method1383();
      if (var4.Method932()) {
         Score var5 = (Score)var4.Method933();
         ScorePlayerTeam var6 = var1.getPlayersTeam(var5.getPlayerName());
         String var7 = format(ScorePlayerTeam.formatPlayerName(var6, var5.getPlayerName()));
         if (var7.contains("开始") || var7.contains("倒计时") || var7.contains("开启") || var7.contains("Starting") || var7.contains("Open")) {
            return true;
         }

         a.trash(new String[4]);
      }

      return false;
   }

   public static boolean isPlayingMurderMystery() {
      ScoreObjective var0 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String var1 = format(var0.getDisplayName());
      String[] var2 = new String[]{"MURDER MYSTERY", "密室杀手"};
      String[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         if (var1.contains(var6)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isDragonNext() {
      Scoreboard var0 = mc.theWorld.getScoreboard();
      ScoreObjective var1 = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Object var2 = var0.getSortedScores(var1);
      if (((Collection)var2).Method1799() > 15) {
         var2 = Lists.newArrayList(Iterables.skip((Iterable)var2, ((Collection)var2).Method1799() - 15));
      }

      Iterator var3 = ((Collection)var2).Method1383();

      String var6;
      do {
         if (!var3.Method932()) {
            return false;
         }

         Score var4 = (Score)var3.Method933();
         ScorePlayerTeam var5 = var0.getPlayersTeam(var4.getPlayerName());
         var6 = getOnlyChar(format(ScorePlayerTeam.formatPlayerName(var5, var4.getPlayerName())));
      } while(!var6.contains("Dragons Nest"));

      return true;
   }

   public static boolean isCleared() {
      boolean var0 = false;
      Scoreboard var1 = mc.theWorld.getScoreboard();
      ScoreObjective var2 = var1.getObjectiveInDisplaySlot(1);
      ArrayList var3 = new ArrayList(var1.getSortedScores(var2));
      int var4 = var3.Method1799() - 1;

      while(true) {
         Score var5 = (Score)var3.get(var4);
         ScorePlayerTeam var6 = var1.getPlayersTeam(var5.getPlayerName());
         String var7 = ScorePlayerTeam.formatPlayerName(var6, var5.getPlayerName());
         String var8 = clearColorChar(removeColorChar2(var7));
         if (var8.contains("Cleared:") && var8.contains("%")) {
            var0 = true;
         }

         --var4;
      }
   }

   public static boolean isPlayingSkyblockAndCleared() {
      return ServerPacketHandler.currentServer.equals(Servers.SB) && isCleared();
   }

   public static String getOnlyChar(String s) {
      return Pattern.compile("[^a-z A-Z]").matcher(s).replaceAll("");
   }

   public static String format(String s) {
      return pattern.matcher(s).replaceAll("");
   }

   public static String clearColorChar(String s) {
      return s.replaceAll("(?i)\\u00A7.", "");
   }

   public static String removeColorChar2(String a) {
      StringBuilder var1 = new StringBuilder();
      char var2 = 'r';
      boolean var3 = false;
      char[] var4 = a.toCharArray();
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var4[var6];
         if (var7 <= '썐') {
            if (var7 == 167) {
               var3 = true;
            } else {
               if (var2 != var7) {
                  var1.append('§');
                  var1.append(var7);
                  var2 = var7;
               }

               var3 = false;
            }
         }
      }

      return var1.toString();
   }

   public static void displayMultiPlayer() {
      if (serverData != null) {
         mc.displayGuiScreen(new GuiConnecting(new GuiMultiplayer(new GuiMainMenu()), mc, serverData));
      }
   }

   public static String getServerIP() {
      String var0 = "Singleplayer";
      if (mc.theWorld.isRemote) {
         ServerData var1 = mc.getCurrentServerData();
         var0 = var1.serverIP;
      }

      return var0;
   }

   public static boolean isPlaying(String s) {
      return mc.getCurrentServerData().serverIP.contains(s);
   }

   static {
      trash((a[])null);
      mc = Wrapper.INSTANCE.getMinecraft();
      pattern = Pattern.compile("(?i)§[0-9A-FK-OR]");
   }

   public static void trash(a[] trash) {
      trash = trash;
   }

   public static a[] trash() {
      return trash;
   }
}
