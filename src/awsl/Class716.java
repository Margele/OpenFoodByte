package awsl;

import com.google.common.collect.Lists;
import com.google.common.collect.ObjectArrays;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.network.play.client.C14PacketTabComplete;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import trash.foodbyte.reflections.Wrapper;

@SideOnly(Side.CLIENT)
public class Class716 extends GuiChat {
   private static final Logger Field3102 = LogManager.getLogger();
   private String Field3103 = "";
   private int Field3104 = -1;
   private boolean Field3105;
   private boolean Field3106;
   private int Field3107;
   private List Field3108 = Lists.newArrayList();
   protected GuiTextField Field3109;
   private String Field3110 = "";

   public Class716() {
   }

   public Class716(String a) {
      this.Field3110 = a;
   }

   public void Method1801() {
      Keyboard.enableRepeatEvents(true);
      this.Field3104 = this.mc.ingameGUI.getChatGUI().getSentMessages().Method1799();
      this.Field3109 = new GuiTextField(0, this.fontRendererObj, 4, this.height - 12, this.width - 4, 12);
      this.Field3109.setMaxStringLength(100);
      this.Field3109.setEnableBackgroundDrawing(false);
      this.Field3109.setFocused(true);
      this.Field3109.setText(this.Field3110);
      this.Field3109.setCanLoseFocus(false);
   }

   public void Method1806() {
      Keyboard.enableRepeatEvents(false);
      this.mc.ingameGUI.getChatGUI().resetScroll();
   }

   public void Method1807() {
      this.Field3109.updateCursorCounter();
   }

   protected void Method1804(char a, int a) throws IOException {
      this.Field3106 = false;
      if (a == 15) {
         this.Method2059();
      } else {
         this.Field3105 = false;
      }

      if (a == 1) {
         this.mc.displayGuiScreen((GuiScreen)null);
      } else if (a != 28 && a != 156) {
         if (a == 200) {
            this.Method2061(-1);
         } else if (a == 208) {
            this.Method2061(1);
         } else if (a == 201) {
            this.mc.ingameGUI.getChatGUI().scroll(this.mc.ingameGUI.getChatGUI().getLineCount() - 1);
         } else if (a == 209) {
            this.mc.ingameGUI.getChatGUI().scroll(-this.mc.ingameGUI.getChatGUI().getLineCount() + 1);
         } else {
            this.Field3109.textboxKeyTyped(a, a);
         }
      } else {
         String a = this.Field3109.getText().trim();
         if (a.length() > 0) {
            this.sendChatMessage(a);
         }

         this.mc.displayGuiScreen((GuiScreen)null);
      }

   }

   public void Method1822() throws IOException {
      super.Method1822();
      int a = Mouse.getEventDWheel();
      if (a > 1) {
         a = 1;
      }

      if (a < -1) {
         a = -1;
      }

      if (!isShiftKeyDown()) {
         a *= 7;
      }

      this.mc.ingameGUI.getChatGUI().scroll(a);
   }

   protected void Method1805(int a, int a, int a) throws IOException {
      IChatComponent a = this.mc.ingameGUI.getChatGUI().getChatComponent(Mouse.getX(), Mouse.getY());
      if (!this.handleComponentClick(a)) {
         this.Field3109.mouseClicked(a, a, a);
         super.Method1805(a, a, a);
      }
   }

   public void Method2058(String a, boolean a1) {
      this.Field3109.setText(a);
   }

