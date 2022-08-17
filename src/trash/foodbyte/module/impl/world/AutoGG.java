package trash.foodbyte.module.impl.world;

import awsl.Class448;
import eventapi.EventTarget;
import java.util.Arrays;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class AutoGG extends Module {
   private final String[] Field2172;
   private final String[] Field2173;
   private int Field2174;

   public AutoGG() {
      Class448.trash();
      super("AutoGG", "Auto GG", Category.WORLD);
      this.Field2172 = new String[]{"1st Killer - ", "1st Place - ", "Winner: ", " - Melee Accuracy - ", "1st - ", "Winning Team - ", "Winners: ", "Winner: ", "Winning Team: ", " win the game!", "Top Seeker: ", "1st Place: ", "Last team standing!", "Winner #1 (", "Top Survivors", "Winners - ", "胜利者：", "击杀数第一名 - ", "胜者 - ", " - 近战命中率 - ", "冠军： ", "第一名- "};
      this.Field2173 = new String[]{"gg", "GG", "good game", "Good Game"};
      this.Method1033(true);
      if (a.trash() == null) {
         Class448.Method2460(new a[4]);
      }

   }

   public String getDescription() {
      return "游戏结束自动打GG";
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (a.getPacket() instanceof S02PacketChat) {
         S02PacketChat a = (S02PacketChat)a.getPacket();
         if (Arrays.stream(this.Field2172).anyMatch(AutoGG::Method2075) && EnumChatFormatting.getTextWithoutFormattingCodes(a.getChatComponent().getUnformattedText()).startsWith(" ")) {
            ++this.Field2174;
            if (this.Field2174 > 3) {
               this.Field2174 = 0;
            }

            mc.thePlayer.sendChatMessage("/ac " + this.Field2173[this.Field2174]);
         }
      }

   }

   private static boolean Method2075(S02PacketChat a, String a) {
      return EnumChatFormatting.getTextWithoutFormattingCodes(a.getChatComponent().getUnformattedText()).contains(a.toString());
   }
}
