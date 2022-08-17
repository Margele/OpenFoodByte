package awsl;

import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import obfuscate.a;
import org.lwjgl.opengl.GL11;

public class Class563 {
   public float Field2625;
   private Class573 Field2626;
   private int[] Field2627;
   private float Field2628;
   public HashMap Field2629;
   public HashMap Field2630;
   private static a[] Field2631;

   public Class563(String a, int a, int a, boolean a) {
      this(a, a, a, 0, a);
   }

   public Class563(String a, int a, int a, int a, boolean a) {
      this(a, a, a, a, a, 0);
   }

   public Class563(String a, int a, int a, int a, boolean a, int a) {
      this.Field2625 = 0.0F;
      this.Field2627 = new int[32];
      this.Field2629 = new HashMap();
      this.Field2630 = new HashMap();
      this.Field2626 = new Class573(this.Method1216(a, a, a), true, a, a, a);
      this.Field2628 = 0.0F;

      for(int a = 0; a < 32; ++a) {
         int a = (a >> 3 & 1) * 85;
         int a = (a >> 2 & 1) * 170 + a;
         int a = (a >> 1 & 1) * 170 + a;
         int a = (a & 1) * 170 + a;
         if (a == 6) {
            a += 85;
         }

         if (a >= 16) {
            a /= 4;
            a /= 4;
            a /= 4;
         }

         this.Field2627[a] = (a & 255) << 16 | (a & 255) << 8 | a & 255;
      }

      this.Field2625 = this.Method1227("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
   }

   private Font Method1216(String a, int a, int a) {
      Font a = null;

      try {
         InputStream a = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/font/" + a)).getInputStream();
         a = Font.createFont(0, a);
         a = a.deriveFont(a, (float)a);
      } catch (Exception var6) {
         var6.printStackTrace();
         System.err.println("Failed to load custom font");
      }

      return a;
   }

   public int Method1217(String a, float a, float a, int a) {
      return this.Method1218(a, a, a, a, 1.0F);
   }

   public int Method1218(String a, float a, float a, int a, float a) {
      Method1234();
      a = this.Method1219(a);
      a *= 2.0F;
      a *= 2.0F;
      GL11.glPushMatrix();
      GL11.glScaled(0.5, 0.5, 0.5);
      boolean a = GL11.glGetBoolean(3042);
      GlStateManager.enableAlpha();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3553);
      char[] a = a.toCharArray();
      int a = 0;
      int a = a.length;
      int a = 0;
      if (a < a) {
         char a = a[a];
         if (a == '\r') {
            a = a;
         }

         if (a == '\n') {
            a += this.Method1227(Character.toString(a)) * 2.0F;
         }

         if (a != 167 && (a == a.length - 1 || a[a - 1] != 167)) {
            if (a >= 1 && a[a - 1] == 167) {
               a.trash(new String[1]);
            }

            GL11.glPushMatrix();
            this.Field2626.Method1048(Character.toString(a), (double)a, (double)a, Method1232(a, a), false);
            GL11.glPopMatrix();
            a += this.Method1225(Character.toString(a)) * 2.0F;
         }

         if (a == ' ') {
            a += (float)this.Field2626.Method1053(" ");
         }

         if (a == 167 && a != a.length - 1) {
            int a = "0123456789abcdefklmnor".indexOf(a.charAt(a + 1));
            if (a < 16) {
               int var10000 = this.Field2627[a];
            }

            if (a == 21) {
               int a = Color.WHITE.getRGB();
            }
         }

         ++a;
         ++a;
      }

      GL11.glDisable(3042);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      return (int)a;
   }

