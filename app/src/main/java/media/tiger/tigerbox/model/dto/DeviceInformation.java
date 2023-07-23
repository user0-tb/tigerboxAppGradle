package media.tiger.tigerbox.model.dto;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceInformation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001:\u0002LMB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010#J\t\u0010E\u001a\u00020\bHÆ\u0003JÊ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0004HÖ\u0001J\t\u0010K\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006N"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/DeviceInformation;", "", "()V", TtmlNode.ATTR_ID, "", "enabled", "", "deviceIdentifier", "", "currentVersion", "deviceType", "accountId", "currentUserId", "currentProfileId", "displayName", "production", "Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Production;", "deviceApiKey", "localIpAddress", "localIpAddressReportingDate", "createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate", "_links", "Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links;", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Production;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links;)V", "get_links", "()Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links;", "getAccountId", "()I", "getCreatedBy", "()Ljava/lang/String;", "getCreatedDate", "getCurrentProfileId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentUserId", "getCurrentVersion", "getDeviceApiKey", "getDeviceIdentifier", "getDeviceType", "getDisplayName", "getEnabled", "()Z", "getId", "getLastModifiedBy", "getLastModifiedDate", "getLocalIpAddress", "getLocalIpAddressReportingDate", "getProduction", "()Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Production;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Production;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links;)Lmedia/tiger/tigerbox/model/dto/DeviceInformation;", "equals", "other", "hashCode", "toString", "Links", "Production", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceInformation {
    private final Links _links;
    private final int accountId;
    private final String createdBy;
    private final String createdDate;
    private final Integer currentProfileId;
    private final Integer currentUserId;
    private final String currentVersion;
    private final String deviceApiKey;
    private final String deviceIdentifier;
    private final String deviceType;
    private final String displayName;
    private final boolean enabled;
    private final int id;
    private final String lastModifiedBy;
    private final String lastModifiedDate;
    private final String localIpAddress;
    private final String localIpAddressReportingDate;
    private final Production production;

    public final int component1() {
        return this.id;
    }

    public final Production component10() {
        return this.production;
    }

    public final String component11() {
        return this.deviceApiKey;
    }

    public final String component12() {
        return this.localIpAddress;
    }

    public final String component13() {
        return this.localIpAddressReportingDate;
    }

    public final String component14() {
        return this.createdBy;
    }

    public final String component15() {
        return this.createdDate;
    }

    public final String component16() {
        return this.lastModifiedBy;
    }

    public final String component17() {
        return this.lastModifiedDate;
    }

    public final Links component18() {
        return this._links;
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

    public final Integer component7() {
        return this.currentUserId;
    }

    public final Integer component8() {
        return this.currentProfileId;
    }

    public final String component9() {
        return this.displayName;
    }

    public final DeviceInformation copy(int i, boolean z, String deviceIdentifier, String currentVersion, String deviceType, int i2, Integer num, Integer num2, String displayName, Production production, String deviceApiKey, String localIpAddress, String str, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, Links links) {
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(production, "production");
        Intrinsics.checkNotNullParameter(deviceApiKey, "deviceApiKey");
        Intrinsics.checkNotNullParameter(localIpAddress, "localIpAddress");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastModifiedBy, "lastModifiedBy");
        Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
        return new DeviceInformation(i, z, deviceIdentifier, currentVersion, deviceType, i2, num, num2, displayName, production, deviceApiKey, localIpAddress, str, createdBy, createdDate, lastModifiedBy, lastModifiedDate, links);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceInformation) {
            DeviceInformation deviceInformation = (DeviceInformation) obj;
            return this.id == deviceInformation.id && this.enabled == deviceInformation.enabled && Intrinsics.areEqual(this.deviceIdentifier, deviceInformation.deviceIdentifier) && Intrinsics.areEqual(this.currentVersion, deviceInformation.currentVersion) && Intrinsics.areEqual(this.deviceType, deviceInformation.deviceType) && this.accountId == deviceInformation.accountId && Intrinsics.areEqual(this.currentUserId, deviceInformation.currentUserId) && Intrinsics.areEqual(this.currentProfileId, deviceInformation.currentProfileId) && Intrinsics.areEqual(this.displayName, deviceInformation.displayName) && Intrinsics.areEqual(this.production, deviceInformation.production) && Intrinsics.areEqual(this.deviceApiKey, deviceInformation.deviceApiKey) && Intrinsics.areEqual(this.localIpAddress, deviceInformation.localIpAddress) && Intrinsics.areEqual(this.localIpAddressReportingDate, deviceInformation.localIpAddressReportingDate) && Intrinsics.areEqual(this.createdBy, deviceInformation.createdBy) && Intrinsics.areEqual(this.createdDate, deviceInformation.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, deviceInformation.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, deviceInformation.lastModifiedDate) && Intrinsics.areEqual(this._links, deviceInformation._links);
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
        int hashCode = (((((((((i + i2) * 31) + this.deviceIdentifier.hashCode()) * 31) + this.currentVersion.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.accountId) * 31;
        Integer num = this.currentUserId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currentProfileId;
        int hashCode3 = (((((((((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.displayName.hashCode()) * 31) + this.production.hashCode()) * 31) + this.deviceApiKey.hashCode()) * 31) + this.localIpAddress.hashCode()) * 31;
        String str = this.localIpAddressReportingDate;
        int hashCode4 = (((((((((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.createdBy.hashCode()) * 31) + this.createdDate.hashCode()) * 31) + this.lastModifiedBy.hashCode()) * 31) + this.lastModifiedDate.hashCode()) * 31;
        Links links = this._links;
        return hashCode4 + (links != null ? links.hashCode() : 0);
    }

    public String toString() {
        return "DeviceInformation(id=" + this.id + ", enabled=" + this.enabled + ", deviceIdentifier=" + this.deviceIdentifier + ", currentVersion=" + this.currentVersion + ", deviceType=" + this.deviceType + ", accountId=" + this.accountId + ", currentUserId=" + this.currentUserId + ", currentProfileId=" + this.currentProfileId + ", displayName=" + this.displayName + ", production=" + this.production + ", deviceApiKey=" + this.deviceApiKey + ", localIpAddress=" + this.localIpAddress + ", localIpAddressReportingDate=" + this.localIpAddressReportingDate + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ", _links=" + this._links + ')';
    }

    public DeviceInformation(int i, boolean z, String deviceIdentifier, String currentVersion, String deviceType, int i2, Integer num, Integer num2, String displayName, Production production, String deviceApiKey, String localIpAddress, String str, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, Links links) {
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(production, "production");
        Intrinsics.checkNotNullParameter(deviceApiKey, "deviceApiKey");
        Intrinsics.checkNotNullParameter(localIpAddress, "localIpAddress");
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
        this.currentUserId = num;
        this.currentProfileId = num2;
        this.displayName = displayName;
        this.production = production;
        this.deviceApiKey = deviceApiKey;
        this.localIpAddress = localIpAddress;
        this.localIpAddressReportingDate = str;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this._links = links;
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

    public final Integer getCurrentUserId() {
        return this.currentUserId;
    }

    public final Integer getCurrentProfileId() {
        return this.currentProfileId;
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

    public final Links get_links() {
        return this._links;
    }

    public DeviceInformation() {
        this(0, false, "", "", "", 0, 0, 0, "", new Production(0, "", ""), "", "", "", "", "", "", "", null);
    }

    /* compiled from: DeviceInformation.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Production;", "", TtmlNode.ATTR_ID, "", "importDate", "", "notes", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getImportDate", "()Ljava/lang/String;", "getNotes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

        public final Production copy(int i, String importDate, String notes) {
            Intrinsics.checkNotNullParameter(importDate, "importDate");
            Intrinsics.checkNotNullParameter(notes, "notes");
            return new Production(i, importDate, notes);
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
            return (((this.id * 31) + this.importDate.hashCode()) * 31) + this.notes.hashCode();
        }

        public String toString() {
            return "Production(id=" + this.id + ", importDate=" + this.importDate + ", notes=" + this.notes + ')';
        }

        public Production(int i, String importDate, String notes) {
            Intrinsics.checkNotNullParameter(importDate, "importDate");
            Intrinsics.checkNotNullParameter(notes, "notes");
            this.id = i;
            this.importDate = importDate;
            this.notes = notes;
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

    /* compiled from: DeviceInformation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links;", "", "self", "Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links$Link;", "(Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links$Link;)V", "getSelf", "()Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links$Link;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", HttpHeaders.LINK, "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Links {
        private final Link self;

        public static /* synthetic */ Links copy$default(Links links, Link link, int i, Object obj) {
            if ((i & 1) != 0) {
                link = links.self;
            }
            return links.copy(link);
        }

        public final Link component1() {
            return this.self;
        }

        public final Links copy(Link link) {
            return new Links(link);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Links) && Intrinsics.areEqual(this.self, ((Links) obj).self);
        }

        public int hashCode() {
            Link link = this.self;
            if (link == null) {
                return 0;
            }
            return link.hashCode();
        }

        public String toString() {
            return "Links(self=" + this.self + ')';
        }

        /* compiled from: DeviceInformation.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/DeviceInformation$Links$Link;", "", "href", "", "(Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Link {
            private final String href;

            public static /* synthetic */ Link copy$default(Link link, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = link.href;
                }
                return link.copy(str);
            }

            public final String component1() {
                return this.href;
            }

            public final Link copy(String href) {
                Intrinsics.checkNotNullParameter(href, "href");
                return new Link(href);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Link) && Intrinsics.areEqual(this.href, ((Link) obj).href);
            }

            public int hashCode() {
                return this.href.hashCode();
            }

            public String toString() {
                return "Link(href=" + this.href + ')';
            }

            public Link(String href) {
                Intrinsics.checkNotNullParameter(href, "href");
                this.href = href;
            }

            public final String getHref() {
                return this.href;
            }
        }

        public Links(Link link) {
            this.self = link;
        }

        public final Link getSelf() {
            return this.self;
        }
    }
}
