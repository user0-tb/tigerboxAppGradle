package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssignBoxToAccountUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/usecase/AssignBoxToAccountParameters;", "", "accessToken", "", "deviceId", "deviceCredential", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getDeviceCredential", "getDeviceId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssignBoxToAccountParameters {
    private final String accessToken;
    private final String deviceCredential;
    private final String deviceId;

    public static /* synthetic */ AssignBoxToAccountParameters copy$default(AssignBoxToAccountParameters assignBoxToAccountParameters, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assignBoxToAccountParameters.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = assignBoxToAccountParameters.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = assignBoxToAccountParameters.deviceCredential;
        }
        return assignBoxToAccountParameters.copy(str, str2, str3);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.deviceCredential;
    }

    public final AssignBoxToAccountParameters copy(String accessToken, String deviceId, String deviceCredential) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceCredential, "deviceCredential");
        return new AssignBoxToAccountParameters(accessToken, deviceId, deviceCredential);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AssignBoxToAccountParameters) {
            AssignBoxToAccountParameters assignBoxToAccountParameters = (AssignBoxToAccountParameters) obj;
            return Intrinsics.areEqual(this.accessToken, assignBoxToAccountParameters.accessToken) && Intrinsics.areEqual(this.deviceId, assignBoxToAccountParameters.deviceId) && Intrinsics.areEqual(this.deviceCredential, assignBoxToAccountParameters.deviceCredential);
        }
        return false;
    }

    public int hashCode() {
        return (((this.accessToken.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.deviceCredential.hashCode();
    }

    public String toString() {
        return "AssignBoxToAccountParameters(accessToken=" + this.accessToken + ", deviceId=" + this.deviceId + ", deviceCredential=" + this.deviceCredential + ')';
    }

    public AssignBoxToAccountParameters(String accessToken, String deviceId, String deviceCredential) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceCredential, "deviceCredential");
        this.accessToken = accessToken;
        this.deviceId = deviceId;
        this.deviceCredential = deviceCredential;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceCredential() {
        return this.deviceCredential;
    }
}
