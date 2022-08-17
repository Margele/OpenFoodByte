package trash.foodbyte.command.impl;

import net.minecraft.client.Minecraft;
import trash.foodbyte.command.Command;
import trash.foodbyte.utils.ChatUtils;

public class WDRCommand extends Command {
   public WDRCommand() {
      super(new String[]{"wdr"});
      this.setHelp("wdr <Playername>");
   }

   public void onCommand(String[] commands) {
      int a = GetDmgCommand.Method3598();
      if (commands.length < 2) {
         ChatUtils.addChatMessage(this.getHelp());
      }

      if (commands.length == 2) {
         ChatUtils.addChatMessage("§cReported §6" + commands[1]);
         Minecraft.getMinecraft().thePlayer.sendChatMessage("/wdr " + commands[1] + " Fly KillAura AutoClicker Speed AntiKnockBack Reach Dolphin");
      }

      if (commands.length == 3) {
         int a = Integer.parseInt(commands[2]);
         ChatUtils.addChatMessage("§cReported §6" + commands[1] + " x" + a);
         int a = 0;
         if (a <= a) {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/wdr " + commands[1] + " Fly KillAura AutoClicker Speed AntiKnockBack Reach Dolphin");
            ++a;
         }
      }

   }
}
