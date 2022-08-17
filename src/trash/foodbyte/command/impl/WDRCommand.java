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
      int var2 = GetDmgCommand.Method3598();
      if (commands.length < 2) {
         ChatUtils.addChatMessage(this.getHelp());
      }

      if (commands.length == 2) {
         ChatUtils.addChatMessage("§cReported §6" + commands[1]);
         Minecraft.getMinecraft().thePlayer.sendChatMessage("/wdr " + commands[1] + " Fly KillAura AutoClicker Speed AntiKnockBack Reach Dolphin");
      }

      if (commands.length == 3) {
         int var3 = Integer.parseInt(commands[2]);
         ChatUtils.addChatMessage("§cReported §6" + commands[1] + " x" + var3);
         int var4 = 0;
         if (var4 <= var3) {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/wdr " + commands[1] + " Fly KillAura AutoClicker Speed AntiKnockBack Reach Dolphin");
            ++var4;
         }
      }

   }
}
