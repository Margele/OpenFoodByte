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
import awsl.Class643;
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
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.ServerPacketHandler;
import trash.foodbyte.utils.Servers;
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
        if (ServerPacketHandler.currentServer == Servers.UHC) {
            this.Method258();
        }
    }

    @EventTarget
    public void Method801(EventTickUpdate a2) {
        if (ServerPacketHandler.currentServer == Servers.UHC && this.Field2189 != null && UHCFastCraft.mc.thePlayer != null && (UHCFastCraft.mc.currentScreen instanceof GuiInventory || UHCFastCraft.mc.currentScreen instanceof GuiChest)) {
            this.Field2189.Method479(this.Field2190, this.Field2191, Mouse.isButtonDown((int)0));
        }
    }

    public void Method258() {
        int a2;
        GuiContainer a3;
        String a4 = Class492.Method2239();
        if (UHCFastCraft.mc.currentScreen instanceof GuiInventory || UHCFastCraft.mc.currentScreen instanceof GuiChest) {
            a3 = (GuiContainer)UHCFastCraft.mc.currentScreen;
            int a5 = 0;
            a2 = 0;
            int a6 = 0;
            int a7 = 0;
            try {
                a6 = ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedField.guiLeft.getObfuscatedName()}).getInt((Object)a3);
                a7 = ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedField.guiTop.getObfuscatedName()}).getInt((Object)a3);
            }
            catch (Exception exception) {
                // empty catch block
            }
            int a8 = 0;
            if (UHCFastCraft.mc.currentScreen instanceof GuiInventory) {
                try {
                    InventoryEffectRenderer a9 = (InventoryEffectRenderer)UHCFastCraft.mc.currentScreen;
                    if (a6 == ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedField.guiLeft.getObfuscatedName()}).getInt((Object)a9)) {
                        a8 = 120;
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (UHCFastCraft.mc.thePlayer.getActivePotionEffects().isEmpty() || UHCFastCraft.mc.currentScreen instanceof GuiChest) {
                a5 = a3.width - a6;
                a2 = a7;
            }
            a5 = a6 + 176;
            a2 = a7;
            if (this.Field2189 == null) {
                this.Field2189 = new Class378(this, a3.width - a6, a7 + 3, 100.0f, 100.0f, 12.0f, 1.0f, 0.5f);
            }
            if (this.Field2188.getBooleanValue().booleanValue()) {
                this.Field2189.Field1806 = a5;
                this.Field2189.Field1807 = a2 + 3;
            }
        }
        if (this.Field2189 != null && UHCFastCraft.mc.thePlayer != null && (UHCFastCraft.mc.currentScreen instanceof GuiInventory || UHCFastCraft.mc.currentScreen instanceof GuiChest)) {
            this.Method814();
            this.Method815();
            if (this.Field2189.Field1794 != null) {
                a3 = this.Field2189.Field1794;
                a2 = 0;
                List a10 = a3.getTooltip((EntityPlayer)UHCFastCraft.mc.thePlayer, UHCFastCraft.mc.gameSettings.advancedItemTooltips);
                if (a2 < a10.Method1799()) {
                    a10.set(a2, (Object)(a3.getRarity().rarityColor + (String)a10.get(a2)));
                    a10.set(a2, (Object)(EnumChatFormatting.GRAY + (String)a10.get(a2)));
                    ++a2;
                }
                GlStateManager.disableDepth();
                this.Method2117(a10, this.Field2190, this.Field2191);
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

    public void Method2117(List a2, int a3, int a4) {
        if (!a2.isEmpty()) {
            int a5;
            int a6 = 0;
            Iterator iterator = a2.Method1383();
            while (iterator.Method932()) {
                String a7 = (String)iterator.Method933();
                a5 = UHCFastCraft.mc.fontRendererObj.getStringWidth(a7);
                if (a5 <= a6) continue;
                a6 = a5;
            }
            int a8 = a3 + 12;
            int a9 = a4 - 12;
            a5 = 8;
            if (a2.Method1799() > 1) {
                a5 += 2 + (a2.Method1799() - 1) * 10;
            }
            if (a8 + a6 > RenderUtils.Method1076()) {
                a8 -= 28 + a6;
            }
            if (a9 + a5 + 6 > RenderUtils.Method1077()) {
                a9 = RenderUtils.Method1077() - a5 - 6;
            }
            RenderUtils.Method1104(a8 - 4, a9 - 4, a8 + a6 + 4, a9 + a5 + 4, Class681.Method2699(Class707.Method1828(), 50));
            RenderUtils.Method1104(a8 - 3, a9 - 3, a8 + a6 + 3, a9 + a5 + 3, Integer.MIN_VALUE);
            for (int a10 = 0; a10 < a2.Method1799(); ++a10) {
                String a11 = (String)a2.get(a10);
                UHCFastCraft.mc.fontRendererObj.drawStringWithShadow(a11, (float)a8, (float)a9, -1);
                a9 += 2;
                a9 += 10;
            }
        }
    }

    static int Method2118(UHCFastCraft a2) {
        return a2.Field2190;
    }

    static int Method2119(UHCFastCraft a2) {
        return a2.Field2191;
    }

    private static Exception Method263(Exception exception) {
        return exception;
    }
}