/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.Loader
 *  net.minecraftforge.fml.common.MinecraftDummyContainer
 *  net.minecraftforge.fml.common.ModContainer
 *  net.minecraftforge.fml.common.eventhandler.ASMEventHandler
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  net.minecraftforge.fml.common.eventhandler.EventBus
 *  net.minecraftforge.fml.common.eventhandler.IEventListener
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 */
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
import net.minecraftforge.fml.common.eventhandler.IEventListener;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import trash.foodbyte.utils.RenderUtils;

public class Class372 {
    public static void Method405(Object a) {
        Class372.Method407(FMLCommonHandler.instance().bus(), a);
        Class372.Method407(MinecraftForge.EVENT_BUS, a);
    }

    public static void Method406(Object a) {
        FMLCommonHandler.instance().bus().unregister(a);
        MinecraftForge.EVENT_BUS.unregister(a);
    }

    private static void Method407(EventBus a, Object a2) {
        block4: {
            int n;
            block3: {
                ConcurrentHashMap a3 = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, (Object)a, (int)1);
                int[] a4 = RenderUtils.trash();
                Map a5 = (Map)ReflectionHelper.getPrivateValue(EventBus.class, (Object)a, (int)2);
                if (a3.containsKey(a2)) break block4;
                MinecraftDummyContainer a6 = Loader.instance().getMinecraftModContainer();
                a5.put(a2, (Object)a6);
                ReflectionHelper.setPrivateValue(EventBus.class, (Object)a, (Object)a5, (int)2);
                Set a7 = TypeToken.of((Class)a2.getClass()).getTypes().rawTypes();
                Method[] methodArray = a2.getClass().getMethods();
                int n2 = methodArray.length;
                n = 0;
                if (n >= n2) break block4;
                Method a8 = methodArray[n];
                Iterator iterator = a7.Method1383();
                if (iterator.Method932()) {
                    Class a9 = (Class)iterator.Method933();
                    try {
                        Method a10 = a9.getDeclaredMethod(a8.getName(), a8.getParameterTypes());
                        if (!a10.isAnnotationPresent(SubscribeEvent.class)) break block3;
                        Class[] a11 = a8.getParameterTypes();
                        Class a12 = a11[0];
                        int a13 = (Integer)ReflectionHelper.getPrivateValue(EventBus.class, (Object)a, (int)3);
                        Constructor a14 = a12.getConstructor(new Class[0]);
                        a14.setAccessible(true);
                        Event a15 = (Event)a14.newInstance(new Object[0]);
                        ASMEventHandler a16 = new ASMEventHandler(a2, a8, (ModContainer)a6);
                        a15.getListenerList().register(a13, a16.getPriority(), (IEventListener)a16);
                        ArrayList a17 = (ArrayList)a3.get(a2);
                        a17 = new ArrayList();
                        a3.put(a2, (Object)a17);
                        ReflectionHelper.setPrivateValue(EventBus.class, (Object)a, (Object)a3, (int)1);
                        a17.Method2530((Object)a16);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
            }
            ++n;
        }
    }

    public static void Method408(EventBus a, Object a2) {
        ConcurrentHashMap a3 = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, (Object)a, (String[])new String[]{"listeners"});
        Map a4 = (Map)ReflectionHelper.getPrivateValue(EventBus.class, (Object)a, (String[])new String[]{"listenerOwners"});
        if (a3.containsKey(a2)) {
            return;
        }
        MinecraftDummyContainer a5 = Loader.instance().getMinecraftModContainer();
        a4.put(a2, (Object)a5);
        ReflectionHelper.setPrivateValue(EventBus.class, (Object)a, (Object)a4, (String[])new String[]{"listenerOwners"});
        Set a6 = TypeToken.of((Class)a2.getClass()).getTypes().rawTypes();
        block2: for (Method a7 : a2.getClass().getMethods()) {
            Iterator iterator = a6.Method1383();
            while (iterator.Method932()) {
                Class a8 = (Class)iterator.Method933();
                try {
                    Method a9 = a8.getDeclaredMethod(a7.getName(), a7.getParameterTypes());
                    if (!a9.isAnnotationPresent(SubscribeEvent.class)) continue;
                    Class[] a10 = a7.getParameterTypes();
                    Class a11 = a10[0];
                    Class372.Method409(a, a11, a2, a7, (ModContainer)a5);
                    continue block2;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                }
            }
        }
    }

    private static void Method409(EventBus a, Class a2, Object a3, Method a4, ModContainer a5) {
        try {
            int a6 = (Integer)ReflectionHelper.getPrivateValue(EventBus.class, (Object)a, (String[])new String[]{"busID"});
            ConcurrentHashMap a7 = (ConcurrentHashMap)ReflectionHelper.getPrivateValue(EventBus.class, (Object)a, (String[])new String[]{"listeners"});
            Constructor a8 = a2.getConstructor(new Class[0]);
            a8.setAccessible(true);
            Event a9 = (Event)a8.newInstance(new Object[0]);
            ASMEventHandler a10 = new ASMEventHandler(a3, a4, a5);
            a9.getListenerList().register(a6, a10.getPriority(), (IEventListener)a10);
            ArrayList a11 = (ArrayList)a7.get(a3);
            a11 = new ArrayList();
            a7.put(a3, (Object)a11);
            ReflectionHelper.setPrivateValue(EventBus.class, (Object)a, (Object)a7, (String[])new String[]{"listeners"});
            a11.Method2530((Object)a10);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static NoSuchMethodException Method410(NoSuchMethodException noSuchMethodException) {
        return noSuchMethodException;
    }
}