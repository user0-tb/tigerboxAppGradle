package media.tiger.tigerbox.ui;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.usecase.OnboardingCompletedUseCase;

/* loaded from: classes4.dex */
public final class LaunchViewModel_Factory implements Factory<LaunchViewModel> {
    private final Provider<OnboardingCompletedUseCase> onboardingCompletedUseCaseProvider;

    public LaunchViewModel_Factory(Provider<OnboardingCompletedUseCase> onboardingCompletedUseCaseProvider) {
        this.onboardingCompletedUseCaseProvider = onboardingCompletedUseCaseProvider;
    }

    @Override // javax.inject.Provider
    public LaunchViewModel get() {
        return newInstance(this.onboardingCompletedUseCaseProvider.get());
    }

    public static LaunchViewModel_Factory create(Provider<OnboardingCompletedUseCase> onboardingCompletedUseCaseProvider) {
        return new LaunchViewModel_Factory(onboardingCompletedUseCaseProvider);
    }

    public static LaunchViewModel newInstance(OnboardingCompletedUseCase onboardingCompletedUseCase) {
        return new LaunchViewModel(onboardingCompletedUseCase);
    }
}
