package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C07PacketPlayerDigging.Action;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;

public class AntiObbyTrap extends Module {
   public BooleanValue Field2466 = new BooleanValue("AntiObbyTrap", "Anti Sand Trap", true, "UHC被卡沙子自动逃脱");
   public BooleanValue Field2467 = new BooleanValue("AntiObbyTrap", "No Swing", false, "被卡黑曜石不挥手挖脚下方块");
   public static boolean Field2468 = false;

   public AntiObbyTrap() {
      super("AntiObbyTrap", "Anti Obby Trap", Category.PLAYER);
   }

   public String getDescription() {
      return "防卡黑曜石";
   }

   @EventTarget
   public void Method712(EventMotion a) {
      int a = Class148.Method1445();
      if (!a.isPost()) {
         if (!ModuleManager.getModule(Freecam.class).getState()) {
            Field2468 = false;
            Block a = mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY + 1.0, mc.thePlayer.posZ)).getBlock();
            Block a = mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY - 1.0, mc.thePlayer.posZ)).getBlock();
            Block a = mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX + 1.0, mc.thePlayer.posY + 1.0, mc.thePlayer.posZ)).getBlock();
            Block a = mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX + 1.0, mc.thePlayer.posY, mc.thePlayer.posZ)).getBlock();
            BlockPos a = new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY - 1.0, mc.thePlayer.posZ);
            BlockPos a = new BlockPos(mc.thePlayer.posX + 1.0, mc.thePlayer.posY + 1.0, mc.thePlayer.posZ);
            BlockPos a = new BlockPos(mc.thePlayer.posX + 1.0, mc.thePlayer.posY, mc.thePlayer.posZ);
            if (a != Blocks.air && a != Blocks.bedrock && a != Blocks.obsidian && a == Blocks.obsidian && mc.thePlayer.hurtTime > 8) {
               Field2468 = true;
               this.Method1699(a, EnumFacing.DOWN);
            }

            if (a != Blocks.air && (a == Blocks.bedrock || a == Blocks.obsidian) && a == Blocks.obsidian && mc.thePlayer.hurtTime > 8) {
               if (a != Blocks.air) {
                  Field2468 = true;
                  this.Method1699(a, EnumFacing.EAST);
               }

               if (a != Blocks.air) {
                  Field2468 = true;
                  a.setPitch(90.0F);
                  this.Method1699(a, EnumFacing.UP);
               }
            }

         }
      }
   }

   @EventTarget
   public void Method955(EventMotion a) {
      if (!a.isPost()) {
         if (!ModuleManager.getModule(Freecam.class).getState()) {
            Field2468 = false;
            BlockPos a = new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ);
            Block a = mc.theWorld.getBlockState(a.up()).getBlock();
            if (a == Blocks.gravel || a == Blocks.sand) {
               a = new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY + 1.0, mc.thePlayer.posZ);
            }

            Block a = mc.theWorld.getBlockState(a).getBlock();
            if (a == Blocks.gravel || a == Blocks.sand) {
               Field2468 = false;
               if (this.Field2466.getValue()) {
                  a.setPitch(90.0F);
                  this.Method1699(a, EnumFacing.UP);
               }
            }

         }
      }
   }

   public void Method1699(BlockPos a, EnumFacing a) {
      int var3 = Class148.Method1444();
      if (this.Field2467.getValue()) {
         Wrapper.INSTANCE.sendPacket(new C0APacketAnimation());
      }

      mc.thePlayer.swingItem();
      Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.START_DESTROY_BLOCK, a, a));
      Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.STOP_DESTROY_BLOCK, a, a));
      Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.START_DESTROY_BLOCK, a, a));
   }
}
