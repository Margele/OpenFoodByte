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
import awsl.Class801;
import obfuscate.a;

public final class Class90
extends Class63 {
    private final StringBuffer Field769;
    private boolean Field770;
    private boolean Field771;
    private boolean Field772;
    private boolean Field773;
    private boolean Field774;
    private StringBuffer Field775;
    private StringBuffer Field776;
    private int Field777;
    private int Field778;
    private String Field779 = "";

    public Class90(int a) {
        super(327680);
        this.Field770 = (a & 0x200) != 0;
        this.Field769 = new StringBuffer();
    }

    private Class90(StringBuffer a) {
        super(327680);
        this.Field769 = a;
    }

    @Override
    public void Method3610(String a) {
        this.Field769.append(this.Field771 ? ", " : "<").append(a);
        this.Field771 = true;
        this.Field772 = false;
    }

    @Override
    public Class63 Method3611() {
        this.Field779 = " extends ";
        this.Method3630();
        return this;
    }

    @Override
    public Class63 Method3612() {
        this.Field779 = this.Field772 ? ", " : " extends ";
        this.Field772 = true;
        this.Method3630();
        return this;
    }

    @Override
    public Class63 Method3613() {
        this.Method3629();
        this.Field779 = " extends ";
        this.Method3630();
        return this;
    }

    @Override
    public Class63 Method3614() {
        this.Field779 = this.Field774 ? ", " : (this.Field770 ? " extends " : " implements ");
        this.Field774 = true;
        this.Method3630();
        return this;
    }

    @Override
    public Class63 Method3615() {
        this.Method3629();
        if (this.Field773) {
            this.Field769.append(", ");
        } else {
            this.Field773 = true;
            this.Field769.append('(');
        }
        this.Method3630();
        return this;
    }

    @Override
    public Class63 Method3616() {
        this.Method3629();
        if (this.Field773) {
            this.Field773 = false;
        } else {
            this.Field769.append('(');
        }
        this.Field769.append(')');
        this.Field775 = new StringBuffer();
        return new Class90(this.Field775);
    }

    @Override
    public Class63 Method3617() {
        if (this.Field776 == null) {
            this.Field776 = new StringBuffer();
        } else {
            this.Field776.append(", ");
        }
        return new Class90(this.Field776);
    }

    @Override
    public void Method3618(char a2) {
        a[] aArray = Class801.Method3300();
        switch (a2) {
            case 'V': {
                this.Field769.append("void");
            }
            case 'B': {
                this.Field769.append("byte");
            }
            case 'J': {
                this.Field769.append("long");
            }
            case 'Z': {
                this.Field769.append("boolean");
            }
            case 'I': {
                this.Field769.append("int");
            }
            case 'S': {
                this.Field769.append("short");
            }
            case 'C': {
                this.Field769.append("char");
            }
            case 'F': {
                this.Field769.append("float");
            }
        }
        this.Field769.append("double");
        this.Method3631();
    }

    @Override
    public void Method3619(String a2) {
        this.Field769.append(a2);
        this.Method3631();
    }

    @Override
    public Class63 Method3620() {
        this.Method3630();
        this.Field778 |= 1;
        return this;
    }

    @Override
    public void Method3621(String a2) {
        if ("java/lang/Object".equals((Object)a2)) {
            boolean a3 = this.Field777 % 2 != 0 || this.Field773;
            this.Field769.append(this.Field779).append(a2.replace('/', '.'));
        } else {
            this.Field769.append(this.Field779).append(a2.replace('/', '.'));
        }
        this.Field779 = "";
        this.Field777 *= 2;
    }

    @Override
    public void Method3622(String a2) {
        if (this.Field777 % 2 != 0) {
            this.Field769.append('>');
        }
        this.Field777 /= 2;
        this.Field769.append('.');
        this.Field769.append(this.Field779).append(a2.replace('/', '.'));
        this.Field779 = "";
        this.Field777 *= 2;
    }

    @Override
    public void Method3623() {
        if (this.Field777 % 2 == 0) {
            ++this.Field777;
            this.Field769.append('<');
        } else {
            this.Field769.append(", ");
        }
        this.Field769.append('?');
    }

    @Override
    public Class63 Method3624(char a2) {
        if (this.Field777 % 2 == 0) {
            ++this.Field777;
            this.Field769.append('<');
        } else {
            this.Field769.append(", ");
        }
        if (a2 == '+') {
            this.Field769.append("? extends ");
        } else if (a2 == '-') {
            this.Field769.append("? super ");
        }
        this.Method3630();
        return this;
    }

    @Override
    public void Method3625() {
        if (this.Field777 % 2 != 0) {
            this.Field769.append('>');
        }
        this.Field777 /= 2;
        this.Method3631();
    }

    public String Method3626() {
        return this.Field769.toString();
    }

    public String Method3627() {
        return this.Field775 == null ? null : this.Field775.toString();
    }

    public String Method3628() {
        return this.Field776 == null ? null : this.Field776.toString();
    }

    private void Method3629() {
        if (this.Field771) {
            this.Field769.append('>');
            this.Field771 = false;
        }
    }

    private void Method3630() {
        this.Field778 *= 2;
    }

    private void Method3631() {
        if (this.Field778 % 2 == 0) {
            this.Field778 /= 2;
        } else {
            while (this.Field778 % 2 != 0) {
                this.Field778 /= 2;
                this.Field769.append("[]");
            }
        }
    }
}