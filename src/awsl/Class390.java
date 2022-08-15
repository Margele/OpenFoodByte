/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.input.Mouse
 */
package awsl;

import awsl.Class381;
import awsl.Class565;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import trash.foodbyte.utils.MathUtils;

public abstract class Class390 {
    public int Field1907;
    public int Field1908;
    public int Field1909;
    public int Field1910;
    public int Field1911;
    public int Field1912;
    public String Field1913;
    public String Field1914;
    protected boolean Field1915;
    public boolean Field1916 = true;
    public boolean Field1917;
    protected boolean Field1918;
    public Class381 Field1919;
    public String Field1920 = "Component";
    public boolean Field1921 = true;
    public String Field1922 = "default";
    protected Minecraft Field1923 = Minecraft.getMinecraft();
    private static int Field1924;

    public Class390(Class381 a, int a2, int a3, String a4, String a5) {
        this.Field1919 = a;
        this.Field1911 = a2;
        this.Field1912 = a3;
        this.Field1913 = a4;
        this.Field1914 = a5;
    }

    protected void Method1309() {
        this.Field1907 = this.Field1919.Method1410() + this.Field1911;
        this.Field1908 = this.Field1919.Method1412() + this.Field1912 - this.Field1919.Method1417();
    }

    public int Method1310() {
        return this.Field1909 - (this.Field1919.Method1418() ? 0 : 0);
    }

    public boolean Method1311(int a, int a2) {
        return MathUtils.Method549(a, a2, this.Field1907, this.Field1908, this.Field1907 + this.Field1909 - (this.Field1919.Method1418() ? 2 : 0), this.Field1908 + this.Field1910);
    }

    public boolean Method1312(int a, int a2) {
        float a3 = this.Field1922.contains((CharSequence)"_setting") ? 3.0f : 3.0f;
        return MathUtils.Method549(a, a2, (float)this.Field1907 + a3, this.Field1908 + 7, (float)(this.Field1907 + this.Field1909) - a3 - (float)(this.Field1919.Method1418() ? 2 : 0), this.Field1908 + this.Field1910);
    }

    public boolean Method1313(int a, int a2) {
        float a3 = this.Field1922.contains((CharSequence)"_setting") ? 3.0f : 3.0f;
        return MathUtils.Method549(a, a2, (float)this.Field1907 + a3, this.Field1908, (float)this.Field1907 + Class565.Field2636.Method1225(this.Field1913) + 20.0f - (float)(this.Field1919.Method1418() ? 2 : 0), this.Field1908 + this.Field1910);
    }

    public boolean Method1314(int a, int a2) {
        float a3 = this.Field1922.contains((CharSequence)"_setting") ? 3.0f : 3.0f;
        return MathUtils.Method549(a, a2, (float)this.Field1907 + a3, this.Field1908 + 7, (float)(this.Field1907 + this.Field1909) - a3 - (float)(this.Field1919.Method1418() ? 2 : 0), this.Field1908 + 20);
    }

    public void Method414() {
        this.Field1915 = false;
        this.Field1918 = Mouse.isButtonDown((int)0);
    }

    public void Method419(int a, int a2) {
    }

    public void Method411(int a, int a2) {
        this.Method1309();
    }

    public abstract void Method412(int var1, int var2);

    public abstract void Method413(int var1, int var2, boolean var3);

    public void Method1315(char a, int a2) throws IOException {
    }

    public static void Method1316(int n) {
        Field1924 = n;
    }

    public static int Method1317() {
        return Field1924;
    }

    public static int Method1318() {
        int n = Class390.Method1317();
        return 51;
    }

    static {
        Class390.Method1316(26);
    }
}