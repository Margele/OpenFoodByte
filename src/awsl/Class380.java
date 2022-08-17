package awsl;

import eventapi.EventManager;
import eventapi.EventTarget;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import obfuscate.a;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.module.impl.player.SuperPlace;
import trash.foodbyte.module.impl.render.Hud;
import trash.foodbyte.utils.RenderUtils;

public class Class380 {
   private Minecraft Field1835 = Minecraft.getMinecraft();
   private SimpleDateFormat Field1836 = new SimpleDateFormat("HH:mm");
   private Class349 Field1837 = new Class349(0.01);
   private Class349 Field1838 = new Class349(0.01);
   private Class349 Field1839 = new Class349(0.01);
   public EntityLivingBase Field1840;
   private static a[] Field1841;

   public Class380() {
      Method1382();
      EventManager.register(this);
      if (a.trash() == null) {
         Method1381(new a[5]);
      }

   }

   @EventTarget(0)
   public void Method1378(EventRender2D a) {
      if (Class348.Method368()) {
         Class348.Method366(true);
      }

   }

   @EventTarget(4)
   public void Method1379(EventRender2D a) {
      Method1382();
      ScaledResolution var3 = new ScaledResolution(this.Field1835);
      Hud var4 = (Hud)ModuleManager.getModule(Hud.class);
      SuperPlace var5 = (SuperPlace)ModuleManager.getModule(SuperPlace.class);
      boolean var6 = Hud.Field2369.getBooleanValue() && var4.getState();
      boolean var7 = Hud.Field2370.getBooleanValue() && var4.getState();
      this.Field1837.Method4(var6);
      if (this.Field1837.Method6() > 0.0) {
         this.Method1380();
      }

      this.Field1838.Method4(var7);
      if (this.Field1838.Method6() > 0.0) {
         GL11.glPushMatrix();
         GL11.glTranslatef(80.0F - 80.0F * (float)this.Field1838.Method6(), 0.0F, 0.0F);
         var4.Method1558(var3);
         GL11.glPopMatrix();
      }

      boolean var8 = var5.Field2411.getBooleanValue() && var5.getState() && this.Field1835.thePlayer.getHeldItem() != null && this.Field1835.thePlayer.getHeldItem().getItem() instanceof ItemBlock;
      this.Field1839.Method4(var8);
      if (this.Field1839.Method6() > 0.0) {
         ItemStack var9 = this.Field1835.thePlayer.getHeldItem();
         GL11.glPushMatrix();
         RenderHelper.enableGUIStandardItemLighting();
         int var10 = var3.getScaledWidth() / 2;
         int var11 = var3.getScaledHeight() / 2;
         int var12 = var11 + var5.Field2408.getFloatValue().intValue();
         RenderUtils.Method1145((float)var10, (float)(var12 - 20), (float)this.Field1839.Method6());
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         RenderUtils.Method1103((float)(var10 - 9), (float)(var12 - 29), 18.0F, 18.0F, (new Color(0, 0, 0, 120)).getRGB());
         RenderUtils.Method1103((float)(var10 - 9), (float)(var12 - 30), 18.0F, 1.0F, GlobalModule.Field3143.Method2442());
         this.Field1835.getRenderItem().renderItemAndEffectIntoGUI(var9, var10 - 8, var12 - 28);
         this.Field1835.getRenderItem().renderItemOverlays(this.Field1835.fontRendererObj, var9, var10 - 10, var12 - 29);
         RenderHelper.disableStandardItemLighting();
         GL11.glPopMatrix();
         RenderUtils.Method1146();
      }

      if (((KillAura)ModuleManager.getModule2(KillAura.class)).Field2519.getBooleanValue()) {
         if (KillAura.target != null) {
            this.Field1840 = KillAura.target;
         }

         if (this.Field1840 != null) {
            Class340.Method264(this.Field1840);
         }
      }

      if (GlobalModule.Field3151.isCurrentMode("FoodByte") && !(this.Field1835.currentScreen instanceof Class707) && Objects.nonNull(GlobalModule.INSTANCE.Field3190)) {
         GlobalModule.INSTANCE.Field3190.Method1814();
         GlobalModule.INSTANCE.Field3190.Method1816();
      }

      if (GlobalModule.Field3181.getBooleanValue()) {
         String var13 = "§7Release - §f" + GlobalModule.Field3164 + " §7- §7User - §a" + GlobalModule.INSTANCE.balant.Field2827.Field2840;
         String var14 = "§7Rank - §2" + GlobalModule.INSTANCE.balant.Field2827.Field2839;
         Class565.Field2641.Method1220(var13, (float)var3.getScaledWidth() - Class565.Field2641.Method1225(var13) - 1.0F, (float)(var3.getScaledHeight() - 10), Class681.Method1614(255, 220));
         Class565.Field2641.Method1220(var14, (float)var3.getScaledWidth() - Class565.Field2641.Method1225(var14) - 1.0F, (float)(var3.getScaledHeight() - 8) - Class565.Field2641.Method1228(), Class681.Method1614(255, 220));
      }

      GlobalModule.INSTANCE.Method2012().Method70();
      a.trash(new String[5]);
   }

   private void Method1380() {
      String var1 = "FoodByte§f | " + GlobalModule.INSTANCE.balant.Field2827.Field2840 + "§f | FPS:" + Minecraft.getDebugFPS() + " | §7[§f" + this.Field1836.format(new Date()) + "§7]§r";
      RenderUtils.Method1103(1.0F, 1.0F - Class565.Field2635.Method1228() + Class565.Field2635.Method1228() * (float)this.Field1837.Method6(), Class565.Field2635.Method1225(var1) + 2.0F, Class565.Field2635.Method1228() + 1.0F, (new Color(0, 0, 0, 120)).getRGB());
      RenderUtils.Method1103(1.0F, 1.0F - Class565.Field2635.Method1228() + Class565.Field2635.Method1228() * (float)this.Field1837.Method6(), Class565.Field2635.Method1225(var1) + 2.0F, 1.0F, GlobalModule.Field3143.Method2442());
      Class565.Field2635.Method1217(var1, 2.0F, 2.0F - Class565.Field2635.Method1228() + Class565.Field2635.Method1228() * (float)this.Field1837.Method6(), GlobalModule.Field3143.Method2442());
   }

   public static void Method1381(a[] arr) {
      Field1841 = arr;
   }

   public static a[] Method1382() {
      return Field1841;
   }

   static {
      Method1381(new a[1]);
   }
}
