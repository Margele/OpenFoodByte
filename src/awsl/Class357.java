package awsl;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.util.ResourceLocation;

public class Class357 {
   public static Minecraft Field1702 = Minecraft.getMinecraft();

   public static void Method107(ResourceLocation a, float a) throws Exception {
      AudioInputStream a = AudioSystem.getAudioInputStream(Field1702.getResourceManager().getResource(a).getInputStream());
      Clip a = AudioSystem.getClip();
      a.open(a);
      FloatControl a = (FloatControl)a.getControl(Type.MASTER_GAIN);
      a.setValue(a * Field1702.gameSettings.getSoundLevel(SoundCategory.MASTER));
      a.start();
   }

   public static void Method108(ResourceLocation a) {
      (new Thread(Class357::Method109)).start();
   }

   private static void Method109(ResourceLocation a) {
      try {
         Clip a = AudioSystem.getClip();
         AudioInputStream a = AudioSystem.getAudioInputStream(Field1702.getResourceManager().getResource(a).getInputStream());
         a.open(a);
         a.start();
      } catch (Exception var3) {
         System.err.println(var3.getMessage());
      }

   }
}
