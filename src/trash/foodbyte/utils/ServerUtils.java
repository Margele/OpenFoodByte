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
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String a = format(a.getDisplayName());
      String[] a = new String[]{"SKYBLOCK", "空岛生存"};
      String[] var4 = a;
      int var5 = a.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String a = var4[var6];
         if (a.contains(a)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isPlayingSkywars() {
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String a = format(a.getDisplayName());
      String[] a = new String[]{"SKYWARS", "空岛战争"};
      String[] var4 = a;
      int var5 = a.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String a = var4[var6];
         if (a.contains(a)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isPlayerBlitzSg() {
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String a = format(a.getDisplayName());
      String[] a = new String[]{"BLITZ SG", "闪电饥饿游戏"};
      String[] var4 = a;
      int var5 = a.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String a = var4[var6];
         if (a.contains(a)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isPlayingPit() {
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String a = format(a.getDisplayName());
      String[] a = new String[]{"Pit"};
      String[] var4 = a;
      int var5 = a.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String a = var4[var6];
         if (a.contains(a)) {
            return true;
         }
      }

      return false;
   }

   public static boolean inOnYourOwnSkyblock() {
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Collection a = a.getSortedScores(a);
      if (((Collection)a).Method1799() > 15) {
         a = Lists.newArrayList(Iterables.skip((Iterable)a, ((Collection)a).Method1799() - 15));
      }

      Iterator var3 = ((Collection)a).Method1383();

      String a;
      do {
         if (!var3.Method932()) {
            return false;
         }

         Score a = (Score)var3.Method933();
         ScorePlayerTeam a = a.getPlayersTeam(a.getPlayerName());
         a = format(ScorePlayerTeam.formatPlayerName(a, a.getPlayerName()));
      } while(!a.contains("Your Isla") || !a.contains("nd"));

      return true;
   }

   public static boolean isPlayingUHC() {
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String a = format(a.getDisplayName());
      String[] a = new String[]{"UHC", "极限生存冠军", "极限生存", "闪电饥饿游戏", "BLITZ SG", "MEGA WALLS", "超级战墙", "丢锅大战"};
      String[] var4 = a;
      int var5 = a.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String a = var4[var6];
         if (a.contains(a)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isInDeadMatch() {
      trash();
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Collection a = a.getSortedScores(a);
      if (((Collection)a).Method1799() > 15) {
         a = Lists.newArrayList(Iterables.skip((Iterable)a, ((Collection)a).Method1799() - 15));
      }

      Iterator var4 = ((Collection)a).Method1383();
      if (var4.Method932()) {
         Score a = (Score)var4.Method933();
         ScorePlayerTeam a = a.getPlayersTeam(a.getPlayerName());
         String a = format(ScorePlayerTeam.formatPlayerName(a, a.getPlayerName()));
         if ((a.contains("Game ends in") || a.contains("游戏结束倒计时")) && isOnUHC()) {
            return true;
         }
      }

      return false;
   }

   public static boolean isNotInDeadMatch() {
      trash();
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Collection a = a.getSortedScores(a);
      if (((Collection)a).Method1799() > 15) {
         a = Lists.newArrayList(Iterables.skip((Iterable)a, ((Collection)a).Method1799() - 15));
      }

      Iterator var4 = ((Collection)a).Method1383();
      if (var4.Method932()) {
         Score a = (Score)var4.Method933();
         ScorePlayerTeam a = a.getPlayersTeam(a.getPlayerName());
         String a = format(ScorePlayerTeam.formatPlayerName(a, a.getPlayerName()));
         if ((a.contains("Deathmatch in") || a.contains("死亡竞赛倒计时")) && isOnUHC()) {
            return true;
         }
      }

      if (a.trash() == null) {
         trash(new a[3]);
      }

      return false;
   }

   public static boolean isPlayingMegaWalls() {
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String a = format(a.getDisplayName());
      String[] a = new String[]{"MEGA WALLS", "超级战墙"};
      String[] var4 = a;
      int var5 = a.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String a = var4[var6];
         if (a.contains(a)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isOnUHC() {
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String a = format(a.getDisplayName());
      String[] a = new String[]{"HYPIXEL UHC", "UHC", "UHC CHAMPIONS", "极限生存冠军", "极限生存"};
      String[] var3 = a;
      int var4 = a.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String a = var3[var5];
         if (a.contains(a)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isStartingGame() {
      trash();
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Collection a = a.getSortedScores(a);
      if (((Collection)a).Method1799() > 15) {
         a = Lists.newArrayList(Iterables.skip((Iterable)a, ((Collection)a).Method1799() - 15));
      }

      Iterator var4 = ((Collection)a).Method1383();
      if (var4.Method932()) {
         Score a = (Score)var4.Method933();
         ScorePlayerTeam a = a.getPlayersTeam(a.getPlayerName());
         String a = format(ScorePlayerTeam.formatPlayerName(a, a.getPlayerName()));
         if (a.contains("开始") || a.contains("倒计时") || a.contains("开启") || a.contains("Starting") || a.contains("Open")) {
            return true;
         }

         a.trash(new String[4]);
      }

      return false;
   }

   public static boolean isPlayingMurderMystery() {
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      String a = format(a.getDisplayName());
      String[] a = new String[]{"MURDER MYSTERY", "密室杀手"};
      String[] var3 = a;
      int var4 = a.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String a = var3[var5];
         if (a.contains(a)) {
            return true;
         }
      }

      return false;
   }

   public static boolean isDragonNext() {
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
      Collection a = a.getSortedScores(a);
      if (((Collection)a).Method1799() > 15) {
         a = Lists.newArrayList(Iterables.skip((Iterable)a, ((Collection)a).Method1799() - 15));
      }

      Iterator var3 = ((Collection)a).Method1383();

      String a;
      do {
         if (!var3.Method932()) {
            return false;
         }

         Score a = (Score)var3.Method933();
         ScorePlayerTeam a = a.getPlayersTeam(a.getPlayerName());
         a = getOnlyChar(format(ScorePlayerTeam.formatPlayerName(a, a.getPlayerName())));
      } while(!a.contains("Dragons Nest"));

      return true;
   }

   public static boolean isCleared() {
      boolean a = false;
      Scoreboard a = mc.theWorld.getScoreboard();
      ScoreObjective a = a.getObjectiveInDisplaySlot(1);
      ArrayList a = new ArrayList(a.getSortedScores(a));
      int a = a.Method1799() - 1;

      while(true) {
         Score a = (Score)a.get(a);
         ScorePlayerTeam a = a.getPlayersTeam(a.getPlayerName());
         String a = ScorePlayerTeam.formatPlayerName(a, a.getPlayerName());
         String a = clearColorChar(removeColorChar2(a));
         if (a.contains("Cleared:") && a.contains("%")) {
            a = true;
         }

         --a;
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
      StringBuilder a = new StringBuilder();
      char a = 'r';
      boolean a = false;
      char[] var4 = a.toCharArray();
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         char a = var4[var6];
         if (a <= '썐') {
            if (a == 167) {
               a = true;
            } else {
               if (a != a) {
                  a.append('§');
                  a.append(a);
                  a = a;
               }

               a = false;
            }
         }
      }

      return a.toString();
   }

   public static void displayMultiPlayer() {
      if (serverData != null) {
         mc.displayGuiScreen(new GuiConnecting(new GuiMultiplayer(new GuiMainMenu()), mc, serverData));
      }
   }

   public static String getServerIP() {
      String a = "Singleplayer";
      if (mc.theWorld.isRemote) {
         ServerData a = mc.getCurrentServerData();
         a = a.serverIP;
      }

      return a;
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
