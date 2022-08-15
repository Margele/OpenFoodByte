/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.Thread
 *  javax.sound.sampled.AudioInputStream
 *  javax.sound.sampled.AudioSystem
 *  javax.sound.sampled.Clip
 *  javax.sound.sampled.Control$Type
 *  javax.sound.sampled.FloatControl
 *  javax.sound.sampled.FloatControl$Type
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.SoundCategory
 *  net.minecraft.util.ResourceLocation
 */
package awsl;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Control;
import javax.sound.sampled.FloatControl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.util.ResourceLocation;

public class Class357 {
    public static Minecraft Field1702 = Minecraft.getMinecraft();

    public static void Method107(ResourceLocation a, float a2) throws Exception {
        AudioInputStream a3 = AudioSystem.getAudioInputStream((InputStream)Field1702.getResourceManager().getResource(a).getInputStream());
        Clip a4 = AudioSystem.getClip();
        a4.open(a3);
        FloatControl a5 = (FloatControl)a4.getControl((Control.Type)FloatControl.Type.MASTER_GAIN);
        a5.setValue(a2 * Class357.Field1702.gameSettings.getSoundLevel(SoundCategory.MASTER));
        a4.start();
    }

    public static void Method108(ResourceLocation a) {
        new Thread(() -> Class357.Method109(a)).start();
    }

    private static void Method109(ResourceLocation a) {
        try {
            Clip a2 = AudioSystem.getClip();
            AudioInputStream a3 = AudioSystem.getAudioInputStream((InputStream)Field1702.getResourceManager().getResource(a).getInputStream());
            a2.open(a3);
            a2.start();
        }
        catch (Exception a4) {
            System.err.println(a4.getMessage());
        }
    }
}