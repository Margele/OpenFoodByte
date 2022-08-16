/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.List
 *  java.util.Random
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 */
package trash.foodbyte.module.impl.render;

import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.List;
import java.util.Random;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.FloatValue;

public class ShowEntity
extends Module {
    public FloatValue Field2209 = new FloatValue("ShowEntity", "EntityReach", 5.0, 3.0, 10.0, 0.1, "\u7784\u51c6\u5b9e\u4f53\u7684\u8ddd\u79bb\u5f00\u59cb\u663e\u793a");
    public FloatValue Field2210 = new FloatValue("ShowEntity", "entityInfoStay", 0.0, 0.0, 5.0, 1.0, "\u5ef6\u8fdf\u6d88\u5931\u5b9e\u4f53\u6570\u636e");
    private Entity Field2211;
    private MovingObjectPosition Field2212;
    EntityLivingBase Field2213;
    long Field2214 = 0L;

    public ShowEntity() {
        super("ShowEntity", "Show Entity", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u663e\u793a\u7784\u51c6\u5b9e\u4f53\u7684\u6570\u636e";
    }

    /*
     * Unable to fully structure code
     */
    @EventTarget
    private void Method810(EventRender2D a) {
        block20: {
            block19: {
                block18: {
                    block17: {
                        block16: {
                            var3_2 = new ScaledResolution(ShowEntity.mc);
                            var4_3 = System.currentTimeMillis();
                            a = Class492.Method2239();
                            a = this.Method2277(this.Field2209.getFloatValue().floatValue(), 0.0f);
                            if (a.entityHit != null && a.entityHit instanceof EntityLivingBase) {
                                this.Field2213 = (EntityLivingBase)a.entityHit;
                                this.Field2214 = a;
                            }
                            if (this.Field2213 == null || this.Field2213.isInvisibleToPlayer((EntityPlayer)ShowEntity.mc.thePlayer) || !((float)(a - this.Field2214) <= 1000.0f * this.Field2210.getFloatValueCast())) break block20;
                            a = 1.0f;
                            if (this.Field2213.width > a) {
                                a = this.Field2213.width;
                            }
                            if (this.Field2213.height > a * 2.0f) {
                                a = this.Field2213.height / 2.0f;
                            }
                            a = a.getScaledWidth() / 2;
                            a = a.getScaledHeight() / 2;
                            a = "" + (int)this.Field2213.getHealth();
                            a = ShowEntity.mc.fontRendererObj.getStringWidth(a);
                            a = this.Field2213.getHealth();
                            if (a > 20.0f) {
                                a = 20.0f;
                            }
                            a = (int)Math.abs((float)(a * 5.0f * 0.01f * 0.0f + (1.0f - a * 5.0f * 0.01f) * 255.0f));
                            a = (int)Math.abs((float)(a * 5.0f * 0.01f * 255.0f + (1.0f - a * 5.0f * 0.01f) * 0.0f));
                            a = new Color(a, a, 0).brighter();
                            a = this.Field2213.getDisplayName().getFormattedText();
                            a = a - 80;
                            ShowEntity.mc.fontRendererObj.drawStringWithShadow(a, (float)a, (float)(a - 55), 0xFFFFFF);
                            a = MathHelper.ceiling_float_int((float)this.Field2213.getHealth());
                            a = this.Field2213.getEntityAttribute(SharedMonsterAttributes.maxHealth);
                            a = (float)a.getBaseValue();
                            a = a + "\u00a7f/\u00a7a" + (int)a;
                            a = 2;
                            a = 2.0f;
                            ShowEntity.mc.getTextureManager().bindTexture(GuiIngame.icons);
                            a = Math.min((float)200.0f, (float)a);
                            a = (int)((float)a * a / a);
                            a = a = this.Field2213.getAbsorptionAmount();
                            a = MathHelper.ceiling_float_int((float)((a + a) / 2.0f / 10.0f));
                            a = Math.max((int)(10 - (a - 2)), (int)3);
                            a = -1;
                            a = MathHelper.ceiling_float_int((float)((a + a) / 2.0f)) - 1;
                            a = 16;
                            a = true;
                            a = MathHelper.ceiling_float_int((float)((float)(a + 1) / 10.0f)) - 1;
                            a = a % 10 * 8;
                            a = a;
                            a = a - 45 + a * a * 1;
                            if ((double)a <= (double)a * 0.4) {
                                a += new Random().nextInt(2);
                            }
                            if (a != -1) break block16;
                            a -= 2;
                        }
                        a = 0;
                        if (this.Field2213.worldObj.getWorldInfo().isHardcoreModeEnabled()) {
                            a = 5;
                        }
                        ShowEntity.mc.ingameGUI.drawTexturedModalRect(a, a, 25, 9 * a, 9, 9);
                        if (!(a > 0.0f)) ** GOTO lbl74
                        if (a != a) break block17;
                        if (a % 2.0f != 1.0f) break block17;
                        ShowEntity.mc.ingameGUI.drawTexturedModalRect(a, a, 169, 9 * a, 9, 9);
                    }
                    ShowEntity.mc.ingameGUI.drawTexturedModalRect(a, a, 160, 9 * a, 9, 9);
                    a -= 2.0f;
lbl74:
                    // 2 sources

                    if (a * 2 + 1 >= a) break block18;
                    ShowEntity.mc.ingameGUI.drawTexturedModalRect(a, a, 52, 9 * a, 9, 9);
                }
                if (a * 2 + 1 != a) break block19;
                ShowEntity.mc.ingameGUI.drawTexturedModalRect(a, a, 61, 9 * a, 9, 9);
            }
            try {
                --a;
                ShowEntity.mc.fontRendererObj.drawStringWithShadow(a, (float)a + 12.0f, (float)a - 45.0f, a.getRGB());
            }
            catch (Exception a) {
                a.printStackTrace();
            }
        }
    }

    public MovingObjectPosition Method2277(double a, float a2) {
        Entity a3 = mc.getRenderViewEntity();
        if (ShowEntity.mc.theWorld != null) {
            ShowEntity.mc.mcProfiler.startSection("pick");
            ShowEntity.mc.pointedEntity = null;
            MovingObjectPosition a4 = a3.rayTrace(a, a2);
            Vec3 a5 = a3.getPositionEyes(a2);
            Vec3 a6 = a3.getLook(a2);
            Vec3 a7 = a5.addVector(a6.xCoord * a, a6.yCoord * a, a6.zCoord * a);
            Entity a8 = null;
            Vec3 a9 = null;
            float a10 = 1.0f;
            List a11 = ShowEntity.mc.theWorld.getEntitiesWithinAABBExcludingEntity(a3, a3.getEntityBoundingBox().addCoord(a6.xCoord * a, a6.yCoord * a, a6.zCoord * a).expand((double)a10, (double)a10, (double)a10));
            double a12 = a;
            a12 = a4.hitVec.distanceTo(a5);
            for (int a13 = 0; a13 < a11.Method1799(); ++a13) {
                Entity a14 = (Entity)a11.get(a13);
                if (!a14.canBeCollidedWith()) continue;
                float a15 = a14.getCollisionBorderSize();
                AxisAlignedBB a16 = a14.getEntityBoundingBox().expand((double)a15, (double)a15, (double)a15);
                MovingObjectPosition a17 = a16.calculateIntercept(a5, a7);
                if (a16.isVecInside(a5)) {
                    if (!(0.0 < a12) && a12 != 0.0) continue;
                    a8 = a14;
                    a9 = a5;
                    a12 = 0.0;
                    continue;
                }
                double a18 = a5.distanceTo(a17.hitVec);
                if (!(a18 < a12) && a12 != 0.0) continue;
                if (a14 == a3.ridingEntity) {
                    if (a12 != 0.0) continue;
                    a8 = a14;
                    a9 = a17.hitVec;
                    continue;
                }
                a8 = a14;
                a9 = a17.hitVec;
                a12 = a18;
            }
            if (!(a12 < a)) {
            }
            a4 = new MovingObjectPosition(a8, a9);
            if (a8 instanceof EntityLivingBase || a8 instanceof EntityItemFrame) {
                ShowEntity.mc.pointedEntity = a8;
            }
            return a4;
        }
        return null;
    }

    private static Exception Method263(Exception exception) {
        return exception;
    }
}