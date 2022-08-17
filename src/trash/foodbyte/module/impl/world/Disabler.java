package trash.foodbyte.module.impl.world;

import awsl.Class448;
import awsl.Class451;
import awsl.Class491;
import eventapi.EventTarget;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C0BPacketEntityAction.Action;
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
import trash.foodbyte.utils.DelayedPacket2;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.utils.TimeHelperForDisabler;
import trash.foodbyte.value.ModeValue;

public class Disabler extends Module {
   public ModeValue mode = new ModeValue("Disabler", "Mode", "Fucker", new String[]{"Fucker", "Watchdog", "Watchdog2", "Hypixel", "HypixelGG", "HypixelNew"});
   private final Deque deque = new ArrayDeque();
   private final TimeHelperForDisabler timer1 = new TimeHelperForDisabler(this);
   private final TimeHelperForDisabler timer2 = new TimeHelperForDisabler(this);
   public final List packetList = new CopyOnWriteArrayList();
   private final TimeHelperForDisabler timer3 = new TimeHelperForDisabler(this);
   private long ticks;
   private long meaningless1;
   private final Queue queue = new ConcurrentLinkedQueue();
   private Vec3 meaningless2;
   private final List packetList2 = new CopyOnWriteArrayList();
   private int meaningless3;
   private int meaningless4;
   private final ConcurrentLinkedQueue queue2 = new ConcurrentLinkedQueue();
   public static ConcurrentLinkedQueue queue3 = new ConcurrentLinkedQueue();
   public static boolean flag4;
   private long nextDelay;
   private int movementPacketSize;
   private long delay;
   private boolean meaningless5;
   private boolean flag;
   private short actionNumber;
   public int posLookSize = 0;
   public double pullbackX;
   public double pullbackY;
   public double pullbackZ;
   private static Vec3 hitVec;
   private TimeHelper timer = new TimeHelper();
   private boolean flag2;
   public static boolean flag3;

   public Disabler() {
      super("Disabler", Category.WORLD);
      this.setHideModule(true);
      this.setDescription("绕过反作弊使用暴力功能");
   }

   public boolean canUse() {
      return GlobalModule.INSTANCE.balant == null || !PermissionManager.canUseModule("disabler");
   }

   @EventTarget
   public void onUpdate(EventUpdate event) {
      this.setDisplayTag(this.mode.getMode());
      if (this.mode.isCurrentMode("HypixelNew") && this.timer3.isDelayComplete(mc.thePlayer.ticksExisted < 100 ? 2500L : 450L)) {
         while(!this.deque.isEmpty()) {
            Wrapper.INSTANCE.sendPacketNoEvent(DelayedPacket.getPacket((DelayedPacket)this.deque.removeLast()));
         }

         this.timer3.reset();
      }

      if (this.mode.isCurrentMode("Watchdog")) {
         if (mc.thePlayer.ticksExisted == 80 && !this.flag) {
            mc.thePlayer.ticksExisted = 0;
            this.flag = true;
         }

         if (this.timer3.isDelayComplete(120L)) {
            while(!this.queue2.isEmpty()) {
               Wrapper.INSTANCE.sendPacketNoEvent((Packet)this.queue2.poll());
            }

            this.timer3.reset();
         }

         if (mc.thePlayer != null && mc.thePlayer.ticksExisted == 7) {
            Wrapper.INSTANCE.sendPacketNoEvent(new C0BPacketEntityAction(mc.thePlayer, Action.STOP_SPRINTING));
         }
      }

      if (this.mode.isCurrentMode("Watchdog2")) {
         if (this.timer3.isDelayComplete(120L)) {
            while(!this.queue2.isEmpty()) {
               Wrapper.INSTANCE.sendPacketNoEvent((Packet)this.queue2.poll());
            }

            this.timer3.reset();
         }

         if (mc.thePlayer != null && mc.thePlayer.ticksExisted == 7) {
            Wrapper.INSTANCE.sendPacketNoEvent(new C0BPacketEntityAction(mc.thePlayer, Action.STOP_SPRINTING));
         }
      }

   }

