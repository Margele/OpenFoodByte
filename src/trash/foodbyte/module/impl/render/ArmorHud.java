/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.item.EnumRarity
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemBook
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemTool
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class492;
import awsl.Class681;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class ArmorHud
extends Module {
    public ArmorHud() {
        super("ArmorHud", "Armor Hud", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u88c5\u5907\u663e\u793a(\u663e\u793a\u5728\u7269\u54c1\u680f\u4e0a\u65b9)";
    }

    @EventTarget
    public void Method810(EventRender2D a) {
        ScaledResolution a2 = new ScaledResolution(mc);
        this.Method1558(a2);
    }

    private void Method1558(ScaledResolution a) {
        Iterator iterator;
        GL11.glPushMatrix();
        ArrayList a2 = new ArrayList();
        String a3 = Class492.Method2239();
        boolean a4 = ArmorHud.mc.thePlayer.isEntityAlive() && ArmorHud.mc.thePlayer.isInsideOfMaterial(Material.water);
        int a5 = a.getScaledWidth() / 2 - 6;
        int a6 = a.getScaledHeight();
        int a7 = 3;
        ItemStack a8 = ArmorHud.mc.thePlayer.inventory.armorInventory[a7];
        a2.Method2530((Object)a8);
        --a7;
        if (ArmorHud.mc.thePlayer.getCurrentEquippedItem() != null) {
            a2.Method2530((Object)ArmorHud.mc.thePlayer.getCurrentEquippedItem());
        }
        if ((iterator = a2.Method1383()).Method932()) {
            a8 = (ItemStack)iterator.Method933();
            if (ArmorHud.mc.theWorld != null) {
                RenderHelper.enableGUIStandardItemLighting();
                mc.getRenderItem().renderItemAndEffectIntoGUI(a8, a5 += 16, a6 - 65);
                mc.getRenderItem().renderItemOverlays(ArmorHud.mc.fontRendererObj, a8, a5, a6 - 65);
                RenderHelper.disableStandardItemLighting();
                int a9 = 1;
                int a10 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a8);
                int a11 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a8);
                int a12 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.knockback.effectId, (ItemStack)a8);
                ArmorHud.Method1760("Sh" + this.Method1761(a10) + a10, a5, a9 + a6 - 65);
                ArmorHud.Method1760("Fir" + this.Method1761(a11) + a11, a5, (a9 += 4) + a6 - 65);
                ArmorHud.Method1760("Kb" + this.Method1761(a12) + a12, a5, (a9 += 4) + a6 - 65);
                if (!(a8.getItem() instanceof ItemBook)) {
                    int a13;
                    int a14;
                    int a15;
                    int a16;
                    if (a8.getItem() instanceof ItemTool) {
                        a16 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.efficiency.effectId, (ItemStack)a8);
                        a15 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fortune.effectId, (ItemStack)a8);
                        a14 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a8);
                        a13 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.silkTouch.effectId, (ItemStack)a8);
                        ArmorHud.Method1760("Ef" + this.Method1761(a16) + a16, a5, a9 + a6 - 65);
                        ArmorHud.Method1760("For" + this.Method1761(a15) + a15, a5, (a9 += 4) + a6 - 65);
                        ArmorHud.Method1760("Tou" + this.Method1761(a13) + a13, a5, (a9 += 4) + a6 - 65);
                        ArmorHud.Method1760("Unb" + this.Method1761(a14) + a14, a5, (a9 += 4) + a6 - 65);
                    }
                    if (a8.getItem() instanceof ItemArmor) {
                        a16 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.protection.effectId, (ItemStack)a8);
                        a15 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.thorns.effectId, (ItemStack)a8);
                        a14 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.featherFalling.effectId, (ItemStack)a8);
                        a13 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a8);
                        int a17 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.depthStrider.effectId, (ItemStack)a8);
                        ArmorHud.Method1760("Pr" + this.Method1761(a16) + a16, a5, a9 + a6 - 65);
                        ArmorHud.Method1760("Th" + this.Method1761(a15) + a15, a5, (a9 += 4) + a6 - 65);
                        ArmorHud.Method1760("Dep" + this.Method1761(a17) + a17, a5, (a9 += 4) + a6 - 65);
                        ArmorHud.Method1760("Fea" + this.Method1761(a14) + a14, a5, (a9 += 4) + a6 - 65);
                        ArmorHud.Method1760("Unb" + this.Method1761(a13) + a13, a5, (a9 += 4) + a6 - 65);
                    }
                    if (a8.getItem() instanceof ItemBow) {
                        a16 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.power.effectId, (ItemStack)a8);
                        a15 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.punch.effectId, (ItemStack)a8);
                        a14 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.flame.effectId, (ItemStack)a8);
                        a13 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.infinity.effectId, (ItemStack)a8);
                        ArmorHud.Method1760("Pow" + this.Method1761(a16) + a16, a5, a9 + a6 - 65);
                        ArmorHud.Method1760("Pun" + this.Method1761(a15) + a15, a5, (a9 += 4) + a6 - 65);
                        ArmorHud.Method1760("Fla" + this.Method1761(a14) + a14, a5, (a9 += 4) + a6 - 65);
                        ArmorHud.Method1760("Inf" + this.Method1761(a13) + a13, a5, (a9 += 4) + a6 - 65);
                    }
                    if (a8.getRarity() == EnumRarity.EPIC) {
                        ArmorHud.Method1760("\u00a76\u00a7nGod", a5, a9 + a6 - 65);
                    }
                }
            }
        }
        GL11.glPopMatrix();
    }

    private static void Method1759(String a, int a2, int a3) {
        GlStateManager.pushMatrix();
        GlStateManager.disableDepth();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(a, (float)(a2 *= 2), (float)(a3 * 2), Class681.Method1612(255));
        GlStateManager.enableDepth();
        GlStateManager.popMatrix();
    }

    private static void Method1760(String a, int a2, int a3) {
        String[] a4;
        String a5 = a;
        for (String a6 : a4 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "m", "o", "r", "g"}) {
            a = a.replaceAll("\u00a7" + a6, "");
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableDepth();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        Minecraft.getMinecraft().fontRendererObj.drawString(a, (a2 *= 2) + 1, a3 * 2, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a, a2 - 1, a3 * 2, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a, a2, a3 * 2 + 1, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a, a2, a3 * 2 - 1, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a5, a2, a3 * 2, Class681.Method1612(255));
        GlStateManager.enableDepth();
        GlStateManager.popMatrix();
    }

    private String Method1761(int a) {
        if (a != 1) {
            if (a == 2) {
                return "\u00a7a";
            }
            if (a == 3) {
                return "\u00a73";
            }
            if (a == 4) {
                return "\u00a74";
            }
            if (a >= 5) {
                return "\u00a76";
            }
        }
        return "\u00a78";
    }
}