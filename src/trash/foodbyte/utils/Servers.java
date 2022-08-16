/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package trash.foodbyte.utils;

public final class Servers
extends Enum {
    public static final Servers SB = new Servers("SB", 0);
    public static final Servers SW = new Servers("SW", 1);
    public static final Servers BW = new Servers("BW", 2);
    public static final Servers UHC = new Servers("UHC", 3);
    public static final Servers SG = new Servers("SG", 4);
    public static final Servers MW = new Servers("MW", 5);
    public static final Servers PRE = new Servers("PRE", 6);
    public static final Servers DUELS = new Servers("DUELS", 7);
    public static final Servers PIT = new Servers("PIT", 8);
    public static final Servers NONE = new Servers("NONE", 9);
    public static final Servers LOBBY = new Servers("LOBBY", 10);
    public static final Servers MM = new Servers("MM", 11);
    private static final /* synthetic */ Servers[] ALL_SERVERS;

    public static Servers[] getAllServers() {
        return (Servers[])ALL_SERVERS.clone();
    }

    public static Servers getServerByString(String str) {
        return (Servers)Enum.valueOf(Servers.class, (String)str);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Servers() {
        void var2_-1;
        void var1_-1;
    }

    static {
        ALL_SERVERS = new Servers[]{SB, SW, BW, UHC, SG, MW, PRE, DUELS, PIT, NONE, LOBBY, MM};
    }
}