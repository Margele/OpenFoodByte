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
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ModeValue;

public class AntiBot
extends Module {
    public static List botList = new ArrayList();
    public static List botList2 = new ArrayList();
    TimeHelper timer2 = new TimeHelper();
    public ModeValue mode = new ModeValue("AntiBot", "Mode", "Hypixel", new String[]{"Hypixel", "TabList"}, "\u53cd\u673a\u5668\u4eba\u6a21\u5f0f");
    public BooleanValue remove = new BooleanValue("Antibot", "Remove", (Boolean)true, "\u5220\u9664bot\u5b9e\u4f53");
    public BooleanValue info = new BooleanValue("Antibot", "Info", (Boolean)true, "\u804a\u5929\u6846\u63d0\u793abot\u68c0\u6d4b");
    public TimeHelper timer = new TimeHelper();

    public AntiBot() {
        super("AntiBot", "Anti Bot", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u53cd\u673a\u5668\u4eba";
    }

    @Override
    public void onDisable() {
        if (!botList.isEmpty()) {
            botList.clear();
        }
        super.onDisable();
    }

    @EventTarget(value=0)
    public void onUpdate(EventUpdate event) {
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
                        this.setDisplayTag(this.mode.getMode());
                        boolean a7 = this.remove.getBooleanValue();
                        a[] a8 = b.trash();
                        if (!botList2.isEmpty() && this.timer2.isDelayComplete(1000.0)) {
                            if (this.info.getValue()) {
                                if (botList2.Method1799() == 1) {
                                    ChatUtils.addChatMessage(" Kill " + botList2.Method1799() + " Watchdog !!!");
                                }
                                ChatUtils.addChatMessage(" Kill " + botList2.Method1799() + " Bots!");
                            }
                            this.timer2.reset();
                            botList2.clear();
                        }
                        if (!botList.isEmpty() && this.timer.isDelayComplete(1000.0)) {
                            botList.clear();
                            this.timer.reset();
                        }
                        if (!this.mode.isCurrentMode("Hypixel") || !(iterator = AntiBot.mc.theWorld.getLoadedEntityList().Method1383()).Method932()) break block23;
                        a4 = iterator.Method933();
                        if (!(a4 instanceof EntityPlayer) || (a3 = (EntityPlayer)a4) == AntiBot.mc.thePlayer || botList.contains((Object)a3)) break block23;
                        a2 = a3.getDisplayName().getFormattedText();
                        a6 = a3.getCustomNameTag();
                        a5 = a3.getName();
                        if (a3.isInvisible() && a2.startsWith("\u00a7r\u00a7c") && a2.endsWith("\u00a7r")) {
                            List a9;
                            double a10 = Math.abs((double)(a3.posX - AntiBot.mc.thePlayer.posX));
                            double a11 = Math.abs((double)(a3.posY - AntiBot.mc.thePlayer.posY));
                            double a12 = Math.abs((double)(a3.posZ - AntiBot.mc.thePlayer.posZ));
                            double a13 = Math.sqrt((double)(a10 * a10 + a12 * a12));
                            if (a11 < 13.0 && a11 > 10.0 && a13 < 3.0 && !(a9 = this.getTabPlayer()).contains((Object)a3)) {
                                this.timer2.reset();
                                botList2.Method2530((Object)a3);
                                AntiBot.mc.theWorld.removeEntity((Entity)a3);
                                botList.Method2530((Object)a3);
                            }
                        }
                        if (ServerUtils.isSinglePlayer(Servers.PRE) && a3.isInvisible() && a2.startsWith("\u00a7r") && a3.getHealth() < 20.0f) {
                            this.timer2.reset();
                            botList2.Method2530((Object)a3);
                            AntiBot.mc.theWorld.removeEntity((Entity)a3);
                            botList.Method2530((Object)a3);
                        }
                        if (a2.startsWith("\u00a7r\u00a7") || !a2.endsWith("\u00a7r") || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()) != null && mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() <= 20 && mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() != 0) break block24;
                        if (ServerUtils.isSinglePlayer(Servers.UHC)) break block25;
                        if (ServerUtils.isCleared() && a3.getEyeHeight() <= 0.2f) {
                            botList.Method2530((Object)a3);
                        }
                        if (ServerUtils.isCleared()) break block23;
                        botList.Method2530((Object)a3);
                    }
                    if (AntiBot.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE) break block23;
                    botList.Method2530((Object)a3);
                }
                if (ServerUtils.isSinglePlayer(Servers.MM) && a2.startsWith("\u00a7r\u00a7") && a2.endsWith("\u00a7r") && a3.getEyeHeight() <= 0.2f && Objects.isNull((Object)mc.getNetHandler().getPlayerInfo(a3.getUniqueID()))) {
                    botList.Method2530((Object)a3);
                }
                if (a3.isInvisible() && a2.startsWith("\u00a7r\u00a7c") && a2.endsWith("\u00a7r") && (Objects.isNull((Object)mc.getNetHandler().getPlayerInfo(a3.getUniqueID())) || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() == 0)) {
                    this.timer2.reset();
                    botList2.Method2530((Object)a3);
                    AntiBot.mc.theWorld.removeEntity((Entity)a3);
                    botList.Method2530((Object)a3);
                }
                if (a3.isInvisible() && a5.startsWith("\u00a7c") && (Objects.isNull((Object)mc.getNetHandler().getPlayerInfo(a3.getUniqueID())) || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() == 0)) {
                    this.timer2.reset();
                    botList2.Method2530((Object)a3);
                    AntiBot.mc.theWorld.removeEntity((Entity)a3);
                    botList.Method2530((Object)a3);
                }
                if (a2.contains((CharSequence)"[NPC]")) {
                    botList.Method2530((Object)a3);
                }
                if (a2.contains((CharSequence)"\u00a7c") || a6.equalsIgnoreCase("")) break block26;
                if (ServerUtils.isSinglePlayer(Servers.SB)) break block23;
                botList.Method2530((Object)a3);
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
                    botList.Method2530((Object)a3);
                }
            }
        }
        if (this.mode.isCurrentMode("MineLand")) {
            iterator = AntiBot.mc.theWorld.getLoadedEntityList().Method1383();
            while (iterator.Method932()) {
                a4 = (Entity)iterator.Method933();
                if (a4 == AntiBot.mc.thePlayer) continue;
                if (a4 instanceof EntityPlayer && !botList.contains((Object)(a3 = (EntityPlayer)a4))) {
                    a2 = a3.getDisplayName().getFormattedText();
                    if (a3.isSprinting()) {
                        ChatUtils.debug(a4.getEntityId() + "");
                        ChatUtils.debug(((Entity)a4).ticksExisted + "");
                        ChatUtils.debug(mc.getNetHandler().getPlayerInfo(a3.getUniqueID()).getResponseTime() + "");
                        if (this.info.getValue()) {
                            ChatUtils.addChatMessage(" Add " + a4.getDisplayName().getFormattedText() + " Bot");
                        }
                        botList.Method2530((Object)a3);
                    }
                }
                break;
            }
        }
    }

    @EventTarget
    public void onUpdate2(EventUpdate e) {
        if (this.mode.isCurrentMode("Hypixel2")) {
            this.setDisplayTag("Hypixel2");
            Iterator iterator = AntiBot.mc.theWorld.getLoadedEntityList().Method1383();
            while (iterator.Method932()) {
                Entity a2 = (Entity)iterator.Method933();
                if (a2 == AntiBot.mc.thePlayer || !(a2 instanceof EntityPlayer) || mc.getNetHandler().getPlayerInfo(a2.getUniqueID()).getResponseTime() <= 20) continue;
                if (this.info.getValue()) {
                    ChatUtils.addChatMessage(" Kill " + a2.getDisplayName().getFormattedText() + " Bot");
                }
                AntiBot.mc.theWorld.removeEntity(a2);
            }
        }
    }

    public List getTabPlayer() {
        Collection a2 = AntiBot.mc.thePlayer.sendQueue.getPlayerInfoMap();
        ArrayList a3 = new ArrayList();
        Iterator iterator = a2.Method1383();
        while (iterator.Method932()) {
            NetworkPlayerInfo a4 = (NetworkPlayerInfo)iterator.Method933();
            a3.Method2530((Object)AntiBot.mc.theWorld.getPlayerEntityByName(a4.getGameProfile().getName()));
        }
        return a3;
    }
}