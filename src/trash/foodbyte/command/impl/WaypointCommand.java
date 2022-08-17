package trash.foodbyte.command.impl;

import awsl.Class260;
import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.math.NumberUtils;
import trash.foodbyte.command.Command;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.ChatUtils;

public class WaypointCommand extends Command {
   public WaypointCommand() {
      super(new String[]{"waypoint", "wp", "way", "points"});
      this.setHelp("Waypoint help");
   }

   public void onCommand(String[] commands) {
      int a = GetDmgCommand.Method3598();
      if (Minecraft.getMinecraft().isSingleplayer()) {
         ChatUtils.addChatMessage("Waypoints cannot be used in singleplayer!");
      } else {
         if (commands.length > 1) {
            String var3 = commands[1].toLowerCase();
            byte var4 = -1;
            switch (var3.hashCode()) {
               case 3198785:
                  if (!var3.equals("help")) {
                     break;
                  }

                  var4 = 0;
               case -934641255:
                  if (!var3.equals("reload")) {
                     break;
                  }

                  var4 = 1;
               case 94746189:
                  if (!var3.equals("clear")) {
                     break;
                  }

                  var4 = 2;
               case 108404047:
                  if (!var3.equals("reset")) {
                     break;
                  }

                  var4 = 3;
               case 3322014:
                  if (!var3.equals("list")) {
                     break;
                  }

                  var4 = 4;
               case 96417:
                  if (!var3.equals("add")) {
                     break;
                  }

                  var4 = 5;
               case 99339:
                  if (!var3.equals("del")) {
                     break;
                  }

                  var4 = 6;
               case -934610812:
                  if (var3.equals("remove")) {
                     var4 = 7;
                  }
            }

            String a;
            switch (var4) {
               case 0:
                  ChatUtils.addChatMessage("Add Name X Y Z");
                  ChatUtils.addChatMessage("Del Name");
               case 1:
                  GlobalModule.INSTANCE.Method2009().Method2265().clear();
                  GlobalModule.INSTANCE.Method2009().Method2260();
                  ChatUtils.addChatMessage("Waypoints reloaded!");
               case 2:
               case 3:
                  if (GlobalModule.INSTANCE.Method2009().Method2265().isEmpty()) {
                     ChatUtils.addChatMessage("Waypoints list is empty!");
                  }

                  GlobalModule.INSTANCE.Method2009().Method2265().clear();
                  ChatUtils.addChatMessage("Cleared waypoints list!");
                  GlobalModule.INSTANCE.Method2009().Method2259();
               case 4:
                  if (GlobalModule.INSTANCE.Method2009().Method2265().isEmpty()) {
                     ChatUtils.addChatMessage("Waypoints list is empty!");
                  }

                  ChatUtils.addChatMessage("Here is a list of all your waypoints:");
                  GlobalModule.INSTANCE.Method2009().Method2265().forEach(WaypointCommand::Method3601);
               case 5:
                  if (commands.length == 6) {
                     if (NumberUtils.isNumber(commands[2]) || !NumberUtils.isNumber(commands[3]) || !NumberUtils.isNumber(commands[4]) || !NumberUtils.isNumber(commands[5])) {
                        break;
                     }

                     a = commands[2].replaceAll("&", "§");
                     if (!GlobalModule.INSTANCE.Method2009().Method2268(a, Minecraft.getMinecraft().getCurrentServerData().serverIP)) {
                        ChatUtils.addChatMessage("Waypoint " + a + " [" + commands[3] + ", " + commands[4] + ", " + commands[5] + "] has been added.");
                        GlobalModule.INSTANCE.Method2009().Method2266(a, Double.valueOf(commands[3]), Double.valueOf(commands[4]), Double.valueOf(commands[5]), Minecraft.getMinecraft().getCurrentServerData().serverIP, Minecraft.getMinecraft().thePlayer.dimension);
                        GlobalModule.INSTANCE.Method2009().Method2259();
                     }

                     ChatUtils.addChatMessage(a + " is already a waypoint!");
                  }

                  if (commands.length == 3) {
                     if (!GlobalModule.INSTANCE.Method2009().Method2268(commands[2], Minecraft.getMinecraft().getCurrentServerData().serverIP)) {
                        ChatUtils.addChatMessage("Waypoint " + commands[2] + " [" + (int)Minecraft.getMinecraft().thePlayer.posX + ", " + (int)Minecraft.getMinecraft().thePlayer.posY + ", " + (int)Minecraft.getMinecraft().thePlayer.posZ + "] has been added.");
                        GlobalModule.INSTANCE.Method2009().Method2266(commands[2], (double)((int)Minecraft.getMinecraft().thePlayer.posX), (double)((int)Minecraft.getMinecraft().thePlayer.posY), (double)((int)Minecraft.getMinecraft().thePlayer.posZ), Minecraft.getMinecraft().getCurrentServerData().serverIP, Minecraft.getMinecraft().thePlayer.dimension);
                        GlobalModule.INSTANCE.Method2009().Method2259();
                     }

                     ChatUtils.addChatMessage(commands[2] + " is already a waypoint!");
                  }

                  ChatUtils.addChatMessage("Either one of the needed variables is null or is a string/number!");
               case 6:
               case 7:
                  a = commands[2].replaceAll("&", "§");
                  if (GlobalModule.INSTANCE.Method2009().Method2268(a, Minecraft.getMinecraft().getCurrentServerData().serverIP)) {
                     ChatUtils.addChatMessage(a + " has been removed from your waypoints!");
                     GlobalModule.INSTANCE.Method2009().Method2267(a, Minecraft.getMinecraft().getCurrentServerData().serverIP);
                     GlobalModule.INSTANCE.Method2009().Method2259();
                  }

                  ChatUtils.addChatMessage(a + " is not a waypoint!");
            }
         }

      }
   }

   private static void Method3601(Class260 a) {
      if (Minecraft.getMinecraft().getCurrentServerData().serverIP.equals(a.Method2836()) && Minecraft.getMinecraft().thePlayer.dimension == a.Method2840()) {
         ChatUtils.addChatMessage(a.Method2835() + " [" + a.Method2837() + ", " + a.Method2838() + ", " + a.Method2839() + ", " + a.Method2836() + "]");
      }

   }
}
