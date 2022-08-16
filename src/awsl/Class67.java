/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuffer
 */
package awsl;

import awsl.Class63;
import obfuscate.a;

public class Class67
extends Class63 {
    private final StringBuffer Field655 = new StringBuffer();
    private boolean Field656;
    private boolean Field657;
    private int Field658;

    public Class67() {
        super(327680);
    }

    @Override
    public void Method3610(String a) {
        if (!this.Field656) {
            this.Field656 = true;
            this.Field655.append('<');
        }
        this.Field655.append(a);
        this.Field655.append(':');
    }

    @Override
    public Class63 Method3611() {
        return this;
    }

    @Override
    public Class63 Method3612() {
        this.Field655.append(':');
        return this;
    }

    @Override
    public Class63 Method3613() {
        this.Method3629();
        return this;
    }

    @Override
    public Class63 Method3614() {
        return this;
    }

    @Override
    public Class63 Method3615() {
        this.Method3629();
        if (!this.Field657) {
            this.Field657 = true;
            this.Field655.append('(');
        }
        return this;
    }

    @Override
    public Class63 Method3616() {
        this.Method3629();
        if (!this.Field657) {
            this.Field655.append('(');
        }
        this.Field655.append(')');
        return this;
    }

    @Override
    public Class63 Method3617() {
        this.Field655.append('^');
        return this;
    }

    @Override
    public void Method3618(char a) {
        this.Field655.append(a);
    }

    @Override
    public void Method3619(String a) {
        this.Field655.append('T');
        this.Field655.append(a);
        this.Field655.append(';');
    }

    @Override
    public Class63 Method3620() {
        this.Field655.append('[');
        return this;
    }

    @Override
    public void Method3621(String a2) {
        String string = Class63.Method3784();
        this.Field655.append('L');
        this.Field655.append(a2);
        this.Field658 *= 2;
        String string2 = string;
        if (a.trash() == null) {
            Class63.Method3783("RfczRc");
        }
    }

    @Override
    public void Method3622(String a2) {
        String string = Class63.Method3784();
        this.Method3630();
        String string2 = string;
        this.Field655.append('.');
        this.Field655.append(a2);
        this.Field658 *= 2;
        a.trash(new String[1]);
    }

    @Override
    public void Method3623() {
        if (this.Field658 % 2 == 0) {
            ++this.Field658;
            this.Field655.append('<');
        }
        this.Field655.append('*');
    }

    @Override
    public Class63 Method3624(char a2) {
        if (this.Field658 % 2 == 0) {
            ++this.Field658;
            this.Field655.append('<');
        }
        if (a2 != '=') {
            this.Field655.append(a2);
        }
        return this;
    }

    @Override
    public void Method3625() {
        this.Method3630();
        this.Field655.append(';');
    }

    public String Method3780() {
        return this.Field655.toString();
    }

    private void Method3629() {
        if (this.Field656) {
            this.Field656 = false;
            this.Field655.append('>');
        }
    }

    private void Method3630() {
        if (this.Field658 % 2 != 0) {
            this.Field655.append('>');
        }
        this.Field658 /= 2;
    }
}