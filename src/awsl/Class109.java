/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;

public class Class109
extends Class119 {
    private int Field853;
    private int Field854;
    private int Field855;
    private int Field856;
    private int Field857;
    private int Field858;
    private int Field859;
    private int Field860;
    private int Field861;
    private int Field862;
    private int Field863;
    private int Field864;
    private int Field865;
    private int Field866;
    private int Field867;
    private int Field868;
    private int Field869;
    private int Field870;

    public Class109() {
        this.Method9(-65536);
        this.Method11(-65281);
        this.Method13(-16776961);
        this.Method15(-16711681);
    }

    public void Method9(int a) {
        this.Field855 = a;
        this.Field859 = a >> 16 & 0xFF;
        this.Field860 = a >> 8 & 0xFF;
        this.Field861 = a & 0xFF;
    }

    public int Method10() {
        return this.Field855;
    }

    public void Method11(int a) {
        this.Field856 = a;
        this.Field862 = a >> 16 & 0xFF;
        this.Field863 = a >> 8 & 0xFF;
        this.Field864 = a & 0xFF;
    }

    public int Method12() {
        return this.Field856;
    }

    public void Method13(int a) {
        this.Field857 = a;
        this.Field865 = a >> 16 & 0xFF;
        this.Field866 = a >> 8 & 0xFF;
        this.Field867 = a & 0xFF;
    }

    public int Method14() {
        return this.Field857;
    }

    public void Method15(int a) {
        this.Field858 = a;
        this.Field868 = a >> 16 & 0xFF;
        this.Field869 = a >> 8 & 0xFF;
        this.Field870 = a & 0xFF;
    }

    public int Method16() {
        return this.Field858;
    }

    @Override
    public void Method17(int a, int a2) {
        this.Field853 = a;
        this.Field854 = a2;
        super.Method17(a, a2);
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        float a4 = (float)a / (float)this.Field853;
        float a5 = (float)a2 / (float)this.Field854;
        float a6 = (float)this.Field859 + (float)(this.Field862 - this.Field859) * a4;
        float a7 = (float)this.Field865 + (float)(this.Field868 - this.Field865) * a4;
        int a8 = (int)(a6 + (a7 - a6) * a5 + 0.5f);
        a6 = (float)this.Field860 + (float)(this.Field863 - this.Field860) * a4;
        a7 = (float)this.Field866 + (float)(this.Field869 - this.Field866) * a4;
        int a9 = (int)(a6 + (a7 - a6) * a5 + 0.5f);
        a6 = (float)this.Field861 + (float)(this.Field864 - this.Field861) * a4;
        a7 = (float)this.Field867 + (float)(this.Field870 - this.Field867) * a4;
        int a10 = (int)(a6 + (a7 - a6) * a5 + 0.5f);
        return 0xFF000000 | a8 << 16 | a9 << 8 | a10;
    }

    public String toString() {
        return "Texture/Four Color Fill...";
    }
}