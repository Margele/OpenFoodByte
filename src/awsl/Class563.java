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

      for(int var7 = 0; var7 < 32; ++var7) {
         int var8 = (var7 >> 3 & 1) * 85;
         int var9 = (var7 >> 2 & 1) * 170 + var8;
         int var10 = (var7 >> 1 & 1) * 170 + var8;
         int var11 = (var7 & 1) * 170 + var8;
         if (var7 == 6) {
            var9 += 85;
         }

         if (var7 >= 16) {
            var9 /= 4;
            var10 /= 4;
            var11 /= 4;
         }

         this.Field2627[var7] = (var9 & 255) << 16 | (var10 & 255) << 8 | var11 & 255;
      }

      this.Field2625 = this.Method1227("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
   }

   private Font Method1216(String a, int a, int a) {
      Font var4 = null;

      try {
         InputStream var5 = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/font/" + a)).getInputStream();
         var4 = Font.createFont(0, var5);
         var4 = var4.deriveFont(a, (float)a);
      } catch (Exception var6) {
         var6.printStackTrace();
         System.err.println("Failed to load custom font");
      }

      return var4;
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
      boolean var8 = GL11.glGetBoolean(3042);
      GlStateManager.enableAlpha();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3553);
      char[] var10 = a.toCharArray();
      int var11 = 0;
      int var13 = var10.length;
      int var14 = 0;
      if (var14 < var13) {
         char var15 = var10[var14];
         if (var15 == '\r') {
            a = a;
         }

         if (var15 == '\n') {
            a += this.Method1227(Character.toString(var15)) * 2.0F;
         }

         if (var15 != 167 && (var11 == var10.length - 1 || var10[var11 - 1] != 167)) {
            if (var11 >= 1 && var10[var11 - 1] == 167) {
               a.trash(new String[1]);
            }

            GL11.glPushMatrix();
            this.Field2626.Method1048(Character.toString(var15), (double)a, (double)a, Method1232(a, a), false);
            GL11.glPopMatrix();
            a += this.Method1225(Character.toString(var15)) * 2.0F;
         }

         if (var15 == ' ') {
            a += (float)this.Field2626.Method1053(" ");
         }

         if (var15 == 167 && var11 != var10.length - 1) {
            int var16 = "0123456789abcdefklmnor".indexOf(a.charAt(var11 + 1));
            if (var16 < 16) {
               int var10000 = this.Field2627[var16];
            }

            if (var16 == 21) {
               int var9 = Color.WHITE.getRGB();
            }
         }

         ++var11;
         ++var14;
      }

      GL11.glDisable(3042);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      return (int)a;
   }

   private String Method1219(String a) {
      String var2 = "";
      char[] var3;
      int var4 = (var3 = a.toCharArray()).length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         if ((var6 < '썐' || var6 > '\uea60') && var6 != 9917) {
            var2 = var2 + var6;
         }
      }

      a = var2.replace("§r", "").replace('▬', '=').replace('❤', '♥').replace('⋆', '☆').replace('☠', '☆').replace('✰', '☆').replace("✫", "☆").replace("✙", "+").replace("\uf8ff", "").replace("⬛", "■■");
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
         float var2 = 0.0F;
         String var3 = StringUtils.stripControlCodes(a);
         char[] var4;
         int var5 = (var4 = var3.toCharArray()).length;

         for(int var6 = 0; var6 < var5; ++var6) {
            char var7 = var4[var6];
            var2 += (float)this.Field2626.Method1053(Character.toString(var7)) + this.Field2628;
         }

         this.Field2629.put(a, var2 / 2.0F);
         return var2 / 2.0F;
      }
   }

   public float Method1226(char a) {
      return (float)this.Field2626.Method1053(String.valueOf(a));
   }

   public float Method1227(String a) {
      if (this.Field2630.containsKey(a)) {
         return (Float)this.Field2630.Method2665(a);
      } else {
         float var2 = (float)this.Field2626.Method1051(a) / 2.0F;
         this.Field2630.put(a, var2);
         return var2;
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

   public String Method1231(String a, int a, boolean a) {
      a = this.Method1219(a);
      StringBuilder var4 = new StringBuilder();
      float var5 = 0.0F;
      int var6 = a.length() - 1;
      byte var7 = -1;
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var6; var10 < a.length() && var5 < (float)a; var10 += var7) {
         char var11 = a.charAt(var10);
         this.Method1226(var11);
         var8 = false;
         if (var11 != 'l' && var11 != 'L') {
            if (var11 == 'r' || var11 == 'R') {
               var9 = false;
            }
         } else {
            var9 = true;
         }

         if (var5 > (float)a) {
            break;
         }

         var4.insert(0, var11);
      }

      return var4.toString();
   }

   public static int Method1232(int a, float a) {
      Color var2 = new Color(a);
      float var3 = 0.003921569F * (float)var2.getRed();
      float var4 = 0.003921569F * (float)var2.getGreen();
      float var5 = 0.003921569F * (float)var2.getBlue();
      return (new Color(var3, var4, var5, a)).getRGB();
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
