package media.tiger.tigerbox.services.implementations.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class Hilt_WindowedLimitBroadcastReceiver extends BroadcastReceiver {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();
    private final boolean onReceiveBytecodeInjectionMarker = false;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject(context);
    }

    protected void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            if (!this.injected) {
                ((WindowedLimitBroadcastReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectWindowedLimitBroadcastReceiver((WindowedLimitBroadcastReceiver) UnsafeCasts.unsafeCast(this));
                this.injected = true;
            }
        }
    }
}
