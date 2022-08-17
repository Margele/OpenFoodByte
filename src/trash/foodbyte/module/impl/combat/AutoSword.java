package trash.foodbyte.module.impl.combat;

import awsl.Class655;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AutoSword extends Module {
   public static ModeValue Field2608 = new ModeValue("AutoSword", "Mode", "Vanilla", new String[]{"Vanilla", "OpenInv"}, "{普通模式,打开背包再穿}");
   public static FloatValue Field2609 = new FloatValue("AutoSword", "Slot", 1.0, 1.0, 9.0, 1.0, "递出最好的剑到几号物品栏");
   public static BooleanValue Field2610 = new BooleanValue("AutoSword", "TargetSword", true, "安全杀戮攻击时自动切换到武器(每秒检测一次)");
   TimeHelper Field2611 = new TimeHelper();
   TimeHelper Field2612 = new TimeHelper();
   public static int Field2613 = 36;
   private static long Field2614 = -1L;

   public AutoSword() {
      super("AutoSword", "Auto Sword", Category.COMBAT);
      this.setDescription("自动递出最好的剑");
   }

   @EventTarget
   public void Method1066(Class655 a) {
      if (a.Method3582() instanceof GuiInventory) {
         if (this.Method805()) {
            mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, -999, 0, 4, mc.thePlayer);
            this.Field2611.reset();
         }

         Field2614 = System.currentTimeMillis();
      }

   }

   public boolean Method713() {
      return System.currentTimeMillis() - Field2614 > 200L;
   }

   @EventTarget
   public void Method755(EventTick a) {
      if (!ServerUtils.isSinglePlayer(Servers.SG) || !ServerUtils.isStartingGame()) {
         if (!ServerUtils.isSinglePlayer(Servers.SB) && !ServerUtils.isSinglePlayer(Servers.MM) && !ServerUtils.isSinglePlayer(Servers.PRE)) {
            if (KillAura.target != null && Field2610.getBooleanValue()) {
               if (mc.thePlayer.inventory.getCurrentItem() != null && mc.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemSword) {
                  this.Field2612.reset();
               }

               if (mc.thePlayer.inventory.currentItem != Field2609.getFloatValue().intValue() - 1 && this.Field2612.isDelayComplete(1000.0)) {
                  Wrapper.INSTANCE.sendPacket(new C09PacketHeldItemChange(mc.thePlayer.inventory.currentItem = Field2609.getFloatValue().intValue() - 1));
                  mc.playerController.updateController();
                  this.Field2612.reset();
               }
            }

            if (!Field2608.isCurrentMode("OpenInv") || mc.currentScreen instanceof GuiInventory) {
               if ((mc.currentScreen == null || mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChat) && this.Field2611.isDelayComplete(100.0) && Field2613 >= 36) {
                  if (!Method237(mc.thePlayer.inventoryContainer.getSlot(Field2613 + Field2609.getFloatValue().intValue() - 1).getStack())) {
                     this.Method233(Field2613);
                  }

                  this.Field2611.reset();
               }

            }
         }
      }
   }

   public boolean Method805() {
      return this.Method1153() && !Method237(mc.thePlayer.inventoryContainer.getSlot(Field2613 + Field2609.getFloatValue().intValue() - 1).getStack());
   }

   public boolean Method1153() {
      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (a.getItem() instanceof ItemSword) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean Method237(ItemStack a) {
      a[] a = b.trash();
      if (Objects.isNull(a)) {
         return false;
      } else {
         float a = Method238(a);
         int a = 9;
         if (a < 45) {
            if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
               ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
               if (Method238(a) > a && a.getItem() instanceof ItemSword) {
                  return false;
               }
            }

            ++a;
         }

         return a.getItem() instanceof ItemSword;
      }
   }

   public void Method235(int a, int a) {
      mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, a, a, 2, mc.thePlayer);
   }

   public void Method233(int a) {
      b.trash();
      int a = 9;
      if (a < 45) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (Method237(a) && Method238(a) > 0.0F && a.getItem() instanceof ItemSword) {
               this.Method235(a, a - 36 + Field2609.getFloatValue().intValue() - 1);
            }
         }

         ++a;
      }

   }

   private static float Method238(ItemStack a) {
      float a = 0.0F;
      Item a = a.getItem();
      if (a instanceof ItemTool) {
         a += PlayerUtils.Method1590(a);
      }

      if (a instanceof ItemSword) {
         a += PlayerUtils.Method1590(a);
      }

      a += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a) * 0.5F;
      return a;
   }
}
