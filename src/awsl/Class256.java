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
import awsl.Class138;
import awsl.Class148;
import awsl.Class150;
import awsl.Class169;
import awsl.Class253;
import awsl.Class267;
import awsl.Class31;
import awsl.Class91;

final class Class256
extends Class253 {
    private final Class169 Field1398;
    private final int Field1399;
    private final int Field1400;
    private final int Field1401;
    private int Field1402;
    private int Field1403;
    private Class150 Field1404;
    private Class150 Field1405;
    private Class150 Field1406;
    private Class150 Field1407;
    private Class136 Field1408;

    Class256(Class169 a, int a2, String a3, String a4, String a5, Object a6) {
        String[] stringArray = Class267.Method2862();
        super(327680);
        String[] stringArray2 = stringArray;
        if (a.Field1111 == null) {
            a.Field1111 = this;
        }
        a.Field1112.Field1390 = this;
        a.Field1112 = this;
        this.Field1398 = a;
        this.Field1399 = a2;
        this.Field1400 = a.Method1506(a3);
        this.Field1401 = a.Method1506(a4);
        this.Field1402 = a.Method1506(a5);
        this.Field1403 = a.Method1504((Object)a6).Field1426;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Class148 Method2114(String a, boolean a2) {
        void a3;
        Class138 class138 = new Class138();
        String[] a4 = Class267.Method2862();
        a3.Method487(this.Field1398.Method1506(a)).Method487(0);
        Class150 a5 = new Class150(this.Field1398, true, (Class138)a3, (Class138)a3, 2);
        a5.Field1016 = this.Field1404;
        this.Field1404 = a5;
        a5.Field1016 = this.Field1405;
        this.Field1405 = a5;
        return a5;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Class148 Method2115(int a, Class31 a2, String a3, boolean a4) {
        void a5;
        Class138 a6 = new Class138();
        Class150.Method1324(a, a2, a6);
        String[] stringArray = Class267.Method2862();
        a6.Method487(this.Field1398.Method1506(a3)).Method487(0);
        Class150 class150 = new Class150(this.Field1398, true, a6, a6, a6.Field991 - 2);
        String[] a7 = stringArray;
        a5.Field1016 = this.Field1406;
        this.Field1406 = a5;
        a5.Field1016 = this.Field1407;
        this.Field1407 = a5;
        return a5;
    }

    @Override
    public void Method2120(Class136 a) {
        a.Field989 = this.Field1408;
        this.Field1408 = a;
    }

    @Override
    public void Method2121() {
    }

    int Method2251() {
        int a = 8;
        if (this.Field1403 != 0) {
            this.Field1398.Method1506("ConstantValue");
            a += 8;
        }
        if ((this.Field1399 & 0x1000) != 0 && ((this.Field1398.Field1080 & 0xFFFF) < 49 || (this.Field1399 & 0x40000) != 0)) {
            this.Field1398.Method1506("Synthetic");
            a += 6;
        }
        if ((this.Field1399 & 0x20000) != 0) {
            this.Field1398.Method1506("Deprecated");
            a += 6;
        }
        if (this.Field1402 != 0) {
            this.Field1398.Method1506("Signature");
            a += 8;
        }
        if (this.Field1404 != null) {
            this.Field1398.Method1506("RuntimeVisibleAnnotations");
            a += 8 + this.Field1404.Method1321();
        }
        if (this.Field1405 != null) {
            this.Field1398.Method1506("RuntimeInvisibleAnnotations");
            a += 8 + this.Field1405.Method1321();
        }
        if (this.Field1406 != null) {
            this.Field1398.Method1506("RuntimeVisibleTypeAnnotations");
            a += 8 + this.Field1406.Method1321();
        }
        if (this.Field1407 != null) {
            this.Field1398.Method1506("RuntimeInvisibleTypeAnnotations");
            a += 8 + this.Field1407.Method1321();
        }
        if (this.Field1408 != null) {
            a += this.Field1408.Method474(this.Field1398, null, 0, -1, -1);
        }
        return a;
    }

    /*
     * WARNING - void declaration
     */
    void Method2252(Class138 a) {
        void a2;
        int n = 64;
        String[] stringArray = Class267.Method2862();
        int a3 = 0x60000 | (this.Field1399 & 0x40000) / 64;
        a.Method487(this.Field1399 & ~a3).Method487(this.Field1400).Method487(this.Field1401);
        boolean bl = false;
        String[] a4 = stringArray;
        if (this.Field1403 != 0) {
            ++a2;
        }
        if ((this.Field1399 & 0x1000) != 0 && ((this.Field1398.Field1080 & 0xFFFF) < 49 || (this.Field1399 & 0x40000) != 0)) {
            ++a2;
        }
        if ((this.Field1399 & 0x20000) != 0) {
            ++a2;
        }
        if (this.Field1402 != 0) {
            ++a2;
        }
        if (this.Field1404 != null) {
            ++a2;
        }
        if (this.Field1405 != null) {
            ++a2;
        }
        if (this.Field1406 != null) {
            ++a2;
        }
        if (this.Field1407 != null) {
            ++a2;
        }
        if (this.Field1408 != null) {
            a2 += this.Field1408.Method473();
        }
        a.Method487((int)a2);
        if (this.Field1403 != 0) {
            a.Method487(this.Field1398.Method1506("ConstantValue"));
            a.Method489(2).Method487(this.Field1403);
        }
        if ((this.Field1399 & 0x1000) != 0 && ((this.Field1398.Field1080 & 0xFFFF) < 49 || (this.Field1399 & 0x40000) != 0)) {
            a.Method487(this.Field1398.Method1506("Synthetic")).Method489(0);
        }
        if ((this.Field1399 & 0x20000) != 0) {
            a.Method487(this.Field1398.Method1506("Deprecated")).Method489(0);
        }
        if (this.Field1402 != 0) {
            a.Method487(this.Field1398.Method1506("Signature"));
            a.Method489(2).Method487(this.Field1402);
        }
        if (this.Field1404 != null) {
            a.Method487(this.Field1398.Method1506("RuntimeVisibleAnnotations"));
            this.Field1404.Method1322(a);
        }
        if (this.Field1405 != null) {
            a.Method487(this.Field1398.Method1506("RuntimeInvisibleAnnotations"));
            this.Field1405.Method1322(a);
        }
        if (this.Field1406 != null) {
            a.Method487(this.Field1398.Method1506("RuntimeVisibleTypeAnnotations"));
            this.Field1406.Method1322(a);
        }
        if (this.Field1407 != null) {
            a.Method487(this.Field1398.Method1506("RuntimeInvisibleTypeAnnotations"));
            this.Field1407.Method1322(a);
        }
        if (this.Field1408 != null) {
            this.Field1408.Method475(this.Field1398, null, 0, -1, -1, a);
        }
        if (Class91.Method3648() == null) {
            Class267.Method2861(new String[2]);
        }
    }
}