package trash.foodbyte.module.impl.world;

import awsl.Class448;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.network.play.server.S0FPacketSpawnMob;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.value.BooleanValue;

public class UHCFind extends Module {
   public BooleanValue Field2280 = new BooleanValue("UHCFind", "Mob Spawner", true, "刷怪笼-深蓝色");
   public BooleanValue Field2281 = new BooleanValue("UHCFind", "Player Zombie", true, "退游戏的玩家-深红色");
   public BooleanValue Field2282 = new BooleanValue("UHCFind", "Enderman", true, "末影人-紫色");
   public BooleanValue Field2283 = new BooleanValue("UHCFind", "Creeper", true, "苦力怕-深绿色");
   public BooleanValue Field2284 = new BooleanValue("UHCFind", "Blaze", true, "烈焰人-橘黄色");
   public BooleanValue Field2285 = new BooleanValue("UHCFind", "Slime", true, "史莱姆-绿色");
   public BooleanValue Field2286 = new BooleanValue("UHCFind", "Magma Cube", true, "岩浆怪-浅红色");

   public UHCFind() {
      super("UHCFind", "UHC Find", Category.WORLD);
      this.setDescription("Hypixel UHC 配方材料探索并标记!");
   }

   @EventTarget(0)
   public void Method802(EventRender3D a) {
      a[] a = Class448.trash();
      if (ServerUtils.isSinglePlayer(Servers.UHC)) {
         List a = mc.theWorld.getLoadedEntityList();
         a.sort(Comparator.comparingDouble(UHCFind::Method2246));
         int a = 0;
         Iterator var5 = a.Method1383();
         if (var5.Method932()) {
            Entity a = (Entity)var5.Method933();
            if (this.Field2282.getValue() && a instanceof EntityEnderman) {
               this.Method2245(a, new Color(143, 0, 226));
            }

            if (this.Field2284.getValue() && a instanceof EntityBlaze) {
               this.Method2245(a, new Color(239, 128, 2));
            }

            if (this.Field2285.getValue() && a instanceof EntitySlime) {
               this.Method2245(a, new Color(41, 255, 0));
            }

            if (this.Field2286.getValue() && a instanceof EntityMagmaCube) {
               this.Method2245(a, new Color(177, 22, 53));
            }

            if (this.Field2283.getValue() && a instanceof EntityCreeper && a < 2) {
               this.Method2245(a, new Color(29, 156, 7));
               ++a;
            }

            if (this.Field2281.getValue() && a instanceof EntityZombie && !(a instanceof EntityPigZombie) && a.getDisplayName() != null && Objects.nonNull(((EntityZombie)a).getEquipmentInSlot(4)) && ((EntityZombie)a).getEquipmentInSlot(4).getItem() == Items.skull) {
               this.Method2245(a, new Color(255, 0, 0, 255));
            }
         }

         if (this.Field2280.getValue()) {
            var5 = mc.theWorld.loadedTileEntityList.Method1383();
            if (var5.Method932()) {
               TileEntity a = (TileEntity)var5.Method933();
               if (a instanceof TileEntityMobSpawner) {
                  GL11.glPushMatrix();
                  RenderUtils.Method1126(2.0F);
                  TileEntityRendererDispatcher.instance.renderTileEntity(a, a.Field2922, -1);
                  RenderUtils.Method1129();
                  TileEntityRendererDispatcher.instance.renderTileEntity(a, a.Field2922, -1);
                  RenderUtils.Method1130();
                  TileEntityRendererDispatcher.instance.renderTileEntity(a, a.Field2922, -1);
                  RenderUtils.Method1131((new Color(0, 86, 255)).getRGB());
                  TileEntityRendererDispatcher.instance.renderTileEntity(a, a.Field2922, -1);
                  RenderUtils.Method1132();
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  GL11.glPopMatrix();
               }
            }
         }

      }
   }

