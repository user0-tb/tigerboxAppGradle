package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetValidTigerCardUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/usecase/GetValidTigerCardParameters;", "", "userId", "", "code", "uid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getUid", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetValidTigerCardParameters {
    private final String code;
    private final String uid;
    private final String userId;

    public static /* synthetic */ GetValidTigerCardParameters copy$default(GetValidTigerCardParameters getValidTigerCardParameters, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getValidTigerCardParameters.userId;
        }
        if ((i & 2) != 0) {
            str2 = getValidTigerCardParameters.code;
        }
        if ((i & 4) != 0) {
            str3 = getValidTigerCardParameters.uid;
        }
        return getValidTigerCardParameters.copy(str, str2, str3);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.uid;
    }

    public final GetValidTigerCardParameters copy(String userId, String code, String uid) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new GetValidTigerCardParameters(userId, code, uid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetValidTigerCardParameters) {
            GetValidTigerCardParameters getValidTigerCardParameters = (GetValidTigerCardParameters) obj;
            return Intrinsics.areEqual(this.userId, getValidTigerCardParameters.userId) && Intrinsics.areEqual(this.code, getValidTigerCardParameters.code) && Intrinsics.areEqual(this.uid, getValidTigerCardParameters.uid);
        }
        return false;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.code.hashCode()) * 31) + this.uid.hashCode();
    }

    public String toString() {
        return "GetValidTigerCardParameters(userId=" + this.userId + ", code=" + this.code + ", uid=" + this.uid + ')';
    }

    public GetValidTigerCardParameters(String userId, String code, String uid) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.userId = userId;
        this.code = code;
        this.uid = uid;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getUid() {
        return this.uid;
    }
}
