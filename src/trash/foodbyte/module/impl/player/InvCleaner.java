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

         long var2 = this.Field2724.getFloatValue().longValue() * 50L;
         if (!mc.thePlayer.isEntityAlive() || mc.currentScreen instanceof GuiGameOver) {
            this.Method1028();
            return;
         }

         if (mc.thePlayer.ticksExisted <= 1) {
            this.Method1028();
            return;
         }

         long var4 = AutoArmor.Field2462.getFloatValue().longValue() * 50L;
         if (Field2729.isDelayComplete((double)var4) && ModuleManager.getModule(AutoArmor.class).getState() && (!AutoArmor.Field2461.isCurrentMode("OpenInv") || mc.currentScreen instanceof GuiInventory) && mc.currentScreen != null && !(mc.currentScreen instanceof GuiInventory) && mc.currentScreen instanceof GuiChat) {
         }

         int var6;
         ItemStack var7;
         if (ModuleManager.getModule(AutoArmor.class).getState()) {
            for(var6 = 1; var6 < 5; ++var6) {
               if (mc.thePlayer.inventoryContainer.getSlot(4 + var6).getHasStack()) {
                  var7 = mc.thePlayer.inventoryContainer.getSlot(4 + var6).getStack();
                  if (!AutoArmor.Method239(var7, var6)) {
                     return;
                  }
               } else if (this.Method257(var6 - 1)) {
                  return;
               }
            }
         }

         if (this.Field2721.isCurrentMode("OpenInv") && !(mc.currentScreen instanceof GuiInventory)) {
            return;
         }

         if (mc.currentScreen == null || mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChat) {
            if (Field2729.isDelayComplete((double)var2) && Field2738 >= 36) {
               this.Method249(Field2738);
            }

            if (Field2729.isDelayComplete((double)var2) && Field2736 >= 36) {
               this.Method250(Field2736);
            }

            if (Field2729.isDelayComplete((double)var2) && Field2737 >= 36) {
               this.Method251(Field2737);
            }

            if (Field2729.isDelayComplete((double)var2)) {
               for(var6 = 9; var6 < 45; ++var6) {
                  if (mc.thePlayer.inventoryContainer.getSlot(var6).getHasStack()) {
                     var7 = mc.thePlayer.inventoryContainer.getSlot(var6).getStack();
                     if (this.Method239(var7, var6)) {
                        this.Method236(var6);
                        Field2729.reset();
                        if (var2 > 0L) {
                           break;
                        }
                     }
                  }

                  if (var6 == 44 && this.Field2728.getBooleanValue()) {
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
      for(int var2 = 9; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            if (this.Method237(var3) && Method238(var3) > 0.0F && var3.getItem() instanceof ItemSword) {
               this.Method235(var2, a - 36);
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
      float var2 = Method238(a);

      for(int var3 = 9; var3 < 45; ++var3) {
         if (mc.thePlayer.inventoryContainer.getSlot(var3).getHasStack()) {
            ItemStack var4 = mc.thePlayer.inventoryContainer.getSlot(var3).getStack();
            if (Method238(var4) > var2 && var4.getItem() instanceof ItemSword) {
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
      float var1 = 0.0F;
      Item var2 = a.getItem();
      if (var2 instanceof ItemTool) {
         var1 += PlayerUtils.Method1590(a);
      }

      if (var2 instanceof ItemSword) {
         var1 += PlayerUtils.Method1590(a);
      }

      var1 += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a) * 0.25F;
      return var1;
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
      Item var3 = a.getItem();
      int var4 = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a);
      int var5 = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a);
      int var6 = EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, a);
      int var7 = EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, a);
      if (a.getItem() instanceof ItemArmor) {
         int var8 = 1;
         if (var8 < 5) {
            if (mc.thePlayer.inventoryContainer.getSlot(4 + var8).getHasStack()) {
               ItemStack var9 = mc.thePlayer.inventoryContainer.getSlot(4 + var8).getStack();
               if (AutoArmor.Method239(var9, var8)) {
                  ;
               }
            }

            if (AutoArmor.Method239(a, var8)) {
               return false;
            }

            ++var8;
         }
      }

      if (a.getItem() instanceof ItemPotion && this.Method256(a)) {
         return true;
      } else if (Item.getIdFromItem(var3) == 326 && this.Method244() <= 1) {
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
                        if (Item.getIdFromItem(var3) == 397 && a.getItemDamage() == 3) {
                           return false;
                        }

                        if (Item.getIdFromItem(var3) == 276 && (var4 >= 3 || var5 >= 1)) {
                           return false;
                        }

                        if (a.getItem() instanceof ItemEnchantedBook) {
                           NBTTagList var12 = Items.enchanted_book.getEnchantments(a);
                           int var13 = 0;
                           if (var13 < var12.tagCount()) {
                              short var10 = var12.getCompoundTagAt(var13).getShort("id");
                              short var11 = var12.getCompoundTagAt(var13).getShort("lvl");
                              if (var10 == Enchantment.sharpness.effectId && var11 >= 3 || var10 == Enchantment.fireAspect.effectId || var10 == Enchantment.efficiency.effectId && var11 >= 3 || var10 == Enchantment.fortune.effectId || var10 == Enchantment.featherFalling.effectId && var11 >= 3 || var10 == Enchantment.protection.effectId || var10 == Enchantment.punch.effectId || var10 == Enchantment.flame.effectId || var10 == Enchantment.infinity.effectId || var10 == Enchantment.depthStrider.effectId) {
                                 return false;
                              }

                              ++var13;
                           }

                           return true;
                        }

                        if (a.getDisplayName().toLowerCase().contains("k||") || a.getDisplayName().toLowerCase().contains("cornucopia")) {
                           return false;
                        }

                        if (Item.getIdFromItem(var3) == 263 && this.Method243() <= 64) {
                           return false;
                        }

                        if (Item.getIdFromItem(var3) == 345 && this.Method247() <= 1) {
                           return false;
                        }

                        if (Item.getIdFromItem(var3) == 265 && this.Method248() <= 64) {
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
      int var1 = 0;

      for(int var2 = 0; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (var3.getItem() instanceof ItemBlock) {
               var1 += var3.stackSize;
            }
         }
      }

      return var1;
   }

   private int Method243() {
      int var1 = 0;

      for(int var2 = 0; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (Item.getIdFromItem(var4) == 263) {
               var1 += var3.stackSize;
            }
         }
      }

      return var1;
   }

   private int Method244() {
      int var1 = 0;

      for(int var2 = 0; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (Item.getIdFromItem(var4) == 326) {
               var1 += var3.stackSize;
            }
         }
      }

      return var1;
   }

   private int Method245() {
      int var1 = 0;

      for(int var2 = 0; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (var4 instanceof ItemFishingRod) {
               var1 += var3.stackSize;
            }
         }
      }

      return var1;
   }

   private int Method246() {
      int var1 = 0;

      for(int var2 = 0; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            if (var3.getItem() instanceof ItemBow) {
               var1 += var3.stackSize;
            }
         }
      }

      return var1;
   }

   private int Method247() {
      int var1 = 0;

      for(int var2 = 0; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (Item.getIdFromItem(var4) == 345) {
               var1 += var3.stackSize;
            }
         }
      }

      return var1;
   }

   private int Method248() {
      int var1 = 0;

      for(int var2 = 0; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (Item.getIdFromItem(var4) == 265) {
               var1 += var3.stackSize;
            }
         }
      }

      return var1;
   }

   private void Method249(int a) {
      for(int var2 = 9; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            if (this.Method252(var3) && Field2738 != var2 && !this.Method237(var3)) {
               if (!mc.thePlayer.inventoryContainer.getSlot(Field2738).getHasStack()) {
                  this.Method235(var2, Field2738 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               } else if (!this.Method252(mc.thePlayer.inventoryContainer.getSlot(Field2738).getStack())) {
                  this.Method235(var2, Field2738 - 36);
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
      for(int var2 = 9; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            if (this.Method253(var3) && Field2736 != var2 && !this.Method237(var3)) {
               if (!mc.thePlayer.inventoryContainer.getSlot(Field2736).getHasStack()) {
                  this.Method235(var2, Field2736 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               } else if (!this.Method253(mc.thePlayer.inventoryContainer.getSlot(Field2736).getStack())) {
                  this.Method235(var2, Field2736 - 36);
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
      for(int var2 = 9; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            if (this.Method254(var3) && Field2737 != var2 && !this.Method237(var3)) {
               if (!mc.thePlayer.inventoryContainer.getSlot(Field2737).getHasStack()) {
                  this.Method235(var2, Field2737 - 36);
                  Field2729.reset();
                  if (this.Field2724.getFloatValue().longValue() > 0L) {
                     return;
                  }
               } else if (!this.Method254(mc.thePlayer.inventoryContainer.getSlot(Field2737).getStack())) {
                  this.Method235(var2, Field2737 - 36);
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
      Item var2 = a.getItem();
      if (!(var2 instanceof ItemPickaxe)) {
         return false;
      } else {
         float var3 = this.Method255(a);

         for(int var4 = 9; var4 < 45; ++var4) {
            if (mc.thePlayer.inventoryContainer.getSlot(var4).getHasStack()) {
               ItemStack var5 = mc.thePlayer.inventoryContainer.getSlot(var4).getStack();
               if (this.Method255(var5) > var3 && var5.getItem() instanceof ItemPickaxe) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private boolean Method253(ItemStack a) {
      Item var2 = a.getItem();
      if (!(var2 instanceof ItemSpade)) {
         return false;
      } else {
         float var3 = this.Method255(a);

         for(int var4 = 9; var4 < 45; ++var4) {
            if (mc.thePlayer.inventoryContainer.getSlot(var4).getHasStack()) {
               ItemStack var5 = mc.thePlayer.inventoryContainer.getSlot(var4).getStack();
               if (this.Method255(var5) > var3 && var5.getItem() instanceof ItemSpade) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private boolean Method254(ItemStack a) {
      Item var2 = a.getItem();
      if (!(var2 instanceof ItemAxe)) {
         return false;
      } else {
         float var3 = this.Method255(a);

         for(int var4 = 9; var4 < 45; ++var4) {
            if (mc.thePlayer.inventoryContainer.getSlot(var4).getHasStack()) {
               ItemStack var5 = mc.thePlayer.inventoryContainer.getSlot(var4).getStack();
               if (this.Method255(var5) > var3 && var5.getItem() instanceof ItemAxe && !this.Method237(a)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private float Method255(ItemStack a) {
      Item var2 = a.getItem();
      if (!(var2 instanceof ItemTool)) {
         return 0.0F;
      } else {
         String var3 = var2.getUnlocalizedName();
         ItemTool var4 = (ItemTool)var2;
         float var5 = 1.0F;
         if (var2 instanceof ItemPickaxe) {
            var5 = var4.getStrVsBlock(a, Blocks.stone);
            if (var3.toLowerCase().contains("gold")) {
               var5 -= 5.0F;
            }
         } else if (var2 instanceof ItemSpade) {
            var5 = var4.getStrVsBlock(a, Blocks.dirt);
            if (var3.toLowerCase().contains("gold")) {
               var5 -= 5.0F;
            }
         } else {
            if (!(var2 instanceof ItemAxe)) {
               return 1.0F;
            }

            var5 = var4.getStrVsBlock(a, Blocks.log);
            if (var3.toLowerCase().contains("gold")) {
               var5 -= 5.0F;
            }
         }

         var5 = (float)((double)var5 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, a) * 0.0075);
         var5 = (float)((double)var5 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a) / 100.0);
         return var5;
      }
   }

   private boolean Method256(ItemStack a) {
      if (a.getItem() instanceof ItemPotion) {
         ItemPotion var2 = (ItemPotion)a.getItem();
         if (var2.getEffects(a) == null) {
            return true;
         }

         Iterator var3 = var2.getEffects(a).Method1383();

         while(var3.Method932()) {
            Object var4 = var3.Method933();
            PotionEffect var5 = (PotionEffect)var4;
            if (var5.getPotionID() == Potion.poison.getId() || var5.getPotionID() == Potion.harm.getId() || var5.getPotionID() == Potion.moveSlowdown.getId() || var5.getPotionID() == Potion.weakness.getId()) {
               return true;
            }
         }
      }

      return false;
   }

   boolean Method257(int a) {
      for(int var2 = 9; var2 < 45; ++var2) {
         if (mc.thePlayer.inventoryContainer.getSlot(var2).getHasStack()) {
            ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var2).getStack();
            Item var4 = var3.getItem();
            if (var4 instanceof ItemArmor) {
               ItemArmor var5 = (ItemArmor)var4;
               if (a == var5.armorType) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void Method258() {
      for(int var1 = 1; var1 < 5; ++var1) {
         if (mc.thePlayer.inventoryContainer.getSlot(4 + var1).getHasStack()) {
            ItemStack var2 = mc.thePlayer.inventoryContainer.getSlot(4 + var1).getStack();
            if (AutoArmor.Method239(var2, var1)) {
               continue;
            }

            this.Method236(4 + var1);
         }

         for(int var4 = 9; var4 < 45; ++var4) {
            if (mc.thePlayer.inventoryContainer.getSlot(var4).getHasStack()) {
               ItemStack var3 = mc.thePlayer.inventoryContainer.getSlot(var4).getStack();
               if (AutoArmor.Method239(var3, var1) && AutoArmor.Method238(var3) > 0.0F) {
                  this.Method234(var4);
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
      float var2 = Method260(a);

      for(int var3 = 9; var3 < 45; ++var3) {
         if (mc.thePlayer.inventoryContainer.getSlot(var3).getHasStack()) {
            ItemStack var4 = mc.thePlayer.inventoryContainer.getSlot(var3).getStack();
            if (Method260(var4) >= var2 && var4.getItem() instanceof ItemBow && a != var4) {
               return false;
            }
         }
      }

      return true;
   }

   private static float Method260(ItemStack a) {
      float var1 = 7.0F;
      var1 += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, a) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, a) * 0.5F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, a) * 0.1F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a) * 0.001F;
      return var1;
   }

   public boolean Method261(ItemStack a) {
      float var2 = Method262(a);

      for(int var3 = 9; var3 < 45; ++var3) {
         if (mc.thePlayer.inventoryContainer.getSlot(var3).getHasStack()) {
            ItemStack var4 = mc.thePlayer.inventoryContainer.getSlot(var3).getStack();
            if (Method262(var4) >= var2 && var4.getUnlocalizedName().toLowerCase().contains("fish") && a != var4) {
               return false;
            }
         }
      }

      return true;
   }

   private static float Method262(ItemStack a) {
      float var1 = 0.0F;
      var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, a) * 1.0);
      return var1;
   }

   private static Exception Method263(Exception exception) {
      return exception;
   }
}
