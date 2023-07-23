package media.tiger.tigerbox.model.dto;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubscriptionDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0002\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J¶\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017¨\u0006A"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/SubscriptionDto;", "", TtmlNode.ATTR_ID, "", "version", "articleId", "", "purchaseTime", "validFrom", "validUntil", "origValidFrom", "origValidUntil", "active", "", "note", "source", "slots", "accountId", "productGroupId", "orderId", "renewable", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Z)V", "getAccountId", "()I", "getActive", "()Z", "getArticleId", "()Ljava/lang/String;", "getId", "getNote", "getOrderId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrigValidFrom", "getOrigValidUntil", "getProductGroupId", "getPurchaseTime", "getRenewable", "getSlots", "getSource", "getValidFrom", "getValidUntil", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Z)Lmedia/tiger/tigerbox/model/dto/SubscriptionDto;", "equals", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionDto {
    private final int accountId;
    private final boolean active;
    private final String articleId;
    private final int id;
    private final String note;
    private final Integer orderId;
    private final String origValidFrom;
    private final String origValidUntil;
    private final int productGroupId;
    private final String purchaseTime;
    private final boolean renewable;
    private final String slots;
    private final String source;
    private final String validFrom;
    private final String validUntil;
    private final int version;

    public final int component1() {
        return this.id;
    }

    public final String component10() {
        return this.note;
    }

    public final String component11() {
        return this.source;
    }

    public final String component12() {
        return this.slots;
    }

    public final int component13() {
        return this.accountId;
    }

    public final int component14() {
        return this.productGroupId;
    }

    public final Integer component15() {
        return this.orderId;
    }

    public final boolean component16() {
        return this.renewable;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.articleId;
    }

    public final String component4() {
        return this.purchaseTime;
    }

    public final String component5() {
        return this.validFrom;
    }

    public final String component6() {
        return this.validUntil;
    }

    public final String component7() {
        return this.origValidFrom;
    }

    public final String component8() {
        return this.origValidUntil;
    }

    public final boolean component9() {
        return this.active;
    }

    public final SubscriptionDto copy(int i, int i2, String articleId, String purchaseTime, String validFrom, String str, String origValidFrom, String origValidUntil, boolean z, String str2, String source, String str3, int i3, int i4, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(purchaseTime, "purchaseTime");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(origValidFrom, "origValidFrom");
        Intrinsics.checkNotNullParameter(origValidUntil, "origValidUntil");
        Intrinsics.checkNotNullParameter(source, "source");
        return new SubscriptionDto(i, i2, articleId, purchaseTime, validFrom, str, origValidFrom, origValidUntil, z, str2, source, str3, i3, i4, num, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubscriptionDto) {
            SubscriptionDto subscriptionDto = (SubscriptionDto) obj;
            return this.id == subscriptionDto.id && this.version == subscriptionDto.version && Intrinsics.areEqual(this.articleId, subscriptionDto.articleId) && Intrinsics.areEqual(this.purchaseTime, subscriptionDto.purchaseTime) && Intrinsics.areEqual(this.validFrom, subscriptionDto.validFrom) && Intrinsics.areEqual(this.validUntil, subscriptionDto.validUntil) && Intrinsics.areEqual(this.origValidFrom, subscriptionDto.origValidFrom) && Intrinsics.areEqual(this.origValidUntil, subscriptionDto.origValidUntil) && this.active == subscriptionDto.active && Intrinsics.areEqual(this.note, subscriptionDto.note) && Intrinsics.areEqual(this.source, subscriptionDto.source) && Intrinsics.areEqual(this.slots, subscriptionDto.slots) && this.accountId == subscriptionDto.accountId && this.productGroupId == subscriptionDto.productGroupId && Intrinsics.areEqual(this.orderId, subscriptionDto.orderId) && this.renewable == subscriptionDto.renewable;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.id * 31) + this.version) * 31) + this.articleId.hashCode()) * 31) + this.purchaseTime.hashCode()) * 31) + this.validFrom.hashCode()) * 31;
        String str = this.validUntil;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.origValidFrom.hashCode()) * 31) + this.origValidUntil.hashCode()) * 31;
        boolean z = this.active;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str2 = this.note;
        int hashCode3 = (((i2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.source.hashCode()) * 31;
        String str3 = this.slots;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.accountId) * 31) + this.productGroupId) * 31;
        Integer num = this.orderId;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z2 = this.renewable;
        return hashCode5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "SubscriptionDto(id=" + this.id + ", version=" + this.version + ", articleId=" + this.articleId + ", purchaseTime=" + this.purchaseTime + ", validFrom=" + this.validFrom + ", validUntil=" + this.validUntil + ", origValidFrom=" + this.origValidFrom + ", origValidUntil=" + this.origValidUntil + ", active=" + this.active + ", note=" + this.note + ", source=" + this.source + ", slots=" + this.slots + ", accountId=" + this.accountId + ", productGroupId=" + this.productGroupId + ", orderId=" + this.orderId + ", renewable=" + this.renewable + ')';
    }

    public SubscriptionDto(int i, int i2, String articleId, String purchaseTime, String validFrom, String str, String origValidFrom, String origValidUntil, boolean z, String str2, String source, String str3, int i3, int i4, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(purchaseTime, "purchaseTime");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(origValidFrom, "origValidFrom");
        Intrinsics.checkNotNullParameter(origValidUntil, "origValidUntil");
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = i;
        this.version = i2;
        this.articleId = articleId;
        this.purchaseTime = purchaseTime;
        this.validFrom = validFrom;
        this.validUntil = str;
        this.origValidFrom = origValidFrom;
        this.origValidUntil = origValidUntil;
        this.active = z;
        this.note = str2;
        this.source = source;
        this.slots = str3;
        this.accountId = i3;
        this.productGroupId = i4;
        this.orderId = num;
        this.renewable = z2;
    }

    public final int getId() {
        return this.id;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUntil() {
        return this.validUntil;
    }

    public final String getOrigValidFrom() {
        return this.origValidFrom;
    }

    public final String getOrigValidUntil() {
        return this.origValidUntil;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSlots() {
        return this.slots;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final int getProductGroupId() {
        return this.productGroupId;
    }

    public final Integer getOrderId() {
        return this.orderId;
    }

    public final boolean getRenewable() {
        return this.renewable;
    }
}
