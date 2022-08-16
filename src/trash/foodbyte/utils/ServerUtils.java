/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.regex.Pattern
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiMainMenu
 *  net.minecraft.client.gui.GuiMultiplayer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.GuiConnecting
 *  net.minecraft.client.multiplayer.ServerData
 *  net.minecraft.scoreboard.Score
 *  net.minecraft.scoreboard.ScoreObjective
 *  net.minecraft.scoreboard.ScorePlayerTeam
 *  net.minecraft.scoreboard.Scoreboard
 *  net.minecraft.scoreboard.Team
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
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
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import obfuscate.a;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ServerPacketHandler;
import trash.foodbyte.utils.Servers;

@SideOnly(value=Side.CLIENT)
public class ServerUtils {
    private static Minecraft mc;
    public static ServerData serverData;
    private static Pattern pattern;
    private static a[] trash;

    public static boolean isSinglePlayer(Servers server) {
        if (!mc.isSingleplayer() && ServerPacketHandler.currentServer != null) {
            return ServerPacketHandler.currentServer.equals((Object)server);
        }
        return false;
    }

    public static boolean isPlayingSkyblock() {
        String[] a2;
        Scoreboard a3 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a4 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a5 = ServerUtils.format(a4.getDisplayName());
        for (String a6 : a2 = new String[]{"SKYBLOCK", "\u7a7a\u5c9b\u751f\u5b58"}) {
            if (!a5.contains((CharSequence)a6)) continue;
            return true;
        }
        return false;
    }

    public static boolean isPlayingSkywars() {
        String[] a2;
        Scoreboard a3 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a4 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a5 = ServerUtils.format(a4.getDisplayName());
        for (String a6 : a2 = new String[]{"SKYWARS", "\u7a7a\u5c9b\u6218\u4e89"}) {
            if (!a5.contains((CharSequence)a6)) continue;
            return true;
        }
        return false;
    }

    public static boolean isPlayerBlitzSg() {
        String[] a2;
        Scoreboard a3 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a4 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a5 = ServerUtils.format(a4.getDisplayName());
        for (String a6 : a2 = new String[]{"BLITZ SG", "\u95ea\u7535\u9965\u997f\u6e38\u620f"}) {
            if (!a5.contains((CharSequence)a6)) continue;
            return true;
        }
        return false;
    }

    public static boolean isPlayingPit() {
        String[] a2;
        Scoreboard a3 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a4 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a5 = ServerUtils.format(a4.getDisplayName());
        for (String a6 : a2 = new String[]{"Pit"}) {
            if (!a5.contains((CharSequence)a6)) continue;
            return true;
        }
        return false;
    }

