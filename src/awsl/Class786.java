/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package awsl;

import awsl.Class46;
import awsl.Class731;
import awsl.Class797;
import awsl.Class91;
import java.util.List;

public abstract class Class786 {
    protected final int Field3540;
    private static int[] Field3541;

    protected Class786(int a) {
        this.Field3540 = a;
    }

    public abstract Class797 Method907(Class46 var1);

    public abstract Class797 Method908(Class91 var1) throws Class731;

    public abstract Class797 Method909(Class91 var1, Class797 var2) throws Class731;

    public abstract Class797 Method910(Class91 var1, Class797 var2) throws Class731;

    public abstract Class797 Method911(Class91 var1, Class797 var2, Class797 var3) throws Class731;

    public abstract Class797 Method912(Class91 var1, Class797 var2, Class797 var3, Class797 var4) throws Class731;

    public abstract Class797 Method913(Class91 var1, List var2) throws Class731;

    public abstract void Method914(Class91 var1, Class797 var2, Class797 var3) throws Class731;

    public abstract Class797 Method915(Class797 var1, Class797 var2);

    public static void Method916(int[] nArray) {
        Field3541 = nArray;
    }

    public static int[] Method917() {
        return Field3541;
    }

    static {
        if (Class786.Method917() != null) {
            Class786.Method916(new int[1]);
        }
    }
}