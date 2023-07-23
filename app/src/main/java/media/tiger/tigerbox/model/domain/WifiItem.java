package media.tiger.tigerbox.model.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WifiItemDomain.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/WifiItem;", "", "bssid", "", "ssid", "wifiStrength", "Lmedia/tiger/tigerbox/model/domain/WifiStrength;", "securityMode", "Lmedia/tiger/tigerbox/model/domain/SecurityMode;", "connectionState", "Lmedia/tiger/tigerbox/model/domain/ConnectionState;", "isHeader", "", "(Ljava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/domain/WifiStrength;Lmedia/tiger/tigerbox/model/domain/SecurityMode;Lmedia/tiger/tigerbox/model/domain/ConnectionState;Z)V", "getBssid", "()Ljava/lang/String;", "getConnectionState", "()Lmedia/tiger/tigerbox/model/domain/ConnectionState;", "()Z", "isSecure", "getSecurityMode", "()Lmedia/tiger/tigerbox/model/domain/SecurityMode;", "getSsid", "getWifiStrength", "()Lmedia/tiger/tigerbox/model/domain/WifiStrength;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifiItem {
    private final String bssid;
    private final ConnectionState connectionState;
    private final boolean isHeader;
    private final SecurityMode securityMode;
    private final String ssid;
    private final WifiStrength wifiStrength;

    public static /* synthetic */ WifiItem copy$default(WifiItem wifiItem, String str, String str2, WifiStrength wifiStrength, SecurityMode securityMode, ConnectionState connectionState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wifiItem.bssid;
        }
        if ((i & 2) != 0) {
            str2 = wifiItem.ssid;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            wifiStrength = wifiItem.wifiStrength;
        }
        WifiStrength wifiStrength2 = wifiStrength;
        if ((i & 8) != 0) {
            securityMode = wifiItem.securityMode;
        }
        SecurityMode securityMode2 = securityMode;
        if ((i & 16) != 0) {
            connectionState = wifiItem.connectionState;
        }
        ConnectionState connectionState2 = connectionState;
        if ((i & 32) != 0) {
            z = wifiItem.isHeader;
        }
        return wifiItem.copy(str, str3, wifiStrength2, securityMode2, connectionState2, z);
    }

    public final String component1() {
        return this.bssid;
    }

    public final String component2() {
        return this.ssid;
    }

    public final WifiStrength component3() {
        return this.wifiStrength;
    }

    public final SecurityMode component4() {
        return this.securityMode;
    }

    public final ConnectionState component5() {
        return this.connectionState;
    }

    public final boolean component6() {
        return this.isHeader;
    }

    public final WifiItem copy(String bssid, String ssid, WifiStrength wifiStrength, SecurityMode securityMode, ConnectionState connectionState, boolean z) {
        Intrinsics.checkNotNullParameter(bssid, "bssid");
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(wifiStrength, "wifiStrength");
        Intrinsics.checkNotNullParameter(securityMode, "securityMode");
        Intrinsics.checkNotNullParameter(connectionState, "connectionState");
        return new WifiItem(bssid, ssid, wifiStrength, securityMode, connectionState, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WifiItem) {
            WifiItem wifiItem = (WifiItem) obj;
            return Intrinsics.areEqual(this.bssid, wifiItem.bssid) && Intrinsics.areEqual(this.ssid, wifiItem.ssid) && this.wifiStrength == wifiItem.wifiStrength && this.securityMode == wifiItem.securityMode && this.connectionState == wifiItem.connectionState && this.isHeader == wifiItem.isHeader;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.bssid.hashCode() * 31) + this.ssid.hashCode()) * 31) + this.wifiStrength.hashCode()) * 31) + this.securityMode.hashCode()) * 31) + this.connectionState.hashCode()) * 31;
        boolean z = this.isHeader;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "WifiItem(bssid=" + this.bssid + ", ssid=" + this.ssid + ", wifiStrength=" + this.wifiStrength + ", securityMode=" + this.securityMode + ", connectionState=" + this.connectionState + ", isHeader=" + this.isHeader + ')';
    }

    public WifiItem(String bssid, String ssid, WifiStrength wifiStrength, SecurityMode securityMode, ConnectionState connectionState, boolean z) {
        Intrinsics.checkNotNullParameter(bssid, "bssid");
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(wifiStrength, "wifiStrength");
        Intrinsics.checkNotNullParameter(securityMode, "securityMode");
        Intrinsics.checkNotNullParameter(connectionState, "connectionState");
        this.bssid = bssid;
        this.ssid = ssid;
        this.wifiStrength = wifiStrength;
        this.securityMode = securityMode;
        this.connectionState = connectionState;
        this.isHeader = z;
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public final WifiStrength getWifiStrength() {
        return this.wifiStrength;
    }

    public /* synthetic */ WifiItem(String str, String str2, WifiStrength wifiStrength, SecurityMode securityMode, ConnectionState connectionState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, wifiStrength, (i & 8) != 0 ? SecurityMode.OPEN : securityMode, (i & 16) != 0 ? ConnectionState.NOT_CONNECTED : connectionState, (i & 32) != 0 ? false : z);
    }

    public final SecurityMode getSecurityMode() {
        return this.securityMode;
    }

    public final ConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final boolean isHeader() {
        return this.isHeader;
    }

    public final boolean isSecure() {
        return this.securityMode != SecurityMode.OPEN;
    }
}
