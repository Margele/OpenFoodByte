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
      String var1 = "https://api.antisniper.net/denick?nick=" + a;
      System.err.println(var1);
      CloseableHttpClient var2 = HttpClients.createDefault();
      HttpGet var3 = new HttpGet(var1);
      var3.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
      var3.setHeader("xf-api-key", Field1732);
      String var4 = "null";

      try {
         CloseableHttpResponse var5 = var2.execute(var3);
         Throwable var6 = null;

         try {
            var4 = IOUtils.toString(var5.getEntity().getContent(), StandardCharsets.UTF_8);
         } catch (Throwable var16) {
            var6 = var16;
            throw var16;
         } finally {
            try {
               var5.close();
            } catch (Throwable var15) {
               var6.addSuppressed(var15);
            }

         }
      } catch (IOException var18) {
         var18.printStackTrace();
      }

      Gson var19 = new Gson();
      JsonObject var20 = (JsonObject)var19.fromJson(var4.trim(), JsonObject.class);
      var4 = var20.get("punishmentCategory").getAsString();
      return var4;
   }

   public static String Method677(String a, String a) {
      String var3 = "https://hypixel.net/api/players/" + a + "/ban/" + a.replace("#", "");
      RenderUtils.trash();
      System.err.println(var3);
      CloseableHttpClient var4 = HttpClients.createDefault();
      HttpGet var5 = new HttpGet(var3);
      var5.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
      var5.setHeader("xf-api-key", GlobalModule.Field3167);
      String var6 = "null";

      try {
         CloseableHttpResponse var7 = var4.execute(var5);
         Throwable var8 = null;

         try {
            var6 = IOUtils.toString(var7.getEntity().getContent(), StandardCharsets.UTF_8);
         } catch (Throwable var18) {
            var8 = var18;
            throw var18;
         } finally {
            try {
               var7.close();
            } catch (Throwable var17) {
               var8.addSuppressed(var17);
               var7.close();
            }

         }
      } catch (IOException var20) {
         var20.printStackTrace();
      }

      Gson var21 = new Gson();
      JsonObject var22 = (JsonObject)var21.fromJson(var6.trim(), JsonObject.class);
      var6 = var22.get("punishmentCategory").getAsString();
      if (var6.endsWith("hacks")) {
         var6 = "WATCHDOG";
      }

      if (var6.endsWith("other")) {
         var6 = "BLACKLISTED_MODIFICATIONS";
      }

      return var6;
   }

   private static Throwable Method678(Throwable throwable) {
      return throwable;
   }
}
