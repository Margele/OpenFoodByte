package awsl;

import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.Slot;
import obfuscate.a;

public class Class373 extends Class379 {
   public float Field1762;

   public Class373() {
      this(5.0F, 100.0F, 180.0F, 62.0F, 12.0F, 1.0F, 0.5F);
   }

   public Class373(float a, float a, float a, float a, float a, float a, float a) {
      super("PlayerInventory", a, a, a, a, "Inventory", "Y", a, a, a);
      this.Field1762 = 0.0F;
   }

   public void Method63() {
      int var10000 = Class776.Method1730();
      super.Method63();
      int a = (int)this.Field1806;
      int a = (int)this.Field1807 + (int)this.Field1812;
      this.Field1815 = 56.0F;
      int a = var10000;
      this.Field1814 = 164.0F;
      RenderHelper.enableGUIStandardItemLighting();
      boolean a = false;
      int a = 9;
      if (a < this.Field1808.thePlayer.inventoryContainer.inventorySlots.Method1799() - 9) {
         Slot a = (Slot)this.Field1808.thePlayer.inventoryContainer.inventorySlots.get(a);
         if (a.getHasStack()) {
            a = true;
         }

         int a = a.xDisplayPosition;
         int a = a.yDisplayPosition;
         this.Field1808.getRenderItem().renderItemAndEffectIntoGUI(a.getStack(), a + a - 6, a + a - 82);
         this.Field1808.getRenderItem().renderItemOverlays(this.Field1808.fontRendererObj, a.getStack(), a + a - 6, a + a - 82);
         ++a;
      }

      RenderHelper.disableStandardItemLighting();
      this.Field1808.fontRendererObj.drawStringWithShadow("Inventory §7Empty", (float)(a - this.Field1808.fontRendererObj.getStringWidth("Inventory Empty") / 2) + this.Field1814 / 2.0F, (float)(a - this.Field1808.fontRendererObj.FONT_HEIGHT / 2) + this.Field1815 / 2.0F, -1);
      if (a.trash() == null) {
         ++a;
         Class776.Method1729(a);
      }

   }
}
