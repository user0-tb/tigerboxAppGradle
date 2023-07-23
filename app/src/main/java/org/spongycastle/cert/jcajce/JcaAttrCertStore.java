package org.spongycastle.cert.jcajce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.spongycastle.util.CollectionStore;
import org.spongycastle.x509.X509AttributeCertificate;

/* loaded from: classes4.dex */
public class JcaAttrCertStore extends CollectionStore {
    public JcaAttrCertStore(Collection collection) throws IOException {
        super(convertCerts(collection));
    }

    public JcaAttrCertStore(X509AttributeCertificate x509AttributeCertificate) throws IOException {
        this(Collections.singletonList(x509AttributeCertificate));
    }

    private static Collection convertCerts(Collection collection) throws IOException {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509AttributeCertificate) {
                arrayList.add(new JcaX509AttributeCertificateHolder((X509AttributeCertificate) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
