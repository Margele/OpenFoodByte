/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.xml.sax.Attributes
 */
package awsl;

import awsl.Class134;
import awsl.Class148;
import awsl.Class253;
import awsl.Class31;
import awsl.Class663;
import org.xml.sax.Attributes;

public final class Class273
extends Class253 {
    Class663 Field1475;

    public Class273(Class663 a, Attributes a2) {
        super(327680);
        this.Field1475 = a;
        a.Method2394("field", a2);
    }

    @Override
    public Class148 Method2114(String a, boolean a2) {
        return new Class134(this.Field1475, "annotation", 1, null, a);
    }

    @Override
    public Class148 Method2115(int a, Class31 a2, String a3, boolean a4) {
        return new Class134(this.Field1475, "typeAnnotation", 1, null, a3, a, a2);
    }

    @Override
    public void Method2121() {
        this.Field1475.Method2395("field");
    }
}