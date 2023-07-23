package media.tiger.tigerbox.infrastructure.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import media.tiger.tigerbox.infrastructure.exception.Failure;

/* compiled from: Failure.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/exception/MediaPlayerFailure;", "", "()V", "ProductAcquisitionAccessFailure", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MediaPlayerFailure {
    public /* synthetic */ MediaPlayerFailure(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Failure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/exception/MediaPlayerFailure$ProductAcquisitionAccessFailure;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure$FeatureFailure;", "()V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ProductAcquisitionAccessFailure extends Failure.FeatureFailure {
        public static final ProductAcquisitionAccessFailure INSTANCE = new ProductAcquisitionAccessFailure();

        private ProductAcquisitionAccessFailure() {
        }
    }

    private MediaPlayerFailure() {
    }
}
