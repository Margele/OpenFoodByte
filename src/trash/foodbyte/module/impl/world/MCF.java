/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 */
package trash.foodbyte.module.impl.world;

import awsl.Class305;
import awsl.Class309;
import awsl.Class364;
import awsl.Class448;
import awsl.Class653;
import awsl.Class91;
import eventapi.EventTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;
import trash.foodbyte.utils.ChatUtils;

public class MCF
extends Module {
    private final Class364 Field2303 = new Class364(2);

    public MCF() {
        super("MCF", Category.WORLD);
    }

    @Override
    public String getDescription() {
        return "\u9f20\u6807\u4e2d\u952e\u6dfb\u52a0Friend";
    }

    @EventTarget
    public void Method755(Class653 a) {
        Class91[] a2 = Class448.Method2461();
        if (MCF.mc.objectMouseOver != null && MCF.mc.objectMouseOver.entityHit instanceof EntityPlayer) {
            EntityLivingBase a3 = (EntityLivingBase)MCF.mc.objectMouseOver.entityHit;
            String a4 = MCF.mc.objectMouseOver.entityHit.getName();
            if (this.Field2303.Method582()) {
                ChatUtils.debug("Team: " + a3.getName());
                ChatUtils.debug("Team: " + a3.getTeam().isSameTeam(MCF.mc.thePlayer.getTeam()));
                if (Class305.Method697((Entity)a3)) {
                    int a5 = 0;
                    if (a5 < Class305.Method695().Method1799()) {
                        Class309 a6 = (Class309)Class305.Method695().get(a5);
                        if (a6.Method748().equalsIgnoreCase(a4)) {
                            Class305.Method695().remove(a5);
                            GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Friend", "Remove " + a4, Types.WARNING));
                        }
                        ++a5;
                    }
                }
                Class305.Method695().Method2530((Object)new Class309(a4, a4));
                GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Friend", "Add " + a4, Types.SUCCESS));
                GlobalModule.INSTANCE.fileManager.saveFriends();
            }
        }
    }
}