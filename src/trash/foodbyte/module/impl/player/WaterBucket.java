package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class627;
import com.google.common.base.Predicates;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.WorldProviderHell;
import trash.foodbyte.command.impl.TeleportCommand;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class WaterBucket extends Module {
   public FloatValue fallCheck = new FloatValue("WaterBucket", "Fall Check", 4.0, 2.0, 20.0, 0.1, "掉下多少距离才执行落地水");
   public BooleanValue swap = new BooleanValue("WaterBucket", "Swap", false, "落地水后再切回你原本的格子");
   public BooleanValue recycle = new BooleanValue("WaterBucket", "Recycle", true, "放水后收回水");
   private MovingObjectPosition position;
   private int originItem = 0;
   private boolean placed;

   public WaterBucket() {
      super("WaterBucket", "Water Bucket", Category.PLAYER);
      this.setDescription("落地水(需要瞄准地面会自动切换水桶自动放水)");
   }

   @EventTarget(4)
   public void Method801(EventTickUpdate a) {
      if ((!Objects.isNull(mc.thePlayer) || !Objects.isNull(mc.theWorld)) && !(mc.thePlayer.worldObj.provider instanceof WorldProviderHell) && !mc.isGamePaused()) {
         if (this.canPlace() && this.backWater()) {
            this.placed = true;
         }

         if (this.placed && TeleportCommand.Field3196 == Class627.WAIT) {
            this.useItem();
            if (mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY + 0.5, mc.thePlayer.posZ)) != null) {
            }

            if (mc.thePlayer.onGround || mc.thePlayer.motionY > 0.0) {
               this.placeWater();
               ReflectionUtils.setTimerSpeed(1.0F);
            }
         }

      }
   }

   @EventTarget(0)
   public void Method802(EventRender3D a) {
      this.position = this.getPosition();
   }

   private boolean canPlace() {
      if (mc.thePlayer.fallDistance > this.fallCheck.getFloatValue() && !mc.thePlayer.onGround && mc.thePlayer.rotationPitch >= 70.0F && this.position.typeOfHit == MovingObjectType.BLOCK && this.position.sideHit == EnumFacing.UP && !mc.thePlayer.capabilities.isFlying && !mc.thePlayer.capabilities.isCreativeMode && !this.placed) {
         Block a = mc.theWorld.getBlockState(this.position.getBlockPos().up()).getBlock();
         return a != Blocks.water;
      } else {
         return false;
      }
   }

   private boolean backWater() {
      int a = Class148.Method1444();
      if (this.isHeldingItem(mc.thePlayer.getHeldItem(), Items.water_bucket)) {
         this.originItem = mc.thePlayer.inventory.currentItem;
         return true;
      } else {
         int a = 0;
         if (a < InventoryPlayer.getHotbarSize()) {
            if (this.isHeldingItem(mc.thePlayer.inventory.mainInventory[a], Items.water_bucket)) {
               this.originItem = mc.thePlayer.inventory.currentItem;
               mc.thePlayer.inventory.currentItem = a;
               return true;
            }

            ++a;
         }

         return false;
      }
   }

   private void useItem() {
      ItemStack a = mc.thePlayer.getHeldItem();
      if (this.isHeldingItem(a, Items.water_bucket) && mc.thePlayer.rotationPitch >= 70.0F && this.position.typeOfHit == MovingObjectType.BLOCK && this.position.sideHit == EnumFacing.UP) {
         mc.playerController.sendUseItem(mc.thePlayer, mc.theWorld, a);
      }

   }

   private void placeWater() {
      ItemStack a = mc.thePlayer.getHeldItem();
      if (this.isHeldingItem(a, Items.bucket) && this.recycle.getValue()) {
         mc.playerController.sendUseItem(mc.thePlayer, mc.theWorld, a);
      }

      if (this.swap.getValue() && this.originItem != mc.thePlayer.inventory.currentItem) {
         mc.thePlayer.inventory.currentItem = this.originItem;
      }

      this.placed = false;
   }

   private boolean isHeldingItem(ItemStack stack, Item item) {
      return stack.getItem() == item;
   }

   public MovingObjectPosition getPosition() {
      Class148.Method1445();
      Entity a = mc.getRenderViewEntity();
      if (mc.theWorld != null) {
         mc.mcProfiler.startSection("pick");
         float a = ReflectionUtils.getRenderPartialTicks();
         double a = (double)mc.playerController.getBlockReachDistance();
         MovingObjectPosition a = a.rayTrace(a, a);
         Vec3 a = a.getPositionEyes(a);
         boolean a = false;
         boolean a = true;
         double a;
         if (mc.playerController.extendedReach()) {
            a = 6.0;
            a = 6.0;
         }

         if (a > 3.0) {
            a = true;
         }

         a = a.hitVec.distanceTo(a);
         Vec3 a = a.getLook(a);
         a.addVector(a.xCoord * a, a.yCoord * a, a.zCoord * a);
         Entity a = null;
         Vec3 a = null;
         float a = 1.0F;
         mc.theWorld.getEntitiesInAABBexcluding(a, a.getEntityBoundingBox().addCoord(a.xCoord * a, a.yCoord * a, a.zCoord * a).expand((double)a, (double)a, (double)a), Predicates.and(EntitySelectors.NOT_SPECTATING, Entity::func_70067_L));
         if (a.distanceTo((Vec3)a) > 3.0) {
            a = null;
            a = new MovingObjectPosition(MovingObjectType.MISS, (Vec3)a, (EnumFacing)null, new BlockPos((Vec3)a));
         }

         if (!(a < a)) {
            ;
         }

         a = new MovingObjectPosition((Entity)a, (Vec3)a);
         if (!(a instanceof EntityLivingBase) && a instanceof EntityItemFrame) {
         }

         mc.mcProfiler.endSection();
         return a;
      } else {
         return null;
      }
   }

   public void onEnable() {
      this.placed = false;
   }

   public void onDisable() {
      this.placed = false;
   }
}
