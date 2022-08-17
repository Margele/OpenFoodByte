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
      String a;
      String a;
      if (a.isSend() && a.getPacket() instanceof C01PacketChatMessage) {
         C01PacketChatMessage a = (C01PacketChatMessage)a.getPacket();
         if (Field2178.getValue() && a.getMessage().contains("fy-")) {
            a.setCancelled(true);
            a = Method2087(a.getMessage(), "", "fy-");
            a = Method2087(a.getMessage(), "fy-", "");
            this.Method2086(a, a);
         }
      }

      if (a.isRecieve() && a.getPacket() instanceof S02PacketChat) {
         S02PacketChat a = (S02PacketChat)a.getPacket();
         a = a.getChatComponent().getUnformattedText();
         if (this.Method2088(a.getChatComponent())) {
            a = Method2087(a.getChatComponent().getFormattedText(), "", ":");
            String a = Method2087(a, ": ", "");
            if (!this.Field2182.containsKey(a)) {
               this.Method2085(a, a);
            } else {
               a.setCancelled(true);
               Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(a.getChatComponent());
               ChatUtils.addChatMessageNoPrefix("§8[CT] " + a + ": §3" + (String)this.Field2182.getOrDefault(a, a));
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
      JsonObject a;
      switch (Field2176.getMode()) {
         case "Google":
            a = (new JsonParser()).parse(a).getAsJsonObject();
            return a.get("sentences").getAsJsonArray().get(0).getAsJsonObject().get("trans").getAsString();
         case "Bing":
            return a.replace("<string xmlns=\"http://schemas.microsoft.com/2003/10/Serialization/\">", "").replace("</string>", "");
         case "YouDao":
            a = (new JsonParser()).parse(a).getAsJsonObject();
            return a.get("translateResult").getAsJsonArray().get(0).getAsJsonArray().get(0).getAsJsonObject().get("tgt").getAsString();
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
      String a = "";
      int a;
      if (a.isEmpty()) {
         a = 0;
      } else {
         a = a.indexOf(a);
         if (a > -1) {
            a += a.length();
         } else {
            a = 0;
         }
      }

      int a = a.indexOf(a, a);
      if (a.isEmpty()) {
         a = a.length();
      }

      a = a.substring(a, a);
      return a;
   }

   private boolean Method2088(IChatComponent a) {
      String a = a.getFormattedText();
      if (Field2179.getValue() && a.startsWith("§r§9") && a.contains(":") && a.contains(">")) {
         return true;
      } else if (Field2181.getValue() && a.startsWith("§r§2Guild") && a.contains(":") && a.contains(">")) {
         return true;
      } else {
         return Field2180.getValue() && a.startsWith("§d") && a.contains(":") && (a.contains("From") || a.contains("To"));
      }
   }

   private void Method2089(String a, String a) {
      a[] a = Class448.trash();

      try {
         CloseableHttpClient a = HttpClients.createDefault();
         URL a = new URL(this.Method2082(a));
         URI a = new URI(a.getProtocol(), a.getUserInfo(), a.getHost(), a.getPort(), a.getPath(), a.getQuery(), a.getRef());
         String a = a.toString();
         HttpGet a = new HttpGet(a);
         a.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
         String a = "null";

         try {
            CloseableHttpResponse a = a.execute(a);
            Throwable var11 = null;

            try {
               a = IOUtils.toString(a.getEntity().getContent(), StandardCharsets.UTF_8);
            } catch (Throwable var22) {
               var11 = var22;
               throw var22;
            } finally {
               try {
                  a.close();
               } catch (Throwable var21) {
                  var11.addSuppressed(var21);
                  a.close();
               }

            }
         } catch (IOException var24) {
            var24.printStackTrace();
         }

         String a = this.Method2083(a);
         Wrapper.INSTANCE.sendPacket(new C01PacketChatMessage(a + a));
         this.Field2182.put(a, a + a);
      } catch (Exception var25) {
         var25.printStackTrace();
         Wrapper.INSTANCE.sendPacket(new C01PacketChatMessage(a + a));
      }

   }

   private void Method2090(String a, String a) {
      a[] a = Class448.trash();

      try {
         CloseableHttpClient a = HttpClients.createDefault();
         URL a = new URL(this.Method2082(a));
         URI a = new URI(a.getProtocol(), a.getUserInfo(), a.getHost(), a.getPort(), a.getPath(), a.getQuery(), a.getRef());
         String a = a.toString();
         HttpGet a = new HttpGet(a);
         a.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
         String a = "null";

         try {
            CloseableHttpResponse a = a.execute(a);
            Throwable var11 = null;

            try {
               a = IOUtils.toString(a.getEntity().getContent(), StandardCharsets.UTF_8);
            } catch (Throwable var22) {
               var11 = var22;
               throw var22;
            } finally {
               try {
                  a.close();
               } catch (Throwable var21) {
                  var11.addSuppressed(var21);
                  a.close();
               }

            }
         } catch (IOException var24) {
            var24.printStackTrace();
         }

         String a = this.Method2083(a);
         ChatUtils.addChatMessageNoPrefix("§8[CT] " + a + ": §3" + a);
         this.Field2182.put(a, a);
      } catch (Exception var25) {
         var25.printStackTrace();
         ChatUtils.addChatMessageNoPrefix(a);
      }

   }

   private static Throwable Method2091(Throwable throwable) {
      return throwable;
   }
}