   public void Method2059() {
      String a;
      label32: {
         int[] a = Class713.Method2054();
         if (this.Field3105) {
            this.Field3109.deleteFromCursor(this.Field3109.func_146197_a(-1, this.Field3109.getCursorPosition(), false) - this.Field3109.getCursorPosition());
            if (this.Field3107 < this.Field3108.Method1799()) {
               break label32;
            }

            this.Field3107 = 0;
         }

         int a = this.Field3109.func_146197_a(-1, this.Field3109.getCursorPosition(), false);
         this.Field3108.clear();
         this.Field3107 = 0;
         String a = this.Field3109.getText().substring(a).toLowerCase();
         a = this.Field3109.getText().substring(0, this.Field3109.getCursorPosition());
         this.Method2060(a, a);
         if (this.Field3108.isEmpty()) {
            return;
         }

         this.Field3105 = true;
         this.Field3109.deleteFromCursor(a - this.Field3109.getCursorPosition());
      }

      if (this.Field3108.Method1799() > 1) {
         StringBuilder a = new StringBuilder();
         Iterator var6 = this.Field3108.Method1383();
         if (var6.Method932()) {
            a = (String)var6.Method933();
            if (a.length() > 0) {
               a.append(", ");
            }

            a.append(a);
         }

         this.mc.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion(new ChatComponentText(a.toString()), 1);
      }

      this.Field3109.writeText(EnumChatFormatting.getTextWithoutFormattingCodes((String)this.Field3108.get(this.Field3107++)));
   }

   private void Method2060(String a, String a) {
      if (a.length() >= 1) {
         ClientCommandHandler.instance.autoComplete(a, a);
         BlockPos a = null;
         if (this.mc.objectMouseOver != null && this.mc.objectMouseOver.typeOfHit == MovingObjectType.BLOCK) {
            a = this.mc.objectMouseOver.getBlockPos();
         }

         Wrapper.INSTANCE.sendPacket(new C14PacketTabComplete(a, a));
         this.Field3106 = true;
      }

   }

   public void Method2061(int a) {
      int a = this.Field3104 + a;
      int a = this.mc.ingameGUI.getChatGUI().getSentMessages().Method1799();
      a = MathHelper.clamp_int(a, 0, a);
      if (a != this.Field3104) {
         if (a == a) {
            this.Field3104 = a;
            this.Field3109.setText(this.Field3103);
         } else {
            if (this.Field3104 == a) {
               this.Field3103 = this.Field3109.getText();
            }

            this.Field3109.setText((String)this.mc.ingameGUI.getChatGUI().getSentMessages().get(a));
            this.Field3104 = a;
         }
      }

   }

   public void Method1803(int a, int a, float a) {
      drawRect(2, this.height - 14, this.width - 2, this.height - 2, Integer.MIN_VALUE);
      this.Field3109.drawTextBox();
      IChatComponent a = this.mc.ingameGUI.getChatGUI().getChatComponent(Mouse.getX(), Mouse.getY());
      if (a.getChatStyle().getChatHoverEvent() != null) {
         this.handleComponentHover(a, a, a);
      }

      super.Method1803(a, a, a);
   }

   public void Method2062(String[] a) {
      int[] a = Class713.Method2054();
      if (this.Field3106) {
         this.Field3105 = false;
         this.Field3108.clear();
         String[] a = ClientCommandHandler.instance.latestAutoComplete;
         a = (String[])ObjectArrays.concat(a, a, String.class);
         int var5 = a.length;
         int var6 = 0;
         if (var6 < var5) {
            String a = a[var6];
            if (a.length() > 0) {
               this.Field3108.Method2530(a);
            }

            ++var6;
         }

         String a = this.Field3109.getText().substring(this.Field3109.func_146197_a(-1, this.Field3109.getCursorPosition(), false));
         String a = StringUtils.getCommonPrefix(a);
         a = EnumChatFormatting.getTextWithoutFormattingCodes(a);
         if (a.length() > 0 && !a.equalsIgnoreCase(a)) {
            this.Field3109.deleteFromCursor(this.Field3109.func_146197_a(-1, this.Field3109.getCursorPosition(), false) - this.Field3109.getCursorPosition());
            this.Field3109.writeText(a);
         }

         if (this.Field3108.Method1799() > 0) {
            this.Field3105 = true;
            this.Method2059();
         }
      }

   }

   public boolean Method1812() {
      return false;
   }

   private static IOException Method1815(IOException iOException) {
      return iOException;
   }
}
