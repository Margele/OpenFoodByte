/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package awsl;

import awsl.Class279;
import awsl.Class46;
import awsl.Class52;
import java.util.HashMap;

public class Class690
extends HashMap {
    private final Class52 Field2979 = new Class52();
    private final Class52 Field2980 = new Class52();
    private final Class52 Field2981 = new Class52();
    private final Class52 Field2982 = new Class52();
    private final Class52 Field2983 = new Class52();
    private static String[] Field2984;

    public Class52 Method2492(int a) {
        this.Field2979.Method3186(a);
        Class52 a2 = this.Method2506(this.Field2979);
        a2 = new Class52(this.Field2979);
        this.Method2507(a2);
        return a2;
    }

    public Class52 Method2493(float a) {
        this.Field2979.Method3188(a);
        Class52 a2 = this.Method2506(this.Field2979);
        a2 = new Class52(this.Field2979);
        this.Method2507(a2);
        return a2;
    }

    public Class52 Method2494(long a) {
        this.Field2979.Method3187(a);
        Class52 a2 = this.Method2506(this.Field2979);
        a2 = new Class52(this.Field2979);
        this.Method2507(a2);
        return a2;
    }

    public Class52 Method2495(double a) {
        this.Field2979.Method3189(a);
        Class52 a2 = this.Method2506(this.Field2979);
        a2 = new Class52(this.Field2979);
        this.Method2507(a2);
        return a2;
    }

    public Class52 Method2496(String a) {
        this.Field2979.Method3190('s', a, null, null);
        Class52 a2 = this.Method2506(this.Field2979);
        a2 = new Class52(this.Field2979);
        this.Method2507(a2);
        return a2;
    }

    private Class52 Method2497(String a) {
        this.Field2980.Method3190('S', a, null, null);
        Class52 a2 = this.Method2506(this.Field2980);
        this.Method2496(a);
        a2 = new Class52(this.Field2980);
        this.Method2507(a2);
        return a2;
    }

    public Class52 Method2498(String a) {
        this.Field2980.Method3190('C', a, null, null);
        Class52 a2 = this.Method2506(this.Field2980);
        this.Method2496(a);
        a2 = new Class52(this.Field2980);
        this.Method2507(a2);
        return a2;
    }

    public Class52 Method2499(String a) {
        this.Field2980.Method3190('t', a, null, null);
        Class52 a2 = this.Method2506(this.Field2980);
        this.Method2496(a);
        a2 = new Class52(this.Field2980);
        this.Method2507(a2);
        return a2;
    }

    public Class52 Method2500(int a, String a2, String a3, String a4) {
        String[] stringArray = Class690.Method2342();
        this.Field2982.Method3190((char)(103 + a), a2, a3, a4);
        Class52 class52 = this.Method2506(this.Field2982);
        String[] a5 = stringArray;
        if (a <= 4) {
            this.Method2502(a2, a3, a4);
        }
        this.Method2503(a2, a3, a4, a == 9);
        Class52 a6 = new Class52(this.Field2982);
        this.Method2507(a6);
        return a6;
    }

    public Class52 Method2501(Object a) {
        if (a instanceof Integer) {
            int a2 = (Integer)a;
            return this.Method2492(a2);
        }
        if (a instanceof Float) {
            float a3 = ((Float)a).floatValue();
            return this.Method2493(a3);
        }
        if (a instanceof Long) {
            long a4 = (Long)a;
            return this.Method2494(a4);
        }
        if (a instanceof Double) {
            double a5 = (Double)a;
            return this.Method2495(a5);
        }
        if (a instanceof String) {
            return this.Method2497((String)a);
        }
        if (a instanceof Class46) {
            Class46 a6 = (Class46)a;
            int a7 = a6.Method3217();
            if (a7 == 10) {
                return this.Method2498(a6.Method3221());
            }
            if (a7 == 11) {
                return this.Method2499(a6.Method3225());
            }
            return this.Method2498(a6.Method3225());
        }
        if (a instanceof Class279) {
            Class279 a8 = (Class279)a;
            return this.Method2500(a8.Method2820(), a8.Method2821(), a8.Method2822(), a8.Method2823());
        }
        throw new IllegalArgumentException("value " + a);
    }

    public Class52 Method2502(String a, String a2, String a3) {
        this.Field2981.Method3190('G', a, a2, a3);
        Class52 a4 = this.Method2506(this.Field2981);
        this.Method2498(a);
        this.Method2505(a2, a3);
        a4 = new Class52(this.Field2981);
        this.Method2507(a4);
        return a4;
    }

    public Class52 Method2503(String a, String a2, String a3, boolean a4) {
        this.Field2981.Method3190('N', a, a2, a3);
        Class52 a5 = this.Method2506(this.Field2981);
        this.Method2498(a);
        this.Method2505(a2, a3);
        a5 = new Class52(this.Field2981);
        this.Method2507(a5);
        return a5;
    }

    public Class52 Method2504(String a, String a2, Class279 a3, Object[] a4) {
        String[] stringArray = Class690.Method2342();
        this.Field2983.Method3191(a, a2, a3, a4);
        String[] a5 = stringArray;
        Class52 a6 = this.Method2506(this.Field2983);
        this.Method2505(a, a2);
        this.Method2500(a3.Method2820(), a3.Method2821(), a3.Method2822(), a3.Method2823());
        int a7 = 0;
        if (a7 < a4.length) {
            this.Method2501(a4[a7]);
            ++a7;
        }
        a6 = new Class52(this.Field2983);
        this.Method2507(a6);
        return a6;
    }

    public Class52 Method2505(String a, String a2) {
        this.Field2980.Method3190('T', a, a2, null);
        Class52 a3 = this.Method2506(this.Field2980);
        this.Method2496(a);
        this.Method2496(a2);
        a3 = new Class52(this.Field2980);
        this.Method2507(a3);
        return a3;
    }

    private Class52 Method2506(Class52 a) {
        return (Class52)this.Method2665(a);
    }

    private void Method2507(Class52 a) {
        this.put(a, a);
    }

    public static void Method2341(String[] stringArray) {
        Field2984 = stringArray;
    }

    public static String[] Method2342() {
        return Field2984;
    }

    private static IllegalArgumentException Method2508(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        if (Class690.Method2342() != null) {
            Class690.Method2341(new String[3]);
        }
    }
}