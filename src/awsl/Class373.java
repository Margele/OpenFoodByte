/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.inventory.Slot
 */
package awsl;

import awsl.Class379;
import awsl.Class776;
import awsl.Class91;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.Slot;

public class Class373
extends Class379 {
    public float Field1762 = 0.0f;

    public Class373() {
        this(5.0f, 100.0f, 180.0f, 62.0f, 12.0f, 1.0f, 0.5f);
    }

    public Class373(float a, float a2, float a3, float a4, float a5, float a6, float a7) {
        super("PlayerInventory", a, a2, a3, a4, "Inventory", "Y", a5, a6, a7);
    }

    @Override
    public void Method63() {
        int n = Class776.Method1730();
        super.Method63();
        int a = (int)this.Field1806;
        int a2 = (int)this.Field1807 + (int)this.Field1812;
        this.Field1815 = 56.0f;
        int a3 = n;
        this.Field1814 = 164.0f;
        RenderHelper.enableGUIStandardItemLighting();
        boolean a4 = false;
        int a5 = 9;
        if (a5 < this.Field1808.thePlayer.inventoryContainer.inventorySlots.Method1799() - 9) {
            Slot a6 = (Slot)this.Field1808.thePlayer.inventoryContainer.inventorySlots.get(a5);
            if (a6.getHasStack()) {
                a4 = true;
            }
            int a7 = a6.xDisplayPosition;
            int a8 = a6.yDisplayPosition;
            this.Field1808.getRenderItem().renderItemAndEffectIntoGUI(a6.getStack(), a + a7 - 6, a2 + a8 - 82);
            this.Field1808.getRenderItem().renderItemOverlays(this.Field1808.fontRendererObj, a6.getStack(), a + a7 - 6, a2 + a8 - 82);
            ++a5;
        }
        RenderHelper.disableStandardItemLighting();
        this.Field1808.fontRendererObj.drawStringWithShadow("Inventory \u00a77Empty", (float)(a - this.Field1808.fontRendererObj.getStringWidth("Inventory Empty") / 2) + this.Field1814 / 2.0f, (float)(a2 - this.Field1808.fontRendererObj.FONT_HEIGHT / 2) + this.Field1815 / 2.0f, -1);
        if (Class91.Method3648() == null) {
            Class776.Method1729(++a3);
        }
    }
}