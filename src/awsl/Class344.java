/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class343;
import trash.foodbyte.utils.RenderUtils;

public class Class344 {
    private int Field1653;
    private int Field1654;
    private int Field1655;
    private int Field1656;
    private boolean Field1657;
    private Class343 Field1658 = new Class343(this);

    public Class344(int a) {
        this.Field1653 = a;
        this.Field1655 = a;
        this.Field1654 = 0;
    }

    public void Method290(boolean a) {
        int[] nArray = RenderUtils.Method1148();
        if (this.Field1658.Method298(10.0)) {
            if (this.Field1656 < this.Field1653) {
                if (!this.Field1657) {
                    this.Field1654 = this.Field1656;
                }
                ++this.Field1656;
            }
            this.Field1657 = true;
            if (this.Field1656 > 0) {
                if (this.Field1657) {
                    this.Field1655 = this.Field1656;
                }
                --this.Field1656;
            }
            this.Field1657 = false;
            this.Field1658.Method299();
        }
    }

    public void Method291() {
        this.Field1656 = 0;
        this.Field1657 = false;
        this.Field1658.Method299();
        this.Field1655 = this.Field1653;
        this.Field1654 = 0;
    }

    public double Method292() {
        return this.Field1657 ? Math.sin((double)((double)(this.Field1656 - this.Field1654) / (double)(this.Field1653 - this.Field1654) * Math.PI / 2.0)) : 1.0 - Math.cos((double)((double)this.Field1656 / (double)this.Field1655 * Math.PI / 2.0));
    }
}