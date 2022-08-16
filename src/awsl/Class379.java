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
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import obfuscate.a;
import org.lwjgl.opengl.Display;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.PlayerUtils;
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
    private static a[] Field1834;

    public static void Method450() {
        Field1832 = new Color(0, 0, 0, Field1831.Method1064());
        Field1833 = new Color(20, 20, 20, Field1831.Method1064());
    }

    public Class379(String a2, float a3, float a4, float a5, float a6, String a7) {
        this(a2, a3, a4, a5, a6, a7, "", 15.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class379(String a2, float a3, float a4, float a5, float a6, String a7, String a8) {
        this(a2, a3, a4, a5, a6, a7, a8, 15.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class379(String a2, float a3, float a4, float a5, float a6, String a7, boolean a8, float a9, float a10) {
        this(a2, a3, a4, a5, a6, a7, "", 15.0f, 0.0f, 0.0f, a8, a9, a10, 0.0f, 0.0f);
    }

    public Class379(String a2, float a3, float a4, float a5, float a6, String a7, String a8, float a9, float a10, float a11) {
        this(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, false, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class379(String a2, float a3, float a4, float a5, float a6, String a7, String a8, float a9, float a10, float a11, boolean a12, float a13, float a14, float a15, float a16) {
        this.Field1813 = a2;
        this.Field1806 = a3;
        this.Field1807 = a4;
        this.Field1814 = a5;
        this.Field1815 = a6;
        this.Field1816 = a7;
        this.Field1823 = a8;
        this.Field1812 = a9;
        this.Field1824 = a10;
        this.Field1825 = a11;
        this.Field1817 = a12;
        this.Field1818 = a13;
        this.Field1819 = a14;
        this.Field1820 = a15;
        this.Field1821 = a16;
    }

    public void Method63() {
        a[] a2 = Class379.Method467();
        if (PlayerUtils.Method1587()) {
            Class379.Field1831.Field1617 = 153.0f;
            Field1830.reset();
        }
        if (Field1830.Method211(200L)) {
            Class379.Field1831.Field1617 = 153.0f;
        }
        Field1831.Method1061(true);
        Class379.Method450();
        if (GlobalModule.Field3169.getBooleanValue().booleanValue()) {
            Class348.Method364(this.Field1806, this.Field1807, this.Field1814, this.Field1815 + this.Field1812, true);
        }
        RenderUtils.Method1103(this.Field1806, this.Field1807, this.Field1814, this.Field1812, Class681.Method900(GlobalModule.Field3143.Method2442(), 0.6f));
        RenderUtils.Method1103(this.Field1806, this.Field1807 + this.Field1812, this.Field1814, this.Field1815, Field1833.getRGB());
        boolean a3 = !this.Field1823.isEmpty();
        Class565.Field2638.Method1217(this.Field1823, this.Field1806 + this.Field1824, this.Field1807 + this.Field1825, Class681.WHITE.Field2962);
        Class565.Field2636.Method1217(this.Field1816, this.Field1806 + 3.0f + (float)8, this.Field1807 + this.Field1812 / 2.0f - Class565.Field2636.Field2625 / 2.0f, Class681.WHITE.Field2962);
        if (this.Field1808.currentScreen instanceof GuiChat) {
            RenderUtils.Method1103(this.Field1806, this.Field1807, this.Field1814, this.Field1812, GlobalModule.Field3143.Method2442());
            Class565.Field2638.Method1217("P", this.Field1806 + this.Field1824, this.Field1807 + this.Field1825, Class681.WHITE.Field2962);
            Class565.Field2636.Method1217("Move", this.Field1806 + 12.0f, this.Field1807 + this.Field1812 / 2.0f - Class565.Field2636.Field2625 / 2.0f, Class681.WHITE.Field2962);
        }
        a.trash(new String[1]);
    }

    public void Method451() {
        if (this.Field1817 && this.Field1808.currentScreen instanceof GuiChat) {
            Class565.Field2639.Method1217("L", this.Field1806 + this.Field1814 - 8.0f, this.Field1807 + this.Field1812 + this.Field1815 - 8.0f, Class681.Method900(Class681.GREY.Field2962, 0.6f));
            if (this.Field1822) {
                String a2 = (int)this.Field1814 + ", " + (int)this.Field1815;
                RenderUtils.Method1104(this.Field1806 + this.Field1814 + 2.0f, this.Field1807 + this.Field1812 + this.Field1815 - 12.0f, this.Field1806 + this.Field1814 + 2.0f + Class565.Field2635.Method1225(a2) + 4.0f, this.Field1807 + this.Field1812 + this.Field1815, -2013265920);
                Class565.Field2635.Method1217(a2, this.Field1806 + this.Field1814 + 4.0f, this.Field1807 + this.Field1812 + this.Field1815 - 12.0f + 1.0f, Class681.WHITE.Field2962);
            }
        }
    }

    public void Method452() {
    }

    public void Method453(int a2, int a3, int a4) {
        if (RenderUtils.Method1096(a2, a3, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812) && !this.Field1822) {
            this.Field1811 = true;
            this.Field1827 = System.currentTimeMillis();
            this.Field1809 = (float)a2 - this.Field1806;
            this.Field1810 = (float)a3 - this.Field1807;
        }
        if (RenderUtils.Method1096(a2, a3, this.Field1806 + this.Field1814 - 8.0f, this.Field1807 + this.Field1812 + this.Field1815 - 8.0f, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815) && this.Field1817 && !this.Field1811) {
            this.Field1822 = true;
            this.Field1827 = System.currentTimeMillis();
            this.Field1809 = a2;
            this.Field1810 = a3;
        }
    }

    public void Method454(int a2, int a3, int a4) {
        if (this.Field1811) {
            this.Field1811 = false;
        }
        if (this.Field1822) {
            this.Field1822 = false;
        }
    }

    public void Method64(int a2, int a3) {
        if (this.Field1811) {
            this.Field1806 = (float)a2 - this.Field1809;
            this.Field1807 = (float)a3 - this.Field1810;
        }
        if (this.Field1822) {
            this.Field1814 += (float)a2 - this.Field1809;
            if (this.Field1814 < this.Field1818) {
                this.Field1814 = this.Field1818;
            } else {
                this.Field1809 = a2;
            }
            this.Field1815 += (float)a3 - this.Field1810;
            if (this.Field1815 < this.Field1819) {
                this.Field1815 = this.Field1819;
            } else {
                this.Field1810 = a3;
            }
            if (!Display.isActive()) {
                this.Field1822 = false;
            }
        }
    }

    public void Method455(int a2, int a3, int a4, long a5) {
    }

    public boolean Method456(int a2, int a3, boolean a4) {
        boolean a5;
        boolean bl = false;
        a[] a6 = Class379.Method467();
        if (this.Method458(a2, a3)) {
            if (!this.Field1829) {
                a5 = true;
            }
            boolean a7 = RenderUtils.Method1096(a2, a3, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812);
            boolean a8 = RenderUtils.Method1096(a2, a3, this.Field1806 + this.Field1814 - 8.0f, this.Field1807 + this.Field1812 + this.Field1815 - 8.0f, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815);
            if (!this.Field1829) {
                this.Field1811 = true;
                this.Field1827 = System.currentTimeMillis();
                this.Field1809 = (float)a2 - this.Field1806;
                this.Field1810 = (float)a3 - this.Field1807;
            }
            this.Field1811 = false;
            if (this.Field1817 && !this.Field1829) {
                this.Field1822 = true;
                this.Field1827 = System.currentTimeMillis();
                this.Field1809 = a2;
                this.Field1810 = a3;
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
        this.Field1829 = a4;
        return a5;
    }

    public void Method457() {
        this.Field1811 = false;
        this.Field1822 = false;
    }

    public boolean Method458(int a2, int a3) {
        return this.Method459(a2, a3);
    }

    public boolean Method459(int a2, int a3) {
        return MathUtils.isHovering(a2, a3, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1815 + this.Field1812);
    }

    public void Method460(float a2, float a3) {
        this.Field1806 = a2 / 2.0f - this.Field1814 / 2.0f;
        this.Field1807 = a3 / 2.0f - this.Field1815 / 2.0f;
    }

    public void Method461() {
        this.Field1826 = true;
    }

    public void Method462() {
        this.Field1826 = false;
    }

    public boolean Method463(int a2, int a3) {
        if (this.Field1822) {
            return RenderUtils.Method1096(a2, a3, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815);
        }
        return this.Field1817 ? RenderUtils.Method1096(a2, a3, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812) || RenderUtils.Method1096(a2, a3, this.Field1806 + this.Field1814 - 8.0f, this.Field1807 + this.Field1812 + this.Field1815 - 8.0f, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815) : RenderUtils.Method1096(a2, a3, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812);
    }

    public void Method464(boolean a2) {
        this.Field1828 = a2;
    }

    public boolean Method465() {
        return this.Field1828;
    }

    static {
        Class379.Method466(new a[5]);
        Field1830 = new TimeHelper();
        Field1831 = new Class333(50.0f, 0.085f);
        Field1831.Method1062(20.0f);
        Class379.Method450();
    }

    public static void Method466(a[] aArray) {
        Field1834 = aArray;
    }

    public static a[] Method467() {
        return Field1834;
    }
}