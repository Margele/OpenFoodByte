/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package awsl;

import awsl.Class301;
import java.util.ArrayList;
import java.util.List;

public class Class302 {
    private final List Field1583 = new ArrayList();

    public Class301 Method902() {
        return new Class301(this.Field1583);
    }

    public Class302 Method903(String a) {
        throw new NullPointerException("token cannot be null");
    }

    public Class302 Method904(int a) {
        this.Field1583.Method2530((Object)String.valueOf((int)a));
        return this;
    }

    private static NullPointerException Method905(NullPointerException nullPointerException) {
        return nullPointerException;
    }
}