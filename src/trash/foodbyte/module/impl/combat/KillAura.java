package trash.foodbyte.module.impl.combat;

import awsl.Class628;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import native0.Class614;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.item.ItemSword;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C07PacketPlayerDigging.Action;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import obfuscate.b;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Cylinder;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.ReflectionUtils2;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.RotationUtils;
import trash.foodbyte.utils.ServerPacketHandler;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class KillAura extends Module {
   public static boolean Field2493;
   private static final String[] Field2494;
   public FloatValue Field2495;
   private float[] Field2496;
   private boolean Field2497;
   public ModeValue Field2498;
   public FloatValue Field2499;
   public int Field2500;
   private static final String[] Field2501;
   public BooleanValue Field2502;
   public BooleanValue Field2503;
   public ModeValue Field2504;
   public FloatValue Field2505;
   public FloatValue Field2506;
   public FloatValue Field2507;
   private int Field2508;
   public BooleanValue Field2509;
   TimeHelper Field2510;
   public ModeValue Field2511;
   public ModeValue Field2512;
   public FloatValue Field2513;
   public BooleanValue Field2514;
   public ModeValue Field2515;
   public BooleanValue Field2516;
   public FloatValue Field2517;
   public BooleanValue Field2518;
   public BooleanValue Field2519;
   public BooleanValue Field2520;
   public BooleanValue Field2521;
   TimeHelper Field2522;
   public BooleanValue Field2523;
   public static EntityLivingBase target;
   public FloatValue Field2525;
   public BooleanValue Field2526;
   private double Field2527;
   public static List Field2528;
   public FloatValue Field2529;
   public FloatValue Field2530;
   public BooleanValue Field2531;
   private final Random Field2532;

   @EventTarget
   public void Method273(EventPacket a) {
      if ((a.getPacket() instanceof S07PacketRespawn || a.getPacket() instanceof S02PacketLoginSuccess) && this.Field2531.getBooleanValue()) {
         this.Method1028();
      }

      if (this.Field2498.isCurrentMode(Method754(7648, 15982))) {
         if (a.getPacket() instanceof C07PacketPlayerDigging && this.Method713()) {
            a.setCancelled(true);
         }

         if (a.getPacket() instanceof S30PacketWindowItems && ((S30PacketWindowItems)a.getPacket()).func_148911_c() == 0) {
            if (this.Method713()) {
               Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.inventory.getCurrentItem()));
               a.setCancelled(true);
            } else {
               Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
            }
         }
      }

   }

   private void Method814() {
      if (Field2528.Method1799() == 0) {
         target = null;
      } else {
         target = (EntityLivingBase)Field2528.get(this.Field2508);
      }
   }

   private void Method942(EntityLivingBase a) {
      double a = (double)ReflectionUtils.getRenderPartialTicks();
      double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * a - ReflectionUtils.getRenderPosX();
      double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * a - ReflectionUtils.getRenderPosY();
      double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
      this.Method964(a, a, a + (double)a.getEyeHeight() + 0.5 + Math.sin((double)((float)(System.currentTimeMillis() % 1000000L) / 333.0F)) / 10.0, a);
   }

   private void Method943() {
      mc.thePlayer.swingItem();
      mc.playerController.attackEntity(mc.thePlayer, this.Method958(target));
      if ((double)mc.thePlayer.getDistanceToEntity(target) <= (double)(this.Field2505.getFloatValue() + target.width / 2.0F)) {
         for(int a = 0; (double)a < (double)this.Field2499.getFloatValue(); ++a) {
            mc.effectRenderer.emitParticleAtEntity(target, EnumParticleTypes.CRIT_MAGIC);
         }
      }

   }

   private float[] Method944(Entity a, EntityPlayerSP a) {
      double a = a.posX - a.posX;
      double a = a.posY + (double)a.height - (a.posY + (double)a.height);
      double a = a.posZ - a.posZ;
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI) - 90.0F;
      float a = (float)(Math.atan2(a, (double)a.getDistanceToEntity(a)) * 180.0 / Math.PI);
      float a = a.rotationYaw + MathHelper.wrapAngleTo180_float(a - a.rotationYaw);
      float a = a.rotationPitch + MathHelper.wrapAngleTo180_float(a - a.rotationPitch);
      return new float[]{a, -a};
   }

   public static void Method945(float a) {
      GL11.glDisable(3008);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glEnable(2884);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glHint(3155, 4354);
      GL11.glLineWidth(a);
   }

   private void Method946() {
      int a = this.Field2504.isCurrentMode(Method754(7679, -635)) ? 4 : this.Field2513.getFloatValue().intValue();
      Iterator var2 = mc.theWorld.getLoadedEntityList().Method1383();

      while(var2.Method932()) {
         Entity a = (Entity)var2.Method933();
         EntityLivingBase a;
         if (a instanceof EntityLivingBase && this.Method965(a = (EntityLivingBase)a) && !Field2528.contains(a)) {
            Field2528.Method2530(a);
         }

         if (Field2528.Method1799() >= a) {
            break;
         }
      }

      if (this.Field2511.isCurrentMode(Method754(7588, -11596)) && mc.gameSettings.keyBindSprint.isKeyDown()) {
         Field2528.sort(Comparator.comparingDouble(KillAura::Method971));
      } else if (this.Field2511.isCurrentMode(Method754(7581, 693)) && mc.gameSettings.keyBindSprint.isKeyDown()) {
         Field2528.sort(KillAura::Method953);
      } else if (this.Field2511.isCurrentMode(Method754(7665, 27633)) && mc.gameSettings.keyBindSprint.isKeyDown()) {
         Field2528.sort(KillAura::Method950);
      } else {
         if (this.Field2511.isCurrentMode(Method754(7591, 22163))) {
            Field2528.sort(KillAura::Method974);
         }

         if (this.Field2511.isCurrentMode(Method754(7614, -26901))) {
            Field2528.sort(KillAura::Method947);
         }

         if (this.Field2511.isCurrentMode(Method754(7568, 20260))) {
            Field2528.sort(Comparator.comparingDouble(KillAura::Method966));
         }

         if (this.Field2511.isCurrentMode(Method754(7660, 14417))) {
            Field2528.sort(Comparator.comparingDouble(this::Method812));
         }

         if (this.Field2511.isCurrentMode(Method754(7676, -556))) {
            Field2528.sort(KillAura::Method969);
         }

      }
   }

   private static int Method947(EntityLivingBase a, EntityLivingBase a) {
      return (int)(a.getHealth() - a.getHealth());
   }

   private void Method948(EntityLivingBase a) {
      this.Method963(a);
   }

   private boolean Method805() {
      return mc.thePlayer.inventory.getCurrentItem() != null && mc.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemSword;
   }

   public void onEnable() {
      Field2528.clear();
      if (this.Method1026()) {
         this.Field2496[0] = mc.thePlayer.rotationYaw;
         this.Field2496[1] = mc.thePlayer.rotationPitch;
      }
   }

   public void idk() {
      this.Field2495.Method2757(this.Field2504.isCurrentMode(Method754(7606, -18533)));
      this.Field2498.Method2757(!this.Field2515.isCurrentMode(Method754(7658, 16565)));
   }

   private static int Method950(EntityLivingBase a, EntityLivingBase a) {
      return (int)(a.getHealth() - a.getHealth());
   }

   public double[] Method818(EntityLivingBase a) {
      double a = a.posX - mc.thePlayer.posX;
      double a = a.posY - mc.thePlayer.posY;
      double a = a.posZ - mc.thePlayer.posZ;
      a /= (double)mc.thePlayer.getDistanceToEntity(a);
      double a = -(Math.atan2(a, a) * 57.29577951308232);
      double a = -(Math.asin(a) * 57.29577951308232);
      return new double[]{a, a};
   }

   private void Method951() {
      this.Method943();
      Field2528.stream().filter(this::Method960).forEach(this::Method973);
   }

   public void Method952(EntityLivingBase a) {
      double a = (double)ReflectionUtils.getRenderPartialTicks();
      double a = ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).lastTickPosX + (((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).posX - ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).lastTickPosX) * a - ReflectionUtils.getRenderPosX();
      double a = ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).lastTickPosY + (((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).posY - ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).lastTickPosY) * a - ReflectionUtils.getRenderPosY();
      double a = ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).lastTickPosZ + (((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).posZ - ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
      double a = ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).getEntityBoundingBox().maxX - ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).getEntityBoundingBox().minX;
      double a = ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).getEntityBoundingBox().maxY - ((Entity)(a instanceof EntityDragon ? ((EntityDragon)a).dragonPartBody : a)).getEntityBoundingBox().minY + 0.25;
      float a = 0.0F;
      float a = 0.5F;
      float a = 1.0F;
      float a = 0.4F;
      float a = 0.0F;
      float a = 0.5F;
      float a = 1.0F;
      if (this.Method958(a).hurtResistantTime > 0) {
         a = 1.0F;
         a = 0.0F;
         a = 0.0F;
         a = 1.0F;
         a = 0.0F;
         a = 0.0F;
      } else {
         a = 0.0F;
         a = 1.0F;
         a = 0.5F;
         a = 0.0F;
         a = 0.5F;
         a = 1.0F;
      }

      float a = 1.0F;
      float a = 1.0F;
      RenderUtils.Method1120(a, a + a, a, a / 1.5, 0.1, a, a, a, a, a, a, a, 1.0F, 1.0F);
   }

   public void onDisable() {
      Field2493 = false;
      target = null;
      Field2528.clear();
      if (this.Method1026() && this.Method805()) {
         ReflectionUtils.setItemInUseCount(0);
         Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
      }

   }

   private static String Method754(int integer1, int integer2) {
      int var2 = (integer1 ^ 7611) & '\uffff';
      if (Field2501[var2] == null) {
         char[] var3 = Field2494[var2].toCharArray();
         short var10000;
         switch (var3[0] & 255) {
            case 0:
               var10000 = 227;
               break;
            case 1:
               var10000 = 4;
               break;
            case 2:
               var10000 = 121;
               break;
            case 3:
               var10000 = 32;
               break;
            case 4:
               var10000 = 46;
               break;
            case 5:
               var10000 = 215;
               break;
            case 6:
               var10000 = 184;
               break;
            case 7:
               var10000 = 76;
               break;
            case 8:
               var10000 = 122;
               break;
            case 9:
               var10000 = 251;
               break;
            case 10:
               var10000 = 5;
               break;
            case 11:
               var10000 = 140;
               break;
            case 12:
               var10000 = 222;
               break;
            case 13:
               var10000 = 19;
               break;
            case 14:
               var10000 = 223;
               break;
            case 15:
               var10000 = 147;
               break;
            case 16:
               var10000 = 79;
               break;
            case 17:
               var10000 = 110;
               break;
            case 18:
               var10000 = 62;
               break;
            case 19:
               var10000 = 134;
               break;
            case 20:
               var10000 = 77;
               break;
            case 21:
               var10000 = 188;
               break;
            case 22:
               var10000 = 72;
               break;
            case 23:
               var10000 = 132;
               break;
            case 24:
               var10000 = 209;
               break;
            case 25:
               var10000 = 20;
               break;
            case 26:
               var10000 = 242;
               break;
            case 27:
               var10000 = 198;
               break;
            case 28:
               var10000 = 54;
               break;
            case 29:
               var10000 = 217;
               break;
            case 30:
               var10000 = 139;
               break;
            case 31:
               var10000 = 253;
               break;
            case 32:
               var10000 = 138;
               break;
            case 33:
               var10000 = 129;
               break;
            case 34:
               var10000 = 11;
               break;
            case 35:
               var10000 = 0;
               break;
            case 36:
               var10000 = 49;
               break;
            case 37:
               var10000 = 145;
               break;
            case 38:
               var10000 = 24;
               break;
            case 39:
               var10000 = 168;
               break;
            case 40:
               var10000 = 246;
               break;
            case 41:
               var10000 = 189;
               break;
            case 42:
               var10000 = 22;
               break;
            case 43:
               var10000 = 124;
               break;
            case 44:
               var10000 = 86;
               break;
            case 45:
               var10000 = 200;
               break;
            case 46:
               var10000 = 190;
               break;
            case 47:
               var10000 = 151;
               break;
            case 48:
               var10000 = 155;
               break;
            case 49:
               var10000 = 59;
               break;
            case 50:
               var10000 = 212;
               break;
            case 51:
               var10000 = 241;
               break;
            case 52:
               var10000 = 208;
               break;
            case 53:
               var10000 = 28;
               break;
            case 54:
               var10000 = 80;
               break;
            case 55:
               var10000 = 236;
               break;
            case 56:
               var10000 = 96;
               break;
            case 57:
               var10000 = 58;
               break;
            case 58:
               var10000 = 37;
               break;
            case 59:
               var10000 = 128;
               break;
            case 60:
               var10000 = 224;
               break;
            case 61:
               var10000 = 109;
               break;
            case 62:
               var10000 = 131;
               break;
            case 63:
               var10000 = 135;
               break;
            case 64:
               var10000 = 82;
               break;
            case 65:
               var10000 = 166;
               break;
            case 66:
               var10000 = 33;
               break;
            case 67:
               var10000 = 26;
               break;
            case 68:
               var10000 = 201;
               break;
            case 69:
               var10000 = 220;
               break;
            case 70:
               var10000 = 6;
               break;
            case 71:
               var10000 = 123;
               break;
            case 72:
               var10000 = 45;
               break;
            case 73:
               var10000 = 154;
               break;
            case 74:
               var10000 = 48;
               break;
            case 75:
               var10000 = 173;
               break;
            case 76:
               var10000 = 199;
               break;
            case 77:
               var10000 = 117;
               break;
            case 78:
               var10000 = 229;
               break;
            case 79:
               var10000 = 191;
               break;
            case 80:
               var10000 = 255;
               break;
            case 81:
               var10000 = 239;
               break;
            case 82:
               var10000 = 127;
               break;
            case 83:
               var10000 = 126;
               break;
            case 84:
               var10000 = 67;
               break;
            case 85:
               var10000 = 174;
               break;
            case 86:
               var10000 = 85;
               break;
            case 87:
               var10000 = 50;
               break;
            case 88:
               var10000 = 38;
               break;
            case 89:
               var10000 = 234;
               break;
            case 90:
               var10000 = 211;
               break;
            case 91:
               var10000 = 81;
               break;
            case 92:
               var10000 = 171;
               break;
            case 93:
               var10000 = 13;
               break;
            case 94:
               var10000 = 65;
               break;
            case 95:
               var10000 = 250;
               break;
            case 96:
               var10000 = 165;
               break;
            case 97:
               var10000 = 130;
               break;
            case 98:
               var10000 = 41;
               break;
            case 99:
               var10000 = 47;
               break;
            case 100:
               var10000 = 203;
               break;
            case 101:
               var10000 = 240;
               break;
            case 102:
               var10000 = 106;
               break;
            case 103:
               var10000 = 169;
               break;
            case 104:
               var10000 = 104;
               break;
            case 105:
               var10000 = 247;
               break;
            case 106:
               var10000 = 164;
               break;
            case 107:
               var10000 = 84;
               break;
            case 108:
               var10000 = 225;
               break;
            case 109:
               var10000 = 248;
               break;
            case 110:
               var10000 = 175;
               break;
            case 111:
               var10000 = 207;
               break;
            case 112:
               var10000 = 244;
               break;
            case 113:
               var10000 = 156;
               break;
            case 114:
               var10000 = 116;
               break;
            case 115:
               var10000 = 25;
               break;
            case 116:
               var10000 = 152;
               break;
            case 117:
               var10000 = 237;
               break;
            case 118:
               var10000 = 230;
               break;
            case 119:
               var10000 = 228;
               break;
            case 120:
               var10000 = 221;
               break;
            case 121:
               var10000 = 55;
               break;
            case 122:
               var10000 = 243;
               break;
            case 123:
               var10000 = 163;
               break;
            case 124:
               var10000 = 42;
               break;
            case 125:
               var10000 = 101;
               break;
            case 126:
               var10000 = 185;
               break;
            case 127:
               var10000 = 238;
               break;
            case 128:
               var10000 = 31;
               break;
            case 129:
               var10000 = 66;
               break;
            case 130:
               var10000 = 183;
               break;
            case 131:
               var10000 = 143;
               break;
            case 132:
               var10000 = 100;
               break;
            case 133:
               var10000 = 30;
               break;
            case 134:
               var10000 = 56;
               break;
            case 135:
               var10000 = 177;
               break;
            case 136:
               var10000 = 153;
               break;
            case 137:
               var10000 = 202;
               break;
            case 138:
               var10000 = 34;
               break;
            case 139:
               var10000 = 53;
               break;
            case 140:
               var10000 = 8;
               break;
            case 141:
               var10000 = 87;
               break;
            case 142:
               var10000 = 233;
               break;
            case 143:
               var10000 = 118;
               break;
            case 144:
               var10000 = 94;
               break;
            case 145:
               var10000 = 149;
               break;
            case 146:
               var10000 = 180;
               break;
            case 147:
               var10000 = 150;
               break;
            case 148:
               var10000 = 158;
               break;
            case 149:
               var10000 = 182;
               break;
            case 150:
               var10000 = 157;
               break;
            case 151:
               var10000 = 213;
               break;
            case 152:
               var10000 = 218;
               break;
            case 153:
               var10000 = 12;
               break;
            case 154:
               var10000 = 142;
               break;
            case 155:
               var10000 = 107;
               break;
            case 156:
               var10000 = 112;
               break;
            case 157:
               var10000 = 44;
               break;
            case 158:
               var10000 = 141;
               break;
            case 159:
               var10000 = 89;
               break;
            case 160:
               var10000 = 216;
               break;
            case 161:
               var10000 = 136;
               break;
            case 162:
               var10000 = 74;
               break;
            case 163:
               var10000 = 193;
               break;
            case 164:
               var10000 = 226;
               break;
            case 165:
               var10000 = 197;
               break;
            case 166:
               var10000 = 43;
               break;
            case 167:
               var10000 = 108;
               break;
            case 168:
               var10000 = 27;
               break;
            case 169:
               var10000 = 160;
               break;
            case 170:
               var10000 = 195;
               break;
            case 171:
               var10000 = 98;
               break;
            case 172:
               var10000 = 133;
               break;
            case 173:
               var10000 = 204;
               break;
            case 174:
               var10000 = 57;
               break;
            case 175:
               var10000 = 172;
               break;
            case 176:
               var10000 = 170;
               break;
            case 177:
               var10000 = 206;
               break;
            case 178:
               var10000 = 93;
               break;
            case 179:
               var10000 = 90;
               break;
            case 180:
               var10000 = 1;
               break;
            case 181:
               var10000 = 83;
               break;
            case 182:
               var10000 = 103;
               break;
            case 183:
               var10000 = 64;
               break;
            case 184:
               var10000 = 52;
               break;
            case 185:
               var10000 = 187;
               break;
            case 186:
               var10000 = 181;
               break;
            case 187:
               var10000 = 231;
               break;
            case 188:
               var10000 = 115;
               break;
            case 189:
               var10000 = 159;
               break;
            case 190:
               var10000 = 23;
               break;
            case 191:
               var10000 = 125;
               break;
            case 192:
               var10000 = 14;
               break;
            case 193:
               var10000 = 119;
               break;
            case 194:
               var10000 = 161;
               break;
            case 195:
               var10000 = 29;
               break;
            case 196:
               var10000 = 186;
               break;
            case 197:
               var10000 = 97;
               break;
            case 198:
               var10000 = 144;
               break;
            case 199:
               var10000 = 91;
               break;
            case 200:
               var10000 = 178;
               break;
            case 201:
               var10000 = 17;
               break;
            case 202:
               var10000 = 40;
               break;
            case 203:
               var10000 = 205;
               break;
            case 204:
               var10000 = 196;
               break;
            case 205:
               var10000 = 137;
               break;
            case 206:
               var10000 = 232;
               break;
            case 207:
               var10000 = 249;
               break;
            case 208:
               var10000 = 176;
               break;
            case 209:
               var10000 = 70;
               break;
            case 210:
               var10000 = 252;
               break;
            case 211:
               var10000 = 214;
               break;
            case 212:
               var10000 = 3;
               break;
            case 213:
               var10000 = 92;
               break;
            case 214:
               var10000 = 36;
               break;
            case 215:
               var10000 = 21;
               break;
            case 216:
               var10000 = 39;
               break;
            case 217:
               var10000 = 35;
               break;
            case 218:
               var10000 = 192;
               break;
            case 219:
               var10000 = 162;
               break;
            case 220:
               var10000 = 16;
               break;
            case 221:
               var10000 = 105;
               break;
            case 222:
               var10000 = 68;
               break;
            case 223:
               var10000 = 114;
               break;
            case 224:
               var10000 = 88;
               break;
            case 225:
               var10000 = 2;
               break;
            case 226:
               var10000 = 120;
               break;
            case 227:
               var10000 = 15;
               break;
            case 228:
               var10000 = 63;
               break;
            case 229:
               var10000 = 60;
               break;
            case 230:
               var10000 = 75;
               break;
            case 231:
               var10000 = 210;
               break;
            case 232:
               var10000 = 73;
               break;
            case 233:
               var10000 = 111;
               break;
            case 234:
               var10000 = 69;
               break;
            case 235:
               var10000 = 61;
               break;
            case 236:
               var10000 = 95;
               break;
            case 237:
               var10000 = 9;
               break;
            case 238:
               var10000 = 71;
               break;
            case 239:
               var10000 = 10;
               break;
            case 240:
               var10000 = 148;
               break;
            case 241:
               var10000 = 167;
               break;
            case 242:
               var10000 = 78;
               break;
            case 243:
               var10000 = 179;
               break;
            case 244:
               var10000 = 99;
               break;
            case 245:
               var10000 = 219;
               break;
            case 246:
               var10000 = 7;
               break;
            case 247:
               var10000 = 18;
               break;
            case 248:
               var10000 = 245;
               break;
            case 249:
               var10000 = 113;
               break;
            case 250:
               var10000 = 146;
               break;
            case 251:
               var10000 = 194;
               break;
            case 252:
               var10000 = 102;
               break;
            case 253:
               var10000 = 235;
               break;
            case 254:
               var10000 = 51;
               break;
            default:
               var10000 = 254;
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

         Field2501[var2] = (new String(var3)).intern();
      }

      return Field2501[var2];
   }

   private static int Method953(EntityLivingBase a, EntityLivingBase a) {
      return (int)(a.getHealth() - a.getHealth());
   }

   @EventTarget(4)
   public void Method755(EventTick a) {
      if (this.Field2503.getBooleanValue() && !Mouse.isButtonDown(0) && !mc.gameSettings.keyBindAttack.isKeyDown()) {
         target = null;
      } else if (mc.thePlayer.ridingEntity != null) {
         if (this.Field2504.isCurrentMode(Method754(7554, -11340))) {
            this.setDisplayTag(Method754(7554, -11340));
            if (this.Field2522.isDelayComplete((double)this.Field2506.getFloatValue())) {
               this.Field2522.reset();
               ++this.Field2508;
            }
         }

         if (this.Field2504.isCurrentMode(Method754(7593, 2480))) {
            this.setDisplayTag(Method754(7611, -24294));
            if (mc.thePlayer.getHealth() <= 0.0F && Field2528.Method1799() > 0) {
               ++this.Field2508;
            }
         }

         if (this.Field2504.isCurrentMode(Method754(7563, 14278))) {
            this.setDisplayTag(Method754(7563, 14278));
            if (mc.thePlayer.getHealth() <= 0.0F && Field2528.Method1799() > 0) {
               ++this.Field2508;
            }
         }

         if (!Field2528.isEmpty() && this.Field2508 >= Field2528.Method1799()) {
            this.Field2508 = 0;
         }

         this.Method815();
         this.Method946();
         this.Method814();
         if (target != null) {
            this.Method970();
         } else {
            Field2528.clear();
         }

      }
   }

   public float[] Method954(EntityLivingBase a) {
      double a = Minecraft.getMinecraft().thePlayer.posX;
      double a = Minecraft.getMinecraft().thePlayer.posY + (double)Minecraft.getMinecraft().thePlayer.getEyeHeight();
      double a = Minecraft.getMinecraft().thePlayer.posZ;
      double a = target.posX;
      double a = target.posY + (double)(target.height / 2.0F);
      double a = target.posZ;
      double a = a - a;
      double a = a - a;
      double a = a - a;
      double a = Math.sqrt(Math.pow(a, 2.0) + Math.pow(a, 2.0));
      float a = (float)(Math.toDegrees(Math.atan2(a, a)) + 90.0);
      float a = (float)Math.toDegrees(Math.atan2(a, a));
      return new float[]{(float)((double)a + ((new Random()).nextBoolean() ? Math.random() : -Math.random())), (float)((double)(90.0F - a) + ((new Random()).nextBoolean() ? Math.random() : -Math.random()))};
   }

   @EventTarget
   public void Method955(EventMotion a) {
      a[] var2 = b.trash();
      if (this.Field2515.isCurrentMode(Method754(7585, 16095))) {
         Field2493 = this.Method805();
      }

      Field2493 = false;
      if (a.isPost()) {
         if (target != null) {
            this.Method970();
         }

         if (Field2493 && mc.gameSettings.keyBindUseItem.isKeyDown()) {
            if (this.Field2500 != 520) {
               Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.inventory.getCurrentItem()));
            }

            if (this.Field2498.isCurrentMode(Method754(7610, -20270))) {
               Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.inventory.getCurrentItem()));
            }

            this.Field2500 = 520;
            ReflectionUtils.setItemInUseCount(520);
            if (this.Field2498.isCurrentMode(Method754(7553, 5307))) {
               if (mc.thePlayer.swingProgressInt == 1) {
                  Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
               }

               if (mc.thePlayer.swingProgressInt == 2) {
                  Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.getHeldItem()));
               }
            }
         }

         if (target != null && this.Method805() && this.Field2515.isCurrentMode(Method754(7573, -2197))) {
            if (ReflectionUtils.getItemInUseCount() != 520.0F) {
               Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.inventory.getCurrentItem()));
            }

            if (this.Field2498.isCurrentMode(Method754(7572, -7961))) {
               Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.inventory.getCurrentItem()));
            }

            ReflectionUtils.setItemInUseCount(520);
            if (this.Field2498.isCurrentMode(Method754(7558, -1609))) {
               if (mc.thePlayer.swingProgressInt == 1) {
                  Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
               }

               if (mc.thePlayer.swingProgressInt == 2) {
                  Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.getHeldItem()));
               }
            }
         }
      }

      if (a.isPre()) {
         label86: {
            if (Field2493 && mc.gameSettings.keyBindUseItem.isKeyDown()) {
               if (!this.Field2498.isCurrentMode(Method754(7572, -7961))) {
                  break label86;
               }

               Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, new BlockPos(-1, -1, -1), EnumFacing.DOWN));
            }

            if (this.Field2500 == 520) {
               this.Field2500 = 0;
               ReflectionUtils.setItemInUseCount(0);
               Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
            }
         }

         if (target != null && this.Method805() && this.Field2515.isCurrentMode(Method754(7659, -29435))) {
            if (!this.Field2498.isCurrentMode(Method754(7572, -7961))) {
               return;
            }

            Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, new BlockPos(-1, -1, -1), EnumFacing.DOWN));
         }

         if (ReflectionUtils.getItemInUseCount() == 520.0F) {
            ReflectionUtils.setItemInUseCount(0);
            Wrapper.INSTANCE.sendPacket(new C07PacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
         }
      }

   }

   public float Method956(Entity a) {
      float a = (float)(mc.thePlayer.posX - a.posX);
      float a = (float)(mc.thePlayer.posY - a.posY);
      float a = (float)(mc.thePlayer.posZ - a.posZ);
      return MathHelper.sqrt_float(a * a + a * a);
   }

   private void Method957(EntityLivingBase a) {
      this.Method952(a);
   }

   @EventTarget
   public void Method712(EventMotion a) {
      if (this.Field2503.getBooleanValue() && !Mouse.isButtonDown(0) && !mc.gameSettings.keyBindAttack.isKeyDown()) {
         target = null;
      } else if (!a.isPost()) {
         if (this.Field2504.isCurrentMode(Method754(7554, -11340))) {
            this.setDisplayTag(Method754(7554, -11340));
            if (this.Field2522.isDelayComplete((double)this.Field2506.getFloatValue())) {
               this.Field2522.reset();
               ++this.Field2508;
            }
         }

         if (this.Field2504.isCurrentMode(Method754(7611, -24294))) {
            this.setDisplayTag(Method754(7611, -24294));
            if (mc.thePlayer.getHealth() <= 0.0F && Field2528.Method1799() > 0) {
               ++this.Field2508;
            }
         }

         if (this.Field2504.isCurrentMode(Method754(7563, 14278))) {
            this.setDisplayTag(Method754(7563, 14278));
            if (mc.thePlayer.getHealth() <= 0.0F && Field2528.Method1799() > 0) {
               ++this.Field2508;
            }
         }

         if (!Field2528.isEmpty() && this.Field2508 >= Field2528.Method1799()) {
            this.Field2508 = 0;
         }

         this.Method815();
         this.Method946();
         this.Method814();
         if (target != null) {
            float[] a = this.Method954(target);
            if (mc.thePlayer.getDistanceToEntity(target) <= this.Field2505.getFloatValue() + target.width / 2.0F) {
               float[] a = this.Method954(target);
               float[] a = new float[]{this.Field2496[0], this.Field2496[1]};
               this.Field2496 = this.Method968(a, a);
               if (this.Field2518.getBooleanValue()) {
                  a.setYaw(this.Field2496[0]);
               }

               if (this.Field2516.getBooleanValue()) {
                  a.setPitch(this.Field2496[1]);
               }
            }
         } else {
            this.Field2496[0] = mc.thePlayer.rotationYaw;
            this.Field2496[1] = mc.thePlayer.rotationPitch;
            Field2528.clear();
         }

      }
   }

   private Entity Method958(EntityLivingBase a) {
      if (!(a instanceof EntityDragon)) {
         return a;
      } else {
         EntityDragon a = (EntityDragon)a;
         List a = new CopyOnWriteArrayList();
         EntityDragonPart[] var4 = a.dragonPartArray;
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            EntityDragonPart a = var4[var6];
            a.Method2530(a);
         }

         a.sort(Comparator.comparingDouble(KillAura::Method962));
         return (Entity)a.get(0);
      }
   }

   private void Method959(EntityLivingBase a) {
      this.Method961(a, Field2528.Method1799());
   }

   public static void Method258() {
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glDepthMask(true);
      GL11.glCullFace(1029);
      GL11.glDisable(2848);
      GL11.glHint(3154, 4352);
      GL11.glHint(3155, 4352);
   }

   private boolean Method960(EntityLivingBase a) {
      return a.hurtTime <= this.Field2495.getFloatValue().intValue() && a != target;
   }

   @Class628
   public native void Method961(EntityLivingBase entityLivingBase, int integer);

   private static double Method962(EntityDragonPart a) {
      return (double)mc.thePlayer.getDistanceToEntity(a);
   }

   public void Method963(EntityLivingBase a) {
      double a = (double)ReflectionUtils.getRenderPartialTicks();
      double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * a - ReflectionUtils.getRenderPosX();
      double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * a - ReflectionUtils.getRenderPosY();
      double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
      Color a = new Color(0, 153, 255, 80);
      if (a.hurtTime > 0) {
         a = new Color(255, 0, 0, 80);
      }

      RenderUtils.Method1122(a, a, a, (double)a.width / 1.2, (double)a.height + 0.2, (float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, (float)a.getAlpha() / 255.0F);
   }

   public boolean Method817(EntityLivingBase a, float a) {
      a = (float)((double)a * 0.5);
      double a = (((double)mc.thePlayer.rotationYaw - this.Method818(a)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
      return a > 0.0 && a < (double)a || (double)(-a) < a && a < 0.0;
   }

   public void Method964(EntityLivingBase a, double a, double a, double a) {
      Cylinder a = new Cylinder();
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glHint(3154, 4354);
      GlStateManager.disableLighting();
      GL11.glTranslated(a, a, a);
      GL11.glRotatef(-a.width, 0.0F, 1.0F, 0.0F);
      RenderUtils.Method1125(new Color(0, 153, 255, 150));
      Method945(0.1F);
      GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
      a.setDrawStyle(100011);
      a.draw(0.0F, 0.2F, 0.5F, 3, 300);
      Method258();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glHint(3154, 4354);
      GlStateManager.disableLighting();
      GL11.glTranslated(a, a + 0.5, a);
      GL11.glRotatef(-a.width, 0.0F, 1.0F, 0.0F);
      RenderUtils.Method1125(new Color(0, 153, 255, 150));
      Method945(0.1F);
      GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
      a.setDrawStyle(100011);
      a.draw(0.0F, 0.2F, 0.0F, 3, 300);
      Method258();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private boolean Method965(EntityLivingBase a) {
      return ServerPacketHandler.currentServer.equals(Servers.SB) ? this.Method967(a) : false;
   }

   private static double Method966(EntityLivingBase a) {
      return (double)mc.thePlayer.getDistanceToEntity(a);
   }

   private boolean Method967(EntityLivingBase a) {
      return false;
   }

   private float[] Method968(float[] a, float[] a) {
      float[] a = new float[]{a[0] - a[0], a[1] - a[1]};
      a = MathUtils.parseRotations(a);
      a[0] = a[0] - a[0] / 100.0F * (this.Field2517.getFloatValue() / 2.0F);
      a[1] = a[1] - a[1] / 100.0F * (this.Field2517.getFloatValue() / 2.0F);
      return a;
   }

   static {
      Class614.Method2232(3, KillAura.class);
      Method975();
   }

   public KillAura() {
      super(Method754(7602, 10160), Method754(7642, 28097), Category.COMBAT);
      b.trash();
      this.Field2504 = new ModeValue(Method754(7562, -17983), Method754(7612, -11267), Method754(7554, -11340), new String[]{Method754(7554, -11340), Method754(7611, -24294)}, Method754(7578, -15891));
      this.Field2515 = new ModeValue(Method754(7562, -17983), Method754(7669, 25312), Method754(7561, 30117), new String[]{Method754(7643, -19851), Method754(7659, -29435), Method754(7561, 30117)}, Method754(7576, 16620));
      this.Field2498 = new ModeValue(Method754(7562, -17983), Method754(7570, -18011), Method754(7675, -8921), new String[]{Method754(7580, -22958), Method754(7558, -1609), Method754(7601, -18491), Method754(7552, -8600)}, Method754(7678, 18144));
      this.Field2511 = new ModeValue(Method754(7562, -17983), Method754(7641, -3921), Method754(7614, -26901), new String[]{Method754(7614, -26901), Method754(7568, 20260), Method754(7591, 22163), Method754(7583, -2524), Method754(7605, -8888)}, Method754(7596, -24838));
      this.Field2512 = new ModeValue(Method754(7562, -17983), Method754(7584, -12744), Method754(7589, -21790), new String[]{Method754(7643, -19851), Method754(7555, -13908), Method754(7565, 18086), Method754(7664, -31068), Method754(7589, -21790)}, Method754(7650, -15600));
      this.Field2505 = new FloatValue(Method754(7562, -17983), Method754(7568, 20260), 4.2, 3.0, 7.0, 0.1, Method754(7603, 23094));
      this.Field2525 = new FloatValue(Method754(7562, -17983), Method754(7600, 15525), 1.0, 0.1, 2.0, 0.1, Method754(7666, 3975));
      this.Field2530 = new FloatValue(Method754(7562, -17983), Method754(7594, 31569), 10.0, 1.0, 20.0, 1.0, Method754(7579, 22263));
      this.Field2529 = new FloatValue(Method754(7562, -17983), Method754(7577, -27631), 10.0, 1.0, 20.0, 1.0, Method754(7662, 10579));
      this.Field2507 = new FloatValue(Method754(7562, -17983), Method754(7605, -8888), 120.0, 1.0, 360.0, 5.0, "°", Method754(7592, -10776));
      this.Field2499 = new FloatValue(Method754(7562, -17983), Method754(7613, 13402), 1.0, 0.0, 10.0, 1.0, Method754(7672, -2120));
      this.Field2506 = new FloatValue(Method754(7562, -17983), Method754(7670, -24618), 300.0, 0.0, 1000.0, 50.0, Method754(7599, 20561));
      this.Field2517 = new FloatValue(Method754(7562, -17983), Method754(7559, 4867), 160.0, 10.0, 200.0, 5.0, Method754(7671, -31776));
      this.Field2495 = new FloatValue(Method754(7562, -17983), Method754(7564, 16841), 10.0, 1.0, 10.0, 1.0, Method754(7575, -19674));
      this.Field2513 = new FloatValue(Method754(7562, -17983), Method754(7657, -8933), 2.0, 1.0, 20.0, 1.0, Method754(7654, -6512));
      this.Field2503 = new BooleanValue(Method754(7562, -17983), Method754(7574, -21945), false, Method754(7651, -4337));
      this.Field2519 = new BooleanValue(Method754(7562, -17983), Method754(7663, 20258), false, Method754(7604, -800));
      this.Field2521 = new BooleanValue(Method754(7562, -17983), Method754(7569, 6233), false, Method754(7597, -15212));
      this.Field2518 = new BooleanValue(Method754(7562, -17983), Method754(7655, -11095), false, Method754(7571, -5006));
      this.Field2516 = new BooleanValue(Method754(7562, -17983), Method754(7653, -17277), false, Method754(7668, 8781));
      this.Field2514 = new BooleanValue(Method754(7562, -17983), Method754(7674, -690), false, Method754(7587, -10671));
      this.Field2520 = new BooleanValue(Method754(7562, -17983), Method754(7607, -30592), true, Method754(7560, -18140));
      this.Field2523 = new BooleanValue(Method754(7562, -17983), Method754(7608, 2971), false, Method754(7582, -16856));
      this.Field2502 = new BooleanValue(Method754(7562, -17983), Method754(7567, -21510), false, Method754(7661, 14583));
      this.Field2526 = new BooleanValue(Method754(7562, -17983), Method754(7677, 5895), true, Method754(7556, 3959));
      this.Field2509 = new BooleanValue(Method754(7562, -17983), Method754(7598, -22667), true, Method754(7640, -5213));
      this.Field2531 = new BooleanValue(Method754(7562, -17983), Method754(7566, -3246), true, Method754(7595, -12546));
      this.Field2522 = new TimeHelper();
      this.Field2510 = new TimeHelper();
      this.Field2532 = new Random();
      this.Field2496 = new float[2];
      this.setDescription(Method754(7590, 9363));
      a.trash(new String[2]);
   }

   private static int Method969(EntityLivingBase a, EntityLivingBase a) {
      float[] a = RotationUtils.getRotation2(a);
      float[] a = RotationUtils.getRotation2(a);
      return (int)(mc.thePlayer.rotationYaw - a[0] - (mc.thePlayer.rotationYaw - a[0]));
   }

   private void Method970() {
      int a = this.Field2530.getFloatValue().intValue();
      int a = this.Field2529.getFloatValue().intValue();
      int a = MathUtils.getRandomDouble(a, a);
      if (mc.thePlayer.getDistanceToEntity(target) <= this.Field2505.getFloatValue() + target.width / 2.0F && this.Field2510.Method211((long)(a - 20 + this.Field2532.nextInt(50)))) {
         this.Field2510.reset();
         if (!mc.thePlayer.isBlocking() && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
         }

         if (!mc.thePlayer.isBlocking() && ReflectionUtils.getItemInUseCount() > 0.0F) {
         }

         ReflectionUtils2.pollMouseInputEvent(0, true);
         if (this.Field2504.isCurrentMode(Method754(7563, 14278))) {
            this.Method951();
         } else {
            this.Method943();
         }

         ReflectionUtils2.pollMouseInputEvent(0, false);
      }

   }

   private static double Method971(EntityLivingBase a) {
      return (double)mc.thePlayer.getDistanceToEntity(a);
   }

   public boolean Method713() {
      return ReflectionUtils.getItemInUseCount() >= 520.0F && this.Method805();
   }

   private void Method815() {
      Iterator var1 = Field2528.Method1383();

      while(var1.Method932()) {
         EntityLivingBase a = (EntityLivingBase)var1.Method933();
         if (!this.Method965(a)) {
            Field2528.remove(a);
         }
      }

   }

   public static int Method972(double a, double a) {
      Random a = new Random();
      return (int)(a + a.nextDouble() * (a - a));
   }

   private void Method973(EntityLivingBase a) {
      mc.thePlayer.swingItem();
      mc.playerController.attackEntity(mc.thePlayer, this.Method958(a));
   }

   private double Method812(EntityLivingBase a) {
      float[] a = RotationUtils.getRotation(a);
      float a = (float)((int)a[0]);
      float a = mc.thePlayer.rotationYaw > a ? mc.thePlayer.rotationYaw - a : a - mc.thePlayer.rotationYaw;
      return (double)a;
   }

   @EventTarget
   public void Method802(EventRender3D a) {
      if (this.Field2512.isCurrentMode(Method754(7615, 28317))) {
         if (this.Field2504.isCurrentMode(Method754(7563, 14278))) {
            if (Field2528.Method1799() > 0) {
               Field2528.forEach(this::Method942);
            }
         } else if (target != null) {
            double a = (double)ReflectionUtils.getRenderPartialTicks();
            double a = target.lastTickPosX + (target.posX - target.lastTickPosX) * a - ReflectionUtils.getRenderPosX();
            double a = target.lastTickPosY + (target.posY - target.lastTickPosY) * a - ReflectionUtils.getRenderPosY();
            double a = target.lastTickPosZ + (target.posZ - target.lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
            this.Method964(target, a, a + (double)target.getEyeHeight() + 0.5 + Math.sin((double)((float)(System.currentTimeMillis() % 1000000L) / 333.0F)) / 10.0, a);
         }
      }

      if (this.Field2512.isCurrentMode(Method754(7586, 30651))) {
         if (this.Field2504.isCurrentMode(Method754(7563, 14278))) {
            if (Field2528.Method1799() > 0) {
               Field2528.forEach(this::Method957);
            }
         } else if (target != null) {
            this.Method952(target);
         }
      }

      if (this.Field2512.isCurrentMode(Method754(7656, -11258))) {
         if (this.Field2504.isCurrentMode(Method754(7563, 14278))) {
            if (Field2528.Method1799() > 0) {
               Field2528.forEach(this::Method959);
            }
         } else if (target != null) {
            this.Method961(target, 1);
         }
      }

      if (this.Field2512.isCurrentMode(Method754(7609, -8870))) {
         if (this.Field2504.isCurrentMode(Method754(7563, 14278))) {
            if (Field2528.Method1799() > 0) {
               Field2528.forEach(this::Method948);
            }
         } else if (target != null) {
            this.Method963(target);
         }
      }

   }

   private static int Method974(EntityLivingBase a, EntityLivingBase a) {
      return (int)(a.getHealth() - a.getHealth());
   }

   // $FF: synthetic method
   private static native void Method975();
}
