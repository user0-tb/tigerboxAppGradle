package media.tiger.tigerbox.ui.main.card;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.main.card.TigerTicketPurchaseViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class TigerTicketPurchaseViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static TigerTicketPurchaseViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(TigerTicketPurchaseViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final TigerTicketPurchaseViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TigerTicketPurchaseViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
