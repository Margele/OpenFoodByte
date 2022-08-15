/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class136;
import awsl.Class148;
import awsl.Class154;
import awsl.Class253;
import awsl.Class31;
import awsl.Class690;

public class Class238
extends Class253 {
    private final Class690 Field1309;

    public Class238(Class253 a, Class690 a2) {
        super(327680, a);
        this.Field1309 = a2;
    }

    @Override
    public Class148 Method2114(String a, boolean a2) {
        String[] stringArray = Class690.Method2342();
        this.Field1309.Method2496(a);
        String[] stringArray2 = stringArray;
        this.Field1309.Method2496("RuntimeVisibleAnnotations");
        this.Field1309.Method2496("RuntimeInvisibleAnnotations");
        return new Class154(this.Field1390.Method2114(a, a2), this.Field1309);
    }

    @Override
    public Class148 Method2115(int a, Class31 a2, String a3, boolean a4) {
        String[] stringArray = Class690.Method2342();
        this.Field1309.Method2496(a3);
        String[] stringArray2 = stringArray;
        this.Field1309.Method2496("RuntimeVisibleTypeAnnotations");
        this.Field1309.Method2496("RuntimeInvisibleTypeAnnotations");
        return new Class154(this.Field1390.Method2114(a3, a4), this.Field1309);
    }

    @Override
    public void Method2120(Class136 a) {
        this.Field1390.Method2120(a);
    }

    @Override
    public void Method2121() {
        this.Field1390.Method2121();
    }
}