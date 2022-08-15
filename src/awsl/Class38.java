/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;
import awsl.Class193;
import awsl.Class598;
import awsl.Class755;
import awsl.Class767;
import awsl.Class771;
import awsl.Class776;

public class Class38
extends Class119 {
    private float Field302 = 200.0f;
    private float Field303 = 10.0f;
    private float Field304 = 1.5707964f;
    private float Field305 = 0.5f;
    private float Field306 = 0.0f;
    private float Field307 = 0.5f;
    private float Field308 = 0.8f;
    private float Field309 = 1.0f;
    private float Field310 = 0.0f;
    private float Field311 = 0.0f;
    private float Field312 = 1.0f;
    private Class755 Field313 = new Class771(-1719148, -6784175);

    public void Method56(float a) {
        this.Field305 = a;
    }

    public float Method57() {
        return this.Field305;
    }

    public void Method58(float a) {
        this.Field302 = a;
    }

    public float Method59() {
        return this.Field302;
    }

    public void Method60(float a) {
        this.Field303 = a;
    }

    public float Method61() {
        return this.Field303;
    }

    public void Method164(float a) {
        this.Field304 = a;
        float a2 = (float)Math.cos((double)a);
        float a3 = (float)Math.sin((double)a);
        this.Field309 = a2;
        this.Field310 = a3;
        this.Field311 = -a3;
        this.Field312 = a2;
    }

    public float Method165() {
        return this.Field304;
    }

    public void Method166(float a) {
        this.Field306 = a;
    }

    public float Method167() {
        return this.Field306;
    }

    public void Method168(float a) {
        this.Field307 = a;
    }

    public float Method169() {
        return this.Field307;
    }

    public void Method170(float a) {
        this.Field308 = a;
    }

    public float Method171() {
        return this.Field308;
    }

    public void Method176(Class755 a) {
        this.Field313 = a;
    }

    public Class755 Method177() {
        return this.Field313;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int Method3(int a, int a2, int a3) {
        int a4;
        void a5;
        float a6 = this.Field309 * (float)a + this.Field310 * (float)a2;
        float a7 = this.Field311 * (float)a + this.Field312 * (float)a2;
        float f = Class598.Method157(a6 /= this.Field302, a7 /= this.Field302 * this.Field303);
        a5 += 0.1f * this.Field306 * Class598.Method157(a6 * 0.05f, a7 * 20.0f);
        a5 = a5 * 0.5f + 0.5f;
        a5 *= this.Field305 * 50.0f;
        boolean a8 = Class193.Method1270();
        a5 -= (float)((int)a5);
        a5 *= 1.0f - Class776.Method1708(this.Field308, 1.0f, (float)a5);
        a5 += this.Field307 * Class598.Method157(a6 * this.Field302, a7 * 50.0f);
        int a9 = a3 & 0xFF000000;
        if (this.Field313 != null) {
            a4 = this.Field313.Method283((float)a5);
        }
        a4 = Class767.Method1687((int)(a5 * 255.0f));
        int a10 = a4 << 16;
        int a11 = a4 << 8;
        int a12 = a4;
        a4 = a9 | a10 | a11 | a12;
        return a4;
    }

    public String toString() {
        return "Texture/Wood...";
    }
}