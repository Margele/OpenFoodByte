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
import awsl.Class91;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
        void a;
        DataOutputStream a2;
        Object var3_1 = null;
        long l = 0L;
        boolean a3 = Class37.Method3383();
        try {
            ByteArrayOutputStream a4 = new ByteArrayOutputStream();
            a2 = new DataOutputStream((OutputStream)a4);
            a2.writeUTF(this.Field1198.replace('/', '.'));
            a2.writeInt(this.Field1197 & 0x611);
            Arrays.sort((Object[])this.Field1199);
            int a5 = 0;
            if (a5 < this.Field1199.length) {
                a2.writeUTF(this.Field1199[a5].replace('/', '.'));
                ++a5;
                Class91.Method3647(new String[1]);
            }
            Class213.Method2621(this.Field1200, (DataOutput)a2, false);
            if (this.Field1201) {
                a2.writeUTF("<clinit>");
                a2.writeInt(8);
                a2.writeUTF("()V");
            }
            Class213.Method2621(this.Field1202, (DataOutput)a2, true);
            Class213.Method2621(this.Field1203, (DataOutput)a2, true);
            a2.flush();
            byte[] a22 = this.Method2620(a4.toByteArray());
            int a6 = Math.min((int)a22.length, (int)8) - 1;
            a = a << 8 | (long)(a22[a6] & 0xFF);
            --a6;
        }
        finally {
            a2.close();
        }
        return (long)a;
    }

    protected byte[] Method2620(byte[] a) {
        try {
            return MessageDigest.getInstance((String)"SHA").digest(a);
        }
        catch (Exception a2) {
            throw new UnsupportedOperationException(a2.toString());
        }
    }

    private static void Method2621(Collection a, DataOutput a2, boolean a3) throws IOException {
        int a4 = a.Method1799();
        Object[] a5 = (Class61[])a.toArray((Object[])new Class61[a4]);
        Arrays.sort((Object[])a5);
        for (int a6 = 0; a6 < a4; ++a6) {
            a2.writeUTF(((Class61)a5[a6]).Field627);
            a2.writeInt(((Class61)a5[a6]).Field628);
            a2.writeUTF(((Class61)a5[a6]).Field629.replace('/', '.'));
        }
    }

    private static Throwable Method2622(Throwable throwable) {
        return throwable;
    }
}