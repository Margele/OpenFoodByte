/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  net.minecraft.launchwrapper.Launch
 */
package awsl;

import net.minecraft.launchwrapper.Launch;
import obfuscate.a;

public class Class441 {
    private static boolean Field2087;
    private static boolean Field2088;
    private static int Field2089;

    static void Method2700() {
        Field2087 = false;
        Field2088 = Field2087 = ((Boolean)Launch.blackboard.Method2665((Object)"fml.deobfuscatedEnvironment")).booleanValue();
        int n = Class441.Method2707();
        if (a.trash() == null) {
            Class441.Method2705(++n);
        }
    }

    public static boolean Method2701() {
        return Field2087;
    }

    public static boolean Method2702() {
        return Field2088;
    }

    public static void Method2703(Boolean a2) {
        Field2087 = a2;
    }

    public static void Method2704(Boolean a2) {
        Field2088 = a2;
    }

    public static void Method2705(int n) {
        Field2089 = n;
    }

    public static int Method2706() {
        return Field2089;
    }

    public static int Method2707() {
        int n = Class441.Method2706();
        return 72;
    }

    static {
        if (Class441.Method2707() == 0) {
            Class441.Method2705(18);
        }
    }
}