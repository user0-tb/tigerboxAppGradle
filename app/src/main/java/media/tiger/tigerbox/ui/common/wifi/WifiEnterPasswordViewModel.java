package media.tiger.tigerbox.ui.common.wifi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.interfaces.StorageService;
import media.tiger.tigerbox.ui.common.DialogViewModel;

/* compiled from: WifiEnterPasswordViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/ui/common/wifi/WifiEnterPasswordViewModel;", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "storageService", "Lmedia/tiger/tigerbox/services/interfaces/StorageService;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "(Lmedia/tiger/tigerbox/services/interfaces/StorageService;Lmedia/tiger/tigerbox/services/implementations/ButtonService;)V", "_password", "Landroidx/lifecycle/MutableLiveData;", "", "password", "Landroidx/lifecycle/LiveData;", "getPassword", "()Landroidx/lifecycle/LiveData;", "viewPrepared", "", "ssid", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WifiEnterPasswordViewModel extends DialogViewModel {
    private final MutableLiveData<String> _password;
    private final LiveData<String> password;
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public WifiEnterPasswordViewModel(StorageService storageService, ButtonService buttonService) {
        super(buttonService);
        Intrinsics.checkNotNullParameter(storageService, "storageService");
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        this.storageService = storageService;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this._password = mutableLiveData;
        this.password = mutableLiveData;
    }

    public final LiveData<String> getPassword() {
        return this.password;
    }

    public final void viewPrepared(String ssid) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        String findWifiPassword = this.storageService.findWifiPassword(ssid);
        if (findWifiPassword == null) {
            findWifiPassword = "";
        }
        this._password.postValue(findWifiPassword);
    }
}
