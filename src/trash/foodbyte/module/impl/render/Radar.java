/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.HashMap
 *  net.minecraft.client.gui.GuiChat
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
package trash.foodbyte.module.impl.render;

import awsl.Class352;
import awsl.Class353;
import awsl.Class379;
import awsl.Class492;
import eventapi.EventTarget;
import java.util.HashMap;
import net.minecraft.client.gui.GuiChat;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Radar
extends Module {
    public static HashMap Field2215 = new HashMap();
    public FloatValue Field2216 = new FloatValue("Radar", "X", 0.0, 0.0, 1920.0, 1.0, "\u8c03\u96f7\u8fbe\u4f4d\u7f6e\u5de6\u53f3");
    public FloatValue Field2217 = new FloatValue("Radar", "Y", 180.0, 0.0, 1080.0, 1.0, "\u8c03\u96f7\u8fbe\u4f4d\u7f6e\u4e0a\u4e0b");
    public FloatValue Field2218 = new FloatValue("Radar", "Scale", 2.0, 1.0, 5.0, 0.1, "\u96f7\u8fbe\u8303\u56f4");
    public FloatValue Field2219 = new FloatValue("Radar", "Width", 80.0, 50.0, 500.0, 10.0, "\u96f7\u8fbe\u5bbd\u5ea6");
    public FloatValue Field2220 = new FloatValue("Radar", "Height", 80.0, 50.0, 500.0, 10.0, "\u96f7\u8fbe\u9ad8\u5ea6");
    public BooleanValue Field2221 = new BooleanValue("Radar", "WayPoints", (Boolean)true, "\u663e\u793a00\u5750\u6807");
    public Class379 Field2222 = new Class353(this.Field2216.Method2744().intValue(), this.Field2217.Method2744().intValue(), this.Field2219.Method2744().intValue(), this.Field2220.Method2744().intValue(), 12.0f, 1.0f, 0.5f, true, this.Field2219.Method2750(), this.Field2220.Method2750(), this.Field2219.Method2751(), this.Field2220.Method2751());

    public Radar() {
        super("Radar", Category.RENDER);
        Field2215.put((Object)"PVP", (Object)new double[]{Double.parseDouble((String)"0"), Double.parseDouble((String)"80"), Double.parseDouble((String)"0")});
    }

    @Override
    public String getDescription() {
        return "\u73a9\u5bb6\u96f7\u8fbe(\u53ef\u6253\u5f00\u804a\u5929\u6846\u70b9\u51fb\u96f7\u8fbe\u62d6\u52a8\u4f4d\u7f6e)";
    }

    @EventTarget
    public void Method810(EventRender2D a) {
        String a2 = Class492.Method2239();
        if (!Class352.Field1690.contains((Object)this.Field2222)) {
            GlobalModule.INSTANCE.Field3168.Method69(this.Field2222);
        }
        if (!Radar.mc.gameSettings.showDebugInfo) {
            int a3 = (int)MathUtils.Method547(Mouse.getX(), 0.0f, Display.getWidth(), 0.0f, RenderUtils.Method1076());
            int a4 = (int)MathUtils.Method547(Display.getHeight() - Mouse.getY(), 0.0f, Display.getHeight(), 0.0f, RenderUtils.Method1077());
            if (Radar.mc.currentScreen instanceof GuiChat && this.Field2222.Field1811 || this.Field2222.Field1822) {
                this.Field2216.Method2747(this.Field2222.Field1806);
                this.Field2217.Method2747(this.Field2222.Field1807);
                this.Field2219.Method2747(this.Field2222.Field1814);
                this.Field2220.Method2747(this.Field2222.Field1815);
            }
            this.Field2222.Field1814 = this.Field2219.Method2744().intValue();
            this.Field2222.Field1815 = this.Field2220.Method2744().intValue();
            this.Field2222.Field1806 = this.Field2216.Method2744().floatValue();
            this.Field2222.Field1807 = this.Field2217.Method2744().floatValue();
        }
    }
}