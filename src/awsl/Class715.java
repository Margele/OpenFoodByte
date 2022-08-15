/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.renderer.GlStateManager
 */
package awsl;

import awsl.Class344;
import awsl.Class713;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import trash.foodbyte.utils.RenderUtils;

public class Class715
extends GuiButton {
    Class344 Field3101 = new Class344(10);

    public Class715(int a, int a2, int a3, String a4) {
        super(a, a2, a3, 200, 20, a4);
    }

    public Class715(int a, int a2, int a3, int a4, int a5, String a6) {
        super(a, a2, a3, a4, a5, a6);
    }

    public void Method2056(Minecraft a, int a2, int a3) {
        int[] a4 = Class713.Method2054();
        if (this.visible) {
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.hovered = a2 >= this.xPosition && a3 >= this.yPosition && a2 < this.xPosition + this.width && a3 < this.yPosition + this.height;
            this.getHoverState(this.hovered);
            this.Field3101.Method290(this.hovered);
            int a5 = -263693982;
            this.mouseDragged(a, a2, a3);
            int a6 = 0xE0E0E0;
            if (!this.enabled) {
                a6 = 0xA0A0A0;
            }
            if (this.hovered) {
                a6 = 0xFFFFA0;
            }
            RenderUtils.Method1103(this.xPosition, this.yPosition + this.height / 2 - 10, this.width, 20.0f, new Color(0, 153, 255, 100).getRGB());
            this.drawCenteredString(a.fontRendererObj, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, a6);
            int a7 = Minecraft.getMinecraft().fontRendererObj.getStringWidth(this.displayString);
            RenderUtils.Method1085((double)(this.xPosition + this.width / 2) - this.Field3101.Method292() * (double)this.width / 2.0, this.yPosition + 22, (double)(this.xPosition + this.width / 2) + this.Field3101.Method292() * (double)this.width / 2.0, this.yPosition + 22, 1.0f, a5);
        }
    }
}