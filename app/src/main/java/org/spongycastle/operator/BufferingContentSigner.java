package org.spongycastle.operator;

import java.io.OutputStream;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.util.io.BufferingOutputStream;

/* loaded from: classes4.dex */
public class BufferingContentSigner implements ContentSigner {
    private final ContentSigner contentSigner;
    private final OutputStream output;

    public BufferingContentSigner(ContentSigner contentSigner) {
        this.contentSigner = contentSigner;
        this.output = new BufferingOutputStream(contentSigner.getOutputStream());
    }

    public BufferingContentSigner(ContentSigner contentSigner, int i) {
        this.contentSigner = contentSigner;
        this.output = new BufferingOutputStream(contentSigner.getOutputStream(), i);
    }

    @Override // org.spongycastle.operator.ContentSigner
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.contentSigner.getAlgorithmIdentifier();
    }

    @Override // org.spongycastle.operator.ContentSigner
    public OutputStream getOutputStream() {
        return this.output;
    }

    @Override // org.spongycastle.operator.ContentSigner
    /* renamed from: getSignature */
    public byte[] mo2031getSignature() {
        return this.contentSigner.mo2031getSignature();
    }
}
