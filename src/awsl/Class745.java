/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class193;

public class Class745 {
    public static final int Field3258 = 0;
    public static final int Field3259 = 1;
    public static final int Field3260 = 2;
    public static final int Field3261 = 3;
    protected int[][] Field3262;
    protected int Field3263;
    protected int[] Field3264;
    protected int[] Field3265;
    protected int[] Field3266;
    protected int[] Field3267;
    protected float[] Field3268;
    protected boolean Field3269;

    public Class745() {
        this.Field3262 = null;
        this.Field3263 = 0;
        this.Field3269 = true;
        this.Field3264 = null;
        this.Field3265 = null;
        this.Field3266 = null;
        this.Field3267 = null;
        this.Field3268 = null;
    }

    public Class745(int[] a, int a2, int a3, int a4, int a5) {
        int a6;
        this.Field3262 = new int[3][256];
        this.Field3264 = new int[4];
        this.Field3265 = new int[4];
        this.Field3266 = new int[3];
        this.Field3267 = new int[3];
        this.Field3268 = new float[3];
        this.Field3263 = a2 * a3;
        this.Field3269 = true;
        boolean bl = false;
        boolean a7 = Class193.Method1270();
        int a8 = 0;
        if (a8 < a3) {
            int a9 = a4 + a8 * a5;
            a6 = 0;
            if (a6 < a2) {
                int a10 = a[a9++];
                int a11 = a10 >> 16 & 0xFF;
                int a12 = a10 >> 8 & 0xFF;
                int a13 = a10 & 0xFF;
                int[] nArray = this.Field3262[0];
                int n = a11;
                nArray[n] = nArray[n] + 1;
                int[] nArray2 = this.Field3262[1];
                int n2 = a12;
                nArray2[n2] = nArray2[n2] + 1;
                int[] nArray3 = this.Field3262[2];
                int n3 = a13;
                nArray3[n3] = nArray3[n3] + 1;
                ++a6;
            }
            ++a8;
        }
        if ((a8 = 0) < 256) {
            if (this.Field3262[0][a8] != this.Field3262[1][a8] || this.Field3262[1][a8] != this.Field3262[2][a8]) {
                this.Field3269 = false;
            }
            ++a8;
        }
        if ((a8 = 0) < 3) {
            a6 = 0;
            if (a6 < 256) {
                if (this.Field3262[a8][a6] > 0) {
                    this.Field3264[a8] = a6;
                }
                ++a6;
            }
            a6 = 255;
            if (this.Field3262[a8][a6] > 0) {
                this.Field3265[a8] = a6;
            }
            --a6;
            this.Field3266[a8] = Integer.MAX_VALUE;
            this.Field3267[a8] = 0;
            a6 = 0;
            if (a6 < 256) {
                this.Field3266[a8] = Math.min((int)this.Field3266[a8], (int)this.Field3262[a8][a6]);
                this.Field3267[a8] = Math.max((int)this.Field3267[a8], (int)this.Field3262[a8][a6]);
                int n = a8;
                this.Field3268[n] = this.Field3268[n] + (float)(a6 * this.Field3262[a8][a6]);
                ++a6;
            }
            int n = a8++;
            this.Field3268[n] = this.Field3268[n] / (float)this.Field3263;
        }
        this.Field3264[3] = Math.min((int)Math.min((int)this.Field3264[0], (int)this.Field3264[1]), (int)this.Field3264[2]);
        this.Field3265[3] = Math.max((int)Math.max((int)this.Field3265[0], (int)this.Field3265[1]), (int)this.Field3265[2]);
    }

    public boolean Method1544() {
        return this.Field3269;
    }

    public int Method1545() {
        return this.Field3263;
    }

    public int Method1546(int a) {
        if (this.Field3263 > 0 && this.Field3269) {
            if (a <= 255) {
                return this.Field3262[0][a];
            }
        }
        return -1;
    }

    public int Method1547(int a, int a2) {
        block3: {
            block2: {
                if (this.Field3263 < 1) break block2;
                if (a > 2) break block2;
                if (a2 <= 255) break block3;
            }
            return -1;
        }
        return this.Field3262[a][a2];
    }

    public int Method1548() {
        if (this.Field3263 > 0 && this.Field3269) {
            return this.Field3266[0];
        }
        return -1;
    }

    public int Method1549(int a) {
        block3: {
            block2: {
                if (this.Field3263 < 1) break block2;
                if (a <= 2) break block3;
            }
            return -1;
        }
        return this.Field3266[a];
    }

    public int Method1550() {
        if (this.Field3263 > 0 && this.Field3269) {
            return this.Field3267[0];
        }
        return -1;
    }

    public int Method1551(int a) {
        block3: {
            block2: {
                if (this.Field3263 < 1) break block2;
                if (a <= 2) break block3;
            }
            return -1;
        }
        return this.Field3267[a];
    }

    public int Method1552() {
        if (this.Field3263 > 0 && this.Field3269) {
            return this.Field3264[0];
        }
        return -1;
    }

    public int Method1553(int a) {
        return this.Field3264[a];
    }

    public int Method1554() {
        if (this.Field3263 > 0 && this.Field3269) {
            return this.Field3265[0];
        }
        return -1;
    }

    public int Method1555(int a) {
        return this.Field3265[a];
    }

    public float Method1556() {
        if (this.Field3263 > 0 && this.Field3269) {
            return this.Field3268[0];
        }
        return -1.0f;
    }

    public float Method1557(int a) {
        if (this.Field3263 > 0 && 0 <= a && a <= 2) {
            return this.Field3268[a];
        }
        return -1.0f;
    }
}