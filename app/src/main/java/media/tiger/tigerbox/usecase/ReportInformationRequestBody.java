package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReportInformationUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lmedia/tiger/tigerbox/usecase/ReportInformationRequestBody;", "", "deviceIdentifier", "", "deviceCredential", "currentVersion", "localIpAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentVersion", "()Ljava/lang/String;", "getDeviceCredential", "getDeviceIdentifier", "getLocalIpAddress", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportInformationRequestBody {
    private final String currentVersion;
    private final String deviceCredential;
    private final String deviceIdentifier;
    private final String localIpAddress;

    public static /* synthetic */ ReportInformationRequestBody copy$default(ReportInformationRequestBody reportInformationRequestBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportInformationRequestBody.deviceIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = reportInformationRequestBody.deviceCredential;
        }
        if ((i & 4) != 0) {
            str3 = reportInformationRequestBody.currentVersion;
        }
        if ((i & 8) != 0) {
            str4 = reportInformationRequestBody.localIpAddress;
        }
        return reportInformationRequestBody.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.deviceIdentifier;
    }

    public final String component2() {
        return this.deviceCredential;
    }

    public final String component3() {
        return this.currentVersion;
    }

    public final String component4() {
        return this.localIpAddress;
    }

    public final ReportInformationRequestBody copy(String deviceIdentifier, String deviceCredential, String currentVersion, String localIpAddress) {
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(deviceCredential, "deviceCredential");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(localIpAddress, "localIpAddress");
        return new ReportInformationRequestBody(deviceIdentifier, deviceCredential, currentVersion, localIpAddress);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReportInformationRequestBody) {
            ReportInformationRequestBody reportInformationRequestBody = (ReportInformationRequestBody) obj;
            return Intrinsics.areEqual(this.deviceIdentifier, reportInformationRequestBody.deviceIdentifier) && Intrinsics.areEqual(this.deviceCredential, reportInformationRequestBody.deviceCredential) && Intrinsics.areEqual(this.currentVersion, reportInformationRequestBody.currentVersion) && Intrinsics.areEqual(this.localIpAddress, reportInformationRequestBody.localIpAddress);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.deviceIdentifier.hashCode() * 31) + this.deviceCredential.hashCode()) * 31) + this.currentVersion.hashCode()) * 31) + this.localIpAddress.hashCode();
    }

    public String toString() {
        return "ReportInformationRequestBody(deviceIdentifier=" + this.deviceIdentifier + ", deviceCredential=" + this.deviceCredential + ", currentVersion=" + this.currentVersion + ", localIpAddress=" + this.localIpAddress + ')';
    }

    public ReportInformationRequestBody(String deviceIdentifier, String deviceCredential, String currentVersion, String localIpAddress) {
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(deviceCredential, "deviceCredential");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(localIpAddress, "localIpAddress");
        this.deviceIdentifier = deviceIdentifier;
        this.deviceCredential = deviceCredential;
        this.currentVersion = currentVersion;
        this.localIpAddress = localIpAddress;
    }

    public final String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    public final String getDeviceCredential() {
        return this.deviceCredential;
    }

    public final String getCurrentVersion() {
        return this.currentVersion;
    }

    public final String getLocalIpAddress() {
        return this.localIpAddress;
    }
}
