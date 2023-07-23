package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetProductAssetsUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/usecase/GetProductAssetsParameters;", "", "productId", "", "nfcId", "nfcSecurityCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNfcId", "()Ljava/lang/String;", "getNfcSecurityCode", "getProductId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetProductAssetsParameters {
    private final String nfcId;
    private final String nfcSecurityCode;
    private final String productId;

    public static /* synthetic */ GetProductAssetsParameters copy$default(GetProductAssetsParameters getProductAssetsParameters, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getProductAssetsParameters.productId;
        }
        if ((i & 2) != 0) {
            str2 = getProductAssetsParameters.nfcId;
        }
        if ((i & 4) != 0) {
            str3 = getProductAssetsParameters.nfcSecurityCode;
        }
        return getProductAssetsParameters.copy(str, str2, str3);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.nfcId;
    }

    public final String component3() {
        return this.nfcSecurityCode;
    }

    public final GetProductAssetsParameters copy(String productId, String nfcId, String nfcSecurityCode) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(nfcId, "nfcId");
        Intrinsics.checkNotNullParameter(nfcSecurityCode, "nfcSecurityCode");
        return new GetProductAssetsParameters(productId, nfcId, nfcSecurityCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetProductAssetsParameters) {
            GetProductAssetsParameters getProductAssetsParameters = (GetProductAssetsParameters) obj;
            return Intrinsics.areEqual(this.productId, getProductAssetsParameters.productId) && Intrinsics.areEqual(this.nfcId, getProductAssetsParameters.nfcId) && Intrinsics.areEqual(this.nfcSecurityCode, getProductAssetsParameters.nfcSecurityCode);
        }
        return false;
    }

    public int hashCode() {
        return (((this.productId.hashCode() * 31) + this.nfcId.hashCode()) * 31) + this.nfcSecurityCode.hashCode();
    }

    public String toString() {
        return "GetProductAssetsParameters(productId=" + this.productId + ", nfcId=" + this.nfcId + ", nfcSecurityCode=" + this.nfcSecurityCode + ')';
    }

    public GetProductAssetsParameters(String productId, String nfcId, String nfcSecurityCode) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(nfcId, "nfcId");
        Intrinsics.checkNotNullParameter(nfcSecurityCode, "nfcSecurityCode");
        this.productId = productId;
        this.nfcId = nfcId;
        this.nfcSecurityCode = nfcSecurityCode;
    }

    public /* synthetic */ GetProductAssetsParameters(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getNfcId() {
        return this.nfcId;
    }

    public final String getNfcSecurityCode() {
        return this.nfcSecurityCode;
    }
}
