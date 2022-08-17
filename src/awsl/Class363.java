package awsl;

import com.google.common.base.Predicates;
import com.mojang.authlib.GameProfile;
import eventapi.EventManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import native0.Class614;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.init.Items;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.module.impl.combat.HitBox;
import trash.foodbyte.module.impl.combat.KeepSprint;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.module.impl.combat.Reach;
import trash.foodbyte.module.impl.movement.NoSlowDown;
import trash.foodbyte.module.impl.player.NameProtect;
import trash.foodbyte.module.impl.render.BlockOverlay;
import trash.foodbyte.module.impl.render.FullBright;
import trash.foodbyte.module.impl.render.ItemRender;
import trash.foodbyte.module.impl.render.NameTag;
import trash.foodbyte.module.impl.render.NoFov;
import trash.foodbyte.module.impl.render.NoHurtcam;
import trash.foodbyte.module.impl.render.Perspective;
import trash.foodbyte.module.impl.render.ViewClip;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class363 {
   public static boolean Field1713;
   private static Entity Field1714;
   public static Minecraft Field1715;
   private static Class Field1716;
   private static final String[] Field1717;
   public static ArrayList Field1718;
   public static int Field1719;
   private static final String[] Field1720;
   public static Boolean Field1721;
   public static boolean Field1722;
   private static long Field1723;

   public static boolean Method584(IBlockAccess a, BlockPos a, EnumFacing a, double[] a) {
      return a == EnumFacing.DOWN && a[1] > 0.0 || a == EnumFacing.UP && a[4] < 1.0 || a == EnumFacing.NORTH && a[2] > 0.0 || a == EnumFacing.SOUTH && a[5] < 1.0 || a == EnumFacing.WEST && a[0] > 0.0 || a == EnumFacing.EAST && a[3] < 1.0 || !a.getBlockState(a).getBlock().isOpaqueCube();
   }

   public static void Method585(RenderManager a, float a) {
      float a;
      if (Perspective.Field2203) {
         a = Perspective.Field2200;
      } else {
         a = a;
      }

      a.playerViewY = a;
   }

   public static boolean Method586() {
      return ModuleManager.getModule(NoHurtcam.class).getState();
   }

   public static boolean Method587() {
      return ModuleManager.getModule(FullBright.class).getState();
   }

   public static boolean Method588() {
      return ModuleManager.getModule(BlockOverlay.class).getState();
   }

   public static String Method589() {
      String a = null;
      if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
         Iterator var1 = Minecraft.getMinecraft().thePlayer.sendQueue.getPlayerInfoMap().Method1383();

         while(var1.Method932()) {
            NetworkPlayerInfo a = (NetworkPlayerInfo)var1.Method933();
            GameProfile a = a.getGameProfile();
            if (a.getId() != null && a.getId().equals(Minecraft.getMinecraft().getSession().getProfile().getId()) && !a.getName().equalsIgnoreCase(Minecraft.getMinecraft().getSession().getProfile().getName())) {
               a = a.getName();
            }
         }
      }

      return a;
   }

   public static void Method590() {
      if (GlobalModule.Field3151.isCurrentMode(Method598(-7086, -24105)) && !(Minecraft.getMinecraft().currentScreen instanceof Class707)) {
      }

   }

   public static boolean Method591() {
      return ModuleManager.getModule(ViewClip.class).getState();
   }

   public static boolean Method592() {
      return GlobalModule.Field3153.getBooleanValue();
   }

   public static void Method593(RenderManager a, float a) {
      float a;
      if (Perspective.Field2203) {
         a = Perspective.Field2201;
      } else {
         a = a;
      }

      a.playerViewX = a;
   }

   public static boolean Method594() {
      return Field1713;
   }

   public static boolean Method595() {
      return GlobalModule.Field3174.getBooleanValue();
   }

   public static float Method596(Entity a) {
      if (!a.equals(Field1715.thePlayer)) {
         return a.rotationPitch;
      } else {
         return Perspective.Field2203 ? Perspective.Field2201 : Field1715.thePlayer.rotationPitch;
      }
   }

   public static boolean Method597(IBlockAccess a, BlockPos a, EnumFacing a, Object a, double[] a) {
      if (Field1713 && Field1718.contains((Block)a)) {
         if (!Field1721) {
            return true;
         } else {
            EnumFacing[] var5 = EnumFacing.VALUES;
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               EnumFacing a = var5[var7];
               if (Method584(a, a.offset(a), a, a)) {
                  return Field1722 || Method584(a, a, a, a);
               }
            }

            return false;
         }
      } else {
         return Method584(a, a, a, a);
      }
   }

   private static String Method598(int integer1, int integer2) {
      int var2 = (integer1 ^ -7102) & '\uffff';
      if (Field1720[var2] == null) {
         char[] var3 = Field1717[var2].toCharArray();
         short var10000;
         switch (var3[0] & 255) {
            case 0:
               var10000 = 160;
               break;
            case 1:
               var10000 = 191;
               break;
            case 2:
               var10000 = 216;
               break;
            case 3:
               var10000 = 177;
               break;
            case 4:
               var10000 = 186;
               break;
            case 5:
               var10000 = 255;
               break;
            case 6:
               var10000 = 92;
               break;
            case 7:
               var10000 = 61;
               break;
            case 8:
               var10000 = 111;
               break;
            case 9:
               var10000 = 140;
               break;
            case 10:
               var10000 = 147;
               break;
            case 11:
               var10000 = 62;
               break;
            case 12:
               var10000 = 88;
               break;
            case 13:
               var10000 = 199;
               break;
            case 14:
               var10000 = 130;
               break;
            case 15:
               var10000 = 8;
               break;
            case 16:
               var10000 = 149;
               break;
            case 17:
               var10000 = 237;
               break;
            case 18:
               var10000 = 13;
               break;
            case 19:
               var10000 = 66;
               break;
            case 20:
               var10000 = 137;
               break;
            case 21:
               var10000 = 132;
               break;
            case 22:
               var10000 = 206;
               break;
            case 23:
               var10000 = 230;
               break;
            case 24:
               var10000 = 152;
               break;
            case 25:
               var10000 = 158;
               break;
            case 26:
               var10000 = 42;
               break;
            case 27:
               var10000 = 80;
               break;
            case 28:
               var10000 = 118;
               break;
            case 29:
               var10000 = 244;
               break;
            case 30:
               var10000 = 31;
               break;
            case 31:
               var10000 = 201;
               break;
            case 32:
               var10000 = 6;
               break;
            case 33:
               var10000 = 139;
               break;
            case 34:
               var10000 = 74;
               break;
            case 35:
               var10000 = 114;
               break;
            case 36:
               var10000 = 121;
               break;
            case 37:
               var10000 = 17;
               break;
            case 38:
               var10000 = 196;
               break;
            case 39:
               var10000 = 197;
               break;
            case 40:
               var10000 = 165;
               break;
            case 41:
               var10000 = 161;
               break;
            case 42:
               var10000 = 67;
               break;
            case 43:
               var10000 = 157;
               break;
            case 44:
               var10000 = 11;
               break;
            case 45:
               var10000 = 188;
               break;
            case 46:
               var10000 = 233;
               break;
            case 47:
               var10000 = 54;
               break;
            case 48:
               var10000 = 127;
               break;
            case 49:
               var10000 = 53;
               break;
            case 50:
               var10000 = 27;
               break;
            case 51:
               var10000 = 36;
               break;
            case 52:
               var10000 = 87;
               break;
            case 53:
               var10000 = 107;
               break;
            case 54:
               var10000 = 245;
               break;
            case 55:
               var10000 = 52;
               break;
            case 56:
               var10000 = 145;
               break;
            case 57:
               var10000 = 39;
               break;
            case 58:
               var10000 = 171;
               break;
            case 59:
               var10000 = 153;
               break;
            case 60:
               var10000 = 99;
               break;
            case 61:
               var10000 = 10;
               break;
            case 62:
               var10000 = 89;
               break;
            case 63:
               var10000 = 131;
               break;
            case 64:
               var10000 = 57;
               break;
            case 65:
               var10000 = 7;
               break;
            case 66:
               var10000 = 142;
               break;
            case 67:
               var10000 = 34;
               break;
            case 68:
               var10000 = 252;
               break;
            case 69:
               var10000 = 224;
               break;
            case 70:
               var10000 = 77;
               break;
            case 71:
               var10000 = 154;
               break;
            case 72:
               var10000 = 40;
               break;
            case 73:
               var10000 = 238;
               break;
            case 74:
               var10000 = 41;
               break;
            case 75:
               var10000 = 37;
               break;
            case 76:
               var10000 = 120;
               break;
            case 77:
               var10000 = 69;
               break;
            case 78:
               var10000 = 64;
               break;
            case 79:
               var10000 = 156;
               break;
            case 80:
               var10000 = 81;
               break;
            case 81:
               var10000 = 91;
               break;
            case 82:
               var10000 = 86;
               break;
            case 83:
               var10000 = 122;
               break;
            case 84:
               var10000 = 181;
               break;
            case 85:
               var10000 = 96;
               break;
            case 86:
               var10000 = 78;
               break;
            case 87:
               var10000 = 83;
               break;
            case 88:
               var10000 = 100;
               break;
            case 89:
               var10000 = 141;
               break;
            case 90:
               var10000 = 151;
               break;
            case 91:
               var10000 = 194;
               break;
            case 92:
               var10000 = 3;
               break;
            case 93:
               var10000 = 174;
               break;
            case 94:
               var10000 = 179;
               break;
            case 95:
               var10000 = 16;
               break;
            case 96:
               var10000 = 231;
               break;
            case 97:
               var10000 = 249;
               break;
            case 98:
               var10000 = 248;
               break;
            case 99:
               var10000 = 192;
               break;
            case 100:
               var10000 = 225;
               break;
            case 101:
               var10000 = 21;
               break;
            case 102:
               var10000 = 33;
               break;
            case 103:
               var10000 = 109;
               break;
            case 104:
               var10000 = 38;
               break;
            case 105:
               var10000 = 9;
               break;
            case 106:
               var10000 = 254;
               break;
            case 107:
               var10000 = 148;
               break;
            case 108:
               var10000 = 234;
               break;
            case 109:
               var10000 = 101;
               break;
            case 110:
               var10000 = 204;
               break;
            case 111:
               var10000 = 0;
               break;
            case 112:
               var10000 = 189;
               break;
            case 113:
               var10000 = 163;
               break;
            case 114:
               var10000 = 128;
               break;
            case 115:
               var10000 = 136;
               break;
            case 116:
               var10000 = 29;
               break;
            case 117:
               var10000 = 246;
               break;
            case 118:
               var10000 = 207;
               break;
            case 119:
               var10000 = 173;
               break;
            case 120:
               var10000 = 126;
               break;
            case 121:
               var10000 = 175;
               break;
            case 122:
               var10000 = 190;
               break;
            case 123:
               var10000 = 22;
               break;
            case 124:
               var10000 = 85;
               break;
            case 125:
               var10000 = 239;
               break;
            case 126:
               var10000 = 183;
               break;
            case 127:
               var10000 = 116;
               break;
            case 128:
               var10000 = 125;
               break;
            case 129:
               var10000 = 193;
               break;
            case 130:
               var10000 = 222;
               break;
            case 131:
               var10000 = 26;
               break;
            case 132:
               var10000 = 95;
               break;
            case 133:
               var10000 = 167;
               break;
            case 134:
               var10000 = 129;
               break;
            case 135:
               var10000 = 104;
               break;
            case 136:
               var10000 = 2;
               break;
            case 137:
               var10000 = 23;
               break;
            case 138:
               var10000 = 115;
               break;
            case 139:
               var10000 = 1;
               break;
            case 140:
               var10000 = 138;
               break;
            case 141:
               var10000 = 205;
               break;
            case 142:
               var10000 = 232;
               break;
            case 143:
               var10000 = 65;
               break;
            case 144:
               var10000 = 46;
               break;
            case 145:
               var10000 = 226;
               break;
            case 146:
               var10000 = 63;
               break;
            case 147:
               var10000 = 144;
               break;
            case 148:
               var10000 = 51;
               break;
            case 149:
               var10000 = 82;
               break;
            case 150:
               var10000 = 143;
               break;
            case 151:
               var10000 = 14;
               break;
            case 152:
               var10000 = 71;
               break;
            case 153:
               var10000 = 220;
               break;
            case 154:
               var10000 = 134;
               break;
            case 155:
               var10000 = 48;
               break;
            case 156:
               var10000 = 108;
               break;
            case 157:
               var10000 = 209;
               break;
            case 158:
               var10000 = 123;
               break;
            case 159:
               var10000 = 162;
               break;
            case 160:
               var10000 = 169;
               break;
            case 161:
               var10000 = 106;
               break;
            case 162:
               var10000 = 30;
               break;
            case 163:
               var10000 = 247;
               break;
            case 164:
               var10000 = 210;
               break;
            case 165:
               var10000 = 19;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 47;
               break;
            case 168:
               var10000 = 45;
               break;
            case 169:
               var10000 = 24;
               break;
            case 170:
               var10000 = 176;
               break;
            case 171:
               var10000 = 203;
               break;
            case 172:
               var10000 = 195;
               break;
            case 173:
               var10000 = 219;
               break;
            case 174:
               var10000 = 60;
               break;
            case 175:
               var10000 = 251;
               break;
            case 176:
               var10000 = 15;
               break;
            case 177:
               var10000 = 49;
               break;
            case 178:
               var10000 = 50;
               break;
            case 179:
               var10000 = 12;
               break;
            case 180:
               var10000 = 185;
               break;
            case 181:
               var10000 = 253;
               break;
            case 182:
               var10000 = 187;
               break;
            case 183:
               var10000 = 4;
               break;
            case 184:
               var10000 = 68;
               break;
            case 185:
               var10000 = 105;
               break;
            case 186:
               var10000 = 180;
               break;
            case 187:
               var10000 = 20;
               break;
            case 188:
               var10000 = 214;
               break;
            case 189:
               var10000 = 172;
               break;
            case 190:
               var10000 = 150;
               break;
            case 191:
               var10000 = 98;
               break;
            case 192:
               var10000 = 215;
               break;
            case 193:
               var10000 = 18;
               break;
            case 194:
               var10000 = 117;
               break;
            case 195:
               var10000 = 55;
               break;
            case 196:
               var10000 = 235;
               break;
            case 197:
               var10000 = 35;
               break;
            case 198:
               var10000 = 93;
               break;
            case 199:
               var10000 = 155;
               break;
            case 200:
               var10000 = 43;
               break;
            case 201:
               var10000 = 102;
               break;
            case 202:
               var10000 = 236;
               break;
            case 203:
               var10000 = 227;
               break;
            case 204:
               var10000 = 112;
               break;
            case 205:
               var10000 = 146;
               break;
            case 206:
               var10000 = 59;
               break;
            case 207:
               var10000 = 119;
               break;
            case 208:
               var10000 = 28;
               break;
            case 209:
               var10000 = 211;
               break;
            case 210:
               var10000 = 229;
               break;
            case 211:
               var10000 = 212;
               break;
            case 212:
               var10000 = 75;
               break;
            case 213:
               var10000 = 79;
               break;
            case 214:
               var10000 = 228;
               break;
            case 215:
               var10000 = 166;
               break;
            case 216:
               var10000 = 25;
               break;
            case 217:
               var10000 = 178;
               break;
            case 218:
               var10000 = 184;
               break;
            case 219:
               var10000 = 242;
               break;
            case 220:
               var10000 = 32;
               break;
            case 221:
               var10000 = 70;
               break;
            case 222:
               var10000 = 110;
               break;
            case 223:
               var10000 = 208;
               break;
            case 224:
               var10000 = 133;
               break;
            case 225:
               var10000 = 56;
               break;
            case 226:
               var10000 = 240;
               break;
            case 227:
               var10000 = 250;
               break;
            case 228:
               var10000 = 73;
               break;
            case 229:
               var10000 = 200;
               break;
            case 230:
               var10000 = 103;
               break;
            case 231:
               var10000 = 223;
               break;
            case 232:
               var10000 = 243;
               break;
            case 233:
               var10000 = 84;
               break;
            case 234:
               var10000 = 202;
               break;
            case 235:
               var10000 = 241;
               break;
            case 236:
               var10000 = 218;
               break;
            case 237:
               var10000 = 58;
               break;
            case 238:
               var10000 = 76;
               break;
            case 239:
               var10000 = 198;
               break;
            case 240:
               var10000 = 44;
               break;
            case 241:
               var10000 = 217;
               break;
            case 242:
               var10000 = 5;
               break;
            case 243:
               var10000 = 182;
               break;
            case 244:
               var10000 = 72;
               break;
            case 245:
               var10000 = 159;
               break;
            case 246:
               var10000 = 170;
               break;
            case 247:
               var10000 = 97;
               break;
            case 248:
               var10000 = 164;
               break;
            case 249:
               var10000 = 113;
               break;
            case 250:
               var10000 = 213;
               break;
            case 251:
               var10000 = 221;
               break;
            case 252:
               var10000 = 90;
               break;
            case 253:
               var10000 = 124;
               break;
            case 254:
               var10000 = 168;
               break;
            default:
               var10000 = 94;
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

         Field1720[var2] = (new String(var3)).intern();
      }

      return Field1720[var2];
   }

   public static boolean Method599() {
      return ModuleManager.getModule(HitBox.class).getState();
   }

   @Class628
   public static native void Method600(BlockPos blockPos);

   public static void Method601() {
      if (GlobalModule.Field3146.getBooleanValue()) {
         GL11.glPushMatrix();
      }

   }

   public static boolean Method602(EntityLivingBase a) {
      NameTag a = (NameTag)ModuleManager.getModule(NameTag.class);
      if (!a.Field2223.getBooleanValue()) {
         return false;
      } else {
         return a.getState() && a.Method965(a) && !AntiBot.botList.contains(a) && a != Field1715.thePlayer;
      }
   }

   public static int Method603(int a, int a, int a) {
      return Class681.Method2696(a, a, a, Field1719);
   }

   public static EnumWorldBlockLayer Method604(Object a) {
      return Field1718.contains((Block)a) ? EnumWorldBlockLayer.SOLID : EnumWorldBlockLayer.TRANSLUCENT;
   }

   public static void Method605(float a) {
      RenderUtils.trash();
      Entity a = Field1715.getRenderViewEntity();
      if (Field1715.theWorld != null) {
         Field1715.mcProfiler.startSection(Method598(-7091, 12151));
         Field1715.pointedEntity = null;
         Reach a = (Reach)ModuleManager.getModule(Reach.class);
         double a = a.getState() && !Field1715.playerController.extendedReach() ? (double)a.Method798() : (double)Field1715.playerController.getBlockReachDistance();
         Field1715.objectMouseOver = a.rayTrace(a.getState() && !Field1715.playerController.extendedReach() ? (double)a.Field2488.getFloatValue() : a, a);
         double a = a;
         Vec3 a = a.getPositionEyes(a);
         boolean a = false;
         if (Field1715.playerController.extendedReach()) {
            a = 6.0;
            a = 6.0;
         }

         if (a > 3.0) {
            a = true;
         }

         if (Field1715.objectMouseOver != null) {
            a = Field1715.objectMouseOver.hitVec.distanceTo(a);
         }

         if (a.getState() && !Field1715.playerController.extendedReach()) {
            a = (double)a.Method276();
            MovingObjectPosition a = a.rayTrace(a, a);
            a = a.hitVec.distanceTo(a);
         }

         Vec3 a = a.getLook(a);
         Vec3 a = a.addVector(a.xCoord * a, a.yCoord * a, a.zCoord * a);
         Field1714 = null;
         Vec3 a = null;
         float a = 1.0F;
         List a = Field1715.theWorld.getEntitiesInAABBexcluding(a, a.getEntityBoundingBox().addCoord(a.xCoord * a, a.yCoord * a, a.zCoord * a).expand((double)a, (double)a, (double)a), Predicates.and(EntitySelectors.NOT_SPECTATING, Class363::Method633));
         double a = a;
         Iterator var17 = a.Method1383();
         if (var17.Method932()) {
            label140: {
               Entity a = (Entity)var17.Method933();
               HitBox a = (HitBox)ModuleManager.getModule(HitBox.class);
               float a = a.getState() && a.Method1187(a) ? a.Field2607.getFloatValue() : a.getCollisionBorderSize();
               AxisAlignedBB a = a.getEntityBoundingBox().expand((double)a, (double)a, (double)a);
               MovingObjectPosition a = a.calculateIntercept(a, a);
               if (a.isVecInside(a)) {
                  if (!(a >= 0.0)) {
                     break label140;
                  }

                  Field1714 = a;
                  a = a;
                  a = 0.0;
               }

               double a = a.distanceTo(a.hitVec);
               if (a < a || a == 0.0) {
                  label132: {
                     if (a == a.ridingEntity) {
                        if (a != 0.0) {
                           break label132;
                        }

                        Field1714 = a;
                        a = a.hitVec;
                     }

                     Field1714 = a;
                     a = a.hitVec;
                     a = a;
                  }
               }
            }
         }

         if (Field1714 != null && a.distanceTo(a) > (a.getState() && !Field1715.playerController.extendedReach() ? (double)a.Method276() : 3.0)) {
            Field1714 = null;
            Field1715.objectMouseOver = new MovingObjectPosition(MovingObjectType.MISS, a, (EnumFacing)null, new BlockPos(a));
         }

         if (Field1714 != null && (a < a || Field1715.objectMouseOver == null)) {
            Field1715.objectMouseOver = new MovingObjectPosition(Field1714, a);
            if (Field1714 instanceof EntityLivingBase || Field1714 instanceof EntityItemFrame) {
               Field1715.pointedEntity = Field1714;
            }
         }

         Field1715.mcProfiler.endSection();
      }

   }

   public static String Method606(NetworkPlayerInfo a) {
      String a = "";
      if (a.getDisplayName() != null) {
         a = a.getDisplayName().getFormattedText();
      } else {
         a = ScorePlayerTeam.formatPlayerName(a.getPlayerTeam(), a.getGameProfile().getName());
      }

      if (Objects.nonNull(GlobalModule.INSTANCE.balant) && !GlobalModule.INSTANCE.balant.Field2823.isEmpty() && PermissionManager.canUseFeature(Method598(-7104, -2384))) {
         Iterator var2 = GlobalModule.INSTANCE.balant.Field2823.Method1383();

         while(var2.Method932()) {
            Class606 a = (Class606)var2.Method933();
            if (a.getGameProfile().getName().equals(a.Field2841)) {
               if (a.Field2847) {
                  if (GlobalModule.INSTANCE.balant.Field2827.Method3740() >= 5) {
                     if (a.Field2838.equalsIgnoreCase(Method598(-7096, -22628))) {
                        a = a.replace(a.Field2841, a.Field2841 + Method598(-7095, 24177) + a.Field2840 + Method598(-7094, -8542).replace(a.Field2840, Method598(-7102, -30891) + a.Field2840));
                     } else if (a.Field2838.equalsIgnoreCase(Method598(-7100, 764))) {
                        a = a.replace(a.Field2841, a.Field2841 + Method598(-7103, 24277) + a.Field2840 + Method598(-7090, 17090).replace(a.Field2840, Method598(-7098, -20137) + a.Field2840));
                     } else {
                        a = a.replace(a.Field2841, a.Field2841 + Method598(-7101, 7617) + a.Field2840 + Method598(-7090, 17090).replace(a.Field2840, Method598(-7098, -20137) + a.Field2840));
                     }
                  }
               } else if (a.Field2838.equalsIgnoreCase(Method598(-7096, -22628))) {
                  a = a.replace(a.Field2841, a.Field2841 + Method598(-7089, -348) + a.Field2840 + Method598(-7099, 20182));
               } else if (a.Field2838.equalsIgnoreCase(Method598(-7085, -1233))) {
                  a = a.replace(a.Field2841, a.Field2841 + Method598(-7092, -21155) + a.Field2840 + Method598(-7088, -22199));
               } else {
                  a = a.replace(a.Field2841, a.Field2841 + Method598(-7093, -20674) + a.Field2840 + Method598(-7088, -22199));
               }
            }
         }
      }

      if (Method616()) {
         a = a.replace(Field1715.thePlayer.getName(), Objects.nonNull(GlobalModule.fakeName) ? GlobalModule.fakeName : GlobalModule.Field3149);
      }

      return a;
   }

   private static boolean Method607(Entity a) {
      return a.canBeCollidedWith();
   }

   public static void Method608(GuiScreen a) {
      EventManager.call(new Class655(a));
      if (Objects.isNull(a) && GuiChest.class.Method3429(Field1716)) {
         Field1723 = System.currentTimeMillis();
         Field1716 = null;
      }

      Field1716 = a.getClass();
   }

   public static float Method609(Entity a) {
      if (!a.equals(Field1715.thePlayer)) {
         return a.prevRotationYaw;
      } else {
         return Perspective.Field2203 ? Perspective.Field2200 : Field1715.thePlayer.prevRotationYaw;
      }
   }

   public static float Method610(Entity a) {
      if (!a.equals(Field1715.thePlayer)) {
         return a.rotationYaw;
      } else {
         return Perspective.Field2203 ? Perspective.Field2200 : Field1715.thePlayer.rotationYaw;
      }
   }

   public static boolean Method611() {
      return ModuleManager.getModule(NoFov.class).getState();
   }

   public static void Method612() {
      GlStateManager.pushMatrix();
      EventRender3D a = new EventRender3D(ReflectionUtils.getRenderPartialTicks());
      EventManager.call(a);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.popMatrix();
   }

   public static boolean Method613() {
      ItemRender a = (ItemRender)ModuleManager.getModule(ItemRender.class);
      if (a.getState() && a.Field2374.isCurrentMode(Method598(-7097, -24298))) {
         GL11.glRotatef(-Field1715.getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(Field1715.gameSettings.thirdPersonView == 2 ? -Field1715.getRenderManager().playerViewX : Field1715.getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);
         GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
         return false;
      } else {
         return true;
      }
   }

   public static boolean Method614() {
      return ModuleManager.getModule(KeepSprint.class).getState();
   }

   public static float Method615(Entity a) {
      if (!a.equals(Field1715.thePlayer)) {
         return a.prevRotationPitch;
      } else {
         return Perspective.Field2203 ? Perspective.Field2201 : Field1715.thePlayer.prevRotationPitch;
      }
   }

   public static boolean Method616() {
      return ModuleManager.getModule(NameProtect.class).getState();
   }

   public static boolean Method617() {
      return GlobalModule.Field3158.getBooleanValue();
   }

   public static ResourceLocation Method618() {
      return Class393.Field1938;
   }

   public static boolean Method619() {
      return Method616() && NameProtect.Field2717.getBooleanValue();
   }

   protected static float Method620(float a, float a, float a) {
      float a;
      for(a = a - a; a < -180.0F; a += 360.0F) {
      }

      while(a >= 180.0F) {
         a -= 360.0F;
      }

      return a + a * a;
   }

   public static boolean Method621() {
      return GlobalModule.Field3160.getBooleanValue();
   }

   public static MovingObjectPosition Method622(float a) {
      Entity a = Field1715.getRenderViewEntity();
      MovingObjectPosition a = null;
      if (Field1715.theWorld != null) {
         Field1715.pointedEntity = null;
         Reach a = (Reach)ModuleManager.getModule(Reach.class);
         double a = a.getState() && !Field1715.playerController.extendedReach() ? (double)a.Method798() : (double)Field1715.playerController.getBlockReachDistance();
         Field1715.objectMouseOver = a.rayTrace(a.getState() && !Field1715.playerController.extendedReach() ? (double)a.Field2488.getFloatValue() : a, a);
         double a = a;
         Vec3 a = a.getPositionEyes(a);
         boolean a = false;
         if (Field1715.playerController.extendedReach()) {
            a = 6.0;
            a = 6.0;
         } else if (a > 3.0) {
            a = true;
         }

         if (Field1715.objectMouseOver != null) {
            a = Field1715.objectMouseOver.hitVec.distanceTo(a);
         }

         if (a.getState() && !Field1715.playerController.extendedReach()) {
            a = (double)a.Method276();
            MovingObjectPosition a = a.rayTrace(a, a);
            a = a.hitVec.distanceTo(a);
         }

         Vec3 a = a.getLook(a);
         Vec3 a = a.addVector(a.xCoord * a, a.yCoord * a, a.zCoord * a);
         Entity a = null;
         Vec3 a = null;
         float a = 1.0F;
         List a = Field1715.theWorld.getEntitiesInAABBexcluding(a, a.getEntityBoundingBox().addCoord(a.xCoord * a, a.yCoord * a, a.zCoord * a).expand((double)a, (double)a, (double)a), Predicates.and(EntitySelectors.NOT_SPECTATING, Class363::Method607));
         double a = a;
         Iterator var18 = a.Method1383();

         while(true) {
            while(var18.Method932()) {
               Entity a = (Entity)var18.Method933();
               HitBox a = (HitBox)ModuleManager.getModule(HitBox.class);
               float a = a.Method1187(a) ? a.Field2607.getFloatValue() : a.getCollisionBorderSize();
               AxisAlignedBB a = a.getEntityBoundingBox().expand((double)a, (double)a, (double)a);
               MovingObjectPosition a = a.calculateIntercept(a, a);
               if (a.isVecInside(a)) {
                  if (a >= 0.0) {
                     a = a;
                     a = a;
                     a = 0.0;
                  }
               } else {
                  double a = a.distanceTo(a.hitVec);
                  if (a < a || a == 0.0) {
                     if (a == a.ridingEntity) {
                        if (a == 0.0) {
                           a = a;
                           a = a.hitVec;
                        }
                     } else {
                        a = a;
                        a = a.hitVec;
                        a = a;
                     }
                  }
               }
            }

            if (a.distanceTo(a) > (a.getState() && !Field1715.playerController.extendedReach() ? (double)a.Method276() : 3.0)) {
               a = null;
               a = new MovingObjectPosition(MovingObjectType.MISS, a, (EnumFacing)null, new BlockPos(a));
            }

            if (a < a || Field1715.objectMouseOver == null) {
               a = new MovingObjectPosition(a, a);
               if (a instanceof EntityLivingBase || a instanceof EntityItemFrame) {
                  Field1715.pointedEntity = a;
               }
            }
            break;
         }
      }

      return a;
   }

   public static float Method623() {
      float a = NoFov.Field2239.getFloatValue();
      if (Field1715.thePlayer.isUsingItem() && Field1715.thePlayer.getItemInUse().getItem() == Items.bow && NoFov.Field2240.getBooleanValue()) {
         int a = Field1715.thePlayer.getItemInUseDuration();
         float a = (float)a / 20.0F;
         if (a > 1.0F) {
            a = 1.0F;
         } else {
            a *= a;
         }

         a *= 1.0F - a * 0.15F;
      }

      return a;
   }

   public static void Method624(int a, int a) {
      if (!GlobalModule.Field3171.getBooleanValue() || Method626()) {
         Mouse.setCursorPosition(a, a);
         Mouse.setGrabbed(false);
      }

   }

   public static void Method625() {
      Class347.Field1663 = new Framebuffer(Field1715.displayWidth, Field1715.displayHeight, false);
      Class347.Field1663.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
      Class347.Method375(Class347.Field1667, Class347.Field1663);
   }

   public static boolean Method626() {
      return System.currentTimeMillis() - Field1723 > 200L;
   }

   public static void Method627(Object a) {
      if (a.Method3429(Minecraft.getMinecraft().thePlayer) && a instanceof AbstractClientPlayer && GlobalModule.Field3187.getBooleanValue()) {
         Class346.Method305(Minecraft.getMinecraft().thePlayer, Class393.Field1937);
      } else if (a.Method3429(Minecraft.getMinecraft().thePlayer) && a instanceof AbstractClientPlayer) {
         Class346.Method305(Minecraft.getMinecraft().thePlayer, (ResourceLocation)null);
      }

   }

   public static void Method628() {
      if (GlobalModule.Field3146.getBooleanValue()) {
         GL11.glPopMatrix();
      }

   }

   public static float Method629(float a, float a1, float a2, float a, int a4) {
      float a = EventMotion.Field2892;
      float a = EventMotion.Field2893;
      float a = EventMotion.Field2894;
      float a = EventMotion.Field2895;
      a = Method620(a, a, a);
      float a = Method620(a, a, a) - a;
      float a = Method620(a, a, a);
      return a;
   }

   public static boolean Method630() {
      if (Field1715.inGameHasFocus && Display.isActive()) {
         if (!Perspective.Field2203) {
            return true;
         }

         Field1715.mouseHelper.mouseXYChange();
         float a = Field1715.gameSettings.mouseSensitivity * 0.6F + 0.2F;
         float a = a * a * a * 8.0F;
         float a = (float)Field1715.mouseHelper.deltaX * a;
         float a = (float)Field1715.mouseHelper.deltaY * a;
         Perspective.Field2200 += a * 0.15F;
         Perspective.Field2201 += a * 0.15F;
         if (Perspective.Field2201 > 90.0F) {
            Perspective.Field2201 = 90.0F;
         }

         if (Perspective.Field2201 < -90.0F) {
            Perspective.Field2201 = -90.0F;
         }
      }

      return false;
   }

   public static float Method631(Object a) {
      Entity a = (Entity)a;
      HitBox a = (HitBox)ModuleManager.getModule2(HitBox.class);
      return a.Method1187(a) ? a.Field2607.getFloatValue() : 0.1F;
   }

   public static boolean Method632() {
      return GlobalModule.Field3148.getBooleanValue() && PlayerUtils.getDistanceToFall();
   }

   private static boolean Method633(Entity a) {
      return a.canBeCollidedWith();
   }

   public static void Method634(EntityLivingBase a, boolean a) {
      Class645 a = new Class645(a, a);
      EventManager.call(a);
   }

   public static boolean Method635() {
      return !Field1715.playerController.getIsHittingBlock() || GlobalModule.Field3184.getBooleanValue();
   }

   public static boolean Method636(Object a) {
      return a instanceof EntityPlayerSP && ModuleManager.getModule(KillAura.class).getState() && ((KillAura)ModuleManager.getModule2(KillAura.class)).Field2521.getBooleanValue() && KillAura.target != null;
   }

   public static boolean Method637() {
      return !Field1715.thePlayer.isUsingItem() || GlobalModule.Field3184.getBooleanValue();
   }

   public static void Method638(Object a) {
      EventManager.call(new Class652((BlockPos)a));
   }

   public static boolean Method639() {
      return ModuleManager.getModule(Reach.class).getState();
   }

   public static String Method640(String a) {
      String a = a;
      if (!Objects.isNull(Field1715.thePlayer) && Method616()) {
         if (Method616() && Objects.nonNull(a)) {
            a = a.replace(Field1715.thePlayer.getName(), Objects.nonNull(GlobalModule.fakeName) ? GlobalModule.fakeName : GlobalModule.Field3149);
         }

         return a;
      } else {
         return a;
      }
   }

   public static boolean Method641() {
      return Keyboard.getEventKey() == 0 && Keyboard.getEventCharacter() >= ' ' || Keyboard.getEventKeyState();
   }

   public static boolean Method642() {
      return ModuleManager.getModule(NoSlowDown.class).getState() || KillAura.Field2493;
   }

   static {
      Class614.Method2232(52, Class363.class);
      Method644();
   }

   public static void Method643() {
      GlStateManager.pushMatrix();
      EventRender2D a = new EventRender2D(ReflectionUtils.getRenderPartialTicks());
      EventManager.call(a);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.popMatrix();
   }

   // $FF: synthetic method
   private static native void Method644();
}
