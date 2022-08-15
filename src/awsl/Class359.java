/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 */
package awsl;

import awsl.Class355;
import awsl.Class356;
import awsl.Class360;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import trash.foodbyte.utils.RenderUtils;

public class Class359
extends Class360 {
    private Class359(String a) {
        super(a, null);
    }

    @Override
    public void Method179(ItemStack a) {
        this.Method181(a, !this.Method180(a));
    }

    @Override
    public boolean Method180(ItemStack a) {
        return Class356.Method145(a) && Class356.Method144(a).getBoolean(this.Field1703);
    }

    @Override
    public void Method181(ItemStack a, boolean a2) {
        int[] a3 = RenderUtils.Method1148();
        Class356.Method144(a).setBoolean(this.Field1703, a2);
        if (Class356.Method145(a)) {
            NBTTagCompound a4 = Class356.Method144(a);
            a4.removeTag(this.Field1703);
            Class356.Method146(a);
        }
    }

    @Override
    public byte Method182(ItemStack a) {
        if (Class356.Method145(a)) {
            return Class356.Method144(a).getByte(this.Field1703);
        }
        return 0;
    }

    Class359(String a, Class355 a2) {
        this(a);
    }
}