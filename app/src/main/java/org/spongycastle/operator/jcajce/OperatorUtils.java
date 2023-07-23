package org.spongycastle.operator.jcajce;

import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.operator.GenericKey;

/* loaded from: classes4.dex */
class OperatorUtils {
    OperatorUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Key getJceKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), "ENC");
        }
        throw new IllegalArgumentException("unknown generic key type");
    }
}
