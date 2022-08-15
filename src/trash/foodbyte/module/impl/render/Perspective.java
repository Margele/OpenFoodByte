/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.lwjgl.input.Keyboard
 */
package trash.foodbyte.module.impl.render;

import awsl.Class654;
import eventapi.EventTarget;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Perspective
extends Module {
    public BooleanValue Field2196 = new BooleanValue("Perspective", "Hold", (Boolean)false, "\u6309\u4f4f\u6309\u952e\u5f00\u542f\u677e\u5f00\u5173\u95ed");
    public BooleanValue Field2197 = new BooleanValue("Perspective", "Custom Fov", (Boolean)false, "\u81ea\u5b9a\u4e49\u5f00\u542f\u540e\u89d2\u5ea6");
    public FloatValue Field2198 = new FloatValue("Perspective", "Fov", 70.0, 30.0, 150.0, 1.0, "\u89d2\u5ea6");
    public static float Field2199 = Perspective.mc.gameSettings.fovSetting;
    public static float Field2200 = 0.0f;
    public static float Field2201 = 0.0f;
    public static int Field2202 = 0;
    public static boolean Field2203 = false;

    public Perspective() {
        super("Perspective", "Perspective", Category.RENDER);
        this.Method1033(true);
    }

    @Override
    public String getDescription() {
        return "360\u00b0\u89c6\u89d2(\u6253\u5f00\u540e\u53ef\u4ee5\u65e0\u6b7b\u89d2\u89c2\u5bdf\u4e0d\u5f71\u54cd\u73a9\u5bb6\u8d70\u8def)";
    }

    @EventTarget
    public void Method801(Class654 a) {
        if (Perspective.mc.gameSettings.thirdPersonView != 1) {
            Field2202 = Perspective.mc.gameSettings.thirdPersonView;
            this.Method1028();
        }
        if (this.Field2197.Method2509().booleanValue()) {
            Perspective.mc.gameSettings.fovSetting = this.Field2198.Method2744().floatValue();
        }
        if (this.Field2196.Method2509().booleanValue() && Perspective.mc.theWorld != null) {
            boolean a2 = Keyboard.isKeyDown((int)this.Method1020());
            if (Perspective.mc.currentScreen != null) {
                this.setState(false);
            }
        }
    }

    @Override
    public void onEnable() {
        Field2203 = true;
        Field2200 = Perspective.mc.thePlayer.rotationYaw;
        Field2201 = Perspective.mc.thePlayer.rotationPitch;
        Field2202 = Perspective.mc.gameSettings.thirdPersonView;
        Perspective.mc.gameSettings.thirdPersonView = 1;
        Field2199 = Perspective.mc.gameSettings.fovSetting;
        if (this.Field2197.Method2509().booleanValue()) {
            Perspective.mc.gameSettings.fovSetting = this.Field2198.Method2744().floatValue();
        }
    }

    @Override
    public void Method279() {
        Field2203 = false;
        if (Perspective.mc.gameSettings.thirdPersonView != 1) {
            // empty if block
        }
        Perspective.mc.gameSettings.thirdPersonView = Field2202;
        Perspective.mc.gameSettings.fovSetting = Field2199;
    }
}