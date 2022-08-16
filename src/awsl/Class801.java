/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.PrintWriter
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.util.ArrayList
 *  java.util.List
 */
package awsl;

import awsl.Class136;
import awsl.Class264;
import awsl.Class279;
import awsl.Class31;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import obfuscate.a;

public abstract class Class801 {
    public static final String[] Field3575;
    public static final String[] Field3576;
    public static final String[] Field3577;
    protected final int Field3578;
    protected final StringBuffer Field3579;
    public final List Field3580;
    private static a[] Field3581;
    private static final String[] Field3582;
    private static final String[] Field3583;

    protected Class801(int a2) {
        this.Field3578 = a2;
        this.Field3579 = new StringBuffer();
        this.Field3580 = new ArrayList();
    }

    public abstract void Method3245(int var1, int var2, String var3, String var4, String var5, String[] var6);

    public abstract void Method3246(String var1, String var2);

    public abstract void Method3247(String var1, String var2, String var3);

    public abstract Class801 Method3248(String var1, boolean var2);

    public Class801 Method3249(int a2, Class31 a3, String a4, boolean a5) {
        throw new RuntimeException(Class801.Method3302(-15101, -7472));
    }

    public abstract void Method3250(Class136 var1);

    public abstract void Method3251(String var1, String var2, String var3, int var4);

    public abstract Class801 Method3252(int var1, String var2, String var3, String var4, Object var5);

    public abstract Class801 Method3253(int var1, String var2, String var3, String var4, String[] var5);

    public abstract void Method3254();

    public abstract void Method3255(String var1, Object var2);

    public abstract void Method3256(String var1, String var2, String var3);

    public abstract Class801 Method3257(String var1, String var2);

    public abstract Class801 Method3258(String var1);

    public abstract void Method3259();

    public abstract Class801 Method3260(String var1, boolean var2);

    public Class801 Method3261(int a2, Class31 a3, String a4, boolean a5) {
        throw new RuntimeException(Class801.Method3302(-15101, -7472));
    }

    public abstract void Method3262(Class136 var1);

    public abstract void Method3263();

    public void Method3264(String a2, int a3) {
        throw new RuntimeException(Class801.Method3302(-15101, -7472));
    }

    public abstract Class801 Method3265();

    public abstract Class801 Method3266(String var1, boolean var2);

    public Class801 Method3267(int a2, Class31 a3, String a4, boolean a5) {
        throw new RuntimeException(Class801.Method3302(-15101, -7472));
    }

    public abstract Class801 Method3268(int var1, String var2, boolean var3);

    public abstract void Method3269(Class136 var1);

    public abstract void Method3270();

    public abstract void Method3271(int var1, int var2, Object[] var3, int var4, Object[] var5);

    public abstract void Method3272(int var1);

    public abstract void Method3273(int var1, int var2);

    public abstract void Method3274(int var1, int var2);

    public abstract void Method3275(int var1, String var2);

    public abstract void Method3276(int var1, String var2, String var3, String var4);

    @Deprecated
    public void Method3277(int a2, String a3, String a4, String a5) {
        if (this.Field3578 >= 327680) {
            boolean a6 = a2 == 185;
            this.Method3278(a2, a3, a4, a5, a6);
            return;
        }
        throw new RuntimeException(Class801.Method3302(-15101, -7472));
    }

    public void Method3278(int a2, String a3, String a4, String a5, boolean a6) {
        if (this.Field3578 < 327680) {
            if (a6 != (a2 == 185)) {
                throw new IllegalArgumentException(Class801.Method3302(-15092, 32110));
            }
            this.Method3277(a2, a3, a4, a5);
            return;
        }
        throw new RuntimeException(Class801.Method3302(-15101, -7472));
    }

    public abstract void Method3279(String var1, String var2, Class279 var3, Object[] var4);

    public abstract void Method3280(int var1, Class264 var2);

    public abstract void Method3281(Class264 var1);

    public abstract void Method3282(Object var1);

    public abstract void Method3283(int var1, int var2);

    public abstract void Method3284(int var1, int var2, Class264 var3, Class264[] var4);

    public abstract void Method3285(Class264 var1, int[] var2, Class264[] var3);

    public abstract void Method3286(String var1, int var2);

    public Class801 Method3287(int a2, Class31 a3, String a4, boolean a5) {
        throw new RuntimeException(Class801.Method3302(-15101, -7472));
    }

    public abstract void Method3288(Class264 var1, Class264 var2, Class264 var3, String var4);

    public Class801 Method3289(int a2, Class31 a3, String a4, boolean a5) {
        throw new RuntimeException(Class801.Method3302(-15101, -7472));
    }

    public abstract void Method3290(String var1, String var2, String var3, Class264 var4, Class264 var5, int var6);

    public Class801 Method3291(int a2, Class31 a3, Class264[] a4, Class264[] a5, int[] a6, String a7, boolean a8) {
        throw new RuntimeException(Class801.Method3302(-15102, -18815));
    }

    public abstract void Method3292(int var1, Class264 var2);

    public abstract void Method3293(int var1, int var2);

    public abstract void Method3294();

    public List Method3295() {
        return this.Field3580;
    }

    public void Method3296(PrintWriter a2) {
        Class801.Method3298(a2, this.Field3580);
    }

    public static void Method3297(StringBuffer a2, String a3) {
        a[] aArray = Class801.Method3300();
        a2.append('\"');
        a[] a4 = aArray;
        int a5 = 0;
        if (a5 < a3.length()) {
            char a6 = a3.charAt(a5);
            if (a6 == '\n') {
                a2.append(Class801.Method3302(-15104, 28918));
            }
            if (a6 == '\r') {
                a2.append(Class801.Method3302(-15091, 28797));
            }
            if (a6 == '\\') {
                a2.append(Class801.Method3302(-15099, -31256));
            }
            if (a6 == '\"') {
                a2.append(Class801.Method3302(-15089, 640));
            }
            if (a6 < ' ' || a6 > '\u007f') {
                a2.append(Class801.Method3302(-15097, -2357));
                if (a6 < '\u0010') {
                    a2.append(Class801.Method3302(-15096, -4927));
                }
                if (a6 < '\u0100') {
                    a2.append(Class801.Method3302(-15090, 27822));
                }
                if (a6 < '\u1000') {
                    a2.append('0');
                }
                a2.append(Integer.toString((int)a6, (int)16));
            }
            a2.append(a6);
            ++a5;
        }
        a2.append('\"');
    }

