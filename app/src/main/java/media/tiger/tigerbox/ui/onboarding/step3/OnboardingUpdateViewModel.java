package media.tiger.tigerbox.ui.onboarding.step3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import media.tiger.tigerbox.infrastructure.functional.SingleLiveEvent;
import media.tiger.tigerbox.model.domain.BatterySummary;
import media.tiger.tigerbox.model.dto.ReleaseInformation;
import media.tiger.tigerbox.services.interfaces.BatteryChangesListener;
import media.tiger.tigerbox.services.interfaces.BatteryService;
import media.tiger.tigerbox.services.interfaces.FirmwareUpdateListener;
import media.tiger.tigerbox.services.interfaces.FirmwareUpdateService;
import media.tiger.tigerbox.services.interfaces.FirmwareUpdateStep;
import media.tiger.tigerbox.ui.onboarding.OnboardingViewModel;
import media.tiger.tigerbox.ui.onboarding.step3.OnboardingUpdateViewModel;

/* compiled from: OnboardingUpdateViewModel.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n*\u0002\u0011\u0016\b\u0007\u0018\u00002\u00020\u0001:\u000234B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\u0006\u0010/\u001a\u00020&J\b\u00100\u001a\u00020&H\u0002J\u0006\u00101\u001a\u00020&J\u000e\u00102\u001a\u00020&2\u0006\u0010 \u001a\u00020!R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001e¨\u00065"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel;", "Lmedia/tiger/tigerbox/ui/onboarding/OnboardingViewModel;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "firmwareUpdateService", "Lmedia/tiger/tigerbox/services/interfaces/FirmwareUpdateService;", "batteryService", "Lmedia/tiger/tigerbox/services/interfaces/BatteryService;", "(Lkotlinx/coroutines/CoroutineScope;Lmedia/tiger/tigerbox/services/interfaces/FirmwareUpdateService;Lmedia/tiger/tigerbox/services/interfaces/BatteryService;)V", "(Lmedia/tiger/tigerbox/services/interfaces/FirmwareUpdateService;Lmedia/tiger/tigerbox/services/interfaces/BatteryService;)V", "_navigationEvent", "Lmedia/tiger/tigerbox/infrastructure/functional/SingleLiveEvent;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent;", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState;", "batteryChangesListener", "media/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$batteryChangesListener$1", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$batteryChangesListener$1;", "errorShown", "", "firmwareUpdateListener", "media/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$firmwareUpdateListener$1", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$firmwareUpdateListener$1;", "isCancellable", "()Z", "isForced", "navigationEvent", "Landroidx/lifecycle/LiveData;", "getNavigationEvent", "()Landroidx/lifecycle/LiveData;", "updateFailed", "updateSource", "Lmedia/tiger/tigerbox/ui/onboarding/step3/UpdateSource;", "updateStarted", "viewState", "getViewState", "noUpdateRequired", "", "postStepProgress", "step", "Lmedia/tiger/tigerbox/services/interfaces/FirmwareUpdateStep;", "percent", "", "readyToInstall", "readyToUpdate", "readyToUpdateBatteryError", "reset", "showError", "startUpdate", "viewPrepared", "NavigationEvent", "ViewState", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingUpdateViewModel extends OnboardingViewModel {
    private final SingleLiveEvent<NavigationEvent> _navigationEvent;
    private final MutableLiveData<ViewState> _viewState;
    private final OnboardingUpdateViewModel$batteryChangesListener$1 batteryChangesListener;
    private final BatteryService batteryService;
    private CoroutineScope coroutineScope;
    private boolean errorShown;
    private final OnboardingUpdateViewModel$firmwareUpdateListener$1 firmwareUpdateListener;
    private final FirmwareUpdateService firmwareUpdateService;
    private final LiveData<NavigationEvent> navigationEvent;
    private boolean updateFailed;
    private UpdateSource updateSource;
    private boolean updateStarted;
    private final LiveData<ViewState> viewState;

    /* JADX WARN: Type inference failed for: r2v10, types: [media.tiger.tigerbox.ui.onboarding.step3.OnboardingUpdateViewModel$batteryChangesListener$1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [media.tiger.tigerbox.ui.onboarding.step3.OnboardingUpdateViewModel$firmwareUpdateListener$1] */
    @Inject
    public OnboardingUpdateViewModel(FirmwareUpdateService firmwareUpdateService, BatteryService batteryService) {
        Intrinsics.checkNotNullParameter(firmwareUpdateService, "firmwareUpdateService");
        Intrinsics.checkNotNullParameter(batteryService, "batteryService");
        this.firmwareUpdateService = firmwareUpdateService;
        this.batteryService = batteryService;
        this.coroutineScope = ViewModelKt.getViewModelScope(this);
        MutableLiveData<ViewState> mutableLiveData = new MutableLiveData<>();
        this._viewState = mutableLiveData;
        this.viewState = mutableLiveData;
        SingleLiveEvent<NavigationEvent> singleLiveEvent = new SingleLiveEvent<>();
        this._navigationEvent = singleLiveEvent;
        this.navigationEvent = singleLiveEvent;
        this.updateSource = UpdateSource.ONBOARDING;
        this.firmwareUpdateListener = new FirmwareUpdateListener() { // from class: media.tiger.tigerbox.ui.onboarding.step3.OnboardingUpdateViewModel$firmwareUpdateListener$1

            /* compiled from: OnboardingUpdateViewModel.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FirmwareUpdateService.State.values().length];
                    iArr[FirmwareUpdateService.State.BeginCheckForUpdate.ordinal()] = 1;
                    iArr[FirmwareUpdateService.State.NoUpdateRequired.ordinal()] = 2;
                    iArr[FirmwareUpdateService.State.CheckForUpdateFailed.ordinal()] = 3;
                    iArr[FirmwareUpdateService.State.CheckForUpdateSuccessInsufficientBatteryError.ordinal()] = 4;
                    iArr[FirmwareUpdateService.State.CheckForUpdateSuccess.ordinal()] = 5;
                    iArr[FirmwareUpdateService.State.BeginDownloadingFirmware.ordinal()] = 6;
                    iArr[FirmwareUpdateService.State.DownloadingFirmwareProgressed.ordinal()] = 7;
                    iArr[FirmwareUpdateService.State.DecryptingFirmwareProgressed.ordinal()] = 8;
                    iArr[FirmwareUpdateService.State.DownloadingFirmwareFailed.ordinal()] = 9;
                    iArr[FirmwareUpdateService.State.DownloadingFirmwareSuccess.ordinal()] = 10;
                    iArr[FirmwareUpdateService.State.BeginInstallingFirmware.ordinal()] = 11;
                    iArr[FirmwareUpdateService.State.InstallingFirmwareDone.ordinal()] = 12;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // media.tiger.tigerbox.services.interfaces.FirmwareUpdateListener
            public void firmwareUpdateStateHasChanged(FirmwareUpdateService.State state) {
                MutableLiveData mutableLiveData2;
                FirmwareUpdateService firmwareUpdateService2;
                FirmwareUpdateService firmwareUpdateService3;
                Intrinsics.checkNotNullParameter(state, "state");
                switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
                    case 1:
                        mutableLiveData2 = OnboardingUpdateViewModel.this._viewState;
                        mutableLiveData2.postValue(OnboardingUpdateViewModel.ViewState.CheckingForUpdate.INSTANCE);
                        return;
                    case 2:
                        OnboardingUpdateViewModel.this.noUpdateRequired();
                        return;
                    case 3:
                        OnboardingUpdateViewModel.this.noUpdateRequired();
                        return;
                    case 4:
                        OnboardingUpdateViewModel.this.readyToUpdateBatteryError();
                        return;
                    case 5:
                        OnboardingUpdateViewModel.this.readyToUpdate();
                        return;
                    case 6:
                    case 7:
                        OnboardingUpdateViewModel onboardingUpdateViewModel = OnboardingUpdateViewModel.this;
                        FirmwareUpdateStep firmwareUpdateStep = FirmwareUpdateStep.DOWNLOAD_FIRMWARE;
                        firmwareUpdateService2 = OnboardingUpdateViewModel.this.firmwareUpdateService;
                        onboardingUpdateViewModel.postStepProgress(firmwareUpdateStep, firmwareUpdateService2.getProgressPercentage());
                        return;
                    case 8:
                        OnboardingUpdateViewModel onboardingUpdateViewModel2 = OnboardingUpdateViewModel.this;
                        FirmwareUpdateStep firmwareUpdateStep2 = FirmwareUpdateStep.FIRMWARE_DECRYPT;
                        firmwareUpdateService3 = OnboardingUpdateViewModel.this.firmwareUpdateService;
                        onboardingUpdateViewModel2.postStepProgress(firmwareUpdateStep2, firmwareUpdateService3.getProgressPercentage());
                        return;
                    case 9:
                        OnboardingUpdateViewModel.this.showError();
                        return;
                    case 10:
                        OnboardingUpdateViewModel.this.readyToInstall();
                        return;
                    case 11:
                    case 12:
                        OnboardingUpdateViewModel.this.postStepProgress(FirmwareUpdateStep.COMPLETE, 100);
                        return;
                    default:
                        return;
                }
            }
        };
        this.batteryChangesListener = new BatteryChangesListener() { // from class: media.tiger.tigerbox.ui.onboarding.step3.OnboardingUpdateViewModel$batteryChangesListener$1
            @Override // media.tiger.tigerbox.services.interfaces.BatteryChangesListener
            public void onCablePluggedIn() {
            }

            @Override // media.tiger.tigerbox.services.interfaces.BatteryChangesListener
            public void onStatusChanged(BatterySummary batterySummary) {
                FirmwareUpdateService firmwareUpdateService2;
                MutableLiveData mutableLiveData2;
                BatteryService batteryService2;
                MutableLiveData mutableLiveData3;
                Intrinsics.checkNotNullParameter(batterySummary, "batterySummary");
                firmwareUpdateService2 = OnboardingUpdateViewModel.this.firmwareUpdateService;
                if (firmwareUpdateService2.getHasEnoughBattery()) {
                    batteryService2 = OnboardingUpdateViewModel.this.batteryService;
                    batteryService2.unsubscribeFromBatteryChanges(this);
                    mutableLiveData3 = OnboardingUpdateViewModel.this._viewState;
                    mutableLiveData3.postValue(new OnboardingUpdateViewModel.ViewState.AllowUpdate(OnboardingUpdateViewModel.this.isCancellable()));
                    return;
                }
                mutableLiveData2 = OnboardingUpdateViewModel.this._viewState;
                mutableLiveData2.postValue(new OnboardingUpdateViewModel.ViewState.BatteryInsufficient((int) batterySummary.getBatteryPercent(), batterySummary.isCharging(), OnboardingUpdateViewModel.this.isCancellable()));
            }
        };
    }

    public final LiveData<ViewState> getViewState() {
        return this.viewState;
    }

    public final LiveData<NavigationEvent> getNavigationEvent() {
        return this.navigationEvent;
    }

    public final boolean isCancellable() {
        return this.updateSource == UpdateSource.SETTINGS;
    }

    public final boolean isForced() {
        return this.firmwareUpdateService.isForced();
    }

    public final void viewPrepared(UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        this.updateSource = updateSource;
        if (this.updateFailed) {
            if (updateSource == UpdateSource.ONBOARDING) {
                this._navigationEvent.postValue(NavigationEvent.ShowLoginScreen.INSTANCE);
            } else if (this.errorShown) {
                this._navigationEvent.postValue(NavigationEvent.Close.INSTANCE);
            } else {
                this.errorShown = true;
                showError();
            }
        } else if (this.updateStarted) {
            this._viewState.postValue(ViewState.ShowProgress.INSTANCE);
        } else {
            this.firmwareUpdateService.registerFirmwareUpdateListener(this.firmwareUpdateListener);
            this.firmwareUpdateService.checkForUpdate(FirmwareUpdateService.CheckReason.MANUAL);
        }
    }

    public final void startUpdate() {
        ReleaseInformation.Release latestValidRelease = this.firmwareUpdateService.getLatestValidRelease();
        if (latestValidRelease != null) {
            this.updateStarted = true;
            this.firmwareUpdateService.downloadUpdate(latestValidRelease);
        }
    }

    public final void reset() {
        this.firmwareUpdateService.unregisterFirmwareUpdateListener(this.firmwareUpdateListener);
        this.errorShown = false;
        this.updateFailed = false;
        this.updateStarted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void noUpdateRequired() {
        if (this.updateSource == UpdateSource.SETTINGS) {
            this._viewState.postValue(ViewState.NoUpdate.INSTANCE);
        } else {
            this._navigationEvent.postValue(NavigationEvent.ShowLoginScreen.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readyToUpdate() {
        this._viewState.postValue(new ViewState.AllowUpdate(isCancellable()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readyToUpdateBatteryError() {
        this._viewState.postValue(new ViewState.BatteryInsufficient((int) this.batteryService.getBatteryPercent(), this.batteryService.isCharging(), isCancellable()));
        this.batteryService.subscribeToBatteryChanges(this.batteryChangesListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readyToInstall() {
        ReleaseInformation.Release latestValidRelease = this.firmwareUpdateService.getLatestValidRelease();
        if (latestValidRelease != null) {
            this.firmwareUpdateService.installUpdate(latestValidRelease);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postStepProgress(FirmwareUpdateStep firmwareUpdateStep, int i) {
        this._viewState.postValue(new ViewState.ShowUpdateProgress(firmwareUpdateStep, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        this.errorShown = true;
        this.updateFailed = true;
        this._navigationEvent.postValue(NavigationEvent.ShowError.INSTANCE);
    }

    /* compiled from: OnboardingUpdateViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState;", "", "()V", "AllowUpdate", "BatteryInsufficient", "CheckingForUpdate", "NoUpdate", "ShowProgress", "ShowUpdateProgress", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$BatteryInsufficient;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$AllowUpdate;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$ShowUpdateProgress;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$ShowProgress;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$CheckingForUpdate;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$NoUpdate;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class ViewState {
        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$BatteryInsufficient;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState;", "percent", "", "isCharging", "", "isCancellable", "(IZZ)V", "()Z", "getPercent", "()I", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BatteryInsufficient extends ViewState {
            private final boolean isCancellable;
            private final boolean isCharging;
            private final int percent;

            public BatteryInsufficient(int i, boolean z, boolean z2) {
                super(null);
                this.percent = i;
                this.isCharging = z;
                this.isCancellable = z2;
            }

            public final int getPercent() {
                return this.percent;
            }

            public final boolean isCancellable() {
                return this.isCancellable;
            }

            public final boolean isCharging() {
                return this.isCharging;
            }
        }

        private ViewState() {
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$AllowUpdate;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState;", "isCancellable", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class AllowUpdate extends ViewState {
            private final boolean isCancellable;

            public static /* synthetic */ AllowUpdate copy$default(AllowUpdate allowUpdate, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = allowUpdate.isCancellable;
                }
                return allowUpdate.copy(z);
            }

            public final boolean component1() {
                return this.isCancellable;
            }

            public final AllowUpdate copy(boolean z) {
                return new AllowUpdate(z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AllowUpdate) && this.isCancellable == ((AllowUpdate) obj).isCancellable;
            }

            public int hashCode() {
                boolean z = this.isCancellable;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                return "AllowUpdate(isCancellable=" + this.isCancellable + ')';
            }

            public AllowUpdate(boolean z) {
                super(null);
                this.isCancellable = z;
            }

            public final boolean isCancellable() {
                return this.isCancellable;
            }
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$ShowUpdateProgress;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState;", "updateStep", "Lmedia/tiger/tigerbox/services/interfaces/FirmwareUpdateStep;", "percent", "", "(Lmedia/tiger/tigerbox/services/interfaces/FirmwareUpdateStep;I)V", "getPercent", "()I", "getUpdateStep", "()Lmedia/tiger/tigerbox/services/interfaces/FirmwareUpdateStep;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ShowUpdateProgress extends ViewState {
            private final int percent;
            private final FirmwareUpdateStep updateStep;

            public static /* synthetic */ ShowUpdateProgress copy$default(ShowUpdateProgress showUpdateProgress, FirmwareUpdateStep firmwareUpdateStep, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    firmwareUpdateStep = showUpdateProgress.updateStep;
                }
                if ((i2 & 2) != 0) {
                    i = showUpdateProgress.percent;
                }
                return showUpdateProgress.copy(firmwareUpdateStep, i);
            }

            public final FirmwareUpdateStep component1() {
                return this.updateStep;
            }

            public final int component2() {
                return this.percent;
            }

            public final ShowUpdateProgress copy(FirmwareUpdateStep updateStep, int i) {
                Intrinsics.checkNotNullParameter(updateStep, "updateStep");
                return new ShowUpdateProgress(updateStep, i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ShowUpdateProgress) {
                    ShowUpdateProgress showUpdateProgress = (ShowUpdateProgress) obj;
                    return this.updateStep == showUpdateProgress.updateStep && this.percent == showUpdateProgress.percent;
                }
                return false;
            }

            public int hashCode() {
                return (this.updateStep.hashCode() * 31) + this.percent;
            }

            public String toString() {
                return "ShowUpdateProgress(updateStep=" + this.updateStep + ", percent=" + this.percent + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowUpdateProgress(FirmwareUpdateStep updateStep, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(updateStep, "updateStep");
                this.updateStep = updateStep;
                this.percent = i;
            }

            public final int getPercent() {
                return this.percent;
            }

            public final FirmwareUpdateStep getUpdateStep() {
                return this.updateStep;
            }
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$ShowProgress;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState;", "()V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ShowProgress extends ViewState {
            public static final ShowProgress INSTANCE = new ShowProgress();

            private ShowProgress() {
                super(null);
            }
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$CheckingForUpdate;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState;", "()V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CheckingForUpdate extends ViewState {
            public static final CheckingForUpdate INSTANCE = new CheckingForUpdate();

            private CheckingForUpdate() {
                super(null);
            }
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState$NoUpdate;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$ViewState;", "()V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NoUpdate extends ViewState {
            public static final NoUpdate INSTANCE = new NoUpdate();

            private NoUpdate() {
                super(null);
            }
        }
    }

    /* compiled from: OnboardingUpdateViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent;", "", "()V", "Close", "ShowError", "ShowLoginScreen", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent$ShowLoginScreen;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent$ShowError;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent$Close;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class NavigationEvent {
        public /* synthetic */ NavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent$ShowLoginScreen;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent;", "()V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ShowLoginScreen extends NavigationEvent {
            public static final ShowLoginScreen INSTANCE = new ShowLoginScreen();

            private ShowLoginScreen() {
                super(null);
            }
        }

        private NavigationEvent() {
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent$ShowError;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent;", "()V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ShowError extends NavigationEvent {
            public static final ShowError INSTANCE = new ShowError();

            private ShowError() {
                super(null);
            }
        }

        /* compiled from: OnboardingUpdateViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent$Close;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/OnboardingUpdateViewModel$NavigationEvent;", "()V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Close extends NavigationEvent {
            public static final Close INSTANCE = new Close();

            private Close() {
                super(null);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingUpdateViewModel(CoroutineScope coroutineScope, FirmwareUpdateService firmwareUpdateService, BatteryService batteryService) {
        this(firmwareUpdateService, batteryService);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(firmwareUpdateService, "firmwareUpdateService");
        Intrinsics.checkNotNullParameter(batteryService, "batteryService");
        this.coroutineScope = coroutineScope;
    }
}
