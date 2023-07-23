package com.google.crypto.tink.monitoring;

/* loaded from: classes3.dex */
public interface MonitoringClient {

    /* loaded from: classes3.dex */
    public interface Logger {
        void log(int keyId, long numBytesAsInput);

        void logFailure();
    }

    Logger createLogger(MonitoringKeysetInfo keysetInfo, String primitive, String api);
}
