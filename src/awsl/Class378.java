package awsl;

import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import native0.Class614;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Mouse;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.impl.world.UHCFastCraft;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class378 extends Class379 {
   private boolean Field1791;
   public int Field1792;
   private boolean Field1793;
   public ItemStack Field1794;
   private boolean Field1795;
   public int Field1796;
   public LinkedHashMap Field1797;
   public int Field1798;
   private boolean Field1799;
   private static final String[] Field1800;
   public Class391 Field1801;
   final UHCFastCraft Field1802;
   private boolean Field1803;
   private static final String[] Field1804;
   public Class391 Field1805;

   static {
      Class614.Method2232(6, Class378.class);
      Method484();
   }

   public void Method476() {
      this.Field1797.clear();
      this.Method478(this.Field1797);
      byte var1 = 4;
      this.Field1796 = 5;
      this.Field1798 = this.Field1796 * var1;
      this.Field1814 = 82.0F;
      this.Field1815 = (float)(var1 * 16 + 16);
   }

   public void Method63() {
      Class492.Method2239();
      GlStateManager.disableDepth();
      Method450();
      RenderUtils.Method1103(this.Field1806, this.Field1807, this.Field1814, this.Field1812, GlobalModule.Field3143.Method2442());
      RenderUtils.Method1103(this.Field1806, this.Field1807 + this.Field1812, this.Field1814, this.Field1815, Field1833.getRGB());
      boolean var2 = !this.Field1823.isEmpty();
      Class565.Field2638.Method1217(this.Field1823, this.Field1806 + this.Field1824, this.Field1807 + this.Field1825, Class681.WHITE.Field2962);
      Class565.Field2636.Method1217(this.Field1816, this.Field1806 + 3.0F + (float)8, this.Field1807 + this.Field1812 / 2.0F - Class565.Field2636.Field2625 / 2.0F, Class681.WHITE.Field2962);
      GlStateManager.enableDepth();
      if (!PermissionManager.canUseFeature(Method482(16542, -25163))) {
         this.Field1808.fontRendererObj.drawStringWithShadow(Method482(16601, 24672), this.Field1806 + this.Field1814 / 2.0F - (float)(this.Field1808.fontRendererObj.getStringWidth(Method482(16609, 12042)) / 2), this.Field1807 + 24.0F + 1.0F, -1);
         this.Field1808.fontRendererObj.drawStringWithShadow(Method482(16549, 16152), this.Field1806 + this.Field1814 / 2.0F - (float)(this.Field1808.fontRendererObj.getStringWidth(Method482(16551, -26844)) / 2), this.Field1807 + 36.0F + 1.0F, -1);
         this.Field1808.fontRendererObj.drawStringWithShadow(Method482(16556, 5550), this.Field1806 + this.Field1814 / 2.0F - (float)(this.Field1808.fontRendererObj.getStringWidth(Method482(16573, -6685)) / 2), this.Field1807 + 48.0F + 1.0F, -1);
         this.Field1808.fontRendererObj.drawStringWithShadow(Method482(16631, 12546), this.Field1806 + this.Field1814 / 2.0F - (float)(this.Field1808.fontRendererObj.getStringWidth(Method482(16550, -24143)) / 2), this.Field1807 + 60.0F + 1.0F, -1);
      } else {
         byte var3 = 13;
         int var4 = (int)((this.Field1814 - (float)(this.Field1796 * 16 + 3)) / 2.0F);
         int var5 = this.Field1792 / this.Field1798;
         int var6 = (new Color(255, 150, 200, 255)).getRGB();
         int var7 = (int)Math.ceil((double)(this.Field1797.size() / this.Field1798)) + 1;
         byte var8 = 16;
         this.Field1794 = null;
         if (this.Field1797.size() > 0) {
            RenderHelper.enableGUIStandardItemLighting();
            int var9 = Math.min(this.Field1797.size() - 1, var5 * this.Field1798);
            if (var9 < Math.min(this.Field1797.size(), (var5 + 1) * this.Field1798)) {
               int var10 = (int)(this.Field1806 + 1.0F + (float)var4 + (float)(var8 * (var9 % this.Field1796)));
               int var11 = (int)(this.Field1807 + (float)var3 + (float)(var8 * (var9 % this.Field1798 / this.Field1796)));
               ItemStack var12 = (ItemStack)this.Field1797.keySet().toArray()[var9];
               if (UHCFastCraft.Method2118(this.Field1802) > var10 && UHCFastCraft.Method2118(this.Field1802) < var10 + 16 && UHCFastCraft.Method2119(this.Field1802) > var11 && UHCFastCraft.Method2119(this.Field1802) < var11 + var8) {
                  RenderUtils.Method1103((float)var10, (float)var11, (float)var8, (float)var8, (new Color(150, 150, 150, 150)).getRGB());
                  this.Field1794 = var12;
               }

               this.Field1808.getRenderItem().renderItemAndEffectIntoGUI(var12, var10, var11);
               this.Field1808.getRenderItem().renderItemOverlays(this.Field1808.fontRendererObj, var12, var10, var11);
               ++var9;
            }

            RenderHelper.disableStandardItemLighting();
         }

         GlStateManager.disableDepth();
         float var13 = this.Field1801.Method1295() + this.Field1801.Method1297() / 2.0F - 2.0F;
         float var14 = this.Field1801.Method1296() + this.Field1801.Method1298() / 2.0F;
         this.Field1801 = new Class391(this.Field1806 + 2.0F, this.Field1807 + this.Field1815 - 2.0F, 12.0F, 12.0F);
         RenderUtils.Method1103(this.Field1801.Method1295(), this.Field1801.Method1296(), this.Field1801.Method1297(), this.Field1801.Method1298(), this.Field1791 ? Class681.Method2699(GlobalModule.Field3143.Method2442(), 15) : GlobalModule.Field3143.Method2442());
         GlStateManager.pushMatrix();
         GlStateManager.translate(var13, var14, 0.0F);
         GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
         RenderUtils.Method1085(-3.0, -3.0, 1.0, 0.0, 1.0F, -1);
         RenderUtils.Method1085(-3.0, 3.0, 1.0, 0.0, 1.0F, -1);
         GlStateManager.translate(-var13, -var14, 0.0F);
         GlStateManager.popMatrix();
         this.Field1805 = new Class391(this.Field1806 + this.Field1814 - 14.0F, this.Field1807 + this.Field1815 - 2.0F, 12.0F, 12.0F);
         RenderUtils.Method1103(this.Field1805.Method1295(), this.Field1805.Method1296(), this.Field1805.Method1297(), this.Field1805.Method1298(), this.Field1803 ? Class681.Method2699(GlobalModule.Field3143.Method2442(), 15) : GlobalModule.Field3143.Method2442());
         var13 = this.Field1805.Method1295() + this.Field1805.Method1297() / 2.0F + 2.0F;
         var14 = this.Field1805.Method1296() + this.Field1805.Method1298() / 2.0F;
         GlStateManager.pushMatrix();
         GlStateManager.translate(var13, var14, 0.0F);
         GlStateManager.rotate(0.0F, 0.0F, 0.0F, 1.0F);
         RenderUtils.Method1085(-3.0, -3.0, 1.0, 0.0, 1.0F, -1);
         RenderUtils.Method1085(-3.0, 3.0, 1.0, 0.0, 1.0F, -1);
         GlStateManager.translate(-var13, -var14, 0.0F);
         GlStateManager.popMatrix();
         String var15 = var5 + 1 + "/" + ((this.Field1797.size() - 1) / this.Field1798 + 1);
         this.Field1808.fontRendererObj.drawStringWithShadow(var15, this.Field1806 + this.Field1814 / 2.0F - (float)(this.Field1808.fontRendererObj.getStringWidth(var15) / 2), this.Field1807 + this.Field1815 + 1.0F, -1);
         GlStateManager.enableDepth();
      }
   }

   private static Exception Method477(Exception exception) {
      return exception;
   }

   @Class628
   public native void Method478(LinkedHashMap linkedHashMap);

   public Class378(UHCFastCraft a, float a, float a, float a, float a, float a, float a, float a) {
      super(Method482(16562, -8555), a, a, a, a, Method482(16621, 29981), "Y", a, a, a);
      this.Field1802 = a;
      this.Field1797 = new LinkedHashMap();
      this.Field1794 = null;
      this.Field1801 = new Class391();
      this.Field1805 = new Class391();
      this.Field1792 = 0;
      this.Method476();
   }

   public void Method64(int a, int a) {
      super.Method64(a, a);
   }

   public void Method479(int a, int a, boolean a) {
      if (this.Field1795 && Mouse.isCreated()) {
         while(Mouse.next()) {
            int var4 = Mouse.getEventDWheel();
            int var5 = this.Field1792 / this.Field1798;
            this.Field1792 = Math.max(0, (var5 - 1) * this.Field1798);
         }
      }

   }

   public void Method480(int a, int a, boolean a) {
      this.Field1795 = this.Method459(a, a);
      this.Field1791 = MathUtils.Method550((float)a, (float)a, this.Field1801) && this.Field1795;
      this.Field1803 = MathUtils.Method550((float)a, (float)a, this.Field1805) && this.Field1795;
      if (!this.Field1793 && Mouse.isButtonDown(0)) {
         if (this.Field1794 != null) {
            Wrapper.INSTANCE.sendPacketNoEvent(new C01PacketChatMessage((String)this.Field1797.get(this.Field1794)));
         }

         int var4 = this.Field1792 / this.Field1798;
         if (this.Field1791) {
            this.Field1792 = Math.max(0, (var4 - 1) * this.Field1798);
         }

         if (this.Field1803) {
            this.Field1792 = Math.min(this.Field1797.size() - 1, (var4 + 1) * this.Field1798);
         }
      }

      this.Field1793 = a;
   }

   public boolean Method456(int a, int a, boolean a) {
      Class492.Method2239();
      boolean var5 = false;
      if (this.Method458(a, a)) {
         if (!this.Field1793) {
            var5 = true;
         }

         boolean var6 = RenderUtils.Method1096((float)a, (float)a, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812);
         boolean var7 = RenderUtils.Method1096((float)a, (float)a, this.Field1806 + this.Field1814 - 8.0F, this.Field1807 + this.Field1812 + this.Field1815 - 8.0F, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815);
         if (!this.Field1793) {
            this.Field1811 = true;
            this.Field1827 = System.currentTimeMillis();
            this.Field1809 = (float)a - this.Field1806;
            this.Field1810 = (float)a - this.Field1807;
         }

         this.Field1811 = false;
         if (this.Field1817 && !this.Field1793) {
            this.Field1822 = true;
            this.Field1827 = System.currentTimeMillis();
            this.Field1809 = (float)a;
            this.Field1810 = (float)a;
         }

         this.Field1822 = false;
         this.Method480(a, a, a);
      }

      if (this.Field1811) {
         this.Field1811 = false;
      }

      if (this.Field1822) {
         this.Field1822 = false;
      }

      this.Method457();
      this.Field1793 = a;
      return var5;
   }

   public ItemStack Method481(String a) {
      try {
         a = a.replace('&', '§');
         Item var2 = new Item();
         String[] var4 = null;
         boolean var5 = true;
         boolean var6 = false;
         byte var7 = 0;
         if (var7 <= Math.min(12, a.length() - 2)) {
            var4 = a.substring(var7).split(Pattern.quote(" "));
            ResourceLocation var8 = new ResourceLocation(var4[0]);
            var2 = (Item)Item.itemRegistry.getObject(var8);
         }

         return null;
      } catch (Exception var10) {
         var10.printStackTrace();
         return null;
      }
   }

   private static String Method482(int integer1, int integer2) {
      int var2 = (integer1 ^ 16593) & '\uffff';
      if (Field1800[var2] == null) {
         char[] var3 = Field1804[var2].toCharArray();
         short var10000;
         switch (var3[0] & 255) {
            case 0:
               var10000 = 246;
               break;
            case 1:
               var10000 = 207;
               break;
            case 2:
               var10000 = 60;
               break;
            case 3:
               var10000 = 196;
               break;
            case 4:
               var10000 = 20;
               break;
            case 5:
               var10000 = 135;
               break;
            case 6:
               var10000 = 64;
               break;
            case 7:
               var10000 = 72;
               break;
            case 8:
               var10000 = 245;
               break;
            case 9:
               var10000 = 169;
               break;
            case 10:
               var10000 = 239;
               break;
            case 11:
               var10000 = 118;
               break;
            case 12:
               var10000 = 208;
               break;
            case 13:
               var10000 = 139;
               break;
            case 14:
               var10000 = 144;
               break;
            case 15:
               var10000 = 22;
               break;
            case 16:
               var10000 = 193;
               break;
            case 17:
               var10000 = 81;
               break;
            case 18:
               var10000 = 234;
               break;
            case 19:
               var10000 = 102;
               break;
            case 20:
               var10000 = 216;
               break;
            case 21:
               var10000 = 166;
               break;
            case 22:
               var10000 = 28;
               break;
            case 23:
               var10000 = 111;
               break;
            case 24:
               var10000 = 26;
               break;
            case 25:
               var10000 = 253;
               break;
            case 26:
               var10000 = 127;
               break;
            case 27:
               var10000 = 162;
               break;
            case 28:
               var10000 = 40;
               break;
            case 29:
               var10000 = 15;
               break;
            case 30:
               var10000 = 188;
               break;
            case 31:
               var10000 = 57;
               break;
            case 32:
               var10000 = 31;
               break;
            case 33:
               var10000 = 88;
               break;
            case 34:
               var10000 = 70;
               break;
            case 35:
               var10000 = 156;
               break;
            case 36:
               var10000 = 178;
               break;
            case 37:
               var10000 = 125;
               break;
            case 38:
               var10000 = 33;
               break;
            case 39:
               var10000 = 251;
               break;
            case 40:
               var10000 = 186;
               break;
            case 41:
               var10000 = 117;
               break;
            case 42:
               var10000 = 247;
               break;
            case 43:
               var10000 = 54;
               break;
            case 44:
               var10000 = 38;
               break;
            case 45:
               var10000 = 179;
               break;
            case 46:
               var10000 = 218;
               break;
            case 47:
               var10000 = 96;
               break;
            case 48:
               var10000 = 250;
               break;
            case 49:
               var10000 = 171;
               break;
            case 50:
               var10000 = 158;
               break;
            case 51:
               var10000 = 152;
               break;
            case 52:
               var10000 = 0;
               break;
            case 53:
               var10000 = 17;
               break;
            case 54:
               var10000 = 180;
               break;
            case 55:
               var10000 = 119;
               break;
            case 56:
               var10000 = 129;
               break;
            case 57:
               var10000 = 47;
               break;
            case 58:
               var10000 = 192;
               break;
            case 59:
               var10000 = 45;
               break;
            case 60:
               var10000 = 191;
               break;
            case 61:
               var10000 = 50;
               break;
            case 62:
               var10000 = 184;
               break;
            case 63:
               var10000 = 198;
               break;
            case 64:
               var10000 = 172;
               break;
            case 65:
               var10000 = 95;
               break;
            case 66:
               var10000 = 138;
               break;
            case 67:
               var10000 = 202;
               break;
            case 68:
               var10000 = 80;
               break;
            case 69:
               var10000 = 164;
               break;
            case 70:
               var10000 = 79;
               break;
            case 71:
               var10000 = 39;
               break;
            case 72:
               var10000 = 242;
               break;
            case 73:
               var10000 = 211;
               break;
            case 74:
               var10000 = 237;
               break;
            case 75:
               var10000 = 249;
               break;
            case 76:
               var10000 = 104;
               break;
            case 77:
               var10000 = 140;
               break;
            case 78:
               var10000 = 86;
               break;
            case 79:
               var10000 = 244;
               break;
            case 80:
               var10000 = 36;
               break;
            case 81:
               var10000 = 201;
               break;
            case 82:
               var10000 = 233;
               break;
            case 83:
               var10000 = 11;
               break;
            case 84:
               var10000 = 66;
               break;
            case 85:
               var10000 = 101;
               break;
            case 86:
               var10000 = 69;
               break;
            case 87:
               var10000 = 19;
               break;
            case 88:
               var10000 = 170;
               break;
            case 89:
               var10000 = 252;
               break;
            case 90:
               var10000 = 219;
               break;
            case 91:
               var10000 = 3;
               break;
            case 92:
               var10000 = 168;
               break;
            case 93:
               var10000 = 53;
               break;
            case 94:
               var10000 = 243;
               break;
            case 95:
               var10000 = 6;
               break;
            case 96:
               var10000 = 62;
               break;
            case 97:
               var10000 = 124;
               break;
            case 98:
               var10000 = 217;
               break;
            case 99:
               var10000 = 143;
               break;
            case 100:
               var10000 = 7;
               break;
            case 101:
               var10000 = 67;
               break;
            case 102:
               var10000 = 210;
               break;
            case 103:
               var10000 = 4;
               break;
            case 104:
               var10000 = 1;
               break;
            case 105:
               var10000 = 94;
               break;
            case 106:
               var10000 = 222;
               break;
            case 107:
               var10000 = 150;
               break;
            case 108:
               var10000 = 189;
               break;
            case 109:
               var10000 = 236;
               break;
            case 110:
               var10000 = 204;
               break;
            case 111:
               var10000 = 209;
               break;
            case 112:
               var10000 = 205;
               break;
            case 113:
               var10000 = 206;
               break;
            case 114:
               var10000 = 116;
               break;
            case 115:
               var10000 = 159;
               break;
            case 116:
               var10000 = 74;
               break;
            case 117:
               var10000 = 136;
               break;
            case 118:
               var10000 = 137;
               break;
            case 119:
               var10000 = 130;
               break;
            case 120:
               var10000 = 9;
               break;
            case 121:
               var10000 = 18;
               break;
            case 122:
               var10000 = 13;
               break;
            case 123:
               var10000 = 91;
               break;
            case 124:
               var10000 = 240;
               break;
            case 125:
               var10000 = 14;
               break;
            case 126:
               var10000 = 212;
               break;
            case 127:
               var10000 = 215;
               break;
            case 128:
               var10000 = 194;
               break;
            case 129:
               var10000 = 2;
               break;
            case 130:
               var10000 = 113;
               break;
            case 131:
               var10000 = 165;
               break;
            case 132:
               var10000 = 90;
               break;
            case 133:
               var10000 = 224;
               break;
            case 134:
               var10000 = 229;
               break;
            case 135:
               var10000 = 30;
               break;
            case 136:
               var10000 = 155;
               break;
            case 137:
               var10000 = 160;
               break;
            case 138:
               var10000 = 12;
               break;
            case 139:
               var10000 = 56;
               break;
            case 140:
               var10000 = 84;
               break;
            case 141:
               var10000 = 133;
               break;
            case 142:
               var10000 = 105;
               break;
            case 143:
               var10000 = 226;
               break;
            case 144:
               var10000 = 203;
               break;
            case 145:
               var10000 = 181;
               break;
            case 146:
               var10000 = 103;
               break;
            case 147:
               var10000 = 149;
               break;
            case 148:
               var10000 = 32;
               break;
            case 149:
               var10000 = 108;
               break;
            case 150:
               var10000 = 35;
               break;
            case 151:
               var10000 = 29;
               break;
            case 152:
               var10000 = 227;
               break;
            case 153:
               var10000 = 61;
               break;
            case 154:
               var10000 = 16;
               break;
            case 155:
               var10000 = 142;
               break;
            case 156:
               var10000 = 49;
               break;
            case 157:
               var10000 = 128;
               break;
            case 158:
               var10000 = 174;
               break;
            case 159:
               var10000 = 187;
               break;
            case 160:
               var10000 = 73;
               break;
            case 161:
               var10000 = 85;
               break;
            case 162:
               var10000 = 5;
               break;
            case 163:
               var10000 = 97;
               break;
            case 164:
               var10000 = 25;
               break;
            case 165:
               var10000 = 161;
               break;
            case 166:
               var10000 = 83;
               break;
            case 167:
               var10000 = 235;
               break;
            case 168:
               var10000 = 157;
               break;
            case 169:
               var10000 = 112;
               break;
            case 170:
               var10000 = 100;
               break;
            case 171:
               var10000 = 59;
               break;
            case 172:
               var10000 = 151;
               break;
            case 173:
               var10000 = 254;
               break;
            case 174:
               var10000 = 87;
               break;
            case 175:
               var10000 = 146;
               break;
            case 176:
               var10000 = 8;
               break;
            case 177:
               var10000 = 213;
               break;
            case 178:
               var10000 = 200;
               break;
            case 179:
               var10000 = 10;
               break;
            case 180:
               var10000 = 115;
               break;
            case 181:
               var10000 = 89;
               break;
            case 182:
               var10000 = 175;
               break;
            case 183:
               var10000 = 241;
               break;
            case 184:
               var10000 = 231;
               break;
            case 185:
               var10000 = 114;
               break;
            case 186:
               var10000 = 163;
               break;
            case 187:
               var10000 = 199;
               break;
            case 188:
               var10000 = 37;
               break;
            case 189:
               var10000 = 42;
               break;
            case 190:
               var10000 = 132;
               break;
            case 191:
               var10000 = 48;
               break;
            case 192:
               var10000 = 232;
               break;
            case 193:
               var10000 = 93;
               break;
            case 194:
               var10000 = 238;
               break;
            case 195:
               var10000 = 145;
               break;
            case 196:
               var10000 = 134;
               break;
            case 197:
               var10000 = 65;
               break;
            case 198:
               var10000 = 71;
               break;
            case 199:
               var10000 = 167;
               break;
            case 200:
               var10000 = 55;
               break;
            case 201:
               var10000 = 82;
               break;
            case 202:
               var10000 = 76;
               break;
            case 203:
               var10000 = 221;
               break;
            case 204:
               var10000 = 34;
               break;
            case 205:
               var10000 = 147;
               break;
            case 206:
               var10000 = 123;
               break;
            case 207:
               var10000 = 197;
               break;
            case 208:
               var10000 = 109;
               break;
            case 209:
               var10000 = 63;
               break;
            case 210:
               var10000 = 110;
               break;
            case 211:
               var10000 = 68;
               break;
            case 212:
               var10000 = 154;
               break;
            case 213:
               var10000 = 41;
               break;
            case 214:
               var10000 = 190;
               break;
            case 215:
               var10000 = 92;
               break;
            case 216:
               var10000 = 75;
               break;
            case 217:
               var10000 = 177;
               break;
            case 218:
               var10000 = 173;
               break;
            case 219:
               var10000 = 23;
               break;
            case 220:
               var10000 = 58;
               break;
            case 221:
               var10000 = 141;
               break;
            case 222:
               var10000 = 126;
               break;
            case 223:
               var10000 = 24;
               break;
            case 224:
               var10000 = 21;
               break;
            case 225:
               var10000 = 185;
               break;
            case 226:
               var10000 = 106;
               break;
            case 227:
               var10000 = 225;
               break;
            case 228:
               var10000 = 98;
               break;
            case 229:
               var10000 = 121;
               break;
            case 230:
               var10000 = 195;
               break;
            case 231:
               var10000 = 248;
               break;
            case 232:
               var10000 = 120;
               break;
            case 233:
               var10000 = 43;
               break;
            case 234:
               var10000 = 27;
               break;
            case 235:
               var10000 = 44;
               break;
            case 236:
               var10000 = 51;
               break;
            case 237:
               var10000 = 77;
               break;
            case 238:
               var10000 = 148;
               break;
            case 239:
               var10000 = 230;
               break;
            case 240:
               var10000 = 153;
               break;
            case 241:
               var10000 = 52;
               break;
            case 242:
               var10000 = 122;
               break;
            case 243:
               var10000 = 182;
               break;
            case 244:
               var10000 = 223;
               break;
            case 245:
               var10000 = 214;
               break;
            case 246:
               var10000 = 255;
               break;
            case 247:
               var10000 = 78;
               break;
            case 248:
               var10000 = 107;
               break;
            case 249:
               var10000 = 99;
               break;
            case 250:
               var10000 = 183;
               break;
            case 251:
               var10000 = 176;
               break;
            case 252:
               var10000 = 131;
               break;
            case 253:
               var10000 = 46;
               break;
            case 254:
               var10000 = 220;
               break;
            default:
               var10000 = 228;
         }

         short var4 = var10000;
         int var5 = (integer2 & 255) - var4;
         var5 += 256;
         int var6 = ((integer2 & '\uffff') >>> 8) - var4;
         var6 += 256;

         for(int var7 = 0; var7 < var3.length; ++var7) {
            int var8 = var7 % 2;
            var3[var7] = (char)(var3[var7] ^ var5);
            var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
         }

         Field1800[var2] = (new String(var3)).intern();
      }

      return Field1800[var2];
   }

   public Slot Method483(GuiContainer a) {
      Slot var2 = null;

      try {
         var2 = (Slot)ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.theSlot.getObfuscatedName()}).get(a);
      } catch (Exception var4) {
      }

      return var2;
   }

   public void Method457() {
      this.Field1795 = false;
      this.Field1791 = false;
      this.Field1803 = false;
      this.Field1793 = false;
   }

   // $FF: synthetic method
   private static native void Method484();
}
