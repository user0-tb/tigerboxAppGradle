package media.tiger.tigerbox.ui.main.mediaplayer;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.MaincontentNavGraphDirections;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.model.domain.ProductDomain;

/* compiled from: MediaPlayerFragmentDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/mediaplayer/MediaPlayerFragmentDirections;", "", "()V", "ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList", "ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MediaPlayerFragmentDirections {
    public static final Companion Companion = new Companion(null);

    /* compiled from: MediaPlayerFragmentDirections.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/mediaplayer/MediaPlayerFragmentDirections$ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList;", "Landroidx/navigation/NavDirections;", "productDomain", "Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "(Lmedia/tiger/tigerbox/model/domain/ProductDomain;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getProductDomain", "()Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList implements NavDirections {
        private final int actionId;
        private final ProductDomain productDomain;

        public static /* synthetic */ ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList copy$default(ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList actionMainContentMediaPlayerToMainContentMediaPlayerChapterList, ProductDomain productDomain, int i, Object obj) {
            if ((i & 1) != 0) {
                productDomain = actionMainContentMediaPlayerToMainContentMediaPlayerChapterList.productDomain;
            }
            return actionMainContentMediaPlayerToMainContentMediaPlayerChapterList.copy(productDomain);
        }

        public final ProductDomain component1() {
            return this.productDomain;
        }

        public final ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList copy(ProductDomain productDomain) {
            Intrinsics.checkNotNullParameter(productDomain, "productDomain");
            return new ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList(productDomain);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList) && Intrinsics.areEqual(this.productDomain, ((ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList) obj).productDomain);
        }

        public int hashCode() {
            return this.productDomain.hashCode();
        }

        public String toString() {
            return "ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList(productDomain=" + this.productDomain + ')';
        }

        public ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList(ProductDomain productDomain) {
            Intrinsics.checkNotNullParameter(productDomain, "productDomain");
            this.productDomain = productDomain;
            this.actionId = R.id.action_mainContentMediaPlayer_to_mainContentMediaPlayerChapterList;
        }

        public final ProductDomain getProductDomain() {
            return this.productDomain;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ProductDomain.class)) {
                bundle.putParcelable("productDomain", (Parcelable) this.productDomain);
            } else if (Serializable.class.isAssignableFrom(ProductDomain.class)) {
                bundle.putSerializable("productDomain", this.productDomain);
            } else {
                throw new UnsupportedOperationException(ProductDomain.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }
    }

    private MediaPlayerFragmentDirections() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaPlayerFragmentDirections.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/mediaplayer/MediaPlayerFragmentDirections$ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment;", "Landroidx/navigation/NavDirections;", "imageUrl", "", "(Ljava/lang/String;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getImageUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment implements NavDirections {
        private final int actionId;
        private final String imageUrl;

        public ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment() {
            this(null, 1, null);
        }

        public static /* synthetic */ ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment copy$default(ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment actionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment.imageUrl;
            }
            return actionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment.copy(str);
        }

        public final String component1() {
            return this.imageUrl;
        }

        public final ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment copy(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment(imageUrl);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment) && Intrinsics.areEqual(this.imageUrl, ((ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment) obj).imageUrl);
        }

        public int hashCode() {
            return this.imageUrl.hashCode();
        }

        public String toString() {
            return "ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment(imageUrl=" + this.imageUrl + ')';
        }

        public ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.actionId = R.id.action_mainContentMediaPlayer_to_mediaPlayerFullscreenCoverFragment;
        }

        public /* synthetic */ ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "\"\"" : str);
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("imageUrl", this.imageUrl);
            return bundle;
        }
    }

    /* compiled from: MediaPlayerFragmentDirections.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/mediaplayer/MediaPlayerFragmentDirections$Companion;", "", "()V", "actionMainContentMediaPlayerToMainContentMediaPlayerChapterList", "Landroidx/navigation/NavDirections;", "productDomain", "Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "actionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment", "imageUrl", "", "actionToMainContentProductList", "actionToMediaPlayer", "actionToMultiProductCard", "actionToOfflineMode", "actionToParentalGate", "actionToParentalSettings", "actionToShowProfilePicture", "actionToUserProfilesSwitching", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavDirections actionMainContentMediaPlayerToMainContentMediaPlayerChapterList(ProductDomain productDomain) {
            Intrinsics.checkNotNullParameter(productDomain, "productDomain");
            return new ActionMainContentMediaPlayerToMainContentMediaPlayerChapterList(productDomain);
        }

        public static /* synthetic */ NavDirections actionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "\"\"";
            }
            return companion.actionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment(str);
        }

        public final NavDirections actionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new ActionMainContentMediaPlayerToMediaPlayerFullscreenCoverFragment(imageUrl);
        }

        public final NavDirections actionToParentalGate() {
            return MaincontentNavGraphDirections.Companion.actionToParentalGate();
        }

        public final NavDirections actionToParentalSettings() {
            return MaincontentNavGraphDirections.Companion.actionToParentalSettings();
        }

        public final NavDirections actionToMediaPlayer() {
            return MaincontentNavGraphDirections.Companion.actionToMediaPlayer();
        }

        public final NavDirections actionToUserProfilesSwitching() {
            return MaincontentNavGraphDirections.Companion.actionToUserProfilesSwitching();
        }

        public final NavDirections actionToShowProfilePicture() {
            return MaincontentNavGraphDirections.Companion.actionToShowProfilePicture();
        }

        public final NavDirections actionToOfflineMode() {
            return MaincontentNavGraphDirections.Companion.actionToOfflineMode();
        }

        public final NavDirections actionToMultiProductCard() {
            return MaincontentNavGraphDirections.Companion.actionToMultiProductCard();
        }

        public final NavDirections actionToMainContentProductList() {
            return MaincontentNavGraphDirections.Companion.actionToMainContentProductList();
        }
    }
}
