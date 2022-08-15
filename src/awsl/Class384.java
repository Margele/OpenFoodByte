/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.gui.GuiScreen
 */
package awsl;

import awsl.Class381;
import awsl.Class394;
import net.minecraft.client.gui.GuiScreen;
import trash.foodbyte.module.GlobalModule;

public class Class384
extends Class394 {
    private GuiScreen Field1887;

    public Class384(Class381 a, int a2, int a3, String a4, GuiScreen a5) {
        this(a, a2, a3, a4, null, a5);
    }

    public Class384(Class381 a, int a2, int a3, String a4, String a5, GuiScreen a6) {
        super(a, a2, a3, a4, a5);
        this.Field1887 = a6;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a.Method1414());
        this.Field1910 = 15;
        this.Field1920 = "ScreenButton";
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
        if (this.Field1919.Method1392(a, a2 - 15) && this.Method1311(a, a2)) {
            GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
        }
    }

    @Override
    protected void Method425() {
        this.Field1923.displayGuiScreen(this.Field1887);
    }

    @Override
    public void Method414() {
        super.Method414();
    }
}