package media.tiger.tigerbox.services.implementations.receiver;

import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import media.tiger.tigerbox.infrastructure.di.InjectableBroadcastReceiver;

/* loaded from: classes3.dex */
public abstract class Hilt_NfcBroadcastReceiver extends InjectableBroadcastReceiver {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();

    @Override // media.tiger.tigerbox.infrastructure.di.InjectableBroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject(context);
        super.onReceive(context, intent);
    }

    protected void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            if (!this.injected) {
                ((NfcBroadcastReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectNfcBroadcastReceiver((NfcBroadcastReceiver) UnsafeCasts.unsafeCast(this));
                this.injected = true;
            }
        }
    }
}
