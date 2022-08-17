package awsl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Class259 {
   private ArrayList Field1416 = new ArrayList();
   private final Gson Field1417 = (new GsonBuilder()).setPrettyPrinting().create();
   private File Field1418;
   private static int Field1419;

   public Class259(File a) {
      this.Field1418 = new File(a + File.separator + "waypoints.json");
      this.Method2260();
   }

   public void Method2259() {
      if (this.Field1418 != null) {
         try {
            if (!this.Field1418.exists()) {
               this.Field1418.createNewFile();
            }

            PrintWriter var1 = new PrintWriter(this.Field1418);
            var1.write(this.Field1417.toJson(this.Method2261()));
            var1.close();
         } catch (IOException var2) {
         }

      }
   }

   public void Method2260() {
      if (!this.Field1418.exists()) {
         this.Method2259();
      } else {
         try {
            JsonObject var1 = (new JsonParser()).parse(new FileReader(this.Field1418)).getAsJsonObject();
            this.Method2262(var1);
         } catch (IOException var2) {
         }

      }
   }

   public JsonObject Method2261() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();
      this.Method2265().forEach(Class259::Method2270);
      var1.add("waypoints", var2);
      return var1;
   }

   public void Method2262(JsonObject a) {
      JsonArray var2 = a.get("waypoints").getAsJsonArray();
      var2.forEach(this::Method2269);
   }

   private Class260 Method2263(String a, String a) {
      Method2272();
      Iterator var4 = this.Field1416.Method1383();
      if (var4.Method932()) {
         Class260 var5 = (Class260)var4.Method933();
         if (var5.Method2835().equalsIgnoreCase(a) && var5.Method2836().equals(a)) {
            return var5;
         }
      }

      return null;
   }

   void Method2264(ArrayList a) {
      this.Field1416 = a;
   }

   public ArrayList Method2265() {
      return this.Field1416;
   }

   public void Method2266(String a, double a, double a, double a, String a, int a) {
      this.Field1416.Method2530(new Class260(a, a, a, a, a, a));
   }

   public void Method2267(String a, String a) {
      Class260 var3 = this.Method2263(a, a);
      this.Field1416.remove(var3);
   }

   public boolean Method2268(String a, String a) {
      return this.Method2263(a, a) != null;
   }

   private void Method2269(JsonElement a) {
      JsonObject var2 = (JsonObject)a;
      Class260 var3 = new Class260();
      var3.Method2842(var2);
      this.Method2265().Method2530(var3);
   }

   private static void Method2270(JsonArray a, Class260 a) {
      a.add(a.Method2841());
   }

   public static void Method2271(int integer) {
      Field1419 = integer;
   }

   public static int Method2272() {
      return Field1419;
   }

   public static int Method2273() {
      int var0 = Method2272();
      return 76;
   }

   private static IOException Method2274(IOException iOException) {
      return iOException;
   }

   static {
      Method2271(0);
   }
}
