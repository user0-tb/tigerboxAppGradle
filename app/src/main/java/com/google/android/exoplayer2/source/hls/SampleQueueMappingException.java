package com.google.android.exoplayer2.source.hls;

import java.io.IOException;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;

/* loaded from: classes.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + DownloadsManager.EXTENSION_SEPARATOR);
    }
}
