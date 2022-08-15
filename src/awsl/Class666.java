/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package awsl;

public class Class666
extends RuntimeException {
    private static final long Field2939 = 0L;
    private static int[] Field2940;

    public Class666(String a) {
        super(a);
    }

    public Class666(String a, Throwable a2) {
        super(a, a2);
    }

    public Class666(Throwable a) {
        super(a.getMessage(), a);
    }

    public static void Method85(int[] nArray) {
        Field2940 = nArray;
    }

    public static int[] Method3438() {
        return Field2940;
    }

    static {
        if (Class666.Method3438() != null) {
            Class666.Method85(new int[3]);
        }
    }
}