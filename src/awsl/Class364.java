/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  org.lwjgl.input.Mouse
 */
package awsl;

import org.lwjgl.input.Mouse;

public class Class364 {
    public boolean Field1724;
    private int Field1725;
    private boolean Field1726;

    public Class364(int a) {
        this.Field1725 = a;
    }

    public boolean Method582() {
        if (Mouse.isButtonDown((int)this.Field1725)) {
            if (!this.Field1724) {
                this.Field1724 = true;
                return true;
            }
        } else {
            this.Field1724 = false;
        }
        return false;
    }

    public boolean Method583() {
        if (Mouse.isButtonDown((int)1)) {
            if (!this.Field1726) {
                this.Field1726 = true;
                return true;
            }
        } else {
            this.Field1726 = false;
        }
        return false;
    }
}