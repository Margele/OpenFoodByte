/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayDeque
 *  java.util.Deque
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Queue
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.ThreadLocalRandom
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.entity.Entity
 *  net.minecraft.inventory.Container
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C00PacketKeepAlive
 *  net.minecraft.network.play.client.C03PacketPlayer
 *  net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition
 *  net.minecraft.network.play.client.C03PacketPlayer$C05PacketPlayerLook
 *  net.minecraft.network.play.client.C03PacketPlayer$C06PacketPlayerPosLook
 *  net.minecraft.network.play.client.C0BPacketEntityAction
 *  net.minecraft.network.play.client.C0BPacketEntityAction$Action
 *  net.minecraft.network.play.client.C0CPacketInput
 *  net.minecraft.network.play.client.C0FPacketConfirmTransaction
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.network.play.server.S08PacketPlayerPosLook
 *  net.minecraft.network.play.server.S32PacketConfirmTransaction
 *  net.minecraft.util.Vec3
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 */
package trash.foodbyte.module.impl.world;

import awsl.Class345;
import awsl.Class448;
import awsl.Class451;
import awsl.Class634;
import awsl.Class725;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.Container;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.network.play.server.S32PacketConfirmTransaction;
import net.minecraft.util.Vec3;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.DelayedPacket;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.utils.TimeHelperForDisabler;
import trash.foodbyte.utils.Wrapper;
import trash.foodbyte.value.ModeValue;

