package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemGlassBottle;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.AutoSword;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class InvCleaner extends Module {
   private static List Field2720;
   public ModeValue Field2721 = new ModeValue("InvCleaner", "Mode", "Basic", new String[]{"Basic", "OpenInv"}, "模式选择");
   public ModeValue Field2722 = new ModeValue("InvCleaner", "Item List", "SkyWars", new String[]{"SkyWars", "UHC"}, "{空岛模式,UHC模式}");
   public FloatValue Field2723 = new FloatValue("InvCleaner", "Blockcap", 128.0, 0.0, 512.0, 8.0, "留多少方块在背包里");
   public FloatValue Field2724 = new FloatValue("InvCleaner", "Delay", 1.0, 1.0, 10.0, 1.0, "丢物品延迟");
   public BooleanValue Field2725 = new BooleanValue("InvCleaner", "Tools", true, "是否保留工具");
   public BooleanValue Field2726 = new BooleanValue("InvCleaner", "Archery", true, "是否丢掉弓和弓箭");
   public BooleanValue Field2727 = new BooleanValue("InvCleaner", "FOOD", true, "是否保留食物");
   public BooleanValue Field2728 = new BooleanValue("InvCleaner", "Toggle", false, "扔完后是否关闭功能");
   public static TimeHelper Field2729 = new TimeHelper();
   ArrayList Field2730 = new ArrayList();
   public static int Field2731 = 36;
   public static int Field2732 = 37;
   public static int Field2733 = 38;
   public static int Field2734 = 39;
   public static int Field2735 = 36;
   public static int Field2736 = 42;
   public static int Field2737 = 43;
   public static int Field2738 = 44;

   public static List Method231() {
      return Field2720;
   }

   public InvCleaner() {
      super("InvCleaner", "Inv Cleaner", Category.PLAYER);
      this.setDescription("背包清理(自动丢垃圾)");
      Field2720 = Arrays.asList(Blocks.crafting_table, Blocks.gold_ore, Blocks.anvil, Blocks.tnt, Blocks.gold_block, Blocks.iron_block, Blocks.diamond_block);
   }

   @EventTarget
   public void Method232(EventUpdate a) {
      try {
         if (this.Field2725.getBooleanValue()) {
            if (ServerUtils.isInDeadMatch()) {
               Field2736 = -1;
               Field2737 = -1;
               Field2738 = -1;
            } else {
               Field2736 = 42;
               Field2737 = 43;
               Field2738 = 44;
            }
         } else {
            Field2736 = -1;
            Field2737 = -1;
            Field2738 = -1;
         }

         long a = this.Field2724.getFloatValue().longValue() * 50L;
         if (!mc.thePlayer.isEntityAlive() || mc.currentScreen instanceof GuiGameOver) {
            this.Method1028();
            return;
         }

         if (mc.thePlayer.ticksExisted <= 1) {
            this.Method1028();
            return;
         }

         long a = AutoArmor.Field2462.getFloatValue().longValue() * 50L;
         if (Field2729.isDelayComplete((double)a) && ModuleManager.getModule(AutoArmor.class).getState() && (!AutoArmor.Field2461.isCurrentMode("OpenInv") || mc.currentScreen instanceof GuiInventory) && mc.currentScreen != null && !(mc.currentScreen instanceof GuiInventory) && mc.currentScreen instanceof GuiChat) {
         }

         int a;
         ItemStack a;
         if (ModuleManager.getModule(AutoArmor.class).getState()) {
            for(a = 1; a < 5; ++a) {
               if (mc.thePlayer.inventoryContainer.getSlot(4 + a).getHasStack()) {
                  a = mc.thePlayer.inventoryContainer.getSlot(4 + a).getStack();
                  if (!AutoArmor.Method239(a, a)) {
                     return;
                  }
               } else if (this.Method257(a - 1)) {
                  return;
               }
            }
         }

         if (this.Field2721.isCurrentMode("OpenInv") && !(mc.currentScreen instanceof GuiInventory)) {
            return;
         }

         if (mc.currentScreen == null || mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChat) {
            if (Field2729.isDelayComplete((double)a) && Field2738 >= 36) {
               this.Method249(Field2738);
            }

            if (Field2729.isDelayComplete((double)a) && Field2736 >= 36) {
               this.Method250(Field2736);
            }

            if (Field2729.isDelayComplete((double)a) && Field2737 >= 36) {
               this.Method251(Field2737);
            }

            if (Field2729.isDelayComplete((double)a)) {
               for(a = 9; a < 45; ++a) {
                  if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
                     a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
                     if (this.Method239(a, a)) {
                        this.Method236(a);
                        Field2729.reset();
                        if (a > 0L) {
                           break;
                        }
                     }
                  }

                  if (a == 44 && this.Field2728.getBooleanValue()) {
                     Wrapper.INSTANCE.sendPacket(new C0DPacketCloseWindow(0));
                     this.Method1028();
                  }
               }
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void Method233(int a) {
      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (this.Method237(a) && Method238(a) > 0.0F && a.getItem() instanceof ItemSword) {
               this.Method235(a, a - 36);
               Field2729.reset();
               break;
            }
         }
      }

   }

   public void Method234(int a) {
      mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, a, 0, 1, mc.thePlayer);
   }

   public void Method235(int a, int a) {
      mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, a, a, 2, mc.thePlayer);
   }

   public void Method236(int a) {
      mc.playerController.windowClick(mc.thePlayer.inventoryContainer.windowId, a, 1, 4, mc.thePlayer);
   }

   public boolean Method237(ItemStack a) {
      float a = Method238(a);

      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (Method238(a) > a && a.getItem() instanceof ItemSword) {
               return false;
            }
         }
      }

      if (a.getItem() instanceof ItemSword) {
         return true;
      } else {
         return false;
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

      a += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a) * 0.25F;
      return a;
   }

   public boolean Method239(ItemStack a, int a) {
      if (a == Field2735 + AutoSword.Field2609.getFloatValue().intValue() - 1 && this.Method237(mc.thePlayer.inventoryContainer.getSlot(Field2735 + AutoSword.Field2609.getFloatValue().intValue() - 1).getStack())) {
         return false;
      } else {
         return (a != Field2738 || !this.Method252(mc.thePlayer.inventoryContainer.getSlot(Field2738).getStack()) || Field2738 < 0) && (a != Field2737 || !this.Method254(mc.thePlayer.inventoryContainer.getSlot(Field2737).getStack()) || Field2737 < 0) && (a != Field2736 || !this.Method253(mc.thePlayer.inventoryContainer.getSlot(Field2736).getStack()) || Field2736 < 0) ? this.Method240(a) : false;
      }
   }

   private boolean Method240(ItemStack a) {
      Class148.Method1445();
      Item a = a.getItem();
      int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a);
      int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a);
      int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, a);
      int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, a);
      if (a.getItem() instanceof ItemArmor) {
         int a = 1;
         if (a < 5) {
            if (mc.thePlayer.inventoryContainer.getSlot(4 + a).getHasStack()) {
               ItemStack a = mc.thePlayer.inventoryContainer.getSlot(4 + a).getStack();
               if (AutoArmor.Method239(a, a)) {
                  ;
               }
            }

            if (AutoArmor.Method239(a, a)) {
               return false;
            }

            ++a;
         }
      }

      if (a.getItem() instanceof ItemPotion && this.Method256(a)) {
         return true;
      } else if (Item.getIdFromItem(a) == 326 && this.Method244() <= 1) {
         return false;
      } else if (a.getItem() instanceof ItemFishingRod && this.Method261(a)) {
         return false;
      } else if (a.getItem() instanceof ItemBow && this.Method259(a)) {
         return false;
      } else {
         if (this.Field2722.isCurrentMode("SkyWars")) {
            if (a.getItem() instanceof ItemBlock && this.Method242() > this.Field2723.getFloatValue().intValue()) {
               return true;
            }

            if (a.getItem().getUnlocalizedName().contains("stick") || a.getItem().getUnlocalizedName().contains("string") || a.getItem().getUnlocalizedName().contains("cake") || a.getItem().getUnlocalizedName().contains("mushroom") || a.getItem().getUnlocalizedName().contains("flint") || a.getItem().getUnlocalizedName().contains("dyePowder") || a.getItem().getUnlocalizedName().contains("feather") || a.getItem().getUnlocalizedName().contains("bucket") || a.getItem().getUnlocalizedName().contains("chest") && !a.getDisplayName().toLowerCase().contains("collect") || a.getItem().getUnlocalizedName().contains("fish") || a.getItem().getUnlocalizedName().contains("fish") || a.getItem().getUnlocalizedName().contains("enchant") || a.getItem().getUnlocalizedName().contains("exp") || a.getItem().getUnlocalizedName().contains("shears") || a.getItem().getUnlocalizedName().contains("anvil") || a.getItem().getUnlocalizedName().contains("torch") || a.getItem().getUnlocalizedName().contains("seeds") || a.getItem().getUnlocalizedName().contains("leather") || a.getItem().getUnlocalizedName().contains("reeds") || a.getItem().getUnlocalizedName().contains("Iron") || a.getItem().getUnlocalizedName().contains("Tag") || a.getItem().getUnlocalizedName().contains("slime") || a.getItem().getUnlocalizedName().contains("sign") || a.getItem().getUnlocalizedName().contains("blaze") || a.getItem().getUnlocalizedName().contains("horse") || a.getItem().getUnlocalizedName().contains("coal") || a.getItem().getUnlocalizedName().contains("bone") || a.getItem().getUnlocalizedName().contains("Gunpowder") || a.getItem().getUnlocalizedName().contains("paper") || a.getItem().getUnlocalizedName().contains("book") || a.getItem().getUnlocalizedName().contains("redstone") || a.getItem().getUnlocalizedName().contains("skull") || a.getItem().getUnlocalizedName().contains("record") || a.getItem().getUnlocalizedName().contains("wheat") || a.getItem() instanceof ItemGlassBottle || a.getItem().getUnlocalizedName().contains("piston")) {
               return true;
            }
         }

         if (this.Field2722.isCurrentMode("UHC")) {
            label463: {
               if (a.getItem() instanceof ItemBlock && Field2720.contains(((ItemBlock)a.getItem()).getBlock())) {
                  return false;
               }

               if (a.getItem() instanceof ItemBlock && this.Method242() > this.Field2723.getFloatValue().intValue()) {
                  return true;
               }

               if (a.getDisplayName().toLowerCase().contains("dragon armor") || a.getDisplayName().toLowerCase().contains("death's scythe") || a.getDisplayName().toLowerCase().contains("barbarian chestplate") || a.getDisplayName().toLowerCase().contains("exodus") || a.getDisplayName().toLowerCase().contains("exper seal") || a.getDisplayName().toLowerCase().contains("úril") || a.getDisplayName().toLowerCase().contains("perun") || a.getDisplayName().toLowerCase().contains("leviathan") || a.getDisplayName().toLowerCase().contains("excalibur") || a.getDisplayName().toLowerCase().contains("§cfusion")) {
                  return false;
               }

               if (!a.getDisplayName().toLowerCase().contains("§a潮汐护腿") && !a.getDisplayName().toLowerCase().contains("§a永生帽") && !a.getDisplayName().toLowerCase().contains("§a霹隆之斧") && !a.getDisplayName().toLowerCase().contains("§a安都瑞尔之剑") && !a.getDisplayName().toLowerCase().contains("§a丰饶之角") && !a.getDisplayName().toLowerCase().contains("§a蛮族之甲") && !a.getDisplayName().toLowerCase().contains("a巨龙之剑") && !a.getDisplayName().contains("Axe of Perun")) {
                  if (!a.getDisplayName().toLowerCase().contains("§aforge") && !a.getDisplayName().toLowerCase().contains("§a锻炉") && !a.getDisplayName().toLowerCase().contains("backpack")) {
                     if (a.getDisplayName().toLowerCase().contains("bloodlust")) {
                        return false;
                     }

                     if (!a.getDisplayName().contains("Wither Skeleton Skull") && !a.getDisplayName().contains("Creeper Head") && !a.getDisplayName().contains("Skeleton Skull") && !a.getDisplayName().contains("Zombie Head")) {
                        if (Item.getIdFromItem(a) == 397 && a.getItemDamage() == 3) {
                           return false;
                        }

                        if (Item.getIdFromItem(a) == 276 && (a >= 3 || a >= 1)) {
                           return false;
                        }

                        if (a.getItem() instanceof ItemEnchantedBook) {
                           NBTTagList a = Items.enchanted_book.getEnchantments(a);
                           int a = 0;
                           if (a < a.tagCount()) {
                              int a = a.getCompoundTagAt(a).getShort("id");
                              int a = a.getCompoundTagAt(a).getShort("lvl");
                              if (a == Enchantment.sharpness.effectId && a >= 3 || a == Enchantment.fireAspect.effectId || a == Enchantment.efficiency.effectId && a >= 3 || a == Enchantment.fortune.effectId || a == Enchantment.featherFalling.effectId && a >= 3 || a == Enchantment.protection.effectId || a == Enchantment.punch.effectId || a == Enchantment.flame.effectId || a == Enchantment.infinity.effectId || a == Enchantment.depthStrider.effectId) {
                                 return false;
                              }

                              ++a;
                           }

                           return true;
                        }

                        if (a.getDisplayName().toLowerCase().contains("k||") || a.getDisplayName().toLowerCase().contains("cornucopia")) {
                           return false;
                        }

                        if (Item.getIdFromItem(a) == 263 && this.Method243() <= 64) {
                           return false;
                        }

                        if (Item.getIdFromItem(a) == 345 && this.Method247() <= 1) {
                           return false;
                        }

                        if (Item.getIdFromItem(a) == 265 && this.Method248() <= 64) {
                           return false;
                        }

                        if (!a.getItem().getUnlocalizedName().contains("stick") && !a.getItem().getUnlocalizedName().contains("string") && !a.getItem().getUnlocalizedName().contains("cake") && !a.getItem().getUnlocalizedName().contains("mushroom") && !a.getItem().getUnlocalizedName().contains("flint") && !a.getItem().getUnlocalizedName().contains("dyePowder") && !a.getItem().getUnlocalizedName().contains("feather") && !a.getItem().getUnlocalizedName().contains("bucket") && (!a.getItem().getUnlocalizedName().contains("chest") || a.getDisplayName().toLowerCase().contains("collect")) && !a.getItem().getUnlocalizedName().contains("fish") && !a.getItem().getUnlocalizedName().contains("fish") && !a.getItem().getUnlocalizedName().contains("enchant") && !a.getItem().getUnlocalizedName().contains("exp") && !a.getItem().getUnlocalizedName().contains("shears") && !a.getItem().getUnlocalizedName().contains("anvil") && !a.getItem().getUnlocalizedName().contains("torch") && !a.getItem().getUnlocalizedName().contains("seeds") && !a.getItem().getUnlocalizedName().contains("leather") && !a.getItem().getUnlocalizedName().contains("reeds") && !a.getItem().getUnlocalizedName().contains("Iron") && !a.getItem().getUnlocalizedName().contains("Tag") && !a.getItem().getUnlocalizedName().contains("slime") && !a.getItem().getUnlocalizedName().contains("sign") && !a.getItem().getUnlocalizedName().contains("blaze") && !a.getItem().getUnlocalizedName().contains("horse") && !a.getItem().getUnlocalizedName().contains("coal") && !a.getItem().getUnlocalizedName().contains("bone") && !a.getItem().getUnlocalizedName().contains("Gunpowder") && !a.getItem().getUnlocalizedName().contains("paper") && !a.getItem().getUnlocalizedName().contains("book") && !a.getItem().getUnlocalizedName().contains("redstone") && !a.getItem().getUnlocalizedName().contains("skull") && !a.getItem().getUnlocalizedName().contains("record") && !a.getItem().getUnlocalizedName().contains("wheat") && !(a.getItem() instanceof ItemGlassBottle) && !a.getItem().getUnlocalizedName().contains("piston")) {
                           break label463;
                        }

                        return true;
                     }

                     return true;
                  }

                  return false;
               }

               return false;
            }
         }

         if (a.getItem().getUnlocalizedName().contains("arrow") && this.Field2726.getBooleanValue()) {
            return true;
         } else if (a.getItem() instanceof ItemBow) {
            return true;
         } else if (!(a.getItem() instanceof ItemAppleGold) && !a.getItem().getUnlocalizedName().contains("apple")) {
            if (a.getItem() instanceof ItemFood && this.Field2727.getBooleanValue()) {
               return true;
            } else if (!(a.getItem() instanceof ItemHoe) && !(a.getItem() instanceof ItemTool) && !(a.getItem() instanceof ItemSword) && !(a.getItem() instanceof ItemArmor)) {
               return false;
            } else {
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public ArrayList Method241() {
      return this.Field2730;
   }

   private int Method242() {
      int a = 0;

      for(int a = 0; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (a.getItem() instanceof ItemBlock) {
               a += a.stackSize;
            }
         }
      }

      return a;
   }

   private int Method243() {
      int a = 0;

      for(int a = 0; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (Item.getIdFromItem(a) == 263) {
               a += a.stackSize;
            }
         }
      }

      return a;
   }

   private int Method244() {
      int a = 0;

      for(int a = 0; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (Item.getIdFromItem(a) == 326) {
               a += a.stackSize;
            }
         }
      }

      return a;
   }

   private int Method245() {
      int a = 0;

      for(int a = 0; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (a instanceof ItemFishingRod) {
               a += a.stackSize;
            }
         }
      }

      return a;
   }

   private int Method246() {
      int a = 0;

      for(int a = 0; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (a.getItem() instanceof ItemBow) {
               a += a.stackSize;
            }
         }
      }

      return a;
   }

   private int Method247() {
      int a = 0;

      for(int a = 0; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (Item.getIdFromItem(a) == 345) {
               a += a.stackSize;
            }
         }
      }

      return a;
   }

   private int Method248() {
      int a = 0;

      for(int a = 0; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (Item.getIdFromItem(a) == 265) {
               a += a.stackSize;
            }
         }
      }

      return a;
   }

   private void Method249(int a) {
      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (this.Method252(a) && Field2738 != a && !this.Method237(a)) {
               if (!mc.thePlayer.inventoryContainer.getSlot(Field2738).getHasStack()) {
                  this.Method235(a, Field2738 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               } else if (!this.Method252(mc.thePlayer.inventoryContainer.getSlot(Field2738).getStack())) {
                  this.Method235(a, Field2738 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               }
            }
         }
      }

   }

   private void Method250(int a) {
      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (this.Method253(a) && Field2736 != a && !this.Method237(a)) {
               if (!mc.thePlayer.inventoryContainer.getSlot(Field2736).getHasStack()) {
                  this.Method235(a, Field2736 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               } else if (!this.Method253(mc.thePlayer.inventoryContainer.getSlot(Field2736).getStack())) {
                  this.Method235(a, Field2736 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               }
            }
         }
      }

   }

   private void Method251(int a) {
      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (this.Method254(a) && Field2737 != a && !this.Method237(a)) {
               if (!mc.thePlayer.inventoryContainer.getSlot(Field2737).getHasStack()) {
                  this.Method235(a, Field2737 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               } else if (!this.Method254(mc.thePlayer.inventoryContainer.getSlot(Field2737).getStack())) {
                  this.Method235(a, Field2737 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               }
            }
         }
      }

   }

   private boolean Method252(ItemStack a) {
      Item a = a.getItem();
      if (!(a instanceof ItemPickaxe)) {
         return false;
      } else {
         float a = this.Method255(a);

         for(int a = 9; a < 45; ++a) {
            if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
               ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
               if (this.Method255(a) > a && a.getItem() instanceof ItemPickaxe) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private boolean Method253(ItemStack a) {
      Item a = a.getItem();
      if (!(a instanceof ItemSpade)) {
         return false;
      } else {
         float a = this.Method255(a);

         for(int a = 9; a < 45; ++a) {
            if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
               ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
               if (this.Method255(a) > a && a.getItem() instanceof ItemSpade) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private boolean Method254(ItemStack a) {
      Item a = a.getItem();
      if (!(a instanceof ItemAxe)) {
         return false;
      } else {
         float a = this.Method255(a);

         for(int a = 9; a < 45; ++a) {
            if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
               ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
               if (this.Method255(a) > a && a.getItem() instanceof ItemAxe && !this.Method237(a)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private float Method255(ItemStack a) {
      Item a = a.getItem();
      if (!(a instanceof ItemTool)) {
         return 0.0F;
      } else {
         String a = a.getUnlocalizedName();
         ItemTool a = (ItemTool)a;
         float a = 1.0F;
         if (a instanceof ItemPickaxe) {
            a = a.getStrVsBlock(a, Blocks.stone);
            if (a.toLowerCase().contains("gold")) {
               a -= 5.0F;
            }
         } else if (a instanceof ItemSpade) {
            a = a.getStrVsBlock(a, Blocks.dirt);
            if (a.toLowerCase().contains("gold")) {
               a -= 5.0F;
            }
         } else {
            if (!(a instanceof ItemAxe)) {
               return 1.0F;
            }

            a = a.getStrVsBlock(a, Blocks.log);
            if (a.toLowerCase().contains("gold")) {
               a -= 5.0F;
            }
         }

         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, a) * 0.0075);
         a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a) / 100.0);
         return a;
      }
   }

   private boolean Method256(ItemStack a) {
      if (a.getItem() instanceof ItemPotion) {
         ItemPotion a = (ItemPotion)a.getItem();
         if (a.getEffects(a) == null) {
            return true;
         }

         Iterator var3 = a.getEffects(a).Method1383();

         while(var3.Method932()) {
            Object a = var3.Method933();
            PotionEffect a = (PotionEffect)a;
            if (a.getPotionID() == Potion.poison.getId() || a.getPotionID() == Potion.harm.getId() || a.getPotionID() == Potion.moveSlowdown.getId() || a.getPotionID() == Potion.weakness.getId()) {
               return true;
            }
         }
      }

      return false;
   }

   boolean Method257(int a) {
      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            Item a = a.getItem();
            if (a instanceof ItemArmor) {
               ItemArmor a = (ItemArmor)a;
               if (a == a.armorType) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void Method258() {
      for(int a = 1; a < 5; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(4 + a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(4 + a).getStack();
            if (AutoArmor.Method239(a, a)) {
               continue;
            }

            this.Method236(4 + a);
         }

         for(int a = 9; a < 45; ++a) {
            if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
               ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
               if (AutoArmor.Method239(a, a) && AutoArmor.Method238(a) > 0.0F) {
                  this.Method234(a);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               }
            }
         }
      }

   }

   public boolean Method259(ItemStack a) {
      float a = Method260(a);

      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (Method260(a) >= a && a.getItem() instanceof ItemBow && a != a) {
               return false;
            }
         }
      }

      return true;
   }

   private static float Method260(ItemStack a) {
      float a = 7.0F;
      a += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, a) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, a) * 0.5F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, a) * 0.1F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a) * 0.001F;
      return a;
   }

   public boolean Method261(ItemStack a) {
      float a = Method262(a);

      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (Method262(a) >= a && a.getUnlocalizedName().toLowerCase().contains("fish") && a != a) {
               return false;
            }
         }
      }

      return true;
   }

   private static float Method262(ItemStack a) {
      float a = 0.0F;
      a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, a) * 1.0);
      return a;
   }

   private static Exception Method263(Exception exception) {
      return exception;
   }
}
