package media.tiger.tigerbox.ui.settings.sendLogs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.TigerBoxLogTree;
import media.tiger.tigerbox.WriteToFileExceptionHandler;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.ui.common.DialogViewModel;

/* compiled from: SendLogsInProgressViewModel.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0011R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/sendLogs/SendLogsInProgressViewModel;", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "writeToFileExceptionHandler", "Lmedia/tiger/tigerbox/WriteToFileExceptionHandler;", "boxLogTree", "Lmedia/tiger/tigerbox/TigerBoxLogTree;", "(Lmedia/tiger/tigerbox/services/implementations/ButtonService;Lmedia/tiger/tigerbox/WriteToFileExceptionHandler;Lmedia/tiger/tigerbox/TigerBoxLogTree;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lmedia/tiger/tigerbox/ui/settings/sendLogs/SendLogsInProgressViewModel$ViewState;", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "postViewState", "", "success", "", "sendLogs", "ViewState", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SendLogsInProgressViewModel extends DialogViewModel {
    private final MutableLiveData<ViewState> _viewState;
    private final TigerBoxLogTree boxLogTree;
    private final LiveData<ViewState> viewState;
    private final WriteToFileExceptionHandler writeToFileExceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SendLogsInProgressViewModel(ButtonService buttonService, WriteToFileExceptionHandler writeToFileExceptionHandler, TigerBoxLogTree boxLogTree) {
        super(buttonService);
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        Intrinsics.checkNotNullParameter(writeToFileExceptionHandler, "writeToFileExceptionHandler");
        Intrinsics.checkNotNullParameter(boxLogTree, "boxLogTree");
        this.writeToFileExceptionHandler = writeToFileExceptionHandler;
        this.boxLogTree = boxLogTree;
        MutableLiveData<ViewState> mutableLiveData = new MutableLiveData<>();
        this._viewState = mutableLiveData;
        this.viewState = mutableLiveData;
    }

    public final LiveData<ViewState> getViewState() {
        return this.viewState;
    }

    public final void sendLogs() {
        this.writeToFileExceptionHandler.uploadStackTraces(new Function0<Unit>() { // from class: media.tiger.tigerbox.ui.settings.sendLogs.SendLogsInProgressViewModel$sendLogs$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TigerBoxLogTree tigerBoxLogTree;
                tigerBoxLogTree = SendLogsInProgressViewModel.this.boxLogTree;
                final SendLogsInProgressViewModel sendLogsInProgressViewModel = SendLogsInProgressViewModel.this;
                tigerBoxLogTree.uploadLogs(new Function0<Unit>() { // from class: media.tiger.tigerbox.ui.settings.sendLogs.SendLogsInProgressViewModel$sendLogs$1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SendLogsInProgressViewModel.this.postViewState(true);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postViewState(boolean z) {
        this._viewState.postValue(new ViewState(z));
    }

    /* compiled from: SendLogsInProgressViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/sendLogs/SendLogsInProgressViewModel$ViewState;", "", "sendSuccess", "", "(Z)V", "getSendSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ViewState {
        private final boolean sendSuccess;

        public static /* synthetic */ ViewState copy$default(ViewState viewState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = viewState.sendSuccess;
            }
            return viewState.copy(z);
        }

        public final boolean component1() {
            return this.sendSuccess;
        }

        public final ViewState copy(boolean z) {
            return new ViewState(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.sendSuccess == ((ViewState) obj).sendSuccess;
        }

        public int hashCode() {
            boolean z = this.sendSuccess;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "ViewState(sendSuccess=" + this.sendSuccess + ')';
        }

        public ViewState(boolean z) {
            this.sendSuccess = z;
        }

        public final boolean getSendSuccess() {
            return this.sendSuccess;
        }
    }
}
