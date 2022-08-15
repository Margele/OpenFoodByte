/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.entity.player.EntityPlayer
 */
package awsl;

import net.minecraft.entity.player.EntityPlayer;

public class Class275 {
    public EntityPlayer Field1477;
    public float Field1478 = 0.0f;

    public Class275(EntityPlayer a) {
        this.Field1477 = a;
    }

    public void Method2806(float a, float a2) {
        String a3 = this.Field1477.getName();
        String a4 = (double)Math.round((float)(this.Field1477.getHealth() * 10.0f)) / 10.0 + " hp";
    }

    public void Method2807(EntityPlayer a) {
        this.Field1477 = a;
    }
}