   @EventTarget
   public void Method273(EventPacket a) {
      a[] a = Class448.trash();
      if (!a.isSend() || ServerUtils.isSinglePlayer(Servers.UHC)) {
         if (a.getPacket() instanceof S0FPacketSpawnMob) {
            S0FPacketSpawnMob a = (S0FPacketSpawnMob)a.getPacket();
            EntityLivingBase a = (EntityLivingBase)EntityList.createEntityByID(a.getEntityType(), mc.theWorld);
            double a = (double)a.getX() / 32.0;
            double a = (double)a.getY() / 32.0;
            double a = (double)a.getZ() / 32.0;
            float a = (float)(a.getYaw() * 360) / 256.0F;
            float a = (float)(a.getPitch() * 360) / 256.0F;
            a.serverPosX = a.getX();
            a.serverPosY = a.getY();
            a.serverPosZ = a.getZ();
            a.renderYawOffset = a.rotationYawHead = (float)(a.getHeadPitch() * 360) / 256.0F;
            Entity[] a = a.getParts();
            int a = a.getEntityID() - a.getEntityId();
            int a = 0;
            if (a < a.length) {
               a[a].setEntityId(a[a].getEntityId() + a);
               ++a;
            }

            a.setEntityId(a.getEntityID());
            a.setPositionAndRotation(a, a, a, a, a);
            a.motionX = (double)((float)a.getVelocityX() / 8000.0F);
            a.motionY = (double)((float)a.getVelocityY() / 8000.0F);
            a.motionZ = (double)((float)a.getVelocityZ() / 8000.0F);
            List a = a.func_149027_c();
            a.getDataWatcher().updateWatchedObjectsFromList(a);
            a = a.getX() / 32;
            int a = a.getY() / 32;
            int a = a.getZ() / 32;
            float a = (float)(mc.thePlayer.posX - (double)a);
            float a = (float)(mc.thePlayer.posY - (double)a);
            float a = (float)(mc.thePlayer.posZ - (double)a);
            float a = MathHelper.sqrt_float(a * a + a * a + a * a);
            if (this.Field2282.getBooleanValue() && a instanceof EntityEnderman) {
               ChatUtils.addChatMessage("§3Find §9" + a.getName() + "§e " + (int)a + "§7m §BX: §r" + a + " §BY: §r" + a + " §BZ: §r" + a);
            }

            if (this.Field2286.getBooleanValue() && a instanceof EntityMagmaCube) {
               ChatUtils.addChatMessage("§3Find §9" + a.getName() + "§e " + (int)a + "§7m §BX: §r" + a + " §BY: §r" + a + " §BZ: §r" + a);
            }

            if (this.Field2284.getBooleanValue() && a instanceof EntityBlaze) {
               ChatUtils.addChatMessage("§3Find §9" + a.getName() + "§e " + (int)a + "§7m §BX: §r" + a + " §BY: §r" + a + " §BZ: §r" + a);
            }

            if (this.Field2281.getBooleanValue() && a instanceof EntityZombie && !(a instanceof EntityPigZombie) && a.getDisplayName() != null && !a.getDisplayName().getUnformattedText().equalsIgnoreCase("Zombie") && !a.getDisplayName().getUnformattedText().equalsIgnoreCase("僵尸") && !a.getDisplayName().getFormattedText().startsWith("§")) {
               ChatUtils.addChatMessage("§3Find §9" + a.getDisplayName().getFormattedText() + " Exit! §e " + (int)a + "§7m §BX: §r" + a + " §BY: §r" + a + " §BZ: §r" + a);
            }
         }

      }
   }

   public void Method2245(Entity a, Color a) {
      float a = ReflectionUtils.getRenderPartialTicks();
      double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a - ReflectionUtils.getRenderPosX();
      double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a - ReflectionUtils.getRenderPosY();
      double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a - ReflectionUtils.getRenderPosZ();
      double a = (double)a.width / 1.5;
      double a = a.getEntityBoundingBox().maxY - a.getEntityBoundingBox().minY;
      GL11.glPushMatrix();
      RenderUtils.Method1126(2.0F);
      GL11.glDisable(2848);
      RenderUtils.Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      RenderUtils.Method1129();
      RenderUtils.Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      RenderUtils.Method1130();
      RenderUtils.Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      RenderUtils.Method1131(a.getRGB());
      RenderUtils.Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      RenderUtils.Method1132();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   private static double Method2246(Entity a) {
      return (double)mc.thePlayer.getDistanceToEntity(a);
   }
}
