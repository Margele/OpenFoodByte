/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class344;
import awsl.Class381;
import awsl.Class390;
import awsl.Class565;
import awsl.Class707;
import java.awt.Color;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class388
extends Class390 {
    private boolean Field1898;
    public String Field1899;
    public ModeValue Field1900;
    public int Field1901;
    public int Field1902;
    private Class344 Field1903 = new Class344(15);

    public Class388(ModeValue a, Class381 a2, int a3, int a4) {
        super(a2, a3, a4, a.Method2754(), null);
        this.Field1900 = a;
        this.Field1902 = 8;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a2.Method1414());
        this.Field1910 = 12 + 12 * this.Field1900.Method2728().length;
        this.Field1920 = "ComboBox";
    }

    @Override
    public void Method419(int a, int a2) {
        this.Field1916 = !this.Field1900.Method2756();
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a);
        this.Field1901 = -1;
        this.Field1903.Method290(true);
        this.Field1919.Method1384();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method412(int a, int a2) {
        void a3;
        int n = Class390.Method1318();
        Class565.Field2636.Method1217(this.Field1913, this.Field1907 + 5, (float)this.Field1908 + 1.0f, 0xFFFFFF);
        boolean bl = false;
        int a4 = n;
        if (a3 < this.Field1900.Method2728().length) {
            float a5 = this.Field1908 + this.Field1902 + 12 * a3;
            int a6 = this.Field1901 == a3 ? Class707.Method1831() : Class707.Method1832();
            Class565.Field2636.Method1217(this.Field1900.Method2728()[a3], this.Field1907 + 13 + 2, a5 + 4.5f, 0xFFFFFF);
            RenderUtils.Method1103(this.Field1907 + 5, a5 + 5.0f, 6.5f, 6.5f, a6);
            if (this.Field1900.isCurrentMode(this.Field1900.Method2728()[a3]) && this.Field1903.Method292() > 0.0) {
                RenderUtils.Method1103((float)this.Field1907 + 6.0f, a5 + 6.0f, 4.5f, 4.5f, new Color(255, 255, 255, (int)(255.0 * this.Field1903.Method292())).getRGB());
            }
            ++a3;
        }
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
        boolean bl = this.Field1915 = this.Method1311(a, a2) && this.Field1919.Method1392(a, a2);
        if (!this.Field1915) {
            this.Field1901 = -1;
            return;
        }
        this.Field1901 = this.Method1442(a, a2);
        if (!this.Field1918 && this.Field1915 && this.Field1901 != -1 && !this.Field1900.getMode().equals((Object)this.Field1900.Method2728()[this.Field1901])) {
            this.Field1900.Method2725(this.Field1900.Method2728()[this.Field1901]);
            this.Field1903.Method291();
        }
        this.Field1918 = a3;
    }

    /*
     * WARNING - void declaration
     */
    private int Method1442(int a, int a2) {
        void a3;
        int n = a2 - this.Field1908 - this.Field1902;
        int a4 = Class390.Method1317();
        int a5 = 0;
        void a6 = a3;
        if (a6 > 12) {
            ++a5;
            a6 -= 12;
        }
        if (a5 >= this.Field1900.Method2728().length) {
            return this.Field1901;
        }
        return a5;
    }
}