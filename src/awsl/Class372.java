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
import net.minecraftforge.fml.common.MinecraftDummyContainer;
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
      ConcurrentHashMap var3 = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, a, 1);
      Map var4 = (Map)ReflectionHelper.getPrivateValue(EventBus.class, a, 2);
      if (!var3.containsKey(a)) {
         MinecraftDummyContainer var5 = Loader.instance().getMinecraftModContainer();
         var4.put(a, var5);
         ReflectionHelper.setPrivateValue(EventBus.class, a, var4, 2);
         Set var6 = TypeToken.of(a.getClass()).getTypes().rawTypes();
         Method[] var7 = a.getClass().getMethods();
         int var8 = var7.length;
         int var9 = 0;
         if (var9 < var8) {
            Method var10 = var7[var9];
            Iterator var11 = var6.Method1383();
            if (var11.Method932()) {
               Class var12 = (Class)var11.Method933();

               try {
                  Method var13 = var12.getDeclaredMethod(var10.getName(), var10.getParameterTypes());
                  if (var13.isAnnotationPresent(SubscribeEvent.class)) {
                     Class[] var14 = var10.getParameterTypes();
                     Class var15 = var14[0];
                     int var16 = (Integer)ReflectionHelper.getPrivateValue(EventBus.class, a, 3);
                     Constructor var17 = var15.getConstructor();
                     var17.setAccessible(true);
                     Event var18 = (Event)var17.newInstance();
                     ASMEventHandler var19 = new ASMEventHandler(a, var10, var5);
                     var18.getListenerList().register(var16, var19.getPriority(), var19);
                     ArrayList var20 = (ArrayList)var3.get(a);
                     var20 = new ArrayList();
                     var3.put(a, var20);
                     ReflectionHelper.setPrivateValue(EventBus.class, a, var3, 1);
                     var20.Method2530(var19);
                  }
               } catch (Exception var21) {
               }
            }

            ++var9;
         }
      }

   }

   public static void Method408(EventBus a, Object a) {
      ConcurrentHashMap var2 = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, a, new String[]{"listeners"});
      Map var3 = (Map)ReflectionHelper.getPrivateValue(EventBus.class, a, new String[]{"listenerOwners"});
      if (!var2.containsKey(a)) {
         MinecraftDummyContainer var4 = Loader.instance().getMinecraftModContainer();
         var3.put(a, var4);
         ReflectionHelper.setPrivateValue(EventBus.class, a, var3, new String[]{"listenerOwners"});
         Set var5 = TypeToken.of(a.getClass()).getTypes().rawTypes();
         Method[] var6 = a.getClass().getMethods();
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            Method var9 = var6[var8];
            Iterator var10 = var5.Method1383();

            while(var10.Method932()) {
               Class var11 = (Class)var10.Method933();

               try {
                  Method var12 = var11.getDeclaredMethod(var9.getName(), var9.getParameterTypes());
                  if (var12.isAnnotationPresent(SubscribeEvent.class)) {
                     Class[] var13 = var9.getParameterTypes();
                     Class var14 = var13[0];
                     Method409(a, var14, a, var9, var4);
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
         int var5 = (Integer)ReflectionHelper.getPrivateValue(EventBus.class, a, new String[]{"busID"});
         ConcurrentHashMap var6 = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, a, new String[]{"listeners"});
         Constructor var7 = a.getConstructor();
         var7.setAccessible(true);
         Event var8 = (Event)var7.newInstance();
         ASMEventHandler var9 = new ASMEventHandler(a, a, a);
         var8.getListenerList().register(var5, var9.getPriority(), var9);
         ArrayList var10 = (ArrayList)var6.get(a);
         var10 = new ArrayList();
         var6.put(a, var10);
         ReflectionHelper.setPrivateValue(EventBus.class, a, var6, new String[]{"listeners"});
         var10.Method2530(var9);
      } catch (Exception var11) {
      }

   }

   private static NoSuchMethodException Method410(NoSuchMethodException noSuchMethodException) {
      return noSuchMethodException;
   }
}
