/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class148;
import awsl.Class154;
import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class31;
import awsl.Class690;

public class Class29
extends Class267 {
    private final Class690 Field249;

    public Class29(Class267 a, Class690 a2) {
        super(327680, a);
        this.Field249 = a2;
    }

    @Override
    public void Method1979(String a, int a2) {
        this.Field249.Method2496("MethodParameters");
        this.Field249.Method2496(a);
        this.Field1460.Method1979(a, a2);
    }

    @Override
    public Class148 Method1968() {
        this.Field249.Method2496("AnnotationDefault");
        return new Class154(this.Field1460.Method1968(), this.Field249);
    }

    @Override
    public Class148 Method1969(String a, boolean a2) {
        this.Field249.Method2496(a);
        this.Field249.Method2496("RuntimeVisibleAnnotations");
        return new Class154(this.Field1460.Method1969(a, a2), this.Field249);
    }

    @Override
    public Class148 Method1970(int a, Class31 a2, String a3, boolean a4) {
        this.Field249.Method2496(a3);
        this.Field249.Method2496("RuntimeVisibleTypeAnnotations");
        return new Class154(this.Field1460.Method1969(a3, a4), this.Field249);
    }

    @Override
    public Class148 Method1971(int a, String a2, boolean a3) {
        this.Field249.Method2496(a2);
        this.Field249.Method2496("RuntimeVisibleParameterAnnotations");
        return new Class154(this.Field1460.Method1971(a, a2, a3), this.Field249);
    }

    @Override
    public void Method1952(int a, String a2) {
        this.Field249.Method2498(a2);
        this.Field1460.Method1952(a, a2);
    }

    @Override
    public void Method1949(int a, String a2, String a3, String a4) {
        this.Field249.Method2502(a2, a3, a4);
        this.Field1460.Method1949(a, a2, a3, a4);
    }

    @Override
    public void Method1954(int a, String a2, String a3, String a4, boolean a5) {
        this.Field249.Method2503(a2, a3, a4, a5);
        this.Field1460.Method1954(a, a2, a3, a4, a5);
    }

    @Override
    public void Method1956(String a, String a2, Class279 a3, Object[] a4) {
        this.Field249.Method2504(a, a2, a3, a4);
        this.Field1460.Method1956(a, a2, a3, a4);
    }

    @Override
    public void Method1950(Object a) {
        this.Field249.Method2501(a);
        this.Field1460.Method1950(a);
    }

    @Override
    public void Method1951(String a, int a2) {
        this.Field249.Method2498(a);
        this.Field1460.Method1951(a, a2);
    }

    @Override
    public Class148 Method1973(int a, Class31 a2, String a3, boolean a4) {
        String[] stringArray = Class690.Method2342();
        this.Field249.Method2496(a3);
        String[] stringArray2 = stringArray;
        this.Field249.Method2496("RuntimeVisibleTypeAnnotations");
        this.Field249.Method2496("RuntimeInvisibleTypeAnnotations");
        return new Class154(this.Field1460.Method1973(a, a2, a3, a4), this.Field249);
    }

    @Override
    public void Method1960(Class264 a, Class264 a2, Class264 a3, String a4) {
        this.Field249.Method2498(a4);
        this.Field1460.Method1960(a, a2, a3, a4);
    }

    @Override
    public Class148 Method1974(int a, Class31 a2, String a3, boolean a4) {
        String[] stringArray = Class690.Method2342();
        this.Field249.Method2496(a3);
        String[] stringArray2 = stringArray;
        this.Field249.Method2496("RuntimeVisibleTypeAnnotations");
        this.Field249.Method2496("RuntimeInvisibleTypeAnnotations");
        return new Class154(this.Field1460.Method1974(a, a2, a3, a4), this.Field249);
    }

    @Override
    public void Method1843(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
        this.Field249.Method2496("LocalVariableTypeTable");
        this.Field249.Method2496(a);
        this.Field249.Method2496(a3);
        this.Field249.Method2496("LocalVariableTable");
        this.Field249.Method2496(a);
        this.Field249.Method2496(a2);
        this.Field1460.Method1843(a, a2, a3, a4, a5, a6);
    }

    @Override
    public Class148 Method1844(int a, Class31 a2, Class264[] a3, Class264[] a4, int[] a5, String a6, boolean a7) {
        String[] stringArray = Class690.Method2342();
        this.Field249.Method2496(a6);
        String[] stringArray2 = stringArray;
        this.Field249.Method2496("RuntimeVisibleTypeAnnotations");
        this.Field249.Method2496("RuntimeInvisibleTypeAnnotations");
        return new Class154(this.Field1460.Method1844(a, a2, a3, a4, a5, a6, a7), this.Field249);
    }

    @Override
    public void Method1981(int a, Class264 a2) {
        this.Field249.Method2496("LineNumberTable");
        this.Field1460.Method1981(a, a2);
    }

    @Override
    public void Method1842(int a, int a2) {
        this.Field249.Method2496("Code");
        this.Field1460.Method1842(a, a2);
    }
}