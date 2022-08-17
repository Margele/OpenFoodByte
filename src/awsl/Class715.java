package awsl;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import trash.foodbyte.utils.RenderUtils;

public class Class715 extends GuiButton {
   Class344 Field3101 = new Class344(10);

   public Class715(int a, int a, int a, String a) {
      super(a, a, a, 200, 20, a);
   }

   public Class715(int a, int a, int a, int a, int a, String a) {
      super(a, a, a, a, a, a);
   }

   public void Method2056(Minecraft a, int a, int a) {
      int[] a = Class713.Method2054();
      if (this.visible) {
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         this.getHoverState(this.hovered = a >= this.xPosition && a >= this.yPosition && a < this.xPosition + this.width && a < this.yPosition + this.height);
         this.Field3101.Method290(this.hovered);
         int a = -263693982;
         this.mouseDragged(a, a, a);
         int a = 14737632;
         if (!this.enabled) {
            a = 10526880;
         }

         if (this.hovered) {
            a = 16777120;
         }

         RenderUtils.Method1103((float)this.xPosition, (float)(this.yPosition + this.height / 2 - 10), (float)this.width, 20.0F, (new Color(0, 153, 255, 100)).getRGB());
         this.drawCenteredString(a.fontRendererObj, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, a);
         int a = Minecraft.getMinecraft().fontRendererObj.getStringWidth(this.displayString);
         RenderUtils.Method1085((double)(this.xPosition + this.width / 2) - this.Field3101.Method292() * (double)this.width / 2.0, (double)(this.yPosition + 22), (double)(this.xPosition + this.width / 2) + this.Field3101.Method292() * (double)this.width / 2.0, (double)(this.yPosition + 22), 1.0F, a);
      }

   }
}
