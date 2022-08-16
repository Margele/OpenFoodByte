/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.BufferedInputStream
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Properties
 *  java.util.Set
 */
package awsl;

import awsl.Class690;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import obfuscate.b;

public class Class71 {
    public final Properties Field686 = new Properties();
    public final Set Field687;

    public Class71(String a) throws IOException {
        BufferedInputStream a2 = null;
        try {
            a2 = new BufferedInputStream((InputStream)new FileInputStream(a));
            this.Field686.load((InputStream)a2);
            this.Field687 = new HashSet((Collection)this.Field686.keySet());
        }
        finally {
            a2.Method2519();
        }
    }

    public String Method3759(String a) {
        int a2;
        String a3 = (String)this.Field686.get((Object)a);
        String[] a4 = Class690.Method2342();
        int a5 = a.indexOf(46);
        if (a5 == -1) {
            a3 = a;
        }
        if ((a2 = a.indexOf(40)) == -1) {
            a3 = a.substring(a5 + 1);
        }
        a3 = a.substring(a5 + 1, a2);
        this.Field687.remove((Object)a);
        return a3;
    }

    public String Method3760(String a2) {
        if (a2.startsWith("(")) {
            b[] a3 = b.Method3211(a2);
            b a4 = b.Method3213(a2);
            for (int a5 = 0; a5 < a3.length; ++a5) {
                a3[a5] = this.Method3761(a3[a5]);
            }
            a4 = this.Method3761(a4);
            return b.Method3226(a4, a3);
        }
        return this.Method3761(b.Method3204(a2)).Method3225();
    }

    private b Method3761(b a2) {
        String[] a3 = Class690.Method2342();
        if (a2.Method3217() == 10) {
            return b.Method3205(this.Method3759(a2.Method3221()));
        }
        if (a2.Method3217() == 9) {
            String a4 = this.Method3761(a2.Method3219()).Method3225();
            int a5 = 0;
            if (a5 < a2.Method3218()) {
                a4 = '[' + a4;
                ++a5;
            }
            return b.Method3204(a4);
        }
        return a2;
    }

    private static IOException Method3762(IOException iOException) {
        return iOException;
    }
}