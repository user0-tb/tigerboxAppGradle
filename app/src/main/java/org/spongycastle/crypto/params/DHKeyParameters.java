package org.spongycastle.crypto.params;

/* loaded from: classes4.dex */
public class DHKeyParameters extends AsymmetricKeyParameter {
    private DHParameters params;

    /* JADX INFO: Access modifiers changed from: protected */
    public DHKeyParameters(boolean z, DHParameters dHParameters) {
        super(z);
        this.params = dHParameters;
    }

    public DHParameters getParameters() {
        return this.params;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DHKeyParameters) {
            DHKeyParameters dHKeyParameters = (DHKeyParameters) obj;
            DHParameters dHParameters = this.params;
            if (dHParameters == null) {
                return dHKeyParameters.getParameters() == null;
            }
            return dHParameters.equals(dHKeyParameters.getParameters());
        }
        return false;
    }

    public int hashCode() {
        int i = !isPrivate();
        DHParameters dHParameters = this.params;
        return dHParameters != null ? i ^ dHParameters.hashCode() : i;
    }
}
