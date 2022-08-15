/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CloneNotSupportedException
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package awsl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Class144 {
    public static final Class144 Field999 = new Class144();
    public static final Class144 Field1000 = new Class144().Method1426(true);
    private boolean Field1001;
    private String Field1002;
    private boolean Field1003;
    private Map Field1004;

    public Class144() {
        this.Field1001 = false;
        this.Field1002 = "content";
        this.Field1003 = false;
        this.Field1004 = Collections.emptyMap();
    }

    @Deprecated
    public Class144(boolean a) {
        this(a, "content", false);
    }

    @Deprecated
    public Class144(String a) {
        this(false, a, false);
    }

    @Deprecated
    public Class144(boolean a, String a2) {
        this.Field1001 = a;
        this.Field1002 = a2;
        this.Field1003 = false;
    }

    @Deprecated
    public Class144(boolean a, String a2, boolean a3) {
        this.Field1001 = a;
        this.Field1002 = a2;
        this.Field1003 = a3;
    }

    private Class144(boolean a, String a2, boolean a3, Map a4) {
        this.Field1001 = a;
        this.Field1002 = a2;
        this.Field1003 = a3;
        this.Field1004 = Collections.unmodifiableMap((Map)a4);
    }

    protected Class144 Method1424() {
        return new Class144(this.Field1001, this.Field1002, this.Field1003, this.Field1004);
    }

    public boolean Method1425() {
        return this.Field1001;
    }

    public Class144 Method1426(boolean a) {
        Class144 a2 = this.Method1424();
        a2.Field1001 = a;
        return a2;
    }

    public String Method1427() {
        return this.Field1002;
    }

    public Class144 Method1428(String a) {
        Class144 a2 = this.Method1424();
        a2.Field1002 = a;
        return a2;
    }

    public boolean Method1429() {
        return this.Field1003;
    }

    public Class144 Method1430(boolean a) {
        Class144 a2 = this.Method1424();
        a2.Field1003 = a;
        return a2;
    }

    public Map Method1431() {
        return this.Field1004;
    }

    public Class144 Method1432(Map a) {
        Class144 a2 = this.Method1424();
        HashMap a3 = new HashMap(a);
        a2.Field1004 = Collections.unmodifiableMap((Map)a3);
        return a2;
    }

    protected Object Method1433() throws CloneNotSupportedException {
        return this.Method1424();
    }
}