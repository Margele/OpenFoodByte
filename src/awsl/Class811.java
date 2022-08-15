/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Error
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package awsl;

import awsl.Class46;
import awsl.Class731;
import awsl.Class782;
import awsl.Class786;
import awsl.Class797;
import awsl.Class809;
import awsl.Class88;
import awsl.Class91;
import awsl.Class93;
import awsl.Class98;
import java.util.List;

public class Class811
extends Class809 {
    public Class811() {
        super(327680);
    }

    protected Class811(int a) {
        super(a);
    }

    @Override
    public Class782 Method3362(Class91 a, Class782 a2) throws Class731 {
        Class782 a3;
        switch (a.Method3640()) {
            case 21: 
            case 54: {
                a3 = Class782.Field3514;
                break;
            }
            case 23: 
            case 56: {
                a3 = Class782.Field3515;
                break;
            }
            case 22: 
            case 55: {
                a3 = Class782.Field3516;
                break;
            }
            case 24: 
            case 57: {
                a3 = Class782.Field3517;
                break;
            }
            case 25: {
                if (!a2.Method862()) {
                    throw new Class731(a, null, "an object reference", a2);
                }
                return a2;
            }
            case 58: {
                if (!a2.Method862() && !Class782.Field3519.Method863(a2)) {
                    throw new Class731(a, null, "an object reference or a return address", a2);
                }
                return a2;
            }
            default: {
                return a2;
            }
        }
        if (!a3.Method3429(a2)) {
            throw new Class731(a, null, a3, a2);
        }
        return a2;
    }

    @Override
    public Class782 Method3363(Class91 a, Class782 a2) throws Class731 {
        Class782 a3;
        switch (a.Method3640()) {
            case 116: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 145: 
            case 146: 
            case 147: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 170: 
            case 171: 
            case 172: 
            case 188: 
            case 189: {
                a3 = Class782.Field3514;
                break;
            }
            case 118: 
            case 139: 
            case 140: 
            case 141: 
            case 174: {
                a3 = Class782.Field3515;
                break;
            }
            case 117: 
            case 136: 
            case 137: 
            case 138: 
            case 173: {
                a3 = Class782.Field3516;
                break;
            }
            case 119: 
            case 142: 
            case 143: 
            case 144: 
            case 175: {
                a3 = Class782.Field3517;
                break;
            }
            case 180: {
                a3 = this.Method3360(Class46.Method3205(((Class93)a).Field807));
                break;
            }
            case 192: {
                if (!a2.Method862()) {
                    throw new Class731(a, null, "an object reference", a2);
                }
                return super.Method3363(a, a2);
            }
            case 190: {
                if (!this.Method3660(a2)) {
                    throw new Class731(a, null, "an array reference", a2);
                }
                return super.Method3363(a, a2);
            }
            case 176: 
            case 191: 
            case 193: 
            case 194: 
            case 195: 
            case 198: 
            case 199: {
                if (!a2.Method862()) {
                    throw new Class731(a, null, "an object reference", a2);
                }
                return super.Method3363(a, a2);
            }
            case 179: {
                a3 = this.Method3360(Class46.Method3204(((Class93)a).Field809));
                break;
            }
            default: {
                throw new Error("Internal error.");
            }
        }
        if (!this.Method3662(a2, a3)) {
            throw new Class731(a, null, a3, a2);
        }
        return super.Method3363(a, a2);
    }

    @Override
    public Class782 Method3364(Class91 a, Class782 a2, Class782 a3) throws Class731 {
        int[] a4 = Class786.Method917();
        switch (a.Method3640()) {
            case 46: {
                Class782 a5 = this.Method3360(Class46.Method3204("[I"));
                Class782 a6 = Class782.Field3514;
            }
            case 51: {
                Class782 a5;
                if (this.Method3662(a2, this.Method3360(Class46.Method3204("[Z")))) {
                    a5 = this.Method3360(Class46.Method3204("[Z"));
                }
                a5 = this.Method3360(Class46.Method3204("[B"));
                Class782 a6 = Class782.Field3514;
            }
            case 52: {
                Class782 a5 = this.Method3360(Class46.Method3204("[C"));
                Class782 a6 = Class782.Field3514;
            }
            case 53: {
                Class782 a5 = this.Method3360(Class46.Method3204("[S"));
                Class782 a6 = Class782.Field3514;
            }
            case 47: {
                Class782 a5 = this.Method3360(Class46.Method3204("[J"));
                Class782 a6 = Class782.Field3514;
            }
            case 48: {
                Class782 a5 = this.Method3360(Class46.Method3204("[F"));
                Class782 a6 = Class782.Field3514;
            }
            case 49: {
                Class782 a5 = this.Method3360(Class46.Method3204("[D"));
                Class782 a6 = Class782.Field3514;
            }
            case 50: {
                Class782 a5 = this.Method3360(Class46.Method3204("[Ljava/lang/Object;"));
                Class782 a6 = Class782.Field3514;
            }
            case 96: 
            case 100: 
            case 104: 
            case 108: 
            case 112: 
            case 120: 
            case 122: 
            case 124: 
            case 126: 
            case 128: 
            case 130: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: {
                Class782 a5 = Class782.Field3514;
                Class782 a6 = Class782.Field3514;
            }
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: 
            case 149: 
            case 150: {
                Class782 a5 = Class782.Field3515;
                Class782 a6 = Class782.Field3515;
            }
            case 97: 
            case 101: 
            case 105: 
            case 109: 
            case 113: 
            case 127: 
            case 129: 
            case 131: 
            case 148: {
                Class782 a5 = Class782.Field3516;
                Class782 a6 = Class782.Field3516;
            }
            case 121: 
            case 123: 
            case 125: {
                Class782 a5 = Class782.Field3516;
                Class782 a6 = Class782.Field3514;
            }
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: 
            case 151: 
            case 152: {
                Class782 a5 = Class782.Field3517;
                Class782 a6 = Class782.Field3517;
            }
            case 165: 
            case 166: {
                Class782 a5 = Class782.Field3518;
                Class782 a6 = Class782.Field3518;
            }
            case 181: {
                Class93 a7 = (Class93)a;
                Class782 a5 = this.Method3360(Class46.Method3205(a7.Field807));
                Class782 a6 = this.Method3360(Class46.Method3204(a7.Field809));
            }
        }
        throw new Error("Internal error.");
    }

    @Override
    public Class782 Method3365(Class91 a, Class782 a2, Class782 a3, Class782 a4) throws Class731 {
        Class782 a5;
        Class782 a6;
        switch (a.Method3640()) {
            case 79: {
                a6 = this.Method3360(Class46.Method3204("[I"));
                a5 = Class782.Field3514;
                break;
            }
            case 84: {
                a6 = this.Method3662(a2, this.Method3360(Class46.Method3204("[Z"))) ? this.Method3360(Class46.Method3204("[Z")) : this.Method3360(Class46.Method3204("[B"));
                a5 = Class782.Field3514;
                break;
            }
            case 85: {
                a6 = this.Method3360(Class46.Method3204("[C"));
                a5 = Class782.Field3514;
                break;
            }
            case 86: {
                a6 = this.Method3360(Class46.Method3204("[S"));
                a5 = Class782.Field3514;
                break;
            }
            case 80: {
                a6 = this.Method3360(Class46.Method3204("[J"));
                a5 = Class782.Field3516;
                break;
            }
            case 81: {
                a6 = this.Method3360(Class46.Method3204("[F"));
                a5 = Class782.Field3515;
                break;
            }
            case 82: {
                a6 = this.Method3360(Class46.Method3204("[D"));
                a5 = Class782.Field3517;
                break;
            }
            case 83: {
                a6 = a2;
                a5 = Class782.Field3518;
                break;
            }
            default: {
                throw new Error("Internal error.");
            }
        }
        if (!this.Method3662(a2, a6)) {
            throw new Class731(a, "First argument", "a " + a6 + " array reference", a2);
        }
        if (!Class782.Field3514.Method863(a3)) {
            throw new Class731(a, "Second argument", Class782.Field3514, a3);
        }
        if (!this.Method3662(a4, a5)) {
            throw new Class731(a, "Third argument", a5, a4);
        }
        return null;
    }

    @Override
    public Class782 Method3366(Class91 a, List a2) throws Class731 {
        int a3 = a.Method3640();
        if (a3 == 197) {
            for (int a4 = 0; a4 < a2.Method1799(); ++a4) {
                if (Class782.Field3514.Method863(a2.get(a4))) continue;
                throw new Class731(a, null, Class782.Field3514, (Class797)a2.get(a4));
            }
        } else {
            Object a5;
            int a6 = 0;
            int a7 = 0;
            if (a3 != 184 && a3 != 186) {
                a5 = Class46.Method3205(((Class98)a).Field824);
                if (!this.Method3662((Class782)a2.get(a6++), this.Method3360((Class46)a5))) {
                    throw new Class731(a, "Method owner", this.Method3360((Class46)a5), (Class797)a2.get(0));
                }
            }
            a5 = a3 == 186 ? ((Class88)a).Field760 : ((Class98)a).Field826;
            Class46[] a8 = Class46.Method3211((String)a5);
            while (a6 < a2.Method1799()) {
                Class782 a9;
                Class782 a10 = this.Method3360(a8[a7++]);
                if (this.Method3662(a9 = (Class782)a2.get(a6++), a10)) continue;
                throw new Class731(a, "Argument " + a7, a10, a9);
            }
        }
        return super.Method3366(a, a2);
    }

    @Override
    public void Method3367(Class91 a, Class782 a2, Class782 a3) throws Class731 {
        if (!this.Method3662(a2, a3)) {
            throw new Class731(a, "Incompatible return type", a3, a2);
        }
    }

    protected boolean Method3660(Class782 a) {
        return a.Method862();
    }

    protected Class782 Method3661(Class782 a) throws Class731 {
        return Class782.Field3518;
    }

    protected boolean Method3662(Class782 a, Class782 a2) {
        return a.Method863(a2);
    }

    @Override
    public void Method914(Class91 class91, Class797 class797, Class797 class7972) throws Class731 {
        this.Method3367(class91, (Class782)class797, (Class782)class7972);
    }

    @Override
    public Class797 Method913(Class91 class91, List list) throws Class731 {
        return this.Method3366(class91, list);
    }

    @Override
    public Class797 Method912(Class91 class91, Class797 class797, Class797 class7972, Class797 class7973) throws Class731 {
        return this.Method3365(class91, (Class782)class797, (Class782)class7972, (Class782)class7973);
    }

    @Override
    public Class797 Method911(Class91 class91, Class797 class797, Class797 class7972) throws Class731 {
        return this.Method3364(class91, (Class782)class797, (Class782)class7972);
    }

    @Override
    public Class797 Method910(Class91 class91, Class797 class797) throws Class731 {
        return this.Method3363(class91, (Class782)class797);
    }

    @Override
    public Class797 Method909(Class91 class91, Class797 class797) throws Class731 {
        return this.Method3362(class91, (Class782)class797);
    }

    private static Class731 Method859(Class731 class731) {
        return class731;
    }
}