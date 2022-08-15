/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.URI
 *  java.net.URL
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.HashMap
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.play.client.C01PacketChatMessage
 *  net.minecraft.network.play.server.S02PacketChat
 *  net.minecraft.util.IChatComponent
 *  org.apache.commons.io.IOUtils
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 */
package trash.foodbyte.module.impl.world;

import awsl.Class448;
import awsl.Class91;
import eventapi.EventTarget;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.IChatComponent;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ModeValue;

public class ChatTranslator
extends Module {
    public static ModeValue Field2176 = new ModeValue("ChatTranslator", "Translator API", "YouDao", new String[]{"YouDao"}, "{\u6709\u9053\u7ffb\u8bd1}");
    public static ModeValue Field2177 = new ModeValue("ChatTranslator", "Language", "Chinese", new String[]{"Chinese", "English"}, "{\u4e2d\u6587,\u82f1\u6587}");
    public static BooleanValue Field2178 = new BooleanValue("ChatTranslator", "Send Translator", (Boolean)true, "\u804a\u5929\u6846\u8f93\u5165fy-\u201c\u5185\u5bb9\u201d\u81ea\u52a8\u53d1\u51fa\u7ffb\u8bd1fy-\u540e\u9762\u7684\u6587\u5b57");
    public static BooleanValue Field2179 = new BooleanValue("ChatTranslator", "Party", (Boolean)true, "\u7ffb\u8bd1\u7ec4\u961f\u5bf9\u8bdd");
    public static BooleanValue Field2180 = new BooleanValue("ChatTranslator", "Msg", (Boolean)true, "\u7ffb\u8bd1\u79c1\u804a\u5bf9\u8bdd");
    public static BooleanValue Field2181 = new BooleanValue("ChatTranslator", "Guild", (Boolean)true, "\u7ffb\u8bd1\u516c\u4f1a\u5bf9\u8bdd");
    private HashMap Field2182 = new HashMap();

    public ChatTranslator() {
        super("ChatTranslator", "Chat Translator", Category.WORLD);
        this.setDescription("\u804a\u5929\u680f\u7ffb\u8bd1");
    }

    @EventTarget(value=0)
    public void Method273(EventPacket a) {
        String a2;
        String a3;
        C01PacketChatMessage a4;
        if (a.isSend() && a.getPacket() instanceof C01PacketChatMessage) {
            a4 = (C01PacketChatMessage)a.getPacket();
            if (Field2178.getValue() && a4.getMessage().contains((CharSequence)"fy-")) {
                a.setCancelled(true);
                a3 = ChatTranslator.Method2087(a4.getMessage(), "", "fy-");
                a2 = ChatTranslator.Method2087(a4.getMessage(), "fy-", "");
                this.Method2086(a3, a2);
            }
        }
        if (a.isRecieve() && a.getPacket() instanceof S02PacketChat) {
            a4 = (S02PacketChat)a.getPacket();
            a3 = a4.getChatComponent().getUnformattedText();
            if (this.Method2088(a4.getChatComponent())) {
                a2 = ChatTranslator.Method2087(a4.getChatComponent().getFormattedText(), "", ":");
                String a5 = ChatTranslator.Method2087(a3, ": ", "");
                if (!this.Field2182.containsKey((Object)a5)) {
                    this.Method2085(a2, a5);
                } else {
                    a.setCancelled(true);
                    Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(a4.getChatComponent());
                    ChatUtils.addChatMessageNoPrefix("\u00a78[CT] " + a2 + ": \u00a73" + (String)this.Field2182.getOrDefault((Object)a5, (Object)a5));
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    private String Method2082(String a) {
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

    /*
     * Exception decompiling
     */
    private String Method2083(String a) {
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

    private void Method2085(String a, String a2) {
        new Thread(() -> this.Method2090(a2, a)).start();
    }

    private void Method2086(String a, String a2) {
        new Thread(() -> this.Method2089(a2, a)).start();
    }

    public static String Method2087(String a, String a2, String a3) {
        int a4;
        String a5 = "";
        a4 = a2.isEmpty() ? 0 : ((a4 = a.indexOf(a2)) > -1 ? (a4 += a2.length()) : 0);
        int a6 = a.indexOf(a3, a4);
        if (a3.isEmpty()) {
            a6 = a.length();
        }
        a5 = a.substring(a4, a6);
        return a5;
    }

    private boolean Method2088(IChatComponent a) {
        String a2 = a.getFormattedText();
        if (Field2179.getValue() && a2.startsWith("\u00a7r\u00a79") && a2.contains((CharSequence)":") && a2.contains((CharSequence)">")) {
            return true;
        }
        if (Field2181.getValue() && a2.startsWith("\u00a7r\u00a72Guild") && a2.contains((CharSequence)":") && a2.contains((CharSequence)">")) {
            return true;
        }
        return Field2180.getValue() && a2.startsWith("\u00a7d") && a2.contains((CharSequence)":") && (a2.contains((CharSequence)"From") || a2.contains((CharSequence)"To"));
    }

    private void Method2089(String a, String a2) {
        Class91[] a3 = Class448.Method2461();
        CloseableHttpClient a4 = HttpClients.createDefault();
        URL a5 = new URL(this.Method2082(a));
        URI a6 = new URI(a5.getProtocol(), a5.getUserInfo(), a5.getHost(), a5.getPort(), a5.getPath(), a5.getQuery(), a5.getRef());
        String a7 = a6.toString();
        HttpGet a8 = new HttpGet(a7);
        a8.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
        String a9 = "null";
        Object a10 = a4.execute((HttpUriRequest)a8);
        Throwable throwable = null;
        try {
            a9 = IOUtils.toString((InputStream)a10.getEntity().getContent(), (Charset)StandardCharsets.UTF_8);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
        }
    }

    private void Method2090(String a, String a2) {
        Class91[] a3 = Class448.Method2461();
        CloseableHttpClient a4 = HttpClients.createDefault();
        URL a5 = new URL(this.Method2082(a));
        URI a6 = new URI(a5.getProtocol(), a5.getUserInfo(), a5.getHost(), a5.getPort(), a5.getPath(), a5.getQuery(), a5.getRef());
        String a7 = a6.toString();
        HttpGet a8 = new HttpGet(a7);
        a8.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
        String a9 = "null";
        Object a10 = a4.execute((HttpUriRequest)a8);
        Throwable throwable = null;
        try {
            a9 = IOUtils.toString((InputStream)a10.getEntity().getContent(), (Charset)StandardCharsets.UTF_8);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
        }
    }

    private static Throwable Method2091(Throwable throwable) {
        return throwable;
    }
}