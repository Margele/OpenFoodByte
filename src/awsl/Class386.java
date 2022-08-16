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
    public void Method411(int a2, int a3) {
        super.Method411(a2, a3);
        int n = Class390.Method1317();
        this.Field1919.Method1398("IRC - " + GlobalModule.INSTANCE.Field3186.Field2823.Method1799());
        int a4 = n;
        float a5 = 0.0f;
        int a6 = 0;
        if (a6 < GlobalModule.INSTANCE.Field3186.Field2823.Method1799()) {
            Class606 a7 = (Class606)GlobalModule.INSTANCE.Field3186.Field2823.get(a6);
            StringBuilder stringBuilder = new StringBuilder();
            if (Class565.Field2636.Method1225(stringBuilder.append(a7.Method3737()).append(a7.Method3739()).toString()) > a5) {
                a5 = Class565.Field2636.Method1225(a7.Method3737() + a7.Method3739());
            }
            ++a6;
        }
        if (a5 + 6.0f >= (float)this.Field1909) {
            this.Field1909 = (int)a5 + 6;
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
    public void Method412(int a2, int a3) {
        void a4;
        float f = this.Field1907 + 2;
        float a5 = this.Field1908 + 2;
        float f2 = 2.0f;
        int a6 = Class390.Method1318();
        RenderUtils.Method1103((float)this.Field1907 + a4, a5, (float)this.Field1909 - a4 * 2.0f, this.Field1910 - 4, new Color(255, 255, 255, 40).getRGB());
        int a7 = 0;
        if (a7 < GlobalModule.INSTANCE.Field3186.Field2823.Method1799()) {
            void a8;
            Class606 a9 = (Class606)GlobalModule.INSTANCE.Field3186.Field2823.get(a7);
            if ((float)a2 >= a8 + 0.5f && (float)a2 <= (float)(this.Field1907 + this.Field1909) - a4 * 2.0f - 1.0f && (float)a3 >= a5 + 0.5f && (float)a3 < a5 + Class565.Field2636.Field2625 + 3.0f) {
                this.Field1892 = a7;
                GlobalModule.INSTANCE.Field3190.Method1808(a9.Method3736() + a9.Method3737() + a9.Method3739() + "\n\u5728\u7ebf\u65f6\u95f4 - " + a9.Method3742(System.currentTimeMillis() - a9.Field2844) + "\n\u6e38\u620fID - " + a9.Field2842 + "\n\u533f\u540dID - " + a9.Field2841 + "\n\u6b63\u5728\u73a9 - " + a9.Field2849 + "\n" + a9.Field2850 + "\n\u5f00\u5c40 " + a9.Method3742(System.currentTimeMillis() - a9.Field2851) + "\n\u9690\u8eab - " + (a9.Field2847 ? "\u5f00\u542f" : "\u5173\u95ed") + "\nIRC\u670b\u53cb - " + (a9.Field2848 ? "\u5f00\u542f" : "\u5173\u95ed") + "\n");
                RenderUtils.Method1103((float)(a8 + 0.5f), a5 + 0.5f, (float)this.Field1909 - a4 * 2.0f - 1.0f, Class565.Field2636.Method1227(a9.Method3737() + a9.Method3739()) + 1.0f, Class681.Method900(Class707.Method1828(), 0.5f));
            }
            Class565.Field2636.Method1217(a9.Method3737() + a9.Method3739(), (float)(a8 + 1.0f), a5 + 1.0f, new Color(0xD5D5D5).getRGB());
            a5 += Class565.Field2636.Method1227(a9.Method3737() + a9.Method3739()) + 2.0f;
            ++a7;
        }
    }

    @Override
    public void Method413(int a2, int a3, boolean a4) {
    }
}