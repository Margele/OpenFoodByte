/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class674;
import java.io.IOException;
import java.io.OutputStream;

final class Class678
implements Class674 {
    private final OutputStream Field2959;

    Class678(OutputStream a) {
        this.Field2959 = a;
    }

    @Override
    public OutputStream Method2334(String a) throws IOException {
        return this.Field2959;
    }

    @Override
    public void Method2335() throws IOException {
        this.Field2959.flush();
    }
}