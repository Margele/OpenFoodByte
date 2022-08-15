/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class262;
import awsl.Class263;
import awsl.Class328;
import awsl.Class91;
import java.util.Random;

public class Class337 {
    private float Field1625;
    private float Field1626;
    private float Field1627;
    private float Field1628;
    private Class262 Field1629;
    private Class263 Field1630;
    private final Random Field1631;
    private float Field1632 = Class328.Method990(1.1f, 1.8f);

    public Class337(float a, float a2, float a3, float a4) {
        this.Field1625 = a;
        this.Field1626 = a2;
        this.Field1627 = a3;
        this.Field1628 = a4;
        this.Field1631 = new Random();
        this.Field1629 = new Class262((Number)Float.valueOf((float)0.0f), (Number)Float.valueOf((float)0.0f), (Number)Float.valueOf((float)0.0f));
        this.Field1630 = new Class263(Float.valueOf((float)0.0f), Float.valueOf((float)0.0f));
    }

    public float Method1181(float a, float a2) {
        return a + this.Field1631.nextFloat() * (a2 - a);
    }

    /*
     * WARNING - void declaration
     */
    public Class263 Method1182(Class262 a, Class262 a2) {
        void a3;
        void a4;
        Class263 class263 = new Class263(Float.valueOf((float)0.0f), Float.valueOf((float)0.0f));
        int n = Class328.Method995();
        this.Field1629.Method2808((Number)Float.valueOf((float)(a.Method2811().floatValue() - a2.Method2811().floatValue()))).Method2809((Number)Float.valueOf((float)(a.Method2812().floatValue() + this.Field1632 - (a2.Method2812().floatValue() + this.Field1632)))).Method2810((Number)Float.valueOf((float)(a.Method2813().floatValue() - a2.Method2813().floatValue())));
        double a5 = Math.hypot((double)this.Field1629.Method2811().doubleValue(), (double)this.Field1629.Method2813().doubleValue());
        float f = (float)Math.atan2((double)this.Field1629.Method2813().floatValue(), (double)this.Field1629.Method2811().floatValue());
        int a6 = n;
        float a7 = (float)Math.atan2((double)this.Field1629.Method2812().floatValue(), (double)a5);
        float a8 = 57.29578f;
        void a9 = a4 * a8 - 90.0f;
        float a10 = -(a7 * a8);
        Class263 class2632 = a3.Method2844(Float.valueOf((float)a9)).Method2845(Float.valueOf((float)a10)).Method2848();
        Class91.Method3647(new String[1]);
        return class2632;
    }

    public void Method1183(float a) {
        this.Field1632 = a;
    }

    public Class263 Method1184(Class263 a, Class263 a2, float a3, float a4) {
        int n = Class328.Method994();
        Class263 class263 = this.Field1630.Method2844(Float.valueOf((float)(a2.Method2846().floatValue() - a.Method2846().floatValue() - (Math.abs((float)(a2.Method2846().floatValue() - a.Method2846().floatValue())) > 5.0f ? Math.abs((float)(a2.Method2846().floatValue() - a.Method2846().floatValue())) / Math.abs((float)(a2.Method2846().floatValue() - a.Method2846().floatValue())) * 2.0f / 2.0f : 0.0f)))).Method2845(Float.valueOf((float)(a2.Method2847().floatValue() - a.Method2847().floatValue()))).Method2848().Method2844(Float.valueOf((float)(a2.Method2846().floatValue() - this.Field1630.Method2846().floatValue() / a4 * this.Method1181(this.Field1625, this.Field1626)))).Method2848().Method2845(Float.valueOf((float)(a2.Method2847().floatValue() - this.Field1630.Method2847().floatValue() / a3 * this.Method1181(this.Field1627, this.Field1628)))).Method2848();
        if (Class91.Method3648() == null) {
            Class328.Method993(++n);
        }
        return class263;
    }
}