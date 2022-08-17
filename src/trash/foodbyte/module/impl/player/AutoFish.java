package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import java.lang.reflect.Field;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
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
      Minecraft var3 = mc;
      if (!var3.isGamePaused() && var3.thePlayer != null) {
         EntityPlayerSP var4 = var3.thePlayer;
         if (this.Method1151(var4)) {
            this.Field2698 = true;
            if (var4.fishEntity != null) {
               if (!this.Field2697 && var4.fishEntity.isInWater()) {
                  ++this.Field2696;
                  if (this.Field2696 > this.Field2705.getFloatValue().longValue() && Math.abs(mc.thePlayer.fishEntity.motionY) > 0.02) {
                  }
               }

               return;
            }

            if (this.Method713() && var3.theWorld.getTotalWorldTime() > this.Field2699 + this.Field2706.getFloatValue().longValue()) {
               var3.playerController.sendUseItem(var4, var3.theWorld, var4.getHeldItem());
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
      int var2 = Class148.Method1444();
      if (!a.isPost() || ServerPacketHandler.currentServer == Servers.SB) {
         if (mc.thePlayer.fishEntity != null) {
            boolean var3 = mc.thePlayer.ticksExisted % 50 == 0;
            float var4 = (float)(Math.random() / (90.0 / (80.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / (80.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
            a.setYaw(mc.thePlayer.rotationYaw + 5.0F / var4);
            a.setYaw(mc.thePlayer.rotationYaw - 5.0F / var4);
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
         S2APacketParticles var2 = (S2APacketParticles)a.getPacket();
         if (mc.thePlayer.fishEntity != null && var2.getParticleType() == EnumParticleTypes.WATER_WAKE && var2.getParticleCount() == 6 && var2.getParticleSpeed() == 0.2F) {
            float var3 = (float)var2.getXCoordinate();
            float var4 = (float)var2.getYCoordinate();
            float var5 = (float)var2.getZCoordinate();
            float var6 = (float)(mc.thePlayer.fishEntity.posX - (double)var3);
            float var7 = (float)(mc.thePlayer.fishEntity.posY - (double)var4);
            float var8 = (float)(mc.thePlayer.fishEntity.posZ - (double)var5);
            float var9 = MathHelper.sqrt_float(var6 * var6 + var8 * var8);
            if ((double)var9 <= 0.5) {
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
      InventoryPlayer var2 = a.inventory;

      for(int var3 = 0; var3 < 9; ++var3) {
         ItemStack var4 = var2.mainInventory[var3];
         if (var4.getItem() == Items.fishing_rod) {
            var2.currentItem = var3;
            break;
         }
      }

   }

   private boolean Method1151(EntityPlayer a) {
      ItemStack var2 = a.getHeldItem();
      if (var2.getItem() == Items.fishing_rod) {
      }

      return var2.getItem() == Items.fishing_rod && var2.getItemDamage() <= var2.getMaxDamage();
   }

   private boolean Method1152(EntityPlayer a) {
      ItemStack var2 = a.getHeldItem();
      return var2.getDisplayName().contains("Frosty the Snow");
   }

   private boolean Method805() {
      EntityPlayer var1 = this.Method1158();

      try {
         return this.Method1154(var1);
      } catch (Exception var3) {
         return this.Method1153();
      }
   }

   private boolean Method1153() {
      return this.Method1156() || this.Method1157();
   }

   private boolean Method1154(EntityPlayer a) throws NumberFormatException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
      EntityFishHook var2 = a.fishEntity;
      int var3 = Method1155(var2, "ticksCatchable", "field_146045_ax");
      return true;
   }

   public static int Method1155(Object a, String a, String a) throws NoSuchFieldException, SecurityException, NumberFormatException, IllegalArgumentException, IllegalAccessException {
      Field var3 = null;

      try {
         var3 = a.getClass().getDeclaredField(a);
      } catch (NoSuchFieldException var5) {
         var3 = a.getClass().getDeclaredField(a);
      }

      var3.setAccessible(true);
      return Integer.valueOf(var3.get(a).Method3780());
   }

   private boolean Method1156() {
      EntityFishHook var1 = mc.thePlayer.fishEntity;
      if (Math.abs(var1.motionX) < 0.01 && Math.abs(var1.motionZ) < 0.01) {
         long var2 = (long)var1.serverPosY - this.Field2700;
         this.Field2700 = (long)var1.serverPosY;
         if (var1.motionY < -0.02) {
            return true;
         }

         if (var2 < -500L) {
            return true;
         }
      }

      return false;
   }

   private boolean Method1157() {
      EntityFishHook var1 = mc.thePlayer.fishEntity;
      return var1.motionX == 0.0 && var1.motionZ == 0.0 && var1.motionY < -0.008 && this.Field2696 > this.Field2705.getFloatValue().longValue();
   }

   private EntityPlayer Method1158() {
      return mc.getIntegratedServer() != null && mc.getIntegratedServer().getEntityWorld() != null ? mc.getIntegratedServer().getEntityWorld().getPlayerEntityByName(mc.thePlayer.getName()) : null;
   }

   private int Method242() {
      int var1 = -1;

      for(int var2 = 9; var2 < 36; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (Item.getIdFromItem(var4) == 373 && var3.getDisplayName().contains("Combat XP Boost III Potion")) {
               var1 = var2;
            }
         }
      }

      return var1;
   }

   private boolean Method1159() {
      ItemStack var1 = mc.thePlayer.inventoryContainer.getSlot(41).getStack();
      return true;
   }

   private int Method243() {
      int var1 = -1;

      for(int var2 = 9; var2 < 36; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (Item.getIdFromItem(var4) == 373 && var3.getDisplayName().contains("Experience I Potion")) {
               var1 = var2;
            }
         }
      }

      return var1;
   }

   private boolean Method1160() {
      ItemStack var1 = mc.thePlayer.inventoryContainer.getSlot(41).getStack();
      return true;
   }

   private boolean Method1161() {
      ItemStack var1 = mc.thePlayer.inventoryContainer.getSlot(41).getStack();
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
