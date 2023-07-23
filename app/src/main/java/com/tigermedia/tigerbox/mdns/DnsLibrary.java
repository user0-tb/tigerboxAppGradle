package com.tigermedia.tigerbox.mdns;

import com.tigermedia.tigerbox.mdns.MulticastDNS;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DnsLibrary.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 JM\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0082 J\t\u0010\u000e\u001a\u00020\u0004H\u0082 J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J@\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lcom/tigermedia/tigerbox/mdns/DnsLibrary;", "Lcom/tigermedia/tigerbox/mdns/MulticastDNS;", "()V", "mDnsPrepareHostname", "", "domain", "", "identifier", "mDnsStart", "serverName", "serverType", "ipAddress", "netHostName", "port", "mDnsStop", "prepareHostname", "", "startServer", "Lcom/tigermedia/tigerbox/mdns/MulticastDNS$Status;", "ipAdress", "stopServer", "Companion", "mDns_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DnsLibrary implements MulticastDNS {
    public static final Companion Companion = new Companion(null);
    private static final int SUCCESS = 0;

    private final native int mDnsPrepareHostname(String str, String str2);

    private final native int mDnsStart(String str, String str2, String str3, String str4, String str5, String str6, int i);

    private final native int mDnsStop();

    @Override // com.tigermedia.tigerbox.mdns.MulticastDNS
    public void prepareHostname(String domain, String identifier) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        mDnsPrepareHostname(domain, identifier);
    }

    @Override // com.tigermedia.tigerbox.mdns.MulticastDNS
    public MulticastDNS.Status startServer(String domain, String serverName, String serverType, String identifier, String ipAdress, String netHostName, int i) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(serverType, "serverType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(ipAdress, "ipAdress");
        Intrinsics.checkNotNullParameter(netHostName, "netHostName");
        return mDnsStart(domain, serverName, serverType, identifier, ipAdress, netHostName, i) == 0 ? MulticastDNS.Status.CONNECTION_SUCCESSFUL : MulticastDNS.Status.CONNECTION_FAILED;
    }

    @Override // com.tigermedia.tigerbox.mdns.MulticastDNS
    public void stopServer() {
        mDnsStop();
    }

    /* compiled from: DnsLibrary.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tigermedia/tigerbox/mdns/DnsLibrary$Companion;", "", "()V", "SUCCESS", "", "mDns_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        System.loadLibrary("mdnssd");
        System.loadLibrary("dns-sd");
    }
}
