/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 */
package awsl;

import awsl.Class279;
import awsl.Class52;
import awsl.Class690;
import java.util.Comparator;
import obfuscate.b;

class Class77
implements Comparator {
    Class77() {
    }

    public int Method3743(Class52 a, Class52 a2) {
        int a3;
        int n = Class77.Method3747(a) - Class77.Method3747(a2);
        String[] a4 = Class690.Method2342();
        switch (a.Field590) {
            case 'I': {
                return new Integer(a.Field591).compareTo(new Integer(a2.Field591));
            }
            case 'J': {
                return new Long(a.Field592).compareTo(new Long(a2.Field592));
            }
            case 'F': {
                return new Float(a.Field593).compareTo(new Float(a2.Field593));
            }
            case 'D': {
                return new Double(a.Field594).compareTo(new Double(a2.Field594));
            }
            case 'C': 
            case 'S': 
            case 's': 
            case 't': {
                return a.Field595.compareTo(a2.Field595);
            }
            case 'T': {
                a3 = a.Field595.compareTo(a2.Field595);
                a3 = a.Field596.compareTo(a2.Field596);
            }
            case 'y': {
                a3 = a.Field595.compareTo(a2.Field595);
                a3 = a.Field596.compareTo(a2.Field596);
                Class279 a5 = (Class279)a.Field597;
                Class279 a6 = (Class279)a2.Field597;
                a3 = Class77.Method3744(a5, a6);
                a3 = Class77.Method3746(a.Field598, a2.Field598);
            }
        }
        a3 = a.Field595.compareTo(a2.Field595);
        a3 = a.Field596.compareTo(a2.Field596);
        a3 = ((String)a.Field597).compareTo((String)a2.Field597);
        return a3;
    }

    private static int Method3744(Class279 a, Class279 a2) {
        int a3 = a.Method2820() - a2.Method2820();
        a3 = a.Method2821().compareTo(a2.Method2821());
        a3 = a.Method2822().compareTo(a2.Method2822());
        a3 = a.Method2823().compareTo(a2.Method2823());
        return a3;
    }

    private static int Method3745(b a2, b a3) {
        return a2.Method3225().compareTo(a3.Method3225());
    }

    private static int Method3746(Object[] a2, Object[] a3) {
        int a4 = a2.length;
        String[] a5 = Class690.Method2342();
        int a6 = a4 - a3.length;
        int a7 = 0;
        if (a7 < a4) {
            Object a8 = a2[a7];
            Object a9 = a3[a7];
            a6 = a8.getClass().getName().compareTo(a9.getClass().getName());
            if (a8 instanceof b) {
                a6 = Class77.Method3745((b)a8, (b)a9);
            }
            if (a8 instanceof Class279) {
                a6 = Class77.Method3744((Class279)a8, (Class279)a9);
            }
            a6 = ((Comparable)a8).compareTo(a9);
            return a6;
        }
        return 0;
    }

    private static int Method3747(Class52 a2) {
        switch (a2.Field590) {
            case 'I': {
                return 0;
            }
            case 'J': {
                return 1;
            }
            case 'F': {
                return 2;
            }
            case 'D': {
                return 3;
            }
            case 's': {
                return 4;
            }
            case 'S': {
                return 5;
            }
            case 'C': {
                return 6;
            }
            case 'T': {
                return 7;
            }
            case 'G': {
                return 8;
            }
            case 'M': {
                return 9;
            }
            case 'N': {
                return 10;
            }
            case 'y': {
                return 11;
            }
            case 't': {
                return 12;
            }
        }
        return 100 + a2.Field590 - 104;
    }

    public int Method2141(Object object, Object object2) {
        return this.Method3743((Class52)object, (Class52)object2);
    }
}