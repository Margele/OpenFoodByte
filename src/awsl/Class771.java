/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class755;
import awsl.Class776;

public class Class771
implements Class755 {
    private int Field3431;
    private int Field3432;

    public Class771() {
        this(-16777216, -1);
    }

    public Class771(int a, int a2) {
        this.Field3431 = a;
        this.Field3432 = a2;
    }

    public void Method9(int a) {
        this.Field3431 = a;
    }

    public int Method10() {
        return this.Field3431;
    }

    public void Method11(int a) {
        this.Field3432 = a;
    }

    public int Method12() {
        return this.Field3432;
    }

    @Override
    public int Method283(float a) {
        return Class776.Method1719(Class776.Method1711(a, 0.0f, 1.0f), this.Field3431, this.Field3432);
    }
}