public class Disabler
extends Module {
    public ModeValue mode = new ModeValue("Disabler", "Mode", "Fucker", new String[]{"Fucker", "Watchdog", "Watchdog2", "Hypixel", "HypixelGG", "HypixelNew"});
    private final Deque deque = new ArrayDeque();
    private final TimeHelperForDisabler timer1 = new TimeHelperForDisabler(this);
    private final TimeHelperForDisabler timer2 = new TimeHelperForDisabler(this);
    public final List packetList = new CopyOnWriteArrayList();
    private final TimeHelperForDisabler timer3 = new TimeHelperForDisabler(this);
    private long ticks;
    private long Field2337;
    private final Queue queue = new ConcurrentLinkedQueue();
    private Vec3 Field2339;
    private final List packetList2 = new CopyOnWriteArrayList();
    private int Field2341;
    private int Field2342;
    private final ConcurrentLinkedQueue queue2 = new ConcurrentLinkedQueue();
    public static ConcurrentLinkedQueue queue3 = new ConcurrentLinkedQueue();
    public static boolean Field2345;
    private long Field2346;
    private int Field2347;
    private long delay;
    private boolean Field2349;
    private boolean Field2350;
    private short Field2351;
    public int Field2352 = 0;
    public double Field2353;
    public double Field2354;
    public double Field2355;
    private static Vec3 Field2356;
    private TimeHelper Field2357 = new TimeHelper();
    private boolean Field2358;
    public static boolean Field2359;

    public Disabler() {
        super("Disabler", Category.WORLD);
        this.setHideModule(true);
        this.setDescription("\u7ed5\u8fc7\u53cd\u4f5c\u5f0a\u4f7f\u7528\u66b4\u529b\u529f\u80fd");
    }

    @Override
    public boolean canUse() {
        return GlobalModule.INSTANCE.Field3186 == null || !PermissionManager.canUseModule("disabler");
    }

    @EventTarget
    public void Method232(Class634 event) {
        this.setDisplayTag(this.mode.getMode());
        if (this.mode.isCurrentMode("HypixelNew") && this.timer3.isDelayComplete(Disabler.mc.thePlayer.ticksExisted < 100 ? 2500L : 450L)) {
            while (!this.deque.isEmpty()) {
                Wrapper.INSTANCE.sendPacketNoEvent(DelayedPacket.getPacket((DelayedPacket)this.deque.removeLast()));
            }
            this.timer3.reset();
        }
        if (this.mode.isCurrentMode("Watchdog")) {
            if (Disabler.mc.thePlayer.ticksExisted == 80 && !this.Field2350) {
                Disabler.mc.thePlayer.ticksExisted = 0;
                this.Field2350 = true;
            }
            if (this.timer3.isDelayComplete(120L)) {
                while (!this.queue2.isEmpty()) {
                    Wrapper.INSTANCE.sendPacketNoEvent((Packet)this.queue2.poll());
                }
                this.timer3.reset();
            }
            if (Disabler.mc.thePlayer != null && Disabler.mc.thePlayer.ticksExisted == 7) {
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)Disabler.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SPRINTING));
            }
        }
        if (this.mode.isCurrentMode("Watchdog2")) {
            if (this.timer3.isDelayComplete(120L)) {
                while (!this.queue2.isEmpty()) {
                    Wrapper.INSTANCE.sendPacketNoEvent((Packet)this.queue2.poll());
                }
                this.timer3.reset();
            }
            if (Disabler.mc.thePlayer != null && Disabler.mc.thePlayer.ticksExisted == 7) {
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)Disabler.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SPRINTING));
            }
        }
    }

    @EventTarget
    public void Method273(EventPacket event) {
        block47: {
            C03PacketPlayer a;
            block48: {
                boolean a2;
                Class91[] a3 = Class448.Method2461();
                if (!event.isSend()) break block47;
                if (this.mode.isCurrentMode("Watchdog")) {
                    if (Disabler.mc.thePlayer.ticksExisted == 60) {
                        mc.displayGuiScreen(null);
                    }
                    if (event.getPacket() instanceof C03PacketPlayer && Disabler.mc.thePlayer.ticksExisted < 70) {
                        event.setCancelled(true);
                    }
                    if (event.getPacket() instanceof C0BPacketEntityAction) {
                        event.setCancelled(true);
                    }
                    a2 = false;
                    try {
                        a2 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedClasses.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (!event.isCancelled() && (event.getPacket() instanceof C03PacketPlayer || event.getPacket() instanceof C0FPacketConfirmTransaction || event.getPacket() instanceof C00PacketKeepAlive)) {
                        event.setCancelled(true);
                        this.queue2.add((Object)event.getPacket());
                    }
                    if (event.getPacket() instanceof C03PacketPlayer) {
                        a = (C03PacketPlayer)event.getPacket();
                        if (!Disabler.mc.thePlayer.isUsingItem() && !a.isMoving()) {
                            event.setCancelled(true);
                        }
                    }
                    if (event.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook) {
                        a = (C03PacketPlayer.C05PacketPlayerLook)event.getPacket();
                        if (!Disabler.mc.thePlayer.onGround) {
                            event.setCancelled(true);
                            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a.getPositionX(), a.getPositionY(), a.getPositionZ(), false));
                        }
                    }
                    if (event.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
                        a = (C03PacketPlayer.C06PacketPlayerPosLook)event.getPacket();
                        if (!Disabler.mc.thePlayer.onGround) {
                            // empty if block
                        }
                    }
                    if (Disabler.mc.thePlayer.ticksExisted % 4 == 0) {
                        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0CPacketInput());
                    }
                }
                if (this.mode.isCurrentMode("Watchdog2")) {
                    if (event.getPacket() instanceof C03PacketPlayer && Disabler.mc.thePlayer.ticksExisted < 80) {
                        event.setCancelled(true);
                    }
                    if (event.getPacket() instanceof C03PacketPlayer) {
                        C03PacketPlayer a4 = (C03PacketPlayer)event.getPacket();
                        if (!Disabler.mc.thePlayer.isUsingItem() && !a4.isMoving()) {
                            event.setCancelled(true);
                        }
                    }
                    if (event.getPacket() instanceof C0BPacketEntityAction) {
                        event.setCancelled(true);
                    }
                    a2 = false;
                    try {
                        a2 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedClasses.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
                    }
                    catch (Exception a5) {
                        // empty catch block
                    }
                    if (!event.isCancelled() && (event.getPacket() instanceof C03PacketPlayer || event.getPacket() instanceof C0FPacketConfirmTransaction || event.getPacket() instanceof C00PacketKeepAlive)) {
                        event.setCancelled(true);
                        this.queue2.add((Object)event.getPacket());
                    }
                }
                if (!this.mode.isCurrentMode("HypixelNew")) break block48;
                if (event.getPacket() instanceof C03PacketPlayer && !(event.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition) && !(event.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook) && !(event.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook)) {
                    C03PacketPlayer a6 = (C03PacketPlayer)event.getPacket();
                    event.setCancelled(!a6.isMoving() && !a6.getRotating() && !Disabler.mc.thePlayer.isUsingItem() || Disabler.mc.thePlayer.ticksExisted < 120);
                    if (Disabler.mc.thePlayer.ticksExisted < 120) {
                        this.deque.push((Object)new DelayedPacket(this, (Packet)a6));
                    }
                }
                if (Disabler.mc.thePlayer.ticksExisted <= 70) break block47;
                if (event.getPacket() instanceof C00PacketKeepAlive) {
                    ++this.ticks;
                    if (this.ticks % 5L == 0L) {
                        event.setCancelled(true);
                        this.deque.push((Object)new DelayedPacket(this, event.getPacket()));
                    }
                }
                if (!(event.getPacket() instanceof C0FPacketConfirmTransaction)) break block47;
                this.deque.push((Object)new DelayedPacket(this, event.getPacket()));
                event.setCancelled(true);
            }
            if (this.mode.isCurrentMode("Hypixel")) {
                Packet a7 = event.getPacket();
                if (a7 instanceof C03PacketPlayer) {
                    if (Disabler.mc.thePlayer.ticksExisted < 100) {
                        event.setCancelled(true);
                    }
                    if (this.timer3.isDelayComplete(this.delay) && !this.queue2.isEmpty()) {
                        Wrapper.INSTANCE.sendPacketNoEvent((Packet)this.queue2.poll());
                        this.delay = Math.round((float)MathUtils.Method555(50L, 150L));
                        this.timer3.reset();
                    }
                }
                if (a7 instanceof C03PacketPlayer && !Disabler.mc.thePlayer.isSwingInProgress && !Disabler.mc.thePlayer.isUsingItem() && !((C03PacketPlayer)a7).isMoving()) {
                    event.setCancelled(true);
                }
                if (a7 instanceof C0FPacketConfirmTransaction || a7 instanceof C00PacketKeepAlive) {
                    if (Disabler.mc.thePlayer.ticksExisted >= 100) {
                        this.queue2.add((Object)a7);
                    }
                    event.setCancelled(true);
                }
                if (a7 instanceof C0BPacketEntityAction) {
                    a = (C0BPacketEntityAction)a7;
                    if (a.getAction().equals((Object)C0BPacketEntityAction.Action.START_SPRINTING)) {
                        boolean a8 = false;
                        try {
                            a8 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.getClass(), (String[])new String[]{ObfuscatedClasses.serverSprintState.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)Disabler.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SPRINTING));
                        Class345.Method337(Disabler.mc.thePlayer, ObfuscatedClasses.serverSprintState.getObfuscatedName(), true, false);
                        event.setCancelled(true);
                    }
                    if (a.getAction().equals((Object)C0BPacketEntityAction.Action.STOP_SPRINTING)) {
                        event.setCancelled(true);
                    }
                }
            }
        }
        if (event.isRecieve()) {
            if (this.mode.isCurrentMode("HypixelNew") && event.getPacket() instanceof S07PacketRespawn) {
                this.deque.clear();
                this.timer3.reset();
                this.deque.clear();
                this.ticks = 0L;
                this.packetList2.clear();
                this.packetList.clear();
                this.queue2.clear();
                this.delay = 0L;
            }
            if (this.mode.isCurrentMode("Watchdog") && event.getPacket() instanceof S08PacketPlayerPosLook) {
                S08PacketPlayerPosLook a = (S08PacketPlayerPosLook)event.getPacket();
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a.getX(), a.getY(), a.getZ(), false));
                Disabler.mc.thePlayer.setPosition(a.getX(), a.getY(), a.getZ());
                mc.displayGuiScreen(null);
                event.setCancelled(true);
            }
            if (this.mode.isCurrentMode("Watchdog2") && event.getPacket() instanceof S08PacketPlayerPosLook) {
                S08PacketPlayerPosLook a = (S08PacketPlayerPosLook)event.getPacket();
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a.getX(), a.getY(), a.getZ(), false));
                Disabler.mc.thePlayer.motionZ = 0.0;
                Disabler.mc.thePlayer.motionY = 0.0;
                Disabler.mc.thePlayer.motionX = 0.0;
                Disabler.mc.thePlayer.setPosition(a.getX(), a.getY(), a.getZ());
                Disabler.mc.thePlayer.prevPosX = Disabler.mc.thePlayer.posX;
                Disabler.mc.thePlayer.prevPosY = Disabler.mc.thePlayer.posY;
                Disabler.mc.thePlayer.prevPosZ = Disabler.mc.thePlayer.posZ;
                mc.displayGuiScreen(null);
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void Method1537(EventPacket a) {
        block7: {
            if (!this.mode.isCurrentMode("HypixelGG")) {
                return;
            }
            if (!a.isRecieve() || !(a.getPacket() instanceof S08PacketPlayerPosLook)) break block7;
            S08PacketPlayerPosLook a2 = (S08PacketPlayerPosLook)a.getPacket();
            EntityPlayerSP a3 = Disabler.mc.thePlayer;
            C03PacketPlayer.C06PacketPlayerPosLook a4 = new C03PacketPlayer.C06PacketPlayerPosLook(a3.posX, a3.posY, a3.posZ, a3.rotationYaw, a3.rotationPitch, false);
            double a5 = a2.getX();
            double a6 = a2.getY();
            double a7 = a2.getZ();
            float a8 = a2.getYaw();
            float a9 = a2.getPitch();
            boolean a10 = false;
            try {
                a10 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedClasses.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (this.mode.isCurrentMode("HypixelNew")) {
                this.packetList2.Method2530((Object)new Class451(a5, a6, a7, null));
                if (this.packetList2.Method1799() > 0 && Disabler.mc.thePlayer.ticksExisted < 120) {
                    for (int a11 = 0; a11 < 10; ++a11) {
                        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a5, a6 + 1.0E-6, a7, false));
                    }
                    Wrapper.INSTANCE.sendPacketNoEvent((Packet)a4);
                    if (Disabler.mc.thePlayer.getDistance(a5, a6, a7) <= 8.0) {
                        a.setCancelled(true);
                    }
                }
            }
        }
    }

    @EventTarget
    public void Method1538(EventPacket a) {
        block5: {
            if (!this.mode.isCurrentMode("HypixelGG")) {
                return;
            }
            if (!a.isRecieve() || !(a.getPacket() instanceof S32PacketConfirmTransaction) || !(Disabler.mc.currentScreen instanceof GuiInventory)) break block5;
            S32PacketConfirmTransaction a2 = (S32PacketConfirmTransaction)a.getPacket();
            GuiContainer a3 = (GuiContainer)Disabler.mc.currentScreen;
            if (a2.getWindowId() == a3.inventorySlots.windowId && a2.getActionNumber() > 0) {
                this.Field2351 = a2.getActionNumber();
                short a4 = 0;
                try {
                    a4 = ReflectionHelper.findField(Container.class, (String[])new String[]{ObfuscatedClasses.transactionID.getObfuscatedName()}).getShort((Object)a3.inventorySlots);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (this.Field2351 < a4) {
                    Class345.Method337(a3.inventorySlots, ObfuscatedClasses.transactionID.getObfuscatedName(), (short)(this.Field2351 + 1), false);
                }
            }
        }
    }

    public boolean Method713() {
        String[] a = new String[]{"CLICK TO PLAY", "\u70b9\u51fb\u5f00\u59cb\u6e38\u620f"};
        Iterator iterator = Disabler.mc.theWorld.loadedEntityList.Method1383();
        while (iterator.Method932()) {
            Entity a2 = (Entity)iterator.Method933();
            if (!a2.getName().startsWith("\u00a7e\u00a7l")) continue;
            for (String a3 : a) {
                if (!a2.getName().equals((Object)("\u00a7e\u00a7l" + a3))) continue;
                return true;
            }
        }
        return false;
    }

    @EventTarget
    public void Method1539(EventPacket a) {
        block15: {
            S08PacketPlayerPosLook a2;
            Class91[] a3 = Class448.Method2461();
            if (a.isSend()) {
                if ((a.getPacket() instanceof C03PacketPlayer || a.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition || a.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) && Disabler.mc.thePlayer.ticksExisted < 60) {
                    a.setCancelled(true);
                }
                if (a.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
                    a2 = (C03PacketPlayer.C06PacketPlayerPosLook)a.getPacket();
                    if (this.Field2352 > 0 && a2.getPositionX() == this.Field2353 && a2.getPositionY() == this.Field2354 && a2.getPositionZ() == this.Field2355) {
                        mc.getNetHandler().addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a2.getPositionX(), a2.getPositionY(), a2.getPositionZ(), a2.isOnGround()));
                        a.setCancelled(true);
                    }
                    ++this.Field2352;
                    if (a.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook && Disabler.mc.thePlayer.isRiding()) {
                        mc.getNetHandler().addToSendQueue((Packet)new C0BPacketEntityAction((Entity)Disabler.mc.thePlayer, C0BPacketEntityAction.Action.START_SPRINTING));
                    }
                    if (a.getPacket() instanceof C0CPacketInput && Disabler.mc.thePlayer.isRiding()) {
                        mc.getNetHandler().addToSendQueue(a.getPacket());
                        mc.getNetHandler().addToSendQueue((Packet)new C0BPacketEntityAction((Entity)Disabler.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SNEAKING));
                        a.setCancelled(true);
                    }
                }
                a2 = a.getPacket();
                this.Method1540(a);
                if (a2 instanceof C03PacketPlayer) {
                    C03PacketPlayer a4 = (C03PacketPlayer)a2;
                    boolean a5 = false;
                    try {
                        a5 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedClasses.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (Disabler.mc.thePlayer.ticksExisted == 1) {
                        Field2356 = new Vec3(a4.getPositionX() + Disabler.Method763(-1000000.0, 1000000.0), a4.getPositionY() + Disabler.Method763(-1000000.0, 1000000.0), a4.getPositionZ() + Disabler.Method763(-1000000.0, 1000000.0));
                    }
                    if (Field2356 != null && Disabler.mc.thePlayer.ticksExisted < 100) {
                        Class345.Method337(a4, ObfuscatedClasses.C03X.getObfuscatedName(), (short)Disabler.Field2356.xCoord, false);
                        Class345.Method337(a4, ObfuscatedClasses.C03Y.getObfuscatedName(), (short)Disabler.Field2356.yCoord, false);
                        Class345.Method337(a4, ObfuscatedClasses.C03Z.getObfuscatedName(), (short)Disabler.Field2356.zCoord, false);
                    }
                }
            }
            if (!a.isRecieve()) break block15;
            if (a.getPacket() instanceof S08PacketPlayerPosLook) {
                a2 = (S08PacketPlayerPosLook)a.getPacket();
                this.Field2353 = a2.getX();
                this.Field2354 = a2.getY();
                this.Field2355 = a2.getZ();
            }
            if (a.getPacket() instanceof S07PacketRespawn) {
                this.Field2352 = 0;
            }
            if (a.getPacket() instanceof S08PacketPlayerPosLook) {
                a2 = (S08PacketPlayerPosLook)a.getPacket();
                ChatUtils.debug("S08: " + a2.getX() + " " + a2.getY() + " " + a2.getZ());
                if (!Field2359 && Disabler.mc.thePlayer.ticksExisted > 20) {
                    a.setCancelled(true);
                }
            }
        }
    }

    private void Method1540(EventPacket a) {
        if (a.getPacket() instanceof C03PacketPlayer) {
            C03PacketPlayer a2 = (C03PacketPlayer)a.getPacket();
            if (!a2.isMoving() && !Disabler.mc.thePlayer.isUsingItem()) {
                a.setCancelled(true);
            }
            if (this.Field2358 && this.Field2357.Method219(400.0)) {
                this.queue2.forEach(Wrapper.INSTANCE::sendPacketNoEvent);
                this.queue2.clear();
                this.Field2358 = false;
            }
        }
    }

    public static double Method763(double a, double a2) {
        if (a == a2) {
            return a;
        }
        if (a > a2) {
            double a3 = a;
            a = a2;
            a2 = a3;
        }
        return ThreadLocalRandom.current().nextDouble(a, a2);
    }

    @Override
    public void onEnable() {
        this.Field2350 = false;
        this.deque.clear();
        this.Field2349 = false;
        this.timer3.reset();
        this.packetList.clear();
        this.queue2.clear();
        this.delay = 0L;
        this.packetList2.clear();
        this.ticks = 0L;
        this.Field2342 = 0;
        this.Field2341 = 0;
    }

    @Override
    public void Method279() {
        this.Field2350 = false;
        this.deque.clear();
        this.Field2349 = false;
        this.timer3.reset();
        this.packetList.clear();
        this.queue2.clear();
        this.delay = 0L;
        this.packetList2.clear();
        this.ticks = 0L;
        this.Field2342 = 0;
        this.Field2341 = 0;
        Field2345 = false;
        ReflectionUtils.setTimerSpeed(1.0f);
    }

    @EventTarget
    public void Method752(EventMotion a) {
        if (mc.isIntegratedServerRunning()) {
            return;
        }
        if (a.isPre() && this.mode.isCurrentMode("Fucker")) {
            Field2345 = true;
            Iterator iterator = queue3.iterator();
            while (iterator.Method932()) {
                Class725 a2 = (Class725)iterator.Method933();
                if (System.currentTimeMillis() <= a2.Method1996() + this.Field2346) continue;
                Wrapper.INSTANCE.sendPacketNoEvent(a2.Method1995());
                queue3.remove((Object)a2);
                this.Field2346 = Math.round((double)MathUtils.getRandomDouble(200.0, 250.0));
            }
        }
    }

    @EventTarget
    public void Method1186(EventPacket a) {
        if (mc.isIntegratedServerRunning()) {
            return;
        }
        if (a.isSend()) {
            Packet a2 = a.getPacket();
            if (this.mode.isCurrentMode("Fucker")) {
                C03PacketPlayer a3;
                boolean a4 = false;
                try {
                    a4 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedClasses.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (a2 instanceof C03PacketPlayer && (a3 = (C03PacketPlayer)a2) instanceof C03PacketPlayer.C06PacketPlayerPosLook && this.Field2347 <= 50) {
                    a.setPacket((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a3.getPositionX() + Double.MIN_NORMAL, a3.getPositionY(), a3.getPositionZ() - Double.MIN_NORMAL, ((C03PacketPlayer.C06PacketPlayerPosLook)a3).isOnGround()));
                }
                ++this.Field2347;
                if (Disabler.mc.thePlayer != null) {
                }
                queue3.clear();
                return;
            }
        } else if (a.isRecieve()) {
            Packet a5 = a.getPacket();
            if (this.mode.isCurrentMode("Fucker") && a5 instanceof S08PacketPlayerPosLook) {
                if (Disabler.mc.thePlayer.ticksExisted < 100) {
                    a.setCancelled(true);
                }
                this.Field2347 = 0;
                this.delay = 0L;
            }
        }
    }

    private static void Method1541(Class725 a) {
        Wrapper.INSTANCE.sendPacketNoEvent(a.Method1995());
    }

    private static void Method1542(Class725 a) {
        Wrapper.INSTANCE.sendPacketNoEvent(a.Method1995());
    }

    private static Exception Method263(Exception exception) {
        return exception;
    }
}