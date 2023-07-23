package org.spongycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;
import org.spongycastle.jce.X509LDAPCertStoreParameters;
import org.spongycastle.util.Selector;
import org.spongycastle.util.StoreException;
import org.spongycastle.x509.X509CertPairStoreSelector;
import org.spongycastle.x509.X509StoreParameters;
import org.spongycastle.x509.X509StoreSpi;
import org.spongycastle.x509.util.LDAPStoreHelper;

/* loaded from: classes4.dex */
public class X509StoreLDAPCertPairs extends X509StoreSpi {
    private LDAPStoreHelper helper;

    @Override // org.spongycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
        if (!(x509StoreParameters instanceof X509LDAPCertStoreParameters)) {
            throw new IllegalArgumentException("Initialization parameters must be an instance of " + X509LDAPCertStoreParameters.class.getName() + DownloadsManager.EXTENSION_SEPARATOR);
        }
        this.helper = new LDAPStoreHelper((X509LDAPCertStoreParameters) x509StoreParameters);
    }

    @Override // org.spongycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) throws StoreException {
        if (!(selector instanceof X509CertPairStoreSelector)) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.helper.getCrossCertificatePairs((X509CertPairStoreSelector) selector));
        return hashSet;
    }
}
