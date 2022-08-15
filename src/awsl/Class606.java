/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class91;
import com.google.gson.JsonObject;
import trash.foodbyte.irc.PermissionManager;

public class Class606 {
    public String Field2838 = "";
    public String Field2839 = "";
    public String Field2840 = "";
    public String Field2841 = "undefined";
    public String Field2842 = "undefined";
    public int Field2843 = 0;
    public long Field2844;
    public long Field2845;
    public long Field2846;
    public boolean Field2847 = false;
    public boolean Field2848 = false;
    public String Field2849 = "NONE";
    public String Field2850 = "NONE";
    public long Field2851 = System.currentTimeMillis();
    public int Field2852 = 0;

    public Class606() {
        this.Field2844 = System.currentTimeMillis();
        this.Field2845 = System.currentTimeMillis();
        this.Field2846 = System.currentTimeMillis();
    }

    public Class606(String a, String a2, String a3, String a4) {
        this.Field2838 = a;
        this.Field2839 = a2;
        this.Field2840 = a3;
        this.Field2841 = a4;
        this.Field2844 = System.currentTimeMillis();
        this.Field2845 = System.currentTimeMillis();
        this.Field2846 = System.currentTimeMillis();
    }

    public Class606(String a, String a2, String a3, String a4, String a5) {
        this.Field2838 = a;
        this.Field2839 = a2;
        this.Field2840 = a3;
        this.Field2841 = a4;
        this.Field2842 = a5;
        this.Field2844 = System.currentTimeMillis();
        this.Field2845 = System.currentTimeMillis();
        this.Field2846 = System.currentTimeMillis();
    }

    public Class606(String a, String a2, String a3, String a4, String a5, long a6, long a7, long a8, boolean a9, boolean a10) {
        this.Field2838 = a;
        this.Field2839 = a2;
        this.Field2840 = a3;
        this.Field2841 = a4;
        this.Field2842 = a5;
        this.Field2844 = System.currentTimeMillis();
        this.Field2845 = System.currentTimeMillis();
        this.Field2846 = a8;
        this.Field2847 = a9;
        this.Field2848 = a10;
    }

    public JsonObject Method3734() {
        JsonObject a = new JsonObject();
        a.addProperty("client", this.Field2838);
        a.addProperty("name", this.Field2840);
        a.addProperty("rank", this.Field2839);
        a.addProperty("ranklvl", (Number)Integer.valueOf((int)0));
        a.addProperty("muteTime", (Number)Long.valueOf((long)this.Field2845));
        a.addProperty("hide", Boolean.valueOf((boolean)this.Field2847));
        a.addProperty("MT", Boolean.valueOf((boolean)this.Field2848));
        return a;
    }

    public void Method3735(JsonObject a) {
        this.Field2838 = a.get("client").getAsString();
        this.Field2840 = a.get("name").getAsString();
        this.Field2839 = a.get("rank").getAsString();
        this.Field2845 = a.get("muteTime").getAsLong();
        this.Field2847 = a.get("hide").getAsBoolean();
        this.Field2848 = a.get("MT").getAsBoolean();
    }

    public String Method3736() {
        if (this.Field2838.equalsIgnoreCase("FoodByte")) {
            return "\u00a7e[FB]\u00a7r";
        }
        if (this.Field2838.equalsIgnoreCase("PowerX")) {
            return "\u00a7d[PX]\u00a7r";
        }
        if (this.Field2838.equalsIgnoreCase("Server")) {
            return "\u00a7c[Server]\u00a7r";
        }
        return "\u00a72[" + this.Field2838 + "]\u00a7r";
    }

    public String Method3737() {
        String string = this.Field2839;
        int[] a = PermissionManager.Method3697();
        int n = -1;
        switch (string.hashCode()) {
            case 76612243: {
                if (!string.equals((Object)"Owner")) break;
                n = 0;
                Class91.Method3647(new String[1]);
            }
            case 68597: {
                if (!string.equals((Object)"Dev")) break;
                n = 1;
            }
            case 63116079: {
                if (!string.equals((Object)"Admin")) break;
                n = 2;
            }
            case 77538: {
                if (!string.equals((Object)"Mod")) break;
                n = 3;
            }
            case -2137064498: {
                if (!string.equals((Object)"Helper")) break;
                n = 4;
            }
            case 2066960: {
                if (!string.equals((Object)"Beta")) break;
                n = 5;
            }
            case 1982160884: {
                if (!string.equals((Object)"Backer")) break;
                n = 6;
            }
            case 2645995: {
                if (!string.equals((Object)"User")) break;
                n = 7;
            }
        }
        switch (n) {
            case 0: {
                return "\u00a73[Owner]\u00a7r";
            }
            case 1: {
                return "\u00a73[Dev]\u00a7r";
            }
            case 2: {
                return "\u00a7c[Admin]\u00a7r";
            }
            case 3: {
                return "\u00a72[Mod]\u00a7r";
            }
            case 4: {
                return "\u00a79[Helper]\u00a7r";
            }
            case 5: {
                return "\u00a75[Beta]\u00a7r";
            }
            case 6: {
                return "\u00a75[Backer]\u00a7r";
            }
            case 7: {
                return "\u00a7a[User]\u00a7r";
            }
        }
        return this.Method3738(this.Field2839);
    }

    public String Method3738(String a) {
        String a2 = "\u00a7b";
        switch (this.Field2843) {
            case 999: {
                a2 = "\u00a73";
                break;
            }
            case 5: {
                a2 = "\u00a7c";
                break;
            }
            case 4: {
                a2 = "\u00a72";
                break;
            }
            case 3: {
                a2 = "\u00a79";
                break;
            }
            case 2: {
                a2 = "\u00a75";
                break;
            }
            case 1: {
                a2 = "\u00a7a";
            }
        }
        return a2 + "[" + a + a2 + "]\u00a7r";
    }

    /*
     * Exception decompiling
     */
    public String Method3739() {
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

    public int Method3740() {
        return this.Field2843;
    }

    public boolean Method3741() {
        return this.Field2838.equalsIgnoreCase("server");
    }

    public String Method3742(long a) {
        long a2 = 86400000L;
        long a3 = 3600000L;
        long a4 = 60000L;
        long a5 = 1000L;
        long a6 = a;
        long a7 = a6 / a2;
        long a8 = a6 % a2 / a3;
        long a9 = a6 % a2 % a3 / a4;
        long a10 = a6 % a2 % a3 % a4 / a5;
        String a11 = a7 <= 0L ? "" : a7 + "d ";
        String a12 = a8 <= 0L ? "" : a8 + "h ";
        String a13 = a9 <= 0L ? "" : a9 + "m ";
        String a14 = a10 <= 0L ? "" : a10 + "s";
        return a11 + a12 + a13 + a14;
    }
}