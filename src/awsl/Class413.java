/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class417;
import awsl.Class447;
import awsl.Class565;
import awsl.Class705;
import awsl.Class91;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class413 {
    public Class705 Field1990;
    public Class417 Field1991;
    public Class447 Field1992;
    public double Field1993;
    public double Field1994;
    public double Field1995;
    public double Field1996;
    public double Field1997;
    public String Field1998;
    public boolean Field1999;
    private static boolean Field2000;

    public void Method3576() {
        this.Field1990 = this.Field1991.Field2014.Field2039;
    }

    public void Method3577() {
        String a;
        String a2;
        block11: {
            block13: {
                block12: {
                    this.Field1994 = this.Field1991.Field2014.Field2028;
                    boolean a3 = Class413.Method3580();
                    this.Field1995 = this.Field1991.Field2014.Field2029 + this.Field1993 + 12.0;
                    this.Field1996 = this.Field1991.Field2017 + 4.0;
                    this.Field1997 = 15.0;
                    a2 = this.Field1992.Method2754();
                    if (!(this.Field1992 instanceof ModeValue)) break block11;
                    if (!this.Field1999) break block12;
                    this.Field1997 = 25.0;
                    int a4 = 0;
                    if (a4 < ((ModeValue)this.Field1992).Method2728().length) {
                        a = ((ModeValue)this.Field1992).Method2728()[a4];
                        if (((ModeValue)this.Field1992).isCurrentMode(a)) {
                        }
                        this.Field1997 += (double)(Class565.Field2637.Field2625 - 5.0f);
                        ++a4;
                    }
                    if (((ModeValue)this.Field1992).Method2728().length <= 1) break block13;
                    this.Field1997 += 3.0;
                }
                this.Field1997 = 25.0;
            }
            this.Field1998 = this.Field1992.Method2754();
            double a5 = this.Field1994 + this.Field1996 - (double)((int)Class565.Field2637.Method1225(((ModeValue)this.Field1992).getMode()));
            if (a5 < this.Field1994 + 33.0) {
                this.Field1996 += this.Field1994 + 33.0 - a5;
            }
        }
        if (this.Field1992 instanceof FloatValue) {
            this.Field1998 = String.valueOf((Object)a2.substring(0, 1).toUpperCase()) + a2.substring(1, a2.length());
            String a6 = "" + (double)Math.round((double)((double)((FloatValue)this.Field1992).Method2744().floatValue() * 100.0)) / 100.0;
            a = "" + (double)Math.round((double)((double)((FloatValue)this.Field1992).Method2751() * 100.0)) / 100.0;
            double a7 = this.Field1994 + this.Field1996 - (double)Class565.Field2637.Method1225(this.Field1998) - (double)Class565.Field2637.Method1225(a) - 4.0;
            if (a7 < this.Field1994) {
                this.Field1996 += this.Field1994 - a7 + 1.0;
            }
        }
        if (this.Field1992 instanceof BooleanValue) {
            this.Field1998 = a2.substring(0, 1).toUpperCase() + a2.substring(1, a2.length());
            double a8 = this.Field1994 + this.Field1996 - (double)Class565.Field2637.Method1225(this.Field1998);
            if (a8 < this.Field1994 + 13.0) {
                this.Field1996 += this.Field1994 + 13.0 - a8 + 1.0;
            }
        }
        if (Class91.Method3648() == null) {
            Class413.Method3579(false);
        }
    }

    public void Method2369(int a, int a2, float a3) {
    }

    public boolean Method2370(int a, int a2, int a3) {
        return this.Method3578(a, a2);
    }

    public void Method2371(int a, int a2, int a3) {
    }

    public boolean Method3578(int a, int a2) {
        return (double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a2 >= this.Field1995 && (double)a2 <= this.Field1995 + this.Field1997;
    }

    public static void Method3579(boolean bl) {
        Field2000 = bl;
    }

    public static boolean Method3580() {
        return Field2000;
    }

    public static boolean Method3581() {
        boolean bl = Class413.Method3580();
        return true;
    }

    static {
        if (Class413.Method3581()) {
            Class413.Method3579(true);
        }
    }
}