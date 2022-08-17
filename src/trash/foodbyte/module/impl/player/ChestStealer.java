package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class655;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemGlassBottle;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.StatCollector;
import net.minecraft.util.Vec3;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class ChestStealer extends Module {
   private String[] Field2675 = new String[]{"mode", "delivery", "menu", "selector", "game", "gui", "server", "inventory", "play", "teleporter", "shop", "melee", "armor", "block", "castle", "mini", "warp", "teleport", "user", "team", "tool", "sure", "trade", "cancel", "accept", "soul", "book", "recipe", "profile", "tele", "port", "map", "kit", "select", "lobby", "vault", "lock", "anticheat", "travel", "settings", "user", "preference", "compass", "cake", "wars", "buy", "upgrade", "ranged", "potions", "utility"};
   private static long Field2676 = -1L;
   private final TimeHelper Field2677 = new TimeHelper();
   public boolean Field2678;
   public boolean Field2679;
   private int Field2680;
   private int Field2681;
   private List Field2682 = new CopyOnWriteArrayList();
   private List Field2683 = new CopyOnWriteArrayList();
   public GuiScreen Field2684;
   public ModeValue Field2685 = new ModeValue("ChestStealer", "Item List", "All", new String[]{"All", "SkyWars", "IGNore"}, "{所有物品,空岛用得着的物品,以前}");
   public FloatValue Field2686 = new FloatValue("ChestStealer", "Open Wait", 0.2, 0.0, 2.0, 0.1, "s", "打开箱子等一下再开始拿物品");
   public FloatValue Field2687 = new FloatValue("ChestStealer", "Delay", 2.0, 1.0, 10.0, 1.0, "每拿一个箱子里物品的间隔延迟");
   public BooleanValue Field2688 = new BooleanValue("ChestStealer", "Fast", false, "一秒拿完箱子所有东西");
   public BooleanValue Field2689 = new BooleanValue("ChestStealer", "Drop", false, "把东西丢出来");
   public BooleanValue Field2690 = new BooleanValue("ChestStealer", "Close", true, "拿完东西后自动关闭箱子");

   public ChestStealer() {
      super("ChestStealer", "Chest Stealer", Category.PLAYER);
      this.setDescription("打开箱子自动拿物品");
   }

   public void onDisable() {
      this.Field2679 = false;
      this.Field2678 = false;
      this.Field2682.clear();
   }

   public void Method273(EventPacket a) {
      if (a.getPacket() instanceof S2DPacketOpenWindow) {
         S2DPacketOpenWindow var2 = (S2DPacketOpenWindow)a.getPacket();
         String[] var3 = this.Field2675;
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            if (var2.getWindowTitle().getUnformattedText().toLowerCase().contains(var6)) {
               this.Field2678 = false;
               return;
            }
         }

         this.Field2678 = var2.getGuiId().equals("minecraft:chest");
         if (this.Field2678) {
            this.Field2680 = var2.getSlotCount();
            this.Field2681 = var2.getWindowId();
            this.Field2682.clear();
            this.Field2679 = false;
         }
      }

      if (this.Field2678 && a.getPacket() instanceof S30PacketWindowItems) {
         S30PacketWindowItems var7 = (S30PacketWindowItems)a.getPacket();
         if (var7.func_148911_c() == this.Field2681 && !this.Field2679) {
            for(int var8 = 0; var8 < this.Field2680; ++var8) {
               ItemStack var9 = var7.getItemStacks()[var8];
               if (!this.Method1068(var9, var7)) {
                  this.Field2682.Method2530(var8);
               }
            }

            ChatUtils.debug(this.Field2682.Method1799() + "");
            if (!this.Field2682.isEmpty()) {
               Collections.shuffle(this.Field2682);
            }

            this.Field2679 = true;
         }
      }

   }

   @EventTarget
   public void Method1066(Class655 a) {
      this.Field2684 = a.Method3582();
      if (a.Method3582() instanceof GuiChest) {
         Field2676 = System.currentTimeMillis();
      }

   }

   public boolean Method713() {
      return (float)(System.currentTimeMillis() - Field2676) > this.Field2686.getFloatValue() * 1000.0F;
   }

   @EventTarget
   public void Method712(EventMotion a) {
      int var2 = Class148.Method1445();
      if (!a.isPost()) {
         if (this.Method713()) {
            if (mc.currentScreen instanceof GuiChest) {
               Container var3 = mc.thePlayer.openContainer;
               ContainerChest var4 = (ContainerChest)var3;
               String var5 = var4.getLowerChestInventory().getDisplayName().getUnformattedText().toLowerCase();
               String var6 = var4.getLowerChestInventory().getDisplayName().getUnformattedText();
               if (var5.equalsIgnoreCase("low") || StatCollector.translateToLocal("container.chest").equalsIgnoreCase(var6) || StatCollector.translateToLocal("container.chestDouble").equalsIgnoreCase(var6)) {
                  String[] var7 = new String[]{"menu", "selector", "game", "gui", "server", "inventory", "play", "teleporter", "shop", "melee", "armor", "block", "castle", "mini", "warp", "teleport", "user", "team", "tool", "sure", "trade", "cancel", "accept", "soul", "book", "recipe", "profile", "tele", "port", "map", "kit", "select", "lobby", "vault", "lock"};
                  int var9 = var7.length;
                  int var10 = 0;
                  if (var10 < var9) {
                     String var11 = var7[var10];
                     if (var5.contains(var11)) {
                        return;
                     }

                     ++var10;
                  }

                  this.Field2678 = true;
                  boolean var8 = true;
                  ItemStack[] var16;
                  var10 = (var16 = mc.thePlayer.inventory.mainInventory).length;
                  int var17 = 0;
                  if (var17 < var10) {
                     ItemStack var12 = var16[var17];
                     var8 = false;
                     ++var17;
                  }

                  boolean var18 = false;
                  int var19 = var4.getLowerChestInventory().getSizeInventory() + 1;
                  if (var19 > -1) {
                     ItemStack var13 = var4.getLowerChestInventory().getStackInSlot(var19);
                     if (!this.Method1068(var13, (S30PacketWindowItems)null)) {
                        var18 = true;
                     }

                     --var19;
                  }

                  ArrayList var20 = new ArrayList();
                  int var21 = var4.getLowerChestInventory().getSizeInventory() + 1;
                  if (var21 > -1) {
                     ItemStack var14 = var4.getLowerChestInventory().getStackInSlot(var21);
                     if (!this.Method1068(var14, (S30PacketWindowItems)null)) {
                        var20.Method2530(var21);
                     }

                     --var21;
                  }

                  Collections.shuffle(var20);
                  Iterator var22 = var20.Method1383();
                  if (var22.Method932()) {
                     int var23 = (Integer)var22.Method933();
                     ItemStack var15 = var4.getLowerChestInventory().getStackInSlot(var23);
                     if (var15.getItem() instanceof ItemSword) {
                        var20.set(0, var23);
                     }

                     if (var15.getItem() instanceof ItemArmor) {
                        var20.set(0, var23);
                     }

                     if (var15.getItem() instanceof ItemAppleGold) {
                        var20.set(0, var23);
                     }
                  }

                  var22 = var20.Method1383();
                  if (var22.Method932()) {
                     Integer var24 = (Integer)var22.Method933();
                     int var25 = 50 * this.Field2687.getFloatValue().intValue();
                     if (this.Field2688.getBooleanValue() || this.Field2677.isDelayComplete((double)var25)) {
                        mc.playerController.windowClick(var4.windowId, var24, 1, this.Field2689.getBooleanValue() ? 0 : 1, mc.thePlayer);
                        if (this.Field2689.getValue()) {
                           mc.playerController.windowClick(var4.windowId, -999, 0, 0, mc.thePlayer);
                        }

                        this.Field2677.reset();
                     }
                  }
               }

               this.Field2678 = false;
            }

         }
      }
   }

   private EnumFacing Method1067(BlockPos a) {
      EnumFacing var2 = null;
      if (!mc.theWorld.getBlockState(a.add(0, 1, 0)).getBlock().isBlockNormalCube()) {
         var2 = EnumFacing.UP;
      }

      MovingObjectPosition var3 = mc.theWorld.rayTraceBlocks(new Vec3(mc.thePlayer.posX, mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight(), mc.thePlayer.posZ), new Vec3((double)a.getX() + 0.5, (double)a.getY(), (double)a.getZ() + 0.5));
      return var3.sideHit;
   }

   private boolean Method1068(ItemStack a, S30PacketWindowItems a) {
      if (this.Field2685.isCurrentMode("all")) {
         return false;
      } else if (Objects.isNull(a)) {
         return true;
      } else {
         if (a.getItem() instanceof ItemSword) {
            ItemStack var3 = null;
            float var4 = -1.0F;

            for(int var5 = 9; var5 < 45; ++var5) {
               if (mc.thePlayer.inventoryContainer.getSlot(var5).getHasStack()) {
                  ItemStack var6 = mc.thePlayer.inventoryContainer.getSlot(var5).getStack();
                  if (var6.getItem() instanceof ItemSword && a.getItem() instanceof ItemSword && var4 < Method255(var6)) {
                     var4 = Method255(var6);
                     var3 = var6;
                  }
               }
            }

            if (var3.getItem() instanceof ItemSword && a.getItem() instanceof ItemSword) {
               float var7 = Method255(var3);
               float var8 = Method255(a);
               return var8 <= var7;
            }
         }

         return this.Method1069(a, a);
      }
   }

   private boolean Method1069(ItemStack a, S30PacketWindowItems a) {
      if (this.Field2685.isCurrentMode("SkyWars")) {
         if (a.getItem() instanceof ItemArmor) {
            return this.Method1070(a, a.getUnlocalizedName()) ? this.Method1072(a, a.getUnlocalizedName()) : true;
         } else {
            if (a.getItem() instanceof ItemFishingRod) {
               ItemStack var3 = null;
               float var4 = -1.0F;

               for(int var5 = 9; var5 < 45; ++var5) {
                  if (mc.thePlayer.inventoryContainer.getSlot(var5).getHasStack()) {
                     ItemStack var6 = mc.thePlayer.inventoryContainer.getSlot(var5).getStack();
                     if (var6.getItem() instanceof ItemFishingRod && a.getItem() instanceof ItemFishingRod && var4 < Method260(var6)) {
                        var4 = Method260(var6);
                        var3 = var6;
                     }
                  }
               }

               if (var3.getItem() instanceof ItemFishingRod && a.getItem() instanceof ItemFishingRod) {
                  float var7 = Method260(var3);
                  float var8 = Method260(a);
                  return var8 <= var7;
               }
            }

            return a.getItem().getUnlocalizedName().contains("stick") && !a.getItem().getUnlocalizedName().contains("leg") || a.getItem().getUnlocalizedName().contains("string") || a.getItem().getUnlocalizedName().contains("flint") || a.getItem().getUnlocalizedName().contains("feather") || a.getItem().getUnlocalizedName().contains("shears") || a.getItem().getUnlocalizedName().contains("anvil") || a.getItem().getUnlocalizedName().contains("torch") || a.getItem().getUnlocalizedName().contains("seeds") || a.getItem().getUnlocalizedName().contains("leather") || a.getItem() instanceof ItemPickaxe || a.getItem() instanceof ItemGlassBottle || a.getItem() instanceof ItemTool || a.getItem().getUnlocalizedName().contains("piston") || a.getItem().getUnlocalizedName().contains("potion") && this.Method237(a);
         }
      } else if (!this.Field2685.isCurrentMode("IGNore")) {
         return false;
      } else {
         return a.getItem().getUnlocalizedName().contains("tnt") || a.getItem().getUnlocalizedName().contains("stick") || a.getItem().getUnlocalizedName().contains("egg") && !a.getItem().getUnlocalizedName().contains("leg") || a.getItem().getUnlocalizedName().contains("string") || a.getItem().getUnlocalizedName().contains("flint") || a.getItem().getUnlocalizedName().contains("compass") || a.getItem().getUnlocalizedName().contains("feather") || a.getItem().getUnlocalizedName().contains("bucket") || a.getItem().getUnlocalizedName().contains("snow") || a.getItem().getUnlocalizedName().contains("fish") || a.getItem().getUnlocalizedName().contains("enchant") || a.getItem().getUnlocalizedName().contains("exp") || a.getItem().getUnlocalizedName().contains("shears") || a.getItem().getUnlocalizedName().contains("anvil") || a.getItem().getUnlocalizedName().contains("torch") || a.getItem().getUnlocalizedName().contains("seeds") || a.getItem().getUnlocalizedName().contains("leather") || a.getItem() instanceof ItemPickaxe || a.getItem() instanceof ItemGlassBottle || a.getItem() instanceof ItemTool || a.getItem().getUnlocalizedName().contains("piston") || a.getItem().getUnlocalizedName().contains("potion") && this.Method237(a);
      }
   }

   public boolean Method1070(ItemStack a, String a) {
      float var3 = this.Method238(a);
      String var4 = "";
      if (a.contains("helmet")) {
         var4 = "helmet";
      } else if (a.contains("chestplate")) {
         var4 = "chestplate";
      } else if (a.contains("leggings")) {
         var4 = "leggings";
      } else if (a.contains("boots")) {
         var4 = "boots";
      }

      for(int var5 = ((ContainerChest)mc.thePlayer.openContainer).getLowerChestInventory().getSizeInventory() + 1; var5 > -1; --var5) {
         ItemStack var6 = ((ContainerChest)mc.thePlayer.openContainer).getLowerChestInventory().getStackInSlot(var5);
         if (this.Method238(var6) > var3 && var6.getUnlocalizedName().contains(var4)) {
            return false;
         }
      }

      return true;
   }

   public boolean Method1071(ItemStack a, String a, ItemStack[] a) {
      float var4 = this.Method238(a);
      String var5 = "";
      if (a.contains("helmet")) {
         var5 = "helmet";
      } else if (a.contains("chestplate")) {
         var5 = "chestplate";
      } else if (a.contains("leggings")) {
         var5 = "leggings";
      } else if (a.contains("boots")) {
         var5 = "boots";
      }

      ItemStack[] var6 = a;
      int var7 = a.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         ItemStack var9 = var6[var8];
         if (this.Method238(var9) > var4 && var9.getUnlocalizedName().contains(var5)) {
            return false;
         }
      }

      return true;
   }

   public boolean Method1072(ItemStack a, String a) {
      float var3 = this.Method238(a);
      byte var4 = -1;
      String var5 = "";
      if (a.contains("helmet")) {
         var4 = 3;
         var5 = "helmet";
      } else if (a.contains("chestplate")) {
         var4 = 2;
         var5 = "chestplate";
      } else if (a.contains("leggings")) {
         var4 = 1;
         var5 = "leggings";
      } else if (a.contains("boots")) {
         var4 = 0;
         var5 = "boots";
      }

      ItemStack var6 = mc.thePlayer.inventory.armorItemInSlot(var4);

      for(int var7 = 9; var7 < 45; ++var7) {
         if (mc.thePlayer.inventoryContainer.getSlot(var7).getHasStack()) {
            ItemStack var8 = mc.thePlayer.inventoryContainer.getSlot(var7).getStack();
            if (this.Method238(var8) >= var3 && var8.getUnlocalizedName().contains(var5)) {
               return true;
            }
         }
      }

      return false;
   }

   public float Method238(ItemStack a) {
      float var2 = 0.0F;
      if (a.getItem() instanceof ItemArmor) {
         ItemArmor var3 = (ItemArmor)a.getItem();
         var2 = (float)((double)var2 + (double)var3.damageReduceAmount + (double)((100 - var3.damageReduceAmount) * EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, a)) * 0.0075);
         var2 = (float)((double)var2 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.depthStrider.effectId, a) / 45.0);
         var2 = (float)((double)var2 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.featherFalling.effectId, a) / 40.0);
         var2 = (float)((double)var2 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.blastProtection.effectId, a) / 100.0);
         var2 = (float)((double)var2 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireProtection.effectId, a) / 100.0);
         var2 = (float)((double)var2 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.thorns.effectId, a) / 100.0);
         var2 = (float)((double)var2 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a) / 50.0);
         var2 = (float)((double)var2 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.projectileProtection.effectId, a) / 100.0);
         var2 = a.getDisplayName().toLowerCase().contains("§abarbarian chestplate") ? 10.76F : var2;
         var2 = a.getDisplayName().toLowerCase().contains("§6exodus") ? 5.91F : var2;
         var2 = a.getDisplayName().toLowerCase().contains("§ashoes of vidar") ? 5.91F : var2;
         var2 = a.getDisplayName().toLowerCase().contains("§ahermes' boots") ? 5.91F : var2;
      }

      return var2;
   }

   private boolean Method237(ItemStack a) {
      if (a.getItem() instanceof ItemPotion) {
         ItemPotion var2 = (ItemPotion)a.getItem();
         if (ItemPotion.isSplash(a.getItemDamage())) {
            Iterator var3 = var2.getEffects(a).Method1383();

            while(var3.Method932()) {
               Object var4 = var3.Method933();
               PotionEffect var5 = (PotionEffect)var4;
               if (var5.getPotionID() == Potion.poison.getId() || var5.getPotionID() == Potion.harm.getId() || var5.getPotionID() == Potion.moveSlowdown.getId() || var5.getPotionID() == Potion.weakness.getId()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static float Method255(ItemStack a) {
      float var1 = 0.0F;
      Item var2 = a.getItem();
      if (var2 instanceof ItemTool) {
         var1 += PlayerUtils.Method1590(a);
      }

      if (var2 instanceof ItemSword) {
         var1 += PlayerUtils.Method1590(a);
      }

      var1 += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a) * 0.5F;
      return var1;
   }

   private static float Method260(ItemStack a) {
      float var1 = 0.0F;
      var1 = (float)((double)var1 + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, a) * 1.0);
      return var1;
   }
}
