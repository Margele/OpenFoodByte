/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  java.io.File
 *  java.io.FileReader
 *  java.io.IOException
 *  java.io.PrintWriter
 *  java.io.Reader
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package awsl;

import awsl.Class260;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

public class Class259 {
    private ArrayList Field1416 = new ArrayList();
    private final Gson Field1417 = new GsonBuilder().setPrettyPrinting().create();
    private File Field1418;
    private static int Field1419;

    public Class259(File a) {
        this.Field1418 = new File(a + File.separator + "waypoints.json");
        this.Method2260();
    }

    public void Method2259() {
        block4: {
            if (this.Field1418 == null) {
                return;
            }
            if (this.Field1418.exists()) break block4;
            this.Field1418.createNewFile();
        }
        try {
            PrintWriter a = new PrintWriter(this.Field1418);
            a.write(this.Field1417.toJson((JsonElement)this.Method2261()));
            a.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void Method2260() {
        if (!this.Field1418.exists()) {
            this.Method2259();
            return;
        }
        try {
            JsonObject a = new JsonParser().parse((Reader)new FileReader(this.Field1418)).getAsJsonObject();
            this.Method2262(a);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public JsonObject Method2261() {
        JsonObject a = new JsonObject();
        JsonArray a2 = new JsonArray();
        this.Method2265().forEach(arg_0 -> Class259.Method2270(a2, arg_0));
        a.add("waypoints", (JsonElement)a2);
        return a;
    }

    public void Method2262(JsonObject a) {
        JsonArray a2 = a.get("waypoints").getAsJsonArray();
        a2.forEach(this::Method2269);
    }

    private Class260 Method2263(String a, String a2) {
        Iterator iterator = this.Field1416.Method1383();
        int a3 = Class259.Method2272();
        if (iterator.Method932()) {
            Class260 a4 = (Class260)iterator.Method933();
            if (a4.Method2835().equalsIgnoreCase(a) && a4.Method2836().equals((Object)a2)) {
                return a4;
            }
        }
        return null;
    }

    void Method2264(ArrayList a) {
        this.Field1416 = a;
    }

    public ArrayList Method2265() {
        return this.Field1416;
    }

    public void Method2266(String a, double a2, double a3, double a4, String a5, int a6) {
        this.Field1416.Method2530((Object)new Class260(a, a2, a3, a4, a5, a6));
    }

    public void Method2267(String a, String a2) {
        Class260 a3 = this.Method2263(a, a2);
        this.Field1416.remove((Object)a3);
    }

    public boolean Method2268(String a, String a2) {
        return this.Method2263(a, a2) != null;
    }

    private void Method2269(JsonElement a) {
        JsonObject a2 = (JsonObject)a;
        Class260 a3 = new Class260();
        a3.Method2842(a2);
        this.Method2265().Method2530((Object)a3);
    }

    private static void Method2270(JsonArray a, Class260 a2) {
        a.add((JsonElement)a2.Method2841());
    }

    public static void Method2271(int n) {
        Field1419 = n;
    }

    public static int Method2272() {
        return Field1419;
    }

    public static int Method2273() {
        int n = Class259.Method2272();
        return 76;
    }

    private static IOException Method2274(IOException iOException) {
        return iOException;
    }

    static {
        Class259.Method2271(0);
    }
}