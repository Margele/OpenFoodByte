/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class381;
import awsl.Class390;
import awsl.Class397;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.value.FloatValue;

public class Class396
extends Class397 {
    public FloatValue Field1954;
    public String Field1955;

    public Class396(FloatValue a, Class381 a2, int a3, int a4, String a5, String a6) {
        super(a, a2, a3, a4, a5, a.Method2750(), a.Method2751(), a.Method2752(), a6);
        this.Field1954 = a;
        this.Field1958 = this.Field1954.Method2744().floatValue();
        this.Field1920 = "Slider";
    }

    @Override
    public void Method419(int a, int a2) {
        this.Field1916 = !this.Field1954.Method2756();
    }

    @Override
    public void Method411(int a, int a2) {
        int n = Class390.Method1318();
        super.Method411(a, a2);
        int n2 = n;
        if (this.Field1961) {
            this.Field1954.Method2745(this.Field1958);
            GlobalModule.INSTANCE.fileManager.saveValues();
        }
        this.Field1958 = this.Field1954.Method2744().floatValue();
    }
}