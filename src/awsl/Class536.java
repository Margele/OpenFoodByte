/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package awsl;

import awsl.Class234;
import awsl.Class562;
import awsl.Class608;
import awsl.Class609;
import awsl.Class611;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import obfuscate.a;

public class Class536
implements Class609 {
    private List Field2473;

    public Class536() {
    }

    public Class536(List a) {
        this.Field2473 = a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method687(Class234 a2) {
        void a3;
        void a4;
        ArrayList a5 = new ArrayList();
        int n = a2.readInt();
        boolean bl = false;
        int a6 = Class562.Method1190();
        if (a4 < a3) {
            a5.Method2530((Object)a2.Method497());
            ++a4;
            a.trash(new String[3]);
        }
        this.Field2473 = new ArrayList();
        this.Field2473.addAll((Collection)a5);
    }

    @Override
    public void Method688(Class234 a2) {
        int n = Class562.Method906();
        a2.writeInt(this.Method845().Method1799());
        int a3 = n;
        int a4 = 0;
        if (a4 < this.Method845().Method1799()) {
            String a5 = (String)this.Method845().get(a4);
            a2.Method496(a5);
            ++a4;
        }
    }

    public void Method794(Class611 a2) {
        a2.Method3723(this);
    }

    public List Method845() {
        return this.Field2473;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method794((Class611)class608);
    }
}