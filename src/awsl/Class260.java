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
      JsonObject a = new JsonObject();
      int a = var10000;
      a.addProperty("label", this.Field1420);
      a.addProperty("server", this.Field1421);
      a.addProperty("x", this.Field1422);
      a.addProperty("y", this.Field1423);
      a.addProperty("z", this.Field1424);
      a.addProperty("dimension", this.Field1425);
      if (a.trash() == null) {
         ++a;
         Class259.Method2271(a);
      }

      return a;
   }

   public void Method2842(JsonObject a) {
      this.Field1420 = a.get("label").getAsString();
      this.Field1421 = a.get("server").getAsString();
      this.Field1422 = (double)a.get("x").getAsInt();
      this.Field1423 = (double)a.get("y").getAsInt();
      this.Field1424 = (double)a.get("z").getAsInt();
      this.Field1425 = a.get("dimension").getAsInt();
   }

   public void Method2843(FontRenderer a, String a, String a, float a3, boolean a4) {
      GlStateManager.scale(1.0F, 1.0F, 1.0F);
      int a = a.getStringWidth(a + a) / 2;
      RenderUtils.Method1103((float)(-a) - 1.0F, 0.0F, (float)(a.getStringWidth(a + a) + 1), (float)(-a.FONT_HEIGHT), (new Color(0, 0, 0, 80)).getRGB());
      Class259.Method2272();
      a.drawStringWithShadow(a + a, (float)(-a), -8.0F, -1);
      a.trash(new String[1]);
   }
}
