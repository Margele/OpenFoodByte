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
      Method var3 = ReflectionHelper.findMethod(a, (Object)null, a, a);

      try {
         return MethodHandles.lookup().unreflect(var3);
      } catch (Exception var5) {
         throw new ReflectionHelper.UnableToFindMethodException(a, var5);
      }
   }

   public static MethodHandle Method333(Class a, String[] a) {
      Field var2 = ReflectionHelper.findField(a, a);

      try {
         return MethodHandles.lookup().unreflectGetter(var2);
      } catch (Exception var4) {
         throw new ReflectionHelper.UnableToAccessFieldException(a, var4);
      }
   }

   public static MethodHandle Method334(Class a, String[] a) {
      trash();
      Field var3 = ReflectionHelper.findField(a, a);

      MethodHandle var10000;
      try {
         var10000 = MethodHandles.lookup().unreflectSetter(var3);
      } catch (IllegalAccessException var5) {
         throw new ReflectionHelper.UnableToAccessFieldException(a, var5);
      }

      if (a.trash() == null) {
         trash(new a[1]);
      }

      return var10000;
   }

   public static void Method335(String a, String a, Object a, Object a, boolean a) {
      Field var5 = ReflectionHelper.findField(a.getClass(), new String[]{a, a});
      var5.setAccessible(true);

      try {
         Field var6 = Field.class.getDeclaredField("modifiers");
         var6.setAccessible(true);
         var6.setInt(var5, var5.getModifiers() & -17);
         var5.set(a, a);
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public static void Method336(String a, String a, Class a, Object a, Object a, boolean a) {
      Field var6 = ReflectionHelper.findField(a, new String[]{a, a});
      var6.setAccessible(true);

      try {
         Field var7 = Field.class.getDeclaredField("modifiers");
         var7.setAccessible(true);
         var7.setInt(var6, var6.getModifiers() & -17);
         var6.set(a, a);
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public static void setFinalField(Object a, String a, Object a, boolean a) {
      try {
         Field var4 = ReflectionHelper.findField(a.getClass(), new String[]{a});
         var4.setAccessible(true);
         Field var5 = Field.class.getDeclaredField("modifiers");
         var5.setAccessible(true);
         var5.setInt(var4, var4.getModifiers() & -17);
         var4.set(a, a);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public static void Method338(Class a, Object a, Object a, boolean a, String[] a) {
      Field var5 = ReflectionHelper.findField(a, a);
      var5.setAccessible(true);

      try {
         Field var6 = Field.class.getDeclaredField("modifiers");
         var6.setAccessible(true);
         var6.setInt(var5, var5.getModifiers() & -17);
         var5.set(a, a);
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public static Object Method339(String a, String a, Class a) {
      Field var3 = ReflectionHelper.findField(a, new String[]{a, a});
      var3.setAccessible(true);

      try {
         return var3.get(a);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static Object getFieldAsObject(Object object, String[] names) {
      Field var2 = ReflectionHelper.findField(object.getClass(), names);
      var2.setAccessible(true);

      try {
         return var2.get(object);
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
         Field var6 = var3[var5];
         var6.setAccessible(true);
         int var8 = names.length;
         int var9 = 0;
         if (var9 < var8) {
            String var10 = names[var9];
            if (var6.getName().equals(var10)) {
               return var6;
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
