package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import eventapi.EventTarget;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.ItemBlock;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventEntityTick;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class SafeWalk extends Module {
   private BlockPos Field2442;
   private EnumFacing Field2443;
   private boolean Field2444 = false;
   private boolean Field2445 = false;
   private boolean Field2446 = false;
   private long Field2447 = System.currentTimeMillis();
   private final int Field2448 = 290;
   public ModeValue Field2449 = new ModeValue("SafeWalk", "Mode", "Vanilla", new String[]{"Vanilla", "Sneak", "Insane"}, "{靠近边缘不蹲也不掉下去,边缘自动蹲下}");
   public FloatValue Field2450 = new FloatValue("SafeWalk", "Walk High", 4.0, 1.0, 10.0, 1.0, "");
   public BooleanValue Field2451 = new BooleanValue("SafeWalk", "AutoClick", false, "瞄准方块自动右键放方块");
   public BooleanValue Field2452 = new BooleanValue("SafeWalk", "FallToggle", false, "掉落自动关闭功能");
   public BooleanValue Field2453 = new BooleanValue("SafeWalk", "JumpToggle", false, "跳跃自动关闭功能");

   public SafeWalk() {
      super("SafeWalk", "Safe Walk", Category.MOVEMENT);
   }

   public String getDescription() {
      return "安全步行(方块边缘不掉落)";
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (a.getPacket() instanceof S07PacketRespawn) {
         this.Method1028();
      }

   }

   @EventTarget
   public void Method747(EventEntityTick a) {
      this.setDisplayTag(this.Field2449.getMode());
      if (a.getEntity().equals(mc.thePlayer) && this.Field2449.isCurrentMode("Sneak")) {
         if (mc.thePlayer.prevPosY - mc.thePlayer.posY > 0.4 && this.Field2452.getValue()) {
            this.Method1028();
         }

         if (!mc.thePlayer.onGround && mc.gameSettings.keyBindJump.isPressed() && this.Field2453.getValue()) {
            this.Method1028();
         }

         double var2 = mc.thePlayer.posX;
         double var4 = mc.thePlayer.posY - 1.0;
         double var6 = mc.thePlayer.posZ;
         BlockPos var8 = new BlockPos(MathHelper.floor_double(var2), MathHelper.floor_double(var4), MathHelper.floor_double(var6));
         if (this.Field2442 == null || !this.Method1679(var8, this.Field2442)) {
            this.Field2442 = var8;
         }

         this.Method1677(mc.theWorld.isAirBlock(this.Field2442) || mc.theWorld.getBlockState(this.Field2442).getBlock() instanceof BlockTallGrass);
         this.Method258();
      }

   }

   private void Method258() {
      if (!this.Field2446) {
         if (mc.thePlayer.onGround) {
            this.Field2444 = this.Field2445;
            this.Method814();
         } else {
            KeyBinding.setKeyBindState(mc.gameSettings.keyBindSneak.getKeyCode(), false);
         }
      } else {
         KeyBinding.setKeyBindState(mc.gameSettings.keyBindSneak.getKeyCode(), true);
      }

   }

   private void Method814() {
      if (this.Method713() != mc.thePlayer.isSneaking()) {
         KeyBinding.setKeyBindState(mc.gameSettings.keyBindSneak.getKeyCode(), this.Method713());
      }

      if (this.Field2451.getValue()) {
         this.Method815();
      }

   }

   private void Method815() {
      if (mc.objectMouseOver != null && mc.objectMouseOver.getBlockPos() != null && mc.thePlayer.getCurrentEquippedItem() != null && mc.thePlayer.getCurrentEquippedItem().getItem() != null && this.Method1680(mc.objectMouseOver.sideHit) && this.Method1679(mc.objectMouseOver.getBlockPos(), this.Method1681(this.Field2442, mc.objectMouseOver.sideHit)) && System.currentTimeMillis() - this.Field2447 > (long)this.Field2448 && mc.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemBlock) {
         this.Field2447 = System.currentTimeMillis();
         mc.playerController.onPlayerRightClick(mc.thePlayer, mc.theWorld, mc.thePlayer.getCurrentEquippedItem(), mc.objectMouseOver.getBlockPos(), mc.objectMouseOver.sideHit, mc.objectMouseOver.hitVec);
         mc.thePlayer.swingItem();
      }

   }

   public void Method1677(boolean a) {
      this.Field2445 = a;
   }

   public void Method1678(boolean a) {
      this.Field2446 = a;
   }

   private boolean Method713() {
      return this.Field2444;
   }

   private boolean Method1679(BlockPos a, BlockPos a) {
      return a.getX() == a.getX() && a.getY() == a.getY() && a.getZ() == a.getZ();
   }

   private boolean Method1680(EnumFacing a) {
      return a != EnumFacing.UP && a != EnumFacing.DOWN;
   }

   private BlockPos Method1681(BlockPos a, EnumFacing a) {
      if (a == EnumFacing.NORTH) {
         return new BlockPos(a.getX(), a.getY(), a.getZ() + 1);
      } else if (a == EnumFacing.SOUTH) {
         return new BlockPos(a.getX(), a.getY(), a.getZ() - 1);
      } else if (a == EnumFacing.EAST) {
         return new BlockPos(a.getX() - 1, a.getY(), a.getZ());
      } else if (a == EnumFacing.WEST) {
         return new BlockPos(a.getX() + 1, a.getY(), a.getZ());
      } else {
         return a == EnumFacing.UP ? new BlockPos(a.getX(), a.getY() + 1, a.getZ()) : a;
      }
   }

   @EventTarget
   public void Method274(EventMove a) {
      boolean var2 = Class167.Method1500();
      if (a.getEntity().equals(mc.thePlayer)) {
         double var3;
         double var5;
         double var7;
         double var9;
         if (this.Field2449.isCurrentMode("Vanilla")) {
            var3 = a.getX();
            var5 = a.getY();
            var7 = a.getZ();
            if (mc.thePlayer.onGround) {
               var9 = 0.05;
               if (var3 != 0.0) {
                  if (!mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(var3, -1.0, 0.0)).isEmpty()) {
                     ;
                  }

                  if (var3 < var9 && var3 >= -var9) {
                     var3 = 0.0;
                  }

                  if (var3 > 0.0) {
                     var3 -= var9;
                  }

                  var3 += var9;
               }

               if (var7 != 0.0) {
                  if (!mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(0.0, -1.0, var7)).isEmpty()) {
                     ;
                  }

                  if (var7 < var9 && var7 >= -var9) {
                     var7 = 0.0;
                  }

                  if (var7 > 0.0) {
                     var7 -= var9;
                  }

                  var7 += var9;
               }

               if (var3 != 0.0 && var7 != 0.0 && mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(var3, -1.0, var7)).isEmpty()) {
                  if (var3 < var9 && var3 >= -var9) {
                     var3 = 0.0;
                  }

                  if (var3 > 0.0) {
                     var3 -= var9;
                  }

                  var3 += var9;
                  if (var7 < var9 && var7 >= -var9) {
                     var7 = 0.0;
                  }

                  if (var7 > 0.0) {
                     var7 -= var9;
                  }

                  var7 += var9;
               }
            }

            a.setX(var3);
            a.setZ(var7);
         }

         if (this.Field2449.isCurrentMode("Insane")) {
            var3 = a.getX();
            var5 = 1.0;
            var7 = a.getZ();
            var9 = 0.05;
            if (var3 != 0.0) {
               if (this.Method1682(var3, -var5, 0.0)) {
                  ;
               }

               if (var3 < var9 && var3 >= -var9) {
                  var3 = 0.0;
               }

               if (var3 > 0.0) {
                  var3 -= var9;
               }

               var3 += var9;
            }

            if (var7 != 0.0) {
               if (this.Method1682(0.0, -var5, var7)) {
                  ;
               }

               if (var7 < var9 && var7 >= -var9) {
                  var7 = 0.0;
               }

               if (var7 > 0.0) {
                  var7 -= var9;
               }

               var7 += var9;
            }

            if (var3 != 0.0 && var7 != 0.0 && !this.Method1682(var3, -1.0, var7)) {
               if (var3 < var9 && var3 >= -var9) {
                  var3 = 0.0;
               }

               if (var3 > 0.0) {
                  var3 -= var9;
               }

               var3 += var9;
               if (var7 < var9 && var7 >= -var9) {
                  var7 = 0.0;
               }

               if (var7 > 0.0) {
                  var7 -= var9;
               }

               var7 += var9;
            }

            a.setX(var3);
            a.setZ(var7);
         }

      }
   }

   public boolean Method1682(double a, double a, double a) {
      for(int var7 = this.Field2450.getFloatValue().intValue(); mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(a, (double)(-var7), a)).isEmpty(); --var7) {
      }

      return true;
   }

   private boolean Method805() {
      int var1 = (int)mc.thePlayer.posY;

      while(true) {
         BlockPos var2 = new BlockPos(mc.thePlayer.posX, (double)var1, mc.thePlayer.posZ);
         if (!(mc.theWorld.getBlockState(var2).getBlock() instanceof BlockAir)) {
            return true;
         }

         --var1;
      }
   }

   public void onEnable() {
   }

   public void onDisable() {
      if (this.Field2449.isCurrentMode("Sneak")) {
         KeyBinding.setKeyBindState(mc.gameSettings.keyBindSneak.getKeyCode(), false);
      }

   }
}
