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
      int a = 1;
      if (a < 5) {
         if (mc.thePlayer.inventoryContainer.getSlot(4 + a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(4 + a).getStack();
            if (Method1695(a, a)) {
               ;
            }

            if (this.Field2460.Method211((long)(1000.0F * Field2462.getFloatValueCast()))) {
               if (Field2461.isCurrentMode("FakeInv")) {
                  Wrapper.INSTANCE.sendPacket(new C16PacketClientStatus(EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                  this.Field2463 = true;
               }

               if (this.Method713()) {
                  this.Method234(4 + a);
               }

               this.Method233(4 + a);
            }
         }

         int a = 9;
         if (a < 45) {
            if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
               ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
               if (this.Field2460.Method211((long)(1000.0F * Field2462.getFloatValueCast())) && Method239(a, a) && Method238(a) > 0.0F) {
                  if (Field2461.isCurrentMode("FakeInv") && !this.Field2463) {
                     Wrapper.INSTANCE.sendPacket(new C16PacketClientStatus(EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                     this.Field2463 = false;
                  }

                  this.Method233(a);
                  if (Field2461.isCurrentMode("FakeInv")) {
                     Wrapper.INSTANCE.sendPacket(new C0DPacketCloseWindow(0));
                     this.Field2463 = false;
                  }

                  this.Field2460.reset();
               }
            }

            ++a;
         }

         ++a;
      }

   }

   public static boolean Method239(ItemStack a, int a) {
      float a = Method238(a);
      String a = "";
      if (a == 1) {
         a = "helmet";
      } else if (a == 2) {
         a = "chestplate";
      } else if (a == 3) {
         a = "leggings";
      } else if (a == 4) {
         a = "boots";
      }

      if (!a.getUnlocalizedName().contains(a)) {
         return false;
      } else {
         for(int a = 5; a < 45; ++a) {
            if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
               ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
               if (Method238(a) > a && a.getUnlocalizedName().contains(a)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static boolean Method1695(ItemStack a, int a) {
      float a = Method238(a);
      String a = "";
      if (a == 1) {
         a = "helmet";
      } else if (a == 2) {
         a = "chestplate";
      } else if (a == 3) {
         a = "leggings";
      } else if (a == 4) {
         a = "boots";
      }

      for(int a = 5; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (Method238(a) > a && a.getUnlocalizedName().contains(a)) {
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
      float a = 0.0F;
      if (a.getItem() instanceof ItemArmor) {
         ItemArmor a = (ItemArmor)a.getItem();
         a = (float)((double)a + (double)a.damageReduceAmount + (double)((100 - a.damageReduceAmount) * EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, a)) * 0.0075);
         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.depthStrider.effectId, a) / 45.0);
         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.featherFalling.effectId, a) / 40.0);
         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.blastProtection.effectId, a) / 100.0);
         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireProtection.effectId, a) / 100.0);
         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.thorns.effectId, a) / 100.0);
         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a) / 50.0);
         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.projectileProtection.effectId, a) / 100.0);
         a = a.getDisplayName().toLowerCase().contains("§abarbarian chestplate") ? 10.76F : a;
         a = a.getDisplayName().toLowerCase().contains("§6exodus") ? 5.91F : a;
         a = a.getDisplayName().toLowerCase().contains("§ashoes of vidar") ? 5.91F : a;
         a = a.getDisplayName().toLowerCase().contains("§ahermes' boots") ? 5.91F : a;
      }

      return a;
   }

   public boolean Method713() {
      return !Arrays.asList(mc.thePlayer.inventory.mainInventory).contains((Object)null);
   }
}
