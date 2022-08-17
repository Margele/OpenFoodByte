package trash.foodbyte.module.impl.world;

import awsl.Class363;
import awsl.Class448;
import awsl.Class565;
import awsl.Class628;
import awsl.Class649;
import awsl.Class652;
import eventapi.EventTarget;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import native0.Class614;
import net.minecraft.block.Block;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class XRay extends Module {
   public static HashMap Field2242;
   public BooleanValue Field2243 = new BooleanValue(Method754(-15344, 9070), Method754(-15320, 6478), false, Method754(-15323, -28320));
   private int Field2244 = 3000;
   public FloatValue Field2245 = new FloatValue(Method754(-15344, 9070), Method754(-15308, -307), 3.0, 0.5, 5.0, 0.1, Method754(-15328, 3344));
   public FloatValue Field2246 = new FloatValue(Method754(-15344, 9070), Method754(-15322, -21035), 160.0, 0.0, 255.0, 5.0, Method754(-15316, 1905));
   public BooleanValue Field2247 = new BooleanValue(Method754(-15344, 9070), Method754(-15325, 13773), false, Method754(-15309, 1779));
   public BooleanValue Field2248 = new BooleanValue(Method754(-15344, 9070), Method754(-15315, 10103), true, Method754(-15324, 25838));
   private static final String[] Field2249;
   public FloatValue Field2250 = new FloatValue(Method754(-15344, 9070), Method754(-15339, 24899), 4.0, 0.0, 7.0, 1.0, Method754(-15312, 26101));
   public BooleanValue Field2251 = new BooleanValue(Method754(-15344, 9070), Method754(-15301, 32387), false, Method754(-15297, -10065));
   public BooleanValue Field2252 = new BooleanValue(Method754(-15344, 9070), Method754(-15304, -2288), false, Method754(-15318, 22672));
   private static final ArrayList Field2253;
   public BooleanValue Field2254 = new BooleanValue(Method754(-15344, 9070), Method754(-15319, -29472), false, Method754(-15298, 13315));
   public BooleanValue Field2255 = new BooleanValue(Method754(-15344, 9070), Method754(-15299, -32107), true, Method754(-15321, 20155));
   public BooleanValue Field2256 = new BooleanValue(Method754(-15344, 9070), Method754(-15300, -3639), false, Method754(-15310, -8482));
   public BooleanValue Field2257 = new BooleanValue(Method754(-15344, 9070), Method754(-15306, -26633), true, Method754(-15303, -23980));
   public BooleanValue Field2258 = new BooleanValue(Method754(-15344, 9070), Method754(-15338, -2475), false, Method754(-15307, -1612));
   public BooleanValue Field2259 = new BooleanValue(Method754(-15344, 9070), Method754(-15326, -5781), false, "铁");
   public BooleanValue Field2260 = new BooleanValue(Method754(-15344, 9070), Method754(-15341, -20360), true, Method754(-15337, 25857));
   private static final String[] Field2261;
   public BooleanValue Field2262 = new BooleanValue(Method754(-15344, 9070), Method754(-15314, 5056), false, Method754(-15302, 12991));
   public static ArrayList Field2263;
   private static final Block[] Field2264;
   public FloatValue Field2265 = new FloatValue(Method754(-15344, 9070), Method754(-15342, -25234), 160.0, 0.0, 255.0, 5.0, Method754(-15327, 32092));
   private final Class448 Field2266 = new Class448(this);

   public static void Method2111(double a, double a, double a, double a, int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glColor4f(a, a, a, a);
      RenderUtils.Method1105(a, a, a + a, a + a, a);
   }

   public XRay() {
      super(Method754(-15313, -29943), Category.WORLD);
   }

   public boolean Method2289(BlockPos a) {
      int a = Block.getIdFromBlock(mc.theWorld.getBlockState(a).getBlock());
      if (a == 83 && this.Field2252.getBooleanValue()) {
         return false;
      } else if (a == 16 && this.Field2262.getBooleanValue()) {
         return false;
      } else if (a == 15 && this.Field2259.getBooleanValue()) {
         return false;
      } else if (a == 14 && this.Field2257.getBooleanValue()) {
         return false;
      } else if (a == 56 && this.Field2248.getBooleanValue()) {
         return false;
      } else if (a == 73 && this.Field2256.getBooleanValue()) {
         return false;
      } else if (a == 74 && this.Field2256.getBooleanValue()) {
         return false;
      } else if (a == 129 && this.Field2258.getBooleanValue()) {
         return false;
      } else {
         return a != 21 || !this.Field2254.getBooleanValue();
      }
   }

   private static String Method754(int integer1, int integer2) {
      int var2 = (integer1 ^ -15309) & '\uffff';
      if (Field2261[var2] == null) {
         char[] var3 = Field2249[var2].toCharArray();
         short var10000;
         switch (var3[0] & 255) {
            case 0:
               var10000 = 171;
               break;
            case 1:
               var10000 = 216;
               break;
            case 2:
               var10000 = 229;
               break;
            case 3:
               var10000 = 61;
               break;
            case 4:
               var10000 = 158;
               break;
            case 5:
               var10000 = 243;
               break;
            case 6:
               var10000 = 114;
               break;
            case 7:
               var10000 = 55;
               break;
            case 8:
               var10000 = 56;
               break;
            case 9:
               var10000 = 169;
               break;
            case 10:
               var10000 = 185;
               break;
            case 11:
               var10000 = 99;
               break;
            case 12:
               var10000 = 241;
               break;
            case 13:
               var10000 = 223;
               break;
            case 14:
               var10000 = 72;
               break;
            case 15:
               var10000 = 50;
               break;
            case 16:
               var10000 = 230;
               break;
            case 17:
               var10000 = 74;
               break;
            case 18:
               var10000 = 194;
               break;
            case 19:
               var10000 = 191;
               break;
            case 20:
               var10000 = 107;
               break;
            case 21:
               var10000 = 60;
               break;
            case 22:
               var10000 = 68;
               break;
            case 23:
               var10000 = 31;
               break;
            case 24:
               var10000 = 17;
               break;
            case 25:
               var10000 = 211;
               break;
            case 26:
               var10000 = 240;
               break;
            case 27:
               var10000 = 234;
               break;
            case 28:
               var10000 = 85;
               break;
            case 29:
               var10000 = 34;
               break;
            case 30:
               var10000 = 250;
               break;
            case 31:
               var10000 = 202;
               break;
            case 32:
               var10000 = 138;
               break;
            case 33:
               var10000 = 23;
               break;
            case 34:
               var10000 = 178;
               break;
            case 35:
               var10000 = 95;
               break;
            case 36:
               var10000 = 37;
               break;
            case 37:
               var10000 = 91;
               break;
            case 38:
               var10000 = 93;
               break;
            case 39:
               var10000 = 206;
               break;
            case 40:
               var10000 = 118;
               break;
            case 41:
               var10000 = 203;
               break;
            case 42:
               var10000 = 64;
               break;
            case 43:
               var10000 = 29;
               break;
            case 44:
               var10000 = 217;
               break;
            case 45:
               var10000 = 209;
               break;
            case 46:
               var10000 = 213;
               break;
            case 47:
               var10000 = 8;
               break;
            case 48:
               var10000 = 88;
               break;
            case 49:
               var10000 = 139;
               break;
            case 50:
               var10000 = 228;
               break;
            case 51:
               var10000 = 38;
               break;
            case 52:
               var10000 = 7;
               break;
            case 53:
               var10000 = 227;
               break;
            case 54:
               var10000 = 89;
               break;
            case 55:
               var10000 = 137;
               break;
            case 56:
               var10000 = 152;
               break;
            case 57:
               var10000 = 90;
               break;
            case 58:
               var10000 = 110;
               break;
            case 59:
               var10000 = 109;
               break;
            case 60:
               var10000 = 0;
               break;
            case 61:
               var10000 = 104;
               break;
            case 62:
               var10000 = 218;
               break;
            case 63:
               var10000 = 231;
               break;
            case 64:
               var10000 = 4;
               break;
            case 65:
               var10000 = 251;
               break;
            case 66:
               var10000 = 208;
               break;
            case 67:
               var10000 = 183;
               break;
            case 68:
               var10000 = 116;
               break;
            case 69:
               var10000 = 236;
               break;
            case 70:
               var10000 = 196;
               break;
            case 71:
               var10000 = 166;
               break;
            case 72:
               var10000 = 249;
               break;
            case 73:
               var10000 = 51;
               break;
            case 74:
               var10000 = 163;
               break;
            case 75:
               var10000 = 122;
               break;
            case 76:
               var10000 = 232;
               break;
            case 77:
               var10000 = 188;
               break;
            case 78:
               var10000 = 145;
               break;
            case 79:
               var10000 = 193;
               break;
            case 80:
               var10000 = 1;
               break;
            case 81:
               var10000 = 131;
               break;
            case 82:
               var10000 = 177;
               break;
            case 83:
               var10000 = 174;
               break;
            case 84:
               var10000 = 9;
               break;
            case 85:
               var10000 = 221;
               break;
            case 86:
               var10000 = 180;
               break;
            case 87:
               var10000 = 214;
               break;
            case 88:
               var10000 = 76;
               break;
            case 89:
               var10000 = 22;
               break;
            case 90:
               var10000 = 115;
               break;
            case 91:
               var10000 = 143;
               break;
            case 92:
               var10000 = 94;
               break;
            case 93:
               var10000 = 134;
               break;
            case 94:
               var10000 = 254;
               break;
            case 95:
               var10000 = 83;
               break;
            case 96:
               var10000 = 151;
               break;
            case 97:
               var10000 = 42;
               break;
            case 98:
               var10000 = 245;
               break;
            case 99:
               var10000 = 187;
               break;
            case 100:
               var10000 = 150;
               break;
            case 101:
               var10000 = 79;
               break;
            case 102:
               var10000 = 132;
               break;
            case 103:
               var10000 = 126;
               break;
            case 104:
               var10000 = 168;
               break;
            case 105:
               var10000 = 173;
               break;
            case 106:
               var10000 = 225;
               break;
            case 107:
               var10000 = 130;
               break;
            case 108:
               var10000 = 238;
               break;
            case 109:
               var10000 = 119;
               break;
            case 110:
               var10000 = 190;
               break;
            case 111:
               var10000 = 40;
               break;
            case 112:
               var10000 = 18;
               break;
            case 113:
               var10000 = 124;
               break;
            case 114:
               var10000 = 161;
               break;
            case 115:
               var10000 = 2;
               break;
            case 116:
               var10000 = 36;
               break;
            case 117:
               var10000 = 155;
               break;
            case 118:
               var10000 = 207;
               break;
            case 119:
               var10000 = 16;
               break;
            case 120:
               var10000 = 127;
               break;
            case 121:
               var10000 = 30;
               break;
            case 122:
               var10000 = 78;
               break;
            case 123:
               var10000 = 237;
               break;
            case 124:
               var10000 = 172;
               break;
            case 125:
               var10000 = 32;
               break;
            case 126:
               var10000 = 73;
               break;
            case 127:
               var10000 = 148;
               break;
            case 128:
               var10000 = 128;
               break;
            case 129:
               var10000 = 45;
               break;
            case 130:
               var10000 = 175;
               break;
            case 131:
               var10000 = 204;
               break;
            case 132:
               var10000 = 179;
               break;
            case 133:
               var10000 = 53;
               break;
            case 134:
               var10000 = 156;
               break;
            case 135:
               var10000 = 47;
               break;
            case 136:
               var10000 = 201;
               break;
            case 137:
               var10000 = 235;
               break;
            case 138:
               var10000 = 5;
               break;
            case 139:
               var10000 = 84;
               break;
            case 140:
               var10000 = 81;
               break;
            case 141:
               var10000 = 86;
               break;
            case 142:
               var10000 = 222;
               break;
            case 143:
               var10000 = 244;
               break;
            case 144:
               var10000 = 106;
               break;
            case 145:
               var10000 = 24;
               break;
            case 146:
               var10000 = 149;
               break;
            case 147:
               var10000 = 176;
               break;
            case 148:
               var10000 = 195;
               break;
            case 149:
               var10000 = 125;
               break;
            case 150:
               var10000 = 26;
               break;
            case 151:
               var10000 = 113;
               break;
            case 152:
               var10000 = 65;
               break;
            case 153:
               var10000 = 197;
               break;
            case 154:
               var10000 = 160;
               break;
            case 155:
               var10000 = 246;
               break;
            case 156:
               var10000 = 14;
               break;
            case 157:
               var10000 = 144;
               break;
            case 158:
               var10000 = 57;
               break;
            case 159:
               var10000 = 15;
               break;
            case 160:
               var10000 = 54;
               break;
            case 161:
               var10000 = 103;
               break;
            case 162:
               var10000 = 101;
               break;
            case 163:
               var10000 = 182;
               break;
            case 164:
               var10000 = 135;
               break;
            case 165:
               var10000 = 146;
               break;
            case 166:
               var10000 = 111;
               break;
            case 167:
               var10000 = 35;
               break;
            case 168:
               var10000 = 192;
               break;
            case 169:
               var10000 = 253;
               break;
            case 170:
               var10000 = 255;
               break;
            case 171:
               var10000 = 219;
               break;
            case 172:
               var10000 = 75;
               break;
            case 173:
               var10000 = 39;
               break;
            case 174:
               var10000 = 12;
               break;
            case 175:
               var10000 = 100;
               break;
            case 176:
               var10000 = 82;
               break;
            case 177:
               var10000 = 205;
               break;
            case 178:
               var10000 = 153;
               break;
            case 179:
               var10000 = 215;
               break;
            case 180:
               var10000 = 121;
               break;
            case 181:
               var10000 = 226;
               break;
            case 182:
               var10000 = 252;
               break;
            case 183:
               var10000 = 3;
               break;
            case 184:
               var10000 = 105;
               break;
            case 185:
               var10000 = 239;
               break;
            case 186:
               var10000 = 11;
               break;
            case 187:
               var10000 = 69;
               break;
            case 188:
               var10000 = 200;
               break;
            case 189:
               var10000 = 136;
               break;
            case 190:
               var10000 = 199;
               break;
            case 191:
               var10000 = 43;
               break;
            case 192:
               var10000 = 164;
               break;
            case 193:
               var10000 = 198;
               break;
            case 194:
               var10000 = 20;
               break;
            case 195:
               var10000 = 63;
               break;
            case 196:
               var10000 = 27;
               break;
            case 197:
               var10000 = 102;
               break;
            case 198:
               var10000 = 141;
               break;
            case 199:
               var10000 = 41;
               break;
            case 200:
               var10000 = 212;
               break;
            case 201:
               var10000 = 19;
               break;
            case 202:
               var10000 = 233;
               break;
            case 203:
               var10000 = 186;
               break;
            case 204:
               var10000 = 184;
               break;
            case 205:
               var10000 = 242;
               break;
            case 206:
               var10000 = 66;
               break;
            case 207:
               var10000 = 62;
               break;
            case 208:
               var10000 = 248;
               break;
            case 209:
               var10000 = 92;
               break;
            case 210:
               var10000 = 98;
               break;
            case 211:
               var10000 = 71;
               break;
            case 212:
               var10000 = 28;
               break;
            case 213:
               var10000 = 46;
               break;
            case 214:
               var10000 = 123;
               break;
            case 215:
               var10000 = 112;
               break;
            case 216:
               var10000 = 210;
               break;
            case 217:
               var10000 = 157;
               break;
            case 218:
               var10000 = 108;
               break;
            case 219:
               var10000 = 87;
               break;
            case 220:
               var10000 = 133;
               break;
            case 221:
               var10000 = 224;
               break;
            case 222:
               var10000 = 58;
               break;
            case 223:
               var10000 = 77;
               break;
            case 224:
               var10000 = 48;
               break;
            case 225:
               var10000 = 80;
               break;
            case 226:
               var10000 = 154;
               break;
            case 227:
               var10000 = 247;
               break;
            case 228:
               var10000 = 10;
               break;
            case 229:
               var10000 = 52;
               break;
            case 230:
               var10000 = 129;
               break;
            case 231:
               var10000 = 189;
               break;
            case 232:
               var10000 = 13;
               break;
            case 233:
               var10000 = 142;
               break;
            case 234:
               var10000 = 162;
               break;
            case 235:
               var10000 = 44;
               break;
            case 236:
               var10000 = 49;
               break;
            case 237:
               var10000 = 59;
               break;
            case 238:
               var10000 = 70;
               break;
            case 239:
               var10000 = 140;
               break;
            case 240:
               var10000 = 25;
               break;
            case 241:
               var10000 = 170;
               break;
            case 242:
               var10000 = 67;
               break;
            case 243:
               var10000 = 147;
               break;
            case 244:
               var10000 = 120;
               break;
            case 245:
               var10000 = 96;
               break;
            case 246:
               var10000 = 6;
               break;
            case 247:
               var10000 = 167;
               break;
            case 248:
               var10000 = 220;
               break;
            case 249:
               var10000 = 33;
               break;
            case 250:
               var10000 = 117;
               break;
            case 251:
               var10000 = 21;
               break;
            case 252:
               var10000 = 165;
               break;
            case 253:
               var10000 = 181;
               break;
            case 254:
               var10000 = 159;
               break;
            default:
               var10000 = 97;
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

         Field2261[var2] = (new String(var3)).intern();
      }

      return Field2261[var2];
   }

   private void Method2096(BlockPos a) {
      float a = ReflectionUtils.getRenderPartialTicks();
      double a = (double)a.getX() - mc.getRenderManager().viewerPosX + 0.5;
      double a = (double)a.getY() - mc.getRenderManager().viewerPosY + 0.5;
      double a = (double)a.getZ() - mc.getRenderManager().viewerPosZ + 0.5;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      Class448.trash();
      GL11.glDisable(2929);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
      float var10000 = (float)(mc.thePlayer.posX - (double)a.getX());
      var10000 = (float)(mc.thePlayer.posY - (double)a.getY());
      var10000 = (float)(mc.thePlayer.posZ - (double)a.getZ());
      int a = Block.getIdFromBlock(mc.theWorld.getBlockState(a).getBlock());
      float a = this.Field2246.getFloatValue() / 255.0F;
      if (a == 83) {
         GL11.glColor4f(0.38039216F, 0.63529414F, 0.15686275F, a);
      }

      if (a == 16) {
         GL11.glColor4f(0.047058824F, 0.047058824F, 0.047058824F, a);
      }

      if (a == 15) {
         GL11.glColor4f(0.8235294F, 0.8235294F, 0.8235294F, a);
      }

      if (a == 14) {
         GL11.glColor4f(1.0F, 1.0F, 0.0F, a);
      }

      if (a == 56) {
         GL11.glColor4f(0.0F, 0.78431374F, 0.78431374F, a);
      }

      if (a == 73) {
         GL11.glColor4f(1.0F, 0.0F, 0.0F, a);
      }

      if (a == 74) {
         GL11.glColor4f(1.0F, 0.0F, 0.0F, a);
      }

      if (a == 129) {
         GL11.glColor4f(0.0F, 0.7921569F, 0.1882353F, a);
      }

      if (a == 21) {
         GL11.glColor4f(0.0F, 0.0F, 0.3882353F, a);
      }

      GL11.glLoadIdentity();
      boolean a = mc.gameSettings.viewBobbing;
      mc.gameSettings.viewBobbing = false;
      ReflectionUtils.setOrientCamera(a);
      GL11.glBegin(3);
      GL11.glVertex3d(0.0, (double)mc.thePlayer.getEyeHeight(), 0.0);
      GL11.glVertex3d(a, a, a);
      GL11.glVertex3d(a, a, a);
      GL11.glEnd();
      mc.gameSettings.viewBobbing = a;
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   @EventTarget
   public void Method2290(Class652 a) {
      BlockPos a = new BlockPos(a.Field2924.getX(), a.Field2924.getY(), a.Field2924.getZ());
      if ((this.Field2247.getBooleanValue() || this.Field2251.getBooleanValue()) && !Field2263.contains(a) && this.Method2291(a) < (mc.thePlayer.posY > 60.0 ? 50.0 : 60.0) && Field2253.contains(Block.getIdFromBlock(mc.theWorld.getBlockState(a).getBlock()))) {
         Field2263.Method2530(a);
      }

   }

   @EventTarget
   public void Method810(EventRender2D a) {
      this.Field2244 = (int)(this.Field2245.getFloatValue() * 1000.0F);
      if (!ServerUtils.isPlayingMegaWalls() && this.Field2260.getBooleanValue() && mc.thePlayer.posY <= 25.0) {
         if (this.Field2266.Method2455((long)this.Field2244)) {
            this.Method258();
            this.Field2266.Method2456();
         }

         float a = (float)this.Field2266.Method2459();
         ScaledResolution a = new ScaledResolution(mc);
         Color a = a >= 0.0F ? RenderUtils.Method1139(new float[]{0.0F, 0.5F, 1.0F}, new Color[]{Color.RED, Color.YELLOW, new Color(0, 153, 255)}, a / (float)this.Field2244).brighter() : Color.RED;
         Method2111((double)a.getScaledWidth() / 2.0 - 60.5, (double)a.getScaledHeight() - 70.5, 121.0, 3.0, (new Color(0, 0, 0, 150)).getRGB());
         Method2111((double)a.getScaledWidth() / 2.0 - 60.0, (double)a.getScaledHeight() - 70.0, 120.0 * (double)(a / (float)this.Field2244), 2.0, a.getRGB());
         Class565.Field2636.Method1222(Method754(-15305, -4127), (float)a.getScaledWidth() / 2.0F, (float)(a.getScaledHeight() - 79), -1);
         Class565.Field2636.Method1217(BigDecimal.valueOf((double)(((float)this.Field2244 - a) / 1000.0F)).setScale(1, 4) + "s", (float)a.getScaledWidth() / 2.0F - Class565.Field2636.Method1225(BigDecimal.valueOf((double)(((float)this.Field2244 - a) / 1000.0F)).setScale(1, 4) + "s") + 60.0F, (float)(a.getScaledHeight() - 79), -1);
      }

   }

   static {
      Class614.Method2232(11, XRay.class);
      Method2065();
   }

   @EventTarget
   public void Method1625(Class649 a) {
      if (this.Field2247.getBooleanValue() || this.Field2251.getBooleanValue()) {
         BlockPos a = new BlockPos(a.Method3513(), a.Method3542(), a.Method3543());
         if (Block.getIdFromBlock(mc.theWorld.getBlockState(a).getBlock()) == 83 && !Field2263.contains(a)) {
            Field2263.Method2530(a);
         }
      }

   }

   public void onDisable() {
      Class363.Field1713 = false;
      Field2263.clear();
      Field2242.clear();
      if (this.Method1026()) {
         mc.renderGlobal.loadRenderers();
      }
   }

   @EventTarget
   public void Method801(EventTickUpdate a) {
      for(int a = 0; a < Field2263.Method1799(); ++a) {
         BlockPos a = (BlockPos)Field2263.get(a);
         int a = Block.getIdFromBlock(mc.theWorld.getBlockState(a).getBlock());
         if (!Field2253.contains(a)) {
            Field2263.remove(a);
         }
      }

   }

   @Class628
   public native void Method258();

   public void onEnable() {
      if (!GlobalModule.Field3188) {
         ChatUtils.addChatMessage(Method754(-15311, -19201));
         ChatUtils.addChatMessage(Method754(-15343, 2588));
         this.setState(false);
      } else {
         Field2263.clear();
         Field2242.clear();
         Class363.Field1722 = this.Field2243.getBooleanValue();
         Class363.Field1721 = this.Field2255.getBooleanValue();
         Class363.Field1719 = this.Field2265.getFloatValue().intValue();
         Class363.Field1713 = true;
         this.Field2266.Method2457((long)(this.Field2245.getFloatValue() * 1000.0F));
         if (this.Method1026()) {
            mc.renderGlobal.loadRenderers();
            int a = (int)mc.thePlayer.posX;
            int a = (int)mc.thePlayer.posY;
            int a = (int)mc.thePlayer.posZ;
            mc.renderGlobal.markBlockRangeForRenderUpdate(a - 900, a - 900, a - 900, a + 900, a + 900, a + 900);
         }
      }
   }

   private void Method1178(BlockPos a) {
      double a = (double)a.getX() - mc.getRenderManager().viewerPosX;
      double a = (double)a.getY() - mc.getRenderManager().viewerPosY;
      double a = (double)a.getZ() - mc.getRenderManager().viewerPosZ;
      int a = Block.getIdFromBlock(mc.theWorld.getBlockState(a).getBlock());
      float a = this.Field2246.getFloatValue() / 255.0F;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(1.0F);
      if (a == 83) {
         GL11.glColor4f(0.38039216F, 0.63529414F, 0.15686275F, a);
      } else if (a == 16) {
         GL11.glColor4f(0.047058824F, 0.047058824F, 0.047058824F, a);
      } else if (a == 15) {
         GL11.glColor4f(0.8235294F, 0.8235294F, 0.8235294F, a);
      } else if (a == 14) {
         GL11.glColor4f(1.0F, 1.0F, 0.0F, a);
      } else if (a == 56) {
         GL11.glColor4f(0.0F, 0.78431374F, 0.78431374F, a);
      } else if (a == 73) {
         GL11.glColor4f(1.0F, 0.0F, 0.0F, a);
      } else if (a == 74) {
         GL11.glColor4f(1.0F, 0.0F, 0.0F, a);
      } else if (a == 129) {
         GL11.glColor4f(0.0F, 0.7921569F, 0.1882353F, a);
      } else if (a == 21) {
         GL11.glColor4f(0.0F, 0.0F, 0.3882353F, a);
      }

      RenderUtils.Method1098(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   @EventTarget
   public void Method802(EventRender3D a) {
      Iterator var2;
      BlockPos a;
      if (this.Field2247.getBooleanValue()) {
         var2 = Field2263.Method1383();

         while(var2.Method932()) {
            a = (BlockPos)var2.Method933();
            if (!this.Method2289(a)) {
               this.Method1178(a);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }
         }
      }

      if (this.Field2251.getBooleanValue()) {
         var2 = Field2263.Method1383();

         while(var2.Method932()) {
            a = (BlockPos)var2.Method933();
            if (!this.Method2289(a)) {
               this.Method2096(a);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }
         }
      }

   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (a.getPacket() instanceof S07PacketRespawn || a.getPacket() instanceof S02PacketLoginSuccess) {
         Field2263.clear();
         Field2242.clear();
      }

   }

   public String getDescription() {
      return Method754(-15317, -16147);
   }

   public double Method2291(BlockPos a) {
      float a = (float)(mc.thePlayer.posX - (double)a.getX());
      float var10000 = (float)(mc.thePlayer.posY - (double)a.getY());
      float a = (float)(mc.thePlayer.posZ - (double)a.getZ());
      float a = MathHelper.sqrt_float(a * a + 0.0F + a * a);
      return (double)a;
   }

   // $FF: synthetic method
   private static native void Method2065();
}
