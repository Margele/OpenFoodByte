/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class664
extends Enum {
    public static final Class664 BODY = new Class664("BODY", 0, "Body");
    public static final Class664 LEFT_ARM = new Class664("LEFT_ARM", 1, "LeftArm");
    public static final Class664 RIGHT_ARM = new Class664("RIGHT_ARM", 2, "RightArm");
    public static final Class664 LEFT_LEG = new Class664("LEFT_LEG", 3, "LeftLeg");
    public static final Class664 RIGHT_LEG = new Class664("RIGHT_LEG", 4, "RightLeg");
    public static final Class664 HEAD = new Class664("HEAD", 5, "Head");
    private final String Field2935;
    private static final Class664[] Field2936 = new Class664[]{BODY, LEFT_ARM, RIGHT_ARM, LEFT_LEG, RIGHT_LEG, HEAD};

    public static Class664[] Method2414() {
        return (Class664[])Field2936.clone();
    }

    public static Class664 Method2415(String a) {
        return (Class664)Enum.valueOf(Class664.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class664() {
        void a;
        void var2_-1;
        void var1_-1;
        this.Field2935 = a;
    }

    public String Method497() {
        return this.Field2935;
    }

    static String Method2416(Class664 a) {
        return a.Field2935;
    }
}