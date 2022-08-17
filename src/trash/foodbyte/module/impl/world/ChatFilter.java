package trash.foodbyte.module.impl.world;

import awsl.Class448;
import eventapi.EventTarget;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import net.minecraft.network.play.client.C01PacketChatMessage;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ReflectionsHelper;
import trash.foodbyte.value.ModeValue;

public class ChatFilter extends Module {
   public ModeValue Field2183 = new ModeValue("ChatFilter", "Filter Mode", "Insert", new String[]{"Insert"}, "模式{Insert}");
   private int Field2184 = 0;

   public ChatFilter() {
      super("ChatFilter", "Chat Filter", Category.WORLD);
   }

   public String getDescription() {
      return "聊天绕过(支持刷屏+骂人)";
   }

   @EventTarget
   public void Method755(EventTick a) {
      this.setDisplayTag(this.Field2183.getMode());
   }

   @EventTarget
   public void Method273(EventPacket a) {
      a[] var2 = Class448.trash();
      if (a.getPacket() instanceof C01PacketChatMessage) {
         C01PacketChatMessage var3 = (C01PacketChatMessage)a.getPacket();
         String var4 = var3.getMessage();
         String[] var5 = var4.split(" ");
         String var6 = var5[0];
         if (var4.startsWith("/") && Stream.of("/r", "/shout", "/msg", "/m", "/tell", "/whisper", "/w", "/ac", "/pc", "/gc").anyMatch(var6::equalsIgnoreCase)) {
            if (Stream.of("/r", "/shout", "/ac", "/pc", "/gc").anyMatch(var6::equalsIgnoreCase)) {
               ReflectionsHelper.setFinalField(var3, ObfuscatedField.chatmessage.getObfuscatedName(), var5[0] + " " + this.Method2083(String.join(" ", (CharSequence[])Arrays.copyOfRange(var5, 1, var5.length))), false);
            }

            if (var5.length > 1) {
               ReflectionsHelper.setFinalField(var3, ObfuscatedField.chatmessage.getObfuscatedName(), var5[0] + " " + var5[1] + " " + this.Method2083(String.join(" ", (CharSequence[])Arrays.copyOfRange(var5, 2, var5.length))), false);
            }
         }

         if (!var3.getMessage().startsWith("/") && !var3.getMessage().startsWith(".") && !var3.getMessage().startsWith("http") && !var4.equalsIgnoreCase("gg") && !var4.equalsIgnoreCase("good game")) {
            ReflectionsHelper.setFinalField(var3, ObfuscatedField.chatmessage.getObfuscatedName(), this.Method2083(var4), false);
         }
      }

   }

   private String Method2082(String a) {
      StringBuilder var2 = new StringBuilder();
      char[] var3 = a.toCharArray();
      char[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var4[var6];
         var2.append(var7).append('\u05fc');
      }

      return var2.toString();
   }

   private String Method2083(String a) {
      Class448.trash();
      StringBuilder var3 = new StringBuilder();
      char[] var4 = a.toCharArray();
      int var5 = var4.length;
      int var6 = 0;
      if (var6 < var5) {
         char var7 = var4[var6];
         if (var7 >= '!') {
            ++this.Field2184;
            var3.append(var7).append(this.Method2084());
         }

         var3.append(var7);
         ++var6;
      }

      return var3.toString();
   }

   private String Method2084() {
      this.Field2184 = ThreadLocalRandom.current().nextInt(10);
      switch (this.Field2184) {
         case 0:
            return "\u0379";
         case 1:
            return "\u0378";
         case 2:
            return "\u0381";
         case 3:
            return "\u0379";
         case 4:
            return "\u0382";
         case 5:
            return "\u0882";
         case 6:
            return "\u0887";
         case 7:
            return "\u0895";
         case 8:
            return "\u0898";
         case 9:
            return "\u0899";
         case 10:
            return "\u0383";
         default:
            if (this.Field2184 > 11) {
               this.Field2184 = 0;
            }

            return "\u0897";
      }
   }
}
