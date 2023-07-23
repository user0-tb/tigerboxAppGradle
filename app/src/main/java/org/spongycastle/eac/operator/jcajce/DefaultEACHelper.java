package org.spongycastle.eac.operator.jcajce;

import java.security.NoSuchAlgorithmException;
import java.security.Signature;

/* loaded from: classes4.dex */
class DefaultEACHelper extends EACHelper {
    @Override // org.spongycastle.eac.operator.jcajce.EACHelper
    protected Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }
}
