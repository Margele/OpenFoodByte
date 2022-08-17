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
      int var2 = (int)this.Field1806;
      int var3 = (int)this.Field1807 + (int)this.Field1812;
      this.Field1815 = 56.0F;
      int var1 = var10000;
      this.Field1814 = 164.0F;
      RenderHelper.enableGUIStandardItemLighting();
      boolean var4 = false;
      int var5 = 9;
      if (var5 < this.Field1808.thePlayer.inventoryContainer.inventorySlots.Method1799() - 9) {
         Slot var6 = (Slot)this.Field1808.thePlayer.inventoryContainer.inventorySlots.get(var5);
         if (var6.getHasStack()) {
            var4 = true;
         }

         int var7 = var6.xDisplayPosition;
         int var8 = var6.yDisplayPosition;
         this.Field1808.getRenderItem().renderItemAndEffectIntoGUI(var6.getStack(), var2 + var7 - 6, var3 + var8 - 82);
         this.Field1808.getRenderItem().renderItemOverlays(this.Field1808.fontRendererObj, var6.getStack(), var2 + var7 - 6, var3 + var8 - 82);
         ++var5;
      }

      RenderHelper.disableStandardItemLighting();
      this.Field1808.fontRendererObj.drawStringWithShadow("Inventory §7Empty", (float)(var2 - this.Field1808.fontRendererObj.getStringWidth("Inventory Empty") / 2) + this.Field1814 / 2.0F, (float)(var3 - this.Field1808.fontRendererObj.FONT_HEIGHT / 2) + this.Field1815 / 2.0F, -1);
      if (a.trash() == null) {
         ++var1;
         Class776.Method1729(var1);
      }

   }
}
