/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.item.ItemStack
 */
package trash.foodbyte.command.impl;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import trash.foodbyte.command.Command;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.PlayerUtils;

public class GetDmgCommand
extends Command {
    private static int Field2910;

    public GetDmgCommand() {
        super(new String[]{"getdmg"});
        this.setHelp("Shows Item Damage");
    }

    @Override
    public void onCommand(String[] commands) {
        int a = GetDmgCommand.Method3599();
        if (this.mc.thePlayer.getCurrentEquippedItem() != null) {
            ItemStack a2 = this.mc.thePlayer.getCurrentEquippedItem();
            float a3 = PlayerUtils.Method1590(a2);
            ChatUtils.addChatMessage("this Item Base Damage = \u00a7c" + PlayerUtils.Method1590(a2) + " \u00a77- \u00a7fAttack Damage = \u00a7c" + (a3 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a2) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a2) * 0.25f));
        }
        ChatUtils.addChatMessage("No items on hand");
    }

    public static void Method3597(int n) {
        Field2910 = n;
    }

    public static int Method3598() {
        return Field2910;
    }

    public static int Method3599() {
        int n = GetDmgCommand.Method3598();
        return 58;
    }

    static {
        GetDmgCommand.Method3597(0);
    }
}