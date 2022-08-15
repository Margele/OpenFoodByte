/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  java.util.concurrent.CopyOnWriteArrayList
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.inventory.GuiChest
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.ContainerChest
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemAppleGold
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemFishingRod
 *  net.minecraft.item.ItemGlassBottle
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.item.ItemPotion
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.item.ItemTool
 *  net.minecraft.network.play.server.S2DPacketOpenWindow
 *  net.minecraft.network.play.server.S30PacketWindowItems
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.StatCollector
 *  net.minecraft.util.Vec3
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class655;
import awsl.Class749;
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
import net.minecraft.entity.player.EntityPlayer;
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
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class ChestStealer
extends Module {
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
    public ModeValue Field2685 = new ModeValue("ChestStealer", "Item List", "All", new String[]{"All", "SkyWars", "IGNore"}, "{\u6240\u6709\u7269\u54c1,\u7a7a\u5c9b\u7528\u5f97\u7740\u7684\u7269\u54c1,\u4ee5\u524d}");
    public FloatValue Field2686 = new FloatValue("ChestStealer", "Open Wait", 0.2, 0.0, 2.0, 0.1, "s", "\u6253\u5f00\u7bb1\u5b50\u7b49\u4e00\u4e0b\u518d\u5f00\u59cb\u62ff\u7269\u54c1");
    public FloatValue Field2687 = new FloatValue("ChestStealer", "Delay", 2.0, 1.0, 10.0, 1.0, "\u6bcf\u62ff\u4e00\u4e2a\u7bb1\u5b50\u91cc\u7269\u54c1\u7684\u95f4\u9694\u5ef6\u8fdf");
    public BooleanValue Field2688 = new BooleanValue("ChestStealer", "Fast", (Boolean)false, "\u4e00\u79d2\u62ff\u5b8c\u7bb1\u5b50\u6240\u6709\u4e1c\u897f");
    public BooleanValue Field2689 = new BooleanValue("ChestStealer", "Drop", (Boolean)false, "\u628a\u4e1c\u897f\u4e22\u51fa\u6765");
    public BooleanValue Field2690 = new BooleanValue("ChestStealer", "Close", (Boolean)true, "\u62ff\u5b8c\u4e1c\u897f\u540e\u81ea\u52a8\u5173\u95ed\u7bb1\u5b50");

    public ChestStealer() {
        super("ChestStealer", "Chest Stealer", Category.PLAYER);
        this.setDescription("\u6253\u5f00\u7bb1\u5b50\u81ea\u52a8\u62ff\u7269\u54c1");
    }

    @Override
    public void Method279() {
        this.Field2679 = false;
        this.Field2678 = false;
        this.Field2682.clear();
    }

    public void Method273(EventPacket a) {
        S2DPacketOpenWindow a2;
        if (a.getPacket() instanceof S2DPacketOpenWindow) {
            a2 = (S2DPacketOpenWindow)a.getPacket();
            for (String a3 : this.Field2675) {
                if (!a2.getWindowTitle().getUnformattedText().toLowerCase().contains((CharSequence)a3)) continue;
                this.Field2678 = false;
                return;
            }
            this.Field2678 = a2.getGuiId().equals((Object)"minecraft:chest");
            if (this.Field2678) {
                this.Field2680 = a2.getSlotCount();
                this.Field2681 = a2.getWindowId();
                this.Field2682.clear();
                this.Field2679 = false;
            }
        }
        if (this.Field2678 && a.getPacket() instanceof S30PacketWindowItems && (a2 = (S30PacketWindowItems)a.getPacket()).func_148911_c() == this.Field2681 && !this.Field2679) {
            for (int a4 = 0; a4 < this.Field2680; ++a4) {
                ItemStack a5 = a2.getItemStacks()[a4];
                if (this.Method1068(a5, (S30PacketWindowItems)a2)) continue;
                this.Field2682.Method2530((Object)a4);
            }
            ChatUtils.debug(this.Field2682.Method1799() + "");
            if (!this.Field2682.isEmpty()) {
                Collections.shuffle((List)this.Field2682);
            }
            this.Field2679 = true;
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
        return (float)(System.currentTimeMillis() - Field2676) > this.Field2686.Method2744().floatValue() * 1000.0f;
    }

    @EventTarget
    public void Method712(EventMotion a) {
        int a2 = Class148.Method1445();
        if (a.isPost()) {
            return;
        }
        if (!this.Method713()) {
            return;
        }
        if (ChestStealer.mc.currentScreen instanceof GuiChest) {
            Container a3 = ChestStealer.mc.thePlayer.openContainer;
            ContainerChest a4 = (ContainerChest)a3;
            String a5 = a4.getLowerChestInventory().getDisplayName().getUnformattedText().toLowerCase();
            String a6 = a4.getLowerChestInventory().getDisplayName().getUnformattedText();
            if (a5.equalsIgnoreCase("low") || StatCollector.translateToLocal((String)"container.chest").equalsIgnoreCase(a6) || StatCollector.translateToLocal((String)"container.chestDouble").equalsIgnoreCase(a6)) {
                ItemStack a7;
                int n = 0;
                String[] a8 = new String[]{"menu", "selector", "game", "gui", "server", "inventory", "play", "teleporter", "shop", "melee", "armor", "block", "castle", "mini", "warp", "teleport", "user", "team", "tool", "sure", "trade", "cancel", "accept", "soul", "book", "recipe", "profile", "tele", "port", "map", "kit", "select", "lobby", "vault", "lock"};
                String[] stringArray = a8;
                int n2 = stringArray.length;
                if (n < n2) {
                    String a9 = stringArray[n];
                    if (a5.contains((CharSequence)a9)) {
                        return;
                    }
                    ++n;
                }
                this.Field2678 = true;
                boolean a10 = true;
                ItemStack[] a11 = ChestStealer.mc.thePlayer.inventory.mainInventory;
                int a12 = 0;
                int a13 = ChestStealer.mc.thePlayer.inventory.mainInventory.length;
                if (a12 < a13) {
                    ItemStack a14 = a11[a12];
                    a10 = false;
                    ++a12;
                }
                a12 = 0;
                int a15 = a4.getLowerChestInventory().getSizeInventory() + 1;
                if (a15 > -1) {
                    ItemStack a16 = a4.getLowerChestInventory().getStackInSlot(a15);
                    if (!this.Method1068(a16, null)) {
                        a12 = 1;
                    }
                    --a15;
                }
                ArrayList a22 = new ArrayList();
                int a17 = a4.getLowerChestInventory().getSizeInventory() + 1;
                if (a17 > -1) {
                    a7 = a4.getLowerChestInventory().getStackInSlot(a17);
                    if (!this.Method1068(a7, null)) {
                        a22.Method2530((Object)a17);
                    }
                    --a17;
                }
                Collections.shuffle((List)a22);
                Iterator iterator = a22.Method1383();
                if (iterator.Method932()) {
                    int a18 = (Integer)iterator.Method933();
                    ItemStack a19 = a4.getLowerChestInventory().getStackInSlot(a18);
                    if (a19.getItem() instanceof ItemSword) {
                        a22.set(0, (Object)a18);
                    }
                    if (a19.getItem() instanceof ItemArmor) {
                        a22.set(0, (Object)a18);
                    }
                    if (a19.getItem() instanceof ItemAppleGold) {
                        a22.set(0, (Object)a18);
                    }
                }
                if ((iterator = a22.Method1383()).Method932()) {
                    a7 = (Integer)iterator.Method933();
                    int a20 = 50 * this.Field2687.Method2744().intValue();
                    if (this.Field2688.Method2509().booleanValue() || this.Field2677.Method219(a20)) {
                        ChestStealer.mc.playerController.windowClick(a4.windowId, a7.intValue(), 1, this.Field2689.Method2509() != false ? 0 : 1, (EntityPlayer)ChestStealer.mc.thePlayer);
                        if (this.Field2689.getValue()) {
                            ChestStealer.mc.playerController.windowClick(a4.windowId, -999, 0, 0, (EntityPlayer)ChestStealer.mc.thePlayer);
                        }
                        this.Field2677.Method214();
                    }
                }
            }
            this.Field2678 = false;
        }
    }

    private EnumFacing Method1067(BlockPos a) {
        EnumFacing a2 = null;
        if (!ChestStealer.mc.theWorld.getBlockState(a.add(0, 1, 0)).getBlock().isBlockNormalCube()) {
            a2 = EnumFacing.UP;
        }
        MovingObjectPosition a3 = ChestStealer.mc.theWorld.rayTraceBlocks(new Vec3(ChestStealer.mc.thePlayer.posX, ChestStealer.mc.thePlayer.posY + (double)ChestStealer.mc.thePlayer.getEyeHeight(), ChestStealer.mc.thePlayer.posZ), new Vec3((double)a.getX() + 0.5, (double)a.getY(), (double)a.getZ() + 0.5));
        return a3.sideHit;
    }

    private boolean Method1068(ItemStack a, S30PacketWindowItems a2) {
        if (this.Field2685.isCurrentMode("all")) {
            return false;
        }
        if (Objects.isNull((Object)a)) {
            return true;
        }
        if (a.getItem() instanceof ItemSword) {
            ItemStack a3 = null;
            float a4 = -1.0f;
            for (int a5 = 9; a5 < 45; ++a5) {
                ItemStack a6;
                if (!ChestStealer.mc.thePlayer.inventoryContainer.getSlot(a5).getHasStack() || !((a6 = ChestStealer.mc.thePlayer.inventoryContainer.getSlot(a5).getStack()).getItem() instanceof ItemSword) || !(a.getItem() instanceof ItemSword) || !(a4 < ChestStealer.Method255(a6))) continue;
                a4 = ChestStealer.Method255(a6);
                a3 = a6;
            }
            if (a3.getItem() instanceof ItemSword && a.getItem() instanceof ItemSword) {
                float a7 = ChestStealer.Method255(a3);
                float a8 = ChestStealer.Method255(a);
                return a8 <= a7;
            }
        }
        return this.Method1069(a, a2);
    }

    private boolean Method1069(ItemStack a, S30PacketWindowItems a2) {
        if (this.Field2685.isCurrentMode("SkyWars")) {
            if (a.getItem() instanceof ItemArmor) {
                if (this.Method1070(a, a.getUnlocalizedName())) {
                    return this.Method1072(a, a.getUnlocalizedName());
                }
                return true;
            }
            if (a.getItem() instanceof ItemFishingRod) {
                ItemStack a3 = null;
                float a4 = -1.0f;
                for (int a5 = 9; a5 < 45; ++a5) {
                    ItemStack a6;
                    if (!ChestStealer.mc.thePlayer.inventoryContainer.getSlot(a5).getHasStack() || !((a6 = ChestStealer.mc.thePlayer.inventoryContainer.getSlot(a5).getStack()).getItem() instanceof ItemFishingRod) || !(a.getItem() instanceof ItemFishingRod) || !(a4 < ChestStealer.Method260(a6))) continue;
                    a4 = ChestStealer.Method260(a6);
                    a3 = a6;
                }
                if (a3.getItem() instanceof ItemFishingRod && a.getItem() instanceof ItemFishingRod) {
                    float a7 = ChestStealer.Method260(a3);
                    float a8 = ChestStealer.Method260(a);
                    return a8 <= a7;
                }
            }
            return a.getItem().getUnlocalizedName().contains((CharSequence)"stick") && !a.getItem().getUnlocalizedName().contains((CharSequence)"leg") || a.getItem().getUnlocalizedName().contains((CharSequence)"string") || a.getItem().getUnlocalizedName().contains((CharSequence)"flint") || a.getItem().getUnlocalizedName().contains((CharSequence)"feather") || a.getItem().getUnlocalizedName().contains((CharSequence)"shears") || a.getItem().getUnlocalizedName().contains((CharSequence)"anvil") || a.getItem().getUnlocalizedName().contains((CharSequence)"torch") || a.getItem().getUnlocalizedName().contains((CharSequence)"seeds") || a.getItem().getUnlocalizedName().contains((CharSequence)"leather") || a.getItem() instanceof ItemPickaxe || a.getItem() instanceof ItemGlassBottle || a.getItem() instanceof ItemTool || a.getItem().getUnlocalizedName().contains((CharSequence)"piston") || a.getItem().getUnlocalizedName().contains((CharSequence)"potion") && this.Method237(a);
        }
        if (this.Field2685.isCurrentMode("IGNore")) {
            return a.getItem().getUnlocalizedName().contains((CharSequence)"tnt") || a.getItem().getUnlocalizedName().contains((CharSequence)"stick") || a.getItem().getUnlocalizedName().contains((CharSequence)"egg") && !a.getItem().getUnlocalizedName().contains((CharSequence)"leg") || a.getItem().getUnlocalizedName().contains((CharSequence)"string") || a.getItem().getUnlocalizedName().contains((CharSequence)"flint") || a.getItem().getUnlocalizedName().contains((CharSequence)"compass") || a.getItem().getUnlocalizedName().contains((CharSequence)"feather") || a.getItem().getUnlocalizedName().contains((CharSequence)"bucket") || a.getItem().getUnlocalizedName().contains((CharSequence)"snow") || a.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a.getItem().getUnlocalizedName().contains((CharSequence)"enchant") || a.getItem().getUnlocalizedName().contains((CharSequence)"exp") || a.getItem().getUnlocalizedName().contains((CharSequence)"shears") || a.getItem().getUnlocalizedName().contains((CharSequence)"anvil") || a.getItem().getUnlocalizedName().contains((CharSequence)"torch") || a.getItem().getUnlocalizedName().contains((CharSequence)"seeds") || a.getItem().getUnlocalizedName().contains((CharSequence)"leather") || a.getItem() instanceof ItemPickaxe || a.getItem() instanceof ItemGlassBottle || a.getItem() instanceof ItemTool || a.getItem().getUnlocalizedName().contains((CharSequence)"piston") || a.getItem().getUnlocalizedName().contains((CharSequence)"potion") && this.Method237(a);
        }
        return false;
    }

    public boolean Method1070(ItemStack a, String a2) {
        float a3 = this.Method238(a);
        String a4 = "";
        if (a2.contains((CharSequence)"helmet")) {
            a4 = "helmet";
        } else if (a2.contains((CharSequence)"chestplate")) {
            a4 = "chestplate";
        } else if (a2.contains((CharSequence)"leggings")) {
            a4 = "leggings";
        } else if (a2.contains((CharSequence)"boots")) {
            a4 = "boots";
        }
        for (int a5 = ((ContainerChest)ChestStealer.mc.thePlayer.openContainer).getLowerChestInventory().getSizeInventory() + 1; a5 > -1; --a5) {
            ItemStack a6 = ((ContainerChest)ChestStealer.mc.thePlayer.openContainer).getLowerChestInventory().getStackInSlot(a5);
            if (!(this.Method238(a6) > a3) || !a6.getUnlocalizedName().contains((CharSequence)a4)) continue;
            return false;
        }
        return true;
    }

    public boolean Method1071(ItemStack a, String a2, ItemStack[] a3) {
        float a4 = this.Method238(a);
        String a5 = "";
        if (a2.contains((CharSequence)"helmet")) {
            a5 = "helmet";
        } else if (a2.contains((CharSequence)"chestplate")) {
            a5 = "chestplate";
        } else if (a2.contains((CharSequence)"leggings")) {
            a5 = "leggings";
        } else if (a2.contains((CharSequence)"boots")) {
            a5 = "boots";
        }
        for (ItemStack a6 : a3) {
            if (!(this.Method238(a6) > a4) || !a6.getUnlocalizedName().contains((CharSequence)a5)) continue;
            return false;
        }
        return true;
    }

    public boolean Method1072(ItemStack a, String a2) {
        float a3 = this.Method238(a);
        int a4 = -1;
        String a5 = "";
        if (a2.contains((CharSequence)"helmet")) {
            a4 = 3;
            a5 = "helmet";
        } else if (a2.contains((CharSequence)"chestplate")) {
            a4 = 2;
            a5 = "chestplate";
        } else if (a2.contains((CharSequence)"leggings")) {
            a4 = 1;
            a5 = "leggings";
        } else if (a2.contains((CharSequence)"boots")) {
            a4 = 0;
            a5 = "boots";
        }
        ItemStack a6 = ChestStealer.mc.thePlayer.inventory.armorItemInSlot(a4);
        for (int a7 = 9; a7 < 45; ++a7) {
            if (!ChestStealer.mc.thePlayer.inventoryContainer.getSlot(a7).getHasStack()) continue;
            ItemStack a8 = ChestStealer.mc.thePlayer.inventoryContainer.getSlot(a7).getStack();
            if (!(this.Method238(a8) >= a3) || !a8.getUnlocalizedName().contains((CharSequence)a5)) continue;
            return true;
        }
        return false;
    }

    public float Method238(ItemStack a) {
        float a2 = 0.0f;
        if (a.getItem() instanceof ItemArmor) {
            ItemArmor a3 = (ItemArmor)a.getItem();
            a2 = (float)((double)a2 + ((double)a3.damageReduceAmount + (double)((100 - a3.damageReduceAmount) * EnchantmentHelper.getEnchantmentLevel((int)Enchantment.protection.effectId, (ItemStack)a)) * 0.0075));
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.depthStrider.effectId, (ItemStack)a) / 45.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.featherFalling.effectId, (ItemStack)a) / 40.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.blastProtection.effectId, (ItemStack)a) / 100.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireProtection.effectId, (ItemStack)a) / 100.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.thorns.effectId, (ItemStack)a) / 100.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a) / 50.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.projectileProtection.effectId, (ItemStack)a) / 100.0);
            a2 = a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7abarbarian chestplate") ? 10.76f : a2;
            a2 = a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a76exodus") ? 5.91f : a2;
            a2 = a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7ashoes of vidar") ? 5.91f : a2;
            a2 = a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7ahermes' boots") ? 5.91f : a2;
        }
        return a2;
    }

    private boolean Method237(ItemStack a) {
        if (a.getItem() instanceof ItemPotion) {
            ItemPotion a2 = (ItemPotion)a.getItem();
            if (ItemPotion.isSplash((int)a.getItemDamage())) {
                Iterator iterator = a2.getEffects(a).Method1383();
                while (iterator.Method932()) {
                    Object a3 = iterator.Method933();
                    PotionEffect a4 = (PotionEffect)a3;
                    if (a4.getPotionID() != Potion.poison.getId() && a4.getPotionID() != Potion.harm.getId() && a4.getPotionID() != Potion.moveSlowdown.getId() && a4.getPotionID() != Potion.weakness.getId()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private static float Method255(ItemStack a) {
        float a2 = 0.0f;
        Item a3 = a.getItem();
        if (a3 instanceof ItemTool) {
            a2 += Class749.Method1590(a);
        }
        if (a3 instanceof ItemSword) {
            a2 += Class749.Method1590(a);
        }
        return a2 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a) * 0.5f;
    }

    private static float Method260(ItemStack a) {
        float a2 = 0.0f;
        a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.knockback.effectId, (ItemStack)a) * 1.0);
        return a2;
    }
}