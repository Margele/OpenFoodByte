/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.FileReader
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.io.PrintWriter
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Iterator
 *  java.util.Objects
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.input.Keyboard
 */
package trash.foodbyte.utils;

import awsl.Class207;
import awsl.Class215;
import awsl.Class305;
import awsl.Class307;
import awsl.Class309;
import awsl.Class381;
import awsl.Class421;
import awsl.Class446;
import awsl.Class447;
import awsl.Class705;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Iterator;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class FileManager {
    public Minecraft mc = Minecraft.getMinecraft();
    public String filePath;
    private static String[] Field1597;

    public FileManager() {
        this.filePath = this.mc.mcDataDir.getAbsolutePath() + "/" + GlobalModule.clientName;
        File a = new File(this.filePath);
        if (!a.exists()) {
            a.mkdirs();
        }
        try {
            this.loadKeys();
            this.loadValues();
            this.loadMods();
            this.loadFriends();
            this.loadTargets();
            this.loadNameProtect();
            this.loadHide();
            this.loadClickGuiPos();
            this.loadFoodByteClickGui();
            this.loadConfigs();
        }
        catch (IOException a2) {
            a2.printStackTrace();
        }
    }

    public void saveAll() {
        this.saveKeys();
        this.saveValues();
        this.saveMods();
        this.saveFriends();
        this.saveNameProtect();
        this.saveHide();
        this.saveClickGuiPos();
        this.saveFoodByteClickGui();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void saveKeys() {
        File a = new File(this.filePath + "/keys.cfg");
        try {
            if (!a.exists()) {
                a.createNewFile();
            }
            PrintWriter a2 = new PrintWriter(a);
            Iterator iterator = ModuleManager.getAllModules().Method1383();
            while (iterator.Method932()) {
                Module a3 = (Module)iterator.Method933();
                String a4 = a3.Method1020() < 0 ? "None" : Keyboard.getKeyName((int)a3.Method1020());
                a2.write(a3.getName() + ":" + a4 + "\n");
            }
            a2.close();
            return;
        }
        catch (Exception a5) {
            a5.printStackTrace();
        }
    }

    public void loadKeys() throws IOException {
        File a = new File(this.filePath + "/keys.cfg");
        if (!a.exists()) {
            a.createNewFile();
        } else {
            String a2;
            BufferedReader a3 = new BufferedReader((Reader)new FileReader(a));
            while ((a2 = a3.readLine()) != null) {
                if (!a2.contains((CharSequence)":")) continue;
                String[] a4 = a2.split(":");
                Module a5 = ModuleManager.getModule(a4[0]);
                int a6 = Keyboard.getKeyIndex((String)a4[1]);
                if (a6 == -1) continue;
                a5.Method1021(a6);
            }
            a3.close();
        }
    }

    public void saveMods() {
        File a;
        block4: {
            a = new File(this.filePath + "/mods.cfg");
            if (a.exists()) break block4;
            a.createNewFile();
        }
        try {
            PrintWriter a2 = new PrintWriter(a);
            Iterator iterator = ModuleManager.getAllModules().Method1383();
            while (iterator.Method932()) {
                Module a3 = (Module)iterator.Method933();
                a2.print(a3.getName() + ":" + a3.getState() + "\n");
            }
            a2.close();
        }
        catch (Exception a4) {
            a4.printStackTrace();
        }
    }

    public void loadMods() throws IOException {
        File a = new File(this.filePath + "/mods.cfg");
        if (!a.exists()) {
            a.createNewFile();
        } else {
            String a2;
            BufferedReader a3 = new BufferedReader((Reader)new FileReader(a));
            while ((a2 = a3.readLine()) != null) {
                if (!a2.contains((CharSequence)":")) continue;
                String[] a4 = a2.split(":");
                Module a5 = ModuleManager.getModule(a4[0]);
            }
            a3.close();
        }
    }

    /*
     * Exception decompiling
     */
    public void saveValues() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 7[WHILELOOP]
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

    public void loadValues() throws IOException {
        File a = new File(this.filePath + "/values.cfg");
        if (!a.exists()) {
            a.createNewFile();
        } else {
            String a2;
            BufferedReader a3 = new BufferedReader((Reader)new FileReader(a));
            while ((a2 = a3.readLine()) != null) {
                if (!a2.contains((CharSequence)":")) continue;
                String[] a4 = a2.split(":");
                Iterator iterator = Class446.Method2764().Method1383();
                while (iterator.Method932()) {
                    Class447 a5 = (Class447)iterator.Method933();
                    if (!a4[0].equalsIgnoreCase(a5.Method2755() + "_" + a5.Method2754())) continue;
                    if (a5 instanceof BooleanValue && a4[1].equalsIgnoreCase("b")) {
                        a5.Method2510(Boolean.parseBoolean((String)a4[2]));
                        continue;
                    }
                    if (a5 instanceof FloatValue && a4[1].equalsIgnoreCase("d")) {
                        a5.Method2510(Float.valueOf((float)Float.parseFloat((String)a4[2])));
                        continue;
                    }
                    if (a5 instanceof ColorValue) {
                        if (a4[1].equalsIgnoreCase("i")) {
                            ((ColorValue)a5).Method2440(Integer.parseInt((String)a4[2]));
                        }
                        if (a4.length <= 3 || !a4[3].equalsIgnoreCase("b")) continue;
                        ((ColorValue)a5).Method2438(Boolean.parseBoolean((String)a4[4]));
                        continue;
                    }
                    if (!(a5 instanceof ModeValue) || !a4[1].equalsIgnoreCase("s") || !a4[2].equalsIgnoreCase(a5.Method2754())) continue;
                    ((ModeValue)a5).Method2725(String.valueOf((Object)a4[3]));
                }
            }
            a3.close();
        }
    }

    public void saveFriends() {
        File a;
        block4: {
            a = new File(this.filePath + "/friend.cfg");
            if (a.exists()) break block4;
            a.createNewFile();
        }
        try {
            PrintWriter a2 = new PrintWriter(a);
            Iterator a3 = Class305.Method695().Method1383();
            while (a3.Method932()) {
                Class309 a4 = (Class309)a3.Method933();
                a2.print(a4.Method748() + ":" + a4.Method749() + "\n");
            }
            a2.close();
        }
        catch (Exception a5) {
            a5.printStackTrace();
        }
    }

    public void loadFriends() throws IOException {
        File a = new File(this.filePath + "/friend.cfg");
        if (!a.exists()) {
            a.createNewFile();
        } else {
            String a2;
            BufferedReader a3 = new BufferedReader((Reader)new FileReader(a));
            while ((a2 = a3.readLine()) != null) {
                if (!a2.contains((CharSequence)":")) continue;
                String[] a4 = a2.split(":");
                if (a2.length() < 2) continue;
                Class309 a5 = new Class309(a4[0], a4[1]);
                Class305.Method695().Method2530((Object)a5);
            }
            a3.close();
        }
    }

    public void saveTargets() {
        File a;
        block4: {
            a = new File(this.filePath + "/target.cfg");
            if (a.exists()) break block4;
            a.createNewFile();
        }
        try {
            PrintWriter a2 = new PrintWriter(a);
            Iterator a3 = Class305.Method696().Method1383();
            while (a3.Method932()) {
                Class307 a4 = (Class307)a3.Method933();
                a2.print(a4.Method744() + ":" + a4.Method745() + "\n");
            }
            a2.close();
        }
        catch (Exception a5) {
            a5.printStackTrace();
        }
    }

    public void loadTargets() throws IOException {
        File a = new File(this.filePath + "/target.cfg");
        if (!a.exists()) {
            a.createNewFile();
        } else {
            String a2;
            BufferedReader a3 = new BufferedReader((Reader)new FileReader(a));
            while ((a2 = a3.readLine()) != null) {
                if (!a2.contains((CharSequence)":")) continue;
                String[] a4 = a2.split(":");
                if (a2.length() < 2) continue;
                Class307 a5 = new Class307(a4[0], a4[1]);
                Class305.Method696().Method2530((Object)a5);
            }
            a3.close();
        }
    }

    public void saveNameProtect() {
        PrintWriter a;
        block5: {
            File a2;
            block4: {
                a2 = new File(this.filePath + "/nameprotect.cfg");
                if (a2.exists()) break block4;
                a2.createNewFile();
            }
            a = new PrintWriter(a2);
            if (!Objects.nonNull((Object)GlobalModule.fakeName)) break block5;
            a.print(GlobalModule.fakeName);
        }
        try {
            a.close();
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public void loadNameProtect() throws IOException {
        File a = new File(this.filePath + "/nameprotect.cfg");
        if (!a.exists()) {
            a.createNewFile();
        } else {
            String a2;
            BufferedReader a3 = new BufferedReader((Reader)new FileReader(a));
            while ((a2 = a3.readLine()) != null) {
                if (a2.equalsIgnoreCase("")) continue;
                GlobalModule.fakeName = a2;
            }
            a3.close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void saveHide() {
        File a = new File(this.filePath + "/Hide.cfg");
        try {
            if (!a.exists()) {
                a.createNewFile();
            }
            PrintWriter a2 = new PrintWriter(a);
            Iterator iterator = ModuleManager.getAllModules().Method1383();
            while (iterator.Method932()) {
                Module a3 = (Module)iterator.Method933();
                if (!a3.hide) continue;
                a2.print(a3.getName() + ":" + a3.hide + "\n");
            }
            a2.close();
            return;
        }
        catch (Exception a4) {
            a4.printStackTrace();
        }
    }

    public void loadHide() throws IOException {
        File a = new File(this.filePath + "/Hide.cfg");
        if (!a.exists()) {
            a.createNewFile();
        } else {
            String a2;
            BufferedReader a3 = new BufferedReader((Reader)new FileReader(a));
            while ((a2 = a3.readLine()) != null) {
                if (!a2.contains((CharSequence)":")) continue;
                String[] a4 = a2.split(":");
                Module a5 = ModuleManager.getModule(a4[0]);
                boolean a6 = Boolean.parseBoolean((String)a4[1]);
            }
            a3.close();
        }
    }

    public void saveClickGuiPos() {
        File a;
        block4: {
            a = new File(this.filePath + "/ClickGuiPos.cfg");
            if (a.exists()) break block4;
            a.createNewFile();
        }
        try {
            PrintWriter a2 = new PrintWriter(a);
            Iterator iterator = Class705.Field3044.Method1383();
            while (iterator.Method932()) {
                Class421 a3 = (Class421)iterator.Method933();
                a2.print(a3.Field2027 + ":" + a3.Field2028 + ":" + a3.Field2029 + ":" + a3.Field2035 + "\n");
            }
            a2.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void loadClickGuiPos() {
        File a = new File(this.filePath + "/ClickGuiPos.cfg");
        try {
            BufferedReader a2 = new BufferedReader((Reader)new FileReader(a));
            block3: while (true) {
                String a3;
                if ((a3 = a2.readLine()) == null) {
                    a2.close();
                    return;
                }
                String a4 = a3.split(":")[0];
                float a5 = Float.parseFloat((String)a3.split(":")[1]);
                float a6 = Float.parseFloat((String)a3.split(":")[2]);
                boolean a7 = Boolean.parseBoolean((String)a3.split(":")[3]);
                Iterator iterator = Class705.Field3045.Method1383();
                while (true) {
                    if (!iterator.Method932()) continue block3;
                    Class421 a8 = (Class421)iterator.Method933();
                    if (!a8.Field2027.equalsIgnoreCase(a4)) continue;
                    a8.Field2028 = (int)a5;
                    a8.Field2029 = (int)a6;
                    a8.Field2035 = a7;
                }
                break;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void saveFoodByteClickGui() {
        File a;
        block4: {
            a = new File(this.filePath + "/FoodByteClickGui.cfg");
            if (a.exists()) break block4;
            a.createNewFile();
        }
        try {
            PrintWriter a2 = new PrintWriter(a);
            Iterator iterator = GlobalModule.INSTANCE.Method2014().Method1833().Method1383();
            while (iterator.Method932()) {
                Class381 a3 = (Class381)iterator.Method933();
                a2.print(a3.Method1395() + ":" + a3.Method1410() + ":" + a3.Method1412() + ":" + a3.Method1406() + ":" + a3.Method1404() + ":" + a3.Method1402() + ":" + a3.Method1400() + "\n");
            }
            a2.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void loadFoodByteClickGui() {
        File a = new File(this.filePath + "/FoodByteClickGui.cfg");
        try {
            BufferedReader a2 = new BufferedReader((Reader)new FileReader(a));
            block3: while (true) {
                String a3;
                if ((a3 = a2.readLine()) == null) {
                    a2.close();
                    return;
                }
                String a4 = a3.split(":")[0];
                int a5 = Integer.parseInt((String)a3.split(":")[1]);
                int a6 = Integer.parseInt((String)a3.split(":")[2]);
                boolean a7 = Boolean.parseBoolean((String)a3.split(":")[3]);
                boolean a8 = Boolean.parseBoolean((String)a3.split(":")[4]);
                boolean a9 = Boolean.parseBoolean((String)a3.split(":")[5]);
                boolean a10 = Boolean.parseBoolean((String)a3.split(":")[6]);
                Iterator iterator = GlobalModule.INSTANCE.Method2014().Method1833().Method1383();
                while (true) {
                    if (!iterator.Method932()) continue block3;
                    Class381 a11 = (Class381)iterator.Method933();
                    if (!a11.Method1395().equalsIgnoreCase(a4)) continue;
                    a11.Method1411(a5);
                    a11.Method1413(a6);
                    a11.Method1407(a7);
                    a11.Method1405(a8);
                    a11.Method1403(a9);
                    a11.Method1401(a10);
                }
                break;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void loadConfigs() {
        Class215.Method2649().clear();
        try {
            File a = new File(System.getProperty((String)"user.home") + File.separator + GlobalModule.clientName);
            if (a.listFiles() == null) {
                return;
            }
            FilenameFilter a2 = FileManager::Method790;
            for (File a3 : a.listFiles(a2)) {
                Class207 a4 = new Class207(a3.getName().replace((CharSequence)"conf-", (CharSequence)"").replace((CharSequence)".cfg", (CharSequence)""));
                Class215.Method2649().Method2530((Object)a4);
            }
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }

    public void deleteConfig(String a) {
        try {
            File a2 = new File(System.getProperty((String)"user.home") + File.separator + GlobalModule.clientName + "/conf-" + a + ".cfg");
            if (a2.exists()) {
                a2.delete();
            }
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    /*
     * Exception decompiling
     */
    public void Method786(String a) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 9[WHILELOOP]
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

    /*
     * Exception decompiling
     */
    public void Method787(String a, boolean a) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 20[WHILELOOP]
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

    /*
     * Exception decompiling
     */
    public void Method788() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 9[WHILELOOP]
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

    /*
     * Exception decompiling
     */
    public void Method789() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 19[WHILELOOP]
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

    private static boolean Method790(File a, String a2) {
        return a2.startsWith("conf-") && a2.endsWith(".cfg");
    }

    public static void Method791(String[] stringArray) {
        Field1597 = stringArray;
    }

    public static String[] Method792() {
        return Field1597;
    }

    private static Exception Method793(Exception exception) {
        return exception;
    }

    static {
        FileManager.Method791(new String[3]);
    }
}