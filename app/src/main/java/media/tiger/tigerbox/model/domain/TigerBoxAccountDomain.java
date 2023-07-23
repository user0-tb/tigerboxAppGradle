package media.tiger.tigerbox.model.domain;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerBoxUserDomain.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/TigerBoxAccountDomain;", "", "()V", "user", "Lmedia/tiger/tigerbox/model/domain/TigerBoxUserDomain;", "profiles", "", "Lmedia/tiger/tigerbox/model/domain/TigerBoxProfileDomain;", "(Lmedia/tiger/tigerbox/model/domain/TigerBoxUserDomain;Ljava/util/List;)V", "getProfiles", "()Ljava/util/List;", "getUser", "()Lmedia/tiger/tigerbox/model/domain/TigerBoxUserDomain;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerBoxAccountDomain {
    private final List<TigerBoxProfileDomain> profiles;
    private final TigerBoxUserDomain user;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TigerBoxAccountDomain copy$default(TigerBoxAccountDomain tigerBoxAccountDomain, TigerBoxUserDomain tigerBoxUserDomain, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            tigerBoxUserDomain = tigerBoxAccountDomain.user;
        }
        if ((i & 2) != 0) {
            list = tigerBoxAccountDomain.profiles;
        }
        return tigerBoxAccountDomain.copy(tigerBoxUserDomain, list);
    }

    public final TigerBoxUserDomain component1() {
        return this.user;
    }

    public final List<TigerBoxProfileDomain> component2() {
        return this.profiles;
    }

    public final TigerBoxAccountDomain copy(TigerBoxUserDomain user, List<TigerBoxProfileDomain> profiles) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        return new TigerBoxAccountDomain(user, profiles);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerBoxAccountDomain) {
            TigerBoxAccountDomain tigerBoxAccountDomain = (TigerBoxAccountDomain) obj;
            return Intrinsics.areEqual(this.user, tigerBoxAccountDomain.user) && Intrinsics.areEqual(this.profiles, tigerBoxAccountDomain.profiles);
        }
        return false;
    }

    public int hashCode() {
        return (this.user.hashCode() * 31) + this.profiles.hashCode();
    }

    public String toString() {
        return "TigerBoxAccountDomain(user=" + this.user + ", profiles=" + this.profiles + ')';
    }

    public TigerBoxAccountDomain(TigerBoxUserDomain user, List<TigerBoxProfileDomain> profiles) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        this.user = user;
        this.profiles = profiles;
    }

    public final TigerBoxUserDomain getUser() {
        return this.user;
    }

    public final List<TigerBoxProfileDomain> getProfiles() {
        return this.profiles;
    }

    public TigerBoxAccountDomain() {
        this(new TigerBoxUserDomain(), CollectionsKt.emptyList());
    }
}