    static void Method3298(PrintWriter a2, List a3) {
        for (int a4 = 0; a4 < a3.Method1799(); ++a4) {
            Object a5 = a3.get(a4);
            if (a5 instanceof List) {
                Class801.Method3298(a2, (List)a5);
                continue;
            }
            a2.print(a5.Method3780());
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                a = new String[13];
                a = 0;
                a = "\u00dd\u00c8\u00d8I\u00d7\u0082\u00e9\u00fc\u00a6\u00f8hX\u00ad\u00f5\u00cf9\u00c1\u0017\u00c0\u00c6\u00d8\u00c2\u0013\u007f=\u00f0\u00b8\u00c1\u00f13\u007fo^Bf\u00feHD\u00b6\u00aaD\u0006\u00ae6?\u00f6\u001f\u00fa#El\u00f0\u00cf\u00f4R\u0084\u00e6\u000b\u00bb\u00ddMb\u0080oQ<\u0005\u0083\u0087\u00af\u00a1`j\u00f9\u00ff\u008b\u0019\u00de\u00a6\u00f7\u00d1\u00c3\u00f1(\u0002\u00b8\u0092#\u001d_|\u00a8\u0084T\u0099;\u009d\u00ca+\u00dd\u0010\u0004 \u0012We\u001ch\u00b3\u001bR\u00a3P|Q\u00cd\u00ac\u0012a\u00ee\u00b7\u00baJl\u0090\u00881\u00fc\u00f7\u00b0\u00fa1\u0084w\u008c\u00b0\u00c8\u00a4\u00adr\u001a\u00cfov\u00da\u00d5[z\u00b2\u00ee\u009e\u00ea\u00fb]\u00bfrV\u0099\u00f0\u00f4\u00cbP\u0092^m3h\u00b1\u0081\u00d8aK\u007f\u00ca\u009f\u001ax6Q\u00f3.\u00c3\u00e9\u0095\r\u008a3\u009d\u00b6\\<\u00dd\u0018\u008c\u00c7!\u00b4\u00cf\u00a7\u00a6\u00a6\u0010dNg\u00f8\u00b3M\u00b2\u0019\u001a\u00c8r#q\t=l+|?\u00b0/\u0005\u00a8,\u00e4\u00d5\u00a39gj`\u00bc^\u00a8\n\u0006\fLp\u00de1\u00bf5\u00ba*\u00a6\u0011\u00eb%n\u00e9A\u00cc}\u00a6\u0089\u00c7|t~\u00cb\u00f0M\r\u00e4-m\u00fa\u0080*S\u0000\u00e7\u0080\u0087= \u00e4A\u0011\u00a8S8\u00f1D{\u0005\u00ef\u00d3\u00d0\u00a3Y1\u00a6\u00a6\u00a2\u00f9(|@\u0002\u0088[C\u00af\u00d8\u00b9\u00f0\u0006A\u0092\u00ec\u00e2\u00d1\u00b7\u000b\u00a93\u00f1\u00d6r1\u001a\u0014\u00a7\u00fe\u00b7\u009a{\u00d3\u0014EU\u00a0\u0015\u00f6\u00f50\u00c2\u00af\u00b0\u0001\u000e\u0018\u00f8\u00e0\u00f7\u00c1\u00a8k\u00d7;\u00ce\u0012@c\\\u00e5'\u00e7F\u00fd\u00ae98\u00c0\u00a6\u00d5\u0002G\u0080\u00b4\u00b2|a6\u0006\u009c\u00ca\u00a1\u00e4H\u00dfLv\t\u00a9\u0010~\u00bd\f??\u00a9FD\u0001\u00dd\u009d\u0011\u0095iS\u001a&R#l/l\u00d2\u00c2K\u00dcO\u00d0eYU\u00b9\u0082 \u0082i\u00e0\u009b!;b}\b\u00b6N\u00c7Z\u00dc\u00e47\u00ec<\u001b\u0017\u0094\u00d5Sg\"\u00af\u0010\u00a5=?\u00bf\u00ce\u0011\u0085pJ\u00af\u00f9\u00c6d\u0017\u0085s\u000b\u00cb\u00d3\u00c4\u0082\u00b8\\-m\"9i\u0086)\u00d2\u00f4\u00a6X\u00b3XE\u00da5AKxhp\u009f\u00ba\u00de\u00a0\u00c7\u001d\u00a3\u000fh\u00b2/2\u00d2\u001d\u0081\u00da#\u00d8\u0017[y\u00f2\u00f7\u0012\n\u00baN{\u00ad\u000f\u00bd'\u00f8\u00be\u009dW$\u00d8!\u00fa?(]\u00b97\u0098\u00ff.\rDU\u00a2#`~\u001ag\u0091\u00ee\u009c\u00a8\u00a2%\u009cQ\u009b\u00a2=\u00a6\u0005\u00f8\u001c,`D\u00bb\u00d3\u00ccg;\u00ef\u0087\u00dd\u00aa\u0091\r\u00aa3\u00d2\u000b\u00e6M\u00bd\u009cO\u0090X\u00a8\u001b\u00c8\u0084Z\u008f\u0011\u00ce\u00e8\u00c1\u007f\u00d3\u00bd\u0092\u00eaG\u008e\u00b653\u008d\u009e\u00f1l\u00a3\u0012J\u0099\u0014#W\u0083\u00a7oL\u00a1\u00e4Y\u00d9\u00de\u00a9Y%\u00f1\u00b5\u00afX\u00da]\u00d4\u00c64\u0092\u00b0$W\u00d2\u00f3\u00e5,\u0015i^aHAC\u00dd\u00169\u009d\u00fd\u0003.*\u00ea\u001f\u00d2#\u00f4'\u00a8\u0097T\u0007\u0093\u0096 \u009f\u00e8KQ\u001bG\u00dfl\u00c7,\u00e7\u00d8#\u0011q>\u0082\u0093\u00fb\u0084\u00cd]{\u009aR\u0093\u0004\u0013\u0098W#\u00bc^\u0001t\u00a8\u00d5\u00ea\u00b2\u00ddQ\u009dj\u00cc<\u00ea)D6\u000f\u00e5\u00d4L\u0010?of~\u00cc\u009bO\u00a9\f\u0090\u00dcl\u00a3\u00f3\u0086@\u0093\u00c7\t$\u00a1\u0083\u0012!1\t\u00dc\u001b\u0004\u00b5E\u00a6\u009d<5EB\u00bdTc\u00b4\u00baL\u00a1 w\u00f3B\u009cb\u00d9\u0086`5\u001c\u0010\u009b\u00b0\u00be\u00ac\u008e\u00d5\u007f\u00b0\u00e1\u008f\u00a5P\u00cbT\u00a5\u00e75w\u00b3\u00ce\u0013\u0097\n\u00974\u001a\u00be=-\u0099\u00ef\u00fc\u008dW[uD;\u00d5O\u0081RT\u0096\u00ae\u008aCG\u00a35!\u00ed\u00df\u00f1\u0096\u000f\u000e\u000b9\u00d2\u00f0k\u00d5\u00b5\u0080\u00aa\b\u0082\u00a6\u00f8\u00c2@1\u00b4\u0007d\u00ed\u0001\u00f8\u00ff\u009f\u00ee\u00df\u001c\u0082\u00f2\u00b2[\u00b8}\u00adQ0\u00fc>\u00f4$\u001cJ\u00c3kt;\u00e8\u0012\u00eep\u009f\u00f6\u0091\u0085\u00c2\u00b1D\u00b4p\u00f4Un\u00ab\u00c4\u00f7\u00d7\u009a\u00a7jK\u00a4\u009al\u00f2\u00a6\u0011Ma\u00bf\u0012\r\b\u00acX\u00b0\u009e\t\u009e=\u00be;\u00f7\u0095\u00b6f\u00b8\u001a\u00e9\u00a6\u00fa\u0089\u0000\u0001w\u00dd\u00f06\u00de\u00b8\u00c2b \u001a\u00d9\u00b2mf\u00da1E\u00abm\u0012\u0006\u001aQ\u00e0h\u00ed[\u008d\u001cL\u009d\u0004v\u00e3a\u00b79\u00a2\u0005\u0082\u009d\u00b1:\u00d4m\u009f\u00ba\u001dBn\u00d6]y3\u00f2\u0015\u00f8\u00a1\u001e\u008d\u0094\r\u00f1b8OI\u00fa\u00bf\u00edZXC\u00960\u00d8}\u00b5\u00a1&\u001b5\u008a\u0096<7\u00e2g\u00d3o\u00ec\u00e9\u009b\u000f&\f_s\u009d\u00d0\u00d0\u00a7I\u00dc\u00fe'\u00cb\u00a1\u0019\u00cfs\u00d0\u00ceA\u0012\u00e0\u009e\u00a5|\u00c8\u00afG|o\u0086B\u0001W+\u00e0zL[.\u00f4\u00e3#\u00e72\u00c8Q\u0095!PQ\u0085\u001b[\u00b9qv\u0016\u00f7U\u001b\u0098\u00e6\u008f\u008c\u00d7\u00ee\u0010dT\u00cc\u0012\u00939\u00dc)\u000b\n\u0090\u00a0*{\u00abm\u00a8\u00f0C&\u00070\u00e0\u0080z\u0001+\u0088\u0002\u00e8\u0004>\u00cd\u0081\u0091\u0011\u00a0\u0089\u00c2|\u0095~\u00bb\u00ee\u00ab\u0014\u00d6\u00ff+iD\u00f4E\u0096B\u0094\u00d7\u00cfMV\u009b=#\u00ce\u00fcq\u0013\u0011\u0090{\u0096\u008fa}\u0013L*%\u0081\u00171\u00a1\u00be\u0017\u00f7\u0001\u0014\u009f\u00bd\u000f\u00f8\u00b0)\u00fc\u0002\u00c9\u00bc\u0002\u00f1x\u0082\u00dd#\tO\r\u0003\u0003b\"QwyY\u001c\u0013\u0016h\u0092\u00a2\u0099Ag\n;m\u00a1\r\u000f\u00d1\u0018E\u00f5\u00d6\u0016k\u00fd\u0012\u00ea\u0096&\u0019\u0089`\u007f%y\u0010\u0098? \u00bfx\u00fa;j\u00f6J\u0084\u00b0\u00d5r\u00be\u00f6\u00e8\u00b8S\u00fbu\u00e9x\u0085\u00d8|Kx\u00b5v\u001cV?\u00ea\u0006\u00d4\"\u00b0[\u001f\u00cd-\\\u00fant\u00f4\u00a2F\u00e4-\u00f18\u00bc\u0015\u0097\u0000\u00b6t\u00c4#\u00e6\u00d9\u00b1Kr\u00f1\u00f2\u001e\u00bfJ\u0015c\u00a7{\u001az\u008e\u00d1A\u0099\u00b0\u00ee\u0011\u00a9e\u0016\u00d9(\u00e2q\u009b\u00e6\u0095\u00e1\u00af\u00c6\u0095I\u00fd\u001b\u0011\u0087\u00a0\u00d3a\u0090\u00f5fy\u0004\u00c9\u00bd$M\u00e48\u00d350\f\u001b\u0003q`\u008cH\u00e5\u001b\u0011\u001d\u009f\u00ce\u0080\u0086\u00e0\u001cLtU\u00fb'[\u00f2{\u00c3\u001e\u008b\u0082\u00b0\u00b9\u0005\u00c8\u009d\u00c5\u0015\u0097[\u0094\u008azE\u009aN\u00907\u00dcv\u0002\u00df\u00fd\u0002\u00dc\u00a3";
                a = "\u00dd\u00c8\u00d8I\u00d7\u0082\u00e9\u00fc\u00a6\u00f8hX\u00ad\u00f5\u00cf9\u00c1\u0017\u00c0\u00c6\u00d8\u00c2\u0013\u007f=\u00f0\u00b8\u00c1\u00f13\u007fo^Bf\u00feHD\u00b6\u00aaD\u0006\u00ae6?\u00f6\u001f\u00fa#El\u00f0\u00cf\u00f4R\u0084\u00e6\u000b\u00bb\u00ddMb\u0080oQ<\u0005\u0083\u0087\u00af\u00a1`j\u00f9\u00ff\u008b\u0019\u00de\u00a6\u00f7\u00d1\u00c3\u00f1(\u0002\u00b8\u0092#\u001d_|\u00a8\u0084T\u0099;\u009d\u00ca+\u00dd\u0010\u0004 \u0012We\u001ch\u00b3\u001bR\u00a3P|Q\u00cd\u00ac\u0012a\u00ee\u00b7\u00baJl\u0090\u00881\u00fc\u00f7\u00b0\u00fa1\u0084w\u008c\u00b0\u00c8\u00a4\u00adr\u001a\u00cfov\u00da\u00d5[z\u00b2\u00ee\u009e\u00ea\u00fb]\u00bfrV\u0099\u00f0\u00f4\u00cbP\u0092^m3h\u00b1\u0081\u00d8aK\u007f\u00ca\u009f\u001ax6Q\u00f3.\u00c3\u00e9\u0095\r\u008a3\u009d\u00b6\\<\u00dd\u0018\u008c\u00c7!\u00b4\u00cf\u00a7\u00a6\u00a6\u0010dNg\u00f8\u00b3M\u00b2\u0019\u001a\u00c8r#q\t=l+|?\u00b0/\u0005\u00a8,\u00e4\u00d5\u00a39gj`\u00bc^\u00a8\n\u0006\fLp\u00de1\u00bf5\u00ba*\u00a6\u0011\u00eb%n\u00e9A\u00cc}\u00a6\u0089\u00c7|t~\u00cb\u00f0M\r\u00e4-m\u00fa\u0080*S\u0000\u00e7\u0080\u0087= \u00e4A\u0011\u00a8S8\u00f1D{\u0005\u00ef\u00d3\u00d0\u00a3Y1\u00a6\u00a6\u00a2\u00f9(|@\u0002\u0088[C\u00af\u00d8\u00b9\u00f0\u0006A\u0092\u00ec\u00e2\u00d1\u00b7\u000b\u00a93\u00f1\u00d6r1\u001a\u0014\u00a7\u00fe\u00b7\u009a{\u00d3\u0014EU\u00a0\u0015\u00f6\u00f50\u00c2\u00af\u00b0\u0001\u000e\u0018\u00f8\u00e0\u00f7\u00c1\u00a8k\u00d7;\u00ce\u0012@c\\\u00e5'\u00e7F\u00fd\u00ae98\u00c0\u00a6\u00d5\u0002G\u0080\u00b4\u00b2|a6\u0006\u009c\u00ca\u00a1\u00e4H\u00dfLv\t\u00a9\u0010~\u00bd\f??\u00a9FD\u0001\u00dd\u009d\u0011\u0095iS\u001a&R#l/l\u00d2\u00c2K\u00dcO\u00d0eYU\u00b9\u0082 \u0082i\u00e0\u009b!;b}\b\u00b6N\u00c7Z\u00dc\u00e47\u00ec<\u001b\u0017\u0094\u00d5Sg\"\u00af\u0010\u00a5=?\u00bf\u00ce\u0011\u0085pJ\u00af\u00f9\u00c6d\u0017\u0085s\u000b\u00cb\u00d3\u00c4\u0082\u00b8\\-m\"9i\u0086)\u00d2\u00f4\u00a6X\u00b3XE\u00da5AKxhp\u009f\u00ba\u00de\u00a0\u00c7\u001d\u00a3\u000fh\u00b2/2\u00d2\u001d\u0081\u00da#\u00d8\u0017[y\u00f2\u00f7\u0012\n\u00baN{\u00ad\u000f\u00bd'\u00f8\u00be\u009dW$\u00d8!\u00fa?(]\u00b97\u0098\u00ff.\rDU\u00a2#`~\u001ag\u0091\u00ee\u009c\u00a8\u00a2%\u009cQ\u009b\u00a2=\u00a6\u0005\u00f8\u001c,`D\u00bb\u00d3\u00ccg;\u00ef\u0087\u00dd\u00aa\u0091\r\u00aa3\u00d2\u000b\u00e6M\u00bd\u009cO\u0090X\u00a8\u001b\u00c8\u0084Z\u008f\u0011\u00ce\u00e8\u00c1\u007f\u00d3\u00bd\u0092\u00eaG\u008e\u00b653\u008d\u009e\u00f1l\u00a3\u0012J\u0099\u0014#W\u0083\u00a7oL\u00a1\u00e4Y\u00d9\u00de\u00a9Y%\u00f1\u00b5\u00afX\u00da]\u00d4\u00c64\u0092\u00b0$W\u00d2\u00f3\u00e5,\u0015i^aHAC\u00dd\u00169\u009d\u00fd\u0003.*\u00ea\u001f\u00d2#\u00f4'\u00a8\u0097T\u0007\u0093\u0096 \u009f\u00e8KQ\u001bG\u00dfl\u00c7,\u00e7\u00d8#\u0011q>\u0082\u0093\u00fb\u0084\u00cd]{\u009aR\u0093\u0004\u0013\u0098W#\u00bc^\u0001t\u00a8\u00d5\u00ea\u00b2\u00ddQ\u009dj\u00cc<\u00ea)D6\u000f\u00e5\u00d4L\u0010?of~\u00cc\u009bO\u00a9\f\u0090\u00dcl\u00a3\u00f3\u0086@\u0093\u00c7\t$\u00a1\u0083\u0012!1\t\u00dc\u001b\u0004\u00b5E\u00a6\u009d<5EB\u00bdTc\u00b4\u00baL\u00a1 w\u00f3B\u009cb\u00d9\u0086`5\u001c\u0010\u009b\u00b0\u00be\u00ac\u008e\u00d5\u007f\u00b0\u00e1\u008f\u00a5P\u00cbT\u00a5\u00e75w\u00b3\u00ce\u0013\u0097\n\u00974\u001a\u00be=-\u0099\u00ef\u00fc\u008dW[uD;\u00d5O\u0081RT\u0096\u00ae\u008aCG\u00a35!\u00ed\u00df\u00f1\u0096\u000f\u000e\u000b9\u00d2\u00f0k\u00d5\u00b5\u0080\u00aa\b\u0082\u00a6\u00f8\u00c2@1\u00b4\u0007d\u00ed\u0001\u00f8\u00ff\u009f\u00ee\u00df\u001c\u0082\u00f2\u00b2[\u00b8}\u00adQ0\u00fc>\u00f4$\u001cJ\u00c3kt;\u00e8\u0012\u00eep\u009f\u00f6\u0091\u0085\u00c2\u00b1D\u00b4p\u00f4Un\u00ab\u00c4\u00f7\u00d7\u009a\u00a7jK\u00a4\u009al\u00f2\u00a6\u0011Ma\u00bf\u0012\r\b\u00acX\u00b0\u009e\t\u009e=\u00be;\u00f7\u0095\u00b6f\u00b8\u001a\u00e9\u00a6\u00fa\u0089\u0000\u0001w\u00dd\u00f06\u00de\u00b8\u00c2b \u001a\u00d9\u00b2mf\u00da1E\u00abm\u0012\u0006\u001aQ\u00e0h\u00ed[\u008d\u001cL\u009d\u0004v\u00e3a\u00b79\u00a2\u0005\u0082\u009d\u00b1:\u00d4m\u009f\u00ba\u001dBn\u00d6]y3\u00f2\u0015\u00f8\u00a1\u001e\u008d\u0094\r\u00f1b8OI\u00fa\u00bf\u00edZXC\u00960\u00d8}\u00b5\u00a1&\u001b5\u008a\u0096<7\u00e2g\u00d3o\u00ec\u00e9\u009b\u000f&\f_s\u009d\u00d0\u00d0\u00a7I\u00dc\u00fe'\u00cb\u00a1\u0019\u00cfs\u00d0\u00ceA\u0012\u00e0\u009e\u00a5|\u00c8\u00afG|o\u0086B\u0001W+\u00e0zL[.\u00f4\u00e3#\u00e72\u00c8Q\u0095!PQ\u0085\u001b[\u00b9qv\u0016\u00f7U\u001b\u0098\u00e6\u008f\u008c\u00d7\u00ee\u0010dT\u00cc\u0012\u00939\u00dc)\u000b\n\u0090\u00a0*{\u00abm\u00a8\u00f0C&\u00070\u00e0\u0080z\u0001+\u0088\u0002\u00e8\u0004>\u00cd\u0081\u0091\u0011\u00a0\u0089\u00c2|\u0095~\u00bb\u00ee\u00ab\u0014\u00d6\u00ff+iD\u00f4E\u0096B\u0094\u00d7\u00cfMV\u009b=#\u00ce\u00fcq\u0013\u0011\u0090{\u0096\u008fa}\u0013L*%\u0081\u00171\u00a1\u00be\u0017\u00f7\u0001\u0014\u009f\u00bd\u000f\u00f8\u00b0)\u00fc\u0002\u00c9\u00bc\u0002\u00f1x\u0082\u00dd#\tO\r\u0003\u0003b\"QwyY\u001c\u0013\u0016h\u0092\u00a2\u0099Ag\n;m\u00a1\r\u000f\u00d1\u0018E\u00f5\u00d6\u0016k\u00fd\u0012\u00ea\u0096&\u0019\u0089`\u007f%y\u0010\u0098? \u00bfx\u00fa;j\u00f6J\u0084\u00b0\u00d5r\u00be\u00f6\u00e8\u00b8S\u00fbu\u00e9x\u0085\u00d8|Kx\u00b5v\u001cV?\u00ea\u0006\u00d4\"\u00b0[\u001f\u00cd-\\\u00fant\u00f4\u00a2F\u00e4-\u00f18\u00bc\u0015\u0097\u0000\u00b6t\u00c4#\u00e6\u00d9\u00b1Kr\u00f1\u00f2\u001e\u00bfJ\u0015c\u00a7{\u001az\u008e\u00d1A\u0099\u00b0\u00ee\u0011\u00a9e\u0016\u00d9(\u00e2q\u009b\u00e6\u0095\u00e1\u00af\u00c6\u0095I\u00fd\u001b\u0011\u0087\u00a0\u00d3a\u0090\u00f5fy\u0004\u00c9\u00bd$M\u00e48\u00d350\f\u001b\u0003q`\u008cH\u00e5\u001b\u0011\u001d\u009f\u00ce\u0080\u0086\u00e0\u001cLtU\u00fb'[\u00f2{\u00c3\u001e\u008b\u0082\u00b0\u00b9\u0005\u00c8\u009d\u00c5\u0015\u0097[\u0094\u008azE\u009aN\u00907\u00dcv\u0002\u00df\u00fd\u0002\u00dc\u00a3".length();
                a = 1140;
                a = -1;
                Class801.Method3299(new a[2]);
lbl8:
                // 2 sources

                while (true) {
                    v0 = 36;
                    v1 = ++a;
                    v2 = a.substring(v1, v1 + a);
                    v3 = -1;
                    break block22;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    a[a++] = v4.intern();
                    if ((a += a) < a) {
                        a = a.charAt(a);
                        ** continue;
                    }
                    a = "\u00b2K\u0003_so";
                    a = "\u00b2K\u0003_so".length();
                    a = 2;
                    a = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 20;
                        v5 = ++a;
                        v2 = a.substring(v5, v5 + a);
                        v3 = 0;
                        break block22;
                        break;
                    }
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    a[a++] = v4.intern();
                    if ((a += a) < a) {
                        a = a.charAt(a);
                        ** continue;
                    }
                    break block23;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            a = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = a;
                while (true) {
                    switch (a % 7) {
                        case 0: {
                            v15 = 40;
                            break;
                        }
                        case 1: {
                            v15 = 41;
                            break;
                        }
                        case 2: {
                            v15 = 17;
                            break;
                        }
                        case 3: {
                            v15 = 95;
                            break;
                        }
                        case 4: {
                            v15 = 85;
                            break;
                        }
                        case 5: {
                            v15 = 10;
                            break;
                        }
                        default: {
                            v15 = 63;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++a;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl86:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > a);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl96:
                // 1 sources

                ** continue;
            }
        }
        Class801.Field3582 = a;
        Class801.Field3583 = new String[13];
        a = Class801.Method3302(-15100, -28764);
        Class801.Field3575 = new String[200];
        a = 0;
        a = 0;
        while ((a = a.indexOf(44, a)) > 0) {
            Class801.Field3575[a++] = a + 1 == a ? null : a.substring(a, a);
            a = a + 1;
        }
        a = Class801.Method3302(-15098, -24735);
        Class801.Field3576 = new String[12];
        a = 0;
        a = 4;
        while ((a = a.indexOf(44, a)) > 0) {
            Class801.Field3576[a++] = a.substring(a, a);
            a = a + 1;
        }
        a = Class801.Method3302(-15103, 30366);
        Class801.Field3577 = new String[10];
        a = 0;
        a = 1;
        while ((a = a.indexOf(44, a)) > 0) {
            Class801.Field3577[a++] = a.substring(a, a);
            a = a + 1;
        }
    }

    public static void Method3299(a[] aArray) {
        Field3581 = aArray;
    }

    public static a[] Method3300() {
        return Field3581;
    }

    private static RuntimeException Method3301(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static String Method3302(int n, int n2) {
        int n3 = (n ^ 0xFFFFC504) & 0xFFFF;
        if (Field3583[n3] == null) {
            int n4;
            char[] cArray = Field3582[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 37;
                    break;
                }
                case 1: {
                    n4 = 71;
                    break;
                }
                case 2: {
                    n4 = 143;
                    break;
                }
                case 3: {
                    n4 = 154;
                    break;
                }
                case 4: {
                    n4 = 69;
                    break;
                }
                case 5: {
                    n4 = 161;
                    break;
                }
                case 6: {
                    n4 = 112;
                    break;
                }
                case 7: {
                    n4 = 90;
                    break;
                }
                case 8: {
                    n4 = 42;
                    break;
                }
                case 9: {
                    n4 = 132;
                    break;
                }
                case 10: {
                    n4 = 167;
                    break;
                }
                case 11: {
                    n4 = 129;
                    break;
                }
                case 12: {
                    n4 = 108;
                    break;
                }
                case 13: {
                    n4 = 209;
                    break;
                }
                case 14: {
                    n4 = 136;
                    break;
                }
                case 15: {
                    n4 = 18;
                    break;
                }
                case 16: {
                    n4 = 243;
                    break;
                }
                case 17: {
                    n4 = 150;
                    break;
                }
                case 18: {
                    n4 = 219;
                    break;
                }
                case 19: {
                    n4 = 13;
                    break;
                }
                case 20: {
                    n4 = 201;
                    break;
                }
                case 21: {
                    n4 = 127;
                    break;
                }
                case 22: {
                    n4 = 140;
                    break;
                }
                case 23: {
                    n4 = 26;
                    break;
                }
                case 24: {
                    n4 = 138;
                    break;
                }
                case 25: {
                    n4 = 6;
                    break;
                }
                case 26: {
                    n4 = 190;
                    break;
                }
                case 27: {
                    n4 = 62;
                    break;
                }
                case 28: {
                    n4 = 244;
                    break;
                }
                case 29: {
                    n4 = 101;
                    break;
                }
                case 30: {
                    n4 = 169;
                    break;
                }
                case 31: {
                    n4 = 116;
                    break;
                }
                case 32: {
                    n4 = 51;
                    break;
                }
                case 33: {
                    n4 = 160;
                    break;
                }
                case 34: {
                    n4 = 78;
                    break;
                }
                case 35: {
                    n4 = 28;
                    break;
                }
                case 36: {
                    n4 = 225;
                    break;
                }
                case 37: {
                    n4 = 32;
                    break;
                }
                case 38: {
                    n4 = 79;
                    break;
                }
                case 39: {
                    n4 = 157;
                    break;
                }
                case 40: {
                    n4 = 240;
                    break;
                }
                case 41: {
                    n4 = 234;
                    break;
                }
                case 42: {
                    n4 = 8;
                    break;
                }
                case 43: {
                    n4 = 184;
                    break;
                }
                case 44: {
                    n4 = 0;
                    break;
                }
                case 45: {
                    n4 = 47;
                    break;
                }
                case 46: {
                    n4 = 208;
                    break;
                }
                case 47: {
                    n4 = 216;
                    break;
                }
                case 48: {
                    n4 = 118;
                    break;
                }
                case 49: {
                    n4 = 229;
                    break;
                }
                case 50: {
                    n4 = 86;
                    break;
                }
                case 51: {
                    n4 = 11;
                    break;
                }
                case 52: {
                    n4 = 188;
                    break;
                }
                case 53: {
                    n4 = 81;
                    break;
                }
                case 54: {
                    n4 = 16;
                    break;
                }
                case 55: {
                    n4 = 212;
                    break;
                }
                case 56: {
                    n4 = 228;
                    break;
                }
                case 57: {
                    n4 = 227;
                    break;
                }
                case 58: {
                    n4 = 3;
                    break;
                }
                case 59: {
                    n4 = 199;
                    break;
                }
                case 60: {
                    n4 = 196;
                    break;
                }
                case 61: {
                    n4 = 214;
                    break;
                }
                case 62: {
                    n4 = 33;
                    break;
                }
                case 63: {
                    n4 = 137;
                    break;
                }
                case 64: {
                    n4 = 241;
                    break;
                }
                case 65: {
                    n4 = 97;
                    break;
                }
                case 66: {
                    n4 = 39;
                    break;
                }
                case 67: {
                    n4 = 52;
                    break;
                }
                case 68: {
                    n4 = 120;
                    break;
                }
                case 69: {
                    n4 = 210;
                    break;
                }
                case 70: {
                    n4 = 235;
                    break;
                }
                case 71: {
                    n4 = 224;
                    break;
                }
                case 72: {
                    n4 = 89;
                    break;
                }
                case 73: {
                    n4 = 22;
                    break;
                }
                case 74: {
                    n4 = 186;
                    break;
                }
                case 75: {
                    n4 = 121;
                    break;
                }
                case 76: {
                    n4 = 24;
                    break;
                }
                case 77: {
                    n4 = 135;
                    break;
                }
                case 78: {
                    n4 = 67;
                    break;
                }
                case 79: {
                    n4 = 38;
                    break;
                }
                case 80: {
                    n4 = 4;
                    break;
                }
                case 81: {
                    n4 = 106;
                    break;
                }
                case 82: {
                    n4 = 180;
                    break;
                }
                case 83: {
                    n4 = 218;
                    break;
                }
                case 84: {
                    n4 = 104;
                    break;
                }
                case 85: {
                    n4 = 58;
                    break;
                }
                case 86: {
                    n4 = 73;
                    break;
                }
                case 87: {
                    n4 = 131;
                    break;
                }
                case 88: {
                    n4 = 133;
                    break;
                }
                case 89: {
                    n4 = 230;
                    break;
                }
                case 90: {
                    n4 = 130;
                    break;
                }
                case 91: {
                    n4 = 145;
                    break;
                }
                case 92: {
                    n4 = 68;
                    break;
                }
                case 93: {
                    n4 = 211;
                    break;
                }
                case 94: {
                    n4 = 1;
                    break;
                }
                case 95: {
                    n4 = 45;
                    break;
                }
                case 96: {
                    n4 = 55;
                    break;
                }
                case 97: {
                    n4 = 222;
                    break;
                }
                case 98: {
                    n4 = 49;
                    break;
                }
                case 99: {
                    n4 = 110;
                    break;
                }
                case 100: {
                    n4 = 146;
                    break;
                }
                case 101: {
                    n4 = 91;
                    break;
                }
                case 102: {
                    n4 = 147;
                    break;
                }
                case 103: {
                    n4 = 155;
                    break;
                }
                case 104: {
                    n4 = 65;
                    break;
                }
                case 105: {
                    n4 = 194;
                    break;
                }
                case 106: {
                    n4 = 126;
                    break;
                }
                case 107: {
                    n4 = 162;
                    break;
                }
                case 108: {
                    n4 = 164;
                    break;
                }
                case 109: {
                    n4 = 247;
                    break;
                }
                case 110: {
                    n4 = 185;
                    break;
                }
                case 111: {
                    n4 = 203;
                    break;
                }
                case 112: {
                    n4 = 119;
                    break;
                }
                case 113: {
                    n4 = 105;
                    break;
                }
                case 114: {
                    n4 = 57;
                    break;
                }
                case 115: {
                    n4 = 128;
                    break;
                }
                case 116: {
                    n4 = 46;
                    break;
                }
                case 117: {
                    n4 = 19;
                    break;
                }
                case 118: {
                    n4 = 59;
                    break;
                }
                case 119: {
                    n4 = 99;
                    break;
                }
                case 120: {
                    n4 = 250;
                    break;
                }
                case 121: {
                    n4 = 232;
                    break;
                }
                case 122: {
                    n4 = 149;
                    break;
                }
                case 123: {
                    n4 = 95;
                    break;
                }
                case 124: {
                    n4 = 179;
                    break;
                }
                case 125: {
                    n4 = 12;
                    break;
                }
                case 126: {
                    n4 = 252;
                    break;
                }
                case 127: {
                    n4 = 221;
                    break;
                }
                case 128: {
                    n4 = 92;
                    break;
                }
                case 129: {
                    n4 = 175;
                    break;
                }
                case 130: {
                    n4 = 40;
                    break;
                }
                case 131: {
                    n4 = 83;
                    break;
                }
                case 132: {
                    n4 = 198;
                    break;
                }
                case 133: {
                    n4 = 144;
                    break;
                }
                case 134: {
                    n4 = 21;
                    break;
                }
                case 135: {
                    n4 = 172;
                    break;
                }
                case 136: {
                    n4 = 53;
                    break;
                }
                case 137: {
                    n4 = 76;
                    break;
                }
                case 138: {
                    n4 = 242;
                    break;
                }
                case 139: {
                    n4 = 10;
                    break;
                }
                case 140: {
                    n4 = 74;
                    break;
                }
                case 141: {
                    n4 = 122;
                    break;
                }
                case 142: {
                    n4 = 174;
                    break;
                }
                case 143: {
                    n4 = 115;
                    break;
                }
                case 144: {
                    n4 = 207;
                    break;
                }
                case 145: {
                    n4 = 66;
                    break;
                }
                case 146: {
                    n4 = 100;
                    break;
                }
                case 147: {
                    n4 = 93;
                    break;
                }
                case 148: {
                    n4 = 64;
                    break;
                }
                case 149: {
                    n4 = 177;
                    break;
                }
                case 150: {
                    n4 = 226;
                    break;
                }
                case 151: {
                    n4 = 29;
                    break;
                }
                case 152: {
                    n4 = 36;
                    break;
                }
                case 153: {
                    n4 = 114;
                    break;
                }
                case 154: {
                    n4 = 111;
                    break;
                }
                case 155: {
                    n4 = 14;
                    break;
                }
                case 156: {
                    n4 = 233;
                    break;
                }
                case 157: {
                    n4 = 239;
                    break;
                }
                case 158: {
                    n4 = 237;
                    break;
                }
                case 159: {
                    n4 = 246;
                    break;
                }
                case 160: {
                    n4 = 34;
                    break;
                }
                case 161: {
                    n4 = 200;
                    break;
                }
                case 162: {
                    n4 = 60;
                    break;
                }
                case 163: {
                    n4 = 215;
                    break;
                }
                case 164: {
                    n4 = 94;
                    break;
                }
                case 165: {
                    n4 = 153;
                    break;
                }
                case 166: {
                    n4 = 84;
                    break;
                }
                case 167: {
                    n4 = 187;
                    break;
                }
                case 168: {
                    n4 = 139;
                    break;
                }
                case 169: {
                    n4 = 117;
                    break;
                }
                case 170: {
                    n4 = 107;
                    break;
                }
                case 171: {
                    n4 = 35;
                    break;
                }
                case 172: {
                    n4 = 87;
                    break;
                }
                case 173: {
                    n4 = 80;
                    break;
                }
                case 174: {
                    n4 = 189;
                    break;
                }
                case 175: {
                    n4 = 88;
                    break;
                }
                case 176: {
                    n4 = 30;
                    break;
                }
                case 177: {
                    n4 = 245;
                    break;
                }
                case 178: {
                    n4 = 134;
                    break;
                }
                case 179: {
                    n4 = 72;
                    break;
                }
                case 180: {
                    n4 = 142;
                    break;
                }
                case 181: {
                    n4 = 98;
                    break;
                }
                case 182: {
                    n4 = 183;
                    break;
                }
                case 183: {
                    n4 = 170;
                    break;
                }
                case 184: {
                    n4 = 251;
                    break;
                }
                case 185: {
                    n4 = 43;
                    break;
                }
                case 186: {
                    n4 = 75;
                    break;
                }
                case 187: {
                    n4 = 56;
                    break;
                }
                case 188: {
                    n4 = 176;
                    break;
                }
                case 189: {
                    n4 = 158;
                    break;
                }
                case 190: {
                    n4 = 125;
                    break;
                }
                case 191: {
                    n4 = 96;
                    break;
                }
                case 192: {
                    n4 = 255;
                    break;
                }
                case 193: {
                    n4 = 204;
                    break;
                }
                case 194: {
                    n4 = 182;
                    break;
                }
                case 195: {
                    n4 = 23;
                    break;
                }
                case 196: {
                    n4 = 166;
                    break;
                }
                case 197: {
                    n4 = 50;
                    break;
                }
                case 198: {
                    n4 = 54;
                    break;
                }
                case 199: {
                    n4 = 113;
                    break;
                }
                case 200: {
                    n4 = 156;
                    break;
                }
                case 201: {
                    n4 = 109;
                    break;
                }
                case 202: {
                    n4 = 20;
                    break;
                }
                case 203: {
                    n4 = 202;
                    break;
                }
                case 204: {
                    n4 = 197;
                    break;
                }
                case 205: {
                    n4 = 217;
                    break;
                }
                case 206: {
                    n4 = 17;
                    break;
                }
                case 207: {
                    n4 = 163;
                    break;
                }
                case 208: {
                    n4 = 206;
                    break;
                }
                case 209: {
                    n4 = 5;
                    break;
                }
                case 210: {
                    n4 = 41;
                    break;
                }
                case 211: {
                    n4 = 238;
                    break;
                }
                case 212: {
                    n4 = 254;
                    break;
                }
                case 213: {
                    n4 = 191;
                    break;
                }
                case 214: {
                    n4 = 7;
                    break;
                }
                case 215: {
                    n4 = 178;
                    break;
                }
                case 216: {
                    n4 = 82;
                    break;
                }
                case 217: {
                    n4 = 124;
                    break;
                }
                case 218: {
                    n4 = 15;
                    break;
                }
                case 219: {
                    n4 = 236;
                    break;
                }
                case 220: {
                    n4 = 148;
                    break;
                }
                case 221: {
                    n4 = 152;
                    break;
                }
                case 222: {
                    n4 = 44;
                    break;
                }
                case 223: {
                    n4 = 205;
                    break;
                }
                case 224: {
                    n4 = 70;
                    break;
                }
                case 225: {
                    n4 = 173;
                    break;
                }
                case 226: {
                    n4 = 159;
                    break;
                }
                case 227: {
                    n4 = 195;
                    break;
                }
                case 228: {
                    n4 = 48;
                    break;
                }
                case 229: {
                    n4 = 168;
                    break;
                }
                case 230: {
                    n4 = 63;
                    break;
                }
                case 231: {
                    n4 = 165;
                    break;
                }
                case 232: {
                    n4 = 77;
                    break;
                }
                case 233: {
                    n4 = 231;
                    break;
                }
                case 234: {
                    n4 = 103;
                    break;
                }
                case 235: {
                    n4 = 213;
                    break;
                }
                case 236: {
                    n4 = 249;
                    break;
                }
                case 237: {
                    n4 = 220;
                    break;
                }
                case 238: {
                    n4 = 192;
                    break;
                }
                case 239: {
                    n4 = 27;
                    break;
                }
                case 240: {
                    n4 = 123;
                    break;
                }
                case 241: {
                    n4 = 2;
                    break;
                }
                case 242: {
                    n4 = 193;
                    break;
                }
                case 243: {
                    n4 = 61;
                    break;
                }
                case 244: {
                    n4 = 181;
                    break;
                }
                case 245: {
                    n4 = 141;
                    break;
                }
                case 246: {
                    n4 = 151;
                    break;
                }
                case 247: {
                    n4 = 9;
                    break;
                }
                case 248: {
                    n4 = 248;
                    break;
                }
                case 249: {
                    n4 = 253;
                    break;
                }
                case 250: {
                    n4 = 171;
                    break;
                }
                case 251: {
                    n4 = 102;
                    break;
                }
                case 252: {
                    n4 = 25;
                    break;
                }
                case 253: {
                    n4 = 85;
                    break;
                }
                case 254: {
                    n4 = 31;
                    break;
                }
                default: {
                    n4 = 223;
                }
            }
            int n5 = n4;
            int n6 = (n2 & 0xFF) - n5;
            n6 += 256;
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            n7 += 256;
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                cArray[n10] = (char)(cArray[n10] ^ n6);
                n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                ++n8;
            }
            Class801.Field3583[n3] = new String(cArray).intern();
        }
        return Field3583[n3];
    }
}