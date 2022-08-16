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
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ChatUtils;

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
    public void Method1626(EventTickUpdate a2) {
        int[] a3 = Class98.Method3639();
        if (Wrapper.INSTANCE.getThePlayer() != null) {
            boolean a4 = Keyboard.isKeyDown((int)15);
            if (!this.Field3137) {
                this.Field3137 = true;
                if (StackNBT.mc.currentScreen instanceof GuiContainer) {
                    GuiContainer a5 = (GuiContainer)StackNBT.mc.currentScreen;
                    ItemStack a6 = null;
                    if (this.Method1993(a5) != null) {
                        a6 = this.Method1993(a5).getStack();
                    }
                    if (a6.getTagCompound() != null) {
                        ChatUtils.addChatMessageNoPrefix(a6.getDisplayName());
                        NBTTagCompound a7 = a6.getTagCompound();
                        NBTTagList a8 = Class356.Method139(a6);
                        int a9 = 0;
                        if (a9 < a8.tagCount()) {
                            System.err.println((Object)a8.get(a9));
                            ++a9;
                        }
                        if ((a9 = 0) < a8.tagCount()) {
                            if (a8.get(a9).toString().contains((CharSequence)"Category") || a8.get(a9).toString().contains((CharSequence)"Max Crafts")) {
                                a8.removeTag(a9);
                            }
                            ++a9;
                        }
                        if ((a9 = 0) < a8.tagCount()) {
                            if (a8.get(a9).toString().contains((CharSequence)"Category") || a8.get(a9).toString().contains((CharSequence)"Max Crafts")) {
                                a8.removeTag(a9);
                            }
                            ++a9;
                        }
                        a9 = 0;
                        int a10 = 0;
                        if (a10 < a8.tagCount()) {
                            if (a8.get(a10).toString().equals((Object)"\"\"") && ++a9 >= 2) {
                                a8.removeTag(a10);
                            }
                            ++a10;
                        }
                        String a22 = this.Method1992(a6.getItem()) + " " + a6.stackSize + " " + a6.getItemDamage() + " " + a6.getTagCompound().toString();
                        a22 = a22.replace((CharSequence)"\u00a7aClick to view recipe!", (CharSequence)"\u00a7dClick to craft!");
                        Wrapper.INSTANCE.setClipboard(a22);
                    }
                }
            }
            this.Field3137 = a4;
        }
    }

    public String Method1992(Item a2) {
        if (a2.delegate.getResourceName() != null) {
            return a2.delegate.getResourceName().toString();
        }
        return "";
    }

    public Slot Method1993(GuiContainer a2) {
        Slot a3 = null;
        try {
            a3 = (Slot)ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedField.theSlot.getObfuscatedName()}).get((Object)a2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return a3;
    }
}