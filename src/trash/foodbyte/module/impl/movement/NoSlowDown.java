package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import eventapi.EventTarget;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C07PacketPlayerDigging.Action;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import obfuscate.a;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.value.ModeValue;

public class NoSlowDown extends Module {
   public ModeValue mode;
   private ItemStack[] itemStacks;

   public NoSlowDown() {
      Class167.Method1501();
      super("NoSlowDown", "No Slow Down", Category.MOVEMENT);
      this.mode = new ModeValue("NoSlowDown", "Block Mode", "Vanilla", new String[]{"Vanilla", "NCP", "Hypixel"}, "攻击模式{不发包,NCP发包,Hypixel发包}");
      if (a.trash() == null) {
         Class167.Method1499(false);
      }

   }

   public String getDescription() {
      return "格挡无减速";
   }

   @EventTarget
   public void Method712(EventMotion a) {
      boolean var2 = Class167.Method1501();
      if (this.mode.isCurrentMode("NCP") && mc.thePlayer.isBlocking() && PlayerUtils.isMoving() && mc.thePlayer.onGround && KillAura.target == null) {
         if (a.isPost()) {
            Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.inventory.getCurrentItem()));
         }

         Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, new BlockPos(-1, -1, -1), EnumFacing.DOWN));
      }

      if (this.mode.isCurrentMode("Hypixel") && a.isPost() && this.Method713()) {
         Wrapper.INSTANCE.sendPacketNoEvent(new C09PacketHeldItemChange(mc.thePlayer.inventory.currentItem < 8 ? mc.thePlayer.inventory.currentItem + 1 : mc.thePlayer.inventory.currentItem - 1));
         Wrapper.INSTANCE.sendPacketNoEvent(new C09PacketHeldItemChange(mc.thePlayer.inventory.currentItem));
      }

   }

   @EventTarget
   public void Method273(EventPacket a) {
      boolean var2 = Class167.Method1500();
      if (this.mode.isCurrentMode("Hypixel") && a.getPacket() instanceof S30PacketWindowItems && ((S30PacketWindowItems)a.getPacket()).func_148911_c() == 0) {
         this.itemStacks = ((S30PacketWindowItems)a.getPacket()).getItemStacks();
         if (this.itemStacks != null && this.itemStacks == ((S30PacketWindowItems)a.getPacket()).getItemStacks()) {
            if (this.Method713()) {
               Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.inventory.getCurrentItem()));
               a.setCancelled(true);
            }

            Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, new BlockPos(-1, -1, -1), EnumFacing.DOWN));
         }
      }

   }

   public boolean Method713() {
      if (ModuleManager.getModule(KillAura.class).getState() && ReflectionUtils.getItemInUseCount() >= 520.0F) {
         return false;
      } else if (ReflectionUtils.getItemInUseCount() > 0.0F && mc.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
         return true;
      } else {
         return ReflectionUtils.getItemInUseCount() > 0.0F && (mc.thePlayer.getHeldItem().getItem() instanceof ItemFood || mc.thePlayer.getHeldItem().getItem() instanceof ItemPotion);
      }
   }
}
