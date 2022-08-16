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

import awsl.Class448;
import awsl.Class451;
import awsl.Class725;
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
import obfuscate.a;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.ReflectionsHelper;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.DelayedPacket;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.utils.TimeHelperForDisabler;
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
    public void Method232(EventUpdate event) {
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
            C03PacketPlayer a2;
            block48: {
                boolean a3;
                a[] a4 = Class448.Method2461();
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
                    a3 = false;
                    try {
                        a3 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (!event.isCancelled() && (event.getPacket() instanceof C03PacketPlayer || event.getPacket() instanceof C0FPacketConfirmTransaction || event.getPacket() instanceof C00PacketKeepAlive)) {
                        event.setCancelled(true);
                        this.queue2.add((Object)event.getPacket());
                    }
                    if (event.getPacket() instanceof C03PacketPlayer) {
                        a2 = (C03PacketPlayer)event.getPacket();
                        if (!Disabler.mc.thePlayer.isUsingItem() && !a2.isMoving()) {
                            event.setCancelled(true);
                        }
                    }
                    if (event.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook) {
                        a2 = (C03PacketPlayer.C05PacketPlayerLook)event.getPacket();
                        if (!Disabler.mc.thePlayer.onGround) {
                            event.setCancelled(true);
                            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a2.getPositionX(), a2.getPositionY(), a2.getPositionZ(), false));
                        }
                    }
                    if (event.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
                        a2 = (C03PacketPlayer.C06PacketPlayerPosLook)event.getPacket();
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
                        C03PacketPlayer a5 = (C03PacketPlayer)event.getPacket();
                        if (!Disabler.mc.thePlayer.isUsingItem() && !a5.isMoving()) {
                            event.setCancelled(true);
                        }
                    }
                    if (event.getPacket() instanceof C0BPacketEntityAction) {
                        event.setCancelled(true);
                    }
                    a3 = false;
                    try {
                        a3 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
                    }
                    catch (Exception a6) {
                        // empty catch block
                    }
                    if (!event.isCancelled() && (event.getPacket() instanceof C03PacketPlayer || event.getPacket() instanceof C0FPacketConfirmTransaction || event.getPacket() instanceof C00PacketKeepAlive)) {
                        event.setCancelled(true);
                        this.queue2.add((Object)event.getPacket());
                    }
                }
                if (!this.mode.isCurrentMode("HypixelNew")) break block48;
                if (event.getPacket() instanceof C03PacketPlayer && !(event.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition) && !(event.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook) && !(event.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook)) {
                    C03PacketPlayer a7 = (C03PacketPlayer)event.getPacket();
                    event.setCancelled(!a7.isMoving() && !a7.getRotating() && !Disabler.mc.thePlayer.isUsingItem() || Disabler.mc.thePlayer.ticksExisted < 120);
                    if (Disabler.mc.thePlayer.ticksExisted < 120) {
                        this.deque.push((Object)new DelayedPacket(this, (Packet)a7));
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
                Packet a8 = event.getPacket();
                if (a8 instanceof C03PacketPlayer) {
                    if (Disabler.mc.thePlayer.ticksExisted < 100) {
                        event.setCancelled(true);
                    }
                    if (this.timer3.isDelayComplete(this.delay) && !this.queue2.isEmpty()) {
                        Wrapper.INSTANCE.sendPacketNoEvent((Packet)this.queue2.poll());
                        this.delay = Math.round((float)MathUtils.getRandomLong(50L, 150L));
                        this.timer3.reset();
                    }
                }
                if (a8 instanceof C03PacketPlayer && !Disabler.mc.thePlayer.isSwingInProgress && !Disabler.mc.thePlayer.isUsingItem() && !((C03PacketPlayer)a8).isMoving()) {
                    event.setCancelled(true);
                }
                if (a8 instanceof C0FPacketConfirmTransaction || a8 instanceof C00PacketKeepAlive) {
                    if (Disabler.mc.thePlayer.ticksExisted >= 100) {
                        this.queue2.add((Object)a8);
                    }
                    event.setCancelled(true);
                }
                if (a8 instanceof C0BPacketEntityAction) {
                    a2 = (C0BPacketEntityAction)a8;
                    if (a2.getAction().equals((Object)C0BPacketEntityAction.Action.START_SPRINTING)) {
                        boolean a9 = false;
                        try {
                            a9 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.getClass(), (String[])new String[]{ObfuscatedField.serverSprintState.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)Disabler.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SPRINTING));
                        ReflectionsHelper.setFinalField(Disabler.mc.thePlayer, ObfuscatedField.serverSprintState.getObfuscatedName(), true, false);
                        event.setCancelled(true);
                    }
                    if (a2.getAction().equals((Object)C0BPacketEntityAction.Action.STOP_SPRINTING)) {
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
                S08PacketPlayerPosLook a10 = (S08PacketPlayerPosLook)event.getPacket();
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a10.getX(), a10.getY(), a10.getZ(), false));
                Disabler.mc.thePlayer.setPosition(a10.getX(), a10.getY(), a10.getZ());
                mc.displayGuiScreen(null);
                event.setCancelled(true);
            }
            if (this.mode.isCurrentMode("Watchdog2") && event.getPacket() instanceof S08PacketPlayerPosLook) {
                S08PacketPlayerPosLook a11 = (S08PacketPlayerPosLook)event.getPacket();
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a11.getX(), a11.getY(), a11.getZ(), false));
                Disabler.mc.thePlayer.motionZ = 0.0;
                Disabler.mc.thePlayer.motionY = 0.0;
                Disabler.mc.thePlayer.motionX = 0.0;
                Disabler.mc.thePlayer.setPosition(a11.getX(), a11.getY(), a11.getZ());
                Disabler.mc.thePlayer.prevPosX = Disabler.mc.thePlayer.posX;
                Disabler.mc.thePlayer.prevPosY = Disabler.mc.thePlayer.posY;
                Disabler.mc.thePlayer.prevPosZ = Disabler.mc.thePlayer.posZ;
                mc.displayGuiScreen(null);
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void Method1537(EventPacket a2) {
        block7: {
            if (!this.mode.isCurrentMode("HypixelGG")) {
                return;
            }
            if (!a2.isRecieve() || !(a2.getPacket() instanceof S08PacketPlayerPosLook)) break block7;
            S08PacketPlayerPosLook a3 = (S08PacketPlayerPosLook)a2.getPacket();
            EntityPlayerSP a4 = Disabler.mc.thePlayer;
            C03PacketPlayer.C06PacketPlayerPosLook a5 = new C03PacketPlayer.C06PacketPlayerPosLook(a4.posX, a4.posY, a4.posZ, a4.rotationYaw, a4.rotationPitch, false);
            double a6 = a3.getX();
            double a7 = a3.getY();
            double a8 = a3.getZ();
            float a9 = a3.getYaw();
            float a10 = a3.getPitch();
            boolean a11 = false;
            try {
                a11 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (this.mode.isCurrentMode("HypixelNew")) {
                this.packetList2.Method2530((Object)new Class451(a6, a7, a8, null));
                if (this.packetList2.Method1799() > 0 && Disabler.mc.thePlayer.ticksExisted < 120) {
                    for (int a12 = 0; a12 < 10; ++a12) {
                        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a6, a7 + 1.0E-6, a8, false));
                    }
                    Wrapper.INSTANCE.sendPacketNoEvent((Packet)a5);
                    if (Disabler.mc.thePlayer.getDistance(a6, a7, a8) <= 8.0) {
                        a2.setCancelled(true);
                    }
                }
            }
        }
    }

    @EventTarget
    public void Method1538(EventPacket a2) {
        block5: {
            if (!this.mode.isCurrentMode("HypixelGG")) {
                return;
            }
            if (!a2.isRecieve() || !(a2.getPacket() instanceof S32PacketConfirmTransaction) || !(Disabler.mc.currentScreen instanceof GuiInventory)) break block5;
            S32PacketConfirmTransaction a3 = (S32PacketConfirmTransaction)a2.getPacket();
            GuiContainer a4 = (GuiContainer)Disabler.mc.currentScreen;
            if (a3.getWindowId() == a4.inventorySlots.windowId && a3.getActionNumber() > 0) {
                this.Field2351 = a3.getActionNumber();
                short a5 = 0;
                try {
                    a5 = ReflectionHelper.findField(Container.class, (String[])new String[]{ObfuscatedField.transactionID.getObfuscatedName()}).getShort((Object)a4.inventorySlots);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (this.Field2351 < a5) {
                    ReflectionsHelper.setFinalField(a4.inventorySlots, ObfuscatedField.transactionID.getObfuscatedName(), (short)(this.Field2351 + 1), false);
                }
            }
        }
    }

    public boolean Method713() {
        String[] a2 = new String[]{"CLICK TO PLAY", "\u70b9\u51fb\u5f00\u59cb\u6e38\u620f"};
        Iterator iterator = Disabler.mc.theWorld.loadedEntityList.Method1383();
        while (iterator.Method932()) {
            Entity a3 = (Entity)iterator.Method933();
            if (!a3.getName().startsWith("\u00a7e\u00a7l")) continue;
            for (String a4 : a2) {
                if (!a3.getName().equals((Object)("\u00a7e\u00a7l" + a4))) continue;
                return true;
            }
        }
        return false;
    }

    @EventTarget
    public void Method1539(EventPacket a2) {
        block15: {
            S08PacketPlayerPosLook a3;
            a[] a4 = Class448.Method2461();
            if (a2.isSend()) {
                if ((a2.getPacket() instanceof C03PacketPlayer || a2.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition || a2.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) && Disabler.mc.thePlayer.ticksExisted < 60) {
                    a2.setCancelled(true);
                }
                if (a2.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
                    a3 = (C03PacketPlayer.C06PacketPlayerPosLook)a2.getPacket();
                    if (this.Field2352 > 0 && a3.getPositionX() == this.Field2353 && a3.getPositionY() == this.Field2354 && a3.getPositionZ() == this.Field2355) {
                        mc.getNetHandler().addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a3.getPositionX(), a3.getPositionY(), a3.getPositionZ(), a3.isOnGround()));
                        a2.setCancelled(true);
                    }
                    ++this.Field2352;
                    if (a2.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook && Disabler.mc.thePlayer.isRiding()) {
                        mc.getNetHandler().addToSendQueue((Packet)new C0BPacketEntityAction((Entity)Disabler.mc.thePlayer, C0BPacketEntityAction.Action.START_SPRINTING));
                    }
                    if (a2.getPacket() instanceof C0CPacketInput && Disabler.mc.thePlayer.isRiding()) {
                        mc.getNetHandler().addToSendQueue(a2.getPacket());
                        mc.getNetHandler().addToSendQueue((Packet)new C0BPacketEntityAction((Entity)Disabler.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SNEAKING));
                        a2.setCancelled(true);
                    }
                }
                a3 = a2.getPacket();
                this.Method1540(a2);
                if (a3 instanceof C03PacketPlayer) {
                    C03PacketPlayer a5 = (C03PacketPlayer)a3;
                    boolean a6 = false;
                    try {
                        a6 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (Disabler.mc.thePlayer.ticksExisted == 1) {
                        Field2356 = new Vec3(a5.getPositionX() + Disabler.Method763(-1000000.0, 1000000.0), a5.getPositionY() + Disabler.Method763(-1000000.0, 1000000.0), a5.getPositionZ() + Disabler.Method763(-1000000.0, 1000000.0));
                    }
                    if (Field2356 != null && Disabler.mc.thePlayer.ticksExisted < 100) {
                        ReflectionsHelper.setFinalField(a5, ObfuscatedField.C03X.getObfuscatedName(), (short)Disabler.Field2356.xCoord, false);
                        ReflectionsHelper.setFinalField(a5, ObfuscatedField.C03Y.getObfuscatedName(), (short)Disabler.Field2356.yCoord, false);
                        ReflectionsHelper.setFinalField(a5, ObfuscatedField.C03Z.getObfuscatedName(), (short)Disabler.Field2356.zCoord, false);
                    }
                }
            }
            if (!a2.isRecieve()) break block15;
            if (a2.getPacket() instanceof S08PacketPlayerPosLook) {
                a3 = (S08PacketPlayerPosLook)a2.getPacket();
                this.Field2353 = a3.getX();
                this.Field2354 = a3.getY();
                this.Field2355 = a3.getZ();
            }
            if (a2.getPacket() instanceof S07PacketRespawn) {
                this.Field2352 = 0;
            }
            if (a2.getPacket() instanceof S08PacketPlayerPosLook) {
                a3 = (S08PacketPlayerPosLook)a2.getPacket();
                ChatUtils.debug("S08: " + a3.getX() + " " + a3.getY() + " " + a3.getZ());
                if (!Field2359 && Disabler.mc.thePlayer.ticksExisted > 20) {
                    a2.setCancelled(true);
                }
            }
        }
    }

    private void Method1540(EventPacket a2) {
        if (a2.getPacket() instanceof C03PacketPlayer) {
            C03PacketPlayer a3 = (C03PacketPlayer)a2.getPacket();
            if (!a3.isMoving() && !Disabler.mc.thePlayer.isUsingItem()) {
                a2.setCancelled(true);
            }
            if (this.Field2358 && this.Field2357.isDelayComplete(400.0)) {
                this.queue2.forEach(Wrapper.INSTANCE::sendPacketNoEvent);
                this.queue2.clear();
                this.Field2358 = false;
            }
        }
    }

    public static double Method763(double a2, double a3) {
        if (a2 == a3) {
            return a2;
        }
        if (a2 > a3) {
            double a4 = a2;
            a2 = a3;
            a3 = a4;
        }
        return ThreadLocalRandom.current().nextDouble(a2, a3);
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
    public void onDisable() {
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
    public void Method752(EventMotion a2) {
        if (mc.isIntegratedServerRunning()) {
            return;
        }
        if (a2.isPre() && this.mode.isCurrentMode("Fucker")) {
            Field2345 = true;
            Iterator iterator = queue3.iterator();
            while (iterator.Method932()) {
                Class725 a3 = (Class725)iterator.Method933();
                if (System.currentTimeMillis() <= a3.Method1996() + this.Field2346) continue;
                Wrapper.INSTANCE.sendPacketNoEvent(a3.Method1995());
                queue3.remove((Object)a3);
                this.Field2346 = Math.round((double)MathUtils.getRandomDouble(200.0, 250.0));
            }
        }
    }

    @EventTarget
    public void Method1186(EventPacket a2) {
        if (mc.isIntegratedServerRunning()) {
            return;
        }
        if (a2.isSend()) {
            Packet a3 = a2.getPacket();
            if (this.mode.isCurrentMode("Fucker")) {
                C03PacketPlayer a4;
                boolean a5 = false;
                try {
                    a5 = ReflectionHelper.findField((Class)Disabler.mc.thePlayer.sendQueue.getClass(), (String[])new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean((Object)Disabler.mc.thePlayer.sendQueue);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (a3 instanceof C03PacketPlayer && (a4 = (C03PacketPlayer)a3) instanceof C03PacketPlayer.C06PacketPlayerPosLook && this.Field2347 <= 50) {
                    a2.setPacket((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a4.getPositionX() + Double.MIN_NORMAL, a4.getPositionY(), a4.getPositionZ() - Double.MIN_NORMAL, ((C03PacketPlayer.C06PacketPlayerPosLook)a4).isOnGround()));
                }
                ++this.Field2347;
                if (Disabler.mc.thePlayer != null) {
                }
                queue3.clear();
                return;
            }
        } else if (a2.isRecieve()) {
            Packet a6 = a2.getPacket();
            if (this.mode.isCurrentMode("Fucker") && a6 instanceof S08PacketPlayerPosLook) {
                if (Disabler.mc.thePlayer.ticksExisted < 100) {
                    a2.setCancelled(true);
                }
                this.Field2347 = 0;
                this.delay = 0L;
            }
        }
    }

    private static void Method1541(Class725 a2) {
        Wrapper.INSTANCE.sendPacketNoEvent(a2.Method1995());
    }

    private static void Method1542(Class725 a2) {
        Wrapper.INSTANCE.sendPacketNoEvent(a2.Method1995());
    }

    private static Exception Method263(Exception exception) {
        return exception;
    }
}