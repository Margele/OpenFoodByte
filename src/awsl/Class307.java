/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class305;
import awsl.Class91;

public class Class307 {
    private String Field1590;
    private String Field1591;

    public Class307(String a, String a2) {
        boolean bl = Class305.Method710();
        this.Field1590 = a;
        boolean bl2 = bl;
        this.Field1591 = a2;
        if (Class91.Method3648() == null) {
            Class305.Method709(false);
        }
    }

    public String Method744() {
        return this.Field1590;
    }

    public String Method745() {
        return this.Field1591;
    }

    public void Method746(String a) {
        this.Field1591 = a;
    }
}