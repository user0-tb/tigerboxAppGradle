package media.tiger.tigerbox.ui.main.maincontent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.databinding.FragmentMainContentBinding;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.model.domain.ProductDomain;
import media.tiger.tigerbox.model.domain.ProductRowDomain;
import media.tiger.tigerbox.ui.binding.BindingClickListener;
import media.tiger.tigerbox.ui.common.InfoDialogFragment;
import media.tiger.tigerbox.ui.common.InfoDialogTypeResult;
import media.tiger.tigerbox.ui.common.ScrollStateHolder;
import media.tiger.tigerbox.ui.onboarding.OnboardingActivityKt;
import media.tiger.tigerbox.utils.ViewExtensionsKt;

/* compiled from: ProductListMainContentFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u000fH\u0016J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/maincontent/ProductListMainContentFragment;", "Lmedia/tiger/tigerbox/ui/main/maincontent/ProductContentFragment;", "Lmedia/tiger/tigerbox/ui/binding/BindingClickListener;", "", "()V", "_binding", "Lmedia/tiger/tigerbox/databinding/FragmentMainContentBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentMainContentBinding;", "outerProductListAdapter", "Lmedia/tiger/tigerbox/ui/main/maincontent/ProductRowListAdapter;", "scrollStateHolder", "Lmedia/tiger/tigerbox/ui/common/ScrollStateHolder;", "getContent", "", "navigateToSeeMoreProducts", "rowId", "ordinal", "onBannerItemClick", "onClick", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onProductItemClick", "product", "Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "onResume", "onViewCreated", "view", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ProductListMainContentFragment extends Hilt_ProductListMainContentFragment implements BindingClickListener<Integer> {
    private FragmentMainContentBinding _binding;
    private ProductRowListAdapter outerProductListAdapter;
    private ScrollStateHolder scrollStateHolder;

    @Override // media.tiger.tigerbox.ui.binding.BindingClickListener
    public /* bridge */ /* synthetic */ void onClick(Integer num) {
        onClick(num.intValue());
    }

    private final FragmentMainContentBinding getBinding() {
        FragmentMainContentBinding fragmentMainContentBinding = this._binding;
        Intrinsics.checkNotNull(fragmentMainContentBinding);
        return fragmentMainContentBinding;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.scrollStateHolder = new ScrollStateHolder();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentMainContentBinding.inflate(inflater, viewGroup, false);
        ProductListMainContentFragment productListMainContentFragment = this;
        ProductListMainContentFragment productListMainContentFragment2 = this;
        ProductListMainContentFragment productListMainContentFragment3 = this;
        ScrollStateHolder scrollStateHolder = this.scrollStateHolder;
        ProductRowListAdapter productRowListAdapter = null;
        if (scrollStateHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollStateHolder");
            scrollStateHolder = null;
        }
        this.outerProductListAdapter = new ProductRowListAdapter(productListMainContentFragment, productListMainContentFragment2, productListMainContentFragment3, scrollStateHolder);
        RecyclerView recyclerView = getBinding().mainContentOuterRecyclerView;
        ProductRowListAdapter productRowListAdapter2 = this.outerProductListAdapter;
        if (productRowListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outerProductListAdapter");
        } else {
            productRowListAdapter = productRowListAdapter2;
        }
        recyclerView.setAdapter(productRowListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        ViewExtensionsKt.enforceSingleScrollDirection(recyclerView);
        getProductContentViewModel().getMainContent().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.main.maincontent.ProductListMainContentFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ProductListMainContentFragment.m1868onCreateView$lambda1(ProductListMainContentFragment.this, (List) obj);
            }
        });
        getProductContentViewModel().playBatteryBelow5PercentIfNeeded();
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m1868onCreateView$lambda1(ProductListMainContentFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProductRowListAdapter productRowListAdapter = this$0.outerProductListAdapter;
        if (productRowListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outerProductListAdapter");
            productRowListAdapter = null;
        }
        productRowListAdapter.submitList(list);
        this$0.hideProgressBar();
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.ProductContentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        hideHeaderCloseButton();
        getProductContentViewModel().clearProductList();
        getProductContentViewModel().getDeviceName().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.main.maincontent.ProductListMainContentFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ProductListMainContentFragment.m1870onViewCreated$lambda2(ProductListMainContentFragment.this, (String) obj);
            }
        });
        getProductContentViewModel().getFailure().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.main.maincontent.ProductListMainContentFragment$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ProductListMainContentFragment.m1871onViewCreated$lambda3(ProductListMainContentFragment.this, (Failure) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m1870onViewCreated$lambda2(ProductListMainContentFragment this$0, String name) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(name, "name");
        this$0.changeHeaderTitle(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m1871onViewCreated$lambda3(ProductListMainContentFragment this$0, Failure failure) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(failure, "failure");
        this$0.handleFailure(failure);
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.ProductContentFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getContent();
        requireActivity().getSupportFragmentManager().setFragmentResultListener(InfoDialogFragment.REQUEST_KEY, this, new FragmentResultListener() { // from class: media.tiger.tigerbox.ui.main.maincontent.ProductListMainContentFragment$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                ProductListMainContentFragment.m1869onResume$lambda4(ProductListMainContentFragment.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResume$lambda-4  reason: not valid java name */
    public static final void m1869onResume$lambda4(ProductListMainContentFragment this$0, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.containsKey("RESULT_KEY")) {
            String string = bundle.getString("RESULT_KEY");
            if (string == null) {
                string = "";
            }
            if (Intrinsics.areEqual(string, InfoDialogTypeResult.PRODUCT_LIST_ERROR.getText())) {
                this$0.getContent();
            } else if (Intrinsics.areEqual(string, InfoDialogTypeResult.NO_INTERNET_ERROR.getText())) {
                this$0.getProductContentViewModel().confirmOfflineMode();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        requireActivity().getSupportFragmentManager().clearFragmentResultListener(InfoDialogFragment.REQUEST_KEY);
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.ProductContentFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getBinding().mainContentOuterRecyclerView.setAdapter(null);
        this._binding = null;
    }

    private final void getContent() {
        List<ProductRowDomain> value = getProductContentViewModel().getMainContent().getValue();
        if (value == null || value.isEmpty()) {
            showProgressBar();
        }
        getProductContentViewModel().m1863getMainContent();
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.OnItemClickListener
    public void onProductItemClick(ProductDomain product, int i) {
        Intrinsics.checkNotNullParameter(product, "product");
        getProductContentViewModel().playProduct(product, i);
    }

    public void onClick(int i) {
        navigateToSeeMoreProducts(i, -1);
    }

    @Override // media.tiger.tigerbox.ui.main.maincontent.OnItemClickListener
    public void onBannerItemClick(int i, int i2) {
        navigateToSeeMoreProducts(i, i2);
    }

    private final void navigateToSeeMoreProducts(int i, int i2) {
        OnboardingActivityKt.navigateActionSafe(FragmentKt.findNavController(this), ProductListMainContentFragmentDirections.Companion.actionProductListMainContentToSeeMoreProducts(i, i2));
    }
}
