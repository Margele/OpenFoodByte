/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package trash.foodbyte.utils;

public class TimeHelper {
    public long last = 0L;

    public boolean Method211(long a) {
        return System.currentTimeMillis() - this.last > a;
    }

    public long Method212() {
        return System.nanoTime() / 1000000L;
    }

    public long Method213() {
        return System.nanoTime() / 1000000L - this.last;
    }

    public void Method214() {
        this.last = System.currentTimeMillis();
    }

    public long Method215() {
        return this.last;
    }

    public void Method216(int a) {
        this.last = System.currentTimeMillis() - (long)a;
    }

    public boolean Method217(long a) {
        return this.Method212() - this.last >= a;
    }

    public boolean Method218(float a) {
        return (float)(this.Method212() - this.last) >= a;
    }

    public boolean Method219(double a) {
        return (double)(System.currentTimeMillis() - this.last) >= a;
    }
}