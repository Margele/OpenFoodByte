package trash.foodbyte.reflections;

import io.netty.util.concurrent.GenericFutureListener;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.network.Packet;
import obfuscate.a;

public class Wrapper {
   public static volatile Wrapper INSTANCE = new Wrapper();
   private static String trash;

   public Minecraft getMinecraft() {
      return Minecraft.getMinecraft();
   }

   public EntityPlayerSP getThePlayer() {
      return INSTANCE.getMinecraft().thePlayer;
   }

   public WorldClient getTheWorld() {
      return INSTANCE.getMinecraft().theWorld;
   }

   public boolean isVaildWorldAndPlayer() {
      return INSTANCE.getMinecraft().thePlayer != null && INSTANCE.getMinecraft().theWorld != null;
   }

   public GameSettings getGameSettings() {
      return INSTANCE.getMinecraft().gameSettings;
   }

   public FontRenderer getFontRendererObj() {
      return INSTANCE.getMinecraft().fontRendererObj;
   }

   public void sendPacket(Packet packet) {
      INSTANCE.getMinecraft().getNetHandler().getNetworkManager().sendPacket(packet);
   }

   public void sendPacketNoEvent(Packet packet) {
      trash();
      INSTANCE.getMinecraft().getNetHandler().getNetworkManager().sendPacket(packet, (GenericFutureListener)null, new GenericFutureListener[0]);
      a.trash(new String[2]);
   }

   public void setClipboard(String msg) {
      trash();
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(msg), (ClipboardOwner)null);
      if (a.trash() == null) {
         trash("zgHohb");
      }

   }

   public boolean hasClass(String className) {
      try {
         Class.forName(className);
         return true;
      } catch (ClassNotFoundException var3) {
         return false;
      }
   }

   static {
      trash((String)null);
   }

   public static void trash(String trash) {
      trash = trash;
   }

   public static String trash() {
      return trash;
   }
}
