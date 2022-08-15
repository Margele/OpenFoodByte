/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiChat
 *  org.lwjgl.opengl.Display
 */
package awsl;

import awsl.Class333;
import awsl.Class348;
import awsl.Class565;
import awsl.Class681;
import awsl.Class749;
import awsl.Class91;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import org.lwjgl.opengl.Display;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.TimeHelper;

public class Class379 {
    public float Field1806;
    public float Field1807;
    public Minecraft Field1808 = Minecraft.getMinecraft();
    public float Field1809;
    public float Field1810;
    public boolean Field1811 = false;
    public float Field1812;
    public String Field1813;
    public float Field1814;
    public float Field1815;
    public String Field1816;
    public boolean Field1817;
    public float Field1818;
    public float Field1819;
    public float Field1820;
    public float Field1821;
    public boolean Field1822 = false;
    public String Field1823;
    public float Field1824;
    public float Field1825;
    public boolean Field1826 = false;
    public long Field1827 = 0L;
    public boolean Field1828 = false;
    private boolean Field1829;
    public static TimeHelper Field1830;
    private static final Class333 Field1831;
    public static Color Field1832;
    public static Color Field1833;
    private static Class91[] Field1834;

    public static void Method450() {
        Field1832 = new Color(0, 0, 0, Field1831.Method1064());
        Field1833 = new Color(20, 20, 20, Field1831.Method1064());
    }

