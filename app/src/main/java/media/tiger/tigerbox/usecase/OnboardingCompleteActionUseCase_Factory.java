package media.tiger.tigerbox.usecase;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.services.interfaces.StorageService;

/* loaded from: classes4.dex */
public final class OnboardingCompleteActionUseCase_Factory implements Factory<OnboardingCompleteActionUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<StorageService> preferenceStorageProvider;

    public OnboardingCompleteActionUseCase_Factory(Provider<StorageService> preferenceStorageProvider, Provider<CoroutineDispatcher> dispatcherProvider) {
        this.preferenceStorageProvider = preferenceStorageProvider;
        this.dispatcherProvider = dispatcherProvider;
    }

    @Override // javax.inject.Provider
    public OnboardingCompleteActionUseCase get() {
        return newInstance(this.preferenceStorageProvider.get(), this.dispatcherProvider.get());
    }

    public static OnboardingCompleteActionUseCase_Factory create(Provider<StorageService> preferenceStorageProvider, Provider<CoroutineDispatcher> dispatcherProvider) {
        return new OnboardingCompleteActionUseCase_Factory(preferenceStorageProvider, dispatcherProvider);
    }

    public static OnboardingCompleteActionUseCase newInstance(StorageService preferenceStorage, CoroutineDispatcher dispatcher) {
        return new OnboardingCompleteActionUseCase(preferenceStorage, dispatcher);
    }
}
