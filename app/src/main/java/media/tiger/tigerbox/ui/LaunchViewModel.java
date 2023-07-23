package media.tiger.tigerbox.ui;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.infrastructure.interactor.Event;
import media.tiger.tigerbox.usecase.OnboardingCompletedUseCase;

/* compiled from: LaunchViewModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmedia/tiger/tigerbox/ui/LaunchViewModel;", "Landroidx/lifecycle/ViewModel;", "onboardingCompletedUseCase", "Lmedia/tiger/tigerbox/usecase/OnboardingCompletedUseCase;", "(Lmedia/tiger/tigerbox/usecase/OnboardingCompletedUseCase;)V", "launchDestination", "Landroidx/lifecycle/LiveData;", "Lmedia/tiger/tigerbox/infrastructure/interactor/Event;", "Lmedia/tiger/tigerbox/ui/LaunchNavigationAction;", "getLaunchDestination", "()Landroidx/lifecycle/LiveData;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LaunchViewModel extends ViewModel {
    private final LiveData<Event<LaunchNavigationAction>> launchDestination;

    @Inject
    public LaunchViewModel(OnboardingCompletedUseCase onboardingCompletedUseCase) {
        Intrinsics.checkNotNullParameter(onboardingCompletedUseCase, "onboardingCompletedUseCase");
        this.launchDestination = CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new LaunchViewModel$launchDestination$1(onboardingCompletedUseCase, null), 3, (Object) null);
    }

    public final LiveData<Event<LaunchNavigationAction>> getLaunchDestination() {
        return this.launchDestination;
    }
}
