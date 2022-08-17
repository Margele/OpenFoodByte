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
         S2DPacketOpenWindow a = (S2DPacketOpenWindow)a.getPacket();
         String[] var3 = this.Field2675;
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String a = var3[var5];
            if (a.getWindowTitle().getUnformattedText().toLowerCase().contains(a)) {
               this.Field2678 = false;
               return;
            }
         }

         this.Field2678 = a.getGuiId().equals("minecraft:chest");
         if (this.Field2678) {
            this.Field2680 = a.getSlotCount();
            this.Field2681 = a.getWindowId();
            this.Field2682.clear();
            this.Field2679 = false;
         }
      }

      if (this.Field2678 && a.getPacket() instanceof S30PacketWindowItems) {
         S30PacketWindowItems a = (S30PacketWindowItems)a.getPacket();
         if (a.func_148911_c() == this.Field2681 && !this.Field2679) {
            for(int a = 0; a < this.Field2680; ++a) {
               ItemStack a = a.getItemStacks()[a];
               if (!this.Method1068(a, a)) {
                  this.Field2682.Method2530(a);
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
      int a = Class148.Method1445();
      if (!a.isPost()) {
         if (this.Method713()) {
            if (mc.currentScreen instanceof GuiChest) {
               Container a = mc.thePlayer.openContainer;
               ContainerChest a = (ContainerChest)a;
               String a = a.getLowerChestInventory().getDisplayName().getUnformattedText().toLowerCase();
               String a = a.getLowerChestInventory().getDisplayName().getUnformattedText();
               if (a.equalsIgnoreCase("low") || StatCollector.translateToLocal("container.chest").equalsIgnoreCase(a) || StatCollector.translateToLocal("container.chestDouble").equalsIgnoreCase(a)) {
                  String[] a = new String[]{"menu", "selector", "game", "gui", "server", "inventory", "play", "teleporter", "shop", "melee", "armor", "block", "castle", "mini", "warp", "teleport", "user", "team", "tool", "sure", "trade", "cancel", "accept", "soul", "book", "recipe", "profile", "tele", "port", "map", "kit", "select", "lobby", "vault", "lock"};
                  int var9 = a.length;
                  int a = 0;
                  if (a < var9) {
                     String a = a[a];
                     if (a.contains(a)) {
                        return;
                     }

                     ++a;
                  }

                  this.Field2678 = true;
                  boolean a = true;
                  ItemStack[] a;
                  a = (a = mc.thePlayer.inventory.mainInventory).length;
                  int a = 0;
                  if (a < a) {
                     ItemStack a = a[a];
                     a = false;
                     ++a;
                  }

                  boolean a = false;
                  int a = a.getLowerChestInventory().getSizeInventory() + 1;
                  if (a > -1) {
                     ItemStack a = a.getLowerChestInventory().getStackInSlot(a);
                     if (!this.Method1068(a, (S30PacketWindowItems)null)) {
                        a = true;
                     }

                     --a;
                  }

                  List a = new ArrayList();
                  int a = a.getLowerChestInventory().getSizeInventory() + 1;
                  if (a > -1) {
                     ItemStack a = a.getLowerChestInventory().getStackInSlot(a);
                     if (!this.Method1068(a, (S30PacketWindowItems)null)) {
                        a.Method2530(a);
                     }

                     --a;
                  }

                  Collections.shuffle(a);
                  Iterator var22 = a.Method1383();
                  if (var22.Method932()) {
                     int a = (Integer)var22.Method933();
                     ItemStack a = a.getLowerChestInventory().getStackInSlot(a);
                     if (a.getItem() instanceof ItemSword) {
                        a.set(0, a);
                     }

                     if (a.getItem() instanceof ItemArmor) {
                        a.set(0, a);
                     }

                     if (a.getItem() instanceof ItemAppleGold) {
                        a.set(0, a);
                     }
                  }

                  var22 = a.Method1383();
                  if (var22.Method932()) {
                     Integer a = (Integer)var22.Method933();
                     int a = 50 * this.Field2687.getFloatValue().intValue();
                     if (this.Field2688.getBooleanValue() || this.Field2677.isDelayComplete((double)a)) {
                        mc.playerController.windowClick(a.windowId, a, 1, this.Field2689.getBooleanValue() ? 0 : 1, mc.thePlayer);
                        if (this.Field2689.getValue()) {
                           mc.playerController.windowClick(a.windowId, -999, 0, 0, mc.thePlayer);
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
      EnumFacing a = null;
      if (!mc.theWorld.getBlockState(a.add(0, 1, 0)).getBlock().isBlockNormalCube()) {
         a = EnumFacing.UP;
      }

      MovingObjectPosition a = mc.theWorld.rayTraceBlocks(new Vec3(mc.thePlayer.posX, mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight(), mc.thePlayer.posZ), new Vec3((double)a.getX() + 0.5, (double)a.getY(), (double)a.getZ() + 0.5));
      return a.sideHit;
   }

   private boolean Method1068(ItemStack a, S30PacketWindowItems a) {
      if (this.Field2685.isCurrentMode("all")) {
         return false;
      } else if (Objects.isNull(a)) {
         return true;
      } else {
         if (a.getItem() instanceof ItemSword) {
            ItemStack a = null;
            float a = -1.0F;

            for(int a = 9; a < 45; ++a) {
               if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
                  ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
                  if (a.getItem() instanceof ItemSword && a.getItem() instanceof ItemSword && a < Method255(a)) {
                     a = Method255(a);
                     a = a;
                  }
               }
            }

            if (a.getItem() instanceof ItemSword && a.getItem() instanceof ItemSword) {
               float a = Method255(a);
               float a = Method255(a);
               return a <= a;
            }
         }

         return this.Method1069(a, a);
      }
   }

   private boolean Method1069(ItemStack a, S30PacketWindowItems a1) {
      if (this.Field2685.isCurrentMode("SkyWars")) {
         if (a.getItem() instanceof ItemArmor) {
            return this.Method1070(a, a.getUnlocalizedName()) ? this.Method1072(a, a.getUnlocalizedName()) : true;
         } else {
            if (a.getItem() instanceof ItemFishingRod) {
               ItemStack a = null;
               float a = -1.0F;

               for(int a = 9; a < 45; ++a) {
                  if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
                     ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
                     if (a.getItem() instanceof ItemFishingRod && a.getItem() instanceof ItemFishingRod && a < Method260(a)) {
                        a = Method260(a);
                        a = a;
                     }
                  }
               }

               if (a.getItem() instanceof ItemFishingRod && a.getItem() instanceof ItemFishingRod) {
                  float a = Method260(a);
                  float a = Method260(a);
                  return a <= a;
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
      float a = this.Method238(a);
      String a = "";
      if (a.contains("helmet")) {
         a = "helmet";
      } else if (a.contains("chestplate")) {
         a = "chestplate";
      } else if (a.contains("leggings")) {
         a = "leggings";
      } else if (a.contains("boots")) {
         a = "boots";
      }

      for(int a = ((ContainerChest)mc.thePlayer.openContainer).getLowerChestInventory().getSizeInventory() + 1; a > -1; --a) {
         ItemStack a = ((ContainerChest)mc.thePlayer.openContainer).getLowerChestInventory().getStackInSlot(a);
         if (this.Method238(a) > a && a.getUnlocalizedName().contains(a)) {
            return false;
         }
      }

      return true;
   }

   public boolean Method1071(ItemStack a, String a, ItemStack[] a) {
      float a = this.Method238(a);
      String a = "";
      if (a.contains("helmet")) {
         a = "helmet";
      } else if (a.contains("chestplate")) {
         a = "chestplate";
      } else if (a.contains("leggings")) {
         a = "leggings";
      } else if (a.contains("boots")) {
         a = "boots";
      }

      ItemStack[] var6 = a;
      int var7 = a.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         ItemStack a = var6[var8];
         if (this.Method238(a) > a && a.getUnlocalizedName().contains(a)) {
            return false;
         }
      }

      return true;
   }

   public boolean Method1072(ItemStack a, String a) {
      float a = this.Method238(a);
      int a = -1;
      String a = "";
      if (a.contains("helmet")) {
         a = 3;
         a = "helmet";
      } else if (a.contains("chestplate")) {
         a = 2;
         a = "chestplate";
      } else if (a.contains("leggings")) {
         a = 1;
         a = "leggings";
      } else if (a.contains("boots")) {
         a = 0;
         a = "boots";
      }

      ItemStack a = mc.thePlayer.inventory.armorItemInSlot(a);

      for(int a = 9; a < 45; ++a) {
         if (mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) {
            ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (this.Method238(a) >= a && a.getUnlocalizedName().contains(a)) {
               return true;
            }
         }
      }

      return false;
   }

   public float Method238(ItemStack a) {
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

   private boolean Method237(ItemStack a) {
      if (a.getItem() instanceof ItemPotion) {
         ItemPotion a = (ItemPotion)a.getItem();
         if (ItemPotion.isSplash(a.getItemDamage())) {
            Iterator var3 = a.getEffects(a).Method1383();

            while(var3.Method932()) {
               Object a = var3.Method933();
               PotionEffect a = (PotionEffect)a;
               if (a.getPotionID() == Potion.poison.getId() || a.getPotionID() == Potion.harm.getId() || a.getPotionID() == Potion.moveSlowdown.getId() || a.getPotionID() == Potion.weakness.getId()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static float Method255(ItemStack a) {
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

   private static float Method260(ItemStack a) {
      float a = 0.0F;
      a = (float)((double)a + (double)EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, a) * 1.0);
      return a;
   }
}
