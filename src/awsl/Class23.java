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
import awsl.Class173;
import awsl.Class253;
import awsl.Class264;
import awsl.Class267;
import awsl.Class31;
import awsl.Class37;
import awsl.Class45;
import awsl.Class46;
import awsl.Class7;

public class Class23
extends Class7
implements Class45 {
    private final Class173 Field235;

    public Class23(Class173 a, int a2, String a3, Class267 a4, Class37 a5) {
        super(327680, a2, a3, a4, a5);
        this.Field235 = a;
    }

    @Override
    public void Method1979(String a, int a2) {
    }

    @Override
    public Class148 Method1968() {
        return null;
    }

    @Override
    public Class148 Method1969(String a, boolean a2) {
        return null;
    }

    @Override
    public Class148 Method1970(int a, Class31 a2, String a3, boolean a4) {
        return null;
    }

    @Override
    public Class148 Method1971(int a, String a2, boolean a3) {
        return null;
    }

    @Override
    public void Method1843(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
    }

    @Override
    public void Method1981(int a, Class264 a2) {
    }

    @Override
    public void Method1845(int a, int a2, Object[] a3, int a4, Object[] a5) {
    }

    @Override
    public void Method1980(Class136 a) {
    }

    @Override
    public void Method1950(Object a) {
        Object a2;
        if (!(a instanceof Class46)) {
            super.Method1950(a);
            return;
        }
        String a3 = ((Class46)a).Method3221();
        String a4 = "class$" + a3.replace('/', '$');
        if (!this.Field235.Field1126.contains((Object)a3)) {
            this.Field235.Field1126.Method2530((Object)a3);
            a2 = this.Field235.Method1457(4104, a4, "Ljava/lang/Class;");
            ((Class253)a2).Method2121();
        }
        a2 = this.Field235.Field1123;
        this.Field1460.Method1949(178, (String)a2, a4, "Ljava/lang/Class;");
    }
}