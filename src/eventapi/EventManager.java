/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.reflect.Method
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package eventapi;

import awsl.Class252;
import awsl.Class255;
import awsl.Class490;
import awsl.Class533;
import eventapi.Event;
import eventapi.EventTarget;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventManager {
    private static final Map Field2083 = new HashMap();
    private static boolean Field2084;

    private EventManager() {
    }

    public static void register(Object a) {
        for (Method a2 : a.getClass().getDeclaredMethods()) {
            if (EventManager.Method2684(a2)) continue;
            EventManager.Method2680(a2, a);
        }
    }

    public static void Method2676(Object a, Class a2) {
        for (Method a3 : a.getClass().getDeclaredMethods()) {
            if (EventManager.Method2685(a3, a2)) continue;
            EventManager.Method2680(a3, a);
        }
    }

    public static void unregister(Object a) {
        Iterator iterator = Field2083.values().Method1383();
        while (iterator.Method932()) {
            List a2 = (List)iterator.Method933();
            a2.removeIf(arg_0 -> EventManager.Method2689(a, arg_0));
        }
        EventManager.Method2682(true);
    }

    public static void Method2678(Object a, Class a2) {
        if (Field2083.containsKey((Object)a2)) {
            ((List)Field2083.Method2665((Object)a2)).removeIf(arg_0 -> EventManager.Method2688(a, arg_0));
            EventManager.Method2682(true);
        }
    }

    public static boolean Method2679(Object a) {
        Iterator iterator = Field2083.values().Method1383();
        while (iterator.Method932()) {
            List a2 = (List)iterator.Method933();
            Iterator iterator2 = a2.Method1383();
            while (iterator2.Method932()) {
                Class533 a3 = (Class533)iterator2.Method933();
                if (!a3.Method1696().getClass().Method3429(a)) continue;
                return true;
            }
        }
        return false;
    }

    private static void Method2680(Method a, Object a2) {
        block5: {
            Class533 a3;
            Class a4;
            block4: {
                a4 = a.getParameterTypes()[0];
                boolean a5 = EventManager.Method2692();
                a3 = new Class533(a2, a, ((EventTarget)a.getAnnotation(EventTarget.class)).Method1462());
                if (!a3.Method1697().isAccessible()) {
                    a3.Method1697().setAccessible(true);
                }
                if (!Field2083.containsKey((Object)a4)) break block4;
                if (((List)Field2083.Method2665((Object)a4)).contains((Object)a3)) break block5;
                ((List)Field2083.Method2665((Object)a4)).Method2530((Object)a3);
                EventManager.Method2683(a4);
            }
            Field2083.put((Object)a4, (Object)new Class490(a3));
        }
    }

    public static void Method2681(Class a) {
        Iterator a2 = Field2083.Method2663().Method1383();
        while (a2.Method932()) {
            if (!((Class)((Map.Entry)a2.Method933()).getKey()).Method3429((Object)a)) continue;
            a2.Method934();
            break;
        }
    }

    public static void Method2682(boolean a) {
        Iterator a2 = Field2083.Method2663().Method1383();
        while (a2.Method932()) {
            if (!((List)((Map.Entry)a2.Method933()).getValue()).isEmpty()) continue;
            a2.Method934();
        }
    }

    private static void Method2683(Class a) {
        CopyOnWriteArrayList a2 = new CopyOnWriteArrayList();
        for (byte a3 : Class255.Field1397) {
            Iterator iterator = ((List)Field2083.Method2665((Object)a)).Method1383();
            while (iterator.Method932()) {
                Class533 a4 = (Class533)iterator.Method933();
                if (a4.Method1698() != a3) continue;
                a2.Method2530((Object)a4);
            }
        }
        Field2083.put((Object)a, (Object)a2);
    }

    private static boolean Method2684(Method a) {
        return a.getParameterTypes().length != 1 || !a.isAnnotationPresent(EventTarget.class);
    }

    private static boolean Method2685(Method a, Class a2) {
        return EventManager.Method2684(a) || !a.getParameterTypes()[0].Method3429((Object)a2);
    }

    public static Event Method2686(Event a) {
        Iterator iterator;
        List a2 = (List)Field2083.Method2665((Object)a.getClass());
        boolean a3 = EventManager.Method2692();
        if (a instanceof Class252) {
            Class252 a4 = (Class252)a;
            Iterator iterator2 = a2.Method1383();
            if (iterator2.Method932()) {
                Class533 a5 = (Class533)iterator2.Method933();
                EventManager.Method2687(a5, a);
                if (a4.Method2241()) {
                }
            }
        }
        if ((iterator = a2.Method1383()).Method932()) {
            Class533 a6 = (Class533)iterator.Method933();
            EventManager.Method2687(a6, a);
        }
        return a;
    }

    private static void Method2687(Class533 a, Event a2) {
        try {
            a.Method1697().invoke(a.Method1696(), new Object[]{a2});
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static boolean Method2688(Object a, Class533 a2) {
        return a2.Method1696().Method3429(a);
    }

    private static boolean Method2689(Object a, Class533 a2) {
        return a2.Method1696().Method3429(a);
    }

    static {
        EventManager.Method2690(true);
    }

    public static void Method2690(boolean bl) {
        Field2084 = bl;
    }

    public static boolean Method2691() {
        return Field2084;
    }

    public static boolean Method2692() {
        boolean bl = EventManager.Method2691();
        return true;
    }
}