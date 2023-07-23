package media.tiger.tigerbox.ui.main.multiproductcard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.databinding.FragmentMainContentSeeMoreProductsBinding;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.model.domain.ProductDomain;
import media.tiger.tigerbox.services.interfaces.TigerCardDomain;
import media.tiger.tigerbox.ui.main.seemoreproducts.ProductListItem;
import media.tiger.tigerbox.ui.main.seemoreproducts.SeeMoreListAdapter;

/* compiled from: MultiProductCardFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\"H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/multiproductcard/MultiProductCardFragment;", "Lmedia/tiger/tigerbox/ui/main/maincontent/ProductContentFragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentMainContentSeeMoreProductsBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentMainContentSeeMoreProductsBinding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentMainContentSeeMoreProductsBinding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "multiProductCardListAdapter", "Lmedia/tiger/tigerbox/ui/main/seemoreproducts/SeeMoreListAdapter;", "onBannerItemClick", "", "rowId", "", "ordinal", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onProductItemClick", "product", "Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "onViewCreated", "view", "supportsCardsMode", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class MultiProductCardFragment extends Hilt_MultiProductCardFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MultiProductCardFragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentMainContentSeeMoreProductsBinding;", 0))};
    private final AutoClearedValue binding$delegate = AutoClearedValueKt.autoCleared(this);
    private SeeMoreListAdapter multiProductCardListAdapter;

    @Override // media.tiger.tigerbox.ui.main.maincontent.OnItemClickListener
    public void onBannerItemClick(int i, int i2) {
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.ProductContentFragment
    public boolean supportsCardsMode() {
        return true;
    }

    private final FragmentMainContentSeeMoreProductsBinding getBinding() {
        return (FragmentMainContentSeeMoreProductsBinding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentMainContentSeeMoreProductsBinding fragmentMainContentSeeMoreProductsBinding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentMainContentSeeMoreProductsBinding);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentMainContentSeeMoreProductsBinding inflate = FragmentMainContentSeeMoreProductsBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        this.multiProductCardListAdapter = new SeeMoreListAdapter(this, this, null, 4, null);
        RecyclerView recyclerView = getBinding().seeMoreRecyclerView;
        SeeMoreListAdapter seeMoreListAdapter = this.multiProductCardListAdapter;
        if (seeMoreListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("multiProductCardListAdapter");
            seeMoreListAdapter = null;
        }
        recyclerView.setAdapter(seeMoreListAdapter);
        recyclerView.setHasFixedSize(true);
        getProductContentViewModel().clearProductList();
        getProductContentViewModel().getProductList().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.main.multiproductcard.MultiProductCardFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MultiProductCardFragment.m1911onCreateView$lambda2(MultiProductCardFragment.this, (List) obj);
            }
        });
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m1911onCreateView$lambda2(MultiProductCardFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SeeMoreListAdapter seeMoreListAdapter = this$0.multiProductCardListAdapter;
        if (seeMoreListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("multiProductCardListAdapter");
            seeMoreListAdapter = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        List<ProductDomain> list = it;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProductDomain productDomain : list) {
            arrayList.add(new ProductListItem.ProductItem(productDomain));
        }
        seeMoreListAdapter.submitList(arrayList);
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.ProductContentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TigerCardDomain.MultiTigercardVariantDomain multiTigercardVariant;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        showHeaderCloseButton();
        TigerCardDomain multiProductTigerCard = getProductContentViewModel().getMultiProductTigerCard();
        String name = (multiProductTigerCard == null || (multiTigercardVariant = multiProductTigerCard.getMultiTigercardVariant()) == null) ? null : multiTigercardVariant.getName();
        if (name == null) {
            name = "";
        }
        changeHeaderTitle(name);
        showMultiProductListInCardsMode();
        getProductContentViewModel().showMultiProductList();
        getProductContentViewModel().getFailure().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.main.multiproductcard.MultiProductCardFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MultiProductCardFragment.m1912onViewCreated$lambda3(MultiProductCardFragment.this, (Failure) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m1912onViewCreated$lambda3(MultiProductCardFragment this$0, Failure failure) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(failure, "failure");
        this$0.handleFailure(failure);
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.ProductContentFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        hideMultiProductListInCardsMode();
        super.onDestroyView();
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.OnItemClickListener
    public void onProductItemClick(ProductDomain product, int i) {
        Intrinsics.checkNotNullParameter(product, "product");
        getProductContentViewModel().playProduct(product, -1);
    }
}
