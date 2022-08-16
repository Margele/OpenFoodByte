/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package awsl;

import awsl.Class106;
import awsl.Class110;
import awsl.Class120;
import awsl.Class279;
import awsl.Class45;
import awsl.Class731;
import awsl.Class782;
import awsl.Class786;
import awsl.Class797;
import awsl.Class86;
import awsl.Class88;
import awsl.Class93;
import awsl.Class98;
import java.util.List;
import obfuscate.a;
import obfuscate.b;

public class Class809
extends Class786
implements Class45 {
    public Class809() {
        super(327680);
    }

    protected Class809(int a2) {
        super(a2);
    }

    public Class782 Method3360(b a2) {
        return Class782.Field3513;
    }

    public Class782 Method3361(a a2) throws Class731 {
        switch (a2.Method3640()) {
            case 1: {
                return this.Method3360(b.Method3205("null"));
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return Class782.Field3514;
            }
            case 9: 
            case 10: {
                return Class782.Field3516;
            }
            case 11: 
            case 12: 
            case 13: {
                return Class782.Field3515;
            }
            case 14: 
            case 15: {
                return Class782.Field3517;
            }
            case 16: 
            case 17: {
                return Class782.Field3514;
            }
            case 18: {
                Object a3 = ((Class106)a2).Field850;
                if (a3 instanceof Integer) {
                    return Class782.Field3514;
                }
                if (a3 instanceof Float) {
                    return Class782.Field3515;
                }
                if (a3 instanceof Long) {
                    return Class782.Field3516;
                }
                if (a3 instanceof Double) {
                    return Class782.Field3517;
                }
                if (a3 instanceof String) {
                    return this.Method3360(b.Method3205("java/lang/String"));
                }
                if (a3 instanceof b) {
                    int a4 = ((b)a3).Method3217();
                    if (a4 == 10 || a4 == 9) {
                        return this.Method3360(b.Method3205("java/lang/Class"));
                    }
                    if (a4 == 11) {
                        return this.Method3360(b.Method3205("java/lang/invoke/MethodType"));
                    }
                    throw new IllegalArgumentException("Illegal LDC constant " + a3);
                }
                if (a3 instanceof Class279) {
                    return this.Method3360(b.Method3205("java/lang/invoke/MethodHandle"));
                }
                throw new IllegalArgumentException("Illegal LDC constant " + a3);
            }
            case 168: {
                return Class782.Field3519;
            }
            case 178: {
                return this.Method3360(b.Method3204(((Class93)a2).Field809));
            }
            case 187: {
                return this.Method3360(b.Method3205(((Class110)a2).Field871));
            }
        }
        throw new Error("Internal error.");
    }

    public Class782 Method3362(a a2, Class782 a3) throws Class731 {
        return a3;
    }

    public Class782 Method3363(a a2, Class782 a3) throws Class731 {
        switch (a2.Method3640()) {
            case 116: 
            case 132: 
            case 136: 
            case 139: 
            case 142: 
            case 145: 
            case 146: 
            case 147: {
                return Class782.Field3514;
            }
            case 118: 
            case 134: 
            case 137: 
            case 144: {
                return Class782.Field3515;
            }
            case 117: 
            case 133: 
            case 140: 
            case 143: {
                return Class782.Field3516;
            }
            case 119: 
            case 135: 
            case 138: 
            case 141: {
                return Class782.Field3517;
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 170: 
            case 171: 
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 176: 
            case 179: {
                return null;
            }
            case 180: {
                return this.Method3360(b.Method3204(((Class93)a2).Field809));
            }
            case 188: {
                switch (((Class86)a2).Field734) {
                    case 4: {
                        return this.Method3360(b.Method3204("[Z"));
                    }
                    case 5: {
                        return this.Method3360(b.Method3204("[C"));
                    }
                    case 8: {
                        return this.Method3360(b.Method3204("[B"));
                    }
                    case 9: {
                        return this.Method3360(b.Method3204("[S"));
                    }
                    case 10: {
                        return this.Method3360(b.Method3204("[I"));
                    }
                    case 6: {
                        return this.Method3360(b.Method3204("[F"));
                    }
                    case 7: {
                        return this.Method3360(b.Method3204("[D"));
                    }
                    case 11: {
                        return this.Method3360(b.Method3204("[J"));
                    }
                }
                throw new Class731(a2, "Invalid array type");
            }
            case 189: {
                String a4 = ((Class110)a2).Field871;
                return this.Method3360(b.Method3204("[" + b.Method3205(a4)));
            }
            case 190: {
                return Class782.Field3514;
            }
            case 191: {
                return null;
            }
            case 192: {
                String a5 = ((Class110)a2).Field871;
                return this.Method3360(b.Method3205(a5));
            }
            case 193: {
                return Class782.Field3514;
            }
            case 194: 
            case 195: 
            case 198: 
            case 199: {
                return null;
            }
        }
        throw new Error("Internal error.");
    }

    public Class782 Method3364(a a2, Class782 a3, Class782 a4) throws Class731 {
        switch (a2.Method3640()) {
            case 46: 
            case 51: 
            case 52: 
            case 53: 
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
            case 130: {
                return Class782.Field3514;
            }
            case 48: 
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: {
                return Class782.Field3515;
            }
            case 47: 
            case 97: 
            case 101: 
            case 105: 
            case 109: 
            case 113: 
            case 121: 
            case 123: 
            case 125: 
            case 127: 
            case 129: 
            case 131: {
                return Class782.Field3516;
            }
            case 49: 
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: {
                return Class782.Field3517;
            }
            case 50: {
                return Class782.Field3518;
            }
            case 148: 
            case 149: 
            case 150: 
            case 151: 
            case 152: {
                return Class782.Field3514;
            }
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 181: {
                return null;
            }
        }
        throw new Error("Internal error.");
    }

    public Class782 Method3365(a a2, Class782 a3, Class782 a4, Class782 a5) throws Class731 {
        return null;
    }

    public Class782 Method3366(a a2, List a3) throws Class731 {
        int a4 = a2.Method3640();
        if (a4 == 197) {
            return this.Method3360(b.Method3204(((Class120)a2).Field952));
        }
        if (a4 == 186) {
            return this.Method3360(b.Method3213(((Class88)a2).Field760));
        }
        return this.Method3360(b.Method3213(((Class98)a2).Field826));
    }

    public void Method3367(a a2, Class782 a3, Class782 a4) throws Class731 {
    }

    public Class782 Method3368(Class782 a2, Class782 a3) {
        if (!a2.Method863(a3)) {
            return Class782.Field3513;
        }
        return a2;
    }

    @Override
    public Class797 Method915(Class797 class797, Class797 class7972) {
        return this.Method3368((Class782)class797, (Class782)class7972);
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

    @Override
    public Class797 Method908(a a2) throws Class731 {
        return this.Method3361(a2);
    }

    @Override
    public Class797 Method907(b b2) {
        return this.Method3360(b2);
    }

    private static Exception Method3369(Exception exception) {
        return exception;
    }
}