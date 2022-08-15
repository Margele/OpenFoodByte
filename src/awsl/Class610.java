/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package awsl;

import awsl.Class234;
import awsl.Class521;
import awsl.Class523;
import awsl.Class525;
import awsl.Class527;
import awsl.Class529;
import awsl.Class531;
import awsl.Class534;
import awsl.Class536;
import awsl.Class538;
import awsl.Class540;
import awsl.Class542;
import awsl.Class544;
import awsl.Class546;
import awsl.Class548;
import awsl.Class550;
import awsl.Class552;
import awsl.Class562;
import awsl.Class609;
import awsl.Class613;
import awsl.Class733;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class610 {
    private static Class610 Field2854 = new Class610();
    private Map Field2855 = new HashMap();
    private Map Field2856 = new HashMap();

    public static Class610 Method3753() {
        return Field2854;
    }

    public Class610() {
        this.Field2855 = new HashMap();
        this.Field2856 = new HashMap();
        this.Method3755(0, Class546.class, Class733.LOGIN);
        this.Method3755(1, Class548.class, Class733.PLAY);
        this.Method3755(2, Class538.class, Class733.PLAY);
        this.Method3755(3, Class613.class, Class733.PLAY);
        this.Method3755(4, Class550.class, Class733.PLAY);
        this.Method3755(5, Class544.class, Class733.PLAY);
        this.Method3755(6, Class542.class, Class733.PLAY);
        this.Method3755(7, Class540.class, Class733.PLAY);
        this.Method3755(100, Class531.class, Class733.PLAY);
        this.Method3755(101, Class552.class, Class733.PLAY);
        this.Method3755(102, Class521.class, Class733.PLAY);
        this.Method3755(103, Class534.class, Class733.PLAY);
        this.Method3755(104, Class562.class, Class733.PLAY);
        this.Method3755(105, Class523.class, Class733.PLAY);
        this.Method3755(106, Class527.class, Class733.PLAY);
        this.Method3755(107, Class525.class, Class733.PLAY);
        this.Method3755(108, Class529.class, Class733.PLAY);
        this.Method3755(109, Class536.class, Class733.PLAY);
    }

    public Map Method3754() {
        return this.Field2856;
    }

    private void Method3755(int a, Class a2, Class733 a3) {
        try {
            a2.newInstance();
            this.Field2856.put((Object)a, (Object)a2);
            this.Field2855.put((Object)a2, (Object)a3);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public Class609 Method3756(int a) throws IllegalAccessException, InstantiationException {
        if (!this.Field2856.containsKey((Object)a)) {
            throw new RuntimeException("Packet with id " + a + " is not registered.");
        }
        return (Class609)((Class)this.Field2856.Method2665((Object)a)).newInstance();
    }

    public int Method3757(Class609 a) {
        Iterator iterator = this.Field2856.Method2663().Method1383();
        boolean a2 = Class234.Method1269();
        if (iterator.Method932()) {
            Map.Entry a3 = (Map.Entry)iterator.Method933();
            Class a4 = (Class)a3.getValue();
            if (a4.isInstance((Object)a)) {
                return (Integer)a3.getKey();
            }
        }
        throw new RuntimeException("Packet " + a + " is not registered.");
    }

    private static Exception Method3758(Exception exception) {
        return exception;
    }
}