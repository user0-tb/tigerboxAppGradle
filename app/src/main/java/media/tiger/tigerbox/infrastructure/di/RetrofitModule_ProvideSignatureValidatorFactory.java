package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.onboarding.step3.security.DigestValidator;

/* loaded from: classes3.dex */
public final class RetrofitModule_ProvideSignatureValidatorFactory implements Factory<DigestValidator> {
    @Override // javax.inject.Provider
    public DigestValidator get() {
        return provideSignatureValidator();
    }

    public static RetrofitModule_ProvideSignatureValidatorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DigestValidator provideSignatureValidator() {
        return (DigestValidator) Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideSignatureValidator());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final RetrofitModule_ProvideSignatureValidatorFactory INSTANCE = new RetrofitModule_ProvideSignatureValidatorFactory();

        private InstanceHolder() {
        }
    }
}
