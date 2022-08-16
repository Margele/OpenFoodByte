/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.scoreboard.ScorePlayerTeam
 *  net.minecraft.scoreboard.Team
 */
package awsl;

import awsl.Class307;
import awsl.Class309;
import awsl.Class606;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
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
        Iterator iterator;
        boolean a2 = Class305.Method710();
        if (a instanceof EntityPlayer && (iterator = Field1584.Method1383()).Method932()) {
            Object a3 = iterator.Method933();
            Class309 a4 = (Class309)a3;
            if (a4.Method748().equalsIgnoreCase(a.getName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean Method698(String a) {
        if (GlobalModule.Field3177.getValue()) {
            Iterator iterator = Field1584.Method1383();
            while (iterator.Method932()) {
                Object a2 = iterator.Method933();
                Class309 a3 = (Class309)a2;
                if (!a3.Method748().equalsIgnoreCase(a)) continue;
                return true;
            }
        }
        return false;
    }

    public static Class309 Method699(String a) {
        Iterator iterator = Field1584.Method1383();
        while (iterator.Method932()) {
            Object a2 = iterator.Method933();
            Class309 a3 = (Class309)a2;
            if (!a3.Method748().equalsIgnoreCase(a)) continue;
            return a3;
        }
        return null;
    }

    public static boolean Method700(Entity a) {
        Iterator iterator;
        boolean a2 = Class305.Method711();
        if (a instanceof EntityPlayer && (iterator = Field1585.Method1383()).Method932()) {
            Object a3 = iterator.Method933();
            Class307 a4 = (Class307)a3;
            if (a4.Method744().equalsIgnoreCase(a.getName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean Method701(String a) {
        Iterator iterator = Field1585.Method1383();
        while (iterator.Method932()) {
            Object a2 = iterator.Method933();
            Class307 a3 = (Class307)a2;
            if (!a3.Method744().equalsIgnoreCase(a)) continue;
            return true;
        }
        return false;
    }

    public static Class307 Method702(String a) {
        Iterator iterator = Field1585.Method1383();
        while (iterator.Method932()) {
            Object a2 = iterator.Method933();
            Class307 a3 = (Class307)a2;
            if (!a3.Method744().equalsIgnoreCase(a)) continue;
            return a3;
        }
        return null;
    }

    public static boolean Method703(EntityPlayer a) {
        return GlobalModule.Field3142.getValue() && (Minecraft.getMinecraft().thePlayer.getTeam().Method3429((Object)a.getTeam()) || Minecraft.getMinecraft().thePlayer.getDisplayName().getFormattedText().startsWith("\u00a7") && a.getDisplayName().getFormattedText().startsWith("\u00a7") && Minecraft.getMinecraft().thePlayer.getDisplayName().getFormattedText().substring(0, 2).equals((Object)a.getDisplayName().getFormattedText().substring(0, 2)));
    }

    public static boolean Method704(Entity a) {
        if (a instanceof EntityPlayer) {
            return Class305.Method706(a);
        }
        return false;
    }

    public static boolean Method705(Entity a) {
        Iterator iterator;
        boolean a2 = Class305.Method711();
        if (GlobalModule.INSTANCE.Field3186.Field2827.Method3740() >= 5) {
            return false;
        }
        if (!GlobalModule.INSTANCE.Field3186.Field2823.isEmpty() && (iterator = GlobalModule.INSTANCE.Field3186.Field2823.Method1383()).Method932()) {
            Class606 a3 = (Class606)iterator.Method933();
            if (a.getName().equals((Object)a3.Field2841)) {
                return a3.Field2848;
            }
        }
        return false;
    }

    public static boolean Method706(Entity a) {
        if (GlobalModule.Field3142.getValue() && ((EntityPlayer)a).getTeam() != null) {
            if (Minecraft.getMinecraft().thePlayer.getDisplayName().getUnformattedText().startsWith("\u00a7")) {
                if (Minecraft.getMinecraft().thePlayer.getDisplayName().getUnformattedText().length() <= 2 || a.getDisplayName().getUnformattedText().length() <= 2) {
                    return false;
                }
                return Minecraft.getMinecraft().thePlayer.getDisplayName().getUnformattedText().substring(0, 2).equals((Object)a.getDisplayName().getUnformattedText().substring(0, 2));
            }
            if (!Class305.Method708().equals((Object)"NULL")) {
                if (Class305.Method708().length() <= 2 || a.getDisplayName().getUnformattedText().length() <= 2) {
                    return false;
                }
                return Class305.Method708().substring(0, 2).equals((Object)a.getDisplayName().getUnformattedText().substring(0, 2));
            }
        }
        return false;
    }

    public static int Method707(Entity a) {
        String a2;
        ScorePlayerTeam a3;
        int a4 = 0xFFFFFF;
        if (a instanceof EntityPlayer && (a3 = (ScorePlayerTeam)((EntityPlayer)a).getTeam()) != null && (a2 = FontRenderer.getFormatFromString((String)a3.getColorPrefix())).length() >= 2) {
            if (!"0123456789abcdef".contains((CharSequence)String.valueOf((char)a2.charAt(1)))) {
                return a4;
            }
            a4 = Minecraft.getMinecraft().fontRendererObj.getColorCode(a2.charAt(1));
        }
        return a4;
    }

    public static String Method708() {
        NetworkPlayerInfo a2 = Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().getSession().getProfile().getId());
        boolean a3 = Class305.Method710();
        if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
            return a2.getDisplayName() != null ? a2.getDisplayName().getFormattedText() : ScorePlayerTeam.formatPlayerName((Team)a2.getPlayerTeam(), (String)a2.getGameProfile().getName());
        }
        a.trash(new String[5]);
        return "NULL";
    }

    static {
        Class305.Method709(false);
        Field1584 = new ArrayList();
        Field1585 = new ArrayList();
    }

    public static void Method709(boolean bl) {
        Field1586 = bl;
    }

    public static boolean Method710() {
        return Field1586;
    }

    public static boolean Method711() {
        boolean bl = Class305.Method710();
        return true;
    }
}