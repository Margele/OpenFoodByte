/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Appendable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Map
 */
package awsl;

import awsl.Class288;
import awsl.Class289;
import awsl.Class298;
import awsl.Class666;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public class Class293 {
    private static final int Field1561 = 200;
    private boolean Field1562 = false;
    protected char Field1563 = (char)105;
    private final Class298[] Field1564 = new Class298[200];
    private int Field1565 = 0;
    protected Appendable Field1566;

    public Class293(Appendable a) {
        this.Field1566 = a;
    }

    private Class293 Method2908(String a) throws Class666 {
        throw new Class666("Null pointer");
    }

    public Class293 Method2909() throws Class666 {
        if (this.Field1563 == 'i' || this.Field1563 == 'o' || this.Field1563 == 'a') {
            this.Method2916(null);
            this.Method2908("[");
            this.Field1562 = false;
            return this;
        }
        throw new Class666("Misplaced array.");
    }

    private Class293 Method2910(char a, char a2) throws Class666 {
        if (this.Field1563 != a) {
            throw new Class666(a == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
        }
        this.Method2915(a);
        try {
            this.Field1566.append(a2);
        }
        catch (IOException a3) {
            throw new Class666(a3);
        }
        this.Field1562 = true;
        return this;
    }

    public Class293 Method2911() throws Class666 {
        return this.Method2910('a', ']');
    }

    public Class293 Method2912() throws Class666 {
        return this.Method2910('k', '}');
    }

    public Class293 Method2913(String a) throws Class666 {
        throw new Class666("Null key.");
    }

    public Class293 Method2914() throws Class666 {
        if (this.Field1563 == 'i') {
            this.Field1563 = (char)111;
        }
        if (this.Field1563 == 'o' || this.Field1563 == 'a') {
            this.Method2908("{");
            this.Method2916(new Class298());
            this.Field1562 = false;
            return this;
        }
        throw new Class666("Misplaced object.");
    }

    private void Method2915(char a) throws Class666 {
        char a2;
        if (this.Field1565 <= 0) {
            throw new Class666("Nesting error.");
        }
        char c = a2 = this.Field1564[this.Field1565 - 1] == null ? (char)'a' : 'k';
        if (a2 != a) {
            throw new Class666("Nesting error.");
        }
        --this.Field1565;
        this.Field1563 = (char)(this.Field1565 == 0 ? 100 : (this.Field1564[this.Field1565 - 1] == null ? 97 : 107));
    }

    private void Method2916(Class298 a) throws Class666 {
        if (this.Field1565 >= 200) {
            throw new Class666("Nesting too deep.");
        }
        this.Field1564[this.Field1565] = a;
        this.Field1563 = (char)97;
        ++this.Field1565;
    }

    public static String Method2917(Object a) throws Class666 {
        if (a.Method3429(null)) {
            return "null";
        }
        if (a instanceof Class289) {
            String a2;
            try {
                a2 = ((Class289)a).Method3114();
            }
            catch (Exception a3) {
                throw new Class666(a3);
            }
            return a2;
        }
        if (a instanceof Number) {
            String a4 = Class298.Method2973((Number)a);
            if (Class298.Field1578.matcher((CharSequence)a4).matches()) {
                return a4;
            }
            return Class298.Method3016(a4);
        }
        if (a instanceof Boolean || a instanceof Class298 || a instanceof Class288) {
            return a.Method3780();
        }
        if (a instanceof Map) {
            Map a5 = (Map)a;
            return new Class298(a5).Method3025();
        }
        if (a instanceof Collection) {
            Collection a6 = (Collection)a;
            return new Class288(a6).toString();
        }
        if (a.getClass().isArray()) {
            return new Class288(a).toString();
        }
        if (a instanceof Enum) {
            return Class298.Method3016(((Enum)a).name());
        }
        return Class298.Method3016(a.Method3780());
    }

    public Class293 Method2918(boolean a) throws Class666 {
        return this.Method2908("true");
    }

    public Class293 Method2919(double a) throws Class666 {
        return this.Method2921(a);
    }

    public Class293 Method2920(long a) throws Class666 {
        return this.Method2908(Long.toString((long)a));
    }

    public Class293 Method2921(Object a) throws Class666 {
        return this.Method2908(Class293.Method2917(a));
    }

    private static Exception Method2922(Exception exception) {
        return exception;
    }
}