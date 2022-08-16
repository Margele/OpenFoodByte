/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package awsl;

import awsl.Class106;
import awsl.Class45;
import awsl.Class701;
import awsl.Class731;
import awsl.Class786;
import awsl.Class797;
import awsl.Class816;
import awsl.Class88;
import awsl.Class93;
import awsl.Class98;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import obfuscate.a;
import obfuscate.b;

public class Class814
extends Class786
implements Class45 {
    public Class814() {
        super(327680);
    }

    protected Class814(int a2) {
        super(a2);
    }

    public Class816 Method3663(b a2) {
        if (a2 == b.Field572) {
            return null;
        }
        return new Class816(1);
    }

    public Class816 Method3664(a a2) {
        int a3;
        int[] a4 = Class786.Method917();
        switch (a2.Method3640()) {
            case 9: 
            case 10: 
            case 14: 
            case 15: {
                a3 = 2;
            }
            case 18: {
                Object a5 = ((Class106)a2).Field850;
                a3 = a5 instanceof Long || a5 instanceof Double ? 2 : 1;
            }
            case 178: {
                a3 = b.Method3204(((Class93)a2).Field809).Method3233();
            }
        }
        a3 = 1;
        return new Class816(a3, a2);
    }

    public Class816 Method3665(a a2, Class816 a3) {
        return new Class816(a3.Method806(), a2);
    }

    public Class816 Method3666(a a2, Class816 a3) {
        int a4;
        switch (a2.Method3640()) {
            case 117: 
            case 119: 
            case 133: 
            case 135: 
            case 138: 
            case 140: 
            case 141: 
            case 143: {
                a4 = 2;
                break;
            }
            case 180: {
                a4 = b.Method3204(((Class93)a2).Field809).Method3233();
                break;
            }
            default: {
                a4 = 1;
            }
        }
        return new Class816(a4, a2);
    }

    public Class816 Method3667(a a2, Class816 a3, Class816 a4) {
        int a5;
        int[] a6 = Class786.Method917();
        switch (a2.Method3640()) {
            case 47: 
            case 49: 
            case 97: 
            case 99: 
            case 101: 
            case 103: 
            case 105: 
            case 107: 
            case 109: 
            case 111: 
            case 113: 
            case 115: 
            case 121: 
            case 123: 
            case 125: 
            case 127: 
            case 129: 
            case 131: {
                a5 = 2;
            }
        }
        a5 = 1;
        return new Class816(a5, a2);
    }

    public Class816 Method3668(a a2, Class816 a3, Class816 a4, Class816 a5) {
        return new Class816(1, a2);
    }

    public Class816 Method3669(a a2, List a3) {
        int a4;
        int a5 = a2.Method3640();
        if (a5 == 197) {
            a4 = 1;
        } else {
            String a6 = a5 == 186 ? ((Class88)a2).Field760 : ((Class98)a2).Field826;
            a4 = b.Method3213(a6).Method3233();
        }
        return new Class816(a4, a2);
    }

    public void Method3670(a a2, Class816 a3, Class816 a4) {
    }

    public Class816 Method3671(Class816 a2, Class816 a3) {
        if (a2.Field3653 instanceof Class701 && a3.Field3653 instanceof Class701) {
            Set a4 = ((Class701)a2.Field3653).Method1800((Class701)a3.Field3653);
            if (a4 == a2.Field3653 && a2.Field3652 == a3.Field3652) {
                return a2;
            }
            return new Class816(Math.min((int)a2.Field3652, (int)a3.Field3652), a4);
        }
        if (a2.Field3652 != a3.Field3652 || !a2.Field3653.containsAll((Collection)a3.Field3653)) {
            HashSet a5 = new HashSet();
            a5.addAll((Collection)a2.Field3653);
            a5.addAll((Collection)a3.Field3653);
            return new Class816(Math.min((int)a2.Field3652, (int)a3.Field3652), (Set)a5);
        }
        return a2;
    }

    @Override
    public Class797 Method915(Class797 class797, Class797 class7972) {
        return this.Method3671((Class816)class797, (Class816)class7972);
    }

    @Override
    public void Method914(a a2, Class797 class797, Class797 class7972) throws Class731 {
        this.Method3670(a2, (Class816)class797, (Class816)class7972);
    }

    @Override
    public Class797 Method913(a a2, List list) throws Class731 {
        return this.Method3669(a2, list);
    }

    @Override
    public Class797 Method912(a a2, Class797 class797, Class797 class7972, Class797 class7973) throws Class731 {
        return this.Method3668(a2, (Class816)class797, (Class816)class7972, (Class816)class7973);
    }

    @Override
    public Class797 Method911(a a2, Class797 class797, Class797 class7972) throws Class731 {
        return this.Method3667(a2, (Class816)class797, (Class816)class7972);
    }

    @Override
    public Class797 Method910(a a2, Class797 class797) throws Class731 {
        return this.Method3666(a2, (Class816)class797);
    }

    @Override
    public Class797 Method909(a a2, Class797 class797) throws Class731 {
        return this.Method3665(a2, (Class816)class797);
    }

    @Override
    public Class797 Method908(a a2) throws Class731 {
        return this.Method3664(a2);
    }

    @Override
    public Class797 Method907(b b2) {
        return this.Method3663(b2);
    }
}