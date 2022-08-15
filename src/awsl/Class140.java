/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package awsl;

import awsl.Class142;
import java.util.Iterator;

final class Class140
implements Iterable {
    final String Field992;

    Class140(String string) {
        this.Field992 = string;
    }

    public Iterator Method1383() {
        return new Class142(this);
    }
}