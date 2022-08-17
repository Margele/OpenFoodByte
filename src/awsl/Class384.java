package awsl;

import net.minecraft.client.gui.GuiScreen;
import trash.foodbyte.module.GlobalModule;

public class Class384 extends Class394 {
   private GuiScreen Field1887;

   public Class384(Class381 a, int a, int a, String a, GuiScreen a) {
      this(a, a, a, a, (String)null, a);
   }

   public Class384(Class381 a, int a, int a, String a, String a, GuiScreen a) {
      super(a, a, a, a, a);
      this.Field1887 = a;
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 15;
      this.Field1920 = "ScreenButton";
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      if (this.Field1919.Method1392(a, a - 15) && this.Method1311(a, a)) {
         GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
      }

   }

   protected void Method425() {
      this.Field1923.displayGuiScreen(this.Field1887);
   }

   public void Method414() {
      super.Method414();
   }
}
