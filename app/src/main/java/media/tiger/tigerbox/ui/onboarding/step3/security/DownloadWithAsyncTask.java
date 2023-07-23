package media.tiger.tigerbox.ui.onboarding.step3.security;

import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: DownloadWithAsyncTask.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010\t\u001a\u00020\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000b\"\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0014J%\u0010\u0012\u001a\u00020\u00022\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u000b\"\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/security/DownloadWithAsyncTask;", "Landroid/os/AsyncTask;", "", "", "", "downloadInfo", "Lmedia/tiger/tigerbox/ui/onboarding/step3/security/DownloadWithAsyncTask$DownloadInfo;", "(Lmedia/tiger/tigerbox/ui/onboarding/step3/security/DownloadWithAsyncTask$DownloadInfo;)V", "previousPercent", "doInBackground", "params", "", "([Lkotlin/Unit;)Ljava/lang/Boolean;", "log", "text", "", "onPostExecute", "successful", "onProgressUpdate", "values", "([Ljava/lang/Double;)V", "DownloadInfo", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DownloadWithAsyncTask extends AsyncTask<Unit, Double, Boolean> {
    private final DownloadInfo downloadInfo;
    private double previousPercent;

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        onPostExecute(bool.booleanValue());
    }

    /* compiled from: DownloadWithAsyncTask.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BT\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J$\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0003Jb\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032#\b\u0002\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R,\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006$"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/security/DownloadWithAsyncTask$DownloadInfo;", "", "url", "", "saveLocation", "update", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "percent", "", "onFail", "Lkotlin/Function0;", "onSuccess", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnFail", "()Lkotlin/jvm/functions/Function0;", "getOnSuccess", "getSaveLocation", "()Ljava/lang/String;", "getUpdate", "()Lkotlin/jvm/functions/Function1;", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DownloadInfo {
        private final Function0<Unit> onFail;
        private final Function0<Unit> onSuccess;
        private final String saveLocation;
        private final Function1<Double, Unit> update;
        private final String url;

        public static /* synthetic */ DownloadInfo copy$default(DownloadInfo downloadInfo, String str, String str2, Function1 function1, Function0 function0, Function0 function02, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloadInfo.url;
            }
            if ((i & 2) != 0) {
                str2 = downloadInfo.saveLocation;
            }
            String str3 = str2;
            Function1<Double, Unit> function12 = function1;
            if ((i & 4) != 0) {
                function12 = downloadInfo.update;
            }
            Function1 function13 = function12;
            Function0<Unit> function03 = function0;
            if ((i & 8) != 0) {
                function03 = downloadInfo.onFail;
            }
            Function0 function04 = function03;
            Function0<Unit> function05 = function02;
            if ((i & 16) != 0) {
                function05 = downloadInfo.onSuccess;
            }
            return downloadInfo.copy(str, str3, function13, function04, function05);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.saveLocation;
        }

        public final Function1<Double, Unit> component3() {
            return this.update;
        }

        public final Function0<Unit> component4() {
            return this.onFail;
        }

        public final Function0<Unit> component5() {
            return this.onSuccess;
        }

        public final DownloadInfo copy(String url, String saveLocation, Function1<? super Double, Unit> update, Function0<Unit> onFail, Function0<Unit> onSuccess) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(saveLocation, "saveLocation");
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(onFail, "onFail");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            return new DownloadInfo(url, saveLocation, update, onFail, onSuccess);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DownloadInfo) {
                DownloadInfo downloadInfo = (DownloadInfo) obj;
                return Intrinsics.areEqual(this.url, downloadInfo.url) && Intrinsics.areEqual(this.saveLocation, downloadInfo.saveLocation) && Intrinsics.areEqual(this.update, downloadInfo.update) && Intrinsics.areEqual(this.onFail, downloadInfo.onFail) && Intrinsics.areEqual(this.onSuccess, downloadInfo.onSuccess);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.url.hashCode() * 31) + this.saveLocation.hashCode()) * 31) + this.update.hashCode()) * 31) + this.onFail.hashCode()) * 31) + this.onSuccess.hashCode();
        }

        public String toString() {
            return "DownloadInfo(url=" + this.url + ", saveLocation=" + this.saveLocation + ", update=" + this.update + ", onFail=" + this.onFail + ", onSuccess=" + this.onSuccess + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DownloadInfo(String url, String saveLocation, Function1<? super Double, Unit> update, Function0<Unit> onFail, Function0<Unit> onSuccess) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(saveLocation, "saveLocation");
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(onFail, "onFail");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            this.url = url;
            this.saveLocation = saveLocation;
            this.update = update;
            this.onFail = onFail;
            this.onSuccess = onSuccess;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getSaveLocation() {
            return this.saveLocation;
        }

        public final Function1<Double, Unit> getUpdate() {
            return this.update;
        }

        public final Function0<Unit> getOnFail() {
            return this.onFail;
        }

        public final Function0<Unit> getOnSuccess() {
            return this.onSuccess;
        }
    }

    public DownloadWithAsyncTask(DownloadInfo downloadInfo) {
        Intrinsics.checkNotNullParameter(downloadInfo, "downloadInfo");
        this.downloadInfo = downloadInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Boolean doInBackground(Unit... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z = true;
        try {
            this.previousPercent = 0.0d;
            URL url = new URL(this.downloadInfo.getUrl());
            URLConnection openConnection = url.openConnection();
            openConnection.connect();
            int contentLength = openConnection.getContentLength();
            log("Firmware Update: Length of file: " + contentLength);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(this.downloadInfo.getSaveLocation());
            byte[] bArr = new byte[1024];
            long j = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                j += read;
                publishProgress(Double.valueOf((j * 100.0d) / contentLength));
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            bufferedInputStream.close();
        } catch (Exception unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onProgressUpdate(Double... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        super.onProgressUpdate(Arrays.copyOf(values, values.length));
        Double d = values[0];
        double doubleValue = d != null ? d.doubleValue() : -1.0d;
        if (doubleValue >= 0.0d) {
            int i = (int) doubleValue;
            if (i % 5 == 0 && i > this.previousPercent) {
                this.previousPercent = doubleValue;
                log("Firmware Update: Download progress: " + doubleValue);
            }
            this.downloadInfo.getUpdate().invoke(Double.valueOf(doubleValue));
        }
    }

    protected void onPostExecute(boolean z) {
        log("Firmware Update: Download completed. Successful: [" + z + ']');
        if (z) {
            this.downloadInfo.getOnSuccess().invoke();
        } else {
            this.downloadInfo.getOnFail().invoke();
        }
    }

    private final void log(String str) {
        Timber.Forest.d(str, new Object[0]);
    }
}
