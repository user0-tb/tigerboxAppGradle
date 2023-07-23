package media.tiger.tigerbox.usecase;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.data.repository.TigerBoxAccountRepository;
import media.tiger.tigerbox.infrastructure.interactor.UseCase;
import media.tiger.tigerbox.model.domain.ProductRowDomain;

/* compiled from: GetMainContentUseCase.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/usecase/GetMainContentUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "", "", "Lmedia/tiger/tigerbox/model/domain/ProductRowDomain;", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "repository", "Lmedia/tiger/tigerbox/data/repository/TigerBoxAccountRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lmedia/tiger/tigerbox/data/repository/TigerBoxAccountRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetMainContentUseCase extends UseCase<Object, List<? extends ProductRowDomain>> {
    private final TigerBoxAccountRepository repository;
    private final TigerBoxWebService tigerBoxWebService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetMainContentUseCase(TigerBoxWebService tigerBoxWebService, TigerBoxAccountRepository repository, CoroutineDispatcher dispatcher) {
        super(dispatcher);
        Intrinsics.checkNotNullParameter(tigerBoxWebService, "tigerBoxWebService");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.tigerBoxWebService = tigerBoxWebService;
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object run(java.lang.Object r10, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, ? extends java.util.List<? extends media.tiger.tigerbox.model.domain.ProductRowDomain>>> r11) {
        /*
            r9 = this;
            boolean r10 = r11 instanceof media.tiger.tigerbox.usecase.GetMainContentUseCase$run$1
            if (r10 == 0) goto L14
            r10 = r11
            media.tiger.tigerbox.usecase.GetMainContentUseCase$run$1 r10 = (media.tiger.tigerbox.usecase.GetMainContentUseCase$run$1) r10
            int r0 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L14
            int r11 = r10.label
            int r11 = r11 - r1
            r10.label = r11
            goto L19
        L14:
            media.tiger.tigerbox.usecase.GetMainContentUseCase$run$1 r10 = new media.tiger.tigerbox.usecase.GetMainContentUseCase$run$1
            r10.<init>(r9, r11)
        L19:
            java.lang.Object r11 = r10.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r10 = r10.L$0
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r10 = (media.tiger.tigerbox.infrastructure.functional.RequestUtils) r10
            kotlin.ResultKt.throwOnFailure(r11)
            r1 = r10
            goto L59
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.ResultKt.throwOnFailure(r11)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r11 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r1 = r9.tigerBoxWebService
            media.tiger.tigerbox.data.repository.TigerBoxAccountRepository r3 = r9.repository
            media.tiger.tigerbox.model.domain.TigerBoxProfileDomain r3 = r3.getActiveProfile()
            int r3 = r3.getId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r10.L$0 = r11
            r10.label = r2
            java.lang.Object r10 = r1.getMainContent(r3, r10)
            if (r10 != r0) goto L57
            return r0
        L57:
            r1 = r11
            r11 = r10
        L59:
            r2 = r11
            media.tiger.tigerbox.data.network.ApiResponse r2 = (media.tiger.tigerbox.data.network.ApiResponse) r2
            media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2 r10 = new kotlin.jvm.functions.Function1<java.util.List<? extends media.tiger.tigerbox.model.dto.MainContentItem>, java.util.List<? extends media.tiger.tigerbox.model.domain.ProductRowDomain>>() { // from class: media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2

                /* compiled from: GetMainContentUseCase.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                /* loaded from: classes4.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        /*
                            media.tiger.tigerbox.model.domain.ProductRowType[] r0 = media.tiger.tigerbox.model.domain.ProductRowType.values()
                            int r0 = r0.length
                            int[] r0 = new int[r0]
                            media.tiger.tigerbox.model.domain.ProductRowType r1 = media.tiger.tigerbox.model.domain.ProductRowType.BANNER
                            int r1 = r1.ordinal()
                            r2 = 1
                            r0[r1] = r2
                            media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2.WhenMappings.$EnumSwitchMapping$0 = r0
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2.WhenMappings.<clinit>():void");
                    }
                }

                static {
                    /*
                        media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2 r0 = new media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2) media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2.INSTANCE media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.util.List<? extends media.tiger.tigerbox.model.domain.ProductRowDomain> invoke(java.util.List<? extends media.tiger.tigerbox.model.dto.MainContentItem> r1) {
                    /*
                        r0 = this;
                        java.util.List r1 = (java.util.List) r1
                        java.util.List r1 = r0.invoke2(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2.invoke(java.lang.Object):java.lang.Object");
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final java.util.List<media.tiger.tigerbox.model.domain.ProductRowDomain> invoke2(java.util.List<media.tiger.tigerbox.model.dto.MainContentItem> r18) {
                    /*
                        r17 = this;
                        java.lang.String r0 = "mainContentItemList"
                        r1 = r18
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                        java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r18)
                        media.tiger.tigerbox.model.dto.MainContentItem r0 = (media.tiger.tigerbox.model.dto.MainContentItem) r0
                        java.util.List r0 = r0.getLayoutItems()
                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                        media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2$invoke$$inlined$sortedBy$1 r1 = new media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2$invoke$$inlined$sortedBy$1
                        r1.<init>()
                        java.util.Comparator r1 = (java.util.Comparator) r1
                        java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r0, r1)
                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r2 = 10
                        int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
                        r1.<init>(r3)
                        java.util.Collection r1 = (java.util.Collection) r1
                        java.util.Iterator r0 = r0.iterator()
                    L31:
                        boolean r3 = r0.hasNext()
                        if (r3 == 0) goto Le3
                        java.lang.Object r3 = r0.next()
                        media.tiger.tigerbox.model.dto.MainContentItem$LayoutItem r3 = (media.tiger.tigerbox.model.dto.MainContentItem.LayoutItem) r3
                        java.lang.String r4 = r3.getLayoutItemType()
                        java.lang.String r5 = ""
                        if (r4 != 0) goto L46
                        r4 = r5
                    L46:
                        media.tiger.tigerbox.model.domain.ProductRowType r9 = media.tiger.tigerbox.usecase.GetMainContentUseCaseKt.access$mapLayoutType(r4)
                        int[] r4 = media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2.WhenMappings.$EnumSwitchMapping$0
                        int r6 = r9.ordinal()
                        r4 = r4[r6]
                        r6 = 1
                        if (r4 != r6) goto Lbd
                        int r7 = r3.getOrdinal()
                        java.lang.String r8 = r3.getTitle()
                        java.lang.String r4 = r3.getProductSourceType()
                        if (r4 != 0) goto L65
                        r10 = r5
                        goto L66
                    L65:
                        r10 = r4
                    L66:
                        media.tiger.tigerbox.model.dto.MainContentItem$LayoutItem$Banner r3 = r3.getBanner()
                        if (r3 == 0) goto Lb1
                        java.util.List r3 = r3.getImages()
                        if (r3 == 0) goto Lb1
                        java.lang.Iterable r3 = (java.lang.Iterable) r3
                        java.util.ArrayList r4 = new java.util.ArrayList
                        int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r2)
                        r4.<init>(r5)
                        java.util.Collection r4 = (java.util.Collection) r4
                        java.util.Iterator r3 = r3.iterator()
                    L83:
                        boolean r5 = r3.hasNext()
                        if (r5 == 0) goto Lad
                        java.lang.Object r5 = r3.next()
                        media.tiger.tigerbox.model.dto.MainContentItem$LayoutItem$Banner$Image r5 = (media.tiger.tigerbox.model.dto.MainContentItem.LayoutItem.Banner.Image) r5
                        media.tiger.tigerbox.model.domain.BannerProductDomain r6 = new media.tiger.tigerbox.model.domain.BannerProductDomain
                        int r12 = r5.getOrdinal()
                        java.lang.String r13 = r5.getTitle()
                        java.lang.String r14 = r5.getHdImage()
                        java.lang.String r15 = r5.getSdImage()
                        java.lang.String r16 = r5.getUrl()
                        r11 = r6
                        r11.<init>(r12, r13, r14, r15, r16)
                        r4.add(r6)
                        goto L83
                    Lad:
                        java.util.List r4 = (java.util.List) r4
                        r11 = r4
                        goto Lb6
                    Lb1:
                        java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
                        r11 = r3
                    Lb6:
                        media.tiger.tigerbox.model.domain.ProductRowDomain r3 = new media.tiger.tigerbox.model.domain.ProductRowDomain
                        r6 = r3
                        r6.<init>(r7, r8, r9, r10, r11)
                        goto Lde
                    Lbd:
                        media.tiger.tigerbox.model.domain.ProductRowDomain r4 = new media.tiger.tigerbox.model.domain.ProductRowDomain
                        int r7 = r3.getOrdinal()
                        java.lang.String r8 = r3.getTitle()
                        java.lang.String r6 = r3.getProductSourceType()
                        if (r6 != 0) goto Lcf
                        r10 = r5
                        goto Ld0
                    Lcf:
                        r10 = r6
                    Ld0:
                        java.lang.String r3 = r3.getUrl()
                        if (r3 != 0) goto Ld8
                        r11 = r5
                        goto Ld9
                    Ld8:
                        r11 = r3
                    Ld9:
                        r6 = r4
                        r6.<init>(r7, r8, r9, r10, r11)
                        r3 = r4
                    Lde:
                        r1.add(r3)
                        goto L31
                    Le3:
                        java.util.List r1 = (java.util.List) r1
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetMainContentUseCase$run$2.invoke2(java.util.List):java.util.List");
                }
            }
            r3 = r10
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            media.tiger.tigerbox.infrastructure.exception.ShopLayoutFailure$ShopLayoutNotSuccessful r10 = media.tiger.tigerbox.infrastructure.exception.ShopLayoutFailure.ShopLayoutNotSuccessful.INSTANCE
            r5 = r10
            media.tiger.tigerbox.infrastructure.exception.Failure r5 = (media.tiger.tigerbox.infrastructure.exception.Failure) r5
            r6 = 0
            r7 = 16
            r8 = 0
            media.tiger.tigerbox.infrastructure.functional.Either r10 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.requestMapper$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetMainContentUseCase.run(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
