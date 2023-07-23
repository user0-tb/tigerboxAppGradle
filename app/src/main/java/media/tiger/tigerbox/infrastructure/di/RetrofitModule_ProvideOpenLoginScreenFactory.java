package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import media.tiger.tigerbox.ui.onboarding.ReauthenticationLoginHandler;

/* loaded from: classes3.dex */
public final class RetrofitModule_ProvideOpenLoginScreenFactory implements Factory<ReauthenticationLoginHandler> {
    private final Provider<Context> contextProvider;

    public RetrofitModule_ProvideOpenLoginScreenFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ReauthenticationLoginHandler get() {
        return provideOpenLoginScreen(this.contextProvider.get());
    }

    public static RetrofitModule_ProvideOpenLoginScreenFactory create(Provider<Context> contextProvider) {
        return new RetrofitModule_ProvideOpenLoginScreenFactory(contextProvider);
    }

    public static ReauthenticationLoginHandler provideOpenLoginScreen(Context context) {
        return (ReauthenticationLoginHandler) Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideOpenLoginScreen(context));
    }
}
