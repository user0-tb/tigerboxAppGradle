package media.tiger.tigerbox.ui.settings.wildcardreassigning;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.settings.wildcardreassigning.TicketRedeemTicketNumberViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class TicketRedeemTicketNumberViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static TicketRedeemTicketNumberViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(TicketRedeemTicketNumberViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final TicketRedeemTicketNumberViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TicketRedeemTicketNumberViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
