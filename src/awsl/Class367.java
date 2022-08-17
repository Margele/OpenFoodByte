package awsl;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;

public class Class367 {
   public static String Field1732 = "6ca3ac79-2046-4016-8754-c7f91a2d0228";

   public static String Method676(String a) {
      String a = "https://api.antisniper.net/denick?nick=" + a;
      System.err.println(a);
      CloseableHttpClient a = HttpClients.createDefault();
      HttpGet a = new HttpGet(a);
      a.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
      a.setHeader("xf-api-key", Field1732);
      String a = "null";

      try {
         CloseableHttpResponse a = a.execute(a);
         Throwable var6 = null;

         try {
            a = IOUtils.toString(a.getEntity().getContent(), StandardCharsets.UTF_8);
         } catch (Throwable var16) {
            var6 = var16;
            throw var16;
         } finally {
            try {
               a.close();
            } catch (Throwable var15) {
               var6.addSuppressed(var15);
            }

         }
      } catch (IOException var18) {
         var18.printStackTrace();
      }

      Gson a = new Gson();
      JsonObject a = (JsonObject)a.fromJson(a.trim(), JsonObject.class);
      a = a.get("punishmentCategory").getAsString();
      return a;
   }

   public static String Method677(String a, String a) {
      String a = "https://hypixel.net/api/players/" + a + "/ban/" + a.replace("#", "");
      RenderUtils.trash();
      System.err.println(a);
      CloseableHttpClient a = HttpClients.createDefault();
      HttpGet a = new HttpGet(a);
      a.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
      a.setHeader("xf-api-key", GlobalModule.Field3167);
      String a = "null";

      try {
         CloseableHttpResponse a = a.execute(a);
         Throwable var8 = null;

         try {
            a = IOUtils.toString(a.getEntity().getContent(), StandardCharsets.UTF_8);
         } catch (Throwable var18) {
            var8 = var18;
            throw var18;
         } finally {
            try {
               a.close();
            } catch (Throwable var17) {
               var8.addSuppressed(var17);
               a.close();
            }

         }
      } catch (IOException var20) {
         var20.printStackTrace();
      }

      Gson a = new Gson();
      JsonObject a = (JsonObject)a.fromJson(a.trim(), JsonObject.class);
      a = a.get("punishmentCategory").getAsString();
      if (a.endsWith("hacks")) {
         a = "WATCHDOG";
      }

      if (a.endsWith("other")) {
         a = "BLACKLISTED_MODIFICATIONS";
      }

      return a;
   }

   private static Throwable Method678(Throwable throwable) {
      return throwable;
   }
}
