/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  java.io.File
 *  java.io.FileReader
 *  java.io.IOException
 *  java.io.PrintWriter
 *  java.io.Reader
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package awsl;

import awsl.Class259;
import awsl.Class629;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import trash.foodbyte.module.GlobalModule;

public class Class269 {
    private static File Field1464;
    private static final Gson Field1465;

    Class269(File a) {
        Field1464 = new File(a + File.separator + "waypoints.json");
    }

    public void Method2864() {
        try {
            if (!Field1464.exists()) {
                Field1464.createNewFile();
                this.Method2866();
                return;
            }
            this.Method2865();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Loose catch block
     */
    public void Method2865() {
        Throwable throwable;
        FileReader a;
        block14: {
            int a2 = Class259.Method2273();
            a = new FileReader(Field1464);
            throwable = null;
            GlobalModule.INSTANCE.Method2009().Method2264((ArrayList)Field1465.fromJson((Reader)a, new Class629(this).getType()));
            if (GlobalModule.INSTANCE.Method2009().Method2265() != null) break block14;
            GlobalModule.INSTANCE.Method2009().Method2264(new ArrayList());
        }
        try {
            a.close();
        }
        catch (Throwable throwable2) {
            throwable.addSuppressed(throwable2);
            a.close();
        }
        {
            catch (Throwable throwable3) {
                try {
                    throwable = throwable3;
                    throw throwable3;
                }
                catch (Throwable throwable4) {
                    try {
                        a.close();
                    }
                    catch (Throwable throwable5) {
                        throwable.addSuppressed(throwable5);
                        a.close();
                    }
                    try {
                        throw throwable4;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
            }
        }
    }

    /*
     * Loose catch block
     */
    public void Method2866() {
        block14: {
            int a = Class259.Method2273();
            if (Field1464.exists()) {
                PrintWriter a2 = new PrintWriter(Field1464);
                Throwable throwable = null;
                a2.print(Field1465.toJson((Object)GlobalModule.INSTANCE.Method2009().Method2265()));
                try {
                    a2.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                    a2.close();
                }
                break block14;
                catch (Throwable throwable3) {
                    try {
                        throwable = throwable3;
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {
                        try {
                            a2.close();
                        }
                        catch (Throwable throwable5) {
                            throwable.addSuppressed(throwable5);
                            a2.close();
                        }
                        try {
                            throw throwable4;
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                }
            }
        }
    }

    static {
        Field1465 = new GsonBuilder().setPrettyPrinting().create();
    }

    private static Throwable Method2867(Throwable throwable) {
        return throwable;
    }
}