package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Class207 {
   private String Field1178;
   private List Field1179 = new ArrayList();
   private List Field1180 = new ArrayList();
   private HashMap Field1181 = new HashMap();
   private List Field1182 = new ArrayList();
   private static String[] Field1183;

   public Class207(String a) {
      this.Field1178 = a;
   }

   public String Method2419() {
      return this.Field1178;
   }

   public List Method2420() {
      return this.Field1179;
   }

   public List Method2421() {
      return this.Field1180;
   }

   public HashMap Method2422() {
      return this.Field1181;
   }

   public List Method2423() {
      return this.Field1182;
   }

   public void Method2424(String a) {
      this.Field1178 = a;
   }

   public void Method2425(List a) {
      this.Field1179 = a;
   }

   public void Method2426(List a) {
      this.Field1180 = a;
   }

   public void Method2427(HashMap a) {
      this.Field1181 = a;
   }

   public void Method2428(List a) {
      this.Field1182 = a;
   }

   public boolean Method2429(Object a) {
      String[] var2 = Method2434();
      if (a == this) {
         return true;
      } else if (!(a instanceof Class207)) {
         return false;
      } else {
         Class207 var3 = (Class207)a;
         if (!var3.Method2430(this)) {
            return false;
         } else {
            String var4 = this.Method2419();
            String var5 = var3.Method2419();
            if (var4.Method3429(var5)) {
               ;
            }

            return false;
         }
      }
   }

   protected boolean Method2430(Object a) {
      return a instanceof Class207;
   }

   public int Method2431() {
      boolean var1 = true;
      int var2 = 1;
      String var3 = this.Method2419();
      var2 = var2 * 59 + 43;
      List var4 = this.Method2420();
      var2 = var2 * 59 + 43;
      List var5 = this.Method2421();
      var2 = var2 * 59 + 43;
      HashMap var6 = this.Method2422();
      var2 = var2 * 59 + 43;
      List var7 = this.Method2423();
      var2 = var2 * 59 + 43;
      return var2;
   }

   public String Method2432() {
      return "Preset(name=" + this.Method2419() + ", activatedModules=" + this.Method2420() + ", banModules=" + this.Method2421() + ", bindMap=" + this.Method2422() + ", settings=" + this.Method2423() + ")";
   }

   public static void Method2433(String[] arr) {
      Field1183 = arr;
   }

   public static String[] Method2434() {
      return Field1183;
   }

   static {
      Method2433(new String[5]);
   }
}
