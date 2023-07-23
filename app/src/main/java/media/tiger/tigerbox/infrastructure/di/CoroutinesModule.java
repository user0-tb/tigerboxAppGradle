package media.tiger.tigerbox.infrastructure.di;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: CoroutinesModule.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/di/CoroutinesModule;", "", "()V", "providesApplicationScope", "Lkotlinx/coroutines/CoroutineScope;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesDefaultDispatcher", "providesIoDispatcher", "providesMainDispatcher", "providesMainImmediateDispatcher", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Module
/* loaded from: classes3.dex */
public final class CoroutinesModule {
    public static final CoroutinesModule INSTANCE = new CoroutinesModule();

    private CoroutinesModule() {
    }

    @Provides
    public final CoroutineDispatcher providesDefaultDispatcher() {
        return Dispatchers.getDefault();
    }

    @Provides
    public final CoroutineDispatcher providesIoDispatcher() {
        return Dispatchers.getIO();
    }

    @Provides
    public final CoroutineDispatcher providesMainDispatcher() {
        return Dispatchers.getMain();
    }

    @Provides
    public final CoroutineDispatcher providesMainImmediateDispatcher() {
        return Dispatchers.getMain().getImmediate();
    }

    @Provides
    @Singleton
    public final CoroutineScope providesApplicationScope(CoroutineDispatcher defaultDispatcher) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(defaultDispatcher));
    }
}
