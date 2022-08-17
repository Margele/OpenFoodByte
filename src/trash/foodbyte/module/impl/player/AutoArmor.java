package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class655;
import eventapi.EventTarget;
import java.util.Arrays;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus.EnumState;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AutoArmor extends Module {
   private TimeHelper Field2460 = new TimeHelper();
   public static ModeValue Field2461 = new ModeValue("AutoArmor", "Mode", "Vanilla", new String[]{"Vanilla", "OpenInv", "FakeInv"}, "{普通模式,打开背包再穿,伪装打开背包穿}");
   public static FloatValue Field2462 = new FloatValue("AutoArmor", "Delay", 1.0, 0.0, 5.0, 0.1, "穿装备延迟1为一秒");
   public boolean Field2463;
   public long Field2464;

   public AutoArmor() {
      super("AutoArmor", "Auto Armor", Category.PLAYER);
   }

   public String getDescription() {
      return "自动穿装备";
   }

   @EventTarget
   public void Method1066(Class655 a) {
      if (Field2461.isCurrentMode("OpenInv") && a.Method3582() instanceof GuiInventory) {
         this.Field2460.Method216((int)(1000.0F * Field2462.getFloatValueCast() - 80.0F));
         this.Field2464 = System.currentTimeMillis();
      }

   }

   @EventTarget(0)
   public void Method712(EventMotion a) {
      if (!a.isPost()) {
         if (!ServerUtils.isPlayingSkyblock()) {
            if (!Field2461.isCurrentMode("OpenInv") || mc.currentScreen instanceof GuiInventory) {
               if (mc.currentScreen == null || mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChat) {
                  this.Method258();
               }

            }
         }
      }
   }

   public void Method258() {
      Class148.Method1445();
      int var2 = 1;
      if (var2 < 5) {
         if (mc.thePlayer.inventoryContainer.getSlot(4 + var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(4 + var2).getStack();
            if (Method1695(var3, var2)) {
               ;
            }

            if (this.Field2460.Method211((long)(1000.0F * Field2462.getFloatValueCast()))) {
               if (Field2461.isCurrentMode("FakeInv")) {
                  Wrapper.INSTANCE.sendPacket(new C16PacketClientStatus(EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                  this.Field2463 = true;
               }

               if (this.Method713()) {
                  this.Method234(4 + var2);
               }

               this.Method233(4 + var2);
            }
         }

         int var5 = 9;
         if (var5 < 45) {
            if (mc.thePlayer.inventoryContainer.getSlot(var5).getHasStack()) {
               ItemStack var4 = mc.thePlayer.inventoryContainer.getSlot(var5).getStack();
               if (this.Field2460.Method211((long)(1000.0F * Field2462.getFloatValueCast())) && Method239(var4, var2) && Method238(var4) > 0.0F) {
                  if (Field2461.isCurrentMode("FakeInv") && !this.Field2463) {
                     Wrapper.INSTANCE.sendPacket(new C16PacketClientStatus(EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                     this.Field2463 = false;
                  }

                  this.Method233(var5);
                  if (Field2461.isCurrentMode("FakeInv")) {
                     Wrapper.INSTANCE.sendPacket(new C0DPacketCloseWindow(0));
                     this.Field2463 = false;
                  }

                  this.Field2460.reset();
               }
            }

            ++var5;
         }

         ++var2;
      }

   }

   public static boolean Method239(ItemStack a, int a) {
      float var2 = Method238(a);
      String var3 = "";
      if (a == 1) {
         var3 = "helmet";
      } else if (a == 2) {
         var3 = "chestplate";
      } else if (a == 3) {
         var3 = "leggings";
      } else if (a == 4) {
         var3 = "boots";
      }

      if (!a.getUnlocalizedName().contains(var3)) {
         return false;
      } else {
         for(int var4 = 5; var4 < 45; ++var4) {
            if (mc.thePlayer.inventoryContainer.getSlot(var4).getHasStack()) {
               ItemStack var5 = mc.thePlayer.inventoryContainer.getSlot(var4).getStack();
               if (Method238(var5) > var2 && var5.getUnlocalizedName().contains(var3)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static boolean Method1695(ItemStack a, int a) {
      float var2 = Method238(a);
      String var3 = "";
      if (a == 1) {
         var3 = "helmet";
      } else if (a == 2) {
         var3 = "chestplate";
      } else if (a == 3) {
         var3 = "leggings";
      } else if (a == 4) {
         var3 = "boots";
      }

      for(int var4 = 5; var4 < 45; ++var4) {
         if (mc.thePlayer.inventoryContainer.getSlot(var4).getHasStack()) {
            ItemStack var5 = mc.thePlayer.inventoryContainer.getSlot(var4).getStack();
            if (Method238(var5) > var2 && var5.getUnlocalizedName().contains(var3)) {
               return false;
            }
         }
      }

      return true;
   }

   public void Method233(int a) {
      mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, a, 0, 1, mc.thePlayer);
   }

   public void Method234(int a) {
      mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, a, 1, 4, mc.thePlayer);
   }

   public static float Method238(ItemStack a) {
      float var1 = 0.0F;
      if (a.getItem() instanceof ItemArmor) {
         ItemArmor var2 = (ItemArmor)a.getItem();
         var1 = (float)((double)var1 + (double)var2.damageReduceAmount + (double)((100 - var2.damageReduceAmount) * EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, a)) * 0.0075);
         var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.depthStrider.effectId, a) / 45.0);
         var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.featherFalling.effectId, a) / 40.0);
         var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.blastProtection.effectId, a) / 100.0);
         var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireProtection.effectId, a) / 100.0);
         var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.thorns.effectId, a) / 100.0);
         var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a) / 50.0);
         var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.projectileProtection.effectId, a) / 100.0);
         var1 = a.getDisplayName().toLowerCase().contains("§abarbarian chestplate") ? 10.76F : var1;
         var1 = a.getDisplayName().toLowerCase().contains("§6exodus") ? 5.91F : var1;
         var1 = a.getDisplayName().toLowerCase().contains("§ashoes of vidar") ? 5.91F : var1;
         var1 = a.getDisplayName().toLowerCase().contains("§ahermes' boots") ? 5.91F : var1;
      }

      return var1;
   }

   public boolean Method713() {
      return !Arrays.asList(mc.thePlayer.inventory.mainInventory).contains((Object)null);
   }
}
