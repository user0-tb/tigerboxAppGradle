package media.tiger.tigerbox.services.interfaces;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerCardsManagerService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/TigerCardsListener;", "", "onCardInsertedAndValidated", "", "card", "Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain;", "onCardRemoved", "onCardValidateFailure", "failError", "Lmedia/tiger/tigerbox/services/interfaces/CardValidationFailError;", "ticketFailure", "Lmedia/tiger/tigerbox/services/interfaces/TicketFailure;", "onTigerTicketStep", "step", "Lmedia/tiger/tigerbox/services/interfaces/TigerTicketStepDomain;", "onWildcardReassignStep", "Lmedia/tiger/tigerbox/services/interfaces/WildcardReassignStep;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TigerCardsListener {

    /* compiled from: TigerCardsManagerService.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void onCardInsertedAndValidated(TigerCardsListener tigerCardsListener, TigerCardDomain card) {
            Intrinsics.checkNotNullParameter(card, "card");
        }

        public static void onCardRemoved(TigerCardsListener tigerCardsListener) {
        }

        public static void onCardValidateFailure(TigerCardsListener tigerCardsListener, CardValidationFailError failError, TicketFailure ticketFailure) {
            Intrinsics.checkNotNullParameter(failError, "failError");
        }

        public static void onTigerTicketStep(TigerCardsListener tigerCardsListener, TigerTicketStepDomain step) {
            Intrinsics.checkNotNullParameter(step, "step");
        }

        public static void onWildcardReassignStep(TigerCardsListener tigerCardsListener, WildcardReassignStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
        }
    }

    void onCardInsertedAndValidated(TigerCardDomain tigerCardDomain);

    void onCardRemoved();

    void onCardValidateFailure(CardValidationFailError cardValidationFailError, TicketFailure ticketFailure);

    void onTigerTicketStep(TigerTicketStepDomain tigerTicketStepDomain);

    void onWildcardReassignStep(WildcardReassignStep wildcardReassignStep);
}
