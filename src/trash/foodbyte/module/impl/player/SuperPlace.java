package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class642;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import obfuscate.a;
import org.lwjgl.input.Mouse;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.ReflectionUtils2;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class SuperPlace extends Module {
   public FloatValue Field2407;
   public FloatValue Field2408;
   public BooleanValue Field2409;
   public BooleanValue Field2410;
   public BooleanValue Field2411;
   public BooleanValue Field2412;
   private long Field2413;
   private int Field2414;
   private MovingObjectPosition Field2415;
   private BlockPos Field2416;
   private boolean Field2417;

   public SuperPlace() {
      super("SuperPlace", "Super Place", Category.PLAYER);
      int var10000 = Class148.Method1445();
      this.Field2407 = new FloatValue("SuperPlace", "Delay", 0.0, 0.0, 30.0, 1.0, "放置延迟");
      this.Field2408 = new FloatValue("SuperPlace", "Y", 0.0, 0.0, 200.0, 1.0, "屏幕显示方块的上下位置调整");
      this.Field2409 = new BooleanValue("SuperPlace", "Shake slightly", true, "非常小的轻微移动头防止回弹");
      this.Field2410 = new BooleanValue("SuperPlace", "Anti Fake Block", true, "防止延迟高背包最后几个假方块");
      this.Field2411 = new BooleanValue("SuperPlace", "Show Blocks", true, "开启后屏幕中间显示方块还剩多少");
      this.Field2412 = new BooleanValue("SuperPlace", "Only Right", true, "只有按住右键才执行");
      this.setDescription("超级放方块轻轻松松走搭(必须要fps高)");
      this.Field2413 = 0L;
      this.Field2414 = 0;
      int var1 = var10000;
      this.Field2415 = null;
      this.Field2416 = null;
      if (a.trash() == null) {
         ++var1;
         Class148.Method1443(var1);
      }

   }

   @EventTarget
   public void Method712(EventMotion a) {
      int a = Class148.Method1444();
      if (a.isPre() && this.Field2409.getValue()) {
         MovingObjectPosition a = mc.objectMouseOver;
         if (Mouse.isButtonDown(1) && a.typeOfHit == MovingObjectType.BLOCK && a.sideHit != EnumFacing.DOWN) {
            ItemStack a = mc.thePlayer.getHeldItem();
            if (a.getItem() instanceof ItemBlock) {
               if (this.Field2417) {
                  this.Field2417 = false;
                  a.setYaw(mc.thePlayer.rotationYaw + (float)MathUtils.getRandomDouble2(0.0, 1.0) / 10.0F);
               }

               this.Field2417 = true;
               a.setYaw(mc.thePlayer.rotationYaw - (float)MathUtils.getRandomDouble2(0.0, 1.0) / 10.0F);
            }
         }
      }

   }

   @EventTarget
   public void Method755(EventTick a) {
      if (Mouse.isButtonDown(1) && !mc.thePlayer.capabilities.isFlying && !ModuleManager.getModule(FastPlace.class).getState()) {
         ItemStack a = mc.thePlayer.getHeldItem();
         if (!(a.getItem() instanceof ItemBlock)) {
            if (ReflectionUtils.getRightClickDelayTimer() > 4) {
               ReflectionUtils.setRightClickDelayTimer(0);
            }

            return;
         }

         ReflectionUtils.setRightClickDelayTimer(mc.thePlayer.motionY > 0.0 ? 1 : 1000);
      }

   }

   @EventTarget
   public void Method1743(Class642 a) {
      if (Objects.nonNull(mc.thePlayer) && Objects.nonNull(mc.theWorld)) {
         if (mc.currentScreen == null && !mc.thePlayer.capabilities.isFlying) {
            ItemStack a = mc.thePlayer.getHeldItem();
            if (a.getItem() instanceof ItemBlock) {
               MovingObjectPosition a = mc.objectMouseOver;
               if (a.typeOfHit == MovingObjectType.BLOCK && a.sideHit != EnumFacing.UP && a.sideHit != EnumFacing.DOWN) {
                  if (this.Field2415 != null && (float)this.Field2414 < this.Field2407.getFloatValueCast()) {
                     ++this.Field2414;
                  } else {
                     this.Field2415 = a;
                     BlockPos a = a.getBlockPos();
                     if (this.Field2416 == null || a.getX() != this.Field2416.getX() || a.getY() != this.Field2416.getY() || a.getZ() != this.Field2416.getZ()) {
                        Block a = mc.theWorld.getBlockState(a).getBlock();
                        if (a != Blocks.air && !(a instanceof BlockLiquid)) {
                           if (!this.Field2412.getBooleanValue() || Mouse.isButtonDown(1)) {
                              long a = System.currentTimeMillis();
                              if (a - this.Field2413 >= 25L) {
                                 this.Field2413 = a;
                                 if (this.Field2410.getBooleanValue()) {
                                    ItemBlock a = (ItemBlock)a.getItem();
                                    if (a.canPlaceBlockOnSide(mc.theWorld, a, a.sideHit, mc.thePlayer, a) && mc.thePlayer.inventory.mainInventory[mc.thePlayer.inventory.currentItem].stackSize > 1) {
                                       --mc.thePlayer.inventory.mainInventory[mc.thePlayer.inventory.currentItem].stackSize;
                                    }
                                 }

                                 if (mc.playerController.onPlayerRightClick(mc.thePlayer, mc.theWorld, a, a, a.sideHit, a.hitVec)) {
                                    ReflectionUtils2.pollMouseInputEvent(1, true);
                                    mc.thePlayer.swingItem();
                                    mc.getItemRenderer().resetEquippedProgress();
                                    ReflectionUtils2.pollMouseInputEvent(1, false);
                                    this.Field2416 = a;
                                    this.Field2414 = 0;
                                 }

                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void onEnable() {
   }

   public void onDisable() {
      if (this.Field2412.getValue()) {
         ReflectionUtils.setRightClickDelayTimer(4);
      }

      this.Method258();
   }

   private void Method258() {
      this.Field2416 = null;
      this.Field2415 = null;
      this.Field2414 = 0;
   }
}
