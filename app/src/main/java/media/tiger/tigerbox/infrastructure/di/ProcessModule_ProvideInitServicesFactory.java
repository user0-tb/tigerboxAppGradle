package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import media.tiger.tigerbox.InitServices;
import media.tiger.tigerbox.services.interfaces.PowerManagementService;

/* loaded from: classes3.dex */
public final class ProcessModule_ProvideInitServicesFactory implements Factory<InitServices> {
    private final Provider<Context> contextProvider;
    private final Provider<PowerManagementService> powerManagementServiceProvider;

    public ProcessModule_ProvideInitServicesFactory(Provider<Context> contextProvider, Provider<PowerManagementService> powerManagementServiceProvider) {
        this.contextProvider = contextProvider;
        this.powerManagementServiceProvider = powerManagementServiceProvider;
    }

    @Override // javax.inject.Provider
    public InitServices get() {
        return provideInitServices(this.contextProvider.get(), this.powerManagementServiceProvider.get());
    }

    public static ProcessModule_ProvideInitServicesFactory create(Provider<Context> contextProvider, Provider<PowerManagementService> powerManagementServiceProvider) {
        return new ProcessModule_ProvideInitServicesFactory(contextProvider, powerManagementServiceProvider);
    }

    public static InitServices provideInitServices(Context context, PowerManagementService powerManagementService) {
        return (InitServices) Preconditions.checkNotNullFromProvides(ProcessModule.INSTANCE.provideInitServices(context, powerManagementService));
    }
}
