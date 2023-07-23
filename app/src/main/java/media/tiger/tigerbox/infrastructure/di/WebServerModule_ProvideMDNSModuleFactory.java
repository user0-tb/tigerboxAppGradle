package media.tiger.tigerbox.infrastructure.di;

import com.tigermedia.tigerbox.mdns.MulticastDNS;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes3.dex */
public final class WebServerModule_ProvideMDNSModuleFactory implements Factory<MulticastDNS> {
    @Override // javax.inject.Provider
    public MulticastDNS get() {
        return provideMDNSModule();
    }

    public static WebServerModule_ProvideMDNSModuleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MulticastDNS provideMDNSModule() {
        return (MulticastDNS) Preconditions.checkNotNullFromProvides(WebServerModule.INSTANCE.provideMDNSModule());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final WebServerModule_ProvideMDNSModuleFactory INSTANCE = new WebServerModule_ProvideMDNSModuleFactory();

        private InstanceHolder() {
        }
    }
}
