/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.gui.GuiScreen
 */
package trash.foodbyte.module.impl.render;

import awsl.Class492;
import net.minecraft.client.gui.GuiScreen;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;

public class ClickGui
extends Module {
    public ClickGui() {
        super("ClickGui", "Click Gui", Category.RENDER);
        this.Method1033(true);
        this.Field2646 = true;
        this.Method1021(54);
    }

    @Override
    public String getDescription() {
        return "\u5ba2\u6237\u7aef\u63a7\u5236\u9762\u677f";
    }

    @Override
    public void idk() {
        GlobalModule.Field3162.Method2757(GlobalModule.INSTANCE.Field3186 != null && PermissionManager.canUseModule("tp"));
        GlobalModule.Field3173.Method2757(GlobalModule.INSTANCE.Field3186 != null && PermissionManager.canUseModule("tp"));
        GlobalModule.Field3156.Method2757(GlobalModule.INSTANCE.Field3186 != null && PermissionManager.canUseModule("tp"));
    }

    @Override
    public void onEnable() {
        String string = Class492.Method2239();
        if (this.Method1026()) {
            if (GlobalModule.Field3151.isCurrentMode("FoodByte")) {
                mc.displayGuiScreen((GuiScreen)GlobalModule.INSTANCE.Method2014());
            }
            if (GlobalModule.Field3151.isCurrentMode("Panel")) {
                mc.displayGuiScreen((GuiScreen)GlobalModule.INSTANCE.Method2015());
            }
            this.setState(false);
        }
    }
}