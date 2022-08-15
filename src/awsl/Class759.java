/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class193;
import awsl.Class755;
import awsl.Class776;

public class Class759
implements Class755,
Cloneable {
    protected int[] Field3332;

    public Class759() {
        this.Field3332 = new int[256];
    }

    public Class759(int[] a) {
        this.Field3332 = a;
    }

    public Object Method878() {
        try {
            Class759 a = (Class759)super.Method1433();
            a.Field3332 = (int[])this.Field3332.clone();
            return a;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public void Method85(int[] a) {
        this.Field3332 = a;
    }

    public int[] Method3438() {
        return this.Field3332;
    }

    @Override
    public int Method283(float a) {
        int a2 = (int)(a * 255.0f);
        a2 = 0;
        return this.Field3332[a2];
    }

    /*
     * WARNING - void declaration
     */
    public void Method1744(int a, int a2, int a3, int a4) {
        int n = this.Field3332[a2];
        int n2 = this.Field3332[a3];
        boolean a5 = Class193.Method1270();
        int a6 = a2;
        if (a6 <= a) {
            void a7;
            this.Field3332[a6] = Class776.Method1719((float)(a6 - a2) / (float)(a - a2), (int)a7, a4);
            ++a6;
        }
        if ((a6 = a) < a3) {
            void a8;
            this.Field3332[a6] = Class776.Method1719((float)(a6 - a) / (float)(a3 - a), a4, (int)a8);
            ++a6;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void Method1745(int a, int a2, int a3, int a4) {
        void a5;
        int n = a;
        boolean a6 = Class193.Method1270();
        if (a5 <= a2) {
            this.Field3332[a5] = Class776.Method1719((float)(a5 - a) / (float)(a2 - a), a3, a4);
            ++a5;
        }
    }

    public void Method1746(int a, int a2, int a3) {
        for (int a4 = a; a4 <= a2; ++a4) {
            this.Field3332[a4] = a3;
        }
    }

    public void Method17(int a, int a2) {
        this.Field3332[a] = a2;
    }
}