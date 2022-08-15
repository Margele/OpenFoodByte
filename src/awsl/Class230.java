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
import awsl.Class167;
import awsl.Class238;
import awsl.Class253;
import awsl.Class267;
import awsl.Class29;
import awsl.Class31;
import awsl.Class690;
import awsl.Class91;

public class Class230
extends Class167 {
    private final Class690 Field1286;

    public Class230(Class167 a, Class690 a2) {
        super(327680, a);
        this.Field1286 = a2;
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        String[] a7 = Class690.Method2342();
        if ((a2 & 0x20000) != 0) {
            this.Field1286.Method2496("Deprecated");
        }
        if ((a2 & 0x1000) != 0) {
            this.Field1286.Method2496("Synthetic");
        }
        this.Field1286.Method2498(a3);
        this.Field1286.Method2496("Signature");
        this.Field1286.Method2496(a4);
        this.Field1286.Method2498(a5);
        int a8 = 0;
        if (a8 < a6.length) {
            this.Field1286.Method2498(a6[a8]);
            ++a8;
        }
        this.Field1035.Method1447(a, a2, a3, a4, a5, a6);
    }

    @Override
    public void Method1458(String a, String a2) {
        this.Field1286.Method2496("SourceFile");
        this.Field1286.Method2496(a);
        this.Field1286.Method2496("SourceDebugExtension");
        this.Field1035.Method1458(a, a2);
    }

    @Override
    public void Method1453(String a, String a2, String a3) {
        this.Field1286.Method2496("EnclosingMethod");
        this.Field1286.Method2498(a);
        this.Field1286.Method2505(a2, a3);
        this.Field1035.Method1453(a, a2, a3);
    }

    @Override
    public Class148 Method1448(String a, boolean a2) {
        this.Field1286.Method2496(a);
        this.Field1286.Method2496("RuntimeVisibleAnnotations");
        return new Class154(this.Field1035.Method1448(a, a2), this.Field1286);
    }

    @Override
    public Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        String[] stringArray = Class690.Method2342();
        this.Field1286.Method2496(a3);
        String[] stringArray2 = stringArray;
        this.Field1286.Method2496("RuntimeVisibleTypeAnnotations");
        this.Field1286.Method2496("RuntimeInvisibleTypeAnnotations");
        return new Class154(this.Field1035.Method1448(a3, a4), this.Field1286);
    }

    @Override
    public void Method1459(Class136 a) {
        this.Field1035.Method1459(a);
    }

    @Override
    public void Method1452(String a, String a2, String a3, int a4) {
        this.Field1286.Method2496("InnerClasses");
        this.Field1286.Method2498(a);
        this.Field1286.Method2498(a2);
        this.Field1286.Method2496(a3);
        this.Field1035.Method1452(a, a2, a3, a4);
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        String[] stringArray = Class690.Method2342();
        if ((a & 0x1000) != 0) {
            this.Field1286.Method2496("Synthetic");
        }
        if ((a & 0x20000) != 0) {
            this.Field1286.Method2496("Deprecated");
        }
        this.Field1286.Method2496(a2);
        this.Field1286.Method2496(a3);
        this.Field1286.Method2496("Signature");
        this.Field1286.Method2496(a4);
        this.Field1286.Method2501(a5);
        Class238 class238 = new Class238(this.Field1035.Method1450(a, a2, a3, a4, a5), this.Field1286);
        if (Class91.Method3648() == null) {
            Class690.Method2341(new String[1]);
        }
        return class238;
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        String[] a6 = Class690.Method2342();
        if ((a & 0x1000) != 0) {
            this.Field1286.Method2496("Synthetic");
        }
        if ((a & 0x20000) != 0) {
            this.Field1286.Method2496("Deprecated");
        }
        this.Field1286.Method2496(a2);
        this.Field1286.Method2496(a3);
        this.Field1286.Method2496("Signature");
        this.Field1286.Method2496(a4);
        this.Field1286.Method2496("Exceptions");
        int a7 = 0;
        if (a7 < a5.length) {
            this.Field1286.Method2498(a5[a7]);
            ++a7;
            Class91.Method3647(new String[4]);
        }
        return new Class29(this.Field1035.Method1451(a, a2, a3, a4, a5), this.Field1286);
    }
}