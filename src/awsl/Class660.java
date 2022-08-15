/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipOutputStream
 */
package awsl;

import awsl.Class674;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

final class Class660
implements Class674 {
    private ZipOutputStream Field2930;

    Class660(ZipOutputStream a) {
        this.Field2930 = a;
    }

    @Override
    public OutputStream Method2334(String a) throws IOException {
        ZipEntry a2 = new ZipEntry(a);
        this.Field2930.putNextEntry(a2);
        return this.Field2930;
    }

    @Override
    public void Method2335() throws IOException {
        this.Field2930.flush();
        this.Field2930.closeEntry();
    }
}