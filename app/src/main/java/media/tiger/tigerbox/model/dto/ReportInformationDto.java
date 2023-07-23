package media.tiger.tigerbox.model.dto;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReportInformationDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001:\nKLMNOPQRSTB¡\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\u000eHÆ\u0003JË\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010G\u001a\u00020\u00052\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006U"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto;", "", TtmlNode.ATTR_ID, "", "enabled", "", "deviceIdentifier", "", "currentVersion", "deviceType", "accountId", "currentUserId", "displayName", "production", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$Production;", "deviceApiKey", "firstOnboardedDate", "firstOnboardedDateCurrentAccount", "localIpAddress", "localIpAddressReportingDate", "createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate", "flags", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FeatureSet;", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$Production;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FeatureSet;)V", "getAccountId", "()I", "getCreatedBy", "()Ljava/lang/String;", "getCreatedDate", "getCurrentUserId", "getCurrentVersion", "getDeviceApiKey", "getDeviceIdentifier", "getDeviceType", "getDisplayName", "getEnabled", "()Z", "getFirstOnboardedDate", "getFirstOnboardedDateCurrentAccount", "getFlags", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FeatureSet;", "getId", "getLastModifiedBy", "getLastModifiedDate", "getLocalIpAddress", "getLocalIpAddressReportingDate", "getProduction", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$Production;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "FeatureSet", "FlagAdvancedTimers", "FlagAutoLogs", "FlagAutoplay", "FlagForceCrash", "FlagManualTicketRedemption", "FlagPinEntry", "FlagProfiles", "FlagSubmitLogs", "Production", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReportInformationDto {
    private final int accountId;
    private final String createdBy;
    private final String createdDate;
    private final int currentUserId;
    private final String currentVersion;
    private final String deviceApiKey;
    private final String deviceIdentifier;
    private final String deviceType;
    private final String displayName;
    private final boolean enabled;
    private final String firstOnboardedDate;
    private final String firstOnboardedDateCurrentAccount;
    private final FeatureSet flags;
    private final int id;
    private final String lastModifiedBy;
    private final String lastModifiedDate;
    private final String localIpAddress;
    private final String localIpAddressReportingDate;
    private final Production production;

    public final int component1() {
        return this.id;
    }

    public final String component10() {
        return this.deviceApiKey;
    }

    public final String component11() {
        return this.firstOnboardedDate;
    }

    public final String component12() {
        return this.firstOnboardedDateCurrentAccount;
    }

    public final String component13() {
        return this.localIpAddress;
    }

    public final String component14() {
        return this.localIpAddressReportingDate;
    }

    public final String component15() {
        return this.createdBy;
    }

    public final String component16() {
        return this.createdDate;
    }

    public final String component17() {
        return this.lastModifiedBy;
    }

    public final String component18() {
        return this.lastModifiedDate;
    }

    public final FeatureSet component19() {
        return this.flags;
    }

    public final boolean component2() {
        return this.enabled;
    }

    public final String component3() {
        return this.deviceIdentifier;
    }

    public final String component4() {
        return this.currentVersion;
    }

    public final String component5() {
        return this.deviceType;
    }

    public final int component6() {
        return this.accountId;
    }

    public final int component7() {
        return this.currentUserId;
    }

    public final String component8() {
        return this.displayName;
    }

    public final Production component9() {
        return this.production;
    }

    public final ReportInformationDto copy(int i, boolean z, String deviceIdentifier, String currentVersion, String deviceType, int i2, int i3, String displayName, Production production, String deviceApiKey, String firstOnboardedDate, String str, String localIpAddress, String localIpAddressReportingDate, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, FeatureSet featureSet) {
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(production, "production");
        Intrinsics.checkNotNullParameter(deviceApiKey, "deviceApiKey");
        Intrinsics.checkNotNullParameter(firstOnboardedDate, "firstOnboardedDate");
        Intrinsics.checkNotNullParameter(localIpAddress, "localIpAddress");
        Intrinsics.checkNotNullParameter(localIpAddressReportingDate, "localIpAddressReportingDate");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastModifiedBy, "lastModifiedBy");
        Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
        return new ReportInformationDto(i, z, deviceIdentifier, currentVersion, deviceType, i2, i3, displayName, production, deviceApiKey, firstOnboardedDate, str, localIpAddress, localIpAddressReportingDate, createdBy, createdDate, lastModifiedBy, lastModifiedDate, featureSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReportInformationDto) {
            ReportInformationDto reportInformationDto = (ReportInformationDto) obj;
            return this.id == reportInformationDto.id && this.enabled == reportInformationDto.enabled && Intrinsics.areEqual(this.deviceIdentifier, reportInformationDto.deviceIdentifier) && Intrinsics.areEqual(this.currentVersion, reportInformationDto.currentVersion) && Intrinsics.areEqual(this.deviceType, reportInformationDto.deviceType) && this.accountId == reportInformationDto.accountId && this.currentUserId == reportInformationDto.currentUserId && Intrinsics.areEqual(this.displayName, reportInformationDto.displayName) && Intrinsics.areEqual(this.production, reportInformationDto.production) && Intrinsics.areEqual(this.deviceApiKey, reportInformationDto.deviceApiKey) && Intrinsics.areEqual(this.firstOnboardedDate, reportInformationDto.firstOnboardedDate) && Intrinsics.areEqual(this.firstOnboardedDateCurrentAccount, reportInformationDto.firstOnboardedDateCurrentAccount) && Intrinsics.areEqual(this.localIpAddress, reportInformationDto.localIpAddress) && Intrinsics.areEqual(this.localIpAddressReportingDate, reportInformationDto.localIpAddressReportingDate) && Intrinsics.areEqual(this.createdBy, reportInformationDto.createdBy) && Intrinsics.areEqual(this.createdDate, reportInformationDto.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, reportInformationDto.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, reportInformationDto.lastModifiedDate) && Intrinsics.areEqual(this.flags, reportInformationDto.flags);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.id * 31;
        boolean z = this.enabled;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode = (((((((((((((((((((i + i2) * 31) + this.deviceIdentifier.hashCode()) * 31) + this.currentVersion.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.accountId) * 31) + this.currentUserId) * 31) + this.displayName.hashCode()) * 31) + this.production.hashCode()) * 31) + this.deviceApiKey.hashCode()) * 31) + this.firstOnboardedDate.hashCode()) * 31;
        String str = this.firstOnboardedDateCurrentAccount;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.localIpAddress.hashCode()) * 31) + this.localIpAddressReportingDate.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.createdDate.hashCode()) * 31) + this.lastModifiedBy.hashCode()) * 31) + this.lastModifiedDate.hashCode()) * 31;
        FeatureSet featureSet = this.flags;
        return hashCode2 + (featureSet != null ? featureSet.hashCode() : 0);
    }

    public String toString() {
        return "ReportInformationDto(id=" + this.id + ", enabled=" + this.enabled + ", deviceIdentifier=" + this.deviceIdentifier + ", currentVersion=" + this.currentVersion + ", deviceType=" + this.deviceType + ", accountId=" + this.accountId + ", currentUserId=" + this.currentUserId + ", displayName=" + this.displayName + ", production=" + this.production + ", deviceApiKey=" + this.deviceApiKey + ", firstOnboardedDate=" + this.firstOnboardedDate + ", firstOnboardedDateCurrentAccount=" + this.firstOnboardedDateCurrentAccount + ", localIpAddress=" + this.localIpAddress + ", localIpAddressReportingDate=" + this.localIpAddressReportingDate + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ", flags=" + this.flags + ')';
    }

    public ReportInformationDto(int i, boolean z, String deviceIdentifier, String currentVersion, String deviceType, int i2, int i3, String displayName, Production production, String deviceApiKey, String firstOnboardedDate, String str, String localIpAddress, String localIpAddressReportingDate, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, FeatureSet featureSet) {
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(production, "production");
        Intrinsics.checkNotNullParameter(deviceApiKey, "deviceApiKey");
        Intrinsics.checkNotNullParameter(firstOnboardedDate, "firstOnboardedDate");
        Intrinsics.checkNotNullParameter(localIpAddress, "localIpAddress");
        Intrinsics.checkNotNullParameter(localIpAddressReportingDate, "localIpAddressReportingDate");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastModifiedBy, "lastModifiedBy");
        Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
        this.id = i;
        this.enabled = z;
        this.deviceIdentifier = deviceIdentifier;
        this.currentVersion = currentVersion;
        this.deviceType = deviceType;
        this.accountId = i2;
        this.currentUserId = i3;
        this.displayName = displayName;
        this.production = production;
        this.deviceApiKey = deviceApiKey;
        this.firstOnboardedDate = firstOnboardedDate;
        this.firstOnboardedDateCurrentAccount = str;
        this.localIpAddress = localIpAddress;
        this.localIpAddressReportingDate = localIpAddressReportingDate;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.flags = featureSet;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    public final String getCurrentVersion() {
        return this.currentVersion;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final int getCurrentUserId() {
        return this.currentUserId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Production getProduction() {
        return this.production;
    }

    public final String getDeviceApiKey() {
        return this.deviceApiKey;
    }

    public final String getFirstOnboardedDate() {
        return this.firstOnboardedDate;
    }

    public final String getFirstOnboardedDateCurrentAccount() {
        return this.firstOnboardedDateCurrentAccount;
    }

    public final String getLocalIpAddress() {
        return this.localIpAddress;
    }

    public final String getLocalIpAddressReportingDate() {
        return this.localIpAddressReportingDate;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public final String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public final FeatureSet getFlags() {
        return this.flags;
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$Production;", "", TtmlNode.ATTR_ID, "", "importDate", "", "notes", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getImportDate", "()Ljava/lang/String;", "getNotes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Production {
        private final int id;
        private final String importDate;
        private final String notes;

        public static /* synthetic */ Production copy$default(Production production, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = production.id;
            }
            if ((i2 & 2) != 0) {
                str = production.importDate;
            }
            if ((i2 & 4) != 0) {
                str2 = production.notes;
            }
            return production.copy(i, str, str2);
        }

        public final int component1() {
            return this.id;
        }

        public final String component2() {
            return this.importDate;
        }

        public final String component3() {
            return this.notes;
        }

        public final Production copy(int i, String importDate, String str) {
            Intrinsics.checkNotNullParameter(importDate, "importDate");
            return new Production(i, importDate, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Production) {
                Production production = (Production) obj;
                return this.id == production.id && Intrinsics.areEqual(this.importDate, production.importDate) && Intrinsics.areEqual(this.notes, production.notes);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.id * 31) + this.importDate.hashCode()) * 31;
            String str = this.notes;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Production(id=" + this.id + ", importDate=" + this.importDate + ", notes=" + this.notes + ')';
        }

        public Production(int i, String importDate, String str) {
            Intrinsics.checkNotNullParameter(importDate, "importDate");
            this.id = i;
            this.importDate = importDate;
            this.notes = str;
        }

        public final int getId() {
            return this.id;
        }

        public final String getImportDate() {
            return this.importDate;
        }

        public final String getNotes() {
            return this.notes;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ji\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FeatureSet;", "", "submitLogs", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagSubmitLogs;", "autoplay", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAutoplay;", "forceCrash", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagForceCrash;", "manualTicketRedemption", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagManualTicketRedemption;", "advancedTimers", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAdvancedTimers;", "profiles", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagProfiles;", "pinEntry", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagPinEntry;", "autoLogs", "Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAutoLogs;", "(Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagSubmitLogs;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAutoplay;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagForceCrash;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagManualTicketRedemption;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAdvancedTimers;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagProfiles;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagPinEntry;Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAutoLogs;)V", "getAdvancedTimers", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAdvancedTimers;", "getAutoLogs", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAutoLogs;", "getAutoplay", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAutoplay;", "getForceCrash", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagForceCrash;", "getManualTicketRedemption", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagManualTicketRedemption;", "getPinEntry", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagPinEntry;", "getProfiles", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagProfiles;", "getSubmitLogs", "()Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagSubmitLogs;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FeatureSet {
        private final FlagAdvancedTimers advancedTimers;
        private final FlagAutoLogs autoLogs;
        private final FlagAutoplay autoplay;
        private final FlagForceCrash forceCrash;
        private final FlagManualTicketRedemption manualTicketRedemption;
        private final FlagPinEntry pinEntry;
        private final FlagProfiles profiles;
        private final FlagSubmitLogs submitLogs;

        public final FlagSubmitLogs component1() {
            return this.submitLogs;
        }

        public final FlagAutoplay component2() {
            return this.autoplay;
        }

        public final FlagForceCrash component3() {
            return this.forceCrash;
        }

        public final FlagManualTicketRedemption component4() {
            return this.manualTicketRedemption;
        }

        public final FlagAdvancedTimers component5() {
            return this.advancedTimers;
        }

        public final FlagProfiles component6() {
            return this.profiles;
        }

        public final FlagPinEntry component7() {
            return this.pinEntry;
        }

        public final FlagAutoLogs component8() {
            return this.autoLogs;
        }

        public final FeatureSet copy(FlagSubmitLogs flagSubmitLogs, FlagAutoplay flagAutoplay, FlagForceCrash flagForceCrash, FlagManualTicketRedemption flagManualTicketRedemption, FlagAdvancedTimers flagAdvancedTimers, FlagProfiles flagProfiles, FlagPinEntry flagPinEntry, FlagAutoLogs flagAutoLogs) {
            return new FeatureSet(flagSubmitLogs, flagAutoplay, flagForceCrash, flagManualTicketRedemption, flagAdvancedTimers, flagProfiles, flagPinEntry, flagAutoLogs);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FeatureSet) {
                FeatureSet featureSet = (FeatureSet) obj;
                return Intrinsics.areEqual(this.submitLogs, featureSet.submitLogs) && Intrinsics.areEqual(this.autoplay, featureSet.autoplay) && Intrinsics.areEqual(this.forceCrash, featureSet.forceCrash) && Intrinsics.areEqual(this.manualTicketRedemption, featureSet.manualTicketRedemption) && Intrinsics.areEqual(this.advancedTimers, featureSet.advancedTimers) && Intrinsics.areEqual(this.profiles, featureSet.profiles) && Intrinsics.areEqual(this.pinEntry, featureSet.pinEntry) && Intrinsics.areEqual(this.autoLogs, featureSet.autoLogs);
            }
            return false;
        }

        public int hashCode() {
            FlagSubmitLogs flagSubmitLogs = this.submitLogs;
            int hashCode = (flagSubmitLogs == null ? 0 : flagSubmitLogs.hashCode()) * 31;
            FlagAutoplay flagAutoplay = this.autoplay;
            int hashCode2 = (hashCode + (flagAutoplay == null ? 0 : flagAutoplay.hashCode())) * 31;
            FlagForceCrash flagForceCrash = this.forceCrash;
            int hashCode3 = (hashCode2 + (flagForceCrash == null ? 0 : flagForceCrash.hashCode())) * 31;
            FlagManualTicketRedemption flagManualTicketRedemption = this.manualTicketRedemption;
            int hashCode4 = (hashCode3 + (flagManualTicketRedemption == null ? 0 : flagManualTicketRedemption.hashCode())) * 31;
            FlagAdvancedTimers flagAdvancedTimers = this.advancedTimers;
            int hashCode5 = (hashCode4 + (flagAdvancedTimers == null ? 0 : flagAdvancedTimers.hashCode())) * 31;
            FlagProfiles flagProfiles = this.profiles;
            int hashCode6 = (hashCode5 + (flagProfiles == null ? 0 : flagProfiles.hashCode())) * 31;
            FlagPinEntry flagPinEntry = this.pinEntry;
            int hashCode7 = (hashCode6 + (flagPinEntry == null ? 0 : flagPinEntry.hashCode())) * 31;
            FlagAutoLogs flagAutoLogs = this.autoLogs;
            return hashCode7 + (flagAutoLogs != null ? flagAutoLogs.hashCode() : 0);
        }

        public String toString() {
            return "FeatureSet(submitLogs=" + this.submitLogs + ", autoplay=" + this.autoplay + ", forceCrash=" + this.forceCrash + ", manualTicketRedemption=" + this.manualTicketRedemption + ", advancedTimers=" + this.advancedTimers + ", profiles=" + this.profiles + ", pinEntry=" + this.pinEntry + ", autoLogs=" + this.autoLogs + ')';
        }

        public FeatureSet(FlagSubmitLogs flagSubmitLogs, FlagAutoplay flagAutoplay, FlagForceCrash flagForceCrash, FlagManualTicketRedemption flagManualTicketRedemption, FlagAdvancedTimers flagAdvancedTimers, FlagProfiles flagProfiles, FlagPinEntry flagPinEntry, FlagAutoLogs flagAutoLogs) {
            this.submitLogs = flagSubmitLogs;
            this.autoplay = flagAutoplay;
            this.forceCrash = flagForceCrash;
            this.manualTicketRedemption = flagManualTicketRedemption;
            this.advancedTimers = flagAdvancedTimers;
            this.profiles = flagProfiles;
            this.pinEntry = flagPinEntry;
            this.autoLogs = flagAutoLogs;
        }

        public final FlagSubmitLogs getSubmitLogs() {
            return this.submitLogs;
        }

        public final FlagAutoplay getAutoplay() {
            return this.autoplay;
        }

        public final FlagForceCrash getForceCrash() {
            return this.forceCrash;
        }

        public final FlagManualTicketRedemption getManualTicketRedemption() {
            return this.manualTicketRedemption;
        }

        public final FlagAdvancedTimers getAdvancedTimers() {
            return this.advancedTimers;
        }

        public final FlagProfiles getProfiles() {
            return this.profiles;
        }

        public final FlagPinEntry getPinEntry() {
            return this.pinEntry;
        }

        public final FlagAutoLogs getAutoLogs() {
            return this.autoLogs;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagSubmitLogs;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FlagSubmitLogs {
        private final boolean enabled;

        public FlagSubmitLogs() {
            this(false, 1, null);
        }

        public static /* synthetic */ FlagSubmitLogs copy$default(FlagSubmitLogs flagSubmitLogs, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flagSubmitLogs.enabled;
            }
            return flagSubmitLogs.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final FlagSubmitLogs copy(boolean z) {
            return new FlagSubmitLogs(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FlagSubmitLogs) && this.enabled == ((FlagSubmitLogs) obj).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "FlagSubmitLogs(enabled=" + this.enabled + ')';
        }

        public FlagSubmitLogs(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ FlagSubmitLogs(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAutoplay;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FlagAutoplay {
        private final boolean enabled;

        public FlagAutoplay() {
            this(false, 1, null);
        }

        public static /* synthetic */ FlagAutoplay copy$default(FlagAutoplay flagAutoplay, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flagAutoplay.enabled;
            }
            return flagAutoplay.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final FlagAutoplay copy(boolean z) {
            return new FlagAutoplay(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FlagAutoplay) && this.enabled == ((FlagAutoplay) obj).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "FlagAutoplay(enabled=" + this.enabled + ')';
        }

        public FlagAutoplay(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ FlagAutoplay(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagForceCrash;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FlagForceCrash {
        private final boolean enabled;

        public FlagForceCrash() {
            this(false, 1, null);
        }

        public static /* synthetic */ FlagForceCrash copy$default(FlagForceCrash flagForceCrash, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flagForceCrash.enabled;
            }
            return flagForceCrash.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final FlagForceCrash copy(boolean z) {
            return new FlagForceCrash(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FlagForceCrash) && this.enabled == ((FlagForceCrash) obj).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "FlagForceCrash(enabled=" + this.enabled + ')';
        }

        public FlagForceCrash(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ FlagForceCrash(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagManualTicketRedemption;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FlagManualTicketRedemption {
        private final boolean enabled;

        public FlagManualTicketRedemption() {
            this(false, 1, null);
        }

        public static /* synthetic */ FlagManualTicketRedemption copy$default(FlagManualTicketRedemption flagManualTicketRedemption, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flagManualTicketRedemption.enabled;
            }
            return flagManualTicketRedemption.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final FlagManualTicketRedemption copy(boolean z) {
            return new FlagManualTicketRedemption(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FlagManualTicketRedemption) && this.enabled == ((FlagManualTicketRedemption) obj).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "FlagManualTicketRedemption(enabled=" + this.enabled + ')';
        }

        public FlagManualTicketRedemption(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ FlagManualTicketRedemption(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAdvancedTimers;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FlagAdvancedTimers {
        private final boolean enabled;

        public FlagAdvancedTimers() {
            this(false, 1, null);
        }

        public static /* synthetic */ FlagAdvancedTimers copy$default(FlagAdvancedTimers flagAdvancedTimers, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flagAdvancedTimers.enabled;
            }
            return flagAdvancedTimers.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final FlagAdvancedTimers copy(boolean z) {
            return new FlagAdvancedTimers(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FlagAdvancedTimers) && this.enabled == ((FlagAdvancedTimers) obj).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "FlagAdvancedTimers(enabled=" + this.enabled + ')';
        }

        public FlagAdvancedTimers(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ FlagAdvancedTimers(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagProfiles;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FlagProfiles {
        private final boolean enabled;

        public FlagProfiles() {
            this(false, 1, null);
        }

        public static /* synthetic */ FlagProfiles copy$default(FlagProfiles flagProfiles, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flagProfiles.enabled;
            }
            return flagProfiles.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final FlagProfiles copy(boolean z) {
            return new FlagProfiles(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FlagProfiles) && this.enabled == ((FlagProfiles) obj).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "FlagProfiles(enabled=" + this.enabled + ')';
        }

        public FlagProfiles(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ FlagProfiles(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagPinEntry;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FlagPinEntry {
        private final boolean enabled;

        public FlagPinEntry() {
            this(false, 1, null);
        }

        public static /* synthetic */ FlagPinEntry copy$default(FlagPinEntry flagPinEntry, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flagPinEntry.enabled;
            }
            return flagPinEntry.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final FlagPinEntry copy(boolean z) {
            return new FlagPinEntry(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FlagPinEntry) && this.enabled == ((FlagPinEntry) obj).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "FlagPinEntry(enabled=" + this.enabled + ')';
        }

        public FlagPinEntry(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ FlagPinEntry(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ReportInformationDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ReportInformationDto$FlagAutoLogs;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FlagAutoLogs {
        private final boolean enabled;

        public FlagAutoLogs() {
            this(false, 1, null);
        }

        public static /* synthetic */ FlagAutoLogs copy$default(FlagAutoLogs flagAutoLogs, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flagAutoLogs.enabled;
            }
            return flagAutoLogs.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final FlagAutoLogs copy(boolean z) {
            return new FlagAutoLogs(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FlagAutoLogs) && this.enabled == ((FlagAutoLogs) obj).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "FlagAutoLogs(enabled=" + this.enabled + ')';
        }

        public FlagAutoLogs(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ FlagAutoLogs(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }
}
