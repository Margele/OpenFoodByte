/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagFloat
 *  net.minecraft.nbt.NBTTagList
 */
package awsl;

import awsl.Class356;
import awsl.Class359;
import awsl.Class360;
import awsl.Class664;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.nbt.NBTTagList;
import trash.foodbyte.utils.RenderUtils;

public class Class354 {
    public static final Class360 Field1697 = new Class359("ShowArms", null);
    public static final Class360 Field1698 = new Class359("Small", null);
    public static final Class360 Field1699 = new Class359("Invisible", null);
    public static final Class360 Field1700 = new Class359("NoBasePlate", null);
    public static final Class360 Field1701 = new Class359("Marker", null);

    public static NBTTagCompound Method90(ItemStack a) {
        NBTTagCompound a2 = Class356.Method144(a);
        if (!a2.hasKey("Pose", 10)) {
            a2.setTag("Pose", (NBTBase)new NBTTagCompound());
        }
        return a2.getCompoundTag("Pose");
    }

    public static boolean Method91(ItemStack a) {
        return Class356.Method145(a) && Class356.Method144(a).hasKey("Pose", 10);
    }

    public static void Method92(ItemStack a) {
        if (Class354.Method91(a) && Class354.Method90(a).hasNoTags()) {
            Class356.Method144(a).removeTag("Pose");
        }
        Class356.Method146(a);
    }

    /*
     * WARNING - void declaration
     */
    public static void Method93(ItemStack a, Class664 a2, float a3, float a4, float a5) {
        void a6;
        NBTTagList nBTTagList = Class354.Method100(a, a2);
        int[] a7 = RenderUtils.trash();
        if (a6.hasNoTags()) {
            a6.appendTag((NBTBase)new NBTTagFloat(a3));
            a6.appendTag((NBTBase)new NBTTagFloat(a4));
            a6.appendTag((NBTBase)new NBTTagFloat(a5));
        }
        a6.set(0, (NBTBase)new NBTTagFloat(a3));
        a6.set(1, (NBTBase)new NBTTagFloat(a4));
        a6.set(2, (NBTBase)new NBTTagFloat(a5));
    }

    public static void Method94(ItemStack a, Class664 a2, float a3) {
        Class354.Method93(a, a2, a3, Class354.Method98(a, a2), Class354.Method99(a, a2));
    }

    public static void Method95(ItemStack a, Class664 a2, float a3) {
        Class354.Method93(a, a2, Class354.Method97(a, a2), a3, Class354.Method99(a, a2));
    }

    public static void Method96(ItemStack a, Class664 a2, float a3) {
        Class354.Method93(a, a2, Class354.Method97(a, a2), Class354.Method98(a, a2), a3);
    }

    public static float Method97(ItemStack a, Class664 a2) {
        if (!Class354.Method102(a, a2)) {
            return 0.0f;
        }
        return Class354.Method101(a, a2)[0];
    }

    public static float Method98(ItemStack a, Class664 a2) {
        if (!Class354.Method102(a, a2)) {
            return 0.0f;
        }
        return Class354.Method101(a, a2)[1];
    }

    public static float Method99(ItemStack a, Class664 a2) {
        if (!Class354.Method102(a, a2)) {
            return 0.0f;
        }
        return Class354.Method101(a, a2)[2];
    }

    public static NBTTagList Method100(ItemStack a, Class664 a2) {
        NBTTagCompound a3 = Class354.Method90(a);
        if (!a3.hasKey(a2.Method497(), 9)) {
            a3.setTag(a2.Method497(), (NBTBase)new NBTTagList());
        }
        return a3.getTagList(a2.Method497(), 5);
    }

    public static float[] Method101(ItemStack a, Class664 a2) {
        NBTTagList a3;
        if (Class354.Method102(a, a2) && !(a3 = Class354.Method100(a, a2)).hasNoTags()) {
            return new float[]{a3.getFloatAt(0), a3.getFloatAt(1), a3.getFloatAt(2)};
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static boolean Method102(ItemStack a, Class664 a2) {
        return Class354.Method91(a) && Class354.Method90(a).hasKey(Class664.Method2416(a2), 9);
    }

    public static void Method103(ItemStack a, Class664 a2) {
        NBTTagList a3;
        if (Class354.Method102(a, a2) && ((a3 = Class354.Method100(a, a2)).hasNoTags() || a3.getFloatAt(0) == 0.0f && a3.getFloatAt(1) == 0.0f && a3.getFloatAt(2) == 0.0f)) {
            Class354.Method90(a).removeTag(a2.Method497());
        }
        Class354.Method92(a);
    }
}