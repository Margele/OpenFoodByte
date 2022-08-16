/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  net.minecraft.client.gui.GuiScreen
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
package awsl;

import awsl.Class348;
import awsl.Class350;
import awsl.Class374;
import awsl.Class375;
import awsl.Class376;
import awsl.Class381;
import awsl.Class382;
import awsl.Class384;
import awsl.Class385;
import awsl.Class386;
import awsl.Class387;
import awsl.Class390;
import awsl.Class395;
import awsl.Class396;
import awsl.Class446;
import awsl.Class447;
import awsl.Class565;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import trash.foodbyte.gui.AltLogin;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class707
extends GuiScreen {
    public static int Field3054;
    public static int Field3055;
    public final ArrayList Field3056 = new ArrayList();
    public boolean Field3057;
    public boolean Field3058;
    public String Field3059;
    public int Field3060;
    public int Field3061;
    private Class374 Field3062;
    private static int Field3063;

    public Class707() {
        this.Method1819();
    }

    public void Method1801() {
        this.Field3057 = true;
    }

    public void Method1803(int a2, int a3, float a4) {
        this.Method1814();
        this.Method1816();
        String a5 = "Tips: \u00a76\u9f20\u6807\u653e\u4e0a\u53bb\u6309\u4f4f\u5de6Shift\u5373\u53ef\u67e5\u770b\u8be5\u529f\u80fd\u7ffb\u8bd1";
        RenderUtils.Method1103(0.0f, RenderUtils.Method1077(), this.mc.fontRendererObj.getStringWidth(a5) + 1, -this.mc.fontRendererObj.FONT_HEIGHT - 1, new Color(0, 0, 0, 120).getRGB());
        this.mc.fontRendererObj.drawStringWithShadow(a5, 1.0f, (float)(RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT), -1);
        String a6 = "\u00a7cFoodByte \u00a7bBY-SuChen";
        RenderUtils.Method1103(0.0f, RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT - 1, Class565.Field2634.Method1225(a6) + 2.0f, -Class565.Field2634.Field2625, new Color(0, 0, 0, 120).getRGB());
        Class565.Field2634.Method1220(a6, 1.0f, (float)(RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT) - Class565.Field2634.Field2625, -1);
    }

    public void Method1814() {
        this.Field3059 = null;
        this.Field3060 = (int)MathUtils.Method547(Mouse.getX(), 0.0f, Display.getWidth(), 0.0f, RenderUtils.Method1076());
        this.Field3061 = (int)MathUtils.Method547(Display.getHeight() - Mouse.getY(), 0.0f, Display.getHeight(), 0.0f, RenderUtils.Method1077());
        if (this.Method1825() != null && this.Method1825().Method423(this.Field3060, this.Field3061) && this.Method1825().Method430()) {
            this.Field3058 = true;
        } else if (!Mouse.isButtonDown((int)0)) {
            this.Field3058 = false;
        }
        Field3055 = this.Field3057 ? -803200992 : -1340071904;
        Field3054 = this.Field3057 ? Class707.Method1832() : Class707.Method1832() - 0x50000000;
        Class381 a2 = null;
        Iterator iterator = this.Field3056.Method1383();
        while (iterator.Method932()) {
            Class381 a3 = (Class381)iterator.Method933();
            a3.Method1385(this.Field3060, this.Field3061);
            if (this.Field3057 && !this.Field3058) {
                if (!a3.Method1388(this.Field3060, this.Field3061, Mouse.isButtonDown((int)0) || Mouse.isButtonDown((int)1) || Mouse.isButtonDown((int)2))) continue;
                a2 = a3;
                continue;
            }
            a3.Method1394();
        }
        this.Method1818(a2);
        this.Method1817();
    }

    public void Method1816() {
        int a2 = this.Field3056.Method1799() - 1;
        while (true) {
            Class381 a3 = (Class381)this.Field3056.get(a2);
            if (a3.Method1406() && (this.Field3057 || a3.Method1400() && a3.Method1402())) {
                a3.Method1386(this.Field3060, this.Field3061);
            }
            --a2;
        }
    }

    public void Method1817() {
        ModuleManager.modules.forEach(Class707::Method1835);
    }

    public void Method1818(Class381 a2) {
        if (this.Field3056.remove((Object)a2)) {
            this.Field3056.add(0, (Object)a2);
        }
    }

    private void Method1819() {
        Class381 a2;
        Object a3;
        int n = Class707.Method1838();
        this.Field3056.clear();
        int a4 = 2;
        int a5 = n;
        int a6 = 12;
        Category[] a7 = Category.Method2760();
        int a8 = a7.length;
        int a222 = 0;
        if (a222 < a8) {
            a3 = a7[a222];
            if (ModuleManager.Method2299(a3) != 0) {
                a2 = new Class381(a3.Field2976, a4, a6);
                Iterator iterator = ModuleManager.getAllModules().Method1383();
                if (iterator.Method932()) {
                    Module a9 = (Module)iterator.Method933();
                    if (a9.Method1024() != a3) {
                    }
                    a2.Method1399().Method2530((Object)new Class385(a2, 0, 0, a9.getName(), a9, a9.getDescription()));
                    Class395 a10 = new Class395(a2, 0, 0, String.valueOf((Object)a9.getName()) + "_box");
                    a10.Field1922 = String.valueOf((Object)a9.getName()) + "_setting";
                    a2.Method1399().Method2530((Object)a10);
                    a2.Method1384();
                    if (a9.Method1031()) {
                        Class390 a11;
                        Class447 a12;
                        Iterator iterator2 = Class446.Method2766(a9.getName()).Method1383();
                        if (iterator2.Method932()) {
                            a12 = (Class447)iterator2.Method933();
                            if (a12 instanceof ModeValue) {
                                a11 = new Class387((ModeValue)a12, a2, 0, 0, a12.Method2753());
                                a11.Field1922 = String.valueOf((Object)a9.getName()) + "_setting";
                                a10.Method1344(a11);
                            }
                        }
                        if ((iterator2 = Class446.Method2766(a9.getName()).Method1383()).Method932()) {
                            a12 = (Class447)iterator2.Method933();
                            if (a12 instanceof FloatValue) {
                                a11 = new Class396((FloatValue)a12, a2, 0, 0, a12.Method2754(), a12.Method2753());
                                ((Class396)a11).Field1922 = String.valueOf((Object)a9.getName()) + "_setting";
                                a10.Method1344(a11);
                            }
                            if (a12 instanceof ColorValue) {
                                a11 = new Class374((ColorValue)a12, a2, 0, 0, a12.Method2754(), a12.Method2753());
                                ((Class374)a11).Field1922 = String.valueOf((Object)a9.getName()) + "_setting";
                                a10.Method1344(a11);
                            }
                        }
                        if ((iterator2 = Class446.Method2766(a9.getName()).Method1383()).Method932()) {
                            a12 = (Class447)iterator2.Method933();
                            if (a12 instanceof BooleanValue) {
                                a11 = new Class382((BooleanValue)a12, a2, 0, 0, a12.Method2754(), a12.Method2753());
                                ((Class382)a11).Field1922 = String.valueOf((Object)a9.getName()) + "_setting";
                                a10.Method1344(a11);
                            }
                        }
                    }
                }
                a2.Method1407(true);
                a2.Method1405(true);
                a2.Method1384();
                this.Field3056.Method2530((Object)a2);
                a4 += a2.Method1414() + 5;
            }
            ++a222;
        }
        if ((a222 = Class446.Method2766((a = new Class381("Global", a4, a6)).Method1395()).Method1383()).Method932()) {
            a3 = (Class447)a222.Method933();
            if (a3 instanceof ModeValue) {
                a.Method1399().Method2530((Object)new Class387((ModeValue)a3, a, 0, 0, ((Class447)a3).Method2753()));
            }
        }
        if ((a222 = Class446.Method2766(a.Method1395()).Method1383()).Method932()) {
            a3 = (Class447)a222.Method933();
            if (a3 instanceof FloatValue) {
                a.Method1399().Method2530((Object)new Class396((FloatValue)a3, a, 0, 0, ((Class447)a3).Method2754(), ((Class447)a3).Method2753()));
            }
            if (a3 instanceof ColorValue) {
                a.Method1399().Method2530((Object)new Class374((ColorValue)a3, a, 0, 0, ((Class447)a3).Method2754(), ((Class447)a3).Method2753()));
            }
        }
        if ((a222 = Class446.Method2766(a.Method1395()).Method1383()).Method932()) {
            a3 = (Class447)a222.Method933();
            if (a3 instanceof BooleanValue) {
                a.Method1399().Method2530((Object)new Class382((BooleanValue)a3, a, 0, 0, ((Class447)a3).Method2754(), ((Class447)a3).Method2753()));
            }
        }
        a.Method1407(true);
        a.Method1405(true);
        a.Method1384();
        this.Field3056.Method2530((Object)a);
        Object a222 = new Class381("Config", a4 += a.Method1414() + 5, a6);
        ((Class381)a222).Method1399().Method2530((Object)new Class375((Class381)a222, 0, 0, null));
        ((Class381)a222).Method1407(true);
        ((Class381)a222).Method1405(true);
        ((Class381)a222).Method1384();
        this.Field3056.Method2530(a222);
        a3 = new Class381("IRC", a4 += ((Class381)a222).Method1414() + 5, a6);
        ((Class381)a3).Method1399().Method2530((Object)new Class386((Class381)a3, 0, 0, null));
        ((Class381)a3).Method1407(false);
        ((Class381)a3).Method1405(true);
        ((Class381)a3).Method1384();
        this.Field3056.Method2530(a3);
        a2 = new Class381("Gui Option", 2, a6 + 188);
        a2.Method1399().Method2530((Object)new Class384(a2, 0, 36, "Xray Select", new AltLogin(this)));
        a2.Method1407(true);
        a2.Method1405(true);
        a2.Method1384();
        Class381 a13 = new Class381("Player Inventory", 2, 194);
        a13.Method1399().Method2530((Object)new Class376(a13, 0, 0));
        a13.Method1407(true);
        a13.Method1409(true);
        a13.Method1405(true);
        a13.Method1401(true);
        a13.Method1384();
    }

    public void Method1820(List a2, int a3, int a4) {
        if (!a2.isEmpty()) {
            int a5;
            int a6 = 0;
            Iterator iterator = a2.Method1383();
            while (iterator.Method932()) {
                String a7 = (String)iterator.Method933();
                a5 = this.fontRendererObj.getStringWidth(a7);
                if (a5 <= a6) continue;
                a6 = a5;
            }
            int a8 = a3 + 12;
            int a9 = a4 - 12;
            a5 = 8;
            if (a2.Method1799() > 1) {
                a5 += 2 + (a2.Method1799() - 1) * 10;
            }
            if (a8 + a6 > this.width) {
                a8 -= 28 + a6;
            }
            if (a9 + a5 + 6 > this.height) {
                a9 = this.height - a5 - 6;
            }
            Class350.Method48(a8 - 3, a9 - 3, a6 + 6, a5 + 6, 7);
            RenderUtils.Method1104(a8 - 3, a9 - 3, a8 + a6 + 3, a9 + a5 + 3, Integer.MIN_VALUE);
            Class348.Method364(a8 - 3, a9 - 3, a6 + 6, a5 + 6, true);
            for (int a10 = 0; a10 < a2.Method1799(); ++a10) {
                String a11 = (String)a2.get(a10);
                this.fontRendererObj.drawStringWithShadow(a11, (float)a8, (float)a9, -1);
                a9 += 2;
                a9 += 10;
            }
        }
    }

    public void Method1821() throws IOException {
        if (Mouse.isCreated()) {
            while (Mouse.next()) {
                this.Method1822();
            }
        }
        if (Keyboard.isCreated()) {
            while (Keyboard.next()) {
                this.handleKeyboardInput();
            }
        }
    }

    public void Method1822() throws IOException {
        if (this.Field3057 && Mouse.getEventDWheel() != 0) {
            Iterator iterator = this.Field3056.Method1383();
            while (iterator.Method932()) {
                Class381 a2 = (Class381)iterator.Method933();
                a2.Method1389(this.Field3060, this.Field3061, Mouse.isButtonDown((int)0));
            }
            if (this.Method1825() != null) {
                this.Method1824(null);
            }
        }
        super.Method1822();
    }

    public void Method1804(char a2, int a3) throws IOException {
        super.Method1804(a2, a3);
        if (this.Field3057) {
            Iterator iterator = this.Field3056.Method1383();
            while (iterator.Method932()) {
                Class381 a4 = (Class381)iterator.Method933();
                a4.Method1390(a2, a3);
            }
        }
    }

    public void Method1806() {
        this.Field3057 = false;
        GlobalModule.INSTANCE.fileManager.saveFoodByteClickGui();
    }

    public boolean Method1812() {
        return false;
    }

    public void Method1805(int a2, int a3, int a4) throws IOException {
        block1: {
            super.Method1805(a2, a3, a4);
            if (this.Method1825() != null && !this.Method1825().Method423(a2, a3) && !this.Method1825().Method420()) {
                this.Method1824(null);
            }
            if (this.Method1825() == null) break block1;
            this.Method1825().Method424(a2, a3);
        }
    }

    protected void Method1823(int a2, int a3, int a4, long a5) {
    }

    protected void Method1811(int a2, int a3, int a4) {
        if (this.Method1825() != null) {
            this.Method1825().Method425();
        }
    }

    public void Method1824(Class374 a2) {
        this.Field3062 = a2;
    }

    public Class374 Method1825() {
        return this.Field3062;
    }

    public void Method1826(String a2, boolean a3) {
        Iterator iterator = this.Field3056.Method1383();
        while (iterator.Method932()) {
            Class381 a4 = (Class381)iterator.Method933();
            Iterator iterator2 = a4.Method1399().Method1383();
            while (iterator2.Method932()) {
                Class390 a5 = (Class390)iterator2.Method933();
                if (!a5.Field1922.equals((Object)a2) || !(a5 instanceof Class395)) continue;
                ((Class395)a5).Method1345(a3);
            }
            a4.Method1384();
        }
    }

    public boolean Method1827(String a2) {
        Iterator iterator = this.Field3056.Method1383();
        while (iterator.Method932()) {
            Class381 a3 = (Class381)iterator.Method933();
            Iterator iterator2 = a3.Method1399().Method1383();
            while (iterator2.Method932()) {
                Class390 a4 = (Class390)iterator2.Method933();
                if (!a4.Field1922.equals((Object)a2) || !(a4 instanceof Class395) || !((Class395)a4).Method420()) continue;
                return true;
            }
        }
        return false;
    }

    public static int Method1828() {
        return Field3054;
    }

    public static int Method1829() {
        return Field3055;
    }

    public static int Method1830() {
        if (GlobalModule.Field3169.getValue()) {
            return new Color(0, 0, 0, 120).getRGB();
        }
        return new Color(24, 24, 24, 80).getRGB();
    }

    public static int Method1831() {
        return new Color(0, 153, 255, 120).getRGB();
    }

    public static int Method1832() {
        return GlobalModule.Field3143.Method2442();
    }

    public ArrayList Method1833() {
        return this.Field3056;
    }

    public boolean Method1834() {
        return this.Field3057;
    }

    public void Method1808(String a2) {
        this.Field3059 = a2;
    }

    private static void Method1835(Module a2) {
        a2.idk();
    }

    public static void Method1836(int n) {
        Field3063 = n;
    }

    public static int Method1837() {
        return Field3063;
    }

    public static int Method1838() {
        int n = Class707.Method1837();
        return 85;
    }

    private static IOException Method1815(IOException iOException) {
        return iOException;
    }

    static {
        Class707.Method1836(61);
    }
}