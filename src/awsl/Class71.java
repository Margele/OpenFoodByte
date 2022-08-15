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

import awsl.Class46;
import awsl.Class690;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

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

    public String Method3760(String a) {
        if (a.startsWith("(")) {
            Class46[] a2 = Class46.Method3211(a);
            Class46 a3 = Class46.Method3213(a);
            for (int a4 = 0; a4 < a2.length; ++a4) {
                a2[a4] = this.Method3761(a2[a4]);
            }
            a3 = this.Method3761(a3);
            return Class46.Method3226(a3, a2);
        }
        return this.Method3761(Class46.Method3204(a)).Method3225();
    }

    private Class46 Method3761(Class46 a) {
        String[] a2 = Class690.Method2342();
        if (a.Method3217() == 10) {
            return Class46.Method3205(this.Method3759(a.Method3221()));
        }
        if (a.Method3217() == 9) {
            String a3 = this.Method3761(a.Method3219()).Method3225();
            int a4 = 0;
            if (a4 < a.Method3218()) {
                a3 = '[' + a3;
                ++a4;
            }
            return Class46.Method3204(a3);
        }
        return a;
    }

    private static IOException Method3762(IOException iOException) {
        return iOException;
    }
}