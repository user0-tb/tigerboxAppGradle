package media.tiger.tigerbox.services.implementations.audioPlayer;

import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.utils.FileUtilsKt;
import timber.log.Timber;

/* compiled from: AudioUrlEncodingDataSource.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/audioPlayer/AudioUrlEncodingDataSource;", "Lcom/google/android/exoplayer2/upstream/DataSource;", "defaultDataSource", "(Lcom/google/android/exoplayer2/upstream/DataSource;)V", "addTransferListener", "", "transferListener", "Lcom/google/android/exoplayer2/upstream/TransferListener;", "close", "getUri", "Landroid/net/Uri;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "dataSpecORIG", "Lcom/google/android/exoplayer2/upstream/DataSpec;", "read", "", "buffer", "", TypedValues.CycleType.S_WAVE_OFFSET, "readLength", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioUrlEncodingDataSource implements DataSource {
    private final DataSource defaultDataSource;

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public /* synthetic */ Map getResponseHeaders() {
        Map emptyMap;
        emptyMap = Collections.emptyMap();
        return emptyMap;
    }

    public AudioUrlEncodingDataSource(DataSource dataSource) {
        this.defaultDataSource = dataSource;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(DataSpec dataSpecORIG) throws IOException {
        Intrinsics.checkNotNullParameter(dataSpecORIG, "dataSpecORIG");
        try {
            String uri = dataSpecORIG.uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "dataSpecORIG.uri.toString()");
            String lastPathEncoded = URLEncoder.encode(URLDecoder.decode(FileUtilsKt.lastPathComponent(uri), "utf-8"), "utf-8");
            String removingLastPathComponent = FileUtilsKt.removingLastPathComponent(uri);
            Intrinsics.checkNotNullExpressionValue(lastPathEncoded, "lastPathEncoded");
            String appendingPathComponent = FileUtilsKt.appendingPathComponent(removingLastPathComponent, lastPathEncoded);
            DataSpec.Builder builder = new DataSpec.Builder();
            builder.setUri(Uri.parse(appendingPathComponent));
            DataSpec build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "builderSpec.build()");
            DataSource dataSource = this.defaultDataSource;
            Intrinsics.checkNotNull(dataSource);
            return dataSource.open(build);
        } catch (Exception e) {
            Timber.Forest forest = Timber.Forest;
            forest.e("AudioUrlEncodingDataSource: Exception " + e, new Object[0]);
            return 0L;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] buffer, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        DataSource dataSource = this.defaultDataSource;
        Intrinsics.checkNotNull(dataSource);
        return dataSource.read(buffer, i, i2);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        DataSource dataSource = this.defaultDataSource;
        Intrinsics.checkNotNull(dataSource);
        return dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws IOException {
        DataSource dataSource = this.defaultDataSource;
        Intrinsics.checkNotNull(dataSource);
        dataSource.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        DataSource dataSource = this.defaultDataSource;
        Intrinsics.checkNotNull(dataSource);
        dataSource.addTransferListener(transferListener);
    }
}
