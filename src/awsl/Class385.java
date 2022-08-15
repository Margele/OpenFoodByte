/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package awsl;

import awsl.Class344;
import awsl.Class381;
import awsl.Class390;
import awsl.Class394;
import awsl.Class565;
import awsl.Class681;
import awsl.Class707;
import awsl.Class708;
import java.awt.Color;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class385
extends Class394 {
    private Module Field1888;
    private boolean Field1889;
    private boolean Field1890;
    private Class344 Field1891 = new Class344(15);

    public Class385(Class381 a, int a2, int a3, String a4, Module a5, String a6) {
        super(a, a2, a3, a4, a6);
        this.Field1888 = a5;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a.Method1414());
        this.Field1910 = 15;
        this.Field1920 = "ModuleButton";
    }

    @Override
    public void Method419(int a, int a2) {
        boolean bl = this.Field1916 = !this.Field1888.isHideModule;
        if (GlobalModule.Field3155.getValue()) {
            this.Field1916 = true;
        } else if (!this.Field1916 && GlobalModule.INSTANCE.Field3190.Method1827(this.Field1888.getName() + "_setting")) {
            GlobalModule.INSTANCE.Field3190.Method1826(this.Field1888.getName() + "_setting", false);
        }
        this.Field1910 = this.Field1916 ? 15 : 0;
        this.Field1949 = this.Field1888 != null && this.Field1888.getState();
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
        if (this.Field1889) {
            GlobalModule.INSTANCE.Field3190.Method1808("\u00a73" + this.Field1888.getName() + "\n" + this.Field1914 + "\n\u9690\u85cf\u529f\u80fd: " + this.Field1888.hide + "\n\u7ed1\u5b9a\u6309\u952e: \u00a7d" + Keyboard.getKeyName((int)this.Field1888.Method1020()));
        }
    }

    @Override
    public void Method412(int a, int a2) {
        int a3 = new Color(0xD5D5D5).getRGB();
        this.Field1891.Method290(GlobalModule.INSTANCE.Field3190.Method1827(this.Field1888.getName() + "_setting"));
        if (this.Field1915) {
            RenderUtils.Method1103(this.Field1907, this.Field1908, this.Method1310(), this.Field1910, Class681.Method2699(Class707.Method1829(), -250));
        }
        Class565.Field2635.Method1217(this.Field1913, this.Field1907 + 12, (float)(this.Field1908 + this.Field1910 / 2) - Class565.Field2635.Method1227(this.Field1913) / 2.0f + 1.0f, this.Field1888.canUse() ? new Color(0x6F6F6F).getRGB() : (this.Field1949 ? Class707.Method1832() : 0xFFFFFF));
        if (this.Field1888.Method1031()) {
            a3 = this.Field1890 ? Class681.Method2699(a3, 30) : a3;
            float a4 = (float)this.Field1907 + (float)this.Field1909 - 6.5f;
            float a5 = (float)this.Field1908 + (float)this.Field1910 / 2.0f;
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)a4, (float)a5, (float)0.0f);
            GlStateManager.rotate((float)((float)this.Field1891.Method292() * 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            RenderUtils.Method1085(-1.0, -2.0, 1.0, 0.0, 1.0f, a3);
            RenderUtils.Method1085(-1.0, 2.0, 1.0, 0.0, 1.0f, a3);
            GlStateManager.translate((float)(-a4), (float)(-a5), (float)0.0f);
            GlStateManager.popMatrix();
        }
        int a6 = this.Field1888.getState() ? Class707.Method1832() : 0xFFFFFF;
        RenderUtils.Method1133(a6);
    }

    @Override
    protected void Method425() {
        int n = Class390.Method1318();
        if (this.Field1889 && this.Field1888 != null) {
            if (Mouse.isButtonDown((int)0)) {
                this.Field1888.Method1028();
            }
            if (!Mouse.isButtonDown((int)1) && Mouse.isButtonDown((int)2)) {
                if (Keyboard.isKeyDown((int)42)) {
                    this.Field1888.Method1033(!this.Field1888.hide);
                    GlobalModule.INSTANCE.fileManager.saveHide();
                }
                this.Field1923.displayGuiScreen((GuiScreen)new Class708(this.Field1888, GlobalModule.INSTANCE.Field3190));
            }
        }
        if (this.Field1890 && this.Field1888.Method1031() && (Mouse.isButtonDown((int)1) || Mouse.isButtonDown((int)0))) {
            if (!GlobalModule.INSTANCE.Field3190.Method1827(this.Field1888.getName() + "_setting")) {
                GlobalModule.INSTANCE.Field3190.Method1826(this.Field1888.getName() + "_setting", true);
            }
            GlobalModule.INSTANCE.Field3190.Method1826(this.Field1888.getName() + "_setting", false);
            this.Field1919.Method1384();
        }
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
        this.Field1889 = this.Method423(a, a2) && this.Field1919.Method1392(a, a2) && this.Field1915;
        this.Field1890 = this.Method1438(a, a2) && this.Field1919.Method1392(a, a2) && this.Field1915;
        super.Method413(a, a2, a3);
    }

    @Override
    public void Method414() {
        this.Field1889 = false;
        this.Field1890 = false;
        super.Method414();
    }

    private boolean Method423(int a, int a2) {
        return MathUtils.Method549(a, a2, this.Field1907, this.Field1908, this.Field1907 + this.Field1909 - 15, this.Field1908 + this.Field1910);
    }

    private boolean Method1438(int a, int a2) {
        return MathUtils.Method549(a, a2, (float)this.Field1907 + (float)this.Field1909 - (float)(this.Field1919.Method1418() ? 2 : 0) - 10.0f, this.Field1908, this.Field1907 + this.Field1909 - (this.Field1919.Method1418() ? 2 : 0) - 2, this.Field1908 + this.Field1910);
    }

    public Module Method1439() {
        return this.Field1888;
    }

    public void Method1440(Module a) {
        this.Field1888 = a;
    }
}