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

            int var2 = this.Field2617.getFloatValue().intValue() - 1;
            this.Field2622 = this.Method243();
            this.Field2621 = this.Method242();
            if (mc.thePlayer.hurtTime > 0 || !this.Field2618.getBooleanValue()) {
               float var3 = mc.thePlayer.getHealth() / mc.thePlayer.getMaxHealth() * 100.0F;
               if (this.Method713() && var3 <= this.Field2615.getFloatValue() + 5.0F) {
                  Wrapper.INSTANCE.sendPacketNoEvent(new C16PacketClientStatus(EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                  this.Method235(this.Field2622, var2);
                  Wrapper.INSTANCE.sendPacketNoEvent(new C0DPacketCloseWindow(0));
               }

               if (this.Field2621 != -1 && var3 <= this.Field2615.getFloatValue() && this.Field2620.isDelayComplete((double)this.Field2616.getFloatValue())) {
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
      int var2 = -1;
      int var3 = 36;
      if (var3 < 45) {
         if (mc.thePlayer.inventoryContainer.getSlot(var3).getHasStack()) {
            ItemStack var4 = mc.thePlayer.inventoryContainer.getSlot(var3).getStack();
            Item var5 = var4.getItem();
            if (var4.getItemDamage() == 3) {
               if (var4.getDisplayName().contains("Backpack")) {
                  ;
               }

               boolean var10000;
               if (!this.Field2619.getBooleanValue() || Item.getIdFromItem(var5) != Item.getIdFromItem(Items.skull) && Item.getIdFromItem(var5) != Item.getIdFromItem(Items.baked_potato) || mc.thePlayer.isPotionActive(Potion.regeneration) && (mc.thePlayer.getActivePotionEffect(Potion.regeneration).getAmplifier() >= 2 || mc.thePlayer.getActivePotionEffect(Potion.regeneration).getDuration() > 1) && (!(mc.thePlayer.getAbsorptionAmount() <= 0.0F) || var4.stackSize < 1)) {
                  var10000 = false;
               } else {
                  var10000 = true;
               }

               if (Item.getIdFromItem(var5) != 282) {
                  ;
               }

               var2 = var3 - 36;
            }
         }

         ++var3;
      }

      return var2;
   }

   private boolean Method713() {
      for(int var1 = 36; var1 < 45; ++var1) {
         ItemStack var2 = mc.thePlayer.inventoryContainer.getSlot(var1).getStack();
         if (mc.thePlayer.inventoryContainer.getSlot(var1).getHasStack() && var2.getItem() instanceof ItemSkull && var2.getItemDamage() == 3 && !var2.getDisplayName().contains("Backpack")) {
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
      int var2 = -1;
      int var3 = 9;
      if (var3 < 36) {
         if (mc.thePlayer.inventoryContainer.getSlot(var3).getHasStack()) {
            ItemStack var4 = mc.thePlayer.inventoryContainer.getSlot(var3).getStack();
            Item var5 = var4.getItem();
            if (var4.getItemDamage() == 3 && !var4.getDisplayName().contains("Backpack")) {
               boolean var10000;
               if (!this.Field2619.getBooleanValue() || Item.getIdFromItem(var5) != Item.getIdFromItem(Items.skull) && Item.getIdFromItem(var5) != Item.getIdFromItem(Items.baked_potato) || mc.thePlayer.isPotionActive(Potion.regeneration) && (mc.thePlayer.getActivePotionEffect(Potion.regeneration).getAmplifier() >= 2 || mc.thePlayer.getActivePotionEffect(Potion.regeneration).getDuration() > 1) && (!(mc.thePlayer.getAbsorptionAmount() <= 0.0F) || var4.stackSize < 1)) {
                  var10000 = false;
               } else {
                  var10000 = true;
               }

               if (Item.getIdFromItem(var5) != 282) {
                  ;
               }

               var2 = var3;
            }
         }

         ++var3;
      }

      return var2;
   }
}
