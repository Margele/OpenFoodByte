package trash.foodbyte.module.impl.world;

import awsl.Class448;
import awsl.Class636;
import eventapi.EventTarget;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging.Action;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class FastBreak extends Module {
   public static ModeValue Field2322 = new ModeValue("FastBreak", "Mode", "Vanilla", new String[]{"Vanilla", "Packet", "FastPacket"}, "{普通模式,发包模式,直接快速发包模式}");
   public FloatValue Field2323 = new FloatValue("FastBreak", "Speed", 0.7, 0.1, 1.0, 0.1, "Vanilla模式的速度(越低越快)");
   public FloatValue Field2324 = new FloatValue("FastBreak", "Packet Speed", 1.4, 1.0, 3.0, 0.1, "Packet模式的速度(越高越快)");
   public BooleanValue Field2325 = new BooleanValue("FastBreak", "Fast Break Bed", true, "秒破床");
   private boolean Field2326 = false;
   private float Field2327 = 0.0F;
   public BlockPos Field2328;
   public EnumFacing Field2329;

   public FastBreak() {
      super("FastBreak", "Fast Break", Category.WORLD);
   }

   public String getDescription() {
      return "快速挖掘";
   }

   public void idk() {
      this.Field2324.Method2757(Field2322.isCurrentMode("Packet"));
      this.Field2323.Method2757(Field2322.isCurrentMode("Vanilla"));
   }

   @EventTarget
   public void Method232(EventUpdate a) {
      this.setDisplayTag(Field2322.getMode());
      if (Field2322.isCurrentMode("Vanilla")) {
         if (ReflectionUtils.getCurBlockDamageMP() >= this.Field2323.getFloatValueCast()) {
            ReflectionUtils.setCurBlockDamageMP(1.0F);
         }

         ReflectionUtils.setBlockHitDelay(0);
      }

   }

   @EventTarget
   private void Method1543(Class636 a) {
      Block a;
      if (Field2322.isCurrentMode("FastPacket")) {
         a = mc.theWorld.getBlockState(a.Method3583()).getBlock();
         int a = Block.getIdFromBlock(a);
         PlayerControllerMP a = mc.playerController;
         ReflectionUtils.setBlockHitDelay(0);
         if (a != 7) {
            Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.STOP_DESTROY_BLOCK, a.Method3583(), a.Method3585()));
            Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.STOP_DESTROY_BLOCK, a.Method3583(), a.Method3585()));
         }
      }

      if (this.Field2325.getValue()) {
         a = mc.theWorld.getBlockState(a.Method3583()).getBlock();
         if (a == Blocks.bed) {
            if (ReflectionUtils.getCurBlockDamageMP() > 0.1F) {
               mc.theWorld.setBlockState(a.Method3583(), Blocks.air.getDefaultState(), 11);
               Wrapper.INSTANCE.sendPacketNoEvent(new C07PacketPlayerDigging(Action.STOP_DESTROY_BLOCK, a.Method3583(), a.Method3585()));
            }

            ReflectionUtils.setBlockHitDelay(0);
         }
      }

   }

   @EventTarget
   public void Method273(EventPacket a) {
      a[] a = Class448.trash();
      if (!a.isRecieve()) {
         if (Field2322.isCurrentMode("Packet")) {
            if (a.packet instanceof C07PacketPlayerDigging && !mc.playerController.extendedReach() && mc.playerController != null) {
               C07PacketPlayerDigging a = (C07PacketPlayerDigging)a.packet;
               if (a.getStatus() == Action.START_DESTROY_BLOCK) {
                  this.Field2326 = true;
                  this.Field2328 = a.getPosition();
                  this.Field2329 = a.getFacing();
                  this.Field2327 = 0.0F;
               }

               if (a.getStatus() == Action.ABORT_DESTROY_BLOCK || a.getStatus() == Action.STOP_DESTROY_BLOCK) {
                  this.Field2326 = false;
                  this.Field2328 = null;
                  this.Field2329 = null;
               }
            }

         }
      }
   }

   @EventTarget
   public void Method803(EventUpdate a) {
      a[] a = Class448.trash();
      if (Field2322.isCurrentMode("Packet")) {
         if (mc.playerController.extendedReach()) {
            ReflectionUtils.setBlockHitDelay(0);
         }

         if (this.Field2326) {
            Block a = mc.theWorld.getBlockState(this.Field2328).getBlock();
            this.Field2327 += (float)((double)a.getPlayerRelativeBlockHardness(mc.thePlayer, mc.theWorld, this.Field2328) * (double)this.Field2324.getFloatValueCast());
            if (this.Field2327 >= 1.0F) {
               mc.theWorld.setBlockState(this.Field2328, Blocks.air.getDefaultState(), 11);
               Wrapper.INSTANCE.sendPacketNoEvent(new C07PacketPlayerDigging(Action.STOP_DESTROY_BLOCK, this.Field2328, this.Field2329));
               this.Field2327 = 0.0F;
               this.Field2326 = false;
            }
         }

      }
   }

   public void onDisable() {
      this.Field2327 = 0.0F;
      this.Field2326 = false;
      this.Field2328 = null;
      this.Field2329 = null;
   }
}
