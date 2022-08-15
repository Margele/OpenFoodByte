/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Map
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.Vec3
 */
package awsl;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.render.Arrow;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class492 {
    private Map Field2269;
    private Map Field2270;
    final Arrow Field2271;
    private static String Field2272;

    public Class492(Arrow a) {
        this.Field2271 = a;
        this.Field2269 = Maps.newHashMap();
        this.Field2270 = Maps.newHashMap();
    }

    private void Method2234(EventRender3D a) {
        Iterator iterator;
        String a2 = Class492.Method2239();
        if (!this.Field2269.isEmpty()) {
            this.Field2269.clear();
        }
        if (!this.Field2270.isEmpty()) {
            this.Field2270.clear();
        }
        if ((iterator = Module.mc.theWorld.loadedEntityList.Method1383()).Method932()) {
            Entity a3 = (Entity)iterator.Method933();
            if (a3 instanceof EntityLivingBase && this.Field2271.Method965((EntityLivingBase)a3)) {
                EntityLivingBase a4 = (EntityLivingBase)a3;
                Vec3 a5 = this.Method2235((Entity)a4);
                a5.add(new Vec3(0.0, (double)a4.height + 0.2, 0.0));
                Vec3 a6 = RenderUtils.Method1135(a5.xCoord, a5.yCoord, a5.zCoord);
                Vec3 a7 = RenderUtils.Method1135(a5.xCoord, a5.yCoord - 2.0, a5.zCoord);
                this.Field2269.put((Object)a4, (Object)a6);
                this.Field2270.put((Object)a4, (Object)a7);
            }
        }
    }

    private Vec3 Method2235(Entity a) {
        double a2 = ReflectionUtils.Method2587();
        double a3 = a.lastTickPosX + (a.posX - a.lastTickPosX) * a2 - Module.mc.getRenderManager().viewerPosX;
        double a4 = a.lastTickPosY + (a.posY - a.lastTickPosY) * a2 - Module.mc.getRenderManager().viewerPosY;
        double a5 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a2 - Module.mc.getRenderManager().viewerPosZ;
        return new Vec3(a3, a4, a5);
    }

    public Map Method2236() {
        return this.Field2270;
    }

    static void Method2237(Class492 a, EventRender3D a2) {
        a.Method2234(a2);
    }

    public static void Method2238(String string) {
        Field2272 = string;
    }

    public static String Method2239() {
        return Field2272;
    }

    static {
        if (Class492.Method2239() != null) {
            Class492.Method2238("JIUsl");
        }
    }
}