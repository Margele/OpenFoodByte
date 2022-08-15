/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package awsl;

import awsl.Class290;
import awsl.Class666;

public class Class291
extends Class290 {
    public Class291(String a) {
        super(a);
    }

    /*
     * WARNING - void declaration
     */
    public String Method2899() throws Class666 {
        void a;
        char a2;
        StringBuilder stringBuilder = new StringBuilder();
        int[] a3 = Class666.Method3438();
        while (Character.isWhitespace((char)(a2 = this.Method2885()))) {
        }
        if (a2 == '\"' || a2 == '\'') {
            char a4 = a2;
            a2 = this.Method2885();
            if (a2 < ' ') {
                throw this.Method2895("Unterminated string.");
            }
            if (a2 == a4) {
                return a.toString();
            }
            a.append(a2);
        }
        while (true) {
            if (Character.isWhitespace((char)a2)) {
                return a.toString();
            }
            a.append(a2);
            a2 = this.Method2885();
        }
    }

    private static Class666 Method2906(Class666 class666) {
        return class666;
    }
}