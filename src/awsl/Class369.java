package awsl;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Util;
import net.minecraft.util.Util.EnumOS;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.Display;
import trash.foodbyte.utils.RenderUtils;

public class Class369 {
   static Minecraft Field1736 = Minecraft.getMinecraft();

   public static void Method680() {
      Util.EnumOS var0 = Util.getOSType();
      if (var0 != EnumOS.OSX) {
         InputStream var1 = null;
         InputStream var2 = null;

         try {
            var1 = Field1736.getResourceManager().getResource(Class393.Field1941).getInputStream();
            var2 = Field1736.getResourceManager().getResource(Class393.Field1942).getInputStream();
            Display.setIcon(new ByteBuffer[]{Method681(var1), Method681(var2)});
         } catch (IOException var7) {
            LogManager.getLogger("FoodByte Transformer").error("Couldn't set icon", var7);
         } finally {
            IOUtils.closeQuietly(var1);
            IOUtils.closeQuietly(var2);
         }
      }

   }

   public static ByteBuffer Method681(InputStream a) throws IOException {
      BufferedImage var2 = ImageIO.read(a);
      RenderUtils.trash();
      int[] var3 = var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
      ByteBuffer var4 = ByteBuffer.allocate(4 * var3.length);
      int var6 = var3.length;
      int var7 = 0;
      if (var7 < var6) {
         int var8 = var3[var7];
         var4.putInt(var8 << 8 | var8 >> 24 & 255);
         ++var7;
      }

      var4.flip();
      return var4;
   }

   private static IOException Method682(IOException iOException) {
      return iOException;
   }
}
