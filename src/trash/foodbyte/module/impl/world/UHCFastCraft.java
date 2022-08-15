/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 *  net.minecraft.client.gui.inventory.GuiChest
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.InventoryEffectRenderer
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
package trash.foodbyte.module.impl.world;

import awsl.Class378;
import awsl.Class492;
import awsl.Class567;
import awsl.Class643;
import awsl.Class654;
import awsl.Class667;
import awsl.Class681;
import awsl.Class707;
import eventapi.EventTarget;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class UHCFastCraft
extends Module {
    public BooleanValue Field2188 = new BooleanValue("UHCFastCraft", "Keep InvGui", (Boolean)true, "\u4fdd\u6301\u7a97\u53e3\u5728\u80cc\u5305\u53f3\u8fb9");
    public Class378 Field2189;
    private int Field2190;
    private int Field2191;

    public UHCFastCraft() {
        super("UHCFastCraft", "UHC Fast Craft", Category.WORLD);
        this.Method1033(true);
    }

    @Override
    public String getDescription() {
        return "UHC\u5feb\u901f\u5408\u6210";
    }

    @EventTarget
    public void Method2116(Class643 a) {
        if (Class567.Field2643 == Class667.UHC) {
            this.Method258();
        }
    }

    @EventTarget
    public void Method801(Class654 a) {
        if (Class567.Field2643 == Class667.UHC && this.Field2189 != null && UHCFastCraft.mc.thePlayer != null && (UHCFastCraft.mc.currentScreen instanceof GuiInventory || UHCFastCraft.mc.currentScreen instanceof GuiChest)) {
            this.Field2189.Method479(this.Field2190, this.Field2191, Mouse.isButtonDown((int)0));
        }
    }

    public void Method258() {
        int a;
        GuiContainer a2;
        String a3 = Class492.Method2239();
        if (UHCFastCraft.mc.currentScreen instanceof GuiInventory || UHCFastCraft.mc.currentScreen instanceof GuiChest) {
            a2 = (GuiContainer)UHCFastCraft.mc.currentScreen;
            int a4 = 0;
            a = 0;
            int a5 = 0;
            int a6 = 0;
            try {
                a5 = ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedClasses.guiLeft.getObfuscatedName()}).getInt((Object)a2);
                a6 = ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedClasses.guiTop.getObfuscatedName()}).getInt((Object)a2);
            }
            catch (Exception exception) {
                // empty catch block
            }
            int a7 = 0;
            if (UHCFastCraft.mc.currentScreen instanceof GuiInventory) {
                try {
                    InventoryEffectRenderer a8 = (InventoryEffectRenderer)UHCFastCraft.mc.currentScreen;
                    if (a5 == ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedClasses.guiLeft.getObfuscatedName()}).getInt((Object)a8)) {
                        a7 = 120;
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (UHCFastCraft.mc.thePlayer.getActivePotionEffects().isEmpty() || UHCFastCraft.mc.currentScreen instanceof GuiChest) {
                a4 = a2.width - a5;
                a = a6;
            }
            a4 = a5 + 176;
            a = a6;
            if (this.Field2189 == null) {
                this.Field2189 = new Class378(this, a2.width - a5, a6 + 3, 100.0f, 100.0f, 12.0f, 1.0f, 0.5f);
            }
            if (this.Field2188.Method2509().booleanValue()) {
                this.Field2189.Field1806 = a4;
                this.Field2189.Field1807 = a + 3;
            }
        }
        if (this.Field2189 != null && UHCFastCraft.mc.thePlayer != null && (UHCFastCraft.mc.currentScreen instanceof GuiInventory || UHCFastCraft.mc.currentScreen instanceof GuiChest)) {
            this.Method814();
            this.Method815();
            if (this.Field2189.Field1794 != null) {
                a2 = this.Field2189.Field1794;
                a = 0;
                List a9 = a2.getTooltip((EntityPlayer)UHCFastCraft.mc.thePlayer, UHCFastCraft.mc.gameSettings.advancedItemTooltips);
                if (a < a9.Method1799()) {
                    a9.set(a, (Object)(a2.getRarity().rarityColor + (String)a9.get(a)));
                    a9.set(a, (Object)(EnumChatFormatting.GRAY + (String)a9.get(a)));
                    ++a;
                }
                GlStateManager.disableDepth();
                this.Method2117(a9, this.Field2190, this.Field2191);
                GlStateManager.enableDepth();
            }
        }
    }

    public void Method814() {
        this.Field2190 = (int)MathUtils.Method547(Mouse.getX(), 0.0f, Display.getWidth(), 0.0f, RenderUtils.Method1076());
        this.Field2191 = (int)MathUtils.Method547(Display.getHeight() - Mouse.getY(), 0.0f, Display.getHeight(), 0.0f, RenderUtils.Method1077());
        this.Field2189.Method64(this.Field2190, this.Field2191);
        this.Field2189.Method456(this.Field2190, this.Field2191, Mouse.isButtonDown((int)0) || Mouse.isButtonDown((int)2));
    }

    public void Method815() {
        this.Field2189.Method63();
    }

    public void Method2117(List a, int a2, int a3) {
        if (!a.isEmpty()) {
            int a4;
            int a5 = 0;
            Iterator iterator = a.Method1383();
            while (iterator.Method932()) {
                String a6 = (String)iterator.Method933();
                a4 = UHCFastCraft.mc.fontRendererObj.getStringWidth(a6);
                if (a4 <= a5) continue;
                a5 = a4;
            }
            int a7 = a2 + 12;
            int a8 = a3 - 12;
            a4 = 8;
            if (a.Method1799() > 1) {
                a4 += 2 + (a.Method1799() - 1) * 10;
            }
            if (a7 + a5 > RenderUtils.Method1076()) {
                a7 -= 28 + a5;
            }
            if (a8 + a4 + 6 > RenderUtils.Method1077()) {
                a8 = RenderUtils.Method1077() - a4 - 6;
            }
            RenderUtils.Method1104(a7 - 4, a8 - 4, a7 + a5 + 4, a8 + a4 + 4, Class681.Method2699(Class707.Method1828(), 50));
            RenderUtils.Method1104(a7 - 3, a8 - 3, a7 + a5 + 3, a8 + a4 + 3, Integer.MIN_VALUE);
            for (int a9 = 0; a9 < a.Method1799(); ++a9) {
                String a10 = (String)a.get(a9);
                UHCFastCraft.mc.fontRendererObj.drawStringWithShadow(a10, (float)a7, (float)a8, -1);
                a8 += 2;
                a8 += 10;
            }
        }
    }

    static int Method2118(UHCFastCraft a) {
        return a.Field2190;
    }

    static int Method2119(UHCFastCraft a) {
        return a.Field2191;
    }

    private static Exception Method263(Exception exception) {
        return exception;
    }
}