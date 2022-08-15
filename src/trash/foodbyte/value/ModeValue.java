/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 */
package trash.foodbyte.value;

import awsl.Class333;
import awsl.Class446;
import awsl.Class447;
import awsl.Class91;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import trash.foodbyte.value.BooleanValue;

public class ModeValue
extends Class447 {
    Class333 Field2091 = new Class333(1.0f, 0.05f);
    private String[] Field2092;

    public ModeValue(String a, String a2, String a3, String[] a4) {
        this(a, a2, a3, false, a4);
    }

    public ModeValue(String a, String a2, String a3, String[] a4, String a5) {
        this(a, a2, a3, false, a4);
        this.Field2119 = a5;
    }

    public ModeValue(String a, String a2, String a3, boolean a4, String[] a5) {
        this.Field2117 = a;
        this.Field2118 = a2;
        this.Field2120 = a3;
        ArrayList a6 = new ArrayList((Collection)Arrays.asList((Object[])a5));
        if (!a6.contains((Object)a3)) {
            a6.Method2530((Object)a3);
        }
        this.Field2092 = (String[])a6.toArray((Object[])new String[0]);
        Class446.Method2762(this);
    }

    public String Method2719() {
        return (String)this.Field2120;
    }

    public void Method2720(String a) {
    }

    public void Method2721(String a) {
        ArrayList a2 = new ArrayList((Collection)Arrays.asList((Object[])this.Field2092));
        int[] a3 = BooleanValue.Method2512();
        if (!a2.contains((Object)a)) {
            a2.Method2530((Object)a);
        }
        this.Field2092 = (String[])a2.toArray((Object[])new String[0]);
        if (Class91.Method3648() == null) {
            BooleanValue.Method2511(new int[3]);
        }
    }

    public void Method2722(String a) {
        ArrayList a2 = new ArrayList((Collection)Arrays.asList((Object[])this.Field2092));
        int[] a3 = BooleanValue.Method2512();
        a2.removeIf(arg_0 -> ModeValue.Method2729(a, arg_0));
        this.Field2092 = (String[])a2.toArray((Object[])new String[0]);
        Class91.Method3647(new String[5]);
    }

    public String[] Method2723() {
        return this.Field2092;
    }

    public String getMode() {
        return (String)this.Field2120;
    }

    public void Method2725(String a) {
        this.Method2720(a);
    }

    public boolean isCurrentMode(String a) {
        return this.Method2719().equals((Object)a);
    }

    public Class333 Method2727() {
        return this.Field2091;
    }

    public String[] Method2728() {
        return this.Field2092;
    }

    @Override
    public Object Method2454() {
        return this.Method2719();
    }

    private static boolean Method2729(String a, String a2) {
        return a2.equals((Object)a);
    }
}