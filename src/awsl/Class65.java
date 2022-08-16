/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class37;
import awsl.Class63;
import obfuscate.a;

public class Class65
extends Class63 {
    private final Class63 Field646;
    private final Class37 Field647;
    private String Field648;

    public Class65(Class63 a, Class37 a2) {
        this(327680, a, a2);
    }

    protected Class65(int a, Class63 a2, Class37 a3) {
        super(a);
        this.Field646 = a2;
        this.Field647 = a3;
    }

    @Override
    public void Method3621(String a) {
        this.Field648 = a;
        this.Field646.Method3621(this.Field647.Method3374(a));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method3622(String a2) {
        void a3;
        String string = this.Field647.Method3374(this.Field648) + '$';
        this.Field648 = this.Field648 + '$' + a2;
        boolean a4 = Class37.Method3383();
        String a5 = this.Field647.Method3374(this.Field648);
        int a6 = a5.startsWith((String)a3) ? a3.length() : a5.lastIndexOf(36) + 1;
        this.Field646.Method3622(a5.substring(a6));
        if (a.trash() == null) {
            Class37.Method3381(false);
        }
    }

    @Override
    public void Method3610(String a2) {
        this.Field646.Method3610(a2);
    }

    @Override
    public void Method3619(String a2) {
        this.Field646.Method3619(a2);
    }

    @Override
    public Class63 Method3620() {
        this.Field646.Method3620();
        return this;
    }

    @Override
    public void Method3618(char a2) {
        this.Field646.Method3618(a2);
    }

    @Override
    public Class63 Method3611() {
        this.Field646.Method3611();
        return this;
    }

    @Override
    public Class63 Method3617() {
        this.Field646.Method3617();
        return this;
    }

    @Override
    public Class63 Method3614() {
        this.Field646.Method3614();
        return this;
    }

    @Override
    public Class63 Method3612() {
        this.Field646.Method3612();
        return this;
    }

    @Override
    public Class63 Method3615() {
        this.Field646.Method3615();
        return this;
    }

    @Override
    public Class63 Method3616() {
        this.Field646.Method3616();
        return this;
    }

    @Override
    public Class63 Method3613() {
        this.Field646.Method3613();
        return this;
    }

    @Override
    public void Method3623() {
        this.Field646.Method3623();
    }

    @Override
    public Class63 Method3624(char a2) {
        this.Field646.Method3624(a2);
        return this;
    }

    @Override
    public void Method3625() {
        this.Field646.Method3625();
    }
}