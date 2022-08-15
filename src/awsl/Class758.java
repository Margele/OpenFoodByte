/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Cloneable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 */
package awsl;

import awsl.Class193;
import awsl.Class759;
import awsl.Class767;
import awsl.Class776;
import java.awt.Color;

public class Class758
extends Class759
implements Cloneable {
    public static final int Field3318 = 0;
    public static final int Field3319 = 1;
    public static final int Field3320 = 2;
    public static final int Field3321 = 16;
    public static final int Field3322 = 32;
    public static final int Field3323 = 48;
    public static final int Field3324 = 64;
    public static final int Field3325 = 80;
    private static final int Field3326 = 3;
    private static final int Field3327 = 112;
    private int Field3328 = 4;
    private int[] Field3329 = new int[]{-1, 0, 255, 256};
    private int[] Field3330 = new int[]{-16777216, -16777216, -1, -1};
    private byte[] Field3331 = new byte[]{32, 32, 32, 32};

    public Class758() {
        this.Method89();
    }

    public Class758(int[] a) {
        this(null, a, null);
    }

    public Class758(int[] a, int[] a2) {
        this(a, a2, null);
    }

    public Class758(int[] a, int[] a2, byte[] a3) {
        this.Method1751(a, a2, a3);
    }

    @Override
    public Object Method878() {
        Class758 a = (Class758)super.Method878();
        a.Field3332 = (int[])this.Field3332.clone();
        a.Field3329 = (int[])this.Field3329.clone();
        a.Field3330 = (int[])this.Field3330.clone();
        a.Field3331 = (byte[])this.Field3331.clone();
        return a;
    }

    public void Method1748(Class758 a) {
        a.Field3328 = this.Field3328;
        a.Field3332 = (int[])this.Field3332.clone();
        a.Field3329 = (int[])this.Field3329.clone();
        a.Field3330 = (int[])this.Field3330.clone();
        a.Field3331 = (byte[])this.Field3331.clone();
    }

    @Override
    public void Method17(int a, int a2) {
        int a3;
        int a4 = this.Field3332[0];
        int a5 = this.Field3332[255];
        for (a3 = 0; a3 < a; ++a3) {
            this.Field3332[a3] = Class776.Method1719((float)a3 / (float)a, a4, a2);
        }
        if (a < 255) {
            for (a3 = a; a3 < 256; ++a3) {
                this.Field3332[a3] = Class776.Method1719((float)(a3 - a) / (float)(256 - a), a2, a5);
            }
        }
    }

    public int Method10() {
        return this.Field3328;
    }

    public void Method1619(int a, int a2) {
        this.Field3330[a] = a2;
        this.Method89();
    }

    public int Method1612(int a) {
        return this.Field3330[a];
    }

    public void Method1620(int a, int a2) {
        this.Field3331[a] = (byte)(this.Field3331[a] & 0xFFFFFFFC | a2);
        this.Method89();
    }

    public int Method1613(int a) {
        return (byte)(this.Field3331[a] & 3);
    }

    public void Method1621(int a, int a2) {
        this.Field3331[a] = (byte)(this.Field3331[a] & 0xFFFFFF8F | a2);
        this.Method89();
    }

    public byte Method1749(int a) {
        return (byte)(this.Field3331[a] & 0x70);
    }

    public void Method1750(int a, int a2, int a3) {
        int[] a4 = new int[this.Field3328 + 1];
        int[] a5 = new int[this.Field3328 + 1];
        byte[] a6 = new byte[this.Field3328 + 1];
        System.arraycopy((Object)this.Field3329, (int)0, (Object)a4, (int)0, (int)this.Field3328);
        System.arraycopy((Object)this.Field3330, (int)0, (Object)a5, (int)0, (int)this.Field3328);
        System.arraycopy((Object)this.Field3331, (int)0, (Object)a6, (int)0, (int)this.Field3328);
        this.Field3329 = a4;
        this.Field3330 = a5;
        this.Field3331 = a6;
        this.Field3329[this.Field3328] = this.Field3329[this.Field3328 - 1];
        this.Field3330[this.Field3328] = this.Field3330[this.Field3328 - 1];
        this.Field3331[this.Field3328] = this.Field3331[this.Field3328 - 1];
        this.Field3329[this.Field3328 - 1] = a;
        this.Field3330[this.Field3328 - 1] = a2;
        this.Field3331[this.Field3328 - 1] = (byte)a3;
        ++this.Field3328;
        this.Method1622();
        this.Method89();
    }

    public void Method9(int a) {
        if (this.Field3328 <= 4) {
            return;
        }
        if (a < this.Field3328 - 1) {
            System.arraycopy((Object)this.Field3329, (int)(a + 1), (Object)this.Field3329, (int)a, (int)(this.Field3328 - a - 1));
            System.arraycopy((Object)this.Field3330, (int)(a + 1), (Object)this.Field3330, (int)a, (int)(this.Field3328 - a - 1));
            System.arraycopy((Object)this.Field3331, (int)(a + 1), (Object)this.Field3331, (int)a, (int)(this.Field3328 - a - 1));
        }
        --this.Field3328;
        if (this.Field3329[1] > 0) {
            this.Field3329[1] = 0;
        }
        this.Method89();
    }

    public void Method1751(int[] a, int[] a2, byte[] a3) {
        this.Field3328 = a2.length + 2;
        this.Field3329 = new int[this.Field3328];
        this.Field3330 = new int[this.Field3328];
        this.Field3331 = new byte[this.Field3328];
        System.arraycopy((Object)a, (int)0, (Object)this.Field3329, (int)1, (int)(this.Field3328 - 2));
        System.arraycopy((Object)a2, (int)0, (Object)this.Field3330, (int)1, (int)(this.Field3328 - 2));
        System.arraycopy((Object)a3, (int)0, (Object)this.Field3331, (int)1, (int)(this.Field3328 - 2));
        this.Method1622();
        this.Method89();
    }

    public void Method1752(int[] a, int[] a2, byte[] a3, int a4, int a5) {
        this.Field3328 = a5;
        this.Field3329 = new int[this.Field3328];
        this.Field3330 = new int[this.Field3328];
        this.Field3331 = new byte[this.Field3328];
        System.arraycopy((Object)a, (int)a4, (Object)this.Field3329, (int)0, (int)this.Field3328);
        System.arraycopy((Object)a2, (int)a4, (Object)this.Field3330, (int)0, (int)this.Field3328);
        System.arraycopy((Object)a3, (int)a4, (Object)this.Field3331, (int)0, (int)this.Field3328);
        this.Method1622();
        this.Method89();
    }

    public void Method11(int a) {
        int a2 = (this.Field3329[a] + this.Field3329[a + 1]) / 2;
        this.Method1750(a2, this.Method283((float)a2 / 256.0f), this.Field3331[a]);
        this.Method89();
    }

    public void Method1753(int a, int a2) {
        this.Field3329[a] = Class776.Method1712(a2, 0, 255);
        this.Method1622();
        this.Method89();
    }

    public int Method1754(int a) {
        return this.Field3329[a];
    }

    public int Method1755(int a) {
        for (int a2 = 1; a2 < this.Field3328 - 1; ++a2) {
            if (this.Field3329[a2 + 1] <= a) continue;
            return a2;
        }
        return 1;
    }

    /*
     * Unable to fully structure code
     */
    private void Method89() {
        block16: {
            block17: {
                block18: {
                    this.Field3329[0] = -1;
                    this.Field3329[this.Field3328 - 1] = 256;
                    this.Field3330[0] = this.Field3330[1];
                    this.Field3330[this.Field3328 - 1] = this.Field3330[this.Field3328 - 2];
                    a = false;
                    a = 1;
                    a = Class193.Method1269();
                    if (a >= this.Field3328 - 1) break block16;
                    a = this.Field3329[a + 1] - this.Field3329[a];
                    a = this.Field3329[a + 1];
                    if (a == this.Field3328 - 2) {
                        ++a;
                    }
                    if ((a = this.Field3329[a]) >= a) break block17;
                    a = this.Field3330[a];
                    a = this.Field3330[a + 1];
                    a = Color.RGBtoHSB((int)(a >> 16 & 255), (int)(a >> 8 & 255), (int)(a & 255), null);
                    a = Color.RGBtoHSB((int)(a >> 16 & 255), (int)(a >> 8 & 255), (int)(a & 255), null);
                    a = (float)(a - this.Field3329[a]) / a;
                    a = this.Method1613(a);
                    a = this.Method1749(a);
                    if (a > 255) break block18;
                    switch (a) {
                        case 80: {
                            a = 0.0f;
                        }
                        case 16: {
                        }
                        case 32: {
                            a = Class776.Method1708(0.15f, 0.85f, a);
                        }
                        case 48: {
                            a -= 1.0f;
                            a = (float)Math.sqrt((double)(1.0f - a * a));
                        }
                        case 64: {
                            a = 1.0f - (float)Math.sqrt((double)(1.0f - a * a));
                        }
                    }
                    switch (a) {
                        case 0: {
                            this.Field3332[a] = Class776.Method1719(a, a, a);
                        }
                        case 1: 
                        case 2: {
                            if (a != 1) ** GOTO lbl47
                            if (!(a[0] <= a[0])) ** GOTO lbl49
                            a[0] = a[0] + 1.0f;
lbl47:
                            // 2 sources

                            if (a[0] <= a[1]) {
                                a[0] = a[0] + 1.0f;
                            }
lbl49:
                            // 4 sources

                            a = Class776.Method1717(a, a[0], a[0]) % 6.2831855f;
                            a = Class776.Method1717(a, a[1], a[1]);
                            a = Class776.Method1717(a, a[2], a[2]);
                            this.Field3332[a] = -16777216 | Color.HSBtoRGB((float)a, (float)a, (float)a);
                        }
                    }
                }
                ++a;
            }
            ++a;
        }
    }

    private void Method1622() {
        for (int a = 1; a < this.Field3328 - 1; ++a) {
            for (int a2 = 1; a2 < a; ++a2) {
                if (this.Field3329[a] >= this.Field3329[a2]) continue;
                int a3 = this.Field3329[a];
                this.Field3329[a] = this.Field3329[a2];
                this.Field3329[a2] = a3;
                a3 = this.Field3330[a];
                this.Field3330[a] = this.Field3330[a2];
                this.Field3330[a2] = a3;
                byte a4 = this.Field3331[a];
                this.Field3331[a] = this.Field3331[a2];
                this.Field3331[a2] = a4;
            }
        }
    }

    private void Method1756() {
        this.Method1622();
        this.Method89();
    }

    public void Method1757() {
        this.Field3328 = 4 + (int)(6.0 * Math.random());
        this.Field3329 = new int[this.Field3328];
        this.Field3330 = new int[this.Field3328];
        this.Field3331 = new byte[this.Field3328];
        for (int a = 0; a < this.Field3328; ++a) {
            this.Field3329[a] = (int)(255.0 * Math.random());
            this.Field3330[a] = 0xFF000000 | (int)(255.0 * Math.random()) << 16 | (int)(255.0 * Math.random()) << 8 | (int)(255.0 * Math.random());
            this.Field3331[a] = 32;
        }
        this.Field3329[0] = -1;
        this.Field3329[1] = 0;
        this.Field3329[this.Field3328 - 2] = 255;
        this.Field3329[this.Field3328 - 1] = 256;
        this.Method1622();
        this.Method89();
    }

    public void Method56(float a) {
        for (int a2 = 0; a2 < this.Field3328; ++a2) {
            int a3 = this.Field3330[a2];
            int a4 = a3 >> 16 & 0xFF;
            int a5 = a3 >> 8 & 0xFF;
            int a6 = a3 & 0xFF;
            a4 = Class767.Method1687((int)((double)a4 + (double)(a * 255.0f) * (Math.random() - 0.5)));
            a5 = Class767.Method1687((int)((double)a5 + (double)(a * 255.0f) * (Math.random() - 0.5)));
            a6 = Class767.Method1687((int)((double)a6 + (double)(a * 255.0f) * (Math.random() - 0.5)));
            this.Field3330[a2] = 0xFF000000 | a4 << 16 | a5 << 8 | a6;
            this.Field3331[a2] = 32;
        }
        this.Method1622();
        this.Method89();
    }

    public static Class758 Method1758() {
        Class758 a = new Class758();
        a.Method1757();
        return a;
    }
}