/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.value;

import awsl.Class446;
import awsl.Class447;

public class BooleanValue
extends Class447 {
    private static int[] Field2129;

    public BooleanValue(String a, String a2, Boolean a3, boolean a4) {
        this.Field2117 = a;
        this.Field2118 = a2;
        this.Field2120 = a3;
        Class446.Method2762(this);
    }

    public BooleanValue(String a, String a2, Boolean a3, String a4) {
        this(a, a2, a3, false);
        this.Field2119 = a4;
    }

    public BooleanValue(String a, String a2, Boolean a3) {
        this(a, a2, a3, false);
    }

    public Boolean Method2509() {
        return (Boolean)this.Field2120;
    }

    @Override
    public void Method2510(Object a) {
        super.Method2510(a);
    }

    public boolean getValue() {
        return this.Method2509();
    }

    @Override
    public Object Method2454() {
        return this.Method2509();
    }

    public static void Method2511(int[] nArray) {
        Field2129 = nArray;
    }

    public static int[] Method2512() {
        return Field2129;
    }

    static {
        if (BooleanValue.Method2512() != null) {
            BooleanValue.Method2511(new int[2]);
        }
    }
}