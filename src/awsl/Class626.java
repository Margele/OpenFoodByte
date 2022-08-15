/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URISyntaxException
 *  java.net.URL
 *  java.security.CodeSource
 *  java.util.Map
 *  net.minecraftforge.fml.relauncher.CoreModManager
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$MCVersion
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$SortingIndex
 *  org.apache.logging.log4j.LogManager
 */
package awsl;

import awsl.Class441;
import awsl.Class692;
import awsl.Class750;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.CodeSource;
import java.util.Map;
import net.minecraftforge.fml.relauncher.CoreModManager;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;

@IFMLLoadingPlugin.SortingIndex(value=9999)
@IFMLLoadingPlugin.MCVersion(value="1.8.9")
public class Class626
implements IFMLLoadingPlugin {
    public static boolean Field2878;

    public Class626() {
        CodeSource a = this.getClass().getProtectionDomain().getCodeSource();
        int a2 = Class441.Method2706();
        URL a3 = a.getLocation();
        try {
            File a4 = new File(a3.toURI());
            if (a4.isFile()) {
                CoreModManager.getIgnoredMods().remove((Object)a4.getName());
            }
        }
        catch (URISyntaxException a5) {
            a5.printStackTrace();
        }
        LogManager.getLogger().warn("No CodeSource, if this is not a development environment we might run into problems!");
        LogManager.getLogger().warn((Object)this.getClass().getProtectionDomain());
    }

    public String[] getASMTransformerClass() {
        return new String[]{Class692.class.getName()};
    }

    public String getModContainerClass() {
        return null;
    }

    public String getSetupClass() {
        return null;
    }

    public void injectData(Map a) {
        Class441.Method2700();
        Field2878 = (Boolean)a.Method2665((Object)"runtimeDeobfuscationEnabled");
    }

    public String getAccessTransformerClass() {
        return null;
    }

    /*
     * Exception decompiling
     */
    public static void Method3498() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[CATCHBLOCK]], but top level block is 5[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public static void Method3499() {
        try {
            new Class750();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    static {
        Class626.Method3499();
        Field2878 = true;
    }

    private static Throwable Method3500(Throwable throwable) {
        return throwable;
    }
}