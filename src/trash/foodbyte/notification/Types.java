/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package trash.foodbyte.notification;

import java.awt.Color;

public final class Types
extends Enum {
    public static final Types SUCCESS = new Types("SUCCESS", 0, "SUCCESS", 0, new Color(3522898).getRGB());
    public static final Types INFO = new Types("INFO", 1, "INFO", 1, new Color(3644396).getRGB());
    public static final Types WARNING = new Types("WARNING", 2, "WARNING", 2, new Color(13807392).getRGB());
    public static final Types ERROR = new Types("ERROR", 3, "ERROR", 3, new Color(0xC83333).getRGB());
    private final int Field2954;
    private static final /* synthetic */ Types[] Field2955;

    public static Types[] Method2346() {
        return (Types[])Field2955.clone();
    }

    public static Types Method2347(String a) {
        return (Types)Enum.valueOf(Types.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Types(int a) {
        void a2;
        void var1_-1;
        this.Field2954 = a2;
    }

    public int Method10() {
        return this.Field2954;
    }

    static {
        Field2955 = new Types[]{SUCCESS, INFO, WARNING, ERROR};
    }
}