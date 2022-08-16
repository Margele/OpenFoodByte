/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Iterator
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.MathHelper
 */
package trash.foodbyte.module.impl.render;

import awsl.Class327;
import awsl.Class330;
import awsl.Class492;
import awsl.Class565;
import awsl.Class662;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.render.ClickGui;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Hud
extends Module {
    public static ModeValue Field2363 = new ModeValue("Hud", "Array", "Normal", new String[]{"Normal", "Side", "All"}, "HUD\u6a21\u5f0f");
    public static ColorValue Field2364 = new ColorValue("Hud", "HUD Color", new Color(0, 153, 255, 100), "\u7ed8\u5236\u989c\u8272");
    public static FloatValue Field2365 = new FloatValue("Hud", "RainBowHue", 4000.0, 500.0, 4000.0, 100.0, "\u5f69\u8272\u901f\u5ea6");
    public static FloatValue Field2366 = new FloatValue("Hud", "RainBowSatu", 0.5, 0.0, 1.0, 0.01, "\u5f69\u8272\u9c9c\u660e\u5ea6");
    public static FloatValue Field2367 = new FloatValue("Hud", "RainBowBright", 0.75, 0.0, 1.0, 0.01, "\u5f69\u8272\u4eae\u5ea6");
    public static FloatValue Field2368 = new FloatValue("Hud", "RainBowStep", 45.0, 1.0, 100.0, 1.0, "\u53d8\u52a8\u901f\u5ea6");
    public static BooleanValue Field2369 = new BooleanValue("Hud", "Logo", (Boolean)true, "\u5de6\u4e0a\u89d2logo\u663e\u793a");
    public static BooleanValue Field2370 = new BooleanValue("Hud", "ArrayList", (Boolean)true, "\u529f\u80fd\u663e\u793a");
    public static BooleanValue Field2371 = new BooleanValue("Hud", "FontShadow", (Boolean)false, "\u5b57\u4f53\u9634\u5f71");
    public static BooleanValue Field2372 = new BooleanValue("Hud", "Rainbow", (Boolean)false, "\u5f69\u8272\u6a21\u5f0f");
    private Class327 Field2373 = new Class327(Class330.class);

    public Hud() {
        super("Hud", "Hud", Category.RENDER);
        this.Method1033(true);
    }

    @Override
    public String getDescription() {
        return "\u8fd9\u4e2a\u5c31\u4e0d\u7528\u6211\u591a\u8bf4\u4e86\u5427";
    }

    @EventTarget
    public void Method810(EventRender2D a) {
    }

    /*
     * WARNING - void declaration
     */
    public void Method1558(ScaledResolution a2) {
        double d = 0.0;
        double d2 = a2.getScaledWidth();
        String a3 = Class492.Method2239();
        ArrayList a4 = new ArrayList((Collection)ModuleManager.getAllModules());
        a4.sort(Comparator.comparingDouble(Hud::Method1560));
        Iterator iterator = a4.Method1383();
        while (iterator.Method932()) {
            double a5;
            void a6;
            void a7;
            Module a8 = (Module)iterator.Method933();
            if (a8 == ModuleManager.getModule(ClickGui.class) || a8.hide) continue;
            String a9 = a8.Method1016().isEmpty() ? a8.Method1023() : String.format((String)"%s%s", (Object[])new Object[]{a8.Method1023(), a8.Method1016()});
            double a10 = Class565.Field2637.Method1225(a8.Method1016().isEmpty() ? a8.Method1023() : String.format((String)"%s%s", (Object[])new Object[]{a8.Method1023(), a8.Method1016()})) + 2.0f + (float)(Field2363.isCurrentMode("Normal") ? -1 : 0);
            double a11 = Class565.Field2637.Field2625 - 4.0f;
            if (a8.getState()) {
                a8.Method1034(a10 - this.Field2373.Method998(a8.Method1038(), 0.0, a10, 0.3));
                a8.Method1035(a11 - this.Field2373.Method998(a8.Method1039(), 0.0, a11, 0.3));
            }
            a8.Method1034(this.Field2373.Method998(a8.Method1038(), 0.0, a10, 0.3));
            a8.Method1035(this.Field2373.Method998(a8.Method1039(), 0.0, a11, 0.3));
            a8.Method1034(MathHelper.clamp_double((double)a8.Method1036(), (double)0.0, (double)a10));
            a8.Method1035(MathHelper.clamp_double((double)a8.Method1037(), (double)0.0, (double)a11));
            if (!a8.getState() && (a8.Method1036() == 0.0 || a8.Method1036() == a10)) break;
            int a12 = Field2372.getBooleanValue().booleanValue() ? Hud.Method1559((int)(a7 * (double)Field2368.getFloatValue().intValue())) : Class662.Method2400(new Color(Field2364.Method2444().getRGB()), 20, a4.indexOf((Object)a8) * 2 + 10).getRGB();
            if (Field2364.Method2453() != 0) {
                RenderUtils.Method1105((double)(a6 - a10 + a8.Method1036() - 1.0), (double)a7, (double)(a6 + a10 + a8.Method1036()), (double)(a7 + a11), new Color(0, 0, 0, Field2364.Method2453()).getRGB());
            }
            if (Field2363.isCurrentMode("Side") || Field2363.isCurrentMode("All")) {
                RenderUtils.Method1105((double)(a6 + a8.Method1036() - 1.0), (double)a7, (double)(a6 + a8.Method1036()), (double)(a7 + a11), a12);
            }
            double d3 = a5 = a6 < (double)(a2.getScaledWidth() / 2) ? 2.0 : 0.0;
            if (Field2371.getBooleanValue().booleanValue()) {
                Class565.Field2637.Method1220(a9, (float)(a6 - a10 + a8.Method1036() + a5), (float)a7 - 1.0f, a12);
            }
            Class565.Field2637.Method1217(a9, (float)(a6 - a10 + a8.Method1036() + a5), (float)a7 - 1.0f, a12);
            a7 += a11 - a8.Method1037();
            break;
        }
    }

    public static int Method1559(int a2) {
        float a3;
        float a4 = Field2365.getFloatValue().floatValue();
        for (a3 = (float)(System.currentTimeMillis() % (long)((int)a4)) + (float)(a2 / 2); a3 > a4; a3 -= a4) {
        }
        if ((double)(a3 /= a4) > 0.5) {
            a3 = 0.5f - a3 - 0.5f;
        }
        return Color.HSBtoRGB((float)(a3 += 0.5f), (float)Field2366.getFloatValue().floatValue(), (float)Field2367.getFloatValue().floatValue());
    }

    @Override
    public void onEnable() {
        this.Field2373.Method1003(1337);
    }

    @Override
    public void onDisable() {
    }

    private static double Method1560(Module a2) {
        return -Class565.Field2637.Method1225(a2.Method1016().isEmpty() ? a2.Method1023() : String.format((String)"%s%s", (Object[])new Object[]{a2.Method1023(), a2.Method1016()}));
    }
}