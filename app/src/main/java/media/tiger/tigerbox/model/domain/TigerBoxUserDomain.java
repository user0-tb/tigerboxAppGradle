package media.tiger.tigerbox.model.domain;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerBoxUserDomain.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/TigerBoxUserDomain;", "", "()V", "profileId", "", "accountId", "activeProfileId", NotificationCompat.CATEGORY_EMAIL, "", "pin", "(IIILjava/lang/String;Ljava/lang/String;)V", "getAccountId", "()I", "getActiveProfileId", "getEmail", "()Ljava/lang/String;", "getPin", "getProfileId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerBoxUserDomain {
    private final int accountId;
    private final int activeProfileId;
    private final String email;
    private final String pin;
    private final int profileId;

    public static /* synthetic */ TigerBoxUserDomain copy$default(TigerBoxUserDomain tigerBoxUserDomain, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tigerBoxUserDomain.profileId;
        }
        if ((i4 & 2) != 0) {
            i2 = tigerBoxUserDomain.accountId;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = tigerBoxUserDomain.activeProfileId;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = tigerBoxUserDomain.email;
        }
        String str3 = str;
        if ((i4 & 16) != 0) {
            str2 = tigerBoxUserDomain.pin;
        }
        return tigerBoxUserDomain.copy(i, i5, i6, str3, str2);
    }

    public final int component1() {
        return this.profileId;
    }

    public final int component2() {
        return this.accountId;
    }

    public final int component3() {
        return this.activeProfileId;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.pin;
    }

    public final TigerBoxUserDomain copy(int i, int i2, int i3, String email, String str) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new TigerBoxUserDomain(i, i2, i3, email, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerBoxUserDomain) {
            TigerBoxUserDomain tigerBoxUserDomain = (TigerBoxUserDomain) obj;
            return this.profileId == tigerBoxUserDomain.profileId && this.accountId == tigerBoxUserDomain.accountId && this.activeProfileId == tigerBoxUserDomain.activeProfileId && Intrinsics.areEqual(this.email, tigerBoxUserDomain.email) && Intrinsics.areEqual(this.pin, tigerBoxUserDomain.pin);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.profileId * 31) + this.accountId) * 31) + this.activeProfileId) * 31) + this.email.hashCode()) * 31;
        String str = this.pin;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TigerBoxUserDomain(profileId=" + this.profileId + ", accountId=" + this.accountId + ", activeProfileId=" + this.activeProfileId + ", email=" + this.email + ", pin=" + this.pin + ')';
    }

    public TigerBoxUserDomain(int i, int i2, int i3, String email, String str) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.profileId = i;
        this.accountId = i2;
        this.activeProfileId = i3;
        this.email = email;
        this.pin = str;
    }

    public /* synthetic */ TigerBoxUserDomain(int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) == 0 ? i3 : -1, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? null : str2);
    }

    public final int getProfileId() {
        return this.profileId;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final int getActiveProfileId() {
        return this.activeProfileId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPin() {
        return this.pin;
    }

    public TigerBoxUserDomain() {
        this(-1, -1, -1, "", null);
    }
}
