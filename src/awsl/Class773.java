/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class590;
import awsl.Class600;
import java.awt.Color;

public class Class773
implements Cloneable {
    int Field3434 = 0;
    Class590 Field3435;
    Class590 Field3436;
    Class600 Field3437 = new Class600();
    int Field3438 = -1;
    float Field3439;
    float Field3440;
    float Field3441;
    float Field3442 = 0.5f;
    float Field3443 = 0.5f;
    float Field3444 = 0.5f;
    float Field3445 = 0.5235988f;
    float Field3446;
    float Field3447 = 100.0f;

    public Class773() {
        this(4.712389f, 0.5235988f, 1.0f);
    }

    public Class773(float a, float a2, float a3) {
        this.Field3440 = a;
        this.Field3441 = a2;
        this.Field3439 = a3;
    }

    public void Method56(float a) {
        this.Field3440 = a;
    }

    public float Method57() {
        return this.Field3440;
    }

    public void Method58(float a) {
        this.Field3441 = a;
    }

    public float Method59() {
        return this.Field3441;
    }

    public void Method60(float a) {
        this.Field3447 = a;
    }

    public float Method61() {
        return this.Field3447;
    }

    public void Method164(float a) {
        this.Field3439 = a;
    }

    public float Method165() {
        return this.Field3439;
    }

    public void Method166(float a) {
        this.Field3445 = a;
    }

    public float Method167() {
        return this.Field3445;
    }

    public void Method168(float a) {
        this.Field3442 = a;
    }

    public float Method169() {
        return this.Field3442;
    }

    public void Method9(int a) {
        this.Field3438 = a;
    }

    public int Method10() {
        return this.Field3438;
    }

    public void Method170(float a) {
        this.Field3443 = a;
    }

    public float Method171() {
        return this.Field3443;
    }

    public void Method172(float a) {
        this.Field3444 = a;
    }

    public float Method173() {
        return this.Field3444;
    }

    public void Method17(int a, int a2) {
        float a3 = (float)(Math.cos((double)this.Field3440) * Math.cos((double)this.Field3441));
        float a4 = (float)(Math.sin((double)this.Field3440) * Math.cos((double)this.Field3441));
        float a5 = (float)Math.sin((double)this.Field3441);
        this.Field3436 = new Class590(a3, a4, a5);
        this.Field3436.Method25();
        if (this.Field3434 != 1) {
            a3 *= this.Field3447;
            a4 *= this.Field3447;
            a5 *= this.Field3447;
            a3 += (float)a * this.Field3443;
            a4 += (float)a2 * this.Field3444;
        }
        this.Field3435 = new Class590(a3, a4, a5);
        this.Field3437.Method3790(new Color(this.Field3438));
        this.Field3437.Method121(this.Field3439);
        this.Field3446 = (float)Math.cos((double)this.Field3445);
    }

    public Object Method878() {
        try {
            Class773 a = (Class773)super.Method1433();
            return a;
        }
        catch (CloneNotSupportedException a) {
            return null;
        }
    }

    public String toString() {
        return "Light";
    }
}