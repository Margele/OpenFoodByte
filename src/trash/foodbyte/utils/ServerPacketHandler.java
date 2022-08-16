/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.network.login.server.S02PacketLoginSuccess
 *  net.minecraft.network.play.client.C02PacketUseEntity
 *  net.minecraft.network.play.client.C02PacketUseEntity$Action
 *  net.minecraft.network.play.client.C17PacketCustomPayload
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.network.play.server.S3DPacketDisplayScoreboard
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.internal.FMLProxyPacket
 */
package trash.foodbyte.utils;

import awsl.Class305;
import awsl.Class352;
import awsl.Class372;
import awsl.Class379;
import awsl.Class606;
import eventapi.EventManager;
import eventapi.EventTarget;
import io.netty.buffer.Unpooled;
import java.math.BigDecimal;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.render.Inventory;
import trash.foodbyte.module.impl.render.Radar;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.Servers;

public class ServerPacketHandler {
    Minecraft mc = Wrapper.INSTANCE.getMinecraft();
    public static Servers currentServer = Servers.NONE;
    private int Field2644 = 0;

    public ServerPacketHandler() {
        EventManager.register(this);
        Class372.Method405(this);
    }

    @EventTarget
    public void Method1257(EventTick a2) {
        Iterator iterator = Class352.Field1690.Method1383();
        while (iterator.Method932()) {
            Class379 a3 = (Class379)iterator.Method933();
            if ("Radar".equals((Object)a3.Field1813)) {
                if (((Radar)ModuleManager.getModule2(Radar.class)).getState() && a3.Field1826) {
                    a3.Method462();
                } else if (!((Radar)ModuleManager.getModule2(Radar.class)).getState() && !a3.Field1826) {
                    a3.Method461();
                }
            }
            if (!"PlayerInventory".equals((Object)a3.Field1813)) continue;
            if (((Inventory)ModuleManager.getModule2(Inventory.class)).getState() && a3.Field1826) {
                a3.Method462();
                continue;
            }
            if (((Inventory)ModuleManager.getModule2(Inventory.class)).getState() || a3.Field1826) continue;
            a3.Method461();
        }
    }

    @EventTarget
    public void Method1258(EventRender3D a2) {
    }

