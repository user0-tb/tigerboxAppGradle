package media.tiger.tigerbox.usecase.accesstokenrepo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchAndStoreAccessTokenUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lmedia/tiger/tigerbox/usecase/accesstokenrepo/GetTokenParameters;", "", "authHeader", "", "username", "password", "devId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthHeader", "()Ljava/lang/String;", "getDevId", "getPassword", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetTokenParameters {
    private final String authHeader;
    private final String devId;
    private final String password;
    private final String username;

    public static /* synthetic */ GetTokenParameters copy$default(GetTokenParameters getTokenParameters, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTokenParameters.authHeader;
        }
        if ((i & 2) != 0) {
            str2 = getTokenParameters.username;
        }
        if ((i & 4) != 0) {
            str3 = getTokenParameters.password;
        }
        if ((i & 8) != 0) {
            str4 = getTokenParameters.devId;
        }
        return getTokenParameters.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.authHeader;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.devId;
    }

    public final GetTokenParameters copy(String authHeader, String username, String password, String devId) {
        Intrinsics.checkNotNullParameter(authHeader, "authHeader");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(devId, "devId");
        return new GetTokenParameters(authHeader, username, password, devId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetTokenParameters) {
            GetTokenParameters getTokenParameters = (GetTokenParameters) obj;
            return Intrinsics.areEqual(this.authHeader, getTokenParameters.authHeader) && Intrinsics.areEqual(this.username, getTokenParameters.username) && Intrinsics.areEqual(this.password, getTokenParameters.password) && Intrinsics.areEqual(this.devId, getTokenParameters.devId);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.authHeader.hashCode() * 31) + this.username.hashCode()) * 31) + this.password.hashCode()) * 31) + this.devId.hashCode();
    }

    public String toString() {
        return "GetTokenParameters(authHeader=" + this.authHeader + ", username=" + this.username + ", password=" + this.password + ", devId=" + this.devId + ')';
    }

    public GetTokenParameters(String authHeader, String username, String password, String devId) {
        Intrinsics.checkNotNullParameter(authHeader, "authHeader");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(devId, "devId");
        this.authHeader = authHeader;
        this.username = username;
        this.password = password;
        this.devId = devId;
    }

    public final String getAuthHeader() {
        return this.authHeader;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getDevId() {
        return this.devId;
    }
}
