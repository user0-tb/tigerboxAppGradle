package org.spongycastle.jce;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

/* loaded from: classes4.dex */
public class MultiCertStoreParameters implements CertStoreParameters {
    private Collection certStores;
    private boolean searchAllStores;

    @Override // java.security.cert.CertStoreParameters
    public Object clone() {
        return this;
    }

    public MultiCertStoreParameters(Collection collection) {
        this(collection, true);
    }

    public MultiCertStoreParameters(Collection collection, boolean z) {
        this.certStores = collection;
        this.searchAllStores = z;
    }

    public Collection getCertStores() {
        return this.certStores;
    }

    public boolean getSearchAllStores() {
        return this.searchAllStores;
    }
}