   private String Method1219(String a) {
      String a = "";
      char[] a;
      int a = (a = a.toCharArray()).length;

      for(int a = 0; a < a; ++a) {
         char a = a[a];
         if ((a < '썐' || a > '\uea60') && a != 9917) {
            a = a + a;
         }
      }

      a = a.replace("§r", "").replace('▬', '=').replace('❤', '♥').replace('⋆', '☆').replace('☠', '☆').replace('✰', '☆').replace("✫", "☆").replace("✙", "+").replace("\uf8ff", "").replace("⬛", "■■");
      a = a.replace('⬅', '←').replace('⬆', '↑').replace('⬇', '↓').replace('➡', '→').replace('⬈', '↗').replace('⬋', '↙').replace('⬉', '↖').replace('⬊', '↘');
      return a;
   }

   public int Method1220(String a, float a, float a, int a) {
      this.Method1218(StringUtils.stripControlCodes(a), a + 0.5F, a + 0.5F, 0, 1.0F);
      return this.Method1217(a, a, a, a);
   }

   public int Method1221(String a, float a, float a, int a) {
      this.Method1218(StringUtils.stripControlCodes(a), a + 0.8F, a + 0.8F, 0, 1.0F);
      return this.Method1217(a, a, a, a);
   }

   public int Method1222(String a, float a, float a, int a) {
      return this.Method1217(a, a - (float)((int)this.Method1225(a) / 2), a, a);
   }

   public void Method1223(String a, float a, float a, int a, float a) {
      this.Method1218(a, a - (float)((int)this.Method1225(a) / 2), a, a, a);
   }

   public void Method1224(String a, float a, float a, int a) {
      this.Method1222(StringUtils.stripControlCodes(a), a + 0.5F, a + 0.5F, -16777216);
      this.Method1222(a, a, a, a);
   }

   public float Method1225(String a) {
      if (this.Field2629.containsKey(a)) {
         return (Float)this.Field2629.Method2665(a);
      } else {
         float a = 0.0F;
         String a = StringUtils.stripControlCodes(a);
         char[] a;
         int a = (a = a.toCharArray()).length;

         for(int a = 0; a < a; ++a) {
            char a = a[a];
            a += (float)this.Field2626.Method1053(Character.toString(a)) + this.Field2628;
         }

         this.Field2629.put(a, a / 2.0F);
         return a / 2.0F;
      }
   }

   public float Method1226(char a) {
      return (float)this.Field2626.Method1053(String.valueOf(a));
   }

   public float Method1227(String a) {
      if (this.Field2630.containsKey(a)) {
         return (Float)this.Field2630.Method2665(a);
      } else {
         float a = (float)this.Field2626.Method1051(a) / 2.0F;
         this.Field2630.put(a, a);
         return a;
      }
   }

   public float Method1228() {
      return (float)this.Field2626.Method1051("FluxIsThatBestClarinet.") / 2.0F;
   }

   public Class573 Method1229() {
      return this.Field2626;
   }

   public String Method1230(String a, int a) {
      return this.Method1231(a, a, false);
   }

   public String Method1231(String a, int a, boolean a2) {
      a = this.Method1219(a);
      StringBuilder a = new StringBuilder();
      float a = 0.0F;
      int a = a.length() - 1;
      byte a = -1;
      boolean a = false;
      boolean a = false;

      for(int a = a; a < a.length() && a < (float)a; a += a) {
         char a = a.charAt(a);
         this.Method1226(a);
         a = false;
         if (a != 'l' && a != 'L') {
            if (a == 'r' || a == 'R') {
               a = false;
            }
         } else {
            a = true;
         }

         if (a > (float)a) {
            break;
         }

         a.insert(0, a);
      }

      return a.toString();
   }

   public static int Method1232(int a, float a) {
      Color a = new Color(a);
      float a = 0.003921569F * (float)a.getRed();
      float a = 0.003921569F * (float)a.getGreen();
      float a = 0.003921569F * (float)a.getBlue();
      return (new Color(a, a, a, a)).getRGB();
   }

   public static void Method1233(a[] arr) {
      Field2631 = arr;
   }

   public static a[] Method1234() {
      return Field2631;
   }

   static {
      Method1233(new a[5]);
   }
}
