package trash.foodbyte.reflections;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import obfuscate.a;

public class ReflectionsHelper {
   private static a[] trash;

   public static MethodHandle Method332(Class a, String[] a, Class[] a) {
      Method a = ReflectionHelper.findMethod(a, (Object)null, a, a);

      try {
         return MethodHandles.lookup().unreflect(a);
      } catch (Exception var5) {
         throw new ReflectionHelper.UnableToFindMethodException(a, var5);
      }
   }

   public static MethodHandle Method333(Class a, String[] a) {
      Field a = ReflectionHelper.findField(a, a);

      try {
         return MethodHandles.lookup().unreflectGetter(a);
      } catch (Exception var4) {
         throw new ReflectionHelper.UnableToAccessFieldException(a, var4);
      }
   }

   public static MethodHandle Method334(Class a, String[] a) {
      trash();
      Field a = ReflectionHelper.findField(a, a);

      MethodHandle var10000;
      try {
         var10000 = MethodHandles.lookup().unreflectSetter(a);
      } catch (IllegalAccessException var5) {
         throw new ReflectionHelper.UnableToAccessFieldException(a, var5);
      }

      if (a.trash() == null) {
         trash(new a[1]);
      }

      return var10000;
   }

   public static void Method335(String a, String a, Object a, Object a, boolean a4) {
      Field a = ReflectionHelper.findField(a.getClass(), new String[]{a, a});
      a.setAccessible(true);

      try {
         Field a = Field.class.getDeclaredField("modifiers");
         a.setAccessible(true);
         a.setInt(a, a.getModifiers() & -17);
         a.set(a, a);
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public static void Method336(String a, String a, Class a, Object a, Object a, boolean a5) {
      Field a = ReflectionHelper.findField(a, new String[]{a, a});
      a.setAccessible(true);

      try {
         Field a = Field.class.getDeclaredField("modifiers");
         a.setAccessible(true);
         a.setInt(a, a.getModifiers() & -17);
         a.set(a, a);
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public static void setFinalField(Object a, String a, Object a, boolean a3) {
      try {
         Field a = ReflectionHelper.findField(a.getClass(), new String[]{a});
         a.setAccessible(true);
         Field a = Field.class.getDeclaredField("modifiers");
         a.setAccessible(true);
         a.setInt(a, a.getModifiers() & -17);
         a.set(a, a);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public static void Method338(Class a, Object a, Object a, boolean a3, String[] a) {
      Field a = ReflectionHelper.findField(a, a);
      a.setAccessible(true);

      try {
         Field a = Field.class.getDeclaredField("modifiers");
         a.setAccessible(true);
         a.setInt(a, a.getModifiers() & -17);
         a.set(a, a);
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public static Object Method339(String a, String a, Class a) {
      Field a = ReflectionHelper.findField(a, new String[]{a, a});
      a.setAccessible(true);

      try {
         return a.get(a);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static Object getFieldAsObject(Object object, String[] names) {
      Field a = ReflectionHelper.findField(object.getClass(), names);
      a.setAccessible(true);

      try {
         return a.get(object);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static Field getField(Class clazz, String[] names) {
      trash();
      Field[] var3 = clazz.getDeclaredFields();
      int var4 = var3.length;
      int var5 = 0;
      if (var5 < var4) {
         Field a = var3[var5];
         a.setAccessible(true);
         int var8 = names.length;
         int var9 = 0;
         if (var9 < var8) {
            String a = names[var9];
            if (a.getName().equals(a)) {
               return a;
            }

            ++var9;
            a.trash(new String[4]);
         }

         ++var5;
      }

      return null;
   }

   public static void trash(a[] trash) {
      trash = trash;
   }

   public static a[] trash() {
      return trash;
   }

   private static ReflectionHelper.UnableToFindMethodException trash(ReflectionHelper.UnableToFindMethodException trash) {
      return trash;
   }

   static {
      trash((a[])null);
   }
}
