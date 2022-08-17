package awsl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import trash.foodbyte.module.GlobalModule;

public class Class269 {
   private static File Field1464;
   private static final Gson Field1465 = (new GsonBuilder()).setPrettyPrinting().create();

   Class269(File a) {
      Field1464 = new File(a + File.separator + "waypoints.json");
   }

   public void Method2864() {
      try {
         if (!Field1464.exists()) {
            Field1464.createNewFile();
            this.Method2866();
            return;
         }

         this.Method2865();
      } catch (IOException var2) {
      }

   }

   public void Method2865() {
      int var1 = Class259.Method2273();

      try {
         FileReader var2 = new FileReader(Field1464);
         Throwable var3 = null;

         try {
            GlobalModule.INSTANCE.Method2009().Method2264((ArrayList)Field1465.fromJson(var2, (new Class629(this)).getType()));
            if (GlobalModule.INSTANCE.Method2009().Method2265() == null) {
               GlobalModule.INSTANCE.Method2009().Method2264(new ArrayList());
            }
         } catch (Throwable var13) {
            var3 = var13;
            throw var13;
         } finally {
            try {
               var2.close();
            } catch (Throwable var12) {
               var3.addSuppressed(var12);
               var2.close();
            }

         }
      } catch (Exception var15) {
      }

   }

   public void Method2866() {
      int var1 = Class259.Method2273();
      if (Field1464.exists()) {
         try {
            PrintWriter var2 = new PrintWriter(Field1464);
            Throwable var3 = null;

            try {
               var2.print(Field1465.toJson(GlobalModule.INSTANCE.Method2009().Method2265()));
            } catch (Throwable var13) {
               var3 = var13;
               throw var13;
            } finally {
               try {
                  var2.close();
               } catch (Throwable var12) {
                  var3.addSuppressed(var12);
                  var2.close();
               }

            }
         } catch (Exception var15) {
         }
      }

   }

   private static Throwable Method2867(Throwable throwable) {
      return throwable;
   }
}
