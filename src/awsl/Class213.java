/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.DataOutput
 *  java.io.DataOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.security.MessageDigest
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 */
package awsl;

import awsl.Class167;
import awsl.Class253;
import awsl.Class267;
import awsl.Class37;
import awsl.Class61;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import obfuscate.a;

public class Class213
extends Class167 {
    private boolean Field1195;
    private boolean Field1196;
    private int Field1197;
    private String Field1198;
    private String[] Field1199;
    private Collection Field1200 = new ArrayList();
    private boolean Field1201;
    private Collection Field1202 = new ArrayList();
    private Collection Field1203 = new ArrayList();

    public Class213(Class167 a) {
        this(327680, a);
        if (this.getClass() != Class213.class) {
            throw new IllegalStateException();
        }
    }

    protected Class213(int a, Class167 a2) {
        super(a, a2);
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        boolean bl = this.Field1195 = (a2 & 0x200) == 0;
        if (this.Field1195) {
            this.Field1198 = a3;
            this.Field1197 = a2;
            this.Field1199 = new String[a6.length];
            System.arraycopy((Object)a6, (int)0, (Object)this.Field1199, (int)0, (int)a6.length);
        }
        super.Method1447(a, a2, a3, a4, a5, a6);
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        block4: {
            boolean a6 = Class37.Method3382();
            if (!this.Field1195) break block4;
            if ("<clinit>".equals((Object)a2)) {
                this.Field1201 = true;
            }
            int a7 = a & 0xD3F;
            if ((a & 2) == 0) {
                if ("<init>".equals((Object)a2)) {
                    this.Field1202.Method2530((Object)new Class61(a2, a7, a3));
                }
                if (!"<clinit>".equals((Object)a2)) {
                    this.Field1203.Method2530((Object)new Class61(a2, a7, a3));
                }
            }
        }
        return super.Method1451(a, a2, a3, a4, a5);
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        if (this.Field1195) {
            if ("serialVersionUID".equals((Object)a2)) {
                this.Field1195 = false;
                this.Field1196 = true;
            }
            if ((a & 2) == 0 || (a & 0x88) == 0) {
                int a6 = a & 0xDF;
                this.Field1200.Method2530((Object)new Class61(a2, a6, a3));
            }
        }
        return super.Method1450(a, a2, a3, a4, a5);
    }

    @Override
    public void Method1452(String a, String a2, String a3, int a4) {
        if (this.Field1198 != null && this.Field1198.equals((Object)a)) {
            this.Field1197 = a4;
        }
        super.Method1452(a, a2, a3, a4);
    }

    @Override
    public void Method1460() {
        if (this.Field1195 && !this.Field1196) {
            try {
                this.Method2618(this.Method2619());
            }
            catch (Throwable a) {
                throw new RuntimeException("Error while computing SVUID for " + this.Field1198, a);
            }
        }
        super.Method1460();
    }

    public boolean Method2617() {
        return this.Field1196;
    }

    protected void Method2618(long a) {
        Class253 a2 = super.Method1450(24, "serialVersionUID", "J", null, new Long(a));
        a2.Method2121();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    protected long Method2619() throws IOException {
        void a2;
        DataOutputStream a3;
        Object var3_1 = null;
        long l = 0L;
        boolean a4 = Class37.Method3383();
        try {
            ByteArrayOutputStream a5 = new ByteArrayOutputStream();
            a3 = new DataOutputStream((OutputStream)a5);
            a3.writeUTF(this.Field1198.replace('/', '.'));
            a3.writeInt(this.Field1197 & 0x611);
            Arrays.sort((Object[])this.Field1199);
            int a6 = 0;
            if (a6 < this.Field1199.length) {
                a3.writeUTF(this.Field1199[a6].replace('/', '.'));
                ++a6;
                a.trash(new String[1]);
            }
            Class213.Method2621(this.Field1200, (DataOutput)a3, false);
            if (this.Field1201) {
                a3.writeUTF("<clinit>");
                a3.writeInt(8);
                a3.writeUTF("()V");
            }
            Class213.Method2621(this.Field1202, (DataOutput)a3, true);
            Class213.Method2621(this.Field1203, (DataOutput)a3, true);
            a3.flush();
            byte[] a22 = this.Method2620(a5.toByteArray());
            int a7 = Math.min((int)a22.length, (int)8) - 1;
            a2 = a2 << 8 | (long)(a22[a7] & 0xFF);
            --a7;
        }
        finally {
            a3.close();
        }
        return (long)a2;
    }

    protected byte[] Method2620(byte[] a2) {
        try {
            return MessageDigest.getInstance((String)"SHA").digest(a2);
        }
        catch (Exception a3) {
            throw new UnsupportedOperationException(a3.toString());
        }
    }

    private static void Method2621(Collection a2, DataOutput a3, boolean a4) throws IOException {
        int a5 = a2.Method1799();
        Object[] a6 = (Class61[])a2.toArray((Object[])new Class61[a5]);
        Arrays.sort((Object[])a6);
        for (int a7 = 0; a7 < a5; ++a7) {
            a3.writeUTF(((Class61)a6[a7]).Field627);
            a3.writeInt(((Class61)a6[a7]).Field628);
            a3.writeUTF(((Class61)a6[a7]).Field629.replace('/', '.'));
        }
    }

    private static Throwable Method2622(Throwable throwable) {
        return throwable;
    }
}