   @EventTarget
   public void onPacket4(EventPacket event) {
      a[] a = Class448.trash();
      if (event.isSend()) {
         label345: {
            boolean a;
            if (this.mode.isCurrentMode("Watchdog")) {
               if (mc.thePlayer.ticksExisted == 60) {
                  mc.displayGuiScreen((GuiScreen)null);
               }

               if (event.getPacket() instanceof C03PacketPlayer && mc.thePlayer.ticksExisted < 70) {
                  event.setCancelled(true);
               }

               if (event.getPacket() instanceof C0BPacketEntityAction) {
                  event.setCancelled(true);
               }

               a = false;

               try {
                  a = ReflectionHelper.findField(mc.thePlayer.sendQueue.getClass(), new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean(mc.thePlayer.sendQueue);
               } catch (Exception var9) {
               }

               if (!event.isCancelled() && (event.getPacket() instanceof C03PacketPlayer || event.getPacket() instanceof C0FPacketConfirmTransaction || event.getPacket() instanceof C00PacketKeepAlive)) {
                  event.setCancelled(true);
                  this.queue2.add(event.getPacket());
               }

               if (event.getPacket() instanceof C03PacketPlayer) {
                  C03PacketPlayer a = (C03PacketPlayer)event.getPacket();
                  if (!mc.thePlayer.isUsingItem() && !a.isMoving()) {
                     event.setCancelled(true);
                  }
               }

               if (event.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook) {
                  C03PacketPlayer.C05PacketPlayerLook a = (C03PacketPlayer.C05PacketPlayerLook)event.getPacket();
                  if (!mc.thePlayer.onGround) {
                     event.setCancelled(true);
                     Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(a.getPositionX(), a.getPositionY(), a.getPositionZ(), false));
                  }
               }

               if (event.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
                  C03PacketPlayer.C06PacketPlayerPosLook a = (C03PacketPlayer.C06PacketPlayerPosLook)event.getPacket();
                  if (!mc.thePlayer.onGround) {
                  }
               }

               if (mc.thePlayer.ticksExisted % 4 == 0) {
                  Wrapper.INSTANCE.sendPacketNoEvent(new C0CPacketInput());
               }
            }

            C03PacketPlayer a;
            if (this.mode.isCurrentMode("Watchdog2")) {
               if (event.getPacket() instanceof C03PacketPlayer && mc.thePlayer.ticksExisted < 80) {
                  event.setCancelled(true);
               }

               if (event.getPacket() instanceof C03PacketPlayer) {
                  a = (C03PacketPlayer)event.getPacket();
                  if (!mc.thePlayer.isUsingItem() && !a.isMoving()) {
                     event.setCancelled(true);
                  }
               }

               if (event.getPacket() instanceof C0BPacketEntityAction) {
                  event.setCancelled(true);
               }

               a = false;

               try {
                  a = ReflectionHelper.findField(mc.thePlayer.sendQueue.getClass(), new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean(mc.thePlayer.sendQueue);
               } catch (Exception var8) {
               }

               if (!event.isCancelled() && (event.getPacket() instanceof C03PacketPlayer || event.getPacket() instanceof C0FPacketConfirmTransaction || event.getPacket() instanceof C00PacketKeepAlive)) {
                  event.setCancelled(true);
                  this.queue2.add(event.getPacket());
               }
            }

            if (this.mode.isCurrentMode("HypixelNew")) {
               if (event.getPacket() instanceof C03PacketPlayer && !(event.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition) && !(event.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook) && !(event.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook)) {
                  a = (C03PacketPlayer)event.getPacket();
                  event.setCancelled(!a.isMoving() && !a.getRotating() && !mc.thePlayer.isUsingItem() || mc.thePlayer.ticksExisted < 120);
                  if (mc.thePlayer.ticksExisted < 120) {
                     this.deque.push(new DelayedPacket(this, a));
                  }
               }

               if (mc.thePlayer.ticksExisted <= 70) {
                  break label345;
               }

               if (event.getPacket() instanceof C00PacketKeepAlive) {
                  ++this.ticks;
                  if (this.ticks % 5L == 0L) {
                     event.setCancelled(true);
                     this.deque.push(new DelayedPacket(this, event.getPacket()));
                  }
               }

               if (!(event.getPacket() instanceof C0FPacketConfirmTransaction)) {
                  break label345;
               }

               this.deque.push(new DelayedPacket(this, event.getPacket()));
               event.setCancelled(true);
            }

            if (this.mode.isCurrentMode("Hypixel")) {
               Packet a = event.getPacket();
               if (a instanceof C03PacketPlayer) {
                  if (mc.thePlayer.ticksExisted < 100) {
                     event.setCancelled(true);
                  }

                  if (this.timer3.isDelayComplete(this.delay) && !this.queue2.isEmpty()) {
                     Wrapper.INSTANCE.sendPacketNoEvent((Packet)this.queue2.poll());
                     this.delay = (long)Math.round((float)MathUtils.getRandomLong(50L, 150L));
                     this.timer3.reset();
                  }
               }

               if (a instanceof C03PacketPlayer && !mc.thePlayer.isSwingInProgress && !mc.thePlayer.isUsingItem() && !((C03PacketPlayer)a).isMoving()) {
                  event.setCancelled(true);
               }

               if (a instanceof C0FPacketConfirmTransaction || a instanceof C00PacketKeepAlive) {
                  if (mc.thePlayer.ticksExisted >= 100) {
                     this.queue2.add(a);
                  }

                  event.setCancelled(true);
               }

               if (a instanceof C0BPacketEntityAction) {
                  C0BPacketEntityAction a = (C0BPacketEntityAction)a;
                  if (a.getAction().equals(Action.START_SPRINTING)) {
                     boolean a = false;

                     try {
                        a = ReflectionHelper.findField(mc.thePlayer.getClass(), new String[]{ObfuscatedField.serverSprintState.getObfuscatedName()}).getBoolean(mc.thePlayer);
                     } catch (Exception var7) {
                     }

                     Wrapper.INSTANCE.sendPacketNoEvent(new C0BPacketEntityAction(mc.thePlayer, Action.STOP_SPRINTING));
                     ReflectionsHelper.setFinalField(mc.thePlayer, ObfuscatedField.serverSprintState.getObfuscatedName(), true, false);
                     event.setCancelled(true);
                  }

                  if (a.getAction().equals(Action.STOP_SPRINTING)) {
                     event.setCancelled(true);
                  }
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

         S08PacketPlayerPosLook a;
         if (this.mode.isCurrentMode("Watchdog") && event.getPacket() instanceof S08PacketPlayerPosLook) {
            a = (S08PacketPlayerPosLook)event.getPacket();
            Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(a.getX(), a.getY(), a.getZ(), false));
            mc.thePlayer.setPosition(a.getX(), a.getY(), a.getZ());
            mc.displayGuiScreen((GuiScreen)null);
            event.setCancelled(true);
         }

         if (this.mode.isCurrentMode("Watchdog2") && event.getPacket() instanceof S08PacketPlayerPosLook) {
            a = (S08PacketPlayerPosLook)event.getPacket();
            Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(a.getX(), a.getY(), a.getZ(), false));
            mc.thePlayer.motionX = mc.thePlayer.motionY = mc.thePlayer.motionZ = 0.0;
            mc.thePlayer.setPosition(a.getX(), a.getY(), a.getZ());
            mc.thePlayer.prevPosX = mc.thePlayer.posX;
            mc.thePlayer.prevPosY = mc.thePlayer.posY;
            mc.thePlayer.prevPosZ = mc.thePlayer.posZ;
            mc.displayGuiScreen((GuiScreen)null);
            event.setCancelled(true);
         }
      }

   }

   @EventTarget
   public void onPacket3(EventPacket e) {
      if (this.mode.isCurrentMode("HypixelGG")) {
         if (e.isRecieve() && e.getPacket() instanceof S08PacketPlayerPosLook) {
            S08PacketPlayerPosLook a = (S08PacketPlayerPosLook)e.getPacket();
            EntityPlayer a = mc.thePlayer;
            C03PacketPlayer.C06PacketPlayerPosLook a = new C03PacketPlayer.C06PacketPlayerPosLook(a.posX, a.posY, a.posZ, a.rotationYaw, a.rotationPitch, false);
            double a = a.getX();
            double a = a.getY();
            double a = a.getZ();
            float a = a.getYaw();
            float a = a.getPitch();
            boolean a = false;

            try {
               a = ReflectionHelper.findField(mc.thePlayer.sendQueue.getClass(), new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean(mc.thePlayer.sendQueue);
            } catch (Exception var15) {
            }

            if (this.mode.isCurrentMode("HypixelNew")) {
               this.packetList2.Method2530(new Class451(a, a, a, (Class491)null));
               if (this.packetList2.Method1799() > 0 && mc.thePlayer.ticksExisted < 120) {
                  for(int a = 0; a < 10; ++a) {
                     Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(a, a + 1.0E-6, a, false));
                  }

                  Wrapper.INSTANCE.sendPacketNoEvent(a);
                  if (mc.thePlayer.getDistance(a, a, a) <= 8.0) {
                     e.setCancelled(true);
                  }
               }
            }
         }

      }
   }

   @EventTarget
   public void onPacket2(EventPacket e) {
      if (this.mode.isCurrentMode("HypixelGG")) {
         if (e.isRecieve() && e.getPacket() instanceof S32PacketConfirmTransaction && mc.currentScreen instanceof GuiInventory) {
            S32PacketConfirmTransaction a = (S32PacketConfirmTransaction)e.getPacket();
            GuiContainer a = (GuiContainer)mc.currentScreen;
            if (a.getWindowId() == a.inventorySlots.windowId && a.getActionNumber() > 0) {
               this.actionNumber = a.getActionNumber();
               int a = 0;

               try {
                  a = ReflectionHelper.findField(Container.class, new String[]{ObfuscatedField.transactionID.getObfuscatedName()}).getShort(a.inventorySlots);
               } catch (Exception var6) {
               }

               if (this.actionNumber < a) {
                  ReflectionsHelper.setFinalField(a.inventorySlots, ObfuscatedField.transactionID.getObfuscatedName(), (short)(this.actionNumber + 1), false);
               }
            }
         }

      }
   }

   public boolean isInHypixelLobby() {
      String[] a = new String[]{"CLICK TO PLAY", "点击开始游戏"};
      Iterator var2 = mc.theWorld.loadedEntityList.Method1383();

      while(true) {
         Entity a;
         do {
            if (!var2.Method932()) {
               return false;
            }

            a = (Entity)var2.Method933();
         } while(!a.getName().startsWith("§e§l"));

         String[] var4 = a;
         int var5 = a.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String a = var4[var6];
            if (a.getName().equals("§e§l" + a)) {
               return true;
            }
         }
      }
   }

   @EventTarget
   public void onPacket(EventPacket e) {
      a[] a = Class448.trash();
      if (e.isSend()) {
         if ((e.getPacket() instanceof C03PacketPlayer || e.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition || e.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) && mc.thePlayer.ticksExisted < 60) {
            e.setCancelled(true);
         }

         if (e.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
            C03PacketPlayer.C06PacketPlayerPosLook a = (C03PacketPlayer.C06PacketPlayerPosLook)e.getPacket();
            if (this.posLookSize > 0 && a.getPositionX() == this.pullbackX && a.getPositionY() == this.pullbackY && a.getPositionZ() == this.pullbackZ) {
               mc.getNetHandler().addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(a.getPositionX(), a.getPositionY(), a.getPositionZ(), a.isOnGround()));
               e.setCancelled(true);
            }

            ++this.posLookSize;
            if (e.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook && mc.thePlayer.isRiding()) {
               mc.getNetHandler().addToSendQueue(new C0BPacketEntityAction(mc.thePlayer, Action.START_SPRINTING));
            }

            if (e.getPacket() instanceof C0CPacketInput && mc.thePlayer.isRiding()) {
               mc.getNetHandler().addToSendQueue(e.getPacket());
               mc.getNetHandler().addToSendQueue(new C0BPacketEntityAction(mc.thePlayer, Action.STOP_SNEAKING));
               e.setCancelled(true);
            }
         }

         Packet a = e.getPacket();
         this.processC03Packet(e);
         if (a instanceof C03PacketPlayer) {
            C03PacketPlayer a = (C03PacketPlayer)a;
            boolean a = false;

            try {
               a = ReflectionHelper.findField(mc.thePlayer.sendQueue.getClass(), new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean(mc.thePlayer.sendQueue);
            } catch (Exception var7) {
            }

            if (mc.thePlayer.ticksExisted == 1) {
               hitVec = new Vec3(a.getPositionX() + getRandomDouble(-1000000.0, 1000000.0), a.getPositionY() + getRandomDouble(-1000000.0, 1000000.0), a.getPositionZ() + getRandomDouble(-1000000.0, 1000000.0));
            }

            if (hitVec != null && mc.thePlayer.ticksExisted < 100) {
               ReflectionsHelper.setFinalField(a, ObfuscatedField.C03X.getObfuscatedName(), (short)((int)hitVec.xCoord), false);
               ReflectionsHelper.setFinalField(a, ObfuscatedField.C03Y.getObfuscatedName(), (short)((int)hitVec.yCoord), false);
               ReflectionsHelper.setFinalField(a, ObfuscatedField.C03Z.getObfuscatedName(), (short)((int)hitVec.zCoord), false);
            }
         }
      }

      if (e.isRecieve()) {
         S08PacketPlayerPosLook a;
         if (e.getPacket() instanceof S08PacketPlayerPosLook) {
            a = (S08PacketPlayerPosLook)e.getPacket();
            this.pullbackX = a.getX();
            this.pullbackY = a.getY();
            this.pullbackZ = a.getZ();
         }

         if (e.getPacket() instanceof S07PacketRespawn) {
            this.posLookSize = 0;
         }

         if (e.getPacket() instanceof S08PacketPlayerPosLook) {
            a = (S08PacketPlayerPosLook)e.getPacket();
            ChatUtils.debug("S08: " + a.getX() + " " + a.getY() + " " + a.getZ());
            if (!flag3 && mc.thePlayer.ticksExisted > 20) {
               e.setCancelled(true);
            }
         }
      }

   }

   private void processC03Packet(EventPacket e) {
      if (e.getPacket() instanceof C03PacketPlayer) {
         C03PacketPlayer a = (C03PacketPlayer)e.getPacket();
         if (!a.isMoving() && !mc.thePlayer.isUsingItem()) {
            e.setCancelled(true);
         }

         if (this.flag2 && this.timer.isDelayComplete(400.0)) {
            this.queue2.forEach(Wrapper.INSTANCE::sendPacketNoEvent);
            this.queue2.clear();
            this.flag2 = false;
         }
      }

   }

   public static double getRandomDouble(double min, double max) {
      if (min == max) {
         return min;
      } else {
         if (min > max) {
            double a = min;
            min = max;
            max = a;
         }

         return ThreadLocalRandom.current().nextDouble(min, max);
      }
   }

   public void onEnable() {
      this.flag = false;
      this.deque.clear();
      this.meaningless5 = false;
      this.timer3.reset();
      this.packetList.clear();
      this.queue2.clear();
      this.delay = 0L;
      this.packetList2.clear();
      this.ticks = 0L;
      this.meaningless3 = this.meaningless4 = 0;
   }

   public void onDisable() {
      this.flag = false;
      this.deque.clear();
      this.meaningless5 = false;
      this.timer3.reset();
      this.packetList.clear();
      this.queue2.clear();
      this.delay = 0L;
      this.packetList2.clear();
      this.ticks = 0L;
      this.meaningless3 = this.meaningless4 = 0;
      flag4 = false;
      ReflectionUtils.setTimerSpeed(1.0F);
   }

   @EventTarget
   public void onMotion(EventMotion e) {
      if (!mc.isIntegratedServerRunning()) {
         if (e.isPre() && this.mode.isCurrentMode("Fucker")) {
            flag4 = true;
            Iterator var2 = queue3.iterator();

            while(var2.Method932()) {
               DelayedPacket2 a = (DelayedPacket2)var2.Method933();
               if (System.currentTimeMillis() > a.getTime() + this.nextDelay) {
                  Wrapper.INSTANCE.sendPacketNoEvent(a.getPacket());
                  queue3.remove(a);
                  this.nextDelay = Math.round(MathUtils.getRandomDouble(200.0, 250.0));
               }
            }
         }

      }
   }

   @EventTarget
   public void onPacket5(EventPacket e) {
      if (!mc.isIntegratedServerRunning()) {
         Packet a;
         if (e.isSend()) {
            a = e.getPacket();
            if (this.mode.isCurrentMode("Fucker")) {
               boolean a = false;

               try {
                  a = ReflectionHelper.findField(mc.thePlayer.sendQueue.getClass(), new String[]{ObfuscatedField.doneLoadingTerrain.getObfuscatedName()}).getBoolean(mc.thePlayer.sendQueue);
               } catch (Exception var6) {
               }

               C03PacketPlayer a;
               if (a instanceof C03PacketPlayer && (a = (C03PacketPlayer)a) instanceof C03PacketPlayer.C06PacketPlayerPosLook && this.movementPacketSize <= 50) {
                  e.setPacket(new C03PacketPlayer.C04PacketPlayerPosition(a.getPositionX() + Double.MIN_NORMAL, a.getPositionY(), a.getPositionZ() - Double.MIN_NORMAL, ((C03PacketPlayer.C06PacketPlayerPosLook)a).isOnGround()));
               }

               ++this.movementPacketSize;
               if (mc.thePlayer != null) {
                  ;
               }

               queue3.clear();
               return;
            }
         } else if (e.isRecieve()) {
            a = e.getPacket();
            if (this.mode.isCurrentMode("Fucker") && a instanceof S08PacketPlayerPosLook) {
               if (mc.thePlayer.ticksExisted < 100) {
                  e.setCancelled(true);
               }

               this.movementPacketSize = 0;
               this.delay = 0L;
            }
         }

      }
   }

   private static void sendPacket(DelayedPacket2 e) {
      Wrapper.INSTANCE.sendPacketNoEvent(e.getPacket());
   }

   private static void sendPacket2(DelayedPacket2 e) {
      Wrapper.INSTANCE.sendPacketNoEvent(e.getPacket());
   }

   private static Exception trash(Exception exception) {
      return exception;
   }
}
