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
import awsl.Class91;
import java.util.ArrayList;
import java.util.List;

public class Class215 {
    private static List Field1206 = new ArrayList();

    public static List Method2649() {
        return Field1206;
    }

    public static boolean Method2650(String a) {
        String[] a2 = Class207.Method2434();
        if (Field1206.stream().filter(arg_0 -> Class215.Method2655(a, arg_0)).count() <= 0L) {
            return false;
        }
        Class207 a3 = (Class207)Field1206.stream().filter(arg_0 -> Class215.Method2654(a, arg_0)).findFirst().get();
        Class91.Method3647(new String[1]);
        return true;
    }

    public static Class207 Method2651(String a) {
        String[] stringArray = Class207.Method2434();
        Class207 class207 = Field1206.stream().noneMatch(arg_0 -> Class215.Method2653(a, arg_0)) ? null : (Class207)Field1206.stream().filter(arg_0 -> Class215.Method2652(a, arg_0)).findFirst().get();
        if (Class91.Method3648() == null) {
            Class207.Method2433(new String[3]);
        }
        return class207;
    }

    private static boolean Method2652(String a, Class207 a2) {
        return a2.Method2419().equalsIgnoreCase(a);
    }

    private static boolean Method2653(String a, Class207 a2) {
        return a2.Method2419().equalsIgnoreCase(a);
    }

    private static boolean Method2654(String a, Class207 a2) {
        return a2.Method2419().equalsIgnoreCase(a);
    }

    private static boolean Method2655(String a, Class207 a2) {
        return a2.Method2419().equalsIgnoreCase(a);
    }
}