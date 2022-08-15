/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  javax.xml.transform.Result
 *  javax.xml.transform.Templates
 *  javax.xml.transform.TransformerConfigurationException
 *  javax.xml.transform.sax.SAXResult
 *  javax.xml.transform.sax.SAXTransformerFactory
 *  javax.xml.transform.sax.TransformerHandler
 *  org.xml.sax.ContentHandler
 */
package awsl;

import awsl.Class672;
import javax.xml.transform.Result;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import org.xml.sax.ContentHandler;

final class Class682
implements Class672 {
    private SAXTransformerFactory Field2964;
    private final Templates Field2965;
    private ContentHandler Field2966;

    Class682(SAXTransformerFactory a, Templates a2, ContentHandler a3) {
        this.Field2964 = a;
        this.Field2965 = a2;
        this.Field2966 = a3;
    }

    @Override
    public final ContentHandler Method2326() {
        try {
            TransformerHandler a = this.Field2964.newTransformerHandler(this.Field2965);
            a.setResult((Result)new SAXResult(this.Field2966));
            return a;
        }
        catch (TransformerConfigurationException a) {
            throw new RuntimeException(a.toString());
        }
    }
}