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
package trash.foodbyte.reflections;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import obfuscate.a;

public class ReflectionsHelper {
    private static a[] trash;

    public static MethodHandle Method332(Class a2, String[] a3, Class[] a4) {
        Method a5 = ReflectionHelper.findMethod((Class)a2, null, (String[])a3, (Class[])a4);
        try {
            return MethodHandles.lookup().unreflect(a5);
        }
        catch (Exception a6) {
            throw new ReflectionHelper.UnableToFindMethodException(a3, a6);
        }
    }

    public static MethodHandle Method333(Class a2, String[] a3) {
        Field a4 = ReflectionHelper.findField((Class)a2, (String[])a3);
        try {
            return MethodHandles.lookup().unreflectGetter(a4);
        }
        catch (Exception a5) {
            throw new ReflectionHelper.UnableToAccessFieldException(a3, a5);
        }
    }

    public static MethodHandle Method334(Class a2, String[] a3) {
        MethodHandle methodHandle;
        Field a4 = ReflectionHelper.findField((Class)a2, (String[])a3);
        a[] a5 = ReflectionsHelper.trash();
        try {
            methodHandle = MethodHandles.lookup().unreflectSetter(a4);
        }
        catch (IllegalAccessException a6) {
            throw new ReflectionHelper.UnableToAccessFieldException(a3, (Exception)((Object)a6));
        }
        if (a.trash() == null) {
            ReflectionsHelper.trash(new a[1]);
        }
        return methodHandle;
    }

    public static void Method335(String a2, String a3, Object a4, Object a5, boolean a6) {
        Field a7 = ReflectionHelper.findField((Class)a4.getClass(), (String[])new String[]{a2, a3});
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

    public static void Method336(String a2, String a3, Class a4, Object a5, Object a6, boolean a7) {
        Field a8 = ReflectionHelper.findField((Class)a4, (String[])new String[]{a2, a3});
        a8.setAccessible(true);
        try {
            Field a9 = Field.class.getDeclaredField("modifiers");
            a9.setAccessible(true);
            a9.setInt((Object)a8, a8.getModifiers() & 0xFFFFFFEF);
            a8.set(a5, a6);
        }
        catch (Exception a10) {
            a10.printStackTrace();
        }
    }

    public static void setFinalField(Object a2, String a3, Object a4, boolean a5) {
        try {
            Field a6 = ReflectionHelper.findField((Class)a2.getClass(), (String[])new String[]{a3});
            a6.setAccessible(true);
            Field a7 = Field.class.getDeclaredField("modifiers");
            a7.setAccessible(true);
            a7.setInt((Object)a6, a6.getModifiers() & 0xFFFFFFEF);
            a6.set(a2, a4);
        }
        catch (Exception a8) {
            a8.printStackTrace();
        }
    }

    public static void Method338(Class a2, Object a3, Object a4, boolean a5, String[] a6) {
        Field a7 = ReflectionHelper.findField((Class)a2, (String[])a6);
        a7.setAccessible(true);
        try {
            Field a8 = Field.class.getDeclaredField("modifiers");
            a8.setAccessible(true);
            a8.setInt((Object)a7, a7.getModifiers() & 0xFFFFFFEF);
            a7.set(a3, a4);
        }
        catch (Exception a9) {
            a9.printStackTrace();
        }
    }

    public static Object Method339(String a2, String a3, Class a4) {
        Field a5 = ReflectionHelper.findField((Class)a4, (String[])new String[]{a2, a3});
        a5.setAccessible(true);
        try {
            return a5.get((Object)a4);
        }
        catch (Exception a6) {
            a6.printStackTrace();
            return null;
        }
    }

    public static Object getFieldAsObject(Object object, String[] names) {
        Field a2 = ReflectionHelper.findField((Class)object.getClass(), (String[])names);
        a2.setAccessible(true);
        try {
            return a2.get(object);
        }
        catch (Exception a3) {
            a3.printStackTrace();
            return null;
        }
    }

    public static Field getField(Class clazz, String[] names) {
        Field[] fieldArray = clazz.getDeclaredFields();
        int n = fieldArray.length;
        a[] a2 = ReflectionsHelper.trash();
        int n2 = 0;
        if (n2 < n) {
            Field a3 = fieldArray[n2];
            a3.setAccessible(true);
            String[] stringArray = names;
            int n3 = stringArray.length;
            int n4 = 0;
            if (n4 < n3) {
                String a4 = stringArray[n4];
                if (a3.getName().equals((Object)a4)) {
                    return a3;
                }
                ++n4;
                a.trash(new String[4]);
            }
            ++n2;
        }
        return null;
    }

    public static void trash(a[] aArray) {
        trash = aArray;
    }

    public static a[] trash() {
        return trash;
    }

    private static ReflectionHelper.UnableToFindMethodException trash(ReflectionHelper.UnableToFindMethodException unableToFindMethodException) {
        return unableToFindMethodException;
    }

    static {
        ReflectionsHelper.trash(null);
    }
}