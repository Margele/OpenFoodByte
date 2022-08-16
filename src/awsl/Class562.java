/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  awsl.Class234
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package awsl;

import awsl.Class234;
import awsl.Class606;
import awsl.Class608;
import awsl.Class609;
import awsl.Class611;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import obfuscate.a;

public class Class562
implements Class609 {
    private List Field2623;
    private static int Field2624;

    public Class562() {
    }

    public Class562(List a) {
        this.Field2623 = a;
    }

    @Override
    public void Method687(Class234 a2) {
        ArrayList a3 = new ArrayList();
        int a4 = Class562.Method906();
        int a5 = 0;
        int a6 = a2.readInt();
        if (a5 < a6) {
            a3.Method2530((Object)a2.Method2092());
            ++a5;
        }
        this.Field2623 = new ArrayList();
        this.Field2623.addAll((Collection)a3);
        if (a.trash() == null) {
            Class562.Method1189(++a4);
        }
    }

    @Override
    public void Method688(Class234 a2) {
        int n = Class562.Method906();
        a2.writeInt(this.Method845().Method1799());
        int a3 = 0;
        int a4 = n;
        if (a3 < this.Method845().Method1799()) {
            Class606 a5 = (Class606)this.Method845().get(a3);
            a2.Method2093(a5);
            ++a3;
        }
    }

    public void Method794(Class611 a2) {
        a2.Method3718(this);
    }

    public List Method845() {
        return this.Field2623;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method794((Class611)class608);
    }

    public static void Method1189(int n) {
        Field2624 = n;
    }

    public static int Method906() {
        return Field2624;
    }

    public static int Method1190() {
        int n = Class562.Method906();
        return 19;
    }

    static {
        if (Class562.Method906() == 0) {
            Class562.Method1189(31);
        }
    }
}