package media.tiger.tigerbox.model.domain;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccessTokenDomain.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/AccessTokenDomain;", "", "()V", "accessToken", "", "refreshToken", TtmlNode.ATTR_ID, "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAccessToken", "()Ljava/lang/String;", "getId", "()I", "getRefreshToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccessTokenDomain {
    private final String accessToken;
    private final int id;
    private final String refreshToken;

    public static /* synthetic */ AccessTokenDomain copy$default(AccessTokenDomain accessTokenDomain, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accessTokenDomain.accessToken;
        }
        if ((i2 & 2) != 0) {
            str2 = accessTokenDomain.refreshToken;
        }
        if ((i2 & 4) != 0) {
            i = accessTokenDomain.id;
        }
        return accessTokenDomain.copy(str, str2, i);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.refreshToken;
    }

    public final int component3() {
        return this.id;
    }

    public final AccessTokenDomain copy(String accessToken, String refreshToken, int i) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        return new AccessTokenDomain(accessToken, refreshToken, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessTokenDomain) {
            AccessTokenDomain accessTokenDomain = (AccessTokenDomain) obj;
            return Intrinsics.areEqual(this.accessToken, accessTokenDomain.accessToken) && Intrinsics.areEqual(this.refreshToken, accessTokenDomain.refreshToken) && this.id == accessTokenDomain.id;
        }
        return false;
    }

    public int hashCode() {
        return (((this.accessToken.hashCode() * 31) + this.refreshToken.hashCode()) * 31) + this.id;
    }

    public String toString() {
        return "AccessTokenDomain(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", id=" + this.id + ')';
    }

    public AccessTokenDomain(String accessToken, String refreshToken, int i) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.id = i;
    }

    public /* synthetic */ AccessTokenDomain(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getId() {
        return this.id;
    }

    public AccessTokenDomain() {
        this("", "", 0, 4, null);
    }
}
