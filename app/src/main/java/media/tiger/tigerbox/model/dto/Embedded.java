package media.tiger.tigerbox.model.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerBoxUser.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/Embedded;", "", "users", "", "Lmedia/tiger/tigerbox/model/dto/User;", "profiles", "Lmedia/tiger/tigerbox/model/dto/Profile;", "(Ljava/util/List;Ljava/util/List;)V", "getProfiles", "()Ljava/util/List;", "getUsers", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Embedded {
    private final List<Profile> profiles;
    private final List<User> users;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Embedded copy$default(Embedded embedded, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = embedded.users;
        }
        if ((i & 2) != 0) {
            list2 = embedded.profiles;
        }
        return embedded.copy(list, list2);
    }

    public final List<User> component1() {
        return this.users;
    }

    public final List<Profile> component2() {
        return this.profiles;
    }

    public final Embedded copy(List<User> list, List<Profile> list2) {
        return new Embedded(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Embedded) {
            Embedded embedded = (Embedded) obj;
            return Intrinsics.areEqual(this.users, embedded.users) && Intrinsics.areEqual(this.profiles, embedded.profiles);
        }
        return false;
    }

    public int hashCode() {
        List<User> list = this.users;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Profile> list2 = this.profiles;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "Embedded(users=" + this.users + ", profiles=" + this.profiles + ')';
    }

    public Embedded(List<User> list, List<Profile> list2) {
        this.users = list;
        this.profiles = list2;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public final List<Profile> getProfiles() {
        return this.profiles;
    }
}
