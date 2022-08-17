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
            C07PacketPlayerDigging a = (C07PacketPlayerDigging)a.getPacket();
            if (a.getStatus() == Action.START_DESTROY_BLOCK) {
               if (this.Field2693.getValue() && this.Field2691 && !AntiObbyTrap.Field2468) {
                  return;
               }

               if (this.Field2694.getValue() && this.Field2692) {
                  return;
               }

               Method1178(a.getPosition());
            }

         }
      }
   }

   private static void Method1178(BlockPos a) {
      Block a = mc.theWorld.getBlockState(a).getBlock();
      int a = Method1179(a);
   }

   public static void Method258() {
      Class148.Method1445();
      ItemSword a = null;
      int a = 0;
      if (a < 9) {
         ItemStack a = mc.thePlayer.inventory.mainInventory[a];
         if (a.getItem() == null) {
            ;
         }

         if (a.getItem() instanceof ItemSword) {
            ItemSword a = (ItemSword)a.getItem();
            mc.thePlayer.inventory.currentItem = a;
            if (a.getDamageVsEntity() > a.getDamageVsEntity()) {
               ;
            }

            mc.thePlayer.inventory.currentItem = a;
         }

         ++a;
      }

   }

   private static int Method1179(Block a) {
      float a = Float.NEGATIVE_INFINITY;
      int a = -1;

      for(int a = 0; a < 9; ++a) {
         ItemStack a = mc.thePlayer.inventory.mainInventory[a];
         float a;
         if (a.getItem() != null && (a = Method1180(a, a)) > a && a != 1.0F) {
            a = a;
            a = a;
         }
      }

      return a;
   }

   public static float Method1180(Block a, ItemStack a) {
      float a = a.getStrVsBlock(a);
      int a = Block.getIdFromBlock(a);
      if (a.getUnlocalizedName().contains("Stone") && (a == 14 || a == 129 || a == 56 || a == 74 || a == 73)) {
         return 5.0F;
      } else if (EnchantmentHelper.getEnchantments(a).containsKey(Enchantment.efficiency.effectId) && a != 1.0F) {
         int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, a);
         return a + (float)(a * a + 1);
      } else {
         return a;
      }
   }
}
