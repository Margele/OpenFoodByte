/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class661
extends Enum {
    public static final Class661 FORWARDS = new Class661("FORWARDS", 0);
    public static final Class661 BACKWARDS = new Class661("BACKWARDS", 1);
    private static final /* synthetic */ Class661[] Field2931;

    public static Class661[] Method2382() {
        return (Class661[])Field2931.clone();
    }

    public static Class661 Method2383(String a) {
        return (Class661)Enum.valueOf(Class661.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class661() {
        void var2_-1;
        void var1_-1;
    }

    public Class661 Method2384() {
        if (this == FORWARDS) {
            return BACKWARDS;
        }
        return FORWARDS;
    }

    static {
        Field2931 = new Class661[]{FORWARDS, BACKWARDS};
    }
}