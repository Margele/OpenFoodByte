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
import awsl.Class634;
import awsl.Class749;
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
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AutoSword;
import trash.foodbyte.module.impl.player.AutoArmor;
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
    public void Method232(Class634 a) {
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

    public void Method233(int a) {
        for (int a2 = 9; a2 < 45; ++a2) {
            ItemStack a3;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || !this.Method237(a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()) || !(InvCleaner.Method238(a3) > 0.0f) || !(a3.getItem() instanceof ItemSword)) continue;
            this.Method235(a2, a - 36);
            Field2729.Method214();
            break;
        }
    }

    public void Method234(int a) {
        InvCleaner.mc.playerController.windowClick(InvCleaner.mc.thePlayer.inventoryContainer.windowId, a, 0, 1, (EntityPlayer)InvCleaner.mc.thePlayer);
    }

    public void Method235(int a, int a2) {
        InvCleaner.mc.playerController.windowClick(InvCleaner.mc.thePlayer.inventoryContainer.windowId, a, a2, 2, (EntityPlayer)InvCleaner.mc.thePlayer);
    }

    public void Method236(int a) {
        InvCleaner.mc.playerController.windowClick(InvCleaner.mc.thePlayer.inventoryContainer.windowId, a, 1, 4, (EntityPlayer)InvCleaner.mc.thePlayer);
    }

    public boolean Method237(ItemStack a) {
        float a2 = InvCleaner.Method238(a);
        for (int a3 = 9; a3 < 45; ++a3) {
            ItemStack a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !(InvCleaner.Method238(a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack()) > a2) || !(a4.getItem() instanceof ItemSword)) continue;
            return false;
        }
        return a.getItem() instanceof ItemSword;
    }

    private static float Method238(ItemStack a) {
        float a2 = 0.0f;
        Item a3 = a.getItem();
        if (a3 instanceof ItemTool) {
            a2 += Class749.Method1590(a);
        }
        if (a3 instanceof ItemSword) {
            a2 += Class749.Method1590(a);
        }
        return a2 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a) * 0.25f;
    }

    public boolean Method239(ItemStack a, int a2) {
        if (a2 == Field2735 + AutoSword.Field2609.Method2744().intValue() - 1 && this.Method237(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2735 + AutoSword.Field2609.Method2744().intValue() - 1).getStack())) {
            return false;
        }
        if (a2 == Field2738 && this.Method252(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2738).getStack()) && Field2738 >= 0 || a2 == Field2737 && this.Method254(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2737).getStack()) && Field2737 >= 0 || a2 == Field2736 && this.Method253(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2736).getStack()) && Field2736 >= 0) {
            return false;
        }
        return this.Method240(a);
    }

    /*
     * WARNING - void declaration
     */
    private boolean Method240(ItemStack a) {
        int a2;
        Item a3 = a.getItem();
        int n = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a);
        int a4 = Class148.Method1445();
        int a5 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a);
        int a6 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.protection.effectId, (ItemStack)a);
        int a7 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.infinity.effectId, (ItemStack)a);
        if (a.getItem() instanceof ItemArmor && (a2 = 1) < 5) {
            ItemStack a8;
            if (InvCleaner.mc.thePlayer.inventoryContainer.getSlot(4 + a2).getHasStack() && AutoArmor.Method239(a8 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(4 + a2).getStack(), a2)) {
            }
            if (AutoArmor.Method239(a, a2)) {
                return false;
            }
            ++a2;
        }
        if (a.getItem() instanceof ItemPotion && this.Method256(a)) {
            return true;
        }
        if (Item.getIdFromItem((Item)a3) == 326 && this.Method244() <= 1) {
            return false;
        }
        if (a.getItem() instanceof ItemFishingRod && this.Method261(a)) {
            return false;
        }
        if (a.getItem() instanceof ItemBow && this.Method259(a)) {
            return false;
        }
        if (this.Field2722.isCurrentMode("SkyWars")) {
            if (a.getItem() instanceof ItemBlock && this.Method242() > this.Field2723.Method2744().intValue()) {
                return true;
            }
            if (a.getItem().getUnlocalizedName().contains((CharSequence)"stick") || a.getItem().getUnlocalizedName().contains((CharSequence)"string") || a.getItem().getUnlocalizedName().contains((CharSequence)"cake") || a.getItem().getUnlocalizedName().contains((CharSequence)"mushroom") || a.getItem().getUnlocalizedName().contains((CharSequence)"flint") || a.getItem().getUnlocalizedName().contains((CharSequence)"dyePowder") || a.getItem().getUnlocalizedName().contains((CharSequence)"feather") || a.getItem().getUnlocalizedName().contains((CharSequence)"bucket") || a.getItem().getUnlocalizedName().contains((CharSequence)"chest") && !a.getDisplayName().toLowerCase().contains((CharSequence)"collect") || a.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a.getItem().getUnlocalizedName().contains((CharSequence)"enchant") || a.getItem().getUnlocalizedName().contains((CharSequence)"exp") || a.getItem().getUnlocalizedName().contains((CharSequence)"shears") || a.getItem().getUnlocalizedName().contains((CharSequence)"anvil") || a.getItem().getUnlocalizedName().contains((CharSequence)"torch") || a.getItem().getUnlocalizedName().contains((CharSequence)"seeds") || a.getItem().getUnlocalizedName().contains((CharSequence)"leather") || a.getItem().getUnlocalizedName().contains((CharSequence)"reeds") || a.getItem().getUnlocalizedName().contains((CharSequence)"Iron") || a.getItem().getUnlocalizedName().contains((CharSequence)"Tag") || a.getItem().getUnlocalizedName().contains((CharSequence)"slime") || a.getItem().getUnlocalizedName().contains((CharSequence)"sign") || a.getItem().getUnlocalizedName().contains((CharSequence)"blaze") || a.getItem().getUnlocalizedName().contains((CharSequence)"horse") || a.getItem().getUnlocalizedName().contains((CharSequence)"coal") || a.getItem().getUnlocalizedName().contains((CharSequence)"bone") || a.getItem().getUnlocalizedName().contains((CharSequence)"Gunpowder") || a.getItem().getUnlocalizedName().contains((CharSequence)"paper") || a.getItem().getUnlocalizedName().contains((CharSequence)"book") || a.getItem().getUnlocalizedName().contains((CharSequence)"redstone") || a.getItem().getUnlocalizedName().contains((CharSequence)"skull") || a.getItem().getUnlocalizedName().contains((CharSequence)"record") || a.getItem().getUnlocalizedName().contains((CharSequence)"wheat") || a.getItem() instanceof ItemGlassBottle || a.getItem().getUnlocalizedName().contains((CharSequence)"piston")) {
                return true;
            }
        }
        if (this.Field2722.isCurrentMode("UHC")) {
            void a9;
            if (a.getItem() instanceof ItemBlock && Field2720.contains((Object)((ItemBlock)a.getItem()).getBlock())) {
                return false;
            }
            if (a.getItem() instanceof ItemBlock && this.Method242() > this.Field2723.Method2744().intValue()) {
                return true;
            }
            if (a.getDisplayName().toLowerCase().contains((CharSequence)"dragon armor") || a.getDisplayName().toLowerCase().contains((CharSequence)"death's scythe") || a.getDisplayName().toLowerCase().contains((CharSequence)"barbarian chestplate") || a.getDisplayName().toLowerCase().contains((CharSequence)"exodus") || a.getDisplayName().toLowerCase().contains((CharSequence)"exper seal") || a.getDisplayName().toLowerCase().contains((CharSequence)"\u00faril") || a.getDisplayName().toLowerCase().contains((CharSequence)"perun") || a.getDisplayName().toLowerCase().contains((CharSequence)"leviathan") || a.getDisplayName().toLowerCase().contains((CharSequence)"excalibur") || a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7cfusion")) {
                return false;
            }
            if (a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u6f6e\u6c50\u62a4\u817f") || a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u6c38\u751f\u5e3d") || a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u9739\u9686\u4e4b\u65a7") || a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u5b89\u90fd\u745e\u5c14\u4e4b\u5251") || a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u4e30\u9976\u4e4b\u89d2") || a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u86ee\u65cf\u4e4b\u7532") || a.getDisplayName().toLowerCase().contains((CharSequence)"a\u5de8\u9f99\u4e4b\u5251") || a.getDisplayName().contains((CharSequence)"Axe of Perun")) {
                return false;
            }
            if (a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7aforge") || a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7a\u953b\u7089") || a.getDisplayName().toLowerCase().contains((CharSequence)"backpack")) {
                return false;
            }
            if (a.getDisplayName().toLowerCase().contains((CharSequence)"bloodlust")) {
                return false;
            }
            if (a.getDisplayName().contains((CharSequence)"Wither Skeleton Skull") || a.getDisplayName().contains((CharSequence)"Creeper Head") || a.getDisplayName().contains((CharSequence)"Skeleton Skull") || a.getDisplayName().contains((CharSequence)"Zombie Head")) {
                return true;
            }
            if (Item.getIdFromItem((Item)a3) == 397 && a.getItemDamage() == 3) {
                return false;
            }
            if (Item.getIdFromItem((Item)a3) == 276 && (a9 >= 3 || a5 >= 1)) {
                return false;
            }
            if (a.getItem() instanceof ItemEnchantedBook) {
                int a10 = 0;
                NBTTagList a11 = Items.enchanted_book.getEnchantments(a);
                if (a10 < a11.tagCount()) {
                    short a12 = a11.getCompoundTagAt(a10).getShort("id");
                    short a13 = a11.getCompoundTagAt(a10).getShort("lvl");
                    if (a12 == Enchantment.sharpness.effectId && a13 >= 3 || a12 == Enchantment.fireAspect.effectId || a12 == Enchantment.efficiency.effectId && a13 >= 3 || a12 == Enchantment.fortune.effectId || a12 == Enchantment.featherFalling.effectId && a13 >= 3 || a12 == Enchantment.protection.effectId || a12 == Enchantment.punch.effectId || a12 == Enchantment.flame.effectId || a12 == Enchantment.infinity.effectId || a12 == Enchantment.depthStrider.effectId) {
                        return false;
                    }
                    ++a10;
                }
                return true;
            }
            if (a.getDisplayName().toLowerCase().contains((CharSequence)"k||") || a.getDisplayName().toLowerCase().contains((CharSequence)"cornucopia")) {
                return false;
            }
            if (Item.getIdFromItem((Item)a3) == 263 && this.Method243() <= 64) {
                return false;
            }
            if (Item.getIdFromItem((Item)a3) == 345 && this.Method247() <= 1) {
                return false;
            }
            if (Item.getIdFromItem((Item)a3) == 265 && this.Method248() <= 64) {
                return false;
            }
            if (a.getItem().getUnlocalizedName().contains((CharSequence)"stick") || a.getItem().getUnlocalizedName().contains((CharSequence)"string") || a.getItem().getUnlocalizedName().contains((CharSequence)"cake") || a.getItem().getUnlocalizedName().contains((CharSequence)"mushroom") || a.getItem().getUnlocalizedName().contains((CharSequence)"flint") || a.getItem().getUnlocalizedName().contains((CharSequence)"dyePowder") || a.getItem().getUnlocalizedName().contains((CharSequence)"feather") || a.getItem().getUnlocalizedName().contains((CharSequence)"bucket") || a.getItem().getUnlocalizedName().contains((CharSequence)"chest") && !a.getDisplayName().toLowerCase().contains((CharSequence)"collect") || a.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a.getItem().getUnlocalizedName().contains((CharSequence)"fish") || a.getItem().getUnlocalizedName().contains((CharSequence)"enchant") || a.getItem().getUnlocalizedName().contains((CharSequence)"exp") || a.getItem().getUnlocalizedName().contains((CharSequence)"shears") || a.getItem().getUnlocalizedName().contains((CharSequence)"anvil") || a.getItem().getUnlocalizedName().contains((CharSequence)"torch") || a.getItem().getUnlocalizedName().contains((CharSequence)"seeds") || a.getItem().getUnlocalizedName().contains((CharSequence)"leather") || a.getItem().getUnlocalizedName().contains((CharSequence)"reeds") || a.getItem().getUnlocalizedName().contains((CharSequence)"Iron") || a.getItem().getUnlocalizedName().contains((CharSequence)"Tag") || a.getItem().getUnlocalizedName().contains((CharSequence)"slime") || a.getItem().getUnlocalizedName().contains((CharSequence)"sign") || a.getItem().getUnlocalizedName().contains((CharSequence)"blaze") || a.getItem().getUnlocalizedName().contains((CharSequence)"horse") || a.getItem().getUnlocalizedName().contains((CharSequence)"coal") || a.getItem().getUnlocalizedName().contains((CharSequence)"bone") || a.getItem().getUnlocalizedName().contains((CharSequence)"Gunpowder") || a.getItem().getUnlocalizedName().contains((CharSequence)"paper") || a.getItem().getUnlocalizedName().contains((CharSequence)"book") || a.getItem().getUnlocalizedName().contains((CharSequence)"redstone") || a.getItem().getUnlocalizedName().contains((CharSequence)"skull") || a.getItem().getUnlocalizedName().contains((CharSequence)"record") || a.getItem().getUnlocalizedName().contains((CharSequence)"wheat") || a.getItem() instanceof ItemGlassBottle || a.getItem().getUnlocalizedName().contains((CharSequence)"piston")) {
                return true;
            }
        }
        if (a.getItem().getUnlocalizedName().contains((CharSequence)"arrow") && this.Field2726.Method2509().booleanValue()) {
            return true;
        }
        if (a.getItem() instanceof ItemBow) {
            return true;
        }
        if (a.getItem() instanceof ItemAppleGold || a.getItem().getUnlocalizedName().contains((CharSequence)"apple")) {
            return false;
        }
        if (a.getItem() instanceof ItemFood && this.Field2727.Method2509().booleanValue()) {
            return true;
        }
        return a.getItem() instanceof ItemHoe || a.getItem() instanceof ItemTool || a.getItem() instanceof ItemSword || a.getItem() instanceof ItemArmor;
    }

    public ArrayList Method241() {
        return this.Field2730;
    }

    private int Method242() {
        int a = 0;
        for (int a2 = 0; a2 < 45; ++a2) {
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack()) continue;
            ItemStack a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack();
            Item a4 = a3.getItem();
            if (!(a3.getItem() instanceof ItemBlock)) continue;
            a += a3.stackSize;
        }
        return a;
    }

    private int Method243() {
        int a = 0;
        for (int a2 = 0; a2 < 45; ++a2) {
            ItemStack a3;
            Item a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || Item.getIdFromItem((Item)(a4 = (a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem())) != 263) continue;
            a += a3.stackSize;
        }
        return a;
    }

    private int Method244() {
        int a = 0;
        for (int a2 = 0; a2 < 45; ++a2) {
            ItemStack a3;
            Item a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || Item.getIdFromItem((Item)(a4 = (a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem())) != 326) continue;
            a += a3.stackSize;
        }
        return a;
    }

    private int Method245() {
        int a = 0;
        for (int a2 = 0; a2 < 45; ++a2) {
            ItemStack a3;
            Item a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || !((a4 = (a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem()) instanceof ItemFishingRod)) continue;
            a += a3.stackSize;
        }
        return a;
    }

    private int Method246() {
        int a = 0;
        for (int a2 = 0; a2 < 45; ++a2) {
            ItemStack a3;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || !((a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem() instanceof ItemBow)) continue;
            a += a3.stackSize;
        }
        return a;
    }

    private int Method247() {
        int a = 0;
        for (int a2 = 0; a2 < 45; ++a2) {
            ItemStack a3;
            Item a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || Item.getIdFromItem((Item)(a4 = (a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem())) != 345) continue;
            a += a3.stackSize;
        }
        return a;
    }

    private int Method248() {
        int a = 0;
        for (int a2 = 0; a2 < 45; ++a2) {
            ItemStack a3;
            Item a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || Item.getIdFromItem((Item)(a4 = (a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem())) != 265) continue;
            a += a3.stackSize;
        }
        return a;
    }

    private void Method249(int a) {
        for (int a2 = 9; a2 < 45; ++a2) {
            ItemStack a3;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || !this.Method252(a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()) || Field2738 == a2 || this.Method237(a3)) continue;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2738).getHasStack()) {
                this.Method235(a2, Field2738 - 36);
                Field2729.Method214();
                if (this.Field2724.Method2744().longValue() <= 0L) continue;
                return;
            }
            if (this.Method252(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2738).getStack())) continue;
            this.Method235(a2, Field2738 - 36);
            Field2729.Method214();
            if (this.Field2724.Method2744().longValue() <= 0L) continue;
            return;
        }
    }

    private void Method250(int a) {
        for (int a2 = 9; a2 < 45; ++a2) {
            ItemStack a3;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || !this.Method253(a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()) || Field2736 == a2 || this.Method237(a3)) continue;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2736).getHasStack()) {
                this.Method235(a2, Field2736 - 36);
                Field2729.Method214();
                if (this.Field2724.Method2744().longValue() <= 0L) continue;
                return;
            }
            if (this.Method253(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2736).getStack())) continue;
            this.Method235(a2, Field2736 - 36);
            Field2729.Method214();
            if (this.Field2724.Method2744().longValue() <= 0L) continue;
            return;
        }
    }

    private void Method251(int a) {
        for (int a2 = 9; a2 < 45; ++a2) {
            ItemStack a3;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || !this.Method254(a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()) || Field2737 == a2 || this.Method237(a3)) continue;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2737).getHasStack()) {
                this.Method235(a2, Field2737 - 36);
                Field2729.Method214();
                if (this.Field2724.Method2744().longValue() <= 0L) continue;
                return;
            }
            if (this.Method254(InvCleaner.mc.thePlayer.inventoryContainer.getSlot(Field2737).getStack())) continue;
            this.Method235(a2, Field2737 - 36);
            Field2729.Method214();
            if (this.Field2724.Method2744().longValue() <= 0L) continue;
            return;
        }
    }

    private boolean Method252(ItemStack a) {
        Item a2 = a.getItem();
        if (!(a2 instanceof ItemPickaxe)) {
            return false;
        }
        float a3 = this.Method255(a);
        for (int a4 = 9; a4 < 45; ++a4) {
            ItemStack a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack() || !(this.Method255(a5 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getStack()) > a3) || !(a5.getItem() instanceof ItemPickaxe)) continue;
            return false;
        }
        return true;
    }

    private boolean Method253(ItemStack a) {
        Item a2 = a.getItem();
        if (!(a2 instanceof ItemSpade)) {
            return false;
        }
        float a3 = this.Method255(a);
        for (int a4 = 9; a4 < 45; ++a4) {
            ItemStack a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack() || !(this.Method255(a5 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getStack()) > a3) || !(a5.getItem() instanceof ItemSpade)) continue;
            return false;
        }
        return true;
    }

    private boolean Method254(ItemStack a) {
        Item a2 = a.getItem();
        if (!(a2 instanceof ItemAxe)) {
            return false;
        }
        float a3 = this.Method255(a);
        for (int a4 = 9; a4 < 45; ++a4) {
            ItemStack a5;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack() || !(this.Method255(a5 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a4).getStack()) > a3) || !(a5.getItem() instanceof ItemAxe) || this.Method237(a)) continue;
            return false;
        }
        return true;
    }

    private float Method255(ItemStack a) {
        Item a2 = a.getItem();
        if (!(a2 instanceof ItemTool)) {
            return 0.0f;
        }
        String a3 = a2.getUnlocalizedName();
        ItemTool a4 = (ItemTool)a2;
        float a5 = 1.0f;
        if (a2 instanceof ItemPickaxe) {
            a5 = a4.getStrVsBlock(a, Blocks.stone);
            if (a3.toLowerCase().contains((CharSequence)"gold")) {
                a5 -= 5.0f;
            }
        } else if (a2 instanceof ItemSpade) {
            a5 = a4.getStrVsBlock(a, Blocks.dirt);
            if (a3.toLowerCase().contains((CharSequence)"gold")) {
                a5 -= 5.0f;
            }
        } else if (a2 instanceof ItemAxe) {
            a5 = a4.getStrVsBlock(a, Blocks.log);
            if (a3.toLowerCase().contains((CharSequence)"gold")) {
                a5 -= 5.0f;
            }
        } else {
            return 1.0f;
        }
        a5 = (float)((double)a5 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.efficiency.effectId, (ItemStack)a) * 0.0075);
        a5 = (float)((double)a5 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a) / 100.0);
        return a5;
    }

    private boolean Method256(ItemStack a) {
        if (a.getItem() instanceof ItemPotion) {
            ItemPotion a2 = (ItemPotion)a.getItem();
            if (a2.getEffects(a) == null) {
                return true;
            }
            Iterator iterator = a2.getEffects(a).Method1383();
            while (iterator.Method932()) {
                Object a3 = iterator.Method933();
                PotionEffect a4 = (PotionEffect)a3;
                if (a4.getPotionID() != Potion.poison.getId() && a4.getPotionID() != Potion.harm.getId() && a4.getPotionID() != Potion.moveSlowdown.getId() && a4.getPotionID() != Potion.weakness.getId()) continue;
                return true;
            }
        }
        return false;
    }

    boolean Method257(int a) {
        for (int a2 = 9; a2 < 45; ++a2) {
            ItemStack a3;
            Item a4;
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || !((a4 = (a3 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem()) instanceof ItemArmor)) continue;
            ItemArmor a5 = (ItemArmor)a4;
            if (a != a5.armorType) continue;
            return true;
        }
        return false;
    }

    public void Method258() {
        for (int a = 1; a < 5; ++a) {
            if (InvCleaner.mc.thePlayer.inventoryContainer.getSlot(4 + a).getHasStack()) {
                ItemStack a2 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(4 + a).getStack();
                if (AutoArmor.Method239(a2, a)) continue;
                this.Method236(4 + a);
            }
            for (int a3 = 9; a3 < 45; ++a3) {
                ItemStack a4;
                if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack() || !AutoArmor.Method239(a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack(), a) || !(AutoArmor.Method238(a4) > 0.0f)) continue;
                this.Method234(a3);
                Field2729.Method214();
                if (this.Field2724.Method2744().longValue() <= 0L) continue;
                return;
            }
        }
    }

    public boolean Method259(ItemStack a) {
        float a2 = InvCleaner.Method260(a);
        for (int a3 = 9; a3 < 45; ++a3) {
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack()) continue;
            ItemStack a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack();
            if (!(InvCleaner.Method260(a4) >= a2) || !(a4.getItem() instanceof ItemBow) || a == a4) continue;
            return false;
        }
        return true;
    }

    private static float Method260(ItemStack a) {
        float a2 = 7.0f;
        return a2 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.power.effectId, (ItemStack)a) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.flame.effectId, (ItemStack)a) * 0.5f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.punch.effectId, (ItemStack)a) * 0.1f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a) * 0.001f;
    }

    public boolean Method261(ItemStack a) {
        float a2 = InvCleaner.Method262(a);
        for (int a3 = 9; a3 < 45; ++a3) {
            if (!InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack()) continue;
            ItemStack a4 = InvCleaner.mc.thePlayer.inventoryContainer.getSlot(a3).getStack();
            if (!(InvCleaner.Method262(a4) >= a2) || !a4.getUnlocalizedName().toLowerCase().contains((CharSequence)"fish") || a == a4) continue;
            return false;
        }
        return true;
    }

    private static float Method262(ItemStack a) {
        float a2 = 0.0f;
        a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.knockback.effectId, (ItemStack)a) * 1.0);
        return a2;
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