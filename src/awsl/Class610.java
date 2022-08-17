package awsl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class610 {
   private static Class610 Field2854 = new Class610();
   private Map Field2855 = new HashMap();
   private Map Field2856 = new HashMap();

   public static Class610 Method3753() {
      return Field2854;
   }

   public Class610() {
      this.Field2855 = new HashMap();
      this.Field2856 = new HashMap();
      this.Method3755(0, Class546.class, Class733.LOGIN);
      this.Method3755(1, Class548.class, Class733.PLAY);
      this.Method3755(2, Class538.class, Class733.PLAY);
      this.Method3755(3, Class613.class, Class733.PLAY);
      this.Method3755(4, Class550.class, Class733.PLAY);
      this.Method3755(5, Class544.class, Class733.PLAY);
      this.Method3755(6, Class542.class, Class733.PLAY);
      this.Method3755(7, Class540.class, Class733.PLAY);
      this.Method3755(100, Class531.class, Class733.PLAY);
      this.Method3755(101, Class552.class, Class733.PLAY);
      this.Method3755(102, Class521.class, Class733.PLAY);
      this.Method3755(103, Class534.class, Class733.PLAY);
      this.Method3755(104, Class562.class, Class733.PLAY);
      this.Method3755(105, Class523.class, Class733.PLAY);
      this.Method3755(106, Class527.class, Class733.PLAY);
      this.Method3755(107, Class525.class, Class733.PLAY);
      this.Method3755(108, Class529.class, Class733.PLAY);
      this.Method3755(109, Class536.class, Class733.PLAY);
   }

   public Map Method3754() {
      return this.Field2856;
   }

   private void Method3755(int a, Class a, Class733 a) {
      try {
         a.newInstance();
         this.Field2856.put(a, a);
         this.Field2855.put(a, a);
      } catch (Exception var5) {
      }

   }

   public Class609 Method3756(int a) throws IllegalAccessException, InstantiationException {
      if (!this.Field2856.containsKey(a)) {
         throw new RuntimeException("Packet with id " + a + " is not registered.");
      } else {
         return (Class609)((Class)this.Field2856.Method2665(a)).newInstance();
      }
   }

   public int Method3757(Class609 a) {
      Class234.Method1269();
      Iterator var3 = this.Field2856.Method2663().Method1383();
      if (var3.Method932()) {
         Map.Entry a = (Map.Entry)var3.Method933();
         Class a = (Class)a.getValue();
         if (a.isInstance(a)) {
            return (Integer)a.getKey();
         }
      }

      throw new RuntimeException("Packet " + a + " is not registered.");
   }

   private static Exception Method3758(Exception exception) {
      return exception;
   }
}
