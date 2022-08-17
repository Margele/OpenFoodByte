package trash.foodbyte.module.impl.world;

import awsl.Class448;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import eventapi.EventTarget;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.IChatComponent;
import obfuscate.a;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ModeValue;

public class ChatTranslator extends Module {
   public static ModeValue Field2176 = new ModeValue("ChatTranslator", "Translator API", "YouDao", new String[]{"YouDao"}, "{有道翻译}");
   public static ModeValue Field2177 = new ModeValue("ChatTranslator", "Language", "Chinese", new String[]{"Chinese", "English"}, "{中文,英文}");
   public static BooleanValue Field2178 = new BooleanValue("ChatTranslator", "Send Translator", true, "聊天框输入fy-“内容”自动发出翻译fy-后面的文字");
   public static BooleanValue Field2179 = new BooleanValue("ChatTranslator", "Party", true, "翻译组队对话");
   public static BooleanValue Field2180 = new BooleanValue("ChatTranslator", "Msg", true, "翻译私聊对话");
   public static BooleanValue Field2181 = new BooleanValue("ChatTranslator", "Guild", true, "翻译公会对话");
   private HashMap Field2182 = new HashMap();

   public ChatTranslator() {
      super("ChatTranslator", "Chat Translator", Category.WORLD);
      this.setDescription("聊天栏翻译");
   }

   @EventTarget(0)
   public void Method273(EventPacket a) {
      String var3;
      String var4;
      if (a.isSend() && a.getPacket() instanceof C01PacketChatMessage) {
         C01PacketChatMessage var2 = (C01PacketChatMessage)a.getPacket();
         if (Field2178.getValue() && var2.getMessage().contains("fy-")) {
            a.setCancelled(true);
            var3 = Method2087(var2.getMessage(), "", "fy-");
            var4 = Method2087(var2.getMessage(), "fy-", "");
            this.Method2086(var3, var4);
         }
      }

      if (a.isRecieve() && a.getPacket() instanceof S02PacketChat) {
         S02PacketChat var6 = (S02PacketChat)a.getPacket();
         var3 = var6.getChatComponent().getUnformattedText();
         if (this.Method2088(var6.getChatComponent())) {
            var4 = Method2087(var6.getChatComponent().getFormattedText(), "", ":");
            String var5 = Method2087(var3, ": ", "");
            if (!this.Field2182.containsKey(var5)) {
               this.Method2085(var4, var5);
            } else {
               a.setCancelled(true);
               Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(var6.getChatComponent());
               ChatUtils.addChatMessageNoPrefix("§8[CT] " + var4 + ": §3" + (String)this.Field2182.getOrDefault(var5, var5));
            }
         }
      }

   }

   private String Method2082(String a) {
      switch (Field2176.getMode()) {
         case "Google":
            return "https://translate.google.cn/translate_a/single?client=gtx&dt=t&dj=1&ie=UTF-8&sl=auto&tl=" + (Field2177.isCurrentMode("chinese") ? "zh_cn" : "en_us") + "&q=" + a;
         case "Bing":
            return "https://api.microsofttranslator.com/v2/Http.svc/Translate?appId=A4D660A48A6A97CCA791C34935E4C02BBB1BEC1C&from=&to=" + (Field2177.isCurrentMode("chinese") ? "zh" : "en") + "&text=" + a;
         case "YouDao":
            return "https://fanyi.youdao.com/translate?&doctype=json&type=AUTO&i=" + a;
         default:
            return "";
      }
   }

   private String Method2083(String a) {
      JsonObject var4;
      switch (Field2176.getMode()) {
         case "Google":
            var4 = (new JsonParser()).parse(a).getAsJsonObject();
            return var4.get("sentences").getAsJsonArray().get(0).getAsJsonObject().get("trans").getAsString();
         case "Bing":
            return a.replace("<string xmlns=\"http://schemas.microsoft.com/2003/10/Serialization/\">", "").replace("</string>", "");
         case "YouDao":
            var4 = (new JsonParser()).parse(a).getAsJsonObject();
            return var4.get("translateResult").getAsJsonArray().get(0).getAsJsonArray().get(0).getAsJsonObject().get("tgt").getAsString();
         default:
            return "WRONG VALUE";
      }
   }

