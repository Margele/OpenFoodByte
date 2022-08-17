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
      a[] var2 = Class448.trash();
      if (ServerUtils.isSinglePlayer(Servers.UHC)) {
         List var3 = mc.theWorld.getLoadedEntityList();
         var3.sort(Comparator.comparingDouble(UHCFind::Method2246));
         int var4 = 0;
         Iterator var5 = var3.Method1383();
         if (var5.Method932()) {
            Entity var6 = (Entity)var5.Method933();
            if (this.Field2282.getValue() && var6 instanceof EntityEnderman) {
               this.Method2245(var6, new Color(143, 0, 226));
            }

            if (this.Field2284.getValue() && var6 instanceof EntityBlaze) {
               this.Method2245(var6, new Color(239, 128, 2));
            }

            if (this.Field2285.getValue() && var6 instanceof EntitySlime) {
               this.Method2245(var6, new Color(41, 255, 0));
            }

            if (this.Field2286.getValue() && var6 instanceof EntityMagmaCube) {
               this.Method2245(var6, new Color(177, 22, 53));
            }

            if (this.Field2283.getValue() && var6 instanceof EntityCreeper && var4 < 2) {
               this.Method2245(var6, new Color(29, 156, 7));
               ++var4;
            }

            if (this.Field2281.getValue() && var6 instanceof EntityZombie && !(var6 instanceof EntityPigZombie) && var6.getDisplayName() != null && Objects.nonNull(((EntityZombie)var6).getEquipmentInSlot(4)) && ((EntityZombie)var6).getEquipmentInSlot(4).getItem() == Items.skull) {
               this.Method2245(var6, new Color(255, 0, 0, 255));
            }
         }

         if (this.Field2280.getValue()) {
            var5 = mc.theWorld.loadedTileEntityList.Method1383();
            if (var5.Method932()) {
               TileEntity var7 = (TileEntity)var5.Method933();
               if (var7 instanceof TileEntityMobSpawner) {
                  GL11.glPushMatrix();
                  RenderUtils.Method1126(2.0F);
                  TileEntityRendererDispatcher.instance.renderTileEntity(var7, a.Field2922, -1);
                  RenderUtils.Method1129();
                  TileEntityRendererDispatcher.instance.renderTileEntity(var7, a.Field2922, -1);
                  RenderUtils.Method1130();
                  TileEntityRendererDispatcher.instance.renderTileEntity(var7, a.Field2922, -1);
                  RenderUtils.Method1131((new Color(0, 86, 255)).getRGB());
                  TileEntityRendererDispatcher.instance.renderTileEntity(var7, a.Field2922, -1);
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
      a[] var2 = Class448.trash();
      if (!a.isSend() || ServerUtils.isSinglePlayer(Servers.UHC)) {
         if (a.getPacket() instanceof S0FPacketSpawnMob) {
            S0FPacketSpawnMob var3 = (S0FPacketSpawnMob)a.getPacket();
            EntityLivingBase var4 = (EntityLivingBase)EntityList.createEntityByID(var3.getEntityType(), mc.theWorld);
            double var5 = (double)var3.getX() / 32.0;
            double var7 = (double)var3.getY() / 32.0;
            double var9 = (double)var3.getZ() / 32.0;
            float var11 = (float)(var3.getYaw() * 360) / 256.0F;
            float var12 = (float)(var3.getPitch() * 360) / 256.0F;
            var4.serverPosX = var3.getX();
            var4.serverPosY = var3.getY();
            var4.serverPosZ = var3.getZ();
            var4.renderYawOffset = var4.rotationYawHead = (float)(var3.getHeadPitch() * 360) / 256.0F;
            Entity[] var13 = var4.getParts();
            int var14 = var3.getEntityID() - var4.getEntityId();
            int var15 = 0;
            if (var15 < var13.length) {
               var13[var15].setEntityId(var13[var15].getEntityId() + var14);
               ++var15;
            }

            var4.setEntityId(var3.getEntityID());
            var4.setPositionAndRotation(var5, var7, var9, var11, var12);
            var4.motionX = (double)((float)var3.getVelocityX() / 8000.0F);
            var4.motionY = (double)((float)var3.getVelocityY() / 8000.0F);
            var4.motionZ = (double)((float)var3.getVelocityZ() / 8000.0F);
            List var22 = var3.func_149027_c();
            var4.getDataWatcher().updateWatchedObjectsFromList(var22);
            var15 = var3.getX() / 32;
            int var16 = var3.getY() / 32;
            int var17 = var3.getZ() / 32;
            float var18 = (float)(mc.thePlayer.posX - (double)var15);
            float var19 = (float)(mc.thePlayer.posY - (double)var16);
            float var20 = (float)(mc.thePlayer.posZ - (double)var17);
            float var21 = MathHelper.sqrt_float(var18 * var18 + var19 * var19 + var20 * var20);
            if (this.Field2282.getBooleanValue() && var4 instanceof EntityEnderman) {
               ChatUtils.addChatMessage("§3Find §9" + var4.getName() + "§e " + (int)var21 + "§7m §BX: §r" + var15 + " §BY: §r" + var16 + " §BZ: §r" + var17);
            }

            if (this.Field2286.getBooleanValue() && var4 instanceof EntityMagmaCube) {
               ChatUtils.addChatMessage("§3Find §9" + var4.getName() + "§e " + (int)var21 + "§7m §BX: §r" + var15 + " §BY: §r" + var16 + " §BZ: §r" + var17);
            }

            if (this.Field2284.getBooleanValue() && var4 instanceof EntityBlaze) {
               ChatUtils.addChatMessage("§3Find §9" + var4.getName() + "§e " + (int)var21 + "§7m §BX: §r" + var15 + " §BY: §r" + var16 + " §BZ: §r" + var17);
            }

            if (this.Field2281.getBooleanValue() && var4 instanceof EntityZombie && !(var4 instanceof EntityPigZombie) && var4.getDisplayName() != null && !var4.getDisplayName().getUnformattedText().equalsIgnoreCase("Zombie") && !var4.getDisplayName().getUnformattedText().equalsIgnoreCase("僵尸") && !var4.getDisplayName().getFormattedText().startsWith("§")) {
               ChatUtils.addChatMessage("§3Find §9" + var4.getDisplayName().getFormattedText() + " Exit! §e " + (int)var21 + "§7m §BX: §r" + var15 + " §BY: §r" + var16 + " §BZ: §r" + var17);
            }
         }

      }
   }

   public void Method2245(Entity a, Color a) {
      float var3 = ReflectionUtils.getRenderPartialTicks();
      double var4 = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)var3 - ReflectionUtils.getRenderPosX();
      double var6 = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)var3 - ReflectionUtils.getRenderPosY();
      double var8 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)var3 - ReflectionUtils.getRenderPosZ();
      double var10 = (double)a.width / 1.5;
      double var12 = a.getEntityBoundingBox().maxY - a.getEntityBoundingBox().minY;
      GL11.glPushMatrix();
      RenderUtils.Method1126(2.0F);
      GL11.glDisable(2848);
      RenderUtils.Method1124(new AxisAlignedBB(var4 - var10, var6, var8 - var10, var4 + var10, var6 + var12, var8 + var10));
      RenderUtils.Method1129();
      RenderUtils.Method1124(new AxisAlignedBB(var4 - var10, var6, var8 - var10, var4 + var10, var6 + var12, var8 + var10));
      RenderUtils.Method1130();
      RenderUtils.Method1124(new AxisAlignedBB(var4 - var10, var6, var8 - var10, var4 + var10, var6 + var12, var8 + var10));
      RenderUtils.Method1131(a.getRGB());
      RenderUtils.Method1124(new AxisAlignedBB(var4 - var10, var6, var8 - var10, var4 + var10, var6 + var12, var8 + var10));
      RenderUtils.Method1132();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   private static double Method2246(Entity a) {
      return (double)mc.thePlayer.getDistanceToEntity(a);
   }
}
