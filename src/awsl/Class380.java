/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Objects
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemBlock
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class340;
import awsl.Class348;
import awsl.Class349;
import awsl.Class565;
import awsl.Class681;
import awsl.Class707;
import awsl.Class91;
import eventapi.EventManager;
import eventapi.EventTarget;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.module.impl.player.SuperPlace;
import trash.foodbyte.module.impl.render.Hud;
import trash.foodbyte.utils.RenderUtils;

public class Class380 {
    private Minecraft Field1835 = Minecraft.getMinecraft();
    private SimpleDateFormat Field1836 = new SimpleDateFormat("HH:mm");
    private Class349 Field1837 = new Class349(0.01);
    private Class349 Field1838 = new Class349(0.01);
    private Class349 Field1839 = new Class349(0.01);
    public EntityLivingBase Field1840;
    private static Class91[] Field1841;

    public Class380() {
        Class91[] class91Array = Class380.Method1382();
        EventManager.register(this);
        Class91[] class91Array2 = class91Array;
        if (Class91.Method3648() == null) {
            Class380.Method1381(new Class91[5]);
        }
    }

    @EventTarget(value=0)
    public void Method1378(EventRender2D a) {
        if (Class348.Method368()) {
            Class348.Method366(true);
        }
    }

    @EventTarget(value=4)
    public void Method1379(EventRender2D a) {
        Object a2;
        ScaledResolution a3 = new ScaledResolution(this.Field1835);
        Class91[] a4 = Class380.Method1382();
        Hud a5 = (Hud)ModuleManager.getModule(Hud.class);
        SuperPlace a6 = (SuperPlace)ModuleManager.getModule(SuperPlace.class);
        boolean a7 = Hud.Field2369.Method2509() != false && a5.getState();
        boolean a8 = Hud.Field2370.Method2509() != false && a5.getState();
        this.Field1837.Method4(a7);
        if (this.Field1837.Method6() > 0.0) {
            this.Method1380();
        }
        this.Field1838.Method4(a8);
        if (this.Field1838.Method6() > 0.0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(80.0f - 80.0f * (float)this.Field1838.Method6()), (float)0.0f, (float)0.0f);
            a5.Method1558(a3);
            GL11.glPopMatrix();
        }
        boolean a9 = a6.Field2411.Method2509() != false && a6.getState() && this.Field1835.thePlayer.getHeldItem() != null && this.Field1835.thePlayer.getHeldItem().getItem() instanceof ItemBlock;
        this.Field1839.Method4(a9);
        if (this.Field1839.Method6() > 0.0) {
            a2 = this.Field1835.thePlayer.getHeldItem();
            GL11.glPushMatrix();
            RenderHelper.enableGUIStandardItemLighting();
            int a10 = a3.getScaledWidth() / 2;
            int a11 = a3.getScaledHeight() / 2;
            int a12 = a11 + a6.Field2408.Method2744().intValue();
            RenderUtils.Method1145(a10, a12 - 20, (float)this.Field1839.Method6());
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            RenderUtils.Method1103(a10 - 9, a12 - 29, 18.0f, 18.0f, new Color(0, 0, 0, 120).getRGB());
            RenderUtils.Method1103(a10 - 9, a12 - 30, 18.0f, 1.0f, GlobalModule.Field3143.Method2442());
            this.Field1835.getRenderItem().renderItemAndEffectIntoGUI(a2, a10 - 8, a12 - 28);
            this.Field1835.getRenderItem().renderItemOverlays(this.Field1835.fontRendererObj, a2, a10 - 10, a12 - 29);
            RenderHelper.disableStandardItemLighting();
            GL11.glPopMatrix();
            RenderUtils.Method1146();
        }
        if (((KillAura)ModuleManager.getModule2(KillAura.class)).Field2519.Method2509().booleanValue()) {
            if (KillAura.Field2524 != null) {
                this.Field1840 = KillAura.Field2524;
            }
            if (this.Field1840 != null) {
                Class340.Method264(this.Field1840);
            }
        }
        if (GlobalModule.Field3151.isCurrentMode("FoodByte") && !(this.Field1835.currentScreen instanceof Class707) && Objects.nonNull((Object)((Object)GlobalModule.INSTANCE.Field3190))) {
            GlobalModule.INSTANCE.Field3190.Method1814();
            GlobalModule.INSTANCE.Field3190.Method1816();
        }
        if (GlobalModule.Field3181.Method2509().booleanValue()) {
            a2 = "\u00a77Release - \u00a7f" + GlobalModule.Field3164 + " \u00a77- \u00a77User - \u00a7a" + GlobalModule.INSTANCE.Field3186.Field2827.Field2840;
            String a13 = "\u00a77Rank - \u00a72" + GlobalModule.INSTANCE.Field3186.Field2827.Field2839;
            Class565.Field2641.Method1220((String)a2, (float)a3.getScaledWidth() - Class565.Field2641.Method1225((String)a2) - 1.0f, a3.getScaledHeight() - 10, Class681.Method1614(255, 220));
            Class565.Field2641.Method1220(a13, (float)a3.getScaledWidth() - Class565.Field2641.Method1225(a13) - 1.0f, (float)(a3.getScaledHeight() - 8) - Class565.Field2641.Method1228(), Class681.Method1614(255, 220));
        }
        GlobalModule.INSTANCE.Method2012().Method70();
        Class91.Method3647(new String[5]);
    }

    private void Method1380() {
        String a = "FoodByte\u00a7f | " + GlobalModule.INSTANCE.Field3186.Field2827.Field2840 + "\u00a7f | FPS:" + Minecraft.getDebugFPS() + " | \u00a77[\u00a7f" + this.Field1836.format(new Date()) + "\u00a77]\u00a7r";
        RenderUtils.Method1103(1.0f, 1.0f - Class565.Field2635.Method1228() + Class565.Field2635.Method1228() * (float)this.Field1837.Method6(), Class565.Field2635.Method1225(a) + 2.0f, Class565.Field2635.Method1228() + 1.0f, new Color(0, 0, 0, 120).getRGB());
        RenderUtils.Method1103(1.0f, 1.0f - Class565.Field2635.Method1228() + Class565.Field2635.Method1228() * (float)this.Field1837.Method6(), Class565.Field2635.Method1225(a) + 2.0f, 1.0f, GlobalModule.Field3143.Method2442());
        Class565.Field2635.Method1217(a, 2.0f, 2.0f - Class565.Field2635.Method1228() + Class565.Field2635.Method1228() * (float)this.Field1837.Method6(), GlobalModule.Field3143.Method2442());
    }

    public static void Method1381(Class91[] class91Array) {
        Field1841 = class91Array;
    }

    public static Class91[] Method1382() {
        return Field1841;
    }

    static {
        Class380.Method1381(new Class91[1]);
    }
}