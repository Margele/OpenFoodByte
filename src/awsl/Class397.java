/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.math.BigDecimal
 *  org.lwjgl.input.Mouse
 */
package awsl;

import awsl.Class381;
import awsl.Class390;
import awsl.Class565;
import awsl.Class707;
import java.io.IOException;
import java.math.BigDecimal;
import obfuscate.a;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.FloatValue;

public class Class397
extends Class390 {
    public float Field1956;
    public float Field1957;
    public float Field1958;
    public FloatValue Field1959;
    public float Field1960;
    protected boolean Field1961;

    public Class397(FloatValue a, Class381 a2, int a3, int a4, String a5, float a6, float a7, float a8, String a9) {
        super(a2, a3, a4, a5, a9);
        this.Field1959 = a;
        this.Field1956 = a6;
        this.Field1957 = a7;
        this.Field1960 = a8;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a2.Method1414());
        this.Field1910 = 15;
        this.Field1920 = "BasicSlider";
    }

    @Override
    public void Method419(int a, int a2) {
        this.Field1916 = !this.Field1959.Method2756();
    }

    @Override
    public void Method411(int a, int a2) {
        block8: {
            block7: {
                int n = Class390.Method1318();
                super.Method411(a, a2);
                int n2 = n;
                if (!this.Field1961) break block7;
                this.Field1958 = MathUtils.Method547(a - (this.Field1907 + 4), 0.0f, this.Method1310() - 11, this.Field1959.Method2750(), this.Field1959.Method2751());
                this.Field1958 = (float)((double)Math.round((double)((double)this.Field1958 * (1.0 / (double)this.Field1960))) / (1.0 / (double)this.Field1960));
                this.Field1958 = (float)Math.round((float)(this.Field1958 * 100.0f)) / 100.0f;
                if (this.Field1958 > this.Field1957) {
                    this.Field1958 = this.Field1957;
                }
                if (!(this.Field1958 < this.Field1956)) break block8;
                this.Field1958 = this.Field1956;
            }
            if (this.Field1958 > this.Field1957) {
                this.Field1958 = this.Field1957;
                this.Field1959.Method2745(this.Field1958);
                GlobalModule.INSTANCE.fileManager.saveValues();
            }
            if (this.Field1958 < this.Field1956) {
                this.Field1958 = this.Field1956;
                this.Field1959.Method2745(this.Field1958);
                GlobalModule.INSTANCE.fileManager.saveValues();
            }
        }
        if (this.Field1915) {
            GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
        }
    }

    @Override
    public void Method412(int a2, int a3) {
        String a4 = this.Method1355(this.Field1958, 2);
        a4 = new BigDecimal((double)this.Field1958).setScale(2, 4).floatValue() + "";
        int a5 = Class390.Method1318();
        if (this.Field1958 % 1.0f != 0.0f) {
            a4 = new BigDecimal((double)this.Field1958).setScale(2, 4).floatValue() + "";
        }
        a4 = new BigDecimal((double)this.Field1958).setScale(0, 4).toString();
        if (this.Field1959.Method2719() != null) {
            a4 = a4 + this.Field1959.Method2719();
        }
        Class565.Field2636.Method1217(a4, (float)(this.Field1907 + this.Method1310()) - Class565.Field2635.Method1225(a4) - 4.0f, this.Field1908 + 1, 0xFFFFFF);
        Class565.Field2636.Method1217(this.Field1913, this.Field1907 + 5, this.Field1908 + 1, 0xFFFFFF);
        RenderUtils.Method1103(this.Field1907 + 5, this.Field1908 + this.Field1910 - 4, this.Method1310() - 10, 1.0f, Class707.Method1832() + 0x50000000);
        RenderUtils.Method1103(this.Field1907 + 5, this.Field1908 + this.Field1910 - 4, MathUtils.Method547(this.Field1958, this.Field1956, this.Field1957, 0.0f, this.Method1310() - 10), 1.0f, Class707.Method1832());
        float a6 = this.Method1310() - 12;
        float a7 = (this.Field1958 - this.Field1956) / (this.Field1957 - this.Field1956);
        RenderUtils.Method1103((float)(this.Field1907 + 5) + a6 * a7, this.Field1908 + this.Field1910 - 5, 2.0f, 3.0f, Class707.Method1832());
        if (a.trash() == null) {
            Class390.Method1316(++a5);
        }
    }

    private String Method1355(double a2, int a3) {
        BigDecimal a4 = new BigDecimal(Double.toString((double)a2));
        a4 = a4.setScale(a3, 4);
        return String.valueOf((Object)a4);
    }

    @Override
    public void Method1315(char a2, int a3) throws IOException {
        int n = Class390.Method1317();
        if (!this.Field1915) {
            return;
        }
        switch (a3) {
            case 203: {
                if (!(this.Field1958 > this.Field1956) || this.Field1958 == this.Field1956) break;
                this.Field1958 -= this.Field1960;
                this.Field1958 = (float)Math.round((float)(this.Field1958 * 100.0f)) / 100.0f;
                this.Field1959.Method2745(this.Field1958);
                GlobalModule.INSTANCE.fileManager.saveValues();
            }
            case 205: {
                if (!(this.Field1958 < this.Field1957) || this.Field1958 == this.Field1957) break;
                this.Field1958 += this.Field1960;
                this.Field1958 = (float)Math.round((float)(this.Field1958 * 100.0f)) / 100.0f;
                this.Field1959.Method2745(this.Field1958);
                GlobalModule.INSTANCE.fileManager.saveValues();
                break;
            }
        }
    }

    @Override
    public void Method413(int a2, int a3, boolean a4) {
        this.Field1915 = this.Method1312(a2, a3) && this.Field1919.Method1392(a2, a3);
        if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown((int)0)) {
            this.Field1961 = true;
        }
        this.Field1961 = false;
        this.Field1918 = a4;
    }

    @Override
    public void Method414() {
        super.Method414();
        if (!Mouse.isButtonDown((int)0)) {
            this.Field1961 = false;
        }
    }

    private static IOException Method418(IOException iOException) {
        return iOException;
    }
}