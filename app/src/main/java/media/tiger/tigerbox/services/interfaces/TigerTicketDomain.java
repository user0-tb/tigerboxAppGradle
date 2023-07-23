package media.tiger.tigerbox.services.interfaces;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerCardsManagerService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/TigerTicketDomain;", "Ljava/io/Serializable;", "couponCode", "", "validateLink", "getProductLink", "orderLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCouponCode", "()Ljava/lang/String;", "getGetProductLink", "getOrderLink", "getValidateLink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TigerTicketDomain implements Serializable {
    private final String couponCode;
    private final String getProductLink;
    private final String orderLink;
    private final String validateLink;

    public static /* synthetic */ TigerTicketDomain copy$default(TigerTicketDomain tigerTicketDomain, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tigerTicketDomain.couponCode;
        }
        if ((i & 2) != 0) {
            str2 = tigerTicketDomain.validateLink;
        }
        if ((i & 4) != 0) {
            str3 = tigerTicketDomain.getProductLink;
        }
        if ((i & 8) != 0) {
            str4 = tigerTicketDomain.orderLink;
        }
        return tigerTicketDomain.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.couponCode;
    }

    public final String component2() {
        return this.validateLink;
    }

    public final String component3() {
        return this.getProductLink;
    }

    public final String component4() {
        return this.orderLink;
    }

    public final TigerTicketDomain copy(String couponCode, String validateLink, String getProductLink, String orderLink) {
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        Intrinsics.checkNotNullParameter(validateLink, "validateLink");
        Intrinsics.checkNotNullParameter(getProductLink, "getProductLink");
        Intrinsics.checkNotNullParameter(orderLink, "orderLink");
        return new TigerTicketDomain(couponCode, validateLink, getProductLink, orderLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerTicketDomain) {
            TigerTicketDomain tigerTicketDomain = (TigerTicketDomain) obj;
            return Intrinsics.areEqual(this.couponCode, tigerTicketDomain.couponCode) && Intrinsics.areEqual(this.validateLink, tigerTicketDomain.validateLink) && Intrinsics.areEqual(this.getProductLink, tigerTicketDomain.getProductLink) && Intrinsics.areEqual(this.orderLink, tigerTicketDomain.orderLink);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.couponCode.hashCode() * 31) + this.validateLink.hashCode()) * 31) + this.getProductLink.hashCode()) * 31) + this.orderLink.hashCode();
    }

    public String toString() {
        return "TigerTicketDomain(couponCode=" + this.couponCode + ", validateLink=" + this.validateLink + ", getProductLink=" + this.getProductLink + ", orderLink=" + this.orderLink + ')';
    }

    public TigerTicketDomain(String couponCode, String validateLink, String getProductLink, String orderLink) {
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        Intrinsics.checkNotNullParameter(validateLink, "validateLink");
        Intrinsics.checkNotNullParameter(getProductLink, "getProductLink");
        Intrinsics.checkNotNullParameter(orderLink, "orderLink");
        this.couponCode = couponCode;
        this.validateLink = validateLink;
        this.getProductLink = getProductLink;
        this.orderLink = orderLink;
    }

    public final String getCouponCode() {
        return this.couponCode;
    }

    public final String getValidateLink() {
        return this.validateLink;
    }

    public final String getGetProductLink() {
        return this.getProductLink;
    }

    public final String getOrderLink() {
        return this.orderLink;
    }
}
