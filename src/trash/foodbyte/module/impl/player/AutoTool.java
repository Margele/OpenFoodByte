package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging.Action;
import net.minecraft.util.BlockPos;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;

public class AutoTool extends Module {
   boolean Field2691;
   boolean Field2692;
   public BooleanValue Field2693 = new BooleanValue("AutoTool", "SwordCheck", false, "手拿剑不自动切换工具");
   public BooleanValue Field2694 = new BooleanValue("AutoTool", "EatCheck", true, "吃东西时左键不自动切换工具");

   public AutoTool() {
      super("AutoTool", "Auto Tool", Category.PLAYER);
   }

   public String getDescription() {
      return "挖矿自动切换工具";
   }

   @EventTarget
   public void Method801(EventTickUpdate a) {
      int var2 = Class148.Method1445();
      if (!Objects.isNull(mc.theWorld)) {
         if (this.Field2691 && mc.thePlayer.getHeldItem() == null) {
            this.Field2691 = false;
         }

         if (mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
            this.Field2691 = true;
         }

         this.Field2691 = false;
         if (ReflectionUtils.getItemInUseCount() > 0.0F && mc.thePlayer.getHeldItem().getItem() instanceof ItemFood) {
            this.Field2692 = true;
         }

         this.Field2692 = false;
      }
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (!a.isRecieve()) {
         if (a.getPacket() instanceof C07PacketPlayerDigging) {
            C07PacketPlayerDigging var2 = (C07PacketPlayerDigging)a.getPacket();
            if (var2.getStatus() == Action.START_DESTROY_BLOCK) {
               if (this.Field2693.getValue() && this.Field2691 && !AntiObbyTrap.Field2468) {
                  return;
               }

               if (this.Field2694.getValue() && this.Field2692) {
                  return;
               }

               Method1178(var2.getPosition());
            }

         }
      }
   }

   private static void Method1178(BlockPos a) {
      Block var1 = mc.theWorld.getBlockState(a).getBlock();
      int var2 = Method1179(var1);
   }

   public static void Method258() {
      Class148.Method1445();
      Object var1 = null;
      int var2 = 0;
      if (var2 < 9) {
         ItemStack var3 = mc.thePlayer.inventory.mainInventory[var2];
         if (var3.getItem() == null) {
            ;
         }

         if (var3.getItem() instanceof ItemSword) {
            ItemSword var4 = (ItemSword)var3.getItem();
            mc.thePlayer.inventory.currentItem = var2;
            if (var4.getDamageVsEntity() > var4.getDamageVsEntity()) {
               ;
            }

            mc.thePlayer.inventory.currentItem = var2;
         }

         ++var2;
      }

   }

   private static int Method1179(Block a) {
      float var1 = Float.NEGATIVE_INFINITY;
      int var2 = -1;

      for(int var3 = 0; var3 < 9; ++var3) {
         ItemStack var5 = mc.thePlayer.inventory.mainInventory[var3];
         float var4;
         if (var5.getItem() != null && (var4 = Method1180(a, var5)) > var1 && var4 != 1.0F) {
            var2 = var3;
            var1 = var4;
         }
      }

      return var2;
   }

   public static float Method1180(Block a, ItemStack a) {
      float var2 = a.getStrVsBlock(a);
      int var3 = Block.getIdFromBlock(a);
      if (a.getUnlocalizedName().contains("Stone") && (var3 == 14 || var3 == 129 || var3 == 56 || var3 == 74 || var3 == 73)) {
         return 5.0F;
      } else if (EnchantmentHelper.getEnchantments(a).containsKey(Enchantment.efficiency.effectId) && var2 != 1.0F) {
         int var4 = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, a);
         return var2 + (float)(var4 * var4 + 1);
      } else {
         return var2;
      }
   }
}