    @EventTarget
    public void onPacket(EventPacket event) {
        String a2;
        C02PacketUseEntity a3;
        String[] a4 = EventPacket.trash();
        if (event.isSend()) {
            if (GlobalModule.Field3140.getValue() && !this.mc.isSingleplayer()) {
                if (event.getPacket() instanceof FMLProxyPacket) {
                    a3 = (FMLProxyPacket)event.getPacket();
                    event.setCancelled(true);
                }
                if (event.getPacket() instanceof C17PacketCustomPayload && (a3 = (C17PacketCustomPayload)event.getPacket()).getChannelName().equalsIgnoreCase("MC|Brand")) {
                    event.setCancelled(true);
                    Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C17PacketCustomPayload("MC|Brand", new PacketBuffer(Unpooled.buffer()).writeString("vanilla")));
                }
            }
            if (event.getPacket() instanceof C02PacketUseEntity && (a3 = (C02PacketUseEntity)event.getPacket()).getAction() == C02PacketUseEntity.Action.INTERACT && a3.getEntityFromWorld((World)this.mc.theWorld) instanceof EntityHorse && this.mc.thePlayer.getHeldItem() == null) {
                a2 = (EntityHorse)a3.getEntityFromWorld((World)this.mc.theWorld);
                double a5 = a2.getHorseJumpStrength();
                double a6 = a2.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue();
                ChatUtils.addChatMessage("Horse JumpStrength = \u00a7c" + new BigDecimal(a5).setScale(2, 4).doubleValue() + " \u00a77- \u00a7fSpeed = \u00a7c" + new BigDecimal(a6).setScale(2, 4).doubleValue());
            }
            if (event.getPacket() instanceof C02PacketUseEntity && (a3 = (C02PacketUseEntity)event.getPacket()).getAction() == C02PacketUseEntity.Action.ATTACK && a3.getEntityFromWorld((World)this.mc.theWorld) instanceof EntityPlayer) {
                a2 = (EntityPlayer)a3.getEntityFromWorld((World)this.mc.theWorld);
                if (Class305.Method705((Entity)a2) && ServerPacketHandler.Method1260((Entity)a2)) {
                    event.setCancelled(true);
                }
                if (ServerPacketHandler.Method1261((Entity)a2) && a2.isSneaking() && this.mc.thePlayer.getHeldItem() != null) {
                    event.setCancelled(true);
                }
            }
        }
        if (event.isRecieve()) {
            if (event.getPacket() instanceof S07PacketRespawn || event.getPacket() instanceof S02PacketLoginSuccess) {
                if (this.mc.isSingleplayer() && !currentServer.equals((Object)Servers.NONE)) {
                    currentServer = Servers.NONE;
                }
                GlobalModule.INSTANCE.Field3186.Field2826.Method216(86399500);
                if (!GlobalModule.INSTANCE.Field3186.Field2823.isEmpty()) {
                    GlobalModule.INSTANCE.Field3186.Field2823.forEach(ServerPacketHandler::Method1262);
                }
            }
            if (event.getPacket() instanceof S3DPacketDisplayScoreboard) {
                a3 = (S3DPacketDisplayScoreboard)event.getPacket();
                a2 = a3.func_149370_d();
                int a7 = a3.func_149371_c();
                if (a7 == 1) {
                    ChatUtils.debug("\u8ba1\u5206\u677f:" + a2);
                    if (a2.equalsIgnoreCase("SBScoreboard")) {
                        currentServer = Servers.SB;
                    }
                    if (a2.equalsIgnoreCase("Mw")) {
                        currentServer = Servers.MW;
                    }
                    if (a2.equalsIgnoreCase("\u00a7e\u00a7lHYPIXEL")) {
                        currentServer = Servers.UHC;
                    }
                    if (a2.equalsIgnoreCase("SForeboard")) {
                        currentServer = Servers.SW;
                    }
                    if (a2.equalsIgnoreCase("BForeboard")) {
                        currentServer = Servers.BW;
                    }
                    if (a2.equalsIgnoreCase("PreScoreboard")) {
                        currentServer = Servers.PRE;
                    }
                    if (a2.equalsIgnoreCase("Duels")) {
                        currentServer = Servers.DUELS;
                    }
                    if (a2.equalsIgnoreCase("Pit")) {
                        currentServer = Servers.PIT;
                    }
                    if (a2.equalsIgnoreCase("Blitz SG")) {
                        currentServer = Servers.SG;
                    }
                    if (a2.equalsIgnoreCase("MurderMystery")) {
                        currentServer = Servers.MM;
                    }
                    currentServer = Servers.NONE;
                    GlobalModule.INSTANCE.Field3186.Field2826.Method216(86399500);
                }
                ChatUtils.debug("\u5f53\u524d\u6a21\u5f0f:" + currentServer.name());
            }
        }
    }

    public static boolean Method1260(Entity a2) {
        if (!GlobalModule.INSTANCE.Field3186.Field2823.isEmpty()) {
            Iterator iterator = GlobalModule.INSTANCE.Field3186.Field2823.Method1383();
            while (iterator.Method932()) {
                Class606 a3 = (Class606)iterator.Method933();
                if (!a2.getName().equals((Object)a3.Field2841)) continue;
                return a3.Method3740() >= 5;
            }
        }
        return false;
    }

    public static boolean Method1261(Entity a2) {
        if (GlobalModule.INSTANCE.Field3186.Field2827.Method3740() >= 5) {
            return false;
        }
        if (!GlobalModule.INSTANCE.Field3186.Field2823.isEmpty()) {
            Iterator iterator = GlobalModule.INSTANCE.Field3186.Field2823.Method1383();
            while (iterator.Method932()) {
                Class606 a3 = (Class606)iterator.Method933();
                if (!a2.getName().equals((Object)a3.Field2841)) continue;
                if (a3.Field2848) {
                    ++a3.Field2852;
                    if (a3.Field2852 >= 100) {
                        return false;
                    }
                }
                return a3.Field2848;
            }
        }
        return false;
    }

    private static void Method1262(Class606 a2) {
        a2.Field2852 = 0;
    }
}