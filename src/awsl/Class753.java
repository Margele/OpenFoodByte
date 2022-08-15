/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import awsl.Class193;
import awsl.Class759;
import awsl.Class767;
import awsl.Class776;

public class Class753
extends Class759 {
    private int Field3291 = 4;
    private int[] Field3292 = new int[]{0, 0, 255, 255};
    private int[] Field3293 = new int[]{-16777216, -16777216, -1, -1};

    public Class753() {
        this.Method89();
    }

    public Class753(int[] a, int[] a2) {
        this.Field3292 = a;
        this.Field3293 = a2;
        this.Field3291 = a.length;
        this.Method89();
    }

    public void Method1619(int a, int a2) {
        this.Field3293[a] = a2;
        this.Method89();
    }

    public int Method1612(int a) {
        return this.Field3293[a];
    }

    public void Method1620(int a, int a2) {
        int[] a3 = new int[this.Field3291 + 1];
        int[] a4 = new int[this.Field3291 + 1];
        System.arraycopy((Object)this.Field3292, (int)0, (Object)a3, (int)0, (int)this.Field3291);
        System.arraycopy((Object)this.Field3293, (int)0, (Object)a4, (int)0, (int)this.Field3291);
        this.Field3292 = a3;
        this.Field3293 = a4;
        this.Field3292[this.Field3291] = a;
        this.Field3293[this.Field3291] = a2;
        ++this.Field3291;
        this.Method1622();
        this.Method89();
    }

    public void Method9(int a) {
        if (this.Field3291 <= 4) {
            return;
        }
        if (a < this.Field3291 - 1) {
            System.arraycopy((Object)this.Field3292, (int)(a + 1), (Object)this.Field3292, (int)a, (int)(this.Field3291 - a - 1));
            System.arraycopy((Object)this.Field3293, (int)(a + 1), (Object)this.Field3293, (int)a, (int)(this.Field3291 - a - 1));
        }
        --this.Field3291;
        this.Method89();
    }

    public void Method1621(int a, int a2) {
        this.Field3292[a] = Class767.Method1687(a2);
        this.Method1622();
        this.Method89();
    }

    private void Method89() {
        this.Field3292[0] = -1;
        this.Field3292[this.Field3291 - 1] = 256;
        boolean a = Class193.Method1270();
        this.Field3293[0] = this.Field3293[1];
        this.Field3293[this.Field3291 - 1] = this.Field3293[this.Field3291 - 2];
        int a2 = 0;
        if (a2 < 256) {
            this.Field3332[a2] = Class776.Method1725(a2, this.Field3291, this.Field3292, this.Field3293);
            ++a2;
        }
    }

    private void Method1622() {
        int a = 1;
        boolean a2 = Class193.Method1269();
        if (a < this.Field3291) {
            int a3 = 1;
            if (a3 < a) {
                if (this.Field3292[a] < this.Field3292[a3]) {
                    int a4 = this.Field3292[a];
                    this.Field3292[a] = this.Field3292[a3];
                    this.Field3292[a3] = a4;
                    a4 = this.Field3293[a];
                    this.Field3293[a] = this.Field3293[a3];
                    this.Field3293[a3] = a4;
                }
                ++a3;
            }
            ++a;
        }
    }
}