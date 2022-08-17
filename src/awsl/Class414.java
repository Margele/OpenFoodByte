package awsl;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import obfuscate.a;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class414 {
   public Module Field2001;
   public ArrayList Field2002;
   public Class421 Field2003;
   public double Field2004;
   public double Field2005;
   public double Field2006;
   public double Field2007;
   public boolean Field2008 = false;
   public boolean Field2009;

   public Class414(Module a, Class421 a) {
      Class426.Method2315();
      this.Field2009 = false;
      this.Field2001 = a;
      this.Field2007 = (double)(Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT + 2);
      this.Field2003 = a;
      this.Field2002 = new ArrayList();
      Iterator var4 = Class446.Method2766(a.getName()).Method1383();
      Class447 a;
      if (var4.Method932()) {
         a = (Class447)var4.Method933();
         if (a instanceof ModeValue) {
            this.Field2002.Method2530(new Class424(this, (ModeValue)a));
         }

         a.trash(new String[3]);
      }

      var4 = Class446.Method2766(a.getName()).Method1383();
      if (var4.Method932()) {
         a = (Class447)var4.Method933();
         if (a instanceof FloatValue) {
            this.Field2002.Method2530(new Class423(this, (FloatValue)a));
         }
      }

      var4 = Class446.Method2766(a.getName()).Method1383();
      if (var4.Method932()) {
         a = (Class447)var4.Method933();
         if (a instanceof BooleanValue) {
            this.Field2002.Method2530(new Class425(this, (BooleanValue)a));
         }
      }

   }

   public void Method3568(int a, int a, float a2) {
      Color a = Class416.Method2352();
      int a = (new Color(a.getRed(), a.getGreen(), a.getBlue(), 150)).getRGB();
      int a = -1052689;
      if (this.Field2001.getState()) {
         a = (new Color(0, 153, 255)).getRGB();
      }

      if (this.Method3571(a, a)) {
         RenderUtils.Method1105(this.Field2004 - 2.0, this.Field2005, this.Field2004 + this.Field2006 + 2.0, this.Field2005 + this.Field2007 + 1.0, 1427181841);
      }

      Class565.Field2635.Method1222(this.Field2001.getName(), (float)(this.Field2004 + this.Field2006 / 2.0), (float)(this.Field2005 + 1.0), a);
      if (this.Field2002 != null && this.Field2002.Method1799() > 0) {
         String a = this.Field2008 ? "g" : "i";
         Class565.Field2640.Method1217(a, (float)(this.Field2004 + this.Field2006 - (double)Class565.Field2640.Method1225(a)), (float)(this.Field2005 + 1.0), 16777215);
      }

   }

   public boolean Method3569(int a, int a, int a2) {
      if (!this.Method3571(a, a)) {
         return false;
      } else {
         this.Field2001.setState(!this.Field2001.getState());
         GlobalModule.INSTANCE.fileManager.saveMods();
         return true;
      }
   }

   public boolean Method3570(char a, int a) throws IOException {
      if (this.Field2009) {
         if (a != 1) {
            ChatUtils.addChatMessage("Bound '" + this.Field2001.getName() + "' to '" + Keyboard.getKeyName(a) + "'");
            this.Field2001.Method1021(a);
         } else {
            ChatUtils.addChatMessage("Unbound '" + this.Field2001.getName() + "'");
            this.Field2001.Method1021(0);
         }

         GlobalModule.INSTANCE.fileManager.saveKeys();
         this.Field2009 = false;
         return true;
      } else {
         return false;
      }
   }

   public boolean Method3571(int a, int a) {
      return (double)a >= this.Field2004 && (double)a <= this.Field2004 + this.Field2006 && (double)a >= this.Field2005 && (double)a <= this.Field2005 + this.Field2007;
   }

   private static IOException Method3572(IOException iOException) {
      return iOException;
   }
}
