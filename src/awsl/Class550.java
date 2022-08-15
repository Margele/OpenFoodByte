/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class234;
import awsl.Class608;
import awsl.Class609;
import awsl.Class612;

public class Class550
implements Class609 {
    private String Field2540;
    private static int[] Field2541;

    public Class550() {
    }

    public Class550(String a) {
        this.Field2540 = a;
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2540 = a.Method497();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method496(this.Field2540);
    }

    public String Method692() {
        return this.Field2540;
    }

    public void Method689(Class612 a) {
        a.Method3766(this);
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method689((Class612)class608);
    }

    public static void Method757(int[] nArray) {
        Field2541 = nArray;
    }

    public static int[] Method758() {
        return Field2541;
    }

    static {
        if (Class550.Method758() == null) {
            Class550.Method757(new int[4]);
        }
    }
}