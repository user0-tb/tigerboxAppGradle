package com.google.android.exoplayer2.text;

import java.util.List;

/* loaded from: classes.dex */
public interface TextOutput {

    /* renamed from: com.google.android.exoplayer2.text.TextOutput$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        @Deprecated
        public static void $default$onCues(TextOutput textOutput, List list) {
        }
    }

    void onCues(CueGroup cueGroup);

    @Deprecated
    void onCues(List<Cue> list);
}
