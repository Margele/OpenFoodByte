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
import java.util.Map;
import obfuscate.a;

public class Class98
extends a {
    public String Field824;
    public String Field825;
    public String Field826;
    public boolean Field827;
    private static int[] Field828;

    @Deprecated
    public Class98(int a2, String a3, String a4, String a5) {
        this(a2, a3, a4, a5, a2 == 185);
    }

    public Class98(int a2, String a3, String a4, String a5, boolean a6) {
        super(a2);
        this.Field824 = a3;
        this.Field825 = a4;
        this.Field826 = a5;
        this.Field827 = a6;
    }

    public void Method68(int a2) {
        this.Field796 = a2;
    }

    @Override
    public int Method0() {
        return 5;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1954(this.Field796, this.Field824, this.Field825, this.Field826, this.Field827);
    }

    @Override
    public a Method2(Map a2) {
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