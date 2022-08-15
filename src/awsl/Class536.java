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
import awsl.Class91;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
    public void Method687(Class234 a) {
        void a2;
        void a3;
        ArrayList a4 = new ArrayList();
        int n = a.readInt();
        boolean bl = false;
        int a5 = Class562.Method1190();
        if (a3 < a2) {
            a4.Method2530((Object)a.Method497());
            ++a3;
            Class91.Method3647(new String[3]);
        }
        this.Field2473 = new ArrayList();
        this.Field2473.addAll((Collection)a4);
    }

    @Override
    public void Method688(Class234 a) {
        int n = Class562.Method906();
        a.writeInt(this.Method845().Method1799());
        int a2 = n;
        int a3 = 0;
        if (a3 < this.Method845().Method1799()) {
            String a4 = (String)this.Method845().get(a3);
            a.Method496(a4);
            ++a3;
        }
    }

    public void Method794(Class611 a) {
        a.Method3723(this);
    }

    public List Method845() {
        return this.Field2473;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method794((Class611)class608);
    }
}