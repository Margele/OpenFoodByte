/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class262;
import awsl.Class278;
import obfuscate.a;

public class Class277
extends Class278 {
    private static String Field1514;

    public Class277(Number a, Number a2) {
        super(a, a2, (Number)Integer.valueOf((int)0));
    }

    public Class262 Method2817() {
        String string = Class277.Method2819();
        Class262 class262 = new Class262(this.Method2811(), this.Method2812(), this.Method2813());
        a.trash(new String[5]);
        return class262;
    }

    public static void Method2818(String string) {
        Field1514 = string;
    }

    public static String Method2819() {
        return Field1514;
    }

    static {
        if (Class277.Method2819() == null) {
            Class277.Method2818("Kak6Y");
        }
    }
}