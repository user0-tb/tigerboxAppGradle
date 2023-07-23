package media.tiger.tigerbox.ui.main.card;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.main.card.TigerTicketInputPinViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class TigerTicketInputPinViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static TigerTicketInputPinViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(TigerTicketInputPinViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final TigerTicketInputPinViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TigerTicketInputPinViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
