/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.input.Mouse
 */
package awsl;

import awsl.Class348;
import awsl.Class349;
import awsl.Class350;
import awsl.Class390;
import awsl.Class565;
import awsl.Class681;
import awsl.Class707;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class381 {
    private String Field1842;
    private String Field1843;
    private ArrayList Field1844 = new ArrayList();
    private boolean Field1845;
    private boolean Field1846;
    public boolean Field1847;
    private boolean Field1848;
    private boolean Field1849;
    public int Field1850;
    public int Field1851;
    public int Field1852;
    public int Field1853;
    private int Field1854;
    private int Field1855;
    private boolean Field1856;
    private int Field1857;
    private float Field1858;
    private boolean Field1859;
    private int Field1860;
    private boolean Field1861;
    private int Field1862;
    private Class349 Field1863 = new Class349(0.005);
    private Class349 Field1864 = new Class349(0.005);
    public Class349 Field1865 = new Class349(0.005);
    private boolean Field1866;
    private boolean Field1867;
    private boolean Field1868;
    public float Field1869;
    public float Field1870;
    public float Field1871;
    public float Field1872;
    public int Field1873 = 15;
    public int Field1874 = 80;
    public int Field1875 = 100;
    public int Field1876 = 15;
    public int Field1877 = 15;
    public int Field1878 = 2;
    public int Field1879 = 50;
    public int Field1880 = 180;
    public float Field1881 = -100.0f;
    private static String[] Field1882;

    public Class381(String a, int a2, int a3) {
        this.Field1842 = a;
        this.Field1843 = a;
        this.Field1850 = a2;
        this.Field1851 = a3;
        this.Field1852 = 80;
        this.Field1853 = 18;
    }

    public void Method1384() {
        Class390 a;
        int a2 = 0;
        int a3 = this.Field1876;
        Iterator iterator = this.Field1844.Method1383();
        while (iterator.Method932()) {
            a = (Class390)iterator.Method933();
            if (!a.Field1916) continue;
            a.Field1912 = a3;
            a3 += a.Field1910;
            a2 = Math.max((int)a2, (int)a.Field1909);
        }
        this.Field1852 = Math.max((int)this.Field1874, (int)a2);
        iterator = this.Field1844.Method1383();
        while (iterator.Method932()) {
            a = (Class390)iterator.Method933();
            if (!a.Field1916) continue;
            a.Field1909 = this.Field1852;
        }
        this.Field1853 = Math.min((int)this.Field1880, (int)a3);
        this.Field1860 = a3 - this.Field1876;
        if (this.Field1862 > this.Field1860 - (this.Field1880 - this.Field1876)) {
            this.Field1862 = this.Field1860 - (this.Field1880 - this.Field1876);
        }
        if (this.Field1862 < 0) {
            this.Field1862 = 0;
        }
    }

    public void Method1385(int a, int a2) {
        if (this.Method1408()) {
            this.Method1393();
        }
        if (this.Field1856) {
            this.Field1850 = a - this.Field1854;
            this.Field1851 = a2 - this.Field1855;
        }
        this.Field1859 = this.Field1860 + this.Field1876 > this.Field1880;
        Iterator iterator = this.Field1844.Method1383();
        while (iterator.Method932()) {
            Class390 a3 = (Class390)iterator.Method933();
            a3.Method419(a, a2);
            if (!a3.Field1916) continue;
            a3.Method411(a, a2);
        }
        this.Field1863.Method4(this.Field1847);
        this.Field1864.Method4(this.Field1846);
        if (this.Field1859 && this.Field1861) {
            this.Field1858 = MathUtils.Method547(a2 - this.Field1851, (float)(this.Field1876 + 3) + (float)this.Field1879 / 2.0f, (float)(this.Field1880 - 3) - (float)this.Field1879 / 2.0f, 0.0f, 1.0f);
            if (this.Field1858 > 1.0f) {
                this.Field1858 = 1.0f;
            }
            if (this.Field1858 < 0.0f) {
                this.Field1858 = 0.0f;
            }
            this.Field1862 = this.Field1857 = (int)(this.Field1858 * (float)(this.Field1860 - (this.Field1880 - this.Field1876)));
        }
        if (Math.abs((int)(this.Field1862 - this.Field1857)) < 4) {
            this.Field1857 = this.Field1862;
            this.Field1858 = (float)this.Field1857 / (float)(this.Field1860 - (this.Field1880 - this.Field1876));
        } else if (this.Field1857 > this.Field1862) {
            this.Field1857 -= 4;
            this.Field1858 = (float)this.Field1857 / (float)(this.Field1860 - (this.Field1880 - this.Field1876));
        } else if (this.Field1857 < this.Field1862) {
            this.Field1857 += 4;
            this.Field1858 = (float)this.Field1857 / (float)(this.Field1860 - (this.Field1880 - this.Field1876));
        }
    }

    public void Method1386(int a2, int a3) {
        float a4;
        float a5;
        float a6;
        String[] stringArray = Class381.Method1420();
        this.Field1865.Method4(this.Field1856);
        String[] a7 = stringArray;
        int a8 = this.Field1876;
        int a9 = this.Field1851 + a8;
        float a10 = (float)(this.Field1853 - a8) * (float)this.Field1863.Method6();
        int a11 = 18;
        Iterator iterator = this.Field1844.Method1383();
        while (iterator.Method932()) {
            Class390 a12 = (Class390)iterator.Method933();
            if (!a12.Field1916) continue;
            a11 += a12.Field1910;
            a.trash(new String[3]);
            break;
        }
        if (this.Field1859 || a11 > this.Field1880) {
            a11 = this.Field1880;
        }
        float a13 = (float)a8 + (float)((a11 >= this.Field1880 ? a11 + 1 : a11 - 1) - a8) * (float)this.Field1863.Method6();
        int a14 = 7 + (int)(5.0 * this.Field1865.Method6());
        Class350.Method48(this.Field1850, this.Field1851, this.Field1852, (int)a13, a14);
        RenderUtils.Method1103(this.Field1850, this.Field1851, this.Field1852, a8, Class707.Method1828());
        if (GlobalModule.INSTANCE.Field3190.Method1834()) {
            a6 = (float)this.Field1863.Method6() * 1.0f - 1.0f;
            float a15 = (float)(this.Field1851 + a8 / 2) + a6 * 2.0f;
            a5 = (float)(this.Field1851 + a8 / 2) - a6 * 2.0f;
            a4 = (float)(this.Field1851 + a8 / 2) + a6 * 2.0f;
            RenderUtils.Method1085(this.Field1850 + this.Field1852 - a8 + 5, a15, (float)(this.Field1850 + this.Field1852) - (float)a8 / 2.0f, a5, 1.5f, 0xFFFFFF);
            RenderUtils.Method1085((float)(this.Field1850 + this.Field1852) - (float)a8 / 2.0f, a5, this.Field1850 + this.Field1852 - 5, a4, 1.5f, 0xFFFFFF);
        }
        if (this.Field1867) {
            RenderUtils.Method1103(this.Field1850 + this.Field1852 - a8, this.Field1851, a8, a8, 0x20FFFFFF);
        }
        if (this.Field1845 && GlobalModule.INSTANCE.Field3190.Method1834()) {
            RenderUtils.Method1086(this.Field1850 + a8 / 2, this.Field1851 + a8 / 2, 3.0f, 1.5f, 0xFFFFFF);
            if (this.Field1864.Method6() > 0.0) {
                RenderUtils.Method1087(this.Field1850 + a8 / 2, this.Field1851 + a8 / 2, (float)this.Field1864.Method6() * 1.5f, 0xFFFFFF);
            }
            if (this.Field1866) {
                RenderUtils.Method1103(this.Field1850, this.Field1851, a8, a8, 0x20FFFFFF);
            }
        }
        Class565.Field2635.Method1222(this.Field1843, this.Field1850 + this.Field1852 / 2, this.Field1851 + a8 / 2 - 4, 0xFFFFFF);
        if (this.Field1863.Method6() > 0.0) {
            Class348.Method364(this.Field1850, a9, this.Field1852, a10, this.Field1863.Method6() > 0.0);
            RenderUtils.Method1103(this.Field1850, this.Field1851 + a8, this.Field1852, a10, Class707.Method1830());
            RenderUtils.Method1080(this.Field1850, a9, this.Field1850 + this.Field1852, (float)a9 + a10);
            this.Field1869 = this.Field1850;
            this.Field1870 = (float)this.Field1851 + (float)(this.Field1853 - this.Field1876) + (float)this.Field1876;
            this.Field1871 = this.Field1852;
            this.Field1872 = this.Field1853 - this.Field1876;
            a6 = 0.0f;
            if (this.Method1392(a2, a3)) {
                this.Field1881 = this.Field1880 - this.Field1876;
            }
            Iterator a15 = this.Field1844.Method1383();
            while (a15.Method932()) {
                Class390 a16 = (Class390)a15.Method933();
                if (!a16.Field1916) continue;
                a16.Method412(a2, a3);
                a6 += (float)a16.Field1910;
                break;
            }
            if (this.Method1392(a2, a3)) {
                this.Field1881 -= a6;
            }
            if (this.Field1859) {
                int a17 = this.Field1850 + this.Field1852 - 2;
                a4 = a5 = (float)(this.Field1880 - this.Field1876);
                float a18 = MathHelper.clamp_float((float)this.Field1858, (float)0.0f, (float)1.0f);
                float a19 = a4 / a6 * a4;
                float a20 = Math.max((float)a19, (float)20.0f);
                float a21 = a18 * (a4 - a20);
                int a22 = a9 + (int)MathUtils.Method547(this.Field1858, 0.0f, 1.0f, 1.5f, (float)((double)(a5 - 50.0f) - 0.5));
                RenderUtils.Method1103(a17, a9, 2.0f, a5, new Color(0, 0, 0, 70).getRGB());
                RenderUtils.Method1103((float)a17 + 0.5f, (float)a9 + a21, 1.0f, a20, this.Method1387(a2, a3) ? Class681.Method2699(Class707.Method1832(), 30) : Class707.Method1832());
            }
            RenderUtils.Method1082();
        }
    }

    private boolean Method1387(int a2, int a3) {
        return this.Field1859 && this.Method1392(a2, a3) && MathUtils.isHovering(a2, a3, this.Field1850 + this.Field1852 - 3, this.Field1851 + 18, this.Field1850 + this.Field1852, this.Field1851 + this.Field1853);
    }

    public boolean Method1388(int a2, int a3, boolean a4) {
        String[] a5 = Class381.Method1420();
        if (!this.Field1868 && this.Method1387(a2, a3)) {
            this.Field1861 = true;
        }
        this.Field1861 = false;
        boolean a6 = false;
        if (this.Method1392(a2, a3)) {
            int a7 = this.Field1876;
            this.Field1866 = this.Field1845 && MathUtils.isHovering(a2, a3, this.Field1850, this.Field1851, this.Field1850 + a7, this.Field1851 + a7);
            this.Field1867 = MathUtils.isHovering(a2, a3, this.Field1850 + this.Field1852 - a7, this.Field1851, this.Field1850 + this.Field1852, this.Field1851 + a7);
            if (!this.Field1868) {
                a6 = true;
            }
            if (this.Field1866 && !this.Field1868) {
                boolean bl = this.Field1846 = !this.Field1846;
            }
            if (this.Field1867 && !this.Field1868) {
                this.Field1847 = !this.Field1847;
            }
            boolean a8 = MathUtils.isHovering(a2, a3, this.Field1850, this.Field1851, this.Field1850 + this.Field1852, this.Field1851 + a7);
            if (!this.Field1866 && !this.Field1867) {
                if (!this.Field1868) {
                    this.Field1856 = true;
                    this.Field1854 = a2 - this.Field1850;
                    this.Field1855 = a3 - this.Field1851;
                }
            }
            this.Field1856 = false;
            if (this.Field1847) {
                Class390 a9;
                Iterator iterator = this.Field1844.Method1383();
                if (iterator.Method932()) {
                    a9 = (Class390)iterator.Method933();
                    if (!a9.Field1916) {
                    }
                    a9.Method413(a2, a3, a4);
                }
                if ((iterator = this.Field1844.Method1383()).Method932()) {
                    a9 = (Class390)iterator.Method933();
                    if (!a9.Field1916) {
                    }
                    a9.Method414();
                }
            }
        }
        if (this.Field1856) {
            this.Field1856 = false;
        }
        this.Method1394();
        this.Field1868 = a4;
        if (a.trash() == null) {
            Class381.Method1419(new String[3]);
        }
        return a6;
    }

    public void Method1389(int a2, int a3, boolean a4) {
        if (this.Method1392(a2, a3)) {
            int a5 = Mouse.getEventDWheel();
            a5 = -1;
            this.Field1862 += a5 * 18;
            if (this.Field1862 > this.Field1860 - (this.Field1880 - this.Field1876)) {
                this.Field1862 = this.Field1860 - (this.Field1880 - this.Field1876);
            }
            if (this.Field1862 < 0) {
                this.Field1862 = 0;
            }
        }
    }

    public void Method1390(char a2, int a3) throws IOException {
        if (this.Field1847) {
            Iterator iterator = this.Field1844.Method1383();
            while (iterator.Method932()) {
                Class390 a4 = (Class390)iterator.Method933();
                if (!a4.Field1916) continue;
                a4.Method1315(a2, a3);
            }
        }
    }

    public boolean Method1391(int a2, int a3) {
        return MathUtils.isHovering(a2, a3, this.Field1850, this.Field1851, this.Field1850 + this.Field1852, this.Field1851 + (this.Field1847 ? this.Field1853 : 18));
    }

    public boolean Method1392(int a2, int a3) {
        Iterator iterator = GlobalModule.INSTANCE.Field3190.Method1833().Method1383();
        while (iterator.Method932()) {
            Class381 a4 = (Class381)iterator.Method933();
            if (!a4.Field1848 || !a4.Method1391(a2, a3)) continue;
            return a4 == this;
        }
        return false;
    }

    public void Method1393() {
        this.Field1850 = Math.max((int)this.Field1850, (int)0);
        this.Field1851 = Math.max((int)this.Field1851, (int)0);
        this.Field1850 = Math.min((int)this.Field1850, (int)(RenderUtils.Method1076() - this.Field1852));
        this.Field1851 = Math.min((int)this.Field1851, (int)(RenderUtils.Method1077() - (this.Field1847 ? this.Field1853 : this.Field1877)));
    }

    public void Method1394() {
        this.Field1866 = false;
        this.Field1867 = false;
        this.Field1856 = false;
        if (this.Field1847) {
            Iterator iterator = this.Field1844.Method1383();
            while (iterator.Method932()) {
                Class390 a2 = (Class390)iterator.Method933();
                if (!a2.Field1916) continue;
                a2.Method414();
            }
        }
        if (!Mouse.isButtonDown((int)0)) {
            this.Field1861 = false;
        }
    }

    public String Method1395() {
        return this.Field1842;
    }

    public void Method1396(String a2) {
        this.Field1842 = a2;
    }

    public String Method1397() {
        return this.Field1843;
    }

    public void Method1398(String a2) {
        this.Field1843 = a2;
    }

    public ArrayList Method1399() {
        return this.Field1844;
    }

    public boolean Method1400() {
        return this.Field1845;
    }

    public void Method1401(boolean a2) {
        this.Field1845 = a2;
    }

    public boolean Method1402() {
        return this.Field1846;
    }

    public void Method1403(boolean a2) {
        this.Field1846 = a2;
    }

    public boolean Method1404() {
        return this.Field1847;
    }

    public void Method1405(boolean a2) {
        this.Field1847 = a2;
    }

    public boolean Method1406() {
        return this.Field1848;
    }

    public void Method1407(boolean a2) {
        this.Field1848 = a2;
    }

    public boolean Method1408() {
        return this.Field1849;
    }

    public void Method1409(boolean a2) {
        this.Field1849 = a2;
    }

    public int Method1410() {
        return this.Field1850;
    }

    public void Method1411(int a2) {
        this.Field1850 = a2;
    }

    public int Method1412() {
        return this.Field1851;
    }

    public void Method1413(int a2) {
        this.Field1851 = a2;
    }

    public int Method1414() {
        return this.Field1852;
    }

    public int Method1415() {
        return this.Field1853;
    }

    public void Method1416(int a2) {
        this.Field1853 = a2;
    }

    public int Method1417() {
        return this.Field1857;
    }

    public boolean Method1418() {
        return this.Field1859;
    }

    public static void Method1419(String[] stringArray) {
        Field1882 = stringArray;
    }

    public static String[] Method1420() {
        return Field1882;
    }

    private static IOException Method1421(IOException iOException) {
        return iOException;
    }

    static {
        if (Class381.Method1420() != null) {
            Class381.Method1419(new String[3]);
        }
    }
}