    public static boolean inOnYourOwnSkyblock() {
        Scoreboard a2 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a3 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Collection a4 = a2.getSortedScores(a3);
        if (a4.Method1799() > 15) {
            a4 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a4, (int)(a4.Method1799() - 15)));
        }
        Iterator iterator = a4.Method1383();
        while (iterator.Method932()) {
            Score a5 = (Score)iterator.Method933();
            ScorePlayerTeam a6 = a2.getPlayersTeam(a5.getPlayerName());
            String a7 = ServerUtils.format(ScorePlayerTeam.formatPlayerName((Team)a6, (String)a5.getPlayerName()));
            if (!a7.contains((CharSequence)"Your Isla") || !a7.contains((CharSequence)"nd")) continue;
            return true;
        }
        return false;
    }

    public static boolean isPlayingUHC() {
        String[] a2;
        Scoreboard a3 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a4 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a5 = ServerUtils.format(a4.getDisplayName());
        for (String a6 : a2 = new String[]{"UHC", "\u6781\u9650\u751f\u5b58\u51a0\u519b", "\u6781\u9650\u751f\u5b58", "\u95ea\u7535\u9965\u997f\u6e38\u620f", "BLITZ SG", "MEGA WALLS", "\u8d85\u7ea7\u6218\u5899", "\u4e22\u9505\u5927\u6218"}) {
            if (!a5.contains((CharSequence)a6)) continue;
            return true;
        }
        return false;
    }

    public static boolean isInDeadMatch() {
        Iterator iterator;
        Scoreboard a2 = ServerUtils.mc.theWorld.getScoreboard();
        a[] a3 = ServerUtils.trash();
        ScoreObjective a4 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Collection a5 = a2.getSortedScores(a4);
        if (a5.Method1799() > 15) {
            a5 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a5, (int)(a5.Method1799() - 15)));
        }
        if ((iterator = a5.Method1383()).Method932()) {
            Score a6 = (Score)iterator.Method933();
            ScorePlayerTeam a7 = a2.getPlayersTeam(a6.getPlayerName());
            String a8 = ServerUtils.format(ScorePlayerTeam.formatPlayerName((Team)a7, (String)a6.getPlayerName()));
            if ((a8.contains((CharSequence)"Game ends in") || a8.contains((CharSequence)"\u6e38\u620f\u7ed3\u675f\u5012\u8ba1\u65f6")) && ServerUtils.isOnUHC()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNotInDeadMatch() {
        Iterator iterator;
        Scoreboard a2 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a3 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        a[] a4 = ServerUtils.trash();
        Collection a5 = a2.getSortedScores(a3);
        if (a5.Method1799() > 15) {
            a5 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a5, (int)(a5.Method1799() - 15)));
        }
        if ((iterator = a5.Method1383()).Method932()) {
            Score a6 = (Score)iterator.Method933();
            ScorePlayerTeam a7 = a2.getPlayersTeam(a6.getPlayerName());
            String a8 = ServerUtils.format(ScorePlayerTeam.formatPlayerName((Team)a7, (String)a6.getPlayerName()));
            if ((a8.contains((CharSequence)"Deathmatch in") || a8.contains((CharSequence)"\u6b7b\u4ea1\u7ade\u8d5b\u5012\u8ba1\u65f6")) && ServerUtils.isOnUHC()) {
                return true;
            }
        }
        if (a.trash() == null) {
            ServerUtils.trash(new a[3]);
        }
        return false;
    }

    public static boolean isPlayingMegaWalls() {
        String[] a2;
        Scoreboard a3 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a4 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a5 = ServerUtils.format(a4.getDisplayName());
        for (String a6 : a2 = new String[]{"MEGA WALLS", "\u8d85\u7ea7\u6218\u5899"}) {
            if (!a5.contains((CharSequence)a6)) continue;
            return true;
        }
        return false;
    }

    public static boolean isOnUHC() {
        String[] a2;
        ScoreObjective a3 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a4 = ServerUtils.format(a3.getDisplayName());
        for (String a5 : a2 = new String[]{"HYPIXEL UHC", "UHC", "UHC CHAMPIONS", "\u6781\u9650\u751f\u5b58\u51a0\u519b", "\u6781\u9650\u751f\u5b58"}) {
            if (!a4.contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public static boolean isStartingGame() {
        Iterator iterator;
        Scoreboard a2 = ServerUtils.mc.theWorld.getScoreboard();
        a[] a3 = ServerUtils.trash();
        ScoreObjective a4 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Collection a5 = a2.getSortedScores(a4);
        if (a5.Method1799() > 15) {
            a5 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a5, (int)(a5.Method1799() - 15)));
        }
        if ((iterator = a5.Method1383()).Method932()) {
            Score a6 = (Score)iterator.Method933();
            ScorePlayerTeam a7 = a2.getPlayersTeam(a6.getPlayerName());
            String a8 = ServerUtils.format(ScorePlayerTeam.formatPlayerName((Team)a7, (String)a6.getPlayerName()));
            if (a8.contains((CharSequence)"\u5f00\u59cb") || a8.contains((CharSequence)"\u5012\u8ba1\u65f6") || a8.contains((CharSequence)"\u5f00\u542f") || a8.contains((CharSequence)"Starting") || a8.contains((CharSequence)"Open")) {
                return true;
            }
            a.trash(new String[4]);
        }
        return false;
    }

    public static boolean isPlayingMurderMystery() {
        String[] a2;
        ScoreObjective a3 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a4 = ServerUtils.format(a3.getDisplayName());
        for (String a5 : a2 = new String[]{"MURDER MYSTERY", "\u5bc6\u5ba4\u6740\u624b"}) {
            if (!a4.contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public static boolean isDragonNext() {
        Scoreboard a2 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a3 = ServerUtils.mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Collection a4 = a2.getSortedScores(a3);
        if (a4.Method1799() > 15) {
            a4 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a4, (int)(a4.Method1799() - 15)));
        }
        Iterator iterator = a4.Method1383();
        while (iterator.Method932()) {
            Score a5 = (Score)iterator.Method933();
            ScorePlayerTeam a6 = a2.getPlayersTeam(a5.getPlayerName());
            String a7 = ServerUtils.getOnlyChar(ServerUtils.format(ScorePlayerTeam.formatPlayerName((Team)a6, (String)a5.getPlayerName())));
            if (!a7.contains((CharSequence)"Dragons Nest")) continue;
            return true;
        }
        return false;
    }

    public static boolean isCleared() {
        boolean a2 = false;
        Scoreboard a3 = ServerUtils.mc.theWorld.getScoreboard();
        ScoreObjective a4 = a3.getObjectiveInDisplaySlot(1);
        ArrayList a5 = new ArrayList(a3.getSortedScores(a4));
        int a6 = a5.Method1799() - 1;
        while (true) {
            Score a7 = (Score)a5.get(a6);
            ScorePlayerTeam a8 = a3.getPlayersTeam(a7.getPlayerName());
            String a9 = ScorePlayerTeam.formatPlayerName((Team)a8, (String)a7.getPlayerName());
            String a10 = ServerUtils.clearColorChar(a9 = ServerUtils.removeColorChar2(a9));
            if (a10.contains((CharSequence)"Cleared:") && a10.contains((CharSequence)"%")) {
                a2 = true;
            }
            --a6;
        }
    }

    public static boolean isPlayingSkyblockAndCleared() {
        return ServerPacketHandler.currentServer.equals((Object)Servers.SB) && ServerUtils.isCleared();
    }

    public static String getOnlyChar(String s) {
        return Pattern.compile((String)"[^a-z A-Z]").matcher((CharSequence)s).replaceAll("");
    }

    public static String format(String s) {
        return pattern.matcher((CharSequence)s).replaceAll("");
    }

    public static String clearColorChar(String s) {
        return s.replaceAll("(?i)\\u00A7.", "");
    }

    public static String removeColorChar2(String a2) {
        StringBuilder a3 = new StringBuilder();
        char a4 = 'r';
        boolean a5 = false;
        for (char a6 : a2.toCharArray()) {
            if (a6 > '\uc350') continue;
            if (a6 == '\u00a7') {
                a5 = true;
                continue;
            }
            if (a4 != a6) {
                a3.append('\u00a7');
                a3.append(a6);
                a4 = a6;
            }
            a5 = false;
        }
        return a3.toString();
    }

    public static void displayMultiPlayer() {
        if (serverData == null) {
            return;
        }
        mc.displayGuiScreen((GuiScreen)new GuiConnecting((GuiScreen)new GuiMultiplayer((GuiScreen)new GuiMainMenu()), mc, serverData));
    }

    public static String getServerIP() {
        String a2 = "Singleplayer";
        if (ServerUtils.mc.theWorld.isRemote) {
            ServerData a3 = mc.getCurrentServerData();
            a2 = a3.serverIP;
        }
        return a2;
    }

    public static boolean isPlaying(String s) {
        return ServerUtils.mc.getCurrentServerData().serverIP.contains((CharSequence)s);
    }

    static {
        ServerUtils.trash(null);
        mc = Wrapper.INSTANCE.getMinecraft();
        pattern = Pattern.compile((String)"(?i)\u00a7[0-9A-FK-OR]");
    }

    public static void trash(a[] aArray) {
        trash = aArray;
    }

    public static a[] trash() {
        return trash;
    }
}