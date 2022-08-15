/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 *  org.lwjgl.input.Keyboard
 */
package trash.foodbyte.module.impl.skyblock;

import awsl.Class356;
import awsl.Class654;
import awsl.Class98;
import eventapi.EventTarget;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.utils.Wrapper;

public class StackNBT
extends Module {
    public boolean Field3137 = false;

    public StackNBT() {
        super("StackNBT", Category.SKYBLOCK);
        this.setDescription("\u7784\u51c6\u7269\u54c1\u6309\u4e0bTAB\u8bfb\u53d6\u7269\u54c1nbt\n\u81ea\u52a8\u590d\u5236\u5230\u526a\u5207\u677f");
    }

    @Override
    public boolean canUse() {
        return GlobalModule.INSTANCE.Field3186 == null || !PermissionManager.canUseFeature("stacknbt");
    }

    @EventTarget
    public void Method1626(Class654 a) {
        int[] a2 = Class98.Method3639();
        if (Wrapper.INSTANCE.Method2869() != null) {
            boolean a3 = Keyboard.isKeyDown((int)15);
            if (!this.Field3137) {
                this.Field3137 = true;
                if (StackNBT.mc.currentScreen instanceof GuiContainer) {
                    GuiContainer a4 = (GuiContainer)StackNBT.mc.currentScreen;
                    ItemStack a5 = null;
                    if (this.Method1993(a4) != null) {
                        a5 = this.Method1993(a4).getStack();
                    }
                    if (a5.getTagCompound() != null) {
                        ChatUtils.addChatMessageNoPrefix(a5.getDisplayName());
                        NBTTagCompound a6 = a5.getTagCompound();
                        NBTTagList a7 = Class356.Method139(a5);
                        int a8 = 0;
                        if (a8 < a7.tagCount()) {
                            System.err.println((Object)a7.get(a8));
                            ++a8;
                        }
                        if ((a8 = 0) < a7.tagCount()) {
                            if (a7.get(a8).toString().contains((CharSequence)"Category") || a7.get(a8).toString().contains((CharSequence)"Max Crafts")) {
                                a7.removeTag(a8);
                            }
                            ++a8;
                        }
                        if ((a8 = 0) < a7.tagCount()) {
                            if (a7.get(a8).toString().contains((CharSequence)"Category") || a7.get(a8).toString().contains((CharSequence)"Max Crafts")) {
                                a7.removeTag(a8);
                            }
                            ++a8;
                        }
                        a8 = 0;
                        int a9 = 0;
                        if (a9 < a7.tagCount()) {
                            if (a7.get(a9).toString().equals((Object)"\"\"") && ++a8 >= 2) {
                                a7.removeTag(a9);
                            }
                            ++a9;
                        }
                        String a22 = this.Method1992(a5.getItem()) + " " + a5.stackSize + " " + a5.getItemDamage() + " " + a5.getTagCompound().toString();
                        a22 = a22.replace((CharSequence)"\u00a7aClick to view recipe!", (CharSequence)"\u00a7dClick to craft!");
                        Wrapper.INSTANCE.Method2876(a22);
                    }
                }
            }
            this.Field3137 = a3;
        }
    }

    public String Method1992(Item a) {
        if (a.delegate.getResourceName() != null) {
            return a.delegate.getResourceName().toString();
        }
        return "";
    }

    public Slot Method1993(GuiContainer a) {
        Slot a2 = null;
        try {
            a2 = (Slot)ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedClasses.theSlot.getObfuscatedName()}).get((Object)a);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return a2;
    }
}