   private void Method2085(String a, String a) {
      (new Thread(this::Method2090)).start();
   }

   private void Method2086(String a, String a) {
      (new Thread(this::Method2089)).start();
   }

   public static String Method2087(String a, String a, String a) {
      String var3 = "";
      int var4;
      if (a.isEmpty()) {
         var4 = 0;
      } else {
         var4 = a.indexOf(a);
         if (var4 > -1) {
            var4 += a.length();
         } else {
            var4 = 0;
         }
      }

      int var5 = a.indexOf(a, var4);
      if (a.isEmpty()) {
         var5 = a.length();
      }

      var3 = a.substring(var4, var5);
      return var3;
   }

   private boolean Method2088(IChatComponent a) {
      String var2 = a.getFormattedText();
      if (Field2179.getValue() && var2.startsWith("§r§9") && var2.contains(":") && var2.contains(">")) {
         return true;
      } else if (Field2181.getValue() && var2.startsWith("§r§2Guild") && var2.contains(":") && var2.contains(">")) {
         return true;
      } else {
         return Field2180.getValue() && var2.startsWith("§d") && var2.contains(":") && (var2.contains("From") || var2.contains("To"));
      }
   }

   private void Method2089(String a, String a) {
      a[] var3 = Class448.trash();

      try {
         CloseableHttpClient var4 = HttpClients.createDefault();
         URL var5 = new URL(this.Method2082(a));
         URI var6 = new URI(var5.getProtocol(), var5.getUserInfo(), var5.getHost(), var5.getPort(), var5.getPath(), var5.getQuery(), var5.getRef());
         String var7 = var6.toString();
         HttpGet var8 = new HttpGet(var7);
         var8.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
         String var9 = "null";

         try {
            CloseableHttpResponse var10 = var4.execute(var8);
            Throwable var11 = null;

            try {
               var9 = IOUtils.toString(var10.getEntity().getContent(), StandardCharsets.UTF_8);
            } catch (Throwable var22) {
               var11 = var22;
               throw var22;
            } finally {
               try {
                  var10.close();
               } catch (Throwable var21) {
                  var11.addSuppressed(var21);
                  var10.close();
               }

            }
         } catch (IOException var24) {
            var24.printStackTrace();
         }

         String var26 = this.Method2083(var9);
         Wrapper.INSTANCE.sendPacket(new C01PacketChatMessage(a + var26));
         this.Field2182.put(a, a + var26);
      } catch (Exception var25) {
         var25.printStackTrace();
         Wrapper.INSTANCE.sendPacket(new C01PacketChatMessage(a + a));
      }

   }

   private void Method2090(String a, String a) {
      a[] var3 = Class448.trash();

      try {
         CloseableHttpClient var4 = HttpClients.createDefault();
         URL var5 = new URL(this.Method2082(a));
         URI var6 = new URI(var5.getProtocol(), var5.getUserInfo(), var5.getHost(), var5.getPort(), var5.getPath(), var5.getQuery(), var5.getRef());
         String var7 = var6.toString();
         HttpGet var8 = new HttpGet(var7);
         var8.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
         String var9 = "null";

         try {
            CloseableHttpResponse var10 = var4.execute(var8);
            Throwable var11 = null;

            try {
               var9 = IOUtils.toString(var10.getEntity().getContent(), StandardCharsets.UTF_8);
            } catch (Throwable var22) {
               var11 = var22;
               throw var22;
            } finally {
               try {
                  var10.close();
               } catch (Throwable var21) {
                  var11.addSuppressed(var21);
                  var10.close();
               }

            }
         } catch (IOException var24) {
            var24.printStackTrace();
         }

         String var26 = this.Method2083(var9);
         ChatUtils.addChatMessageNoPrefix("§8[CT] " + a + ": §3" + var26);
         this.Field2182.put(a, var26);
      } catch (Exception var25) {
         var25.printStackTrace();
         ChatUtils.addChatMessageNoPrefix(a);
      }

   }

   private static Throwable Method2091(Throwable throwable) {
      return throwable;
   }
}
