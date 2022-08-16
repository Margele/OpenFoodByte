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

import eventapi.Event;
import eventapi.EventTarget;
import eventapi.MethodData;
import eventapi.PackedMethodData;
import eventapi.Priority;
import eventapi.StoppableEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventManager {
    private static final Map REGISTRY_MAP = new HashMap();
    private static boolean trash;

    private EventManager() {
    }

    public static void register(Object o) {
        for (Method a : o.getClass().getDeclaredMethods()) {
            if (EventManager.isMethodBad(a)) continue;
            EventManager.register(a, o);
        }
    }

    public static void register(Object o, Class clazz) {
        for (Method a : o.getClass().getDeclaredMethods()) {
            if (EventManager.isMethodBad(a, clazz)) continue;
            EventManager.register(a, o);
        }
    }

    public static void unregister(Object o) {
        Iterator iterator = REGISTRY_MAP.values().Method1383();
        while (iterator.Method932()) {
            List a = (List)iterator.Method933();
            a.removeIf(arg_0 -> EventManager.trash2(o, arg_0));
        }
        EventManager.cleanMap(true);
    }

    public static void unregister(Object a, Class a2) {
        if (REGISTRY_MAP.containsKey((Object)a2)) {
            ((List)REGISTRY_MAP.Method2665((Object)a2)).removeIf(arg_0 -> EventManager.trash(a, arg_0));
            EventManager.cleanMap(true);
        }
    }

    public static boolean Method2679(Object a) {
        Iterator iterator = REGISTRY_MAP.values().Method1383();
        while (iterator.Method932()) {
            List a2 = (List)iterator.Method933();
            Iterator iterator2 = a2.Method1383();
            while (iterator2.Method932()) {
                MethodData a3 = (MethodData)iterator2.Method933();
                if (!a3.getSource().getClass().Method3429(a)) continue;
                return true;
            }
        }
        return false;
    }

    private static void register(Method method, Object object) {
        block5: {
            MethodData a;
            Class a2;
            block4: {
                a2 = method.getParameterTypes()[0];
                boolean a3 = EventManager.trash2();
                a = new MethodData(object, method, ((EventTarget)method.getAnnotation(EventTarget.class)).value());
                if (!a.getTarget().isAccessible()) {
                    a.getTarget().setAccessible(true);
                }
                if (!REGISTRY_MAP.containsKey((Object)a2)) break block4;
                if (((List)REGISTRY_MAP.Method2665((Object)a2)).contains((Object)a)) break block5;
                ((List)REGISTRY_MAP.Method2665((Object)a2)).Method2530((Object)a);
                EventManager.sortListValue(a2);
            }
            REGISTRY_MAP.put((Object)a2, (Object)new PackedMethodData(a));
        }
    }

    public static void removeEntry(Class clazz) {
        Iterator a = REGISTRY_MAP.Method2663().Method1383();
        while (a.Method932()) {
            if (!((Class)((Map.Entry)a.Method933()).getKey()).Method3429((Object)clazz)) continue;
            a.Method934();
            break;
        }
    }

    public static void cleanMap(boolean clazz) {
        Iterator a = REGISTRY_MAP.Method2663().Method1383();
        while (a.Method932()) {
            if (!((List)((Map.Entry)a.Method933()).getValue()).isEmpty()) continue;
            a.Method934();
        }
    }

    private static void sortListValue(Class indexClass) {
        CopyOnWriteArrayList a = new CopyOnWriteArrayList();
        for (byte a2 : Priority.VALUE_ARRAY) {
            Iterator iterator = ((List)REGISTRY_MAP.Method2665((Object)indexClass)).Method1383();
            while (iterator.Method932()) {
                MethodData a3 = (MethodData)iterator.Method933();
                if (a3.getPriority() != a2) continue;
                a.Method2530((Object)a3);
            }
        }
        REGISTRY_MAP.put((Object)indexClass, (Object)a);
    }

    private static boolean isMethodBad(Method m) {
        return m.getParameterTypes().length != 1 || !m.isAnnotationPresent(EventTarget.class);
    }

    private static boolean isMethodBad(Method m, Class clazz) {
        return EventManager.isMethodBad(m) || !m.getParameterTypes()[0].Method3429((Object)clazz);
    }

    public static Event call(Event e) {
        Iterator iterator;
        List a = (List)REGISTRY_MAP.Method2665((Object)e.getClass());
        boolean a2 = EventManager.trash2();
        if (e instanceof StoppableEvent) {
            StoppableEvent a3 = (StoppableEvent)e;
            Iterator iterator2 = a.Method1383();
            if (iterator2.Method932()) {
                MethodData a4 = (MethodData)iterator2.Method933();
                EventManager.invoke(a4, e);
                if (a3.isStopped()) {
                }
            }
        }
        if ((iterator = a.Method1383()).Method932()) {
            MethodData a5 = (MethodData)iterator.Method933();
            EventManager.invoke(a5, e);
        }
        return e;
    }

    private static void invoke(MethodData data, Event event) {
        try {
            data.getTarget().invoke(data.getSource(), new Object[]{event});
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static boolean trash(Object a, MethodData a2) {
        return a2.getSource().Method3429(a);
    }

    private static boolean trash2(Object a, MethodData a2) {
        return a2.getSource().Method3429(a);
    }

    static {
        EventManager.trash(true);
    }

    public static void trash(boolean bl) {
        trash = bl;
    }

    public static boolean trash() {
        return trash;
    }

    public static boolean trash2() {
        boolean bl = EventManager.trash();
        return true;
    }
}