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

import awsl.Class731;
import awsl.Class782;
import awsl.Class786;
import awsl.Class797;
import awsl.Class809;
import awsl.Class88;
import awsl.Class93;
import awsl.Class98;
import java.util.List;
import obfuscate.a;
import obfuscate.b;

public class Class811
extends Class809 {
    public Class811() {
        super(327680);
    }

    protected Class811(int a2) {
        super(a2);
    }

    @Override
    public Class782 Method3362(a a2, Class782 a3) throws Class731 {
        Class782 a4;
        switch (a2.Method3640()) {
            case 21: 
            case 54: {
                a4 = Class782.Field3514;
                break;
            }
            case 23: 
            case 56: {
                a4 = Class782.Field3515;
                break;
            }
            case 22: 
            case 55: {
                a4 = Class782.Field3516;
                break;
            }
            case 24: 
            case 57: {
                a4 = Class782.Field3517;
                break;
            }
            case 25: {
                if (!a3.Method862()) {
                    throw new Class731(a2, null, "an object reference", a3);
                }
                return a3;
            }
            case 58: {
                if (!a3.Method862() && !Class782.Field3519.Method863(a3)) {
                    throw new Class731(a2, null, "an object reference or a return address", a3);
                }
                return a3;
            }
            default: {
                return a3;
            }
        }
        if (!a4.Method3429(a3)) {
            throw new Class731(a2, null, a4, a3);
        }
        return a3;
    }

    @Override
    public Class782 Method3363(a a2, Class782 a3) throws Class731 {
        Class782 a4;
        switch (a2.Method3640()) {
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
                a4 = Class782.Field3514;
                break;
            }
            case 118: 
            case 139: 
            case 140: 
            case 141: 
            case 174: {
                a4 = Class782.Field3515;
                break;
            }
            case 117: 
            case 136: 
            case 137: 
            case 138: 
            case 173: {
                a4 = Class782.Field3516;
                break;
            }
            case 119: 
            case 142: 
            case 143: 
            case 144: 
            case 175: {
                a4 = Class782.Field3517;
                break;
            }
            case 180: {
                a4 = this.Method3360(b.Method3205(((Class93)a2).Field807));
                break;
            }
            case 192: {
                if (!a3.Method862()) {
                    throw new Class731(a2, null, "an object reference", a3);
                }
                return super.Method3363(a2, a3);
            }
            case 190: {
                if (!this.Method3660(a3)) {
                    throw new Class731(a2, null, "an array reference", a3);
                }
                return super.Method3363(a2, a3);
            }
            case 176: 
            case 191: 
            case 193: 
            case 194: 
            case 195: 
            case 198: 
            case 199: {
                if (!a3.Method862()) {
                    throw new Class731(a2, null, "an object reference", a3);
                }
                return super.Method3363(a2, a3);
            }
            case 179: {
                a4 = this.Method3360(b.Method3204(((Class93)a2).Field809));
                break;
            }
            default: {
                throw new Error("Internal error.");
            }
        }
        if (!this.Method3662(a3, a4)) {
            throw new Class731(a2, null, a4, a3);
        }
        return super.Method3363(a2, a3);
    }

    @Override
    public Class782 Method3364(a a2, Class782 a3, Class782 a4) throws Class731 {
        int[] a5 = Class786.Method917();
        switch (a2.Method3640()) {
            case 46: {
                Class782 a6 = this.Method3360(b.Method3204("[I"));
                Class782 a7 = Class782.Field3514;
            }
            case 51: {
                Class782 a6;
                if (this.Method3662(a3, this.Method3360(b.Method3204("[Z")))) {
                    a6 = this.Method3360(b.Method3204("[Z"));
                }
                a6 = this.Method3360(b.Method3204("[B"));
                Class782 a7 = Class782.Field3514;
            }
            case 52: {
                Class782 a6 = this.Method3360(b.Method3204("[C"));
                Class782 a7 = Class782.Field3514;
            }
            case 53: {
                Class782 a6 = this.Method3360(b.Method3204("[S"));
                Class782 a7 = Class782.Field3514;
            }
            case 47: {
                Class782 a6 = this.Method3360(b.Method3204("[J"));
                Class782 a7 = Class782.Field3514;
            }
            case 48: {
                Class782 a6 = this.Method3360(b.Method3204("[F"));
                Class782 a7 = Class782.Field3514;
            }
            case 49: {
                Class782 a6 = this.Method3360(b.Method3204("[D"));
                Class782 a7 = Class782.Field3514;
            }
            case 50: {
                Class782 a6 = this.Method3360(b.Method3204("[Ljava/lang/Object;"));
                Class782 a7 = Class782.Field3514;
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
                Class782 a6 = Class782.Field3514;
                Class782 a7 = Class782.Field3514;
            }
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: 
            case 149: 
            case 150: {
                Class782 a6 = Class782.Field3515;
                Class782 a7 = Class782.Field3515;
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
                Class782 a6 = Class782.Field3516;
                Class782 a7 = Class782.Field3516;
            }
            case 121: 
            case 123: 
            case 125: {
                Class782 a6 = Class782.Field3516;
                Class782 a7 = Class782.Field3514;
            }
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: 
            case 151: 
            case 152: {
                Class782 a6 = Class782.Field3517;
                Class782 a7 = Class782.Field3517;
            }
            case 165: 
            case 166: {
                Class782 a6 = Class782.Field3518;
                Class782 a7 = Class782.Field3518;
            }
            case 181: {
                Class93 a8 = (Class93)a2;
                Class782 a6 = this.Method3360(b.Method3205(a8.Field807));
                Class782 a7 = this.Method3360(b.Method3204(a8.Field809));
            }
        }
        throw new Error("Internal error.");
    }

    @Override
    public Class782 Method3365(a a2, Class782 a3, Class782 a4, Class782 a5) throws Class731 {
        Class782 a6;
        Class782 a7;
        switch (a2.Method3640()) {
            case 79: {
                a7 = this.Method3360(b.Method3204("[I"));
                a6 = Class782.Field3514;
                break;
            }
            case 84: {
                a7 = this.Method3662(a3, this.Method3360(b.Method3204("[Z"))) ? this.Method3360(b.Method3204("[Z")) : this.Method3360(b.Method3204("[B"));
                a6 = Class782.Field3514;
                break;
            }
            case 85: {
                a7 = this.Method3360(b.Method3204("[C"));
                a6 = Class782.Field3514;
                break;
            }
            case 86: {
                a7 = this.Method3360(b.Method3204("[S"));
                a6 = Class782.Field3514;
                break;
            }
            case 80: {
                a7 = this.Method3360(b.Method3204("[J"));
                a6 = Class782.Field3516;
                break;
            }
            case 81: {
                a7 = this.Method3360(b.Method3204("[F"));
                a6 = Class782.Field3515;
                break;
            }
            case 82: {
                a7 = this.Method3360(b.Method3204("[D"));
                a6 = Class782.Field3517;
                break;
            }
            case 83: {
                a7 = a3;
                a6 = Class782.Field3518;
                break;
            }
            default: {
                throw new Error("Internal error.");
            }
        }
        if (!this.Method3662(a3, a7)) {
            throw new Class731(a2, "First argument", "a " + a7 + " array reference", a3);
        }
        if (!Class782.Field3514.Method863(a4)) {
            throw new Class731(a2, "Second argument", Class782.Field3514, a4);
        }
        if (!this.Method3662(a5, a6)) {
            throw new Class731(a2, "Third argument", a6, a5);
        }
        return null;
    }

    @Override
    public Class782 Method3366(a a2, List a3) throws Class731 {
        int a4 = a2.Method3640();
        if (a4 == 197) {
            for (int a5 = 0; a5 < a3.Method1799(); ++a5) {
                if (Class782.Field3514.Method863(a3.get(a5))) continue;
                throw new Class731(a2, null, Class782.Field3514, (Class797)a3.get(a5));
            }
        } else {
            Object a6;
            int a7 = 0;
            int a8 = 0;
            if (a4 != 184 && a4 != 186) {
                a6 = b.Method3205(((Class98)a2).Field824);
                if (!this.Method3662((Class782)a3.get(a7++), this.Method3360((b)a6))) {
                    throw new Class731(a2, "Method owner", this.Method3360((b)a6), (Class797)a3.get(0));
                }
            }
            a6 = a4 == 186 ? ((Class88)a2).Field760 : ((Class98)a2).Field826;
            b[] a9 = b.Method3211((String)a6);
            while (a7 < a3.Method1799()) {
                Class782 a10;
                Class782 a11 = this.Method3360(a9[a8++]);
                if (this.Method3662(a10 = (Class782)a3.get(a7++), a11)) continue;
                throw new Class731(a2, "Argument " + a8, a11, a10);
            }
        }
        return super.Method3366(a2, a3);
    }

    @Override
    public void Method3367(a a2, Class782 a3, Class782 a4) throws Class731 {
        if (!this.Method3662(a3, a4)) {
            throw new Class731(a2, "Incompatible return type", a4, a3);
        }
    }

    protected boolean Method3660(Class782 a2) {
        return a2.Method862();
    }

    protected Class782 Method3661(Class782 a2) throws Class731 {
        return Class782.Field3518;
    }

    protected boolean Method3662(Class782 a2, Class782 a3) {
        return a2.Method863(a3);
    }

    @Override
    public void Method914(a a2, Class797 class797, Class797 class7972) throws Class731 {
        this.Method3367(a2, (Class782)class797, (Class782)class7972);
    }

    @Override
    public Class797 Method913(a a2, List list) throws Class731 {
        return this.Method3366(a2, list);
    }

    @Override
    public Class797 Method912(a a2, Class797 class797, Class797 class7972, Class797 class7973) throws Class731 {
        return this.Method3365(a2, (Class782)class797, (Class782)class7972, (Class782)class7973);
    }

    @Override
    public Class797 Method911(a a2, Class797 class797, Class797 class7972) throws Class731 {
        return this.Method3364(a2, (Class782)class797, (Class782)class7972);
    }

    @Override
    public Class797 Method910(a a2, Class797 class797) throws Class731 {
        return this.Method3363(a2, (Class782)class797);
    }

    @Override
    public Class797 Method909(a a2, Class797 class797) throws Class731 {
        return this.Method3362(a2, (Class782)class797);
    }

    private static Class731 Method859(Class731 class731) {
        return class731;
    }
}