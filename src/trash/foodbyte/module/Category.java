/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package trash.foodbyte.module;

public final class Category
extends Enum {
    public static final Category COMBAT;
    public static final Category MOVEMENT;
    public static final Category RENDER;
    public static final Category PLAYER;
    public static final Category WORLD;
    public static final Category SKYBLOCK;
    public String Field2976;
    private static final /* synthetic */ Category[] Field2977;
    private static int[] Field2978;

    public static Category[] Method2760() {
        return (Category[])Field2977.clone();
    }

    public static Category Method2761(String a) {
        return (Category)Enum.valueOf(Category.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Category(String a) {
        void a2;
        void var1_-1;
        this.Field2976 = a2;
    }

    static {
        Category.Method85(null);
        COMBAT = new Category("COMBAT", 0, "COMBAT", 0, "Combat");
        MOVEMENT = new Category("MOVEMENT", 1, "MOVEMENT", 1, "Movement");
        RENDER = new Category("RENDER", 2, "RENDER", 2, "Render");
        PLAYER = new Category("PLAYER", 3, "PLAYER", 3, "Player");
        WORLD = new Category("WORLD", 4, "WORLD", 4, "World");
        SKYBLOCK = new Category("SKYBLOCK", 5, "SKYBLOCK", 5, "SkyBlock");
        Field2977 = new Category[]{COMBAT, MOVEMENT, RENDER, PLAYER, WORLD, SKYBLOCK};
    }

    public static void Method85(int[] nArray) {
        Field2978 = nArray;
    }

    public static int[] Method3438() {
        return Field2978;
    }
}