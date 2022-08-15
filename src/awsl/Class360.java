/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.item.ItemStack
 */
package awsl;

import awsl.Class355;
import awsl.Class356;
import net.minecraft.item.ItemStack;

public class Class360 {
    protected final String Field1703;

    private Class360(String a) {
        this.Field1703 = a;
    }

    public void Method179(ItemStack a) {
        this.Method181(a, !this.Method180(a));
    }

    public boolean Method180(ItemStack a) {
        return a.hasTagCompound() && Class356.Method149(a).getBoolean(this.Field1703);
    }

    public void Method181(ItemStack a, boolean a2) {
        Class356.Method152(a, this.Field1703, a2);
    }

    public byte Method182(ItemStack a) {
        if (a.hasTagCompound()) {
            return a.getTagCompound().getByte(this.Field1703);
        }
        return 0;
    }

    Class360(String a, Class355 a2) {
        this(a);
    }
}