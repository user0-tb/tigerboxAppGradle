package media.tiger.tigerbox.usecase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: PostCrashLogsUseCase.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lmedia/tiger/tigerbox/usecase/CrashLogsUseCaseParameters;", "", "deviceCpuId", "", "deviceSerialNumber", "file", "Ljava/io/File;", "fileName", "fileRequestBody", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lokhttp3/RequestBody;)V", "getDeviceCpuId", "()Ljava/lang/String;", "deviceCpuIdRequestBody", "getDeviceCpuIdRequestBody", "()Lokhttp3/RequestBody;", "deviceCredentialRequestBody", "getDeviceCredentialRequestBody", "getDeviceSerialNumber", "getFile", "()Ljava/io/File;", "getFileName", "getFileRequestBody", "filesMultipartBodyParts", "", "Lokhttp3/MultipartBody$Part;", "getFilesMultipartBodyParts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CrashLogsUseCaseParameters {
    private final String deviceCpuId;
    private final String deviceSerialNumber;
    private final File file;
    private final String fileName;
    private final RequestBody fileRequestBody;

    public static /* synthetic */ CrashLogsUseCaseParameters copy$default(CrashLogsUseCaseParameters crashLogsUseCaseParameters, String str, String str2, File file, String str3, RequestBody requestBody, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crashLogsUseCaseParameters.deviceCpuId;
        }
        if ((i & 2) != 0) {
            str2 = crashLogsUseCaseParameters.deviceSerialNumber;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            file = crashLogsUseCaseParameters.file;
        }
        File file2 = file;
        if ((i & 8) != 0) {
            str3 = crashLogsUseCaseParameters.fileName;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            requestBody = crashLogsUseCaseParameters.fileRequestBody;
        }
        return crashLogsUseCaseParameters.copy(str, str4, file2, str5, requestBody);
    }

    public final String component1() {
        return this.deviceCpuId;
    }

    public final String component2() {
        return this.deviceSerialNumber;
    }

    public final File component3() {
        return this.file;
    }

    public final String component4() {
        return this.fileName;
    }

    public final RequestBody component5() {
        return this.fileRequestBody;
    }

    public final CrashLogsUseCaseParameters copy(String deviceCpuId, String deviceSerialNumber, File file, String fileName, RequestBody fileRequestBody) {
        Intrinsics.checkNotNullParameter(deviceCpuId, "deviceCpuId");
        Intrinsics.checkNotNullParameter(deviceSerialNumber, "deviceSerialNumber");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileRequestBody, "fileRequestBody");
        return new CrashLogsUseCaseParameters(deviceCpuId, deviceSerialNumber, file, fileName, fileRequestBody);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CrashLogsUseCaseParameters) {
            CrashLogsUseCaseParameters crashLogsUseCaseParameters = (CrashLogsUseCaseParameters) obj;
            return Intrinsics.areEqual(this.deviceCpuId, crashLogsUseCaseParameters.deviceCpuId) && Intrinsics.areEqual(this.deviceSerialNumber, crashLogsUseCaseParameters.deviceSerialNumber) && Intrinsics.areEqual(this.file, crashLogsUseCaseParameters.file) && Intrinsics.areEqual(this.fileName, crashLogsUseCaseParameters.fileName) && Intrinsics.areEqual(this.fileRequestBody, crashLogsUseCaseParameters.fileRequestBody);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.deviceCpuId.hashCode() * 31) + this.deviceSerialNumber.hashCode()) * 31) + this.file.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.fileRequestBody.hashCode();
    }

    public String toString() {
        return "CrashLogsUseCaseParameters(deviceCpuId=" + this.deviceCpuId + ", deviceSerialNumber=" + this.deviceSerialNumber + ", file=" + this.file + ", fileName=" + this.fileName + ", fileRequestBody=" + this.fileRequestBody + ')';
    }

    public CrashLogsUseCaseParameters(String deviceCpuId, String deviceSerialNumber, File file, String fileName, RequestBody fileRequestBody) {
        Intrinsics.checkNotNullParameter(deviceCpuId, "deviceCpuId");
        Intrinsics.checkNotNullParameter(deviceSerialNumber, "deviceSerialNumber");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileRequestBody, "fileRequestBody");
        this.deviceCpuId = deviceCpuId;
        this.deviceSerialNumber = deviceSerialNumber;
        this.file = file;
        this.fileName = fileName;
        this.fileRequestBody = fileRequestBody;
    }

    public final String getDeviceCpuId() {
        return this.deviceCpuId;
    }

    public final String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final RequestBody getFileRequestBody() {
        return this.fileRequestBody;
    }

    public final RequestBody getDeviceCpuIdRequestBody() {
        return RequestBody.Companion.create(this.deviceCpuId, MultipartBody.FORM);
    }

    public final RequestBody getDeviceCredentialRequestBody() {
        return RequestBody.Companion.create(this.deviceSerialNumber, MultipartBody.FORM);
    }

    public final List<MultipartBody.Part> getFilesMultipartBodyParts() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MultipartBody.Part.Companion.createFormData("logfile", this.fileName, this.fileRequestBody));
        return arrayList;
    }
}
