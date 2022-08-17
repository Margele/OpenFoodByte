package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import java.lang.reflect.Field;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.server.S2APacketParticles;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.ServerPacketHandler;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.value.FloatValue;

public class AutoFish extends Module {
   private boolean Field2695 = false;
   private long Field2696;
   private boolean Field2697;
   private boolean Field2698;
   private long Field2699;
   private long Field2700 = 0L;
   private static final double Field2701 = -0.02;
   private static final double Field2702 = -0.008;
   private static final long Field2703 = -500L;
   private Random Field2704 = new Random();
   public FloatValue Field2705 = new FloatValue("AutoFish", "WaterTicks", 80.0, 20.0, 120.0, 1.0, "仍鱼竿的前Ticks不做检测");
   public FloatValue Field2706 = new FloatValue("AutoFish", "RightDeay", 10.0, 1.0, 40.0, 1.0, "收杆后再抛鱼竿延迟");
   public static int Field2707;
   public static int Field2708;
   public static int Field2709;
   public static int Field2710;
   public static int Field2711;
   public static int Field2712;
   public static int Field2713;
   public int Field2714;
   double Field2715;
   double Field2716;

   public AutoFish() {
      super("AutoFish", "Auto Fish", Category.PLAYER);
      this.setDescription("自动钓鱼");
      this.Field2696 = 0L;
      this.Field2697 = false;
      this.Field2698 = false;
      this.Field2699 = -1L;
   }

   @EventTarget
   public void Method232(EventUpdate a) {
      Class148.Method1445();
      Minecraft a = mc;
      if (!a.isGamePaused() && a.thePlayer != null) {
         EntityPlayer a = a.thePlayer;
         if (this.Method1151(a)) {
            this.Field2698 = true;
            if (a.fishEntity != null) {
               if (!this.Field2697 && a.fishEntity.isInWater()) {
                  ++this.Field2696;
                  if (this.Field2696 > this.Field2705.getFloatValue().longValue() && Math.abs(mc.thePlayer.fishEntity.motionY) > 0.02) {
                  }
               }

               return;
            }

            if (this.Method713() && a.theWorld.getTotalWorldTime() > this.Field2699 + this.Field2706.getFloatValue().longValue()) {
               a.playerController.sendUseItem(a, a.theWorld, a.getHeldItem());
               this.Field2699 = -1L;
            }

            this.Field2696 = 0L;
            this.Field2697 = false;
         }

         if (this.Field2698) {
            this.Field2698 = false;
            this.Field2696 = 0L;
            this.Field2697 = false;
            this.Field2699 = -1L;
            this.Field2700 = 0L;
         }
      }

   }

