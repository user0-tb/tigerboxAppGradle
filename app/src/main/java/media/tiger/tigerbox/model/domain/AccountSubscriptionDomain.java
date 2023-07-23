package media.tiger.tigerbox.model.domain;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSubscriptionDomain.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006#"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/AccountSubscriptionDomain;", "", TtmlNode.ATTR_ID, "", "validUntil", "", "formattedEndDate", "active", "", "source", "accountId", "renewable", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZ)V", "getAccountId", "()I", "getActive", "()Z", "getFormattedEndDate", "()Ljava/lang/String;", "getId", "getRenewable", "getSource", "getValidUntil", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountSubscriptionDomain {
    private final int accountId;
    private final boolean active;
    private final String formattedEndDate;
    private final int id;
    private final boolean renewable;
    private final String source;
    private final String validUntil;

    public static /* synthetic */ AccountSubscriptionDomain copy$default(AccountSubscriptionDomain accountSubscriptionDomain, int i, String str, String str2, boolean z, String str3, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = accountSubscriptionDomain.id;
        }
        if ((i3 & 2) != 0) {
            str = accountSubscriptionDomain.validUntil;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = accountSubscriptionDomain.formattedEndDate;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            z = accountSubscriptionDomain.active;
        }
        boolean z3 = z;
        if ((i3 & 16) != 0) {
            str3 = accountSubscriptionDomain.source;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            i2 = accountSubscriptionDomain.accountId;
        }
        int i4 = i2;
        if ((i3 & 64) != 0) {
            z2 = accountSubscriptionDomain.renewable;
        }
        return accountSubscriptionDomain.copy(i, str4, str5, z3, str6, i4, z2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.validUntil;
    }

    public final String component3() {
        return this.formattedEndDate;
    }

    public final boolean component4() {
        return this.active;
    }

    public final String component5() {
        return this.source;
    }

    public final int component6() {
        return this.accountId;
    }

    public final boolean component7() {
        return this.renewable;
    }

    public final AccountSubscriptionDomain copy(int i, String str, String str2, boolean z, String source, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AccountSubscriptionDomain(i, str, str2, z, source, i2, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountSubscriptionDomain) {
            AccountSubscriptionDomain accountSubscriptionDomain = (AccountSubscriptionDomain) obj;
            return this.id == accountSubscriptionDomain.id && Intrinsics.areEqual(this.validUntil, accountSubscriptionDomain.validUntil) && Intrinsics.areEqual(this.formattedEndDate, accountSubscriptionDomain.formattedEndDate) && this.active == accountSubscriptionDomain.active && Intrinsics.areEqual(this.source, accountSubscriptionDomain.source) && this.accountId == accountSubscriptionDomain.accountId && this.renewable == accountSubscriptionDomain.renewable;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.id * 31;
        String str = this.validUntil;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.formattedEndDate;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.active;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode3 = (((((hashCode2 + i2) * 31) + this.source.hashCode()) * 31) + this.accountId) * 31;
        boolean z2 = this.renewable;
        return hashCode3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "AccountSubscriptionDomain(id=" + this.id + ", validUntil=" + this.validUntil + ", formattedEndDate=" + this.formattedEndDate + ", active=" + this.active + ", source=" + this.source + ", accountId=" + this.accountId + ", renewable=" + this.renewable + ')';
    }

    public AccountSubscriptionDomain(int i, String str, String str2, boolean z, String source, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = i;
        this.validUntil = str;
        this.formattedEndDate = str2;
        this.active = z;
        this.source = source;
        this.accountId = i2;
        this.renewable = z2;
    }

    public final int getId() {
        return this.id;
    }

    public final String getValidUntil() {
        return this.validUntil;
    }

    public final String getFormattedEndDate() {
        return this.formattedEndDate;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getSource() {
        return this.source;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final boolean getRenewable() {
        return this.renewable;
    }
}