    public Class379(String a, float a2, float a3, float a4, float a5, String a6) {
        this(a, a2, a3, a4, a5, a6, "", 15.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class379(String a, float a2, float a3, float a4, float a5, String a6, String a7) {
        this(a, a2, a3, a4, a5, a6, a7, 15.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class379(String a, float a2, float a3, float a4, float a5, String a6, boolean a7, float a8, float a9) {
        this(a, a2, a3, a4, a5, a6, "", 15.0f, 0.0f, 0.0f, a7, a8, a9, 0.0f, 0.0f);
    }

    public Class379(String a, float a2, float a3, float a4, float a5, String a6, String a7, float a8, float a9, float a10) {
        this(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, false, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class379(String a, float a2, float a3, float a4, float a5, String a6, String a7, float a8, float a9, float a10, boolean a11, float a12, float a13, float a14, float a15) {
        this.Field1813 = a;
        this.Field1806 = a2;
        this.Field1807 = a3;
        this.Field1814 = a4;
        this.Field1815 = a5;
        this.Field1816 = a6;
        this.Field1823 = a7;
        this.Field1812 = a8;
        this.Field1824 = a9;
        this.Field1825 = a10;
        this.Field1817 = a11;
        this.Field1818 = a12;
        this.Field1819 = a13;
        this.Field1820 = a14;
        this.Field1821 = a15;
    }

    public void Method63() {
        Class91[] a = Class379.Method467();
        if (Class749.Method1587()) {
            Class379.Field1831.Field1617 = 153.0f;
            Field1830.Method214();
        }
        if (Field1830.Method211(200L)) {
            Class379.Field1831.Field1617 = 153.0f;
        }
        Field1831.Method1061(true);
        Class379.Method450();
        if (GlobalModule.Field3169.Method2509().booleanValue()) {
            Class348.Method364(this.Field1806, this.Field1807, this.Field1814, this.Field1815 + this.Field1812, true);
        }
        RenderUtils.Method1103(this.Field1806, this.Field1807, this.Field1814, this.Field1812, Class681.Method900(GlobalModule.Field3143.Method2442(), 0.6f));
        RenderUtils.Method1103(this.Field1806, this.Field1807 + this.Field1812, this.Field1814, this.Field1815, Field1833.getRGB());
        boolean a2 = !this.Field1823.isEmpty();
        Class565.Field2638.Method1217(this.Field1823, this.Field1806 + this.Field1824, this.Field1807 + this.Field1825, Class681.WHITE.Field2962);
        Class565.Field2636.Method1217(this.Field1816, this.Field1806 + 3.0f + (float)8, this.Field1807 + this.Field1812 / 2.0f - Class565.Field2636.Field2625 / 2.0f, Class681.WHITE.Field2962);
        if (this.Field1808.currentScreen instanceof GuiChat) {
            RenderUtils.Method1103(this.Field1806, this.Field1807, this.Field1814, this.Field1812, GlobalModule.Field3143.Method2442());
            Class565.Field2638.Method1217("P", this.Field1806 + this.Field1824, this.Field1807 + this.Field1825, Class681.WHITE.Field2962);
            Class565.Field2636.Method1217("Move", this.Field1806 + 12.0f, this.Field1807 + this.Field1812 / 2.0f - Class565.Field2636.Field2625 / 2.0f, Class681.WHITE.Field2962);
        }
        Class91.Method3647(new String[1]);
    }

    public void Method451() {
        if (this.Field1817 && this.Field1808.currentScreen instanceof GuiChat) {
            Class565.Field2639.Method1217("L", this.Field1806 + this.Field1814 - 8.0f, this.Field1807 + this.Field1812 + this.Field1815 - 8.0f, Class681.Method900(Class681.GREY.Field2962, 0.6f));
            if (this.Field1822) {
                String a = (int)this.Field1814 + ", " + (int)this.Field1815;
                RenderUtils.Method1104(this.Field1806 + this.Field1814 + 2.0f, this.Field1807 + this.Field1812 + this.Field1815 - 12.0f, this.Field1806 + this.Field1814 + 2.0f + Class565.Field2635.Method1225(a) + 4.0f, this.Field1807 + this.Field1812 + this.Field1815, -2013265920);
                Class565.Field2635.Method1217(a, this.Field1806 + this.Field1814 + 4.0f, this.Field1807 + this.Field1812 + this.Field1815 - 12.0f + 1.0f, Class681.WHITE.Field2962);
            }
        }
    }

    public void Method452() {
    }

    public void Method453(int a, int a2, int a3) {
        if (RenderUtils.Method1096(a, a2, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812) && !this.Field1822) {
            this.Field1811 = true;
            this.Field1827 = System.currentTimeMillis();
            this.Field1809 = (float)a - this.Field1806;
            this.Field1810 = (float)a2 - this.Field1807;
        }
        if (RenderUtils.Method1096(a, a2, this.Field1806 + this.Field1814 - 8.0f, this.Field1807 + this.Field1812 + this.Field1815 - 8.0f, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815) && this.Field1817 && !this.Field1811) {
            this.Field1822 = true;
            this.Field1827 = System.currentTimeMillis();
            this.Field1809 = a;
            this.Field1810 = a2;
        }
    }

    public void Method454(int a, int a2, int a3) {
        if (this.Field1811) {
            this.Field1811 = false;
        }
        if (this.Field1822) {
            this.Field1822 = false;
        }
    }

    public void Method64(int a, int a2) {
        if (this.Field1811) {
            this.Field1806 = (float)a - this.Field1809;
            this.Field1807 = (float)a2 - this.Field1810;
        }
        if (this.Field1822) {
            this.Field1814 += (float)a - this.Field1809;
            if (this.Field1814 < this.Field1818) {
                this.Field1814 = this.Field1818;
            } else {
                this.Field1809 = a;
            }
            this.Field1815 += (float)a2 - this.Field1810;
            if (this.Field1815 < this.Field1819) {
                this.Field1815 = this.Field1819;
            } else {
                this.Field1810 = a2;
            }
            if (!Display.isActive()) {
                this.Field1822 = false;
            }
        }
    }

    public void Method455(int a, int a2, int a3, long a4) {
    }

    public boolean Method456(int a, int a2, boolean a3) {
        boolean a4;
        boolean bl = false;
        Class91[] a5 = Class379.Method467();
        if (this.Method458(a, a2)) {
            if (!this.Field1829) {
                a4 = true;
            }
            boolean a6 = RenderUtils.Method1096(a, a2, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812);
            boolean a7 = RenderUtils.Method1096(a, a2, this.Field1806 + this.Field1814 - 8.0f, this.Field1807 + this.Field1812 + this.Field1815 - 8.0f, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815);
            if (!this.Field1829) {
                this.Field1811 = true;
                this.Field1827 = System.currentTimeMillis();
                this.Field1809 = (float)a - this.Field1806;
                this.Field1810 = (float)a2 - this.Field1807;
            }
            this.Field1811 = false;
            if (this.Field1817 && !this.Field1829) {
                this.Field1822 = true;
                this.Field1827 = System.currentTimeMillis();
                this.Field1809 = a;
                this.Field1810 = a2;
            }
            this.Field1822 = false;
        }
        if (this.Field1811) {
            this.Field1811 = false;
        }
        if (this.Field1822) {
            this.Field1822 = false;
        }
        this.Method457();
        this.Field1829 = a3;
        return a4;
    }

    public void Method457() {
        this.Field1811 = false;
        this.Field1822 = false;
    }

    public boolean Method458(int a, int a2) {
        return this.Method459(a, a2);
    }

    public boolean Method459(int a, int a2) {
        return MathUtils.Method549(a, a2, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1815 + this.Field1812);
    }

    public void Method460(float a, float a2) {
        this.Field1806 = a / 2.0f - this.Field1814 / 2.0f;
        this.Field1807 = a2 / 2.0f - this.Field1815 / 2.0f;
    }

    public void Method461() {
        this.Field1826 = true;
    }

    public void Method462() {
        this.Field1826 = false;
    }

    public boolean Method463(int a, int a2) {
        if (this.Field1822) {
            return RenderUtils.Method1096(a, a2, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815);
        }
        return this.Field1817 ? RenderUtils.Method1096(a, a2, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812) || RenderUtils.Method1096(a, a2, this.Field1806 + this.Field1814 - 8.0f, this.Field1807 + this.Field1812 + this.Field1815 - 8.0f, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815) : RenderUtils.Method1096(a, a2, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812);
    }

    public void Method464(boolean a) {
        this.Field1828 = a;
    }

    public boolean Method465() {
        return this.Field1828;
    }

    static {
        Class379.Method466(new Class91[5]);
        Field1830 = new TimeHelper();
        Field1831 = new Class333(50.0f, 0.085f);
        Field1831.Method1062(20.0f);
        Class379.Method450();
    }

    public static void Method466(Class91[] class91Array) {
        Field1834 = class91Array;
    }

    public static Class91[] Method467() {
        return Field1834;
    }
}