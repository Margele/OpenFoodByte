/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  net.minecraft.block.Block
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemAppleGold
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemAxe
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemEnchantedBook
 *  net.minecraft.item.ItemFishingRod
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemGlassBottle
 *  net.minecraft.item.ItemHoe
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.item.ItemPotion
 *  net.minecraft.item.ItemSpade
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.item.ItemTool
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AutoSword;
import trash.foodbyte.module.impl.player.AutoArmor;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class InvCleaner
extends Module {
    private static List Field2720;
    public ModeValue Field2721 = new ModeValue("InvCleaner", "Mode", "Basic", new String[]{"Basic", "OpenInv"}, "\u6a21\u5f0f\u9009\u62e9");
    public ModeValue Field2722 = new ModeValue("InvCleaner", "Item List", "SkyWars", new String[]{"SkyWars", "UHC"}, "{\u7a7a\u5c9b\u6a21\u5f0f,UHC\u6a21\u5f0f}");
    public FloatValue Field2723 = new FloatValue("InvCleaner", "Blockcap", 128.0, 0.0, 512.0, 8.0, "\u7559\u591a\u5c11\u65b9\u5757\u5728\u80cc\u5305\u91cc");
    public FloatValue Field2724 = new FloatValue("InvCleaner", "Delay", 1.0, 1.0, 10.0, 1.0, "\u4e22\u7269\u54c1\u5ef6\u8fdf");
    public BooleanValue Field2725 = new BooleanValue("InvCleaner", "Tools", (Boolean)true, "\u662f\u5426\u4fdd\u7559\u5de5\u5177");
    public BooleanValue Field2726 = new BooleanValue("InvCleaner", "Archery", (Boolean)true, "\u662f\u5426\u4e22\u6389\u5f13\u548c\u5f13\u7bad");
    public BooleanValue Field2727 = new BooleanValue("InvCleaner", "FOOD", (Boolean)true, "\u662f\u5426\u4fdd\u7559\u98df\u7269");
    public BooleanValue Field2728 = new BooleanValue("InvCleaner", "Toggle", (Boolean)false, "\u6254\u5b8c\u540e\u662f\u5426\u5173\u95ed\u529f\u80fd");
    public static TimeHelper Field2729;
    ArrayList Field2730 = new ArrayList();
    public static int Field2731;
    public static int Field2732;
    public static int Field2733;
    public static int Field2734;
    public static int Field2735;
    public static int Field2736;
    public static int Field2737;
    public static int Field2738;

    public static List Method231() {
        return Field2720;
    }

    public InvCleaner() {
        super("InvCleaner", "Inv Cleaner", Category.PLAYER);
        this.setDescription("\u80cc\u5305\u6e05\u7406(\u81ea\u52a8\u4e22\u5783\u573e)");
        Field2720 = Arrays.asList((Object[])new Block[]{Blocks.crafting_table, Blocks.gold_ore, Blocks.anvil, Blocks.tnt, Blocks.gold_block, Blocks.iron_block, Blocks.diamond_block});
    }

    /*
     * Exception decompiling
     */
    @EventTarget
    public void Method232(EventUpdate a) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 27[FORLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at cuchaz.enigma.source.cfr.CfrSource.ensureDecompiled(CfrSource.java:81)
         *     at cuchaz.enigma.source.cfr.CfrSource.asString(CfrSource.java:50)
         *     at cuchaz.enigma.EnigmaProject$JarExport.decompileClass(EnigmaProject.java:298)
         *     at cuchaz.enigma.EnigmaProject$JarExport.lambda$decompileStream$1(EnigmaProject.java:274)
         *     at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
         *     at java.base/java.util.AbstractList$RandomAccessSpliterator.forEachRemaining(AbstractList.java:720)
         *     at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
         *     at java.base/java.util.stream.ForEachOps$ForEachTask.compute(ForEachOps.java:290)
         *     at java.base/java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:754)
         *     at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:373)
         *     at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1182)
         *     at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1655)
         *     at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1622)
         *     at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:165)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void Method233(int a2) {
        for (int a3 = 9; a3 < 45; ++a3) {
            ItemStack a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !this.Method237(a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()) || !(InvCleaner.Method238(a4) > 0.0f) || !(a4.getItem() instanceof ItemSword)) continue;
            this.Method235(a3, a2 - 36);
            Field2729.reset();
            break;
        }
    }

    public void Method234(int a2) {
        InvCleaner.mc.playerController.windowClick(InvCleaner.mc.thePlayer.inventoryContainer.windowId, a2, 0, 1, (EntityPlayer)InvCleaner.mc.thePlayer);
    }

    public void Method235(int a2, int a3) {
        InvCleaner.mc.playerController.windowClick(InvCleaner.mc.thePlayer.inventoryContainer.windowId, a2, a3, 2, (EntityPlayer)InvCleaner.mc.thePlayer);
    }

    public void Method236(int a2) {
        InvCleaner.mc.playerController.windowClick(InvCleaner.mc.thePlayer.inventoryContainer.windowId, a2, 1, 4, (EntityPlayer)InvCleaner.mc.thePlayer);
    }

    public boolean Method237(ItemStack a2) {
        float a3 = InvCleaner.Method238(a2);
        for (int a4 = 9; a4 < 45; ++a4) {
            ItemStack a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack() || !(InvCleaner.Method238(a5 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getStack()) > a3) || !(a5.getItem() instanceof ItemSword)) continue;
            return false;
        }
        return a2.getItem() instanceof ItemSword;
    }

    private static float Method238(ItemStack a2) {
        float a3 = 0.0f;
        Item a4 = a2.getItem();
        if (a4 instanceof ItemTool) {
            a3 += PlayerUtils.Method1590(a2);
        }
        if (a4 instanceof ItemSword) {
            a3 += PlayerUtils.Method1590(a2);
        }
        return a3 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a2) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a2) * 0.25f;
    }

    public boolean Method239(ItemStack a2, int a3) {
        if (a3 == Field2735 + AutoSword.Field2609.getFloatValue().intValue() - 1 && this.Method237(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2735 + AutoSword.Field2609.getFloatValue().intValue() - 1).getStack())) {
            return false;
        }
        if (a3 == Field2738 && this.Method252(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2738).getStack()) && Field2738 >= 0 || a3 == Field2737 && this.Method254(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2737).getStack()) && Field2737 >= 0 || a3 == Field2736 && this.Method253(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2736).getStack()) && Field2736 >= 0) {
            return false;
        }
        return this.Method240(a2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean Method240(ItemStack a2) {
        int a3;
        Item a4 = a2.getItem();
        int n = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a2);
        int a5 = Class148.Method1445();
        int a6 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a2);
        int a7 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.protection.effectId, (ItemStack)a2);
        int a8 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.infinity.effectId, (ItemStack)a2);
        if (a2.getItem() instanceof ItemArmor && (a3 = 1) < 5) {
            ItemStack a9;
            if (InvCleaner.mc.thePlayer.inventoryContainer.getSlot(4 + a3).getHasStack() && AutoArmor.Method239(a9 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(4 + a3).getStack(), a3)) {
            }
            if (AutoArmor.Method239(a2, a3)) {
                return false;
            }
            ++a3;
        }
        if (a2.getItem() instanceof ItemPotion && this.Method256(a2)) {
            return true;
        }
        if (Item.getIdFromItem((Item)a4) == 326 && this.Method244() <= 1) {
            return false;
        }
        if (a2.getItem() instanceof ItemFishingRod && this.Method261(a2)) {
            return false;
        }
        if (a2.getItem() instanceof ItemBow && this.Method259(a2)) {
            return false;
        }
        if (this.Field2722.isCurrentMode("SkyWars")) {
            if (a2.getItem() instanceof ItemBlock && this.Method242() > this.Field2723.getFloatValue().intValue()) {
                return true;
            }
            if (a2.getItem().getUnlocalizedName().contains((CharSequence)"stick") || a2.getItem().getUnlocalizedName().contains((CharSequence)"string") || a2.getItem().getUnlocalizedName().contains((CharSequence)"cake") || a2.getItem().getUnlocalizedName().contains((CharSequence)"mushroom") || a2.getItem().getUnlocalizedName().contains((CharSequence)"flint") || a2.getItem().getUnlocalizedName().contains((CharSequence)"dyePowder") || a2.getItem().getUnlocalizedName().contains((CharSequence)"feather") || a2.getItem().getUnlocalizedName().contains((CharSequence)"bucket") || a2.getItem().getUnlocalizedName().contains((CharSequence)"chest") && !a2.getDisplayName().toLowerCase().contains((CharSequence)"collect") || a2.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a2.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a2.getItem().getUnlocalizedName().contains((CharSequence)"enchant") || a2.getItem().getUnlocalizedName().contains((CharSequence)"exp") || a2.getItem().getUnlocalizedName().contains((CharSequence)"shears") || a2.getItem().getUnlocalizedName().contains((CharSequence)"anvil") || a2.getItem().getUnlocalizedName().contains((CharSequence)"torch") || a2.getItem().getUnlocalizedName().contains((CharSequence)"seeds") || a2.getItem().getUnlocalizedName().contains((CharSequence)"leather") || a2.getItem().getUnlocalizedName().contains((CharSequence)"reeds") || a2.getItem().getUnlocalizedName().contains((CharSequence)"Iron") || a2.getItem().getUnlocalizedName().contains((CharSequence)"Tag") || a2.getItem().getUnlocalizedName().contains((CharSequence)"slime") || a2.getItem().getUnlocalizedName().contains((CharSequence)"sign") || a2.getItem().getUnlocalizedName().contains((CharSequence)"blaze") || a2.getItem().getUnlocalizedName().contains((CharSequence)"horse") || a2.getItem().getUnlocalizedName().contains((CharSequence)"coal") || a2.getItem().getUnlocalizedName().contains((CharSequence)"bone") || a2.getItem().getUnlocalizedName().contains((CharSequence)"Gunpowder") || a2.getItem().getUnlocalizedName().contains((CharSequence)"paper") || a2.getItem().getUnlocalizedName().contains((CharSequence)"book") || a2.getItem().getUnlocalizedName().contains((CharSequence)"redstone") || a2.getItem().getUnlocalizedName().contains((CharSequence)"skull") || a2.getItem().getUnlocalizedName().contains((CharSequence)"record") || a2.getItem().getUnlocalizedName().contains((CharSequence)"wheat") || a2.getItem() instanceof ItemGlassBottle || a2.getItem().getUnlocalizedName().contains((CharSequence)"piston")) {
                return true;
            }
        }
        if (this.Field2722.isCurrentMode("UHC")) {
            void a10;
            if (a2.getItem() instanceof ItemBlock && Field2720.contains((Object)((ItemBlock)a2.getItem()).getBlock())) {
                return false;
            }
            if (a2.getItem() instanceof ItemBlock && this.Method242() > this.Field2723.getFloatValue().intValue()) {
                return true;
            }
            if (a2.getDisplayName().toLowerCase().contains((CharSequence)"dragon armor") || a2.getDisplayName().toLowerCase().contains((CharSequence)"death's scythe") || a2.getDisplayName().toLowerCase().contains((CharSequence)"barbarian chestplate") || a2.getDisplayName().toLowerCase().contains((CharSequence)"exodus") || a2.getDisplayName().toLowerCase().contains((CharSequence)"exper seal") || a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00faril") || a2.getDisplayName().toLowerCase().contains((CharSequence)"perun") || a2.getDisplayName().toLowerCase().contains((CharSequence)"leviathan") || a2.getDisplayName().toLowerCase().contains((CharSequence)"excalibur") || a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7cfusion")) {
                return false;
            }
            if (a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u6f6e\u6c50\u62a4\u817f") || a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u6c38\u751f\u5e3d") || a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u9739\u9686\u4e4b\u65a7") || a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u5b89\u90fd\u745e\u5c14\u4e4b\u5251") || a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u4e30\u9976\u4e4b\u89d2") || a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u86ee\u65cf\u4e4b\u7532") || a2.getDisplayName().toLowerCase().contains((CharSequence)"a\u5de8\u9f99\u4e4b\u5251") || a2.getDisplayName().contains((CharSequence)"Axe of Perun")) {
                return false;
            }
            if (a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7aforge") || a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u953b\u7089") || a2.getDisplayName().toLowerCase().contains((CharSequence)"backpack")) {
                return false;
            }
            if (a2.getDisplayName().toLowerCase().contains((CharSequence)"bloodlust")) {
                return false;
            }
            if (a2.getDisplayName().contains((CharSequence)"Wither Skeleton Skull") || a2.getDisplayName().contains((CharSequence)"Creeper Head") || a2.getDisplayName().contains((CharSequence)"Skeleton Skull") || a2.getDisplayName().contains((CharSequence)"Zombie Head")) {
                return true;
            }
            if (Item.getIdFromItem((Item)a4) == 397 && a2.getItemDamage() == 3) {
                return false;
            }
            if (Item.getIdFromItem((Item)a4) == 276 && (a10 >= 3 || a6 >= 1)) {
                return false;
            }
            if (a2.getItem() instanceof ItemEnchantedBook) {
                int a11 = 0;
                NBTTagList a12 = Items.enchanted_book.getEnchantments(a2);
                if (a11 < a12.tagCount()) {
                    short a13 = a12.getCompoundTagAt(a11).getShort("id");
                    short a14 = a12.getCompoundTagAt(a11).getShort("lvl");
                    if (a13 == Enchantment.sharpness.effectId && a14 >= 3 || a13 == Enchantment.fireAspect.effectId || a13 == Enchantment.efficiency.effectId && a14 >= 3 || a13 == Enchantment.fortune.effectId || a13 == Enchantment.featherFalling.effectId && a14 >= 3 || a13 == Enchantment.protection.effectId || a13 == Enchantment.punch.effectId || a13 == Enchantment.flame.effectId || a13 == Enchantment.infinity.effectId || a13 == Enchantment.depthStrider.effectId) {
                        return false;
                    }
                    ++a11;
                }
                return true;
            }
            if (a2.getDisplayName().toLowerCase().contains((CharSequence)"k||") || a2.getDisplayName().toLowerCase().contains((CharSequence)"cornucopia")) {
                return false;
            }
            if (Item.getIdFromItem((Item)a4) == 263 && this.Method243() <= 64) {
                return false;
            }
            if (Item.getIdFromItem((Item)a4) == 345 && this.Method247() <= 1) {
                return false;
            }
            if (Item.getIdFromItem((Item)a4) == 265 && this.Method248() <= 64) {
                return false;
            }
            if (a2.getItem().getUnlocalizedName().contains((CharSequence)"stick") || a2.getItem().getUnlocalizedName().contains((CharSequence)"string") || a2.getItem().getUnlocalizedName().contains((CharSequence)"cake") || a2.getItem().getUnlocalizedName().contains((CharSequence)"mushroom") || a2.getItem().getUnlocalizedName().contains((CharSequence)"flint") || a2.getItem().getUnlocalizedName().contains((CharSequence)"dyePowder") || a2.getItem().getUnlocalizedName().contains((CharSequence)"feather") || a2.getItem().getUnlocalizedName().contains((CharSequence)"bucket") || a2.getItem().getUnlocalizedName().contains((CharSequence)"chest") && !a2.getDisplayName().toLowerCase().contains((CharSequence)"collect") || a2.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a2.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a2.getItem().getUnlocalizedName().contains((CharSequence)"enchant") || a2.getItem().getUnlocalizedName().contains((CharSequence)"exp") || a2.getItem().getUnlocalizedName().contains((CharSequence)"shears") || a2.getItem().getUnlocalizedName().contains((CharSequence)"anvil") || a2.getItem().getUnlocalizedName().contains((CharSequence)"torch") || a2.getItem().getUnlocalizedName().contains((CharSequence)"seeds") || a2.getItem().getUnlocalizedName().contains((CharSequence)"leather") || a2.getItem().getUnlocalizedName().contains((CharSequence)"reeds") || a2.getItem().getUnlocalizedName().contains((CharSequence)"Iron") || a2.getItem().getUnlocalizedName().contains((CharSequence)"Tag") || a2.getItem().getUnlocalizedName().contains((CharSequence)"slime") || a2.getItem().getUnlocalizedName().contains((CharSequence)"sign") || a2.getItem().getUnlocalizedName().contains((CharSequence)"blaze") || a2.getItem().getUnlocalizedName().contains((CharSequence)"horse") || a2.getItem().getUnlocalizedName().contains((CharSequence)"coal") || a2.getItem().getUnlocalizedName().contains((CharSequence)"bone") || a2.getItem().getUnlocalizedName().contains((CharSequence)"Gunpowder") || a2.getItem().getUnlocalizedName().contains((CharSequence)"paper") || a2.getItem().getUnlocalizedName().contains((CharSequence)"book") || a2.getItem().getUnlocalizedName().contains((CharSequence)"redstone") || a2.getItem().getUnlocalizedName().contains((CharSequence)"skull") || a2.getItem().getUnlocalizedName().contains((CharSequence)"record") || a2.getItem().getUnlocalizedName().contains((CharSequence)"wheat") || a2.getItem() instanceof ItemGlassBottle || a2.getItem().getUnlocalizedName().contains((CharSequence)"piston")) {
                return true;
            }
        }
        if (a2.getItem().getUnlocalizedName().contains((CharSequence)"arrow") && this.Field2726.getBooleanValue().booleanValue()) {
            return true;
        }
        if (a2.getItem() instanceof ItemBow) {
            return true;
        }
        if (a2.getItem() instanceof ItemAppleGold || a2.getItem().getUnlocalizedName().contains((CharSequence)"apple")) {
            return false;
        }
        if (a2.getItem() instanceof ItemFood && this.Field2727.getBooleanValue().booleanValue()) {
            return true;
        }
        return a2.getItem() instanceof ItemHoe || a2.getItem() instanceof ItemTool || a2.getItem() instanceof ItemSword || a2.getItem() instanceof ItemArmor;
    }

    public ArrayList Method241() {
        return this.Field2730;
    }

    private int Method242() {
        int a2 = 0;
        for (int a3 = 0; a3 < 45; ++a3) {
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack()) continue;
            ItemStack a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack();
            Item a5 = a4.getItem();
            if (!(a4.getItem() instanceof ItemBlock)) continue;
            a2 += a4.stackSize;
        }
        return a2;
    }

    private int Method243() {
        int a2 = 0;
        for (int a3 = 0; a3 < 45; ++a3) {
            ItemStack a4;
            Item a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || Item.getIdFromItem((Item)(a5 = (a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()).getItem())) != 263) continue;
            a2 += a4.stackSize;
        }
        return a2;
    }

    private int Method244() {
        int a2 = 0;
        for (int a3 = 0; a3 < 45; ++a3) {
            ItemStack a4;
            Item a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || Item.getIdFromItem((Item)(a5 = (a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()).getItem())) != 326) continue;
            a2 += a4.stackSize;
        }
        return a2;
    }

    private int Method245() {
        int a2 = 0;
        for (int a3 = 0; a3 < 45; ++a3) {
            ItemStack a4;
            Item a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !((a5 = (a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()).getItem()) instanceof ItemFishingRod)) continue;
            a2 += a4.stackSize;
        }
        return a2;
    }

    private int Method246() {
        int a2 = 0;
        for (int a3 = 0; a3 < 45; ++a3) {
            ItemStack a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !((a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()).getItem() instanceof ItemBow)) continue;
            a2 += a4.stackSize;
        }
        return a2;
    }

    private int Method247() {
        int a2 = 0;
        for (int a3 = 0; a3 < 45; ++a3) {
            ItemStack a4;
            Item a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || Item.getIdFromItem((Item)(a5 = (a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()).getItem())) != 345) continue;
            a2 += a4.stackSize;
        }
        return a2;
    }

    private int Method248() {
        int a2 = 0;
        for (int a3 = 0; a3 < 45; ++a3) {
            ItemStack a4;
            Item a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || Item.getIdFromItem((Item)(a5 = (a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()).getItem())) != 265) continue;
            a2 += a4.stackSize;
        }
        return a2;
    }

    private void Method249(int a2) {
        for (int a3 = 9; a3 < 45; ++a3) {
            ItemStack a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !this.Method252(a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()) || Field2738 == a3 || this.Method237(a4)) continue;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2738).getHasStack()) {
                this.Method235(a3, Field2738 - 36);
                Field2729.reset();
                if (this.Field2724.getFloatValue().longValue() <= 0L) continue;
                return;
            }
            if (this.Method252(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2738).getStack())) continue;
            this.Method235(a3, Field2738 - 36);
            Field2729.reset();
            if (this.Field2724.getFloatValue().longValue() <= 0L) continue;
            return;
        }
    }

    private void Method250(int a2) {
        for (int a3 = 9; a3 < 45; ++a3) {
            ItemStack a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !this.Method253(a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()) || Field2736 == a3 || this.Method237(a4)) continue;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2736).getHasStack()) {
                this.Method235(a3, Field2736 - 36);
                Field2729.reset();
                if (this.Field2724.getFloatValue().longValue() <= 0L) continue;
                return;
            }
            if (this.Method253(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2736).getStack())) continue;
            this.Method235(a3, Field2736 - 36);
            Field2729.reset();
            if (this.Field2724.getFloatValue().longValue() <= 0L) continue;
            return;
        }
    }

    private void Method251(int a2) {
        for (int a3 = 9; a3 < 45; ++a3) {
            ItemStack a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !this.Method254(a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()) || Field2737 == a3 || this.Method237(a4)) continue;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2737).getHasStack()) {
                this.Method235(a3, Field2737 - 36);
                Field2729.reset();
                if (this.Field2724.getFloatValue().longValue() <= 0L) continue;
                return;
            }
            if (this.Method254(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2737).getStack())) continue;
            this.Method235(a3, Field2737 - 36);
            Field2729.reset();
            if (this.Field2724.getFloatValue().longValue() <= 0L) continue;
            return;
        }
    }

    private boolean Method252(ItemStack a2) {
        Item a3 = a2.getItem();
        if (!(a3 instanceof ItemPickaxe)) {
            return false;
        }
        float a4 = this.Method255(a2);
        for (int a5 = 9; a5 < 45; ++a5) {
            ItemStack a6;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a5).getHasStack() || !(this.Method255(a6 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a5).getStack()) > a4) || !(a6.getItem() instanceof ItemPickaxe)) continue;
            return false;
        }
        return true;
    }

    private boolean Method253(ItemStack a2) {
        Item a3 = a2.getItem();
        if (!(a3 instanceof ItemSpade)) {
            return false;
        }
        float a4 = this.Method255(a2);
        for (int a5 = 9; a5 < 45; ++a5) {
            ItemStack a6;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a5).getHasStack() || !(this.Method255(a6 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a5).getStack()) > a4) || !(a6.getItem() instanceof ItemSpade)) continue;
            return false;
        }
        return true;
    }

    private boolean Method254(ItemStack a2) {
        Item a3 = a2.getItem();
        if (!(a3 instanceof ItemAxe)) {
            return false;
        }
        float a4 = this.Method255(a2);
        for (int a5 = 9; a5 < 45; ++a5) {
            ItemStack a6;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a5).getHasStack() || !(this.Method255(a6 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a5).getStack()) > a4) || !(a6.getItem() instanceof ItemAxe) || this.Method237(a2)) continue;
            return false;
        }
        return true;
    }

    private float Method255(ItemStack a2) {
        Item a3 = a2.getItem();
        if (!(a3 instanceof ItemTool)) {
            return 0.0f;
        }
        String a4 = a3.getUnlocalizedName();
        ItemTool a5 = (ItemTool)a3;
        float a6 = 1.0f;
        if (a3 instanceof ItemPickaxe) {
            a6 = a5.getStrVsBlock(a2, Blocks.stone);
            if (a4.toLowerCase().contains((CharSequence)"gold")) {
                a6 -= 5.0f;
            }
        } else if (a3 instanceof ItemSpade) {
            a6 = a5.getStrVsBlock(a2, Blocks.dirt);
            if (a4.toLowerCase().contains((CharSequence)"gold")) {
                a6 -= 5.0f;
            }
        } else if (a3 instanceof ItemAxe) {
            a6 = a5.getStrVsBlock(a2, Blocks.log);
            if (a4.toLowerCase().contains((CharSequence)"gold")) {
                a6 -= 5.0f;
            }
        } else {
            return 1.0f;
        }
        a6 = (float)((double)a6 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.efficiency.effectId, (ItemStack)a2) * 0.0075);
        a6 = (float)((double)a6 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a2) / 100.0);
        return a6;
    }

    private boolean Method256(ItemStack a2) {
        if (a2.getItem() instanceof ItemPotion) {
            ItemPotion a3 = (ItemPotion)a2.getItem();
            if (a3.getEffects(a2) == null) {
                return true;
            }
            Iterator iterator = a3.getEffects(a2).Method1383();
            while (iterator.Method932()) {
                Object a4 = iterator.Method933();
                PotionEffect a5 = (PotionEffect)a4;
                if (a5.getPotionID() != Potion.poison.getId() && a5.getPotionID() != Potion.harm.getId() && a5.getPotionID() != Potion.moveSlowdown.getId() && a5.getPotionID() != Potion.weakness.getId()) continue;
                return true;
            }
        }
        return false;
    }

    boolean Method257(int a2) {
        for (int a3 = 9; a3 < 45; ++a3) {
            ItemStack a4;
            Item a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !((a5 = (a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()).getItem()) instanceof ItemArmor)) continue;
            ItemArmor a6 = (ItemArmor)a5;
            if (a2 != a6.armorType) continue;
            return true;
        }
        return false;
    }

    public void Method258() {
        for (int a2 = 1; a2 < 5; ++a2) {
            if (InvCleaner.mc.thePlayer.inventoryContainer.getSlot(4 + a2).getHasStack()) {
                ItemStack a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(4 + a2).getStack();
                if (AutoArmor.Method239(a3, a2)) continue;
                this.Method236(4 + a2);
            }
            for (int a4 = 9; a4 < 45; ++a4) {
                ItemStack a5;
                if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack() || !AutoArmor.Method239(a5 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getStack(), a2) || !(AutoArmor.Method238(a5) > 0.0f)) continue;
                this.Method234(a4);
                Field2729.reset();
                if (this.Field2724.getFloatValue().longValue() <= 0L) continue;
                return;
            }
        }
    }

    public boolean Method259(ItemStack a2) {
        float a3 = InvCleaner.Method260(a2);
        for (int a4 = 9; a4 < 45; ++a4) {
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack()) continue;
            ItemStack a5 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getStack();
            if (!(InvCleaner.Method260(a5) >= a3) || !(a5.getItem() instanceof ItemBow) || a2 == a5) continue;
            return false;
        }
        return true;
    }

    private static float Method260(ItemStack a2) {
        float a3 = 7.0f;
        return a3 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.power.effectId, (ItemStack)a2) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.flame.effectId, (ItemStack)a2) * 0.5f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.punch.effectId, (ItemStack)a2) * 0.1f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a2) * 0.001f;
    }

    public boolean Method261(ItemStack a2) {
        float a3 = InvCleaner.Method262(a2);
        for (int a4 = 9; a4 < 45; ++a4) {
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack()) continue;
            ItemStack a5 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getStack();
            if (!(InvCleaner.Method262(a5) >= a3) || !a5.getUnlocalizedName().toLowerCase().contains((CharSequence)"fish") || a2 == a5) continue;
            return false;
        }
        return true;
    }

    private static float Method262(ItemStack a2) {
        float a3 = 0.0f;
        a3 = (float)((double)a3 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.knockback.effectId, (ItemStack)a2) * 1.0);
        return a3;
    }

    static {
        Field2729 = new TimeHelper();
        Field2731 = 36;
        Field2732 = 37;
        Field2733 = 38;
        Field2734 = 39;
        Field2735 = 36;
        Field2736 = 42;
        Field2737 = 43;
        Field2738 = 44;
    }

    private static Exception Method263(Exception exception) {
        return exception;
    }
}