/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.AlphaComposite
 *  java.awt.Composite
 *  java.awt.Graphics2D
 *  java.awt.image.BufferedImage
 *  java.awt.image.BufferedImageOp
 *  java.beans.BeanInfo
 *  java.beans.IntrospectionException
 *  java.beans.Introspector
 *  java.beans.PropertyDescriptor
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package awsl;

import awsl.Class193;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class Class802
extends Class193 {
    private float Field3584;
    private BufferedImage Field3585;
    private String Field3586;
    private Method Field3587;
    protected BufferedImageOp Field3588;
    protected float Field3589;
    protected float Field3590;

    private Class802() {
        this.Field3584 = 0.0f;
    }

    public Class802(BufferedImageOp a, String a2, float a3, float a4) {
        block5: {
            int a5;
            block6: {
                this.Field3584 = 0.0f;
                boolean a6 = Class193.Method1269();
                this.Field3588 = a;
                this.Field3586 = a2;
                this.Field3589 = a3;
                this.Field3590 = a4;
                try {
                    BeanInfo a7 = Introspector.getBeanInfo((Class)a.getClass());
                    PropertyDescriptor[] a8 = a7.getPropertyDescriptors();
                    a5 = 0;
                    if (a5 >= a8.length) break block5;
                    PropertyDescriptor a9 = a8[a5];
                    if (!a2.equals((Object)a9.getName())) break block6;
                    this.Field3587 = a9.getWriteMethod();
                }
                catch (IntrospectionException a10) {
                    throw new IllegalArgumentException(a10.toString());
                }
            }
            ++a5;
        }
        if (this.Field3587 == null) {
            throw new IllegalArgumentException("No such property in object: " + a2);
        }
    }

    public void Method56(float a) {
        this.Field3584 = a;
    }

    public float Method57() {
        return this.Field3584;
    }

    public void Method1271(BufferedImage a) {
        this.Field3585 = a;
    }

    public BufferedImage Method1272() {
        return this.Field3585;
    }

    public void Method58(float a) {
        try {
            this.Field3587.invoke((Object)this.Field3588, new Object[]{new Float(a)});
        }
        catch (Exception a2) {
            throw new IllegalArgumentException("Error setting value for property: " + this.Field3586);
        }
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        float a3;
        a2 = this.Method1263(a, null);
        if (this.Field3585 == null) {
            return a2;
        }
        float a4 = 1.0f - this.Field3584;
        Graphics2D a5 = a2.createGraphics();
        if (this.Field3584 != 1.0f) {
            a3 = this.Field3589 + this.Field3584 * (this.Field3590 - this.Field3589);
            this.Method58(a3);
            a5.drawImage(a, this.Field3588, 0, 0);
        }
        if (this.Field3584 != 0.0f) {
            a5.setComposite((Composite)AlphaComposite.getInstance((int)3, (float)this.Field3584));
            a3 = this.Field3589 + a4 * (this.Field3590 - this.Field3589);
            this.Method58(a3);
            a5.drawImage(this.Field3585, this.Field3588, 0, 0);
        }
        a5.dispose();
        return a2;
    }

    public String toString() {
        return "Transitions/Transition...";
    }

    private static Exception Method106(Exception exception) {
        return exception;
    }
}