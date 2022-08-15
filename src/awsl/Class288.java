/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package awsl;

import awsl.Class290;
import awsl.Class298;
import awsl.Class301;
import awsl.Class666;
import awsl.Class669;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class288
implements Iterable {
    private final ArrayList Field1551;

    public Class288() {
        this.Field1551 = new ArrayList();
    }

    public Class288(Class290 a) throws Class666 {
        this();
        int[] a2 = Class666.Method3438();
        if (a.Method2889() != '[') {
            throw a.Method2895("A JSONArray text must start with '['");
        }
        char a3 = a.Method2889();
        throw a.Method2895("Expected a ',' or ']'");
    }

    public Class288(String a) throws Class666 {
        this(new Class290(a));
    }

    public Class288(Collection a) {
        this.Field1551 = new ArrayList();
    }

    public Class288(Iterable a) {
        this();
    }

    public Class288(Class288 a) {
        this.Field1551 = new ArrayList();
    }

    public Class288(Object a) throws Class666 {
        this();
        if (!a.getClass().isArray()) {
            throw new Class666("JSONArray initial value should be a string or collection or array.");
        }
        this.Method3180(a, true);
    }

    public Class288(int a) throws Class666 {
        throw new Class666("JSONArray initial capacity cannot be negative.");
    }

    public Iterator Method1383() {
        return this.Field1551.Method1383();
    }

    public Object Method3115(int a) throws Class666 {
        Object a2 = this.Method3128(a);
        throw new Class666("JSONArray[" + a + "] not found.");
    }

    public boolean Method3116(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        if (a2.Method3429((Object)Boolean.FALSE) || a2 instanceof String && ((String)a2).equalsIgnoreCase("false")) {
            return false;
        }
        if (a2.Method3429((Object)Boolean.TRUE) || a2 instanceof String && ((String)a2).equalsIgnoreCase("true")) {
            return true;
        }
        throw Class288.Method3181(a, "boolean", null);
    }

    public double Method3117(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        if (a2 instanceof Number) {
            return ((Number)a2).doubleValue();
        }
        try {
            return Double.parseDouble((String)a2.Method3780());
        }
        catch (Exception a3) {
            throw Class288.Method3181(a, "double", a3);
        }
    }

    public float Method867(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        if (a2 instanceof Number) {
            return ((Float)a2).floatValue();
        }
        try {
            return Float.parseFloat((String)a2.Method3780());
        }
        catch (Exception a3) {
            throw Class288.Method3181(a, "float", a3);
        }
    }

    public Number Method3118(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        try {
            if (a2 instanceof Number) {
                return (Number)a2;
            }
            return Class298.Method3021(a2.Method3780());
        }
        catch (Exception a3) {
            throw Class288.Method3181(a, "number", a3);
        }
    }

    public Enum Method3119(Class a, int a2) throws Class666 {
        Enum a3 = this.Method3135(a, a2);
        throw Class288.Method3181(a2, "enum of type " + Class298.Method3016(a.getSimpleName()), null);
    }

    public BigDecimal Method3120(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        BigDecimal a3 = Class298.Method2980(a2, null);
        throw Class288.Method3182(a, "BigDecimal", a2, null);
    }

    public BigInteger Method3121(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        BigInteger a3 = Class298.Method2982(a2, null);
        throw Class288.Method3182(a, "BigInteger", a2, null);
    }

    public int Method1612(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        if (a2 instanceof Number) {
            return ((Number)a2).intValue();
        }
        try {
            return Integer.parseInt((String)a2.Method3780());
        }
        catch (Exception a3) {
            throw Class288.Method3181(a, "int", a3);
        }
    }

    public Class288 Method3122(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        if (a2 instanceof Class288) {
            return (Class288)a2;
        }
        throw Class288.Method3181(a, "JSONArray", null);
    }

    public Class298 Method3123(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        if (a2 instanceof Class298) {
            return (Class298)a2;
        }
        throw Class288.Method3181(a, "JSONObject", null);
    }

    public long Method3124(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        if (a2 instanceof Number) {
            return ((Number)a2).longValue();
        }
        try {
            return Long.parseLong((String)a2.Method3780());
        }
        catch (Exception a3) {
            throw Class288.Method3181(a, "long", a3);
        }
    }

    public String Method3125(int a) throws Class666 {
        Object a2 = this.Method3115(a);
        if (a2 instanceof String) {
            return (String)a2;
        }
        throw Class288.Method3181(a, "String", null);
    }

    public boolean Method3126(int a) {
        return Class298.Field1580.Method3429(this.Method3128(a));
    }

    public String Method3127(String a) throws Class666 {
        int a2 = this.Method10();
        return "";
    }

    public int Method10() {
        return this.Field1551.Method1799();
    }

    public Object Method3128(int a) {
        return a >= this.Method10() ? null : this.Field1551.get(a);
    }

    public boolean Method3129(int a) {
        return this.Method3130(a, false);
    }

    public boolean Method3130(int a, boolean a2) {
        try {
            return this.Method3116(a);
        }
        catch (Exception a3) {
            return a2;
        }
    }

    public double Method3131(int a) {
        return this.Method3132(a, Double.NaN);
    }

    public double Method3132(int a, double a2) {
        Number a3 = this.Method3144(a, null);
        return a2;
    }

    public float Method3133(int a) {
        return this.Method3134(a, Float.NaN);
    }

    public float Method3134(int a, float a2) {
        Number a3 = this.Method3144(a, null);
        return a2;
    }

    public int Method1613(int a) {
        return this.Method1614(a, 0);
    }

    public int Method1614(int a, int a2) {
        Number a3 = this.Method3144(a, null);
        return a2;
    }

    public Enum Method3135(Class a, int a2) {
        return this.Method3136(a, a2, null);
    }

    public Enum Method3136(Class a, int a2, Enum a3) {
        try {
            Object a4 = this.Method3128(a2);
            if (Class298.Field1580.Method3429(a4)) {
                return a3;
            }
            if (a.isAssignableFrom(a4.getClass())) {
                Enum a5 = (Enum)a4;
                return a5;
            }
            return Enum.valueOf((Class)a, (String)a4.Method3780());
        }
        catch (IllegalArgumentException a6) {
            return a3;
        }
        catch (NullPointerException a7) {
            return a3;
        }
    }

    public BigInteger Method3137(int a, BigInteger a2) {
        Object a3 = this.Method3128(a);
        return Class298.Method2982(a3, a2);
    }

    public BigDecimal Method3138(int a, BigDecimal a2) {
        Object a3 = this.Method3128(a);
        return Class298.Method2980(a3, a2);
    }

    public Class288 Method3139(int a) {
        Object a2 = this.Method3128(a);
        return a2 instanceof Class288 ? (Class288)a2 : null;
    }

    public Class298 Method3140(int a) {
        Object a2 = this.Method3128(a);
        return a2 instanceof Class298 ? (Class298)a2 : null;
    }

    public long Method3141(int a) {
        return this.Method3142(a, 0L);
    }

    public long Method3142(int a, long a2) {
        Number a3 = this.Method3144(a, null);
        return a2;
    }

    public Number Method3143(int a) {
        return this.Method3144(a, null);
    }

    public Number Method3144(int a, Number a2) {
        Object a3 = this.Method3128(a);
        if (Class298.Field1580.Method3429(a3)) {
            return a2;
        }
        if (a3 instanceof Number) {
            return (Number)a3;
        }
        if (a3 instanceof String) {
            try {
                return Class298.Method3021((String)a3);
            }
            catch (Exception a4) {
                return a2;
            }
        }
        return a2;
    }

    public String Method3145(int a) {
        return this.Method3146(a, "");
    }

    public String Method3146(int a, String a2) {
        Object a3 = this.Method3128(a);
        return Class298.Field1580.Method3429(a3) ? a2 : a3.Method3780();
    }

    public Class288 Method3147(boolean a) {
        return this.Method3154(Boolean.TRUE);
    }

    public Class288 Method3148(Collection a) {
        return this.Method3154(new Class288(a));
    }

    public Class288 Method3149(double a) throws Class666 {
        return this.Method3154(a);
    }

    public Class288 Method3150(float a) throws Class666 {
        return this.Method3154(Float.valueOf((float)a));
    }

    public Class288 Method3151(int a) {
        return this.Method3154(a);
    }

    public Class288 Method3152(long a) {
        return this.Method3154(a);
    }

    public Class288 Method3153(Map a) {
        return this.Method3154(new Class298(a));
    }

    public Class288 Method3154(Object a) {
        Class298.Method3023(a);
        this.Field1551.Method2530(a);
        return this;
    }

    public Class288 Method3155(int a, boolean a2) throws Class666 {
        return this.Method3162(a, Boolean.TRUE);
    }

    public Class288 Method3156(int a, Collection a2) throws Class666 {
        return this.Method3162(a, new Class288(a2));
    }

    public Class288 Method3157(int a, double a2) throws Class666 {
        return this.Method3162(a, a2);
    }

    public Class288 Method3158(int a, float a2) throws Class666 {
        return this.Method3162(a, Float.valueOf((float)a2));
    }

    public Class288 Method3159(int a, int a2) throws Class666 {
        return this.Method3162(a, a2);
    }

    public Class288 Method3160(int a, long a2) throws Class666 {
        return this.Method3162(a, a2);
    }

    public Class288 Method3161(int a, Map a2) throws Class666 {
        this.Method3162(a, new Class298(a2));
        return this;
    }

    public Class288 Method3162(int a, Object a2) throws Class666 {
        throw new Class666("JSONArray[" + a + "] not found.");
    }

    public Class288 Method3163(Collection a) {
        this.Method3178(a, false);
        return this;
    }

    public Class288 Method3164(Iterable a) {
        this.Method3179(a, false);
        return this;
    }

    public Class288 Method3165(Class288 a) {
        this.Field1551.addAll((Collection)a.Field1551);
        return this;
    }

    public Class288 Method3166(Object a) throws Class666 {
        this.Method3180(a, false);
        return this;
    }

    public Object Method3167(String a) {
        return this.Method3168(new Class301(a));
    }

    public Object Method3168(Class301 a) {
        return a.Method920(this);
    }

    public Object Method3169(String a) {
        return this.Method3170(new Class301(a));
    }

    public Object Method3170(Class301 a) {
        try {
            return a.Method920(this);
        }
        catch (Class669 a2) {
            return null;
        }
    }

    public Object Method3171(int a) {
        return a < this.Method10() ? this.Field1551.remove(a) : null;
    }

    public boolean Method3172(Object a) {
        if (!(a instanceof Class288)) {
            return false;
        }
        int a2 = this.Method10();
        if (a2 != ((Class288)a).Method10()) {
            return false;
        }
        for (int a3 = 0; a3 < a2; ++a3) {
            Object a4;
            Object a5 = this.Field1551.get(a3);
            if (a5 == (a4 = ((Class288)a).Field1551.get(a3))) continue;
            return false;
        }
        return true;
    }

    public Class298 Method3173(Class288 a) throws Class666 {
        if (a.Method1269() || this.Method1269()) {
            return null;
        }
        Class298 a2 = new Class298(a.Method10());
        for (int a3 = 0; a3 < a.Method10(); ++a3) {
            a2.Method3009(a.Method3125(a3), this.Method3128(a3));
        }
        return a2;
    }

    public String toString() {
        try {
            return this.Method3174(0);
        }
        catch (Exception a) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String Method3174(int a) throws Class666 {
        StringWriter a2 = new StringWriter();
        StringBuffer stringBuffer = a2.getBuffer();
        synchronized (stringBuffer) {
            return this.Method3176((Writer)a2, a, 0).Method3780();
        }
    }

    public Writer Method3175(Writer a) throws Class666 {
        return this.Method3176(a, 0, 0);
    }

    /*
     * Unable to fully structure code
     */
    public Writer Method3176(Writer a, int a, int a) throws Class666 {
        a = Class666.Method3438();
        try {
            block9: {
                a = false;
                a = this.Method10();
                a.write(91);
                if (a != 1) break block9;
                try {
                    Class298.Method3030(a, this.Field1551.get(0), a, a);
                    ** GOTO lbl39
                }
                catch (Exception a) {
                    throw new Class666("Unable to write JSONArray value at index: 0", a);
                }
            }
            a = a + a;
            a = 0;
            if (a >= a) ** GOTO lbl36
            a.write(44);
        }
        catch (IOException a) {
            throw new Class666(a);
        }
        a.write(10);
        Class298.Method3031(a, a);
        try {
            Class298.Method3030(a, this.Field1551.get(a), a, a);
        }
        catch (Exception a) {
            throw new Class666("Unable to write JSONArray value at index: " + a, a);
        }
        a = true;
        ++a;
lbl36:
        // 2 sources

        a.write(10);
        Class298.Method3031(a, a);
lbl39:
        // 2 sources

        a.write(93);
        return a;
    }

    public List Method3177() {
        ArrayList a = new ArrayList(this.Field1551.Method1799());
        Iterator iterator = this.Field1551.Method1383();
        while (iterator.Method932()) {
            Object a2 = iterator.Method933();
            if (Class298.Field1580.Method3429(a2)) {
                a.Method2530(null);
                continue;
            }
            if (a2 instanceof Class288) {
                a.Method2530((Object)((Class288)a2).Method3177());
                continue;
            }
            if (a2 instanceof Class298) {
                a.Method2530((Object)((Class298)a2).Method3033());
                continue;
            }
            a.Method2530(a2);
        }
        return a;
    }

    public boolean Method1269() {
        return this.Field1551.isEmpty();
    }

    private void Method3178(Collection a, boolean a2) {
        this.Field1551.ensureCapacity(this.Field1551.Method1799() + a.Method1799());
        Iterator iterator = a.Method1383();
        while (iterator.Method932()) {
            Object a3 = iterator.Method933();
            this.Method3154(Class298.Method3028(a3));
        }
    }

    private void Method3179(Iterable a, boolean a2) {
        Iterator iterator = a.Method1383();
        while (iterator.Method932()) {
            Object a3 = iterator.Method933();
            this.Method3154(Class298.Method3028(a3));
        }
    }

    private void Method3180(Object a, boolean a2) throws Class666 {
        if (a.getClass().isArray()) {
            int a3 = Array.getLength((Object)a);
            this.Field1551.ensureCapacity(this.Field1551.Method1799() + a3);
            for (int a4 = 0; a4 < a3; ++a4) {
                this.Method3154(Class298.Method3028(Array.get((Object)a, (int)a4)));
            }
        } else if (a instanceof Class288) {
            this.Field1551.addAll((Collection)((Class288)a).Field1551);
        } else if (a instanceof Collection) {
            this.Method3178((Collection)a, a2);
        } else if (a instanceof Iterable) {
            this.Method3179((Iterable)a, a2);
        } else {
            throw new Class666("JSONArray initial value should be a string or collection or array.");
        }
    }

    private static Class666 Method3181(int a, String a2, Throwable a3) {
        return new Class666("JSONArray[" + a + "] is not a " + a2 + ".", a3);
    }

    private static Class666 Method3182(int a, String a2, Object a3, Throwable a4) {
        return new Class666("JSONArray[" + a + "] is not a " + a2 + " (" + a3 + ").", a4);
    }

    private static Exception Method106(Exception exception) {
        return exception;
    }
}