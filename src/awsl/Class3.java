/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.Toolkit
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.Random
 */
package awsl;

import awsl.Class119;
import awsl.Class193;
import awsl.Class591;
import awsl.Class594;
import awsl.Class598;
import awsl.Class779;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Random;
import obfuscate.a;

public class Class3
extends Class119 {
    private float Field57 = 0.1f;
    private float Field58 = 1.0f;
    private float Field59 = 0.0f;
    private float Field60 = 1.0f;
    private float Field61 = 1.0f;
    private float Field62 = 8.0f;
    private float Field63 = 2.0f;
    private float Field64 = 1.0f;
    private float Field65 = 0.6f;
    private int Field66;
    private float Field67;
    private float Field68;
    private boolean Field69;
    private Class591 Field70;
    protected Random Field71 = new Random();
    private Class594 Field72;
    private float Field73 = 0.5f;
    private float Field74 = 0.5f;
    private float Field75 = 0.3f;
    private float Field76 = 0.5f;
    private float Field77 = 0.5f;
    private float Field78 = 0.96f;
    private float Field79 = 0.0f;
    private float Field80 = 10.0f;
    private int Field81 = -1;
    private float Field82;
    private float Field83;
    private float Field84;
    private float Field85 = 0.5f;
    private float Field86 = 0.5f;
    private float Field87 = 0.0f;
    private float Field88 = 0.0f;
    private float Field89 = 0.0f;
    private float Field90 = 1.0f;
    private float[] Field91;
    private float[] Field92;
    private BufferedImage Field93;
    private int[] Field94;
    private static final float Field95 = 0.003921569f;
    private float Field96;
    private float Field97;
    float Field98;
    float Field99;

    public Class3() {
        if (this.Field93 == null) {
            this.Field93 = Class779.Method835(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("SkyColors.png")).getSource());
        }
    }

    public void Method56(float a) {
        this.Field60 = a;
    }

    public float Method57() {
        return this.Field60;
    }

    public void Method9(int a) {
        this.Field66 = a;
    }

    public int Method10() {
        return this.Field66;
    }

    public void Method58(float a) {
        this.Field57 = a;
    }

    public float Method59() {
        return this.Field57;
    }

    public void Method60(float a) {
        this.Field58 = a;
    }

    public float Method61() {
        return this.Field58;
    }

    public void Method164(float a) {
        this.Field79 = a;
    }

    public float Method165() {
        return this.Field79;
    }

    public void Method166(float a) {
        this.Field90 = a;
    }

    public float Method167() {
        return this.Field90;
    }

    public void Method168(float a) {
        this.Field73 = a;
    }

    public float Method169() {
        return this.Field73;
    }

    public void Method170(float a) {
        this.Field74 = a;
    }

    public float Method171() {
        return this.Field74;
    }

    public void Method172(float a) {
        this.Field75 = a;
    }

    public float Method173() {
        return this.Field75;
    }

    public void Method174(float a) {
        this.Field76 = a;
    }

    public float Method175() {
        return this.Field76;
    }

    public void Method868(float a) {
        this.Field77 = a;
    }

    public float Method869() {
        return this.Field77;
    }

    public void Method870(float a) {
        this.Field59 = a;
    }

    public float Method871() {
        return this.Field59;
    }

    public void Method872(float a) {
        this.Field62 = a;
    }

    public float Method873() {
        return this.Field62;
    }

    public void Method874(float a) {
        this.Field61 = a;
    }

    public float Method875() {
        return this.Field61;
    }

    public void Method927(float a) {
        this.Field63 = a;
    }

    public float Method928() {
        return this.Field63;
    }

    public void Method929(float a) {
        this.Field64 = a;
    }

    public float Method930() {
        return this.Field64;
    }

    public void Method1853(float a) {
        this.Field65 = a;
    }

    public float Method1854() {
        return this.Field65;
    }

    public void Method1855(float a) {
        this.Field78 = a;
    }

    public float Method1856() {
        return this.Field78;
    }

    public void Method1857(float a) {
        this.Field86 = a;
    }

    public float Method1858() {
        return this.Field86;
    }

    public void Method1859(float a) {
        this.Field85 = a;
    }

    public float Method1860() {
        return this.Field85;
    }

    public void Method11(int a) {
        this.Field81 = a;
    }

    public int Method12() {
        return this.Field81;
    }

    public void Method1861(float a) {
        this.Field89 = a;
    }

    public float Method1862() {
        return this.Field89;
    }

    public void Method1863(float a) {
        this.Field88 = a;
    }

    public float Method1864() {
        return this.Field88;
    }

    public void Method1865(float a) {
        this.Field87 = a;
    }

    public float Method1866() {
        return this.Field87;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        long a3 = System.currentTimeMillis();
        this.Field82 = (float)(this.Field81 >> 16 & 0xFF) * 0.003921569f;
        this.Field83 = (float)(this.Field81 >> 8 & 0xFF) * 0.003921569f;
        this.Field84 = (float)(this.Field81 & 0xFF) * 0.003921569f;
        boolean a4 = Class193.Method1270();
        this.Field98 = 10000.0f;
        this.Field99 = -10000.0f;
        this.Field91 = new float[(int)this.Field62 + 1];
        float a5 = 1.0f;
        int a6 = 0;
        if (a6 <= (int)this.Field62) {
            this.Field91[a6] = (float)Math.pow((double)2.0, (double)(-a6));
            a5 *= this.Field63;
            ++a6;
        }
        this.Field67 = -1.0f;
        this.Field68 = 1.0f;
        this.Field96 = a.getWidth();
        this.Field97 = a.getHeight();
        a6 = a.getHeight();
        this.Field92 = new float[a6];
        int a7 = 0;
        if (a7 < a6) {
            this.Field92[a7] = (float)Math.tan((double)((double)(this.Field90 * (float)a7 / (float)a6) * Math.PI * 0.5));
            ++a7;
        }
        a2 = this.Method1263(a, null);
        a7 = (int)(63.0f * this.Field75);
        Graphics2D a8 = a2.createGraphics();
        a8.drawImage((Image)this.Field93, 0, 0, a2.getWidth(), a2.getHeight(), a7, 0, a7 + 1, 64, null);
        a8.dispose();
        BufferedImage a9 = super.Method62(a2, a2);
        long a10 = System.currentTimeMillis();
        System.out.println(this.Field98 + " " + this.Field99 + " " + (float)(a10 - a3) * 0.001f);
        this.Field91 = null;
        this.Field92 = null;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public float Method20(float a, float a2) {
        void a3;
        float a4;
        float f = 0.0f;
        boolean a5 = Class193.Method1269();
        a += 371.0f;
        a2 += 529.0f;
        int a6 = 0;
        if (a6 < (int)this.Field62) {
            a3 += Class598.Method158(a, a2, this.Field79) * this.Field91[a6];
            a *= this.Field63;
            a2 *= this.Field63;
            ++a6;
        }
        if ((a4 = this.Field62 - (float)((int)this.Field62)) != 0.0f) {
            a3 += a4 * Class598.Method158(a, a2, this.Field79) * this.Field91[a6];
        }
        return (float)a3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int Method3(int a2, int a3, int a4) {
        float a5;
        void a6;
        float a7 = (float)a2 / this.Field96;
        float f = (float)a3 / this.Field97;
        boolean a8 = Class193.Method1270();
        float a9 = (float)Math.pow((double)this.Field78, (double)(100.0f * a6 * a6));
        float a10 = (float)(a4 >> 16 & 0xFF) * 0.003921569f;
        float a11 = (float)(a4 >> 8 & 0xFF) * 0.003921569f;
        float a12 = (float)(a4 & 0xFF) * 0.003921569f;
        float a13 = this.Field96 * 0.5f;
        float a14 = (float)a2 - a13;
        float a15 = a3;
        a15 = this.Field92[a3];
        a14 = (a7 - 0.5f) * (1.0f + a15);
        a15 += this.Field79 * this.Field87;
        float a16 = a5 = this.Method20(a14 /= this.Field57, a15 /= this.Field57 * this.Field58);
        a5 = (a5 + 1.23f) / 2.46f;
        int a17 = a4 & 0xFF000000;
        float a18 = a5 - this.Field73;
        if (a18 < 0.0f) {
            a18 = 0.0f;
        }
        float a19 = 1.0f - (float)Math.pow((double)this.Field74, (double)a18);
        this.Field98 = Math.min((float)this.Field98, (float)a19);
        this.Field99 = Math.max((float)this.Field99, (float)a19);
        float a20 = this.Field96 * this.Field85;
        float a21 = this.Field97 * this.Field86;
        float a22 = (float)a2 - a20;
        float a23 = (float)a3 - a21;
        float a24 = a22 * a22 + a23 * a23;
        a24 = (float)Math.pow((double)a24, (double)this.Field77);
        float a25 = 10.0f * (float)Math.exp((double)(-a24 * this.Field76 * 0.1f));
        a10 += a25 * this.Field82;
        a11 += a25 * this.Field83;
        a12 += a25 * this.Field84;
        float a26 = (1.0f - a19 * a19 * a19 * a19) * this.Field60;
        float a27 = this.Field82 * a26;
        float a28 = this.Field83 * a26;
        float a29 = this.Field84 * a26;
        float a30 = 1.0f - (a19 *= a9);
        a10 = a30 * a10 + a19 * a27;
        a11 = a30 * a11 + a19 * a28;
        a12 = a30 * a12 + a19 * a29;
        float a31 = this.Field64;
        a10 = 1.0f - (float)Math.exp((double)(-a10 * a31));
        a11 = 1.0f - (float)Math.exp((double)(-a11 * a31));
        a12 = 1.0f - (float)Math.exp((double)(-a12 * a31));
        int a32 = (int)(255.0f * a10) << 16;
        int a33 = (int)(255.0f * a11) << 8;
        int a34 = (int)(255.0f * a12);
        int a35 = 0xFF000000 | a32 | a33 | a34;
        a.trash(new String[4]);
        return a35;
    }

    public String toString() {
        return "Texture/Sky...";
    }
}