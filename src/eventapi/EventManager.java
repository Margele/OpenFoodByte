package eventapi;

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
      Method[] var1 = o.getClass().getDeclaredMethods();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Method a = var1[var3];
         if (!isMethodBad(a)) {
            register(a, o);
         }
      }

   }

   public static void register(Object o, Class clazz) {
      Method[] var2 = o.getClass().getDeclaredMethods();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Method a = var2[var4];
         if (!isMethodBad(a, clazz)) {
            register(a, o);
         }
      }

   }

   public static void unregister(Object o) {
      Iterator var1 = REGISTRY_MAP.values().Method1383();

      while(var1.Method932()) {
         List a = (List)var1.Method933();
         a.removeIf(EventManager::trash2);
      }

      cleanMap(true);
   }

   public static void unregister(Object a, Class a) {
      if (REGISTRY_MAP.containsKey(a)) {
         ((List)REGISTRY_MAP.Method2665(a)).removeIf(EventManager::trash);
         cleanMap(true);
      }

   }

   public static boolean Method2679(Object a) {
      Iterator var1 = REGISTRY_MAP.values().Method1383();

      while(var1.Method932()) {
         List a = (List)var1.Method933();
         Iterator var3 = a.Method1383();

         while(var3.Method932()) {
            MethodData a = (MethodData)var3.Method933();
            if (a.getSource().getClass().Method3429(a)) {
               return true;
            }
         }
      }

      return false;
   }

   private static void register(Method method, Object object) {
      trash2();
      Class a = method.getParameterTypes()[0];
      MethodData a = new MethodData(object, method, ((EventTarget)method.getAnnotation(EventTarget.class)).value());
      if (!a.getTarget().isAccessible()) {
         a.getTarget().setAccessible(true);
      }

      if (REGISTRY_MAP.containsKey(a)) {
         if (((List)REGISTRY_MAP.Method2665(a)).contains(a)) {
            return;
         }

         ((List)REGISTRY_MAP.Method2665(a)).Method2530(a);
         sortListValue(a);
      }

      REGISTRY_MAP.put(a, new PackedMethodData(a));
   }

   public static void removeEntry(Class clazz) {
      Iterator a = REGISTRY_MAP.Method2663().Method1383();

      while(a.Method932()) {
         if (((Class)((Map.Entry)a.Method933()).getKey()).Method3429(clazz)) {
            a.Method934();
            break;
         }
      }

   }

   public static void cleanMap(boolean clazz) {
      Iterator a = REGISTRY_MAP.Method2663().Method1383();

      while(a.Method932()) {
         if (((List)((Map.Entry)a.Method933()).getValue()).isEmpty()) {
            a.Method934();
         }
      }

   }

   private static void sortListValue(Class indexClass) {
      List a = new CopyOnWriteArrayList();
      byte[] var2 = Priority.VALUE_ARRAY;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         byte a = var2[var4];
         Iterator var6 = ((List)REGISTRY_MAP.Method2665(indexClass)).Method1383();

         while(var6.Method932()) {
            MethodData a = (MethodData)var6.Method933();
            if (a.getPriority() == a) {
               a.Method2530(a);
            }
         }
      }

      REGISTRY_MAP.put(indexClass, a);
   }

   private static boolean isMethodBad(Method m) {
      return m.getParameterTypes().length != 1 || !m.isAnnotationPresent(EventTarget.class);
   }

   private static boolean isMethodBad(Method m, Class clazz) {
      return isMethodBad(m) || !m.getParameterTypes()[0].Method3429(clazz);
   }

   public static Event call(Event e) {
      trash2();
      List a = (List)REGISTRY_MAP.Method2665(e.getClass());
      if (e instanceof StoppableEvent) {
         StoppableEvent a = (StoppableEvent)e;
         Iterator var4 = a.Method1383();
         if (var4.Method932()) {
            MethodData a = (MethodData)var4.Method933();
            invoke(a, e);
            if (a.isStopped()) {
               ;
            }
         }
      }

      Iterator var6 = a.Method1383();
      if (var6.Method932()) {
         MethodData a = (MethodData)var6.Method933();
         invoke(a, e);
      }

      return e;
   }

   private static void invoke(MethodData data, Event event) {
      try {
         data.getTarget().invoke(data.getSource(), event);
      } catch (Exception var3) {
      }

   }

   private static boolean trash(Object a, MethodData a) {
      return a.getSource().Method3429(a);
   }

   private static boolean trash2(Object a, MethodData a) {
      return a.getSource().Method3429(a);
   }

   static {
      trash(true);
   }

   public static void trash(boolean boolean1) {
      trash = boolean1;
   }

   public static boolean trash() {
      return trash;
   }

   public static boolean trash2() {
      boolean var0 = trash();
      return true;
   }
}
