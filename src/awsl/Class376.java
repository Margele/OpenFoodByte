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

import awsl.Class381;
import awsl.Class390;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.Slot;

public class Class376
extends Class390 {
    public Class376(Class381 a, int a2, int a3) {
        super(a, a2, a3, "PlayerInventory", null);
        this.Field1909 = 164;
        this.Field1910 = 56;
        this.Field1920 = "PlayerInventory";
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method412(int a, int a2) {
        void a3;
        boolean a4 = false;
        boolean a5 = false;
        boolean a6 = false;
        RenderHelper.enableGUIStandardItemLighting();
        boolean bl = false;
        int n = 9;
        int a7 = Class390.Method1318();
        if (a3 < this.Field1923.thePlayer.inventoryContainer.inventorySlots.Method1799() - 9) {
            Slot a8 = (Slot)this.Field1923.thePlayer.inventoryContainer.inventorySlots.get((int)a3);
            if (a8.getHasStack()) {
                boolean a9 = true;
            }
            int a10 = a8.xDisplayPosition;
            int a11 = a8.yDisplayPosition;
            this.Field1923.getRenderItem().renderItemAndEffectIntoGUI(a8.getStack(), this.Field1907 + a10 - 6, this.Field1908 + a11 - 82);
            this.Field1923.getRenderItem().renderItemOverlays(this.Field1923.fontRendererObj, a8.getStack(), this.Field1907 + a10 - 6, this.Field1908 + a11 - 82);
            ++a3;
        }
        this.Field1923.fontRendererObj.drawStringWithShadow("Inventory \u00a77Empty", (float)(this.Field1907 - this.Field1923.fontRendererObj.getStringWidth("Inventory Empty") / 2 + this.Field1909 / 2), (float)(this.Field1908 - this.Field1923.fontRendererObj.FONT_HEIGHT / 2 + this.Field1910 / 2), -1);
        RenderHelper.disableStandardItemLighting();
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
    }
}