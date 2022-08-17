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

   public void Method412(int a, int a1) {
      int a = false;
      int a = false;
      int a = false;
      RenderHelper.enableGUIStandardItemLighting();
      boolean a = false;
      Class390.Method1318();
      int a = 9;
      if (a < this.Field1923.thePlayer.inventoryContainer.inventorySlots.Method1799() - 9) {
         Slot a = (Slot)this.Field1923.thePlayer.inventoryContainer.inventorySlots.get(a);
         if (a.getHasStack()) {
            a = true;
         }

         int a = a.xDisplayPosition;
         int a = a.yDisplayPosition;
         this.Field1923.getRenderItem().renderItemAndEffectIntoGUI(a.getStack(), this.Field1907 + a - 6, this.Field1908 + a - 82);
         this.Field1923.getRenderItem().renderItemOverlays(this.Field1923.fontRendererObj, a.getStack(), this.Field1907 + a - 6, this.Field1908 + a - 82);
         ++a;
      }

      this.Field1923.fontRendererObj.drawStringWithShadow("Inventory §7Empty", (float)(this.Field1907 - this.Field1923.fontRendererObj.getStringWidth("Inventory Empty") / 2 + this.Field1909 / 2), (float)(this.Field1908 - this.Field1923.fontRendererObj.FONT_HEIGHT / 2 + this.Field1910 / 2), -1);
      RenderHelper.disableStandardItemLighting();
   }

   public void Method413(int a, int a1, boolean a2) {
   }
}
