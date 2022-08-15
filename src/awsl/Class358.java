/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTUtil
 *  org.apache.commons.lang3.StringUtils
 */
package awsl;

import awsl.Class356;
import com.mojang.authlib.GameProfile;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import org.apache.commons.lang3.StringUtils;

public class Class358 {
    public static GameProfile Method209(ItemStack a) {
        GameProfile a2 = null;
        if (a.hasTagCompound()) {
            NBTTagCompound a3 = a.getTagCompound();
            if (a3.hasKey("SkullOwner", 10)) {
                a2 = NBTUtil.readGameProfileFromNBT((NBTTagCompound)a3.getCompoundTag("SkullOwner"));
            } else if (a3.hasKey("SkullOwner", 8) && !StringUtils.isBlank((CharSequence)a3.getString("SkullOwner"))) {
                a2 = new GameProfile(null, a3.getString("SkullOwner"));
            }
        }
        return a2;
    }

    public static void Method210(ItemStack a, String a2) {
        Class356.Method149(a).setString("SkullOwner", a2);
    }
}