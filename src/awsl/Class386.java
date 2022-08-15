/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Comparator
 */
package awsl;

import awsl.Class381;
import awsl.Class390;
import awsl.Class565;
import awsl.Class606;
import awsl.Class681;
import awsl.Class707;
import java.awt.Color;
import java.util.Comparator;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;

public class Class386
extends Class390 {
    private int Field1892;

    public Class386(Class381 a, int a2, int a3, String a4) {
        super(a, a2, a3, "IRCUserList", a4);
        this.Field1909 = this.Field1919.Field1874;
        this.Field1910 = 18;
        this.Field1920 = "IRCUserList";
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
        int n = Class390.Method1317();
        this.Field1919.Method1398("IRC - " + GlobalModule.INSTANCE.Field3186.Field2823.Method1799());
        int a3 = n;
        float a4 = 0.0f;
        int a5 = 0;
        if (a5 < GlobalModule.INSTANCE.Field3186.Field2823.Method1799()) {
            Class606 a6 = (Class606)GlobalModule.INSTANCE.Field3186.Field2823.get(a5);
            StringBuilder stringBuilder = new StringBuilder();
            if (Class565.Field2636.Method1225(stringBuilder.append(a6.Method3737()).append(a6.Method3739()).toString()) > a4) {
                a4 = Class565.Field2636.Method1225(a6.Method3737() + a6.Method3739());
            }
            ++a5;
        }
        if (a4 + 6.0f >= (float)this.Field1909) {
            this.Field1909 = (int)a4 + 6;
        }
        this.Field1909 = this.Field1919.Field1874;
        GlobalModule.INSTANCE.Field3186.Field2823.sort(Comparator.comparingDouble(Class606::Method3740).reversed());
        this.Field1910 = (int)((float)GlobalModule.INSTANCE.Field3186.Field2823.Method1799() * (Class565.Field2636.Field2625 + 2.0f) + 4.0f);
        this.Field1919.Method1384();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method412(int a, int a2) {
        void a3;
        float f = this.Field1907 + 2;
        float a4 = this.Field1908 + 2;
        float f2 = 2.0f;
        int a5 = Class390.Method1318();
        RenderUtils.Method1103((float)this.Field1907 + a3, a4, (float)this.Field1909 - a3 * 2.0f, this.Field1910 - 4, new Color(255, 255, 255, 40).getRGB());
        int a6 = 0;
        if (a6 < GlobalModule.INSTANCE.Field3186.Field2823.Method1799()) {
            void a7;
            Class606 a8 = (Class606)GlobalModule.INSTANCE.Field3186.Field2823.get(a6);
            if ((float)a >= a7 + 0.5f && (float)a <= (float)(this.Field1907 + this.Field1909) - a3 * 2.0f - 1.0f && (float)a2 >= a4 + 0.5f && (float)a2 < a4 + Class565.Field2636.Field2625 + 3.0f) {
                this.Field1892 = a6;
                GlobalModule.INSTANCE.Field3190.Method1808(a8.Method3736() + a8.Method3737() + a8.Method3739() + "\n\u5728\u7ebf\u65f6\u95f4 - " + a8.Method3742(System.currentTimeMillis() - a8.Field2844) + "\n\u6e38\u620fID - " + a8.Field2842 + "\n\u533f\u540dID - " + a8.Field2841 + "\n\u6b63\u5728\u73a9 - " + a8.Field2849 + "\n" + a8.Field2850 + "\n\u5f00\u5c40 " + a8.Method3742(System.currentTimeMillis() - a8.Field2851) + "\n\u9690\u8eab - " + (a8.Field2847 ? "\u5f00\u542f" : "\u5173\u95ed") + "\nIRC\u670b\u53cb - " + (a8.Field2848 ? "\u5f00\u542f" : "\u5173\u95ed") + "\n");
                RenderUtils.Method1103((float)(a7 + 0.5f), a4 + 0.5f, (float)this.Field1909 - a3 * 2.0f - 1.0f, Class565.Field2636.Method1227(a8.Method3737() + a8.Method3739()) + 1.0f, Class681.Method900(Class707.Method1828(), 0.5f));
            }
            Class565.Field2636.Method1217(a8.Method3737() + a8.Method3739(), (float)(a7 + 1.0f), a4 + 1.0f, new Color(0xD5D5D5).getRGB());
            a4 += Class565.Field2636.Method1227(a8.Method3737() + a8.Method3739()) + 2.0f;
            ++a6;
        }
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
    }
}