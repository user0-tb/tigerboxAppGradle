package media.tiger.tigerbox.ui.onboarding;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;

/* compiled from: OnboardingViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/OnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "sessionTokenExpired", "", "getSessionTokenExpired", "()Z", "setSessionTokenExpired", "(Z)V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public class OnboardingViewModel extends ViewModel {
    private boolean sessionTokenExpired;

    public final boolean getSessionTokenExpired() {
        return this.sessionTokenExpired;
    }

    public final void setSessionTokenExpired(boolean z) {
        this.sessionTokenExpired = z;
    }
}
