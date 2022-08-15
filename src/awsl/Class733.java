/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class733
extends Enum {
    public static final Class733 HELLO = new Class733("HELLO", 0, -1, "d");
    public static final Class733 LOGIN = new Class733("LOGIN", 1, 0, "b");
    public static final Class733 PLAY = new Class733("PLAY", 2, 1, "a");
    public static final Class733 ALL = new Class733("ALL", 3, 2, "f", "ALL");
    public static final Class733 OFFLINE = new Class733("OFFLINE", 4, 3, "c");
    private int Field3213;
    private String Field3214;
    private String Field3215;
    private static final /* synthetic */ Class733[] Field3216;

    public static Class733[] Method2025() {
        return (Class733[])Field3216.clone();
    }

    public static Class733 Method2026(String a) {
        return (Class733)Enum.valueOf(Class733.class, (String)a);
    }

    /*
     * WARNING - void declaration
     */
    private Class733() {
        void a;
        void a2;
        void var2_-1;
        void var1_-1;
        this.Field3213 = a2;
        this.Field3214 = a;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class733(String a) {
        void a2;
        void a3;
        void var2_-1;
        void var1_-1;
        this.Field3213 = (int)a;
        this.Field3214 = a3;
        this.Field3215 = a2;
    }

    public int Method10() {
        return this.Field3213;
    }

    public String Method497() {
        return this.Field3214;
    }

    public String Method2027() {
        return this.Field3215;
    }

    static {
        Field3216 = new Class733[]{HELLO, LOGIN, PLAY, ALL, OFFLINE};
    }
}