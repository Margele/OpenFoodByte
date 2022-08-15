/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.Override
 *  org.xml.sax.ContentHandler
 */
package awsl;

import awsl.Class169;
import awsl.Class672;
import awsl.Class732;
import java.io.OutputStream;
import org.xml.sax.ContentHandler;

final class Class892
implements Class672 {
    final OutputStream Field3915;

    Class892(OutputStream a) {
        this.Field3915 = a;
    }

    @Override
    public final ContentHandler Method2326() {
        Class169 a = new Class169(1);
        return new Class732(this, a, a);
    }
}