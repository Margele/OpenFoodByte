package trash.foodbyte.command;

import awsl.Class632;
import eventapi.EventManager;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.network.play.client.C01PacketChatMessage;
import obfuscate.a;
import trash.foodbyte.command.impl.BindCommand;
import trash.foodbyte.command.impl.ConfigCommand;
import trash.foodbyte.command.impl.FriendCommand;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.command.impl.HelpCommand;
import trash.foodbyte.command.impl.HideCommand;
import trash.foodbyte.command.impl.IRCCommand;
import trash.foodbyte.command.impl.NameProtectCommand;
import trash.foodbyte.command.impl.RejoinCommand;
import trash.foodbyte.command.impl.TargetCommand;
import trash.foodbyte.command.impl.TeleportCommand;
import trash.foodbyte.command.impl.ToggleCommand;
import trash.foodbyte.command.impl.WDRCommand;
import trash.foodbyte.command.impl.WaypointCommand;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.GlobalModule;

public class CommandManager {
   public static final String PREFIX = "-";
   private static ArrayList commands = new ArrayList();

   public CommandManager() {
      Command.Method1665();
      commands.Method2530(new BindCommand());
      commands.Method2530(new HideCommand());
      commands.Method2530(new WDRCommand());
      commands.Method2530(new HelpCommand());
      commands.Method2530(new IRCCommand());
      commands.Method2530(new TeleportCommand());
      commands.Method2530(new FriendCommand());
      commands.Method2530(new TargetCommand());
      commands.Method2530(new ConfigCommand());
      commands.Method2530(new GetDmgCommand());
      commands.Method2530(new ToggleCommand());
      commands.Method2530(new RejoinCommand());
      commands.Method2530(new NameProtectCommand());
      commands.Method2530(new WaypointCommand());
      commands.sort(Comparator.comparing(Command::getName));
      EventManager.register(this);
      a.trash(new String[4]);
   }

   @EventTarget
   public void Method3590(Class632 a) {
      int a = Command.Method1666();
      if (GlobalModule.Field3160.getBooleanValue() && Minecraft.getMinecraft().currentScreen == null && a.Method3513() == 12) {
         GuiChat a;
         if (GlobalModule.INSTANCE.balant.Field2834 != null && GlobalModule.INSTANCE.balant.Field2834.isOpen()) {
            a = new GuiChat("-I ");
            Minecraft.getMinecraft().displayGuiScreen(a);
         }

         a = new GuiChat("-");
         Minecraft.getMinecraft().displayGuiScreen(a);
      }

   }

   @EventTarget
   public void Method3591(EventPacket a) {
      int a = Command.Method1665();
      if (GlobalModule.Field3160.getValue() && a.getPacket() instanceof C01PacketChatMessage) {
         C01PacketChatMessage a = (C01PacketChatMessage)a.getPacket();
         String a = Method3593(a.getMessage());
         if (a.getMessage().startsWith("-")) {
            Iterator var5 = Method3592().Method1383();
            if (var5.Method932()) {
               Command a = (Command)var5.Method933();
               int a = 0;
               if (a < a.getCommands().length) {
                  if (a.toLowerCase().split(" ")[0].equals("-" + a.getCommands()[a].toLowerCase())) {
                     a.setCancelled(true);
                     a.onCommand(a.split(" "));
                     return;
                  }

                  ++a;
               }
            }
         }
      }

   }

   public static ArrayList Method3592() {
      return commands;
   }

   public static String Method3593(String a) {
      String a = " ";

      for(String a = "  "; a.contains(a); a = a.replace(a, a)) {
      }

      return a;
   }
}
