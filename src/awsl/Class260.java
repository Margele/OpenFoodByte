package awsl;

import com.google.gson.JsonObject;
import java.awt.Color;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import obfuscate.a;
import trash.foodbyte.utils.RenderUtils;

public class Class260 {
   private String Field1420;
   private String Field1421;
   private double Field1422;
   private double Field1423;
   private double Field1424;
   private int Field1425;

   public Class260(String a, double a, double a, double a, String a, int a) {
      this.Field1420 = a;
      this.Field1422 = a;
      this.Field1423 = a;
      this.Field1424 = a;
      this.Field1421 = a;
      this.Field1425 = a;
   }

   public Class260() {
   }

   public String Method2835() {
      return this.Field1420;
   }

   public String Method2836() {
      return this.Field1421;
   }

   public double Method2837() {
      return this.Field1422;
   }

   public double Method2838() {
      return this.Field1423;
   }

   public double Method2839() {
      return this.Field1424;
   }

   public int Method2840() {
      return this.Field1425;
   }

   public JsonObject Method2841() {
      int var10000 = Class259.Method2273();
      JsonObject var2 = new JsonObject();
      int var1 = var10000;
      var2.addProperty("label", this.Field1420);
      var2.addProperty("server", this.Field1421);
      var2.addProperty("x", this.Field1422);
      var2.addProperty("y", this.Field1423);
      var2.addProperty("z", this.Field1424);
      var2.addProperty("dimension", this.Field1425);
      if (a.trash() == null) {
         ++var1;
         Class259.Method2271(var1);
      }

      return var2;
   }

   public void Method2842(JsonObject a) {
      this.Field1420 = a.get("label").getAsString();
      this.Field1421 = a.get("server").getAsString();
      this.Field1422 = (double)a.get("x").getAsInt();
      this.Field1423 = (double)a.get("y").getAsInt();
      this.Field1424 = (double)a.get("z").getAsInt();
      this.Field1425 = a.get("dimension").getAsInt();
   }

   public void Method2843(FontRenderer a, String a, String a, float a, boolean a) {
      GlStateManager.scale(1.0F, 1.0F, 1.0F);
      int var7 = a.getStringWidth(a + a) / 2;
      RenderUtils.Method1103((float)(-var7) - 1.0F, 0.0F, (float)(a.getStringWidth(a + a) + 1), (float)(-a.FONT_HEIGHT), (new Color(0, 0, 0, 80)).getRGB());
      Class259.Method2272();
      a.drawStringWithShadow(a + a, (float)(-var7), -8.0F, -1);
      a.trash(new String[1]);
   }
}
