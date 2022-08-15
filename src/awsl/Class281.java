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
package awsl;

import awsl.Class567;
import awsl.Class667;
import awsl.Class91;
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
import trash.foodbyte.utils.Wrapper;

@SideOnly(value=Side.CLIENT)
public class Class281 {
    private static Minecraft Field1525;
    public static ServerData Field1526;
    private static Pattern Field1527;
    private static Class91[] Field1528;

    public static boolean Method3049(Class667 a) {
        if (!Field1525.isSingleplayer() && Class567.Field2643 != null) {
            return Class567.Field2643.equals((Object)a);
        }
        return false;
    }

    public static boolean Method3050() {
        String[] a;
        Scoreboard a2 = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a3 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a4 = Class281.Method3066(a3.getDisplayName());
        for (String a5 : a = new String[]{"SKYBLOCK", "\u7a7a\u5c9b\u751f\u5b58"}) {
            if (!a4.contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3051() {
        String[] a;
        Scoreboard a2 = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a3 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a4 = Class281.Method3066(a3.getDisplayName());
        for (String a5 : a = new String[]{"SKYWARS", "\u7a7a\u5c9b\u6218\u4e89"}) {
            if (!a4.contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3052() {
        String[] a;
        Scoreboard a2 = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a3 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a4 = Class281.Method3066(a3.getDisplayName());
        for (String a5 : a = new String[]{"BLITZ SG", "\u95ea\u7535\u9965\u997f\u6e38\u620f"}) {
            if (!a4.contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3053() {
        String[] a;
        Scoreboard a2 = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a3 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a4 = Class281.Method3066(a3.getDisplayName());
        for (String a5 : a = new String[]{"Pit"}) {
            if (!a4.contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3054() {
        Scoreboard a = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a2 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Collection a3 = a.getSortedScores(a2);
        if (a3.Method1799() > 15) {
            a3 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a3, (int)(a3.Method1799() - 15)));
        }
        Iterator iterator = a3.Method1383();
        while (iterator.Method932()) {
            Score a4 = (Score)iterator.Method933();
            ScorePlayerTeam a5 = a.getPlayersTeam(a4.getPlayerName());
            String a6 = Class281.Method3066(ScorePlayerTeam.formatPlayerName((Team)a5, (String)a4.getPlayerName()));
            if (!a6.contains((CharSequence)"Your Isla") || !a6.contains((CharSequence)"nd")) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3055() {
        String[] a;
        Scoreboard a2 = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a3 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a4 = Class281.Method3066(a3.getDisplayName());
        for (String a5 : a = new String[]{"UHC", "\u6781\u9650\u751f\u5b58\u51a0\u519b", "\u6781\u9650\u751f\u5b58", "\u95ea\u7535\u9965\u997f\u6e38\u620f", "BLITZ SG", "MEGA WALLS", "\u8d85\u7ea7\u6218\u5899", "\u4e22\u9505\u5927\u6218"}) {
            if (!a4.contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3056() {
        Iterator iterator;
        Scoreboard a = Class281.Field1525.theWorld.getScoreboard();
        Class91[] a2 = Class281.Method3073();
        ScoreObjective a3 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Collection a4 = a.getSortedScores(a3);
        if (a4.Method1799() > 15) {
            a4 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a4, (int)(a4.Method1799() - 15)));
        }
        if ((iterator = a4.Method1383()).Method932()) {
            Score a5 = (Score)iterator.Method933();
            ScorePlayerTeam a6 = a.getPlayersTeam(a5.getPlayerName());
            String a7 = Class281.Method3066(ScorePlayerTeam.formatPlayerName((Team)a6, (String)a5.getPlayerName()));
            if ((a7.contains((CharSequence)"Game ends in") || a7.contains((CharSequence)"\u6e38\u620f\u7ed3\u675f\u5012\u8ba1\u65f6")) && Class281.Method3059()) {
                return true;
            }
        }
        return false;
    }

    public static boolean Method3057() {
        Iterator iterator;
        Scoreboard a = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a2 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Class91[] a3 = Class281.Method3073();
        Collection a4 = a.getSortedScores(a2);
        if (a4.Method1799() > 15) {
            a4 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a4, (int)(a4.Method1799() - 15)));
        }
        if ((iterator = a4.Method1383()).Method932()) {
            Score a5 = (Score)iterator.Method933();
            ScorePlayerTeam a6 = a.getPlayersTeam(a5.getPlayerName());
            String a7 = Class281.Method3066(ScorePlayerTeam.formatPlayerName((Team)a6, (String)a5.getPlayerName()));
            if ((a7.contains((CharSequence)"Deathmatch in") || a7.contains((CharSequence)"\u6b7b\u4ea1\u7ade\u8d5b\u5012\u8ba1\u65f6")) && Class281.Method3059()) {
                return true;
            }
        }
        if (Class91.Method3648() == null) {
            Class281.Method3072(new Class91[3]);
        }
        return false;
    }

    public static boolean Method3058() {
        String[] a;
        Scoreboard a2 = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a3 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a4 = Class281.Method3066(a3.getDisplayName());
        for (String a5 : a = new String[]{"MEGA WALLS", "\u8d85\u7ea7\u6218\u5899"}) {
            if (!a4.contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3059() {
        String[] a;
        ScoreObjective a2 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a3 = Class281.Method3066(a2.getDisplayName());
        for (String a4 : a = new String[]{"HYPIXEL UHC", "UHC", "UHC CHAMPIONS", "\u6781\u9650\u751f\u5b58\u51a0\u519b", "\u6781\u9650\u751f\u5b58"}) {
            if (!a3.contains((CharSequence)a4)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3060() {
        Iterator iterator;
        Scoreboard a = Class281.Field1525.theWorld.getScoreboard();
        Class91[] a2 = Class281.Method3073();
        ScoreObjective a3 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Collection a4 = a.getSortedScores(a3);
        if (a4.Method1799() > 15) {
            a4 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a4, (int)(a4.Method1799() - 15)));
        }
        if ((iterator = a4.Method1383()).Method932()) {
            Score a5 = (Score)iterator.Method933();
            ScorePlayerTeam a6 = a.getPlayersTeam(a5.getPlayerName());
            String a7 = Class281.Method3066(ScorePlayerTeam.formatPlayerName((Team)a6, (String)a5.getPlayerName()));
            if (a7.contains((CharSequence)"\u5f00\u59cb") || a7.contains((CharSequence)"\u5012\u8ba1\u65f6") || a7.contains((CharSequence)"\u5f00\u542f") || a7.contains((CharSequence)"Starting") || a7.contains((CharSequence)"Open")) {
                return true;
            }
            Class91.Method3647(new String[4]);
        }
        return false;
    }

    public static boolean Method3061() {
        String[] a;
        ScoreObjective a2 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        String a3 = Class281.Method3066(a2.getDisplayName());
        for (String a4 : a = new String[]{"MURDER MYSTERY", "\u5bc6\u5ba4\u6740\u624b"}) {
            if (!a3.contains((CharSequence)a4)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3062() {
        Scoreboard a = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a2 = Class281.Field1525.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
        Collection a3 = a.getSortedScores(a2);
        if (a3.Method1799() > 15) {
            a3 = Lists.newArrayList((Iterable)Iterables.skip((Iterable)a3, (int)(a3.Method1799() - 15)));
        }
        Iterator iterator = a3.Method1383();
        while (iterator.Method932()) {
            Score a4 = (Score)iterator.Method933();
            ScorePlayerTeam a5 = a.getPlayersTeam(a4.getPlayerName());
            String a6 = Class281.Method3065(Class281.Method3066(ScorePlayerTeam.formatPlayerName((Team)a5, (String)a4.getPlayerName())));
            if (!a6.contains((CharSequence)"Dragons Nest")) continue;
            return true;
        }
        return false;
    }

    public static boolean Method3063() {
        boolean a = false;
        Scoreboard a2 = Class281.Field1525.theWorld.getScoreboard();
        ScoreObjective a3 = a2.getObjectiveInDisplaySlot(1);
        ArrayList a4 = new ArrayList(a2.getSortedScores(a3));
        int a5 = a4.Method1799() - 1;
        while (true) {
            Score a6 = (Score)a4.get(a5);
            ScorePlayerTeam a7 = a2.getPlayersTeam(a6.getPlayerName());
            String a8 = ScorePlayerTeam.formatPlayerName((Team)a7, (String)a6.getPlayerName());
            String a9 = Class281.Method3067(a8 = Class281.Method3068(a8));
            if (a9.contains((CharSequence)"Cleared:") && a9.contains((CharSequence)"%")) {
                a = true;
            }
            --a5;
        }
    }

    public static boolean Method3064() {
        return Class567.Field2643.equals((Object)Class667.SB) && Class281.Method3063();
    }

    public static String Method3065(String a) {
        return Pattern.compile((String)"[^a-z A-Z]").matcher((CharSequence)a).replaceAll("");
    }

    public static String Method3066(String a) {
        return Field1527.matcher((CharSequence)a).replaceAll("");
    }

    public static String Method3067(String a) {
        return a.replaceAll("(?i)\\u00A7.", "");
    }

    public static String Method3068(String a) {
        StringBuilder a2 = new StringBuilder();
        char a3 = 'r';
        boolean a4 = false;
        for (char a5 : a.toCharArray()) {
            if (a5 > '\uc350') continue;
            if (a5 == '\u00a7') {
                a4 = true;
                continue;
            }
            if (a3 != a5) {
                a2.append('\u00a7');
                a2.append(a5);
                a3 = a5;
            }
            a4 = false;
        }
        return a2.toString();
    }

    public static void Method3069() {
        if (Field1526 == null) {
            return;
        }
        Field1525.displayGuiScreen((GuiScreen)new GuiConnecting((GuiScreen)new GuiMultiplayer((GuiScreen)new GuiMainMenu()), Field1525, Field1526));
    }

    public static String Method3070() {
        String a = "Singleplayer";
        if (Class281.Field1525.theWorld.isRemote) {
            ServerData a2 = Field1525.getCurrentServerData();
            a = a2.serverIP;
        }
        return a;
    }

    public static boolean Method3071(String a) {
        return Class281.Field1525.getCurrentServerData().serverIP.contains((CharSequence)a);
    }

    static {
        Class281.Method3072(null);
        Field1525 = Wrapper.INSTANCE.Method2868();
        Field1527 = Pattern.compile((String)"(?i)\u00a7[0-9A-FK-OR]");
    }

    public static void Method3072(Class91[] class91Array) {
        Field1528 = class91Array;
    }

    public static Class91[] Method3073() {
        return Field1528;
    }
}