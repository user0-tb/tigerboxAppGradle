package dagger.hilt.android;

/* loaded from: classes3.dex */
public interface ActivityRetainedLifecycle {

    /* loaded from: classes3.dex */
    public interface OnClearedListener {
        void onCleared();
    }

    void addOnClearedListener(OnClearedListener listener);

    void removeOnClearedListener(OnClearedListener listener);
}
