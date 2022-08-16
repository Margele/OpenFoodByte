/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 */
package awsl;

import awsl.Class411;
import awsl.Class412;
import awsl.Class413;
import awsl.Class418;
import awsl.Class421;
import awsl.Class446;
import awsl.Class447;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import obfuscate.a;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class417 {
    public String Field2012;
    public ArrayList Field2013;
    public Class421 Field2014;
    public double Field2015;
    public double Field2016;
    public double Field2017;
    public double Field2018;
    public boolean Field2019 = true;
    public boolean Field2020;

    public Class417(String a2, Class421 a3) {
        Class447 a4;
        boolean a5 = Class413.Method3580();
        this.Field2020 = false;
        this.Field2012 = a2;
        this.Field2018 = Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT + 2;
        this.Field2014 = a3;
        this.Field2013 = new ArrayList();
        Iterator iterator = Class446.Method2766(a2).Method1383();
        if (iterator.Method932()) {
            a4 = (Class447)iterator.Method933();
            if (a4 instanceof ModeValue) {
                this.Field2013.Method2530((Object)new Class411(this, (ModeValue)a4));
            }
            a.trash(new String[3]);
        }
        if ((iterator = Class446.Method2766(a2).Method1383()).Method932()) {
            a4 = (Class447)iterator.Method933();
            if (a4 instanceof FloatValue) {
                this.Field2013.Method2530((Object)new Class418(this, (FloatValue)a4));
            }
        }
        if ((iterator = Class446.Method2766(a2).Method1383()).Method932()) {
            a4 = (Class447)iterator.Method933();
            if (a4 instanceof BooleanValue) {
                this.Field2013.Method2530((Object)new Class412(this, (BooleanValue)a4));
            }
        }
    }

    public void Method2376(int a2, int a3, float a4) {
    }

    public boolean Method2377(int a2, int a3, int a4) {
        return this.Method2378(a2, a3);
    }

    public boolean Method2378(int a2, int a3) {
        return (double)a2 >= this.Field2015 && (double)a2 <= this.Field2015 + this.Field2017 && (double)a3 >= this.Field2016 && (double)a3 <= this.Field2016 + this.Field2018;
    }
}