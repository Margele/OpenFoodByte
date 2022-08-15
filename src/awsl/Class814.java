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
import awsl.Class46;
import awsl.Class701;
import awsl.Class731;
import awsl.Class786;
import awsl.Class797;
import awsl.Class816;
import awsl.Class88;
import awsl.Class91;
import awsl.Class93;
import awsl.Class98;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Class814
extends Class786
implements Class45 {
    public Class814() {
        super(327680);
    }

    protected Class814(int a) {
        super(a);
    }

    public Class816 Method3663(Class46 a) {
        if (a == Class46.Field572) {
            return null;
        }
        return new Class816(1);
    }

    public Class816 Method3664(Class91 a) {
        int a2;
        int[] a3 = Class786.Method917();
        switch (a.Method3640()) {
            case 9: 
            case 10: 
            case 14: 
            case 15: {
                a2 = 2;
            }
            case 18: {
                Object a4 = ((Class106)a).Field850;
                a2 = a4 instanceof Long || a4 instanceof Double ? 2 : 1;
            }
            case 178: {
                a2 = Class46.Method3204(((Class93)a).Field809).Method3233();
            }
        }
        a2 = 1;
        return new Class816(a2, a);
    }

    public Class816 Method3665(Class91 a, Class816 a2) {
        return new Class816(a2.Method806(), a);
    }

    public Class816 Method3666(Class91 a, Class816 a2) {
        int a3;
        switch (a.Method3640()) {
            case 117: 
            case 119: 
            case 133: 
            case 135: 
            case 138: 
            case 140: 
            case 141: 
            case 143: {
                a3 = 2;
                break;
            }
            case 180: {
                a3 = Class46.Method3204(((Class93)a).Field809).Method3233();
                break;
            }
            default: {
                a3 = 1;
            }
        }
        return new Class816(a3, a);
    }

    public Class816 Method3667(Class91 a, Class816 a2, Class816 a3) {
        int a4;
        int[] a5 = Class786.Method917();
        switch (a.Method3640()) {
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
                a4 = 2;
            }
        }
        a4 = 1;
        return new Class816(a4, a);
    }

    public Class816 Method3668(Class91 a, Class816 a2, Class816 a3, Class816 a4) {
        return new Class816(1, a);
    }

    public Class816 Method3669(Class91 a, List a2) {
        int a3;
        int a4 = a.Method3640();
        if (a4 == 197) {
            a3 = 1;
        } else {
            String a5 = a4 == 186 ? ((Class88)a).Field760 : ((Class98)a).Field826;
            a3 = Class46.Method3213(a5).Method3233();
        }
        return new Class816(a3, a);
    }

    public void Method3670(Class91 a, Class816 a2, Class816 a3) {
    }

    public Class816 Method3671(Class816 a, Class816 a2) {
        if (a.Field3653 instanceof Class701 && a2.Field3653 instanceof Class701) {
            Set a3 = ((Class701)a.Field3653).Method1800((Class701)a2.Field3653);
            if (a3 == a.Field3653 && a.Field3652 == a2.Field3652) {
                return a;
            }
            return new Class816(Math.min((int)a.Field3652, (int)a2.Field3652), a3);
        }
        if (a.Field3652 != a2.Field3652 || !a.Field3653.containsAll((Collection)a2.Field3653)) {
            HashSet a4 = new HashSet();
            a4.addAll((Collection)a.Field3653);
            a4.addAll((Collection)a2.Field3653);
            return new Class816(Math.min((int)a.Field3652, (int)a2.Field3652), (Set)a4);
        }
        return a;
    }

    @Override
    public Class797 Method915(Class797 class797, Class797 class7972) {
        return this.Method3671((Class816)class797, (Class816)class7972);
    }

    @Override
    public void Method914(Class91 class91, Class797 class797, Class797 class7972) throws Class731 {
        this.Method3670(class91, (Class816)class797, (Class816)class7972);
    }

    @Override
    public Class797 Method913(Class91 class91, List list) throws Class731 {
        return this.Method3669(class91, list);
    }

    @Override
    public Class797 Method912(Class91 class91, Class797 class797, Class797 class7972, Class797 class7973) throws Class731 {
        return this.Method3668(class91, (Class816)class797, (Class816)class7972, (Class816)class7973);
    }

    @Override
    public Class797 Method911(Class91 class91, Class797 class797, Class797 class7972) throws Class731 {
        return this.Method3667(class91, (Class816)class797, (Class816)class7972);
    }

    @Override
    public Class797 Method910(Class91 class91, Class797 class797) throws Class731 {
        return this.Method3666(class91, (Class816)class797);
    }

    @Override
    public Class797 Method909(Class91 class91, Class797 class797) throws Class731 {
        return this.Method3665(class91, (Class816)class797);
    }

    @Override
    public Class797 Method908(Class91 class91) throws Class731 {
        return this.Method3664(class91);
    }

    @Override
    public Class797 Method907(Class46 class46) {
        return this.Method3663(class46);
    }
}