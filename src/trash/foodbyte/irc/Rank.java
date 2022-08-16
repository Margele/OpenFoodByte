/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 */
package trash.foodbyte.irc;

import java.util.ArrayList;
import obfuscate.a;

public class Rank {
    public static ArrayList Field2632;
    private static a[] Field2633;

    /*
     * Exception decompiling
     */
    public static String Method1197(String a) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at cuchaz.enigma.source.cfr.CfrSource.ensureDecompiled(CfrSource.java:81)
         *     at cuchaz.enigma.source.cfr.CfrSource.asString(CfrSource.java:50)
         *     at cuchaz.enigma.EnigmaProject$JarExport.decompileClass(EnigmaProject.java:298)
         *     at cuchaz.enigma.EnigmaProject$JarExport.lambda$decompileStream$1(EnigmaProject.java:274)
         *     at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
         *     at java.base/java.util.AbstractList$RandomAccessSpliterator.forEachRemaining(AbstractList.java:720)
         *     at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
         *     at java.base/java.util.stream.ForEachOps$ForEachTask.compute(ForEachOps.java:290)
         *     at java.base/java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:754)
         *     at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:373)
         *     at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1182)
         *     at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1655)
         *     at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1622)
         *     at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:165)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static String Method1198(String a2) {
        String[] a3 = a2.split(" ");
        StringBuilder a4 = new StringBuilder();
        for (int a5 = 1; a5 < a3.length; ++a5) {
            a4.append(a3[a5]).append(" ");
        }
        return a4.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static String Method1199(long a2) {
        void a3;
        void a4;
        long a5 = 1471228928L;
        long a6 = 86400000L;
        long a7 = 3600000L;
        long a8 = 60000L;
        long l = 1000L;
        long a9 = a2 - System.currentTimeMillis();
        long a10 = a9 / a5;
        long a11 = a9 / a6;
        long l2 = a9 % a6 / a7;
        a[] a12 = Rank.Method1202();
        long a13 = a9 % a6 % a7 / a8;
        long a14 = a9 % a6 % a7 % a8 / a4;
        String a15 = a10 <= 0L ? "" : a10 + "y ";
        String a16 = a11 <= 0L ? "" : a11 + "d ";
        String a17 = a3 <= 0L ? "" : (long)a3 + "h ";
        String a18 = a13 <= 0L ? "" : a13 + "m ";
        String a19 = a14 <= 0L ? "" : a14 + "s";
        String string = a15 + a16 + a17 + a18 + a19;
        a.trash(new String[2]);
        return string;
    }

    public static int Method1200(String a2) {
        String string = a2.toLowerCase();
        int n = -1;
        a[] a3 = Rank.Method1202();
        switch (string.hashCode()) {
            case 106164915: {
                if (!string.equals((Object)"owner")) break;
                n = 0;
            }
            case 99349: {
                if (!string.equals((Object)"dev")) break;
                n = 1;
            }
            case 92668751: {
                if (!string.equals((Object)"admin")) break;
                n = 2;
            }
            case 108290: {
                if (!string.equals((Object)"mod")) break;
                n = 3;
            }
            case 3198785: {
                if (!string.equals((Object)"help")) break;
                n = 4;
            }
            case 3020272: {
                if (!string.equals((Object)"beta")) break;
                n = 5;
            }
            case -1396673580: {
                if (!string.equals((Object)"backer")) break;
                n = 6;
            }
            case 3599307: {
                if (!string.equals((Object)"user")) break;
                n = 7;
            }
        }
        switch (n) {
            case 0: {
                return 999;
            }
            case 1: {
                return 998;
            }
            case 2: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 3;
            }
            case 5: 
            case 6: {
                return 2;
            }
            case 7: {
                return 1;
            }
        }
        if (a.trash() == null) {
            Rank.Method1201(new a[3]);
        }
        return 0;
    }

    static {
        Rank.Method1201(new a[4]);
        Field2632 = new ArrayList();
    }

    public static void Method1201(a[] aArray) {
        Field2633 = aArray;
    }

    public static a[] Method1202() {
        return Field2633;
    }
}