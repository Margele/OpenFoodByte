/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package awsl;

import awsl.Class207;
import java.util.ArrayList;
import java.util.List;
import obfuscate.a;

public class Class215 {
    private static List Field1206 = new ArrayList();

    public static List Method2649() {
        return Field1206;
    }

    public static boolean Method2650(String a2) {
        String[] a3 = Class207.Method2434();
        if (Field1206.stream().filter(arg_0 -> Class215.Method2655(a2, arg_0)).count() <= 0L) {
            return false;
        }
        Class207 a4 = (Class207)Field1206.stream().filter(arg_0 -> Class215.Method2654(a2, arg_0)).findFirst().get();
        a.trash(new String[1]);
        return true;
    }

    public static Class207 Method2651(String a2) {
        String[] stringArray = Class207.Method2434();
        Class207 class207 = Field1206.stream().noneMatch(arg_0 -> Class215.Method2653(a2, arg_0)) ? null : (Class207)Field1206.stream().filter(arg_0 -> Class215.Method2652(a2, arg_0)).findFirst().get();
        if (a.trash() == null) {
            Class207.Method2433(new String[3]);
        }
        return class207;
    }

    private static boolean Method2652(String a2, Class207 a3) {
        return a3.Method2419().equalsIgnoreCase(a2);
    }

    private static boolean Method2653(String a2, Class207 a3) {
        return a3.Method2419().equalsIgnoreCase(a2);
    }

    private static boolean Method2654(String a2, Class207 a3) {
        return a3.Method2419().equalsIgnoreCase(a2);
    }

    private static boolean Method2655(String a2, Class207 a3) {
        return a3.Method2419().equalsIgnoreCase(a2);
    }
}