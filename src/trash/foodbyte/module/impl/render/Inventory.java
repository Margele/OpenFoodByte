/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.gui.GuiChat
 */
package trash.foodbyte.module.impl.render;

import awsl.Class352;
import awsl.Class373;
import awsl.Class379;
import awsl.Class492;
import eventapi.EventTarget;
import net.minecraft.client.gui.GuiChat;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.FloatValue;

public class Inventory
extends Module {
    public FloatValue Field2360 = new FloatValue("Inventory", "X", 0.0, 0.0, 1920.0, 1.0, "\u8fbe\u4f4d\u7f6e\u5de6\u53f3");
    public FloatValue Field2361 = new FloatValue("Inventory", "Y", 80.0, 0.0, 1080.0, 1.0, "\u8fbe\u4f4d\u7f6e\u4e0a\u4e0b");
    public Class379 Field2362 = new Class373(this.Field2360.getFloatValue().intValue(), (float)this.Field2361.getFloatValue().intValue(), 180.0f, 62.0f, 12.0f, 1.0f, 0.5f);

    public Inventory() {
        super("Inventory", "Inventory", Category.RENDER);
        this.Method1033(true);
    }

    @Override
    public String getDescription() {
        return "\u5728\u5c4f\u5e55\u4e0a\u7ed8\u5236\u4e00\u4e2a\u80cc\u5305\u91cc\u9762\u7684\u7269\u54c1";
    }

    @EventTarget
    public void Method810(EventRender2D a2) {
        String string = Class492.Method2239();
        if (!Class352.Field1690.contains((Object)this.Field2362)) {
            GlobalModule.INSTANCE.Field3168.Method69(this.Field2362);
        }
        if (!Inventory.mc.gameSettings.showDebugInfo) {
            if (Inventory.mc.currentScreen instanceof GuiChat && this.Field2362.Field1811) {
                this.Field2360.Method2747(this.Field2362.Field1806);
                this.Field2361.Method2747(this.Field2362.Field1807);
            }
            this.Field2362.Field1806 = this.Field2360.getFloatValue().floatValue();
            this.Field2362.Field1807 = this.Field2361.getFloatValue().floatValue();
        }
    }
}