package awsl;

import eventapi.EventManager;
import eventapi.EventTarget;
import net.minecraft.network.Packet;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S3EPacketTeams;
import net.minecraft.util.StringUtils;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.utils.ChatUtils;

public class Class582 {
   public Class582() {
      EventManager.register(this);
      Class372.Method405(this);
   }

   @EventTarget
   public void Method270(EventPacket a) {
      Packet var2 = a.packet;
      if (a.isSend()) {
      }

      if (a.isRecieve()) {
         if (var2 instanceof S02PacketLoginSuccess || var2 instanceof S07PacketRespawn) {
            Class484.Field2234 = Class615.NONE;
         }

         if (var2 instanceof S3EPacketTeams) {
            S3EPacketTeams var3 = (S3EPacketTeams)var2;
            if (var3.getPrefix().startsWith(" §7⏣") && var3.getSuffix().isEmpty()) {
               this.Method271(var3.getPrefix());
            } else if (var3.getPrefix().startsWith(" §7⏣")) {
               this.Method271(var3.getPrefix() + var3.getSuffix());
            }

            if (var3.getPrefix().startsWith("Cleared:")) {
               this.Method271(var3.getPrefix());
            }
         }
      }

   }

   public void Method271(String a) {
      a = StringUtils.stripControlCodes(a).replace(" ⏣ ", "");
      Class615.Method3534();
      ChatUtils.debug(a);
      byte var4 = -1;
      switch (a.hashCode()) {
         case 2433880:
            if (!a.equals("None")) {
               break;
            }

            var4 = 0;
            a.trash(new String[3]);
         case -725141854:
            if (!a.equals("Your Island")) {
               break;
            }

            var4 = 1;
         case 312628332:
            if (!a.equals("The End")) {
               break;
            }

            var4 = 2;
         case 1036208985:
            if (!a.equals("Dragon's Nest")) {
               break;
            }

            var4 = 3;
         case 641884637:
            if (!a.equals("Void Sepulture")) {
               break;
            }

            var4 = 4;
         case 1652006616:
            if (!a.equals("Jungle Island")) {
               break;
            }

            var4 = 5;
         case 197251312:
            if (!a.equals("Savanna Woodland")) {
               break;
            }

            var4 = 6;
         case 1965349768:
            if (!a.equals("Spruce Woods")) {
               break;
            }

            var4 = 7;
         case 1178975842:
            if (!a.equals("Dark Thicket")) {
               break;
            }

            var4 = 8;
         case 900751258:
            if (!a.equals("Birch Park")) {
               break;
            }

            var4 = 9;
         case 1437466191:
            if (a.equals("Dungeon Hub")) {
               var4 = 10;
            }
      }

      switch (var4) {
         case 0:
            Class484.Field2234 = Class615.NONE;
         case 1:
            Class484.Field2234 = Class615.ISLAND;
         case 2:
            Class484.Field2234 = Class615.END;
         case 3:
            Class484.Field2234 = Class615.DRAGON_NEST;
         case 4:
            Class484.Field2234 = Class615.VOID_SEPULTURE;
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
            Class484.Field2234 = Class615.WOODS;
         case 10:
         default:
            if (a.startsWith("The Catacombs")) {
               Class484.Field2234 = Class615.DUNGEON;
            }

            if (a.startsWith("Cleared:")) {
               Class484.Field2234 = Class615.DUNGEONING;
            }

      }
   }
}
