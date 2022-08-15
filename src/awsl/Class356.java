/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.nbt.NBTTagString
 */
package awsl;

import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import trash.foodbyte.utils.RenderUtils;

public class Class356 {
    public static ItemStack Method131(ItemStack a) {
        ItemStack a2 = new ItemStack((Block)Blocks.chest);
        NBTTagCompound a3 = a.getTagCompound();
        a3 = new NBTTagCompound();
        NBTTagCompound a4 = new NBTTagCompound();
        NBTTagList a5 = new NBTTagList();
        NBTTagCompound a6 = new NBTTagCompound();
        a6.setByte("Slot", (byte)0);
        a6.setByte("Count", (byte)a.stackSize);
        a6.setString("id", Class356.Method132(a.getItem()));
        a6.setShort("Damage", (short)a.getItemDamage());
        if (a.getTagCompound() != null) {
            a6.setTag("tag", (NBTBase)a.getTagCompound());
        }
        a5.appendTag((NBTBase)a6);
        a4.setTag("Items", (NBTBase)a5);
        a3.setTag("BlockEntityTag", (NBTBase)a4);
        a2.setTagCompound(a3);
        Class356.Method134(a2, "\u00a77Pack");
        Class356.Method134(a2, a.getDisplayName());
        return a2;
    }

    public static String Method132(Item a) {
        if (a.delegate.getResourceName() != null) {
            return a.delegate.getResourceName().toString();
        }
        return "";
    }

    /*
     * WARNING - void declaration
     */
    public static ItemStack Method133(String a, String[] a2) {
        void a3;
        ItemStack itemStack = new ItemStack(Items.paper);
        int[] nArray = RenderUtils.Method1148();
        a3.setStackDisplayName(a);
        int[] a4 = nArray;
        NBTTagList a5 = new NBTTagList();
        String[] stringArray = a2;
        int n = stringArray.length;
        int n2 = 0;
        if (n2 < n) {
            String a6 = stringArray[n2];
            a5.appendTag((NBTBase)new NBTTagString(a6));
            ++n2;
        }
        a3.getTagCompound().getCompoundTag("display").setTag("Lore", (NBTBase)a5);
        return a3;
    }

    public static void Method134(ItemStack a, String a2) {
        NBTTagList a3 = Class356.Method139(a);
        a3.appendTag((NBTBase)new NBTTagString(a2));
    }

    public static void Method135(ItemStack a, int a2) {
        NBTTagList a3 = Class356.Method139(a);
        if (a2 >= a3.tagCount()) {
            if (a3.tagCount() == 0) {
                Class356.Method137(a);
            }
            return;
        }
        a3.removeTag(a2);
        if (a3.tagCount() == 0) {
            Class356.Method137(a);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void Method136(ItemStack a, int a2, String a3) {
        void a4;
        NBTTagList nBTTagList = Class356.Method139(a);
        int[] a5 = RenderUtils.Method1148();
        if (a2 >= a4.tagCount()) {
            Class356.Method134(a, a3);
        }
        a4.set(a2, (NBTBase)new NBTTagString(a3));
    }

    public static void Method137(ItemStack a) {
        NBTTagCompound a2 = Class356.Method141(a);
        if (a2.hasKey("Lore", 9)) {
            a2.removeTag("Lore");
        }
        Class356.Method143(a);
    }

    public static boolean Method138(ItemStack a) {
        return Class356.Method142(a) && Class356.Method141(a).hasKey("Lore", 9);
    }

    public static NBTTagList Method139(ItemStack a) {
        NBTTagCompound a2 = Class356.Method141(a);
        if (!Class356.Method138(a)) {
            a2.setTag("Lore", (NBTBase)new NBTTagList());
        }
        return a2.getTagList("Lore", 8);
    }

    @Nullable
    public static String Method140(ItemStack a, int a2) {
        NBTTagList a3;
        if (Class356.Method138(a) && a2 < (a3 = Class356.Method139(a)).tagCount()) {
            return a3.getStringTagAt(a2);
        }
        return null;
    }

    public static NBTTagCompound Method141(ItemStack a) {
        return a.getTagCompound().getCompoundTag("display");
    }

    public static boolean Method142(ItemStack a) {
        return a.hasTagCompound() && a.getTagCompound().hasKey("display", 10);
    }

    public static void Method143(ItemStack a) {
        if (Class356.Method142(a) && Class356.Method141(a).hasNoTags()) {
            a.getTagCompound().removeTag("display");
        }
        Class356.Method151(a);
    }

    public static NBTTagCompound Method144(ItemStack a) {
        return a.getTagCompound().getCompoundTag("EntityTag");
    }

    public static boolean Method145(ItemStack a) {
        return a.hasTagCompound() && a.getTagCompound().hasKey("EntityTag", 10);
    }

    public static void Method146(ItemStack a) {
        if (Class356.Method145(a) && Class356.Method144(a).hasNoTags()) {
            a.getTagCompound().removeTag("EntityTag");
        }
        Class356.Method151(a);
    }

    public static boolean Method147(ItemStack a) {
        if (!a.hasTagCompound()) {
            return false;
        }
        return a.getTagCompound().getBoolean("Unbreakable");
    }

    public static void Method148(ItemStack a, boolean a2) {
        Class356.Method150(a, "Unbreakable", a2);
    }

    public static NBTTagCompound Method149(ItemStack a) {
        if (!a.hasTagCompound()) {
            a.setTagCompound(new NBTTagCompound());
        }
        return a.getTagCompound();
    }

    private static void Method150(ItemStack a, String a2, boolean a3) {
        int[] a4 = RenderUtils.Method1148();
        Class356.Method149(a).setBoolean(a2, a3);
        if (a.hasTagCompound()) {
            NBTTagCompound a5 = Class356.Method149(a);
            a5.removeTag(a2);
            Class356.Method151(a);
        }
    }

    public static void Method151(ItemStack a) {
        if (Class356.Method149(a).hasNoTags()) {
            a.setTagCompound(null);
        }
    }

    static void Method152(ItemStack a, String a2, boolean a3) {
        Class356.Method150(a, a2, a3);
    }
}