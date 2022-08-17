package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus.EnumState;
import net.minecraft.potion.Potion;
import obfuscate.b;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class AutoHeal extends Module {
   public FloatValue Field2615 = new FloatValue("AutoHeal", "Health", 50.0, 1.0, 100.0, 1.0, "%", "低于最大生命值的多少开始");
   public FloatValue Field2616 = new FloatValue("AutoHeal", "Delay", 50.0, 0.0, 1000.0, 10.0, "吃一次间隔延迟");
   public FloatValue Field2617 = new FloatValue("AutoHeal", "Slot", 7.0, 1.0, 9.0, 1.0, "自动递补给到几号格子");
   public BooleanValue Field2618 = new BooleanValue("AutoHeal", "Only Feel Hurt", true, "收到伤害时才会吃补给");
   public BooleanValue Field2619 = new BooleanValue("AutoHeal", "Heads", true, "打开后吃头关闭后吃蘑菇包");
   TimeHelper Field2620 = new TimeHelper();
   public int Field2621;
   public int Field2622;

   public AutoHeal() {
      super("AutoHeal", Category.COMBAT);
      this.setDescription("自动吃补给");
   }

   @EventTarget
   public void Method712(EventMotion a) {
      if (!a.isPost()) {
         if (!ServerUtils.isPlayingSkywars() && !ServerUtils.isPlayingSkyblock()) {
            if (this.Field2619.getValue()) {
               this.setDisplayTag("Head");
            }

            int a = this.Field2617.getFloatValue().intValue() - 1;
            this.Field2622 = this.Method243();
            this.Field2621 = this.Method242();
            if (mc.thePlayer.hurtTime > 0 || !this.Field2618.getBooleanValue()) {
               float a = mc.thePlayer.getHealth() / mc.thePlayer.getMaxHealth() * 100.0F;
               if (this.Method713() && a <= this.Field2615.getFloatValue() + 5.0F) {
                  Wrapper.INSTANCE.sendPacketNoEvent(new C16PacketClientStatus(EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                  this.Method235(this.Field2622, a);
                  Wrapper.INSTANCE.sendPacketNoEvent(new C0DPacketCloseWindow(0));
               }

               if (this.Field2621 != -1 && a <= this.Field2615.getFloatValue() && this.Field2620.isDelayComplete((double)this.Field2616.getFloatValue())) {
                  Wrapper.INSTANCE.sendPacket(new C09PacketHeldItemChange(this.Field2621));
                  Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.inventory.getCurrentItem()));
                  Wrapper.INSTANCE.sendPacket(new C09PacketHeldItemChange(mc.thePlayer.inventory.currentItem));
                  this.Field2620.reset();
               }

            }
         }
      }
   }

   private int Method242() {
      b.trash();
      int a = -1;
      int a = 36;
      if (a < 45) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (a.getItemDamage() == 3) {
               if (a.getDisplayName().contains("Backpack")) {
                  ;
               }

               boolean var10000;
               if (!this.Field2619.getBooleanValue() || Item.getIdFromItem(a) != Item.getIdFromItem(Items.skull) && Item.getIdFromItem(a) != Item.getIdFromItem(Items.baked_potato) || mc.thePlayer.isPotionActive(Potion.regeneration) && (mc.thePlayer.getActivePotionEffect(Potion.regeneration).getAmplifier() >= 2 || mc.thePlayer.getActivePotionEffect(Potion.regeneration).getDuration() > 1) && (!(mc.thePlayer.getAbsorptionAmount() <= 0.0F) || a.stackSize < 1)) {
                  var10000 = false;
               } else {
                  var10000 = true;
               }

               if (Item.getIdFromItem(a) != 282) {
                  ;
               }

               a = a - 36;
            }
         }

         ++a;
      }

      return a;
   }

   private boolean Method713() {
      for(int a = 36; a < 45; ++a) {
         ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack() && a.getItem() instanceof ItemSkull && a.getItemDamage() == 3 && !a.getDisplayName().contains("Backpack")) {
            return false;
         }
      }

      return true;
   }

   protected void Method235(int a, int a) {
      mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, a, a, 2, mc.thePlayer);
   }

   private int Method243() {
      b.trash();
      int a = -1;
      int a = 9;
      if (a < 36) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (a.getItemDamage() == 3 && !a.getDisplayName().contains("Backpack")) {
               boolean var10000;
               if (!this.Field2619.getBooleanValue() || Item.getIdFromItem(a) != Item.getIdFromItem(Items.skull) && Item.getIdFromItem(a) != Item.getIdFromItem(Items.baked_potato) || mc.thePlayer.isPotionActive(Potion.regeneration) && (mc.thePlayer.getActivePotionEffect(Potion.regeneration).getAmplifier() >= 2 || mc.thePlayer.getActivePotionEffect(Potion.regeneration).getDuration() > 1) && (!(mc.thePlayer.getAbsorptionAmount() <= 0.0F) || a.stackSize < 1)) {
                  var10000 = false;
               } else {
                  var10000 = true;
               }

               if (Item.getIdFromItem(a) != 282) {
                  ;
               }

               a = a;
            }
         }

         ++a;
      }

      return a;
   }
}
