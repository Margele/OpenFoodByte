package awsl;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.eventhandler.ASMEventHandler;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import trash.foodbyte.utils.RenderUtils;

public class Class372 {
   public static void Method405(Object a) {
      Method407(FMLCommonHandler.instance().bus(), a);
      Method407(MinecraftForge.EVENT_BUS, a);
   }

   public static void Method406(Object a) {
      FMLCommonHandler.instance().bus().unregister(a);
      MinecraftForge.EVENT_BUS.unregister(a);
   }

   private static void Method407(EventBus a, Object a) {
      RenderUtils.trash();
      ConcurrentHashMap a = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, a, 1);
      Map a = (Map)ReflectionHelper.getPrivateValue(EventBus.class, a, 2);
      if (!a.containsKey(a)) {
         ModContainer a = Loader.instance().getMinecraftModContainer();
         a.put(a, a);
         ReflectionHelper.setPrivateValue(EventBus.class, a, a, 2);
         Set a = TypeToken.of(a.getClass()).getTypes().rawTypes();
         Method[] var7 = a.getClass().getMethods();
         int var8 = var7.length;
         int var9 = 0;
         if (var9 < var8) {
            Method a = var7[var9];
            Iterator var11 = a.Method1383();
            if (var11.Method932()) {
               Class a = (Class)var11.Method933();

               try {
                  Method a = a.getDeclaredMethod(a.getName(), a.getParameterTypes());
                  if (a.isAnnotationPresent(SubscribeEvent.class)) {
                     Class[] a = a.getParameterTypes();
                     Class a = a[0];
                     int a = (Integer)ReflectionHelper.getPrivateValue(EventBus.class, a, 3);
                     Constructor a = a.getConstructor();
                     a.setAccessible(true);
                     Event a = (Event)a.newInstance();
                     ASMEventHandler a = new ASMEventHandler(a, a, a);
                     a.getListenerList().register(a, a.getPriority(), a);
                     ArrayList a = (ArrayList)a.get(a);
                     a = new ArrayList();
                     a.put(a, a);
                     ReflectionHelper.setPrivateValue(EventBus.class, a, a, 1);
                     a.Method2530(a);
                  }
               } catch (Exception var21) {
               }
            }

            ++var9;
         }
      }

   }

   public static void Method408(EventBus a, Object a) {
      ConcurrentHashMap a = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, a, new String[]{"listeners"});
      Map a = (Map)ReflectionHelper.getPrivateValue(EventBus.class, a, new String[]{"listenerOwners"});
      if (!a.containsKey(a)) {
         ModContainer a = Loader.instance().getMinecraftModContainer();
         a.put(a, a);
         ReflectionHelper.setPrivateValue(EventBus.class, a, a, new String[]{"listenerOwners"});
         Set a = TypeToken.of(a.getClass()).getTypes().rawTypes();
         Method[] var6 = a.getClass().getMethods();
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            Method a = var6[var8];
            Iterator var10 = a.Method1383();

            while(var10.Method932()) {
               Class a = (Class)var10.Method933();

               try {
                  Method a = a.getDeclaredMethod(a.getName(), a.getParameterTypes());
                  if (a.isAnnotationPresent(SubscribeEvent.class)) {
                     Class[] a = a.getParameterTypes();
                     Class a = a[0];
                     Method409(a, a, a, a, a);
                     break;
                  }
               } catch (NoSuchMethodException var15) {
               }
            }
         }

      }
   }

   private static void Method409(EventBus a, Class a, Object a, Method a, ModContainer a) {
      try {
         int a = (Integer)ReflectionHelper.getPrivateValue(EventBus.class, a, new String[]{"busID"});
         ConcurrentHashMap a = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, a, new String[]{"listeners"});
         Constructor a = a.getConstructor();
         a.setAccessible(true);
         Event a = (Event)a.newInstance();
         ASMEventHandler a = new ASMEventHandler(a, a, a);
         a.getListenerList().register(a, a.getPriority(), a);
         ArrayList a = (ArrayList)a.get(a);
         a = new ArrayList();
         a.put(a, a);
         ReflectionHelper.setPrivateValue(EventBus.class, a, a, new String[]{"listeners"});
         a.Method2530(a);
      } catch (Exception var11) {
      }

   }

   private static NoSuchMethodException Method410(NoSuchMethodException noSuchMethodException) {
      return noSuchMethodException;
   }
}
