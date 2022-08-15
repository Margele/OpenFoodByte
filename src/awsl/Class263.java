/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Number
 *  java.lang.Object
 */
package awsl;

import awsl.Class277;
import awsl.Class328;

public class Class263
extends Class277 {
    public Class263(Float a, Float a2) {
        super((Number)a, (Number)a2);
    }

    public Class263 Method2844(Float a) {
        this.Method2808((Number)a);
        return this;
    }

    public Class263 Method2845(Float a) {
        this.Method2809((Number)a);
        return this;
    }

    public Float Method2846() {
        return Float.valueOf((float)this.Method2811().floatValue());
    }

    public Float Method2847() {
        return Float.valueOf((float)this.Method2812().floatValue());
    }

    public Class263 Method2848() {
        int n = Class328.Method995();
        this.Method2844(Float.valueOf((float)(this.Method2846().floatValue() % 360.0f)));
        int n2 = n;
        this.Method2845(Float.valueOf((float)(this.Method2847().floatValue() % 360.0f)));
        if (this.Method2846().floatValue() <= -180.0f) {
            this.Method2844(Float.valueOf((float)(this.Method2846().floatValue() + 360.0f)));
        }
        if (this.Method2847().floatValue() <= -180.0f) {
            this.Method2845(Float.valueOf((float)(this.Method2847().floatValue() + 360.0f)));
        }
        if (this.Method2846().floatValue() > 180.0f) {
            this.Method2844(Float.valueOf((float)(this.Method2846().floatValue() - 360.0f)));
        }
        if (this.Method2847().floatValue() > 180.0f) {
            this.Method2845(Float.valueOf((float)(this.Method2847().floatValue() - 360.0f)));
        }
        return this;
    }
}