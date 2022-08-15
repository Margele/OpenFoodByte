/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class667
extends Enum {
    public static final Class667 SB = new Class667("SB", 0);
    public static final Class667 SW = new Class667("SW", 1);
    public static final Class667 BW = new Class667("BW", 2);
    public static final Class667 UHC = new Class667("UHC", 3);
    public static final Class667 SG = new Class667("SG", 4);
    public static final Class667 MW = new Class667("MW", 5);
    public static final Class667 PRE = new Class667("PRE", 6);
    public static final Class667 DUELS = new Class667("DUELS", 7);
    public static final Class667 PIT = new Class667("PIT", 8);
    public static final Class667 NONE = new Class667("NONE", 9);
    public static final Class667 LOBBY = new Class667("LOBBY", 10);
    public static final Class667 MM = new Class667("MM", 11);
    private static final /* synthetic */ Class667[] Field2941;

    public static Class667[] Method2417() {
        return (Class667[])Field2941.clone();
    }

    public static Class667 Method2418(String a) {
        return (Class667)Enum.valueOf(Class667.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class667() {
        void var2_-1;
        void var1_-1;
    }

    static {
        Field2941 = new Class667[]{SB, SW, BW, UHC, SG, MW, PRE, DUELS, PIT, NONE, LOBBY, MM};
    }
}