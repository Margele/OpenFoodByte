/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class677
extends Enum {
    public static final Class677 INSIDE = new Class677("INSIDE", 0);
    public static final Class677 OUTSIDE = new Class677("OUTSIDE", 1);
    public static final Class677 INVERTED = new Class677("INVERTED", 2);
    public static final Class677 FAIL = new Class677("FAIL", 3);
    private static final Class677[] Field2958 = new Class677[]{INSIDE, OUTSIDE, INVERTED, FAIL};

    public static Class677[] Method2350() {
        return (Class677[])Field2958.clone();
    }

    public static Class677 Method2351(String a) {
        return (Class677)Enum.valueOf(Class677.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class677() {
        void var2_-1;
        void var1_-1;
    }
}