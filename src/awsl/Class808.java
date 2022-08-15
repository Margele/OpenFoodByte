/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

import awsl.Class623;
import awsl.Class624;
import awsl.Class755;
import awsl.Class798;

public abstract class Class808
extends Class798 {
    protected int Field3617 = -16777216;
    protected Class623 Field3618 = new Class624();
    protected int Field3619 = 1;
    protected Class755 Field3620;

    public void Method9(int a) {
        this.Field3619 = a;
    }

    public int Method10() {
        return this.Field3619;
    }

    public void Method176(Class755 a) {
        this.Field3620 = a;
    }

    public Class755 Method177() {
        return this.Field3620;
    }

    public void Method11(int a) {
        this.Field3617 = a;
    }

    public int Method12() {
        return this.Field3617;
    }

    public void Method3370(Class623 a) {
        this.Field3618 = a;
    }

    public Class623 Method3371() {
        return this.Field3618;
    }
}