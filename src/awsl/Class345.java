/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.invoke.MethodHandle
 *  java.lang.invoke.MethodHandles
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 *  net.minecraftforge.fml.relauncher.ReflectionHelper$UnableToAccessFieldException
 *  net.minecraftforge.fml.relauncher.ReflectionHelper$UnableToFindMethodException
 */
package awsl;

import awsl.Class91;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

public class Class345 {
    private static Class91[] Field1659;

    public static MethodHandle Method332(Class a, String[] a2, Class[] a3) {
        Method a4 = ReflectionHelper.findMethod((Class)a, null, (String[])a2, (Class[])a3);
        try {
            return MethodHandles.lookup().unreflect(a4);
        }
        catch (Exception a5) {
            throw new ReflectionHelper.UnableToFindMethodException(a2, a5);
        }
    }

    public static MethodHandle Method333(Class a, String[] a2) {
        Field a3 = ReflectionHelper.findField((Class)a, (String[])a2);
        try {
            return MethodHandles.lookup().unreflectGetter(a3);
        }
        catch (Exception a4) {
            throw new ReflectionHelper.UnableToAccessFieldException(a2, a4);
        }
    }

    public static MethodHandle Method334(Class a, String[] a2) {
        MethodHandle methodHandle;
        Field a3 = ReflectionHelper.findField((Class)a, (String[])a2);
        Class91[] a4 = Class345.Method343();
        try {
            methodHandle = MethodHandles.lookup().unreflectSetter(a3);
        }
        catch (IllegalAccessException a5) {
            throw new ReflectionHelper.UnableToAccessFieldException(a2, (Exception)((Object)a5));
        }
        if (Class91.Method3648() == null) {
            Class345.Method342(new Class91[1]);
        }
        return methodHandle;
    }

    public static void Method335(String a, String a2, Object a3, Object a4, boolean a5) {
        Field a6 = ReflectionHelper.findField((Class)a3.getClass(), (String[])new String[]{a, a2});
        a6.setAccessible(true);
        try {
            Field a7 = Field.class.getDeclaredField("modifiers");
            a7.setAccessible(true);
            a7.setInt((Object)a6, a6.getModifiers() & 0xFFFFFFEF);
            a6.set(a3, a4);
        }
        catch (Exception a8) {
            a8.printStackTrace();
        }
    }

    public static void Method336(String a, String a2, Class a3, Object a4, Object a5, boolean a6) {
        Field a7 = ReflectionHelper.findField((Class)a3, (String[])new String[]{a, a2});
        a7.setAccessible(true);
        try {
            Field a8 = Field.class.getDeclaredField("modifiers");
            a8.setAccessible(true);
            a8.setInt((Object)a7, a7.getModifiers() & 0xFFFFFFEF);
            a7.set(a4, a5);
        }
        catch (Exception a9) {
            a9.printStackTrace();
        }
    }

    public static void Method337(Object a, String a2, Object a3, boolean a4) {
        try {
            Field a5 = ReflectionHelper.findField((Class)a.getClass(), (String[])new String[]{a2});
            a5.setAccessible(true);
            Field a6 = Field.class.getDeclaredField("modifiers");
            a6.setAccessible(true);
            a6.setInt((Object)a5, a5.getModifiers() & 0xFFFFFFEF);
            a5.set(a, a3);
        }
        catch (Exception a7) {
            a7.printStackTrace();
        }
    }

    public static void Method338(Class a, Object a2, Object a3, boolean a4, String[] a5) {
        Field a6 = ReflectionHelper.findField((Class)a, (String[])a5);
        a6.setAccessible(true);
        try {
            Field a7 = Field.class.getDeclaredField("modifiers");
            a7.setAccessible(true);
            a7.setInt((Object)a6, a6.getModifiers() & 0xFFFFFFEF);
            a6.set(a2, a3);
        }
        catch (Exception a8) {
            a8.printStackTrace();
        }
    }

    public static Object Method339(String a, String a2, Class a3) {
        Field a4 = ReflectionHelper.findField((Class)a3, (String[])new String[]{a, a2});
        a4.setAccessible(true);
        try {
            return a4.get((Object)a3);
        }
        catch (Exception a5) {
            a5.printStackTrace();
            return null;
        }
    }

    public static Object Method340(Object a, String[] a2) {
        Field a3 = ReflectionHelper.findField((Class)a.getClass(), (String[])a2);
        a3.setAccessible(true);
        try {
            return a3.get(a);
        }
        catch (Exception a4) {
            a4.printStackTrace();
            return null;
        }
    }

    public static Field Method341(Class a, String[] a2) {
        Field[] fieldArray = a.getDeclaredFields();
        int n = fieldArray.length;
        Class91[] a3 = Class345.Method343();
        int n2 = 0;
        if (n2 < n) {
            Field a4 = fieldArray[n2];
            a4.setAccessible(true);
            String[] stringArray = a2;
            int n3 = stringArray.length;
            int n4 = 0;
            if (n4 < n3) {
                String a5 = stringArray[n4];
                if (a4.getName().equals((Object)a5)) {
                    return a4;
                }
                ++n4;
                Class91.Method3647(new String[4]);
            }
            ++n2;
        }
        return null;
    }

    public static void Method342(Class91[] class91Array) {
        Field1659 = class91Array;
    }

    public static Class91[] Method343() {
        return Field1659;
    }

    private static ReflectionHelper.UnableToFindMethodException Method344(ReflectionHelper.UnableToFindMethodException unableToFindMethodException) {
        return unableToFindMethodException;
    }

    static {
        Class345.Method342(null);
    }
}