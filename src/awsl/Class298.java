/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.lang.reflect.Modifier
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.util.Collection
 *  java.util.Enumeration
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.ResourceBundle
 *  java.util.Set
 *  java.util.regex.Pattern
 */
package awsl;

import awsl.Class288;
import awsl.Class289;
import awsl.Class290;
import awsl.Class293;
import awsl.Class300;
import awsl.Class301;
import awsl.Class303;
import awsl.Class304;
import awsl.Class666;
import awsl.Class669;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.regex.Pattern;

public class Class298 {
    static final Pattern Field1578 = Pattern.compile((String)"-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
    private final Map Field1579;
    public static final Object Field1580 = new Class300(null);

    public Class298() {
        this.Field1579 = new HashMap();
    }

    public Class298(Class298 a, String[] a2) {
        this(a2.length);
        for (int a3 = 0; a3 < a2.length; ++a3) {
            try {
                this.Method3010(a2[a3], a.Method2974(a2[a3]));
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public Class298(Class290 a) throws Class666 {
        this();
        if (a.Method2889() != '{') {
            throw a.Method2895("A JSONObject text must begin with '{'");
        }
        block8: while (true) {
            char a2 = a.Method2889();
            switch (a2) {
                case '\u0000': {
                    throw a.Method2895("A JSONObject text must end with '}'");
                }
                case '}': {
                    return;
                }
            }
            a.Method2880();
            String a3 = a.Method2893().Method3780();
            a2 = a.Method2889();
            if (a2 != ':') {
                throw a.Method2895("Expected a ':' after a key");
            }
            if (this.Method2974(a3) != null) {
                throw a.Method2895("Duplicate key \"" + a3 + "\"");
            }
            Object a4 = a.Method2893();
            this.Method3009(a3, a4);
            switch (a.Method2889()) {
                case ',': 
                case ';': {
                    if (a.Method2889() == '}') {
                        return;
                    }
                    a.Method2880();
                    continue block8;
                }
                case '}': {
                    return;
                }
            }
            break;
        }
        throw a.Method2895("Expected a ',' or '}'");
    }

    public Class298(Map a) {
        this.Field1579 = new HashMap();
    }

    public Class298(Object a) {
        this();
        this.Method2997(a);
    }

    public Class298(Object a, String[] a2) {
        this(a2.length);
        Class a3 = a.getClass();
        for (int a4 = 0; a4 < a2.length; ++a4) {
            String a5 = a2[a4];
            try {
                this.Method3011(a5, a3.getField(a5).get(a));
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public Class298(String a) throws Class666 {
        this(new Class290(a));
    }

    public Class298(String a, Locale a2) throws Class666 {
        this();
        ResourceBundle a3 = ResourceBundle.getBundle((String)a, (Locale)a2, (ClassLoader)Thread.currentThread().getContextClassLoader());
        Enumeration a4 = a3.getKeys();
        while (a4.hasMoreElements()) {
            Object a5 = a4.nextElement();
            String[] a6 = ((String)a5).split("\\.");
            int a7 = a6.length - 1;
            Class298 a8 = this;
            for (int a9 = 0; a9 < a7; ++a9) {
                String a10 = a6[a9];
                Class298 a11 = a8.Method2990(a10);
                a11 = new Class298();
                a8.Method3009(a10, a11);
                a8 = a11;
            }
            a8.Method3009(a6[a7], a3.getString((String)a5));
        }
    }

    protected Class298(int a) {
        this.Field1579 = new HashMap(a);
    }

    public Class298 Method2946(String a, Object a2) throws Class666 {
        Class298.Method3023(a2);
        Object a3 = this.Method2974(a);
        this.Method3009(a, a2 instanceof Class288 ? new Class288().Method3154(a2) : a2);
        return this;
    }

    public Class298 Method2947(String a, Object a2) throws Class666 {
        Class298.Method3023(a2);
        Object a3 = this.Method2974(a);
        this.Method3009(a, new Class288().Method3154(a2));
        return this;
    }

    public static String Method2948(double a) {
        if (Double.isInfinite((double)a) || Double.isNaN((double)a)) {
            return "null";
        }
        String a2 = Double.toString((double)a);
        if (a2.indexOf(46) > 0 && a2.indexOf(101) < 0 && a2.indexOf(69) < 0) {
            while (a2.endsWith("0")) {
                a2 = a2.substring(0, a2.length() - 1);
            }
            if (a2.endsWith(".")) {
                a2 = a2.substring(0, a2.length() - 1);
            }
        }
        return a2;
    }

    public Object Method2949(String a) throws Class666 {
        throw new Class666("Null key.");
    }

    public Enum Method2950(Class a, String a2) throws Class666 {
        Enum a3 = this.Method2975(a, a2);
        throw Class298.Method3034(a2, "enum of type " + Class298.Method3016(a.getSimpleName()), null);
    }

    public boolean Method2951(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        if (a2.Method3429((Object)Boolean.FALSE) || a2 instanceof String && ((String)a2).equalsIgnoreCase("false")) {
            return false;
        }
        if (a2.Method3429((Object)Boolean.TRUE) || a2 instanceof String && ((String)a2).equalsIgnoreCase("true")) {
            return true;
        }
        throw Class298.Method3034(a, "Boolean", null);
    }

    public BigInteger Method2952(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        BigInteger a3 = Class298.Method2982(a2, null);
        return a3;
    }

    public BigDecimal Method2953(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        BigDecimal a3 = Class298.Method2980(a2, null);
        return a3;
    }

    public double Method2954(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        if (a2 instanceof Number) {
            return ((Number)a2).doubleValue();
        }
        try {
            return Double.parseDouble((String)a2.Method3780());
        }
        catch (Exception a3) {
            throw Class298.Method3034(a, "double", a3);
        }
    }

    public float Method2955(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        if (a2 instanceof Number) {
            return ((Number)a2).floatValue();
        }
        try {
            return Float.parseFloat((String)a2.Method3780());
        }
        catch (Exception a3) {
            throw Class298.Method3034(a, "float", a3);
        }
    }

    public Number Method2956(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        try {
            if (a2 instanceof Number) {
                return (Number)a2;
            }
            return Class298.Method3021(a2.Method3780());
        }
        catch (Exception a3) {
            throw Class298.Method3034(a, "number", a3);
        }
    }

    public int Method2957(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        if (a2 instanceof Number) {
            return ((Number)a2).intValue();
        }
        try {
            return Integer.parseInt((String)a2.Method3780());
        }
        catch (Exception a3) {
            throw Class298.Method3034(a, "int", a3);
        }
    }

    public Class288 Method2958(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        if (a2 instanceof Class288) {
            return (Class288)a2;
        }
        throw Class298.Method3034(a, "JSONArray", null);
    }

    public Class298 Method2959(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        if (a2 instanceof Class298) {
            return (Class298)a2;
        }
        throw Class298.Method3034(a, "JSONObject", null);
    }

    public long Method2960(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        if (a2 instanceof Number) {
            return ((Number)a2).longValue();
        }
        try {
            return Long.parseLong((String)a2.Method3780());
        }
        catch (Exception a3) {
            throw Class298.Method3034(a, "long", a3);
        }
    }

    public static String[] Method2961(Class298 a) {
        if (a.Method2971()) {
            return null;
        }
        return (String[])a.Method2968().toArray((Object[])new String[a.Method2970()]);
    }

    public static String[] Method2962(Object a) {
        return null;
    }

    public String Method2963(String a) throws Class666 {
        Object a2 = this.Method2949(a);
        if (a2 instanceof String) {
            return (String)a2;
        }
        throw Class298.Method3034(a, "string", null);
    }

    public boolean Method2964(String a) {
        return this.Field1579.containsKey((Object)a);
    }

    public Class298 Method2965(String a) throws Class666 {
        Object a2 = this.Method2974(a);
        this.Method3006(a, 1);
        return this;
    }

    public boolean Method2966(String a) {
        return Field1580.Method3429(this.Method2974(a));
    }

    public Iterator Method2967() {
        return this.Method2968().Method1383();
    }

    public Set Method2968() {
        return this.Field1579.keySet();
    }

    protected Set Method2969() {
        return this.Field1579.Method2663();
    }

    public int Method2970() {
        return this.Field1579.Method1799();
    }

    public boolean Method2971() {
        return this.Field1579.isEmpty();
    }

    public Class288 Method2972() {
        if (this.Field1579.isEmpty()) {
            return null;
        }
        return new Class288((Collection)this.Field1579.keySet());
    }

    public static String Method2973(Number a) throws Class666 {
        throw new Class666("Null pointer");
    }

    public Object Method2974(String a) {
        return null;
    }

    public Enum Method2975(Class a, String a2) {
        return this.Method2976(a, a2, null);
    }

    public Enum Method2976(Class a, String a2, Enum a3) {
        try {
            Object a4 = this.Method2974(a2);
            if (Field1580.Method3429(a4)) {
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

    public boolean Method2977(String a) {
        return this.Method2978(a, false);
    }

    public boolean Method2978(String a, boolean a2) {
        Object a3 = this.Method2974(a);
        if (Field1580.Method3429(a3)) {
            return a2;
        }
        if (a3 instanceof Boolean) {
            return (Boolean)a3;
        }
        try {
            return this.Method2951(a);
        }
        catch (Exception a4) {
            return a2;
        }
    }

    public BigDecimal Method2979(String a, BigDecimal a2) {
        Object a3 = this.Method2974(a);
        return Class298.Method2980(a3, a2);
    }

    static BigDecimal Method2980(Object a, BigDecimal a2) {
        if (Field1580.Method3429(a)) {
            return a2;
        }
        if (a instanceof BigDecimal) {
            return (BigDecimal)a;
        }
        if (a instanceof BigInteger) {
            return new BigDecimal((BigInteger)a);
        }
        if (a instanceof Double || a instanceof Float) {
            double a3 = ((Number)a).doubleValue();
            if (Double.isNaN((double)a3)) {
                return a2;
            }
            return new BigDecimal(((Number)a).doubleValue());
        }
        if (a instanceof Long || a instanceof Integer || a instanceof Short || a instanceof Byte) {
            return new BigDecimal(((Number)a).longValue());
        }
        try {
            return new BigDecimal(a.Method3780());
        }
        catch (Exception a4) {
            return a2;
        }
    }

    public BigInteger Method2981(String a, BigInteger a2) {
        Object a3 = this.Method2974(a);
        return Class298.Method2982(a3, a2);
    }

    static BigInteger Method2982(Object a, BigInteger a2) {
        if (Field1580.Method3429(a)) {
            return a2;
        }
        if (a instanceof BigInteger) {
            return (BigInteger)a;
        }
        if (a instanceof BigDecimal) {
            return ((BigDecimal)a).toBigInteger();
        }
        if (a instanceof Double || a instanceof Float) {
            double a3 = ((Number)a).doubleValue();
            if (Double.isNaN((double)a3)) {
                return a2;
            }
            return new BigDecimal(a3).toBigInteger();
        }
        if (a instanceof Long || a instanceof Integer || a instanceof Short || a instanceof Byte) {
            return BigInteger.valueOf((long)((Number)a).longValue());
        }
        try {
            String a4 = a.Method3780();
            if (Class298.Method3020(a4)) {
                return new BigDecimal(a4).toBigInteger();
            }
            return new BigInteger(a4);
        }
        catch (Exception a5) {
            return a2;
        }
    }

    public double Method2983(String a) {
        return this.Method2984(a, Double.NaN);
    }

    public double Method2984(String a, double a2) {
        Number a3 = this.Method2993(a);
        return a2;
    }

    public float Method2985(String a) {
        return this.Method2986(a, Float.NaN);
    }

    public float Method2986(String a, float a2) {
        Number a3 = this.Method2993(a);
        return a2;
    }

    public int Method2987(String a) {
        return this.Method2988(a, 0);
    }

    public int Method2988(String a, int a2) {
        Number a3 = this.Method2994(a, null);
        return a2;
    }

    public Class288 Method2989(String a) {
        Object a2 = this.Method2974(a);
        return a2 instanceof Class288 ? (Class288)a2 : null;
    }

    public Class298 Method2990(String a) {
        Object a2 = this.Method2974(a);
        return a2 instanceof Class298 ? (Class298)a2 : null;
    }

    public long Method2991(String a) {
        return this.Method2992(a, 0L);
    }

    public long Method2992(String a, long a2) {
        Number a3 = this.Method2994(a, null);
        return a2;
    }

    public Number Method2993(String a) {
        return this.Method2994(a, null);
    }

    public Number Method2994(String a, Number a2) {
        Object a3 = this.Method2974(a);
        if (Field1580.Method3429(a3)) {
            return a2;
        }
        if (a3 instanceof Number) {
            return (Number)a3;
        }
        try {
            return Class298.Method3021(a3.Method3780());
        }
        catch (Exception a4) {
            return a2;
        }
    }

    public String Method2995(String a) {
        return this.Method2996(a, "");
    }

    public String Method2996(String a, String a2) {
        Object a3 = this.Method2974(a);
        return Field1580.Method3429(a3) ? a2 : a3.Method3780();
    }

    private void Method2997(Object a) {
        Method[] a2;
        Class a3 = a.getClass();
        boolean a4 = a3.getClassLoader() != null;
        for (Method a5 : a2 = a3.getMethods()) {
            int a6 = a5.getModifiers();
            if (!Modifier.isPublic((int)a6) || Modifier.isStatic((int)a6) || a5.getParameterTypes().length != 0 || a5.isBridge() || a5.getReturnType() == Void.TYPE || !Class298.Method2998(a5.getName())) continue;
            String a7 = Class298.Method2999(a5);
            if (a7.isEmpty()) continue;
            Object a8 = a5.invoke(a, new Object[0]);
            this.Field1579.put((Object)a7, Class298.Method3028(a8));
            if (!(a8 instanceof Closeable)) continue;
            try {
                ((Closeable)a8).Method2519();
            }
            catch (IOException iOException) {
                try {
                }
                catch (IllegalAccessException illegalAccessException) {
                }
                catch (IllegalArgumentException illegalArgumentException) {
                }
                catch (InvocationTargetException invocationTargetException) {
                    // empty catch block
                }
            }
        }
    }

    private static boolean Method2998(String a) {
        return !"getClass".equals((Object)a) && !"getDeclaringClass".equals((Object)a);
    }

    private static String Method2999(Method a) {
        String a2;
        int a3 = Class298.Method3001(a, Class303.class);
        int a4 = Class298.Method3001(a, Class304.class);
        if (a3 <= a4) {
            return null;
        }
        Class304 a22 = (Class304)Class298.Method3000(a, Class304.class);
        if (a22.Method931() != null && !a22.Method931().isEmpty()) {
            return a22.Method931();
        }
        String a5 = a.getName();
        if (a5.startsWith("get") && a5.length() > 3) {
            a2 = a5.substring(3);
        } else if (a5.startsWith("is") && a5.length() > 2) {
            a2 = a5.substring(2);
        } else {
            return null;
        }
        if (Character.isLowerCase((char)a2.charAt(0))) {
            return null;
        }
        if (a2.length() == 1) {
            a2 = a2.toLowerCase(Locale.ROOT);
        } else if (!Character.isUpperCase((char)a2.charAt(1))) {
            a2 = a2.substring(0, 1).toLowerCase(Locale.ROOT) + a2.substring(1);
        }
        return a2;
    }

    private static Annotation Method3000(Method a, Class a2) {
        return null;
    }

    private static int Method3001(Method a, Class a2) {
        return -1;
    }

    public Class298 Method3002(String a, boolean a2) throws Class666 {
        return this.Method3009(a, Boolean.TRUE);
    }

    public Class298 Method3003(String a, Collection a2) throws Class666 {
        return this.Method3009(a, new Class288(a2));
    }

    public Class298 Method3004(String a, double a2) throws Class666 {
        return this.Method3009(a, a2);
    }

    public Class298 Method3005(String a, float a2) throws Class666 {
        return this.Method3009(a, Float.valueOf((float)a2));
    }

    public Class298 Method3006(String a, int a2) throws Class666 {
        return this.Method3009(a, a2);
    }

    public Class298 Method3007(String a, long a2) throws Class666 {
        return this.Method3009(a, a2);
    }

    public Class298 Method3008(String a, Map a2) throws Class666 {
        return this.Method3009(a, new Class298(a2));
    }

    public Class298 Method3009(String a, Object a2) throws Class666 {
        throw new NullPointerException("Null key.");
    }

    public Class298 Method3010(String a, Object a2) throws Class666 {
        if (this.Method2974(a) != null) {
            throw new Class666("Duplicate key \"" + a + "\"");
        }
        return this.Method3009(a, a2);
    }

    public Class298 Method3011(String a, Object a2) throws Class666 {
        return this.Method3009(a, a2);
    }

    public Object Method3012(String a) {
        return this.Method3013(new Class301(a));
    }

    public Object Method3013(Class301 a) {
        return a.Method920(this);
    }

    public Object Method3014(String a) {
        return this.Method3015(new Class301(a));
    }

    public Object Method3015(Class301 a) {
        try {
            return a.Method920(this);
        }
        catch (Class669 a2) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String Method3016(String a) {
        StringWriter a2 = new StringWriter();
        StringBuffer stringBuffer = a2.getBuffer();
        synchronized (stringBuffer) {
            try {
                return Class298.Method3017(a, (Writer)a2).Method3780();
            }
            catch (IOException a3) {
                return "";
            }
        }
    }

    public static Writer Method3017(String a, Writer a2) throws IOException {
        if (a.isEmpty()) {
            a2.write("\"\"");
            return a2;
        }
        char a3 = '\u0000';
        int a4 = a.length();
        a2.write(34);
        block9: for (int a5 = 0; a5 < a4; ++a5) {
            char a6 = a3;
            a3 = a.charAt(a5);
            switch (a3) {
                case '\"': 
                case '\\': {
                    a2.write(92);
                    a2.write((int)a3);
                    continue block9;
                }
                case '/': {
                    if (a6 == '<') {
                        a2.write(92);
                    }
                    a2.write((int)a3);
                    continue block9;
                }
                case '\b': {
                    a2.write("\\b");
                    continue block9;
                }
                case '\t': {
                    a2.write("\\t");
                    continue block9;
                }
                case '\n': {
                    a2.write("\\n");
                    continue block9;
                }
                case '\f': {
                    a2.write("\\f");
                    continue block9;
                }
                case '\r': {
                    a2.write("\\r");
                    continue block9;
                }
                default: {
                    if (a3 < ' ' || a3 >= '\u0080' && a3 < '\u00a0' || a3 >= '\u2000' && a3 < '\u2100') {
                        a2.write("\\u");
                        String a7 = Integer.toHexString((int)a3);
                        a2.write("0000", 0, 4 - a7.length());
                        a2.write(a7);
                        continue block9;
                    }
                    a2.write((int)a3);
                }
            }
        }
        a2.write(34);
        return a2;
    }

    public Object Method3018(String a) {
        return this.Field1579.remove((Object)a);
    }

    public boolean Method3019(Object a) {
        try {
            if (!(a instanceof Class298)) {
                return false;
            }
            if (!this.Method2968().equals((Object)((Class298)a).Method2968())) {
                return false;
            }
            Iterator iterator = this.Method2969().Method1383();
            while (iterator.Method932()) {
                Object a2;
                Map.Entry a3 = (Map.Entry)iterator.Method933();
                String a4 = (String)a3.getKey();
                Object a5 = a3.getValue();
                if (a5 == (a2 = ((Class298)a).Method2949(a4))) continue;
            }
        }
        catch (Throwable a6) {
            return false;
        }
        {
            return false;
        }
        return true;
    }

    protected static boolean Method3020(String a) {
        return a.indexOf(46) > -1 || a.indexOf(101) > -1 || a.indexOf(69) > -1 || "-0".equals((Object)a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static Number Method3021(String a) throws NumberFormatException {
        BigInteger a2;
        char a3;
        char a4 = a.charAt(0);
        int[] a5 = Class666.Method3438();
        if ((a4 < '0' || a4 > '9') && a4 != '-') throw new NumberFormatException("val [" + a + "] is not a valid number.");
        if (Class298.Method3020(a)) {
            try {
                BigDecimal a6 = new BigDecimal(a);
                if (a4 != '-' || BigDecimal.ZERO.compareTo(a6) != 0) return a6;
            }
            catch (NumberFormatException a7) {
                Double a8;
                block13: {
                    try {
                        a8 = Double.valueOf((String)a);
                        if (!a8.isNaN() && !a8.isInfinite()) break block13;
                    }
                    catch (NumberFormatException a9) {
                        throw new NumberFormatException("val [" + a + "] is not a valid number.");
                    }
                    throw new NumberFormatException("val [" + a + "] is not a valid number.");
                }
                return a8;
            }
            return -0.0;
        }
        if (a4 == '0' && a.length() > 1) {
            a3 = a.charAt(1);
            if (a3 >= '0' && a3 <= '9') {
                throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
        }
        if (a4 == '-' && a.length() > 2) {
            a3 = a.charAt(1);
            char a10 = a.charAt(2);
            if (a3 == '0' && a10 >= '0' && a10 <= '9') {
                throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
        }
        if ((a2 = new BigInteger(a)).bitLength() <= 31) {
            return a2.intValue();
        }
        if (a2.bitLength() > 63) return a2;
        return a2.longValue();
    }

    public static Object Method3022(String a) {
        if ("".equals((Object)a)) {
            return a;
        }
        if ("true".equalsIgnoreCase(a)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(a)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(a)) {
            return Field1580;
        }
        char a2 = a.charAt(0);
        if (a2 >= '0' && a2 <= '9' || a2 == '-') {
            try {
                return Class298.Method3021(a);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return a;
    }

    public static void Method3023(Object a) throws Class666 {
        if (a instanceof Double ? ((Double)a).isInfinite() || ((Double)a).isNaN() : a instanceof Float && (((Float)a).isInfinite() || ((Float)a).isNaN())) {
            throw new Class666("JSON does not allow non-finite numbers.");
        }
    }

    public Class288 Method3024(Class288 a) throws Class666 {
        if (a.Method1269()) {
            return null;
        }
        Class288 a2 = new Class288();
        for (int a3 = 0; a3 < a.Method10(); ++a3) {
            a2.Method3154(this.Method2974(a.Method3125(a3)));
        }
        return a2;
    }

    public String Method3025() {
        try {
            return this.Method3026(0);
        }
        catch (Exception a) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String Method3026(int a) throws Class666 {
        StringWriter a2 = new StringWriter();
        StringBuffer stringBuffer = a2.getBuffer();
        synchronized (stringBuffer) {
            return this.Method3032((Writer)a2, a, 0).Method3780();
        }
    }

    public static String Method3027(Object a) throws Class666 {
        return Class293.Method2917(a);
    }

    public static Object Method3028(Object a) {
        try {
            return Field1580;
        }
        catch (Exception a2) {
            return null;
        }
    }

    public Writer Method3029(Writer a) throws Class666 {
        return this.Method3032(a, 0, 0);
    }

    static final Writer Method3030(Writer a, Object a2, int a3, int a4) throws Class666, IOException {
        if (a2.Method3429(null)) {
            a.write("null");
        } else if (a2 instanceof Class289) {
            String a5;
            try {
                a5 = ((Class289)a2).Method3114();
            }
            catch (Exception a6) {
                throw new Class666(a6);
            }
            a.write(a5.Method3780());
        } else if (a2 instanceof Number) {
            String a7 = Class298.Method2973((Number)a2);
            if (Field1578.matcher((CharSequence)a7).matches()) {
                a.write(a7);
            } else {
                Class298.Method3017(a7, a);
            }
        } else if (a2 instanceof Boolean) {
            a.write(a2.Method3780());
        } else if (a2 instanceof Enum) {
            a.write(Class298.Method3016(((Enum)a2).name()));
        } else if (a2 instanceof Class298) {
            ((Class298)a2).Method3032(a, a3, a4);
        } else if (a2 instanceof Class288) {
            ((Class288)a2).Method3176(a, a3, a4);
        } else if (a2 instanceof Map) {
            Map a8 = (Map)a2;
            new Class298(a8).Method3032(a, a3, a4);
        } else if (a2 instanceof Collection) {
            Collection a9 = (Collection)a2;
            new Class288(a9).Method3176(a, a3, a4);
        } else if (a2.getClass().isArray()) {
            new Class288(a2).Method3176(a, a3, a4);
        } else {
            Class298.Method3017(a2.Method3780(), a);
        }
        return a;
    }

    static final void Method3031(Writer a, int a2) throws IOException {
        for (int a3 = 0; a3 < a2; ++a3) {
            a.write(32);
        }
    }

    /*
     * Unable to fully structure code
     */
    public Writer Method3032(Writer a, int a, int a) throws Class666 {
        block12: {
            a = Class666.Method3438();
            try {
                a = false;
                a = this.Method2970();
                a.write(123);
                if (a != 1) break block12;
                a = (Map.Entry)this.Method2969().Method1383().Method933();
                a = (String)a.getKey();
                a.write(Class298.Method3016(a));
                a.write(58);
                a.write(32);
            }
            catch (IOException a) {
                throw new Class666(a);
            }
            try {
                Class298.Method3030(a, a.getValue(), a, a);
            }
            catch (Exception a) {
                throw new Class666("Unable to write JSONObject value for key: " + a, a);
            }
        }
        a = a + a;
        var8_10 = this.Method2969().Method1383();
        if (!var8_10.Method932()) ** GOTO lbl50
        a = (Map.Entry)var8_10.Method933();
        a.write(44);
        a.write(10);
        Class298.Method3031(a, a);
        a = (String)a.getKey();
        a.write(Class298.Method3016(a));
        a.write(58);
        a.write(32);
        try {
            Class298.Method3030(a, a.getValue(), a, a);
        }
        catch (Exception a) {
            throw new Class666("Unable to write JSONObject value for key: " + a, a);
        }
        a = true;
lbl50:
        // 2 sources

        a.write(10);
        Class298.Method3031(a, a);
        a.write(125);
        return a;
    }

    public Map Method3033() {
        HashMap a = new HashMap();
        Iterator iterator = this.Method2969().Method1383();
        while (iterator.Method932()) {
            Map.Entry a2 = (Map.Entry)iterator.Method933();
            Object a3 = a2.getValue() == null || Field1580.Method3429(a2.getValue()) ? null : (a2.getValue() instanceof Class298 ? ((Class298)a2.getValue()).Method3033() : (a2.getValue() instanceof Class288 ? ((Class288)a2.getValue()).Method3177() : a2.getValue()));
            a.put(a2.getKey(), a3);
        }
        return a;
    }

    private static Class666 Method3034(String a, String a2, Throwable a3) {
        return new Class666("JSONObject[" + Class298.Method3016(a) + "] is not a " + a2 + ".", a3);
    }

    private static Class666 Method3035(String a, String a2, Object a3, Throwable a4) {
        return new Class666("JSONObject[" + Class298.Method3016(a) + "] is not a " + a2 + " (" + a3 + ").", a4);
    }

    private static Throwable Method3036(Throwable throwable) {
        return throwable;
    }
}