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
      int var2 = Class148.Method1445();
      if (!a.isPost()) {
         if (!ModuleManager.getModule(Freecam.class).getState()) {
            Field2468 = false;
            Block var3 = mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY + 1.0, mc.thePlayer.posZ)).getBlock();
            Block var4 = mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY - 1.0, mc.thePlayer.posZ)).getBlock();
            Block var5 = mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX + 1.0, mc.thePlayer.posY + 1.0, mc.thePlayer.posZ)).getBlock();
            Block var6 = mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX + 1.0, mc.thePlayer.posY, mc.thePlayer.posZ)).getBlock();
            BlockPos var7 = new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY - 1.0, mc.thePlayer.posZ);
            BlockPos var8 = new BlockPos(mc.thePlayer.posX + 1.0, mc.thePlayer.posY + 1.0, mc.thePlayer.posZ);
            BlockPos var9 = new BlockPos(mc.thePlayer.posX + 1.0, mc.thePlayer.posY, mc.thePlayer.posZ);
            if (var4 != Blocks.air && var4 != Blocks.bedrock && var4 != Blocks.obsidian && var3 == Blocks.obsidian && mc.thePlayer.hurtTime > 8) {
               Field2468 = true;
               this.Method1699(var7, EnumFacing.DOWN);
            }

            if (var4 != Blocks.air && (var4 == Blocks.bedrock || var4 == Blocks.obsidian) && var3 == Blocks.obsidian && mc.thePlayer.hurtTime > 8) {
               if (var6 != Blocks.air) {
                  Field2468 = true;
                  this.Method1699(var9, EnumFacing.EAST);
               }

               if (var5 != Blocks.air) {
                  Field2468 = true;
                  a.setPitch(90.0F);
                  this.Method1699(var8, EnumFacing.UP);
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
            BlockPos var2 = new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ);
            Block var3 = mc.theWorld.getBlockState(var2.up()).getBlock();
            if (var3 == Blocks.gravel || var3 == Blocks.sand) {
               var2 = new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY + 1.0, mc.thePlayer.posZ);
            }

            Block var4 = mc.theWorld.getBlockState(var2).getBlock();
            if (var4 == Blocks.gravel || var4 == Blocks.sand) {
               Field2468 = false;
               if (this.Field2466.getValue()) {
                  a.setPitch(90.0F);
                  this.Method1699(var2, EnumFacing.UP);
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
