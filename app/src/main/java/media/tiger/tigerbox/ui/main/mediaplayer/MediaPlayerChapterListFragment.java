package media.tiger.tigerbox.ui.main.mediaplayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.databinding.FragmentMediaPlayerChapterListBinding;
import media.tiger.tigerbox.databinding.IncludeDialogHeaderBarBinding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.model.domain.ChapterItem;
import media.tiger.tigerbox.ui.binding.BindingClickListener;
import media.tiger.tigerbox.ui.common.DialogViewModel;
import timber.log.Timber;

/* compiled from: MediaPlayerChapterListFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lmedia/tiger/tigerbox/ui/main/mediaplayer/MediaPlayerChapterListFragment;", "Lmedia/tiger/tigerbox/ui/common/FullScreenFragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentMediaPlayerChapterListBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentMediaPlayerChapterListBinding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentMediaPlayerChapterListBinding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "chapterListAdapter", "Lmedia/tiger/tigerbox/ui/main/mediaplayer/ChapterListAdapter;", "chapterListViewModel", "Lmedia/tiger/tigerbox/ui/main/mediaplayer/ChapterListViewModel;", "getChapterListViewModel", "()Lmedia/tiger/tigerbox/ui/main/mediaplayer/ChapterListViewModel;", "chapterListViewModel$delegate", "Lkotlin/Lazy;", "getHeaderBinding", "Lmedia/tiger/tigerbox/databinding/IncludeDialogHeaderBarBinding;", "getViewModel", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class MediaPlayerChapterListFragment extends Hilt_MediaPlayerChapterListFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MediaPlayerChapterListFragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentMediaPlayerChapterListBinding;", 0))};
    private final AutoClearedValue binding$delegate;
    private ChapterListAdapter chapterListAdapter;
    private final Lazy chapterListViewModel$delegate;

    public MediaPlayerChapterListFragment() {
        final MediaPlayerChapterListFragment mediaPlayerChapterListFragment = this;
        this.binding$delegate = AutoClearedValueKt.autoCleared(mediaPlayerChapterListFragment);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: media.tiger.tigerbox.ui.main.mediaplayer.MediaPlayerChapterListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.chapterListViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(mediaPlayerChapterListFragment, Reflection.getOrCreateKotlinClass(ChapterListViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.main.mediaplayer.MediaPlayerChapterListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ((ViewModelStoreOwner) Function0.this.invoke()).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.main.mediaplayer.MediaPlayerChapterListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Object invoke = Function0.this.invoke();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = invoke instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) invoke : null;
                ViewModelProvider.Factory defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = mediaPlayerChapterListFragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final FragmentMediaPlayerChapterListBinding getBinding() {
        return (FragmentMediaPlayerChapterListBinding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentMediaPlayerChapterListBinding fragmentMediaPlayerChapterListBinding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentMediaPlayerChapterListBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChapterListViewModel getChapterListViewModel() {
        return (ChapterListViewModel) this.chapterListViewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentMediaPlayerChapterListBinding inflate = FragmentMediaPlayerChapterListBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        getBinding().mediaPlayerChapterListTitle.setText(getChapterListViewModel().getChapterTitle());
        this.chapterListAdapter = new ChapterListAdapter(new BindingClickListener<ChapterItem>() { // from class: media.tiger.tigerbox.ui.main.mediaplayer.MediaPlayerChapterListFragment$onCreateView$1
            @Override // media.tiger.tigerbox.ui.binding.BindingClickListener
            public void onClick(ChapterItem data) {
                ChapterListViewModel chapterListViewModel;
                Intrinsics.checkNotNullParameter(data, "data");
                chapterListViewModel = MediaPlayerChapterListFragment.this.getChapterListViewModel();
                chapterListViewModel.onClick(data);
                MediaPlayerChapterListFragment.this.closeSafely();
            }
        });
        RecyclerView recyclerView = getBinding().mediaPlayerChapterListRecyclerView;
        ChapterListAdapter chapterListAdapter = this.chapterListAdapter;
        if (chapterListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chapterListAdapter");
            chapterListAdapter = null;
        }
        recyclerView.setAdapter(chapterListAdapter);
        getChapterListViewModel().getChapterList().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.main.mediaplayer.MediaPlayerChapterListFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MediaPlayerChapterListFragment.m1892onCreateView$lambda1(MediaPlayerChapterListFragment.this, (List) obj);
            }
        });
        getChapterListViewModel().updateData();
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m1892onCreateView$lambda1(MediaPlayerChapterListFragment this$0, List chapterList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ChapterListAdapter chapterListAdapter = this$0.chapterListAdapter;
        if (chapterListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chapterListAdapter");
            chapterListAdapter = null;
        }
        chapterListAdapter.submitList(chapterList);
        try {
            Intrinsics.checkNotNullExpressionValue(chapterList, "chapterList");
            for (Object obj : chapterList) {
                if (((ChapterItem) obj).isSelected()) {
                    this$0.getBinding().mediaPlayerChapterListRecyclerView.scrollToPosition(chapterList.indexOf((ChapterItem) obj));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException e) {
            Timber.Forest forest = Timber.Forest;
            forest.e("ChapterListFragment: " + e.getMessage(), new Object[0]);
        }
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment
    /* renamed from: getViewModel */
    public DialogViewModel mo1841getViewModel() {
        return getChapterListViewModel();
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment
    public IncludeDialogHeaderBarBinding getHeaderBinding() {
        IncludeDialogHeaderBarBinding includeDialogHeaderBarBinding = getBinding().fragmentHeaderBar;
        Intrinsics.checkNotNullExpressionValue(includeDialogHeaderBarBinding, "binding.fragmentHeaderBar");
        return includeDialogHeaderBarBinding;
    }
}
