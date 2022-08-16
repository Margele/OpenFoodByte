/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityBlaze
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntityMagmaCube
 *  net.minecraft.entity.monster.EntityPigZombie
 *  net.minecraft.entity.monster.EntitySlime
 *  net.minecraft.entity.monster.EntityZombie
 *  net.minecraft.init.Items
 *  net.minecraft.network.play.server.S0FPacketSpawnMob
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityMobSpawner
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
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
import net.minecraft.world.World;
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

public class UHCFind
extends Module {
    public BooleanValue Field2280 = new BooleanValue("UHCFind", "Mob Spawner", (Boolean)true, "\u5237\u602a\u7b3c-\u6df1\u84dd\u8272");
    public BooleanValue Field2281 = new BooleanValue("UHCFind", "Player Zombie", (Boolean)true, "\u9000\u6e38\u620f\u7684\u73a9\u5bb6-\u6df1\u7ea2\u8272");
    public BooleanValue Field2282 = new BooleanValue("UHCFind", "Enderman", (Boolean)true, "\u672b\u5f71\u4eba-\u7d2b\u8272");
    public BooleanValue Field2283 = new BooleanValue("UHCFind", "Creeper", (Boolean)true, "\u82e6\u529b\u6015-\u6df1\u7eff\u8272");
    public BooleanValue Field2284 = new BooleanValue("UHCFind", "Blaze", (Boolean)true, "\u70c8\u7130\u4eba-\u6a58\u9ec4\u8272");
    public BooleanValue Field2285 = new BooleanValue("UHCFind", "Slime", (Boolean)true, "\u53f2\u83b1\u59c6-\u7eff\u8272");
    public BooleanValue Field2286 = new BooleanValue("UHCFind", "Magma Cube", (Boolean)true, "\u5ca9\u6d46\u602a-\u6d45\u7ea2\u8272");

    public UHCFind() {
        super("UHCFind", "UHC Find", Category.WORLD);
        this.setDescription("Hypixel UHC \u914d\u65b9\u6750\u6599\u63a2\u7d22\u5e76\u6807\u8bb0!");
    }

    @EventTarget(value=0)
    public void Method802(EventRender3D a2) {
        Entity a3;
        a[] a4 = Class448.Method2461();
        if (!ServerUtils.isSinglePlayer(Servers.UHC)) {
            return;
        }
        List a5 = UHCFind.mc.theWorld.getLoadedEntityList();
        a5.sort(Comparator.comparingDouble(UHCFind::Method2246));
        int a6 = 0;
        Iterator iterator = a5.Method1383();
        if (iterator.Method932()) {
            a3 = (Entity)iterator.Method933();
            if (this.Field2282.getValue() && a3 instanceof EntityEnderman) {
                this.Method2245(a3, new Color(143, 0, 226));
            }
            if (this.Field2284.getValue() && a3 instanceof EntityBlaze) {
                this.Method2245(a3, new Color(239, 128, 2));
            }
            if (this.Field2285.getValue() && a3 instanceof EntitySlime) {
                this.Method2245(a3, new Color(41, 255, 0));
            }
            if (this.Field2286.getValue() && a3 instanceof EntityMagmaCube) {
                this.Method2245(a3, new Color(177, 22, 53));
            }
            if (this.Field2283.getValue() && a3 instanceof EntityCreeper && a6 < 2) {
                this.Method2245(a3, new Color(29, 156, 7));
                ++a6;
            }
            if (this.Field2281.getValue() && a3 instanceof EntityZombie && !(a3 instanceof EntityPigZombie) && a3.getDisplayName() != null && Objects.nonNull((Object)((EntityZombie)a3).getEquipmentInSlot(4)) && ((EntityZombie)a3).getEquipmentInSlot(4).getItem() == Items.skull) {
                this.Method2245(a3, new Color(255, 0, 0, 255));
            }
        }
        if (this.Field2280.getValue() && (iterator = UHCFind.mc.theWorld.loadedTileEntityList.Method1383()).Method932()) {
            a3 = (TileEntity)iterator.Method933();
            if (a3 instanceof TileEntityMobSpawner) {
                GL11.glPushMatrix();
                RenderUtils.Method1126(2.0f);
                TileEntityRendererDispatcher.instance.renderTileEntity((TileEntity)a3, a2.Field2922, -1);
                RenderUtils.Method1129();
                TileEntityRendererDispatcher.instance.renderTileEntity((TileEntity)a3, a2.Field2922, -1);
                RenderUtils.Method1130();
                TileEntityRendererDispatcher.instance.renderTileEntity((TileEntity)a3, a2.Field2922, -1);
                RenderUtils.Method1131(new Color(0, 86, 255).getRGB());
                TileEntityRendererDispatcher.instance.renderTileEntity((TileEntity)a3, a2.Field2922, -1);
                RenderUtils.Method1132();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glPopMatrix();
            }
        }
    }

    @EventTarget
    public void Method273(EventPacket a2) {
        a[] a3 = Class448.Method2461();
        if (a2.isSend() && !ServerUtils.isSinglePlayer(Servers.UHC)) {
            return;
        }
        if (a2.getPacket() instanceof S0FPacketSpawnMob) {
            S0FPacketSpawnMob a4 = (S0FPacketSpawnMob)a2.getPacket();
            EntityLivingBase a5 = (EntityLivingBase)EntityList.createEntityByID((int)a4.getEntityType(), (World)UHCFind.mc.theWorld);
            double a6 = (double)a4.getX() / 32.0;
            double a7 = (double)a4.getY() / 32.0;
            double a8 = (double)a4.getZ() / 32.0;
            float a9 = (float)(a4.getYaw() * 360) / 256.0f;
            float a10 = (float)(a4.getPitch() * 360) / 256.0f;
            a5.serverPosX = a4.getX();
            a5.serverPosY = a4.getY();
            a5.serverPosZ = a4.getZ();
            a5.renderYawOffset = a5.rotationYawHead = (float)(a4.getHeadPitch() * 360) / 256.0f;
            Entity[] a11 = a5.getParts();
            int a12 = a4.getEntityID() - a5.getEntityId();
            int a13 = 0;
            if (a13 < a11.length) {
                a11[a13].setEntityId(a11[a13].getEntityId() + a12);
                ++a13;
            }
            a5.setEntityId(a4.getEntityID());
            a5.setPositionAndRotation(a6, a7, a8, a9, a10);
            a5.motionX = (float)a4.getVelocityX() / 8000.0f;
            a5.motionY = (float)a4.getVelocityY() / 8000.0f;
            a5.motionZ = (float)a4.getVelocityZ() / 8000.0f;
            List a22 = a4.func_149027_c();
            a5.getDataWatcher().updateWatchedObjectsFromList(a22);
            a13 = a4.getX() / 32;
            int a14 = a4.getY() / 32;
            int a15 = a4.getZ() / 32;
            float a16 = (float)(UHCFind.mc.thePlayer.posX - (double)a13);
            float a17 = (float)(UHCFind.mc.thePlayer.posY - (double)a14);
            float a18 = (float)(UHCFind.mc.thePlayer.posZ - (double)a15);
            float a19 = MathHelper.sqrt_float((float)(a16 * a16 + a17 * a17 + a18 * a18));
            if (this.Field2282.getBooleanValue().booleanValue() && a5 instanceof EntityEnderman) {
                ChatUtils.addChatMessage("\u00a73Find \u00a79" + a5.getName() + "\u00a7e " + (int)a19 + "\u00a77m \u00a7BX: \u00a7r" + a13 + " \u00a7BY: \u00a7r" + a14 + " \u00a7BZ: \u00a7r" + a15);
            }
            if (this.Field2286.getBooleanValue().booleanValue() && a5 instanceof EntityMagmaCube) {
                ChatUtils.addChatMessage("\u00a73Find \u00a79" + a5.getName() + "\u00a7e " + (int)a19 + "\u00a77m \u00a7BX: \u00a7r" + a13 + " \u00a7BY: \u00a7r" + a14 + " \u00a7BZ: \u00a7r" + a15);
            }
            if (this.Field2284.getBooleanValue().booleanValue() && a5 instanceof EntityBlaze) {
                ChatUtils.addChatMessage("\u00a73Find \u00a79" + a5.getName() + "\u00a7e " + (int)a19 + "\u00a77m \u00a7BX: \u00a7r" + a13 + " \u00a7BY: \u00a7r" + a14 + " \u00a7BZ: \u00a7r" + a15);
            }
            if (this.Field2281.getBooleanValue().booleanValue() && a5 instanceof EntityZombie && !(a5 instanceof EntityPigZombie) && a5.getDisplayName() != null && !a5.getDisplayName().getUnformattedText().equalsIgnoreCase("Zombie") && !a5.getDisplayName().getUnformattedText().equalsIgnoreCase("\u50f5\u5c38") && !a5.getDisplayName().getFormattedText().startsWith("\u00a7")) {
                ChatUtils.addChatMessage("\u00a73Find \u00a79" + a5.getDisplayName().getFormattedText() + " Exit! \u00a7e " + (int)a19 + "\u00a77m \u00a7BX: \u00a7r" + a13 + " \u00a7BY: \u00a7r" + a14 + " \u00a7BZ: \u00a7r" + a15);
            }
        }
    }

    public void Method2245(Entity a2, Color a3) {
        float a4 = ReflectionUtils.getRenderPartialTicks();
        double a5 = a2.lastTickPosX + (a2.posX - a2.lastTickPosX) * (double)a4 - ReflectionUtils.getRenderPosX();
        double a6 = a2.lastTickPosY + (a2.posY - a2.lastTickPosY) * (double)a4 - ReflectionUtils.getRenderPosY();
        double a7 = a2.lastTickPosZ + (a2.posZ - a2.lastTickPosZ) * (double)a4 - ReflectionUtils.getRenderPosZ();
        double a8 = (double)a2.width / 1.5;
        double a9 = a2.getEntityBoundingBox().maxY - a2.getEntityBoundingBox().minY;
        GL11.glPushMatrix();
        RenderUtils.Method1126(2.0f);
        GL11.glDisable((int)2848);
        RenderUtils.Method1124(new AxisAlignedBB(a5 - a8, a6, a7 - a8, a5 + a8, a6 + a9, a7 + a8));
        RenderUtils.Method1129();
        RenderUtils.Method1124(new AxisAlignedBB(a5 - a8, a6, a7 - a8, a5 + a8, a6 + a9, a7 + a8));
        RenderUtils.Method1130();
        RenderUtils.Method1124(new AxisAlignedBB(a5 - a8, a6, a7 - a8, a5 + a8, a6 + a9, a7 + a8));
        RenderUtils.Method1131(a3.getRGB());
        RenderUtils.Method1124(new AxisAlignedBB(a5 - a8, a6, a7 - a8, a5 + a8, a6 + a9, a7 + a8));
        RenderUtils.Method1132();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    private static double Method2246(Entity a2) {
        return UHCFind.mc.thePlayer.getDistanceToEntity(a2);
    }
}