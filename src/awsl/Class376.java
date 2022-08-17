package awsl;

import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.Slot;

public class Class376 extends Class390 {
   public Class376(Class381 a, int a, int a) {
      super(a, a, a, "PlayerInventory", (String)null);
      this.Field1909 = 164;
      this.Field1910 = 56;
      this.Field1920 = "PlayerInventory";
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
   }

   public void Method412(int a, int a) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      RenderHelper.enableGUIStandardItemLighting();
      boolean var7 = false;
      Class390.Method1318();
      int var8 = 9;
      if (var8 < this.Field1923.thePlayer.inventoryContainer.inventorySlots.Method1799() - 9) {
         Slot var9 = (Slot)this.Field1923.thePlayer.inventoryContainer.inventorySlots.get(var8);
         if (var9.getHasStack()) {
            var7 = true;
         }

         int var10 = var9.xDisplayPosition;
         int var11 = var9.yDisplayPosition;
         this.Field1923.getRenderItem().renderItemAndEffectIntoGUI(var9.getStack(), this.Field1907 + var10 - 6, this.Field1908 + var11 - 82);
         this.Field1923.getRenderItem().renderItemOverlays(this.Field1923.fontRendererObj, var9.getStack(), this.Field1907 + var10 - 6, this.Field1908 + var11 - 82);
         ++var8;
      }

      this.Field1923.fontRendererObj.drawStringWithShadow("Inventory §7Empty", (float)(this.Field1907 - this.Field1923.fontRendererObj.getStringWidth("Inventory Empty") / 2 + this.Field1909 / 2), (float)(this.Field1908 - this.Field1923.fontRendererObj.FONT_HEIGHT / 2 + this.Field1910 / 2), -1);
      RenderHelper.disableStandardItemLighting();
   }

   public void Method413(int a, int a, boolean a) {
   }
}
