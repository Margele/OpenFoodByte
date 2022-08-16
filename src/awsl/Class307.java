/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class305;
import obfuscate.a;

public class Class307 {
    private String Field1590;
    private String Field1591;

    public Class307(String a2, String a3) {
        boolean bl = Class305.Method710();
        this.Field1590 = a2;
        boolean bl2 = bl;
        this.Field1591 = a3;
        if (a.trash() == null) {
            Class305.Method709(false);
        }
    }

    public String Method744() {
        return this.Field1590;
    }

    public String Method745() {
        return this.Field1591;
    }

    public void Method746(String a2) {
        this.Field1591 = a2;
    }
}