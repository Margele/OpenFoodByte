/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;
import awsl.Class767;
import awsl.Class776;

public class Class56
extends Class119 {
    private int Field606;
    private int Field607;
    private int Field608 = 0xFFFFFF;
    private int Field609 = 0;

    public Class56() {
        this(127);
    }

    public Class56(int a) {
        this.Method9(a);
        this.Method11(a);
    }

    public void Method9(int a) {
        this.Field606 = a;
    }

    public int Method10() {
        return this.Field606;
    }

    public void Method11(int a) {
        this.Field607 = a;
    }

    public int Method12() {
        return this.Field607;
    }

    public void Method13(int a) {
        this.Field608 = a;
    }

    public int Method14() {
        return this.Field608;
    }

    public void Method15(int a) {
        this.Field609 = a;
    }

    public int Method16() {
        return this.Field609;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = Class767.Method1689(a3);
        float a5 = Class776.Method1708(this.Field606, this.Field607, a4);
        return a3 & 0xFF000000 | Class776.Method1719(a5, this.Field609, this.Field608) & 0xFFFFFF;
    }

    public String toString() {
        return "Stylize/Threshold...";
    }
}