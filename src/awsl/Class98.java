/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 */
package awsl;

import awsl.Class267;
import awsl.Class91;
import java.util.Map;

public class Class98
extends Class91 {
    public String Field824;
    public String Field825;
    public String Field826;
    public boolean Field827;
    private static int[] Field828;

    @Deprecated
    public Class98(int a, String a2, String a3, String a4) {
        this(a, a2, a3, a4, a == 185);
    }

    public Class98(int a, String a2, String a3, String a4, boolean a5) {
        super(a);
        this.Field824 = a2;
        this.Field825 = a3;
        this.Field826 = a4;
        this.Field827 = a5;
    }

    public void Method68(int a) {
        this.Field796 = a;
    }

    @Override
    public int Method0() {
        return 5;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1954(this.Field796, this.Field824, this.Field825, this.Field826, this.Field827);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class98(this.Field796, this.Field824, this.Field825, this.Field826, this.Field827);
    }

    public static void Method3638(int[] nArray) {
        Field828 = nArray;
    }

    public static int[] Method3639() {
        return Field828;
    }

    static {
        if (Class98.Method3639() != null) {
            Class98.Method3638(new int[2]);
        }
    }
}