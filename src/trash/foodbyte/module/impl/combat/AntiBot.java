/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.WorldSettings$GameType
 */
package trash.foodbyte.module.impl.combat;

import awsl.Class281;
import awsl.Class46;
import awsl.Class634;
import awsl.Class667;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.WorldSettings;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ModeValue;

public class AntiBot
extends Module {
    public static List Field2577 = new ArrayList();
    public static List Field2578 = new ArrayList();
    TimeHelper Field2579 = new TimeHelper();
    public ModeValue Field2580 = new ModeValue("AntiBot", "Mode", "Hypixel", new String[]{"Hypixel", "TabList"}, "\u53cd\u673a\u5668\u4eba\u6a21\u5f0f");
    public BooleanValue Field2581 = new BooleanValue("Antibot", "Remove", (Boolean)true, "\u5220\u9664bot\u5b9e\u4f53");
    public BooleanValue Field2582 = new BooleanValue("Antibot", "Info", (Boolean)true, "\u804a\u5929\u6846\u63d0\u793abot\u68c0\u6d4b");
    public TimeHelper Field2583 = new TimeHelper();

    public AntiBot() {
        super("AntiBot", "Anti Bot", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u53cd\u673a\u5668\u4eba";
    }

    @Override
    public void Method279() {
        if (!Field2577.isEmpty()) {
            Field2577.clear();
        }
        super.Method279();
    }

    @EventTarget(value=0)
    public void Method232(Class634 a) {
        String a2;
        EntityPlayer a3;
        Object a4;
        Iterator iterator;
        block23: {
            String a5;
            block26: {
                String a6;
                block24: {
                    block25: {
                        this.setDisplayTag(this.Field2580.getMode());
                        boolean a7 = this.Field2581.Method2509();
                        Class91[] a8 = Class46.Method3239();
                        if (!Field2578.isEmpty() && this.Field2579.Method219(1000.0)) {
                            if (this.Field2582.getValue()) {
                                if (Field2578.Method1799() == 1) {
                                    ChatUtils.addChatMessage(" Kill " + Field2578.Method1799() + " Watchdog !!!");
                                }
                                ChatUtils.addChatMessage(" Kill " + Field2578.Method1799() + " Bots!");
                            }
                            this.Field2579.Method214();
                            Field2578.clear();
                        }
                        if (!Field2577.isEmpty() && this.Field2583.Method219(1000.0)) {
                            Field2577.clear();
                            this.Field2583.Method214();
                        }
                        if (!this.Field2580.isCurrentMode("Hypixel") || !(iterator = AntiBot.mc.theWorld.getLoadedEntityList().Method1383()).Method932()) break block23;
                        a4 = iterator.Method933();
                        if (!(a4 instanceof EntityPlayer) || (a3 = (EntityPlayer)a4) == AntiBot.mc.thePlayer || Field2577.contains((Object)a3)) break block23;
                        a2 = a3.getDisplayName().getFormattedText();
                        a6 = a3.getCustomNameTag();
                        a5 = a3.getName();
                        if (a3.isInvisible() && a2.startsWith("\u00a7r\u00a7c") && a2.endsWith("\u00a7r")) {
                            List a9;
                            double a10 = Math.abs((double)(a3.posX - AntiBot.mc.thePlayer.posX));
                            double a11 = Math.abs((double)(a3.posY - AntiBot.mc.thePlayer.posY));
                            double a12 = Math.abs((double)(a3.posZ - AntiBot.mc.thePlayer.posZ));
                            double a13 = Math.sqrt((double)(a10 * a10 + a12 * a12));
                            if (a11 < 13.0 && a11 > 10.0 && a13 < 3.0 && !(a9 = this.Method231()).contains((Object)a3)) {
                                this.Field2579.Method214();
                                Field2578.Method2530((Object)a3);
                                AntiBot.mc.theWorld.removeEntity((Entity)a3);
                                Field2577.Method2530((Object)a3);
                            }
                        }
                        if (Class281.Method3049(Class667.PRE) && a3.isInvisible() && a2.startsWith("\u00a7r") && a3.getHealth() < 20.0f) {
                            this.Field2579.Method214();
                            Field2578.Method2530((Object)a3);
                            AntiBot.mc.theWorld.removeEntity((Entity)a3);
                            Field2577.Method2530((Object)a3);
                        }
                        if (a2.startsWith("\u00a7r\u00a7") || !a2.endsWith("\u00a7r") || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()) != null && mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() <= 20 && mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() != 0) break block24;
                        if (Class281.Method3049(Class667.UHC)) break block25;
                        if (Class281.Method3063() && a3.getEyeHeight() <= 0.2f) {
                            Field2577.Method2530((Object)a3);
                        }
                        if (Class281.Method3063()) break block23;
                        Field2577.Method2530((Object)a3);
                    }
                    if (AntiBot.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE) break block23;
                    Field2577.Method2530((Object)a3);
                }
                if (Class281.Method3049(Class667.MM) && a2.startsWith("\u00a7r\u00a7") && a2.endsWith("\u00a7r") && a3.getEyeHeight() <= 0.2f && Objects.isNull((Object)mc.getNetHandler().getPlayerInfo(a3.getUniqueID()))) {
                    Field2577.Method2530((Object)a3);
                }
                if (a3.isInvisible() && a2.startsWith("\u00a7r\u00a7c") && a2.endsWith("\u00a7r") && (Objects.isNull((Object)mc.getNetHandler().getPlayerInfo(a3.getUniqueID())) || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() == 0)) {
                    this.Field2579.Method214();
                    Field2578.Method2530((Object)a3);
                    AntiBot.mc.theWorld.removeEntity((Entity)a3);
                    Field2577.Method2530((Object)a3);
                }
                if (a3.isInvisible() && a5.startsWith("\u00a7c") && (Objects.isNull((Object)mc.getNetHandler().getPlayerInfo(a3.getUniqueID())) || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() == 0)) {
                    this.Field2579.Method214();
                    Field2578.Method2530((Object)a3);
                    AntiBot.mc.theWorld.removeEntity((Entity)a3);
                    Field2577.Method2530((Object)a3);
                }
                if (a2.contains((CharSequence)"[NPC]")) {
                    Field2577.Method2530((Object)a3);
                }
                if (a2.contains((CharSequence)"\u00a7c") || a6.equalsIgnoreCase("")) break block26;
                if (Class281.Method3049(Class667.SB)) break block23;
                Field2577.Method2530((Object)a3);
            }
            if (!a3.isInvisible() && a2.startsWith("\u00a7r\u00a7c") && a2.endsWith("\u00a7r") && mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() > 20) {
                ChatUtils.debug("\u540d\u5b57: " + a5);
                ChatUtils.debug("\u5168\u540d: " + a2);
                ChatUtils.debug("\u9690\u8eab: " + a3.isInvisible());
                ChatUtils.debug("\u8ddd\u79bb: " + AntiBot.mc.thePlayer.getDistanceToEntity((Entity)a3));
                ChatUtils.debug("ResponseTime:" + mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime());
                if (a3.posY > AntiBot.mc.thePlayer.posY && (double)AntiBot.mc.thePlayer.getDistanceToEntity((Entity)a3) <= 6.0 && !a2.startsWith("\u00a7r\u00a7c[\u00a7fYOUTUBE\u00a7c]") && !a2.startsWith("\u00a7r\u00a7c[ADMIN]")) {
                    ChatUtils.addChatMessage("\u68c0\u6d4b " + a2 + " - GameMaster Bot!");
                    AntiBot.mc.theWorld.removeEntity((Entity)a3);
                    ChatUtils.addChatMessage("\u5df2\u6e05\u9664Bot!");
                    Field2577.Method2530((Object)a3);
                }
            }
        }
        if (this.Field2580.isCurrentMode("MineLand")) {
            iterator = AntiBot.mc.theWorld.getLoadedEntityList().Method1383();
            while (iterator.Method932()) {
                a4 = (Entity)iterator.Method933();
                if (a4 == AntiBot.mc.thePlayer) continue;
                if (a4 instanceof EntityPlayer && !Field2577.contains((Object)(a3 = (EntityPlayer)a4))) {
                    a2 = a3.getDisplayName().getFormattedText();
                    if (a3.isSprinting()) {
                        ChatUtils.debug(a4.getEntityId() + "");
                        ChatUtils.debug(((Entity)a4).ticksExisted + "");
                        ChatUtils.debug(mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() + "");
                        if (this.Field2582.getValue()) {
                            ChatUtils.addChatMessage(" Add " + a4.getDisplayName().getFormattedText() + " Bot");
                        }
                        Field2577.Method2530((Object)a3);
                    }
                }
                break;
            }
        }
    }

    @EventTarget
    public void Method803(Class634 a) {
        if (this.Field2580.isCurrentMode("Hypixel2")) {
            this.setDisplayTag("Hypixel2");
            Iterator iterator = AntiBot.mc.theWorld.getLoadedEntityList().Method1383();
            while (iterator.Method932()) {
                Entity a2 = (Entity)iterator.Method933();
                if (a2 == AntiBot.mc.thePlayer || !(a2 instanceof EntityPlayer) || mc.getNetHandler().getPlayerInfo(a2.getUniqueID()).getResponseTime() <= 20) continue;
                if (this.Field2582.getValue()) {
                    ChatUtils.addChatMessage(" Kill " + a2.getDisplayName().getFormattedText() + " Bot");
                }
                AntiBot.mc.theWorld.removeEntity(a2);
            }
        }
    }

    public List Method231() {
        Collection a = AntiBot.mc.thePlayer.sendQueue.getPlayerInfoMap();
        ArrayList a2 = new ArrayList();
        Iterator iterator = a.Method1383();
        while (iterator.Method932()) {
            NetworkPlayerInfo a3 = (NetworkPlayerInfo)iterator.Method933();
            a2.Method2530((Object)AntiBot.mc.theWorld.getPlayerEntityByName(a3.getGameProfile().getName()));
        }
        return a2;
    }
}