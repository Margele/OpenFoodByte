/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiChat
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
package awsl;

import awsl.Class379;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import obfuscate.a;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class352 {
    public static final ArrayList Field1690 = new ArrayList();
    public Minecraft Field1691 = Wrapper.INSTANCE.getMinecraft();
    public Class379 Field1692;
    public Class379 Field1693;
    private int Field1694;
    private int Field1695;

    public void Method69(Class379 a2) {
        Field1690.Method2530((Object)a2);
    }

    public void Method70() {
        if (this.Field1691.currentScreen instanceof GuiChat) {
            this.Method71();
        }
        this.Method72();
    }

    public void Method71() {
        this.Field1694 = (int)MathUtils.Method547(Mouse.getX(), 0.0f, Display.getWidth(), 0.0f, RenderUtils.Method1076());
        this.Field1695 = (int)MathUtils.Method547(Display.getHeight() - Mouse.getY(), 0.0f, Display.getHeight(), 0.0f, RenderUtils.Method1077());
        this.Field1692 = null;
        Iterator iterator = Field1690.Method1383();
        a[] a2 = Class379.Method467();
        if (iterator.Method932()) {
            Class379 a3 = (Class379)iterator.Method933();
            a3.Method64(this.Field1694, this.Field1695);
            if (!a3.Field1826) {
                if (!a3.Method456(this.Field1694, this.Field1695, Mouse.isButtonDown((int)0) || Mouse.isButtonDown((int)2))) {
                }
                this.Field1692 = a3;
            }
            a3.Method457();
        }
        if (this.Field1692 != null) {
            this.Method81(this.Field1692);
        }
        if (a.trash() == null) {
            Class379.Method466(new a[1]);
        }
    }

    public void Method72() {
        int a2 = Field1690.Method1799() - 1;
        while (true) {
            Class379 a3 = (Class379)Field1690.get(a2);
            if (!a3.Field1826) {
                a3.Method63();
                a3.Method451();
            }
            --a2;
        }
    }

    public void Method73() {
        Iterator iterator = Field1690.Method1383();
        while (iterator.Method932()) {
            Class379 a2 = (Class379)iterator.Method933();
            if (a2.Field1826) continue;
            a2.Method452();
        }
    }

    public void Method74(int a2, int a3) {
        int a4 = Mouse.getEventX() * a2 / this.Field1691.displayWidth;
        int a5 = a3 - Mouse.getEventY() * a3 / this.Field1691.displayHeight - 1;
        this.Method75(a4, a5);
    }

    public void Method75(int a2, int a3) {
        Class379 a4;
        this.Field1692 = null;
        int a5 = Field1690.Method1799() - 1;
        while (true) {
            a4 = (Class379)Field1690.get(a5);
            if (a4.Method463(a2, a3) && !a4.Field1826) break;
            --a5;
        }
        this.Field1692 = a4;
    }

    public void Method76(int a2, int a3, int a4) {
        this.Method80();
        if (this.Field1692 != null) {
            this.Field1692.Method453(a2, a3, a4);
        }
        this.Method83();
    }

    public void Method77(int a2, int a3, int a4, long a5) {
        if (this.Field1692 != null) {
            this.Field1692.Method455(a2, a3, a4, a5);
        }
    }

    public void Method78(int a2, int a3) {
        Iterator iterator = Field1690.Method1383();
        while (iterator.Method932()) {
            Class379 a4 = (Class379)iterator.Method933();
            if (a4.Field1826) continue;
            a4.Method64(a2, a3);
        }
    }

    public void Method79(int a2, int a3, int a4) {
        if (this.Field1692 != null) {
            this.Field1692.Method454(a2, a3, a4);
        }
    }

    public void Method80() {
        if (this.Field1692 == null && this.Field1693 != null) {
            this.Field1693.Method464(false);
            this.Field1693 = null;
            return;
        }
        if (this.Field1693 != this.Field1692) {
            if (this.Field1693 != null) {
                this.Field1693.Method464(false);
            }
            this.Field1693 = this.Field1692;
            this.Field1693.Method464(true);
        }
    }

    public void Method81(Class379 a2) {
        if (Field1690.remove((Object)a2)) {
            Field1690.add(0, (Object)a2);
        }
    }

    public static Class379 Method82(String a2) {
        Iterator iterator = Field1690.Method1383();
        while (iterator.Method932()) {
            Class379 a3 = (Class379)iterator.Method933();
            if (!a3.Field1813.equals((Object)a2)) continue;
            return a3;
        }
        return null;
    }

    public void Method83() {
        Field1690.sort(Comparator.comparingLong(Class352::Method84));
    }

    private static long Method84(Class379 a2) {
        return a2.Field1827;
    }
}