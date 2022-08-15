/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.Writer
 *  java.lang.Object
 *  java.lang.Override
 *  org.xml.sax.ContentHandler
 */
package awsl;

import awsl.Class672;
import awsl.Class738;
import java.io.Writer;
import org.xml.sax.ContentHandler;

final class Class676
implements Class672 {
    private final Writer Field2956;
    private final boolean Field2957;

    Class676(Writer a, boolean a2) {
        this.Field2956 = a;
        this.Field2957 = a2;
    }

    @Override
    public final ContentHandler Method2326() {
        return new Class738(this.Field2956, this.Field2957);
    }
}