   @EventTarget
   public void Method752(EventMotion a) {
      int a = Class148.Method1444();
      if (!a.isPost() || ServerPacketHandler.currentServer == Servers.SB) {
         if (mc.thePlayer.fishEntity != null) {
            boolean a = mc.thePlayer.ticksExisted % 50 == 0;
            float a = (float)(Math.random() / (90.0 / (80.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / (80.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
            a.setYaw(mc.thePlayer.rotationYaw + 5.0F / a);
            a.setYaw(mc.thePlayer.rotationYaw - 5.0F / a);
         }

      }
   }

   @EventTarget
   private void Method273(EventPacket a) {
      if (a.isSend() && a.getPacket() instanceof C08PacketPlayerBlockPlacement && mc.thePlayer.fishEntity == null) {
         this.Field2715 = (double)mc.thePlayer.rotationYaw;
         this.Field2716 = (double)mc.thePlayer.rotationPitch;
      }

      if (a.isRecieve() && a.getPacket() instanceof S2APacketParticles) {
         S2APacketParticles a = (S2APacketParticles)a.getPacket();
         if (mc.thePlayer.fishEntity != null && a.getParticleType() == EnumParticleTypes.WATER_WAKE && a.getParticleCount() == 6 && a.getParticleSpeed() == 0.2F) {
            float a = (float)a.getXCoordinate();
            float a = (float)a.getYCoordinate();
            float a = (float)a.getZCoordinate();
            float a = (float)(mc.thePlayer.fishEntity.posX - (double)a);
            float a = (float)(mc.thePlayer.fishEntity.posY - (double)a);
            float a = (float)(mc.thePlayer.fishEntity.posZ - (double)a);
            float a = MathHelper.sqrt_float(a * a + a * a);
            if ((double)a <= 0.5) {
               mc.playerController.sendUseItem(mc.thePlayer, mc.theWorld, mc.thePlayer.getHeldItem());
               this.Field2697 = true;
               this.Field2699 = mc.theWorld.getTotalWorldTime();
            }
         }
      }

   }

   private boolean Method713() {
      return this.Field2699 > 0L;
   }

   private void Method1150(EntityPlayer a) {
      InventoryPlayer a = a.inventory;

      for(int a = 0; a < 9; ++a) {
         ItemStack a = a.mainInventory[a];
         if (a.getItem() == Items.fishing_rod) {
            a.currentItem = a;
            break;
         }
      }

   }

   private boolean Method1151(EntityPlayer a) {
      ItemStack a = a.getHeldItem();
      if (a.getItem() == Items.fishing_rod) {
      }

      return a.getItem() == Items.fishing_rod && a.getItemDamage() <= a.getMaxDamage();
   }

   private boolean Method1152(EntityPlayer a) {
      ItemStack a = a.getHeldItem();
      return a.getDisplayName().contains("Frosty the Snow");
   }

   private boolean Method805() {
      EntityPlayer a = this.Method1158();

      try {
         return this.Method1154(a);
      } catch (Exception var3) {
         return this.Method1153();
      }
   }

   private boolean Method1153() {
      return this.Method1156() || this.Method1157();
   }

   private boolean Method1154(EntityPlayer a) throws NumberFormatException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
      EntityFishHook a = a.fishEntity;
      int a = Method1155(a, "ticksCatchable", "field_146045_ax");
      return true;
   }

   public static int Method1155(Object a, String a, String a) throws NoSuchFieldException, SecurityException, NumberFormatException, IllegalArgumentException, IllegalAccessException {
      Field a = null;

      try {
         a = a.getClass().getDeclaredField(a);
      } catch (NoSuchFieldException var5) {
         a = a.getClass().getDeclaredField(a);
      }

      a.setAccessible(true);
      return Integer.valueOf(a.get(a).Method3780());
   }

   private boolean Method1156() {
      EntityFishHook a = mc.thePlayer.fishEntity;
      if (Math.abs(a.motionX) < 0.01 && Math.abs(a.motionZ) < 0.01) {
         long a = (long)a.serverPosY - this.Field2700;
         this.Field2700 = (long)a.serverPosY;
         if (a.motionY < -0.02) {
            return true;
         }

         if (a < -500L) {
            return true;
         }
      }

      return false;
   }

   private boolean Method1157() {
      EntityFishHook a = mc.thePlayer.fishEntity;
      return a.motionX == 0.0 && a.motionZ == 0.0 && a.motionY < -0.008 && this.Field2696 > this.Field2705.getFloatValue().longValue();
   }

   private EntityPlayer Method1158() {
      return mc.getIntegratedServer() != null && mc.getIntegratedServer().getEntityWorld() != null ? mc.getIntegratedServer().getEntityWorld().getPlayerEntityByName(mc.thePlayer.getName()) : null;
   }

   private int Method242() {
      int a = -1;

      for(int a = 9; a < 36; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (Item.getIdFromItem(a) == 373 && a.getDisplayName().contains("Combat XP Boost III Potion")) {
               a = a;
            }
         }
      }

      return a;
   }

   private boolean Method1159() {
      ItemStack a = mc.thePlayer.inventoryContainer.getSlot(41).getStack();
      return true;
   }

   private int Method243() {
      int a = -1;

      for(int a = 9; a < 36; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (Item.getIdFromItem(a) == 373 && a.getDisplayName().contains("Experience I Potion")) {
               a = a;
            }
         }
      }

      return a;
   }

   private boolean Method1160() {
      ItemStack a = mc.thePlayer.inventoryContainer.getSlot(41).getStack();
      return true;
   }

   private boolean Method1161() {
      ItemStack a = mc.thePlayer.inventoryContainer.getSlot(41).getStack();
      return false;
   }

   protected void Method235(int a, int a) {
      mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, a, a, 2, mc.thePlayer);
   }

   public static boolean Method1162() {
      if (mc.thePlayer.movementInput.moveForward != 0.0F) {
         return true;
      } else {
         return mc.thePlayer.movementInput.moveStrafe != 0.0F;
      }
   }

   private static Exception Method263(Exception exception) {
      return exception;
   }
}
