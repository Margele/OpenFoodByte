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
import eventapi.EventTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import obfuscate.a;
import trash.foodbyte.event.EventTick;
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
    public void Method755(EventTick a2) {
        a[] a3 = Class448.Method2461();
        if (MCF.mc.objectMouseOver != null && MCF.mc.objectMouseOver.entityHit instanceof EntityPlayer) {
            EntityLivingBase a4 = (EntityLivingBase)MCF.mc.objectMouseOver.entityHit;
            String a5 = MCF.mc.objectMouseOver.entityHit.getName();
            if (this.Field2303.Method582()) {
                ChatUtils.debug("Team: " + a4.getName());
                ChatUtils.debug("Team: " + a4.getTeam().isSameTeam(MCF.mc.thePlayer.getTeam()));
                if (Class305.Method697((Entity)a4)) {
                    int a6 = 0;
                    if (a6 < Class305.Method695().Method1799()) {
                        Class309 a7 = (Class309)Class305.Method695().get(a6);
                        if (a7.Method748().equalsIgnoreCase(a5)) {
                            Class305.Method695().remove(a6);
                            GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Friend", "Remove " + a5, Types.WARNING));
                        }
                        ++a6;
                    }
                }
                Class305.Method695().Method2530((Object)new Class309(a5, a5));
                GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Friend", "Add " + a5, Types.SUCCESS));
                GlobalModule.INSTANCE.fileManager.saveFriends();
            }
        }
    }
}